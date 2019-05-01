package com.google.android.gms.internal.ads;

public enum wi
  implements abh
{
  private static final abi<wi> g = new wj();
  private final int h;
  
  static
  {
    a = new wi("NIST_P256", 2, 2);
    b = new wi("NIST_P384", 3, 3);
    c = new wi("NIST_P521", 4, 4);
    d = new wi("UNRECOGNIZED", 5, -1);
    wi[] arrayOfwi = new wi[6];
    arrayOfwi[0] = e;
    arrayOfwi[1] = f;
    arrayOfwi[2] = a;
    arrayOfwi[3] = b;
    arrayOfwi[4] = c;
    arrayOfwi[5] = d;
    i = arrayOfwi;
  }
  
  private wi(int paramInt)
  {
    this.h = paramInt;
  }
  
  public static wi a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 0: 
      return e;
    case 1: 
      return f;
    case 2: 
      return a;
    case 3: 
      return b;
    }
    return c;
  }
  
  public final int a()
  {
    if (this == d) {
      throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    return this.h;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.wi
 * JD-Core Version:    0.7.0.1
 */