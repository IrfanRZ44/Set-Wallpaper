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
public final class anz
  extends c<aph>
{
  public anz()
  {
    super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
  }
  
  public final ape a(Context paramContext, String paramString, bck parambck)
  {
    try
    {
      a locala1 = b.a(paramContext);
      IBinder localIBinder = ((aph)a(paramContext)).a(locala1, paramString, parambck, 12451000);
      if (localIBinder == null) {
        return null;
      }
      IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
      if ((localIInterface instanceof ape)) {
        return (ape)localIInterface;
      }
      apg localapg = new apg(localIBinder);
      return localapg;
    }
    catch (RemoteException localRemoteException)
    {
      mk.c("Could not create remote builder for AdLoader.", localRemoteException);
      return null;
    }
    catch (c.a locala)
    {
      label75:
      break label75;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.anz
 * JD-Core Version:    0.7.0.1
 */