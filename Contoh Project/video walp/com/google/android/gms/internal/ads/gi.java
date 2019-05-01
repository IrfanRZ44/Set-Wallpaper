package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class gi
  extends aja
  implements gh
{
  public gi()
  {
    super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
  }
  
  public static gh a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    if ((localIInterface instanceof gh)) {
      return (gh)localIInterface;
    }
    return new gj(paramIBinder);
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
      c();
      continue;
      d();
      continue;
      IBinder localIBinder = paramParcel1.readStrongBinder();
      Object localObject;
      if (localIBinder == null) {
        localObject = null;
      }
      for (;;)
      {
        a((fw)localObject);
        break;
        IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardItem");
        if ((localIInterface instanceof fw)) {
          localObject = (fw)localIInterface;
        } else {
          localObject = new fy(localIBinder);
        }
      }
      e();
      continue;
      a(paramParcel1.readInt());
      continue;
      f();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.gi
 * JD-Core Version:    0.7.0.1
 */