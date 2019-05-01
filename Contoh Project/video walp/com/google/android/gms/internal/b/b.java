package com.google.android.gms.internal.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class b
  extends Binder
  implements IInterface
{
  private static d a = null;
  
  protected b(String paramString)
  {
    attachInterface(this, paramString);
  }
  
  protected boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    return false;
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  protected boolean b(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    if (paramInt1 > 16777215) {
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    paramParcel1.enforceInterface(getInterfaceDescriptor());
    return false;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    if (b(paramInt1, paramParcel1, paramParcel2, paramInt2)) {
      return true;
    }
    return a(paramInt1, paramParcel1, paramParcel2, paramInt2);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.b.b
 * JD-Core Version:    0.7.0.1
 */