package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.a.b;
import com.google.android.gms.common.a.c;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public final class cg
  implements ck
{
  private static final Object a = new Object();
  private static ck b = null;
  private static ck c = null;
  private final Object d = new Object();
  private final Context e;
  private final WeakHashMap<Thread, Boolean> f = new WeakHashMap();
  private final ExecutorService g = Executors.newCachedThreadPool();
  private final zzang h;
  
  private cg(Context paramContext)
  {
    this(paramContext, zzang.a());
  }
  
  private cg(Context paramContext, zzang paramzzang)
  {
    if (paramContext.getApplicationContext() != null) {
      paramContext = paramContext.getApplicationContext();
    }
    this.e = paramContext;
    this.h = paramzzang;
  }
  
  private final Uri.Builder a(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    try
    {
      boolean bool2 = c.b(this.e).a();
      bool1 = bool2;
    }
    catch (Throwable localThrowable1)
    {
      for (;;)
      {
        Object localObject;
        mk.b("Error fetching instant app info", localThrowable1);
        boolean bool1 = false;
      }
    }
    localObject = "unknown";
    try
    {
      String str3 = this.e.getPackageName();
      localObject = str3;
    }
    catch (Throwable localThrowable2)
    {
      for (;;)
      {
        Uri.Builder localBuilder1;
        String str1;
        Uri.Builder localBuilder2;
        arq localarq;
        mk.e("Cannot obtain package name, proceeding.");
        continue;
        String str2 = 1 + String.valueOf(str1).length() + String.valueOf(str2).length() + str1 + " " + str2;
      }
    }
    localBuilder1 = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(bool1)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
    str1 = Build.MANUFACTURER;
    str2 = Build.MODEL;
    if (str2.startsWith(str1))
    {
      localBuilder2 = localBuilder1.appendQueryParameter("device", str2).appendQueryParameter("js", this.h.a).appendQueryParameter("appid", (String)localObject).appendQueryParameter("exceptiontype", paramString1).appendQueryParameter("stacktrace", paramString2).appendQueryParameter("eids", TextUtils.join(",", asa.a())).appendQueryParameter("exceptionkey", paramString3).appendQueryParameter("cl", "193400285").appendQueryParameter("rc", "dev").appendQueryParameter("session_id", aos.c()).appendQueryParameter("sampling_rate", Integer.toString(paramInt));
      localarq = asa.dj;
      return localBuilder2.appendQueryParameter("pb_tm", String.valueOf(aos.f().a(localarq)));
    }
  }
  
  public static ck a(Context paramContext)
  {
    synchronized (a)
    {
      if (b == null)
      {
        arq localarq = asa.b;
        if (((Boolean)aos.f().a(localarq)).booleanValue()) {
          b = new cg(paramContext);
        }
      }
      else
      {
        return b;
      }
      b = new cl();
    }
  }
  
  public static ck a(Context paramContext, zzang paramzzang)
  {
    for (;;)
    {
      synchronized (a)
      {
        cg localcg;
        Thread localThread;
        if (c == null)
        {
          arq localarq = asa.b;
          if (!((Boolean)aos.f().a(localarq)).booleanValue()) {
            break label144;
          }
          localcg = new cg(paramContext, paramzzang);
          localThread = Looper.getMainLooper().getThread();
          if (localThread == null) {}
        }
        synchronized (localcg.d)
        {
          localcg.f.put(localThread, Boolean.valueOf(true));
          localThread.setUncaughtExceptionHandler(new ci(localcg, localThread.getUncaughtExceptionHandler()));
          Thread.setDefaultUncaughtExceptionHandler(new ch(localcg, Thread.getDefaultUncaughtExceptionHandler()));
          c = localcg;
          return c;
        }
      }
      label144:
      c = new cl();
    }
  }
  
  protected final void a(Thread paramThread, Throwable paramThrowable)
  {
    int i = 1;
    if (paramThrowable != null)
    {
      int j = 0;
      int k = 0;
      for (Throwable localThrowable = paramThrowable; localThrowable != null; localThrowable = localThrowable.getCause()) {
        for (StackTraceElement localStackTraceElement : localThrowable.getStackTrace())
        {
          if (lz.b(localStackTraceElement.getClassName())) {
            k = i;
          }
          if (getClass().getName().equals(localStackTraceElement.getClassName())) {
            j = i;
          }
        }
      }
      if ((k == 0) || (j != 0)) {}
    }
    for (;;)
    {
      if (i != 0) {
        a(paramThrowable, "", 1.0F);
      }
      return;
      i = 0;
    }
  }
  
  public final void a(Throwable paramThrowable, String paramString)
  {
    a(paramThrowable, paramString, 1.0F);
  }
  
  public final void a(Throwable paramThrowable, String paramString, float paramFloat)
  {
    if (lz.a(paramThrowable) == null) {}
    label58:
    label187:
    label191:
    for (;;)
    {
      return;
      String str1 = paramThrowable.getClass().getName();
      StringWriter localStringWriter = new StringWriter();
      ze.a(paramThrowable, new PrintWriter(localStringWriter));
      String str2 = localStringWriter.toString();
      int i;
      if (Math.random() < paramFloat)
      {
        i = 1;
        if (paramFloat <= 0.0F) {
          break label187;
        }
      }
      for (int j = (int)(1.0F / paramFloat);; j = 1)
      {
        if (i == 0) {
          break label191;
        }
        ArrayList localArrayList1 = new ArrayList();
        localArrayList1.add(a(str1, str2, paramString, j).toString());
        ArrayList localArrayList2 = (ArrayList)localArrayList1;
        int k = localArrayList2.size();
        int m = 0;
        while (m < k)
        {
          Object localObject = localArrayList2.get(m);
          m++;
          String str3 = (String)localObject;
          ml localml = new ml();
          this.g.submit(new cj(this, localml, str3));
        }
        break;
        i = 0;
        break label58;
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.cg
 * JD-Core Version:    0.7.0.1
 */