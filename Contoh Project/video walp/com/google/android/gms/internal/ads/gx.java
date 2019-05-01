package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;

@cm
public final class gx
  extends hg
{
  private volatile gv a;
  private volatile gy b;
  private volatile gw c;
  private volatile hd d;
  
  public gx(gw paramgw)
  {
    this.c = paramgw;
  }
  
  public final void a(Bundle paramBundle)
  {
    if (this.d != null) {
      this.d.a(paramBundle);
    }
  }
  
  public final void a(a parama)
  {
    if (this.a != null) {
      this.a.g();
    }
  }
  
  public final void a(a parama, int paramInt)
  {
    if (this.a != null) {
      this.a.a(paramInt);
    }
  }
  
  public final void a(a parama, zzaig paramzzaig)
  {
    if (this.c != null) {
      this.c.a_(paramzzaig);
    }
  }
  
  public final void a(gv paramgv)
  {
    this.a = paramgv;
  }
  
  public final void a(gy paramgy)
  {
    this.b = paramgy;
  }
  
  public final void a(hd paramhd)
  {
    this.d = paramhd;
  }
  
  public final void b(a parama)
  {
    if (this.b != null) {
      this.b.a(b.a(parama).getClass().getName());
    }
  }
  
  public final void b(a parama, int paramInt)
  {
    if (this.b != null) {
      this.b.a(b.a(parama).getClass().getName(), paramInt);
    }
  }
  
  public final void c(a parama)
  {
    if (this.c != null) {
      this.c.a();
    }
  }
  
  public final void d(a parama)
  {
    if (this.c != null) {
      this.c.b();
    }
  }
  
  public final void e(a parama)
  {
    if (this.c != null) {
      this.c.c();
    }
  }
  
  public final void f(a parama)
  {
    if (this.c != null) {
      this.c.d_();
    }
  }
  
  public final void g(a parama)
  {
    if (this.c != null) {
      this.c.e();
    }
  }
  
  public final void h(a parama)
  {
    if (this.c != null) {
      this.c.f();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.gx
 * JD-Core Version:    0.7.0.1
 */