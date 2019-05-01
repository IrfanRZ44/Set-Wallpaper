package org.greenrobot.eventbus;

import android.os.Looper;

public abstract interface h
{
  public abstract l a(c paramc);
  
  public abstract boolean a();
  
  public static class a
    implements h
  {
    private final Looper a;
    
    public a(Looper paramLooper)
    {
      this.a = paramLooper;
    }
    
    public l a(c paramc)
    {
      return new f(paramc, this.a, 10);
    }
    
    public boolean a()
    {
      return this.a == Looper.myLooper();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     org.greenrobot.eventbus.h
 * JD-Core Version:    0.7.0.1
 */