package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

@cm
public final class amj
{
  private final amo a;
  @GuardedBy("this")
  private final ana b;
  private final boolean c;
  
  private amj()
  {
    this.c = false;
    this.a = new amo();
    this.b = new ana();
    b();
  }
  
  public amj(amo paramamo)
  {
    this.a = paramamo;
    arq localarq = asa.db;
    this.c = ((Boolean)aos.f().a(localarq)).booleanValue();
    this.b = new ana();
    b();
  }
  
  public static amj a()
  {
    return new amj();
  }
  
  private final void b()
  {
    try
    {
      this.b.d = new amt();
      this.b.d.b = new amw();
      this.b.c = new amy();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /* Error */
  private final void b(aml.a.b paramb)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 30	com/google/android/gms/internal/ads/amj:b	Lcom/google/android/gms/internal/ads/ana;
    //   6: invokestatic 81	com/google/android/gms/internal/ads/amj:c	()[J
    //   9: putfield 84	com/google/android/gms/internal/ads/ana:b	[J
    //   12: aload_0
    //   13: getfield 25	com/google/android/gms/internal/ads/amj:a	Lcom/google/android/gms/internal/ads/amo;
    //   16: aload_0
    //   17: getfield 30	com/google/android/gms/internal/ads/amj:b	Lcom/google/android/gms/internal/ads/ana;
    //   20: invokestatic 89	com/google/android/gms/internal/ads/afc:a	(Lcom/google/android/gms/internal/ads/afc;)[B
    //   23: invokevirtual 92	com/google/android/gms/internal/ads/amo:a	([B)Lcom/google/android/gms/internal/ads/amq;
    //   26: aload_1
    //   27: invokevirtual 97	com/google/android/gms/internal/ads/aml$a$b:a	()I
    //   30: invokevirtual 102	com/google/android/gms/internal/ads/amq:b	(I)Lcom/google/android/gms/internal/ads/amq;
    //   33: invokevirtual 104	com/google/android/gms/internal/ads/amq:a	()V
    //   36: aload_1
    //   37: invokevirtual 97	com/google/android/gms/internal/ads/aml$a$b:a	()I
    //   40: bipush 10
    //   42: invokestatic 110	java/lang/Integer:toString	(II)Ljava/lang/String;
    //   45: invokestatic 116	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   48: astore_3
    //   49: aload_3
    //   50: invokevirtual 119	java/lang/String:length	()I
    //   53: ifeq +19 -> 72
    //   56: ldc 121
    //   58: aload_3
    //   59: invokevirtual 125	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   62: astore 4
    //   64: aload 4
    //   66: invokestatic 130	com/google/android/gms/internal/ads/je:a	(Ljava/lang/String;)V
    //   69: aload_0
    //   70: monitorexit
    //   71: return
    //   72: new 112	java/lang/String
    //   75: dup
    //   76: ldc 121
    //   78: invokespecial 132	java/lang/String:<init>	(Ljava/lang/String;)V
    //   81: astore 4
    //   83: goto -19 -> 64
    //   86: astore_2
    //   87: aload_0
    //   88: monitorexit
    //   89: aload_2
    //   90: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	91	0	this	amj
    //   0	91	1	paramb	aml.a.b
    //   86	4	2	localObject	Object
    //   48	11	3	str1	String
    //   62	20	4	str2	String
    // Exception table:
    //   from	to	target	type
    //   2	64	86	finally
    //   64	69	86	finally
    //   72	83	86	finally
  }
  
  /* Error */
  private final void c(aml.a.b paramb)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic 142	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   5: astore_3
    //   6: aload_3
    //   7: ifnonnull +6 -> 13
    //   10: aload_0
    //   11: monitorexit
    //   12: return
    //   13: new 144	java/io/File
    //   16: dup
    //   17: aload_3
    //   18: ldc 146
    //   20: invokespecial 149	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   23: astore 4
    //   25: new 151	java/io/FileOutputStream
    //   28: dup
    //   29: aload 4
    //   31: iconst_1
    //   32: invokespecial 154	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   35: astore 5
    //   37: aload 5
    //   39: aload_0
    //   40: aload_1
    //   41: invokespecial 157	com/google/android/gms/internal/ads/amj:d	(Lcom/google/android/gms/internal/ads/aml$a$b;)Ljava/lang/String;
    //   44: invokevirtual 161	java/lang/String:getBytes	()[B
    //   47: invokevirtual 165	java/io/FileOutputStream:write	([B)V
    //   50: aload 5
    //   52: bipush 10
    //   54: invokevirtual 168	java/io/FileOutputStream:write	(I)V
    //   57: aload 5
    //   59: invokevirtual 171	java/io/FileOutputStream:close	()V
    //   62: goto -52 -> 10
    //   65: astore 11
    //   67: ldc 173
    //   69: invokestatic 130	com/google/android/gms/internal/ads/je:a	(Ljava/lang/String;)V
    //   72: goto -62 -> 10
    //   75: astore 8
    //   77: ldc 175
    //   79: invokestatic 130	com/google/android/gms/internal/ads/je:a	(Ljava/lang/String;)V
    //   82: goto -72 -> 10
    //   85: astore_2
    //   86: aload_0
    //   87: monitorexit
    //   88: aload_2
    //   89: athrow
    //   90: astore 9
    //   92: ldc 177
    //   94: invokestatic 130	com/google/android/gms/internal/ads/je:a	(Ljava/lang/String;)V
    //   97: aload 5
    //   99: invokevirtual 171	java/io/FileOutputStream:close	()V
    //   102: goto -92 -> 10
    //   105: astore 10
    //   107: ldc 173
    //   109: invokestatic 130	com/google/android/gms/internal/ads/je:a	(Ljava/lang/String;)V
    //   112: goto -102 -> 10
    //   115: astore 6
    //   117: aload 5
    //   119: invokevirtual 171	java/io/FileOutputStream:close	()V
    //   122: aload 6
    //   124: athrow
    //   125: astore 7
    //   127: ldc 173
    //   129: invokestatic 130	com/google/android/gms/internal/ads/je:a	(Ljava/lang/String;)V
    //   132: goto -10 -> 122
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	135	0	this	amj
    //   0	135	1	paramb	aml.a.b
    //   85	4	2	localObject1	Object
    //   5	13	3	localFile1	java.io.File
    //   23	7	4	localFile2	java.io.File
    //   35	83	5	localFileOutputStream	java.io.FileOutputStream
    //   115	8	6	localObject2	Object
    //   125	1	7	localIOException1	java.io.IOException
    //   75	1	8	localFileNotFoundException	java.io.FileNotFoundException
    //   90	1	9	localIOException2	java.io.IOException
    //   105	1	10	localIOException3	java.io.IOException
    //   65	1	11	localIOException4	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   57	62	65	java/io/IOException
    //   25	37	75	java/io/FileNotFoundException
    //   57	62	75	java/io/FileNotFoundException
    //   67	72	75	java/io/FileNotFoundException
    //   97	102	75	java/io/FileNotFoundException
    //   107	112	75	java/io/FileNotFoundException
    //   117	122	75	java/io/FileNotFoundException
    //   122	125	75	java/io/FileNotFoundException
    //   127	132	75	java/io/FileNotFoundException
    //   2	6	85	finally
    //   13	25	85	finally
    //   25	37	85	finally
    //   57	62	85	finally
    //   67	72	85	finally
    //   77	82	85	finally
    //   97	102	85	finally
    //   107	112	85	finally
    //   117	122	85	finally
    //   122	125	85	finally
    //   127	132	85	finally
    //   37	57	90	java/io/IOException
    //   97	102	105	java/io/IOException
    //   37	57	115	finally
    //   92	97	115	finally
    //   117	122	125	java/io/IOException
  }
  
