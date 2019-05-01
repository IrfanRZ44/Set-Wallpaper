package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.a.a;
import java.util.List;

public abstract class avh
  extends aja
  implements avg
{
  public avh()
  {
    super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
  }
  
  protected final boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return false;
    case 2: 
      a locala2 = j();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, locala2);
    }
    for (;;)
    {
      return true;
      String str5 = a();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str5);
      continue;
      List localList = b();
      paramParcel2.writeNoException();
      paramParcel2.writeList(localList);
      continue;
      String str4 = e();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str4);
      continue;
      aun localaun = f();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, localaun);
      continue;
      String str3 = g();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str3);
      continue;
      String str2 = h();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str2);
      continue;
      Bundle localBundle = n();
      paramParcel2.writeNoException();
      ajb.b(paramParcel2, localBundle);
      continue;
      q();
      paramParcel2.writeNoException();
      continue;
      aqg localaqg = i();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, localaqg);
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
      auj localauj = p();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, localauj);
      continue;
      a locala1 = c();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, locala1);
      continue;
      String str1 = d();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str1);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.avh
 * JD-Core Version:    0.7.0.1
 */