package com.google.android.gms.internal.ads;

public enum ww
  implements abh
{
  private static final abi<ww> f = new wx();
  private final int g;
  
  static
  {
    c = new ww("UNRECOGNIZED", 4, -1);
    ww[] arrayOfww = new ww[5];
    arrayOfww[0] = a;
    arrayOfww[1] = b;
    arrayOfww[2] = d;
    arrayOfww[3] = e;
    arrayOfww[4] = c;
    h = arrayOfww;
  }
  
  private ww(int paramInt)
  {
    this.g = paramInt;
  }
  
  public static ww a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 0: 
      return a;
    case 1: 
      return b;
    case 2: 
      return d;
    }
    return e;
  }
  
  public final int a()
  {
    if (this == c) {
      throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    return this.g;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ww
 * JD-Core Version:    0.7.0.1
 */