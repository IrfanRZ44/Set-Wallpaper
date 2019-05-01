package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class abz
  extends zq<Long>
  implements abj<Long>, RandomAccess
{
  private static final abz a;
  private long[] b;
  private int c;
  
  static
  {
    abz localabz = new abz();
    a = localabz;
    localabz.b();
  }
  
  abz()
  {
    this(new long[10], 0);
  }
  
  private abz(long[] paramArrayOfLong, int paramInt)
  {
    this.b = paramArrayOfLong;
    this.c = paramInt;
  }
  
  private final void a(int paramInt, long paramLong)
  {
    c();
    if ((paramInt < 0) || (paramInt > this.c)) {
      throw new IndexOutOfBoundsException(d(paramInt));
    }
    if (this.c < this.b.length) {
      System.arraycopy(this.b, paramInt, this.b, paramInt + 1, this.c - paramInt);
    }
    for (;;)
    {
      this.b[paramInt] = paramLong;
      this.c = (1 + this.c);
      this.modCount = (1 + this.modCount);
      return;
      long[] arrayOfLong = new long[1 + 3 * this.c / 2];
      System.arraycopy(this.b, 0, arrayOfLong, 0, paramInt);
      System.arraycopy(this.b, paramInt, arrayOfLong, paramInt + 1, this.c - paramInt);
      this.b = arrayOfLong;
    }
  }
  
  private final void c(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.c)) {
      throw new IndexOutOfBoundsException(d(paramInt));
    }
  }
  
  private final String d(int paramInt)
  {
    int i = this.c;
    return 35 + "Index:" + paramInt + ", Size:" + i;
  }
  
  public final void a(long paramLong)
  {
    a(this.c, paramLong);
  }
  
  public final boolean addAll(Collection<? extends Long> paramCollection)
  {
    c();
    abg.a(paramCollection);
    boolean bool;
    if (!(paramCollection instanceof abz)) {
      bool = super.addAll(paramCollection);
    }
    abz localabz;
    int i;
    do
    {
      return bool;
      localabz = (abz)paramCollection;
      i = localabz.c;
      bool = false;
    } while (i == 0);
    if (2147483647 - this.c < localabz.c) {
      throw new OutOfMemoryError();
    }
    int j = this.c + localabz.c;
    if (j > this.b.length) {
      this.b = Arrays.copyOf(this.b, j);
    }
    System.arraycopy(localabz.b, 0, this.b, this.c, localabz.c);
    this.c = j;
    this.modCount = (1 + this.modCount);
    return true;
  }
  
  public final long b(int paramInt)
  {
    c(paramInt);
    return this.b[paramInt];
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1;
    if (this == paramObject) {
      bool1 = true;
    }
    abz localabz;
    int i;
    int j;
    do
    {
      return bool1;
      if (!(paramObject instanceof abz)) {
        return super.equals(paramObject);
      }
      localabz = (abz)paramObject;
      i = this.c;
      j = localabz.c;
      bool1 = false;
    } while (i != j);
    long[] arrayOfLong = localabz.b;
    for (int k = 0;; k++)
    {
      if (k >= this.c) {
        break label96;
      }
      boolean bool2 = this.b[k] < arrayOfLong[k];
      bool1 = false;
      if (bool2) {
        break;
      }
    }
    label96:
    return true;
  }
  
  public final int hashCode()
  {
    int i = 1;
    for (int j = 0; j < this.c; j++) {
      i = i * 31 + abg.a(this.b[j]);
    }
    return i;
  }
  
  public final boolean remove(Object paramObject)
  {
    c();
    for (int i = 0;; i++)
    {
      int j = this.c;
      boolean bool = false;
      if (i < j)
      {
        if (paramObject.equals(Long.valueOf(this.b[i])))
        {
          System.arraycopy(this.b, i + 1, this.b, i, this.c - i);
          this.c = (-1 + this.c);
          this.modCount = (1 + this.modCount);
          bool = true;
        }
      }
      else {
        return bool;
      }
    }
  }
  
  protected final void removeRange(int paramInt1, int paramInt2)
  {
    c();
    if (paramInt2 < paramInt1) {
      throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }
    System.arraycopy(this.b, paramInt2, this.b, paramInt1, this.c - paramInt2);
    this.c -= paramInt2 - paramInt1;
    this.modCount = (1 + this.modCount);
  }
  
  public final int size()
  {
    return this.c;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.abz
 * JD-Core Version:    0.7.0.1
 */