package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;

public final class aqd
  extends aiz
  implements aqb
{
  aqd(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
  }
  
  public final void setAppMuted(boolean paramBoolean)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramBoolean);
    b(4, localParcel);
  }
  
  public final void setAppVolume(float paramFloat)
  {
    Parcel localParcel = i_();
    localParcel.writeFloat(paramFloat);
    b(2, localParcel);
  }
  
  public final void zza()
  {
    b(1, i_());
  }
  
  public final void zza(String paramString, a parama)
  {
    Parcel localParcel = i_();
    localParcel.writeString(paramString);
    ajb.a(localParcel, parama);
    b(6, localParcel);
  }
  
  public final void zzb(a parama, String paramString)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, parama);
    localParcel.writeString(paramString);
    b(5, localParcel);
  }
  
  public final float zzdo()
  {
    Parcel localParcel = a(7, i_());
    float f = localParcel.readFloat();
    localParcel.recycle();
    return f;
  }
  
  public final boolean zzdp()
  {
    Parcel localParcel = a(8, i_());
    boolean bool = ajb.a(localParcel);
    localParcel.recycle();
    return bool;
  }
  
  public final void zzt(String paramString)
  {
    Parcel localParcel = i_();
    localParcel.writeString(paramString);
    b(3, localParcel);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aqd
 * JD-Core Version:    0.7.0.1
 */