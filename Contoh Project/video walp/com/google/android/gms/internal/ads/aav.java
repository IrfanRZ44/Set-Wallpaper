package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;

final class aav
{
  private static final aat<?> a = new aau();
  private static final aat<?> b = c();
  
  static aat<?> a()
  {
    return a;
  }
  
  static aat<?> b()
  {
    if (b == null) {
      throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
    return b;
  }
  
  private static aat<?> c()
  {
    try
    {
      aat localaat = (aat)Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
      return localaat;
    }
    catch (Exception localException) {}
    return null;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aav
 * JD-Core Version:    0.7.0.1
 */