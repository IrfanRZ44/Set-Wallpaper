package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

final class bet
  implements zzn
{
  bet(zzzv paramzzzv) {}
  
  public final void onPause()
  {
    mk.b("AdMobCustomTabsAdapter overlay is paused.");
  }
  
  public final void onResume()
  {
    mk.b("AdMobCustomTabsAdapter overlay is resumed.");
  }
  
  public final void zzcb()
  {
    mk.b("AdMobCustomTabsAdapter overlay is closed.");
    zzzv.a(this.a).onAdClosed(this.a);
  }
  
  public final void zzcc()
  {
    mk.b("Opening AdMobCustomTabsAdapter overlay.");
    zzzv.a(this.a).onAdOpened(this.a);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bet
 * JD-Core Version:    0.7.0.1
 */