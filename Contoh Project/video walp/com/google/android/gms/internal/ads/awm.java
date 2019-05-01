package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;
import java.util.ArrayList;
import java.util.List;

public final class awm
  extends aiz
  implements awk
{
  awm(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
  }
  
  public final String a()
  {
    Parcel localParcel = a(2, i_());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final void a(Bundle paramBundle)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramBundle);
    b(15, localParcel);
  }
  
  public final void a(awh paramawh)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramawh);
    b(21, localParcel);
  }
  
  public final List b()
  {
    Parcel localParcel = a(3, i_());
    ArrayList localArrayList = ajb.b(localParcel);
    localParcel.recycle();
    return localArrayList;
  }
  
  public final boolean b(Bundle paramBundle)
  {
    Parcel localParcel1 = i_();
    ajb.a(localParcel1, paramBundle);
    Parcel localParcel2 = a(16, localParcel1);
    boolean bool = ajb.a(localParcel2);
    localParcel2.recycle();
    return bool;
  }
  
  public final String c()
  {
    Parcel localParcel = a(4, i_());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final void c(Bundle paramBundle)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramBundle);
    b(17, localParcel);
  }
  
  public final aun d()
  {
    Parcel localParcel = a(5, i_());
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
  
  public final a n()
  {
    Parcel localParcel = a(18, i_());
    a locala = a.a.a(localParcel.readStrongBinder());
    localParcel.recycle();
    return locala;
  }
  
  public final a p()
  {
    Parcel localParcel = a(19, i_());
    a locala = a.a.a(localParcel.readStrongBinder());
    localParcel.recycle();
    return locala;
  }
  
  public final String q()
  {
    Parcel localParcel = a(12, i_());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
  
  public final Bundle r()
  {
    Parcel localParcel = a(20, i_());
    Bundle localBundle = (Bundle)ajb.a(localParcel, Bundle.CREATOR);
    localParcel.recycle();
    return localBundle;
  }
  
  public final auj s()
  {
    Parcel localParcel = a(14, i_());
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
  
  public final void t()
  {
    b(13, i_());
  }
  
  public final void u()
  {
    b(22, i_());
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.awm
 * JD-Core Version:    0.7.0.1
 */