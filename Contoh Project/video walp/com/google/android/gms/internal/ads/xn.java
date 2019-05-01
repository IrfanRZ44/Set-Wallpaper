package com.google.android.gms.internal.ads;

public final class xn
  extends abe<xn, a>
  implements acn
{
  private static volatile acx<xn> zzakh;
  private static final xn zzdmj = new xn();
  private String zzdmh = "";
  private wy zzdmi;
  
  static
  {
    abe.a(xn.class, zzdmj);
  }
  
  public static xn a(zw paramzw)
  {
    return (xn)abe.a(zzdmj, paramzw);
  }
  
  public static xn c()
  {
    return zzdmj;
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    Object localObject1;
    switch (xo.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      localObject1 = new xn();
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      do
      {
        return localObject1;
        return new a(null);
        Object[] arrayOfObject = { "zzdmh", "zzdmi" };
        return a(zzdmj, "", arrayOfObject);
        return zzdmj;
        localObject1 = zzakh;
      } while (localObject1 != null);
      try
      {
        Object localObject3 = zzakh;
        if (localObject3 == null)
        {
          localObject3 = new abe.b(zzdmj);
          zzakh = (acx)localObject3;
        }
        return localObject3;
      }
      finally {}
    case 6: 
      return Byte.valueOf((byte)1);
    }
    return null;
  }
  
  public final String a()
  {
    return this.zzdmh;
  }
  
  public final wy b()
  {
    if (this.zzdmi == null) {
      return wy.c();
    }
    return this.zzdmi;
  }
  
  public static final class a
    extends abe.a<xn, a>
    implements acn
  {
    private a()
    {
      super();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.xn
 * JD-Core Version:    0.7.0.1
 */