package com.google.android.gms.internal.ads;

import java.util.Arrays;

final class aah
  extends aaf
{
  private final byte[] d;
  private final boolean e;
  private int f;
  private int g;
  private int h;
  private int i;
  private int j;
  private int k = 2147483647;
  
  private aah(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    super(null);
    this.d = paramArrayOfByte;
    this.f = (paramInt1 + paramInt2);
    this.h = paramInt1;
    this.i = this.h;
    this.e = paramBoolean;
  }
  
  private final byte A()
  {
    if (this.h == this.f) {
      throw abk.a();
    }
    byte[] arrayOfByte = this.d;
    int m = this.h;
    this.h = (m + 1);
    return arrayOfByte[m];
  }
  
  private final int v()
  {
    int m = this.h;
    byte[] arrayOfByte;
    int i2;
    int i3;
    int i9;
    if (this.f != m)
    {
      arrayOfByte = this.d;
      int n = m + 1;
      int i1 = arrayOfByte[m];
      if (i1 >= 0)
      {
        this.h = n;
        return i1;
      }
      if (this.f - n >= 9)
      {
        i2 = n + 1;
        i3 = i1 ^ arrayOfByte[n] << 7;
        if (i3 < 0) {
          i9 = i3 ^ 0xFFFFFF80;
        }
      }
    }
    for (;;)
    {
      this.h = i2;
      return i9;
      int i4 = i2 + 1;
      int i5 = i3 ^ arrayOfByte[i2] << 14;
      if (i5 >= 0)
      {
        i9 = i5 ^ 0x3F80;
        i2 = i4;
      }
      else
      {
        i2 = i4 + 1;
        int i6 = i5 ^ arrayOfByte[i4] << 21;
        if (i6 < 0)
        {
          i9 = i6 ^ 0xFFE03F80;
        }
        else
        {
          int i7 = i2 + 1;
          int i8 = arrayOfByte[i2];
          i9 = 0xFE03F80 ^ i6 ^ i8 << 28;
          if (i8 < 0)
          {
            i2 = i7 + 1;
            if (arrayOfByte[i7] >= 0) {
              continue;
            }
            i7 = i2 + 1;
            if (arrayOfByte[i2] < 0)
            {
              i2 = i7 + 1;
              if (arrayOfByte[i7] >= 0) {
                continue;
              }
              i7 = i2 + 1;
              if (arrayOfByte[i2] < 0)
              {
                i2 = i7 + 1;
                if (arrayOfByte[i7] >= 0) {
                  continue;
                }
                return (int)s();
              }
            }
          }
          i2 = i7;
        }
      }
    }
  }
  
  private final long w()
  {
    int m = this.h;
    byte[] arrayOfByte;
    int i2;
    int i3;
    long l6;
    if (this.f != m)
    {
      arrayOfByte = this.d;
      int n = m + 1;
      int i1 = arrayOfByte[m];
      if (i1 >= 0)
      {
        this.h = n;
        return i1;
      }
      if (this.f - n >= 9)
      {
        i2 = n + 1;
        i3 = i1 ^ arrayOfByte[n] << 7;
        if (i3 < 0) {
          l6 = i3 ^ 0xFFFFFF80;
        }
      }
    }
    for (;;)
    {
      this.h = i2;
      return l6;
      int i4 = i2 + 1;
      int i5 = i3 ^ arrayOfByte[i2] << 14;
      if (i5 >= 0)
      {
        l6 = i5 ^ 0x3F80;
        i2 = i4;
      }
      else
      {
        i2 = i4 + 1;
        int i6 = i5 ^ arrayOfByte[i4] << 21;
        if (i6 < 0)
        {
          l6 = i6 ^ 0xFFE03F80;
        }
        else
        {
          long l1 = i6;
          int i7 = i2 + 1;
          long l2 = l1 ^ arrayOfByte[i2] << 28;
          if (l2 >= 0L)
          {
            l6 = l2 ^ 0xFE03F80;
            i2 = i7;
          }
          else
          {
            i2 = i7 + 1;
            long l3 = l2 ^ arrayOfByte[i7] << 35;
            if (l3 < 0L)
            {
              l6 = l3 ^ 0xFE03F80;
            }
            else
            {
              int i8 = i2 + 1;
              long l4 = l3 ^ arrayOfByte[i2] << 42;
              if (l4 >= 0L)
              {
                l6 = l4 ^ 0xFE03F80;
                i2 = i8;
              }
              else
              {
                i2 = i8 + 1;
                long l5 = l4 ^ arrayOfByte[i8] << 49;
                if (l5 < 0L)
                {
                  l6 = l5 ^ 0xFE03F80;
                }
                else
                {
                  int i9 = i2 + 1;
                  l6 = 0xFE03F80 ^ l5 ^ arrayOfByte[i2] << 56;
                  if (l6 < 0L)
                  {
                    i2 = i9 + 1;
                    if (arrayOfByte[i9] < 0L) {
                      return s();
                    }
                  }
                  else
                  {
                    i2 = i9;
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  private final int x()
  {
    int m = this.h;
    if (this.f - m < 4) {
      throw abk.a();
    }
    byte[] arrayOfByte = this.d;
    this.h = (m + 4);
    return 0xFF & arrayOfByte[m] | (0xFF & arrayOfByte[(m + 1)]) << 8 | (0xFF & arrayOfByte[(m + 2)]) << 16 | (0xFF & arrayOfByte[(m + 3)]) << 24;
  }
  
  private final long y()
  {
    int m = this.h;
    if (this.f - m < 8) {
      throw abk.a();
    }
    byte[] arrayOfByte = this.d;
    this.h = (m + 8);
    return 0xFF & arrayOfByte[m] | (0xFF & arrayOfByte[(m + 1)]) << 8 | (0xFF & arrayOfByte[(m + 2)]) << 16 | (0xFF & arrayOfByte[(m + 3)]) << 24 | (0xFF & arrayOfByte[(m + 4)]) << 32 | (0xFF & arrayOfByte[(m + 5)]) << 40 | (0xFF & arrayOfByte[(m + 6)]) << 48 | (0xFF & arrayOfByte[(m + 7)]) << 56;
  }
  
  private final void z()
  {
    this.f += this.g;
    int m = this.f - this.i;
    if (m > this.k)
    {
      this.g = (m - this.k);
      this.f -= this.g;
      return;
    }
    this.g = 0;
  }
  
  public final int a()
  {
    if (t())
    {
      this.j = 0;
      return 0;
    }
    this.j = v();
    if (this.j >>> 3 == 0) {
      throw abk.d();
    }
    return this.j;
  }
  
  public final void a(int paramInt)
  {
    if (this.j != paramInt) {
      throw abk.e();
    }
  }
  
  public final double b()
  {
    return Double.longBitsToDouble(y());
  }
  
  public final boolean b(int paramInt)
  {
    switch (paramInt & 0x7)
    {
    default: 
      throw abk.f();
    case 0: 
      int n = this.f - this.h;
      int i1 = 0;
      if (n >= 10)
      {
        while (i1 < 10)
        {
          byte[] arrayOfByte = this.d;
          int i2 = this.h;
          this.h = (i2 + 1);
          if (arrayOfByte[i2] >= 0) {
            break label142;
          }
          i1++;
        }
        throw abk.c();
      }
      while (i1 < 10)
      {
        if (A() >= 0) {
          break label142;
        }
        i1++;
      }
      throw abk.c();
    case 1: 
      e(8);
      return true;
    case 2: 
      e(v());
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
      label142:
      return false;
    }
    e(4);
    return true;
  }
  
  public final float c()
  {
    return Float.intBitsToFloat(x());
  }
  
  public final int c(int paramInt)
  {
    if (paramInt < 0) {
      throw abk.b();
    }
    int m = paramInt + u();
    int n = this.k;
    if (m > n) {
      throw abk.a();
    }
    this.k = m;
    z();
    return n;
  }
  
  public final long d()
  {
    return w();
  }
  
  public final void d(int paramInt)
  {
    this.k = paramInt;
    z();
  }
  
  public final long e()
  {
    return w();
  }
  
  public final void e(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt <= this.f - this.h))
    {
      this.h = (paramInt + this.h);
      return;
    }
    if (paramInt < 0) {
      throw abk.b();
    }
    throw abk.a();
  }
  
  public final int f()
  {
    return v();
  }
  
  public final long g()
  {
    return y();
  }
  
  public final int h()
  {
    return x();
  }
  
  public final boolean i()
  {
    return w() != 0L;
  }
  
  public final String j()
  {
    int m = v();
    if ((m > 0) && (m <= this.f - this.h))
    {
      String str = new String(this.d, this.h, m, abg.a);
      this.h = (m + this.h);
      return str;
    }
    if (m == 0) {
      return "";
    }
    if (m < 0) {
      throw abk.b();
    }
    throw abk.a();
  }
  
  public final String k()
  {
    int m = v();
    if ((m > 0) && (m <= this.f - this.h))
    {
      if (!aef.a(this.d, this.h, m + this.h)) {
        throw abk.h();
      }
      int n = this.h;
      this.h = (m + this.h);
      return new String(this.d, n, m, abg.a);
    }
    if (m == 0) {
      return "";
    }
    if (m <= 0) {
      throw abk.b();
    }
    throw abk.a();
  }
  
  public final zw l()
  {
    int m = v();
    if ((m > 0) && (m <= this.f - this.h))
    {
      zw localzw = zw.a(this.d, this.h, m);
      this.h = (m + this.h);
      return localzw;
    }
    if (m == 0) {
      return zw.a;
    }
    int n;
    if ((m > 0) && (m <= this.f - this.h))
    {
      n = this.h;
      this.h = (m + this.h);
    }
    for (byte[] arrayOfByte = Arrays.copyOfRange(this.d, n, this.h);; arrayOfByte = abg.b)
    {
      return zw.b(arrayOfByte);
      if (m > 0) {
        break label126;
      }
      if (m != 0) {
        break;
      }
    }
    throw abk.b();
    label126:
    throw abk.a();
  }
  
  public final int m()
  {
    return v();
  }
  
  public final int n()
  {
    return v();
  }
  
  public final int o()
  {
    return x();
  }
  
  public final long p()
  {
    return y();
  }
  
  public final int q()
  {
    return f(v());
  }
  
  public final long r()
  {
    return a(w());
  }
  
  final long s()
  {
    long l = 0L;
    for (int m = 0; m < 64; m += 7)
    {
      int n = A();
      l |= (n & 0x7F) << m;
      if ((n & 0x80) == 0) {
        return l;
      }
    }
    throw abk.c();
  }
  
  public final boolean t()
  {
    return this.h == this.f;
  }
  
  public final int u()
  {
    return this.h - this.i;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aah
 * JD-Core Version:    0.7.0.1
 */