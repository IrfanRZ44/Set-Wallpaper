package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class aqi
  extends aiz
  implements aqg
{
  aqi(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IVideoController");
  }
  
  public final void a()
  {
    b(1, i_());
  }
  
  public final void a(aqj paramaqj)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramaqj);
    b(8, localParcel);
  }
  
  public final void a(boolean paramBoolean)
  {
    Parcel localParcel = i_();
    ajb.a(localParcel, paramBoolean);
    b(3, localParcel);
  }
  
  public final void b()
  {
    b(2, i_());
  }
  
  public final boolean c()
  {
    Parcel localParcel = a(4, i_());
    boolean bool = ajb.a(localParcel);
    localParcel.recycle();
    return bool;
  }
  
  public final int d()
  {
    Parcel localParcel = a(5, i_());
    int i = localParcel.readInt();
    localParcel.recycle();
    return i;
  }
  
  public final float e()
  {
    Parcel localParcel = a(9, i_());
    float f = localParcel.readFloat();
    localParcel.recycle();
    return f;
  }
  
  public final float f()
  {
    Parcel localParcel = a(6, i_());
    float f = localParcel.readFloat();
    localParcel.recycle();
    return f;
  }
  
  public final float g()
  {
    Parcel localParcel = a(7, i_());
    float f = localParcel.readFloat();
    localParcel.recycle();
    return f;
  }
  
  public final aqj h()
  {
    Parcel localParcel = a(11, i_());
    IBinder localIBinder = localParcel.readStrongBinder();
    Object localObject;
    if (localIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      localParcel.recycle();
      return localObject;
      IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
      if ((localIInterface instanceof aqj)) {
        localObject = (aqj)localIInterface;
      } else {
        localObject = new aql(localIBinder);
      }
    }
  }
  
  public final boolean i()
  {
    Parcel localParcel = a(10, i_());
    boolean bool = ajb.a(localParcel);
    localParcel.recycle();
    return bool;
  }
  
  public final boolean j()
  {
    Parcel localParcel = a(12, i_());
    boolean bool = ajb.a(localParcel);
    localParcel.recycle();
    return bool;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aqi
 * JD-Core Version:    0.7.0.1
 */