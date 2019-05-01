package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.common.a.c;

public class b
{
  public static boolean a()
  {
    return false;
  }
  
  public static boolean a(Context paramContext, String paramString)
  {
    "com.google.android.gms".equals(paramString);
    try
    {
      int i = c.b(paramContext).a(paramString, 0).flags;
      int j = i & 0x200000;
      boolean bool = false;
      if (j != 0) {
        bool = true;
      }
      return bool;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    return false;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.util.b
 * JD-Core Version:    0.7.0.1
 */