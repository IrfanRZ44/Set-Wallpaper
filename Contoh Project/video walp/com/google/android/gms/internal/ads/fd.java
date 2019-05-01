package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.DetailedState;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.a.b;
import com.google.android.gms.common.a.c;
import com.google.android.gms.common.util.g;
import com.google.android.gms.common.util.k;
import java.util.Locale;

public final class fd
{
  private String A;
  private boolean B;
  private int a;
  private boolean b;
  private boolean c;
  private int d;
  private int e;
  private int f;
  private String g;
  private int h;
  private int i;
  private int j;
  private boolean k;
  private int l;
  private double m;
  private boolean n;
  private String o;
  private String p;
  private boolean q;
  private boolean r;
  private String s;
  private boolean t;
  private boolean u;
  private String v;
  private String w;
  private float x;
  private int y;
  private int z;
  
  public fd(Context paramContext)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    a(paramContext);
    b(paramContext);
    c(paramContext);
    Locale localLocale = Locale.getDefault();
    boolean bool2;
    label58:
    Resources localResources;
    if (a(localPackageManager, "geo:0,0?q=donuts") != null)
    {
      bool2 = bool1;
      this.q = bool2;
      if (a(localPackageManager, "http://www.google.com") == null) {
        break label136;
      }
      this.r = bool1;
      this.s = localLocale.getCountry();
      aos.a();
      this.t = lz.a();
      this.u = g.c(paramContext);
      this.v = localLocale.getLanguage();
      this.w = b(paramContext, localPackageManager);
      this.A = a(paramContext, localPackageManager);
      localResources = paramContext.getResources();
      if (localResources != null) {
        break label141;
      }
    }
    label136:
    label141:
    DisplayMetrics localDisplayMetrics;
    do
    {
      return;
      bool2 = false;
      break;
      bool1 = false;
      break label58;
      localDisplayMetrics = localResources.getDisplayMetrics();
    } while (localDisplayMetrics == null);
    this.x = localDisplayMetrics.density;
    this.y = localDisplayMetrics.widthPixels;
    this.z = localDisplayMetrics.heightPixels;
  }
  
  public fd(Context paramContext, fc paramfc)
  {
    paramContext.getPackageManager();
    a(paramContext);
    b(paramContext);
    c(paramContext);
    this.o = Build.FINGERPRINT;
    this.p = Build.DEVICE;
    if ((k.c()) && (asy.a(paramContext))) {}
    for (boolean bool = true;; bool = false)
    {
      this.B = bool;
      this.q = paramfc.b;
      this.r = paramfc.c;
      this.s = paramfc.e;
      this.t = paramfc.f;
      this.u = paramfc.g;
      this.v = paramfc.j;
      this.w = paramfc.k;
      this.A = paramfc.l;
      this.x = paramfc.s;
      this.y = paramfc.t;
      this.z = paramfc.u;
      return;
    }
  }
  
  private static ResolveInfo a(PackageManager paramPackageManager, String paramString)
  {
    try
    {
      ResolveInfo localResolveInfo = paramPackageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(paramString)), 65536);
      return localResolveInfo;
    }
    catch (Throwable localThrowable)
    {
      zzbv.zzeo().a(localThrowable, "DeviceInfo.getResolveInfo");
    }
    return null;
  }
  
  private static String a(Context paramContext, PackageManager paramPackageManager)
  {
    try
    {
      PackageInfo localPackageInfo = c.b(paramContext).b("com.android.vending", 128);
      Object localObject = null;
      if (localPackageInfo != null)
      {
        int i1 = localPackageInfo.versionCode;
        String str1 = localPackageInfo.packageName;
        String str2 = 12 + String.valueOf(str1).length() + i1 + "." + str1;
        localObject = str2;
      }
      return localObject;
    }
    catch (Exception localException) {}
    return null;
  }
  
  private final void a(Context paramContext)
  {
    AudioManager localAudioManager = (AudioManager)paramContext.getSystemService("audio");
    if (localAudioManager != null) {
      try
      {
        this.a = localAudioManager.getMode();
        this.b = localAudioManager.isMusicActive();
        this.c = localAudioManager.isSpeakerphoneOn();
        this.d = localAudioManager.getStreamVolume(3);
        this.e = localAudioManager.getRingerMode();
        this.f = localAudioManager.getStreamVolume(2);
        return;
      }
      catch (Throwable localThrowable)
      {
        zzbv.zzeo().a(localThrowable, "DeviceInfo.gatherAudioInfo");
      }
    }
    this.a = -2;
    this.b = false;
    this.c = false;
    this.d = 0;
    this.e = 0;
    this.f = 0;
  }
  
  private static String b(Context paramContext, PackageManager paramPackageManager)
  {
    ResolveInfo localResolveInfo = a(paramPackageManager, "market://details?id=com.google.android.gms.ads");
    if (localResolveInfo == null) {}
    for (;;)
    {
      return null;
      ActivityInfo localActivityInfo = localResolveInfo.activityInfo;
      if (localActivityInfo != null) {
        try
        {
          PackageInfo localPackageInfo = c.b(paramContext).b(localActivityInfo.packageName, 0);
          if (localPackageInfo != null)
          {
            int i1 = localPackageInfo.versionCode;
            String str1 = localActivityInfo.packageName;
            String str2 = 12 + String.valueOf(str1).length() + i1 + "." + str1;
            return str2;
          }
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
      }
    }
    return null;
  }
  
  @TargetApi(16)
  private final void b(Context paramContext)
  {
    TelephonyManager localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
    ConnectivityManager localConnectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
    this.g = localTelephonyManager.getNetworkOperator();
    this.i = localTelephonyManager.getNetworkType();
    this.j = localTelephonyManager.getPhoneType();
    this.h = -2;
    this.k = false;
    this.l = -1;
    zzbv.zzek();
    if (jn.a(paramContext, "android.permission.ACCESS_NETWORK_STATE"))
    {
      NetworkInfo localNetworkInfo = localConnectivityManager.getActiveNetworkInfo();
      if (localNetworkInfo == null) {
        break label125;
      }
      this.h = localNetworkInfo.getType();
      this.l = localNetworkInfo.getDetailedState().ordinal();
    }
    for (;;)
    {
      if (Build.VERSION.SDK_INT >= 16) {
        this.k = localConnectivityManager.isActiveNetworkMetered();
      }
      return;
      label125:
      this.h = -1;
    }
  }
  
  private final void c(Context paramContext)
  {
    Intent localIntent = paramContext.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    if (localIntent != null)
    {
      int i1 = localIntent.getIntExtra("status", -1);
      int i2 = localIntent.getIntExtra("level", -1);
      int i3 = localIntent.getIntExtra("scale", -1);
      this.m = (i2 / i3);
      boolean bool;
      if (i1 != 2)
      {
        bool = false;
        if (i1 != 5) {}
      }
      else
      {
        bool = true;
      }
      this.n = bool;
      return;
    }
    this.m = -1.0D;
    this.n = false;
  }
  
  public final fc a()
  {
    return new fc(this.a, this.q, this.r, this.g, this.s, this.t, this.u, this.b, this.c, this.v, this.w, this.A, this.d, this.h, this.i, this.j, this.e, this.f, this.x, this.y, this.z, this.m, this.n, this.k, this.l, this.o, this.B, this.p);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.fd
 * JD-Core Version:    0.7.0.1
 */