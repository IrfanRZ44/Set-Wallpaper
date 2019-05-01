package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class abf
  extends zq<Integer>
  implements abj<Integer>, RandomAccess
{
  private static final abf a;
  private int[] b;
  private int c;
  
  static
  {
    abf localabf = new abf();
    a = localabf;
    localabf.b();
  }
  
  abf()
  {
    this(new int[10], 0);
  }
  
  private abf(int[] paramArrayOfInt, int paramInt)
  {
    this.b = paramArrayOfInt;
    this.c = paramInt;
  }
  
  private final void a(int paramInt1, int paramInt2)
  {
    c();
    if ((paramInt1 < 0) || (paramInt1 > this.c)) {
      throw new IndexOutOfBoundsException(e(paramInt1));
    }
    if (this.c < this.b.length) {
      System.arraycopy(this.b, paramInt1, this.b, paramInt1 + 1, this.c - paramInt1);
    }
    for (;;)
    {
      this.b[paramInt1] = paramInt2;
      this.c = (1 + this.c);
      this.modCount = (1 + this.modCount);
      return;
      int[] arrayOfInt = new int[1 + 3 * this.c / 2];
      System.arraycopy(this.b, 0, arrayOfInt, 0, paramInt1);
      System.arraycopy(this.b, paramInt1, arrayOfInt, paramInt1 + 1, this.c - paramInt1);
      this.b = arrayOfInt;
    }
  }
  
  private final void d(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.c)) {
      throw new IndexOutOfBoundsException(e(paramInt));
    }
  }
  
  private final String e(int paramInt)
  {
    int i = this.c;
    return 35 + "Index:" + paramInt + ", Size:" + i;
  }
  
  public final boolean addAll(Collection<? extends Integer> paramCollection)
  {
    c();
    abg.a(paramCollection);
    boolean bool;
    if (!(paramCollection instanceof abf)) {
      bool = super.addAll(paramCollection);
    }
    abf localabf;
    int i;
    do
    {
      return bool;
      localabf = (abf)paramCollection;
      i = localabf.c;
      bool = false;
    } while (i == 0);
    if (2147483647 - this.c < localabf.c) {
      throw new OutOfMemoryError();
    }
    int j = this.c + localabf.c;
    if (j > this.b.length) {
      this.b = Arrays.copyOf(this.b, j);
    }
    System.arraycopy(localabf.b, 0, this.b, this.c, localabf.c);
    this.c = j;
    this.modCount = (1 + this.modCount);
    return true;
  }
  
  public final int b(int paramInt)
  {
    d(paramInt);
    return this.b[paramInt];
  }
  
  public final void c(int paramInt)
  {
    a(this.c, paramInt);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool;
    if (this == paramObject) {
      bool = true;
    }
    abf localabf;
    int i;
    int j;
    do
    {
      return bool;
      if (!(paramObject instanceof abf)) {
        return super.equals(paramObject);
      }
      localabf = (abf)paramObject;
      i = this.c;
      j = localabf.c;
      bool = false;
    } while (i != j);
    int[] arrayOfInt = localabf.b;
    for (int k = 0;; k++)
    {
      if (k >= this.c) {
        break label99;
      }
      int m = this.b[k];
      int n = arrayOfInt[k];
      bool = false;
      if (m != n) {
        break;
      }
    }
    label99:
    return true;
  }
  
  public final int hashCode()
  {
    int i = 1;
    for (int j = 0; j < this.c; j++) {
      i = i * 31 + this.b[j];
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
        if (paramObject.equals(Integer.valueOf(this.b[i])))
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
 * Qualified Name:     com.google.android.gms.internal.ads.abf
 * JD-Core Version:    0.7.0.1
 */