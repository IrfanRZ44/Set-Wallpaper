package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.a.a;

public abstract class apw
  extends aja
  implements apv
{
  public apw()
  {
    super("com.google.android.gms.ads.internal.client.IClientApi");
  }
  
  public static apv asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
    if ((localIInterface instanceof apv)) {
      return (apv)localIInterface;
    }
    return new apx(paramIBinder);
  }
  
  protected final boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return false;
    case 1: 
      apj localapj3 = createBannerAdManager(a.a.a(paramParcel1.readStrongBinder()), (zzjn)ajb.a(paramParcel1, zzjn.CREATOR), paramParcel1.readString(), bcl.a(paramParcel1.readStrongBinder()), paramParcel1.readInt());
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, localapj3);
    }
    for (;;)
    {
      return true;
      apj localapj2 = createInterstitialAdManager(a.a.a(paramParcel1.readStrongBinder()), (zzjn)ajb.a(paramParcel1, zzjn.CREATOR), paramParcel1.readString(), bcl.a(paramParcel1.readStrongBinder()), paramParcel1.readInt());
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, localapj2);
      continue;
      ape localape = createAdLoaderBuilder(a.a.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), bcl.a(paramParcel1.readStrongBinder()), paramParcel1.readInt());
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, localape);
      continue;
      aqb localaqb2 = getMobileAdsSettingsManager(a.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, localaqb2);
      continue;
      aus localaus = createNativeAdViewDelegate(a.a.a(paramParcel1.readStrongBinder()), a.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, localaus);
      continue;
      gb localgb = createRewardedVideoAd(a.a.a(paramParcel1.readStrongBinder()), bcl.a(paramParcel1.readStrongBinder()), paramParcel1.readInt());
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, localgb);
      continue;
      ab localab = createInAppPurchaseManager(a.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, localab);
      continue;
      r localr = createAdOverlay(a.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, localr);
      continue;
      aqb localaqb1 = getMobileAdsSettingsManagerWithClientJarVersion(a.a.a(paramParcel1.readStrongBinder()), paramParcel1.readInt());
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, localaqb1);
      continue;
      apj localapj1 = createSearchAdManager(a.a.a(paramParcel1.readStrongBinder()), (zzjn)ajb.a(paramParcel1, zzjn.CREATOR), paramParcel1.readString(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, localapj1);
      continue;
      aux localaux = createNativeAdViewHolderDelegate(a.a.a(paramParcel1.readStrongBinder()), a.a.a(paramParcel1.readStrongBinder()), a.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, localaux);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.apw
 * JD-Core Version:    0.7.0.1
 */