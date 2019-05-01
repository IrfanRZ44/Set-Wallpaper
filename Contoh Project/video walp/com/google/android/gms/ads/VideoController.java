package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.internal.ads.aqg;
import com.google.android.gms.internal.ads.arj;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.mk;
import javax.annotation.concurrent.GuardedBy;

@cm
public final class VideoController
{
  public static final int PLAYBACK_STATE_ENDED = 3;
  public static final int PLAYBACK_STATE_PAUSED = 2;
  public static final int PLAYBACK_STATE_PLAYING = 1;
  public static final int PLAYBACK_STATE_READY = 5;
  public static final int PLAYBACK_STATE_UNKNOWN;
  private final Object a = new Object();
  @GuardedBy("mLock")
  private aqg b;
  @GuardedBy("mLock")
  private VideoLifecycleCallbacks c;
  
  public final float getAspectRatio()
  {
    float f;
    synchronized (this.a)
    {
      if (this.b == null) {
        return 0.0F;
      }
    }
    return 0.0F;
  }
  
  public final int getPlaybackState()
  {
    int i;
    synchronized (this.a)
    {
      if (this.b == null) {
        return 0;
      }
    }
    return 0;
  }
  
  public final VideoLifecycleCallbacks getVideoLifecycleCallbacks()
  {
    synchronized (this.a)
    {
      VideoLifecycleCallbacks localVideoLifecycleCallbacks = this.c;
      return localVideoLifecycleCallbacks;
    }
  }
  
  public final boolean hasVideoContent()
  {
    for (;;)
    {
      synchronized (this.a)
      {
        if (this.b != null)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public final boolean isClickToExpandEnabled()
  {
    boolean bool;
    synchronized (this.a)
    {
      if (this.b == null) {
        return false;
      }
    }
    return false;
  }
  
  public final boolean isCustomControlsEnabled()
  {
    boolean bool;
    synchronized (this.a)
    {
      if (this.b == null) {
        return false;
      }
    }
    return false;
  }
  
  public final boolean isMuted()
  {
    boolean bool;
    synchronized (this.a)
    {
      if (this.b == null) {
        return true;
      }
    }
    return true;
  }
  
  public final void mute(boolean paramBoolean)
  {
    synchronized (this.a)
    {
      if (this.b == null) {
        return;
      }
    }
    try
    {
      this.b.a(paramBoolean);
      return;
      localObject2 = finally;
      throw localObject2;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        mk.b("Unable to call mute on video controller.", localRemoteException);
      }
    }
  }
  
  public final void pause()
  {
    synchronized (this.a)
    {
      if (this.b == null) {
        return;
      }
    }
    try
    {
      this.b.b();
      return;
      localObject2 = finally;
      throw localObject2;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        mk.b("Unable to call pause on video controller.", localRemoteException);
      }
    }
  }
  
  public final void play()
  {
    synchronized (this.a)
    {
      if (this.b == null) {
        return;
      }
    }
    try
    {
      this.b.a();
      return;
      localObject2 = finally;
      throw localObject2;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        mk.b("Unable to call play on video controller.", localRemoteException);
      }
    }
  }
  
  public final void setVideoLifecycleCallbacks(VideoLifecycleCallbacks paramVideoLifecycleCallbacks)
  {
    n.a(paramVideoLifecycleCallbacks, "VideoLifecycleCallbacks may not be null.");
    synchronized (this.a)
    {
      this.c = paramVideoLifecycleCallbacks;
      if (this.b == null) {
        return;
      }
    }
    try
    {
      this.b.a(new arj(paramVideoLifecycleCallbacks));
      return;
      localObject2 = finally;
      throw localObject2;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        mk.b("Unable to call setVideoLifecycleCallbacks on video controller.", localRemoteException);
      }
    }
  }
  
  public final void zza(aqg paramaqg)
  {
    synchronized (this.a)
    {
      this.b = paramaqg;
      if (this.c != null) {
        setVideoLifecycleCallbacks(this.c);
      }
      return;
    }
  }
  
  public final aqg zzbc()
  {
    synchronized (this.a)
    {
      aqg localaqg = this.b;
      return localaqg;
    }
  }
  
  public static class VideoLifecycleCallbacks
  {
    public void onVideoEnd() {}
    
    public void onVideoMute(boolean paramBoolean) {}
    
    public void onVideoPause() {}
    
    public void onVideoPlay() {}
    
    public void onVideoStart() {}
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.VideoController
 * JD-Core Version:    0.7.0.1
 */