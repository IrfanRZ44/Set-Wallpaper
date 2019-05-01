package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.a.c;
import com.google.android.gms.a.c.a;

@cm
public final class awo
  extends c<auv>
{
  public awo()
  {
    super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
  }
  
  public final aus a(Context paramContext, FrameLayout paramFrameLayout1, FrameLayout paramFrameLayout2)
  {
    try
    {
      a locala1 = b.a(paramContext);
      a locala2 = b.a(paramFrameLayout1);
      a locala3 = b.a(paramFrameLayout2);
      IBinder localIBinder = ((auv)a(paramContext)).a(locala1, locala2, locala3, 12451000);
      if (localIBinder == null) {
        return null;
      }
      IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
      if ((localIInterface instanceof aus)) {
        return (aus)localIInterface;
      }
      auu localauu = new auu(localIBinder);
      return localauu;
    }
    catch (RemoteException localRemoteException)
    {
      mk.c("Could not create remote NativeAdViewDelegate.", localRemoteException);
      return null;
    }
    catch (c.a locala)
    {
      label89:
      break label89;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.awo
 * JD-Core Version:    0.7.0.1
 */