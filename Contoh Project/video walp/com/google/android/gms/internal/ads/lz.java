package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.search.SearchAdView;
import com.google.android.gms.common.d;
import com.google.android.gms.common.util.k;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.UUID;

@cm
public final class lz
{
  public static final Handler a = new Handler(Looper.getMainLooper());
  private static final String b = AdView.class.getName();
  private static final String c = InterstitialAd.class.getName();
  private static final String d = PublisherAdView.class.getName();
  private static final String e = PublisherInterstitialAd.class.getName();
  private static final String f = SearchAdView.class.getName();
  private static final String g = AdLoader.class.getName();
  
  public static int a(Context paramContext, int paramInt)
  {
    return a(paramContext.getResources().getDisplayMetrics(), paramInt);
  }
  
  public static int a(DisplayMetrics paramDisplayMetrics, int paramInt)
  {
    return (int)TypedValue.applyDimension(1, paramInt, paramDisplayMetrics);
  }
  
  public static String a(Context paramContext)
  {
    ContentResolver localContentResolver = paramContext.getContentResolver();
    if (localContentResolver == null) {}
    for (String str = null;; str = Settings.Secure.getString(localContentResolver, "android_id"))
    {
      if ((str == null) || (a())) {
        str = "emulator";
      }
      return a(str);
    }
  }
  
  public static String a(String paramString)
  {
    int i = 0;
    for (;;)
    {
      Object localObject = null;
      if (i < 2) {}
      try
      {
        MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
        localMessageDigest.update(paramString.getBytes());
        Locale localLocale = Locale.US;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = new BigInteger(1, localMessageDigest.digest());
        String str = String.format(localLocale, "%032X", arrayOfObject);
        localObject = str;
        return localObject;
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        i++;
      }
      catch (ArithmeticException localArithmeticException) {}
    }
    return null;
  }
  
  public static String a(StackTraceElement[] paramArrayOfStackTraceElement, String paramString)
  {
    int i = 0;
    if (i + 1 < paramArrayOfStackTraceElement.length)
    {
      StackTraceElement localStackTraceElement = paramArrayOfStackTraceElement[i];
      String str2 = localStackTraceElement.getClassName();
      if ((!"loadAd".equalsIgnoreCase(localStackTraceElement.getMethodName())) || ((!b.equalsIgnoreCase(str2)) && (!c.equalsIgnoreCase(str2)) && (!d.equalsIgnoreCase(str2)) && (!e.equalsIgnoreCase(str2)) && (!f.equalsIgnoreCase(str2)) && (!g.equalsIgnoreCase(str2)))) {}
    }
    for (String str1 = paramArrayOfStackTraceElement[(i + 1)].getClassName();; str1 = null)
    {
      if (paramString != null)
      {
        StringTokenizer localStringTokenizer = new StringTokenizer(paramString, ".");
        StringBuilder localStringBuilder = new StringBuilder();
        int j = 2;
        if (localStringTokenizer.hasMoreElements())
        {
          localStringBuilder.append(localStringTokenizer.nextToken());
          for (;;)
          {
            int k = j - 1;
            if ((j <= 0) || (!localStringTokenizer.hasMoreElements())) {
              break;
            }
            localStringBuilder.append(".").append(localStringTokenizer.nextToken());
            j = k;
          }
          i++;
          break;
          paramString = localStringBuilder.toString();
        }
        if ((str1 != null) && (!str1.contains(paramString))) {
          return str1;
        }
      }
      return null;
    }
  }
  
