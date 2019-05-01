package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

@cm
public final class dn
  extends du
{
  private final WeakReference<dc> a;
  
  public dn(dc paramdc)
  {
    this.a = new WeakReference(paramdc);
  }
  
  public final void a(zzaej paramzzaej)
  {
    dc localdc = (dc)this.a.get();
    if (localdc != null) {
      localdc.a(paramzzaej);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.dn
 * JD-Core Version:    0.7.0.1
 */