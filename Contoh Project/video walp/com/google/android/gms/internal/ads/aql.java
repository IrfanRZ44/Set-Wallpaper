package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class aql
  extends aiz
  implements aqj
{
  aql(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
  }
  
  public final void a()
  {
    b(1, i_());
  }
  
  public final void a(boolean paramBoolean)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramBoolean);
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
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aql
 * JD-Core Version:    0.7.0.1
 */