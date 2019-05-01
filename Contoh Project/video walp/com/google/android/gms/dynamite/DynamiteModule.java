package com.google.android.gms.dynamite;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;

public final class DynamiteModule
{
  public static final b a = new d();
  public static final b b = new e();
  public static final b c = new f();
  public static final b d = new g();
  public static final b e = new h();
  public static final b f = new i();
  @GuardedBy("DynamiteModule.class")
  private static Boolean g;
  @GuardedBy("DynamiteModule.class")
  private static a h;
  @GuardedBy("DynamiteModule.class")
  private static b i;
  @GuardedBy("DynamiteModule.class")
  private static String j;
  private static final ThreadLocal<c> k = new ThreadLocal();
  private static final DynamiteModule.b.a l = new c();
  private final Context m;
  
  private DynamiteModule(Context paramContext)
  {
    this.m = ((Context)n.a(paramContext));
  }
  
  public static int a(Context paramContext, String paramString)
  {
    String str1;
    try
    {
      Class localClass = paramContext.getApplicationContext().getClassLoader().loadClass(61 + String.valueOf(paramString).length() + "com.google.android.gms.dynamite.descriptors." + paramString + ".ModuleDescriptor");
      Field localField1 = localClass.getDeclaredField("MODULE_ID");
      Field localField2 = localClass.getDeclaredField("MODULE_VERSION");
      if (!localField1.get(null).equals(paramString))
      {
        String str3 = String.valueOf(localField1.get(null));
        Log.e("DynamiteModule", 51 + String.valueOf(str3).length() + String.valueOf(paramString).length() + "Module descriptor id '" + str3 + "' didn't match expected id '" + paramString + "'");
        return 0;
      }
      int n = localField2.getInt(null);
      return n;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      Log.w("DynamiteModule", 45 + String.valueOf(paramString).length() + "Local module descriptor class for " + paramString + " not found.");
      return 0;
    }
    catch (Exception localException)
    {
      str1 = String.valueOf(localException.getMessage());
      if (str1.length() == 0) {}
    }
    for (String str2 = "Failed to load module descriptor class: ".concat(str1);; str2 = new String("Failed to load module descriptor class: "))
    {
      Log.e("DynamiteModule", str2);
      break;
    }
  }
  
