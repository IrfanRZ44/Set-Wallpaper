package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;
import java.util.ArrayList;
import java.util.List;

public final class avm
  extends aiz
  implements avk
{
  avm(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
  }
  
  public final String a(String paramString)
  {
    Parcel localParcel1 = i_();
    localParcel1.writeString(paramString);
    Parcel localParcel2 = a(1, localParcel1);
    String str = localParcel2.readString();
    localParcel2.recycle();
    return str;
  }
  
  public final List<String> a()
  {
    Parcel localParcel = a(3, i_());
    ArrayList localArrayList = localParcel.createStringArrayList();
    localParcel.recycle();
    return localArrayList;
  }
  
  public final boolean a(a parama)
  {
    Parcel localParcel1 = i_();
    ajb.a(localParcel1, parama);
    Parcel localParcel2 = a(10, localParcel1);
    boolean bool = ajb.a(localParcel2);
    localParcel2.recycle();
    return bool;
  }
  
  public final a b()
  {
    Parcel localParcel = a(11, i_());
    a locala = a.a.a(localParcel.readStrongBinder());
    localParcel.recycle();
    return locala;
  }
  
  public final aun b(String paramString)
  {
    Parcel localParcel1 = i_();
    localParcel1.writeString(paramString);
    Parcel localParcel2 = a(2, localParcel1);
    IBinder localIBinder = localParcel2.readStrongBinder();
    Object localObject;
    if (localIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      localParcel2.recycle();
      return localObject;
      IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
      if ((localIInterface instanceof aun)) {
        localObject = (aun)localIInterface;
      } else {
        localObject = new aup(localIBinder);
      }
    }
  }
  
  public final aqg c()
  {
    Parcel localParcel = a(7, i_());
    aqg localaqg = aqh.a(localParcel.readStrongBinder());
    localParcel.recycle();
    return localaqg;
  }
  
  public final void c(String paramString)
  {
    Parcel localParcel = i_();
    localParcel.writeString(paramString);
    b(5, localParcel);
  }
  
  public final void d()
  {
    b(6, i_());
  }
  
  public final a e()
  {
    Parcel localParcel = a(9, i_());
    a locala = a.a.a(localParcel.readStrongBinder());
    localParcel.recycle();
    return locala;
  }
  
  public final void f()
  {
    b(8, i_());
  }
  
  public final String l()
  {
    Parcel localParcel = a(4, i_());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.avm
 * JD-Core Version:    0.7.0.1
 */