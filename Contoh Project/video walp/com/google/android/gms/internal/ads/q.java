package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.a.c;
import com.google.android.gms.a.c.a;

@cm
public final class q
  extends c<u>
{
  public q()
  {
    super("com.google.android.gms.ads.AdOverlayCreatorImpl");
  }
  
  public final r a(Activity paramActivity)
  {
    try
    {
      a locala1 = b.a(paramActivity);
      IBinder localIBinder = ((u)a(paramActivity)).a(locala1);
      if (localIBinder == null) {
        return null;
      }
      IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
      if ((localIInterface instanceof r)) {
        return (r)localIInterface;
      }
      t localt = new t(localIBinder);
      return localt;
    }
    catch (RemoteException localRemoteException)
    {
      mk.c("Could not create remote AdOverlay.", localRemoteException);
      return null;
    }
    catch (c.a locala)
    {
      mk.c("Could not create remote AdOverlay.", locala);
    }
    return null;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.q
 * JD-Core Version:    0.7.0.1
 */