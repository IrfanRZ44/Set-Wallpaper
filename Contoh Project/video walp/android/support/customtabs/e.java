package android.support.customtabs;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;

public final class e
{
  private final Object a = new Object();
  private final h b;
  private final g c;
  private final ComponentName d;
  
  e(h paramh, g paramg, ComponentName paramComponentName)
  {
    this.b = paramh;
    this.c = paramg;
    this.d = paramComponentName;
  }
  
  IBinder a()
  {
    return this.c.asBinder();
  }
  
  public boolean a(Uri paramUri, Bundle paramBundle, List<Bundle> paramList)
  {
    try
    {
      boolean bool = this.b.a(this.c, paramUri, paramBundle, paramList);
      return bool;
    }
    catch (RemoteException localRemoteException) {}
    return false;
  }
  
  ComponentName b()
  {
    return this.d;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.customtabs.e
 * JD-Core Version:    0.7.0.1
 */