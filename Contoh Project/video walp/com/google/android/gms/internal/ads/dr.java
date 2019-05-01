package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class dr
  extends aja
  implements dq
{
  public dr()
  {
    super("com.google.android.gms.ads.internal.request.IAdRequestService");
  }
  
  protected final boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    case 3: 
    default: 
      return false;
    case 1: 
      zzaej localzzaej = a((zzaef)ajb.a(paramParcel1, zzaef.CREATOR));
      paramParcel2.writeNoException();
      ajb.b(paramParcel2, localzzaej);
      return true;
    case 2: 
      zzaef localzzaef = (zzaef)ajb.a(paramParcel1, zzaef.CREATOR);
      IBinder localIBinder3 = paramParcel1.readStrongBinder();
      Object localObject3 = null;
      if (localIBinder3 == null) {}
      for (;;)
      {
        a(localzzaef, (dt)localObject3);
        paramParcel2.writeNoException();
        break;
        IInterface localIInterface3 = localIBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
        if ((localIInterface3 instanceof dt)) {
          localObject3 = (dt)localIInterface3;
        } else {
          localObject3 = new dv(localIBinder3);
        }
      }
    case 4: 
      zzaey localzzaey2 = (zzaey)ajb.a(paramParcel1, zzaey.CREATOR);
      IBinder localIBinder2 = paramParcel1.readStrongBinder();
      Object localObject2 = null;
      if (localIBinder2 == null) {}
      for (;;)
      {
        a(localzzaey2, (dw)localObject2);
        paramParcel2.writeNoException();
        break;
        IInterface localIInterface2 = localIBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
        if ((localIInterface2 instanceof dw)) {
          localObject2 = (dw)localIInterface2;
        } else {
          localObject2 = new dx(localIBinder2);
        }
      }
    }
    zzaey localzzaey1 = (zzaey)ajb.a(paramParcel1, zzaey.CREATOR);
    IBinder localIBinder1 = paramParcel1.readStrongBinder();
    Object localObject1 = null;
    if (localIBinder1 == null) {}
    for (;;)
    {
      b(localzzaey1, (dw)localObject1);
      paramParcel2.writeNoException();
      break;
      IInterface localIInterface1 = localIBinder1.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
      if ((localIInterface1 instanceof dw)) {
        localObject1 = (dw)localIInterface1;
      } else {
        localObject1 = new dx(localIBinder1);
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.dr
 * JD-Core Version:    0.7.0.1
 */