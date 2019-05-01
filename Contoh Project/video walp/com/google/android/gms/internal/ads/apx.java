package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.a;

public final class apx
  extends aiz
  implements apv
{
  apx(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IClientApi");
  }
  
  public final ape createAdLoaderBuilder(a parama, String paramString, bck parambck, int paramInt)
  {
    Parcel localParcel1 = i_();
    ajb.a(localParcel1, parama);
    localParcel1.writeString(paramString);
    ajb.a(localParcel1, parambck);
    localParcel1.writeInt(paramInt);
    Parcel localParcel2 = a(3, localParcel1);
    IBinder localIBinder = localParcel2.readStrongBinder();
    Object localObject;
    if (localIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      localParcel2.recycle();
      return localObject;
      IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
      if ((localIInterface instanceof ape)) {
        localObject = (ape)localIInterface;
      } else {
        localObject = new apg(localIBinder);
      }
    }
  }
  
  public final r createAdOverlay(a parama)
  {
    Parcel localParcel1 = i_();
    ajb.a(localParcel1, parama);
    Parcel localParcel2 = a(8, localParcel1);
    r localr = s.zzu(localParcel2.readStrongBinder());
    localParcel2.recycle();
    return localr;
  }
  
  public final apj createBannerAdManager(a parama, zzjn paramzzjn, String paramString, bck parambck, int paramInt)
  {
    Parcel localParcel1 = i_();
    ajb.a(localParcel1, parama);
    ajb.a(localParcel1, paramzzjn);
    localParcel1.writeString(paramString);
    ajb.a(localParcel1, parambck);
    localParcel1.writeInt(paramInt);
    Parcel localParcel2 = a(1, localParcel1);
    IBinder localIBinder = localParcel2.readStrongBinder();
    Object localObject;
    if (localIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      localParcel2.recycle();
      return localObject;
      IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
      if ((localIInterface instanceof apj)) {
        localObject = (apj)localIInterface;
      } else {
        localObject = new apl(localIBinder);
      }
    }
  }
  
  public final ab createInAppPurchaseManager(a parama)
  {
    Parcel localParcel1 = i_();
    ajb.a(localParcel1, parama);
    Parcel localParcel2 = a(7, localParcel1);
    ab localab = ad.a(localParcel2.readStrongBinder());
    localParcel2.recycle();
    return localab;
  }
  
  public final apj createInterstitialAdManager(a parama, zzjn paramzzjn, String paramString, bck parambck, int paramInt)
  {
    Parcel localParcel1 = i_();
    ajb.a(localParcel1, parama);
    ajb.a(localParcel1, paramzzjn);
    localParcel1.writeString(paramString);
    ajb.a(localParcel1, parambck);
    localParcel1.writeInt(paramInt);
    Parcel localParcel2 = a(2, localParcel1);
    IBinder localIBinder = localParcel2.readStrongBinder();
    Object localObject;
    if (localIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      localParcel2.recycle();
      return localObject;
      IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
      if ((localIInterface instanceof apj)) {
        localObject = (apj)localIInterface;
      } else {
        localObject = new apl(localIBinder);
      }
    }
  }
  
  public final aus createNativeAdViewDelegate(a parama1, a parama2)
  {
    Parcel localParcel1 = i_();
    ajb.a(localParcel1, parama1);
    ajb.a(localParcel1, parama2);
    Parcel localParcel2 = a(5, localParcel1);
    aus localaus = aut.a(localParcel2.readStrongBinder());
    localParcel2.recycle();
    return localaus;
  }
  
  public final aux createNativeAdViewHolderDelegate(a parama1, a parama2, a parama3)
  {
    Parcel localParcel1 = i_();
    ajb.a(localParcel1, parama1);
    ajb.a(localParcel1, parama2);
    ajb.a(localParcel1, parama3);
    Parcel localParcel2 = a(11, localParcel1);
    aux localaux = auy.a(localParcel2.readStrongBinder());
    localParcel2.recycle();
    return localaux;
  }
  
  public final gb createRewardedVideoAd(a parama, bck parambck, int paramInt)
  {
    Parcel localParcel1 = i_();
    ajb.a(localParcel1, parama);
    ajb.a(localParcel1, parambck);
    localParcel1.writeInt(paramInt);
    Parcel localParcel2 = a(6, localParcel1);
    gb localgb = gd.a(localParcel2.readStrongBinder());
    localParcel2.recycle();
    return localgb;
  }
  
  public final apj createSearchAdManager(a parama, zzjn paramzzjn, String paramString, int paramInt)
  {
    Parcel localParcel1 = i_();
    ajb.a(localParcel1, parama);
    ajb.a(localParcel1, paramzzjn);
    localParcel1.writeString(paramString);
    localParcel1.writeInt(paramInt);
    Parcel localParcel2 = a(10, localParcel1);
    IBinder localIBinder = localParcel2.readStrongBinder();
    Object localObject;
    if (localIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      localParcel2.recycle();
      return localObject;
      IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
      if ((localIInterface instanceof apj)) {
        localObject = (apj)localIInterface;
      } else {
        localObject = new apl(localIBinder);
      }
    }
  }
  
  public final aqb getMobileAdsSettingsManager(a parama)
  {
    Parcel localParcel1 = i_();
    ajb.a(localParcel1, parama);
    Parcel localParcel2 = a(4, localParcel1);
    IBinder localIBinder = localParcel2.readStrongBinder();
    Object localObject;
    if (localIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      localParcel2.recycle();
      return localObject;
      IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
      if ((localIInterface instanceof aqb)) {
        localObject = (aqb)localIInterface;
      } else {
        localObject = new aqd(localIBinder);
      }
    }
  }
  
  public final aqb getMobileAdsSettingsManagerWithClientJarVersion(a parama, int paramInt)
  {
    Parcel localParcel1 = i_();
    ajb.a(localParcel1, parama);
    localParcel1.writeInt(paramInt);
    Parcel localParcel2 = a(9, localParcel1);
    IBinder localIBinder = localParcel2.readStrongBinder();
    Object localObject;
    if (localIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      localParcel2.recycle();
      return localObject;
      IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
      if ((localIInterface instanceof aqb)) {
        localObject = (aqb)localIInterface;
      } else {
        localObject = new aqd(localIBinder);
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.apx
 * JD-Core Version:    0.7.0.1
 */