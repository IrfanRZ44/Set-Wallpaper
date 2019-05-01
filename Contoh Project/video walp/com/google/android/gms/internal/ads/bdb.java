package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;
import java.util.List;

public abstract class bdb
  extends aja
  implements bda
{
  public bdb()
  {
    super("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
  }
  
  protected final boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    case 17: 
    case 18: 
    default: 
      return false;
    case 2: 
      String str4 = a();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str4);
    }
    for (;;)
    {
      return true;
      List localList = b();
      paramParcel2.writeNoException();
      paramParcel2.writeList(localList);
      continue;
      String str3 = c();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str3);
      continue;
      aun localaun = d();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, localaun);
      continue;
      String str2 = e();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str2);
      continue;
      String str1 = f();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str1);
      continue;
      g();
      paramParcel2.writeNoException();
      continue;
      a(a.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      continue;
      b(a.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      continue;
      boolean bool2 = h();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, bool2);
      continue;
      boolean bool1 = i();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, bool1);
      continue;
      Bundle localBundle = j();
      paramParcel2.writeNoException();
      ajb.b(paramParcel2, localBundle);
      continue;
      c(a.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      continue;
      a locala3 = k();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, locala3);
      continue;
      aqg localaqg = l();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, localaqg);
      continue;
      auj localauj = m();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, localauj);
      continue;
      a locala2 = n();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, locala2);
      continue;
      a locala1 = o();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, locala1);
      continue;
      a(a.a.a(paramParcel1.readStrongBinder()), a.a.a(paramParcel1.readStrongBinder()), a.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bdb
 * JD-Core Version:    0.7.0.1
 */