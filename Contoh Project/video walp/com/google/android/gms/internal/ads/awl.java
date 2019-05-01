package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.a;
import java.util.List;

public abstract class awl
  extends aja
  implements awk
{
  public awl()
  {
    super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
  }
  
  protected final boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return false;
    case 2: 
      String str7 = a();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str7);
    }
    for (;;)
    {
      return true;
      List localList = b();
      paramParcel2.writeNoException();
      paramParcel2.writeList(localList);
      continue;
      String str6 = c();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str6);
      continue;
      aun localaun = d();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, localaun);
      continue;
      String str5 = e();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str5);
      continue;
      String str4 = f();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str4);
      continue;
      double d = g();
      paramParcel2.writeNoException();
      paramParcel2.writeDouble(d);
      continue;
      String str3 = h();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str3);
      continue;
      String str2 = i();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str2);
      continue;
      aqg localaqg = j();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, localaqg);
      continue;
      String str1 = q();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str1);
      continue;
      t();
      paramParcel2.writeNoException();
      continue;
      auj localauj = s();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, localauj);
      continue;
      a((Bundle)ajb.a(paramParcel1, Bundle.CREATOR));
      paramParcel2.writeNoException();
      continue;
      boolean bool = b((Bundle)ajb.a(paramParcel1, Bundle.CREATOR));
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, bool);
      continue;
      c((Bundle)ajb.a(paramParcel1, Bundle.CREATOR));
      paramParcel2.writeNoException();
      continue;
      a locala2 = n();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, locala2);
      continue;
      a locala1 = p();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, locala1);
      continue;
      Bundle localBundle = r();
      paramParcel2.writeNoException();
      ajb.b(paramParcel2, localBundle);
      continue;
      IBinder localIBinder = paramParcel1.readStrongBinder();
      Object localObject;
      if (localIBinder == null) {
        localObject = null;
      }
      for (;;)
      {
        a((awh)localObject);
        paramParcel2.writeNoException();
        break;
        IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
        if ((localIInterface instanceof awh)) {
          localObject = (awh)localIInterface;
        } else {
          localObject = new awj(localIBinder);
        }
      }
      u();
      paramParcel2.writeNoException();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.awl
 * JD-Core Version:    0.7.0.1
 */