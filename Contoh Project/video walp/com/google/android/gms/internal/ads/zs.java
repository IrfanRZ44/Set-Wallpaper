package com.google.android.gms.internal.ads;

final class zs
{
  static int a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, abj<?> paramabj, zt paramzt)
  {
    abf localabf = (abf)paramabj;
    int i = a(paramArrayOfByte, paramInt2, paramzt);
    localabf.c(paramzt.a);
    while (i < paramInt3)
    {
      int j = a(paramArrayOfByte, i, paramzt);
      if (paramInt1 != paramzt.a) {
        break;
      }
      i = a(paramArrayOfByte, j, paramzt);
      localabf.c(paramzt.a);
    }
    return i;
  }
  
  static int a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, ady paramady, zt paramzt)
  {
    if (paramInt1 >>> 3 == 0) {
      throw abk.d();
    }
    switch (paramInt1 & 0x7)
    {
    case 4: 
    default: 
      throw abk.d();
    case 0: 
      int i3 = b(paramArrayOfByte, paramInt2, paramzt);
      paramady.a(paramInt1, Long.valueOf(paramzt.b));
      return i3;
    case 5: 
      paramady.a(paramInt1, Integer.valueOf(a(paramArrayOfByte, paramInt2)));
      return paramInt2 + 4;
    case 1: 
      paramady.a(paramInt1, Long.valueOf(b(paramArrayOfByte, paramInt2)));
      return paramInt2 + 8;
    case 2: 
      int i1 = a(paramArrayOfByte, paramInt2, paramzt);
      int i2 = paramzt.a;
      if (i2 == 0) {
        paramady.a(paramInt1, zw.a);
      }
      for (;;)
      {
        return i1 + i2;
        paramady.a(paramInt1, zw.a(paramArrayOfByte, i1, i2));
      }
    }
    ady localady = ady.b();
    int i = 0x4 | paramInt1 & 0xFFFFFFF8;
    int j = 0;
    for (int k = paramInt2; k < paramInt3; k = a(j, paramArrayOfByte, k, paramInt3, localady, paramzt))
    {
      k = a(paramArrayOfByte, k, paramzt);
      j = paramzt.a;
      if (j == i) {
        break;
      }
    }
    int m = j;
    int n = k;
    if ((n > paramInt3) || (m != i)) {
      throw abk.g();
    }
    paramady.a(paramInt1, localady);
    return n;
  }
  
  static int a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, zt paramzt)
  {
    if (paramInt1 >>> 3 == 0) {
      throw abk.d();
    }
    int n;
    switch (paramInt1 & 0x7)
    {
    case 4: 
    default: 
      throw abk.d();
    case 0: 
      n = b(paramArrayOfByte, paramInt2, paramzt);
    }
    int i;
    int m;
    do
    {
      return n;
      return paramInt2 + 4;
      return paramInt2 + 8;
      return a(paramArrayOfByte, paramInt2, paramzt) + paramzt.a;
      i = 0x4 | paramInt1 & 0xFFFFFFF8;
      int j = 0;
      for (int k = paramInt2; k < paramInt3; k = a(j, paramArrayOfByte, k, paramInt3, paramzt))
      {
        k = a(paramArrayOfByte, k, paramzt);
        j = paramzt.a;
        if (j == i) {
          break;
        }
      }
      m = j;
      n = k;
    } while ((n <= paramInt3) && (m == i));
    throw abk.g();
  }
  
  static int a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, zt paramzt)
  {
    int i = paramInt1 & 0x7F;
    int j = paramInt2 + 1;
    int k = paramArrayOfByte[paramInt2];
    if (k >= 0)
    {
      paramzt.a = (i | k << 7);
      return j;
    }
    int m = i | (k & 0x7F) << 7;
    int n = j + 1;
    int i1 = paramArrayOfByte[j];
    if (i1 >= 0)
    {
      paramzt.a = (m | i1 << 14);
      return n;
    }
    int i2 = m | (i1 & 0x7F) << 14;
    int i3 = n + 1;
    int i4 = paramArrayOfByte[n];
    if (i4 >= 0)
    {
      paramzt.a = (i2 | i4 << 21);
      return i3;
    }
    int i5 = i2 | (i4 & 0x7F) << 21;
    int i6 = i3 + 1;
    int i7 = paramArrayOfByte[i3];
    if (i7 >= 0)
    {
      paramzt.a = (i5 | i7 << 28);
      return i6;
    }
    int i8 = i5 | (i7 & 0x7F) << 28;
    for (;;)
    {
      int i9 = i6 + 1;
      if (paramArrayOfByte[i6] >= 0)
      {
        paramzt.a = i8;
        return i9;
      }
      i6 = i9;
    }
  }
  
  static int a(byte[] paramArrayOfByte, int paramInt)
  {
    return 0xFF & paramArrayOfByte[paramInt] | (0xFF & paramArrayOfByte[(paramInt + 1)]) << 8 | (0xFF & paramArrayOfByte[(paramInt + 2)]) << 16 | (0xFF & paramArrayOfByte[(paramInt + 3)]) << 24;
  }
  
  static int a(byte[] paramArrayOfByte, int paramInt, abj<?> paramabj, zt paramzt)
  {
    abf localabf = (abf)paramabj;
    int i = a(paramArrayOfByte, paramInt, paramzt);
    int j = i + paramzt.a;
    while (i < j)
    {
      i = a(paramArrayOfByte, i, paramzt);
      localabf.c(paramzt.a);
    }
    if (i != j) {
      throw abk.a();
    }
    return i;
  }
  
  static int a(byte[] paramArrayOfByte, int paramInt, zt paramzt)
  {
    int i = paramInt + 1;
    int j = paramArrayOfByte[paramInt];
    if (j >= 0)
    {
      paramzt.a = j;
      return i;
    }
    return a(j, paramArrayOfByte, i, paramzt);
  }
  
  static int b(byte[] paramArrayOfByte, int paramInt, zt paramzt)
  {
    int i = 7;
    int j = paramInt + 1;
    long l1 = paramArrayOfByte[paramInt];
    if (l1 >= 0L)
    {
      paramzt.b = l1;
      return j;
    }
    long l2 = l1 & 0x7F;
    int k = j + 1;
    int m = paramArrayOfByte[j];
    long l3 = l2 | (m & 0x7F) << i;
    int n = k;
    long l4 = l3;
    int i1 = m;
    while (i1 < 0)
    {
      int i2 = n + 1;
      i1 = paramArrayOfByte[n];
      int i3 = i + 7;
      l4 |= (i1 & 0x7F) << i3;
      i = i3;
      n = i2;
    }
    paramzt.b = l4;
    return n;
  }
  
  static long b(byte[] paramArrayOfByte, int paramInt)
  {
    return 0xFF & paramArrayOfByte[paramInt] | (0xFF & paramArrayOfByte[(paramInt + 1)]) << 8 | (0xFF & paramArrayOfByte[(paramInt + 2)]) << 16 | (0xFF & paramArrayOfByte[(paramInt + 3)]) << 24 | (0xFF & paramArrayOfByte[(paramInt + 4)]) << 32 | (0xFF & paramArrayOfByte[(paramInt + 5)]) << 40 | (0xFF & paramArrayOfByte[(paramInt + 6)]) << 48 | (0xFF & paramArrayOfByte[(paramInt + 7)]) << 56;
  }
  
  static double c(byte[] paramArrayOfByte, int paramInt)
  {
    return Double.longBitsToDouble(b(paramArrayOfByte, paramInt));
  }
  
  static int c(byte[] paramArrayOfByte, int paramInt, zt paramzt)
  {
    int i = a(paramArrayOfByte, paramInt, paramzt);
    int j = paramzt.a;
    if (j == 0)
    {
      paramzt.c = "";
      return i;
    }
    paramzt.c = new String(paramArrayOfByte, i, j, abg.a);
    return i + j;
  }
  
  static float d(byte[] paramArrayOfByte, int paramInt)
  {
    return Float.intBitsToFloat(a(paramArrayOfByte, paramInt));
  }
  
  static int d(byte[] paramArrayOfByte, int paramInt, zt paramzt)
  {
    int i = a(paramArrayOfByte, paramInt, paramzt);
    int j = paramzt.a;
    if (j == 0)
    {
      paramzt.c = "";
      return i;
    }
    if (!aef.a(paramArrayOfByte, i, i + j)) {
      throw abk.h();
    }
    paramzt.c = new String(paramArrayOfByte, i, j, abg.a);
    return i + j;
  }
  
  static int e(byte[] paramArrayOfByte, int paramInt, zt paramzt)
  {
    int i = a(paramArrayOfByte, paramInt, paramzt);
    int j = paramzt.a;
    if (j == 0)
    {
      paramzt.c = zw.a;
      return i;
    }
    paramzt.c = zw.a(paramArrayOfByte, i, j);
    return i + j;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.zs
 * JD-Core Version:    0.7.0.1
 */