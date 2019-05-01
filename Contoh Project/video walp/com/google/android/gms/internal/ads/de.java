package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;

@cm
public abstract class de
  implements dc, kg<Void>
{
  private final nr<zzaef> a;
  private final dc b;
  private final Object c = new Object();
  
  public de(nr<zzaef> paramnr, dc paramdc)
  {
    this.a = paramnr;
    this.b = paramdc;
  }
  
  public abstract void a();
  
  public final void a(zzaej paramzzaej)
  {
    synchronized (this.c)
    {
      this.b.a(paramzzaej);
      a();
      return;
    }
  }
  
  final boolean a(dq paramdq, zzaef paramzzaef)
  {
    try
    {
      paramdq.a(paramzzaef, new dn(this));
      return true;
    }
    catch (Throwable localThrowable)
    {
      je.c("Could not fetch ad response from ad request service due to an Exception.", localThrowable);
      zzbv.zzeo().a(localThrowable, "AdRequestClientTask.getAdResponseFromService");
      this.b.a(new zzaej(0));
    }
    return false;
  }
  
  public final void b()
  {
    a();
  }
  
  public abstract dq d();
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.de
 * JD-Core Version:    0.7.0.1
 */