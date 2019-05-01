package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class avt
  extends aja
  implements avr
{
  public avt()
  {
    super("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
  }
  
  public static avr a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    if ((localIInterface instanceof avr)) {
      return (avr)localIInterface;
    }
    return new avu(paramIBinder);
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
        a((avg)localObject);
        paramParcel2.writeNoException();
        return true;
        IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
        if ((localIInterface instanceof avg)) {
          localObject = (avg)localIInterface;
        } else {
          localObject = new avi(localIBinder);
        }
      }
    }
    return false;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.avt
 * JD-Core Version:    0.7.0.1
 */