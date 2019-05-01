package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;

@cm
public final class asx
  extends asv
{
  private final OnCustomRenderedAdLoadedListener a;
  
  public asx(OnCustomRenderedAdLoadedListener paramOnCustomRenderedAdLoadedListener)
  {
    this.a = paramOnCustomRenderedAdLoadedListener;
  }
  
  public final void a(asr paramasr)
  {
    this.a.onCustomRenderedAdLoaded(new asp(paramasr));
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.asx
 * JD-Core Version:    0.7.0.1
 */