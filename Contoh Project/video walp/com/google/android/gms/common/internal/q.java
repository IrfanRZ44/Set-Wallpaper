package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.stats.b;
import java.util.HashMap;
import javax.annotation.concurrent.GuardedBy;

final class q
  extends f
  implements Handler.Callback
{
  @GuardedBy("mConnectionStatus")
  private final HashMap<f.a, r> a = new HashMap();
  private final Context b;
  private final Handler c;
  private final b d;
  private final long e;
  private final long f;
  
  q(Context paramContext)
  {
    this.b = paramContext.getApplicationContext();
    this.c = new Handler(paramContext.getMainLooper(), this);
    this.d = b.a();
    this.e = 5000L;
    this.f = 300000L;
  }
  
  protected final boolean a(f.a parama, ServiceConnection paramServiceConnection, String paramString)
  {
    n.a(paramServiceConnection, "ServiceConnection must not be null");
    for (;;)
    {
      r localr;
      synchronized (this.a)
      {
        localr = (r)this.a.get(parama);
        if (localr == null)
        {
          localr = new r(this, parama);
          localr.a(paramServiceConnection, paramString);
          localr.a(paramString);
          this.a.put(parama, localr);
          boolean bool = localr.a();
          return bool;
        }
        this.c.removeMessages(0, parama);
        if (localr.a(paramServiceConnection))
        {
          String str = String.valueOf(parama);
          throw new IllegalStateException(81 + String.valueOf(str).length() + "Trying to bind a GmsServiceConnection that was already connected before.  config=" + str);
        }
      }
      localr.a(paramServiceConnection, paramString);
      switch (localr.b())
      {
      case 1: 
        paramServiceConnection.onServiceConnected(localr.e(), localr.d());
        break;
      case 2: 
        localr.a(paramString);
      }
    }
  }
  
  protected final void b(f.a parama, ServiceConnection paramServiceConnection, String paramString)
  {
    n.a(paramServiceConnection, "ServiceConnection must not be null");
    r localr;
    synchronized (this.a)
    {
      localr = (r)this.a.get(parama);
      if (localr == null)
      {
        String str1 = String.valueOf(parama);
        throw new IllegalStateException(50 + String.valueOf(str1).length() + "Nonexistent connection status for service config: " + str1);
      }
    }
    if (!localr.a(paramServiceConnection))
    {
      String str2 = String.valueOf(parama);
      throw new IllegalStateException(76 + String.valueOf(str2).length() + "Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + str2);
    }
    localr.b(paramServiceConnection, paramString);
    if (localr.c())
    {
      Message localMessage = this.c.obtainMessage(0, parama);
      this.c.sendMessageDelayed(localMessage, this.e);
    }
  }
  
  public final boolean handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return false;
    case 0: 
      synchronized (this.a)
      {
        f.a locala2 = (f.a)paramMessage.obj;
        r localr2 = (r)this.a.get(locala2);
        if ((localr2 != null) && (localr2.c()))
        {
          if (localr2.a()) {
            localr2.b("GmsClientSupervisor");
          }
          this.a.remove(locala2);
        }
        return true;
      }
    }
    for (;;)
    {
      ComponentName localComponentName1;
      synchronized (this.a)
      {
        f.a locala1 = (f.a)paramMessage.obj;
        r localr1 = (r)this.a.get(locala1);
        if ((localr1 != null) && (localr1.b() == 3))
        {
          String str = String.valueOf(locala1);
          Log.wtf("GmsClientSupervisor", 47 + String.valueOf(str).length() + "Timeout waiting for ServiceConnection callback " + str, new Exception());
          localComponentName1 = localr1.e();
          if (localComponentName1 == null) {
            localComponentName1 = locala1.b();
          }
          if (localComponentName1 == null)
          {
            localComponentName2 = new ComponentName(locala1.a(), "unknown");
            localr1.onServiceDisconnected(localComponentName2);
          }
        }
        else
        {
          return true;
        }
      }
      ComponentName localComponentName2 = localComponentName1;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.q
 * JD-Core Version:    0.7.0.1
 */