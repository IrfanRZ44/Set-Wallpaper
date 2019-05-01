package com.a.a.c.d.a;

import android.annotation.TargetApi;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.util.Log;
import com.a.a.c.b;
import java.io.File;

final class o
{
  private static final File a = new File("/proc/self/fd");
  private static volatile o d;
  private volatile int b;
  private volatile boolean c = true;
  
  static o a()
  {
    if (d == null) {}
    try
    {
      if (d == null) {
        d = new o();
      }
      return d;
    }
    finally {}
  }
  
  private boolean b()
  {
    try
    {
      int i = 1 + this.b;
      this.b = i;
      if (i >= 50)
      {
        this.b = 0;
        int j = a.list().length;
        boolean bool1 = false;
        if (j < 700) {
          bool1 = true;
        }
        this.c = bool1;
        if ((!this.c) && (Log.isLoggable("Downsampler", 5))) {
          Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + j + ", limit " + 700);
        }
      }
      boolean bool2 = this.c;
      return bool2;
    }
    finally {}
  }
  
  @TargetApi(26)
  boolean a(int paramInt1, int paramInt2, BitmapFactory.Options paramOptions, b paramb, boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool;
    if ((!paramBoolean1) || (Build.VERSION.SDK_INT < 26) || (paramb == b.b) || (paramBoolean2)) {
      bool = false;
    }
    for (;;)
    {
      return bool;
      if ((paramInt1 >= 128) && (paramInt2 >= 128) && (b())) {}
      for (bool = true; bool; bool = false)
      {
        paramOptions.inPreferredConfig = Bitmap.Config.HARDWARE;
        paramOptions.inMutable = false;
        return bool;
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.d.a.o
 * JD-Core Version:    0.7.0.1
 */