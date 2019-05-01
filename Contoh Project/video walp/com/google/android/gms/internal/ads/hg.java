package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.a.a;

public abstract class hg
  extends aja
  implements hf
{
  public hg()
  {
    super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
  }
  
  public static hf a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    if ((localIInterface instanceof hf)) {
      return (hf)localIInterface;
    }
    return new hh(paramIBinder);
  }
  
  protected final boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return false;
    case 1: 
      a(a.a.a(paramParcel1.readStrongBinder()));
    }
    for (;;)
    {
      paramParcel2.writeNoException();
      return true;
      a(a.a.a(paramParcel1.readStrongBinder()), paramParcel1.readInt());
      continue;
      b(a.a.a(paramParcel1.readStrongBinder()));
      continue;
      c(a.a.a(paramParcel1.readStrongBinder()));
      continue;
      d(a.a.a(paramParcel1.readStrongBinder()));
      continue;
      e(a.a.a(paramParcel1.readStrongBinder()));
      continue;
      a(a.a.a(paramParcel1.readStrongBinder()), (zzaig)ajb.a(paramParcel1, zzaig.CREATOR));
      continue;
      f(a.a.a(paramParcel1.readStrongBinder()));
      continue;
      b(a.a.a(paramParcel1.readStrongBinder()), paramParcel1.readInt());
      continue;
      g(a.a.a(paramParcel1.readStrongBinder()));
      continue;
      h(a.a.a(paramParcel1.readStrongBinder()));
      continue;
      a((Bundle)ajb.a(paramParcel1, Bundle.CREATOR));
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.hg
 * JD-Core Version:    0.7.0.1
 */