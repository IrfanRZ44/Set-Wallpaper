package android.support.v4.a;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import java.io.File;

class d
  extends g
{
  private File a(ParcelFileDescriptor paramParcelFileDescriptor)
  {
    try
    {
      String str = Os.readlink("/proc/self/fd/" + paramParcelFileDescriptor.getFd());
      if (OsConstants.S_ISREG(Os.stat(str).st_mode))
      {
        File localFile = new File(str);
        return localFile;
      }
      return null;
    }
    catch (ErrnoException localErrnoException) {}
    return null;
  }
  
  /* Error */
  public android.graphics.Typeface a(android.content.Context paramContext, android.os.CancellationSignal paramCancellationSignal, android.support.v4.d.b.b[] paramArrayOfb, int paramInt)
  {
    // Byte code:
    //   0: aload_3
    //   1: arraylength
    //   2: iconst_1
    //   3: if_icmpge +5 -> 8
    //   6: aconst_null
    //   7: areturn
    //   8: aload_0
    //   9: aload_3
    //   10: iload 4
    //   12: invokevirtual 69	android/support/v4/a/d:a	([Landroid/support/v4/d/b$b;I)Landroid/support/v4/d/b$b;
    //   15: astore 5
    //   17: aload_1
    //   18: invokevirtual 75	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   21: astore 6
    //   23: aload 6
    //   25: aload 5
    //   27: invokevirtual 80	android/support/v4/d/b$b:a	()Landroid/net/Uri;
    //   30: ldc 82
    //   32: aload_2
    //   33: invokevirtual 88	android/content/ContentResolver:openFileDescriptor	(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
    //   36: astore 8
    //   38: aload_0
    //   39: aload 8
    //   41: invokespecial 90	android/support/v4/a/d:a	(Landroid/os/ParcelFileDescriptor;)Ljava/io/File;
    //   44: astore 14
    //   46: aload 14
    //   48: ifnull +11 -> 59
    //   51: aload 14
    //   53: invokevirtual 94	java/io/File:canRead	()Z
    //   56: ifne +185 -> 241
    //   59: new 96	java/io/FileInputStream
    //   62: dup
    //   63: aload 8
    //   65: invokevirtual 100	android/os/ParcelFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   68: invokespecial 103	java/io/FileInputStream:<init>	(Ljava/io/FileDescriptor;)V
    //   71: astore 15
    //   73: aload_0
    //   74: aload_1
    //   75: aload 15
    //   77: invokespecial 106	android/support/v4/a/g:a	(Landroid/content/Context;Ljava/io/InputStream;)Landroid/graphics/Typeface;
    //   80: astore 19
    //   82: aload 15
    //   84: ifnull +12 -> 96
    //   87: iconst_0
    //   88: ifeq +73 -> 161
    //   91: aload 15
    //   93: invokevirtual 109	java/io/FileInputStream:close	()V
    //   96: aload 8
    //   98: ifnull +12 -> 110
    //   101: iconst_0
    //   102: ifeq +86 -> 188
    //   105: aload 8
    //   107: invokevirtual 110	android/os/ParcelFileDescriptor:close	()V
    //   110: aload 19
    //   112: areturn
    //   113: astore 21
    //   115: aconst_null
    //   116: aload 21
    //   118: invokevirtual 114	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   121: goto -25 -> 96
    //   124: astore 12
    //   126: aload 12
    //   128: athrow
    //   129: astore 13
    //   131: aload 12
    //   133: astore 10
    //   135: aload 13
    //   137: astore 9
    //   139: aload 8
    //   141: ifnull +13 -> 154
    //   144: aload 10
    //   146: ifnull +150 -> 296
    //   149: aload 8
    //   151: invokevirtual 110	android/os/ParcelFileDescriptor:close	()V
    //   154: aload 9
    //   156: athrow
    //   157: astore 7
    //   159: aconst_null
    //   160: areturn
    //   161: aload 15
    //   163: invokevirtual 109	java/io/FileInputStream:close	()V
    //   166: goto -70 -> 96
    //   169: astore 9
    //   171: aconst_null
    //   172: astore 10
    //   174: goto -35 -> 139
    //   177: astore 20
    //   179: aconst_null
    //   180: aload 20
    //   182: invokevirtual 114	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   185: goto -75 -> 110
    //   188: aload 8
    //   190: invokevirtual 110	android/os/ParcelFileDescriptor:close	()V
    //   193: goto -83 -> 110
    //   196: astore 17
    //   198: aload 17
    //   200: athrow
    //   201: astore 16
    //   203: aload 15
    //   205: ifnull +13 -> 218
    //   208: aload 17
    //   210: ifnull +23 -> 233
    //   213: aload 15
    //   215: invokevirtual 109	java/io/FileInputStream:close	()V
    //   218: aload 16
    //   220: athrow
    //   221: astore 18
    //   223: aload 17
    //   225: aload 18
    //   227: invokevirtual 114	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   230: goto -12 -> 218
    //   233: aload 15
    //   235: invokevirtual 109	java/io/FileInputStream:close	()V
    //   238: goto -20 -> 218
    //   241: aload 14
    //   243: invokestatic 120	android/graphics/Typeface:createFromFile	(Ljava/io/File;)Landroid/graphics/Typeface;
    //   246: astore 22
    //   248: aload 8
    //   250: ifnull +12 -> 262
    //   253: iconst_0
    //   254: ifeq +22 -> 276
    //   257: aload 8
    //   259: invokevirtual 110	android/os/ParcelFileDescriptor:close	()V
    //   262: aload 22
    //   264: areturn
    //   265: astore 23
    //   267: aconst_null
    //   268: aload 23
    //   270: invokevirtual 114	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   273: goto -11 -> 262
    //   276: aload 8
    //   278: invokevirtual 110	android/os/ParcelFileDescriptor:close	()V
    //   281: goto -19 -> 262
    //   284: astore 11
    //   286: aload 10
    //   288: aload 11
    //   290: invokevirtual 114	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   293: goto -139 -> 154
    //   296: aload 8
    //   298: invokevirtual 110	android/os/ParcelFileDescriptor:close	()V
    //   301: goto -147 -> 154
    //   304: astore 16
    //   306: aconst_null
    //   307: astore 17
    //   309: goto -106 -> 203
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	312	0	this	d
    //   0	312	1	paramContext	android.content.Context
    //   0	312	2	paramCancellationSignal	android.os.CancellationSignal
    //   0	312	3	paramArrayOfb	android.support.v4.d.b.b[]
    //   0	312	4	paramInt	int
    //   15	11	5	localb	android.support.v4.d.b.b
    //   21	3	6	localContentResolver	android.content.ContentResolver
    //   157	1	7	localIOException	java.io.IOException
    //   36	261	8	localParcelFileDescriptor	ParcelFileDescriptor
    //   137	18	9	localObject1	java.lang.Object
    //   169	1	9	localObject2	java.lang.Object
    //   133	154	10	localThrowable1	java.lang.Throwable
    //   284	5	11	localThrowable2	java.lang.Throwable
    //   124	8	12	localThrowable3	java.lang.Throwable
    //   129	7	13	localObject3	java.lang.Object
    //   44	198	14	localFile	File
    //   71	163	15	localFileInputStream	java.io.FileInputStream
    //   201	18	16	localObject4	java.lang.Object
    //   304	1	16	localObject5	java.lang.Object
    //   196	28	17	localThrowable4	java.lang.Throwable
    //   307	1	17	localObject6	java.lang.Object
    //   221	5	18	localThrowable5	java.lang.Throwable
    //   80	31	19	localTypeface1	android.graphics.Typeface
    //   177	4	20	localThrowable6	java.lang.Throwable
    //   113	4	21	localThrowable7	java.lang.Throwable
    //   246	17	22	localTypeface2	android.graphics.Typeface
    //   265	4	23	localThrowable8	java.lang.Throwable
    // Exception table:
    //   from	to	target	type
    //   91	96	113	java/lang/Throwable
    //   38	46	124	java/lang/Throwable
    //   51	59	124	java/lang/Throwable
    //   59	73	124	java/lang/Throwable
    //   115	121	124	java/lang/Throwable
    //   161	166	124	java/lang/Throwable
    //   218	221	124	java/lang/Throwable
    //   223	230	124	java/lang/Throwable
    //   233	238	124	java/lang/Throwable
    //   241	248	124	java/lang/Throwable
    //   126	129	129	finally
    //   23	38	157	java/io/IOException
    //   105	110	157	java/io/IOException
    //   149	154	157	java/io/IOException
    //   154	157	157	java/io/IOException
    //   179	185	157	java/io/IOException
    //   188	193	157	java/io/IOException
    //   257	262	157	java/io/IOException
    //   267	273	157	java/io/IOException
    //   276	281	157	java/io/IOException
    //   286	293	157	java/io/IOException
    //   296	301	157	java/io/IOException
    //   38	46	169	finally
    //   51	59	169	finally
    //   59	73	169	finally
    //   91	96	169	finally
    //   115	121	169	finally
    //   161	166	169	finally
    //   213	218	169	finally
    //   218	221	169	finally
    //   223	230	169	finally
    //   233	238	169	finally
    //   241	248	169	finally
    //   105	110	177	java/lang/Throwable
    //   73	82	196	java/lang/Throwable
    //   198	201	201	finally
    //   213	218	221	java/lang/Throwable
    //   257	262	265	java/lang/Throwable
    //   149	154	284	java/lang/Throwable
    //   73	82	304	finally
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.a.d
 * JD-Core Version:    0.7.0.1
 */