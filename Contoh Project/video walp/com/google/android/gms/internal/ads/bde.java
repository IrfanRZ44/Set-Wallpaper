package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;
import java.util.List;

public abstract class bde
  extends aja
  implements bdd
{
  public bde()
  {
    super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
  }
  
  protected final boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return false;
    case 2: 
      String str6 = a();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str6);
    }
    for (;;)
    {
      return true;
      List localList = b();
      paramParcel2.writeNoException();
      paramParcel2.writeList(localList);
      continue;
      String str5 = c();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str5);
      continue;
      aun localaun = d();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, localaun);
      continue;
      String str4 = e();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str4);
      continue;
      String str3 = f();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str3);
      continue;
      double d = g();
      paramParcel2.writeNoException();
      paramParcel2.writeDouble(d);
      continue;
      String str2 = h();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str2);
      continue;
      String str1 = i();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str1);
      continue;
      aqg localaqg = j();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, localaqg);
      continue;
      auj localauj = k();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, localauj);
      continue;
      a locala3 = l();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, locala3);
      continue;
      a locala2 = m();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, locala2);
      continue;
      a locala1 = n();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, locala1);
      continue;
      Bundle localBundle = o();
      paramParcel2.writeNoException();
      ajb.b(paramParcel2, localBundle);
      continue;
      boolean bool2 = p();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, bool2);
      continue;
      boolean bool1 = q();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, bool1);
      continue;
      r();
      paramParcel2.writeNoException();
      continue;
      a(a.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      continue;
      a(a.a.a(paramParcel1.readStrongBinder()), a.a.a(paramParcel1.readStrongBinder()), a.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      continue;
      b(a.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bde
 * JD-Core Version:    0.7.0.1
 */