  /* Error */
  public static int a(Context paramContext, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 194	com/google/android/gms/dynamite/DynamiteModule:g	Ljava/lang/Boolean;
    //   6: astore 4
    //   8: aload 4
    //   10: ifnonnull +69 -> 79
    //   13: aload_0
    //   14: invokevirtual 93	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   17: invokevirtual 97	android/content/Context:getClassLoader	()Ljava/lang/ClassLoader;
    //   20: ldc 196
    //   22: invokevirtual 199	java/lang/Class:getName	()Ljava/lang/String;
    //   25: invokevirtual 130	java/lang/ClassLoader:loadClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   28: astore 13
    //   30: aload 13
    //   32: ldc 201
    //   34: invokevirtual 138	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   37: astore 14
    //   39: aload 13
    //   41: monitorenter
    //   42: aload 14
    //   44: aconst_null
    //   45: invokevirtual 145	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   48: checkcast 126	java/lang/ClassLoader
    //   51: astore 16
    //   53: aload 16
    //   55: ifnull +59 -> 114
    //   58: aload 16
    //   60: invokestatic 204	java/lang/ClassLoader:getSystemClassLoader	()Ljava/lang/ClassLoader;
    //   63: if_acmpne +38 -> 101
    //   66: getstatic 209	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   69: astore 4
    //   71: aload 13
    //   73: monitorexit
    //   74: aload 4
    //   76: putstatic 194	com/google/android/gms/dynamite/DynamiteModule:g	Ljava/lang/Boolean;
    //   79: ldc 2
    //   81: monitorexit
    //   82: aload 4
    //   84: invokevirtual 213	java/lang/Boolean:booleanValue	()Z
    //   87: ifeq +278 -> 365
    //   90: aload_0
    //   91: aload_1
    //   92: iload_2
    //   93: invokestatic 215	com/google/android/gms/dynamite/DynamiteModule:d	(Landroid/content/Context;Ljava/lang/String;Z)I
    //   96: istore 9
    //   98: iload 9
    //   100: ireturn
    //   101: aload 16
    //   103: invokestatic 218	com/google/android/gms/dynamite/DynamiteModule:a	(Ljava/lang/ClassLoader;)V
    //   106: getstatic 221	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   109: astore 4
    //   111: goto -40 -> 71
    //   114: ldc 223
    //   116: aload_0
    //   117: invokevirtual 93	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   120: invokevirtual 226	android/content/Context:getPackageName	()Ljava/lang/String;
    //   123: invokevirtual 227	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   126: ifeq +20 -> 146
    //   129: aload 14
    //   131: aconst_null
    //   132: invokestatic 204	java/lang/ClassLoader:getSystemClassLoader	()Ljava/lang/ClassLoader;
    //   135: invokevirtual 231	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   138: getstatic 209	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   141: astore 4
    //   143: goto -72 -> 71
    //   146: aload_0
    //   147: aload_1
    //   148: iload_2
    //   149: invokestatic 215	com/google/android/gms/dynamite/DynamiteModule:d	(Landroid/content/Context;Ljava/lang/String;Z)I
    //   152: istore 19
    //   154: getstatic 233	com/google/android/gms/dynamite/DynamiteModule:j	Ljava/lang/String;
    //   157: ifnull +16 -> 173
    //   160: getstatic 233	com/google/android/gms/dynamite/DynamiteModule:j	Ljava/lang/String;
    //   163: invokevirtual 236	java/lang/String:isEmpty	()Z
    //   166: istore 20
    //   168: iload 20
    //   170: ifeq +18 -> 188
    //   173: aload 13
    //   175: monitorexit
    //   176: ldc 2
    //   178: monitorexit
    //   179: iload 19
    //   181: ireturn
    //   182: astore_3
    //   183: ldc 2
    //   185: monitorexit
    //   186: aload_3
    //   187: athrow
    //   188: new 238	com/google/android/gms/dynamite/j
    //   191: dup
    //   192: getstatic 233	com/google/android/gms/dynamite/DynamiteModule:j	Ljava/lang/String;
    //   195: invokestatic 204	java/lang/ClassLoader:getSystemClassLoader	()Ljava/lang/ClassLoader;
    //   198: invokespecial 241	com/google/android/gms/dynamite/j:<init>	(Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   201: astore 21
    //   203: aload 21
    //   205: invokestatic 218	com/google/android/gms/dynamite/DynamiteModule:a	(Ljava/lang/ClassLoader;)V
    //   208: aload 14
    //   210: aconst_null
    //   211: aload 21
    //   213: invokevirtual 231	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   216: getstatic 221	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   219: putstatic 194	com/google/android/gms/dynamite/DynamiteModule:g	Ljava/lang/Boolean;
    //   222: aload 13
    //   224: monitorexit
    //   225: ldc 2
    //   227: monitorexit
    //   228: iload 19
    //   230: ireturn
    //   231: astore 18
    //   233: aload 14
    //   235: aconst_null
    //   236: invokestatic 204	java/lang/ClassLoader:getSystemClassLoader	()Ljava/lang/ClassLoader;
    //   239: invokevirtual 231	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   242: getstatic 209	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   245: astore 4
    //   247: goto -176 -> 71
    //   250: astore 15
    //   252: aload 13
    //   254: monitorexit
    //   255: aload 15
    //   257: athrow
    //   258: astore 10
    //   260: aload 10
    //   262: invokestatic 105	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   265: astore 11
    //   267: ldc 151
    //   269: new 99	java/lang/StringBuilder
    //   272: dup
    //   273: bipush 30
    //   275: aload 11
    //   277: invokestatic 105	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   280: invokevirtual 109	java/lang/String:length	()I
    //   283: iadd
    //   284: invokespecial 112	java/lang/StringBuilder:<init>	(I)V
    //   287: ldc 243
    //   289: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   292: aload 11
    //   294: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   297: invokevirtual 124	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   300: invokestatic 173	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   303: pop
    //   304: getstatic 209	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   307: astore 4
    //   309: goto -235 -> 74
    //   312: astore 5
    //   314: aload 5
    //   316: invokevirtual 244	com/google/android/gms/dynamite/DynamiteModule$a:getMessage	()Ljava/lang/String;
    //   319: invokestatic 105	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   322: astore 6
    //   324: aload 6
    //   326: invokevirtual 109	java/lang/String:length	()I
    //   329: ifeq +22 -> 351
    //   332: ldc 246
    //   334: aload 6
    //   336: invokevirtual 182	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   339: astore 7
    //   341: ldc 151
    //   343: aload 7
    //   345: invokestatic 173	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   348: pop
    //   349: iconst_0
    //   350: ireturn
    //   351: new 101	java/lang/String
    //   354: dup
    //   355: ldc 246
    //   357: invokespecial 185	java/lang/String:<init>	(Ljava/lang/String;)V
    //   360: astore 7
    //   362: goto -21 -> 341
    //   365: aload_0
    //   366: aload_1
    //   367: iload_2
    //   368: invokestatic 248	com/google/android/gms/dynamite/DynamiteModule:c	(Landroid/content/Context;Ljava/lang/String;Z)I
    //   371: ireturn
    //   372: astore 17
    //   374: goto -268 -> 106
    //   377: astore 10
    //   379: goto -119 -> 260
    //   382: astore 10
    //   384: goto -124 -> 260
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	387	0	paramContext	Context
    //   0	387	1	paramString	String
    //   0	387	2	paramBoolean	boolean
    //   182	5	3	localObject1	Object
    //   6	302	4	localBoolean	Boolean
    //   312	3	5	locala1	a
    //   322	13	6	str1	String
    //   339	22	7	str2	String
    //   96	3	9	n	int
    //   258	3	10	localClassNotFoundException	ClassNotFoundException
    //   377	1	10	localNoSuchFieldException	java.lang.NoSuchFieldException
    //   382	1	10	localIllegalAccessException	IllegalAccessException
    //   265	28	11	str3	String
    //   28	225	13	localClass	Class
    //   37	197	14	localField	Field
    //   250	6	15	localObject2	Object
    //   51	51	16	localClassLoader	ClassLoader
    //   372	1	17	locala2	a
    //   231	1	18	locala3	a
    //   152	77	19	i1	int
    //   166	3	20	bool	boolean
    //   201	11	21	localj	j
    // Exception table:
    //   from	to	target	type
    //   3	8	182	finally
    //   13	42	182	finally
    //   74	79	182	finally
    //   79	82	182	finally
    //   176	179	182	finally
    //   183	186	182	finally
    //   225	228	182	finally
    //   255	258	182	finally
    //   260	309	182	finally
    //   146	168	231	com/google/android/gms/dynamite/DynamiteModule$a
    //   188	222	231	com/google/android/gms/dynamite/DynamiteModule$a
    //   42	53	250	finally
    //   58	71	250	finally
    //   71	74	250	finally
    //   101	106	250	finally
    //   106	111	250	finally
    //   114	143	250	finally
    //   146	168	250	finally
    //   173	176	250	finally
    //   188	222	250	finally
    //   222	225	250	finally
    //   233	247	250	finally
    //   252	255	250	finally
    //   13	42	258	java/lang/ClassNotFoundException
    //   255	258	258	java/lang/ClassNotFoundException
    //   90	98	312	com/google/android/gms/dynamite/DynamiteModule$a
    //   101	106	372	com/google/android/gms/dynamite/DynamiteModule$a
    //   13	42	377	java/lang/NoSuchFieldException
    //   255	258	377	java/lang/NoSuchFieldException
    //   13	42	382	java/lang/IllegalAccessException
    //   255	258	382	java/lang/IllegalAccessException
  }
  
