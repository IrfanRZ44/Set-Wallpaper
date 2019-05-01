package com.google.android.gms.common.a;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.util.k;

public class b
{
  private final Context a;
  
  public b(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public int a(String paramString)
  {
    return this.a.checkCallingOrSelfPermission(paramString);
  }
  
  public int a(String paramString1, String paramString2)
  {
    return this.a.getPackageManager().checkPermission(paramString1, paramString2);
  }
  
  public ApplicationInfo a(String paramString, int paramInt)
  {
    return this.a.getPackageManager().getApplicationInfo(paramString, paramInt);
  }
  
  public boolean a()
  {
    if (Binder.getCallingUid() == Process.myUid()) {
      return a.a(this.a);
    }
    if (k.l())
    {
      String str = this.a.getPackageManager().getNameForUid(Binder.getCallingUid());
      if (str != null) {
        return this.a.getPackageManager().isInstantApp(str);
      }
    }
    return false;
  }
  
  @TargetApi(19)
  public boolean a(int paramInt, String paramString)
  {
    if (k.g()) {}
    for (;;)
    {
      try
      {
        ((AppOpsManager)this.a.getSystemService("appops")).checkPackage(paramInt, paramString);
        bool = true;
        return bool;
      }
      catch (SecurityException localSecurityException) {}
      String[] arrayOfString = this.a.getPackageManager().getPackagesForUid(paramInt);
      boolean bool = false;
      if (paramString != null)
      {
        bool = false;
        if (arrayOfString != null) {
          for (int i = 0;; i++)
          {
            int j = arrayOfString.length;
            bool = false;
            if (i >= j) {
              break;
            }
            if (paramString.equals(arrayOfString[i])) {
              return true;
            }
          }
        }
      }
    }
    return false;
  }
  
  public PackageInfo b(String paramString, int paramInt)
  {
    return this.a.getPackageManager().getPackageInfo(paramString, paramInt);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.a.b
 * JD-Core Version:    0.7.0.1
 */