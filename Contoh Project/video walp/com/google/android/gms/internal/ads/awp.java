package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.a.c;
import com.google.android.gms.a.c.a;
import java.util.HashMap;

@cm
public final class awp
  extends c<ava>
{
  public awp()
  {
    super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
  }
  
  public final aux a(View paramView, HashMap<String, View> paramHashMap1, HashMap<String, View> paramHashMap2)
  {
    try
    {
      a locala1 = b.a(paramView);
      a locala2 = b.a(paramHashMap1);
      a locala3 = b.a(paramHashMap2);
      IBinder localIBinder = ((ava)a(paramView.getContext())).a(locala1, locala2, locala3);
      if (localIBinder == null) {
        return null;
      }
      IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
      if ((localIInterface instanceof aux)) {
        return (aux)localIInterface;
      }
      auz localauz = new auz(localIBinder);
      return localauz;
    }
    catch (RemoteException localRemoteException)
    {
      mk.c("Could not create remote NativeAdViewHolderDelegate.", localRemoteException);
      return null;
    }
    catch (c.a locala)
    {
      label90:
      break label90;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.awp
 * JD-Core Version:    0.7.0.1
 */