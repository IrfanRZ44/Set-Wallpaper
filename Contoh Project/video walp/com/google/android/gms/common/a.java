package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.n;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class a
  implements ServiceConnection
{
  private boolean a = false;
  private final BlockingQueue<IBinder> b = new LinkedBlockingQueue();
  
  public IBinder a(long paramLong, TimeUnit paramTimeUnit)
  {
    n.c("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
    if (this.a) {
      throw new IllegalStateException("Cannot call get on this connection more than once");
    }
    this.a = true;
    IBinder localIBinder = (IBinder)this.b.poll(paramLong, paramTimeUnit);
    if (localIBinder == null) {
      throw new TimeoutException("Timed out waiting for the service connection");
    }
    return localIBinder;
  }
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    this.b.add(paramIBinder);
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName) {}
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.a
 * JD-Core Version:    0.7.0.1
 */