package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build.VERSION;
import android.provider.Settings.Global;
import android.util.JsonWriter;
import com.google.android.gms.common.util.c;
import com.google.android.gms.common.util.f;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;

@cm
public final class md
{
  private static Object a = new Object();
  private static boolean b = false;
  private static boolean c = false;
  private static c d = f.d();
  private static final Set<String> e = new HashSet(Arrays.asList(new String[0]));
  private final List<String> f;
  
  public md()
  {
    this(null);
  }
  
  public md(String paramString)
  {
    Object localObject;
    if (!c())
    {
      localObject = new ArrayList();
      this.f = ((List)localObject);
      return;
    }
    String str1 = UUID.randomUUID().toString();
    if (paramString == null)
    {
      String[] arrayOfString2 = new String[1];
      String str6 = String.valueOf(str1);
      if (str6.length() != 0) {}
      for (String str7 = "network_request_".concat(str6);; str7 = new String("network_request_"))
      {
        arrayOfString2[0] = str7;
        localObject = Arrays.asList(arrayOfString2);
        break;
      }
    }
    String[] arrayOfString1 = new String[2];
    String str2 = String.valueOf(paramString);
    String str3;
    label122:
    String str4;
    if (str2.length() != 0)
    {
      str3 = "ad_request_".concat(str2);
      arrayOfString1[0] = str3;
      str4 = String.valueOf(str1);
      if (str4.length() == 0) {
        break label180;
      }
    }
    label180:
    for (String str5 = "network_request_".concat(str4);; str5 = new String("network_request_"))
    {
      arrayOfString1[1] = str5;
      localObject = Arrays.asList(arrayOfString1);
      break;
      str3 = new String("ad_request_");
      break label122;
    }
  }
  
  public static void a()
  {
    synchronized (a)
    {
      b = false;
      c = false;
      mk.e("Ad debug logging enablement is out of date.");
      return;
    }
  }
  
  private static void a(JsonWriter paramJsonWriter, Map<String, ?> paramMap)
  {
    if (paramMap == null) {
      return;
    }
    paramJsonWriter.name("headers").beginArray();
    Iterator localIterator1 = paramMap.entrySet().iterator();
    while (localIterator1.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator1.next();
      String str1 = (String)localEntry.getKey();
      if (!e.contains(str1)) {
        if ((localEntry.getValue() instanceof List))
        {
          Iterator localIterator2 = ((List)localEntry.getValue()).iterator();
          while (localIterator2.hasNext())
          {
            String str2 = (String)localIterator2.next();
            paramJsonWriter.beginObject();
            paramJsonWriter.name("name").value(str1);
            paramJsonWriter.name("value").value(str2);
            paramJsonWriter.endObject();
          }
        }
        else if ((localEntry.getValue() instanceof String))
        {
          paramJsonWriter.beginObject();
          paramJsonWriter.name("name").value(str1);
          paramJsonWriter.name("value").value((String)localEntry.getValue());
          paramJsonWriter.endObject();
        }
        else
        {
          mk.c("Connection headers should be either Map<String, String> or Map<String, List<String>>");
        }
      }
    }
    paramJsonWriter.endArray();
  }
  
  private final void a(String paramString, mj parammj)
  {
    StringWriter localStringWriter = new StringWriter();
    JsonWriter localJsonWriter = new JsonWriter(localStringWriter);
    try
    {
      localJsonWriter.beginObject();
      localJsonWriter.name("timestamp").value(d.a());
      localJsonWriter.name("event").value(paramString);
      localJsonWriter.name("components").beginArray();
      Iterator localIterator = this.f.iterator();
      while (localIterator.hasNext())
      {
        localJsonWriter.value((String)localIterator.next());
        continue;
        c(localStringWriter.toString());
      }
    }
    catch (IOException localIOException)
    {
      mk.b("unable to log", localIOException);
    }
    for (;;)
    {
      return;
      localJsonWriter.endArray();
      parammj.a(localJsonWriter);
      localJsonWriter.endObject();
      localJsonWriter.flush();
      localJsonWriter.close();
    }
  }
  
  public static void a(boolean paramBoolean)
  {
    synchronized (a)
    {
      b = true;
      c = paramBoolean;
      return;
    }
  }
  
