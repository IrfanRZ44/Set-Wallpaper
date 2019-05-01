package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View.MeasureSpec;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.c;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@cm
@TargetApi(14)
public final class ob
  extends on
  implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener
{
  private static final Map<Integer, String> c = new HashMap();
  private final pe d;
  private final boolean e;
  private int f = 0;
  private int g = 0;
  private MediaPlayer h;
  private Uri i;
  private int j;
  private int k;
  private int l;
  private int m;
  private int n;
  private pb o;
  private boolean p;
  private int q;
  private om r;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 17)
    {
      c.put(Integer.valueOf(-1004), "MEDIA_ERROR_IO");
      c.put(Integer.valueOf(-1007), "MEDIA_ERROR_MALFORMED");
      c.put(Integer.valueOf(-1010), "MEDIA_ERROR_UNSUPPORTED");
      c.put(Integer.valueOf(-110), "MEDIA_ERROR_TIMED_OUT");
      c.put(Integer.valueOf(3), "MEDIA_INFO_VIDEO_RENDERING_START");
    }
    c.put(Integer.valueOf(100), "MEDIA_ERROR_SERVER_DIED");
    c.put(Integer.valueOf(1), "MEDIA_ERROR_UNKNOWN");
    c.put(Integer.valueOf(1), "MEDIA_INFO_UNKNOWN");
    c.put(Integer.valueOf(700), "MEDIA_INFO_VIDEO_TRACK_LAGGING");
    c.put(Integer.valueOf(701), "MEDIA_INFO_BUFFERING_START");
    c.put(Integer.valueOf(702), "MEDIA_INFO_BUFFERING_END");
    c.put(Integer.valueOf(800), "MEDIA_INFO_BAD_INTERLEAVING");
    c.put(Integer.valueOf(801), "MEDIA_INFO_NOT_SEEKABLE");
    c.put(Integer.valueOf(802), "MEDIA_INFO_METADATA_UPDATE");
    if (Build.VERSION.SDK_INT >= 19)
    {
      c.put(Integer.valueOf(901), "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
      c.put(Integer.valueOf(902), "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }
  }
  
  public ob(Context paramContext, boolean paramBoolean1, boolean paramBoolean2, pc parampc, pe parampe)
  {
    super(paramContext);
    setSurfaceTextureListener(this);
    this.d = parampe;
    this.p = paramBoolean1;
    this.e = paramBoolean2;
    this.d.a(this);
  }
  
  private final void a(float paramFloat)
  {
    if (this.h != null) {}
    try
    {
      this.h.setVolume(paramFloat, paramFloat);
      return;
    }
    catch (IllegalStateException localIllegalStateException) {}
    je.e("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
    return;
  }
  
  private final void a(boolean paramBoolean)
  {
    je.a("AdMediaPlayerView release");
    if (this.o != null)
    {
      this.o.b();
      this.o = null;
    }
    if (this.h != null)
    {
      this.h.reset();
      this.h.release();
      this.h = null;
      c(0);
      if (paramBoolean)
      {
        this.g = 0;
        this.g = 0;
      }
    }
  }
  
  private final void c(int paramInt)
  {
    if (paramInt == 3)
    {
      this.d.c();
      this.b.b();
    }
    for (;;)
    {
      this.f = paramInt;
      return;
      if (this.f == 3)
      {
        this.d.d();
        this.b.c();
      }
    }
  }
  
  private final void f()
  {
    je.a("AdMediaPlayerView init MediaPlayer");
    localSurfaceTexture1 = getSurfaceTexture();
    if ((this.i == null) || (localSurfaceTexture1 == null)) {
      return;
    }
    a(false);
    try
    {
      zzbv.zzfb();
      this.h = new MediaPlayer();
      this.h.setOnBufferingUpdateListener(this);
      this.h.setOnCompletionListener(this);
      this.h.setOnErrorListener(this);
      this.h.setOnInfoListener(this);
      this.h.setOnPreparedListener(this);
      this.h.setOnVideoSizeChangedListener(this);
      this.l = 0;
      if (!this.p) {
        break label289;
      }
      this.o = new pb(getContext());
      this.o.a(localSurfaceTexture1, getWidth(), getHeight());
      this.o.start();
      localSurfaceTexture2 = this.o.c();
      if (localSurfaceTexture2 == null) {
        break label277;
      }
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Surface localSurface;
        String str = String.valueOf(this.i);
        je.c(36 + String.valueOf(str).length() + "Failed to initialize MediaPlayer at " + str, localIOException);
        onError(this.h, 1, 0);
        return;
        this.o.b();
        this.o = null;
        SurfaceTexture localSurfaceTexture2 = localSurfaceTexture1;
      }
    }
    catch (IllegalStateException localIllegalStateException)
    {
      break label223;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      break label223;
    }
    this.h.setDataSource(getContext(), this.i);
    zzbv.zzfc();
    localSurface = new Surface(localSurfaceTexture2);
    this.h.setSurface(localSurface);
    this.h.setAudioStreamType(3);
    this.h.setScreenOnWhilePlaying(true);
    this.h.prepareAsync();
    c(1);
  }
  
  private final void g()
  {
    if (!this.e) {}
    while ((!h()) || (this.h.getCurrentPosition() <= 0) || (this.g == 3)) {
      return;
    }
    je.a("AdMediaPlayerView nudging MediaPlayer");
    a(0.0F);
    this.h.start();
    int i1 = this.h.getCurrentPosition();
    long l1 = zzbv.zzer().a();
    while ((h()) && (this.h.getCurrentPosition() == i1) && (zzbv.zzer().a() - l1 <= 250L)) {}
    this.h.pause();
    e();
  }
  
  private final boolean h()
  {
    return (this.h != null) && (this.f != -1) && (this.f != 0) && (this.f != 1);
  }
  
  public final String a()
  {
    if (this.p) {}
    for (String str1 = " spherical";; str1 = "")
    {
      String str2 = String.valueOf(str1);
      if (str2.length() == 0) {
        break;
      }
      return "MediaPlayer".concat(str2);
    }
    return new String("MediaPlayer");
  }
  
  public final void a(float paramFloat1, float paramFloat2)
  {
    if (this.o != null) {
      this.o.a(paramFloat1, paramFloat2);
    }
  }
  
  public final void a(int paramInt)
  {
    je.a(34 + "AdMediaPlayerView seek " + paramInt);
    if (h())
    {
      this.h.seekTo(paramInt);
      this.q = 0;
      return;
    }
    this.q = paramInt;
  }
  
  public final void a(om paramom)
  {
    this.r = paramom;
  }
  
  public final void b()
  {
    je.a("AdMediaPlayerView stop");
    if (this.h != null)
    {
      this.h.stop();
      this.h.release();
      this.h = null;
      c(0);
      this.g = 0;
    }
    this.d.b();
  }
  
  public final void c()
  {
    je.a("AdMediaPlayerView play");
    if (h())
    {
      this.h.start();
      c(3);
      this.a.a();
      jn.a.post(new ok(this));
    }
    this.g = 3;
  }
  
  public final void d()
  {
    je.a("AdMediaPlayerView pause");
    if ((h()) && (this.h.isPlaying()))
    {
      this.h.pause();
      c(4);
      jn.a.post(new ol(this));
    }
    this.g = 4;
  }
  
  public final void e()
  {
    a(this.b.a());
  }
  
  public final int getCurrentPosition()
  {
    if (h()) {
      return this.h.getCurrentPosition();
    }
    return 0;
  }
  
  public final int getDuration()
  {
    if (h()) {
      return this.h.getDuration();
    }
    return -1;
  }
  
  public final int getVideoHeight()
  {
    if (this.h != null) {
      return this.h.getVideoHeight();
    }
    return 0;
  }
  
  public final int getVideoWidth()
  {
    if (this.h != null) {
      return this.h.getVideoWidth();
    }
    return 0;
  }
  
  public final void onBufferingUpdate(MediaPlayer paramMediaPlayer, int paramInt)
  {
    this.l = paramInt;
  }
  
  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    je.a("AdMediaPlayerView completion");
    c(5);
    this.g = 5;
    jn.a.post(new oe(this));
  }
  
  public final boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    String str1 = (String)c.get(Integer.valueOf(paramInt1));
    String str2 = (String)c.get(Integer.valueOf(paramInt2));
    je.e(38 + String.valueOf(str1).length() + String.valueOf(str2).length() + "AdMediaPlayerView MediaPlayer error: " + str1 + ":" + str2);
    c(-1);
    this.g = -1;
    jn.a.post(new of(this, str1, str2));
    return true;
  }
  
  public final boolean onInfo(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    String str1 = (String)c.get(Integer.valueOf(paramInt1));
    String str2 = (String)c.get(Integer.valueOf(paramInt2));
    je.a(37 + String.valueOf(str1).length() + String.valueOf(str2).length() + "AdMediaPlayerView MediaPlayer info: " + str1 + ":" + str2);
    return true;
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = getDefaultSize(this.j, paramInt1);
    int i2 = getDefaultSize(this.k, paramInt2);
    int i3;
    int i4;
    int i5;
    if ((this.j > 0) && (this.k > 0) && (this.o == null))
    {
      i3 = View.MeasureSpec.getMode(paramInt1);
      i4 = View.MeasureSpec.getSize(paramInt1);
      i5 = View.MeasureSpec.getMode(paramInt2);
      i2 = View.MeasureSpec.getSize(paramInt2);
      if ((i3 != 1073741824) || (i5 != 1073741824)) {
        break label226;
      }
      if (i2 * this.j >= i4 * this.k) {
        break label189;
      }
      i1 = i2 * this.j / this.k;
    }
    label392:
    for (;;)
    {
      setMeasuredDimension(i1, i2);
      if (this.o != null) {
        this.o.a(i1, i2);
      }
      if (Build.VERSION.SDK_INT == 16)
      {
        if (((this.m > 0) && (this.m != i1)) || ((this.n > 0) && (this.n != i2))) {
          g();
        }
        this.m = i1;
        this.n = i2;
      }
      return;
      label189:
      if (i2 * this.j > i4 * this.k)
      {
        i2 = i4 * this.k / this.j;
        i1 = i4;
        continue;
        label226:
        int i8;
        if (i3 == 1073741824)
        {
          i8 = i4 * this.k / this.j;
          if ((i5 == -2147483648) && (i8 > i2)) {
            i1 = i4;
          }
        }
        else
        {
          if (i5 == 1073741824)
          {
            i1 = i2 * this.j / this.k;
            if ((i3 != -2147483648) || (i1 <= i4)) {
              continue;
            }
            i1 = i4;
            continue;
          }
          int i6 = this.j;
          int i7 = this.k;
          if ((i5 == -2147483648) && (i7 > i2)) {}
          for (i1 = i2 * this.j / this.k;; i1 = i6)
          {
            if ((i3 != -2147483648) || (i1 <= i4)) {
              break label392;
            }
            i2 = i4 * this.k / this.j;
            i1 = i4;
            break;
            i2 = i7;
          }
          continue;
        }
        i2 = i8;
        i1 = i4;
      }
      else
      {
        i1 = i4;
      }
    }
  }
  
  public final void onPrepared(MediaPlayer paramMediaPlayer)
  {
    je.a("AdMediaPlayerView prepared");
    c(2);
    this.d.a();
    jn.a.post(new od(this));
    this.j = paramMediaPlayer.getVideoWidth();
    this.k = paramMediaPlayer.getVideoHeight();
    if (this.q != 0) {
      a(this.q);
    }
    g();
    int i1 = this.j;
    int i2 = this.k;
    je.d(62 + "AdMediaPlayerView stream dimensions: " + i1 + " x " + i2);
    if (this.g == 3) {
      c();
    }
    e();
  }
  
  public final void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    je.a("AdMediaPlayerView surface created");
    f();
    jn.a.post(new oh(this));
  }
  
  public final boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    je.a("AdMediaPlayerView surface destroyed");
    if ((this.h != null) && (this.q == 0)) {
      this.q = this.h.getCurrentPosition();
    }
    if (this.o != null) {
      this.o.b();
    }
    jn.a.post(new oj(this));
    a(true);
    return true;
  }
  
  public final void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    int i1 = 1;
    je.a("AdMediaPlayerView surface changed");
    int i2;
    if (this.g == 3)
    {
      i2 = i1;
      if ((this.j != paramInt1) || (this.k != paramInt2)) {
        break label113;
      }
    }
    for (;;)
    {
      if ((this.h != null) && (i2 != 0) && (i1 != 0))
      {
        if (this.q != 0) {
          a(this.q);
        }
        c();
      }
      if (this.o != null) {
        this.o.a(paramInt1, paramInt2);
      }
      jn.a.post(new oi(this, paramInt1, paramInt2));
      return;
      i2 = 0;
      break;
      label113:
      i1 = 0;
    }
  }
  
  public final void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
    this.d.b(this);
    this.a.a(paramSurfaceTexture, this.r);
  }
  
  public final void onVideoSizeChanged(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    je.a(57 + "AdMediaPlayerView size changed: " + paramInt1 + " x " + paramInt2);
    this.j = paramMediaPlayer.getVideoWidth();
    this.k = paramMediaPlayer.getVideoHeight();
    if ((this.j != 0) && (this.k != 0)) {
      requestLayout();
    }
  }
  
  protected final void onWindowVisibilityChanged(int paramInt)
  {
    je.a(58 + "AdMediaPlayerView window visibility changed to " + paramInt);
    jn.a.post(new oc(this, paramInt));
    super.onWindowVisibilityChanged(paramInt);
  }
  
  public final void setVideoPath(String paramString)
  {
    Uri localUri = Uri.parse(paramString);
    zzhl localzzhl = zzhl.a(localUri);
    if (localzzhl == null) {}
    for (;;)
    {
      this.i = localUri;
      this.q = 0;
      f();
      requestLayout();
      invalidate();
      return;
      localUri = Uri.parse(localzzhl.a);
    }
  }
  
  public final String toString()
  {
    String str1 = getClass().getName();
    String str2 = Integer.toHexString(hashCode());
    return 1 + String.valueOf(str1).length() + String.valueOf(str2).length() + str1 + "@" + str2;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ob
 * JD-Core Version:    0.7.0.1
 */