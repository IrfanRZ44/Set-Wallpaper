package com.google.android.gms.ads.mediation;

import android.os.Bundle;

public abstract interface MediationAdapter
{
  public abstract void onDestroy();
  
  public abstract void onPause();
  
  public abstract void onResume();
  
  public static final class zza
  {
    private int zzdfl;
    
    public final zza zzaj(int paramInt)
    {
      this.zzdfl = 1;
      return this;
    }
    
    public final Bundle zzvx()
    {
      Bundle localBundle = new Bundle();
      localBundle.putInt("capabilities", this.zzdfl);
      return localBundle;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.mediation.MediationAdapter
 * JD-Core Version:    0.7.0.1
 */