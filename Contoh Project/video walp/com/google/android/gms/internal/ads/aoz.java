package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class aoz
  extends aja
  implements aoy
{
  public aoz()
  {
    super("com.google.android.gms.ads.internal.client.IAdListener");
  }
  
  protected final boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return false;
    case 1: 
      a();
    }
    for (;;)
    {
      paramParcel2.writeNoException();
      return true;
      a(paramParcel1.readInt());
      continue;
      b();
      continue;
      c();
      continue;
      d();
      continue;
      e();
      continue;
      f();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aoz
 * JD-Core Version:    0.7.0.1
 */