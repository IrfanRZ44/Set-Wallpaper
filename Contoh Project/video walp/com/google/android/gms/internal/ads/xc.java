package com.google.android.gms.internal.ads;

import java.util.List;

public final class xc
  extends abe<xc, a>
  implements acn
{
  private static volatile acx<xc> zzakh;
  private static final xc zzdlt = new xc();
  private int zzdlq;
  private int zzdlr;
  private abj<b> zzdls = m();
  
  static
  {
    abe.a(xc.class, zzdlt);
  }
  
  public static xc a(byte[] paramArrayOfByte)
  {
    return (xc)abe.a(zzdlt, paramArrayOfByte);
  }
  
  public final int a()
  {
    return this.zzdlr;
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    Object localObject1;
    switch (xd.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      localObject1 = new xc();
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      do
      {
        return localObject1;
        return new a(null);
        Object[] arrayOfObject = { "zzdlq", "zzdlr", "zzdls", b.class };
        return a(zzdlt, "", arrayOfObject);
        return zzdlt;
        localObject1 = zzakh;
      } while (localObject1 != null);
      try
      {
        Object localObject3 = zzakh;
        if (localObject3 == null)
        {
          localObject3 = new abe.b(zzdlt);
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
  
  public final List<b> b()
  {
    return this.zzdls;
  }
  
  public final int c()
  {
    return this.zzdls.size();
  }
  
  public static final class a
    extends abe.a<xc, a>
    implements acn
  {
    private a()
    {
      super();
    }
  }
  
  public static final class b
    extends abe<b, a>
    implements acn
  {
    private static volatile acx<b> zzakh;
    private static final b zzdlx = new b();
    private int zzdlj;
    private wt zzdlu;
    private int zzdlv;
    private int zzdlw;
    
    static
    {
      abe.a(b.class, zzdlx);
    }
    
    protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
    {
      Object localObject1;
      switch (xd.a[(paramInt - 1)])
      {
      default: 
        throw new UnsupportedOperationException();
      case 1: 
        localObject1 = new b();
      case 2: 
      case 3: 
      case 4: 
      case 5: 
        do
        {
          return localObject1;
          return new a(null);
          Object[] arrayOfObject = { "zzdlu", "zzdlv", "zzdlw", "zzdlj" };
          return a(zzdlx, "", arrayOfObject);
          return zzdlx;
          localObject1 = zzakh;
        } while (localObject1 != null);
        try
        {
          Object localObject3 = zzakh;
          if (localObject3 == null)
          {
            localObject3 = new abe.b(zzdlx);
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
    
    public final boolean a()
    {
      return this.zzdlu != null;
    }
    
    public final wt b()
    {
      if (this.zzdlu == null) {
        return wt.e();
      }
      return this.zzdlu;
    }
    
    public final ww c()
    {
      ww localww = ww.a(this.zzdlv);
      if (localww == null) {
        localww = ww.c;
      }
      return localww;
    }
    
    public final int d()
    {
      return this.zzdlw;
    }
    
    public final xp e()
    {
      xp localxp = xp.a(this.zzdlj);
      if (localxp == null) {
        localxp = xp.f;
      }
      return localxp;
    }
    
    public static final class a
      extends abe.a<xc.b, a>
      implements acn
    {
      private a()
      {
        super();
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.xc
 * JD-Core Version:    0.7.0.1
 */