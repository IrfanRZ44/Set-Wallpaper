package com.google.android.gms.internal.ads;

public final class xg
  extends abe<xg, a>
  implements acn
{
  private static volatile acx<xg> zzakh;
  private static final xg zzdmc = new xg();
  private int zzdih;
  private xi zzdmb;
  
  static
  {
    abe.a(xg.class, zzdmc);
  }
  
  public static xg a(zw paramzw)
  {
    return (xg)abe.a(zzdmc, paramzw);
  }
  
  private final void a(xi paramxi)
  {
    if (paramxi == null) {
      throw new NullPointerException();
    }
    this.zzdmb = paramxi;
  }
  
  private final void b(int paramInt)
  {
    this.zzdih = paramInt;
  }
  
  public static a c()
  {
    return (a)zzdmc.a(abe.e.e, null, null);
  }
  
  public final int a()
  {
    return this.zzdih;
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    Object localObject1;
    switch (xh.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      localObject1 = new xg();
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      do
      {
        return localObject1;
        return new a(null);
        Object[] arrayOfObject = { "zzdih", "zzdmb" };
        return a(zzdmc, "", arrayOfObject);
        return zzdmc;
        localObject1 = zzakh;
      } while (localObject1 != null);
      try
      {
        Object localObject3 = zzakh;
        if (localObject3 == null)
        {
          localObject3 = new abe.b(zzdmc);
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
  
  public final xi b()
  {
    if (this.zzdmb == null) {
      return xi.b();
    }
    return this.zzdmb;
  }
  
  public static final class a
    extends abe.a<xg, a>
    implements acn
  {
    private a()
    {
      super();
    }
    
    public final a a(int paramInt)
    {
      b();
      xg.a((xg)this.a, 0);
      return this;
    }
    
    public final a a(xi paramxi)
    {
      b();
      xg.a((xg)this.a, paramxi);
      return this;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.xg
 * JD-Core Version:    0.7.0.1
 */