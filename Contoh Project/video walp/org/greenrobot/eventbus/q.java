package org.greenrobot.eventbus;

final class q
{
  final Object a;
  final o b;
  volatile boolean c;
  
  q(Object paramObject, o paramo)
  {
    this.a = paramObject;
    this.b = paramo;
    this.c = true;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof q;
    boolean bool2 = false;
    if (bool1)
    {
      q localq = (q)paramObject;
      Object localObject1 = this.a;
      Object localObject2 = localq.a;
      bool2 = false;
      if (localObject1 == localObject2)
      {
        boolean bool3 = this.b.equals(localq.b);
        bool2 = false;
        if (bool3) {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
  
  public int hashCode()
  {
    return this.a.hashCode() + this.b.f.hashCode();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     org.greenrobot.eventbus.q
 * JD-Core Version:    0.7.0.1
 */