  private static Context a(Context paramContext, String paramString, int paramInt, Cursor paramCursor, b paramb)
  {
    String str1;
    try
    {
      Context localContext = (Context)com.google.android.gms.a.b.a(paramb.a(com.google.android.gms.a.b.a(paramContext), paramString, paramInt, com.google.android.gms.a.b.a(paramCursor)));
      return localContext;
    }
    catch (Exception localException)
    {
      str1 = String.valueOf(localException.toString());
      if (str1.length() == 0) {}
    }
    for (String str2 = "Failed to load DynamiteLoader: ".concat(str1);; str2 = new String("Failed to load DynamiteLoader: "))
    {
      Log.e("DynamiteModule", str2);
      return null;
    }
  }
  
  public static Uri a(String paramString, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (String str = "api_force_staging";; str = "api") {
      return Uri.parse(42 + String.valueOf(str).length() + String.valueOf(paramString).length() + "content://com.google.android.gms.chimera/" + str + "/" + paramString);
    }
  }
  
  public static DynamiteModule a(Context paramContext, b paramb, String paramString)
  {
    c localc1 = (c)k.get();
    c localc2 = new c(null);
    k.set(localc2);
    DynamiteModule.b.b localb;
    try
    {
      localb = paramb.a(paramContext, paramString, l);
      int n = localb.a;
      int i1 = localb.b;
      Log.i("DynamiteModule", 68 + String.valueOf(paramString).length() + String.valueOf(paramString).length() + "Considering local module " + paramString + ":" + n + " and remote module " + paramString + ":" + i1);
      if ((localb.c == 0) || ((localb.c == -1) && (localb.a == 0)) || ((localb.c == 1) && (localb.b == 0)))
      {
        int i2 = localb.a;
        int i3 = localb.b;
        throw new a(91 + "No acceptable module found. Local version is " + i2 + " and remote version is " + i3 + ".", null);
      }
    }
    finally
    {
      if (localc2.a != null) {
        localc2.a.close();
      }
      k.set(localc1);
    }
    if (localb.c == -1)
    {
      DynamiteModule localDynamiteModule3 = c(paramContext, paramString);
      if (localc2.a != null) {
        localc2.a.close();
      }
      k.set(localc1);
      return localDynamiteModule3;
    }
    int i4 = localb.c;
    if (i4 == 1) {
      try
      {
        DynamiteModule localDynamiteModule2 = a(paramContext, paramString, localb.b);
        if (localc2.a != null) {
          localc2.a.close();
        }
        k.set(localc1);
        return localDynamiteModule2;
      }
      catch (a locala)
      {
        String str1 = String.valueOf(locala.getMessage());
        if (str1.length() != 0) {}
        for (String str2 = "Failed to load remote module: ".concat(str1);; str2 = new String("Failed to load remote module: "))
        {
          Log.w("DynamiteModule", str2);
          if ((localb.a == 0) || (paramb.a(paramContext, paramString, new d(localb.a, 0)).c != -1)) {
            break;
          }
          DynamiteModule localDynamiteModule1 = c(paramContext, paramString);
          if (localc2.a != null) {
            localc2.a.close();
          }
          k.set(localc1);
          return localDynamiteModule1;
        }
        throw new a("Remote load failed. No local fallback found.", locala, null);
      }
    }
    int i5 = localb.c;
    throw new a(47 + "VersionPolicy returned invalid code:" + i5, null);
  }
  
