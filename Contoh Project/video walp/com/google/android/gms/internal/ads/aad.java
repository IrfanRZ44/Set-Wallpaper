package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

class aad
  extends aac
{
  protected final byte[] b;
  
  aad(byte[] paramArrayOfByte)
  {
    this.b = paramArrayOfByte;
  }
  
  public byte a(int paramInt)
  {
    return this.b[paramInt];
  }
  
  public int a()
  {
    return this.b.length;
  }
  
  protected final int a(int paramInt1, int paramInt2, int paramInt3)
  {
    return abg.a(paramInt1, this.b, g(), paramInt3);
  }
  
  public final zw a(int paramInt1, int paramInt2)
  {
    int i = b(0, paramInt2, a());
    if (i == 0) {
      return zw.a;
    }
    return new zz(this.b, g(), i);
  }
  
  protected final String a(Charset paramCharset)
  {
    return new String(this.b, g(), a(), paramCharset);
  }
  
  final void a(zv paramzv)
  {
    paramzv.a(this.b, g(), a());
  }
  
  protected void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    System.arraycopy(this.b, 0, paramArrayOfByte, 0, paramInt3);
  }
  
  final boolean a(zw paramzw, int paramInt1, int paramInt2)
  {
    if (paramInt2 > paramzw.a())
    {
      int n = a();
      throw new IllegalArgumentException(40 + "Length too large: " + paramInt2 + n);
    }
    if (paramInt2 > paramzw.a())
    {
      int m = paramzw.a();
      throw new IllegalArgumentException(59 + "Ran off end of other: 0, " + paramInt2 + ", " + m);
    }
    if ((paramzw instanceof aad))
    {
      aad localaad = (aad)paramzw;
      byte[] arrayOfByte1 = this.b;
      byte[] arrayOfByte2 = localaad.b;
      int i = paramInt2 + g();
      int j = g();
      for (int k = localaad.g(); j < i; k++)
      {
        if (arrayOfByte1[j] != arrayOfByte2[k]) {
          return false;
        }
        j++;
      }
      return true;
    }
    return paramzw.a(0, paramInt2).equals(a(0, paramInt2));
  }
  
  public final boolean d()
  {
    int i = g();
    return aef.a(this.b, i, i + a());
  }
  
  public final aaf e()
  {
    return aaf.a(this.b, g(), a(), true);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof zw)) {
      return false;
    }
    if (a() != ((zw)paramObject).a()) {
      return false;
    }
    if (a() == 0) {
      return true;
    }
    if ((paramObject instanceof aad))
    {
      aad localaad = (aad)paramObject;
      int i = f();
      int j = localaad.f();
      if ((i != 0) && (j != 0) && (i != j)) {
        return false;
      }
      return a((aad)paramObject, 0, a());
    }
    return paramObject.equals(this);
  }
  
  protected int g()
  {
    return 0;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aad
 * JD-Core Version:    0.7.0.1
 */