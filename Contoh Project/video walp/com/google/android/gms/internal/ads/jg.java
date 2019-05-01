package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.security.NetworkSecurityPolicy;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.c;
import com.google.android.gms.common.util.k;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@cm
public final class jg
{
  @Nullable
  @GuardedBy("mLock")
  SharedPreferences.Editor a;
  private final Object b = new Object();
  private ne<?> c;
  private CopyOnWriteArraySet<jk> d = new CopyOnWriteArraySet();
  @Nullable
  @GuardedBy("mLock")
  private SharedPreferences e;
  @GuardedBy("mLock")
  private boolean f = false;
  @GuardedBy("mLock")
  private boolean g = true;
  @Nullable
  @GuardedBy("mLock")
  private String h;
  @Nullable
  @GuardedBy("mLock")
  private String i;
  @GuardedBy("mLock")
  private boolean j = false;
  @GuardedBy("mLock")
  private String k = "";
  @GuardedBy("mLock")
  private long l = 0L;
  @GuardedBy("mLock")
  private long m = 0L;
  @GuardedBy("mLock")
  private long n = 0L;
  @GuardedBy("mLock")
  private int o = -1;
  @GuardedBy("mLock")
  private int p = 0;
  @GuardedBy("mLock")
  private Set<String> q = Collections.emptySet();
  @GuardedBy("mLock")
  private JSONObject r = new JSONObject();
  @GuardedBy("mLock")
  private boolean s = true;
  @GuardedBy("mLock")
  private boolean t = true;
  
  private final void a(Bundle paramBundle)
  {
    new ji(this, paramBundle).c();
  }
  
  @TargetApi(23)
  private static boolean n()
  {
    return (k.j()) && (!NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted());
  }
  
  private final void o()
  {
    if (this.c == null) {}
    while (this.c.isDone()) {
      return;
    }
    try
    {
      this.c.get(1L, TimeUnit.SECONDS);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      Thread.currentThread().interrupt();
      je.c("Interrupted while waiting for preferences loaded.", localInterruptedException);
      return;
    }
    catch (ExecutionException localExecutionException)
    {
      je.b("Fail to initialize AdSharedPreferenceManager.", localExecutionException);
      return;
    }
    catch (CancellationException localCancellationException)
    {
      break label50;
    }
    catch (TimeoutException localTimeoutException)
    {
      label50:
      break label50;
    }
  }
  
  private final Bundle p()
  {
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("listener_registration_bundle", true);
    synchronized (this.b)
    {
      localBundle.putBoolean("use_https", this.g);
      localBundle.putBoolean("content_url_opted_out", this.s);
      localBundle.putBoolean("content_vertical_opted_out", this.t);
      localBundle.putBoolean("auto_collect_location", this.j);
      localBundle.putInt("version_code", this.p);
      localBundle.putStringArray("never_pool_slots", (String[])this.q.toArray(new String[this.q.size()]));
      localBundle.putString("app_settings_json", this.k);
      localBundle.putLong("app_settings_last_update_ms", this.l);
      localBundle.putLong("app_last_background_time_ms", this.m);
      localBundle.putInt("request_in_session_count", this.o);
      localBundle.putLong("first_ad_req_time_ms", this.n);
      localBundle.putString("native_advanced_settings", this.r.toString());
      if (this.h != null) {
        localBundle.putString("content_url_hashes", this.h);
      }
      if (this.i != null) {
        localBundle.putString("content_vertical_hashes", this.i);
      }
      return localBundle;
    }
  }
  
  public final void a(int paramInt)
  {
    o();
    synchronized (this.b)
    {
      if (this.p == paramInt) {
        return;
      }
      this.p = paramInt;
      if (this.a != null)
      {
        this.a.putInt("version_code", paramInt);
        this.a.apply();
      }
      Bundle localBundle = new Bundle();
      localBundle.putInt("version_code", paramInt);
      a(localBundle);
      return;
    }
  }
  
  public final void a(long paramLong)
  {
    o();
    synchronized (this.b)
    {
      if (this.m == paramLong) {
        return;
      }
      this.m = paramLong;
      if (this.a != null)
      {
        this.a.putLong("app_last_background_time_ms", paramLong);
        this.a.apply();
      }
      Bundle localBundle = new Bundle();
      localBundle.putLong("app_last_background_time_ms", paramLong);
      a(localBundle);
      return;
    }
  }
  
  public final void a(Context paramContext)
  {
    if (paramContext.getApplicationContext() == null) {}
    for (;;)
    {
      this.c = ((ne)new jh(this, paramContext).c());
      return;
      paramContext = paramContext.getApplicationContext();
    }
  }
  
  public final void a(jk paramjk)
  {
    synchronized (this.b)
    {
      if ((this.c != null) && (this.c.isDone())) {
        paramjk.a(p());
      }
      this.d.add(paramjk);
      return;
    }
  }
  
