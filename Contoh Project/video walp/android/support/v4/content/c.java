package android.support.v4.content;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Process;
import android.support.v4.app.AppOpsManagerCompat;

public final class c
{
  public static int a(Context paramContext, String paramString)
  {
    return a(paramContext, paramString, Process.myPid(), Process.myUid(), paramContext.getPackageName());
  }
  
  public static int a(Context paramContext, String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    if (paramContext.checkPermission(paramString1, paramInt1, paramInt2) == -1) {}
    String str;
    String[] arrayOfString;
    do
    {
      return -1;
      str = AppOpsManagerCompat.permissionToOp(paramString1);
      if (str == null) {
        return 0;
      }
      if (paramString2 != null) {
        break;
      }
      arrayOfString = paramContext.getPackageManager().getPackagesForUid(paramInt2);
    } while ((arrayOfString == null) || (arrayOfString.length <= 0));
    paramString2 = arrayOfString[0];
    if (AppOpsManagerCompat.noteProxyOpNoThrow(paramContext, str, paramString2) != 0) {
      return -2;
    }
    return 0;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.content.c
 * JD-Core Version:    0.7.0.1
 */