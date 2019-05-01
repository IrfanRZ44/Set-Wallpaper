package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;
import java.util.ArrayList;
import java.util.List;

public final class bdc
  extends aiz
  implements bda
{
  bdc(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
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
    b(9, localParcel);
  }
  
  public final void a(a parama1, a parama2, a parama3)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, parama1);
    ajb.a(localParcel, parama2);
    ajb.a(localParcel, parama3);
    b(22, localParcel);
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
    b(10, localParcel);
  }
  
  public final String c()
  {
    Parcel localParcel = a(4, i_());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final void c(a parama)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, parama);
    b(14, localParcel);
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
  
  public final void g()
  {
    b(8, i_());
  }
  
  public final boolean h()
  {
    Parcel localParcel = a(11, i_());
    boolean bool = ajb.a(localParcel);
    localParcel.recycle();
    return bool;
  }
  
  public final boolean i()
  {
    Parcel localParcel = a(12, i_());
    boolean bool = ajb.a(localParcel);
    localParcel.recycle();
    return bool;
  }
  
  public final Bundle j()
  {
    Parcel localParcel = a(13, i_());
    Bundle localBundle = (Bundle)ajb.a(localParcel, Bundle.CREATOR);
    localParcel.recycle();
    return localBundle;
  }
  
  public final a k()
  {
    Parcel localParcel = a(15, i_());
    a locala = a.a.a(localParcel.readStrongBinder());
    localParcel.recycle();
    return locala;
  }
  
  public final aqg l()
  {
    Parcel localParcel = a(16, i_());
    aqg localaqg = aqh.a(localParcel.readStrongBinder());
    localParcel.recycle();
    return localaqg;
  }
  
  public final auj m()
  {
    Parcel localParcel = a(19, i_());
    auj localauj = auk.a(localParcel.readStrongBinder());
    localParcel.recycle();
    return localauj;
  }
  
  public final a n()
  {
    Parcel localParcel = a(20, i_());
    a locala = a.a.a(localParcel.readStrongBinder());
    localParcel.recycle();
    return locala;
  }
  
  public final a o()
  {
    Parcel localParcel = a(21, i_());
    a locala = a.a.a(localParcel.readStrongBinder());
    localParcel.recycle();
    return locala;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bdc
 * JD-Core Version:    0.7.0.1
 */