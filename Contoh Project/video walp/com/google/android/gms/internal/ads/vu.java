package com.google.android.gms.internal.ads;

public enum vu
  implements abh
{
  private static final abi<vu> e = new vv();
  private final int f;
  
  static
  {
    vu[] arrayOfvu = new vu[4];
    arrayOfvu[0] = a;
    arrayOfvu[1] = b;
    arrayOfvu[2] = c;
    arrayOfvu[3] = d;
    g = arrayOfvu;
  }
  
  private vu(int paramInt)
  {
    this.f = paramInt;
  }
  
  public static vu a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 0: 
      return a;
    case 1: 
      return b;
    }
    return c;
  }
  
  public final int a()
  {
    if (this == d) {
      throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    return this.f;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.vu
 * JD-Core Version:    0.7.0.1
 */