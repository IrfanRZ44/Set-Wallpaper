package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class avp
  extends aja
  implements avo
{
  public avp()
  {
    super("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
  }
  
  public static avo a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    if ((localIInterface instanceof avo)) {
      return (avo)localIInterface;
    }
    return new avq(paramIBinder);
  }
  
  protected final boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    if (paramInt1 == 1)
    {
      IBinder localIBinder = paramParcel1.readStrongBinder();
      Object localObject;
      if (localIBinder == null) {
        localObject = null;
      }
      for (;;)
      {
        a((avc)localObject);
        paramParcel2.writeNoException();
        return true;
        IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
        if ((localIInterface instanceof avc)) {
          localObject = (avc)localIInterface;
        } else {
          localObject = new ave(localIBinder);
        }
      }
    }
    return false;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.avp
 * JD-Core Version:    0.7.0.1
 */