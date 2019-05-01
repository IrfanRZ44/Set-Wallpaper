package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.a;

public abstract class apk
  extends aja
  implements apj
{
  public apk()
  {
    super("com.google.android.gms.ads.internal.client.IAdManager");
  }
  
  public static apj zzb(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
    if ((localIInterface instanceof apj)) {
      return (apj)localIInterface;
    }
    return new apl(paramIBinder);
  }
  
  protected final boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    case 16: 
    case 17: 
    case 27: 
    case 28: 
    default: 
      return false;
    case 1: 
      a locala = zzbj();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, locala);
    }
    for (;;)
    {
      return true;
      destroy();
      paramParcel2.writeNoException();
      continue;
      boolean bool3 = isReady();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, bool3);
      continue;
      boolean bool2 = zzb((zzjj)ajb.a(paramParcel1, zzjj.CREATOR));
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, bool2);
      continue;
      pause();
      paramParcel2.writeNoException();
      continue;
      resume();
      paramParcel2.writeNoException();
      continue;
      IBinder localIBinder5 = paramParcel1.readStrongBinder();
      Object localObject5 = null;
      if (localIBinder5 == null) {}
      for (;;)
      {
        zza((aoy)localObject5);
        paramParcel2.writeNoException();
        break;
        IInterface localIInterface5 = localIBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
        if ((localIInterface5 instanceof aoy)) {
          localObject5 = (aoy)localIInterface5;
        } else {
          localObject5 = new apa(localIBinder5);
        }
      }
      IBinder localIBinder4 = paramParcel1.readStrongBinder();
      Object localObject4 = null;
      if (localIBinder4 == null) {}
      for (;;)
      {
        zza((aps)localObject4);
        paramParcel2.writeNoException();
        break;
        IInterface localIInterface4 = localIBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        if ((localIInterface4 instanceof aps)) {
          localObject4 = (aps)localIInterface4;
        } else {
          localObject4 = new apu(localIBinder4);
        }
      }
      showInterstitial();
      paramParcel2.writeNoException();
      continue;
      stopLoading();
      paramParcel2.writeNoException();
      continue;
      zzbm();
      paramParcel2.writeNoException();
      continue;
      zzjn localzzjn = zzbk();
      paramParcel2.writeNoException();
      ajb.b(paramParcel2, localzzjn);
      continue;
      zza((zzjn)ajb.a(paramParcel1, zzjn.CREATOR));
      paramParcel2.writeNoException();
      continue;
      zza(z.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      continue;
      zza(ag.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      continue;
      String str3 = getMediationAdapterClassName();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str3);
      continue;
      zza(asv.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      continue;
      IBinder localIBinder3 = paramParcel1.readStrongBinder();
      Object localObject3 = null;
      if (localIBinder3 == null) {}
      for (;;)
      {
        zza((aov)localObject3);
        paramParcel2.writeNoException();
        break;
        IInterface localIInterface3 = localIBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
        if ((localIInterface3 instanceof aov)) {
          localObject3 = (aov)localIInterface3;
        } else {
          localObject3 = new aox(localIBinder3);
        }
      }
      IBinder localIBinder2 = paramParcel1.readStrongBinder();
      Object localObject2 = null;
      if (localIBinder2 == null) {}
      for (;;)
      {
        zza((apy)localObject2);
        paramParcel2.writeNoException();
        break;
        IInterface localIInterface2 = localIBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
        if ((localIInterface2 instanceof apy)) {
          localObject2 = (apy)localIInterface2;
        } else {
          localObject2 = new aqa(localIBinder2);
        }
      }
      setManualImpressionsEnabled(ajb.a(paramParcel1));
      paramParcel2.writeNoException();
      continue;
      boolean bool1 = isLoading();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, bool1);
      continue;
      zza(gi.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      continue;
      setUserId(paramParcel1.readString());
      paramParcel2.writeNoException();
      continue;
      aqg localaqg = getVideoController();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, localaqg);
      continue;
      zza((zzmu)ajb.a(paramParcel1, zzmu.CREATOR));
      paramParcel2.writeNoException();
      continue;
      zza((zzlu)ajb.a(paramParcel1, zzlu.CREATOR));
      paramParcel2.writeNoException();
      continue;
      String str2 = getAdUnitId();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str2);
      continue;
      aps localaps = zzbw();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, localaps);
      continue;
      aoy localaoy = zzbx();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, localaoy);
      continue;
      setImmersiveMode(ajb.a(paramParcel1));
      paramParcel2.writeNoException();
      continue;
      String str1 = zzck();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str1);
      continue;
      IBinder localIBinder1 = paramParcel1.readStrongBinder();
      Object localObject1 = null;
      if (localIBinder1 == null) {}
      for (;;)
      {
        zza((apo)localObject1);
        paramParcel2.writeNoException();
        break;
        IInterface localIInterface1 = localIBinder1.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        if ((localIInterface1 instanceof apo)) {
          localObject1 = (apo)localIInterface1;
        } else {
          localObject1 = new apq(localIBinder1);
        }
      }
      Bundle localBundle = zzba();
      paramParcel2.writeNoException();
      ajb.b(paramParcel2, localBundle);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.apk
 * JD-Core Version:    0.7.0.1
 */