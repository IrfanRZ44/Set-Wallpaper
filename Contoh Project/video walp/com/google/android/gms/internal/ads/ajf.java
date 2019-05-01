package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;

public final class ajf
  extends aiz
  implements ajd
{
  ajf(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.clearcut.IClearcut");
  }
  
  public final void a()
  {
    b(3, i_());
  }
  
  public final void a(int paramInt)
  {
    Parcel localParcel = i_();
    localParcel.writeInt(paramInt);
    b(6, localParcel);
  }
  
  public final void a(a parama, String paramString)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, parama);
    localParcel.writeString(paramString);
    b(2, localParcel);
  }
  
  public final void a(a parama, String paramString1, String paramString2)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, parama);
    localParcel.writeString(paramString1);
    localParcel.writeString(null);
    b(8, localParcel);
  }
  
  public final void a(byte[] paramArrayOfByte)
  {
    Parcel localParcel = i_();
    localParcel.writeByteArray(paramArrayOfByte);
    b(5, localParcel);
  }
  
  public final void a(int[] paramArrayOfInt)
  {
    Parcel localParcel = i_();
    localParcel.writeIntArray(null);
    b(4, localParcel);
  }
  
  public final void b(int paramInt)
  {
    Parcel localParcel = i_();
    localParcel.writeInt(paramInt);
    b(7, localParcel);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ajf
 * JD-Core Version:    0.7.0.1
 */