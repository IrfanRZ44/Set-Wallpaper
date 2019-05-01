package org.greenrobot.eventbus;

import java.lang.reflect.Method;

public class o
{
  final Method a;
  final ThreadMode b;
  final Class<?> c;
  final int d;
  final boolean e;
  String f;
  
  public o(Method paramMethod, Class<?> paramClass, ThreadMode paramThreadMode, int paramInt, boolean paramBoolean)
  {
    this.a = paramMethod;
    this.b = paramThreadMode;
    this.c = paramClass;
    this.d = paramInt;
    this.e = paramBoolean;
  }
  
  private void a()
  {
    try
    {
      if (this.f == null)
      {
        StringBuilder localStringBuilder = new StringBuilder(64);
        localStringBuilder.append(this.a.getDeclaringClass().getName());
        localStringBuilder.append('#').append(this.a.getName());
        localStringBuilder.append('(').append(this.c.getName());
        this.f = localStringBuilder.toString();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof o))
    {
      a();
      o localo = (o)paramObject;
      localo.a();
      return this.f.equals(localo.f);
    }
    return false;
  }
  
  public int hashCode()
  {
    return this.a.hashCode();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     org.greenrobot.eventbus.o
 * JD-Core Version:    0.7.0.1
 */