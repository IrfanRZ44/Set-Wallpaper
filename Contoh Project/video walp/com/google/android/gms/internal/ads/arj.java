package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks;

public final class arj
  extends aqk
{
  private final VideoController.VideoLifecycleCallbacks a;
  
  public arj(VideoController.VideoLifecycleCallbacks paramVideoLifecycleCallbacks)
  {
    this.a = paramVideoLifecycleCallbacks;
  }
  
  public final void a()
  {
    this.a.onVideoStart();
  }
  
  public final void a(boolean paramBoolean)
  {
    this.a.onVideoMute(paramBoolean);
  }
  
  public final void b()
  {
    this.a.onVideoPlay();
  }
  
  public final void c()
  {
    this.a.onVideoPause();
  }
  
  public final void d()
  {
    this.a.onVideoEnd();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.arj
 * JD-Core Version:    0.7.0.1
 */