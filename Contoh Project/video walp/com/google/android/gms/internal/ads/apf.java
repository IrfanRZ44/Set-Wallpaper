package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

public abstract class apf
  extends aja
  implements ape
{
  public apf()
  {
    super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
  }
  
  protected final boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return false;
    case 1: 
      apb localapb = zzdh();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, localapb);
    }
    for (;;)
    {
      return true;
      IBinder localIBinder2 = paramParcel1.readStrongBinder();
      Object localObject2 = null;
      if (localIBinder2 == null) {}
      for (;;)
      {
        zzb((aoy)localObject2);
        paramParcel2.writeNoException();
        break;
        IInterface localIInterface2 = localIBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
        if ((localIInterface2 instanceof aoy)) {
          localObject2 = (aoy)localIInterface2;
        } else {
          localObject2 = new apa(localIBinder2);
        }
      }
      zza(avp.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      continue;
      zza(avt.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      continue;
      zza(paramParcel1.readString(), avz.a(paramParcel1.readStrongBinder()), avw.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      continue;
      zza((zzpl)ajb.a(paramParcel1, zzpl.CREATOR));
      paramParcel2.writeNoException();
      continue;
      IBinder localIBinder1 = paramParcel1.readStrongBinder();
      Object localObject1 = null;
      if (localIBinder1 == null) {}
      for (;;)
      {
        zzb((apy)localObject1);
        paramParcel2.writeNoException();
        break;
        IInterface localIInterface1 = localIBinder1.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
        if ((localIInterface1 instanceof apy)) {
          localObject1 = (apy)localIInterface1;
        } else {
          localObject1 = new aqa(localIBinder1);
        }
      }
      zza(awc.a(paramParcel1.readStrongBinder()), (zzjn)ajb.a(paramParcel1, zzjn.CREATOR));
      paramParcel2.writeNoException();
      continue;
      zza((PublisherAdViewOptions)ajb.a(paramParcel1, PublisherAdViewOptions.CREATOR));
      paramParcel2.writeNoException();
      continue;
      zza(awf.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.apf
 * JD-Core Version:    0.7.0.1
 */