package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class apa
  extends aiz
  implements aoy
{
  apa(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IAdListener");
  }
  
  public final void a()
  {
    b(1, i_());
  }
  
  public final void a(int paramInt)
  {
    Parcel localParcel = i_();
    localParcel.writeInt(paramInt);
    b(2, localParcel);
  }
  
  public final void b()
  {
    b(3, i_());
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
    b(7, i_());
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.apa
 * JD-Core Version:    0.7.0.1
 */