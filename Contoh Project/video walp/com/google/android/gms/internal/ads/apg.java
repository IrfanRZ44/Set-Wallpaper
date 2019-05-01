package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

public final class apg
  extends aiz
  implements ape
{
  apg(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
  }
  
  public final void zza(PublisherAdViewOptions paramPublisherAdViewOptions)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramPublisherAdViewOptions);
    b(9, localParcel);
  }
  
  public final void zza(avo paramavo)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramavo);
    b(3, localParcel);
  }
  
  public final void zza(avr paramavr)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramavr);
    b(4, localParcel);
  }
  
  public final void zza(awb paramawb, zzjn paramzzjn)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramawb);
    ajb.a(localParcel, paramzzjn);
    b(8, localParcel);
  }
  
  public final void zza(awe paramawe)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramawe);
    b(10, localParcel);
  }
  
  public final void zza(zzpl paramzzpl)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramzzpl);
    b(6, localParcel);
  }
  
  public final void zza(String paramString, avy paramavy, avv paramavv)
  {
    Parcel localParcel = i_();
    localParcel.writeString(paramString);
    ajb.a(localParcel, paramavy);
    ajb.a(localParcel, paramavv);
    b(5, localParcel);
  }
  
  public final void zzb(aoy paramaoy)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramaoy);
    b(2, localParcel);
  }
  
  public final void zzb(apy paramapy)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramapy);
    b(7, localParcel);
  }
  
  public final apb zzdh()
  {
    Parcel localParcel = a(1, i_());
    IBinder localIBinder = localParcel.readStrongBinder();
    Object localObject;
    if (localIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      localParcel.recycle();
      return localObject;
      IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
      if ((localIInterface instanceof apb)) {
        localObject = (apb)localIInterface;
      } else {
        localObject = new apd(localIBinder);
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.apg
 * JD-Core Version:    0.7.0.1
 */