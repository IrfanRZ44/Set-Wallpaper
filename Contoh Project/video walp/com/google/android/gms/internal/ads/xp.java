package com.google.android.gms.internal.ads;

public enum xp
  implements abh
{
  private static final abi<xp> g = new xq();
  private final int h;
  
  static
  {
    xp[] arrayOfxp = new xp[6];
    arrayOfxp[0] = a;
    arrayOfxp[1] = b;
    arrayOfxp[2] = c;
    arrayOfxp[3] = d;
    arrayOfxp[4] = e;
    arrayOfxp[5] = f;
    i = arrayOfxp;
  }
  
  private xp(int paramInt)
  {
    this.h = paramInt;
  }
  
  public static xp a(int paramInt)
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
      return c;
    case 3: 
      return d;
    }
    return e;
  }
  
  public final int a()
  {
    if (this == f) {
      throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    return this.h;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.xp
 * JD-Core Version:    0.7.0.1
 */