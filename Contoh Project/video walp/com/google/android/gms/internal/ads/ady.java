package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class ady
{
  private static final ady a = new ady(0, new int[0], new Object[0], false);
  private int b;
  private int[] c;
  private Object[] d;
  private int e = -1;
  private boolean f;
  
  private ady()
  {
    this(0, new int[8], new Object[8], true);
  }
  
  private ady(int paramInt, int[] paramArrayOfInt, Object[] paramArrayOfObject, boolean paramBoolean)
  {
    this.b = paramInt;
    this.c = paramArrayOfInt;
    this.d = paramArrayOfObject;
    this.f = paramBoolean;
  }
  
  public static ady a()
  {
    return a;
  }
  
  static ady a(ady paramady1, ady paramady2)
  {
    int i = paramady1.b + paramady2.b;
    int[] arrayOfInt = Arrays.copyOf(paramady1.c, i);
    System.arraycopy(paramady2.c, 0, arrayOfInt, paramady1.b, paramady2.b);
    Object[] arrayOfObject = Arrays.copyOf(paramady1.d, i);
    System.arraycopy(paramady2.d, 0, arrayOfObject, paramady1.b, paramady2.b);
    return new ady(i, arrayOfInt, arrayOfObject, true);
  }
  
  private static void a(int paramInt, Object paramObject, aer paramaer)
  {
    int i = paramInt >>> 3;
    switch (paramInt & 0x7)
    {
    case 4: 
    default: 
      throw new RuntimeException(abk.f());
    case 0: 
      paramaer.a(i, ((Long)paramObject).longValue());
      return;
    case 5: 
      paramaer.d(i, ((Integer)paramObject).intValue());
      return;
    case 1: 
      paramaer.d(i, ((Long)paramObject).longValue());
      return;
    case 2: 
      paramaer.a(i, (zw)paramObject);
      return;
    }
    if (paramaer.a() == abe.e.j)
    {
      paramaer.a(i);
      ((ady)paramObject).b(paramaer);
      paramaer.b(i);
      return;
    }
    paramaer.b(i);
    ((ady)paramObject).b(paramaer);
    paramaer.a(i);
  }
  
  static ady b()
  {
    return new ady();
  }
  
  final void a(int paramInt, Object paramObject)
  {
    if (!this.f) {
      throw new UnsupportedOperationException();
    }
    if (this.b == this.c.length) {
      if (this.b >= 4) {
        break label103;
      }
    }
    label103:
    for (int i = 8;; i = this.b >> 1)
    {
      int j = i + this.b;
      this.c = Arrays.copyOf(this.c, j);
      this.d = Arrays.copyOf(this.d, j);
      this.c[this.b] = paramInt;
      this.d[this.b] = paramObject;
      this.b = (1 + this.b);
      return;
    }
  }
  
  final void a(aer paramaer)
  {
    if (paramaer.a() == abe.e.k) {
      for (int j = -1 + this.b; j >= 0; j--) {
        paramaer.a(this.c[j] >>> 3, this.d[j]);
      }
    }
    for (int i = 0; i < this.b; i++) {
      paramaer.a(this.c[i] >>> 3, this.d[i]);
    }
  }
  
  final void a(StringBuilder paramStringBuilder, int paramInt)
  {
    for (int i = 0; i < this.b; i++) {
      aco.a(paramStringBuilder, paramInt, String.valueOf(this.c[i] >>> 3), this.d[i]);
    }
  }
  
  public final void b(aer paramaer)
  {
    if (this.b == 0) {}
    for (;;)
    {
      return;
      if (paramaer.a() == abe.e.j) {
        for (int j = 0; j < this.b; j++) {
          a(this.c[j], this.d[j], paramaer);
        }
      } else {
        for (int i = -1 + this.b; i >= 0; i--) {
          a(this.c[i], this.d[i], paramaer);
        }
      }
    }
  }
  
  public final void c()
  {
    this.f = false;
  }
  
  public final int d()
  {
    int i = this.e;
    if (i != -1) {
      return i;
    }
    int j = 0;
    int k = 0;
    while (j < this.b)
    {
      k += aak.d(this.c[j] >>> 3, (zw)this.d[j]);
      j++;
    }
    this.e = k;
    return k;
  }
  
  public final int e()
  {
    int i = this.e;
    if (i != -1) {
      return i;
    }
    int j = 0;
    int k = 0;
    if (j < this.b)
    {
      int m = this.c[j];
      int n = m >>> 3;
      switch (m & 0x7)
      {
      case 4: 
      default: 
        throw new IllegalStateException(abk.f());
      case 0: 
        k += aak.e(n, ((Long)this.d[j]).longValue());
      }
      for (;;)
      {
        j++;
        break;
        k += aak.i(n, ((Integer)this.d[j]).intValue());
        continue;
        k += aak.g(n, ((Long)this.d[j]).longValue());
        continue;
        k += aak.c(n, (zw)this.d[j]);
        continue;
        k += (aak.e(n) << 1) + ((ady)this.d[j]).e();
      }
    }
    this.e = k;
    return k;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    label139:
    label145:
    label151:
    label157:
    label161:
    for (;;)
    {
      return true;
      if (paramObject == null) {
        return false;
      }
      if (!(paramObject instanceof ady)) {
        return false;
      }
      ady localady = (ady)paramObject;
      int j;
      int k;
      label80:
      int n;
      if (this.b == localady.b)
      {
        int[] arrayOfInt1 = this.c;
        int[] arrayOfInt2 = localady.c;
        int i = this.b;
        j = 0;
        if (j >= i) {
          break label145;
        }
        if (arrayOfInt1[j] == arrayOfInt2[j]) {
          break label139;
        }
        k = 0;
        if (k != 0)
        {
          Object[] arrayOfObject1 = this.d;
          Object[] arrayOfObject2 = localady.d;
          int m = this.b;
          n = 0;
          label106:
          if (n >= m) {
            break label157;
          }
          if (arrayOfObject1[n].equals(arrayOfObject2[n])) {
            break label151;
          }
        }
      }
      for (int i1 = 0;; i1 = 1)
      {
        if (i1 != 0) {
          break label161;
        }
        return false;
        j++;
        break;
        k = 1;
        break label80;
        n++;
        break label106;
      }
    }
  }
  
  public final int hashCode()
  {
    int i = 17;
    int j = 0;
    int k = 31 * (527 + this.b);
    int[] arrayOfInt = this.c;
    int m = this.b;
    int n = 0;
    int i1 = i;
    while (n < m)
    {
      i1 = i1 * 31 + arrayOfInt[n];
      n++;
    }
    int i2 = 31 * (k + i1);
    Object[] arrayOfObject = this.d;
    int i3 = this.b;
    while (j < i3)
    {
      i = i * 31 + arrayOfObject[j].hashCode();
      j++;
    }
    return i2 + i;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ady
 * JD-Core Version:    0.7.0.1
 */