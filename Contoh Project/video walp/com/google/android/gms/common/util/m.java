package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.annotation.Nullable;

public class m
{
  private static String a = null;
  private static int b = 0;
  
  private static BufferedReader a(String paramString)
  {
    StrictMode.ThreadPolicy localThreadPolicy = StrictMode.allowThreadDiskReads();
    try
    {
      BufferedReader localBufferedReader = new BufferedReader(new FileReader(paramString));
      return localBufferedReader;
    }
    finally
    {
      StrictMode.setThreadPolicy(localThreadPolicy);
    }
  }
  
  @Nullable
  public static String a()
  {
    if (a == null) {
      a = a(b());
    }
    return a;
  }
  
  /* Error */
  @Nullable
  private static String a(int paramInt)
  {
    // Byte code:
    //   0: iload_0
    //   1: ifgt +5 -> 6
    //   4: aconst_null
    //   5: areturn
    //   6: new 48	java/lang/StringBuilder
    //   9: dup
    //   10: bipush 25
    //   12: invokespecial 51	java/lang/StringBuilder:<init>	(I)V
    //   15: ldc 53
    //   17: invokevirtual 57	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   20: iload_0
    //   21: invokevirtual 60	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   24: ldc 62
    //   26: invokevirtual 57	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   29: invokevirtual 65	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   32: invokestatic 67	com/google/android/gms/common/util/m:a	(Ljava/lang/String;)Ljava/io/BufferedReader;
    //   35: astore 5
    //   37: aload 5
    //   39: astore_2
    //   40: aload_2
    //   41: invokevirtual 70	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   44: invokevirtual 75	java/lang/String:trim	()Ljava/lang/String;
    //   47: astore 7
    //   49: aload_2
    //   50: invokestatic 80	com/google/android/gms/common/util/i:a	(Ljava/io/Closeable;)V
    //   53: aload 7
    //   55: areturn
    //   56: astore 4
    //   58: aconst_null
    //   59: astore_2
    //   60: aload_2
    //   61: invokestatic 80	com/google/android/gms/common/util/i:a	(Ljava/io/Closeable;)V
    //   64: aconst_null
    //   65: areturn
    //   66: astore_1
    //   67: aconst_null
    //   68: astore_2
    //   69: aload_1
    //   70: astore_3
    //   71: aload_2
    //   72: invokestatic 80	com/google/android/gms/common/util/i:a	(Ljava/io/Closeable;)V
    //   75: aload_3
    //   76: athrow
    //   77: astore_3
    //   78: goto -7 -> 71
    //   81: astore 6
    //   83: goto -23 -> 60
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	86	0	paramInt	int
    //   66	4	1	localObject1	Object
    //   39	33	2	localBufferedReader1	BufferedReader
    //   70	6	3	localObject2	Object
    //   77	1	3	localObject3	Object
    //   56	1	4	localIOException1	java.io.IOException
    //   35	3	5	localBufferedReader2	BufferedReader
    //   81	1	6	localIOException2	java.io.IOException
    //   47	7	7	str	String
    // Exception table:
    //   from	to	target	type
    //   6	37	56	java/io/IOException
    //   6	37	66	finally
    //   40	49	77	finally
    //   40	49	81	java/io/IOException
  }
  
  private static int b()
  {
    if (b == 0) {
      b = Process.myPid();
    }
    return b;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.util.m
 * JD-Core Version:    0.7.0.1
 */