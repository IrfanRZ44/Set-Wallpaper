package com.a.a.c.b.c;

import android.os.Build.VERSION;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class b
{
  static int a()
  {
    int i = Runtime.getRuntime().availableProcessors();
    if (Build.VERSION.SDK_INT < 17) {
      i = Math.max(b(), i);
    }
    return i;
  }
  
  private static int b()
  {
    StrictMode.ThreadPolicy localThreadPolicy = StrictMode.allowThreadDiskReads();
    try
    {
      File[] arrayOfFile2 = new File("/sys/devices/system/cpu/").listFiles(new FilenameFilter()
      {
        public boolean accept(File paramAnonymousFile, String paramAnonymousString)
        {
          return b.this.matcher(paramAnonymousString).matches();
        }
      });
      arrayOfFile1 = arrayOfFile2;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        if (Log.isLoggable("GlideRuntimeCompat", 6)) {
          Log.e("GlideRuntimeCompat", "Failed to calculate accurate cpu count", localThrowable);
        }
        StrictMode.setThreadPolicy(localThreadPolicy);
        File[] arrayOfFile1 = null;
      }
    }
    finally
    {
      StrictMode.setThreadPolicy(localThreadPolicy);
    }
    if (arrayOfFile1 != null) {}
    for (int i = arrayOfFile1.length;; i = 0) {
      return Math.max(1, i);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.b.c.b
 * JD-Core Version:    0.7.0.1
 */