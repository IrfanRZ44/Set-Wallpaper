package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.internal.ads.aji;
import com.google.android.gms.internal.ads.ao;
import com.google.android.gms.internal.ads.aos;
import com.google.android.gms.internal.ads.arq;
import com.google.android.gms.internal.ads.ary;
import com.google.android.gms.internal.ads.asa;
import com.google.android.gms.internal.ads.asn;
import com.google.android.gms.internal.ads.asu;
import com.google.android.gms.internal.ads.bck;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.hu;
import com.google.android.gms.internal.ads.hv;
import com.google.android.gms.internal.ads.ij;
import com.google.android.gms.internal.ads.ik;
import com.google.android.gms.internal.ads.je;
import com.google.android.gms.internal.ads.jn;
import com.google.android.gms.internal.ads.kh;
import com.google.android.gms.internal.ads.o;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.ql;
import com.google.android.gms.internal.ads.rm;
import com.google.android.gms.internal.ads.rs;
import com.google.android.gms.internal.ads.zzaef;
import com.google.android.gms.internal.ads.zzaej;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjn;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public abstract class zzi
  extends zzd
  implements zzaf, o
{
  private boolean k;
  
  public zzi(Context paramContext, zzjn paramzzjn, String paramString, bck parambck, zzang paramzzang, zzw paramzzw)
  {
    super(paramContext, paramzzjn, paramString, parambck, paramzzang, paramzzw);
  }
  
  protected qe a(ik paramik, zzx paramzzx, hu paramhu)
  {
    View localView = this.e.c.getNextView();
    if ((localView instanceof qe)) {
      ((qe)localView).destroy();
    }
    if (localView != null) {
      this.e.c.removeView(localView);
    }
    zzbv.zzel();
    qe localqe = ql.a(this.e.zzrt, rs.a(this.e.zzacv), this.e.zzacv.a, false, false, this.e.b, this.e.zzacr, this.a, this, this.i, paramik.i);
    if (this.e.zzacv.g == null) {
      a(localqe.getView());
    }
    localqe.t().a(this, this, this, this, this, false, null, paramzzx, this, paramhu);
    a(localqe);
    localqe.a(paramik.a.v);
    return localqe;
  }
  
  protected final void a(qe paramqe)
  {
    paramqe.a("/trackActiveViewUnit", new ak(this));
  }
  
  final void b(qe paramqe)
  {
    if (this.e.zzacw != null)
    {
      this.g.a(this.e.zzacv, this.e.zzacw, paramqe.getView(), paramqe);
      this.k = false;
      return;
    }
    this.k = true;
    je.e("Request to enable ActiveView before adState is available.");
  }
  
  protected void d()
  {
    super.d();
    if (this.k)
    {
      arq localarq = asa.cg;
      if (((Boolean)aos.f().a(localarq)).booleanValue()) {
        b(this.e.zzacw.b);
      }
    }
  }
  
  protected final boolean j()
  {
    return (this.e.zzacx != null) && (this.e.zzacx.b != null) && (this.e.zzacx.b.Q);
  }
  
  public final void zza(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    f_();
  }
  
  public final void zza(asu paramasu)
  {
    n.b("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
    this.e.s = paramasu;
  }
  
  protected void zza(ik paramik, asn paramasn)
  {
    if (paramik.e != -2)
    {
      jn.a.post(new al(this, paramik));
      return;
    }
    if (paramik.d != null) {
      this.e.zzacv = paramik.d;
    }
    if ((paramik.b.g) && (!paramik.b.z))
    {
      this.e.zzadv = 0;
      zzbw localzzbw = this.e;
      zzbv.zzej();
      localzzbw.zzacu = ao.a(this.e.zzrt, this, paramik, this.e.b, null, this.j, this, paramasn);
      return;
    }
    hu localhu = this.i.zzxa.a(this.e.zzrt, this.e.zzacr, paramik.b);
    jn.a.post(new am(this, paramik, localhu, paramasn));
  }
  
  protected boolean zza(ij paramij1, ij paramij2)
  {
    if ((this.e.zzfo()) && (this.e.c != null)) {
      this.e.c.zzfr().c(paramij2.A);
    }
    for (;;)
    {
      try
      {
        if ((paramij2.b != null) && (!paramij2.n) && (paramij2.M))
        {
          arq localarq = asa.dl;
          if (((Boolean)aos.f().a(localarq)).booleanValue())
          {
            boolean bool = paramij2.a.c.containsKey("sdk_less_server_data");
            if (bool) {}
          }
        }
      }
      catch (RuntimeException localRuntimeException)
      {
        je.a("Could not render test AdLabel.");
        continue;
      }
      try
      {
        paramij2.b.H();
        return super.zza(paramij1, paramij2);
      }
      catch (Throwable localThrowable)
      {
        je.a("Could not render test Ad label.");
      }
    }
  }
  
  public final void zzcn()
  {
    onAdClicked();
  }
  
  public final void zzco()
  {
    recordImpression();
    zzbm();
  }
  
  public final void zzcq()
  {
    c_();
  }
  
  public final void zzh(View paramView)
  {
    this.e.w = paramView;
    zzb(new ij(this.e.zzacx, null, null, null, null, null, null, null));
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.zzi
 * JD-Core Version:    0.7.0.1
 */