package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener;

@cm
public final class awr
  extends avt
{
  private final NativeContentAd.OnContentAdLoadedListener a;
  
  public awr(NativeContentAd.OnContentAdLoadedListener paramOnContentAdLoadedListener)
  {
    this.a = paramOnContentAdLoadedListener;
  }
  
  public final void a(avg paramavg)
  {
    this.a.onContentAdLoaded(new avj(paramavg));
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.awr
 * JD-Core Version:    0.7.0.1
 */