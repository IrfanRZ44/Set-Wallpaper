package com.admob.android.ads.analytics;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.admob.android.ads.AdManager;
import com.admob.android.ads.e;
import com.admob.android.ads.h;
import com.admob.android.ads.r;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Set;

public class InstallReceiver
  extends BroadcastReceiver
{
  private static String a(String paramString1, String paramString2, String paramString3)
  {
    int i = 0;
    if (paramString1 != null) {}
    for (;;)
    {
      StringBuilder localStringBuilder;
      try
      {
        String[] arrayOfString1 = paramString1.split("&");
        localStringBuilder = null;
        if (i < arrayOfString1.length)
        {
          String str4 = arrayOfString1[i];
          if (!str4.startsWith("admob_")) {
            break label237;
          }
          String[] arrayOfString2 = str4.substring("admob_".length()).split("=");
          String str5 = URLEncoder.encode(arrayOfString2[0], "UTF-8");
          String str6 = URLEncoder.encode(arrayOfString2[1], "UTF-8");
          if (localStringBuilder == null)
          {
            localStringBuilder = new StringBuilder(128);
            localStringBuilder.append(str5).append("=").append(str6);
            break label237;
          }
          localStringBuilder.append("&");
          continue;
          return null;
        }
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        Log.e("AdMobSDK", "Could not create install URL.  Install not tracked.", localUnsupportedEncodingException);
      }
      while (localStringBuilder == null) {}
      String str1 = URLEncoder.encode(paramString2, "UTF-8");
      localStringBuilder.append("&").append("isu").append("=").append(str1);
      String str2 = URLEncoder.encode(paramString3, "UTF-8");
      localStringBuilder.append("&").append("app_id").append("=").append(str2);
      String str3 = "http://a.admob.com/f0?" + localStringBuilder.toString();
      return str3;
      label237:
      i++;
    }
  }
  
  private static void a(Context paramContext, Intent paramIntent)
  {
    try
    {
      PackageManager localPackageManager = paramContext.getPackageManager();
      if (localPackageManager != null)
      {
        ActivityInfo localActivityInfo = localPackageManager.getReceiverInfo(new ComponentName(paramContext, InstallReceiver.class), 128);
        if ((localActivityInfo != null) && (localActivityInfo.metaData != null))
        {
          Set localSet = localActivityInfo.metaData.keySet();
          if (localSet != null)
          {
            Iterator localIterator = localSet.iterator();
            while (localIterator.hasNext())
            {
              String str1 = (String)localIterator.next();
              String str2 = null;
              try
              {
                str2 = localActivityInfo.metaData.getString(str1);
                if (!str2.equals("com.google.android.apps.analytics.AnalyticsReceiver"))
                {
                  ((BroadcastReceiver)Class.forName(str2).newInstance()).onReceive(paramContext, paramIntent);
                  Log.d("AdMobSDK", "Successfully forwarded install notification to " + str2);
                }
              }
              catch (Exception localException3)
              {
                Log.w("AdMobSDK", "Could not forward Market's INSTALL_REFERRER intent to " + str2, localException3);
              }
            }
          }
        }
      }
      try
      {
        ((BroadcastReceiver)Class.forName("com.google.android.apps.analytics.AnalyticsReceiver").newInstance()).onReceive(paramContext, paramIntent);
        Log.d("AdMobSDK", "Successfully forwarded install notification to com.google.android.apps.analytics.AnalyticsReceiver");
        return;
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        Log.v("AdMobSDK", "Google Analytics not installed.");
        return;
      }
      catch (Exception localException2)
      {
        Log.w("AdMobSDK", "Exception from the Google Analytics install receiver.", localException2);
      }
    }
    catch (Exception localException1)
    {
      Log.w("AdMobSDK", "Unhandled exception while forwarding install intents.  Possibly lost some install information.", localException1);
      return;
    }
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    try
    {
      String str1 = paramIntent.getStringExtra("referrer");
      String str2 = AdManager.getUserId(paramContext);
      String str3 = a(str1, str2, AdManager.getApplicationPackageName(paramContext));
      if (str3 != null)
      {
        if (Log.isLoggable("AdMobSDK", 2)) {
          Log.v("AdMobSDK", "Processing install from an AdMob ad (" + str3 + ").");
        }
        r localr = e.a(str3, "Conversion", str2);
        localr.a(new h()
        {
          public final void a(r paramAnonymousr)
          {
            if (Log.isLoggable("AdMobSDK", 3)) {
              Log.d("AdMobSDK", "Recorded install from an AdMob ad.");
            }
          }
          
          public final void a(r paramAnonymousr, Exception paramAnonymousException)
          {
            if (Log.isLoggable("AdMobSDK", 3)) {
              Log.d("AdMobSDK", "Failed to record install from an AdMob ad.", paramAnonymousException);
            }
          }
        });
        localr.a();
        a(paramContext, paramIntent);
      }
      return;
    }
    catch (Exception localException)
    {
      Log.e("AdMobSDK", "Unhandled exception processing Market install.", localException);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\Video 2\classes_dex2jar.jar
 * Qualified Name:     com.admob.android.ads.analytics.InstallReceiver
 * JD-Core Version:    0.7.0.1
 */