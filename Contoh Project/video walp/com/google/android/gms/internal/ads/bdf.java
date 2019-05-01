package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;
import java.util.ArrayList;
import java.util.List;

public final class bdf
  extends aiz
  implements bdd
{
  bdf(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
  }
  
  public final String a()
  {
    Parcel localParcel = a(2, i_());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final void a(a parama)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, parama);
    b(20, localParcel);
  }
  
  public final void a(a parama1, a parama2, a parama3)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, parama1);
    ajb.a(localParcel, parama2);
    ajb.a(localParcel, parama3);
    b(21, localParcel);
  }
  
  public final List b()
  {
    Parcel localParcel = a(3, i_());
    ArrayList localArrayList = ajb.b(localParcel);
    localParcel.recycle();
    return localArrayList;
  }
  
  public final void b(a parama)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, parama);
    b(22, localParcel);
  }
  
  public final String c()
  {
    Parcel localParcel = a(4, i_());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final aun d()
  {
    Parcel localParcel = a(5, i_());
    aun localaun = auo.a(localParcel.readStrongBinder());
    localParcel.recycle();
    return localaun;
  }
  
  public final String e()
  {
    Parcel localParcel = a(6, i_());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final String f()
  {
    Parcel localParcel = a(7, i_());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final double g()
  {
    Parcel localParcel = a(8, i_());
    double d = localParcel.readDouble();
    localParcel.recycle();
    return d;
  }
  
  public final String h()
  {
    Parcel localParcel = a(9, i_());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final String i()
  {
    Parcel localParcel = a(10, i_());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final aqg j()
  {
    Parcel localParcel = a(11, i_());
    aqg localaqg = aqh.a(localParcel.readStrongBinder());
    localParcel.recycle();
    return localaqg;
  }
  
  public final auj k()
  {
    Parcel localParcel = a(12, i_());
    auj localauj = auk.a(localParcel.readStrongBinder());
    localParcel.recycle();
    return localauj;
  }
  
  public final a l()
  {
    Parcel localParcel = a(13, i_());
    a locala = a.a.a(localParcel.readStrongBinder());
    localParcel.recycle();
    return locala;
  }
  
  public final a m()
  {
    Parcel localParcel = a(14, i_());
    a locala = a.a.a(localParcel.readStrongBinder());
    localParcel.recycle();
    return locala;
  }
  
  public final a n()
  {
    Parcel localParcel = a(15, i_());
    a locala = a.a.a(localParcel.readStrongBinder());
    localParcel.recycle();
    return locala;
  }
  
  public final Bundle o()
  {
    Parcel localParcel = a(16, i_());
    Bundle localBundle = (Bundle)ajb.a(localParcel, Bundle.CREATOR);
    localParcel.recycle();
    return localBundle;
  }
  
  public final boolean p()
  {
    Parcel localParcel = a(17, i_());
    boolean bool = ajb.a(localParcel);
    localParcel.recycle();
    return bool;
  }
  
  public final boolean q()
  {
    Parcel localParcel = a(18, i_());
    boolean bool = ajb.a(localParcel);
    localParcel.recycle();
    return bool;
  }
  
  public final void r()
  {
    b(19, i_());
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bdf
 * JD-Core Version:    0.7.0.1
 */