package com.a.a.d;

import android.content.Context;
import android.support.v4.content.a;
import android.util.Log;

public class f
  implements d
{
  public c a(Context paramContext, c.a parama)
  {
    int i;
    if (a.checkSelfPermission(paramContext, "android.permission.ACCESS_NETWORK_STATE") == 0)
    {
      i = 1;
      if (Log.isLoggable("ConnectivityMonitor", 3)) {
        if (i == 0) {
          break label55;
        }
      }
    }
    label55:
    for (String str = "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor";; str = "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor")
    {
      Log.d("ConnectivityMonitor", str);
      if (i == 0) {
        break label62;
      }
      return new e(paramContext, parama);
      i = 0;
      break;
    }
    label62:
    return new j();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.d.f
 * JD-Core Version:    0.7.0.1
 */