package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.AlertDialog.Builder;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Debug;
import android.os.Debug.MemoryInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.a.b;
import com.google.android.gms.common.a.c;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.i;
import com.google.android.gms.common.util.k;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@cm
public final class jn
{
  public static final Handler a = new jf(Looper.getMainLooper());
  private final Object b = new Object();
  private boolean c = true;
  @GuardedBy("mLock")
  private String d;
  private boolean e = false;
  private boolean f = false;
  @GuardedBy("this")
  private Pattern g;
  @GuardedBy("this")
  private Pattern h;
  
  public static Bitmap a(View paramView)
  {
    paramView.setDrawingCacheEnabled(true);
    Bitmap localBitmap = Bitmap.createBitmap(paramView.getDrawingCache());
    paramView.setDrawingCacheEnabled(false);
    return localBitmap;
  }
  
  public static Bundle a(alc paramalc)
  {
    if (paramalc == null) {}
    do
    {
      arq localarq4;
      do
      {
        return null;
        arq localarq1 = asa.W;
        if (((Boolean)aos.f().a(localarq1)).booleanValue()) {
          break;
        }
        localarq4 = asa.Y;
      } while (!((Boolean)aos.f().a(localarq4)).booleanValue());
    } while ((zzbv.zzeo().l().b()) && (zzbv.zzeo().l().d()));
    if (paramalc.d()) {
      paramalc.c();
    }
    akw localakw = paramalc.b();
    String str4;
    String str5;
    String str6;
    Object localObject1;
    String str3;
    Object localObject2;
    if (localakw != null)
    {
      str4 = localakw.b();
      str5 = localakw.c();
      str6 = localakw.d();
      if (str4 != null) {
        zzbv.zzeo().l().a(str4);
      }
      if (str6 == null) {
        break label324;
      }
      zzbv.zzeo().l().b(str6);
      localObject1 = str4;
      str3 = str5;
      localObject2 = str6;
    }
    for (;;)
    {
      Bundle localBundle = new Bundle(1);
      if (localObject2 != null)
      {
        arq localarq3 = asa.Y;
        if ((((Boolean)aos.f().a(localarq3)).booleanValue()) && (!zzbv.zzeo().l().d())) {
          localBundle.putString("v_fp_vertical", (String)localObject2);
        }
      }
      if (localObject1 != null)
      {
        arq localarq2 = asa.W;
        if ((((Boolean)aos.f().a(localarq2)).booleanValue()) && (!zzbv.zzeo().l().b()))
        {
          localBundle.putString("fingerprint", (String)localObject1);
          if (!((String)localObject1).equals(str3)) {
            localBundle.putString("v_fp", str3);
          }
        }
      }
      if (localBundle.isEmpty()) {
        break;
      }
      return localBundle;
      String str1 = zzbv.zzeo().l().c();
      String str2 = zzbv.zzeo().l().e();
      localObject1 = str1;
      localObject2 = str2;
      str3 = null;
      continue;
      label324:
      localObject1 = str4;
      str3 = str5;
      localObject2 = str6;
    }
  }
  
  public static DisplayMetrics a(WindowManager paramWindowManager)
  {
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    paramWindowManager.getDefaultDisplay().getMetrics(localDisplayMetrics);
    return localDisplayMetrics;
  }
  