  private static long[] c()
  {
    int i = 0;
    List localList = asa.b();
    ArrayList localArrayList1 = new ArrayList();
    Iterator localIterator = localList.iterator();
    if (localIterator.hasNext())
    {
      String[] arrayOfString = ((String)localIterator.next()).split(",");
      int m = arrayOfString.length;
      int n = 0;
      while (n < m)
      {
        String str = arrayOfString[n];
        try
        {
          localArrayList1.add(Long.valueOf(str));
          n++;
        }
        catch (NumberFormatException localNumberFormatException)
        {
          for (;;)
          {
            je.a("Experiment ID is not a number");
          }
        }
      }
    }
    long[] arrayOfLong = new long[localArrayList1.size()];
    ArrayList localArrayList2 = (ArrayList)localArrayList1;
    int j = localArrayList2.size();
    for (int k = 0; i < j; k++)
    {
      Object localObject = localArrayList2.get(i);
      i++;
      arrayOfLong[k] = ((Long)localObject).longValue();
    }
    return arrayOfLong;
  }
  
  private final String d(aml.a.b paramb)
  {
    try
    {
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = this.b.a;
      arrayOfObject[1] = Long.valueOf(zzbv.zzer().b());
      arrayOfObject[2] = Integer.valueOf(paramb.a());
      String str = String.format("id=%s,timestamp=%s,event=%s", arrayOfObject);
      return str;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /* Error */
  public final void a(amk paramamk)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 20	com/google/android/gms/internal/ads/amj:c	Z
    //   6: istore_3
    //   7: iload_3
    //   8: ifeq +13 -> 21
    //   11: aload_1
    //   12: aload_0
    //   13: getfield 30	com/google/android/gms/internal/ads/amj:b	Lcom/google/android/gms/internal/ads/ana;
    //   16: invokeinterface 262 2 0
    //   21: aload_0
    //   22: monitorexit
    //   23: return
    //   24: astore 4
    //   26: invokestatic 266	com/google/android/gms/ads/internal/zzbv:zzeo	()Lcom/google/android/gms/internal/ads/io;
    //   29: aload 4
    //   31: ldc_w 268
    //   34: invokevirtual 273	com/google/android/gms/internal/ads/io:a	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   37: goto -16 -> 21
    //   40: astore_2
    //   41: aload_0
    //   42: monitorexit
    //   43: aload_2
    //   44: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	45	0	this	amj
    //   0	45	1	paramamk	amk
    //   40	4	2	localObject	Object
    //   6	2	3	bool	boolean
    //   24	6	4	localNullPointerException	java.lang.NullPointerException
    // Exception table:
    //   from	to	target	type
    //   11	21	24	java/lang/NullPointerException
    //   2	7	40	finally
    //   11	21	40	finally
    //   26	37	40	finally
  }
  
  public final void a(aml.a.b paramb)
  {
    for (;;)
    {
      try
      {
        boolean bool = this.c;
        if (!bool) {
          return;
        }
        arq localarq = asa.dc;
        if (((Boolean)aos.f().a(localarq)).booleanValue()) {
          c(paramb);
        } else {
          b(paramb);
        }
      }
      finally {}
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.amj
 * JD-Core Version:    0.7.0.1
 */