package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;

public final class auu
  extends aiz
  implements aus
{
  auu(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
  }
  
  public final a a(String paramString)
  {
    Parcel localParcel1 = i_();
    localParcel1.writeString(paramString);
    Parcel localParcel2 = a(2, localParcel1);
    a locala = a.a.a(localParcel2.readStrongBinder());
    localParcel2.recycle();
    return locala;
  }
  
  public final void a()
  {
    b(4, i_());
  }
  
  public final void a(a parama)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, parama);
    b(3, localParcel);
  }
  
  public final void a(a parama, int paramInt)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, parama);
    localParcel.writeInt(paramInt);
    b(5, localParcel);
  }
  
  public final void a(String paramString, a parama)
  {
    Parcel localParcel = i_();
    localParcel.writeString(paramString);
    ajb.a(localParcel, parama);
    b(1, localParcel);
  }
  
  public final void b(a parama)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, parama);
    b(6, localParcel);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.auu
 * JD-Core Version:    0.7.0.1
 */