  public static Throwable a(Throwable paramThrowable)
  {
    arq localarq = asa.d;
    if (((Boolean)aos.f().a(localarq)).booleanValue()) {
      return paramThrowable;
    }
    LinkedList localLinkedList = new LinkedList();
    while (paramThrowable != null)
    {
      localLinkedList.push(paramThrowable);
      paramThrowable = paramThrowable.getCause();
    }
    Object localObject1 = null;
    Throwable localThrowable;
    label222:
    Object localObject2;
    if (!localLinkedList.isEmpty())
    {
      localThrowable = (Throwable)localLinkedList.pop();
      StackTraceElement[] arrayOfStackTraceElement = localThrowable.getStackTrace();
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(new StackTraceElement(localThrowable.getClass().getName(), "<filtered>", "<filtered>", 1));
      int i = arrayOfStackTraceElement.length;
      int j = 0;
      int k = 0;
      if (j < i)
      {
        StackTraceElement localStackTraceElement = arrayOfStackTraceElement[j];
        if (b(localStackTraceElement.getClassName()))
        {
          localArrayList.add(localStackTraceElement);
          k = 1;
        }
        for (;;)
        {
          j++;
          break;
          String str = localStackTraceElement.getClassName();
          if ((!TextUtils.isEmpty(str)) && ((str.startsWith("android.")) || (str.startsWith("java.")))) {}
          for (int m = 1;; m = 0)
          {
            if (m == 0) {
              break label222;
            }
            localArrayList.add(localStackTraceElement);
            break;
          }
          localArrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
        }
      }
      if (k == 0) {
        break label311;
      }
      if (localObject1 == null)
      {
        localObject2 = new Throwable(localThrowable.getMessage());
        label268:
        ((Throwable)localObject2).setStackTrace((StackTraceElement[])localArrayList.toArray(new StackTraceElement[0]));
      }
    }
    for (;;)
    {
      localObject1 = localObject2;
      break;
      localObject2 = new Throwable(localThrowable.getMessage(), localObject1);
      break label268;
      return localObject1;
      label311:
      localObject2 = localObject1;
    }
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean, mc parammc)
  {
    if (paramBoolean)
    {
      Context localContext = paramContext.getApplicationContext();
      if (localContext == null) {
        localContext = paramContext;
      }
      paramBundle.putString("os", Build.VERSION.RELEASE);
      paramBundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
      paramBundle.putString("appid", localContext.getPackageName());
      if (paramString1 == null)
      {
        int i = d.a().b(paramContext);
        paramString1 = 20 + i + ".12451000";
      }
      paramBundle.putString("js", paramString1);
    }
    Uri.Builder localBuilder = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", paramString2);
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localBuilder.appendQueryParameter(str, paramBundle.getString(str));
    }
    parammc.a(localBuilder.toString());
  }
  
  private final void a(ViewGroup paramViewGroup, zzjn paramzzjn, String paramString, int paramInt1, int paramInt2)
  {
    if (paramViewGroup.getChildCount() != 0) {
      return;
    }
    Context localContext = paramViewGroup.getContext();
    TextView localTextView = new TextView(localContext);
    localTextView.setGravity(17);
    localTextView.setText(paramString);
    localTextView.setTextColor(paramInt1);
    localTextView.setBackgroundColor(paramInt2);
    FrameLayout localFrameLayout = new FrameLayout(localContext);
    localFrameLayout.setBackgroundColor(paramInt1);
    int i = a(localContext, 3);
    localFrameLayout.addView(localTextView, new FrameLayout.LayoutParams(paramzzjn.f - i, paramzzjn.c - i, 17));
    paramViewGroup.addView(localFrameLayout, paramzzjn.f, paramzzjn.c);
  }
  
  public static void a(boolean paramBoolean, HttpURLConnection paramHttpURLConnection, String paramString)
  {
    paramHttpURLConnection.setConnectTimeout(60000);
    paramHttpURLConnection.setInstanceFollowRedirects(true);
    paramHttpURLConnection.setReadTimeout(60000);
    if (paramString != null) {
      paramHttpURLConnection.setRequestProperty("User-Agent", paramString);
    }
    paramHttpURLConnection.setUseCaches(false);
  }
  
  public static boolean a()
  {
    return Build.DEVICE.startsWith("generic");
  }
  
  public static int b(Context paramContext, int paramInt)
  {
    Display localDisplay = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    localDisplay.getMetrics(localDisplayMetrics);
    return b(localDisplayMetrics, paramInt);
  }
  
  public static int b(DisplayMetrics paramDisplayMetrics, int paramInt)
  {
    return Math.round(paramInt / paramDisplayMetrics.density);
  }
  
  public static String b(Context paramContext)
  {
    ContentResolver localContentResolver = paramContext.getContentResolver();
    if (localContentResolver == null) {
      return null;
    }
    return Settings.Secure.getString(localContentResolver, "android_id");
  }
  
  public static boolean b()
  {
    return Looper.myLooper() == Looper.getMainLooper();
  }
  
  public static boolean b(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    arq localarq = asa.e;
    if (paramString.startsWith((String)aos.f().a(localarq))) {
      return true;
    }
    String str1;
    try
    {
      boolean bool = Class.forName(paramString).isAnnotationPresent(cm.class);
      return bool;
    }
    catch (Exception localException)
    {
      str1 = String.valueOf(paramString);
      if (str1.length() == 0) {}
    }
    for (String str2 = "Fail to check class type for class ".concat(str1);; str2 = new String("Fail to check class type for class "))
    {
      mk.a(str2, localException);
      return false;
    }
  }
  
  public static String c()
  {
    UUID localUUID = UUID.randomUUID();
    byte[] arrayOfByte1 = BigInteger.valueOf(localUUID.getLeastSignificantBits()).toByteArray();
    byte[] arrayOfByte2 = BigInteger.valueOf(localUUID.getMostSignificantBits()).toByteArray();
    Object localObject = new BigInteger(1, arrayOfByte1).toString();
    int i = 0;
    while (i < 2) {
      try
      {
        MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
        localMessageDigest.update(arrayOfByte1);
        localMessageDigest.update(arrayOfByte2);
        byte[] arrayOfByte3 = new byte[8];
        System.arraycopy(localMessageDigest.digest(), 0, arrayOfByte3, 0, 8);
        String str = new BigInteger(1, arrayOfByte3).toString();
        localObject = str;
        label105:
        i++;
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        break label105;
      }
    }
    return localObject;
  }
  
  public static boolean c(Context paramContext)
  {
    return d.a().a(paramContext, 12451000) == 0;
  }
  
  public static int d(Context paramContext)
  {
    return DynamiteModule.b(paramContext, "com.google.android.gms.ads.dynamite");
  }
  
  public static int e(Context paramContext)
  {
    return DynamiteModule.a(paramContext, "com.google.android.gms.ads.dynamite");
  }
  
  public static boolean f(Context paramContext)
  {
    int i = d.a().a(paramContext, 12451000);
    return (i == 0) || (i == 2);
  }
  
  public static boolean g(Context paramContext)
  {
    if (paramContext.getResources().getConfiguration().orientation != 2) {}
    DisplayMetrics localDisplayMetrics;
    do
    {
      return false;
      localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
    } while ((int)(localDisplayMetrics.heightPixels / localDisplayMetrics.density) >= 600);
    return true;
  }
  
  @TargetApi(17)
  public static boolean h(Context paramContext)
  {
    DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
    Display localDisplay = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    int i;
    int k;
    if (k.e())
    {
      localDisplay.getRealMetrics(localDisplayMetrics);
      i = localDisplayMetrics.heightPixels;
      k = localDisplayMetrics.widthPixels;
    }
    for (;;)
    {
      localDisplay.getMetrics(localDisplayMetrics);
      int m = localDisplayMetrics.heightPixels;
      int n = localDisplayMetrics.widthPixels;
      if ((m == i) && (n == k))
      {
        return true;
        try
        {
          i = ((Integer)Display.class.getMethod("getRawHeight", new Class[0]).invoke(localDisplay, new Object[0])).intValue();
          int j = ((Integer)Display.class.getMethod("getRawWidth", new Class[0]).invoke(localDisplay, new Object[0])).intValue();
          k = j;
        }
        catch (Exception localException)
        {
          return false;
        }
      }
    }
    return false;
  }
  
  public static int i(Context paramContext)
  {
    int i = paramContext.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
    if (i > 0) {
      return paramContext.getResources().getDimensionPixelSize(i);
    }
    return 0;
  }
  
  public final void a(Context paramContext, String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean)
  {
    a(paramContext, null, paramString2, paramBundle, true, new ma(this));
  }
  
  public final void a(ViewGroup paramViewGroup, zzjn paramzzjn, String paramString)
  {
    a(paramViewGroup, paramzzjn, paramString, -16777216, -1);
  }
  
  public final void a(ViewGroup paramViewGroup, zzjn paramzzjn, String paramString1, String paramString2)
  {
    mk.e(paramString2);
    a(paramViewGroup, paramzzjn, paramString1, -65536, -16777216);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.lz
 * JD-Core Version:    0.7.0.1
 */