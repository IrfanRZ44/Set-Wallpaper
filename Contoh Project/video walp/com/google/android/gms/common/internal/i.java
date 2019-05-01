package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.a.a;
import com.google.android.gms.internal.b.b;
import com.google.android.gms.internal.b.c;

public abstract interface i
  extends IInterface
{
  public abstract com.google.android.gms.a.a b();
  
  public abstract int c();
  
  public static abstract class a
    extends b
    implements i
  {
    public a()
    {
      super();
    }
    
    public static i a(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
      if ((localIInterface instanceof i)) {
        return (i)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    protected boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      switch (paramInt1)
      {
      default: 
        return false;
      case 1: 
        com.google.android.gms.a.a locala = b();
        paramParcel2.writeNoException();
        c.a(paramParcel2, locala);
      }
      for (;;)
      {
        return true;
        int i = c();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(i);
      }
    }
    
    public static class a
      extends com.google.android.gms.internal.b.a
      implements i
    {
      a(IBinder paramIBinder)
      {
        super("com.google.android.gms.common.internal.ICertData");
      }
      
      public com.google.android.gms.a.a b()
      {
        Parcel localParcel = a(1, d());
        com.google.android.gms.a.a locala = a.a.a(localParcel.readStrongBinder());
        localParcel.recycle();
        return locala;
      }
      
      public int c()
      {
        Parcel localParcel = a(2, d());
        int i = localParcel.readInt();
        localParcel.recycle();
        return i;
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.i
 * JD-Core Version:    0.7.0.1
 */