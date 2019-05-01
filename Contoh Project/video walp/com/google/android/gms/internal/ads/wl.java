package com.google.android.gms.internal.ads;

public enum wl
  implements abh
{
  private static final abi<wl> g = new wm();
  private final int h;
  
  static
  {
    a = new wl("SHA1", 1, 1);
    f = new wl("SHA224", 2, 2);
    b = new wl("SHA256", 3, 3);
    c = new wl("SHA512", 4, 4);
    d = new wl("UNRECOGNIZED", 5, -1);
    wl[] arrayOfwl = new wl[6];
    arrayOfwl[0] = e;
    arrayOfwl[1] = a;
    arrayOfwl[2] = f;
    arrayOfwl[3] = b;
    arrayOfwl[4] = c;
    arrayOfwl[5] = d;
    i = arrayOfwl;
  }
  
  private wl(int paramInt)
  {
    this.h = paramInt;
  }
  
  public static wl a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 0: 
      return e;
    case 1: 
      return a;
    case 2: 
      return f;
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
 * Qualified Name:     com.google.android.gms.internal.ads.wl
 * JD-Core Version:    0.7.0.1
 */