  public final void a(@Nullable String paramString)
  {
    o();
    Object localObject1 = this.b;
    if (paramString != null) {}
    try
    {
      if (paramString.equals(this.h)) {
        return;
      }
      this.h = paramString;
      if (this.a != null)
      {
        this.a.putString("content_url_hashes", paramString);
        this.a.apply();
      }
      Bundle localBundle = new Bundle();
      localBundle.putString("content_url_hashes", paramString);
      a(localBundle);
      return;
    }
    finally {}
  }
  
  public final void a(String paramString1, String paramString2, boolean paramBoolean)
  {
    int i1 = 0;
    o();
    for (;;)
    {
      JSONArray localJSONArray1;
      int i2;
      synchronized (this.b)
      {
        localJSONArray1 = this.r.optJSONArray(paramString1);
        if (localJSONArray1 != null) {
          break label278;
        }
        localJSONArray2 = new JSONArray();
        i2 = localJSONArray2.length();
        if (i1 >= localJSONArray2.length()) {
          break label126;
        }
        JSONObject localJSONObject2 = localJSONArray2.optJSONObject(i1);
        if (localJSONObject2 == null) {
          return;
        }
        if (paramString2.equals(localJSONObject2.optString("template_id")))
        {
          if ((paramBoolean != true) || (localJSONObject2.optBoolean("uses_media_view", false) != paramBoolean)) {
            break label130;
          }
          return;
        }
      }
      i1++;
      continue;
      label126:
      i1 = i2;
      try
      {
        label130:
        JSONObject localJSONObject1 = new JSONObject();
        localJSONObject1.put("template_id", paramString2);
        localJSONObject1.put("uses_media_view", paramBoolean);
        localJSONObject1.put("timestamp_ms", zzbv.zzer().a());
        localJSONArray2.put(i1, localJSONObject1);
        this.r.put(paramString1, localJSONArray2);
        if (this.a != null)
        {
          this.a.putString("native_advanced_settings", this.r.toString());
          this.a.apply();
        }
        Bundle localBundle = new Bundle();
        localBundle.putString("native_advanced_settings", this.r.toString());
        a(localBundle);
        return;
      }
      catch (JSONException localJSONException)
      {
        for (;;)
        {
          je.c("Could not update native advanced settings", localJSONException);
        }
      }
      label278:
      JSONArray localJSONArray2 = localJSONArray1;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    o();
    synchronized (this.b)
    {
      if (this.g == paramBoolean) {
        return;
      }
      this.g = paramBoolean;
      if (this.a != null)
      {
        this.a.putBoolean("use_https", paramBoolean);
        this.a.apply();
      }
      if (!this.f)
      {
        Bundle localBundle = new Bundle();
        localBundle.putBoolean("use_https", paramBoolean);
        a(localBundle);
      }
      return;
    }
  }
  
  public final boolean a()
  {
    o();
    for (;;)
    {
      synchronized (this.b)
      {
        if (!this.g)
        {
          if (!this.f) {
            break label42;
          }
          break label37;
          return bool;
        }
      }
      label37:
      boolean bool = true;
      continue;
      label42:
      bool = false;
    }
  }
  
  public final void b(int paramInt)
  {
    o();
    synchronized (this.b)
    {
      if (this.o == paramInt) {
        return;
      }
      this.o = paramInt;
      if (this.a != null)
      {
        this.a.putInt("request_in_session_count", paramInt);
        this.a.apply();
      }
      Bundle localBundle = new Bundle();
      localBundle.putInt("request_in_session_count", paramInt);
      a(localBundle);
      return;
    }
  }
  
  public final void b(long paramLong)
  {
    o();
    synchronized (this.b)
    {
      if (this.n == paramLong) {
        return;
      }
      this.n = paramLong;
      if (this.a != null)
      {
        this.a.putLong("first_ad_req_time_ms", paramLong);
        this.a.apply();
      }
      Bundle localBundle = new Bundle();
      localBundle.putLong("first_ad_req_time_ms", paramLong);
      a(localBundle);
      return;
    }
  }
  
  public final void b(@Nullable String paramString)
  {
    o();
    Object localObject1 = this.b;
    if (paramString != null) {}
    try
    {
      if (paramString.equals(this.i)) {
        return;
      }
      this.i = paramString;
      if (this.a != null)
      {
        this.a.putString("content_vertical_hashes", paramString);
        this.a.apply();
      }
      Bundle localBundle = new Bundle();
      localBundle.putString("content_vertical_hashes", paramString);
      a(localBundle);
      return;
    }
    finally {}
  }
  
  public final void b(boolean paramBoolean)
  {
    o();
    synchronized (this.b)
    {
      if (this.s == paramBoolean) {
        return;
      }
      this.s = paramBoolean;
      if (this.a != null)
      {
        this.a.putBoolean("content_url_opted_out", paramBoolean);
        this.a.apply();
      }
      Bundle localBundle = new Bundle();
      localBundle.putBoolean("content_url_opted_out", this.s);
      localBundle.putBoolean("content_vertical_opted_out", this.t);
      a(localBundle);
      return;
    }
  }
  
  public final boolean b()
  {
    o();
    synchronized (this.b)
    {
      boolean bool = this.s;
      return bool;
    }
  }
  
  @Nullable
  public final String c()
  {
    o();
    synchronized (this.b)
    {
      String str = this.h;
      return str;
    }
  }
  
  public final void c(String paramString)
  {
    o();
    synchronized (this.b)
    {
      if (this.q.contains(paramString)) {
        return;
      }
      this.q.add(paramString);
      if (this.a != null)
      {
        this.a.putStringSet("never_pool_slots", this.q);
        this.a.apply();
      }
      Bundle localBundle = new Bundle();
      localBundle.putStringArray("never_pool_slots", (String[])this.q.toArray(new String[this.q.size()]));
      a(localBundle);
      return;
    }
  }
  
  public final void c(boolean paramBoolean)
  {
    o();
    synchronized (this.b)
    {
      if (this.t == paramBoolean) {
        return;
      }
      this.t = paramBoolean;
      if (this.a != null)
      {
        this.a.putBoolean("content_vertical_opted_out", paramBoolean);
        this.a.apply();
      }
      Bundle localBundle = new Bundle();
      localBundle.putBoolean("content_url_opted_out", this.s);
      localBundle.putBoolean("content_vertical_opted_out", this.t);
      a(localBundle);
      return;
    }
  }
  
  public final void d(String paramString)
  {
    o();
    synchronized (this.b)
    {
      if (!this.q.contains(paramString)) {
        return;
      }
      this.q.remove(paramString);
      if (this.a != null)
      {
        this.a.putStringSet("never_pool_slots", this.q);
        this.a.apply();
      }
      Bundle localBundle = new Bundle();
      localBundle.putStringArray("never_pool_slots", (String[])this.q.toArray(new String[this.q.size()]));
      a(localBundle);
      return;
    }
  }
  
  public final void d(boolean paramBoolean)
  {
    o();
    synchronized (this.b)
    {
      if (this.j == paramBoolean) {
        return;
      }
      this.j = paramBoolean;
      if (this.a != null)
      {
        this.a.putBoolean("auto_collect_location", paramBoolean);
        this.a.apply();
      }
      Bundle localBundle = new Bundle();
      localBundle.putBoolean("auto_collect_location", paramBoolean);
      a(localBundle);
      return;
    }
  }
  
  public final boolean d()
  {
    o();
    synchronized (this.b)
    {
      boolean bool = this.t;
      return bool;
    }
  }
  
  @Nullable
  public final String e()
  {
    o();
    synchronized (this.b)
    {
      String str = this.i;
      return str;
    }
  }
  
  public final boolean e(String paramString)
  {
    o();
    synchronized (this.b)
    {
      boolean bool = this.q.contains(paramString);
      return bool;
    }
  }
  
  public final void f(String paramString)
  {
    o();
    synchronized (this.b)
    {
      long l1 = zzbv.zzer().a();
      this.l = l1;
      if ((paramString == null) || (paramString.equals(this.k))) {
        return;
      }
      this.k = paramString;
      if (this.a != null)
      {
        this.a.putString("app_settings_json", paramString);
        this.a.putLong("app_settings_last_update_ms", l1);
        this.a.apply();
      }
      Bundle localBundle = new Bundle();
      localBundle.putString("app_settings_json", paramString);
      localBundle.putLong("app_settings_last_update_ms", l1);
      a(localBundle);
      return;
    }
  }
  
  public final boolean f()
  {
    o();
    synchronized (this.b)
    {
      boolean bool = this.j;
      return bool;
    }
  }
  
  public final int g()
  {
    o();
    synchronized (this.b)
    {
      int i1 = this.p;
      return i1;
    }
  }
  
  public final in h()
  {
    o();
    synchronized (this.b)
    {
      in localin = new in(this.k, this.l);
      return localin;
    }
  }
  
  public final long i()
  {
    o();
    synchronized (this.b)
    {
      long l1 = this.m;
      return l1;
    }
  }
  
  public final int j()
  {
    o();
    synchronized (this.b)
    {
      int i1 = this.o;
      return i1;
    }
  }
  
  public final long k()
  {
    o();
    synchronized (this.b)
    {
      long l1 = this.n;
      return l1;
    }
  }
  
  public final JSONObject l()
  {
    o();
    synchronized (this.b)
    {
      JSONObject localJSONObject = this.r;
      return localJSONObject;
    }
  }
  
  public final void m()
  {
    o();
    synchronized (this.b)
    {
      this.r = new JSONObject();
      if (this.a != null)
      {
        this.a.remove("native_advanced_settings");
        this.a.apply();
      }
      Bundle localBundle = new Bundle();
      localBundle.putString("native_advanced_settings", "{}");
      a(localBundle);
      return;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.jg
 * JD-Core Version:    0.7.0.1
 */