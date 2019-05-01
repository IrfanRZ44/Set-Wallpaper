package com.google.android.gms.a;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.b.b;

public abstract interface a
  extends IInterface
{
  public static class a
    extends b
    implements a
  {
    public a()
    {
      super();
    }
    
    public static a a(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
      if ((localIInterface instanceof a)) {
        return (a)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public static class a
      extends com.google.android.gms.internal.b.a
      implements a
    {
      a(IBinder paramIBinder)
      {
        super("com.google.android.gms.dynamic.IObjectWrapper");
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.a.a
 * JD-Core Version:    0.7.0.1
 */