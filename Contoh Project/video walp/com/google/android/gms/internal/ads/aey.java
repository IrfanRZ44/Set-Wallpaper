package com.google.android.gms.internal.ads;

public final class aey
  implements Cloneable
{
  private static final aez a = new aez();
  private boolean b = false;
  private int[] c;
  private aez[] d;
  private int e;
  
  aey()
  {
    this(10);
  }
  
  private aey(int paramInt)
  {
    int i = c(paramInt);
    this.c = new int[i];
    this.d = new aez[i];
    this.e = 0;
  }
  
  private static int c(int paramInt)
  {
    int i = paramInt << 2;
    for (int j = 4;; j++) {
      if (j < 32)
      {
        if (i <= -12 + (1 << j)) {
          i = -12 + (1 << j);
        }
      }
      else {
        return i / 4;
      }
    }
  }
  
  private final int d(int paramInt)
  {
    int i = -1 + this.e;
    int j = 0;
    int k = i;
    while (j <= k)
    {
      m = j + k >>> 1;
      int n = this.c[m];
      if (n < paramInt)
      {
        j = m + 1;
      }
      else
      {
        if (n <= paramInt) {
          break label69;
        }
        k = m - 1;
      }
    }
    int m = j ^ 0xFFFFFFFF;
    label69:
    return m;
  }
  
  final int a()
  {
    return this.e;
  }
  
  final aez a(int paramInt)
  {
    int i = d(paramInt);
    if ((i < 0) || (this.d[i] == a)) {
      return null;
    }
    return this.d[i];
  }
  
  final void a(int paramInt, aez paramaez)
  {
    int i = d(paramInt);
    if (i >= 0)
    {
      this.d[i] = paramaez;
      return;
    }
    int j = i ^ 0xFFFFFFFF;
    if ((j < this.e) && (this.d[j] == a))
    {
      this.c[j] = paramInt;
      this.d[j] = paramaez;
      return;
    }
    if (this.e >= this.c.length)
    {
      int k = c(1 + this.e);
      int[] arrayOfInt = new int[k];
      aez[] arrayOfaez = new aez[k];
      System.arraycopy(this.c, 0, arrayOfInt, 0, this.c.length);
      System.arraycopy(this.d, 0, arrayOfaez, 0, this.d.length);
      this.c = arrayOfInt;
      this.d = arrayOfaez;
    }
    if (this.e - j != 0)
    {
      System.arraycopy(this.c, j, this.c, j + 1, this.e - j);
      System.arraycopy(this.d, j, this.d, j + 1, this.e - j);
    }
    this.c[j] = paramInt;
    this.d[j] = paramaez;
    this.e = (1 + this.e);
  }
  
  final aez b(int paramInt)
  {
    return this.d[paramInt];
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    label147:
    label153:
    label157:
    for (;;)
    {
      return true;
      if (!(paramObject instanceof aey)) {
        return false;
      }
      aey localaey = (aey)paramObject;
      if (this.e != localaey.e) {
        return false;
      }
      int[] arrayOfInt1 = this.c;
      int[] arrayOfInt2 = localaey.c;
      int i = this.e;
      int j = 0;
      int k;
      label76:
      int n;
      if (j < i) {
        if (arrayOfInt1[j] != arrayOfInt2[j])
        {
          k = 0;
          if (k != 0)
          {
            aez[] arrayOfaez1 = this.d;
            aez[] arrayOfaez2 = localaey.d;
            int m = this.e;
            n = 0;
            label102:
            if (n >= m) {
              break label153;
            }
            if (arrayOfaez1[n].equals(arrayOfaez2[n])) {
              break label147;
            }
          }
        }
      }
      for (int i1 = 0;; i1 = 1)
      {
        if (i1 != 0) {
          break label157;
        }
        return false;
        j++;
        break;
        k = 1;
        break label76;
        n++;
        break label102;
      }
    }
  }
  
  public final int hashCode()
  {
    int i = 17;
    for (int j = 0; j < this.e; j++) {
      i = 31 * (i * 31 + this.c[j]) + this.d[j].hashCode();
    }
    return i;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aey
 * JD-Core Version:    0.7.0.1
 */