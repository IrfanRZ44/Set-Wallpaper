package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.webkit.WebView;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.util.k;
import com.google.android.gms.internal.ads.aji;
import com.google.android.gms.internal.ads.akg;
import com.google.android.gms.internal.ads.amj;
import com.google.android.gms.internal.ads.aml.a.b;
import com.google.android.gms.internal.ads.aos;
import com.google.android.gms.internal.ads.aqg;
import com.google.android.gms.internal.ads.arq;
import com.google.android.gms.internal.ads.ary;
import com.google.android.gms.internal.ads.asa;
import com.google.android.gms.internal.ads.bbt;
import com.google.android.gms.internal.ads.bck;
import com.google.android.gms.internal.ads.bcn;
import com.google.android.gms.internal.ads.bcw;
import com.google.android.gms.internal.ads.bda;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.hu;
import com.google.android.gms.internal.ads.hy;
import com.google.android.gms.internal.ads.hz;
import com.google.android.gms.internal.ads.ij;
import com.google.android.gms.internal.ads.ik;
import com.google.android.gms.internal.ads.io;
import com.google.android.gms.internal.ads.je;
import com.google.android.gms.internal.ads.jn;
import com.google.android.gms.internal.ads.lz;
import com.google.android.gms.internal.ads.nx;
import com.google.android.gms.internal.ads.p;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.qu;
import com.google.android.gms.internal.ads.rm;
import com.google.android.gms.internal.ads.rs;
import com.google.android.gms.internal.ads.zzaej;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjn;
import java.lang.ref.WeakReference;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public final class zzy
  extends zzi
  implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener
{
  private boolean k;
  private boolean l;
  private WeakReference<Object> m = new WeakReference(null);
  
  public zzy(Context paramContext, zzjn paramzzjn, String paramString, bck parambck, zzang paramzzang, zzw paramzzw)
  {
    super(paramContext, paramzzjn, paramString, parambck, paramzzang, paramzzw);
  }
  
  private final boolean a(ij paramij1, ij paramij2)
  {
    View localView2;
    if (paramij2.n)
    {
      localView2 = zzas.zze(paramij2);
      if (localView2 == null)
      {
        je.e("Could not get mediation view");
        return false;
      }
      View localView3 = this.e.c.getNextView();
      if (localView3 != null)
      {
        if ((localView3 instanceof qe)) {
          ((qe)localView3).destroy();
        }
        this.e.c.removeView(localView3);
      }
      if (zzas.zzf(paramij2)) {}
    }
    for (;;)
    {
      View localView1;
      try
      {
        if (zzbv.zzfh().b(this.e.zzrt)) {
          new akg(this.e.zzrt, localView2).a(new hy(this.e.zzrt, this.e.zzacp));
        }
        if (paramij2.u != null)
        {
          this.e.c.setMinimumWidth(paramij2.u.f);
          this.e.c.setMinimumHeight(paramij2.u.c);
        }
        a(localView2);
        if (this.e.c.getChildCount() > 1) {
          this.e.c.showNext();
        }
        if (paramij1 != null)
        {
          localView1 = this.e.c.getNextView();
          if (!(localView1 instanceof qe)) {
            break label368;
          }
          ((qe)localView1).destroy();
          this.e.zzfn();
        }
        this.e.c.setVisibility(0);
        return true;
      }
      catch (Exception localException)
      {
        zzbv.zzeo().a(localException, "BannerAdManager.swapViews");
        je.c("Could not add mediation view to view hierarchy.", localException);
        return false;
      }
      if ((paramij2.u != null) && (paramij2.b != null))
      {
        paramij2.b.a(rs.a(paramij2.u));
        this.e.c.removeAllViews();
        this.e.c.setMinimumWidth(paramij2.u.f);
        this.e.c.setMinimumHeight(paramij2.u.c);
        a(paramij2.b.getView());
        continue;
        label368:
        if (localView1 != null) {
          this.e.c.removeView(localView1);
        }
      }
    }
  }
  
  private final void c(qe paramqe)
  {
    if (!j()) {}
    View localView;
    do
    {
      WebView localWebView;
      do
      {
        do
        {
          return;
          localWebView = paramqe.getWebView();
        } while (localWebView == null);
        localView = paramqe.getView();
      } while ((localView == null) || (!zzbv.zzfa().a(this.e.zzrt)));
      int i = this.e.zzacr.b;
      int j = this.e.zzacr.c;
      String str = 23 + i + "." + j;
      this.h = zzbv.zzfa().a(str, localWebView, "", "javascript", h());
    } while (this.h == null);
    zzbv.zzfa().a(this.h, localView);
    zzbv.zzfa().a(this.h);
    this.l = true;
  }
  
