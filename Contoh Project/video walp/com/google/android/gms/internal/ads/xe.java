package com.google.android.gms.internal.ads;

public final class xe
  extends abe<xe, a>
  implements acn
{
  private static volatile acx<xe> zzakh;
  private static final xe zzdlz = new xe();
  private int zzdlq;
  private int zzdlr;
  private abj<b> zzdly = m();
  
  static
  {
    abe.a(xe.class, zzdlz);
  }
  
  public static a a()
  {
    return (a)zzdlz.a(abe.e.e, null, null);
  }
  
  private final void a(b paramb)
  {
    if (paramb == null) {
      throw new NullPointerException();
    }
    abj localabj;
    int i;
    if (!this.zzdly.a())
    {
      localabj = this.zzdly;
      i = localabj.size();
      if (i != 0) {
        break label70;
      }
    }
    label70:
    for (int j = 10;; j = i << 1)
    {
      this.zzdly = localabj.a(j);
      this.zzdly.add(paramb);
      return;
    }
  }
  
  private final void b(int paramInt)
  {
    this.zzdlr = paramInt;
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    Object localObject1;
    switch (xf.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      localObject1 = new xe();
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      do
      {
        return localObject1;
        return new a(null);
        Object[] arrayOfObject = { "zzdlq", "zzdlr", "zzdly", b.class };
        return a(zzdlz, "", arrayOfObject);
        return zzdlz;
        localObject1 = zzakh;
      } while (localObject1 != null);
      try
      {
        Object localObject3 = zzakh;
        if (localObject3 == null)
        {
          localObject3 = new abe.b(zzdlz);
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
  
  public static final class a
    extends abe.a<xe, a>
    implements acn
  {
    private a()
    {
      super();
    }
    
    public final a a(int paramInt)
    {
      b();
      xe.a((xe)this.a, paramInt);
      return this;
    }
    
    public final a a(xe.b paramb)
    {
      b();
      xe.a((xe)this.a, paramb);
      return this;
    }
  }
  
  public static final class b
    extends abe<b, a>
    implements acn
  {
    private static volatile acx<b> zzakh;
    private static final b zzdma = new b();
    private String zzdks = "";
    private int zzdlj;
    private int zzdlv;
    private int zzdlw;
    
    static
    {
      abe.a(b.class, zzdma);
    }
    
    public static a a()
    {
      return (a)zzdma.a(abe.e.e, null, null);
    }
    
    private final void a(ww paramww)
    {
      if (paramww == null) {
        throw new NullPointerException();
      }
      this.zzdlv = paramww.a();
    }
    
    private final void a(xp paramxp)
    {
      if (paramxp == null) {
        throw new NullPointerException();
      }
      this.zzdlj = paramxp.a();
    }
    
    private final void a(String paramString)
    {
      if (paramString == null) {
        throw new NullPointerException();
      }
      this.zzdks = paramString;
    }
    
    private final void b(int paramInt)
    {
      this.zzdlw = paramInt;
    }
    
    protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
    {
      Object localObject1;
      switch (xf.a[(paramInt - 1)])
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
          Object[] arrayOfObject = { "zzdks", "zzdlv", "zzdlw", "zzdlj" };
          return a(zzdma, "", arrayOfObject);
          return zzdma;
          localObject1 = zzakh;
        } while (localObject1 != null);
        try
        {
          Object localObject3 = zzakh;
          if (localObject3 == null)
          {
            localObject3 = new abe.b(zzdma);
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
    
    public static final class a
      extends abe.a<xe.b, a>
      implements acn
    {
      private a()
      {
        super();
      }
      
      public final a a(int paramInt)
      {
        b();
        xe.b.a((xe.b)this.a, paramInt);
        return this;
      }
      
      public final a a(ww paramww)
      {
        b();
        xe.b.a((xe.b)this.a, paramww);
        return this;
      }
      
      public final a a(xp paramxp)
      {
        b();
        xe.b.a((xe.b)this.a, paramxp);
        return this;
      }
      
      public final a a(String paramString)
      {
        b();
        xe.b.a((xe.b)this.a, paramString);
        return this;
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.xe
 * JD-Core Version:    0.7.0.1
 */