package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class aja
  extends Binder
  implements IInterface
{
  private static ajc zzuh = null;
  
  protected aja(String paramString)
  {
    attachInterface(this, paramString);
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  protected boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    return false;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    if (paramInt1 > 16777215) {}
    for (boolean bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2); bool; bool = false)
    {
      return true;
      paramParcel1.enforceInterface(getInterfaceDescriptor());
    }
    return dispatchTransaction(paramInt1, paramParcel1, paramParcel2, paramInt2);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aja
 * JD-Core Version:    0.7.0.1
 */