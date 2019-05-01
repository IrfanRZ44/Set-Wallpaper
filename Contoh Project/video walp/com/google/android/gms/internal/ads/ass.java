package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.a.a.a;

public abstract class ass
  extends aja
  implements asr
{
  public ass()
  {
    super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
  }
  
  protected final boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return false;
    case 1: 
      String str2 = a();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str2);
    }
    for (;;)
    {
      return true;
      String str1 = b();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str1);
      continue;
      a(a.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      continue;
      c();
      paramParcel2.writeNoException();
      continue;
      d();
      paramParcel2.writeNoException();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ass
 * JD-Core Version:    0.7.0.1
 */