package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONObject;

@cm
public abstract class arq<T>
{
  private final int a;
  private final String b;
  private final T c;
  
  private arq(int paramInt, String paramString, T paramT)
  {
    this.a = paramInt;
    this.b = paramString;
    this.c = paramT;
    aos.e().a(this);
  }
  
  public static arq<String> a(int paramInt, String paramString)
  {
    arq localarq = a(paramInt, paramString, null);
    aos.e().b(localarq);
    return localarq;
  }
  
  public static arq<Float> a(int paramInt, String paramString, float paramFloat)
  {
    return new aru(paramInt, paramString, Float.valueOf(paramFloat));
  }
  
  public static arq<Integer> a(int paramInt1, String paramString, int paramInt2)
  {
    return new ars(paramInt1, paramString, Integer.valueOf(paramInt2));
  }
  
  public static arq<Long> a(int paramInt, String paramString, long paramLong)
  {
    return new art(paramInt, paramString, Long.valueOf(paramLong));
  }
  
  public static arq<Boolean> a(int paramInt, String paramString, Boolean paramBoolean)
  {
    return new arr(paramInt, paramString, paramBoolean);
  }
  
  public static arq<String> a(int paramInt, String paramString1, String paramString2)
  {
    return new arv(paramInt, paramString1, paramString2);
  }
  
  public static arq<String> b(int paramInt, String paramString)
  {
    arq localarq = a(paramInt, paramString, null);
    aos.e().c(localarq);
    return localarq;
  }
  
  protected abstract T a(SharedPreferences paramSharedPreferences);
  
  protected abstract T a(JSONObject paramJSONObject);
  
  public final String a()
  {
    return this.b;
  }
  
  public abstract void a(SharedPreferences.Editor paramEditor, T paramT);
  
  public final T b()
  {
    return this.c;
  }
  
  public final int c()
  {
    return this.a;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.arq
 * JD-Core Version:    0.7.0.1
 */