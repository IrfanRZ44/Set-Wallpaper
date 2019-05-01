package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class aqk
  extends aja
  implements aqj
{
  public aqk()
  {
    super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
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
      b();
      continue;
      c();
      continue;
      d();
      continue;
      a(ajb.a(paramParcel1));
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aqk
 * JD-Core Version:    0.7.0.1
 */