  private static DynamiteModule a(Context paramContext, String paramString, int paramInt)
  {
    Boolean localBoolean;
    try
    {
      localBoolean = g;
      if (localBoolean == null) {
        throw new a("Failed to determine which loading route to use.", null);
      }
    }
    finally {}
    if (localBoolean.booleanValue()) {
      return c(paramContext, paramString, paramInt);
    }
    return b(paramContext, paramString, paramInt);
  }
  
  /* Error */
  private static a a(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 363	com/google/android/gms/dynamite/DynamiteModule:h	Lcom/google/android/gms/dynamite/a;
    //   6: ifnull +14 -> 20
    //   9: getstatic 363	com/google/android/gms/dynamite/DynamiteModule:h	Lcom/google/android/gms/dynamite/a;
    //   12: astore 7
    //   14: ldc 2
    //   16: monitorexit
    //   17: aload 7
    //   19: areturn
    //   20: invokestatic 368	com/google/android/gms/common/d:a	()Lcom/google/android/gms/common/d;
    //   23: aload_0
    //   24: invokevirtual 371	com/google/android/gms/common/d:a	(Landroid/content/Context;)I
    //   27: ifeq +8 -> 35
    //   30: ldc 2
    //   32: monitorexit
    //   33: aconst_null
    //   34: areturn
    //   35: aload_0
    //   36: ldc 223
    //   38: iconst_3
    //   39: invokevirtual 375	android/content/Context:createPackageContext	(Ljava/lang/String;I)Landroid/content/Context;
    //   42: invokevirtual 97	android/content/Context:getClassLoader	()Ljava/lang/ClassLoader;
    //   45: ldc_w 377
    //   48: invokevirtual 130	java/lang/ClassLoader:loadClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   51: invokevirtual 380	java/lang/Class:newInstance	()Ljava/lang/Object;
    //   54: checkcast 382	android/os/IBinder
    //   57: invokestatic 387	com/google/android/gms/dynamite/a$a:a	(Landroid/os/IBinder;)Lcom/google/android/gms/dynamite/a;
    //   60: astore 6
    //   62: aload 6
    //   64: ifnull +53 -> 117
    //   67: aload 6
    //   69: putstatic 363	com/google/android/gms/dynamite/DynamiteModule:h	Lcom/google/android/gms/dynamite/a;
    //   72: ldc 2
    //   74: monitorexit
    //   75: aload 6
    //   77: areturn
    //   78: astore_1
    //   79: ldc 2
    //   81: monitorexit
    //   82: aload_1
    //   83: athrow
    //   84: astore_2
    //   85: aload_2
    //   86: invokevirtual 176	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   89: invokestatic 105	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   92: astore_3
    //   93: aload_3
    //   94: invokevirtual 109	java/lang/String:length	()I
    //   97: ifeq +25 -> 122
    //   100: ldc_w 389
    //   103: aload_3
    //   104: invokevirtual 182	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   107: astore 4
    //   109: ldc 151
    //   111: aload 4
    //   113: invokestatic 162	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   116: pop
    //   117: ldc 2
    //   119: monitorexit
    //   120: aconst_null
    //   121: areturn
    //   122: new 101	java/lang/String
    //   125: dup
    //   126: ldc_w 389
    //   129: invokespecial 185	java/lang/String:<init>	(Ljava/lang/String;)V
    //   132: astore 4
    //   134: goto -25 -> 109
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	137	0	paramContext	Context
    //   78	5	1	localObject	Object
    //   84	2	2	localException	Exception
    //   92	12	3	str1	String
    //   107	26	4	str2	String
    //   60	16	6	locala1	a
    //   12	6	7	locala2	a
    // Exception table:
    //   from	to	target	type
    //   3	17	78	finally
    //   20	33	78	finally
    //   35	62	78	finally
    //   67	72	78	finally
    //   72	75	78	finally
    //   79	82	78	finally
    //   85	109	78	finally
    //   109	117	78	finally
    //   117	120	78	finally
    //   122	134	78	finally
    //   35	62	84	java/lang/Exception
    //   67	72	84	java/lang/Exception
  }
  
