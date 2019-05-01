package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class aar
{
  static final aar a = new aar(true);
  private static volatile boolean b = false;
  private static final Class<?> c = b();
  private final Map<aas, abe.d<?, ?>> d;
  
  aar()
  {
    this.d = new HashMap();
  }
  
  private aar(boolean paramBoolean)
  {
    this.d = Collections.emptyMap();
  }
  
  public static aar a()
  {
    return aaq.a();
  }
  
  private static Class<?> b()
  {
    try
    {
      Class localClass = Class.forName("com.google.protobuf.Extension");
      return localClass;
    }
    catch (ClassNotFoundException localClassNotFoundException) {}
    return null;
  }
  
  public final <ContainingType extends acl> abe.d<ContainingType, ?> a(ContainingType paramContainingType, int paramInt)
  {
    return (abe.d)this.d.get(new aas(paramContainingType, paramInt));
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aar
 * JD-Core Version:    0.7.0.1
 */