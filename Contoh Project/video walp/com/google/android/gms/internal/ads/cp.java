package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.webkit.CookieManager;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.c;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

@cm
public final class cp
  extends iz
  implements dc
{
  @GuardedBy("mCancelLock")
  kg a;
  private final co b;
  private final dl c;
  private final Object d = new Object();
  private final Context e;
  private final amj f;
  private final amo g;
  private zzaef h;
  private Runnable i;
  private zzaej j;
  private bbu k;
  
  public cp(Context paramContext, dl paramdl, co paramco, amo paramamo)
  {
    this.b = paramco;
    this.e = paramContext;
    this.c = paramdl;
    this.g = paramamo;
    this.f = new amj(this.g);
    this.f.a(new cq(this));
    anl localanl = new anl();
    localanl.a = Integer.valueOf(this.c.j.b);
    localanl.b = Integer.valueOf(this.c.j.c);
    int m;
    zzjn localzzjn;
    if (this.c.j.d)
    {
      m = 0;
      localanl.c = Integer.valueOf(m);
      this.f.a(new cr(localanl));
      if (this.c.f != null) {
        this.f.a(new cs(this));
      }
      localzzjn = this.c.c;
      if ((!localzzjn.d) || (!"interstitial_mb".equals(localzzjn.a))) {
        break label235;
      }
      this.f.a(ct.a);
    }
    for (;;)
    {
      this.f.a(aml.a.b.a);
      return;
      m = 2;
      break;
      label235:
      if ((localzzjn.d) && ("reward_mb".equals(localzzjn.a))) {
        this.f.a(cu.a);
      } else if ((!localzzjn.h) && (!localzzjn.d)) {
        this.f.a(cv.a);
      } else {
        this.f.a(cw.a);
      }
    }
  }
  
  private final zzjn a(zzaef paramzzaef)
  {
    int m = 1;
    if ((this.h != null) && (this.h.V != null) && (this.h.V.size() > m)) {}
    while ((m != 0) && (this.k != null) && (!this.k.t))
    {
      return null;
      m = 0;
    }
    if (this.j.y) {
      for (zzjn localzzjn2 : paramzzaef.d.g) {
        if (localzzjn2.i) {
          return new zzjn(localzzjn2, paramzzaef.d.g);
        }
      }
    }
    if (this.j.l == null) {
      throw new cz("The ad response must specify one of the supported ad sizes.", 0);
    }
    String[] arrayOfString = this.j.l.split("x");
    if (arrayOfString.length != 2)
    {
      String str5 = String.valueOf(this.j.l);
      if (str5.length() != 0) {}
      for (String str6 = "Invalid ad size format from the ad response: ".concat(str5);; str6 = new String("Invalid ad size format from the ad response: ")) {
        throw new cz(str6, 0);
      }
    }
    label439:
    label449:
    String str3;
    try
    {
      n = Integer.parseInt(arrayOfString[0]);
      i1 = Integer.parseInt(arrayOfString[1]);
      arrayOfzzjn1 = paramzzaef.d.g;
      i2 = arrayOfzzjn1.length;
      i3 = 0;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        int n;
        int i1;
        zzjn[] arrayOfzzjn1;
        int i2;
        int i3;
        zzjn localzzjn1;
        float f1;
        String str1 = String.valueOf(this.j.l);
        if (str1.length() != 0) {}
        for (String str2 = "Invalid ad size number from the ad response: ".concat(str1);; str2 = new String("Invalid ad size number from the ad response: ")) {
          throw new cz(str2, 0);
        }
        int i4 = localzzjn1.e;
        continue;
        int i5 = localzzjn1.b;
        continue;
        i3++;
      }
      str3 = String.valueOf(this.j.l);
      if (str3.length() == 0) {
        break label495;
      }
    }
    if (i3 < i2)
    {
      localzzjn1 = arrayOfzzjn1[i3];
      f1 = this.e.getResources().getDisplayMetrics().density;
      if (localzzjn1.e == -1)
      {
        i4 = (int)(localzzjn1.f / f1);
        if (localzzjn1.b != -2) {
          break label439;
        }
        i5 = (int)(localzzjn1.c / f1);
        if ((n != i4) || (i1 != i5) || (localzzjn1.i)) {
          break label449;
        }
        return new zzjn(localzzjn1, paramzzaef.d.g);
      }
    }
    label495:
    for (String str4 = "The ad size from the ad response was not one of the requested sizes: ".concat(str3);; str4 = new String("The ad size from the ad response was not one of the requested sizes: ")) {
      throw new cz(str4, 0);
    }
  }
  
  private final void a(int paramInt, String paramString)
  {
    if ((paramInt == 3) || (paramInt == -1))
    {
      je.d(paramString);
      if (this.j != null) {
        break label100;
      }
      this.j = new zzaej(paramInt);
      label33:
      if (this.h == null) {
        break label122;
      }
    }
    label100:
    label122:
    for (zzaef localzzaef = this.h;; localzzaef = new zzaef(this.c, -1L, null, null, null))
    {
      ik localik = new ik(localzzaef, this.j, this.k, null, paramInt, -1L, this.j.m, null, this.f, null);
      this.b.zza(localik);
      return;
      je.e(paramString);
      break;
      this.j = new zzaej(paramInt, this.j.j);
      break label33;
    }
  }
  
  final kg a(zzang paramzzang, nr<zzaef> paramnr)
  {
    Context localContext = this.e;
    if (new db(localContext).a(paramzzang))
    {
      je.b("Fetching ad response from local ad request service.");
      di localdi = new di(localContext, paramnr, this);
      localdi.c();
      return localdi;
    }
    je.b("Fetching ad response from remote ad request service.");
    aos.a();
    if (!lz.c(localContext))
    {
      je.e("Failed to connect to remote ad request service.");
      return null;
    }
    return new dj(localContext, paramzzang, paramnr, this);
  }
  
  public final void a()
  {
    je.b("AdLoaderBackgroundTask started.");
    this.i = new cx(this);
    Handler localHandler = jn.a;
    Runnable localRunnable = this.i;
    arq localarq1 = asa.bA;
    localHandler.postDelayed(localRunnable, ((Long)aos.f().a(localarq1)).longValue());
    long l = zzbv.zzer().b();
    arq localarq2 = asa.by;
    if ((((Boolean)aos.f().a(localarq2)).booleanValue()) && (this.c.b.c != null))
    {
      String str4 = this.c.b.c.getString("_ad");
      if (str4 != null)
      {
        this.h = new zzaef(this.c, l, null, null, null);
        a(et.a(this.e, this.h, str4));
        return;
      }
    }
    nv localnv = new nv();
    jl.a(new cy(this, localnv));
    String str1 = zzbv.zzfh().h(this.e);
    String str2 = zzbv.zzfh().i(this.e);
    String str3 = zzbv.zzfh().j(this.e);
    zzbv.zzfh().f(this.e, str3);
    this.h = new zzaef(this.c, l, str1, str2, str3);
    localnv.a(this.h);
  }
  
  public final void a(zzaej paramzzaej)
  {
    je.b("Received ad response.");
    this.j = paramzzaej;
    long l = zzbv.zzer().b();
    for (;;)
    {
      synchronized (this.d)
      {
        this.a = null;
        zzbv.zzeo().l().d(this.j.F);
        arq localarq1 = asa.aT;
        if (((Boolean)aos.f().a(localarq1)).booleanValue())
        {
          if (this.j.N) {
            zzbv.zzeo().l().c(this.h.e);
          }
        }
        else {
          try
          {
            if ((this.j.d == -2) || (this.j.d == -3)) {
              break;
            }
            int n = this.j.d;
            throw new cz(66 + "There was a problem getting an ad response. ErrorCode: " + n, this.j.d);
          }
          catch (cz localcz)
          {
            a(localcz.a(), localcz.getMessage());
            jn.a.removeCallbacks(this.i);
            return;
          }
        }
      }
      zzbv.zzeo().l().d(this.h.e);
    }
    if (this.j.d != -3)
    {
      if (TextUtils.isEmpty(this.j.b)) {
        throw new cz("No fill from ad server.", 3);
      }
      zzbv.zzeo().l().a(this.j.t);
      boolean bool = this.j.g;
      if (!bool) {
        break label744;
      }
    }
    for (;;)
    {
      Object localObject3;
      try
      {
        this.k = new bbu(this.j.b);
        zzbv.zzeo().a(this.k.h);
        if (!TextUtils.isEmpty(this.j.G))
        {
          arq localarq2 = asa.cC;
          if (((Boolean)aos.f().a(localarq2)).booleanValue())
          {
            je.b("Received cookie from server. Setting webview cookie in CookieManager.");
            CookieManager localCookieManager = zzbv.zzem().c(this.e);
            if (localCookieManager != null) {
              localCookieManager.setCookie("googleads.g.doubleclick.net", this.j.G);
            }
          }
        }
        if (this.h.d.g == null) {
          break label824;
        }
        zzjn localzzjn2 = a(this.h);
        localzzjn1 = localzzjn2;
        zzbv.zzeo().l().b(this.j.u);
        zzbv.zzeo().l().c(this.j.M);
        if (TextUtils.isEmpty(this.j.q)) {
          break label770;
        }
        int m;
        Boolean localBoolean;
        zzjj localzzjj;
        ik localik;
        String str1;
        str2 = "Could not parse mediation config: ".concat(str1);
      }
      catch (JSONException localJSONException)
      {
        try
        {
          localJSONObject = new JSONObject(this.j.q);
          m = this.j.P;
          localObject3 = null;
          if (m == 2)
          {
            localBoolean = Boolean.valueOf(true);
            localzzjj = this.h.c;
            if (localzzjj.m == null) {
              break label776;
            }
            localBundle1 = localzzjj.m;
            if (localBundle1.getBundle(AdMobAdapter.class.getName()) == null) {
              break label788;
            }
            localObject5 = localBundle1.getBundle(AdMobAdapter.class.getName());
            ((Bundle)localObject5).putBoolean("render_test_label", true);
            localObject3 = localBoolean;
          }
          if (this.j.P == 1) {
            localObject3 = Boolean.valueOf(false);
          }
          if (this.j.P != 0) {
            break label817;
          }
          localObject4 = Boolean.valueOf(lr.a(this.h.c));
          localik = new ik(this.h, this.j, this.k, localzzjn1, -2, l, this.j.m, localJSONObject, this.f, (Boolean)localObject4);
          this.b.zza(localik);
          jn.a.removeCallbacks(this.i);
          return;
        }
        catch (Exception localException)
        {
          je.b("Error parsing the JSON for Active View.", localException);
        }
        localJSONException = localJSONException;
        je.b("Could not parse mediation config.", localJSONException);
        str1 = String.valueOf(this.j.b);
        if (str1.length() == 0) {}
      }
      for (;;)
      {
        throw new cz(str2, 0);
        String str2 = new String("Could not parse mediation config: ");
      }
      label744:
      zzbv.zzeo().a(this.j.I);
      continue;
      label770:
      JSONObject localJSONObject = null;
      continue;
      label776:
      Bundle localBundle1 = new Bundle();
      continue;
      label788:
      Bundle localBundle2 = new Bundle();
      localBundle1.putBundle(AdMobAdapter.class.getName(), localBundle2);
      Object localObject5 = localBundle2;
      continue;
      label817:
      Object localObject4 = localObject3;
      continue;
      label824:
      zzjn localzzjn1 = null;
    }
  }
  
  public final void b_()
  {
    synchronized (this.d)
    {
      if (this.a != null) {
        this.a.b();
      }
      return;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.cp
 * JD-Core Version:    0.7.0.1
 */