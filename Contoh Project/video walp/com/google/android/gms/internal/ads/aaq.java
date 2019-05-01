package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

final class aaq
{
  private static final Class<?> a = ;
  
  public static aar a()
  {
    if (a != null) {
      try
      {
        aar localaar = (aar)a.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
        return localaar;
      }
      catch (Exception localException) {}
    }
    return aar.a;
  }
  
  private static Class<?> b()
  {
    try
    {
      Class localClass = Class.forName("com.google.protobuf.ExtensionRegistry");
      return localClass;
    }
    catch (ClassNotFoundException localClassNotFoundException) {}
    return null;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aaq
 * JD-Core Version:    0.7.0.1
 */