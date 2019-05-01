package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAdOptions.Builder;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.common.util.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

@cm
public final class bby
  implements bcc
{
  private final String a;
  private final bck b;
  private final long c;
  private final bbu d;
  private final bbt e;
  private zzjj f;
  private final zzjn g;
  private final Context h;
  private final Object i = new Object();
  private final zzang j;
  private final boolean k;
  private final zzpl l;
  private final List<String> m;
  private final List<String> n;
  private final List<String> o;
  private final boolean p;
  private final boolean q;
  @GuardedBy("mLock")
  private bcn r;
  @GuardedBy("mLock")
  private int s = -2;
  private bct t;
  
  public bby(Context paramContext, String paramString, bck parambck, bbu parambbu, bbt parambbt, zzjj paramzzjj, zzjn paramzzjn, zzang paramzzang, boolean paramBoolean1, boolean paramBoolean2, zzpl paramzzpl, List<String> paramList1, List<String> paramList2, List<String> paramList3, boolean paramBoolean3)
  {
    this.h = paramContext;
    this.b = parambck;
    this.e = parambbt;
    if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(paramString))
    {
      this.a = b();
      this.d = parambbu;
      if (parambbt.t == -1L) {
        break label150;
      }
      this.c = parambbt.t;
    }
    for (;;)
    {
      this.f = paramzzjj;
      this.g = paramzzjn;
      this.j = paramzzang;
      this.k = paramBoolean1;
      this.p = paramBoolean2;
      this.l = paramzzpl;
      this.m = paramList1;
      this.n = paramList2;
      this.o = paramList3;
      this.q = paramBoolean3;
      return;
      this.a = paramString;
      break;
      label150:
      if (parambbu.b != -1L) {
        this.c = parambbu.b;
      } else {
        this.c = 10000L;
      }
    }
  }
  
  private static bcn a(MediationAdapter paramMediationAdapter)
  {
    return new bdi(paramMediationAdapter);
  }
  
  @GuardedBy("mLock")
  private final String a(String paramString)
  {
    if ((paramString == null) || (!e()) || (b(2))) {
      return paramString;
    }
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      localJSONObject.remove("cpm_floor_cents");
      String str = localJSONObject.toString();
      return str;
    }
    catch (JSONException localJSONException)
    {
      je.e("Could not remove field. Returning the original value");
    }
    return paramString;
  }
  
  @GuardedBy("mLock")
  private final void a(bbx parambbx)
  {
    String str1 = a(this.e.k);
    try
    {
      if (this.j.c < 4100000)
      {
        if (this.g.d)
        {
          this.r.a(b.a(this.h), this.f, str1, parambbx);
          return;
        }
        this.r.a(b.a(this.h), this.g, this.f, str1, parambbx);
        return;
      }
    }
    catch (RemoteException localRemoteException)
    {
      je.c("Could not request ad from mediation adapter.", localRemoteException);
      a(5);
      return;
    }
    if ((this.k) || (this.e.b()))
    {
      ArrayList localArrayList = new ArrayList(this.m);
      if (this.n != null)
      {
        Iterator localIterator = this.n.iterator();
        while (localIterator.hasNext())
        {
          String str2 = (String)localIterator.next();
          String str3 = ":false";
          if ((this.o != null) && (this.o.contains(str2))) {
            str3 = ":true";
          }
          localArrayList.add(7 + String.valueOf(str2).length() + String.valueOf(str3).length() + "custom:" + str2 + str3);
        }
      }
      this.r.a(b.a(this.h), this.f, str1, this.e.a, parambbx, this.l, localArrayList);
      return;
    }
    if (this.g.d)
    {
      this.r.a(b.a(this.h), this.f, str1, this.e.a, parambbx);
      return;
    }
    if (this.p)
    {
      if (this.e.o != null)
      {
        this.r.a(b.a(this.h), this.f, str1, this.e.a, parambbx, new zzpl(b(this.e.s)), this.e.r);
        return;
      }
      this.r.a(b.a(this.h), this.g, this.f, str1, this.e.a, parambbx);
      return;
    }
    this.r.a(b.a(this.h), this.g, this.f, str1, this.e.a, parambbx);
  }
  
  private static NativeAdOptions b(String paramString)
  {
    NativeAdOptions.Builder localBuilder = new NativeAdOptions.Builder();
    if (paramString == null) {
      return localBuilder.build();
    }
    for (;;)
    {
      try
      {
        JSONObject localJSONObject = new JSONObject(paramString);
        localBuilder.setRequestMultipleImages(localJSONObject.optBoolean("multiple_images", false));
        localBuilder.setReturnUrlsForImageAssets(localJSONObject.optBoolean("only_urls", false));
        str = localJSONObject.optString("native_image_orientation", "any");
        if (!"landscape".equals(str)) {
          continue;
        }
        i1 = 2;
        localBuilder.setImageOrientation(i1);
      }
      catch (JSONException localJSONException)
      {
        String str;
        int i1;
        boolean bool;
        je.c("Exception occurred when creating native ad options", localJSONException);
        continue;
      }
      return localBuilder.build();
      if ("portrait".equals(str))
      {
        i1 = 1;
      }
      else
      {
        bool = "any".equals(str);
        i1 = 0;
        if (!bool) {
          i1 = -1;
        }
      }
    }
  }
  
  private final String b()
  {
    try
    {
      if (!TextUtils.isEmpty(this.e.e))
      {
        if (this.b.b(this.e.e)) {
          return "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";
        }
        return "com.google.ads.mediation.customevent.CustomEventAdapter";
      }
    }
    catch (RemoteException localRemoteException)
    {
      je.e("Fail to determine the custom event's version, assuming the old one.");
    }
    return "com.google.ads.mediation.customevent.CustomEventAdapter";
  }
  
  @GuardedBy("mLock")
  private final boolean b(int paramInt)
  {
    try
    {
      Object localObject;
      if (this.k)
      {
        Bundle localBundle2 = this.r.l();
        localObject = localBundle2;
      }
      for (;;)
      {
        boolean bool = false;
        if (localObject != null)
        {
          int i1 = paramInt & ((Bundle)localObject).getInt("capabilities", 0);
          bool = false;
          if (i1 == paramInt) {
            bool = true;
          }
        }
        return bool;
        if (this.g.d)
        {
          localObject = this.r.k();
        }
        else
        {
          Bundle localBundle1 = this.r.j();
          localObject = localBundle1;
        }
      }
      return false;
    }
    catch (RemoteException localRemoteException)
    {
      je.e("Could not get adapter info. Returning false");
    }
  }
  
  @GuardedBy("mLock")
  private final bct c()
  {
    if ((this.s != 0) || (!e())) {
      return null;
    }
    try
    {
      if ((b(4)) && (this.t != null) && (this.t.a() != 0))
      {
        bct localbct = this.t;
        return localbct;
      }
    }
    catch (RemoteException localRemoteException)
    {
      je.e("Could not get cpm value from MediationResponseMetadata");
    }
    return new bca(f());
  }
  
  @GuardedBy("mLock")
  private final bcn d()
  {
    String str1 = String.valueOf(this.a);
    if (str1.length() != 0) {}
    for (String str2 = "Instantiating mediation adapter: ".concat(str1);; str2 = new String("Instantiating mediation adapter: "))
    {
      je.d(str2);
      if ((this.k) || (this.e.b())) {
        break label178;
      }
      arq localarq1 = asa.bw;
      if ((!((Boolean)aos.f().a(localarq1)).booleanValue()) || (!"com.google.ads.mediation.admob.AdMobAdapter".equals(this.a))) {
        break;
      }
      return a(new AdMobAdapter());
    }
    arq localarq2 = asa.bx;
    if ((((Boolean)aos.f().a(localarq2)).booleanValue()) && ("com.google.ads.mediation.AdUrlAdapter".equals(this.a))) {
      return a(new AdUrlAdapter());
    }
    if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(this.a)) {
      return new bdi(new zzzv());
    }
    label178:
    String str3;
    try
    {
      bcn localbcn = this.b.a(this.a);
      return localbcn;
    }
    catch (RemoteException localRemoteException)
    {
      str3 = String.valueOf(this.a);
      if (str3.length() == 0) {}
    }
    for (String str4 = "Could not instantiate mediation adapter: ".concat(str3);; str4 = new String("Could not instantiate mediation adapter: "))
    {
      je.a(str4, localRemoteException);
      return null;
    }
  }
  
  private final boolean e()
  {
    return this.d.m != -1;
  }
  
  @GuardedBy("mLock")
  private final int f()
  {
    int i1;
    if (this.e.k == null) {
      i1 = 0;
    }
    for (;;)
    {
      return i1;
      JSONObject localJSONObject;
      try
      {
        localJSONObject = new JSONObject(this.e.k);
        if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.a)) {
          return localJSONObject.optInt("cpm_cents", 0);
        }
      }
      catch (JSONException localJSONException)
      {
        je.e("Could not convert to json. Returning 0");
        return 0;
      }
      if (b(2)) {}
      for (i1 = localJSONObject.optInt("cpm_floor_cents", 0); i1 == 0; i1 = 0) {
        return localJSONObject.optInt("penalized_average_cpm_cents", 0);
      }
    }
  }
  
  public final bcb a(long paramLong1, long paramLong2)
  {
    for (;;)
    {
      long l4;
      long l5;
      synchronized (this.i)
      {
        long l1 = SystemClock.elapsedRealtime();
        bbx localbbx = new bbx();
        jn.a.post(new bbz(this, localbbx));
        long l2 = this.c;
        if (this.s != -2)
        {
          long l6 = zzbv.zzer().b() - l1;
          bcb localbcb = new bcb(this.e, this.r, this.a, localbbx, this.s, c(), l6);
          return localbcb;
        }
        long l3 = SystemClock.elapsedRealtime();
        l4 = l2 - (l3 - l1);
        l5 = paramLong2 - (l3 - paramLong1);
        if ((l4 <= 0L) || (l5 <= 0L))
        {
          je.d("Timed out waiting for adapter.");
          this.s = 3;
        }
      }
      try
      {
        this.i.wait(Math.min(l4, l5));
      }
      catch (InterruptedException localInterruptedException)
      {
        this.s = 5;
      }
    }
  }
  
  public final void a()
  {
    synchronized (this.i)
    {
      try
      {
        if (this.r != null) {
          this.r.c();
        }
        this.s = -1;
        this.i.notify();
        return;
      }
      catch (RemoteException localRemoteException)
      {
        for (;;)
        {
          je.c("Could not destroy mediation adapter.", localRemoteException);
        }
      }
    }
  }
  
  public final void a(int paramInt)
  {
    synchronized (this.i)
    {
      this.s = paramInt;
      this.i.notify();
      return;
    }
  }
  
  public final void a(int paramInt, bct parambct)
  {
    synchronized (this.i)
    {
      this.s = 0;
      this.t = parambct;
      this.i.notify();
      return;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bby
 * JD-Core Version:    0.7.0.1
 */