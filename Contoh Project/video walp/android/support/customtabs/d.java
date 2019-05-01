package android.support.customtabs;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

public abstract class d
  implements ServiceConnection
{
  public abstract void a(ComponentName paramComponentName, b paramb);
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    a(paramComponentName, new b(h.a.a(paramIBinder), paramComponentName) {});
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.customtabs.d
 * JD-Core Version:    0.7.0.1
 */