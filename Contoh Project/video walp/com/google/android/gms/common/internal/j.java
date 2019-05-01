package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.b.a;
import com.google.android.gms.internal.b.b;
import com.google.android.gms.internal.b.c;

public abstract interface j
  extends IInterface
{
  public abstract void a(int paramInt, Bundle paramBundle);
  
  public abstract void a(int paramInt, IBinder paramIBinder, Bundle paramBundle);
  
  public abstract void a(int paramInt, IBinder paramIBinder, ConnectionInfo paramConnectionInfo);
  
  public static abstract class a
    extends b
    implements j
  {
    public a()
    {
      super();
    }
    
    public static j a(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsCallbacks");
      if ((localIInterface instanceof j)) {
        return (j)localIInterface;
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
        a(paramParcel1.readInt(), paramParcel1.readStrongBinder(), (Bundle)c.a(paramParcel1, Bundle.CREATOR));
      }
      for (;;)
      {
        paramParcel2.writeNoException();
        return true;
        a(paramParcel1.readInt(), (Bundle)c.a(paramParcel1, Bundle.CREATOR));
        continue;
        a(paramParcel1.readInt(), paramParcel1.readStrongBinder(), (ConnectionInfo)c.a(paramParcel1, ConnectionInfo.CREATOR));
      }
    }
    
    public static class a
      extends a
      implements j
    {
      a(IBinder paramIBinder)
      {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
      }
      
      public void a(int paramInt, Bundle paramBundle)
      {
        Parcel localParcel = d();
        localParcel.writeInt(paramInt);
        c.a(localParcel, paramBundle);
        b(2, localParcel);
      }
      
      public void a(int paramInt, IBinder paramIBinder, Bundle paramBundle)
      {
        Parcel localParcel = d();
        localParcel.writeInt(paramInt);
        localParcel.writeStrongBinder(paramIBinder);
        c.a(localParcel, paramBundle);
        b(1, localParcel);
      }
      
      public void a(int paramInt, IBinder paramIBinder, ConnectionInfo paramConnectionInfo)
      {
        Parcel localParcel = d();
        localParcel.writeInt(paramInt);
        localParcel.writeStrongBinder(paramIBinder);
        c.a(localParcel, paramConnectionInfo);
        b(3, localParcel);
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.j
 * JD-Core Version:    0.7.0.1
 */