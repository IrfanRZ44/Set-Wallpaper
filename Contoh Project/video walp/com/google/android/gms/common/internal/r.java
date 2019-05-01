package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.google.android.gms.common.stats.b;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

final class r
  implements ServiceConnection
{
  private final Set<ServiceConnection> a;
  private int b;
  private boolean c;
  private IBinder d;
  private final f.a e;
  private ComponentName f;
  
  public r(q paramq, f.a parama)
  {
    this.e = parama;
    this.a = new HashSet();
    this.b = 2;
  }
  
  public final void a(ServiceConnection paramServiceConnection, String paramString)
  {
    q.d(this.g).a(q.c(this.g), paramServiceConnection, paramString, this.e.a(q.c(this.g)));
    this.a.add(paramServiceConnection);
  }
  
  public final void a(String paramString)
  {
    this.b = 3;
    this.c = q.d(this.g).a(q.c(this.g), paramString, this.e.a(q.c(this.g)), this, this.e.c());
    if (this.c)
    {
      Message localMessage = q.b(this.g).obtainMessage(1, this.e);
      q.b(this.g).sendMessageDelayed(localMessage, q.e(this.g));
      return;
    }
    this.b = 2;
    try
    {
      q.d(this.g).a(q.c(this.g), this);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException) {}
  }
  
  public final boolean a()
  {
    return this.c;
  }
  
  public final boolean a(ServiceConnection paramServiceConnection)
  {
    return this.a.contains(paramServiceConnection);
  }
  
  public final int b()
  {
    return this.b;
  }
  
  public final void b(ServiceConnection paramServiceConnection, String paramString)
  {
    q.d(this.g).b(q.c(this.g), paramServiceConnection);
    this.a.remove(paramServiceConnection);
  }
  
  public final void b(String paramString)
  {
    q.b(this.g).removeMessages(1, this.e);
    q.d(this.g).a(q.c(this.g), this);
    this.c = false;
    this.b = 2;
  }
  
  public final boolean c()
  {
    return this.a.isEmpty();
  }
  
  public final IBinder d()
  {
    return this.d;
  }
  
  public final ComponentName e()
  {
    return this.f;
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    synchronized (q.a(this.g))
    {
      q.b(this.g).removeMessages(1, this.e);
      this.d = paramIBinder;
      this.f = paramComponentName;
      Iterator localIterator = this.a.iterator();
      if (localIterator.hasNext()) {
        ((ServiceConnection)localIterator.next()).onServiceConnected(paramComponentName, paramIBinder);
      }
    }
    this.b = 1;
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    synchronized (q.a(this.g))
    {
      q.b(this.g).removeMessages(1, this.e);
      this.d = null;
      this.f = paramComponentName;
      Iterator localIterator = this.a.iterator();
      if (localIterator.hasNext()) {
        ((ServiceConnection)localIterator.next()).onServiceDisconnected(paramComponentName);
      }
    }
    this.b = 2;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.r
 * JD-Core Version:    0.7.0.1
 */