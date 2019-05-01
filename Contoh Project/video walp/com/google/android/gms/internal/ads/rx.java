package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzn;

final class rx
  implements zzn
{
  private qe a;
  private zzn b;
  
  public rx(qe paramqe, zzn paramzzn)
  {
    this.a = paramqe;
    this.b = paramzzn;
  }
  
  public final void onPause() {}
  
  public final void onResume() {}
  
  public final void zzcb()
  {
    this.b.zzcb();
    this.a.l();
  }
  
  public final void zzcc()
  {
    this.b.zzcc();
    this.a.m();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.rx
 * JD-Core Version:    0.7.0.1
 */