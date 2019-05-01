package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageInstaller.SessionInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.a.b;
import com.google.android.gms.common.a.c;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.util.g;
import com.google.android.gms.common.util.h;
import com.google.android.gms.common.util.k;
import com.google.android.gms.common.util.q;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class i
{
  @Deprecated
  public static final int a = 12451000;
  public static boolean b = false;
  public static boolean c = false;
  static final AtomicBoolean d = new AtomicBoolean();
  private static boolean e = false;
  private static boolean f = false;
  private static final AtomicBoolean g = new AtomicBoolean();
  
  @Deprecated
  public static int a(Context paramContext, int paramInt)
  {
    try
    {
      paramContext.getResources().getString(k.a.common_google_play_services_unknown_issue);
      if ((!"com.google.android.gms".equals(paramContext.getPackageName())) && (!g.get()))
      {
        i = l.a(paramContext);
        if (i == 0) {
          throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
        }
      }
    }
    catch (Throwable localThrowable)
    {
      int i;
      for (;;)
      {
        Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
      }
      if (i != a)
      {
        int j = a;
        throw new IllegalStateException(320 + "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected " + j + " but found " + i + ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
      }
      if (g.b(paramContext)) {
        break label149;
      }
    }
    if (!g.d(paramContext)) {}
    label149:
    for (boolean bool = true;; bool = false) {
      return a(paramContext, bool, paramInt);
    }
  }
  
  private static int a(Context paramContext, boolean paramBoolean, int paramInt)
  {
    if (paramInt >= 0) {}
    PackageManager localPackageManager;
    Object localObject1;
    PackageInfo localPackageInfo1;
    j localj;
    for (boolean bool = true;; bool = false)
    {
      n.b(bool);
      localPackageManager = paramContext.getPackageManager();
      localObject1 = null;
      if (paramBoolean) {}
      try
      {
        PackageInfo localPackageInfo2 = localPackageManager.getPackageInfo("com.android.vending", 8256);
        localObject1 = localPackageInfo2;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException3)
      {
        Log.w("GooglePlayServicesUtil", "Google Play Store is missing.");
        return 9;
      }
      try
      {
        localPackageInfo1 = localPackageManager.getPackageInfo("com.google.android.gms", 64);
        localj = j.a(paramContext);
        if (localj.a(localPackageInfo1, true)) {
          break label108;
        }
        Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
        return 9;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException1)
      {
        Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
        return 1;
      }
    }
    label108:
    if ((paramBoolean) && ((!localj.a(localObject1, true)) || (!localObject1.signatures[0].equals(localPackageInfo1.signatures[0]))))
    {
      Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
      return 9;
    }
    if (h.a(localPackageInfo1.versionCode) < h.a(paramInt))
    {
      int i = localPackageInfo1.versionCode;
      Log.w("GooglePlayServicesUtil", 77 + "Google Play services out of date.  Requires " + paramInt + " but found " + i);
      return 2;
    }
    Object localObject2 = localPackageInfo1.applicationInfo;
    if (localObject2 == null) {}
    try
    {
      ApplicationInfo localApplicationInfo = localPackageManager.getApplicationInfo("com.google.android.gms", 0);
      localObject2 = localApplicationInfo;
      if (!((ApplicationInfo)localObject2).enabled) {
        return 3;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException2)
    {
      Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.", localNameNotFoundException2);
      return 1;
    }
    return 0;
  }
  
  @Deprecated
  public static boolean a()
  {
    return g.a();
  }
  
  public static boolean a(Context paramContext)
  {
    if (!f) {}
    for (;;)
    {
      try
      {
        PackageInfo localPackageInfo = c.b(paramContext).b("com.google.android.gms", 64);
        j localj = j.a(paramContext);
        if ((localPackageInfo == null) || (localj.a(localPackageInfo, false)) || (!localj.a(localPackageInfo, true))) {
          continue;
        }
        e = true;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", localNameNotFoundException);
        f = true;
        continue;
      }
      finally
      {
        f = true;
      }
      return e;
      e = false;
    }
  }
  
  @TargetApi(21)
  static boolean a(Context paramContext, String paramString)
  {
    boolean bool1 = paramString.equals("com.google.android.gms");
    if (k.i()) {
      try
      {
        List localList = paramContext.getPackageManager().getPackageInstaller().getAllSessions();
        Iterator localIterator = localList.iterator();
        while (localIterator.hasNext()) {
          if (paramString.equals(((PackageInstaller.SessionInfo)localIterator.next()).getAppPackageName())) {
            return true;
          }
        }
      }
      catch (Exception localException)
      {
        return false;
      }
    }
    PackageManager localPackageManager = paramContext.getPackageManager();
    try
    {
      ApplicationInfo localApplicationInfo = localPackageManager.getApplicationInfo(paramString, 8192);
      if (bool1) {
        return localApplicationInfo.enabled;
      }
      if (localApplicationInfo.enabled)
      {
        boolean bool2 = e(paramContext);
        if (!bool2) {
          return true;
        }
      }
      return false;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    return false;
  }
  
  public static boolean b(Context paramContext)
  {
    return (a(paramContext)) || (!a());
  }
  
  @Deprecated
  public static boolean b(Context paramContext, int paramInt)
  {
    return q.a(paramContext, paramInt);
  }
  
  public static Context c(Context paramContext)
  {
    try
    {
      Context localContext = paramContext.createPackageContext("com.google.android.gms", 3);
      return localContext;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    return null;
  }
  
  @Deprecated
  public static boolean c(Context paramContext, int paramInt)
  {
    if (paramInt == 18) {
      return true;
    }
    if (paramInt == 1) {
      return a(paramContext, "com.google.android.gms");
    }
    return false;
  }
  
  @Deprecated
  public static int d(Context paramContext)
  {
    try
    {
      PackageInfo localPackageInfo = paramContext.getPackageManager().getPackageInfo("com.google.android.gms", 0);
      return localPackageInfo.versionCode;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
    }
    return 0;
  }
  
  @TargetApi(18)
  public static boolean e(Context paramContext)
  {
    if (k.f())
    {
      Bundle localBundle = ((UserManager)paramContext.getSystemService("user")).getApplicationRestrictions(paramContext.getPackageName());
      if ((localBundle != null) && ("true".equals(localBundle.getString("restricted_profile")))) {
        return true;
      }
    }
    return false;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.i
 * JD-Core Version:    0.7.0.1
 */