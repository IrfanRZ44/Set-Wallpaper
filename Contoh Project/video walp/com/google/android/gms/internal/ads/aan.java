package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class aan
  extends zq<Double>
  implements abj<Double>, RandomAccess
{
  private static final aan a;
  private double[] b;
  private int c;
  
  static
  {
    aan localaan = new aan();
    a = localaan;
    localaan.b();
  }
  
  aan()
  {
    this(new double[10], 0);
  }
  
  private aan(double[] paramArrayOfDouble, int paramInt)
  {
    this.b = paramArrayOfDouble;
    this.c = paramInt;
  }
  
  private final void a(int paramInt, double paramDouble)
  {
    c();
    if ((paramInt < 0) || (paramInt > this.c)) {
      throw new IndexOutOfBoundsException(c(paramInt));
    }
    if (this.c < this.b.length) {
      System.arraycopy(this.b, paramInt, this.b, paramInt + 1, this.c - paramInt);
    }
    for (;;)
    {
      this.b[paramInt] = paramDouble;
      this.c = (1 + this.c);
      this.modCount = (1 + this.modCount);
      return;
      double[] arrayOfDouble = new double[1 + 3 * this.c / 2];
      System.arraycopy(this.b, 0, arrayOfDouble, 0, paramInt);
      System.arraycopy(this.b, paramInt, arrayOfDouble, paramInt + 1, this.c - paramInt);
      this.b = arrayOfDouble;
    }
  }
  
  private final void b(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.c)) {
      throw new IndexOutOfBoundsException(c(paramInt));
    }
  }
  
  private final String c(int paramInt)
  {
    int i = this.c;
    return 35 + "Index:" + paramInt + ", Size:" + i;
  }
  
  public final void a(double paramDouble)
  {
    a(this.c, paramDouble);
  }
  
  public final boolean addAll(Collection<? extends Double> paramCollection)
  {
    c();
    abg.a(paramCollection);
    boolean bool;
    if (!(paramCollection instanceof aan)) {
      bool = super.addAll(paramCollection);
    }
    aan localaan;
    int i;
    do
    {
      return bool;
      localaan = (aan)paramCollection;
      i = localaan.c;
      bool = false;
    } while (i == 0);
    if (2147483647 - this.c < localaan.c) {
      throw new OutOfMemoryError();
    }
    int j = this.c + localaan.c;
    if (j > this.b.length) {
      this.b = Arrays.copyOf(this.b, j);
    }
    System.arraycopy(localaan.b, 0, this.b, this.c, localaan.c);
    this.c = j;
    this.modCount = (1 + this.modCount);
    return true;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1;
    if (this == paramObject) {
      bool1 = true;
    }
    aan localaan;
    int i;
    int j;
    do
    {
      return bool1;
      if (!(paramObject instanceof aan)) {
        return super.equals(paramObject);
      }
      localaan = (aan)paramObject;
      i = this.c;
      j = localaan.c;
      bool1 = false;
    } while (i != j);
    double[] arrayOfDouble = localaan.b;
    for (int k = 0;; k++)
    {
      if (k >= this.c) {
        break label96;
      }
      boolean bool2 = this.b[k] < arrayOfDouble[k];
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
    for (int j = 0; j < this.c; j++)
    {
      long l = Double.doubleToLongBits(this.b[j]);
      i = i * 31 + abg.a(l);
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
        if (paramObject.equals(Double.valueOf(this.b[i])))
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
 * Qualified Name:     com.google.android.gms.internal.ads.aan
 * JD-Core Version:    0.7.0.1
 */