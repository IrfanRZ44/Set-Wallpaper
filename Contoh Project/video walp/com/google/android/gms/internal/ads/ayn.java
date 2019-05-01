package com.google.android.gms.internal.ads;

import android.os.Handler;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Random;

final class ayn
  extends aoz
{
  private final aoy a;
  
  ayn(aoy paramaoy)
  {
    this.a = paramaoy;
  }
  
  public final void a()
  {
    int i;
    int j;
    if (ayx.a())
    {
      arq localarq1 = asa.bb;
      i = ((Integer)aos.f().a(localarq1)).intValue();
      arq localarq2 = asa.bc;
      j = ((Integer)aos.f().a(localarq2)).intValue();
      if ((i > 0) && (j >= 0)) {
        break label68;
      }
      zzbv.zzex().a();
    }
    for (;;)
    {
      this.a.a();
      return;
      label68:
      long l = i + new Random().nextInt(j + 1);
      jn.a.postDelayed(ayo.a, l);
    }
  }
  
  public final void a(int paramInt)
  {
    this.a.a(paramInt);
  }
  
  public final void b()
  {
    this.a.b();
  }
  
  public final void c()
  {
    this.a.c();
  }
  
  public final void d()
  {
    this.a.d();
  }
  
  public final void e()
  {
    this.a.e();
  }
  
  public final void f()
  {
    this.a.f();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ayn
 * JD-Core Version:    0.7.0.1
 */