package com.a.a.d;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.a.a.i.h;

final class e
  implements c
{
  final c.a a;
  boolean b;
  private final Context c;
  private boolean d;
  private final BroadcastReceiver e = new BroadcastReceiver()
  {
    public void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
    {
      boolean bool = e.this.b;
      e.this.b = e.this.a(paramAnonymousContext);
      if (bool != e.this.b)
      {
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
          Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + e.this.b);
        }
        e.this.a.a(e.this.b);
      }
    }
  };
  
  e(Context paramContext, c.a parama)
  {
    this.c = paramContext.getApplicationContext();
    this.a = parama;
  }
  
  private void a()
  {
    if (this.d) {}
    do
    {
      return;
      this.b = a(this.c);
      try
      {
        this.c.registerReceiver(this.e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.d = true;
        return;
      }
      catch (SecurityException localSecurityException) {}
    } while (!Log.isLoggable("ConnectivityMonitor", 5));
    Log.w("ConnectivityMonitor", "Failed to register", localSecurityException);
  }
  
  private void b()
  {
    if (!this.d) {
      return;
    }
    this.c.unregisterReceiver(this.e);
    this.d = false;
  }
  
  @SuppressLint({"MissingPermission"})
  boolean a(Context paramContext)
  {
    ConnectivityManager localConnectivityManager = (ConnectivityManager)h.a((ConnectivityManager)paramContext.getSystemService("connectivity"));
    try
    {
      NetworkInfo localNetworkInfo = localConnectivityManager.getActiveNetworkInfo();
      if ((localNetworkInfo != null) && (localNetworkInfo.isConnected())) {
        return true;
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      if (Log.isLoggable("ConnectivityMonitor", 5)) {
        Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", localRuntimeException);
      }
      return true;
    }
    return false;
  }
  
  public void c()
  {
    a();
  }
  
  public void d()
  {
    b();
  }
  
  public void e() {}
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.d.e
 * JD-Core Version:    0.7.0.1
 */