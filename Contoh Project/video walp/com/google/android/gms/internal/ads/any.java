package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;

@cm
public final class any
  extends aoz
{
  private final AdListener a;
  
  public any(AdListener paramAdListener)
  {
    this.a = paramAdListener;
  }
  
  public final void a()
  {
    this.a.onAdClosed();
  }
  
  public final void a(int paramInt)
  {
    this.a.onAdFailedToLoad(paramInt);
  }
  
  public final void b()
  {
    this.a.onAdLeftApplication();
  }
  
  public final void c()
  {
    this.a.onAdLoaded();
  }
  
  public final void d()
  {
    this.a.onAdOpened();
  }
  
  public final void e()
  {
    this.a.onAdClicked();
  }
  
  public final void f()
  {
    this.a.onAdImpression();
  }
  
  public final AdListener g()
  {
    return this.a;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.any
 * JD-Core Version:    0.7.0.1
 */