  protected final qe a(ik paramik, zzx paramzzx, hu paramhu)
  {
    zzjn localzzjn;
    if ((this.e.zzacv.g == null) && (this.e.zzacv.i))
    {
      zzbw localzzbw = this.e;
      if (paramik.b.y)
      {
        localzzjn = this.e.zzacv;
        localzzbw.zzacv = localzzjn;
      }
    }
    else
    {
      return super.a(paramik, paramzzx, paramhu);
    }
    String str = paramik.b.l;
    String[] arrayOfString;
    if (str != null)
    {
      arrayOfString = str.split("[xX]");
      arrayOfString[0] = arrayOfString[0].trim();
      arrayOfString[1] = arrayOfString[1].trim();
    }
    for (AdSize localAdSize = new AdSize(Integer.parseInt(arrayOfString[0]), Integer.parseInt(arrayOfString[1]));; localAdSize = this.e.zzacv.b())
    {
      localzzjn = new zzjn(this.e.zzrt, localAdSize);
      break;
    }
  }
  
  protected final void a(ij paramij, boolean paramBoolean)
  {
    qe localqe2;
    if (j())
    {
      if (paramij == null) {
        break label124;
      }
      localqe2 = paramij.b;
      if (localqe2 != null)
      {
        if (!this.l) {
          c(localqe2);
        }
        if (this.h != null) {
          localqe2.a("onSdkImpression", new android.support.v4.f.a());
        }
      }
    }
    super.a(paramij, paramBoolean);
    zzac localzzac;
    qe localqe1;
    if (zzas.zzf(paramij))
    {
      localzzac = new zzac(this);
      if ((paramij != null) && (zzas.zzf(paramij)))
      {
        localqe1 = paramij.b;
        if (localqe1 == null) {
          break label130;
        }
      }
    }
    label130:
    for (View localView = localqe1.getView();; localView = null)
    {
      if (localView != null) {
        break label136;
      }
      je.e("AdWebView is null");
      return;
      label124:
      localqe2 = null;
      break;
    }
    label136:
    List localList;
    for (;;)
    {
      try
      {
        if (paramij.o != null)
        {
          localList = paramij.o.r;
          if ((localList != null) && (!localList.isEmpty())) {
            break;
          }
          je.e("No template ids present in mediation response");
          return;
        }
      }
      catch (RemoteException localRemoteException)
      {
        je.c("Error occurred while recording impression and registering for clicks", localRemoteException);
        return;
      }
      localList = null;
    }
    if (paramij.p != null) {}
    for (bcw localbcw = paramij.p.h();; localbcw = null)
    {
      bcn localbcn = paramij.p;
      bda localbda = null;
      if (localbcn != null) {
        localbda = paramij.p.i();
      }
      if ((localList.contains("2")) && (localbcw != null))
      {
        localbcw.b(com.google.android.gms.a.b.a(localView));
        if (!localbcw.j()) {
          localbcw.i();
        }
        localqe1.a("/nativeExpressViewClicked", zzas.a(localbcw, null, localzzac));
        return;
      }
      if ((localList.contains("1")) && (localbda != null))
      {
        localbda.b(com.google.android.gms.a.b.a(localView));
        if (!localbda.h()) {
          localbda.g();
        }
        localqe1.a("/nativeExpressViewClicked", zzas.a(null, localbda, localzzac));
        return;
      }
      je.e("No matching template id and mapper");
      return;
    }
  }
  
  final void c(ij paramij)
  {
    if (paramij == null) {}
    while ((paramij.m) || (this.e.c == null) || (!zzbv.zzek().a(this.e.c, this.e.zzrt)) || (!this.e.c.getGlobalVisibleRect(new Rect(), null))) {
      return;
    }
    if ((paramij != null) && (paramij.b != null) && (paramij.b.t() != null)) {
      paramij.b.t().a(null);
    }
    a(paramij, false);
    paramij.m = true;
  }
  
  protected final void d()
  {
    if (this.e.zzacw != null) {}
    for (qe localqe = this.e.zzacw.b;; localqe = null)
    {
      if ((!this.l) && (localqe != null)) {
        c(localqe);
      }
      super.d();
      return;
    }
  }
  
  public final aqg getVideoController()
  {
    n.b("getVideoController must be called from the main thread.");
    if ((this.e.zzacw != null) && (this.e.zzacw.b != null)) {
      return this.e.zzacw.b.b();
    }
    return null;
  }
  
