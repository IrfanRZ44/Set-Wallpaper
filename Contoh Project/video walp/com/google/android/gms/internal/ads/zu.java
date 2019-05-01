package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zu
  extends zq<Boolean>
  implements abj<Boolean>, RandomAccess
{
  private static final zu a;
  private boolean[] b;
  private int c;
  
  static
  {
    zu localzu = new zu();
    a = localzu;
    localzu.b();
  }
  
  zu()
  {
    this(new boolean[10], 0);
  }
  
  private zu(boolean[] paramArrayOfBoolean, int paramInt)
  {
    this.b = paramArrayOfBoolean;
    this.c = paramInt;
  }
  
  private final void a(int paramInt, boolean paramBoolean)
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
      this.b[paramInt] = paramBoolean;
      this.c = (1 + this.c);
      this.modCount = (1 + this.modCount);
      return;
      boolean[] arrayOfBoolean = new boolean[1 + 3 * this.c / 2];
      System.arraycopy(this.b, 0, arrayOfBoolean, 0, paramInt);
      System.arraycopy(this.b, paramInt, arrayOfBoolean, paramInt + 1, this.c - paramInt);
      this.b = arrayOfBoolean;
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
  
  public final void a(boolean paramBoolean)
  {
    a(this.c, paramBoolean);
  }
  
  public final boolean addAll(Collection<? extends Boolean> paramCollection)
  {
    c();
    abg.a(paramCollection);
    boolean bool;
    if (!(paramCollection instanceof zu)) {
      bool = super.addAll(paramCollection);
    }
    zu localzu;
    int i;
    do
    {
      return bool;
      localzu = (zu)paramCollection;
      i = localzu.c;
      bool = false;
    } while (i == 0);
    if (2147483647 - this.c < localzu.c) {
      throw new OutOfMemoryError();
    }
    int j = this.c + localzu.c;
    if (j > this.b.length) {
      this.b = Arrays.copyOf(this.b, j);
    }
    System.arraycopy(localzu.b, 0, this.b, this.c, localzu.c);
    this.c = j;
    this.modCount = (1 + this.modCount);
    return true;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool;
    if (this == paramObject) {
      bool = true;
    }
    zu localzu;
    int i;
    int j;
    do
    {
      return bool;
      if (!(paramObject instanceof zu)) {
        return super.equals(paramObject);
      }
      localzu = (zu)paramObject;
      i = this.c;
      j = localzu.c;
      bool = false;
    } while (i != j);
    boolean[] arrayOfBoolean = localzu.b;
    for (int k = 0;; k++)
    {
      if (k >= this.c) {
        break label99;
      }
      int m = this.b[k];
      int n = arrayOfBoolean[k];
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
        if (paramObject.equals(Boolean.valueOf(this.b[i])))
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
 * Qualified Name:     com.google.android.gms.internal.ads.zu
 * JD-Core Version:    0.7.0.1
 */