package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class bcr
  extends aja
  implements bcq
{
  public bcr()
  {
    super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
  }
  
  public static bcq a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    if ((localIInterface instanceof bcq)) {
      return (bcq)localIInterface;
    }
    return new bcs(paramIBinder);
  }
  
  protected final boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return false;
    case 1: 
      a();
    }
    for (;;)
    {
      paramParcel2.writeNoException();
      return true;
      b();
      continue;
      a(paramParcel1.readInt());
      continue;
      c();
      continue;
      d();
      continue;
      e();
      continue;
      IBinder localIBinder = paramParcel1.readStrongBinder();
      Object localObject;
      if (localIBinder == null) {
        localObject = null;
      }
      for (;;)
      {
        a((bct)localObject);
        break;
        IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
        if ((localIInterface instanceof bct)) {
          localObject = (bct)localIInterface;
        } else {
          localObject = new bcv(localIBinder);
        }
      }
      f();
      continue;
      a(paramParcel1.readString(), paramParcel1.readString());
      continue;
      a(avl.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      continue;
      g();
      continue;
      a(paramParcel1.readString());
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bcr
 * JD-Core Version:    0.7.0.1
 */