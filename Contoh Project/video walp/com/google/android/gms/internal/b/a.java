package com.google.android.gms.internal.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a
  implements IInterface
{
  private final IBinder a;
  private final String b;
  
  protected a(IBinder paramIBinder, String paramString)
  {
    this.a = paramIBinder;
    this.b = paramString;
  }
  
  protected Parcel a(int paramInt, Parcel paramParcel)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      this.a.transact(paramInt, paramParcel, localParcel, 0);
      localParcel.readException();
      return localParcel;
    }
    catch (RuntimeException localRuntimeException)
    {
      throw localRuntimeException;
    }
    finally
    {
      paramParcel.recycle();
    }
  }
  
  public IBinder asBinder()
  {
    return this.a;
  }
  
  protected void b(int paramInt, Parcel paramParcel)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      this.a.transact(paramInt, paramParcel, localParcel, 0);
      localParcel.readException();
      return;
    }
    finally
    {
      paramParcel.recycle();
      localParcel.recycle();
    }
  }
  
  protected Parcel d()
  {
    Parcel localParcel = Parcel.obtain();
    localParcel.writeInterfaceToken(this.b);
    return localParcel;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.b.a
 * JD-Core Version:    0.7.0.1
 */