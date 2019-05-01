package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;

public final class sy
  extends aiz
  implements sw
{
  sy(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.omid.IOmid");
  }
  
  public final a a(String paramString1, a parama, String paramString2, String paramString3, String paramString4)
  {
    Parcel localParcel1 = i_();
    localParcel1.writeString(paramString1);
    ajb.a(localParcel1, parama);
    localParcel1.writeString(paramString2);
    localParcel1.writeString(paramString3);
    localParcel1.writeString(paramString4);
    Parcel localParcel2 = a(3, localParcel1);
    a locala = a.a.a(localParcel2.readStrongBinder());
    localParcel2.recycle();
    return locala;
  }
  
  public final String a()
  {
    Parcel localParcel = a(6, i_());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final void a(a parama1, a parama2)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, parama1);
    ajb.a(localParcel, parama2);
    b(5, localParcel);
  }
  
  public final boolean a(a parama)
  {
    Parcel localParcel1 = i_();
    ajb.a(localParcel1, parama);
    Parcel localParcel2 = a(2, localParcel1);
    boolean bool = ajb.a(localParcel2);
    localParcel2.recycle();
    return bool;
  }
  
  public final void b(a parama)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, parama);
    b(4, localParcel);
  }
  
  public final void c(a parama)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, parama);
    b(7, localParcel);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.sy
 * JD-Core Version:    0.7.0.1
 */