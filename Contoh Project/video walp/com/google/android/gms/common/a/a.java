package com.google.android.gms.common.a;

import android.content.Context;

public class a
{
  private static Context a;
  private static Boolean b;
  
  /* Error */
  public static boolean a(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: aload_0
    //   4: invokevirtual 17	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   7: astore_2
    //   8: getstatic 19	com/google/android/gms/common/a/a:a	Landroid/content/Context;
    //   11: ifnull +34 -> 45
    //   14: getstatic 21	com/google/android/gms/common/a/a:b	Ljava/lang/Boolean;
    //   17: ifnull +28 -> 45
    //   20: getstatic 19	com/google/android/gms/common/a/a:a	Landroid/content/Context;
    //   23: aload_2
    //   24: if_acmpne +21 -> 45
    //   27: getstatic 21	com/google/android/gms/common/a/a:b	Ljava/lang/Boolean;
    //   30: invokevirtual 27	java/lang/Boolean:booleanValue	()Z
    //   33: istore 7
    //   35: iload 7
    //   37: istore 5
    //   39: ldc 2
    //   41: monitorexit
    //   42: iload 5
    //   44: ireturn
    //   45: aconst_null
    //   46: putstatic 21	com/google/android/gms/common/a/a:b	Ljava/lang/Boolean;
    //   49: invokestatic 32	com/google/android/gms/common/util/k:l	()Z
    //   52: ifeq +35 -> 87
    //   55: aload_2
    //   56: invokevirtual 36	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   59: invokevirtual 41	android/content/pm/PackageManager:isInstantApp	()Z
    //   62: invokestatic 45	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   65: putstatic 21	com/google/android/gms/common/a/a:b	Ljava/lang/Boolean;
    //   68: aload_2
    //   69: putstatic 19	com/google/android/gms/common/a/a:a	Landroid/content/Context;
    //   72: getstatic 21	com/google/android/gms/common/a/a:b	Ljava/lang/Boolean;
    //   75: invokevirtual 27	java/lang/Boolean:booleanValue	()Z
    //   78: istore 4
    //   80: iload 4
    //   82: istore 5
    //   84: goto -45 -> 39
    //   87: aload_0
    //   88: invokevirtual 49	android/content/Context:getClassLoader	()Ljava/lang/ClassLoader;
    //   91: ldc 51
    //   93: invokevirtual 57	java/lang/ClassLoader:loadClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   96: pop
    //   97: iconst_1
    //   98: invokestatic 45	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   101: putstatic 21	com/google/android/gms/common/a/a:b	Ljava/lang/Boolean;
    //   104: goto -36 -> 68
    //   107: astore_3
    //   108: iconst_0
    //   109: invokestatic 45	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   112: putstatic 21	com/google/android/gms/common/a/a:b	Ljava/lang/Boolean;
    //   115: goto -47 -> 68
    //   118: astore_1
    //   119: ldc 2
    //   121: monitorexit
    //   122: aload_1
    //   123: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	124	0	paramContext	Context
    //   118	5	1	localObject	Object
    //   7	62	2	localContext	Context
    //   107	1	3	localClassNotFoundException	java.lang.ClassNotFoundException
    //   78	3	4	bool1	boolean
    //   37	46	5	bool2	boolean
    //   33	3	7	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   87	104	107	java/lang/ClassNotFoundException
    //   3	35	118	finally
    //   45	68	118	finally
    //   68	80	118	finally
    //   87	104	118	finally
    //   108	115	118	finally
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.a.a
 * JD-Core Version:    0.7.0.1
 */