package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

@cm
public final class ko
{
  private final Object a = new Object();
  @GuardedBy("mLock")
  private String b = "";
  @GuardedBy("mLock")
  private String c = "";
  @GuardedBy("mLock")
  private boolean d = false;
  private String e = "";
  
  private final String a(Context paramContext)
  {
    synchronized (this.a)
    {
      if (TextUtils.isEmpty(this.b))
      {
        zzbv.zzek();
        this.b = jn.c(paramContext, "debug_signals_id.txt");
        if (TextUtils.isEmpty(this.b))
        {
          zzbv.zzek();
          this.b = jn.a();
          zzbv.zzek();
          jn.b(paramContext, "debug_signals_id.txt", this.b);
        }
      }
      String str = this.b;
      return str;
    }
  }
  
  private final void a(Context paramContext, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (!(paramContext instanceof Activity))
    {
      je.d("Can not create dialog without Activity Context");
      return;
    }
    jn.a.post(new kp(this, paramContext, paramString, paramBoolean1, paramBoolean2));
  }
  
  /* Error */
  private final boolean b(Context paramContext, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: getstatic 91	com/google/android/gms/internal/ads/asa:cT	Lcom/google/android/gms/internal/ads/arq;
    //   3: astore 4
    //   5: aload_1
    //   6: aload_0
    //   7: aload_1
    //   8: invokestatic 97	com/google/android/gms/internal/ads/aos:f	()Lcom/google/android/gms/internal/ads/ary;
    //   11: aload 4
    //   13: invokevirtual 102	com/google/android/gms/internal/ads/ary:a	(Lcom/google/android/gms/internal/ads/arq;)Ljava/lang/Object;
    //   16: checkcast 104	java/lang/String
    //   19: aload_2
    //   20: aload_3
    //   21: invokespecial 107	com/google/android/gms/internal/ads/ko:c	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;
    //   24: invokevirtual 112	android/net/Uri:toString	()Ljava/lang/String;
    //   27: aload_3
    //   28: invokestatic 115	com/google/android/gms/internal/ads/ko:d	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   31: astore 5
    //   33: aload 5
    //   35: invokestatic 39	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   38: ifeq +10 -> 48
    //   41: ldc 117
    //   43: invokestatic 119	com/google/android/gms/internal/ads/je:b	(Ljava/lang/String;)V
    //   46: iconst_0
    //   47: ireturn
    //   48: aload 5
    //   50: invokevirtual 122	java/lang/String:trim	()Ljava/lang/String;
    //   53: astore 6
    //   55: new 124	org/json/JSONObject
    //   58: dup
    //   59: aload 6
    //   61: invokespecial 126	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   64: astore 7
    //   66: aload 7
    //   68: ldc 128
    //   70: invokevirtual 132	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   73: astore 9
    //   75: aload_0
    //   76: aload 7
    //   78: ldc 134
    //   80: invokevirtual 132	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   83: putfield 32	com/google/android/gms/internal/ads/ko:e	Ljava/lang/String;
    //   86: aload_0
    //   87: getfield 22	com/google/android/gms/internal/ads/ko:a	Ljava/lang/Object;
    //   90: astore 10
    //   92: aload 10
    //   94: monitorenter
    //   95: aload_0
    //   96: aload 9
    //   98: putfield 28	com/google/android/gms/internal/ads/ko:c	Ljava/lang/String;
    //   101: aload 10
    //   103: monitorexit
    //   104: iconst_1
    //   105: ireturn
    //   106: astore 8
    //   108: ldc 136
    //   110: aload 8
    //   112: invokestatic 139	com/google/android/gms/internal/ads/je:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   115: iconst_0
    //   116: ireturn
    //   117: astore 11
    //   119: aload 10
    //   121: monitorexit
    //   122: aload 11
    //   124: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	125	0	this	ko
    //   0	125	1	paramContext	Context
    //   0	125	2	paramString1	String
    //   0	125	3	paramString2	String
    //   3	9	4	localarq	arq
    //   31	18	5	str1	String
    //   53	7	6	str2	String
    //   64	13	7	localJSONObject	JSONObject
    //   106	5	8	localJSONException	JSONException
    //   73	24	9	str3	String
    //   117	6	11	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   55	86	106	org/json/JSONException
    //   95	104	117	finally
    //   119	122	117	finally
  }
  
  private final Uri c(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    Uri.Builder localBuilder = Uri.parse(paramString1).buildUpon();
    localBuilder.appendQueryParameter("linkedDeviceId", a(paramContext));
    localBuilder.appendQueryParameter("adSlotPath", paramString2);
    localBuilder.appendQueryParameter("afmaVersion", paramString3);
    return localBuilder.build();
  }
  