  @GuardedBy("DynamiteModule.class")
  private static void a(ClassLoader paramClassLoader)
  {
    try
    {
      i = b.a.a((IBinder)paramClassLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]));
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      throw new a("Failed to instantiate dynamite loader", localClassNotFoundException, null);
    }
    catch (InstantiationException localInstantiationException)
    {
      break label32;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      break label32;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      break label32;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      label32:
      break label32;
    }
  }
  
  public static int b(Context paramContext, String paramString)
  {
    return a(paramContext, paramString, false);
  }
  
  public static Cursor b(Context paramContext, String paramString, boolean paramBoolean)
  {
    return paramContext.getContentResolver().query(a(paramString, paramBoolean), null, null, null, null);
  }
  
  private static DynamiteModule b(Context paramContext, String paramString, int paramInt)
  {
    Log.i("DynamiteModule", 51 + String.valueOf(paramString).length() + "Selected remote version of " + paramString + ", version >= " + paramInt);
    a locala = a(paramContext);
    if (locala == null) {
      throw new a("Failed to create IDynamiteLoader.", null);
    }
    com.google.android.gms.a.a locala1;
    try
    {
      locala1 = locala.a(com.google.android.gms.a.b.a(paramContext), paramString, paramInt);
      if (com.google.android.gms.a.b.a(locala1) == null) {
        throw new a("Failed to load remote module.", null);
      }
    }
    catch (RemoteException localRemoteException)
    {
      throw new a("Failed to load remote module.", localRemoteException, null);
    }
    return new DynamiteModule((Context)com.google.android.gms.a.b.a(locala1));
  }
  
  private static int c(Context paramContext, String paramString, boolean paramBoolean)
  {
    a locala = a(paramContext);
    if (locala == null) {
      return 0;
    }
    String str1;
    try
    {
      int n = locala.a(com.google.android.gms.a.b.a(paramContext), paramString, paramBoolean);
      return n;
    }
    catch (RemoteException localRemoteException)
    {
      str1 = String.valueOf(localRemoteException.getMessage());
      if (str1.length() == 0) {}
    }
    for (String str2 = "Failed to retrieve remote module version: ".concat(str1);; str2 = new String("Failed to retrieve remote module version: "))
    {
      Log.w("DynamiteModule", str2);
      return 0;
    }
  }
  
  private static DynamiteModule c(Context paramContext, String paramString)
  {
    String str1 = String.valueOf(paramString);
    if (str1.length() != 0) {}
    for (String str2 = "Selected local version of ".concat(str1);; str2 = new String("Selected local version of "))
    {
      Log.i("DynamiteModule", str2);
      return new DynamiteModule(paramContext.getApplicationContext());
    }
  }
  
  private static DynamiteModule c(Context paramContext, String paramString, int paramInt)
  {
    Log.i("DynamiteModule", 51 + String.valueOf(paramString).length() + "Selected remote version of " + paramString + ", version >= " + paramInt);
    b localb;
    try
    {
      localb = i;
      if (localb == null) {
        throw new a("DynamiteLoaderV2 was not cached.", null);
      }
    }
    finally {}
    c localc = (c)k.get();
    if ((localc == null) || (localc.a == null)) {
      throw new a("No result cursor", null);
    }
    Context localContext = a(paramContext.getApplicationContext(), paramString, paramInt, localc.a, localb);
    if (localContext == null) {
      throw new a("Failed to get module context", null);
    }
    return new DynamiteModule(localContext);
  }
  
  /* Error */
  private static int d(Context paramContext, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: iload_2
    //   3: invokestatic 465	com/google/android/gms/dynamite/DynamiteModule:b	(Landroid/content/Context;Ljava/lang/String;Z)Landroid/database/Cursor;
    //   6: astore 6
    //   8: aload 6
    //   10: astore 4
    //   12: aload 4
    //   14: ifnull +13 -> 27
    //   17: aload 4
    //   19: invokeinterface 468 1 0
    //   24: ifne +51 -> 75
    //   27: ldc 151
    //   29: ldc_w 470
    //   32: invokestatic 173	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   35: pop
    //   36: new 192	com/google/android/gms/dynamite/DynamiteModule$a
    //   39: dup
    //   40: ldc_w 472
    //   43: aconst_null
    //   44: invokespecial 326	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;Lcom/google/android/gms/dynamite/c;)V
    //   47: athrow
    //   48: astore_3
    //   49: aload_3
    //   50: instanceof 192
    //   53: ifeq +111 -> 164
    //   56: aload_3
    //   57: athrow
    //   58: astore 5
    //   60: aload 4
    //   62: ifnull +10 -> 72
    //   65: aload 4
    //   67: invokeinterface 334 1 0
    //   72: aload 5
    //   74: athrow
    //   75: aload 4
    //   77: iconst_0
    //   78: invokeinterface 475 2 0
    //   83: istore 8
    //   85: iload 8
    //   87: ifle +54 -> 141
    //   90: ldc 2
    //   92: monitorenter
    //   93: aload 4
    //   95: iconst_2
    //   96: invokeinterface 479 2 0
    //   101: putstatic 233	com/google/android/gms/dynamite/DynamiteModule:j	Ljava/lang/String;
    //   104: ldc 2
    //   106: monitorexit
    //   107: getstatic 38	com/google/android/gms/dynamite/DynamiteModule:k	Ljava/lang/ThreadLocal;
    //   110: invokevirtual 284	java/lang/ThreadLocal:get	()Ljava/lang/Object;
    //   113: checkcast 286	com/google/android/gms/dynamite/DynamiteModule$c
    //   116: astore 10
    //   118: aload 10
    //   120: ifnull +21 -> 141
    //   123: aload 10
    //   125: getfield 329	com/google/android/gms/dynamite/DynamiteModule$c:a	Landroid/database/Cursor;
    //   128: ifnonnull +13 -> 141
    //   131: aload 10
    //   133: aload 4
    //   135: putfield 329	com/google/android/gms/dynamite/DynamiteModule$c:a	Landroid/database/Cursor;
    //   138: aconst_null
    //   139: astore 4
    //   141: aload 4
    //   143: ifnull +10 -> 153
    //   146: aload 4
    //   148: invokeinterface 334 1 0
    //   153: iload 8
    //   155: ireturn
    //   156: astore 9
    //   158: ldc 2
    //   160: monitorexit
    //   161: aload 9
    //   163: athrow
    //   164: new 192	com/google/android/gms/dynamite/DynamiteModule$a
    //   167: dup
    //   168: ldc_w 481
    //   171: aload_3
    //   172: aconst_null
    //   173: invokespecial 352	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;Ljava/lang/Throwable;Lcom/google/android/gms/dynamite/c;)V
    //   176: athrow
    //   177: astore 5
    //   179: aconst_null
    //   180: astore 4
    //   182: goto -122 -> 60
    //   185: astore_3
    //   186: aconst_null
    //   187: astore 4
    //   189: goto -140 -> 49
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	192	0	paramContext	Context
    //   0	192	1	paramString	String
    //   0	192	2	paramBoolean	boolean
    //   48	124	3	localException1	Exception
    //   185	1	3	localException2	Exception
    //   10	178	4	localCursor1	Cursor
    //   58	15	5	localObject1	Object
    //   177	1	5	localObject2	Object
    //   6	3	6	localCursor2	Cursor
    //   83	71	8	n	int
    //   156	6	9	localObject3	Object
    //   116	16	10	localc	c
    // Exception table:
    //   from	to	target	type
    //   17	27	48	java/lang/Exception
    //   27	48	48	java/lang/Exception
    //   75	85	48	java/lang/Exception
    //   90	93	48	java/lang/Exception
    //   107	118	48	java/lang/Exception
    //   123	138	48	java/lang/Exception
    //   161	164	48	java/lang/Exception
    //   17	27	58	finally
    //   27	48	58	finally
    //   49	58	58	finally
    //   75	85	58	finally
    //   90	93	58	finally
    //   107	118	58	finally
    //   123	138	58	finally
    //   161	164	58	finally
    //   164	177	58	finally
    //   93	107	156	finally
    //   158	161	156	finally
    //   0	8	177	finally
    //   0	8	185	java/lang/Exception
  }
  
  public final Context a()
  {
    return this.m;
  }
  
  public final IBinder a(String paramString)
  {
    try
    {
      IBinder localIBinder = (IBinder)this.m.getClassLoader().loadClass(paramString).newInstance();
      return localIBinder;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      String str1 = String.valueOf(paramString);
      if (str1.length() != 0) {}
      for (String str2 = "Failed to instantiate module class: ".concat(str1);; str2 = new String("Failed to instantiate module class: ")) {
        throw new a(str2, localClassNotFoundException, null);
      }
    }
    catch (InstantiationException localInstantiationException)
    {
      break label23;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      label23:
      break label23;
    }
  }
  
  @DynamiteApi
  public static class DynamiteLoaderClassLoader
  {
    @GuardedBy("DynamiteLoaderClassLoader.class")
    public static ClassLoader sClassLoader;
  }
  
  public static class a
    extends Exception
  {
    private a(String paramString)
    {
      super();
    }
    
    private a(String paramString, Throwable paramThrowable)
    {
      super(paramThrowable);
    }
  }
  
  public static abstract interface b
  {
    public abstract b a(Context paramContext, String paramString, a parama);
    
    public static abstract interface a
    {
      public abstract int a(Context paramContext, String paramString);
      
      public abstract int a(Context paramContext, String paramString, boolean paramBoolean);
    }
    
    public static class b
    {
      public int a = 0;
      public int b = 0;
      public int c = 0;
    }
  }
  
  private static final class c
  {
    public Cursor a;
  }
  
  private static final class d
    implements DynamiteModule.b.a
  {
    private final int a;
    private final int b;
    
    public d(int paramInt1, int paramInt2)
    {
      this.a = paramInt1;
      this.b = 0;
    }
    
    public final int a(Context paramContext, String paramString)
    {
      return this.a;
    }
    
    public final int a(Context paramContext, String paramString, boolean paramBoolean)
    {
      return 0;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.dynamite.DynamiteModule
 * JD-Core Version:    0.7.0.1
 */