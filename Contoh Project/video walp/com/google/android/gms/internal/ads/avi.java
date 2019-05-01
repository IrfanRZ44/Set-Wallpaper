package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;
import java.util.ArrayList;
import java.util.List;

public final class avi
  extends aiz
  implements avg
{
  avi(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.formats.client.INativeContentAd");
  }
  
  public final String a()
  {
    Parcel localParcel = a(3, i_());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final void a(Bundle paramBundle)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramBundle);
    b(12, localParcel);
  }
  
  public final List b()
  {
    Parcel localParcel = a(4, i_());
    ArrayList localArrayList = ajb.b(localParcel);
    localParcel.recycle();
    return localArrayList;
  }
  
  public final boolean b(Bundle paramBundle)
  {
    Parcel localParcel1 = i_();
    ajb.a(localParcel1, paramBundle);
    Parcel localParcel2 = a(13, localParcel1);
    boolean bool = ajb.a(localParcel2);
    localParcel2.recycle();
    return bool;
  }
  
  public final a c()
  {
    Parcel localParcel = a(16, i_());
    a locala = a.a.a(localParcel.readStrongBinder());
    localParcel.recycle();
    return locala;
  }
  
  public final void c(Bundle paramBundle)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramBundle);
    b(14, localParcel);
  }
  
  public final String d()
  {
    Parcel localParcel = a(17, i_());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final String e()
  {
    Parcel localParcel = a(5, i_());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final aun f()
  {
    Parcel localParcel = a(6, i_());
    IBinder localIBinder = localParcel.readStrongBinder();
    Object localObject;
    if (localIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      localParcel.recycle();
      return localObject;
      IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
      if ((localIInterface instanceof aun)) {
        localObject = (aun)localIInterface;
      } else {
        localObject = new aup(localIBinder);
      }
    }
  }
  
  public final String g()
  {
    Parcel localParcel = a(7, i_());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final String h()
  {
    Parcel localParcel = a(8, i_());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final aqg i()
  {
    Parcel localParcel = a(11, i_());
    aqg localaqg = aqh.a(localParcel.readStrongBinder());
    localParcel.recycle();
    return localaqg;
  }
  
  public final a j()
  {
    Parcel localParcel = a(2, i_());
    a locala = a.a.a(localParcel.readStrongBinder());
    localParcel.recycle();
    return locala;
  }
  
  public final Bundle n()
  {
    Parcel localParcel = a(9, i_());
    Bundle localBundle = (Bundle)ajb.a(localParcel, Bundle.CREATOR);
    localParcel.recycle();
    return localBundle;
  }
  
  public final auj p()
  {
    Parcel localParcel = a(15, i_());
    IBinder localIBinder = localParcel.readStrongBinder();
    Object localObject;
    if (localIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      localParcel.recycle();
      return localObject;
      IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
      if ((localIInterface instanceof auj)) {
        localObject = (auj)localIInterface;
      } else {
        localObject = new aul(localIBinder);
      }
    }
  }
  
  public final void q()
  {
    b(10, i_());
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.avi
 * JD-Core Version:    0.7.0.1
 */