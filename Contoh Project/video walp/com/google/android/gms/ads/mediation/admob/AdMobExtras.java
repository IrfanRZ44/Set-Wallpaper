package com.google.android.gms.ads.mediation.admob;

import android.os.Bundle;
import com.google.ads.mediation.NetworkExtras;

@Deprecated
public final class AdMobExtras
  implements NetworkExtras
{
  private final Bundle mExtras;
  
  public AdMobExtras(Bundle paramBundle)
  {
    if (paramBundle != null) {}
    for (Bundle localBundle = new Bundle(paramBundle);; localBundle = null)
    {
      this.mExtras = localBundle;
      return;
    }
  }
  
  public final Bundle getExtras()
  {
    return this.mExtras;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.mediation.admob.AdMobExtras
 * JD-Core Version:    0.7.0.1
 */