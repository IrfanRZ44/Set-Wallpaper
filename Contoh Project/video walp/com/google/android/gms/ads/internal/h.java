package com.google.android.gms.ads.internal;

import android.os.Handler;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.ij;
import com.google.android.gms.internal.ads.iz;
import com.google.android.gms.internal.ads.jn;
import com.google.android.gms.internal.ads.qe;

@cm
final class h
  extends iz
{
  private final int b;
  
  public h(zzal paramzzal, int paramInt)
  {
    this.b = paramInt;
  }
  
  public final void a()
  {
    boolean bool1 = this.a.e.x;
    boolean bool2 = this.a.i();
    boolean bool3 = zzal.a(this.a);
    float f = zzal.b(this.a);
    if (this.a.e.x) {}
    for (int i = this.b;; i = -1)
    {
      zzaq localzzaq = new zzaq(bool1, bool2, bool3, f, i, zzal.c(this.a), this.a.e.zzacw.L, this.a.e.zzacw.O);
      int j = this.a.e.zzacw.b.getRequestedOrientation();
      if (j == -1) {
        j = this.a.e.zzacw.h;
      }
      AdOverlayInfoParcel localAdOverlayInfoParcel = new AdOverlayInfoParcel(this.a, this.a, this.a, this.a.e.zzacw.b, j, this.a.e.zzacr, this.a.e.zzacw.A, localzzaq);
      jn.a.post(new i(this, localAdOverlayInfoParcel));
      return;
    }
  }
  
  public final void b_() {}
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.h
 * JD-Core Version:    0.7.0.1
 */