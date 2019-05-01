package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class abc
  extends zq<Float>
  implements abj<Float>, RandomAccess
{
  private static final abc a;
  private float[] b;
  private int c;
  
  static
  {
    abc localabc = new abc();
    a = localabc;
    localabc.b();
  }
  
  abc()
  {
    this(new float[10], 0);
  }
  
  private abc(float[] paramArrayOfFloat, int paramInt)
  {
    this.b = paramArrayOfFloat;
    this.c = paramInt;
  }
  
  private final void a(int paramInt, float paramFloat)
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
      this.b[paramInt] = paramFloat;
      this.c = (1 + this.c);
      this.modCount = (1 + this.modCount);
      return;
      float[] arrayOfFloat = new float[1 + 3 * this.c / 2];
      System.arraycopy(this.b, 0, arrayOfFloat, 0, paramInt);
      System.arraycopy(this.b, paramInt, arrayOfFloat, paramInt + 1, this.c - paramInt);
      this.b = arrayOfFloat;
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
  
  public final void a(float paramFloat)
  {
    a(this.c, paramFloat);
  }
  
  public final boolean addAll(Collection<? extends Float> paramCollection)
  {
    c();
    abg.a(paramCollection);
    boolean bool;
    if (!(paramCollection instanceof abc)) {
      bool = super.addAll(paramCollection);
    }
    abc localabc;
    int i;
    do
    {
      return bool;
      localabc = (abc)paramCollection;
      i = localabc.c;
      bool = false;
    } while (i == 0);
    if (2147483647 - this.c < localabc.c) {
      throw new OutOfMemoryError();
    }
    int j = this.c + localabc.c;
    if (j > this.b.length) {
      this.b = Arrays.copyOf(this.b, j);
    }
    System.arraycopy(localabc.b, 0, this.b, this.c, localabc.c);
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
    abc localabc;
    int i;
    int j;
    do
    {
      return bool1;
      if (!(paramObject instanceof abc)) {
        return super.equals(paramObject);
      }
      localabc = (abc)paramObject;
      i = this.c;
      j = localabc.c;
      bool1 = false;
    } while (i != j);
    float[] arrayOfFloat = localabc.b;
    for (int k = 0;; k++)
    {
      if (k >= this.c) {
        break label96;
      }
      boolean bool2 = this.b[k] < arrayOfFloat[k];
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
      i = i * 31 + Float.floatToIntBits(this.b[j]);
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
        if (paramObject.equals(Float.valueOf(this.b[i])))
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
 * Qualified Name:     com.google.android.gms.internal.ads.abc
 * JD-Core Version:    0.7.0.1
 */