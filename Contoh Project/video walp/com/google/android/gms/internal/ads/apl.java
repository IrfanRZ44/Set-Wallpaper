package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;

public final class apl
  extends aiz
  implements apj
{
  apl(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IAdManager");
  }
  
  public final void destroy()
  {
    b(2, i_());
  }
  
  public final String getAdUnitId()
  {
    Parcel localParcel = a(31, i_());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final String getMediationAdapterClassName()
  {
    Parcel localParcel = a(18, i_());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final aqg getVideoController()
  {
    Parcel localParcel = a(26, i_());
    IBinder localIBinder = localParcel.readStrongBinder();
    Object localObject;
    if (localIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      localParcel.recycle();
      return localObject;
      IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
      if ((localIInterface instanceof aqg)) {
        localObject = (aqg)localIInterface;
      } else {
        localObject = new aqi(localIBinder);
      }
    }
  }
  
  public final boolean isLoading()
  {
    Parcel localParcel = a(23, i_());
    boolean bool = ajb.a(localParcel);
    localParcel.recycle();
    return bool;
  }
  
  public final boolean isReady()
  {
    Parcel localParcel = a(3, i_());
    boolean bool = ajb.a(localParcel);
    localParcel.recycle();
    return bool;
  }
  
  public final void pause()
  {
    b(5, i_());
  }
  
  public final void resume()
  {
    b(6, i_());
  }
  
  public final void setImmersiveMode(boolean paramBoolean)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramBoolean);
    b(34, localParcel);
  }
  
  public final void setManualImpressionsEnabled(boolean paramBoolean)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramBoolean);
    b(22, localParcel);
  }
  
  public final void setUserId(String paramString)
  {
    Parcel localParcel = i_();
    localParcel.writeString(paramString);
    b(25, localParcel);
  }
  
  public final void showInterstitial()
  {
    b(9, i_());
  }
  
  public final void stopLoading()
  {
    b(10, i_());
  }
  
  public final void zza(af paramaf, String paramString)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramaf);
    localParcel.writeString(paramString);
    b(15, localParcel);
  }
  
  public final void zza(aov paramaov)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramaov);
    b(20, localParcel);
  }
  
  public final void zza(aoy paramaoy)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramaoy);
    b(7, localParcel);
  }
  
  public final void zza(apo paramapo)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramapo);
    b(36, localParcel);
  }
  
  public final void zza(aps paramaps)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramaps);
    b(8, localParcel);
  }
  
  public final void zza(apy paramapy)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramapy);
    b(21, localParcel);
  }
  
  public final void zza(asu paramasu)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramasu);
    b(19, localParcel);
  }
  
  public final void zza(gh paramgh)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramgh);
    b(24, localParcel);
  }
  
  public final void zza(y paramy)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramy);
    b(14, localParcel);
  }
  
  public final void zza(zzjn paramzzjn)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramzzjn);
    b(13, localParcel);
  }
  
  public final void zza(zzlu paramzzlu)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramzzlu);
    b(30, localParcel);
  }
  
  public final void zza(zzmu paramzzmu)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramzzmu);
    b(29, localParcel);
  }
  
  public final boolean zzb(zzjj paramzzjj)
  {
    Parcel localParcel1 = i_();
    ajb.a(localParcel1, paramzzjj);
    Parcel localParcel2 = a(4, localParcel1);
    boolean bool = ajb.a(localParcel2);
    localParcel2.recycle();
    return bool;
  }
  
  public final Bundle zzba()
  {
    Parcel localParcel = a(37, i_());
    Bundle localBundle = (Bundle)ajb.a(localParcel, Bundle.CREATOR);
    localParcel.recycle();
    return localBundle;
  }
  
  public final a zzbj()
  {
    Parcel localParcel = a(1, i_());
    a locala = a.a.a(localParcel.readStrongBinder());
    localParcel.recycle();
    return locala;
  }
  
  public final zzjn zzbk()
  {
    Parcel localParcel = a(12, i_());
    zzjn localzzjn = (zzjn)ajb.a(localParcel, zzjn.CREATOR);
    localParcel.recycle();
    return localzzjn;
  }
  
  public final void zzbm()
  {
    b(11, i_());
  }
  
  public final aps zzbw()
  {
    Parcel localParcel = a(32, i_());
    IBinder localIBinder = localParcel.readStrongBinder();
    Object localObject;
    if (localIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      localParcel.recycle();
      return localObject;
      IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
      if ((localIInterface instanceof aps)) {
        localObject = (aps)localIInterface;
      } else {
        localObject = new apu(localIBinder);
      }
    }
  }
  
  public final aoy zzbx()
  {
    Parcel localParcel = a(33, i_());
    IBinder localIBinder = localParcel.readStrongBinder();
    Object localObject;
    if (localIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      localParcel.recycle();
      return localObject;
      IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
      if ((localIInterface instanceof aoy)) {
        localObject = (aoy)localIInterface;
      } else {
        localObject = new apa(localIBinder);
      }
    }
  }
  
  public final String zzck()
  {
    Parcel localParcel = a(35, i_());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.apl
 * JD-Core Version:    0.7.0.1
 */