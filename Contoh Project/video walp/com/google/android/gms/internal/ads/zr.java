package com.google.android.gms.internal.ads;

final class zr
{
  private static final Class<?> a = a("libcore.io.Memory");
  private static final boolean b;
  
  static
  {
    if (a("org.robolectric.Robolectric") != null) {}
    for (boolean bool = true;; bool = false)
    {
      b = bool;
      return;
    }
  }
  
  private static <T> Class<T> a(String paramString)
  {
    try
    {
      Class localClass = Class.forName(paramString);
      return localClass;
    }
    catch (Throwable localThrowable) {}
    return null;
  }
  
  static boolean a()
  {
    return (a != null) && (!b);
  }
  
  static Class<?> b()
  {
    return a;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.zr
 * JD-Core Version:    0.7.0.1
 */