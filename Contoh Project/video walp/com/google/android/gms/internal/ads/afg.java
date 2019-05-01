package com.google.android.gms.internal.ads;

public final class afg
  extends aew<afg>
{
  public Integer a = null;
  public String b = null;
  public String c = null;
  public afh d = null;
  public afo[] e = afo.b();
  public String f = null;
  public afn g = null;
  public afp h = null;
  public String[] i = aff.c;
  public String[] j = aff.c;
  private Integer k = null;
  private String l = null;
  private Boolean m = null;
  private String[] n = aff.c;
  private String o = null;
  private Boolean p = null;
  private Boolean q = null;
  private byte[] r = null;
  
  public afg()
  {
    this.Y = null;
    this.Z = -1;
  }
  
  private final afg b(aes paramaes)
  {
    for (;;)
    {
      int i1 = paramaes.a();
      switch (i1)
      {
      default: 
        if (super.a(paramaes, i1)) {
          continue;
        }
      case 0: 
        return this;
      case 10: 
        this.b = paramaes.e();
        break;
      case 18: 
        this.c = paramaes.e();
        break;
      case 26: 
        this.l = paramaes.e();
        break;
      case 34: 
        int i12 = aff.a(paramaes, 34);
        if (this.e == null) {}
        afo[] arrayOfafo;
        for (int i13 = 0;; i13 = this.e.length)
        {
          arrayOfafo = new afo[i12 + i13];
          if (i13 != 0) {
            System.arraycopy(this.e, 0, arrayOfafo, 0, i13);
          }
          while (i13 < -1 + arrayOfafo.length)
          {
            arrayOfafo[i13] = new afo();
            paramaes.a(arrayOfafo[i13]);
            paramaes.a();
            i13++;
          }
        }
        arrayOfafo[i13] = new afo();
        paramaes.a(arrayOfafo[i13]);
        this.e = arrayOfafo;
        break;
      case 40: 
        this.m = Boolean.valueOf(paramaes.d());
        break;
      case 50: 
        int i10 = aff.a(paramaes, 50);
        if (this.n == null) {}
        String[] arrayOfString3;
        for (int i11 = 0;; i11 = this.n.length)
        {
          arrayOfString3 = new String[i10 + i11];
          if (i11 != 0) {
            System.arraycopy(this.n, 0, arrayOfString3, 0, i11);
          }
          while (i11 < -1 + arrayOfString3.length)
          {
            arrayOfString3[i11] = paramaes.e();
            paramaes.a();
            i11++;
          }
        }
        arrayOfString3[i11] = paramaes.e();
        this.n = arrayOfString3;
        break;
      case 58: 
        this.o = paramaes.e();
        break;
      case 64: 
        this.p = Boolean.valueOf(paramaes.d());
        break;
      case 72: 
        this.q = Boolean.valueOf(paramaes.d());
        break;
      case 80: 
        int i8 = paramaes.j();
        int i9;
        try
        {
          i9 = paramaes.c();
          if ((i9 < 0) || (i9 > 9)) {
            break label551;
          }
          this.a = Integer.valueOf(i9);
        }
        catch (IllegalArgumentException localIllegalArgumentException2)
        {
          paramaes.e(i8);
          a(paramaes, i1);
        }
        continue;
        throw new IllegalArgumentException(42 + i9 + " is not a valid enum ReportType");
      case 88: 
        int i6 = paramaes.j();
        int i7;
        try
        {
          i7 = paramaes.c();
          if ((i7 < 0) || (i7 > 4)) {
            break label634;
          }
          this.k = Integer.valueOf(i7);
        }
        catch (IllegalArgumentException localIllegalArgumentException1)
        {
          paramaes.e(i6);
          a(paramaes, i1);
        }
        continue;
        throw new IllegalArgumentException(39 + i7 + " is not a valid enum Verdict");
      case 98: 
        if (this.d == null) {
          this.d = new afh();
        }
        paramaes.a(this.d);
        break;
      case 106: 
        this.f = paramaes.e();
        break;
      case 114: 
        if (this.g == null) {
          this.g = new afn();
        }
        paramaes.a(this.g);
        break;
      case 122: 
        this.r = paramaes.f();
        break;
      case 138: 
        if (this.h == null) {
          this.h = new afp();
        }
        paramaes.a(this.h);
        break;
      case 162: 
        label551:
        label634:
        int i4 = aff.a(paramaes, 162);
        if (this.i == null) {}
        String[] arrayOfString2;
        for (int i5 = 0;; i5 = this.i.length)
        {
          arrayOfString2 = new String[i4 + i5];
          if (i5 != 0) {
            System.arraycopy(this.i, 0, arrayOfString2, 0, i5);
          }
          while (i5 < -1 + arrayOfString2.length)
          {
            arrayOfString2[i5] = paramaes.e();
            paramaes.a();
            i5++;
          }
        }
        arrayOfString2[i5] = paramaes.e();
        this.i = arrayOfString2;
        break;
      }
      int i2 = aff.a(paramaes, 170);
      if (this.j == null) {}
      String[] arrayOfString1;
      for (int i3 = 0;; i3 = this.j.length)
      {
        arrayOfString1 = new String[i2 + i3];
        if (i3 != 0) {
          System.arraycopy(this.j, 0, arrayOfString1, 0, i3);
        }
        while (i3 < -1 + arrayOfString1.length)
        {
          arrayOfString1[i3] = paramaes.e();
          paramaes.a();
          i3++;
        }
      }
      arrayOfString1[i3] = paramaes.e();
      this.j = arrayOfString1;
    }
  }
  
  protected final int a()
  {
    int i1 = 0;
    int i2 = super.a();
    if (this.b != null) {
      i2 += aeu.b(1, this.b);
    }
    if (this.c != null) {
      i2 += aeu.b(2, this.c);
    }
    if (this.l != null) {
      i2 += aeu.b(3, this.l);
    }
    if ((this.e != null) && (this.e.length > 0))
    {
      int i11 = i2;
      for (int i12 = 0; i12 < this.e.length; i12++)
      {
        afo localafo = this.e[i12];
        if (localafo != null) {
          i11 += aeu.b(4, localafo);
        }
      }
      i2 = i11;
    }
    if (this.m != null)
    {
      this.m.booleanValue();
      i2 += 1 + aeu.b(5);
    }
    if ((this.n != null) && (this.n.length > 0))
    {
      int i8 = 0;
      int i9 = 0;
      int i10 = 0;
      while (i8 < this.n.length)
      {
        String str3 = this.n[i8];
        if (str3 != null)
        {
          i10++;
          i9 += aeu.a(str3);
        }
        i8++;
      }
      i2 = i2 + i9 + i10 * 1;
    }
    if (this.o != null) {
      i2 += aeu.b(7, this.o);
    }
    if (this.p != null)
    {
      this.p.booleanValue();
      i2 += 1 + aeu.b(8);
    }
    if (this.q != null)
    {
      this.q.booleanValue();
      i2 += 1 + aeu.b(9);
    }
    if (this.a != null) {
      i2 += aeu.b(10, this.a.intValue());
    }
    if (this.k != null) {
      i2 += aeu.b(11, this.k.intValue());
    }
    if (this.d != null) {
      i2 += aeu.b(12, this.d);
    }
    if (this.f != null) {
      i2 += aeu.b(13, this.f);
    }
    if (this.g != null) {
      i2 += aeu.b(14, this.g);
    }
    if (this.r != null) {
      i2 += aeu.b(15, this.r);
    }
    if (this.h != null) {
      i2 += aeu.b(17, this.h);
    }
    if ((this.i != null) && (this.i.length > 0))
    {
      int i5 = 0;
      int i6 = 0;
      int i7 = 0;
      while (i5 < this.i.length)
      {
        String str2 = this.i[i5];
        if (str2 != null)
        {
          i7++;
          i6 += aeu.a(str2);
        }
        i5++;
      }
      i2 = i2 + i6 + i7 * 2;
    }
    if ((this.j != null) && (this.j.length > 0))
    {
      int i3 = 0;
      int i4 = 0;
      while (i1 < this.j.length)
      {
        String str1 = this.j[i1];
        if (str1 != null)
        {
          i4++;
          i3 += aeu.a(str1);
        }
        i1++;
      }
      i2 = i2 + i3 + i4 * 2;
    }
    return i2;
  }
  
  public final void a(aeu paramaeu)
  {
    if (this.b != null) {
      paramaeu.a(1, this.b);
    }
    if (this.c != null) {
      paramaeu.a(2, this.c);
    }
    if (this.l != null) {
      paramaeu.a(3, this.l);
    }
    if ((this.e != null) && (this.e.length > 0)) {
      for (int i5 = 0; i5 < this.e.length; i5++)
      {
        afo localafo = this.e[i5];
        if (localafo != null) {
          paramaeu.a(4, localafo);
        }
      }
    }
    if (this.m != null) {
      paramaeu.a(5, this.m.booleanValue());
    }
    if ((this.n != null) && (this.n.length > 0)) {
      for (int i4 = 0; i4 < this.n.length; i4++)
      {
        String str3 = this.n[i4];
        if (str3 != null) {
          paramaeu.a(6, str3);
        }
      }
    }
    if (this.o != null) {
      paramaeu.a(7, this.o);
    }
    if (this.p != null) {
      paramaeu.a(8, this.p.booleanValue());
    }
    if (this.q != null) {
      paramaeu.a(9, this.q.booleanValue());
    }
    if (this.a != null) {
      paramaeu.a(10, this.a.intValue());
    }
    if (this.k != null) {
      paramaeu.a(11, this.k.intValue());
    }
    if (this.d != null) {
      paramaeu.a(12, this.d);
    }
    if (this.f != null) {
      paramaeu.a(13, this.f);
    }
    if (this.g != null) {
      paramaeu.a(14, this.g);
    }
    if (this.r != null) {
      paramaeu.a(15, this.r);
    }
    if (this.h != null) {
      paramaeu.a(17, this.h);
    }
    if ((this.i != null) && (this.i.length > 0)) {
      for (int i3 = 0; i3 < this.i.length; i3++)
      {
        String str2 = this.i[i3];
        if (str2 != null) {
          paramaeu.a(20, str2);
        }
      }
    }
    if (this.j != null)
    {
      int i1 = this.j.length;
      int i2 = 0;
      if (i1 > 0) {
        while (i2 < this.j.length)
        {
          String str1 = this.j[i2];
          if (str1 != null) {
            paramaeu.a(21, str1);
          }
          i2++;
        }
      }
    }
    super.a(paramaeu);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.afg
 * JD-Core Version:    0.7.0.1
 */