  private final boolean c(Context paramContext, String paramString1, String paramString2)
  {
    arq localarq = asa.cU;
    String str1 = d(paramContext, c(paramContext, (String)aos.f().a(localarq), paramString1, paramString2).toString(), paramString2);
    if (TextUtils.isEmpty(str1))
    {
      je.b("Not linked for debug signals.");
      return false;
    }
    String str2 = str1.trim();
    try
    {
      String str3 = new JSONObject(str2).optString("debug_mode");
      boolean bool = "1".equals(str3);
      synchronized (this.a)
      {
        this.d = bool;
        return bool;
      }
      return false;
    }
    catch (JSONException localJSONException)
    {
      je.c("Fail to get debug mode response json.", localJSONException);
    }
  }
  
  private static String d(Context paramContext, String paramString1, String paramString2)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("User-Agent", zzbv.zzek().b(paramContext, paramString2));
    ne localne = new kx(paramContext).a(paramString1, localHashMap);
    String str1;
    try
    {
      arq localarq = asa.cW;
      String str7 = (String)localne.get(((Integer)aos.f().a(localarq)).intValue(), TimeUnit.MILLISECONDS);
      return str7;
    }
    catch (TimeoutException localTimeoutException)
    {
      String str5 = String.valueOf(paramString1);
      if (str5.length() != 0) {}
      for (String str6 = "Timeout while retriving a response from: ".concat(str5);; str6 = new String("Timeout while retriving a response from: "))
      {
        je.b(str6, localTimeoutException);
        localne.cancel(true);
        return null;
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      String str3 = String.valueOf(paramString1);
      if (str3.length() != 0) {}
      for (String str4 = "Interrupted while retriving a response from: ".concat(str3);; str4 = new String("Interrupted while retriving a response from: "))
      {
        je.b(str4, localInterruptedException);
        localne.cancel(true);
        break;
      }
    }
    catch (Exception localException)
    {
      str1 = String.valueOf(paramString1);
      if (str1.length() == 0) {}
    }
    for (String str2 = "Error retriving a response from: ".concat(str1);; str2 = new String("Error retriving a response from: "))
    {
      je.b(str2, localException);
      break;
    }
  }
  
  private final void e(Context paramContext, String paramString1, String paramString2)
  {
    zzbv.zzek();
    arq localarq = asa.cS;
    jn.a(paramContext, c(paramContext, (String)aos.f().a(localarq), paramString1, paramString2));
  }
  
  public final String a()
  {
    synchronized (this.a)
    {
      String str = this.c;
      return str;
    }
  }
  
  public final void a(Context paramContext, String paramString1, String paramString2)
  {
    if (!b(paramContext, paramString1, paramString2)) {
      a(paramContext, "In-app preview failed to load because of a system error. Please try again later.", true, true);
    }
    do
    {
      return;
      if ("2".equals(this.e))
      {
        je.b("Creative is not pushed for this device.");
        a(paramContext, "There was no creative pushed from DFP to the device.", false, false);
        return;
      }
      if ("1".equals(this.e))
      {
        je.b("The app is not linked for creative preview.");
        e(paramContext, paramString1, paramString2);
        return;
      }
    } while (!"0".equals(this.e));
    je.b("Device is linked for in app preview.");
    a(paramContext, "The device is successfully linked for creative preview.", false, true);
  }
  
  public final void a(Context paramContext, String paramString1, String paramString2, @Nullable String paramString3)
  {
    boolean bool = b();
    if (c(paramContext, paramString1, paramString2))
    {
      if ((!bool) && (!TextUtils.isEmpty(paramString3))) {
        b(paramContext, paramString2, paramString3, paramString1);
      }
      je.b("Device is linked for debug signals.");
      a(paramContext, "The device is successfully linked for troubleshooting.", false, true);
      return;
    }
    e(paramContext, paramString1, paramString2);
  }
  
  public final void b(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    arq localarq = asa.cV;
    Uri.Builder localBuilder = c(paramContext, (String)aos.f().a(localarq), paramString3, paramString1).buildUpon();
    localBuilder.appendQueryParameter("debugData", paramString2);
    zzbv.zzek();
    jn.a(paramContext, paramString1, localBuilder.build().toString());
  }
  
  public final boolean b()
  {
    synchronized (this.a)
    {
      boolean bool = this.d;
      return bool;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ko
 * JD-Core Version:    0.7.0.1
 */