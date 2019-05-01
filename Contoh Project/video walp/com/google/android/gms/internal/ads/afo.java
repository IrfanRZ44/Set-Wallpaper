package com.google.android.gms.internal.ads;

public final class afo
  extends aew<afo>
{
  private static volatile afo[] f;
  public Integer a = null;
  public String b = null;
  public afj c = null;
  public Integer d = null;
  public String[] e = aff.c;
  private afl g = null;
  private Integer h = null;
  private int[] i = aff.a;
  private String j = null;
  
  public afo()
  {
    this.Y = null;
    this.Z = -1;
  }
  
  private final afo b(aes paramaes)
  {
    for (;;)
    {
      int k = paramaes.a();
      switch (k)
      {
      default: 
        if (super.a(paramaes, k)) {
          continue;
        }
      case 0: 
        return this;
      case 8: 
        this.a = Integer.valueOf(paramaes.c());
        break;
      case 18: 
        this.b = paramaes.e();
        break;
      case 26: 
        if (this.c == null) {
          this.c = new afj();
        }
        paramaes.a(this.c);
        break;
      case 34: 
        if (this.g == null) {
          this.g = new afl();
        }
        paramaes.a(this.g);
        break;
      case 40: 
        this.h = Integer.valueOf(paramaes.c());
        break;
      case 48: 
        int i7 = aff.a(paramaes, 48);
        if (this.i == null) {}
        int[] arrayOfInt2;
        for (int i8 = 0;; i8 = this.i.length)
        {
          arrayOfInt2 = new int[i7 + i8];
          if (i8 != 0) {
            System.arraycopy(this.i, 0, arrayOfInt2, 0, i8);
          }
          while (i8 < -1 + arrayOfInt2.length)
          {
            arrayOfInt2[i8] = paramaes.c();
            paramaes.a();
            i8++;
          }
        }
        arrayOfInt2[i8] = paramaes.c();
        this.i = arrayOfInt2;
        break;
      case 50: 
        int i3 = paramaes.c(paramaes.g());
        int i4 = paramaes.j();
        for (int i5 = 0; paramaes.i() > 0; i5++) {
          paramaes.c();
        }
        paramaes.e(i4);
        if (this.i == null) {}
        int[] arrayOfInt1;
        for (int i6 = 0;; i6 = this.i.length)
        {
          arrayOfInt1 = new int[i5 + i6];
          if (i6 != 0) {
            System.arraycopy(this.i, 0, arrayOfInt1, 0, i6);
          }
          while (i6 < arrayOfInt1.length)
          {
            arrayOfInt1[i6] = paramaes.c();
            i6++;
          }
        }
        this.i = arrayOfInt1;
        paramaes.d(i3);
        break;
      case 58: 
        this.j = paramaes.e();
        break;
      case 64: 
        int i1 = paramaes.j();
        int i2;
        try
        {
          i2 = paramaes.c();
          if ((i2 < 0) || (i2 > 3)) {
            break label507;
          }
          this.d = Integer.valueOf(i2);
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          paramaes.e(i1);
          a(paramaes, k);
        }
        continue;
        label507:
        throw new IllegalArgumentException(46 + i2 + " is not a valid enum AdResourceType");
      }
      int m = aff.a(paramaes, 74);
      if (this.e == null) {}
      String[] arrayOfString;
      for (int n = 0;; n = this.e.length)
      {
        arrayOfString = new String[m + n];
        if (n != 0) {
          System.arraycopy(this.e, 0, arrayOfString, 0, n);
        }
        while (n < -1 + arrayOfString.length)
        {
          arrayOfString[n] = paramaes.e();
          paramaes.a();
          n++;
        }
      }
      arrayOfString[n] = paramaes.e();
      this.e = arrayOfString;
    }
  }
  
  public static afo[] b()
  {
    if (f == null) {}
    synchronized (afa.b)
    {
      if (f == null) {
        f = new afo[0];
      }
      return f;
    }
  }
  
  protected final int a()
  {
    int k = 0;
    int m = super.a() + aeu.b(1, this.a.intValue());
    if (this.b != null) {
      m += aeu.b(2, this.b);
    }
    if (this.c != null) {
      m += aeu.b(3, this.c);
    }
    if (this.g != null) {
      m += aeu.b(4, this.g);
    }
    if (this.h != null) {
      m += aeu.b(5, this.h.intValue());
    }
    if ((this.i != null) && (this.i.length > 0))
    {
      int i2 = 0;
      int i3 = 0;
      while (i2 < this.i.length)
      {
        i3 += aeu.a(this.i[i2]);
        i2++;
      }
      m = m + i3 + 1 * this.i.length;
    }
    if (this.j != null) {
      m += aeu.b(7, this.j);
    }
    if (this.d != null) {
      m += aeu.b(8, this.d.intValue());
    }
    if ((this.e != null) && (this.e.length > 0))
    {
      int n = 0;
      int i1 = 0;
      while (k < this.e.length)
      {
        String str = this.e[k];
        if (str != null)
        {
          i1++;
          n += aeu.a(str);
        }
        k++;
      }
      m = m + n + i1 * 1;
    }
    return m;
  }
  
  public final void a(aeu paramaeu)
  {
    paramaeu.a(1, this.a.intValue());
    if (this.b != null) {
      paramaeu.a(2, this.b);
    }
    if (this.c != null) {
      paramaeu.a(3, this.c);
    }
    if (this.g != null) {
      paramaeu.a(4, this.g);
    }
    if (this.h != null) {
      paramaeu.a(5, this.h.intValue());
    }
    if ((this.i != null) && (this.i.length > 0)) {
      for (int n = 0; n < this.i.length; n++) {
        paramaeu.a(6, this.i[n]);
      }
    }
    if (this.j != null) {
      paramaeu.a(7, this.j);
    }
    if (this.d != null) {
      paramaeu.a(8, this.d.intValue());
    }
    if (this.e != null)
    {
      int k = this.e.length;
      int m = 0;
      if (k > 0) {
        while (m < this.e.length)
        {
          String str = this.e[m];
          if (str != null) {
            paramaeu.a(9, str);
          }
          m++;
        }
      }
    }
    super.a(paramaeu);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.afo
 * JD-Core Version:    0.7.0.1
 */