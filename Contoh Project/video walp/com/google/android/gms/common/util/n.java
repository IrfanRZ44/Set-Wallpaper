package com.google.android.gms.common.util;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import java.io.File;

public class n
{
  @Deprecated
  public static void a(Context paramContext, SharedPreferences.Editor paramEditor, String paramString)
  {
    File localFile1 = new File(paramContext.getApplicationInfo().dataDir, "shared_prefs");
    File localFile2 = localFile1.getParentFile();
    if (localFile2 != null) {
      localFile2.setExecutable(true, false);
    }
    localFile1.setExecutable(true, false);
    paramEditor.commit();
    new File(localFile1, String.valueOf(paramString).concat(".xml")).setReadable(true, false);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.util.n
 * JD-Core Version:    0.7.0.1
 */