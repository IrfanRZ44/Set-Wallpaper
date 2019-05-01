package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@cm
public final class ay
  implements Callable<ij>
{
  private static long a = 10L;
  private final Context b;
  private final kx c;
  private final zzbc d;
  private final agw e;
  private final bq f;
  private final Object g = new Object();
  private final ik h;
  private final asn i;
  private boolean j;
  private int k;
  private List<String> l;
  private JSONObject m;
  private String n;
  private String o;
  
  public ay(Context paramContext, zzbc paramzzbc, kx paramkx, agw paramagw, ik paramik, asn paramasn)
  {
    this.b = paramContext;
    this.d = paramzzbc;
    this.c = paramkx;
    this.h = paramik;
    this.e = paramagw;
    this.i = paramasn;
    this.f = paramzzbc.zzdr();
    this.j = false;
    this.k = -2;
    this.l = null;
    this.n = null;
    this.o = null;
  }
  
  private final ij a()
  {
    try
    {
      str1 = this.d.getUuid();
      if (b()) {
        break label897;
      }
      localJSONObject1 = new JSONObject(this.h.b.b);
      JSONObject localJSONObject2 = new JSONObject(this.h.b.b);
      if (localJSONObject2.length() == 0) {
        break label97;
      }
      JSONArray localJSONArray2 = localJSONObject2.optJSONArray("ads");
      if (localJSONArray2 == null) {
        break label891;
      }
      localJSONObject7 = localJSONArray2.optJSONObject(0);
    }
    catch (CancellationException localCancellationException)
    {
      String str1;
      JSONObject localJSONObject1;
      JSONObject localJSONObject3;
      boolean bool1;
      Object localObject1;
      String str4;
      String str5;
      je.c("Malformed native JSON response.", localCancellationException);
      if (this.j) {
        break label642;
      }
      a(0);
      return a(null, false);
      a(0);
      break label915;
      JSONObject localJSONObject5 = localJSONObject4.getJSONObject("tracking_urls_and_actions");
      JSONArray localJSONArray1 = localJSONObject5.optJSONArray("impression_tracking_urls");
      if (localJSONArray1 != null) {
        break label794;
      }
      arrayOfString = null;
      break label925;
      for (;;)
      {
        this.l = localObject4;
        this.m = localJSONObject5.optJSONObject("active_view");
        this.n = localJSONObject4.optString("debug_signals");
        this.o = localJSONObject4.optString("omid_settings");
        att localatt = ((bh)localObject2).a(this, localJSONObject4);
        localatt.a(new atv(this.b, this.d, this.f, this.e, localJSONObject4, localatt, this.h.a.k, str1));
        localObject3 = localatt;
        break;
        arrayOfString = new String[localJSONArray1.length()];
        for (int i1 = 0; i1 < localJSONArray1.length(); i1++) {
          arrayOfString[i1] = localJSONArray1.getString(i1);
        }
        List localList = Arrays.asList(arrayOfString);
        localObject4 = localList;
      }
    }
    catch (TimeoutException localTimeoutException)
    {
      for (;;)
      {
        je.c("Timeout when loading native ad.", localTimeoutException);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        je.c("Error occured while doing native ads initialization.", localException);
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      break label623;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        continue;
        Object localObject2 = null;
        continue;
        Object localObject3 = null;
        continue;
        JSONObject localJSONObject7 = null;
        continue;
        JSONObject localJSONObject4 = null;
        continue;
        boolean bool2 = false;
        continue;
        boolean bool3 = false;
        continue;
        localObject2 = null;
      }
    }
    catch (ExecutionException localExecutionException)
    {
      for (;;)
      {
        label97:
        label359:
        label623:
        String[] arrayOfString;
        label568:
        Object localObject4;
        label642:
        label649:
        label657:
        label794:
        label879:
        label885:
        label891:
        continue;
        label897:
        label903:
        label909:
        label915:
        label925:
        if (arrayOfString == null) {
          localObject4 = null;
        }
      }
    }
    if ((localJSONObject7 == null) || (localJSONObject7.length() == 0)) {
      a(3);
    }
    localJSONObject3 = (JSONObject)this.f.a(localJSONObject1).get(a, TimeUnit.SECONDS);
    if (localJSONObject3.optBoolean("success", false))
    {
      localJSONObject4 = localJSONObject3.getJSONObject("json").optJSONArray("ads").getJSONObject(0);
      bool1 = localJSONObject4.optBoolean("enable_omid");
      if (!bool1)
      {
        localObject1 = mt.a(null);
        if (b()) {
          break label879;
        }
        if (localJSONObject4 != null) {
          break label359;
        }
        break label879;
      }
      for (;;)
      {
        if ((b()) || (localObject2 == null)) {
          break label885;
        }
        if (localJSONObject4 != null) {
          break label657;
        }
        break label885;
        if ((localObject3 instanceof atj))
        {
          bc localbc = new bc(this, (atj)localObject3);
          this.f.a("/nativeAdCustomClick", localbc);
        }
        ij localij = a((att)localObject3, bool1);
        this.d.zzg(b((ne)localObject1));
        return localij;
        JSONObject localJSONObject6 = localJSONObject4.optJSONObject("omid_settings");
        if (localJSONObject6 == null)
        {
          localObject1 = mt.a(null);
          break;
        }
        String str6 = localJSONObject6.optString("omid_html");
        if (TextUtils.isEmpty(str6))
        {
          localObject1 = mt.a(null);
          break;
        }
        np localnp2 = new np();
        nk.a.execute(new az(this, localnp2, str6));
        localObject1 = localnp2;
        break;
        String str2 = localJSONObject4.getString("template_id");
        if (this.h.a.y == null) {
          break label903;
        }
        bool2 = this.h.a.y.b;
        if (this.h.a.y == null) {
          break label909;
        }
        bool3 = this.h.a.y.d;
        if ("2".equals(str2))
        {
          localObject2 = new br(bool2, bool3, this.h.j);
        }
        else if ("1".equals(str2))
        {
          localObject2 = new bs(bool2, bool3, this.h.j);
        }
        else
        {
          if (!"3".equals(str2)) {
            break label649;
          }
          String str3 = localJSONObject4.getString("custom_template_id");
          np localnp1 = new np();
          jn.a.post(new bb(this, localnp1, str3));
          if (localnp1.get(a, TimeUnit.SECONDS) == null) {
            break label568;
          }
          localObject2 = new bt(bool2);
        }
      }
      str4 = String.valueOf(localJSONObject4.getString("custom_template_id"));
      if (str4.length() != 0) {}
      for (str5 = "No handler for custom template: ".concat(str4);; str5 = new String("No handler for custom template: "))
      {
        je.c(str5);
        break;
      }
    }
  }
  
  private final ij a(att paramatt, boolean paramBoolean)
  {
    for (;;)
    {
      synchronized (this.g)
      {
        int i1 = this.k;
        if ((paramatt == null) && (this.k == -2)) {
          i1 = 0;
        }
        if (i1 != -2)
        {
          localatt = null;
          return new ij(this.h.a.c, null, this.h.b.c, i1, this.h.b.e, this.l, this.h.b.k, this.h.b.j, this.h.a.i, false, null, null, null, null, null, 0L, this.h.d, this.h.b.f, this.h.f, this.h.g, this.h.b.n, this.m, localatt, null, null, null, this.h.b.D, this.h.b.E, null, this.h.b.H, this.n, this.h.i, this.h.b.O, this.h.j, paramBoolean, this.h.b.R, this.h.b.S, this.o);
        }
      }
      att localatt = paramatt;
    }
  }
  
  private final ne<ate> a(JSONObject paramJSONObject, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1) {}
    double d1;
    boolean bool;
    for (String str = paramJSONObject.getString("url");; str = paramJSONObject.optString("url"))
    {
      d1 = paramJSONObject.optDouble("scale", 1.0D);
      bool = paramJSONObject.optBoolean("is_transparent", true);
      if (!TextUtils.isEmpty(str)) {
        break;
      }
      a(0, paramBoolean1);
      return mt.a(null);
    }
    if (paramBoolean2) {
      return mt.a(new ate(null, Uri.parse(str), d1));
    }
    return this.c.a(str, new bf(this, paramBoolean1, d1, bool, str));
  }
  
  static qe a(ne<qe> paramne)
  {
    try
    {
      arq localarq = asa.cc;
      qe localqe = (qe)paramne.get(((Integer)aos.f().a(localarq)).intValue(), TimeUnit.SECONDS);
      return localqe;
    }
    catch (InterruptedException localInterruptedException)
    {
      je.c("InterruptedException occurred while waiting for video to load", localInterruptedException);
      Thread.currentThread().interrupt();
      return null;
    }
    catch (ExecutionException localExecutionException)
    {
      for (;;)
      {
        je.c("Exception occurred while waiting for video to load", localExecutionException);
      }
    }
    catch (CancellationException localCancellationException)
    {
      break label52;
    }
    catch (TimeoutException localTimeoutException)
    {
      label52:
      break label52;
    }
  }
  
  private final void a(int paramInt)
  {
    synchronized (this.g)
    {
      this.j = true;
      this.k = paramInt;
      return;
    }
  }
  
  private final void a(avk paramavk, String paramString)
  {
    try
    {
      avv localavv = this.d.zzr(paramavk.l());
      if (localavv != null) {
        localavv.a(paramavk, paramString);
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      je.c(40 + String.valueOf(paramString).length() + "Failed to call onCustomClick for asset " + paramString + ".", localRemoteException);
    }
  }
  
  private static qe b(ne<qe> paramne)
  {
    try
    {
      arq localarq = asa.cd;
      qe localqe = (qe)paramne.get(((Integer)aos.f().a(localarq)).intValue(), TimeUnit.MILLISECONDS);
      return localqe;
    }
    catch (InterruptedException localInterruptedException)
    {
      mk.c("", localInterruptedException);
      Thread.currentThread().interrupt();
      return null;
    }
    catch (ExecutionException localExecutionException)
    {
      for (;;)
      {
        mk.c("", localExecutionException);
      }
    }
    catch (CancellationException localCancellationException)
    {
      break label52;
    }
    catch (TimeoutException localTimeoutException)
    {
      label52:
      break label52;
    }
  }
  
  private static Integer b(JSONObject paramJSONObject, String paramString)
  {
    try
    {
      JSONObject localJSONObject = paramJSONObject.getJSONObject(paramString);
      Integer localInteger = Integer.valueOf(Color.rgb(localJSONObject.getInt("r"), localJSONObject.getInt("g"), localJSONObject.getInt("b")));
      return localInteger;
    }
    catch (JSONException localJSONException) {}
    return null;
  }
  
  private static <V> List<V> b(List<ne<V>> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = ((ne)localIterator.next()).get();
      if (localObject != null) {
        localArrayList.add(localObject);
      }
    }
    return localArrayList;
  }
  
  private final boolean b()
  {
    synchronized (this.g)
    {
      boolean bool = this.j;
      return bool;
    }
  }
  
  public final ne<ata> a(JSONObject paramJSONObject)
  {
    JSONObject localJSONObject = paramJSONObject.optJSONObject("attribution");
    if (localJSONObject == null) {
      return mt.a(null);
    }
    String str = localJSONObject.optString("text");
    int i1 = localJSONObject.optInt("text_size", -1);
    Integer localInteger1 = b(localJSONObject, "text_color");
    Integer localInteger2 = b(localJSONObject, "bg_color");
    int i2 = localJSONObject.optInt("animation_ms", 1000);
    int i3 = localJSONObject.optInt("presentation_ms", 4000);
    int i4;
    boolean bool;
    ArrayList localArrayList;
    if ((this.h.a.y != null) && (this.h.a.y.a >= 2))
    {
      i4 = this.h.a.y.e;
      bool = localJSONObject.optBoolean("allow_pub_rendering");
      localArrayList = new ArrayList();
      if (localJSONObject.optJSONArray("images") == null) {
        break label252;
      }
    }
    np localnp;
    for (Object localObject = a(localJSONObject, "images", false, false, true);; localObject = localArrayList)
    {
      localnp = new np();
      int i5 = ((List)localObject).size();
      AtomicInteger localAtomicInteger = new AtomicInteger(0);
      Iterator localIterator = ((List)localObject).iterator();
      while (localIterator.hasNext()) {
        ((ne)localIterator.next()).a(new bg(localAtomicInteger, i5, localnp, (List)localObject), jl.a);
      }
      i4 = 1;
      break;
      label252:
      localArrayList.add(a(localJSONObject, "image", false, false));
    }
    return mt.a(localnp, new be(this, str, localInteger2, localInteger1, i1, i3, i2, i4, bool), jl.a);
  }
  
  public final ne<qe> a(JSONObject paramJSONObject, String paramString)
  {
    JSONObject localJSONObject = paramJSONObject.optJSONObject(paramString);
    if (localJSONObject == null) {
      return mt.a(null);
    }
    if (TextUtils.isEmpty(localJSONObject.optString("vast_xml")))
    {
      je.e("Required field 'vast_xml' is missing");
      return mt.a(null);
    }
    bi localbi = new bi(this.b, this.e, this.h, this.i, this.d);
    np localnp = new np();
    nk.a.execute(new bj(localbi, localJSONObject, localnp));
    return localnp;
  }
  
  public final ne<ate> a(JSONObject paramJSONObject, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1) {}
    for (JSONObject localJSONObject = paramJSONObject.getJSONObject(paramString);; localJSONObject = paramJSONObject.optJSONObject(paramString))
    {
      if (localJSONObject == null) {
        localJSONObject = new JSONObject();
      }
      return a(localJSONObject, paramBoolean1, paramBoolean2);
    }
  }
  
  public final List<ne<ate>> a(JSONObject paramJSONObject, String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    JSONArray localJSONArray = paramJSONObject.optJSONArray(paramString);
    ArrayList localArrayList = new ArrayList();
    if ((localJSONArray == null) || (localJSONArray.length() == 0))
    {
      a(0, false);
      return localArrayList;
    }
    if (paramBoolean3) {}
    for (int i1 = localJSONArray.length();; i1 = 1) {
      for (int i2 = 0; i2 < i1; i2++)
      {
        JSONObject localJSONObject = localJSONArray.getJSONObject(i2);
        if (localJSONObject == null) {
          localJSONObject = new JSONObject();
        }
        localArrayList.add(a(localJSONObject, false, paramBoolean2));
      }
    }
    return localArrayList;
  }
  
  public final Future<ate> a(JSONObject paramJSONObject, String paramString, boolean paramBoolean)
  {
    JSONObject localJSONObject = paramJSONObject.getJSONObject(paramString);
    boolean bool = localJSONObject.optBoolean("require", true);
    if (localJSONObject == null) {
      localJSONObject = new JSONObject();
    }
    return a(localJSONObject, bool, paramBoolean);
  }
  
  public final void a(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean) {
      a(paramInt);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ay
 * JD-Core Version:    0.7.0.1
 */