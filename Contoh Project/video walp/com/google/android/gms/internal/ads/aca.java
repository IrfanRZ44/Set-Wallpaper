package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

final class aca
  implements adf
{
  private static final ack b = new acb();
  private final ack a;
  
  public aca()
  {
    this(new acc(arrayOfack));
  }
  
  private aca(ack paramack)
  {
    this.a = ((ack)abg.a(paramack, "messageInfoFactory"));
  }
  
  private static ack a()
  {
    try
    {
      ack localack = (ack)Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
      return localack;
    }
    catch (Exception localException) {}
    return b;
  }
  
  private static boolean a(acj paramacj)
  {
    return paramacj.a() == abe.e.h;
  }
  
  public final <T> ade<T> a(Class<T> paramClass)
  {
    adg.a(paramClass);
    acj localacj = this.a.b(paramClass);
    if (localacj.b())
    {
      if (abe.class.isAssignableFrom(paramClass)) {
        return acs.a(adg.c(), aav.a(), localacj.c());
      }
      return acs.a(adg.a(), aav.b(), localacj.c());
    }
    if (abe.class.isAssignableFrom(paramClass))
    {
      if (a(localacj)) {
        return acp.a(paramClass, localacj, acw.b(), abv.b(), adg.c(), aav.a(), aci.b());
      }
      return acp.a(paramClass, localacj, acw.b(), abv.b(), adg.c(), null, aci.b());
    }
    if (a(localacj)) {
      return acp.a(paramClass, localacj, acw.a(), abv.a(), adg.a(), aav.b(), aci.a());
    }
    return acp.a(paramClass, localacj, acw.a(), abv.a(), adg.b(), null, aci.a());
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aca
 * JD-Core Version:    0.7.0.1
 */