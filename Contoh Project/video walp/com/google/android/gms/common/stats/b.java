package com.google.android.gms.common.stats;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import java.util.Collections;
import java.util.List;

public class b
{
  private static final Object a = new Object();
  private static volatile b b;
  private static boolean c = false;
  private final List<String> d = Collections.EMPTY_LIST;
  private final List<String> e = Collections.EMPTY_LIST;
  private final List<String> f = Collections.EMPTY_LIST;
  private final List<String> g = Collections.EMPTY_LIST;
  
  public static b a()
  {
    if (b == null) {}
    synchronized (a)
    {
      if (b == null) {
        b = new b();
      }
      return b;
    }
  }
  
  @SuppressLint({"UntrackedBindService"})
  private static boolean a(Context paramContext, String paramString, Intent paramIntent, ServiceConnection paramServiceConnection, int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      ComponentName localComponentName = paramIntent.getComponent();
      if (localComponentName == null) {}
      for (boolean bool = false; bool; bool = com.google.android.gms.common.util.b.a(paramContext, localComponentName.getPackageName()))
      {
        Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
        return false;
      }
    }
    return paramContext.bindService(paramIntent, paramServiceConnection, paramInt);
  }
  
  @SuppressLint({"UntrackedBindService"})
  public void a(Context paramContext, ServiceConnection paramServiceConnection)
  {
    paramContext.unbindService(paramServiceConnection);
  }
  
  public void a(Context paramContext, ServiceConnection paramServiceConnection, String paramString, Intent paramIntent) {}
  
  public boolean a(Context paramContext, Intent paramIntent, ServiceConnection paramServiceConnection, int paramInt)
  {
    return a(paramContext, paramContext.getClass().getName(), paramIntent, paramServiceConnection, paramInt);
  }
  
  public boolean a(Context paramContext, String paramString, Intent paramIntent, ServiceConnection paramServiceConnection, int paramInt)
  {
    return a(paramContext, paramString, paramIntent, paramServiceConnection, paramInt, true);
  }
  
  public void b(Context paramContext, ServiceConnection paramServiceConnection) {}
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.stats.b
 * JD-Core Version:    0.7.0.1
 */