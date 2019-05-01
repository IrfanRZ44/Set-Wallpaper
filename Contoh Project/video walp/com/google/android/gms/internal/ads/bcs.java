package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class bcs
  extends aiz
  implements bcq
{
  bcs(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
  }
  
  public final void a()
  {
    b(1, i_());
  }
  
  public final void a(int paramInt)
  {
    Parcel localParcel = i_();
    localParcel.writeInt(paramInt);
    b(3, localParcel);
  }
  
  public final void a(avk paramavk, String paramString)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramavk);
    localParcel.writeString(paramString);
    b(10, localParcel);
  }
  
  public final void a(bct parambct)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, parambct);
    b(7, localParcel);
  }
  
  public final void a(String paramString)
  {
    Parcel localParcel = i_();
    localParcel.writeString(paramString);
    b(12, localParcel);
  }
  
  public final void a(String paramString1, String paramString2)
  {
    Parcel localParcel = i_();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    b(9, localParcel);
  }
  
  public final void b()
  {
    b(2, i_());
  }
  
  public final void c()
  {
    b(4, i_());
  }
  
  public final void d()
  {
    b(5, i_());
  }
  
  public final void e()
  {
    b(6, i_());
  }
  
  public final void f()
  {
    b(8, i_());
  }
  
  public final void g()
  {
    b(11, i_());
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bcs
 * JD-Core Version:    0.7.0.1
 */