  protected final boolean k()
  {
    boolean bool = true;
    zzbv.zzek();
    if (!jn.a(this.e.zzrt, "android.permission.INTERNET"))
    {
      aos.a().a(this.e.c, this.e.zzacv, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
      bool = false;
    }
    zzbv.zzek();
    if (!jn.a(this.e.zzrt))
    {
      aos.a().a(this.e.c, this.e.zzacv, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
      bool = false;
    }
    if ((!bool) && (this.e.c != null)) {
      this.e.c.setVisibility(0);
    }
    return bool;
  }
  
  public final void onGlobalLayout()
  {
    c(this.e.zzacw);
  }
  
  public final void onScrollChanged()
  {
    c(this.e.zzacw);
  }
  
  public final void setManualImpressionsEnabled(boolean paramBoolean)
  {
    n.b("setManualImpressionsEnabled must be called from the main thread.");
    this.k = paramBoolean;
  }
  
  public final void showInterstitial()
  {
    throw new IllegalStateException("Interstitial is NOT supported by BannerAdManager.");
  }
  
  public final boolean zza(ij paramij1, ij paramij2)
  {
    if (!super.zza(paramij1, paramij2)) {
      return false;
    }
    if ((this.e.zzfo()) && (!a(paramij1, paramij2)))
    {
      if (paramij2.K != null) {
        paramij2.K.a(aml.a.b.c);
      }
      a(0);
      return false;
    }
    b(paramij2, false);
    rm localrm2;
    label159:
    View localView;
    akg localakg;
    if (paramij2.l)
    {
      c(paramij2);
      zzbv.zzfg();
      nx.a(this.e.c, this);
      zzbv.zzfg();
      nx.a(this.e.c, this);
      if (!paramij2.m)
      {
        b localb = new b(this);
        if (paramij2.b == null) {
          break label397;
        }
        localrm2 = paramij2.b.t();
        if (localrm2 != null) {
          localrm2.a(new av(paramij2, localb));
        }
      }
      if (paramij2.b != null)
      {
        qu localqu = paramij2.b.b();
        rm localrm1 = paramij2.b.t();
        if (localrm1 != null) {
          localrm1.g();
        }
        if ((this.e.o != null) && (localqu != null)) {
          localqu.a(this.e.o);
        }
      }
      if (k.b())
      {
        if (!this.e.zzfo()) {
          break label471;
        }
        if (paramij2.b == null) {
          break label521;
        }
        if (paramij2.k != null) {
          this.g.a(this.e.zzacv, paramij2);
        }
        localView = paramij2.b.getView();
        localakg = new akg(this.e.zzrt, localView);
        if ((zzbv.zzfh().b(this.e.zzrt)) && (a(paramij2.a)) && (!TextUtils.isEmpty(this.e.zzacp))) {
          localakg.a(new hy(this.e.zzrt, this.e.zzacp));
        }
        if (!paramij2.a()) {
          break label444;
        }
        localakg.a(paramij2.b);
      }
    }
    label521:
    for (;;)
    {
      if (!paramij2.n) {
        this.e.a(localView);
      }
      return true;
      label397:
      localrm2 = null;
      break;
      if (this.e.zzfp())
      {
        arq localarq = asa.bW;
        if (!((Boolean)aos.f().a(localarq)).booleanValue()) {
          break label159;
        }
      }
      a(paramij2, false);
      break label159;
      label444:
      paramij2.b.t().a(new a(localakg, paramij2));
      continue;
      label471:
      if ((this.e.w != null) && (paramij2.k != null))
      {
        this.g.a(this.e.zzacv, paramij2, this.e.w);
        localView = this.e.w;
      }
      else
      {
        localView = null;
      }
    }
  }
  
  public final boolean zzb(zzjj paramzzjj)
  {
    if (paramzzjj.h == this.k) {
      return super.zzb(paramzzjj);
    }
    int i = paramzzjj.a;
    long l1 = paramzzjj.b;
    Bundle localBundle = paramzzjj.c;
    int j = paramzzjj.d;
    List localList = paramzzjj.e;
    boolean bool1 = paramzzjj.f;
    int n = paramzzjj.g;
    if ((paramzzjj.h) || (this.k)) {}
    for (boolean bool2 = true;; bool2 = false)
    {
      paramzzjj = new zzjj(i, l1, localBundle, j, localList, bool1, n, bool2, paramzzjj.i, paramzzjj.j, paramzzjj.k, paramzzjj.l, paramzzjj.m, paramzzjj.n, paramzzjj.o, paramzzjj.p, paramzzjj.q, paramzzjj.r);
      break;
    }
  }
  
  public final void zzcz()
  {
    this.d.zzdy();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.zzy
 * JD-Core Version:    0.7.0.1
 */