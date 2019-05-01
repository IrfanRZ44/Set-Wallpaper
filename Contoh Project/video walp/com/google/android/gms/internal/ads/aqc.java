package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.a.a.a;

public abstract class aqc
  extends aja
  implements aqb
{
  public aqc()
  {
    super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
  }
  
  protected final boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return false;
    case 1: 
      zza();
      paramParcel2.writeNoException();
    }
    for (;;)
    {
      return true;
      setAppVolume(paramParcel1.readFloat());
      paramParcel2.writeNoException();
      continue;
      zzt(paramParcel1.readString());
      paramParcel2.writeNoException();
      continue;
      setAppMuted(ajb.a(paramParcel1));
      paramParcel2.writeNoException();
      continue;
      zzb(a.a.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      continue;
      zza(paramParcel1.readString(), a.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      continue;
      float f = zzdo();
      paramParcel2.writeNoException();
      paramParcel2.writeFloat(f);
      continue;
      boolean bool = zzdp();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, bool);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aqc
 * JD-Core Version:    0.7.0.1
 */