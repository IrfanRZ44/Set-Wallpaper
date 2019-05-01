package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class apc
  extends aja
  implements apb
{
  public apc()
  {
    super("com.google.android.gms.ads.internal.client.IAdLoader");
  }
  
  protected final boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return false;
    case 1: 
      zzd((zzjj)ajb.a(paramParcel1, zzjj.CREATOR));
      paramParcel2.writeNoException();
    }
    for (;;)
    {
      return true;
      String str2 = getMediationAdapterClassName();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str2);
      continue;
      boolean bool = isLoading();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, bool);
      continue;
      String str1 = zzck();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str1);
      continue;
      zza((zzjj)ajb.a(paramParcel1, zzjj.CREATOR), paramParcel1.readInt());
      paramParcel2.writeNoException();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.apc
 * JD-Core Version:    0.7.0.1
 */