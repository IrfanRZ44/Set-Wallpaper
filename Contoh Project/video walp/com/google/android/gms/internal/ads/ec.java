package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.internal.gmsg.HttpClient;
import com.google.android.gms.ads.internal.gmsg.zzaa;
import com.google.android.gms.ads.internal.gmsg.zzv;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.g;
import com.google.android.gms.common.h;
import com.google.android.gms.common.util.c;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

@cm
public final class ec
  extends iz
{
  private static final long a = TimeUnit.SECONDS.toMillis(10L);
  private static final Object b = new Object();
  @GuardedBy("sLock")
  private static boolean c = false;
  private static baa d = null;
  private static HttpClient e = null;
  private static zzaa f = null;
  private static zzv<Object> g = null;
  private final co h;
  private final dl i;
  private final Object j = new Object();
  private final Context k;
  private ban l;
  private amo m;
  
  public ec(Context paramContext, dl paramdl, co paramco, amo paramamo)
  {
    super(true);
    this.h = paramco;
    this.k = paramContext;
    this.i = paramdl;
    this.m = paramamo;
    synchronized (b)
    {
      if (!c)
      {
        f = new zzaa();
        e = new HttpClient(paramContext.getApplicationContext(), paramdl.j);
        g = new ek();
        Context localContext = this.k.getApplicationContext();
        zzang localzzang = this.i.j;
        arq localarq = asa.a;
        d = new baa(localContext, localzzang, (String)aos.f().a(localarq), new ej(), new ei());
        c = true;
      }
      return;
    }
  }
  
  private final zzaej a(zzaef paramzzaef)
  {
    zzbv.zzek();
    String str = jn.a();
    JSONObject localJSONObject1 = a(paramzzaef, str);
    zzaej localzzaej;
    if (localJSONObject1 == null) {
      localzzaej = new zzaej(0);
    }
    for (;;)
    {
      return localzzaej;
      long l1 = zzbv.zzer().b();
      Future localFuture = f.zzas(str);
      lz.a.post(new ee(this, localJSONObject1, str));
      long l2 = a - (zzbv.zzer().b() - l1);
      try
      {
        localJSONObject2 = (JSONObject)localFuture.get(l2, TimeUnit.MILLISECONDS);
        if (localJSONObject2 == null) {
          return new zzaej(-1);
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        return new zzaej(-1);
      }
      catch (TimeoutException localTimeoutException)
      {
        return new zzaej(2);
      }
      catch (ExecutionException localExecutionException)
      {
        JSONObject localJSONObject2;
        return new zzaej(0);
        localzzaej = et.a(this.k, paramzzaef, localJSONObject2.toString());
        if ((localzzaej.d == -3) || (!TextUtils.isEmpty(localzzaej.b))) {
          continue;
        }
        return new zzaej(3);
      }
      catch (CancellationException localCancellationException)
      {
        label121:
        break label121;
      }
    }
  }
  
  private final JSONObject a(zzaef paramzzaef, String paramString)
  {
    Bundle localBundle = paramzzaef.c.c.getBundle("sdk_less_server_data");
    if (localBundle == null) {}
    for (;;)
    {
      return null;
      try
      {
        localfc = (fc)zzbv.zzev().a(this.k).get();
        Context localContext = this.k;
        em localem = new em();
        localem.j = paramzzaef;
        localem.k = localfc;
        JSONObject localJSONObject1 = et.a(localContext, localem);
        if (localJSONObject1 == null) {
          continue;
        }
        try
        {
          AdvertisingIdClient.Info localInfo2 = AdvertisingIdClient.getAdvertisingIdInfo(this.k);
          localInfo1 = localInfo2;
        }
        catch (g localg)
        {
          for (;;)
          {
            HashMap localHashMap;
            JSONObject localJSONObject2;
            je.c("Cannot get advertising id info", localg);
            AdvertisingIdClient.Info localInfo1 = null;
            continue;
            int n = 0;
          }
        }
        catch (h localh)
        {
          break label209;
        }
        catch (IllegalStateException localIllegalStateException)
        {
          break label209;
        }
        catch (IOException localIOException)
        {
          break label209;
        }
        localHashMap = new HashMap();
        localHashMap.put("request_id", paramString);
        localHashMap.put("request_param", localJSONObject1);
        localHashMap.put("data", localBundle);
        if (localInfo1 != null)
        {
          localHashMap.put("adid", localInfo1.getId());
          if (!localInfo1.isLimitAdTrackingEnabled()) {
            break label223;
          }
          n = 1;
          localHashMap.put("lat", Integer.valueOf(n));
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          try
          {
            localJSONObject2 = zzbv.zzek().a(localHashMap);
            return localJSONObject2;
          }
          catch (JSONException localJSONException)
          {
            fc localfc;
            return null;
          }
          localException = localException;
          je.c("Error grabbing device info: ", localException);
          localfc = null;
        }
      }
    }
  }
  
  protected static void a(azo paramazo)
  {
    paramazo.a("/loadAd", f);
    paramazo.a("/fetchHttpRequest", e);
    paramazo.a("/invalidRequest", g);
  }
  
  protected static void b(azo paramazo)
  {
    paramazo.b("/loadAd", f);
    paramazo.b("/fetchHttpRequest", e);
    paramazo.b("/invalidRequest", g);
  }
  
  public final void a()
  {
    je.b("SdkLessAdLoaderBackgroundTask started.");
    String str = zzbv.zzfh().j(this.k);
    zzaef localzzaef = new zzaef(this.i, -1L, zzbv.zzfh().h(this.k), zzbv.zzfh().i(this.k), str);
    zzbv.zzfh().f(this.k, str);
    zzaej localzzaej = a(localzzaef);
    long l1 = zzbv.zzer().b();
    ik localik = new ik(localzzaef, localzzaej, null, null, localzzaej.d, l1, localzzaej.m, null, this.m);
    lz.a.post(new ed(this, localik));
  }
  
  public final void b_()
  {
    synchronized (this.j)
    {
      lz.a.post(new eh(this));
      return;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ec
 * JD-Core Version:    0.7.0.1
 */