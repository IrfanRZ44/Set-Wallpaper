package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;
import java.util.List;

public final class bcp
  extends aiz
  implements bcn
{
  bcp(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
  }
  
  public final a a()
  {
    Parcel localParcel = a(2, i_());
    a locala = a.a.a(localParcel.readStrongBinder());
    localParcel.recycle();
    return locala;
  }
  
  public final void a(a parama)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, parama);
    b(21, localParcel);
  }
  
  public final void a(a parama, hf paramhf, List<String> paramList)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, parama);
    ajb.a(localParcel, paramhf);
    localParcel.writeStringList(paramList);
    b(23, localParcel);
  }
  
  public final void a(a parama, zzjj paramzzjj, String paramString, bcq parambcq)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, parama);
    ajb.a(localParcel, paramzzjj);
    localParcel.writeString(paramString);
    ajb.a(localParcel, parambcq);
    b(3, localParcel);
  }
  
  public final void a(a parama, zzjj paramzzjj, String paramString1, hf paramhf, String paramString2)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, parama);
    ajb.a(localParcel, paramzzjj);
    localParcel.writeString(paramString1);
    ajb.a(localParcel, paramhf);
    localParcel.writeString(paramString2);
    b(10, localParcel);
  }
  
  public final void a(a parama, zzjj paramzzjj, String paramString1, String paramString2, bcq parambcq)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, parama);
    ajb.a(localParcel, paramzzjj);
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    ajb.a(localParcel, parambcq);
    b(7, localParcel);
  }
  
  public final void a(a parama, zzjj paramzzjj, String paramString1, String paramString2, bcq parambcq, zzpl paramzzpl, List<String> paramList)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, parama);
    ajb.a(localParcel, paramzzjj);
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    ajb.a(localParcel, parambcq);
    ajb.a(localParcel, paramzzpl);
    localParcel.writeStringList(paramList);
    b(14, localParcel);
  }
  
  public final void a(a parama, zzjn paramzzjn, zzjj paramzzjj, String paramString, bcq parambcq)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, parama);
    ajb.a(localParcel, paramzzjn);
    ajb.a(localParcel, paramzzjj);
    localParcel.writeString(paramString);
    ajb.a(localParcel, parambcq);
    b(1, localParcel);
  }
  
  public final void a(a parama, zzjn paramzzjn, zzjj paramzzjj, String paramString1, String paramString2, bcq parambcq)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, parama);
    ajb.a(localParcel, paramzzjn);
    ajb.a(localParcel, paramzzjj);
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    ajb.a(localParcel, parambcq);
    b(6, localParcel);
  }
  
  public final void a(zzjj paramzzjj, String paramString)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramzzjj);
    localParcel.writeString(paramString);
    b(11, localParcel);
  }
  
  public final void a(zzjj paramzzjj, String paramString1, String paramString2)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramzzjj);
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    b(20, localParcel);
  }
  
  public final void a(boolean paramBoolean)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramBoolean);
    b(25, localParcel);
  }
  
  public final void b()
  {
    b(4, i_());
  }
  
  public final void c()
  {
    b(5, i_());
  }
  
  public final void d()
  {
    b(8, i_());
  }
  
  public final void e()
  {
    b(9, i_());
  }
  
  public final void f()
  {
    b(12, i_());
  }
  
  public final boolean g()
  {
    Parcel localParcel = a(13, i_());
    boolean bool = ajb.a(localParcel);
    localParcel.recycle();
    return bool;
  }
  
  public final bcw h()
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
      IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
      if ((localIInterface instanceof bcw)) {
        localObject = (bcw)localIInterface;
      } else {
        localObject = new bcz(localIBinder);
      }
    }
  }
  
  public final bda i()
  {
    Parcel localParcel = a(16, i_());
    IBinder localIBinder = localParcel.readStrongBinder();
    Object localObject;
    if (localIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      localParcel.recycle();
      return localObject;
      IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
      if ((localIInterface instanceof bda)) {
        localObject = (bda)localIInterface;
      } else {
        localObject = new bdc(localIBinder);
      }
    }
  }
  
  public final Bundle j()
  {
    Parcel localParcel = a(17, i_());
    Bundle localBundle = (Bundle)ajb.a(localParcel, Bundle.CREATOR);
    localParcel.recycle();
    return localBundle;
  }
  
  public final Bundle k()
  {
    Parcel localParcel = a(18, i_());
    Bundle localBundle = (Bundle)ajb.a(localParcel, Bundle.CREATOR);
    localParcel.recycle();
    return localBundle;
  }
  
  public final Bundle l()
  {
    Parcel localParcel = a(19, i_());
    Bundle localBundle = (Bundle)ajb.a(localParcel, Bundle.CREATOR);
    localParcel.recycle();
    return localBundle;
  }
  
  public final boolean m()
  {
    Parcel localParcel = a(22, i_());
    boolean bool = ajb.a(localParcel);
    localParcel.recycle();
    return bool;
  }
  
  public final avk n()
  {
    Parcel localParcel = a(24, i_());
    avk localavk = avl.a(localParcel.readStrongBinder());
    localParcel.recycle();
    return localavk;
  }
  
  public final aqg o()
  {
    Parcel localParcel = a(26, i_());
    aqg localaqg = aqh.a(localParcel.readStrongBinder());
    localParcel.recycle();
    return localaqg;
  }
  
  public final bdd p()
  {
    Parcel localParcel = a(27, i_());
    IBinder localIBinder = localParcel.readStrongBinder();
    Object localObject;
    if (localIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      localParcel.recycle();
      return localObject;
      IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
      if ((localIInterface instanceof bdd)) {
        localObject = (bdd)localIInterface;
      } else {
        localObject = new bdf(localIBinder);
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bcp
 * JD-Core Version:    0.7.0.1
 */