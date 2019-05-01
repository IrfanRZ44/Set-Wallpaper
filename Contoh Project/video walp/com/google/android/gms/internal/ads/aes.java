package com.google.android.gms.internal.ads;

public final class aes
{
  private final byte[] a;
  private final int b;
  private final int c;
  private int d;
  private int e;
  private int f;
  private int g;
  private int h = 2147483647;
  private int i;
  private int j = 64;
  private int k = 67108864;
  
  private aes(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.a = paramArrayOfByte;
    this.b = paramInt1;
    int m = paramInt1 + paramInt2;
    this.d = m;
    this.c = m;
    this.f = paramInt1;
  }
  
  public static aes a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return new aes(paramArrayOfByte, 0, paramInt2);
  }
  
  private final void f(int paramInt)
  {
    if (paramInt < 0) {
      throw afb.b();
    }
    if (paramInt + this.f > this.h)
    {
      f(this.h - this.f);
      throw afb.a();
    }
    if (paramInt <= this.d - this.f)
    {
      this.f = (paramInt + this.f);
      return;
    }
    throw afb.a();
  }
  
  private final void k()
  {
    this.d += this.e;
    int m = this.d;
    if (m > this.h)
    {
      this.e = (m - this.h);
      this.d -= this.e;
      return;
    }
    this.e = 0;
  }
  
  private final byte l()
  {
    if (this.f == this.d) {
      throw afb.a();
    }
    byte[] arrayOfByte = this.a;
    int m = this.f;
    this.f = (m + 1);
    return arrayOfByte[m];
  }
  
  public final int a()
  {
    if (this.f == this.d)
    {
      this.g = 0;
      return 0;
    }
    this.g = g();
    if (this.g == 0) {
      throw new afb("Protocol message contained an invalid tag (zero).");
    }
    return this.g;
  }
  
  public final void a(int paramInt)
  {
    if (this.g != paramInt) {
      throw new afb("Protocol message end-group tag did not match expected tag.");
    }
  }
  
  public final void a(afc paramafc)
  {
    int m = g();
    if (this.i >= this.j) {
      throw new afb("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }
    int n = c(m);
    this.i = (1 + this.i);
    paramafc.a(this);
    a(0);
    this.i = (-1 + this.i);
    d(n);
  }
  
  public final byte[] a(int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      return aff.e;
    }
    byte[] arrayOfByte = new byte[paramInt2];
    int m = paramInt1 + this.b;
    System.arraycopy(this.a, m, arrayOfByte, 0, paramInt2);
    return arrayOfByte;
  }
  
  public final long b()
  {
    return h();
  }
  
  final void b(int paramInt1, int paramInt2)
  {
    if (paramInt1 > this.f - this.b)
    {
      int m = this.f - this.b;
      throw new IllegalArgumentException(50 + "Position " + paramInt1 + " is beyond current " + m);
    }
    if (paramInt1 < 0) {
      throw new IllegalArgumentException(24 + "Bad position " + paramInt1);
    }
    this.f = (paramInt1 + this.b);
    this.g = paramInt2;
  }
  
  public final boolean b(int paramInt)
  {
    switch (paramInt & 0x7)
    {
    default: 
      throw new afb("Protocol message tag had invalid wire type.");
    case 0: 
      g();
      return true;
    case 1: 
      l();
      l();
      l();
      l();
      l();
      l();
      l();
      l();
      return true;
    case 2: 
      f(g());
      return true;
    case 3: 
      int m;
      do
      {
        m = a();
      } while ((m != 0) && (b(m)));
      a(0x4 | paramInt >>> 3 << 3);
      return true;
    case 4: 
      return false;
    }
    l();
    l();
    l();
    l();
    return true;
  }
  
  public final int c()
  {
    return g();
  }
  
  public final int c(int paramInt)
  {
    if (paramInt < 0) {
      throw afb.b();
    }
    int m = paramInt + this.f;
    int n = this.h;
    if (m > n) {
      throw afb.a();
    }
    this.h = m;
    k();
    return n;
  }
  
  public final void d(int paramInt)
  {
    this.h = paramInt;
    k();
  }
  
  public final boolean d()
  {
    return g() != 0;
  }
  
  public final String e()
  {
    int m = g();
    if (m < 0) {
      throw afb.b();
    }
    if (m > this.d - this.f) {
      throw afb.a();
    }
    String str = new String(this.a, this.f, m, afa.a);
    this.f = (m + this.f);
    return str;
  }
  
  public final void e(int paramInt)
  {
    b(paramInt, this.g);
  }
  
  public final byte[] f()
  {
    int m = g();
    if (m < 0) {
      throw afb.b();
    }
    if (m == 0) {
      return aff.e;
    }
    if (m > this.d - this.f) {
      throw afb.a();
    }
    byte[] arrayOfByte = new byte[m];
    System.arraycopy(this.a, this.f, arrayOfByte, 0, m);
    this.f = (m + this.f);
    return arrayOfByte;
  }
  
  public final int g()
  {
    int m = l();
    if (m >= 0) {}
    int i7;
    do
    {
      return m;
      int n = m & 0x7F;
      int i1 = l();
      if (i1 >= 0) {
        return n | i1 << 7;
      }
      int i2 = n | (i1 & 0x7F) << 7;
      int i3 = l();
      if (i3 >= 0) {
        return i2 | i3 << 14;
      }
      int i4 = i2 | (i3 & 0x7F) << 14;
      int i5 = l();
      if (i5 >= 0) {
        return i4 | i5 << 21;
      }
      int i6 = i4 | (i5 & 0x7F) << 21;
      i7 = l();
      m = i6 | i7 << 28;
    } while (i7 >= 0);
    for (int i8 = 0;; i8++)
    {
      if (i8 >= 5) {
        break label151;
      }
      if (l() >= 0) {
        break;
      }
    }
    label151:
    throw afb.c();
  }
  
  public final long h()
  {
    int m = 0;
    long l = 0L;
    while (m < 64)
    {
      int n = l();
      l |= (n & 0x7F) << m;
      if ((n & 0x80) == 0) {
        return l;
      }
      m += 7;
    }
    throw afb.c();
  }
  
  public final int i()
  {
    if (this.h == 2147483647) {
      return -1;
    }
    int m = this.f;
    return this.h - m;
  }
  
  public final int j()
  {
    return this.f - this.b;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aes
 * JD-Core Version:    0.7.0.1
 */