package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.common.a.b;
import com.google.android.gms.common.a.c;
import com.google.android.gms.common.j;

public final class q
{
  public static boolean a(Context paramContext, int paramInt)
  {
    if (!a(paramContext, paramInt, "com.google.android.gms")) {}
    do
    {
      return false;
      PackageManager localPackageManager = paramContext.getPackageManager();
      try
      {
        PackageInfo localPackageInfo = localPackageManager.getPackageInfo("com.google.android.gms", 64);
        return j.a(paramContext).a(localPackageInfo);
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    } while (!Log.isLoggable("UidVerifier", 3));
    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
    return false;
  }
  
  @TargetApi(19)
  public static boolean a(Context paramContext, int paramInt, String paramString)
  {
    return c.b(paramContext).a(paramInt, paramString);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.util.q
 * JD-Core Version:    0.7.0.1
 */