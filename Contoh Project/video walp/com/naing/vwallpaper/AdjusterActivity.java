package com.naing.vwallpaper;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.naing.a.a;
import com.naing.view.RangeBar;
import com.naing.view.RangeBar.a;
import com.naing.view.WallpaperVideoView;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.m;

public class AdjusterActivity
  extends BaseActivity
  implements MediaPlayer.OnPreparedListener, View.OnClickListener, RangeBar.a
{
  private ImageView a;
  private ImageView b;
  private WallpaperVideoView c;
  private RangeBar d;
  private Handler e;
  private Runnable f;
  private long g = 0L;
  private long h = 2147483647L;
  private String i;
  private SharedPreferences j;
  
  private void a(int paramInt)
  {
    this.c.seekTo(paramInt);
  }
  
  private void g()
  {
    this.j.edit().putString("location", this.i).putInt("start", (int)this.g).putInt("end", (int)this.h).apply();
    i();
    com.naing.c.b.d(this);
    setResult(-1);
    finish();
  }
  
  private void h()
  {
    long l = this.h - j();
    this.d.setCurrentPosition(j());
    if (l <= 0L) {
      this.c.pause();
    }
    this.e.removeCallbacks(this.f);
    this.e.postDelayed(this.f, 50L);
  }
  
  private void i()
  {
    this.e.removeCallbacks(this.f);
  }
  
  private int j()
  {
    return this.c.getCurrentPosition();
  }
  
  private int k()
  {
    if (this.c == null) {
      return 0;
    }
    return this.c.getDuration();
  }
  
  public void a(long paramLong, boolean paramBoolean)
  {
    this.h = ((int)paramLong);
    a((int)this.h);
  }
  
  public void b(long paramLong, boolean paramBoolean)
  {
    this.g = ((int)paramLong);
    a((int)this.g);
  }
  
  public void c(long paramLong, boolean paramBoolean)
  {
    a((int)paramLong);
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    }
    do
    {
      do
      {
        return;
      } while (!this.c.isPlaying());
      this.c.pause();
      return;
    } while (this.c.isPlaying());
    if (this.h - j() <= 0L) {
      a((int)this.g);
    }
    this.c.start();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2131361819);
    a(true, null);
    this.a = ((ImageView)findViewById(2131230829));
    this.b = ((ImageView)findViewById(2131230828));
    this.d = ((RangeBar)findViewById(2131230944));
    this.c = ((WallpaperVideoView)findViewById(2131230961));
    this.d.setOnRangeBarListener(this);
    this.a.setOnClickListener(this);
    this.b.setOnClickListener(this);
    this.e = new Handler();
    this.f = new Runnable()
    {
      public void run()
      {
        AdjusterActivity.a(AdjusterActivity.this);
      }
    };
    org.greenrobot.eventbus.c.a().a(this);
    org.greenrobot.eventbus.c.a().c(new a());
    this.j = com.naing.c.b.a(this);
    Intent localIntent = getIntent();
    if ((localIntent != null) && (localIntent.hasExtra("PATH")))
    {
      this.i = localIntent.getStringExtra("PATH");
      this.g = 0L;
      this.h = 2147483647L;
    }
    for (;;)
    {
      this.c.setVisibility(0);
      this.c.setVideoPath(this.i);
      this.c.setMediaController(null);
      this.c.requestFocus();
      this.c.setOnPreparedListener(this);
      return;
      String str = com.naing.c.b.c(this);
      this.i = this.j.getString("location", str);
      if (!this.i.equals(str))
      {
        this.g = this.j.getInt("start", 0);
        this.h = this.j.getInt("end", 2147483647);
      }
      else
      {
        this.g = 0L;
        this.h = 2147483647L;
      }
    }
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131427328, paramMenu);
    return true;
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    org.greenrobot.eventbus.c.a().b(this);
    i();
  }
  
  @m(a=ThreadMode.MAIN)
  public void onEventMainThread(com.naing.a.b paramb)
  {
    i();
  }
  
  @m(a=ThreadMode.MAIN)
  public void onEventMainThread(com.naing.a.c paramc)
  {
    i();
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default: 
      return super.onOptionsItemSelected(paramMenuItem);
    case 16908332: 
      finish();
      return true;
    }
    g();
    return true;
  }
  
  public void onPrepared(MediaPlayer paramMediaPlayer)
  {
    int k = k();
    if (this.h == 2147483647L) {
      this.h = k;
    }
    this.d.a(this.g, this.h, k);
    this.d.setVisibility(0);
    this.c.a(paramMediaPlayer.getVideoWidth(), paramMediaPlayer.getVideoHeight());
    a((int)this.g);
    this.c.start();
    h();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.naing.vwallpaper.AdjusterActivity
 * JD-Core Version:    0.7.0.1
 */