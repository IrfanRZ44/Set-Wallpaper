package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.a.b;
import com.google.android.gms.common.a.c;
import javax.annotation.concurrent.GuardedBy;

public class l
{
  private static Object a = new Object();
  @GuardedBy("sLock")
  private static boolean b;
  private static String c;
  private static int d;
  
  public static int a(Context paramContext)
  {
    b(paramContext);
    return d;
  }
  
  private static void b(Context paramContext)
  {
    String str;
    b localb;
    synchronized (a)
    {
      if (b) {
        return;
      }
      b = true;
      str = paramContext.getPackageName();
      localb = c.b(paramContext);
    }
    try
    {
      Bundle localBundle = localb.a(str, 128).metaData;
      if (localBundle == null)
      {
        return;
        localObject2 = finally;
        throw localObject2;
      }
      c = localBundle.getString("com.google.app.id");
      d = localBundle.getInt("com.google.android.gms.version");
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        Log.wtf("MetadataValueReader", "This should never happen.", localNameNotFoundException);
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.l
 * JD-Core Version:    0.7.0.1
 */