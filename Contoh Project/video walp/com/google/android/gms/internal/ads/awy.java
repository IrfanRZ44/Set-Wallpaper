package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd.UnconfirmedClickListener;

public final class awy
  extends awi
{
  private final UnifiedNativeAd.UnconfirmedClickListener a;
  
  public awy(UnifiedNativeAd.UnconfirmedClickListener paramUnconfirmedClickListener)
  {
    this.a = paramUnconfirmedClickListener;
  }
  
  public final void a()
  {
    this.a.onUnconfirmedClickCancelled();
  }
  
  public final void a(String paramString)
  {
    this.a.onUnconfirmedClickReceived(paramString);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.awy
 * JD-Core Version:    0.7.0.1
 */