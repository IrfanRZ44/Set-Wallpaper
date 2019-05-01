package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class aqh
  extends aja
  implements aqg
{
  public aqh()
  {
    super("com.google.android.gms.ads.internal.client.IVideoController");
  }
  
  public static aqg a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
    if ((localIInterface instanceof aqg)) {
      return (aqg)localIInterface;
    }
    return new aqi(paramIBinder);
  }
  
  protected final boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return false;
    case 1: 
      a();
      paramParcel2.writeNoException();
    }
    for (;;)
    {
      return true;
      b();
      paramParcel2.writeNoException();
      continue;
      a(ajb.a(paramParcel1));
      paramParcel2.writeNoException();
      continue;
      boolean bool3 = c();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, bool3);
      continue;
      int i = d();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(i);
      continue;
      float f3 = f();
      paramParcel2.writeNoException();
      paramParcel2.writeFloat(f3);
      continue;
      float f2 = g();
      paramParcel2.writeNoException();
      paramParcel2.writeFloat(f2);
      continue;
      IBinder localIBinder = paramParcel1.readStrongBinder();
      Object localObject;
      if (localIBinder == null) {
        localObject = null;
      }
      for (;;)
      {
        a((aqj)localObject);
        paramParcel2.writeNoException();
        break;
        IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
        if ((localIInterface instanceof aqj)) {
          localObject = (aqj)localIInterface;
        } else {
          localObject = new aql(localIBinder);
        }
      }
      float f1 = e();
      paramParcel2.writeNoException();
      paramParcel2.writeFloat(f1);
      continue;
      boolean bool2 = i();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, bool2);
      continue;
      aqj localaqj = h();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, localaqj);
      continue;
      boolean bool1 = j();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, bool1);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aqh
 * JD-Core Version:    0.7.0.1
 */