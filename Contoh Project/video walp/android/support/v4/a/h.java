package android.support.v4.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Process;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class h
{
  public static File a(Context paramContext)
  {
    String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
    int i = 0;
    while (i < 100)
    {
      File localFile = new File(paramContext.getCacheDir(), str + i);
      try
      {
        boolean bool = localFile.createNewFile();
        if (bool) {
          return localFile;
        }
      }
      catch (IOException localIOException)
      {
        i++;
      }
    }
    return null;
  }
  
  public static ByteBuffer a(Context paramContext, Resources paramResources, int paramInt)
  {
    File localFile = a(paramContext);
    if (localFile == null) {
      return null;
    }
    try
    {
      boolean bool = a(localFile, paramResources, paramInt);
      if (!bool) {
        return null;
      }
      ByteBuffer localByteBuffer = a(localFile);
      return localByteBuffer;
    }
    finally
    {
      localFile.delete();
    }
  }
  
  /* Error */
  public static ByteBuffer a(Context paramContext, android.os.CancellationSignal paramCancellationSignal, android.net.Uri paramUri)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 72	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   4: astore_3
    //   5: aload_3
    //   6: aload_2
    //   7: ldc 74
    //   9: aload_1
    //   10: invokevirtual 80	android/content/ContentResolver:openFileDescriptor	(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
    //   13: astore 5
    //   15: aload 5
    //   17: ifnonnull +42 -> 59
    //   20: aload 5
    //   22: ifnull +12 -> 34
    //   25: iconst_0
    //   26: ifeq +25 -> 51
    //   29: aload 5
    //   31: invokevirtual 85	android/os/ParcelFileDescriptor:close	()V
    //   34: aconst_null
    //   35: astore 21
    //   37: aload 21
    //   39: areturn
    //   40: astore 24
    //   42: aconst_null
    //   43: aload 24
    //   45: invokevirtual 89	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   48: goto -14 -> 34
    //   51: aload 5
    //   53: invokevirtual 85	android/os/ParcelFileDescriptor:close	()V
    //   56: goto -22 -> 34
    //   59: new 91	java/io/FileInputStream
    //   62: dup
    //   63: aload 5
    //   65: invokevirtual 95	android/os/ParcelFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   68: invokespecial 98	java/io/FileInputStream:<init>	(Ljava/io/FileDescriptor;)V
    //   71: astore 6
    //   73: aload 6
    //   75: invokevirtual 102	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   78: astore 17
    //   80: aload 17
    //   82: invokevirtual 108	java/nio/channels/FileChannel:size	()J
    //   85: lstore 18
    //   87: aload 17
    //   89: getstatic 114	java/nio/channels/FileChannel$MapMode:READ_ONLY	Ljava/nio/channels/FileChannel$MapMode;
    //   92: lconst_0
    //   93: lload 18
    //   95: invokevirtual 118	java/nio/channels/FileChannel:map	(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
    //   98: astore 20
    //   100: aload 20
    //   102: astore 21
    //   104: aload 6
    //   106: ifnull +12 -> 118
    //   109: iconst_0
    //   110: ifeq +80 -> 190
    //   113: aload 6
    //   115: invokevirtual 119	java/io/FileInputStream:close	()V
    //   118: aload 5
    //   120: ifnull -83 -> 37
    //   123: iconst_0
    //   124: ifeq +82 -> 206
    //   127: aload 5
    //   129: invokevirtual 85	android/os/ParcelFileDescriptor:close	()V
    //   132: aload 21
    //   134: areturn
    //   135: astore 22
    //   137: aconst_null
    //   138: aload 22
    //   140: invokevirtual 89	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   143: aload 21
    //   145: areturn
    //   146: astore 23
    //   148: aconst_null
    //   149: aload 23
    //   151: invokevirtual 89	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   154: goto -36 -> 118
    //   157: astore 12
    //   159: aload 12
    //   161: athrow
    //   162: astore 13
    //   164: aload 12
    //   166: astore 10
    //   168: aload 13
    //   170: astore 9
    //   172: aload 5
    //   174: ifnull +13 -> 187
    //   177: aload 10
    //   179: ifnull +100 -> 279
    //   182: aload 5
    //   184: invokevirtual 85	android/os/ParcelFileDescriptor:close	()V
    //   187: aload 9
    //   189: athrow
    //   190: aload 6
    //   192: invokevirtual 119	java/io/FileInputStream:close	()V
    //   195: goto -77 -> 118
    //   198: astore 9
    //   200: aconst_null
    //   201: astore 10
    //   203: goto -31 -> 172
    //   206: aload 5
    //   208: invokevirtual 85	android/os/ParcelFileDescriptor:close	()V
    //   211: aload 21
    //   213: areturn
    //   214: astore 15
    //   216: aload 15
    //   218: athrow
    //   219: astore 16
    //   221: aload 15
    //   223: astore 8
    //   225: aload 16
    //   227: astore 7
    //   229: aload 6
    //   231: ifnull +13 -> 244
    //   234: aload 8
    //   236: ifnull +23 -> 259
    //   239: aload 6
    //   241: invokevirtual 119	java/io/FileInputStream:close	()V
    //   244: aload 7
    //   246: athrow
    //   247: astore 14
    //   249: aload 8
    //   251: aload 14
    //   253: invokevirtual 89	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   256: goto -12 -> 244
    //   259: aload 6
    //   261: invokevirtual 119	java/io/FileInputStream:close	()V
    //   264: goto -20 -> 244
    //   267: astore 11
    //   269: aload 10
    //   271: aload 11
    //   273: invokevirtual 89	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   276: goto -89 -> 187
    //   279: aload 5
    //   281: invokevirtual 85	android/os/ParcelFileDescriptor:close	()V
    //   284: goto -97 -> 187
    //   287: astore 7
    //   289: aconst_null
    //   290: astore 8
    //   292: goto -63 -> 229
    //   295: astore 4
    //   297: aconst_null
    //   298: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	299	0	paramContext	Context
    //   0	299	1	paramCancellationSignal	android.os.CancellationSignal
    //   0	299	2	paramUri	android.net.Uri
    //   4	2	3	localContentResolver	android.content.ContentResolver
    //   295	1	4	localIOException	IOException
    //   13	267	5	localParcelFileDescriptor	android.os.ParcelFileDescriptor
    //   71	189	6	localFileInputStream	java.io.FileInputStream
    //   227	18	7	localObject1	Object
    //   287	1	7	localObject2	Object
    //   223	68	8	localThrowable1	java.lang.Throwable
    //   170	18	9	localObject3	Object
    //   198	1	9	localObject4	Object
    //   166	104	10	localThrowable2	java.lang.Throwable
    //   267	5	11	localThrowable3	java.lang.Throwable
    //   157	8	12	localThrowable4	java.lang.Throwable
    //   162	7	13	localObject5	Object
    //   247	5	14	localThrowable5	java.lang.Throwable
    //   214	8	15	localThrowable6	java.lang.Throwable
    //   219	7	16	localObject6	Object
    //   78	10	17	localFileChannel	java.nio.channels.FileChannel
    //   85	9	18	l	long
    //   98	3	20	localMappedByteBuffer	java.nio.MappedByteBuffer
    //   35	177	21	localObject7	Object
    //   135	4	22	localThrowable7	java.lang.Throwable
    //   146	4	23	localThrowable8	java.lang.Throwable
    //   40	4	24	localThrowable9	java.lang.Throwable
    // Exception table:
    //   from	to	target	type
    //   29	34	40	java/lang/Throwable
    //   127	132	135	java/lang/Throwable
    //   113	118	146	java/lang/Throwable
    //   59	73	157	java/lang/Throwable
    //   148	154	157	java/lang/Throwable
    //   190	195	157	java/lang/Throwable
    //   244	247	157	java/lang/Throwable
    //   249	256	157	java/lang/Throwable
    //   259	264	157	java/lang/Throwable
    //   159	162	162	finally
    //   59	73	198	finally
    //   113	118	198	finally
    //   148	154	198	finally
    //   190	195	198	finally
    //   239	244	198	finally
    //   244	247	198	finally
    //   249	256	198	finally
    //   259	264	198	finally
    //   73	100	214	java/lang/Throwable
    //   216	219	219	finally
    //   239	244	247	java/lang/Throwable
    //   182	187	267	java/lang/Throwable
    //   73	100	287	finally
    //   5	15	295	java/io/IOException
    //   29	34	295	java/io/IOException
    //   42	48	295	java/io/IOException
    //   51	56	295	java/io/IOException
    //   127	132	295	java/io/IOException
    //   137	143	295	java/io/IOException
    //   182	187	295	java/io/IOException
    //   187	190	295	java/io/IOException
    //   206	211	295	java/io/IOException
    //   269	276	295	java/io/IOException
    //   279	284	295	java/io/IOException
  }
  
  /* Error */
  private static ByteBuffer a(File paramFile)
  {
    // Byte code:
    //   0: new 91	java/io/FileInputStream
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 122	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   8: astore_1
    //   9: aload_1
    //   10: invokevirtual 102	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   13: astore 8
    //   15: aload 8
    //   17: invokevirtual 108	java/nio/channels/FileChannel:size	()J
    //   20: lstore 9
    //   22: aload 8
    //   24: getstatic 114	java/nio/channels/FileChannel$MapMode:READ_ONLY	Ljava/nio/channels/FileChannel$MapMode;
    //   27: lconst_0
    //   28: lload 9
    //   30: invokevirtual 118	java/nio/channels/FileChannel:map	(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
    //   33: astore 11
    //   35: aload_1
    //   36: ifnull +11 -> 47
    //   39: iconst_0
    //   40: ifeq +21 -> 61
    //   43: aload_1
    //   44: invokevirtual 119	java/io/FileInputStream:close	()V
    //   47: aload 11
    //   49: areturn
    //   50: astore 12
    //   52: aconst_null
    //   53: aload 12
    //   55: invokevirtual 89	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   58: aload 11
    //   60: areturn
    //   61: aload_1
    //   62: invokevirtual 119	java/io/FileInputStream:close	()V
    //   65: aload 11
    //   67: areturn
    //   68: astore 6
    //   70: aload 6
    //   72: athrow
    //   73: astore 7
    //   75: aload 6
    //   77: astore_3
    //   78: aload 7
    //   80: astore_2
    //   81: aload_1
    //   82: ifnull +11 -> 93
    //   85: aload_3
    //   86: ifnull +20 -> 106
    //   89: aload_1
    //   90: invokevirtual 119	java/io/FileInputStream:close	()V
    //   93: aload_2
    //   94: athrow
    //   95: astore 5
    //   97: aload_3
    //   98: aload 5
    //   100: invokevirtual 89	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   103: goto -10 -> 93
    //   106: aload_1
    //   107: invokevirtual 119	java/io/FileInputStream:close	()V
    //   110: goto -17 -> 93
    //   113: astore_2
    //   114: aconst_null
    //   115: astore_3
    //   116: goto -35 -> 81
    //   119: astore 4
    //   121: aconst_null
    //   122: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	123	0	paramFile	File
    //   8	99	1	localFileInputStream	java.io.FileInputStream
    //   80	14	2	localObject1	Object
    //   113	1	2	localObject2	Object
    //   77	39	3	localThrowable1	java.lang.Throwable
    //   119	1	4	localIOException	IOException
    //   95	4	5	localThrowable2	java.lang.Throwable
    //   68	8	6	localThrowable3	java.lang.Throwable
    //   73	6	7	localObject3	Object
    //   13	10	8	localFileChannel	java.nio.channels.FileChannel
    //   20	9	9	l	long
    //   33	33	11	localMappedByteBuffer	java.nio.MappedByteBuffer
    //   50	4	12	localThrowable4	java.lang.Throwable
    // Exception table:
    //   from	to	target	type
    //   43	47	50	java/lang/Throwable
    //   9	35	68	java/lang/Throwable
    //   70	73	73	finally
    //   89	93	95	java/lang/Throwable
    //   9	35	113	finally
    //   0	9	119	java/io/IOException
    //   43	47	119	java/io/IOException
    //   52	58	119	java/io/IOException
    //   61	65	119	java/io/IOException
    //   89	93	119	java/io/IOException
    //   93	95	119	java/io/IOException
    //   97	103	119	java/io/IOException
    //   106	110	119	java/io/IOException
  }
  
  public static void a(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException localIOException) {}
  }
  
  public static boolean a(File paramFile, Resources paramResources, int paramInt)
  {
    InputStream localInputStream = null;
    try
    {
      localInputStream = paramResources.openRawResource(paramInt);
      boolean bool = a(paramFile, localInputStream);
      return bool;
    }
    finally
    {
      a(localInputStream);
    }
  }
  
  /* Error */
  public static boolean a(File paramFile, InputStream paramInputStream)
  {
    // Byte code:
    //   0: new 139	java/io/FileOutputStream
    //   3: dup
    //   4: aload_0
    //   5: iconst_0
    //   6: invokespecial 142	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   9: astore_2
    //   10: sipush 1024
    //   13: newarray byte
    //   15: astore 6
    //   17: aload_1
    //   18: aload 6
    //   20: invokevirtual 148	java/io/InputStream:read	([B)I
    //   23: istore 7
    //   25: iload 7
    //   27: iconst_m1
    //   28: if_icmpeq +52 -> 80
    //   31: aload_2
    //   32: aload 6
    //   34: iconst_0
    //   35: iload 7
    //   37: invokevirtual 152	java/io/FileOutputStream:write	([BII)V
    //   40: goto -23 -> 17
    //   43: astore 4
    //   45: ldc 154
    //   47: new 10	java/lang/StringBuilder
    //   50: dup
    //   51: invokespecial 14	java/lang/StringBuilder:<init>	()V
    //   54: ldc 156
    //   56: invokevirtual 20	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: aload 4
    //   61: invokevirtual 159	java/io/IOException:getMessage	()Ljava/lang/String;
    //   64: invokevirtual 20	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: invokevirtual 38	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   70: invokestatic 165	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   73: pop
    //   74: aload_2
    //   75: invokestatic 137	android/support/v4/a/h:a	(Ljava/io/Closeable;)V
    //   78: iconst_0
    //   79: ireturn
    //   80: aload_2
    //   81: invokestatic 137	android/support/v4/a/h:a	(Ljava/io/Closeable;)V
    //   84: iconst_1
    //   85: ireturn
    //   86: astore_3
    //   87: aconst_null
    //   88: astore_2
    //   89: aload_2
    //   90: invokestatic 137	android/support/v4/a/h:a	(Ljava/io/Closeable;)V
    //   93: aload_3
    //   94: athrow
    //   95: astore_3
    //   96: goto -7 -> 89
    //   99: astore 4
    //   101: aconst_null
    //   102: astore_2
    //   103: goto -58 -> 45
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	106	0	paramFile	File
    //   0	106	1	paramInputStream	InputStream
    //   9	94	2	localFileOutputStream	java.io.FileOutputStream
    //   86	8	3	localObject1	Object
    //   95	1	3	localObject2	Object
    //   43	17	4	localIOException1	IOException
    //   99	1	4	localIOException2	IOException
    //   15	18	6	arrayOfByte	byte[]
    //   23	13	7	i	int
    // Exception table:
    //   from	to	target	type
    //   10	17	43	java/io/IOException
    //   17	25	43	java/io/IOException
    //   31	40	43	java/io/IOException
    //   0	10	86	finally
    //   10	17	95	finally
    //   17	25	95	finally
    //   31	40	95	finally
    //   45	74	95	finally
    //   0	10	99	java/io/IOException
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.a.h
 * JD-Core Version:    0.7.0.1
 */