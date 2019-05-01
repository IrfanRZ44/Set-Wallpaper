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
public final class aqw
  extends c<aqe>
{
  public aqw()
  {
    super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
  }
  
  public final aqb b(Context paramContext)
  {
    try
    {
      a locala1 = b.a(paramContext);
      IBinder localIBinder = ((aqe)a(paramContext)).a(locala1, 12451000);
      if (localIBinder == null) {
        return null;
      }
      IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
      if ((localIInterface instanceof aqb)) {
        return (aqb)localIInterface;
      }
      aqd localaqd = new aqd(localIBinder);
      return localaqd;
    }
    catch (RemoteException localRemoteException)
    {
      mk.c("Could not get remote MobileAdsSettingManager.", localRemoteException);
      return null;
    }
    catch (c.a locala)
    {
      mk.c("Could not get remote MobileAdsSettingManager.", locala);
    }
    return null;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aqw
 * JD-Core Version:    0.7.0.1
 */