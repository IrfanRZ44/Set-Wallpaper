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
public final class aoa
  extends c<apm>
{
  public aoa()
  {
    super("com.google.android.gms.ads.AdManagerCreatorImpl");
  }
  
  public final apj a(Context paramContext, zzjn paramzzjn, String paramString, bck parambck, int paramInt)
  {
    try
    {
      a locala1 = b.a(paramContext);
      IBinder localIBinder = ((apm)a(paramContext)).a(locala1, paramzzjn, paramString, parambck, 12451000, paramInt);
      if (localIBinder == null) {
        return null;
      }
      IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
      if ((localIInterface instanceof apj)) {
        return (apj)localIInterface;
      }
      apl localapl = new apl(localIBinder);
      return localapl;
    }
    catch (RemoteException localRemoteException)
    {
      mk.a("Could not create remote AdManager.", localRemoteException);
      return null;
    }
    catch (c.a locala)
    {
      label79:
      break label79;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aoa
 * JD-Core Version:    0.7.0.1
 */