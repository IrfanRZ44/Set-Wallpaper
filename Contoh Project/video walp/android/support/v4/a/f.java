package android.support.v4.a;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.support.v4.content.a.a.b;
import android.support.v4.content.a.a.c;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

public class f
  extends d
{
  private static final Class a;
  private static final Constructor b;
  private static final Method c;
  private static final Method d;
  private static final Method e;
  private static final Method f;
  private static final Method g;
  
  static
  {
    try
    {
      Class localClass2 = Class.forName("android.graphics.FontFamily");
      Constructor localConstructor2 = localClass2.getConstructor(new Class[0]);
      Class[] arrayOfClass1 = new Class[8];
      arrayOfClass1[0] = AssetManager.class;
      arrayOfClass1[1] = String.class;
      arrayOfClass1[2] = Integer.TYPE;
      arrayOfClass1[3] = Boolean.TYPE;
      arrayOfClass1[4] = Integer.TYPE;
      arrayOfClass1[5] = Integer.TYPE;
      arrayOfClass1[6] = Integer.TYPE;
      arrayOfClass1[7] = [Landroid.graphics.fonts.FontVariationAxis.class;
      Method localMethod6 = localClass2.getMethod("addFontFromAssetManager", arrayOfClass1);
      Class[] arrayOfClass2 = new Class[5];
      arrayOfClass2[0] = ByteBuffer.class;
      arrayOfClass2[1] = Integer.TYPE;
      arrayOfClass2[2] = [Landroid.graphics.fonts.FontVariationAxis.class;
      arrayOfClass2[3] = Integer.TYPE;
      arrayOfClass2[4] = Integer.TYPE;
      Method localMethod7 = localClass2.getMethod("addFontFromBuffer", arrayOfClass2);
      Method localMethod8 = localClass2.getMethod("freeze", new Class[0]);
      Method localMethod9 = localClass2.getMethod("abortCreation", new Class[0]);
      Object localObject = Array.newInstance(localClass2, 1);
      Class[] arrayOfClass3 = new Class[3];
      arrayOfClass3[0] = localObject.getClass();
      arrayOfClass3[1] = Integer.TYPE;
      arrayOfClass3[2] = Integer.TYPE;
      localMethod1 = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", arrayOfClass3);
      localMethod1.setAccessible(true);
      localMethod2 = localMethod9;
      localMethod3 = localMethod8;
      localMethod4 = localMethod7;
      localMethod5 = localMethod6;
      localConstructor1 = localConstructor2;
      localClass1 = localClass2;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      for (;;)
      {
        Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + localClassNotFoundException.getClass().getName(), localClassNotFoundException);
        Method localMethod1 = null;
        Method localMethod2 = null;
        Method localMethod3 = null;
        Method localMethod4 = null;
        Method localMethod5 = null;
        Constructor localConstructor1 = null;
        Class localClass1 = null;
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      label277:
      break label277;
    }
    b = localConstructor1;
    a = localClass1;
    c = localMethod5;
    d = localMethod4;
    e = localMethod3;
    f = localMethod2;
    g = localMethod1;
  }
  
  private static Typeface a(Object paramObject)
  {
    try
    {
      Object localObject = Array.newInstance(a, 1);
      Array.set(localObject, 0, paramObject);
      Method localMethod = g;
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = localObject;
      arrayOfObject[1] = Integer.valueOf(-1);
      arrayOfObject[2] = Integer.valueOf(-1);
      Typeface localTypeface = (Typeface)localMethod.invoke(null, arrayOfObject);
      return localTypeface;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new RuntimeException(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      label61:
      break label61;
    }
  }
  
  private static boolean a()
  {
    if (c == null) {
      Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
    }
    return c != null;
  }
  
  private static boolean a(Context paramContext, Object paramObject, String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    try
    {
      Method localMethod = c;
      Object[] arrayOfObject = new Object[8];
      arrayOfObject[0] = paramContext.getAssets();
      arrayOfObject[1] = paramString;
      arrayOfObject[2] = Integer.valueOf(0);
      arrayOfObject[3] = Boolean.valueOf(false);
      arrayOfObject[4] = Integer.valueOf(paramInt1);
      arrayOfObject[5] = Integer.valueOf(paramInt2);
      arrayOfObject[6] = Integer.valueOf(paramInt3);
      arrayOfObject[7] = null;
      boolean bool = ((Boolean)localMethod.invoke(paramObject, arrayOfObject)).booleanValue();
      return bool;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new RuntimeException(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      label95:
      break label95;
    }
  }
  
  private static boolean a(Object paramObject, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, int paramInt3)
  {
    try
    {
      Method localMethod = d;
      Object[] arrayOfObject = new Object[5];
      arrayOfObject[0] = paramByteBuffer;
      arrayOfObject[1] = Integer.valueOf(paramInt1);
      arrayOfObject[2] = null;
      arrayOfObject[3] = Integer.valueOf(paramInt2);
      arrayOfObject[4] = Integer.valueOf(paramInt3);
      boolean bool = ((Boolean)localMethod.invoke(paramObject, arrayOfObject)).booleanValue();
      return bool;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new RuntimeException(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      label67:
      break label67;
    }
  }
  
  private static Object b()
  {
    try
    {
      Object localObject = b.newInstance(new Object[0]);
      return localObject;
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new RuntimeException(localInstantiationException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      break label14;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      label14:
      break label14;
    }
  }
  
  private static boolean b(Object paramObject)
  {
    try
    {
      boolean bool = ((Boolean)e.invoke(paramObject, new Object[0])).booleanValue();
      return bool;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new RuntimeException(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      label21:
      break label21;
    }
  }
  
  private static void c(Object paramObject)
  {
    try
    {
      f.invoke(paramObject, new Object[0]);
      return;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new RuntimeException(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      label14:
      break label14;
    }
  }
  
  public Typeface a(Context paramContext, Resources paramResources, int paramInt1, String paramString, int paramInt2)
  {
    if (!a()) {
      return super.a(paramContext, paramResources, paramInt1, paramString, paramInt2);
    }
    Object localObject = b();
    if (!a(paramContext, localObject, paramString, 0, -1, -1))
    {
      c(localObject);
      return null;
    }
    if (!b(localObject)) {
      return null;
    }
    return a(localObject);
  }
  
  /* Error */
  public Typeface a(Context paramContext, android.os.CancellationSignal paramCancellationSignal, android.support.v4.d.b.b[] paramArrayOfb, int paramInt)
  {
    // Byte code:
    //   0: aload_3
    //   1: arraylength
    //   2: iconst_1
    //   3: if_icmpge +9 -> 12
    //   6: aconst_null
    //   7: astore 20
    //   9: aload 20
    //   11: areturn
    //   12: invokestatic 181	android/support/v4/a/f:a	()Z
    //   15: ifne +200 -> 215
    //   18: aload_0
    //   19: aload_3
    //   20: iload 4
    //   22: invokevirtual 201	android/support/v4/a/f:a	([Landroid/support/v4/d/b$b;I)Landroid/support/v4/d/b$b;
    //   25: astore 16
    //   27: aload_1
    //   28: invokevirtual 205	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   31: astore 17
    //   33: aload 17
    //   35: aload 16
    //   37: invokevirtual 210	android/support/v4/d/b$b:a	()Landroid/net/Uri;
    //   40: ldc 212
    //   42: aload_2
    //   43: invokevirtual 218	android/content/ContentResolver:openFileDescriptor	(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
    //   46: astore 19
    //   48: aload 19
    //   50: ifnonnull +39 -> 89
    //   53: aconst_null
    //   54: astore 20
    //   56: aload 19
    //   58: ifnull -49 -> 9
    //   61: iconst_0
    //   62: ifeq +20 -> 82
    //   65: aload 19
    //   67: invokevirtual 223	android/os/ParcelFileDescriptor:close	()V
    //   70: aconst_null
    //   71: areturn
    //   72: astore 21
    //   74: aconst_null
    //   75: aload 21
    //   77: invokevirtual 226	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   80: aconst_null
    //   81: areturn
    //   82: aload 19
    //   84: invokevirtual 223	android/os/ParcelFileDescriptor:close	()V
    //   87: aconst_null
    //   88: areturn
    //   89: new 228	android/graphics/Typeface$Builder
    //   92: dup
    //   93: aload 19
    //   95: invokevirtual 232	android/os/ParcelFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   98: invokespecial 235	android/graphics/Typeface$Builder:<init>	(Ljava/io/FileDescriptor;)V
    //   101: aload 16
    //   103: invokevirtual 238	android/support/v4/d/b$b:c	()I
    //   106: invokevirtual 242	android/graphics/Typeface$Builder:setWeight	(I)Landroid/graphics/Typeface$Builder;
    //   109: aload 16
    //   111: invokevirtual 244	android/support/v4/d/b$b:d	()Z
    //   114: invokevirtual 248	android/graphics/Typeface$Builder:setItalic	(Z)Landroid/graphics/Typeface$Builder;
    //   117: invokevirtual 252	android/graphics/Typeface$Builder:build	()Landroid/graphics/Typeface;
    //   120: astore 27
    //   122: aload 27
    //   124: astore 20
    //   126: aload 19
    //   128: ifnull -119 -> 9
    //   131: iconst_0
    //   132: ifeq +22 -> 154
    //   135: aload 19
    //   137: invokevirtual 223	android/os/ParcelFileDescriptor:close	()V
    //   140: aload 20
    //   142: areturn
    //   143: astore 28
    //   145: aconst_null
    //   146: aload 28
    //   148: invokevirtual 226	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   151: aload 20
    //   153: areturn
    //   154: aload 19
    //   156: invokevirtual 223	android/os/ParcelFileDescriptor:close	()V
    //   159: aload 20
    //   161: areturn
    //   162: astore 25
    //   164: aload 25
    //   166: athrow
    //   167: astore 26
    //   169: aload 25
    //   171: astore 23
    //   173: aload 26
    //   175: astore 22
    //   177: aload 19
    //   179: ifnull +13 -> 192
    //   182: aload 23
    //   184: ifnull +23 -> 207
    //   187: aload 19
    //   189: invokevirtual 223	android/os/ParcelFileDescriptor:close	()V
    //   192: aload 22
    //   194: athrow
    //   195: astore 24
    //   197: aload 23
    //   199: aload 24
    //   201: invokevirtual 226	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   204: goto -12 -> 192
    //   207: aload 19
    //   209: invokevirtual 223	android/os/ParcelFileDescriptor:close	()V
    //   212: goto -20 -> 192
    //   215: aload_1
    //   216: aload_3
    //   217: aload_2
    //   218: invokestatic 257	android/support/v4/d/b:a	(Landroid/content/Context;[Landroid/support/v4/d/b$b;Landroid/os/CancellationSignal;)Ljava/util/Map;
    //   221: astore 5
    //   223: invokestatic 185	android/support/v4/a/f:b	()Ljava/lang/Object;
    //   226: astore 6
    //   228: iconst_0
    //   229: istore 7
    //   231: aload_3
    //   232: arraylength
    //   233: istore 8
    //   235: iconst_0
    //   236: istore 9
    //   238: iload 9
    //   240: iload 8
    //   242: if_icmpge +105 -> 347
    //   245: aload_3
    //   246: iload 9
    //   248: aaload
    //   249: astore 10
    //   251: aload 5
    //   253: aload 10
    //   255: invokevirtual 210	android/support/v4/d/b$b:a	()Landroid/net/Uri;
    //   258: invokeinterface 263 2 0
    //   263: checkcast 54	java/nio/ByteBuffer
    //   266: astore 11
    //   268: aload 11
    //   270: ifnonnull +17 -> 287
    //   273: iload 7
    //   275: istore 15
    //   277: iinc 9 1
    //   280: iload 15
    //   282: istore 7
    //   284: goto -46 -> 238
    //   287: aload 10
    //   289: invokevirtual 265	android/support/v4/d/b$b:b	()I
    //   292: istore 12
    //   294: aload 10
    //   296: invokevirtual 238	android/support/v4/d/b$b:c	()I
    //   299: istore 13
    //   301: aload 10
    //   303: invokevirtual 244	android/support/v4/d/b$b:d	()Z
    //   306: ifeq +29 -> 335
    //   309: iconst_1
    //   310: istore 14
    //   312: aload 6
    //   314: aload 11
    //   316: iload 12
    //   318: iload 13
    //   320: iload 14
    //   322: invokestatic 267	android/support/v4/a/f:a	(Ljava/lang/Object;Ljava/nio/ByteBuffer;III)Z
    //   325: ifne +16 -> 341
    //   328: aload 6
    //   330: invokestatic 189	android/support/v4/a/f:c	(Ljava/lang/Object;)V
    //   333: aconst_null
    //   334: areturn
    //   335: iconst_0
    //   336: istore 14
    //   338: goto -26 -> 312
    //   341: iconst_1
    //   342: istore 15
    //   344: goto -67 -> 277
    //   347: iload 7
    //   349: ifne +10 -> 359
    //   352: aload 6
    //   354: invokestatic 189	android/support/v4/a/f:c	(Ljava/lang/Object;)V
    //   357: aconst_null
    //   358: areturn
    //   359: aload 6
    //   361: invokestatic 191	android/support/v4/a/f:b	(Ljava/lang/Object;)Z
    //   364: ifne +5 -> 369
    //   367: aconst_null
    //   368: areturn
    //   369: aload 6
    //   371: invokestatic 193	android/support/v4/a/f:a	(Ljava/lang/Object;)Landroid/graphics/Typeface;
    //   374: iload 4
    //   376: invokestatic 271	android/graphics/Typeface:create	(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;
    //   379: areturn
    //   380: astore 22
    //   382: aconst_null
    //   383: astore 23
    //   385: goto -208 -> 177
    //   388: astore 18
    //   390: aconst_null
    //   391: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	392	0	this	f
    //   0	392	1	paramContext	Context
    //   0	392	2	paramCancellationSignal	android.os.CancellationSignal
    //   0	392	3	paramArrayOfb	android.support.v4.d.b.b[]
    //   0	392	4	paramInt	int
    //   221	31	5	localMap	java.util.Map
    //   226	144	6	localObject1	Object
    //   229	119	7	i	int
    //   233	10	8	j	int
    //   236	42	9	k	int
    //   249	53	10	localb1	android.support.v4.d.b.b
    //   266	49	11	localByteBuffer	ByteBuffer
    //   292	25	12	m	int
    //   299	20	13	n	int
    //   310	27	14	i1	int
    //   275	68	15	i2	int
    //   25	85	16	localb2	android.support.v4.d.b.b
    //   31	3	17	localContentResolver	android.content.ContentResolver
    //   388	1	18	localIOException	java.io.IOException
    //   46	162	19	localParcelFileDescriptor	android.os.ParcelFileDescriptor
    //   7	153	20	localObject2	Object
    //   72	4	21	localThrowable1	java.lang.Throwable
    //   175	18	22	localObject3	Object
    //   380	1	22	localObject4	Object
    //   171	213	23	localThrowable2	java.lang.Throwable
    //   195	5	24	localThrowable3	java.lang.Throwable
    //   162	8	25	localThrowable4	java.lang.Throwable
    //   167	7	26	localObject5	Object
    //   120	3	27	localTypeface	Typeface
    //   143	4	28	localThrowable5	java.lang.Throwable
    // Exception table:
    //   from	to	target	type
    //   65	70	72	java/lang/Throwable
    //   135	140	143	java/lang/Throwable
    //   89	122	162	java/lang/Throwable
    //   164	167	167	finally
    //   187	192	195	java/lang/Throwable
    //   89	122	380	finally
    //   33	48	388	java/io/IOException
    //   65	70	388	java/io/IOException
    //   74	80	388	java/io/IOException
    //   82	87	388	java/io/IOException
    //   135	140	388	java/io/IOException
    //   145	151	388	java/io/IOException
    //   154	159	388	java/io/IOException
    //   187	192	388	java/io/IOException
    //   192	195	388	java/io/IOException
    //   197	204	388	java/io/IOException
    //   207	212	388	java/io/IOException
  }
  
  public Typeface a(Context paramContext, a.b paramb, Resources paramResources, int paramInt)
  {
    if (!a()) {
      return super.a(paramContext, paramb, paramResources, paramInt);
    }
    Object localObject = b();
    for (a.c localc : paramb.a())
    {
      String str = localc.a();
      int k = localc.b();
      if (localc.c()) {}
      for (int m = 1; !a(paramContext, localObject, str, 0, k, m); m = 0)
      {
        c(localObject);
        return null;
      }
    }
    if (!b(localObject)) {
      return null;
    }
    return a(localObject);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.a.f
 * JD-Core Version:    0.7.0.1
 */