package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;

public abstract class bco
  extends aja
  implements bcn
{
  public bco()
  {
    super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
  }
  
  protected final boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    IBinder localIBinder5;
    Object localObject5;
    switch (paramInt1)
    {
    default: 
      return false;
    case 1: 
      a locala6 = a.a.a(paramParcel1.readStrongBinder());
      zzjn localzzjn2 = (zzjn)ajb.a(paramParcel1, zzjn.CREATOR);
      zzjj localzzjj5 = (zzjj)ajb.a(paramParcel1, zzjj.CREATOR);
      String str8 = paramParcel1.readString();
      localIBinder5 = paramParcel1.readStrongBinder();
      if (localIBinder5 == null)
      {
        localObject5 = null;
        a(locala6, localzzjn2, localzzjj5, str8, (bcq)localObject5);
        paramParcel2.writeNoException();
      }
      break;
    }
    for (;;)
    {
      return true;
      IInterface localIInterface5 = localIBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
      if ((localIInterface5 instanceof bcq))
      {
        localObject5 = (bcq)localIInterface5;
        break;
      }
      localObject5 = new bcs(localIBinder5);
      break;
      a locala5 = a();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, locala5);
      continue;
      a locala4 = a.a.a(paramParcel1.readStrongBinder());
      zzjj localzzjj4 = (zzjj)ajb.a(paramParcel1, zzjj.CREATOR);
      String str7 = paramParcel1.readString();
      IBinder localIBinder4 = paramParcel1.readStrongBinder();
      Object localObject4 = null;
      if (localIBinder4 == null) {}
      for (;;)
      {
        a(locala4, localzzjj4, str7, (bcq)localObject4);
        paramParcel2.writeNoException();
        break;
        IInterface localIInterface4 = localIBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        if ((localIInterface4 instanceof bcq)) {
          localObject4 = (bcq)localIInterface4;
        } else {
          localObject4 = new bcs(localIBinder4);
        }
      }
      b();
      paramParcel2.writeNoException();
      continue;
      c();
      paramParcel2.writeNoException();
      continue;
      a locala3 = a.a.a(paramParcel1.readStrongBinder());
      zzjn localzzjn1 = (zzjn)ajb.a(paramParcel1, zzjn.CREATOR);
      zzjj localzzjj3 = (zzjj)ajb.a(paramParcel1, zzjj.CREATOR);
      String str5 = paramParcel1.readString();
      String str6 = paramParcel1.readString();
      IBinder localIBinder3 = paramParcel1.readStrongBinder();
      Object localObject3 = null;
      if (localIBinder3 == null) {}
      for (;;)
      {
        a(locala3, localzzjn1, localzzjj3, str5, str6, (bcq)localObject3);
        paramParcel2.writeNoException();
        break;
        IInterface localIInterface3 = localIBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        if ((localIInterface3 instanceof bcq)) {
          localObject3 = (bcq)localIInterface3;
        } else {
          localObject3 = new bcs(localIBinder3);
        }
      }
      a locala2 = a.a.a(paramParcel1.readStrongBinder());
      zzjj localzzjj2 = (zzjj)ajb.a(paramParcel1, zzjj.CREATOR);
      String str3 = paramParcel1.readString();
      String str4 = paramParcel1.readString();
      IBinder localIBinder2 = paramParcel1.readStrongBinder();
      Object localObject2;
      if (localIBinder2 == null) {
        localObject2 = null;
      }
      for (;;)
      {
        a(locala2, localzzjj2, str3, str4, (bcq)localObject2);
        paramParcel2.writeNoException();
        break;
        IInterface localIInterface2 = localIBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        if ((localIInterface2 instanceof bcq)) {
          localObject2 = (bcq)localIInterface2;
        } else {
          localObject2 = new bcs(localIBinder2);
        }
      }
      d();
      paramParcel2.writeNoException();
      continue;
      e();
      paramParcel2.writeNoException();
      continue;
      a(a.a.a(paramParcel1.readStrongBinder()), (zzjj)ajb.a(paramParcel1, zzjj.CREATOR), paramParcel1.readString(), hg.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      continue;
      a((zzjj)ajb.a(paramParcel1, zzjj.CREATOR), paramParcel1.readString());
      paramParcel2.writeNoException();
      continue;
      f();
      paramParcel2.writeNoException();
      continue;
      boolean bool2 = g();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, bool2);
      continue;
      a locala1 = a.a.a(paramParcel1.readStrongBinder());
      zzjj localzzjj1 = (zzjj)ajb.a(paramParcel1, zzjj.CREATOR);
      String str1 = paramParcel1.readString();
      String str2 = paramParcel1.readString();
      IBinder localIBinder1 = paramParcel1.readStrongBinder();
      Object localObject1;
      if (localIBinder1 == null) {
        localObject1 = null;
      }
      for (;;)
      {
        a(locala1, localzzjj1, str1, str2, (bcq)localObject1, (zzpl)ajb.a(paramParcel1, zzpl.CREATOR), paramParcel1.createStringArrayList());
        paramParcel2.writeNoException();
        break;
        IInterface localIInterface1 = localIBinder1.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        if ((localIInterface1 instanceof bcq)) {
          localObject1 = (bcq)localIInterface1;
        } else {
          localObject1 = new bcs(localIBinder1);
        }
      }
      bcw localbcw = h();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, localbcw);
      continue;
      bda localbda = i();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, localbda);
      continue;
      Bundle localBundle3 = j();
      paramParcel2.writeNoException();
      ajb.b(paramParcel2, localBundle3);
      continue;
      Bundle localBundle2 = k();
      paramParcel2.writeNoException();
      ajb.b(paramParcel2, localBundle2);
      continue;
      Bundle localBundle1 = l();
      paramParcel2.writeNoException();
      ajb.b(paramParcel2, localBundle1);
      continue;
      a((zzjj)ajb.a(paramParcel1, zzjj.CREATOR), paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      continue;
      a(a.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      continue;
      boolean bool1 = m();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, bool1);
      continue;
      a(a.a.a(paramParcel1.readStrongBinder()), hg.a(paramParcel1.readStrongBinder()), paramParcel1.createStringArrayList());
      paramParcel2.writeNoException();
      continue;
      avk localavk = n();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, localavk);
      continue;
      a(ajb.a(paramParcel1));
      paramParcel2.writeNoException();
      continue;
      aqg localaqg = o();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, localaqg);
      continue;
      bdd localbdd = p();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, localbdd);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bco
 * JD-Core Version:    0.7.0.1
 */