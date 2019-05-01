package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;

public abstract class bej
  extends aja
  implements bei
{
  public bej()
  {
    super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
  }
  
  public static bei a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    if ((localIInterface instanceof bei)) {
      return (bei)localIInterface;
    }
    return new bek(paramIBinder);
  }
  
  protected final boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    IBinder localIBinder3;
    Object localObject3;
    switch (paramInt1)
    {
    default: 
      return false;
    case 1: 
      a locala3 = a.a.a(paramParcel1.readStrongBinder());
      String str3 = paramParcel1.readString();
      Bundle localBundle3 = (Bundle)ajb.a(paramParcel1, Bundle.CREATOR);
      localIBinder3 = paramParcel1.readStrongBinder();
      if (localIBinder3 == null)
      {
        localObject3 = null;
        a(locala3, str3, localBundle3, (bel)localObject3);
        paramParcel2.writeNoException();
      }
      break;
    }
    for (;;)
    {
      return true;
      IInterface localIInterface3 = localIBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
      if ((localIInterface3 instanceof bel))
      {
        localObject3 = (bel)localIInterface3;
        break;
      }
      localObject3 = new bem(localIBinder3);
      break;
      zzzt localzzzt2 = a();
      paramParcel2.writeNoException();
      ajb.b(paramParcel2, localzzzt2);
      continue;
      zzzt localzzzt1 = b();
      paramParcel2.writeNoException();
      ajb.b(paramParcel2, localzzzt1);
      continue;
      byte[] arrayOfByte2 = paramParcel1.createByteArray();
      String str2 = paramParcel1.readString();
      Bundle localBundle2 = (Bundle)ajb.a(paramParcel1, Bundle.CREATOR);
      a locala2 = a.a.a(paramParcel1.readStrongBinder());
      IBinder localIBinder2 = paramParcel1.readStrongBinder();
      Object localObject2 = null;
      if (localIBinder2 == null) {}
      for (;;)
      {
        a(arrayOfByte2, str2, localBundle2, locala2, (bee)localObject2, bcr.a(paramParcel1.readStrongBinder()), (zzjn)ajb.a(paramParcel1, zzjn.CREATOR));
        paramParcel2.writeNoException();
        break;
        IInterface localIInterface2 = localIBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
        if ((localIInterface2 instanceof bee)) {
          localObject2 = (bee)localIInterface2;
        } else {
          localObject2 = new bef(localIBinder2);
        }
      }
      aqg localaqg = c();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, localaqg);
      continue;
      byte[] arrayOfByte1 = paramParcel1.createByteArray();
      String str1 = paramParcel1.readString();
      Bundle localBundle1 = (Bundle)ajb.a(paramParcel1, Bundle.CREATOR);
      a locala1 = a.a.a(paramParcel1.readStrongBinder());
      IBinder localIBinder1 = paramParcel1.readStrongBinder();
      Object localObject1 = null;
      if (localIBinder1 == null) {}
      for (;;)
      {
        a(arrayOfByte1, str1, localBundle1, locala1, (beg)localObject1, bcr.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        break;
        IInterface localIInterface1 = localIBinder1.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
        if ((localIInterface1 instanceof beg)) {
          localObject1 = (beg)localIInterface1;
        } else {
          localObject1 = new beh(localIBinder1);
        }
      }
      d();
      paramParcel2.writeNoException();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bej
 * JD-Core Version:    0.7.0.1
 */