package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.a.a;

public abstract class gd
  extends aja
  implements gb
{
  public gd()
  {
    super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
  }
  
  public static gb a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    if ((localIInterface instanceof gb)) {
      return (gb)localIInterface;
    }
    return new ge(paramIBinder);
  }
  
  protected final boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    case 4: 
    case 17: 
    case 18: 
    case 19: 
    case 20: 
    case 21: 
    case 22: 
    case 23: 
    case 24: 
    case 25: 
    case 26: 
    case 27: 
    case 28: 
    case 29: 
    case 30: 
    case 31: 
    case 32: 
    case 33: 
    default: 
      return false;
    case 1: 
      a((zzahk)ajb.a(paramParcel1, zzahk.CREATOR));
      paramParcel2.writeNoException();
    }
    for (;;)
    {
      return true;
      a();
      paramParcel2.writeNoException();
      continue;
      IBinder localIBinder2 = paramParcel1.readStrongBinder();
      Object localObject2 = null;
      if (localIBinder2 == null) {}
      for (;;)
      {
        a((gh)localObject2);
        paramParcel2.writeNoException();
        break;
        IInterface localIInterface2 = localIBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
        if ((localIInterface2 instanceof gh)) {
          localObject2 = (gh)localIInterface2;
        } else {
          localObject2 = new gj(localIBinder2);
        }
      }
      boolean bool = c();
      paramParcel2.writeNoException();
      ajb.a(paramParcel2, bool);
      continue;
      d();
      paramParcel2.writeNoException();
      continue;
      e();
      paramParcel2.writeNoException();
      continue;
      f();
      paramParcel2.writeNoException();
      continue;
      a(a.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      continue;
      b(a.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      continue;
      c(a.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      continue;
      String str = g();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str);
      continue;
      a(paramParcel1.readString());
      paramParcel2.writeNoException();
      continue;
      a(app.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      continue;
      Bundle localBundle = b();
      paramParcel2.writeNoException();
      ajb.b(paramParcel2, localBundle);
      continue;
      IBinder localIBinder1 = paramParcel1.readStrongBinder();
      Object localObject1 = null;
      if (localIBinder1 == null) {}
      for (;;)
      {
        a((fz)localObject1);
        paramParcel2.writeNoException();
        break;
        IInterface localIInterface1 = localIBinder1.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
        if ((localIInterface1 instanceof fz)) {
          localObject1 = (fz)localIInterface1;
        } else {
          localObject1 = new ga(localIBinder1);
        }
      }
      a(ajb.a(paramParcel1));
      paramParcel2.writeNoException();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.gd
 * JD-Core Version:    0.7.0.1
 */