package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class aak
  extends zv
{
  private static final Logger b = Logger.getLogger(aak.class.getName());
  private static final boolean c = aed.a();
  aam a;
  
  public static int a(int paramInt, abs paramabs)
  {
    int i = e(paramInt);
    int j = paramabs.b();
    return i + (j + g(j));
  }
  
  public static int a(abs paramabs)
  {
    int i = paramabs.b();
    return i + g(i);
  }
  
  static int a(acl paramacl, ade paramade)
  {
    zl localzl = (zl)paramacl;
    int i = localzl.j();
    if (i == -1)
    {
      i = paramade.b(localzl);
      localzl.a(i);
    }
    return i + g(i);
  }
  
  public static aak a(byte[] paramArrayOfByte)
  {
    return new a(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static int b(double paramDouble)
  {
    return 8;
  }
  
  public static int b(float paramFloat)
  {
    return 4;
  }
  
  public static int b(int paramInt, double paramDouble)
  {
    return 8 + e(paramInt);
  }
  
  public static int b(int paramInt, float paramFloat)
  {
    return 4 + e(paramInt);
  }
  
  public static int b(int paramInt, abs paramabs)
  {
    return (e(1) << 1) + g(2, paramInt) + a(3, paramabs);
  }
  
  public static int b(int paramInt, acl paramacl)
  {
    return (e(1) << 1) + g(2, paramInt) + (e(3) + b(paramacl));
  }
  
  static int b(int paramInt, acl paramacl, ade paramade)
  {
    return e(paramInt) + a(paramacl, paramade);
  }
  
  public static int b(int paramInt, String paramString)
  {
    return e(paramInt) + b(paramString);
  }
  
  public static int b(int paramInt, boolean paramBoolean)
  {
    return 1 + e(paramInt);
  }
  
  public static int b(acl paramacl)
  {
    int i = paramacl.l();
    return i + g(i);
  }
  
  public static int b(zw paramzw)
  {
    int i = paramzw.a();
    return i + g(i);
  }
  
  public static int b(String paramString)
  {
    try
    {
      int j = aef.a(paramString);
      i = j;
    }
    catch (aei localaei)
    {
      for (;;)
      {
        int i = paramString.getBytes(abg.a).length;
      }
    }
    return i + g(i);
  }
  
  public static int b(boolean paramBoolean)
  {
    return 1;
  }
  
  public static int b(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    return i + g(i);
  }
  
  @Deprecated
  static int c(int paramInt, acl paramacl, ade paramade)
  {
    int i = e(paramInt) << 1;
    zl localzl = (zl)paramacl;
    int j = localzl.j();
    if (j == -1)
    {
      j = paramade.b(localzl);
      localzl.a(j);
    }
    return j + i;
  }
  
  public static int c(int paramInt, zw paramzw)
  {
    int i = e(paramInt);
    int j = paramzw.a();
    return i + (j + g(j));
  }
  
  @Deprecated
  public static int c(acl paramacl)
  {
    return paramacl.l();
  }
  
  public static int d(int paramInt, long paramLong)
  {
    return e(paramInt) + e(paramLong);
  }
  
  public static int d(int paramInt, zw paramzw)
  {
    return (e(1) << 1) + g(2, paramInt) + c(3, paramzw);
  }
  
  public static int d(long paramLong)
  {
    return e(paramLong);
  }
  
  public static int e(int paramInt)
  {
    return g(paramInt << 3);
  }
  
  public static int e(int paramInt, long paramLong)
  {
    return e(paramInt) + e(paramLong);
  }
  
  public static int e(long paramLong)
  {
    if ((0xFFFFFF80 & paramLong) == 0L)
    {
      i = 1;
      return i;
    }
    if (paramLong < 0L) {
      return 10;
    }
    int i = 2;
    if ((0x0 & paramLong) != 0L) {
      i = 6;
    }
    for (long l = paramLong >>> 28;; l = paramLong)
    {
      if ((0xFFE00000 & l) != 0L)
      {
        i += 2;
        l >>>= 14;
      }
      if ((l & 0xFFFFC000) == 0L) {
        break;
      }
      return i + 1;
    }
  }
  
  public static int f(int paramInt)
  {
    if (paramInt >= 0) {
      return g(paramInt);
    }
    return 10;
  }
  
  public static int f(int paramInt1, int paramInt2)
  {
    return e(paramInt1) + f(paramInt2);
  }
  
  public static int f(int paramInt, long paramLong)
  {
    return e(paramInt) + e(i(paramLong));
  }
  
  public static int f(long paramLong)
  {
    return e(i(paramLong));
  }
  
  public static int g(int paramInt)
  {
    if ((paramInt & 0xFFFFFF80) == 0) {
      return 1;
    }
    if ((paramInt & 0xFFFFC000) == 0) {
      return 2;
    }
    if ((0xFFE00000 & paramInt) == 0) {
      return 3;
    }
    if ((0xF0000000 & paramInt) == 0) {
      return 4;
    }
    return 5;
  }
  
  public static int g(int paramInt1, int paramInt2)
  {
    return e(paramInt1) + g(paramInt2);
  }
  
  public static int g(int paramInt, long paramLong)
  {
    return 8 + e(paramInt);
  }
  
  public static int g(long paramLong)
  {
    return 8;
  }
  
  public static int h(int paramInt)
  {
    return g(m(paramInt));
  }
  
  public static int h(int paramInt1, int paramInt2)
  {
    return e(paramInt1) + g(m(paramInt2));
  }
  
  public static int h(int paramInt, long paramLong)
  {
    return 8 + e(paramInt);
  }
  
  public static int h(long paramLong)
  {
    return 8;
  }
  
  public static int i(int paramInt)
  {
    return 4;
  }
  
  public static int i(int paramInt1, int paramInt2)
  {
    return 4 + e(paramInt1);
  }
  
  private static long i(long paramLong)
  {
    return paramLong << 1 ^ paramLong >> 63;
  }
  
  public static int j(int paramInt)
  {
    return 4;
  }
  
  public static int j(int paramInt1, int paramInt2)
  {
    return 4 + e(paramInt1);
  }
  
  public static int k(int paramInt)
  {
    return f(paramInt);
  }
  
  public static int k(int paramInt1, int paramInt2)
  {
    return e(paramInt1) + f(paramInt2);
  }
  
  @Deprecated
  public static int l(int paramInt)
  {
    return g(paramInt);
  }
  
  private static int m(int paramInt)
  {
    return paramInt << 1 ^ paramInt >> 31;
  }
  
  public abstract int a();
  
  public abstract void a(byte paramByte);
  
  public final void a(double paramDouble)
  {
    c(Double.doubleToRawLongBits(paramDouble));
  }
  
  public final void a(float paramFloat)
  {
    d(Float.floatToRawIntBits(paramFloat));
  }
  
  public abstract void a(int paramInt);
  
  public final void a(int paramInt, double paramDouble)
  {
    c(paramInt, Double.doubleToRawLongBits(paramDouble));
  }
  
  public final void a(int paramInt, float paramFloat)
  {
    e(paramInt, Float.floatToRawIntBits(paramFloat));
  }
  
  public abstract void a(int paramInt1, int paramInt2);
  
  public abstract void a(int paramInt, long paramLong);
  
  public abstract void a(int paramInt, acl paramacl);
  
  abstract void a(int paramInt, acl paramacl, ade paramade);
  
  public abstract void a(int paramInt, zw paramzw);
  
  public abstract void a(int paramInt, String paramString);
  
  public abstract void a(int paramInt, boolean paramBoolean);
  
  public abstract void a(long paramLong);
  
  public abstract void a(acl paramacl);
  
  public abstract void a(zw paramzw);
  
  public abstract void a(String paramString);
  
  final void a(String paramString, aei paramaei)
  {
    b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", paramaei);
    byte[] arrayOfByte = paramString.getBytes(abg.a);
    try
    {
      b(arrayOfByte.length);
      a(arrayOfByte, 0, arrayOfByte.length);
      return;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      throw new b(localIndexOutOfBoundsException);
    }
    catch (b localb)
    {
      throw localb;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = 1;; i = 0)
    {
      a((byte)i);
      return;
    }
  }
  
  public final void b()
  {
    if (a() != 0) {
      throw new IllegalStateException("Did not write as much data as expected.");
    }
  }
  
  public abstract void b(int paramInt);
  
  public abstract void b(int paramInt1, int paramInt2);
  
  public final void b(int paramInt, long paramLong)
  {
    a(paramInt, i(paramLong));
  }
  
  public abstract void b(int paramInt, zw paramzw);
  
  public final void b(long paramLong)
  {
    a(i(paramLong));
  }
  
  public abstract void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  public final void c(int paramInt)
  {
    b(m(paramInt));
  }
  
  public abstract void c(int paramInt1, int paramInt2);
  
  public abstract void c(int paramInt, long paramLong);
  
  public abstract void c(long paramLong);
  
  abstract void c(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  public abstract void d(int paramInt);
  
  public final void d(int paramInt1, int paramInt2)
  {
    c(paramInt1, m(paramInt2));
  }
  
  public abstract void e(int paramInt1, int paramInt2);
  
  static final class a
    extends aak
  {
    private final byte[] b;
    private final int c;
    private final int d;
    private int e;
    
    a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      super();
      if (paramArrayOfByte == null) {
        throw new NullPointerException("buffer");
      }
      if ((paramInt2 | 0x0 | paramArrayOfByte.length - (paramInt2 + 0)) < 0)
      {
        Object[] arrayOfObject = new Object[3];
        arrayOfObject[0] = Integer.valueOf(paramArrayOfByte.length);
        arrayOfObject[1] = Integer.valueOf(0);
        arrayOfObject[2] = Integer.valueOf(paramInt2);
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", arrayOfObject));
      }
      this.b = paramArrayOfByte;
      this.c = 0;
      this.e = 0;
      this.d = (paramInt2 + 0);
    }
    
    public final int a()
    {
      return this.d - this.e;
    }
    
    public final void a(byte paramByte)
    {
      try
      {
        byte[] arrayOfByte = this.b;
        int i = this.e;
        this.e = (i + 1);
        arrayOfByte[i] = paramByte;
        return;
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        Object[] arrayOfObject = new Object[3];
        arrayOfObject[0] = Integer.valueOf(this.e);
        arrayOfObject[1] = Integer.valueOf(this.d);
        arrayOfObject[2] = Integer.valueOf(1);
        throw new aak.b(String.format("Pos: %d, limit: %d, len: %d", arrayOfObject), localIndexOutOfBoundsException);
      }
    }
    
    public final void a(int paramInt)
    {
      if (paramInt >= 0)
      {
        b(paramInt);
        return;
      }
      a(paramInt);
    }
    
    public final void a(int paramInt1, int paramInt2)
    {
      b(paramInt2 | paramInt1 << 3);
    }
    
    public final void a(int paramInt, long paramLong)
    {
      a(paramInt, 0);
      a(paramLong);
    }
    
    public final void a(int paramInt, acl paramacl)
    {
      a(1, 3);
      c(2, paramInt);
      a(3, 2);
      a(paramacl);
      a(1, 4);
    }
    
    final void a(int paramInt, acl paramacl, ade paramade)
    {
      a(paramInt, 2);
      zl localzl = (zl)paramacl;
      int i = localzl.j();
      if (i == -1)
      {
        i = paramade.b(localzl);
        localzl.a(i);
      }
      b(i);
      paramade.a(paramacl, this.a);
    }
    
    public final void a(int paramInt, zw paramzw)
    {
      a(paramInt, 2);
      a(paramzw);
    }
    
    public final void a(int paramInt, String paramString)
    {
      a(paramInt, 2);
      a(paramString);
    }
    
    public final void a(int paramInt, boolean paramBoolean)
    {
      a(paramInt, 0);
      int i = 0;
      if (paramBoolean) {
        i = 1;
      }
      a((byte)i);
    }
    
    public final void a(long paramLong)
    {
      if ((aak.c()) && (a() >= 10)) {
        for (;;)
        {
          if ((paramLong & 0xFFFFFF80) == 0L)
          {
            byte[] arrayOfByte4 = this.b;
            int m = this.e;
            this.e = (m + 1);
            aed.a(arrayOfByte4, m, (byte)(int)paramLong);
            return;
          }
          byte[] arrayOfByte3 = this.b;
          int k = this.e;
          this.e = (k + 1);
          aed.a(arrayOfByte3, k, (byte)(0x80 | 0x7F & (int)paramLong));
          paramLong >>>= 7;
        }
      }
      try
      {
        do
        {
          byte[] arrayOfByte2 = this.b;
          int j = this.e;
          this.e = (j + 1);
          arrayOfByte2[j] = ((byte)(0x80 | 0x7F & (int)paramLong));
          paramLong >>>= 7;
        } while ((paramLong & 0xFFFFFF80) != 0L);
        byte[] arrayOfByte1 = this.b;
        int i = this.e;
        this.e = (i + 1);
        arrayOfByte1[i] = ((byte)(int)paramLong);
        return;
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        Object[] arrayOfObject = new Object[3];
        arrayOfObject[0] = Integer.valueOf(this.e);
        arrayOfObject[1] = Integer.valueOf(this.d);
        arrayOfObject[2] = Integer.valueOf(1);
        throw new aak.b(String.format("Pos: %d, limit: %d, len: %d", arrayOfObject), localIndexOutOfBoundsException);
      }
    }
    
    public final void a(acl paramacl)
    {
      b(paramacl.l());
      paramacl.a(this);
    }
    
    public final void a(zw paramzw)
    {
      b(paramzw.a());
      paramzw.a(this);
    }
    
    public final void a(String paramString)
    {
      int i = this.e;
      try
      {
        int j = g(3 * paramString.length());
        int k = g(paramString.length());
        if (k == j)
        {
          this.e = (i + k);
          int m = aef.a(paramString, this.b, this.e, a());
          this.e = i;
          b(m - i - k);
          this.e = m;
          return;
        }
        b(aef.a(paramString));
        this.e = aef.a(paramString, this.b, this.e, a());
        return;
      }
      catch (aei localaei)
      {
        this.e = i;
        a(paramString, localaei);
        return;
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        throw new aak.b(localIndexOutOfBoundsException);
      }
    }
    
    public final void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      b(paramArrayOfByte, paramInt1, paramInt2);
    }
    
    public final void b(int paramInt)
    {
      if ((aak.c()) && (a() >= 10)) {
        for (;;)
        {
          if ((paramInt & 0xFFFFFF80) == 0)
          {
            byte[] arrayOfByte4 = this.b;
            int m = this.e;
            this.e = (m + 1);
            aed.a(arrayOfByte4, m, (byte)paramInt);
            return;
          }
          byte[] arrayOfByte3 = this.b;
          int k = this.e;
          this.e = (k + 1);
          aed.a(arrayOfByte3, k, (byte)(0x80 | paramInt & 0x7F));
          paramInt >>>= 7;
        }
      }
      try
      {
        do
        {
          byte[] arrayOfByte2 = this.b;
          int j = this.e;
          this.e = (j + 1);
          arrayOfByte2[j] = ((byte)(0x80 | paramInt & 0x7F));
          paramInt >>>= 7;
        } while ((paramInt & 0xFFFFFF80) != 0);
        byte[] arrayOfByte1 = this.b;
        int i = this.e;
        this.e = (i + 1);
        arrayOfByte1[i] = ((byte)paramInt);
        return;
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        Object[] arrayOfObject = new Object[3];
        arrayOfObject[0] = Integer.valueOf(this.e);
        arrayOfObject[1] = Integer.valueOf(this.d);
        arrayOfObject[2] = Integer.valueOf(1);
        throw new aak.b(String.format("Pos: %d, limit: %d, len: %d", arrayOfObject), localIndexOutOfBoundsException);
      }
    }
    
    public final void b(int paramInt1, int paramInt2)
    {
      a(paramInt1, 0);
      a(paramInt2);
    }
    
    public final void b(int paramInt, zw paramzw)
    {
      a(1, 3);
      c(2, paramInt);
      a(3, paramzw);
      a(1, 4);
    }
    
    public final void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      try
      {
        System.arraycopy(paramArrayOfByte, paramInt1, this.b, this.e, paramInt2);
        this.e = (paramInt2 + this.e);
        return;
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        Object[] arrayOfObject = new Object[3];
        arrayOfObject[0] = Integer.valueOf(this.e);
        arrayOfObject[1] = Integer.valueOf(this.d);
        arrayOfObject[2] = Integer.valueOf(paramInt2);
        throw new aak.b(String.format("Pos: %d, limit: %d, len: %d", arrayOfObject), localIndexOutOfBoundsException);
      }
    }
    
    public final void c(int paramInt1, int paramInt2)
    {
      a(paramInt1, 0);
      b(paramInt2);
    }
    
    public final void c(int paramInt, long paramLong)
    {
      a(paramInt, 1);
      c(paramLong);
    }
    
    public final void c(long paramLong)
    {
      try
      {
        byte[] arrayOfByte1 = this.b;
        int i = this.e;
        this.e = (i + 1);
        arrayOfByte1[i] = ((byte)(int)paramLong);
        byte[] arrayOfByte2 = this.b;
        int j = this.e;
        this.e = (j + 1);
        arrayOfByte2[j] = ((byte)(int)(paramLong >> 8));
        byte[] arrayOfByte3 = this.b;
        int k = this.e;
        this.e = (k + 1);
        arrayOfByte3[k] = ((byte)(int)(paramLong >> 16));
        byte[] arrayOfByte4 = this.b;
        int m = this.e;
        this.e = (m + 1);
        arrayOfByte4[m] = ((byte)(int)(paramLong >> 24));
        byte[] arrayOfByte5 = this.b;
        int n = this.e;
        this.e = (n + 1);
        arrayOfByte5[n] = ((byte)(int)(paramLong >> 32));
        byte[] arrayOfByte6 = this.b;
        int i1 = this.e;
        this.e = (i1 + 1);
        arrayOfByte6[i1] = ((byte)(int)(paramLong >> 40));
        byte[] arrayOfByte7 = this.b;
        int i2 = this.e;
        this.e = (i2 + 1);
        arrayOfByte7[i2] = ((byte)(int)(paramLong >> 48));
        byte[] arrayOfByte8 = this.b;
        int i3 = this.e;
        this.e = (i3 + 1);
        arrayOfByte8[i3] = ((byte)(int)(paramLong >> 56));
        return;
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        Object[] arrayOfObject = new Object[3];
        arrayOfObject[0] = Integer.valueOf(this.e);
        arrayOfObject[1] = Integer.valueOf(this.d);
        arrayOfObject[2] = Integer.valueOf(1);
        throw new aak.b(String.format("Pos: %d, limit: %d, len: %d", arrayOfObject), localIndexOutOfBoundsException);
      }
    }
    
    public final void c(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      b(paramInt2);
      b(paramArrayOfByte, 0, paramInt2);
    }
    
    public final void d(int paramInt)
    {
      try
      {
        byte[] arrayOfByte1 = this.b;
        int i = this.e;
        this.e = (i + 1);
        arrayOfByte1[i] = ((byte)paramInt);
        byte[] arrayOfByte2 = this.b;
        int j = this.e;
        this.e = (j + 1);
        arrayOfByte2[j] = ((byte)(paramInt >> 8));
        byte[] arrayOfByte3 = this.b;
        int k = this.e;
        this.e = (k + 1);
        arrayOfByte3[k] = ((byte)(paramInt >> 16));
        byte[] arrayOfByte4 = this.b;
        int m = this.e;
        this.e = (m + 1);
        arrayOfByte4[m] = ((byte)(paramInt >> 24));
        return;
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        Object[] arrayOfObject = new Object[3];
        arrayOfObject[0] = Integer.valueOf(this.e);
        arrayOfObject[1] = Integer.valueOf(this.d);
        arrayOfObject[2] = Integer.valueOf(1);
        throw new aak.b(String.format("Pos: %d, limit: %d, len: %d", arrayOfObject), localIndexOutOfBoundsException);
      }
    }
    
    public final void e(int paramInt1, int paramInt2)
    {
      a(paramInt1, 5);
      d(paramInt2);
    }
  }
  
  public static final class b
    extends IOException
  {
    b()
    {
      super();
    }
    
    b(String paramString, Throwable paramThrowable) {}
    
    b(Throwable paramThrowable)
    {
      super(paramThrowable);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aak
 * JD-Core Version:    0.7.0.1
 */