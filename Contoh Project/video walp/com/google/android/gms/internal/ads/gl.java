package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.a.c;
import com.google.android.gms.a.c.a;

@cm
public final class gl
  extends c<gf>
{
  public gl()
  {
    super("com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl");
  }
  
  public final gb a(Context paramContext, bck parambck)
  {
    try
    {
      a locala1 = b.a(paramContext);
      IBinder localIBinder = ((gf)a(paramContext)).a(locala1, parambck, 12451000);
      if (localIBinder == null) {
        return null;
      }
      IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
      if ((localIInterface instanceof gb)) {
        return (gb)localIInterface;
      }
      ge localge = new ge(localIBinder);
      return localge;
    }
    catch (RemoteException localRemoteException)
    {
      mk.c("Could not get remote RewardedVideoAd.", localRemoteException);
      return null;
    }
    catch (c.a locala)
    {
      label73:
      break label73;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.gl
 * JD-Core Version:    0.7.0.1
 */