package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.GuardedBy;

@cm
public final class hz
{
  private final AtomicReference<ThreadPoolExecutor> a = new AtomicReference(null);
  private final Object b = new Object();
  @GuardedBy("mGmpAppIdLock")
  private String c = null;
  private final AtomicBoolean d = new AtomicBoolean(false);
  private final AtomicInteger e = new AtomicInteger(-1);
  private final AtomicReference<Object> f = new AtomicReference(null);
  private final AtomicReference<Object> g = new AtomicReference(null);
  private ConcurrentMap<String, Method> h = new ConcurrentHashMap(9);
  
  private static Bundle a(Context paramContext, String paramString, boolean paramBoolean)
  {
    Bundle localBundle = new Bundle();
    try
    {
      localBundle.putLong("_aeid", Long.parseLong(paramString));
      if (paramBoolean) {
        localBundle.putInt("_r", 1);
      }
      return localBundle;
    }
    catch (NullPointerException localNullPointerException)
    {
      String str1 = String.valueOf(paramString);
      if (str1.length() != 0) {}
      for (String str2 = "Invalid event ID: ".concat(str1);; str2 = new String("Invalid event ID: "))
      {
        je.b(str2, localNullPointerException);
        break;
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      label33:
      break label33;
    }
  }
  
  private final Object a(String paramString, Context paramContext)
  {
    if (!a(paramContext, "com.google.android.gms.measurement.AppMeasurement", this.f, true)) {
      return null;
    }
    Method localMethod = h(paramContext, paramString);
    try
    {
      Object localObject = localMethod.invoke(this.f.get(), new Object[0]);
      return localObject;
    }
    catch (Exception localException)
    {
      a(localException, paramString, true);
    }
    return null;
  }
  
  private final void a(Context paramContext, String paramString, Bundle paramBundle)
  {
    if ((!a(paramContext)) || (!a(paramContext, "com.google.android.gms.measurement.AppMeasurement", this.f, true))) {
      return;
    }
    Method localMethod = l(paramContext);
    try
    {
      localMethod.invoke(this.f.get(), new Object[] { "am", paramString, paramBundle });
      return;
    }
    catch (Exception localException)
    {
      a(localException, "logEventInternal", true);
    }
  }
  
  private final void a(Exception paramException, String paramString, boolean paramBoolean)
  {
    if (!this.d.get())
    {
      je.e(30 + String.valueOf(paramString).length() + "Invoke Firebase method " + paramString + " error.");
      if (paramBoolean)
      {
        je.e("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
        this.d.set(true);
      }
    }
  }
  
  private final boolean a(Context paramContext, String paramString, AtomicReference<Object> paramAtomicReference, boolean paramBoolean)
  {
    if (paramAtomicReference.get() == null) {}
    try
    {
      paramAtomicReference.compareAndSet(null, paramContext.getClassLoader().loadClass(paramString).getDeclaredMethod("getInstance", new Class[] { Context.class }).invoke(null, new Object[] { paramContext }));
      return true;
    }
    catch (Exception localException)
    {
      a(localException, "getInstance", paramBoolean);
    }
    return false;
  }
  
  private final void b(Context paramContext, String paramString1, String paramString2)
  {
    if (!a(paramContext, "com.google.android.gms.measurement.AppMeasurement", this.f, true)) {
      return;
    }
    Method localMethod = g(paramContext, paramString2);
    try
    {
      localMethod.invoke(this.f.get(), new Object[] { paramString1 });
      je.a(37 + String.valueOf(paramString2).length() + String.valueOf(paramString1).length() + "Invoke Firebase method " + paramString2 + ", Ad Unit Id: " + paramString1);
      return;
    }
    catch (Exception localException)
    {
      a(localException, paramString2, false);
    }
  }
  
  private final Method g(Context paramContext, String paramString)
  {
    Method localMethod1 = (Method)this.h.get(paramString);
    if (localMethod1 != null) {
      return localMethod1;
    }
    try
    {
      Method localMethod2 = paramContext.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(paramString, new Class[] { String.class });
      this.h.put(paramString, localMethod2);
      return localMethod2;
    }
    catch (Exception localException)
    {
      a(localException, paramString, false);
    }
    return null;
  }
  
  private final Method h(Context paramContext, String paramString)
  {
    Method localMethod1 = (Method)this.h.get(paramString);
    if (localMethod1 != null) {
      return localMethod1;
    }
    try
    {
      Method localMethod2 = paramContext.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(paramString, new Class[0]);
      this.h.put(paramString, localMethod2);
      return localMethod2;
    }
    catch (Exception localException)
    {
      a(localException, paramString, false);
    }
    return null;
  }
  
  private final Method i(Context paramContext, String paramString)
  {
    Method localMethod1 = (Method)this.h.get(paramString);
    if (localMethod1 != null) {
      return localMethod1;
    }
    try
    {
      Method localMethod2 = paramContext.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod(paramString, new Class[] { Activity.class, String.class, String.class });
      this.h.put(paramString, localMethod2);
      return localMethod2;
    }
    catch (Exception localException)
    {
      a(localException, paramString, false);
    }
    return null;
  }
  
  private final Method l(Context paramContext)
  {
    Method localMethod1 = (Method)this.h.get("logEventInternal");
    if (localMethod1 != null) {
      return localMethod1;
    }
    try
    {
      Method localMethod2 = paramContext.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", new Class[] { String.class, String.class, Bundle.class });
      this.h.put("logEventInternal", localMethod2);
      return localMethod2;
    }
    catch (Exception localException)
    {
      a(localException, "logEventInternal", true);
    }
    return null;
  }
  
  public final void a(Context paramContext, String paramString)
  {
    if (!a(paramContext)) {
      return;
    }
    b(paramContext, paramString, "beginAdUnitExposure");
  }
  
  public final void a(Context paramContext, String paramString1, String paramString2)
  {
    if (!a(paramContext)) {
      return;
    }
    a(paramContext, paramString1, a(paramContext, paramString2, "_ac".equals(paramString1)));
  }
  
  public final void a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt)
  {
    if (!a(paramContext)) {
      return;
    }
    Bundle localBundle = a(paramContext, paramString1, false);
    localBundle.putString("_ai", paramString2);
    localBundle.putString("type", paramString3);
    localBundle.putInt("value", paramInt);
    a(paramContext, "_ar", localBundle);
    je.a(75 + String.valueOf(paramString3).length() + "Log a Firebase reward video event, reward type: " + paramString3 + ", reward value: " + paramInt);
  }
  
  public final boolean a(Context paramContext)
  {
    arq localarq = asa.al;
    if ((!((Boolean)aos.f().a(localarq)).booleanValue()) || (this.d.get())) {
      return false;
    }
    if (this.e.get() == -1)
    {
      aos.a();
      if (lz.c(paramContext)) {
        break label92;
      }
      aos.a();
      if (!lz.f(paramContext)) {
        break label92;
      }
      je.e("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
      this.e.set(0);
    }
    while (this.e.get() == 1)
    {
      return true;
      label92:
      this.e.set(1);
    }
    return false;
  }
  
  public final void b(Context paramContext, String paramString)
  {
    if (!a(paramContext)) {
      return;
    }
    b(paramContext, paramString, "endAdUnitExposure");
  }
  
  public final boolean b(Context paramContext)
  {
    arq localarq = asa.am;
    return (((Boolean)aos.f().a(localarq)).booleanValue()) && (a(paramContext));
  }
  
  public final void c(Context paramContext, String paramString)
  {
    if (!a(paramContext)) {}
    while ((!(paramContext instanceof Activity)) || (!a(paramContext, "com.google.firebase.analytics.FirebaseAnalytics", this.g, false))) {
      return;
    }
    Method localMethod = i(paramContext, "setCurrentScreen");
    try
    {
      Activity localActivity = (Activity)paramContext;
      Object localObject = this.g.get();
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = localActivity;
      arrayOfObject[1] = paramString;
      arrayOfObject[2] = paramContext.getPackageName();
      localMethod.invoke(localObject, arrayOfObject);
      return;
    }
    catch (Exception localException)
    {
      a(localException, "setCurrentScreen", false);
    }
  }
  
  public final boolean c(Context paramContext)
  {
    arq localarq = asa.an;
    return (((Boolean)aos.f().a(localarq)).booleanValue()) && (a(paramContext));
  }
  
  public final void d(Context paramContext, String paramString)
  {
    a(paramContext, "_ac", paramString);
  }
  
  public final boolean d(Context paramContext)
  {
    arq localarq = asa.ao;
    return (((Boolean)aos.f().a(localarq)).booleanValue()) && (a(paramContext));
  }
  
  public final void e(Context paramContext, String paramString)
  {
    a(paramContext, "_ai", paramString);
  }
  
  public final boolean e(Context paramContext)
  {
    arq localarq = asa.ap;
    return (((Boolean)aos.f().a(localarq)).booleanValue()) && (a(paramContext));
  }
  
  public final void f(Context paramContext, String paramString)
  {
    a(paramContext, "_aq", paramString);
  }
  
  public final boolean f(Context paramContext)
  {
    arq localarq = asa.as;
    return (((Boolean)aos.f().a(localarq)).booleanValue()) && (a(paramContext));
  }
  
  public final String g(Context paramContext)
  {
    String str;
    if (!a(paramContext)) {
      str = "";
    }
    for (;;)
    {
      return str;
      if (!a(paramContext, "com.google.android.gms.measurement.AppMeasurement", this.f, true)) {
        return "";
      }
      try
      {
        str = (String)h(paramContext, "getCurrentScreenName").invoke(this.f.get(), new Object[0]);
        if (str == null) {
          str = (String)h(paramContext, "getCurrentScreenClass").invoke(this.f.get(), new Object[0]);
        }
        if (str == null) {
          return "";
        }
      }
      catch (Exception localException)
      {
        a(localException, "getCurrentScreenName", false);
      }
    }
    return "";
  }
  
  public final String h(Context paramContext)
  {
    if (!a(paramContext)) {
      return null;
    }
    synchronized (this.b)
    {
      if (this.c != null)
      {
        String str2 = this.c;
        return str2;
      }
    }
    this.c = ((String)a("getGmpAppId", paramContext));
    String str1 = this.c;
    return str1;
  }
  
  public final String i(Context paramContext)
  {
    if (!a(paramContext)) {
      return null;
    }
    arq localarq1 = asa.av;
    long l = ((Long)aos.f().a(localarq1)).longValue();
    if (l < 0L) {
      return (String)a("getAppInstanceId", paramContext);
    }
    if (this.a.get() == null)
    {
      AtomicReference localAtomicReference = this.a;
      arq localarq2 = asa.aw;
      int i = ((Integer)aos.f().a(localarq2)).intValue();
      arq localarq3 = asa.aw;
      localAtomicReference.compareAndSet(null, new ThreadPoolExecutor(i, ((Integer)aos.f().a(localarq3)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new ic(this)));
    }
    Future localFuture = ((ThreadPoolExecutor)this.a.get()).submit(new ia(this, paramContext));
    try
    {
      String str = (String)localFuture.get(l, TimeUnit.MILLISECONDS);
      return str;
    }
    catch (Exception localException)
    {
      localFuture.cancel(true);
      if ((localException instanceof TimeoutException)) {
        return "TIME_OUT";
      }
    }
    return null;
  }
  
  public final String j(Context paramContext)
  {
    if (!a(paramContext)) {}
    Object localObject;
    do
    {
      return null;
      localObject = a("generateEventId", paramContext);
    } while (localObject == null);
    return localObject.toString();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.hz
 * JD-Core Version:    0.7.0.1
 */