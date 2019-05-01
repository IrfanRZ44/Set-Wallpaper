package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class acy
{
  private static final acy a = new acy();
  private final adf b;
  private final ConcurrentMap<Class<?>, ade<?>> c = new ConcurrentHashMap();
  
  private acy()
  {
    Object localObject = null;
    String[] arrayOfString = { "com.google.protobuf.AndroidProto3SchemaFactory" };
    for (int i = 0; i <= 0; i++)
    {
      localObject = a(arrayOfString[0]);
      if (localObject != null) {
        break;
      }
    }
    if (localObject == null) {
      localObject = new aca();
    }
    this.b = ((adf)localObject);
  }
  
  public static acy a()
  {
    return a;
  }
  
  private static adf a(String paramString)
  {
    try
    {
      adf localadf = (adf)Class.forName(paramString).getConstructor(new Class[0]).newInstance(new Object[0]);
      return localadf;
    }
    catch (Throwable localThrowable) {}
    return null;
  }
  
  public final <T> ade<T> a(Class<T> paramClass)
  {
    abg.a(paramClass, "messageType");
    ade localade1 = (ade)this.c.get(paramClass);
    ade localade2;
    if (localade1 == null)
    {
      localade2 = this.b.a(paramClass);
      abg.a(paramClass, "messageType");
      abg.a(localade2, "schema");
      localade1 = (ade)this.c.putIfAbsent(paramClass, localade2);
      if (localade1 == null) {}
    }
    else
    {
      return localade1;
    }
    return localade2;
  }
  
  public final <T> ade<T> a(T paramT)
  {
    return a(paramT.getClass());
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.acy
 * JD-Core Version:    0.7.0.1
 */