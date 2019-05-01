package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class eb
{
  public static boolean a = Log.isLoggable("Volley", 2);
  private static String b = "Volley";
  
  public static void a(String paramString, Object... paramVarArgs)
  {
    if (a) {
      Log.v(b, d(paramString, paramVarArgs));
    }
  }
  
  public static void a(Throwable paramThrowable, String paramString, Object... paramVarArgs)
  {
    Log.e(b, d(paramString, paramVarArgs), paramThrowable);
  }
  
  public static void b(String paramString, Object... paramVarArgs)
  {
    Log.d(b, d(paramString, paramVarArgs));
  }
  
  public static void c(String paramString, Object... paramVarArgs)
  {
    Log.e(b, d(paramString, paramVarArgs));
  }
  
  private static String d(String paramString, Object... paramVarArgs)
  {
    int i;
    label20:
    String str4;
    String str5;
    if (paramVarArgs == null)
    {
      StackTraceElement[] arrayOfStackTraceElement = new Throwable().fillInStackTrace().getStackTrace();
      i = 2;
      if (i >= arrayOfStackTraceElement.length) {
        break label197;
      }
      if (arrayOfStackTraceElement[i].getClass().equals(eb.class)) {
        break label191;
      }
      String str2 = arrayOfStackTraceElement[i].getClassName();
      String str3 = str2.substring(1 + str2.lastIndexOf('.'));
      str4 = str3.substring(1 + str3.lastIndexOf('$'));
      str5 = arrayOfStackTraceElement[i].getMethodName();
    }
    label191:
    label197:
    for (String str1 = 1 + String.valueOf(str4).length() + String.valueOf(str5).length() + str4 + "." + str5;; str1 = "<unknown>")
    {
      Locale localLocale = Locale.US;
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = Long.valueOf(Thread.currentThread().getId());
      arrayOfObject[1] = str1;
      arrayOfObject[2] = paramString;
      return String.format(localLocale, "[%d] %s: %s", arrayOfObject);
      paramString = String.format(Locale.US, paramString, paramVarArgs);
      break;
      i++;
      break label20;
    }
  }
  
  static final class a
  {
    public static final boolean a = eb.a;
    private final List<fb> b = new ArrayList();
    private boolean c = false;
    
    /* Error */
    public final void a(String paramString)
    {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: iconst_1
      //   4: putfield 27	com/google/android/gms/internal/ads/eb$a:c	Z
      //   7: aload_0
      //   8: getfield 25	com/google/android/gms/internal/ads/eb$a:b	Ljava/util/List;
      //   11: invokeinterface 34 1 0
      //   16: istore_3
      //   17: iload_3
      //   18: ifne +16 -> 34
      //   21: lconst_0
      //   22: lstore 6
      //   24: lload 6
      //   26: lconst_0
      //   27: lcmp
      //   28: ifgt +58 -> 86
      //   31: aload_0
      //   32: monitorexit
      //   33: return
      //   34: aload_0
      //   35: getfield 25	com/google/android/gms/internal/ads/eb$a:b	Ljava/util/List;
      //   38: iconst_0
      //   39: invokeinterface 38 2 0
      //   44: checkcast 40	com/google/android/gms/internal/ads/fb
      //   47: getfield 43	com/google/android/gms/internal/ads/fb:c	J
      //   50: lstore 4
      //   52: aload_0
      //   53: getfield 25	com/google/android/gms/internal/ads/eb$a:b	Ljava/util/List;
      //   56: iconst_m1
      //   57: aload_0
      //   58: getfield 25	com/google/android/gms/internal/ads/eb$a:b	Ljava/util/List;
      //   61: invokeinterface 34 1 0
      //   66: iadd
      //   67: invokeinterface 38 2 0
      //   72: checkcast 40	com/google/android/gms/internal/ads/fb
      //   75: getfield 43	com/google/android/gms/internal/ads/fb:c	J
      //   78: lload 4
      //   80: lsub
      //   81: lstore 6
      //   83: goto -59 -> 24
      //   86: aload_0
      //   87: getfield 25	com/google/android/gms/internal/ads/eb$a:b	Ljava/util/List;
      //   90: iconst_0
      //   91: invokeinterface 38 2 0
      //   96: checkcast 40	com/google/android/gms/internal/ads/fb
      //   99: getfield 43	com/google/android/gms/internal/ads/fb:c	J
      //   102: lstore 8
      //   104: iconst_2
      //   105: anewarray 4	java/lang/Object
      //   108: astore 10
      //   110: aload 10
      //   112: iconst_0
      //   113: lload 6
      //   115: invokestatic 49	java/lang/Long:valueOf	(J)Ljava/lang/Long;
      //   118: aastore
      //   119: aload 10
      //   121: iconst_1
      //   122: aload_1
      //   123: aastore
      //   124: ldc 51
      //   126: aload 10
      //   128: invokestatic 54	com/google/android/gms/internal/ads/eb:b	(Ljava/lang/String;[Ljava/lang/Object;)V
      //   131: aload_0
      //   132: getfield 25	com/google/android/gms/internal/ads/eb$a:b	Ljava/util/List;
      //   135: invokeinterface 58 1 0
      //   140: astore 11
      //   142: lload 8
      //   144: lstore 12
      //   146: aload 11
      //   148: invokeinterface 64 1 0
      //   153: ifeq -122 -> 31
      //   156: aload 11
      //   158: invokeinterface 68 1 0
      //   163: checkcast 40	com/google/android/gms/internal/ads/fb
      //   166: astore 14
      //   168: aload 14
      //   170: getfield 43	com/google/android/gms/internal/ads/fb:c	J
      //   173: lstore 15
      //   175: iconst_3
      //   176: anewarray 4	java/lang/Object
      //   179: astore 17
      //   181: aload 17
      //   183: iconst_0
      //   184: lload 15
      //   186: lload 12
      //   188: lsub
      //   189: invokestatic 49	java/lang/Long:valueOf	(J)Ljava/lang/Long;
      //   192: aastore
      //   193: aload 17
      //   195: iconst_1
      //   196: aload 14
      //   198: getfield 70	com/google/android/gms/internal/ads/fb:b	J
      //   201: invokestatic 49	java/lang/Long:valueOf	(J)Ljava/lang/Long;
      //   204: aastore
      //   205: aload 17
      //   207: iconst_2
      //   208: aload 14
      //   210: getfield 73	com/google/android/gms/internal/ads/fb:a	Ljava/lang/String;
      //   213: aastore
      //   214: ldc 75
      //   216: aload 17
      //   218: invokestatic 54	com/google/android/gms/internal/ads/eb:b	(Ljava/lang/String;[Ljava/lang/Object;)V
      //   221: lload 15
      //   223: lstore 12
      //   225: goto -79 -> 146
      //   228: astore_2
      //   229: aload_0
      //   230: monitorexit
      //   231: aload_2
      //   232: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	233	0	this	a
      //   0	233	1	paramString	String
      //   228	4	2	localObject	Object
      //   16	2	3	i	int
      //   50	29	4	l1	long
      //   22	92	6	l2	long
      //   102	41	8	l3	long
      //   108	19	10	arrayOfObject1	Object[]
      //   140	17	11	localIterator	java.util.Iterator
      //   144	80	12	l4	long
      //   166	43	14	localfb	fb
      //   173	49	15	l5	long
      //   179	38	17	arrayOfObject2	Object[]
      // Exception table:
      //   from	to	target	type
      //   2	17	228	finally
      //   34	83	228	finally
      //   86	142	228	finally
      //   146	221	228	finally
    }
    
    public final void a(String paramString, long paramLong)
    {
      try
      {
        if (this.c) {
          throw new IllegalStateException("Marker added to finished log");
        }
      }
      finally {}
      this.b.add(new fb(paramString, paramLong, SystemClock.elapsedRealtime()));
    }
    
    protected final void finalize()
    {
      if (!this.c)
      {
        a("Request on the loose");
        eb.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.eb
 * JD-Core Version:    0.7.0.1
 */