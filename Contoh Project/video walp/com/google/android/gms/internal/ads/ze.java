package com.google.android.gms.internal.ads;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.lang.reflect.Field;

public final class ze
{
  private static final zf a;
  private static final int b;
  
  static
  {
    for (;;)
    {
      try
      {
        Integer localInteger2 = a();
        localInteger1 = localInteger2;
        if (localInteger1 != null) {}
        try
        {
          if (localInteger1.intValue() >= 19)
          {
            localObject2 = new zj();
            a = (zf)localObject2;
            if (localInteger1 != null) {
              continue;
            }
            i = 1;
            b = i;
            return;
          }
          if (Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic")) {
            continue;
          }
          j = 1;
          if (j == 0) {
            continue;
          }
          localObject2 = new zi();
          continue;
          localPrintStream = System.err;
        }
        catch (Throwable localThrowable2) {}
      }
      catch (Throwable localThrowable1)
      {
        Object localObject2;
        int i;
        int j;
        PrintStream localPrintStream;
        String str;
        Object localObject1 = localThrowable1;
        Integer localInteger1 = null;
        continue;
      }
      str = a.class.getName();
      localPrintStream.println(132 + String.valueOf(str).length() + "An error has occured when initializing the try-with-resources desuguring strategy. The default strategy " + str + "will be used. The error is: ");
      localThrowable2.printStackTrace(System.err);
      localObject2 = new a();
      continue;
      j = 0;
      continue;
      localObject2 = new a();
      continue;
      i = localInteger1.intValue();
    }
  }
  
  private static Integer a()
  {
    try
    {
      Integer localInteger = (Integer)Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
      return localInteger;
    }
    catch (Exception localException)
    {
      System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
      localException.printStackTrace(System.err);
    }
    return null;
  }
  
  public static void a(Throwable paramThrowable, PrintWriter paramPrintWriter)
  {
    a.a(paramThrowable, paramPrintWriter);
  }
  
  static final class a
    extends zf
  {
    public final void a(Throwable paramThrowable, PrintWriter paramPrintWriter)
    {
      paramThrowable.printStackTrace(paramPrintWriter);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ze
 * JD-Core Version:    0.7.0.1
 */