  public static boolean a(Context paramContext)
  {
    if (Build.VERSION.SDK_INT < 17) {
      return false;
    }
    arq localarq = asa.bh;
    if (!((Boolean)aos.f().a(localarq)).booleanValue()) {
      return false;
    }
    try
    {
      int i = Settings.Global.getInt(paramContext.getContentResolver(), "development_settings_enabled", 0);
      return i != 0;
    }
    catch (Exception localException)
    {
      mk.c("Fail to determine debug setting.", localException);
    }
    return false;
  }
  
  private final void b(String paramString)
  {
    a("onNetworkRequestError", new mi(paramString));
  }
  
  private final void b(String paramString1, String paramString2, Map<String, ?> paramMap, byte[] paramArrayOfByte)
  {
    a("onNetworkRequest", new me(paramString1, paramString2, paramMap, paramArrayOfByte));
  }
  
  private final void b(Map<String, ?> paramMap, int paramInt)
  {
    a("onNetworkResponse", new mg(paramInt, paramMap));
  }
  
  public static boolean b()
  {
    synchronized (a)
    {
      boolean bool = b;
      return bool;
    }
  }
  
  private static void c(String paramString)
  {
    try
    {
      mk.d("GMA Debug BEGIN");
      int i = 0;
      if (i < paramString.length())
      {
        String str1 = String.valueOf(paramString.substring(i, Math.min(i + 4000, paramString.length())));
        if (str1.length() != 0) {}
        for (String str2 = "GMA Debug CONTENT ".concat(str1);; str2 = new String("GMA Debug CONTENT "))
        {
          mk.d(str2);
          i += 4000;
          break;
        }
      }
      mk.d("GMA Debug FINISH");
    }
    finally {}
  }
  
  public static boolean c()
  {
    for (;;)
    {
      synchronized (a)
      {
        if ((b) && (c))
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public final void a(String paramString)
  {
    if (!c()) {}
    while (paramString == null) {
      return;
    }
    a(paramString.getBytes());
  }
  
  public final void a(String paramString1, String paramString2, Map<String, ?> paramMap, byte[] paramArrayOfByte)
  {
    if (!c()) {
      return;
    }
    b(paramString1, paramString2, paramMap, paramArrayOfByte);
  }
  
  public final void a(HttpURLConnection paramHttpURLConnection, int paramInt)
  {
    if (!c()) {
      return;
    }
    if (paramHttpURLConnection.getHeaderFields() == null) {}
    String str3;
    for (Object localObject = null;; localObject = new HashMap(paramHttpURLConnection.getHeaderFields()))
    {
      b((Map)localObject, paramInt);
      if ((paramInt >= 200) && (paramInt < 300)) {
        break;
      }
      try
      {
        String str4 = paramHttpURLConnection.getResponseMessage();
        str3 = str4;
        b(str3);
        return;
      }
      catch (IOException localIOException)
      {
        str1 = String.valueOf(localIOException.getMessage());
        if (str1.length() == 0) {
          break label109;
        }
      }
    }
    String str1;
    label109:
    for (String str2 = "Can not get error message from error HttpURLConnection\n".concat(str1);; str2 = new String("Can not get error message from error HttpURLConnection\n"))
    {
      mk.e(str2);
      str3 = null;
      break;
    }
  }
  
  public final void a(HttpURLConnection paramHttpURLConnection, byte[] paramArrayOfByte)
  {
    if (!c()) {
      return;
    }
    if (paramHttpURLConnection.getRequestProperties() == null) {}
    for (Object localObject = null;; localObject = new HashMap(paramHttpURLConnection.getRequestProperties()))
    {
      b(new String(paramHttpURLConnection.getURL().toString()), new String(paramHttpURLConnection.getRequestMethod()), (Map)localObject, paramArrayOfByte);
      return;
    }
  }
  
  public final void a(Map<String, ?> paramMap, int paramInt)
  {
    if (!c()) {}
    do
    {
      return;
      b(paramMap, paramInt);
    } while ((paramInt >= 200) && (paramInt < 300));
    b(null);
  }
  
  public final void a(byte[] paramArrayOfByte)
  {
    a("onNetworkResponseBody", new mh(paramArrayOfByte));
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.md
 * JD-Core Version:    0.7.0.1
 */