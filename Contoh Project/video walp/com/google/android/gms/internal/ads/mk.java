package com.google.android.gms.internal.ads;

import android.util.Log;

@cm
public class mk
{
  private static String a(String paramString)
  {
    StackTraceElement[] arrayOfStackTraceElement = Thread.currentThread().getStackTrace();
    if (arrayOfStackTraceElement.length >= 4)
    {
      int i = arrayOfStackTraceElement[3].getLineNumber();
      paramString = 13 + String.valueOf(paramString).length() + paramString + " @" + i;
    }
    return paramString;
  }
  
  public static void a(String paramString, Throwable paramThrowable)
  {
    if (a(3)) {
      Log.d("Ads", paramString, paramThrowable);
    }
  }
  
  public static boolean a(int paramInt)
  {
    return (paramInt >= 5) || (Log.isLoggable("Ads", paramInt));
  }
  
  public static void b(String paramString)
  {
    if (a(3)) {
      Log.d("Ads", paramString);
    }
  }
  
  public static void b(String paramString, Throwable paramThrowable)
  {
    if (a(6)) {
      Log.e("Ads", paramString, paramThrowable);
    }
  }
  
  public static void c(String paramString)
  {
    if (a(6)) {
      Log.e("Ads", paramString);
    }
  }
  
  public static void c(String paramString, Throwable paramThrowable)
  {
    if (a(5)) {
      Log.w("Ads", paramString, paramThrowable);
    }
  }
  
  public static void d(String paramString)
  {
    if (a(4)) {
      Log.i("Ads", paramString);
    }
  }
  
  public static void d(String paramString, Throwable paramThrowable)
  {
    if (a(5))
    {
      if (paramThrowable != null) {
        c(a(paramString), paramThrowable);
      }
    }
    else {
      return;
    }
    e(a(paramString));
  }
  
  public static void e(String paramString)
  {
    if (a(5)) {
      Log.w("Ads", paramString);
    }
  }
  
  public static void f(String paramString)
  {
    d(paramString, null);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.mk
 * JD-Core Version:    0.7.0.1
 */