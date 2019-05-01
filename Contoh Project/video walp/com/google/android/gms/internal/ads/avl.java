package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;
import java.util.List;

public abstract class avl
  extends aja
  implements avk
{
  public avl()
  {
    super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
  }
  
  public static avk a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    if ((localIInterface instanceof avk)) {
      return (avk)localIInterface;
    }
    return new avm(paramIBinder);
  }
  
  protected final boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return false;
    case 1: 
      String str2 = a(paramParcel1.readString());
      paramParcel2.writeNoException();
      paramParcel2.writeString(str2);
    }
    for (;;)
    {
      return true;
      aun localaun = b(paramParcel1.readString());
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, localaun);
      continue;
      List localList = a();
      paramParcel2.writeNoException();
      paramParcel2.writeStringList(localList);
      continue;
      String str1 = l();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str1);
      continue;
      c(paramParcel1.readString());
      paramParcel2.writeNoException();
      continue;
      d();
      paramParcel2.writeNoException();
      continue;
      aqg localaqg = c();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, localaqg);
      continue;
      f();
      paramParcel2.writeNoException();
      continue;
      a locala2 = e();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, locala2);
      continue;
      boolean bool = a(a.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, bool);
      continue;
      a locala1 = b();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, locala1);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.avl
 * JD-Core Version:    0.7.0.1
 */