  public static WebResourceResponse a(HttpURLConnection paramHttpURLConnection)
  {
    zzbv.zzek();
    String str1 = paramHttpURLConnection.getContentType();
    String str2;
    int i;
    label56:
    String[] arrayOfString2;
    if (TextUtils.isEmpty(str1))
    {
      str2 = "";
      zzbv.zzek();
      String str3 = paramHttpURLConnection.getContentType();
      if (TextUtils.isEmpty(str3)) {
        break label268;
      }
      String[] arrayOfString1 = str3.split(";");
      if (arrayOfString1.length == 1) {
        break label268;
      }
      i = 1;
      if (i >= arrayOfString1.length) {
        break label268;
      }
      if (!arrayOfString1[i].trim().startsWith("charset")) {
        break label262;
      }
      arrayOfString2 = arrayOfString1[i].trim().split("=");
      if (arrayOfString2.length <= 1) {
        break label262;
      }
    }
    HashMap localHashMap;
    label262:
    label268:
    for (String str4 = arrayOfString2[1].trim();; str4 = "")
    {
      Map localMap = paramHttpURLConnection.getHeaderFields();
      localHashMap = new HashMap(localMap.size());
      Iterator localIterator = localMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        if ((localEntry.getKey() != null) && (localEntry.getValue() != null) && (((List)localEntry.getValue()).size() > 0)) {
          localHashMap.put((String)localEntry.getKey(), (String)((List)localEntry.getValue()).get(0));
        }
      }
      str2 = str1.split(";")[0].trim();
      break;
      i++;
      break label56;
    }
    return zzbv.zzem().a(str2, str4, paramHttpURLConnection.getResponseCode(), paramHttpURLConnection.getResponseMessage(), localHashMap, paramHttpURLConnection.getInputStream());
  }
  
  public static PopupWindow a(View paramView, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    return new PopupWindow(paramView, paramInt1, paramInt2, false);
  }
  
  public static String a()
  {
    return UUID.randomUUID().toString();
  }
  
  public static String a(Context paramContext, View paramView, zzjn paramzzjn)
  {
    arq localarq = asa.ak;
    if (!((Boolean)aos.f().a(localarq)).booleanValue()) {
      return null;
    }
    for (;;)
    {
      try
      {
        JSONObject localJSONObject1 = new JSONObject();
        JSONObject localJSONObject2 = new JSONObject();
        localJSONObject2.put("width", paramzzjn.e);
        localJSONObject2.put("height", paramzzjn.b);
        localJSONObject1.put("size", localJSONObject2);
        localJSONObject1.put("activity", l(paramContext));
        if (!paramzzjn.d)
        {
          JSONArray localJSONArray = new JSONArray();
          if (paramView != null)
          {
            ViewParent localViewParent = paramView.getParent();
            if (localViewParent != null)
            {
              int i = -1;
              if ((localViewParent instanceof ViewGroup)) {
                i = ((ViewGroup)localViewParent).indexOfChild(paramView);
              }
              JSONObject localJSONObject3 = new JSONObject();
              localJSONObject3.put("type", localViewParent.getClass().getName());
              localJSONObject3.put("index_of_child", i);
              localJSONArray.put(localJSONObject3);
            }
            if ((localViewParent == null) || (!(localViewParent instanceof View))) {
              break label251;
            }
            paramView = (View)localViewParent;
            continue;
          }
          if (localJSONArray.length() > 0) {
            localJSONObject1.put("parents", localJSONArray);
          }
        }
        String str = localJSONObject1.toString();
        return str;
      }
      catch (JSONException localJSONException)
      {
        je.c("Fail to get view hierarchy json", localJSONException);
        return null;
      }
      label251:
      paramView = null;
    }
  }
  
  public static String a(InputStreamReader paramInputStreamReader)
  {
    StringBuilder localStringBuilder = new StringBuilder(8192);
    char[] arrayOfChar = new char[2048];
    for (;;)
    {
      int i = paramInputStreamReader.read(arrayOfChar);
      if (i == -1) {
        break;
      }
      localStringBuilder.append(arrayOfChar, 0, i);
    }
    return localStringBuilder.toString();
  }
  
  public static String a(String paramString)
  {
    return Uri.parse(paramString).buildUpon().query(null).build().toString();
  }
  
  public static Map<String, String> a(Uri paramUri)
  {
    if (paramUri == null) {
      return null;
    }
    HashMap localHashMap = new HashMap();
    Iterator localIterator = zzbv.zzem().a(paramUri).iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localHashMap.put(str, paramUri.getQueryParameter(str));
    }
    return localHashMap;
  }
  
  private final JSONArray a(Collection<?> paramCollection)
  {
    JSONArray localJSONArray = new JSONArray();
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext()) {
      a(localJSONArray, localIterator.next());
    }
    return localJSONArray;
  }
  
  private final JSONObject a(Bundle paramBundle)
  {
    JSONObject localJSONObject = new JSONObject();
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      a(localJSONObject, str, paramBundle.get(str));
    }
    return localJSONObject;
  }
  
  public static void a(Context paramContext, Intent paramIntent)
  {
    try
    {
      paramContext.startActivity(paramIntent);
      return;
    }
    catch (Throwable localThrowable)
    {
      paramIntent.addFlags(268435456);
      paramContext.startActivity(paramIntent);
    }
  }
  
  @TargetApi(18)
  public static void a(Context paramContext, Uri paramUri)
  {
    try
    {
      Intent localIntent = new Intent("android.intent.action.VIEW", paramUri);
      Bundle localBundle = new Bundle();
      localIntent.putExtras(localBundle);
      arq localarq = asa.cL;
      if (((Boolean)aos.f().a(localarq)).booleanValue()) {
        b(paramContext, localIntent);
      }
      localBundle.putString("com.android.browser.application_id", paramContext.getPackageName());
      paramContext.startActivity(localIntent);
      String str = paramUri.toString();
      je.b(26 + String.valueOf(str).length() + "Opening " + str + " in a new browser.");
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      je.b("No browser is found.", localActivityNotFoundException);
    }
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramString2);
    a(paramContext, paramString1, localArrayList);
  }
  
  public static void a(Context paramContext, String paramString, List<String> paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext()) {
      new ln(paramContext, paramString, (String)localIterator.next()).c();
    }
  }
  
  public static void a(Context paramContext, Throwable paramThrowable)
  {
    if (paramContext == null) {}
    do
    {
      return;
      try
      {
        arq localarq = asa.c;
        boolean bool2 = ((Boolean)aos.f().a(localarq)).booleanValue();
        bool1 = bool2;
      }
      catch (IllegalStateException localIllegalStateException)
      {
        for (;;)
        {
          boolean bool1 = false;
        }
      }
    } while (!bool1);
    e.a(paramContext, paramThrowable);
  }
  
  public static void a(Runnable paramRunnable)
  {
    if (Looper.getMainLooper().getThread() != Thread.currentThread())
    {
      paramRunnable.run();
      return;
    }
    jl.a(paramRunnable);
  }
  
  private final void a(JSONArray paramJSONArray, Object paramObject)
  {
    if ((paramObject instanceof Bundle))
    {
      paramJSONArray.put(a((Bundle)paramObject));
      return;
    }
    if ((paramObject instanceof Map))
    {
      paramJSONArray.put(a((Map)paramObject));
      return;
    }
    if ((paramObject instanceof Collection))
    {
      paramJSONArray.put(a((Collection)paramObject));
      return;
    }
    if ((paramObject instanceof Object[]))
    {
      Object[] arrayOfObject = (Object[])paramObject;
      JSONArray localJSONArray = new JSONArray();
      int i = arrayOfObject.length;
      for (int j = 0; j < i; j++) {
        a(localJSONArray, arrayOfObject[j]);
      }
      paramJSONArray.put(localJSONArray);
      return;
    }
    paramJSONArray.put(paramObject);
  }
  
  private final void a(JSONObject paramJSONObject, String paramString, Object paramObject)
  {
    if ((paramObject instanceof Bundle))
    {
      paramJSONObject.put(paramString, a((Bundle)paramObject));
      return;
    }
    if ((paramObject instanceof Map))
    {
      paramJSONObject.put(paramString, a((Map)paramObject));
      return;
    }
    if ((paramObject instanceof Collection))
    {
      if (paramString != null) {}
      for (;;)
      {
        paramJSONObject.put(paramString, a((Collection)paramObject));
        return;
        paramString = "null";
      }
    }
    if ((paramObject instanceof Object[]))
    {
      paramJSONObject.put(paramString, a(Arrays.asList((Object[])paramObject)));
      return;
    }
    paramJSONObject.put(paramString, paramObject);
  }
  
  private static boolean a(int paramInt1, int paramInt2, int paramInt3)
  {
    return Math.abs(paramInt1 - paramInt2) <= paramInt3;
  }
  
  @TargetApi(24)
  public static boolean a(Activity paramActivity, Configuration paramConfiguration)
  {
    aos.a();
    int i = lz.a(paramActivity, paramConfiguration.screenHeightDp);
    int j = lz.a(paramActivity, paramConfiguration.screenWidthDp);
    DisplayMetrics localDisplayMetrics = a((WindowManager)paramActivity.getApplicationContext().getSystemService("window"));
    int k = localDisplayMetrics.heightPixels;
    int m = localDisplayMetrics.widthPixels;
    int n = paramActivity.getResources().getIdentifier("status_bar_height", "dimen", "android");
    if (n > 0) {}
    for (int i1 = paramActivity.getResources().getDimensionPixelSize(n);; i1 = 0)
    {
      int i2 = (int)Math.round(0.5D + paramActivity.getResources().getDisplayMetrics().density);
      arq localarq = asa.cX;
      int i3 = i2 * ((Integer)aos.f().a(localarq)).intValue();
      boolean bool1 = a(k, i1 + i, i3);
      boolean bool2 = false;
      if (bool1)
      {
        boolean bool3 = a(m, j, i3);
        bool2 = false;
        if (bool3) {
          bool2 = true;
        }
      }
      return bool2;
    }
  }
  
  public static boolean a(Context paramContext)
  {
    Intent localIntent = new Intent();
    localIntent.setClassName(paramContext, "com.google.android.gms.ads.AdActivity");
    PackageManager localPackageManager = paramContext.getPackageManager();
    ResolveInfo localResolveInfo;
    try
    {
      localResolveInfo = localPackageManager.resolveActivity(localIntent, 65536);
      if ((localResolveInfo == null) || (localResolveInfo.activityInfo == null))
      {
        je.e("Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.");
        return false;
      }
    }
    catch (Exception localException)
    {
      je.c("Could not verify that com.google.android.gms.ads.AdActivity is declared in AndroidManifest.xml", localException);
      zzbv.zzeo().a(localException, "AdUtil.hasAdActivity");
      return false;
    }
    if ((0x10 & localResolveInfo.activityInfo.configChanges) == 0) {
      je.e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] { "keyboard" }));
    }
    for (boolean bool = false;; bool = true)
    {
      if ((0x20 & localResolveInfo.activityInfo.configChanges) == 0)
      {
        je.e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] { "keyboardHidden" }));
        bool = false;
      }
      if ((0x80 & localResolveInfo.activityInfo.configChanges) == 0)
      {
        je.e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] { "orientation" }));
        bool = false;
      }
      if ((0x100 & localResolveInfo.activityInfo.configChanges) == 0)
      {
        je.e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] { "screenLayout" }));
        bool = false;
      }
      if ((0x200 & localResolveInfo.activityInfo.configChanges) == 0)
      {
        je.e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] { "uiMode" }));
        bool = false;
      }
      if ((0x400 & localResolveInfo.activityInfo.configChanges) == 0)
      {
        je.e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] { "screenSize" }));
        bool = false;
      }
      if ((0x800 & localResolveInfo.activityInfo.configChanges) == 0)
      {
        je.e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] { "smallestScreenSize" }));
        return false;
      }
      return bool;
    }
  }
  
  public static boolean a(Context paramContext, String paramString)
  {
    String str = paramContext.getPackageName();
    return c.b(paramContext).a(paramString, str) == 0;
  }
  
  public static boolean a(ClassLoader paramClassLoader, Class<?> paramClass, String paramString)
  {
    try
    {
      boolean bool = paramClass.isAssignableFrom(Class.forName(paramString, false, paramClassLoader));
      return bool;
    }
    catch (Throwable localThrowable) {}
    return false;
  }
  
  public static int[] a(Activity paramActivity)
  {
    Window localWindow = paramActivity.getWindow();
    if (localWindow != null)
    {
      View localView = localWindow.findViewById(16908290);
      if (localView != null)
      {
        int[] arrayOfInt = new int[2];
        arrayOfInt[0] = localView.getWidth();
        arrayOfInt[1] = localView.getHeight();
        return arrayOfInt;
      }
    }
    return e();
  }
  
  public static int b(String paramString)
  {
    try
    {
      int i = Integer.parseInt(paramString);
      return i;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      String str = String.valueOf(localNumberFormatException);
      je.e(22 + String.valueOf(str).length() + "Could not parse value:" + str);
    }
    return 0;
  }
  
  public static Bitmap b(View paramView)
  {
    Bitmap localBitmap;
    if (paramView == null) {
      localBitmap = null;
    }
    do
    {
      return localBitmap;
      localBitmap = f(paramView);
    } while (localBitmap != null);
    return e(paramView);
  }
  
  public static String b()
  {
    String str1 = Build.MANUFACTURER;
    String str2 = Build.MODEL;
    if (str2.startsWith(str1)) {
      return str2;
    }
    return 1 + String.valueOf(str1).length() + String.valueOf(str2).length() + str1 + " " + str2;
  }
  
  @TargetApi(18)
  public static void b(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null) {}
    while (!k.f()) {
      return;
    }
    if (paramIntent.getExtras() != null) {}
    for (Bundle localBundle = paramIntent.getExtras();; localBundle = new Bundle())
    {
      localBundle.putBinder("android.support.customtabs.extra.SESSION", null);
      localBundle.putString("com.android.browser.application_id", paramContext.getPackageName());
      paramIntent.putExtras(localBundle);
      return;
    }
  }
  
  public static void b(Context paramContext, String paramString1, String paramString2)
  {
    try
    {
      FileOutputStream localFileOutputStream = paramContext.openFileOutput(paramString1, 0);
      localFileOutputStream.write(paramString2.getBytes("UTF-8"));
      localFileOutputStream.close();
      return;
    }
    catch (Exception localException)
    {
      je.b("Error writing to file in internal storage.", localException);
    }
  }
  
  public static Bundle c()
  {
    Bundle localBundle = new Bundle();
    try
    {
      arq localarq1 = asa.C;
      if (((Boolean)aos.f().a(localarq1)).booleanValue())
      {
        Debug.MemoryInfo localMemoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(localMemoryInfo);
        localBundle.putParcelable("debug_memory_info", localMemoryInfo);
      }
      arq localarq2 = asa.D;
      if (((Boolean)aos.f().a(localarq2)).booleanValue())
      {
        Runtime localRuntime = Runtime.getRuntime();
        localBundle.putLong("runtime_free_memory", localRuntime.freeMemory());
        localBundle.putLong("runtime_max_memory", localRuntime.maxMemory());
        localBundle.putLong("runtime_total_memory", localRuntime.totalMemory());
      }
      localBundle.putInt("web_view_count", zzbv.zzeo().k());
      return localBundle;
    }
    catch (Exception localException)
    {
      je.c("Unable to gather memory stats", localException);
    }
    return localBundle;
  }
  
  public static WebResourceResponse c(Context paramContext, String paramString1, String paramString2)
  {
    try
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("User-Agent", zzbv.zzek().b(paramContext, paramString1));
      localHashMap.put("Cache-Control", "max-stale=3600");
      String str = (String)new kx(paramContext).a(paramString2, localHashMap).get(60L, TimeUnit.SECONDS);
      if (str != null)
      {
        WebResourceResponse localWebResourceResponse = new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str.getBytes("UTF-8")));
        return localWebResourceResponse;
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      je.c("Could not fetch MRAID JS.", localInterruptedException);
      return null;
    }
    catch (ExecutionException localExecutionException)
    {
      break label108;
    }
    catch (IOException localIOException)
    {
      break label108;
    }
    catch (TimeoutException localTimeoutException)
    {
      label108:
      break label108;
    }
  }
  
  public static String c(Context paramContext, String paramString)
  {
    try
    {
      String str = new String(i.a(paramContext.openFileInput(paramString), true), "UTF-8");
      return str;
    }
    catch (IOException localIOException)
    {
      je.b("Error reading from internal storage.");
    }
    return "";
  }
  
  public static boolean c(View paramView)
  {
    View localView = paramView.getRootView();
    Context localContext;
    if (localView != null)
    {
      localContext = localView.getContext();
      if (!(localContext instanceof Activity)) {}
    }
    for (Activity localActivity = (Activity)localContext; localActivity == null; localActivity = null) {
      return false;
    }
    Window localWindow = localActivity.getWindow();
    if (localWindow == null) {}
    for (WindowManager.LayoutParams localLayoutParams = null; (localLayoutParams != null) && ((0x80000 & localLayoutParams.flags) != 0); localLayoutParams = localWindow.getAttributes()) {
      return true;
    }
    return false;
  }
  
  public static boolean c(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    return paramString.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
  }
  
  public static int d(View paramView)
  {
    if (paramView == null) {
      return -1;
    }
    for (ViewParent localViewParent = paramView.getParent(); (localViewParent != null) && (!(localViewParent instanceof AdapterView)); localViewParent = localViewParent.getParent()) {}
    if (localViewParent == null) {
      return -1;
    }
    return ((AdapterView)localViewParent).getPositionForView(paramView);
  }
  
  private static String d()
  {
    StringBuilder localStringBuilder = new StringBuilder(256);
    localStringBuilder.append("Mozilla/5.0 (Linux; U; Android");
    if (Build.VERSION.RELEASE != null) {
      localStringBuilder.append(" ").append(Build.VERSION.RELEASE);
    }
    localStringBuilder.append("; ").append(Locale.getDefault());
    if (Build.DEVICE != null)
    {
      localStringBuilder.append("; ").append(Build.DEVICE);
      if (Build.DISPLAY != null) {
        localStringBuilder.append(" Build/").append(Build.DISPLAY);
      }
    }
    localStringBuilder.append(") AppleWebKit/533 Version/4.0 Safari/533");
    return localStringBuilder.toString();
  }
  
  protected static String d(Context paramContext)
  {
    try
    {
      String str = new WebView(paramContext).getSettings().getUserAgentString();
      return str;
    }
    catch (Throwable localThrowable) {}
    return d();
  }
  
  public static AlertDialog.Builder e(Context paramContext)
  {
    return new AlertDialog.Builder(paramContext);
  }
  
  private static Bitmap e(View paramView)
  {
    try
    {
      int i = paramView.getWidth();
      int j = paramView.getHeight();
      if ((i == 0) || (j == 0))
      {
        je.e("Width or height of view is zero");
        return null;
      }
      Bitmap localBitmap = Bitmap.createBitmap(paramView.getWidth(), paramView.getHeight(), Bitmap.Config.RGB_565);
      Canvas localCanvas = new Canvas(localBitmap);
      paramView.layout(0, 0, i, j);
      paramView.draw(localCanvas);
      return localBitmap;
    }
    catch (RuntimeException localRuntimeException)
    {
      je.b("Fail to capture the webview", localRuntimeException);
    }
    return null;
  }
  
  private static int[] e()
  {
    return new int[] { 0, 0 };
  }
  
  /* Error */
  private static Bitmap f(View paramView)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 1040	android/view/View:isDrawingCacheEnabled	()Z
    //   4: istore 4
    //   6: aload_0
    //   7: iconst_1
    //   8: invokevirtual 55	android/view/View:setDrawingCacheEnabled	(Z)V
    //   11: aload_0
    //   12: invokevirtual 59	android/view/View:getDrawingCache	()Landroid/graphics/Bitmap;
    //   15: astore 5
    //   17: aload 5
    //   19: ifnull +39 -> 58
    //   22: aload 5
    //   24: invokestatic 65	android/graphics/Bitmap:createBitmap	(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    //   27: astore 6
    //   29: aload 6
    //   31: astore_2
    //   32: aload_0
    //   33: iload 4
    //   35: invokevirtual 55	android/view/View:setDrawingCacheEnabled	(Z)V
    //   38: aload_2
    //   39: areturn
    //   40: astore_1
    //   41: aconst_null
    //   42: astore_2
    //   43: aload_1
    //   44: astore_3
    //   45: ldc_w 1042
    //   48: aload_3
    //   49: invokestatic 494	com/google/android/gms/internal/ads/je:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   52: aload_2
    //   53: areturn
    //   54: astore_3
    //   55: goto -10 -> 45
    //   58: aconst_null
    //   59: astore_2
    //   60: goto -28 -> 32
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	63	0	paramView	View
    //   40	4	1	localRuntimeException1	RuntimeException
    //   31	29	2	localBitmap1	Bitmap
    //   44	5	3	localRuntimeException2	RuntimeException
    //   54	1	3	localRuntimeException3	RuntimeException
    //   4	30	4	bool	boolean
    //   15	8	5	localBitmap2	Bitmap
    //   27	3	6	localBitmap3	Bitmap
    // Exception table:
    //   from	to	target	type
    //   0	17	40	java/lang/RuntimeException
    //   22	29	40	java/lang/RuntimeException
    //   32	38	54	java/lang/RuntimeException
  }
  
  public static arl f(Context paramContext)
  {
    return new arl(paramContext);
  }
  
  public static boolean g(Context paramContext)
  {
    int i;
    label149:
    do
    {
      try
      {
        ActivityManager localActivityManager = (ActivityManager)paramContext.getSystemService("activity");
        KeyguardManager localKeyguardManager = (KeyguardManager)paramContext.getSystemService("keyguard");
        if ((localActivityManager != null) && (localKeyguardManager != null))
        {
          List localList = localActivityManager.getRunningAppProcesses();
          if (localList == null) {
            return false;
          }
          Iterator localIterator = localList.iterator();
          while (localIterator.hasNext())
          {
            ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)localIterator.next();
            if (Process.myPid() == localRunningAppProcessInfo.pid) {
              if ((localRunningAppProcessInfo.importance == 100) && (!localKeyguardManager.inKeyguardRestrictedInputMode()))
              {
                PowerManager localPowerManager = (PowerManager)paramContext.getSystemService("power");
                if (localPowerManager == null)
                {
                  i = 0;
                  break label149;
                }
                boolean bool = localPowerManager.isScreenOn();
                i = bool;
                break label149;
              }
            }
          }
          return false;
        }
      }
      catch (Throwable localThrowable)
      {
        return false;
      }
      return false;
    } while (i == 0);
    return true;
  }
  
  public static Bitmap h(Context paramContext)
  {
    if (!(paramContext instanceof Activity)) {
      return null;
    }
    Object localObject;
    try
    {
      arq localarq = asa.bS;
      if (((Boolean)aos.f().a(localarq)).booleanValue())
      {
        Window localWindow = ((Activity)paramContext).getWindow();
        if (localWindow != null) {
          return f(localWindow.getDecorView().getRootView());
        }
      }
      else
      {
        Bitmap localBitmap = e(((Activity)paramContext).getWindow().getDecorView());
        localObject = localBitmap;
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      je.b("Fail to capture screen shot", localRuntimeException);
      localObject = null;
    }
    return localObject;
  }
  
  public static int i(Context paramContext)
  {
    ApplicationInfo localApplicationInfo = paramContext.getApplicationInfo();
    if (localApplicationInfo == null) {
      return 0;
    }
    return localApplicationInfo.targetSdkVersion;
  }
  
  @TargetApi(16)
  public static boolean j(Context paramContext)
  {
    if ((paramContext == null) || (!k.d())) {}
    KeyguardManager localKeyguardManager;
    do
    {
      return false;
      localKeyguardManager = m(paramContext);
    } while ((localKeyguardManager == null) || (!localKeyguardManager.isKeyguardLocked()));
    return true;
  }
  
  public static boolean k(Context paramContext)
  {
    try
    {
      paramContext.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
      return false;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      return true;
    }
    catch (Throwable localThrowable)
    {
      je.b("Error loading class.", localThrowable);
      zzbv.zzeo().a(localThrowable, "AdUtil.isLiteSdk");
    }
    return false;
  }
  
  private static String l(Context paramContext)
  {
    try
    {
      ActivityManager localActivityManager = (ActivityManager)paramContext.getSystemService("activity");
      if (localActivityManager == null) {
        return null;
      }
      List localList = localActivityManager.getRunningTasks(1);
      if ((localList != null) && (!localList.isEmpty()))
      {
        ActivityManager.RunningTaskInfo localRunningTaskInfo = (ActivityManager.RunningTaskInfo)localList.get(0);
        if ((localRunningTaskInfo != null) && (localRunningTaskInfo.topActivity != null))
        {
          String str = localRunningTaskInfo.topActivity.getClassName();
          return str;
        }
      }
    }
    catch (Exception localException) {}
    return null;
  }
  
  private static KeyguardManager m(Context paramContext)
  {
    Object localObject = paramContext.getSystemService("keyguard");
    if ((localObject != null) && ((localObject instanceof KeyguardManager))) {
      return (KeyguardManager)localObject;
    }
    return null;
  }
  
  public final JSONObject a(Bundle paramBundle, JSONObject paramJSONObject)
  {
    Object localObject = null;
    if (paramBundle != null) {}
    try
    {
      JSONObject localJSONObject = a(paramBundle);
      localObject = localJSONObject;
      return localObject;
    }
    catch (JSONException localJSONException)
    {
      je.b("Error converting Bundle to JSON", localJSONException);
    }
    return null;
  }
  
  public final JSONObject a(Map<String, ?> paramMap)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject();
      Iterator localIterator = paramMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str3 = (String)localIterator.next();
        a(localJSONObject, str3, paramMap.get(str3));
      }
      String str1;
      String str2;
      return localJSONObject;
    }
    catch (ClassCastException localClassCastException)
    {
      str1 = String.valueOf(localClassCastException.getMessage());
      if (str1.length() != 0) {}
      for (str2 = "Could not convert map to JSON: ".concat(str1);; str2 = new String("Could not convert map to JSON: ")) {
        throw new JSONException(str2);
      }
    }
  }
  
  public final void a(Context paramContext, String paramString, WebSettings paramWebSettings)
  {
    paramWebSettings.setUserAgentString(b(paramContext, paramString));
  }
  
  public final void a(Context paramContext, String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      zzbv.zzek();
      paramBundle.putString("device", b());
      paramBundle.putString("eids", TextUtils.join(",", asa.a()));
    }
    aos.a();
    lz.a(paramContext, paramString1, paramString2, paramBundle, paramBoolean, new jq(this, paramContext, paramString1));
  }
  
  public final void a(Context paramContext, String paramString, boolean paramBoolean, HttpURLConnection paramHttpURLConnection)
  {
    paramHttpURLConnection.setConnectTimeout(60000);
    paramHttpURLConnection.setInstanceFollowRedirects(false);
    paramHttpURLConnection.setReadTimeout(60000);
    paramHttpURLConnection.setRequestProperty("User-Agent", b(paramContext, paramString));
    paramHttpURLConnection.setUseCaches(false);
  }
  
  public final void a(Context paramContext, List<String> paramList)
  {
    if (!(paramContext instanceof Activity)) {}
    while (TextUtils.isEmpty(afq.a((Activity)paramContext))) {
      return;
    }
    if (paramList == null)
    {
      je.a("Cannot ping urls: empty list.");
      return;
    }
    if (!asy.a(paramContext))
    {
      je.a("Cannot ping url because custom tabs is not supported");
      return;
    }
    asy localasy = new asy();
    localasy.a(new jo(this, paramList, localasy, paramContext));
    localasy.b((Activity)paramContext);
  }
  
  public final boolean a(View paramView, Context paramContext)
  {
    Context localContext = paramContext.getApplicationContext();
    PowerManager localPowerManager = null;
    if (localContext != null) {
      localPowerManager = (PowerManager)localContext.getSystemService("power");
    }
    return a(paramView, localPowerManager, m(paramContext));
  }
  
  public final boolean a(View paramView, PowerManager paramPowerManager, KeyguardManager paramKeyguardManager)
  {
    boolean bool;
    if (!zzbv.zzek().c)
    {
      if (paramKeyguardManager != null) {
        break label143;
      }
      bool = false;
      if (bool)
      {
        arq localarq2 = asa.bo;
        if ((!((Boolean)aos.f().a(localarq2)).booleanValue()) || (!c(paramView))) {
          break label152;
        }
      }
    }
    int i = 1;
    label53:
    if ((paramView.getVisibility() == 0) && (paramView.isShown()))
    {
      if ((paramPowerManager == null) || (paramPowerManager.isScreenOn())) {}
      for (int j = 1;; j = 0)
      {
        if ((j == 0) || (i == 0)) {
          break label164;
        }
        arq localarq1 = asa.bm;
        if ((((Boolean)aos.f().a(localarq1)).booleanValue()) && (!paramView.getLocalVisibleRect(new Rect())) && (!paramView.getGlobalVisibleRect(new Rect()))) {
          break label164;
        }
        return true;
        bool = paramKeyguardManager.inKeyguardRestrictedInputMode();
        break;
        i = 0;
        break label53;
      }
    }
    label143:
    label152:
    label164:
    return false;
  }
  
  public final String b(Context paramContext, String paramString)
  {
    synchronized (this.b)
    {
      if (this.d != null)
      {
        String str7 = this.d;
        return str7;
      }
      if (paramString == null)
      {
        String str1 = d();
        return str1;
      }
    }
    try
    {
      this.d = zzbv.zzem().a(paramContext);
      label57:
      if (TextUtils.isEmpty(this.d))
      {
        aos.a();
        if (!lz.b())
        {
          this.d = null;
          a.post(new jp(this, paramContext));
          String str5;
          for (;;)
          {
            String str4 = this.d;
            if (str4 != null) {
              break label186;
            }
            try
            {
              this.b.wait();
            }
            catch (InterruptedException localInterruptedException)
            {
              this.d = d();
              str5 = String.valueOf(this.d);
              if (str5.length() == 0) {}
            }
          }
          for (String str6 = "Interrupted, use default user agent: ".concat(str5);; str6 = new String("Interrupted, use default user agent: "))
          {
            je.e(str6);
            break;
          }
        }
        this.d = d(paramContext);
      }
      label186:
      String str2 = String.valueOf(this.d);
      this.d = (10 + String.valueOf(str2).length() + String.valueOf(paramString).length() + str2 + " (Mobile; " + paramString);
      try
      {
        if (c.b(paramContext).a()) {
          this.d = String.valueOf(this.d).concat(";aia");
        }
        this.d = String.valueOf(this.d).concat(")");
        String str3 = this.d;
        return str3;
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          zzbv.zzeo().a(localException2, "AdUtil.getUserAgent");
        }
      }
    }
    catch (Exception localException1)
    {
      break label57;
    }
  }
  
  public final void b(Context paramContext, String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean)
  {
    arq localarq = asa.br;
    if (((Boolean)aos.f().a(localarq)).booleanValue()) {
      a(paramContext, paramString1, paramString2, paramBundle, paramBoolean);
    }
  }
  
  public final boolean b(Context paramContext)
  {
    if (this.e) {
      return false;
    }
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.intent.action.USER_PRESENT");
    localIntentFilter.addAction("android.intent.action.SCREEN_OFF");
    paramContext.getApplicationContext().registerReceiver(new js(this, null), localIntentFilter);
    this.e = true;
    return true;
  }
  
  public final int[] b(Activity paramActivity)
  {
    int[] arrayOfInt1 = a(paramActivity);
    int[] arrayOfInt2 = new int[2];
    aos.a();
    arrayOfInt2[0] = lz.b(paramActivity, arrayOfInt1[0]);
    aos.a();
    arrayOfInt2[1] = lz.b(paramActivity, arrayOfInt1[1]);
    return arrayOfInt2;
  }
  
  public final boolean c(Context paramContext)
  {
    if (this.f) {
      return false;
    }
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
    paramContext.getApplicationContext().registerReceiver(new jr(this, null), localIntentFilter);
    this.f = true;
    return true;
  }
  
  public final int[] c(Activity paramActivity)
  {
    Window localWindow = paramActivity.getWindow();
    int[] arrayOfInt1;
    if (localWindow != null)
    {
      View localView = localWindow.findViewById(16908290);
      if (localView != null)
      {
        arrayOfInt1 = new int[2];
        arrayOfInt1[0] = localView.getTop();
        arrayOfInt1[1] = localView.getBottom();
      }
    }
    for (;;)
    {
      int[] arrayOfInt2 = new int[2];
      aos.a();
      arrayOfInt2[0] = lz.b(paramActivity, arrayOfInt1[0]);
      aos.a();
      arrayOfInt2[1] = lz.b(paramActivity, arrayOfInt1[1]);
      return arrayOfInt2;
      arrayOfInt1 = e();
    }
  }
  
  public final boolean d(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    try
    {
      try
      {
        if (this.g != null)
        {
          arq localarq2 = asa.aq;
          if (((String)aos.f().a(localarq2)).equals(this.g.pattern())) {}
        }
        else
        {
          arq localarq1 = asa.aq;
          this.g = Pattern.compile((String)aos.f().a(localarq1));
        }
        boolean bool = this.g.matcher(paramString).matches();
        return bool;
      }
      finally {}
      return false;
    }
    catch (PatternSyntaxException localPatternSyntaxException) {}
  }
  
  public final boolean e(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    try
    {
      try
      {
        if (this.h != null)
        {
          arq localarq2 = asa.ar;
          if (((String)aos.f().a(localarq2)).equals(this.h.pattern())) {}
        }
        else
        {
          arq localarq1 = asa.ar;
          this.h = Pattern.compile((String)aos.f().a(localarq1));
        }
        boolean bool = this.h.matcher(paramString).matches();
        return bool;
      }
      finally {}
      return false;
    }
    catch (PatternSyntaxException localPatternSyntaxException) {}
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.jn
 * JD-Core Version:    0.7.0.1
 */