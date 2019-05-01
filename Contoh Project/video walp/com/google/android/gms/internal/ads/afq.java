package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class afq
{
  private static String a;
  
  public static String a(Context paramContext)
  {
    if (a != null) {
      return a;
    }
    PackageManager localPackageManager = paramContext.getPackageManager();
    Intent localIntent1 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
    ResolveInfo localResolveInfo1 = localPackageManager.resolveActivity(localIntent1, 0);
    if (localResolveInfo1 != null) {}
    for (String str = localResolveInfo1.activityInfo.packageName;; str = null)
    {
      List localList = localPackageManager.queryIntentActivities(localIntent1, 0);
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        ResolveInfo localResolveInfo2 = (ResolveInfo)localIterator.next();
        Intent localIntent2 = new Intent();
        localIntent2.setAction("android.support.customtabs.action.CustomTabsService");
        localIntent2.setPackage(localResolveInfo2.activityInfo.packageName);
        if (localPackageManager.resolveService(localIntent2, 0) != null) {
          localArrayList.add(localResolveInfo2.activityInfo.packageName);
        }
      }
      if (localArrayList.isEmpty()) {
        a = null;
      }
      for (;;)
      {
        return a;
        if (localArrayList.size() == 1) {
          a = (String)localArrayList.get(0);
        } else if ((!TextUtils.isEmpty(str)) && (!a(paramContext, localIntent1)) && (localArrayList.contains(str))) {
          a = str;
        } else if (localArrayList.contains("com.android.chrome")) {
          a = "com.android.chrome";
        } else if (localArrayList.contains("com.chrome.beta")) {
          a = "com.chrome.beta";
        } else if (localArrayList.contains("com.chrome.dev")) {
          a = "com.chrome.dev";
        } else if (localArrayList.contains("com.google.android.apps.chrome")) {
          a = "com.google.android.apps.chrome";
        }
      }
    }
  }
  
  private static boolean a(Context paramContext, Intent paramIntent)
  {
    try
    {
      List localList = paramContext.getPackageManager().queryIntentActivities(paramIntent, 64);
      if ((localList == null) || (localList.size() == 0)) {
        break label114;
      }
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        ResolveInfo localResolveInfo = (ResolveInfo)localIterator.next();
        IntentFilter localIntentFilter = localResolveInfo.filter;
        if ((localIntentFilter != null) && (localIntentFilter.countDataAuthorities() != 0) && (localIntentFilter.countDataPaths() != 0))
        {
          ActivityInfo localActivityInfo = localResolveInfo.activityInfo;
          if (localActivityInfo != null) {
            return true;
          }
        }
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
    }
    return false;
    label114:
    return false;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.afq
 * JD-Core Version:    0.7.0.1
 */