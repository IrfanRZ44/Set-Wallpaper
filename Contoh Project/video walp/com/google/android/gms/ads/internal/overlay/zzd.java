package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.FrameLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.google.android.gms.ads.internal.gmsg.zzb;
import com.google.android.gms.ads.internal.zzaq;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzx;
import com.google.android.gms.common.util.k;
import com.google.android.gms.internal.ads.amj;
import com.google.android.gms.internal.ads.anw;
import com.google.android.gms.internal.ads.aos;
import com.google.android.gms.internal.ads.arq;
import com.google.android.gms.internal.ads.ary;
import com.google.android.gms.internal.ads.asa;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.iz;
import com.google.android.gms.internal.ads.je;
import com.google.android.gms.internal.ads.jn;
import com.google.android.gms.internal.ads.jt;
import com.google.android.gms.internal.ads.n;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.ql;
import com.google.android.gms.internal.ads.rm;
import com.google.android.gms.internal.ads.rs;
import com.google.android.gms.internal.ads.s;
import com.google.android.gms.internal.ads.zzang;
import java.util.Collections;

@cm
public class zzd
  extends s
  implements zzw
{
  private static final int e = Color.argb(0, 0, 0, 0);
  protected final Activity a;
  AdOverlayInfoParcel b;
  qe c;
  int d = 0;
  private zzi f;
  private zzo g;
  private boolean h = false;
  private FrameLayout i;
  private WebChromeClient.CustomViewCallback j;
  private boolean k = false;
  private boolean l = false;
  private d m;
  private boolean n = false;
  private final Object o = new Object();
  private Runnable p;
  private boolean q;
  private boolean r;
  private boolean s = false;
  private boolean t = false;
  private boolean u = true;
  
  public zzd(Activity paramActivity)
  {
    this.a = paramActivity;
  }
  
  private final void a(boolean paramBoolean)
  {
    arq localarq = asa.da;
    int i1 = ((Integer)aos.f().a(localarq)).intValue();
    g localg = new g();
    localg.e = 50;
    int i2;
    int i3;
    label55:
    RelativeLayout.LayoutParams localLayoutParams;
    if (paramBoolean)
    {
      i2 = i1;
      localg.a = i2;
      if (!paramBoolean) {
        break label159;
      }
      i3 = 0;
      localg.b = i3;
      localg.c = 0;
      localg.d = i1;
      this.g = new zzo(this.a, localg, this);
      localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
      localLayoutParams.addRule(10);
      if (!paramBoolean) {
        break label165;
      }
    }
    label159:
    label165:
    for (int i4 = 11;; i4 = 9)
    {
      localLayoutParams.addRule(i4);
      zza(paramBoolean, this.b.zzbyr);
      this.m.addView(this.g, localLayoutParams);
      return;
      i2 = 0;
      break;
      i3 = i1;
      break label55;
    }
  }
  
  private final void b()
  {
    if ((!this.a.isFinishing()) || (this.s)) {
      return;
    }
    this.s = true;
    if (this.c != null)
    {
      int i1 = this.d;
      this.c.a(i1);
      synchronized (this.o)
      {
        if ((!this.q) && (this.c.C()))
        {
          this.p = new b(this);
          Handler localHandler = jn.a;
          Runnable localRunnable = this.p;
          arq localarq = asa.aP;
          localHandler.postDelayed(localRunnable, ((Long)aos.f().a(localarq)).longValue());
          return;
        }
      }
    }
    a();
  }
  
  private final void b(boolean paramBoolean)
  {
    if (!this.r) {
      this.a.requestWindowFeature(1);
    }
    Window localWindow = this.a.getWindow();
    if (localWindow == null) {
      throw new c("Invalid activity, no window available.");
    }
    if (k.k())
    {
      arq localarq2 = asa.cY;
      if (((Boolean)aos.f().a(localarq2)).booleanValue()) {
        zzbv.zzek();
      }
    }
    for (boolean bool1 = jn.a(this.a, this.a.getResources().getConfiguration());; bool1 = true)
    {
      int i1;
      rm localrm1;
      label225:
      boolean bool2;
      label239:
      boolean bool5;
      if ((this.b.zzbyw != null) && (this.b.zzbyw.zzzf))
      {
        i1 = 1;
        if (((!this.l) || (i1 != 0)) && (bool1))
        {
          localWindow.setFlags(1024, 1024);
          arq localarq1 = asa.aQ;
          if ((((Boolean)aos.f().a(localarq1)).booleanValue()) && (k.g()) && (this.b.zzbyw != null) && (this.b.zzbyw.zzzk)) {
            localWindow.getDecorView().setSystemUiVisibility(4098);
          }
        }
        if (this.b.zzbyo == null) {
          break label795;
        }
        localrm1 = this.b.zzbyo.t();
        if (localrm1 == null) {
          break label801;
        }
        bool2 = localrm1.b();
        this.n = false;
        if (bool2)
        {
          if (this.b.orientation != zzbv.zzem().a()) {
            break label813;
          }
          if (this.a.getResources().getConfiguration().orientation != 1) {
            break label807;
          }
          bool5 = true;
          label285:
          this.n = bool5;
        }
        label291:
        boolean bool3 = this.n;
        je.b(46 + "Delay onShow to next orientation change: " + bool3);
        setRequestedOrientation(this.b.orientation);
        if (zzbv.zzem().a(localWindow)) {
          je.b("Hardware acceleration on the AdActivity window enabled.");
        }
        if (this.l) {
          break label864;
        }
        this.m.setBackgroundColor(-16777216);
        label367:
        this.a.setContentView(this.m);
        this.r = true;
        if (!paramBoolean) {
          break label976;
        }
      }
      for (;;)
      {
        try
        {
          zzbv.zzel();
          Activity localActivity = this.a;
          if (this.b.zzbyo != null)
          {
            localrs = this.b.zzbyo.r();
            if (this.b.zzbyo == null) {
              continue;
            }
            str = this.b.zzbyo.s();
            zzang localzzang = this.b.zzacr;
            if (this.b.zzbyo == null) {
              continue;
            }
            localzzw = this.b.zzbyo.e();
            this.c = ql.a(localActivity, localrs, str, true, bool2, null, localzzang, null, null, localzzw, amj.a());
            rm localrm2 = this.c.t();
            zzb localzzb = this.b.zzbyx;
            com.google.android.gms.ads.internal.gmsg.zzd localzzd = this.b.zzbyp;
            zzt localzzt = this.b.zzbyt;
            if (this.b.zzbyo == null) {
              break label916;
            }
            localzzx = this.b.zzbyo.t().a();
            localrm2.a(null, localzzb, null, localzzd, localzzt, true, null, localzzx, null, null);
            this.c.t().a(new a(this));
            if (this.b.url == null) {
              break label922;
            }
            this.c.loadUrl(this.b.url);
            if (this.b.zzbyo != null) {
              this.b.zzbyo.b(this);
            }
            this.c.a(this);
            ViewParent localViewParent = this.c.getParent();
            if ((localViewParent != null) && ((localViewParent instanceof ViewGroup))) {
              ((ViewGroup)localViewParent).removeView(this.c.getView());
            }
            if (this.l) {
              this.c.G();
            }
            this.m.addView(this.c.getView(), -1, -1);
            if ((!paramBoolean) && (!this.n)) {
              c();
            }
            a(bool2);
            if (this.c.v()) {
              zza(bool2, true);
            }
            return;
            i1 = 0;
            break;
            label795:
            localrm1 = null;
            break label225;
            label801:
            bool2 = false;
            break label239;
            label807:
            bool5 = false;
            break label285;
            label813:
            if (this.b.orientation != zzbv.zzem().b()) {
              break label291;
            }
            if (this.a.getResources().getConfiguration().orientation == 2)
            {
              bool4 = true;
              this.n = bool4;
              break label291;
            }
            boolean bool4 = false;
            continue;
            label864:
            this.m.setBackgroundColor(e);
            break label367;
          }
          rs localrs = null;
          continue;
          String str = null;
          continue;
          com.google.android.gms.ads.internal.zzw localzzw = null;
          continue;
          zzx localzzx = null;
        }
        catch (Exception localException)
        {
          je.b("Error obtaining webview.", localException);
          throw new c("Could not obtain webview for the overlay.");
        }
        label916:
        continue;
        label922:
        if (this.b.zzbys != null)
        {
          this.c.loadDataWithBaseURL(this.b.zzbyq, this.b.zzbys, "text/html", "UTF-8", null);
        }
        else
        {
          throw new c("No URL or HTML to display in ad overlay.");
          label976:
          this.c = this.b.zzbyo;
          this.c.a(this.a);
        }
      }
    }
  }
  
  private final void c()
  {
    this.c.m();
  }
  
  final void a()
  {
    if (this.t) {
      return;
    }
    this.t = true;
    if (this.c != null)
    {
      this.m.removeView(this.c.getView());
      if (this.f == null) {
        break label142;
      }
      this.c.a(this.f.zzrt);
      this.c.b(false);
      this.f.parent.addView(this.c.getView(), this.f.index, this.f.zzbyi);
      this.f = null;
    }
    for (;;)
    {
      this.c = null;
      if ((this.b == null) || (this.b.zzbyn == null)) {
        break;
      }
      this.b.zzbyn.zzcb();
      return;
      label142:
      if (this.a.getApplicationContext() != null) {
        this.c.a(this.a.getApplicationContext());
      }
    }
  }
  
  public final void close()
  {
    this.d = 2;
    this.a.finish();
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  public final void onBackPressed()
  {
    this.d = 0;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    this.a.requestWindowFeature(1);
    boolean bool = false;
    if (paramBundle != null) {
      bool = paramBundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
    }
    this.k = bool;
    try
    {
      this.b = AdOverlayInfoParcel.zzc(this.a.getIntent());
      if (this.b == null) {
        throw new c("Could not get info for ad overlay.");
      }
    }
    catch (c localc)
    {
      je.e(localc.getMessage());
      this.d = 3;
      this.a.finish();
      return;
    }
    if (this.b.zzacr.c > 7500000) {
      this.d = 3;
    }
    if (this.a.getIntent() != null) {
      this.u = this.a.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
    }
    if (this.b.zzbyw != null) {}
    for (this.l = this.b.zzbyw.zzze;; this.l = false)
    {
      arq localarq = asa.bR;
      if ((((Boolean)aos.f().a(localarq)).booleanValue()) && (this.l) && (this.b.zzbyw.zzzj != -1)) {
        new e(this, null).h();
      }
      if (paramBundle == null)
      {
        if ((this.b.zzbyn != null) && (this.u)) {
          this.b.zzbyn.zzcc();
        }
        if ((this.b.zzbyu != 1) && (this.b.zzbym != null)) {
          this.b.zzbym.onAdClicked();
        }
      }
      this.m = new d(this.a, this.b.zzbyv, this.b.zzacr.a);
      this.m.setId(1000);
      switch (this.b.zzbyu)
      {
      default: 
        throw new c("Could not determine ad overlay type.");
      }
    }
    b(false);
    return;
    this.f = new zzi(this.b.zzbyo);
    b(false);
    return;
    b(true);
  }
  
  public final void onDestroy()
  {
    if (this.c != null) {
      this.m.removeView(this.c.getView());
    }
    b();
  }
  
  public final void onPause()
  {
    zznh();
    if (this.b.zzbyn != null) {
      this.b.zzbyn.onPause();
    }
    arq localarq = asa.cZ;
    if ((!((Boolean)aos.f().a(localarq)).booleanValue()) && (this.c != null) && ((!this.a.isFinishing()) || (this.f == null)))
    {
      zzbv.zzem();
      jt.a(this.c);
    }
    b();
  }
  
  public final void onRestart() {}
  
  public final void onResume()
  {
    if (this.b.zzbyn != null) {
      this.b.zzbyn.onResume();
    }
    arq localarq = asa.cZ;
    if (!((Boolean)aos.f().a(localarq)).booleanValue())
    {
      if ((this.c != null) && (!this.c.y()))
      {
        zzbv.zzem();
        jt.b(this.c);
      }
    }
    else {
      return;
    }
    je.e("The webview does not exist. Ignoring action.");
  }
  
  public final void onSaveInstanceState(Bundle paramBundle)
  {
    paramBundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.k);
  }
  
  public final void onStart()
  {
    arq localarq = asa.cZ;
    if (((Boolean)aos.f().a(localarq)).booleanValue())
    {
      if ((this.c != null) && (!this.c.y()))
      {
        zzbv.zzem();
        jt.b(this.c);
      }
    }
    else {
      return;
    }
    je.e("The webview does not exist. Ignoring action.");
  }
  
  public final void onStop()
  {
    arq localarq = asa.cZ;
    if ((((Boolean)aos.f().a(localarq)).booleanValue()) && (this.c != null) && ((!this.a.isFinishing()) || (this.f == null)))
    {
      zzbv.zzem();
      jt.a(this.c);
    }
    b();
  }
  
  public final void setRequestedOrientation(int paramInt)
  {
    int i1 = this.a.getApplicationInfo().targetSdkVersion;
    arq localarq1 = asa.dn;
    if (i1 >= ((Integer)aos.f().a(localarq1)).intValue())
    {
      int i2 = this.a.getApplicationInfo().targetSdkVersion;
      arq localarq2 = asa.do;
      if (i2 <= ((Integer)aos.f().a(localarq2)).intValue())
      {
        int i3 = Build.VERSION.SDK_INT;
        arq localarq3 = asa.dp;
        if (i3 >= ((Integer)aos.f().a(localarq3)).intValue())
        {
          int i4 = Build.VERSION.SDK_INT;
          arq localarq4 = asa.dq;
          if (i4 <= ((Integer)aos.f().a(localarq4)).intValue()) {
            return;
          }
        }
      }
    }
    this.a.setRequestedOrientation(paramInt);
  }
  
  public final void zza(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    this.i = new FrameLayout(this.a);
    this.i.setBackgroundColor(-16777216);
    this.i.addView(paramView, -1, -1);
    this.a.setContentView(this.i);
    this.r = true;
    this.j = paramCustomViewCallback;
    this.h = true;
  }
  
  public final void zza(boolean paramBoolean1, boolean paramBoolean2)
  {
    arq localarq1 = asa.aR;
    int i1;
    if ((((Boolean)aos.f().a(localarq1)).booleanValue()) && (this.b != null) && (this.b.zzbyw != null) && (this.b.zzbyw.zzzl))
    {
      i1 = 1;
      arq localarq2 = asa.aS;
      if ((!((Boolean)aos.f().a(localarq2)).booleanValue()) || (this.b == null) || (this.b.zzbyw == null) || (!this.b.zzbyw.zzzm)) {
        break label196;
      }
    }
    label196:
    for (int i2 = 1;; i2 = 0)
    {
      if ((paramBoolean1) && (paramBoolean2) && (i1 != 0) && (i2 == 0)) {
        new n(this.c, "useCustomClose").a("Custom close has been disabled for interstitial ads in this ad slot.");
      }
      if (this.g != null)
      {
        zzo localzzo = this.g;
        boolean bool;
        if (i2 == 0)
        {
          bool = false;
          if (paramBoolean2)
          {
            bool = false;
            if (i1 != 0) {}
          }
        }
        else
        {
          bool = true;
        }
        localzzo.zzu(bool);
      }
      return;
      i1 = 0;
      break;
    }
  }
  
  public final void zzax()
  {
    this.r = true;
  }
  
  public final void zznh()
  {
    if ((this.b != null) && (this.h)) {
      setRequestedOrientation(this.b.orientation);
    }
    if (this.i != null)
    {
      this.a.setContentView(this.m);
      this.r = true;
      this.i.removeAllViews();
      this.i = null;
    }
    if (this.j != null)
    {
      this.j.onCustomViewHidden();
      this.j = null;
    }
    this.h = false;
  }
  
  public final void zzni()
  {
    this.d = 1;
    this.a.finish();
  }
  
  public final boolean zznj()
  {
    this.d = 0;
    boolean bool;
    if (this.c == null) {
      bool = true;
    }
    do
    {
      return bool;
      bool = this.c.A();
    } while (bool);
    this.c.a("onbackblocked", Collections.emptyMap());
    return bool;
  }
  
  public final void zznk()
  {
    this.m.removeView(this.g);
    a(true);
  }
  
  public final void zznn()
  {
    if (this.n)
    {
      this.n = false;
      c();
    }
  }
  
  public final void zznp()
  {
    this.m.a = true;
  }
  
  public final void zznq()
  {
    synchronized (this.o)
    {
      this.q = true;
      if (this.p != null)
      {
        jn.a.removeCallbacks(this.p);
        jn.a.post(this.p);
      }
      return;
    }
  }
  
  public final void zzo(com.google.android.gms.a.a parama)
  {
    arq localarq = asa.cY;
    if ((((Boolean)aos.f().a(localarq)).booleanValue()) && (k.k()))
    {
      Configuration localConfiguration = (Configuration)com.google.android.gms.a.b.a(parama);
      zzbv.zzek();
      if (jn.a(this.a, localConfiguration))
      {
        this.a.getWindow().addFlags(1024);
        this.a.getWindow().clearFlags(2048);
      }
    }
    else
    {
      return;
    }
    this.a.getWindow().addFlags(2048);
    this.a.getWindow().clearFlags(1024);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.zzd
 * JD-Core Version:    0.7.0.1
 */