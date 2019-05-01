package com.a.a.c.c;

import com.a.a.c.b.a.b;
import com.a.a.c.d;
import java.io.InputStream;

public class t
  implements d<InputStream>
{
  private final b a;
  
  public t(b paramb)
  {
    this.a = paramb;
  }
  
  /* Error */
  public boolean a(InputStream paramInputStream, java.io.File paramFile, com.a.a.c.j paramj)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 16	com/a/a/c/c/t:a	Lcom/a/a/c/b/a/b;
    //   4: ldc 20
    //   6: ldc 22
    //   8: invokeinterface 27 3 0
    //   13: checkcast 22	[B
    //   16: astore 4
    //   18: new 29	java/io/FileOutputStream
    //   21: dup
    //   22: aload_2
    //   23: invokespecial 32	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   26: astore 5
    //   28: aload_1
    //   29: aload 4
    //   31: invokevirtual 38	java/io/InputStream:read	([B)I
    //   34: istore 11
    //   36: iload 11
    //   38: iconst_m1
    //   39: if_icmpeq +60 -> 99
    //   42: aload 5
    //   44: aload 4
    //   46: iconst_0
    //   47: iload 11
    //   49: invokevirtual 44	java/io/OutputStream:write	([BII)V
    //   52: goto -24 -> 28
    //   55: astore 8
    //   57: ldc 46
    //   59: iconst_3
    //   60: invokestatic 52	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   63: ifeq +13 -> 76
    //   66: ldc 46
    //   68: ldc 54
    //   70: aload 8
    //   72: invokestatic 58	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   75: pop
    //   76: aload 5
    //   78: ifnull +8 -> 86
    //   81: aload 5
    //   83: invokevirtual 61	java/io/OutputStream:close	()V
    //   86: aload_0
    //   87: getfield 16	com/a/a/c/c/t:a	Lcom/a/a/c/b/a/b;
    //   90: aload 4
    //   92: invokeinterface 64 2 0
    //   97: iconst_0
    //   98: ireturn
    //   99: aload 5
    //   101: invokevirtual 61	java/io/OutputStream:close	()V
    //   104: aload 5
    //   106: ifnull +8 -> 114
    //   109: aload 5
    //   111: invokevirtual 61	java/io/OutputStream:close	()V
    //   114: aload_0
    //   115: getfield 16	com/a/a/c/c/t:a	Lcom/a/a/c/b/a/b;
    //   118: aload 4
    //   120: invokeinterface 64 2 0
    //   125: iconst_1
    //   126: ireturn
    //   127: astore 6
    //   129: aconst_null
    //   130: astore 5
    //   132: aload 5
    //   134: ifnull +8 -> 142
    //   137: aload 5
    //   139: invokevirtual 61	java/io/OutputStream:close	()V
    //   142: aload_0
    //   143: getfield 16	com/a/a/c/c/t:a	Lcom/a/a/c/b/a/b;
    //   146: aload 4
    //   148: invokeinterface 64 2 0
    //   153: aload 6
    //   155: athrow
    //   156: astore 12
    //   158: goto -44 -> 114
    //   161: astore 9
    //   163: goto -77 -> 86
    //   166: astore 7
    //   168: goto -26 -> 142
    //   171: astore 6
    //   173: goto -41 -> 132
    //   176: astore 8
    //   178: aconst_null
    //   179: astore 5
    //   181: goto -124 -> 57
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	184	0	this	t
    //   0	184	1	paramInputStream	InputStream
    //   0	184	2	paramFile	java.io.File
    //   0	184	3	paramj	com.a.a.c.j
    //   16	131	4	arrayOfByte	byte[]
    //   26	154	5	localFileOutputStream	java.io.FileOutputStream
    //   127	27	6	localObject1	Object
    //   171	1	6	localObject2	Object
    //   166	1	7	localIOException1	java.io.IOException
    //   55	16	8	localIOException2	java.io.IOException
    //   176	1	8	localIOException3	java.io.IOException
    //   161	1	9	localIOException4	java.io.IOException
    //   34	14	11	i	int
    //   156	1	12	localIOException5	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   28	36	55	java/io/IOException
    //   42	52	55	java/io/IOException
    //   99	104	55	java/io/IOException
    //   18	28	127	finally
    //   109	114	156	java/io/IOException
    //   81	86	161	java/io/IOException
    //   137	142	166	java/io/IOException
    //   28	36	171	finally
    //   42	52	171	finally
    //   57	76	171	finally
    //   99	104	171	finally
    //   18	28	176	java/io/IOException
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.c.t
 * JD-Core Version:    0.7.0.1
 */