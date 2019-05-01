package com.google.android.gms.internal.ads;

public final class xk
  extends abe<xk, a>
  implements acn
{
  private static volatile acx<xk> zzakh;
  private static final xk zzdmg = new xk();
  private int zzdih;
  private xn zzdmf;
  
  static
  {
    abe.a(xk.class, zzdmg);
  }
  
  public static xk a(zw paramzw)
  {
    return (xk)abe.a(zzdmg, paramzw);
  }
  
  private final void a(xn paramxn)
  {
    if (paramxn == null) {
      throw new NullPointerException();
    }
    this.zzdmf = paramxn;
  }
  
  private final void b(int paramInt)
  {
    this.zzdih = paramInt;
  }
  
  public static a c()
  {
    return (a)zzdmg.a(abe.e.e, null, null);
  }
  
  public final int a()
  {
    return this.zzdih;
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    Object localObject1;
    switch (xm.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      localObject1 = new xk();
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      do
      {
        return localObject1;
        return new a(null);
        Object[] arrayOfObject = { "zzdih", "zzdmf" };
        return a(zzdmg, "", arrayOfObject);
        return zzdmg;
        localObject1 = zzakh;
      } while (localObject1 != null);
      try
      {
        Object localObject3 = zzakh;
        if (localObject3 == null)
        {
          localObject3 = new abe.b(zzdmg);
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
  
  public final xn b()
  {
    if (this.zzdmf == null) {
      return xn.c();
    }
    return this.zzdmf;
  }
  
  public static final class a
    extends abe.a<xk, a>
    implements acn
  {
    private a()
    {
      super();
    }
    
    public final a a(int paramInt)
    {
      b();
      xk.a((xk)this.a, 0);
      return this;
    }
    
    public final a a(xn paramxn)
    {
      b();
      xk.a((xk)this.a, paramxn);
      return this;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.xk
 * JD-Core Version:    0.7.0.1
 */