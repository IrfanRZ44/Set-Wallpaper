package com.naing.vwallpaper;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.os.Environment;
import android.os.Handler;
import android.service.wallpaper.WallpaperService;
import android.service.wallpaper.WallpaperService.Engine;
import android.view.SurfaceHolder;
import com.naing.a.a;
import java.io.IOException;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.m;

public class VideoWallPaperService
  extends WallpaperService
{
  public WallpaperService.Engine onCreateEngine()
  {
    return new a();
  }
  
  private class a
    extends WallpaperService.Engine
    implements SharedPreferences.OnSharedPreferenceChangeListener
  {
    private BroadcastReceiver b = new BroadcastReceiver()
    {
      public void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        VideoWallPaperService.a.this.a();
      }
    };
    private MediaPlayer c = null;
    private SharedPreferences d = com.naing.c.b.a(this.k);
    private String e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private boolean j;
    private VideoWallPaperService k = VideoWallPaperService.this;
    private Handler l = new Handler();
    private Runnable m = new Runnable()
    {
      public void run()
      {
        VideoWallPaperService.a.a(VideoWallPaperService.a.this);
      }
    };
    
    public a()
    {
      super();
      this.d.registerOnSharedPreferenceChangeListener(this);
      b();
    }
    
    private void b()
    {
      this.e = this.d.getString("location", com.naing.c.b.c(this.k));
      this.i = this.d.getBoolean("sound", false);
      this.j = this.d.getBoolean("scale", false);
      this.f = this.d.getInt("start", 0);
      this.g = this.d.getInt("end", 2147483647);
      this.h = 0;
      if (this.e.equals("")) {
        com.naing.c.b.a(this.k, VideoWallPaperService.this.getResources().getString(2131558446));
      }
    }
    
    private void c()
    {
      if (this.c == null)
      {
        this.c = new MediaPlayer();
        this.c.setSurface(getSurfaceHolder().getSurface());
      }
    }
    
    private boolean d()
    {
      c();
      for (;;)
      {
        try
        {
          this.c.reset();
          this.c.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
          {
            public void onCompletion(MediaPlayer paramAnonymousMediaPlayer)
            {
              VideoWallPaperService.a.c(VideoWallPaperService.a.this).seekTo(VideoWallPaperService.a.b(VideoWallPaperService.a.this));
              VideoWallPaperService.a.c(VideoWallPaperService.a.this).start();
            }
          });
          this.c.setOnErrorListener(new MediaPlayer.OnErrorListener()
          {
            public boolean onError(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
            {
              VideoWallPaperService.a.d(VideoWallPaperService.a.this);
              return true;
            }
          });
          this.c.setDataSource(this.e);
          this.c.prepare();
          if (!this.j) {
            continue;
          }
          this.c.setVideoScalingMode(1);
          if (this.i) {
            continue;
          }
          this.c.setVolume(0.0F, 0.0F);
        }
        catch (IOException localIOException)
        {
          g();
          return false;
          this.c.setVolume(1.0F, 1.0F);
          continue;
        }
        catch (Exception localException)
        {
          g();
        }
        this.c.seekTo(this.f);
        if ((this.h > this.f) && (this.h < this.g))
        {
          this.c.seekTo(this.h);
          this.h = 0;
        }
        this.c.start();
        f();
        return true;
        this.c.setVideoScalingMode(2);
      }
      return false;
    }
    
    private void e()
    {
      if (!d())
      {
        this.f = 0;
        this.g = 2147483647;
        this.e = com.naing.c.b.c(this.k);
        SharedPreferences.Editor localEditor = this.d.edit();
        localEditor.remove("location");
        localEditor.remove("start");
        localEditor.remove("end");
        localEditor.commit();
        d();
      }
    }
    
    private void f()
    {
      int n = this.g - this.c.getCurrentPosition();
      if (n <= 0) {
        this.c.seekTo(this.f);
      }
      this.l.removeCallbacks(this.m);
      Handler localHandler;
      Runnable localRunnable;
      if (isVisible())
      {
        localHandler = this.l;
        localRunnable = this.m;
        if (n > 100) {
          break label75;
        }
      }
      label75:
      for (long l1 = n;; l1 = n / 2)
      {
        localHandler.postDelayed(localRunnable, l1);
        return;
      }
    }
    
    private void g()
    {
      this.l.removeCallbacks(this.m);
      if (this.c != null)
      {
        this.h = this.c.getCurrentPosition();
        this.c.release();
        this.c = null;
      }
    }
    
    protected void a()
    {
      if ((Environment.getExternalStorageState().equals("mounted")) && ((this.c == null) || (!this.c.isPlaying())) && (isVisible())) {
        e();
      }
    }
    
    public void onCreate(SurfaceHolder paramSurfaceHolder)
    {
      super.onCreate(paramSurfaceHolder);
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
      this.k.registerReceiver(this.b, localIntentFilter);
      org.greenrobot.eventbus.c.a().a(this);
    }
    
    public void onDestroy()
    {
      super.onDestroy();
      this.k.unregisterReceiver(this.b);
      org.greenrobot.eventbus.c.a().b(this);
      this.d.unregisterOnSharedPreferenceChangeListener(this);
      g();
    }
    
    @m(a=ThreadMode.MAIN)
    public void onEventMainThread(a parama)
    {
      g();
    }
    
    @m(a=ThreadMode.MAIN)
    public void onEventMainThread(com.naing.a.b paramb)
    {
      if (!isPreview()) {
        g();
      }
    }
    
    @m(a=ThreadMode.MAIN)
    public void onEventMainThread(com.naing.a.c paramc)
    {
      if (isPreview()) {
        g();
      }
    }
    
    public void onSharedPreferenceChanged(SharedPreferences paramSharedPreferences, String paramString)
    {
      g();
      b();
      if (isVisible()) {
        e();
      }
    }
    
    public void onSurfaceCreated(SurfaceHolder paramSurfaceHolder)
    {
      super.onSurfaceCreated(paramSurfaceHolder);
      if (isPreview())
      {
        org.greenrobot.eventbus.c.a().c(new com.naing.a.b());
        if (this.e.startsWith(com.naing.c.b.a)) {
          break label59;
        }
        e();
      }
      label59:
      while (!Environment.getExternalStorageState().equals("mounted"))
      {
        return;
        org.greenrobot.eventbus.c.a().c(new com.naing.a.c());
        break;
      }
      e();
    }
    
    public void onSurfaceDestroyed(SurfaceHolder paramSurfaceHolder)
    {
      super.onSurfaceDestroyed(paramSurfaceHolder);
      g();
    }
    
    public void onVisibilityChanged(boolean paramBoolean)
    {
      super.onVisibilityChanged(paramBoolean);
      if (paramBoolean) {
        if (isPreview())
        {
          org.greenrobot.eventbus.c.a().c(new com.naing.a.b());
          if (this.c != null) {
            break label58;
          }
          d();
        }
      }
      label58:
      do
      {
        return;
        org.greenrobot.eventbus.c.a().c(new com.naing.a.c());
        break;
        this.c.start();
        f();
        return;
        if (isPreview())
        {
          g();
          return;
        }
      } while ((this.c == null) || (!this.c.isPlaying()));
      this.c.pause();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.naing.vwallpaper.VideoWallPaperService
 * JD-Core Version:    0.7.0.1
 */