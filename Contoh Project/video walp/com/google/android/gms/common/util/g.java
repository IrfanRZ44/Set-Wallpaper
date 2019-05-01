package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.common.i;

public final class g
{
  private static Boolean a;
  private static Boolean b;
  private static Boolean c;
  
  public static boolean a()
  {
    if (i.b) {
      return i.c;
    }
    return "user".equals(Build.TYPE);
  }
  
  @TargetApi(20)
  public static boolean a(Context paramContext)
  {
    if (a == null) {
      if ((!k.h()) || (!paramContext.getPackageManager().hasSystemFeature("android.hardware.type.watch"))) {
        break label40;
      }
    }
    label40:
    for (boolean bool = true;; bool = false)
    {
      a = Boolean.valueOf(bool);
      return a.booleanValue();
    }
  }
  
  @TargetApi(24)
  public static boolean b(Context paramContext)
  {
    return ((!k.k()) || (c(paramContext))) && (a(paramContext));
  }
  
  @TargetApi(21)
  public static boolean c(Context paramContext)
  {
    if (b == null) {
      if ((!k.i()) || (!paramContext.getPackageManager().hasSystemFeature("cn.google"))) {
        break label40;
      }
    }
    label40:
    for (boolean bool = true;; bool = false)
    {
      b = Boolean.valueOf(bool);
      return b.booleanValue();
    }
  }
  
  public static boolean d(Context paramContext)
  {
    if (c == null) {
      if ((!paramContext.getPackageManager().hasSystemFeature("android.hardware.type.iot")) && (!paramContext.getPackageManager().hasSystemFeature("android.hardware.type.embedded"))) {
        break label46;
      }
    }
    label46:
    for (boolean bool = true;; bool = false)
    {
      c = Boolean.valueOf(bool);
      return c.booleanValue();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.util.g
 * JD-Core Version:    0.7.0.1
 */