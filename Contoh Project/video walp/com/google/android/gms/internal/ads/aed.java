package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class aed
{
  private static final Logger a = Logger.getLogger(aed.class.getName());
  private static final Unsafe b = c();
  private static final Class<?> c = zr.b();
  private static final boolean d = c(Long.TYPE);
  private static final boolean e = c(Integer.TYPE);
  private static final d f;
  private static final boolean g;
  private static final boolean h;
  private static final long i;
  private static final long j;
  private static final long k;
  private static final long l;
  private static final long m;
  private static final long n;
  private static final long o;
  private static final long p;
  private static final long q;
  private static final long r;
  private static final long s;
  private static final long t;
  private static final long u;
  private static final long v;
  private static final long w;
  private static final boolean x;
  
  static
  {
    Object localObject;
    if (b == null)
    {
      localObject = null;
      f = (d)localObject;
      g = f();
      h = e();
      i = a([B.class);
      j = a([Z.class);
      k = b([Z.class);
      l = a([I.class);
      m = b([I.class);
      n = a([J.class);
      o = b([J.class);
      p = a([F.class);
      q = b([F.class);
      r = a([D.class);
      s = b([D.class);
      t = a([Ljava.lang.Object.class);
      u = b([Ljava.lang.Object.class);
      v = b(g());
      Field localField1 = a(String.class, "value");
      Field localField2 = null;
      if (localField1 != null)
      {
        Class localClass = localField1.getType();
        localField2 = null;
        if (localClass == [C.class) {
          localField2 = localField1;
        }
      }
      w = b(localField2);
      if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
        break label310;
      }
    }
    label310:
    for (boolean bool = true;; bool = false)
    {
      x = bool;
      return;
      if (zr.a())
      {
        if (d)
        {
          localObject = new b(b);
          break;
        }
        if (e)
        {
          localObject = new a(b);
          break;
        }
        localObject = null;
        break;
      }
      localObject = new c(b);
      break;
    }
  }
  
  static byte a(byte[] paramArrayOfByte, long paramLong)
  {
    return f.a(paramArrayOfByte, paramLong + i);
  }
  
  private static int a(Class<?> paramClass)
  {
    if (h) {
      return f.a.arrayBaseOffset(paramClass);
    }
    return -1;
  }
  
  static int a(Object paramObject, long paramLong)
  {
    return f.e(paramObject, paramLong);
  }
  
  static long a(Field paramField)
  {
    return f.a(paramField);
  }
  
  private static Field a(Class<?> paramClass, String paramString)
  {
    try
    {
      Field localField = paramClass.getDeclaredField(paramString);
      localField.setAccessible(true);
      return localField;
    }
    catch (Throwable localThrowable) {}
    return null;
  }
  
  static void a(Object paramObject, long paramLong, double paramDouble)
  {
    f.a(paramObject, paramLong, paramDouble);
  }
  
  static void a(Object paramObject, long paramLong, float paramFloat)
  {
    f.a(paramObject, paramLong, paramFloat);
  }
  
  static void a(Object paramObject, long paramLong, int paramInt)
  {
    f.a(paramObject, paramLong, paramInt);
  }
  
  static void a(Object paramObject, long paramLong1, long paramLong2)
  {
    f.a(paramObject, paramLong1, paramLong2);
  }
  
  static void a(Object paramObject1, long paramLong, Object paramObject2)
  {
    f.a.putObject(paramObject1, paramLong, paramObject2);
  }
  
  static void a(Object paramObject, long paramLong, boolean paramBoolean)
  {
    f.a(paramObject, paramLong, paramBoolean);
  }
  
  static void a(byte[] paramArrayOfByte, long paramLong, byte paramByte)
  {
    f.a(paramArrayOfByte, paramLong + i, paramByte);
  }
  
  static boolean a()
  {
    return h;
  }
  
  private static int b(Class<?> paramClass)
  {
    if (h) {
      return f.a.arrayIndexScale(paramClass);
    }
    return -1;
  }
  
  static long b(Object paramObject, long paramLong)
  {
    return f.f(paramObject, paramLong);
  }
  
  private static long b(Field paramField)
  {
    if ((paramField == null) || (f == null)) {
      return -1L;
    }
    return f.a(paramField);
  }
  
  static boolean b()
  {
    return g;
  }
  
  static Unsafe c()
  {
    try
    {
      Unsafe localUnsafe = (Unsafe)AccessController.doPrivileged(new aee());
      return localUnsafe;
    }
    catch (Throwable localThrowable) {}
    return null;
  }
  
  private static void c(Object paramObject, long paramLong, byte paramByte)
  {
    int i1 = a(paramObject, paramLong & 0xFFFFFFFC);
    int i2 = (0x3 & (0xFFFFFFFF ^ (int)paramLong)) << 3;
    int i3 = i1 & (0xFFFFFFFF ^ 255 << i2) | (paramByte & 0xFF) << i2;
    a(paramObject, paramLong & 0xFFFFFFFC, i3);
  }
  
  private static boolean c(Class<?> paramClass)
  {
    if (!zr.a()) {
      return false;
    }
    try
    {
      Class localClass = c;
      Class[] arrayOfClass1 = new Class[2];
      arrayOfClass1[0] = paramClass;
      arrayOfClass1[1] = Boolean.TYPE;
      localClass.getMethod("peekLong", arrayOfClass1);
      Class[] arrayOfClass2 = new Class[3];
      arrayOfClass2[0] = paramClass;
      arrayOfClass2[1] = Long.TYPE;
      arrayOfClass2[2] = Boolean.TYPE;
      localClass.getMethod("pokeLong", arrayOfClass2);
      Class[] arrayOfClass3 = new Class[3];
      arrayOfClass3[0] = paramClass;
      arrayOfClass3[1] = Integer.TYPE;
      arrayOfClass3[2] = Boolean.TYPE;
      localClass.getMethod("pokeInt", arrayOfClass3);
      Class[] arrayOfClass4 = new Class[2];
      arrayOfClass4[0] = paramClass;
      arrayOfClass4[1] = Boolean.TYPE;
      localClass.getMethod("peekInt", arrayOfClass4);
      Class[] arrayOfClass5 = new Class[2];
      arrayOfClass5[0] = paramClass;
      arrayOfClass5[1] = Byte.TYPE;
      localClass.getMethod("pokeByte", arrayOfClass5);
      localClass.getMethod("peekByte", new Class[] { paramClass });
      Class[] arrayOfClass6 = new Class[4];
      arrayOfClass6[0] = paramClass;
      arrayOfClass6[1] = [B.class;
      arrayOfClass6[2] = Integer.TYPE;
      arrayOfClass6[3] = Integer.TYPE;
      localClass.getMethod("pokeByteArray", arrayOfClass6);
      Class[] arrayOfClass7 = new Class[4];
      arrayOfClass7[0] = paramClass;
      arrayOfClass7[1] = [B.class;
      arrayOfClass7[2] = Integer.TYPE;
      arrayOfClass7[3] = Integer.TYPE;
      localClass.getMethod("peekByteArray", arrayOfClass7);
      return true;
    }
    catch (Throwable localThrowable) {}
    return false;
  }
  
  static boolean c(Object paramObject, long paramLong)
  {
    return f.b(paramObject, paramLong);
  }
  
  static float d(Object paramObject, long paramLong)
  {
    return f.c(paramObject, paramLong);
  }
  
  private static void d(Object paramObject, long paramLong, byte paramByte)
  {
    int i1 = a(paramObject, paramLong & 0xFFFFFFFC);
    int i2 = (0x3 & (int)paramLong) << 3;
    int i3 = i1 & (0xFFFFFFFF ^ 255 << i2) | (paramByte & 0xFF) << i2;
    a(paramObject, paramLong & 0xFFFFFFFC, i3);
  }
  
  private static void d(Object paramObject, long paramLong, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i1 = 1;; i1 = 0)
    {
      c(paramObject, paramLong, (byte)i1);
      return;
    }
  }
  
  static double e(Object paramObject, long paramLong)
  {
    return f.d(paramObject, paramLong);
  }
  
  private static void e(Object paramObject, long paramLong, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i1 = 1;; i1 = 0)
    {
      d(paramObject, paramLong, (byte)i1);
      return;
    }
  }
  
  private static boolean e()
  {
    if (b == null) {
      return false;
    }
    try
    {
      Class localClass = b.getClass();
      localClass.getMethod("objectFieldOffset", new Class[] { Field.class });
      localClass.getMethod("arrayBaseOffset", new Class[] { Class.class });
      localClass.getMethod("arrayIndexScale", new Class[] { Class.class });
      Class[] arrayOfClass1 = new Class[2];
      arrayOfClass1[0] = Object.class;
      arrayOfClass1[1] = Long.TYPE;
      localClass.getMethod("getInt", arrayOfClass1);
      Class[] arrayOfClass2 = new Class[3];
      arrayOfClass2[0] = Object.class;
      arrayOfClass2[1] = Long.TYPE;
      arrayOfClass2[2] = Integer.TYPE;
      localClass.getMethod("putInt", arrayOfClass2);
      Class[] arrayOfClass3 = new Class[2];
      arrayOfClass3[0] = Object.class;
      arrayOfClass3[1] = Long.TYPE;
      localClass.getMethod("getLong", arrayOfClass3);
      Class[] arrayOfClass4 = new Class[3];
      arrayOfClass4[0] = Object.class;
      arrayOfClass4[1] = Long.TYPE;
      arrayOfClass4[2] = Long.TYPE;
      localClass.getMethod("putLong", arrayOfClass4);
      Class[] arrayOfClass5 = new Class[2];
      arrayOfClass5[0] = Object.class;
      arrayOfClass5[1] = Long.TYPE;
      localClass.getMethod("getObject", arrayOfClass5);
      Class[] arrayOfClass6 = new Class[3];
      arrayOfClass6[0] = Object.class;
      arrayOfClass6[1] = Long.TYPE;
      arrayOfClass6[2] = Object.class;
      localClass.getMethod("putObject", arrayOfClass6);
      if (zr.a()) {
        return true;
      }
      Class[] arrayOfClass7 = new Class[2];
      arrayOfClass7[0] = Object.class;
      arrayOfClass7[1] = Long.TYPE;
      localClass.getMethod("getByte", arrayOfClass7);
      Class[] arrayOfClass8 = new Class[3];
      arrayOfClass8[0] = Object.class;
      arrayOfClass8[1] = Long.TYPE;
      arrayOfClass8[2] = Byte.TYPE;
      localClass.getMethod("putByte", arrayOfClass8);
      Class[] arrayOfClass9 = new Class[2];
      arrayOfClass9[0] = Object.class;
      arrayOfClass9[1] = Long.TYPE;
      localClass.getMethod("getBoolean", arrayOfClass9);
      Class[] arrayOfClass10 = new Class[3];
      arrayOfClass10[0] = Object.class;
      arrayOfClass10[1] = Long.TYPE;
      arrayOfClass10[2] = Boolean.TYPE;
      localClass.getMethod("putBoolean", arrayOfClass10);
      Class[] arrayOfClass11 = new Class[2];
      arrayOfClass11[0] = Object.class;
      arrayOfClass11[1] = Long.TYPE;
      localClass.getMethod("getFloat", arrayOfClass11);
      Class[] arrayOfClass12 = new Class[3];
      arrayOfClass12[0] = Object.class;
      arrayOfClass12[1] = Long.TYPE;
      arrayOfClass12[2] = Float.TYPE;
      localClass.getMethod("putFloat", arrayOfClass12);
      Class[] arrayOfClass13 = new Class[2];
      arrayOfClass13[0] = Object.class;
      arrayOfClass13[1] = Long.TYPE;
      localClass.getMethod("getDouble", arrayOfClass13);
      Class[] arrayOfClass14 = new Class[3];
      arrayOfClass14[0] = Object.class;
      arrayOfClass14[1] = Long.TYPE;
      arrayOfClass14[2] = Double.TYPE;
      localClass.getMethod("putDouble", arrayOfClass14);
      return true;
    }
    catch (Throwable localThrowable)
    {
      Logger localLogger = a;
      Level localLevel = Level.WARNING;
      String str = String.valueOf(localThrowable);
      localLogger.logp(localLevel, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", 71 + String.valueOf(str).length() + "platform method missing - proto runtime falling back to safer methods: " + str);
    }
    return false;
  }
  
  static Object f(Object paramObject, long paramLong)
  {
    return f.a.getObject(paramObject, paramLong);
  }
  
  private static boolean f()
  {
    if (b == null) {}
    for (;;)
    {
      return false;
      try
      {
        Class localClass = b.getClass();
        localClass.getMethod("objectFieldOffset", new Class[] { Field.class });
        Class[] arrayOfClass1 = new Class[2];
        arrayOfClass1[0] = Object.class;
        arrayOfClass1[1] = Long.TYPE;
        localClass.getMethod("getLong", arrayOfClass1);
        if (g() != null)
        {
          if (zr.a()) {
            return true;
          }
          Class[] arrayOfClass2 = new Class[1];
          arrayOfClass2[0] = Long.TYPE;
          localClass.getMethod("getByte", arrayOfClass2);
          Class[] arrayOfClass3 = new Class[2];
          arrayOfClass3[0] = Long.TYPE;
          arrayOfClass3[1] = Byte.TYPE;
          localClass.getMethod("putByte", arrayOfClass3);
          Class[] arrayOfClass4 = new Class[1];
          arrayOfClass4[0] = Long.TYPE;
          localClass.getMethod("getInt", arrayOfClass4);
          Class[] arrayOfClass5 = new Class[2];
          arrayOfClass5[0] = Long.TYPE;
          arrayOfClass5[1] = Integer.TYPE;
          localClass.getMethod("putInt", arrayOfClass5);
          Class[] arrayOfClass6 = new Class[1];
          arrayOfClass6[0] = Long.TYPE;
          localClass.getMethod("getLong", arrayOfClass6);
          Class[] arrayOfClass7 = new Class[2];
          arrayOfClass7[0] = Long.TYPE;
          arrayOfClass7[1] = Long.TYPE;
          localClass.getMethod("putLong", arrayOfClass7);
          Class[] arrayOfClass8 = new Class[3];
          arrayOfClass8[0] = Long.TYPE;
          arrayOfClass8[1] = Long.TYPE;
          arrayOfClass8[2] = Long.TYPE;
          localClass.getMethod("copyMemory", arrayOfClass8);
          Class[] arrayOfClass9 = new Class[5];
          arrayOfClass9[0] = Object.class;
          arrayOfClass9[1] = Long.TYPE;
          arrayOfClass9[2] = Object.class;
          arrayOfClass9[3] = Long.TYPE;
          arrayOfClass9[4] = Long.TYPE;
          localClass.getMethod("copyMemory", arrayOfClass9);
          return true;
        }
      }
      catch (Throwable localThrowable)
      {
        Logger localLogger = a;
        Level localLevel = Level.WARNING;
        String str = String.valueOf(localThrowable);
        localLogger.logp(localLevel, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", 71 + String.valueOf(str).length() + "platform method missing - proto runtime falling back to safer methods: " + str);
      }
    }
    return false;
  }
  
  private static Field g()
  {
    Field localField;
    if (zr.a())
    {
      localField = a(Buffer.class, "effectiveDirectAddress");
      if (localField == null) {}
    }
    do
    {
      return localField;
      localField = a(Buffer.class, "address");
    } while ((localField != null) && (localField.getType() == Long.TYPE));
    return null;
  }
  
  private static byte k(Object paramObject, long paramLong)
  {
    return (byte)(a(paramObject, 0xFFFFFFFC & paramLong) >>> (int)((0x3 & (0xFFFFFFFF ^ paramLong)) << 3));
  }
  
  private static byte l(Object paramObject, long paramLong)
  {
    return (byte)(a(paramObject, 0xFFFFFFFC & paramLong) >>> (int)((0x3 & paramLong) << 3));
  }
  
  private static boolean m(Object paramObject, long paramLong)
  {
    return k(paramObject, paramLong) != 0;
  }
  
  private static boolean n(Object paramObject, long paramLong)
  {
    return l(paramObject, paramLong) != 0;
  }
  
  static final class a
    extends aed.d
  {
    a(Unsafe paramUnsafe)
    {
      super();
    }
    
    public final byte a(Object paramObject, long paramLong)
    {
      if (aed.d()) {
        return aed.g(paramObject, paramLong);
      }
      return aed.h(paramObject, paramLong);
    }
    
    public final void a(Object paramObject, long paramLong, byte paramByte)
    {
      if (aed.d())
      {
        aed.a(paramObject, paramLong, paramByte);
        return;
      }
      aed.b(paramObject, paramLong, paramByte);
    }
    
    public final void a(Object paramObject, long paramLong, double paramDouble)
    {
      a(paramObject, paramLong, Double.doubleToLongBits(paramDouble));
    }
    
    public final void a(Object paramObject, long paramLong, float paramFloat)
    {
      a(paramObject, paramLong, Float.floatToIntBits(paramFloat));
    }
    
    public final void a(Object paramObject, long paramLong, boolean paramBoolean)
    {
      if (aed.d())
      {
        aed.b(paramObject, paramLong, paramBoolean);
        return;
      }
      aed.c(paramObject, paramLong, paramBoolean);
    }
    
    public final boolean b(Object paramObject, long paramLong)
    {
      if (aed.d()) {
        return aed.i(paramObject, paramLong);
      }
      return aed.j(paramObject, paramLong);
    }
    
    public final float c(Object paramObject, long paramLong)
    {
      return Float.intBitsToFloat(e(paramObject, paramLong));
    }
    
    public final double d(Object paramObject, long paramLong)
    {
      return Double.longBitsToDouble(f(paramObject, paramLong));
    }
  }
  
  static final class b
    extends aed.d
  {
    b(Unsafe paramUnsafe)
    {
      super();
    }
    
    public final byte a(Object paramObject, long paramLong)
    {
      if (aed.d()) {
        return aed.g(paramObject, paramLong);
      }
      return aed.h(paramObject, paramLong);
    }
    
    public final void a(Object paramObject, long paramLong, byte paramByte)
    {
      if (aed.d())
      {
        aed.a(paramObject, paramLong, paramByte);
        return;
      }
      aed.b(paramObject, paramLong, paramByte);
    }
    
    public final void a(Object paramObject, long paramLong, double paramDouble)
    {
      a(paramObject, paramLong, Double.doubleToLongBits(paramDouble));
    }
    
    public final void a(Object paramObject, long paramLong, float paramFloat)
    {
      a(paramObject, paramLong, Float.floatToIntBits(paramFloat));
    }
    
    public final void a(Object paramObject, long paramLong, boolean paramBoolean)
    {
      if (aed.d())
      {
        aed.b(paramObject, paramLong, paramBoolean);
        return;
      }
      aed.c(paramObject, paramLong, paramBoolean);
    }
    
    public final boolean b(Object paramObject, long paramLong)
    {
      if (aed.d()) {
        return aed.i(paramObject, paramLong);
      }
      return aed.j(paramObject, paramLong);
    }
    
    public final float c(Object paramObject, long paramLong)
    {
      return Float.intBitsToFloat(e(paramObject, paramLong));
    }
    
    public final double d(Object paramObject, long paramLong)
    {
      return Double.longBitsToDouble(f(paramObject, paramLong));
    }
  }
  
  static final class c
    extends aed.d
  {
    c(Unsafe paramUnsafe)
    {
      super();
    }
    
    public final byte a(Object paramObject, long paramLong)
    {
      return this.a.getByte(paramObject, paramLong);
    }
    
    public final void a(Object paramObject, long paramLong, byte paramByte)
    {
      this.a.putByte(paramObject, paramLong, paramByte);
    }
    
    public final void a(Object paramObject, long paramLong, double paramDouble)
    {
      this.a.putDouble(paramObject, paramLong, paramDouble);
    }
    
    public final void a(Object paramObject, long paramLong, float paramFloat)
    {
      this.a.putFloat(paramObject, paramLong, paramFloat);
    }
    
    public final void a(Object paramObject, long paramLong, boolean paramBoolean)
    {
      this.a.putBoolean(paramObject, paramLong, paramBoolean);
    }
    
    public final boolean b(Object paramObject, long paramLong)
    {
      return this.a.getBoolean(paramObject, paramLong);
    }
    
    public final float c(Object paramObject, long paramLong)
    {
      return this.a.getFloat(paramObject, paramLong);
    }
    
    public final double d(Object paramObject, long paramLong)
    {
      return this.a.getDouble(paramObject, paramLong);
    }
  }
  
  static abstract class d
  {
    Unsafe a;
    
    d(Unsafe paramUnsafe)
    {
      this.a = paramUnsafe;
    }
    
    public abstract byte a(Object paramObject, long paramLong);
    
    public final long a(Field paramField)
    {
      return this.a.objectFieldOffset(paramField);
    }
    
    public abstract void a(Object paramObject, long paramLong, byte paramByte);
    
    public abstract void a(Object paramObject, long paramLong, double paramDouble);
    
    public abstract void a(Object paramObject, long paramLong, float paramFloat);
    
    public final void a(Object paramObject, long paramLong, int paramInt)
    {
      this.a.putInt(paramObject, paramLong, paramInt);
    }
    
    public final void a(Object paramObject, long paramLong1, long paramLong2)
    {
      this.a.putLong(paramObject, paramLong1, paramLong2);
    }
    
    public abstract void a(Object paramObject, long paramLong, boolean paramBoolean);
    
    public abstract boolean b(Object paramObject, long paramLong);
    
    public abstract float c(Object paramObject, long paramLong);
    
    public abstract double d(Object paramObject, long paramLong);
    
    public final int e(Object paramObject, long paramLong)
    {
      return this.a.getInt(paramObject, paramLong);
    }
    
    public final long f(Object paramObject, long paramLong)
    {
      return this.a.getLong(paramObject, paramLong);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aed
 * JD-Core Version:    0.7.0.1
 */