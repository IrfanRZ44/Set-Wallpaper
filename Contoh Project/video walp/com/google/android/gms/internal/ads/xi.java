package com.google.android.gms.internal.ads;

public final class xi
  extends abe<xi, a>
  implements acn
{
  private static volatile acx<xi> zzakh;
  private static final xi zzdme = new xi();
  private String zzdmd = "";
  
  static
  {
    abe.a(xi.class, zzdme);
  }
  
  public static xi a(zw paramzw)
  {
    return (xi)abe.a(zzdme, paramzw);
  }
  
  public static xi b()
  {
    return zzdme;
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    Object localObject1;
    switch (xj.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      localObject1 = new xi();
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      do
      {
        return localObject1;
        return new a(null);
        Object[] arrayOfObject = { "zzdmd" };
        return a(zzdme, "", arrayOfObject);
        return zzdme;
        localObject1 = zzakh;
      } while (localObject1 != null);
      try
      {
        Object localObject3 = zzakh;
        if (localObject3 == null)
        {
          localObject3 = new abe.b(zzdme);
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
    return this.zzdmd;
  }
  
  public static final class a
    extends abe.a<xi, a>
    implements acn
  {
    private a()
    {
      super();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.xi
 * JD-Core Version:    0.7.0.1
 */