package com.a.a.a;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class a
  implements Closeable
{
  final ThreadPoolExecutor a = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a(null));
  private final File b;
  private final File c;
  private final File d;
  private final File e;
  private final int f;
  private long g;
  private final int h;
  private long i = 0L;
  private Writer j;
  private final LinkedHashMap<String, c> k = new LinkedHashMap(0, 0.75F, true);
  private int l;
  private long m = 0L;
  private final Callable<Void> n = new Callable()
  {
    public Void a()
    {
      synchronized (a.this)
      {
        if (a.a(a.this) == null) {
          return null;
        }
        a.b(a.this);
        if (a.c(a.this))
        {
          a.d(a.this);
          a.a(a.this, 0);
        }
        return null;
      }
    }
  };
  
  private a(File paramFile, int paramInt1, int paramInt2, long paramLong)
  {
    this.b = paramFile;
    this.f = paramInt1;
    this.c = new File(paramFile, "journal");
    this.d = new File(paramFile, "journal.tmp");
    this.e = new File(paramFile, "journal.bkp");
    this.h = paramInt2;
    this.g = paramLong;
  }
  
  private b a(String paramString, long paramLong)
  {
    for (;;)
    {
      c localc1;
      b localb2;
      c localc2;
      try
      {
        f();
        localc1 = (c)this.k.get(paramString);
        if (paramLong != -1L) {
          if (localc1 != null)
          {
            long l1 = c.e(localc1);
            if (l1 == paramLong) {}
          }
          else
          {
            localb2 = null;
            return localb2;
          }
        }
        if (localc1 == null)
        {
          c localc3 = new c(paramString, null);
          this.k.put(paramString, localc3);
          localc2 = localc3;
          localb2 = new b(localc2, null);
          c.a(localc2, localb2);
          this.j.append("DIRTY");
          this.j.append(' ');
          this.j.append(paramString);
          this.j.append('\n');
          this.j.flush();
          continue;
        }
        localb1 = c.a(localc1);
      }
      finally {}
      b localb1;
      if (localb1 != null) {
        localb2 = null;
      } else {
        localc2 = localc1;
      }
    }
  }
  
  public static a a(File paramFile, int paramInt1, int paramInt2, long paramLong)
  {
    if (paramLong <= 0L) {
      throw new IllegalArgumentException("maxSize <= 0");
    }
    if (paramInt2 <= 0) {
      throw new IllegalArgumentException("valueCount <= 0");
    }
    File localFile1 = new File(paramFile, "journal.bkp");
    File localFile2;
    if (localFile1.exists())
    {
      localFile2 = new File(paramFile, "journal");
      if (!localFile2.exists()) {
        break label113;
      }
      localFile1.delete();
    }
    a locala1;
    for (;;)
    {
      locala1 = new a(paramFile, paramInt1, paramInt2, paramLong);
      if (!locala1.c.exists()) {
        break label174;
      }
      try
      {
        locala1.b();
        locala1.c();
        return locala1;
      }
      catch (IOException localIOException)
      {
        label113:
        System.out.println("DiskLruCache " + paramFile + " is corrupt: " + localIOException.getMessage() + ", removing");
        locala1.a();
      }
      a(localFile1, localFile2, false);
    }
    label174:
    paramFile.mkdirs();
    a locala2 = new a(paramFile, paramInt1, paramInt2, paramLong);
    locala2.d();
    return locala2;
  }
  
  private void a(b paramb, boolean paramBoolean)
  {
    c localc;
    try
    {
      localc = b.a(paramb);
      if (c.a(localc) != paramb) {
        throw new IllegalStateException();
      }
    }
    finally {}
    int i1 = 0;
    if (paramBoolean)
    {
      boolean bool = c.d(localc);
      i1 = 0;
      if (!bool) {
        for (int i2 = 0;; i2++)
        {
          int i3 = this.h;
          i1 = 0;
          if (i2 >= i3) {
            break;
          }
          if (b.b(paramb)[i2] == 0)
          {
            paramb.b();
            throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
          }
          if (!localc.b(i2).exists())
          {
            paramb.b();
            return;
          }
        }
      }
    }
    for (;;)
    {
      if (i1 < this.h)
      {
        File localFile1 = localc.b(i1);
        if (paramBoolean)
        {
          if (localFile1.exists())
          {
            File localFile2 = localc.a(i1);
            localFile1.renameTo(localFile2);
            long l2 = c.b(localc)[i1];
            long l3 = localFile2.length();
            c.b(localc)[i1] = l3;
            this.i = (l3 + (this.i - l2));
          }
        }
        else {
          a(localFile1);
        }
      }
      else
      {
        this.l = (1 + this.l);
        c.a(localc, null);
        if ((paramBoolean | c.d(localc)))
        {
          c.a(localc, true);
          this.j.append("CLEAN");
          this.j.append(' ');
          this.j.append(c.c(localc));
          this.j.append(localc.a());
          this.j.append('\n');
          if (paramBoolean)
          {
            long l1 = this.m;
            this.m = (1L + l1);
            c.a(localc, l1);
          }
        }
        for (;;)
        {
          this.j.flush();
          if ((this.i <= this.g) && (!e())) {
            break;
          }
          this.a.submit(this.n);
          break;
          this.k.remove(c.c(localc));
          this.j.append("REMOVE");
          this.j.append(' ');
          this.j.append(c.c(localc));
          this.j.append('\n');
        }
      }
      i1++;
    }
  }
  
  private static void a(File paramFile)
  {
    if ((paramFile.exists()) && (!paramFile.delete())) {
      throw new IOException();
    }
  }
  
  private static void a(File paramFile1, File paramFile2, boolean paramBoolean)
  {
    if (paramBoolean) {
      a(paramFile2);
    }
    if (!paramFile1.renameTo(paramFile2)) {
      throw new IOException();
    }
  }
  
  /* Error */
  private void b()
  {
    // Byte code:
    //   0: new 292	com/a/a/a/b
    //   3: dup
    //   4: new 294	java/io/FileInputStream
    //   7: dup
    //   8: aload_0
    //   9: getfield 89	com/a/a/a/a:c	Ljava/io/File;
    //   12: invokespecial 296	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   15: getstatic 301	com/a/a/a/c:a	Ljava/nio/charset/Charset;
    //   18: invokespecial 304	com/a/a/a/b:<init>	(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
    //   21: astore_1
    //   22: aload_1
    //   23: invokevirtual 305	com/a/a/a/b:a	()Ljava/lang/String;
    //   26: astore_3
    //   27: aload_1
    //   28: invokevirtual 305	com/a/a/a/b:a	()Ljava/lang/String;
    //   31: astore 4
    //   33: aload_1
    //   34: invokevirtual 305	com/a/a/a/b:a	()Ljava/lang/String;
    //   37: astore 5
    //   39: aload_1
    //   40: invokevirtual 305	com/a/a/a/b:a	()Ljava/lang/String;
    //   43: astore 6
    //   45: aload_1
    //   46: invokevirtual 305	com/a/a/a/b:a	()Ljava/lang/String;
    //   49: astore 7
    //   51: ldc_w 307
    //   54: aload_3
    //   55: invokevirtual 313	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   58: ifeq +55 -> 113
    //   61: ldc_w 315
    //   64: aload 4
    //   66: invokevirtual 313	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   69: ifeq +44 -> 113
    //   72: aload_0
    //   73: getfield 80	com/a/a/a/a:f	I
    //   76: invokestatic 320	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   79: aload 5
    //   81: invokevirtual 313	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   84: ifeq +29 -> 113
    //   87: aload_0
    //   88: getfield 99	com/a/a/a/a:h	I
    //   91: invokestatic 320	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   94: aload 6
    //   96: invokevirtual 313	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   99: ifeq +14 -> 113
    //   102: ldc_w 322
    //   105: aload 7
    //   107: invokevirtual 313	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   110: ifne +77 -> 187
    //   113: new 155	java/io/IOException
    //   116: dup
    //   117: new 188	java/lang/StringBuilder
    //   120: dup
    //   121: invokespecial 189	java/lang/StringBuilder:<init>	()V
    //   124: ldc_w 324
    //   127: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   130: aload_3
    //   131: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: ldc_w 326
    //   137: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   140: aload 4
    //   142: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   145: ldc_w 326
    //   148: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   151: aload 6
    //   153: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   156: ldc_w 326
    //   159: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   162: aload 7
    //   164: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   167: ldc_w 328
    //   170: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   173: invokevirtual 208	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   176: invokespecial 329	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   179: athrow
    //   180: astore_2
    //   181: aload_1
    //   182: invokestatic 332	com/a/a/a/c:a	(Ljava/io/Closeable;)V
    //   185: aload_2
    //   186: athrow
    //   187: iconst_0
    //   188: istore 8
    //   190: aload_0
    //   191: aload_1
    //   192: invokevirtual 305	com/a/a/a/b:a	()Ljava/lang/String;
    //   195: invokespecial 334	com/a/a/a/a:d	(Ljava/lang/String;)V
    //   198: iinc 8 1
    //   201: goto -11 -> 190
    //   204: astore 9
    //   206: aload_0
    //   207: iload 8
    //   209: aload_0
    //   210: getfield 44	com/a/a/a/a:k	Ljava/util/LinkedHashMap;
    //   213: invokevirtual 338	java/util/LinkedHashMap:size	()I
    //   216: isub
    //   217: putfield 104	com/a/a/a/a:l	I
    //   220: aload_1
    //   221: invokevirtual 340	com/a/a/a/b:b	()Z
    //   224: ifeq +12 -> 236
    //   227: aload_0
    //   228: invokespecial 220	com/a/a/a/a:d	()V
    //   231: aload_1
    //   232: invokestatic 332	com/a/a/a/c:a	(Ljava/io/Closeable;)V
    //   235: return
    //   236: aload_0
    //   237: new 342	java/io/BufferedWriter
    //   240: dup
    //   241: new 344	java/io/OutputStreamWriter
    //   244: dup
    //   245: new 346	java/io/FileOutputStream
    //   248: dup
    //   249: aload_0
    //   250: getfield 89	com/a/a/a/a:c	Ljava/io/File;
    //   253: iconst_1
    //   254: invokespecial 349	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   257: getstatic 301	com/a/a/a/c:a	Ljava/nio/charset/Charset;
    //   260: invokespecial 352	java/io/OutputStreamWriter:<init>	(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
    //   263: invokespecial 355	java/io/BufferedWriter:<init>	(Ljava/io/Writer;)V
    //   266: putfield 135	com/a/a/a/a:j	Ljava/io/Writer;
    //   269: goto -38 -> 231
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	272	0	this	a
    //   21	211	1	localb	b
    //   180	6	2	localObject	Object
    //   26	105	3	str1	String
    //   31	110	4	str2	String
    //   37	43	5	str3	String
    //   43	109	6	str4	String
    //   49	114	7	str5	String
    //   188	29	8	i1	int
    //   204	1	9	localEOFException	java.io.EOFException
    // Exception table:
    //   from	to	target	type
    //   22	113	180	finally
    //   113	180	180	finally
    //   190	198	180	finally
    //   206	231	180	finally
    //   236	269	180	finally
    //   190	198	204	java/io/EOFException
  }
  
  private void c()
  {
    a(this.d);
    Iterator localIterator = this.k.values().iterator();
    while (localIterator.hasNext())
    {
      c localc = (c)localIterator.next();
      if (c.a(localc) == null)
      {
        for (int i2 = 0; i2 < this.h; i2++) {
          this.i += c.b(localc)[i2];
        }
      }
      else
      {
        c.a(localc, null);
        for (int i1 = 0; i1 < this.h; i1++)
        {
          a(localc.a(i1));
          a(localc.b(i1));
        }
        localIterator.remove();
      }
    }
  }
  
  private void d()
  {
    BufferedWriter localBufferedWriter;
    for (;;)
    {
      try
      {
        if (this.j != null) {
          this.j.close();
        }
        localBufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.d), c.a));
        c localc;
        try
        {
          localBufferedWriter.write("libcore.io.DiskLruCache");
          localBufferedWriter.write("\n");
          localBufferedWriter.write("1");
          localBufferedWriter.write("\n");
          localBufferedWriter.write(Integer.toString(this.f));
          localBufferedWriter.write("\n");
          localBufferedWriter.write(Integer.toString(this.h));
          localBufferedWriter.write("\n");
          localBufferedWriter.write("\n");
          Iterator localIterator = this.k.values().iterator();
          if (!localIterator.hasNext()) {
            break;
          }
          localc = (c)localIterator.next();
          if (c.a(localc) != null)
          {
            localBufferedWriter.write("DIRTY " + c.c(localc) + '\n');
            continue;
            localObject1 = finally;
          }
        }
        finally
        {
          localBufferedWriter.close();
        }
        localBufferedWriter.write("CLEAN " + c.c(localc) + localc.a() + '\n');
      }
      finally {}
    }
    localBufferedWriter.close();
    if (this.c.exists()) {
      a(this.c, this.e, true);
    }
    a(this.d, this.c, false);
    this.e.delete();
    this.j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c, true), c.a));
  }
  
  private void d(String paramString)
  {
    int i1 = paramString.indexOf(' ');
    if (i1 == -1) {
      throw new IOException("unexpected journal line: " + paramString);
    }
    int i2 = i1 + 1;
    int i3 = paramString.indexOf(' ', i2);
    String str2;
    if (i3 == -1)
    {
      str2 = paramString.substring(i2);
      if ((i1 != "REMOVE".length()) || (!paramString.startsWith("REMOVE"))) {
        break label310;
      }
      this.k.remove(str2);
    }
    label310:
    for (String str1 = paramString.substring(i2, i3);; str1 = str2)
    {
      c localc = (c)this.k.get(str1);
      if (localc == null)
      {
        localc = new c(str1, null);
        this.k.put(str1, localc);
      }
      if ((i3 != -1) && (i1 == "CLEAN".length()) && (paramString.startsWith("CLEAN")))
      {
        String[] arrayOfString = paramString.substring(i3 + 1).split(" ");
        c.a(localc, true);
        c.a(localc, null);
        c.a(localc, arrayOfString);
        return;
      }
      if ((i3 == -1) && (i1 == "DIRTY".length()) && (paramString.startsWith("DIRTY")))
      {
        c.a(localc, new b(localc, null));
        return;
      }
      if ((i3 == -1) && (i1 == "READ".length()) && (paramString.startsWith("READ"))) {
        break;
      }
      throw new IOException("unexpected journal line: " + paramString);
    }
  }
  
  private boolean e()
  {
    return (this.l >= 2000) && (this.l >= this.k.size());
  }
  
  private void f()
  {
    if (this.j == null) {
      throw new IllegalStateException("cache is closed");
    }
  }
  
  private void g()
  {
    while (this.i > this.g) {
      c((String)((Map.Entry)this.k.entrySet().iterator().next()).getKey());
    }
  }
  
  /* Error */
  public d a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial 107	com/a/a/a/a:f	()V
    //   6: aload_0
    //   7: getfield 44	com/a/a/a/a:k	Ljava/util/LinkedHashMap;
    //   10: aload_1
    //   11: invokevirtual 111	java/util/LinkedHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   14: checkcast 113	com/a/a/a/a$c
    //   17: astore_3
    //   18: aconst_null
    //   19: astore 4
    //   21: aload_3
    //   22: ifnonnull +8 -> 30
    //   25: aload_0
    //   26: monitorexit
    //   27: aload 4
    //   29: areturn
    //   30: aload_3
    //   31: invokestatic 231	com/a/a/a/a$c:d	(Lcom/a/a/a/a$c;)Z
    //   34: istore 5
    //   36: aconst_null
    //   37: astore 4
    //   39: iload 5
    //   41: ifeq -16 -> 25
    //   44: aload_3
    //   45: getfield 449	com/a/a/a/a$c:a	[Ljava/io/File;
    //   48: astore 6
    //   50: aload 6
    //   52: arraylength
    //   53: istore 7
    //   55: iconst_0
    //   56: istore 8
    //   58: iload 8
    //   60: iload 7
    //   62: if_icmpge +27 -> 89
    //   65: aload 6
    //   67: iload 8
    //   69: aaload
    //   70: invokevirtual 168	java/io/File:exists	()Z
    //   73: istore 9
    //   75: aconst_null
    //   76: astore 4
    //   78: iload 9
    //   80: ifeq -55 -> 25
    //   83: iinc 8 1
    //   86: goto -28 -> 58
    //   89: aload_0
    //   90: iconst_1
    //   91: aload_0
    //   92: getfield 104	com/a/a/a/a:l	I
    //   95: iadd
    //   96: putfield 104	com/a/a/a/a:l	I
    //   99: aload_0
    //   100: getfield 135	com/a/a/a/a:j	Ljava/io/Writer;
    //   103: ldc_w 427
    //   106: invokevirtual 143	java/io/Writer:append	(Ljava/lang/CharSequence;)Ljava/io/Writer;
    //   109: pop
    //   110: aload_0
    //   111: getfield 135	com/a/a/a/a:j	Ljava/io/Writer;
    //   114: bipush 32
    //   116: invokevirtual 146	java/io/Writer:append	(C)Ljava/io/Writer;
    //   119: pop
    //   120: aload_0
    //   121: getfield 135	com/a/a/a/a:j	Ljava/io/Writer;
    //   124: aload_1
    //   125: invokevirtual 143	java/io/Writer:append	(Ljava/lang/CharSequence;)Ljava/io/Writer;
    //   128: pop
    //   129: aload_0
    //   130: getfield 135	com/a/a/a/a:j	Ljava/io/Writer;
    //   133: bipush 10
    //   135: invokevirtual 146	java/io/Writer:append	(C)Ljava/io/Writer;
    //   138: pop
    //   139: aload_0
    //   140: invokespecial 275	com/a/a/a/a:e	()Z
    //   143: ifeq +15 -> 158
    //   146: aload_0
    //   147: getfield 69	com/a/a/a/a:a	Ljava/util/concurrent/ThreadPoolExecutor;
    //   150: aload_0
    //   151: getfield 76	com/a/a/a/a:n	Ljava/util/concurrent/Callable;
    //   154: invokevirtual 279	java/util/concurrent/ThreadPoolExecutor:submit	(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    //   157: pop
    //   158: new 451	com/a/a/a/a$d
    //   161: dup
    //   162: aload_0
    //   163: aload_1
    //   164: aload_3
    //   165: invokestatic 118	com/a/a/a/a$c:e	(Lcom/a/a/a/a$c;)J
    //   168: aload_3
    //   169: getfield 449	com/a/a/a/a$c:a	[Ljava/io/File;
    //   172: aload_3
    //   173: invokestatic 253	com/a/a/a/a$c:b	(Lcom/a/a/a/a$c;)[J
    //   176: aconst_null
    //   177: invokespecial 454	com/a/a/a/a$d:<init>	(Lcom/a/a/a/a;Ljava/lang/String;J[Ljava/io/File;[JLcom/a/a/a/a$1;)V
    //   180: astore 4
    //   182: goto -157 -> 25
    //   185: astore_2
    //   186: aload_0
    //   187: monitorexit
    //   188: aload_2
    //   189: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	190	0	this	a
    //   0	190	1	paramString	String
    //   185	4	2	localObject	Object
    //   17	156	3	localc	c
    //   19	162	4	locald	d
    //   34	6	5	bool1	boolean
    //   48	18	6	arrayOfFile	File[]
    //   53	10	7	i1	int
    //   56	28	8	i2	int
    //   73	6	9	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   2	18	185	finally
    //   30	36	185	finally
    //   44	55	185	finally
    //   65	75	185	finally
    //   89	158	185	finally
    //   158	182	185	finally
  }
  
  public void a()
  {
    close();
    c.a(this.b);
  }
  
  public b b(String paramString)
  {
    return a(paramString, -1L);
  }
  
  public boolean c(String paramString)
  {
    for (;;)
    {
      try
      {
        f();
        c localc = (c)this.k.get(paramString);
        int i1;
        if (localc != null)
        {
          b localb = c.a(localc);
          i1 = 0;
          if (localb == null) {}
        }
        else
        {
          bool = false;
          return bool;
          this.i -= c.b(localc)[i1];
          c.b(localc)[i1] = 0L;
          i1++;
        }
        if (i1 < this.h)
        {
          File localFile = localc.a(i1);
          if ((!localFile.exists()) || (localFile.delete())) {
            continue;
          }
          throw new IOException("failed to delete " + localFile);
        }
      }
      finally {}
      this.l = (1 + this.l);
      this.j.append("REMOVE");
      this.j.append(' ');
      this.j.append(paramString);
      this.j.append('\n');
      this.k.remove(paramString);
      if (e()) {
        this.a.submit(this.n);
      }
      boolean bool = true;
    }
  }
  
  public void close()
  {
    for (;;)
    {
      try
      {
        Writer localWriter = this.j;
        if (localWriter == null) {
          return;
        }
        Iterator localIterator = new ArrayList(this.k.values()).iterator();
        if (localIterator.hasNext())
        {
          c localc = (c)localIterator.next();
          if (c.a(localc) == null) {
            continue;
          }
          c.a(localc).b();
          continue;
        }
        g();
      }
      finally {}
      this.j.close();
      this.j = null;
    }
  }
  
  private static final class a
    implements ThreadFactory
  {
    public Thread newThread(Runnable paramRunnable)
    {
      try
      {
        Thread localThread = new Thread(paramRunnable, "glide-disk-lru-cache-thread");
        localThread.setPriority(1);
        return localThread;
      }
      finally
      {
        localObject = finally;
        throw localObject;
      }
    }
  }
  
  public final class b
  {
    private final a.c b;
    private final boolean[] c;
    private boolean d;
    
    private b(a.c paramc)
    {
      this.b = paramc;
      if (a.c.d(paramc)) {}
      for (boolean[] arrayOfBoolean = null;; arrayOfBoolean = new boolean[a.e(a.this)])
      {
        this.c = arrayOfBoolean;
        return;
      }
    }
    
    public File a(int paramInt)
    {
      synchronized (a.this)
      {
        if (a.c.a(this.b) != this) {
          throw new IllegalStateException();
        }
      }
      if (!a.c.d(this.b)) {
        this.c[paramInt] = true;
      }
      File localFile = this.b.b(paramInt);
      if (!a.f(a.this).exists()) {
        a.f(a.this).mkdirs();
      }
      return localFile;
    }
    
    public void a()
    {
      a.a(a.this, this, true);
      this.d = true;
    }
    
    public void b()
    {
      a.a(a.this, this, false);
    }
    
    public void c()
    {
      if (!this.d) {}
      try
      {
        b();
        return;
      }
      catch (IOException localIOException) {}
    }
  }
  
  private final class c
  {
    File[] a;
    File[] b;
    private final String d;
    private final long[] e;
    private boolean f;
    private a.b g;
    private long h;
    
    private c(String paramString)
    {
      this.d = paramString;
      this.e = new long[a.e(a.this)];
      this.a = new File[a.e(a.this)];
      this.b = new File[a.e(a.this)];
      StringBuilder localStringBuilder = new StringBuilder(paramString).append('.');
      int i = localStringBuilder.length();
      for (int j = 0; j < a.e(a.this); j++)
      {
        localStringBuilder.append(j);
        this.a[j] = new File(a.f(a.this), localStringBuilder.toString());
        localStringBuilder.append(".tmp");
        this.b[j] = new File(a.f(a.this), localStringBuilder.toString());
        localStringBuilder.setLength(i);
      }
    }
    
    private void a(String[] paramArrayOfString)
    {
      if (paramArrayOfString.length != a.e(a.this)) {
        throw b(paramArrayOfString);
      }
      int i = 0;
      try
      {
        while (i < paramArrayOfString.length)
        {
          this.e[i] = Long.parseLong(paramArrayOfString[i]);
          i++;
        }
        return;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        throw b(paramArrayOfString);
      }
    }
    
    private IOException b(String[] paramArrayOfString)
    {
      throw new IOException("unexpected journal line: " + Arrays.toString(paramArrayOfString));
    }
    
    public File a(int paramInt)
    {
      return this.a[paramInt];
    }
    
    public String a()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      for (long l : this.e) {
        localStringBuilder.append(' ').append(l);
      }
      return localStringBuilder.toString();
    }
    
    public File b(int paramInt)
    {
      return this.b[paramInt];
    }
  }
  
  public final class d
  {
    private final String b;
    private final long c;
    private final long[] d;
    private final File[] e;
    
    private d(String paramString, long paramLong, File[] paramArrayOfFile, long[] paramArrayOfLong)
    {
      this.b = paramString;
      this.c = paramLong;
      this.e = paramArrayOfFile;
      this.d = paramArrayOfLong;
    }
    
    public File a(int paramInt)
    {
      return this.e[paramInt];
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.a.a
 * JD-Core Version:    0.7.0.1
 */