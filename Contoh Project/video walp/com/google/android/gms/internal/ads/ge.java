package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;

public final class ge
  extends aiz
  implements gb
{
  ge(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
  }
  
  public final void a()
  {
    b(2, i_());
  }
  
  public final void a(a parama)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, parama);
    b(9, localParcel);
  }
  
  public final void a(apo paramapo)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramapo);
    b(14, localParcel);
  }
  
  public final void a(fz paramfz)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramfz);
    b(16, localParcel);
  }
  
  public final void a(gh paramgh)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramgh);
    b(3, localParcel);
  }
  
  public final void a(zzahk paramzzahk)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramzzahk);
    b(1, localParcel);
  }
  
  public final void a(String paramString)
  {
    Parcel localParcel = i_();
    localParcel.writeString(paramString);
    b(13, localParcel);
  }
  
  public final void a(boolean paramBoolean)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramBoolean);
    b(34, localParcel);
  }
  
  public final Bundle b()
  {
    Parcel localParcel = a(15, i_());
    Bundle localBundle = (Bundle)ajb.a(localParcel, Bundle.CREATOR);
    localParcel.recycle();
    return localBundle;
  }
  
  public final void b(a parama)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, parama);
    b(10, localParcel);
  }
  
  public final void c(a parama)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, parama);
    b(11, localParcel);
  }
  
  public final boolean c()
  {
    Parcel localParcel = a(5, i_());
    boolean bool = ajb.a(localParcel);
    localParcel.recycle();
    return bool;
  }
  
  public final void d()
  {
    b(6, i_());
  }
  
  public final void e()
  {
    b(7, i_());
  }
  
  public final void f()
  {
    b(8, i_());
  }
  
  public final String g()
  {
    Parcel localParcel = a(12, i_());
    String str = localParcel.readString();
    localParcel.recycle();
    return str;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ge
 * JD-Core Version:    0.7.0.1
 */