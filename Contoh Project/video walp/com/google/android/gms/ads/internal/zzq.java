package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.support.v4.f.m;
import android.view.View;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.internal.ads.ao;
import com.google.android.gms.internal.ads.aqg;
import com.google.android.gms.internal.ads.asn;
import com.google.android.gms.internal.ads.asu;
import com.google.android.gms.internal.ads.atf;
import com.google.android.gms.internal.ads.ath;
import com.google.android.gms.internal.ads.atm;
import com.google.android.gms.internal.ads.ato;
import com.google.android.gms.internal.ads.atp;
import com.google.android.gms.internal.ads.atq;
import com.google.android.gms.internal.ads.ats;
import com.google.android.gms.internal.ads.aun;
import com.google.android.gms.internal.ads.avk;
import com.google.android.gms.internal.ads.avv;
import com.google.android.gms.internal.ads.awb;
import com.google.android.gms.internal.ads.bbt;
import com.google.android.gms.internal.ads.bbu;
import com.google.android.gms.internal.ads.bck;
import com.google.android.gms.internal.ads.bcn;
import com.google.android.gms.internal.ads.bcw;
import com.google.android.gms.internal.ads.bda;
import com.google.android.gms.internal.ads.bdd;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.ij;
import com.google.android.gms.internal.ads.ik;
import com.google.android.gms.internal.ads.io;
import com.google.android.gms.internal.ads.je;
import com.google.android.gms.internal.ads.jn;
import com.google.android.gms.internal.ads.kh;
import com.google.android.gms.internal.ads.mk;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.zzaef;
import com.google.android.gms.internal.ads.zzaej;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public final class zzq
  extends zzd
  implements ats
{
  private boolean k;
  private ij l;
  private boolean m = false;
  
  public zzq(Context paramContext, zzw paramzzw, zzjn paramzzjn, String paramString, bck parambck, zzang paramzzang)
  {
    super(paramContext, paramzzjn, paramString, parambck, paramzzang, paramzzw);
  }
  
  private static ij a(ik paramik, int paramInt)
  {
    return new ij(paramik.a.c, null, paramik.b.c, paramInt, paramik.b.e, paramik.b.i, paramik.b.k, paramik.b.j, paramik.a.i, paramik.b.g, null, null, null, paramik.c, null, paramik.b.h, paramik.d, paramik.b.f, paramik.f, paramik.g, paramik.b.n, paramik.h, null, paramik.b.A, paramik.b.B, paramik.b.B, paramik.b.D, paramik.b.E, null, paramik.b.H, paramik.b.L, paramik.i, paramik.b.O, paramik.j, paramik.b.Q, paramik.b.R, paramik.b.S, paramik.b.T);
  }
  
  private final void a(atm paramatm)
  {
    jn.a.post(new ar(this, paramatm));
  }
  
  private final boolean a(ij paramij1, ij paramij2)
  {
    zzd(null);
    if (!this.e.zzfo())
    {
      je.e("Native ad does not have custom rendering mode.");
      a(0);
      return false;
    }
    bda localbda;
    avk localavk;
    String str1;
    label612:
    label618:
    aun localaun3;
    label679:
    View localView3;
    label758:
    aun localaun2;
    label911:
    View localView2;
    for (;;)
    {
      bcw localbcw;
      try
      {
        bdd localbdd;
        if (paramij2.p != null)
        {
          localbdd = paramij2.p.p();
          if (paramij2.p != null)
          {
            localbcw = paramij2.p.h();
            if (paramij2.p == null) {
              continue;
            }
            localbda = paramij2.p.i();
            if (paramij2.p == null) {
              continue;
            }
            localavk = paramij2.p.n();
            str1 = b(paramij2);
            if ((localbdd == null) || (this.e.k == null)) {
              continue;
            }
            String str20 = localbdd.a();
            List localList5 = localbdd.b();
            String str21 = localbdd.c();
            if (localbdd.d() == null) {
              continue;
            }
            localaun5 = localbdd.d();
            String str22 = localbdd.e();
            String str23 = localbdd.f();
            double d3 = localbdd.g();
            String str24 = localbdd.h();
            String str25 = localbdd.i();
            aqg localaqg5 = localbdd.j();
            if (localbdd.m() == null) {
              continue;
            }
            localView5 = (View)b.a(localbdd.m());
            atm localatm3 = new atm(str20, localList5, str21, localaun5, str22, str23, d3, str24, str25, null, localaqg5, localView5, localbdd.n(), str1, localbdd.o());
            localatm3.a(new atp(this.e.zzrt, this, this.e.b, localbdd, localatm3));
            a(localatm3);
            return super.zza(paramij1, paramij2);
          }
        }
        else
        {
          localbdd = null;
          continue;
        }
        localbcw = null;
        continue;
        localbda = null;
        continue;
        localavk = null;
        continue;
        aun localaun5 = null;
        continue;
        View localView5 = null;
        continue;
        if ((localbcw == null) || (this.e.k == null)) {
          break label618;
        }
        String str15 = localbcw.a();
        List localList4 = localbcw.b();
        String str16 = localbcw.c();
        if (localbcw.d() != null)
        {
          localaun4 = localbcw.d();
          String str17 = localbcw.e();
          double d2 = localbcw.f();
          String str18 = localbcw.g();
          String str19 = localbcw.h();
          aqg localaqg4 = localbcw.m();
          if (localbcw.p() == null) {
            break label612;
          }
          localView4 = (View)b.a(localbcw.p());
          atm localatm2 = new atm(str15, localList4, str16, localaun4, str17, null, d2, str18, str19, null, localaqg4, localView4, localbcw.q(), str1, localbcw.l());
          localatm2.a(new atp(this.e.zzrt, this, this.e.b, localbcw, localatm2));
          a(localatm2);
          continue;
        }
        aun localaun4 = null;
      }
      catch (RemoteException localRemoteException)
      {
        je.d("#007 Could not call remote method.", localRemoteException);
        a(0);
        return false;
      }
      continue;
      View localView4 = null;
      continue;
      if ((localbcw != null) && (this.e.i != null))
      {
        String str10 = localbcw.a();
        List localList3 = localbcw.b();
        String str11 = localbcw.c();
        if (localbcw.d() == null) {
          break label1328;
        }
        localaun3 = localbcw.d();
        String str12 = localbcw.e();
        double d1 = localbcw.f();
        String str13 = localbcw.g();
        String str14 = localbcw.h();
        Bundle localBundle2 = localbcw.l();
        aqg localaqg3 = localbcw.m();
        if (localbcw.p() == null) {
          break label1334;
        }
        localView3 = (View)b.a(localbcw.p());
        atf localatf = new atf(str10, localList3, str11, localaun3, str12, d1, str13, str14, null, localBundle2, localaqg3, localView3, localbcw.q(), str1);
        localatf.a(new atp(this.e.zzrt, this, this.e.b, localbcw, localatf));
        jn.a.post(new as(this, localatf));
      }
      else
      {
        if ((localbda == null) || (this.e.k == null)) {
          break;
        }
        String str6 = localbda.a();
        List localList2 = localbda.b();
        String str7 = localbda.c();
        if (localbda.d() == null) {
          break label1340;
        }
        localaun2 = localbda.d();
        String str8 = localbda.e();
        String str9 = localbda.f();
        aqg localaqg2 = localbda.l();
        if (localbda.n() == null) {
          break label1346;
        }
        localView2 = (View)b.a(localbda.n());
        label963:
        atm localatm1 = new atm(str6, localList2, str7, localaun2, str8, str9, -1.0D, null, null, null, localaqg2, localView2, localbda.o(), str1, localbda.j());
        localatm1.a(new atp(this.e.zzrt, this, this.e.b, localbda, localatm1));
        a(localatm1);
      }
    }
    String str2;
    List localList1;
    String str3;
    aun localaun1;
    label1111:
    String str4;
    String str5;
    Bundle localBundle1;
    aqg localaqg1;
    if ((localbda != null) && (this.e.j != null))
    {
      str2 = localbda.a();
      localList1 = localbda.b();
      str3 = localbda.c();
      if (localbda.d() == null) {
        break label1352;
      }
      localaun1 = localbda.d();
      str4 = localbda.e();
      str5 = localbda.f();
      localBundle1 = localbda.j();
      localaqg1 = localbda.l();
      if (localbda.n() == null) {
        break label1358;
      }
    }
    label1328:
    label1334:
    label1340:
    label1346:
    label1352:
    label1358:
    for (View localView1 = (View)b.a(localbda.n());; localView1 = null)
    {
      ath localath = new ath(str2, localList1, str3, localaun1, str4, str5, null, localBundle1, localaqg1, localView1, localbda.o(), str1);
      localath.a(new atp(this.e.zzrt, this, this.e.b, localbda, localath));
      jn.a.post(new at(this, localath));
      break;
      if ((localavk != null) && (this.e.m != null) && (this.e.m.get(localavk.l()) != null))
      {
        jn.a.post(new au(this, localavk));
        break;
      }
      je.e("No matching mapper/listener for retrieved native ad template.");
      a(0);
      return false;
      localaun3 = null;
      break label679;
      localView3 = null;
      break label758;
      localaun2 = null;
      break label911;
      localView2 = null;
      break label963;
      localaun1 = null;
      break label1111;
    }
  }
  
  private final boolean b(ij paramij1, ij paramij2)
  {
    View localView1 = zzas.zze(paramij2);
    if (localView1 == null) {
      return false;
    }
    View localView2 = this.e.c.getNextView();
    if (localView2 != null)
    {
      if ((localView2 instanceof qe)) {
        ((qe)localView2).destroy();
      }
      this.e.c.removeView(localView2);
    }
    if (!zzas.zzf(paramij2)) {}
    try
    {
      a(localView1);
      if (this.e.c.getChildCount() > 1) {
        this.e.c.showNext();
      }
      if (paramij1 != null)
      {
        View localView3 = this.e.c.getNextView();
        if (localView3 != null) {
          this.e.c.removeView(localView3);
        }
        this.e.zzfn();
      }
      this.e.c.setMinimumWidth(zzbk().f);
      this.e.c.setMinimumHeight(zzbk().c);
      this.e.c.requestLayout();
      this.e.c.setVisibility(0);
      return true;
    }
    catch (Throwable localThrowable)
    {
      zzbv.zzeo().a(localThrowable, "AdLoaderManager.swapBannerViews");
      je.c("Could not add mediation view to view hierarchy.", localThrowable);
    }
    return false;
  }
  
  private final bbu i()
  {
    if ((this.e.zzacw != null) && (this.e.zzacw.n)) {
      return this.e.zzacw.r;
    }
    return null;
  }
  
  protected final void a(a parama)
  {
    if (parama != null) {}
    for (Object localObject = b.a(parama);; localObject = null)
    {
      if ((localObject instanceof atq)) {
        ((atq)localObject).d();
      }
      super.b(this.e.zzacw, false);
      return;
    }
  }
  
  protected final boolean a(zzjj paramzzjj, ij paramij, boolean paramBoolean)
  {
    return false;
  }
  
  protected final void d()
  {
    super.d();
    ij localij = this.e.zzacw;
    if ((localij != null) && (localij.o != null) && (localij.o.a()) && (this.e.q != null)) {}
    try
    {
      this.e.q.a(this, b.a(this.e.zzrt));
      super.b(this.e.zzacw, false);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      je.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final aqg getVideoController()
  {
    return null;
  }
  
  public final void pause()
  {
    if (!this.m) {
      throw new IllegalStateException("Native Ad does not support pause().");
    }
    super.pause();
  }
  
  public final void resume()
  {
    if (!this.m) {
      throw new IllegalStateException("Native Ad does not support resume().");
    }
    super.resume();
  }
  
  public final void setManualImpressionsEnabled(boolean paramBoolean)
  {
    n.b("setManualImpressionsEnabled must be called from the main thread.");
    this.k = paramBoolean;
  }
  
  public final void showInterstitial()
  {
    throw new IllegalStateException("Interstitial is not supported by AdLoaderManager.");
  }
  
  public final void zza(asu paramasu)
  {
    throw new IllegalStateException("CustomRendering is not supported by AdLoaderManager.");
  }
  
  public final void zza(ato paramato)
  {
    mk.d("#005 Unexpected call to an abstract (unimplemented) method.", null);
  }
  
  public final void zza(atq paramatq)
  {
    mk.d("#005 Unexpected call to an abstract (unimplemented) method.", null);
  }
  
  public final void zza(ik paramik, asn paramasn)
  {
    this.l = null;
    if (paramik.e != -2) {
      this.l = a(paramik, paramik.e);
    }
    while (this.l != null)
    {
      jn.a.post(new aq(this));
      return;
      if (!paramik.b.g)
      {
        je.e("partialAdState is not mediation");
        this.l = a(paramik, 0);
      }
    }
    if (paramik.d != null) {
      this.e.zzacv = paramik.d;
    }
    this.e.zzadv = 0;
    zzbw localzzbw = this.e;
    zzbv.zzej();
    localzzbw.zzacu = ao.a(this.e.zzrt, this, paramik, this.e.b, null, this.j, this, paramasn);
  }
  
  protected final boolean zza(ij paramij1, ij paramij2)
  {
    if (!this.e.zzfo()) {
      throw new IllegalStateException("AdLoader API does not support custom rendering.");
    }
    if (!paramij2.n)
    {
      a(0);
      je.e("newState is not mediation.");
      return false;
    }
    int i;
    if ((paramij2.o != null) && (paramij2.o.a()))
    {
      if ((this.e.zzfo()) && (this.e.c != null)) {
        this.e.c.zzfr().c(paramij2.A);
      }
      if (!super.zza(paramij1, paramij2))
      {
        i = 0;
        label107:
        if (i == 0) {
          break label196;
        }
        this.m = true;
      }
    }
    label196:
    do
    {
      Integer[] arrayOfInteger = new Integer[1];
      arrayOfInteger[0] = Integer.valueOf(2);
      zze(new ArrayList(Arrays.asList(arrayOfInteger)));
      return true;
      if ((this.e.zzfo()) && (!b(paramij1, paramij2)))
      {
        a(0);
        i = 0;
        break label107;
      }
      if (!this.e.zzfp()) {
        super.a(paramij2, false);
      }
      i = 1;
      break label107;
      break;
      if ((paramij2.o == null) || (!paramij2.o.b())) {
        break label226;
      }
    } while (a(paramij1, paramij2));
    return false;
    label226:
    a(0);
    je.e("Response is neither banner nor native.");
    return false;
  }
  
  public final boolean zzb(zzjj paramzzjj)
  {
    if ((this.e.r != null) && (this.e.r.size() == 1) && (((Integer)this.e.r.get(0)).intValue() == 2)) {}
    for (int i = 1; i != 0; i = 0)
    {
      je.c("Requesting only banner Ad from AdLoader or calling loadAd on returned banner is not yet supported");
      a(0);
      return false;
    }
    if (this.e.q != null)
    {
      if (paramzzjj.h == this.k) {
        return super.zzb(paramzzjj);
      }
      int j = paramzzjj.a;
      long l1 = paramzzjj.b;
      Bundle localBundle = paramzzjj.c;
      int n = paramzzjj.d;
      List localList = paramzzjj.e;
      boolean bool1 = paramzzjj.f;
      int i1 = paramzzjj.g;
      if ((paramzzjj.h) || (this.k)) {}
      for (boolean bool2 = true;; bool2 = false)
      {
        paramzzjj = new zzjj(j, l1, localBundle, n, localList, bool1, i1, bool2, paramzzjj.i, paramzzjj.j, paramzzjj.k, paramzzjj.l, paramzzjj.m, paramzzjj.n, paramzzjj.o, paramzzjj.p, paramzzjj.q, paramzzjj.r);
        break;
      }
    }
    return super.zzb(paramzzjj);
  }
  
  public final void zzce()
  {
    if ((this.e.zzacw != null) && ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.e.zzacw.q)) && (this.e.zzacw.o != null) && (this.e.zzacw.o.b()))
    {
      zzbs();
      return;
    }
    super.zzce();
  }
  
  public final void zzcj()
  {
    if ((this.e.zzacw != null) && ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.e.zzacw.q)) && (this.e.zzacw.o != null) && (this.e.zzacw.o.b()))
    {
      zzbr();
      return;
    }
    super.zzcj();
  }
  
  public final void zzcr()
  {
    mk.d("#005 Unexpected call to an abstract (unimplemented) method.", null);
  }
  
  public final void zzcs()
  {
    mk.d("#005 Unexpected call to an abstract (unimplemented) method.", null);
  }
  
  public final void zzct()
  {
    mk.d("#005 Unexpected call to an abstract (unimplemented) method.", null);
  }
  
  public final boolean zzcu()
  {
    if (i() != null) {
      return i().p;
    }
    return false;
  }
  
  public final boolean zzcv()
  {
    if (i() != null) {
      return i().q;
    }
    return false;
  }
  
  public final void zzd(List<String> paramList)
  {
    n.b("setNativeTemplates must be called on the main UI thread.");
    this.e.v = paramList;
  }
  
  public final void zze(List<Integer> paramList)
  {
    n.b("setAllowedAdTypes must be called on the main UI thread.");
    this.e.r = paramList;
  }
  
  public final void zzi(View paramView)
  {
    mk.d("#005 Unexpected call to an abstract (unimplemented) method.", null);
  }
  
  public final avv zzr(String paramString)
  {
    n.b("getOnCustomClickListener must be called on the main UI thread.");
    return (avv)this.e.l.get(paramString);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.zzq
 * JD-Core Version:    0.7.0.1
 */