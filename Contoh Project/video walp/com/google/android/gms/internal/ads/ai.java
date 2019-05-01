package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.zzbv;
import java.util.concurrent.atomic.AtomicBoolean;

@cm
public abstract class ai
  implements kg<Void>, rn
{
  protected final Context a;
  protected final qe b;
  protected zzaej c;
  private final ap d;
  private final ik e;
  private Runnable f;
  private final Object g = new Object();
  private AtomicBoolean h = new AtomicBoolean(true);
  
  protected ai(Context paramContext, ik paramik, qe paramqe, ap paramap)
  {
    this.a = paramContext;
    this.e = paramik;
    this.c = this.e.b;
    this.b = paramqe;
    this.d = paramap;
  }
  
  protected abstract void a();
  
  protected void a(int paramInt)
  {
    if (paramInt != -2) {
      this.c = new zzaej(paramInt, this.c.j);
    }
    this.b.n();
    ap localap = this.d;
    zzaef localzzaef = this.e.a;
    localap.zzb(new ij(localzzaef.c, this.b, this.c.c, paramInt, this.c.e, this.c.i, this.c.k, this.c.j, localzzaef.i, this.c.g, null, null, null, null, null, this.c.h, this.e.d, this.c.f, this.e.f, this.c.m, this.c.n, this.e.h, null, this.c.A, this.c.B, this.c.C, this.c.D, this.c.E, null, this.c.H, this.c.L, this.e.i, this.e.b.O, this.e.j, this.e.b.Q, this.c.R, this.e.b.S, this.e.b.T));
  }
  
  public final void a(boolean paramBoolean)
  {
    je.b("WebView finished loading.");
    if (!this.h.getAndSet(false)) {
      return;
    }
    int i = 0;
    if (paramBoolean) {
      i = -2;
    }
    a(i);
    jn.a.removeCallbacks(this.f);
  }
  
  public void b()
  {
    if (!this.h.getAndSet(false)) {
      return;
    }
    this.b.stopLoading();
    zzbv.zzem();
    jt.a(this.b);
    a(-1);
    jn.a.removeCallbacks(this.f);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ai
 * JD-Core Version:    0.7.0.1
 */