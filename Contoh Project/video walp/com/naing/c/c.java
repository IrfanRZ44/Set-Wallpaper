package com.naing.c;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.a.a;

public final class c
{
  public static void a(Activity paramActivity, int paramInt, String paramString)
  {
    a(paramActivity, "android.permission.READ_EXTERNAL_STORAGE", paramInt, paramString);
  }
  
  private static void a(Activity paramActivity, final String paramString1, final int paramInt, String paramString2)
  {
    if (ActivityCompat.shouldShowRequestPermissionRationale(paramActivity, paramString1))
    {
      new a.a(paramActivity).a(2131558463).b(paramString2).a(17039370, new DialogInterface.OnClickListener()
      {
        public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          Activity localActivity = this.a;
          String[] arrayOfString = new String[1];
          arrayOfString[0] = paramString1;
          ActivityCompat.requestPermissions(localActivity, arrayOfString, paramInt);
        }
      }).c();
      return;
    }
    ActivityCompat.requestPermissions(paramActivity, new String[] { paramString1 }, paramInt);
  }
  
  public static boolean a(Context paramContext)
  {
    return a(paramContext, "android.permission.READ_EXTERNAL_STORAGE");
  }
  
  private static boolean a(Context paramContext, String paramString)
  {
    return ActivityCompat.checkSelfPermission(paramContext, paramString) == 0;
  }
  
  public static boolean a(int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt.length;
    boolean bool = false;
    if (i > 0)
    {
      int j = paramArrayOfInt[0];
      bool = false;
      if (j == 0) {
        bool = true;
      }
    }
    return bool;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.naing.c.c
 * JD-Core Version:    0.7.0.1
 */