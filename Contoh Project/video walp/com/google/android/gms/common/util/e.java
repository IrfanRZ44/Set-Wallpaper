package com.google.android.gms.common.util;

import android.content.Context;
import android.os.DropBoxManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.n;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.annotation.concurrent.GuardedBy;

public final class e
{
  private static final String[] a = { "android.", "com.android.", "dalvik.", "java.", "javax." };
  private static DropBoxManager b = null;
  private static boolean c = false;
  private static boolean d;
  private static boolean e;
  private static int f = -1;
  @GuardedBy("CrashUtils.class")
  private static int g = 0;
  @GuardedBy("CrashUtils.class")
  private static int h = 0;
  
  /* Error */
  private static String a(Context paramContext, String paramString1, String paramString2, int paramInt)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: new 52	java/lang/StringBuilder
    //   6: dup
    //   7: sipush 1024
    //   10: invokespecial 56	java/lang/StringBuilder:<init>	(I)V
    //   13: astore 4
    //   15: aload 4
    //   17: ldc 58
    //   19: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   22: aload_2
    //   23: invokestatic 67	com/google/android/gms/common/util/o:a	(Ljava/lang/String;)Ljava/lang/String;
    //   26: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   29: ldc 69
    //   31: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   34: pop
    //   35: aload 4
    //   37: ldc 71
    //   39: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   42: pop
    //   43: ldc 72
    //   45: istore 8
    //   47: ldc 74
    //   49: astore 9
    //   51: invokestatic 77	com/google/android/gms/common/util/e:b	()Z
    //   54: istore 10
    //   56: iload 10
    //   58: ifeq +39 -> 97
    //   61: aload_0
    //   62: invokestatic 82	com/google/android/gms/common/a/c:b	(Landroid/content/Context;)Lcom/google/android/gms/common/a/b;
    //   65: aload_0
    //   66: invokevirtual 88	android/content/Context:getPackageName	()Ljava/lang/String;
    //   69: iconst_0
    //   70: invokevirtual 93	com/google/android/gms/common/a/b:b	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   73: astore 40
    //   75: aload 40
    //   77: getfield 98	android/content/pm/PackageInfo:versionCode	I
    //   80: istore 8
    //   82: aload 40
    //   84: getfield 102	android/content/pm/PackageInfo:versionName	Ljava/lang/String;
    //   87: ifnull +10 -> 97
    //   90: aload 40
    //   92: getfield 102	android/content/pm/PackageInfo:versionName	Ljava/lang/String;
    //   95: astore 9
    //   97: aload 4
    //   99: ldc 104
    //   101: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   104: iload 8
    //   106: invokevirtual 107	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   109: pop
    //   110: aload 9
    //   112: invokestatic 113	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   115: ifne +75 -> 190
    //   118: aload 9
    //   120: ldc 115
    //   122: invokevirtual 118	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   125: ifeq +47 -> 172
    //   128: aload 9
    //   130: ldc 120
    //   132: invokevirtual 118	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   135: ifne +37 -> 172
    //   138: aload 9
    //   140: ldc 122
    //   142: invokevirtual 126	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   145: ifeq +15 -> 160
    //   148: aload 9
    //   150: invokestatic 130	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   153: ldc 132
    //   155: invokevirtual 135	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   158: astore 9
    //   160: aload 9
    //   162: invokestatic 130	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   165: ldc 120
    //   167: invokevirtual 135	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   170: astore 9
    //   172: aload 4
    //   174: ldc 137
    //   176: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   179: aload 9
    //   181: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   184: ldc 120
    //   186: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   189: pop
    //   190: aload 4
    //   192: ldc 69
    //   194: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   197: pop
    //   198: aload 4
    //   200: ldc 139
    //   202: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   205: getstatic 144	android/os/Build:FINGERPRINT	Ljava/lang/String;
    //   208: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   211: ldc 69
    //   213: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   216: pop
    //   217: invokestatic 149	android/os/Debug:isDebuggerConnected	()Z
    //   220: ifeq +11 -> 231
    //   223: aload 4
    //   225: ldc 151
    //   227: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   230: pop
    //   231: iload_3
    //   232: ifeq +20 -> 252
    //   235: aload 4
    //   237: ldc 153
    //   239: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   242: iload_3
    //   243: invokevirtual 107	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   246: ldc 69
    //   248: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   251: pop
    //   252: aload 4
    //   254: ldc 69
    //   256: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   259: pop
    //   260: aload_1
    //   261: invokestatic 113	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   264: ifne +10 -> 274
    //   267: aload 4
    //   269: aload_1
    //   270: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   273: pop
    //   274: invokestatic 77	com/google/android/gms/common/util/e:b	()Z
    //   277: ifeq +350 -> 627
    //   280: getstatic 41	com/google/android/gms/common/util/e:f	I
    //   283: iflt +260 -> 543
    //   286: getstatic 41	com/google/android/gms/common/util/e:f	I
    //   289: istore 16
    //   291: iload 16
    //   293: ifle +214 -> 507
    //   296: aload 4
    //   298: ldc 69
    //   300: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   303: pop
    //   304: aconst_null
    //   305: astore 18
    //   307: bipush 13
    //   309: anewarray 23	java/lang/String
    //   312: astore 26
    //   314: aload 26
    //   316: iconst_0
    //   317: ldc 155
    //   319: aastore
    //   320: aload 26
    //   322: iconst_1
    //   323: ldc 157
    //   325: aastore
    //   326: aload 26
    //   328: iconst_2
    //   329: ldc 159
    //   331: aastore
    //   332: aload 26
    //   334: iconst_3
    //   335: ldc 161
    //   337: aastore
    //   338: aload 26
    //   340: iconst_4
    //   341: ldc 163
    //   343: aastore
    //   344: aload 26
    //   346: iconst_5
    //   347: ldc 161
    //   349: aastore
    //   350: aload 26
    //   352: bipush 6
    //   354: ldc 165
    //   356: aastore
    //   357: aload 26
    //   359: bipush 7
    //   361: ldc 161
    //   363: aastore
    //   364: aload 26
    //   366: bipush 8
    //   368: ldc 167
    //   370: aastore
    //   371: aload 26
    //   373: bipush 9
    //   375: ldc 161
    //   377: aastore
    //   378: aload 26
    //   380: bipush 10
    //   382: ldc 169
    //   384: aastore
    //   385: aload 26
    //   387: bipush 11
    //   389: ldc 171
    //   391: aastore
    //   392: aload 26
    //   394: bipush 12
    //   396: iload 16
    //   398: invokestatic 174	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   401: aastore
    //   402: new 176	java/lang/ProcessBuilder
    //   405: dup
    //   406: aload 26
    //   408: invokespecial 179	java/lang/ProcessBuilder:<init>	([Ljava/lang/String;)V
    //   411: iconst_1
    //   412: invokevirtual 183	java/lang/ProcessBuilder:redirectErrorStream	(Z)Ljava/lang/ProcessBuilder;
    //   415: invokevirtual 187	java/lang/ProcessBuilder:start	()Ljava/lang/Process;
    //   418: astore 27
    //   420: aload 27
    //   422: invokevirtual 193	java/lang/Process:getOutputStream	()Ljava/io/OutputStream;
    //   425: invokevirtual 198	java/io/OutputStream:close	()V
    //   428: aload 27
    //   430: invokevirtual 202	java/lang/Process:getErrorStream	()Ljava/io/InputStream;
    //   433: invokevirtual 205	java/io/InputStream:close	()V
    //   436: new 207	java/io/InputStreamReader
    //   439: dup
    //   440: aload 27
    //   442: invokevirtual 210	java/lang/Process:getInputStream	()Ljava/io/InputStream;
    //   445: invokespecial 213	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   448: astore 20
    //   450: sipush 8192
    //   453: newarray char
    //   455: astore 30
    //   457: aload 20
    //   459: aload 30
    //   461: invokevirtual 217	java/io/InputStreamReader:read	([C)I
    //   464: istore 31
    //   466: iload 31
    //   468: ifle +94 -> 562
    //   471: aload 4
    //   473: aload 30
    //   475: iconst_0
    //   476: iload 31
    //   478: invokevirtual 220	java/lang/StringBuilder:append	([CII)Ljava/lang/StringBuilder;
    //   481: pop
    //   482: goto -25 -> 457
    //   485: astore 19
    //   487: ldc 222
    //   489: ldc 224
    //   491: aload 19
    //   493: invokestatic 229	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   496: pop
    //   497: aload 20
    //   499: ifnull +8 -> 507
    //   502: aload 20
    //   504: invokevirtual 230	java/io/InputStreamReader:close	()V
    //   507: aload 4
    //   509: invokevirtual 233	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   512: astore 24
    //   514: ldc 2
    //   516: monitorexit
    //   517: aload 24
    //   519: areturn
    //   520: astore 38
    //   522: ldc 222
    //   524: ldc 235
    //   526: aload 38
    //   528: invokestatic 238	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   531: pop
    //   532: goto -435 -> 97
    //   535: astore 5
    //   537: ldc 2
    //   539: monitorexit
    //   540: aload 5
    //   542: athrow
    //   543: aload_0
    //   544: invokevirtual 242	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   547: ldc 244
    //   549: iconst_0
    //   550: invokestatic 250	android/provider/Settings$Secure:getInt	(Landroid/content/ContentResolver;Ljava/lang/String;I)I
    //   553: istore 34
    //   555: iload 34
    //   557: istore 16
    //   559: goto -268 -> 291
    //   562: aload 20
    //   564: invokevirtual 230	java/io/InputStreamReader:close	()V
    //   567: goto -60 -> 507
    //   570: astore 33
    //   572: goto -65 -> 507
    //   575: astore 21
    //   577: aload 18
    //   579: ifnull +8 -> 587
    //   582: aload 18
    //   584: invokevirtual 230	java/io/InputStreamReader:close	()V
    //   587: aload 21
    //   589: athrow
    //   590: astore 25
    //   592: goto -85 -> 507
    //   595: astore 22
    //   597: goto -10 -> 587
    //   600: astore 21
    //   602: aload 20
    //   604: astore 18
    //   606: goto -29 -> 577
    //   609: astore 19
    //   611: aconst_null
    //   612: astore 20
    //   614: goto -127 -> 487
    //   617: astore 29
    //   619: goto -183 -> 436
    //   622: astore 28
    //   624: goto -196 -> 428
    //   627: iconst_0
    //   628: istore 16
    //   630: goto -339 -> 291
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	633	0	paramContext	Context
    //   0	633	1	paramString1	String
    //   0	633	2	paramString2	String
    //   0	633	3	paramInt	int
    //   13	495	4	localStringBuilder	java.lang.StringBuilder
    //   535	6	5	localObject1	Object
    //   45	60	8	i	int
    //   49	131	9	str1	String
    //   54	3	10	bool	boolean
    //   289	340	16	j	int
    //   305	300	18	localObject2	Object
    //   485	7	19	localIOException1	java.io.IOException
    //   609	1	19	localIOException2	java.io.IOException
    //   448	165	20	localInputStreamReader	java.io.InputStreamReader
    //   575	13	21	localObject3	Object
    //   600	1	21	localObject4	Object
    //   595	1	22	localIOException3	java.io.IOException
    //   512	6	24	str2	String
    //   590	1	25	localIOException4	java.io.IOException
    //   312	95	26	arrayOfString	String[]
    //   418	23	27	localProcess	java.lang.Process
    //   622	1	28	localIOException5	java.io.IOException
    //   617	1	29	localIOException6	java.io.IOException
    //   455	19	30	arrayOfChar	char[]
    //   464	13	31	k	int
    //   570	1	33	localIOException7	java.io.IOException
    //   553	3	34	m	int
    //   520	7	38	localException	Exception
    //   73	18	40	localPackageInfo	android.content.pm.PackageInfo
    // Exception table:
    //   from	to	target	type
    //   450	457	485	java/io/IOException
    //   457	466	485	java/io/IOException
    //   471	482	485	java/io/IOException
    //   61	97	520	java/lang/Exception
    //   3	43	535	finally
    //   51	56	535	finally
    //   61	97	535	finally
    //   97	160	535	finally
    //   160	172	535	finally
    //   172	190	535	finally
    //   190	231	535	finally
    //   235	252	535	finally
    //   252	274	535	finally
    //   274	291	535	finally
    //   296	304	535	finally
    //   502	507	535	finally
    //   507	514	535	finally
    //   522	532	535	finally
    //   543	555	535	finally
    //   562	567	535	finally
    //   582	587	535	finally
    //   587	590	535	finally
    //   562	567	570	java/io/IOException
    //   307	420	575	finally
    //   420	428	575	finally
    //   428	436	575	finally
    //   436	450	575	finally
    //   502	507	590	java/io/IOException
    //   582	587	595	java/io/IOException
    //   450	457	600	finally
    //   457	466	600	finally
    //   471	482	600	finally
    //   487	497	600	finally
    //   307	420	609	java/io/IOException
    //   436	450	609	java/io/IOException
    //   428	436	617	java/io/IOException
    //   420	428	622	java/io/IOException
  }
  
  private static Throwable a(Throwable paramThrowable)
  {
    for (;;)
    {
      try
      {
        LinkedList localLinkedList = new LinkedList();
        if (paramThrowable != null)
        {
          localLinkedList.push(paramThrowable);
          paramThrowable = paramThrowable.getCause();
          continue;
          if (!localLinkedList.isEmpty())
          {
            Throwable localThrowable1 = (Throwable)localLinkedList.pop();
            StackTraceElement[] arrayOfStackTraceElement = localThrowable1.getStackTrace();
            ArrayList localArrayList = new ArrayList();
            localArrayList.add(new StackTraceElement(localThrowable1.getClass().getName(), "<filtered>", "<filtered>", 1));
            int j = arrayOfStackTraceElement.length;
            int k = 0;
            int m = i;
            if (k < j)
            {
              StackTraceElement localStackTraceElement = arrayOfStackTraceElement[k];
              String str1 = localStackTraceElement.getClassName();
              String str2 = localStackTraceElement.getFileName();
              if ((TextUtils.isEmpty(str2)) || (!str2.startsWith(":com.google.android.gms"))) {
                break label294;
              }
              n = 1;
              m |= n;
              if ((n == 0) && (!a(str1))) {
                localStackTraceElement = new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1);
              }
              localArrayList.add(localStackTraceElement);
              k++;
              continue;
            }
            if (localObject2 == null)
            {
              localObject2 = new Throwable("<filtered>");
              ((Throwable)localObject2).setStackTrace((StackTraceElement[])localArrayList.toArray(new StackTraceElement[0]));
              i = m;
              continue;
            }
            Throwable localThrowable2 = new Throwable("<filtered>", (Throwable)localObject2);
            localObject2 = localThrowable2;
            continue;
          }
          if (i == 0)
          {
            localObject3 = null;
            return localObject3;
          }
          Object localObject3 = localObject2;
          continue;
        }
        Object localObject2 = null;
      }
      finally {}
      int i = 0;
      continue;
      label294:
      int n = 0;
    }
  }
  
  private static boolean a()
  {
    if (c) {
      return d;
    }
    return false;
  }
  
  private static boolean a(Context paramContext, String paramString1, String paramString2, int paramInt, Throwable paramThrowable)
  {
    label166:
    for (;;)
    {
      try
      {
        n.a(paramContext);
        if (a())
        {
          boolean bool2 = o.b(paramString1);
          if (!bool2) {}
        }
        else
        {
          bool1 = false;
          return bool1;
        }
        int i = paramString1.hashCode();
        int j;
        if (paramThrowable == null)
        {
          j = h;
          if ((g == i) && (h == j)) {
            bool1 = false;
          }
        }
        else
        {
          j = paramThrowable.hashCode();
          continue;
        }
        g = i;
        h = j;
        DropBoxManager localDropBoxManager;
        if (b != null)
        {
          localDropBoxManager = b;
          if (localDropBoxManager == null) {
            break label166;
          }
          if (!localDropBoxManager.isTagEnabled("system_app_crash")) {
            break label166;
          }
        }
        else
        {
          localDropBoxManager = (DropBoxManager)paramContext.getSystemService("dropbox");
          continue;
        }
        localDropBoxManager.addText("system_app_crash", a(paramContext, paramString1, paramString2, paramInt));
        boolean bool1 = true;
        continue;
        bool1 = false;
      }
      finally {}
    }
  }
  
  public static boolean a(Context paramContext, Throwable paramThrowable)
  {
    return a(paramContext, paramThrowable, 536870912);
  }
  
  public static boolean a(Context paramContext, Throwable paramThrowable, int paramInt)
  {
    try
    {
      n.a(paramContext);
      n.a(paramThrowable);
      if (!a()) {
        return false;
      }
      if (!b())
      {
        paramThrowable = a(paramThrowable);
        if (paramThrowable == null) {}
      }
      else
      {
        boolean bool3 = a(paramContext, Log.getStackTraceString(paramThrowable), m.a(), paramInt, paramThrowable);
        return bool3;
      }
    }
    catch (Exception localException1)
    {
      try
      {
        boolean bool2 = b();
        bool1 = bool2;
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          Log.e("CrashUtils", "Error determining which process we're running in!", localException2);
          boolean bool1 = false;
        }
        Log.e("CrashUtils", "Error adding exception to DropBox!", localException1);
      }
      if (bool1) {
        throw localException1;
      }
    }
    return false;
  }
  
  public static boolean a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    for (;;)
    {
      return false;
      String[] arrayOfString = a;
      int i = arrayOfString.length;
      for (int j = 0; j < i; j++) {
        if (paramString.startsWith(arrayOfString[j])) {
          return true;
        }
      }
    }
  }
  
  private static boolean b()
  {
    if (c) {
      return e;
    }
    return false;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.util.e
 * JD-Core Version:    0.7.0.1
 */