package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class gj
  extends aiz
  implements gh
{
  gj(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
  }
  
  public final void a()
  {
    b(1, i_());
  }
  
  public final void a(int paramInt)
  {
    Parcel localParcel = i_();
    localParcel.writeInt(paramInt);
    b(7, localParcel);
  }
  
  public final void a(fw paramfw)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramfw);
    b(5, localParcel);
  }
  
  public final void b()
  {
    b(2, i_());
  }
  
  public final void c()
  {
    b(3, i_());
  }
  
  public final void d()
  {
    b(4, i_());
  }
  
  public final void e()
  {
    b(6, i_());
  }
  
  public final void f()
  {
    b(8, i_());
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.gj
 * JD-Core Version:    0.7.0.1
 */