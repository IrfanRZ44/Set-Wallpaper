package com.google.android.gms.ads.internal;

import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.asn;
import com.google.android.gms.internal.ads.aso;
import com.google.android.gms.internal.ads.asu;
import com.google.android.gms.internal.ads.hu;
import com.google.android.gms.internal.ads.ik;
import com.google.android.gms.internal.ads.je;
import com.google.android.gms.internal.ads.jn;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.qp;
import com.google.android.gms.internal.ads.zzaej;

final class am
  implements Runnable
{
  am(zzi paramzzi, ik paramik, hu paramhu, asn paramasn) {}
  
  public final void run()
  {
    if ((this.a.b.r) && (this.c.e.s != null))
    {
      String str1 = this.a.b.a;
      String str2 = null;
      if (str1 != null)
      {
        zzbv.zzek();
        str2 = jn.a(this.a.b.a);
      }
      aso localaso = new aso(this.c, str2, this.a.b.b);
      this.c.e.zzadv = 1;
      try
      {
        this.c.c = false;
        this.c.e.s.a(localaso);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        je.d("#007 Could not call remote method.", localRemoteException);
        this.c.c = true;
      }
    }
    zzx localzzx = new zzx(this.c.e.zzrt, this.b, this.a.b.E);
    try
    {
      qe localqe = this.c.a(this.a, localzzx, this.b);
      localqe.setOnTouchListener(new ao(this, localzzx));
      localqe.setOnClickListener(new ap(this, localzzx));
      this.c.e.zzadv = 0;
      zzbw localzzbw = this.c.e;
      zzbv.zzej();
      localzzbw.zzacu = com.google.android.gms.internal.ads.ao.a(this.c.e.zzrt, this.c, this.a, this.c.e.b, localqe, this.c.j, this.c, this.d);
      return;
    }
    catch (qp localqp)
    {
      je.b("Could not obtain webview.", localqp);
      jn.a.post(new an(this));
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.am
 * JD-Core Version:    0.7.0.1
 */