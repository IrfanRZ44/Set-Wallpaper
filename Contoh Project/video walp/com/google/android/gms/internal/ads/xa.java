package com.google.android.gms.internal.ads;

public final class xa
  extends abe<xa, a>
  implements acn
{
  private static volatile acx<xa> zzakh;
  private static final xa zzdlp = new xa();
  private String zzdks = "";
  private String zzdll = "";
  private int zzdlm;
  private boolean zzdln;
  private String zzdlo = "";
  
  static
  {
    abe.a(xa.class, zzdlp);
  }
  
  private final void a(String paramString)
  {
    if (paramString == null) {
      throw new NullPointerException();
    }
    this.zzdll = paramString;
  }
  
  private final void a(boolean paramBoolean)
  {
    this.zzdln = paramBoolean;
  }
  
  private final void b(int paramInt)
  {
    this.zzdlm = paramInt;
  }
  
  private final void b(String paramString)
  {
    if (paramString == null) {
      throw new NullPointerException();
    }
    this.zzdks = paramString;
  }
  
  private final void c(String paramString)
  {
    if (paramString == null) {
      throw new NullPointerException();
    }
    this.zzdlo = paramString;
  }
  
  public static a f()
  {
    return (a)zzdlp.a(abe.e.e, null, null);
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    Object localObject1;
    switch (xb.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      localObject1 = new xa();
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      do
      {
        return localObject1;
        return new a(null);
        Object[] arrayOfObject = { "zzdll", "zzdks", "zzdlm", "zzdln", "zzdlo" };
        return a(zzdlp, "", arrayOfObject);
        return zzdlp;
        localObject1 = zzakh;
      } while (localObject1 != null);
      try
      {
        Object localObject3 = zzakh;
        if (localObject3 == null)
        {
          localObject3 = new abe.b(zzdlp);
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
    return this.zzdll;
  }
  
  public final String b()
  {
    return this.zzdks;
  }
  
  public final int c()
  {
    return this.zzdlm;
  }
  
  public final boolean d()
  {
    return this.zzdln;
  }
  
  public final String e()
  {
    return this.zzdlo;
  }
  
  public static final class a
    extends abe.a<xa, a>
    implements acn
  {
    private a()
    {
      super();
    }
    
    public final a a(int paramInt)
    {
      b();
      xa.a((xa)this.a, 0);
      return this;
    }
    
    public final a a(String paramString)
    {
      b();
      xa.a((xa)this.a, paramString);
      return this;
    }
    
    public final a a(boolean paramBoolean)
    {
      b();
      xa.a((xa)this.a, true);
      return this;
    }
    
    public final a b(String paramString)
    {
      b();
      xa.b((xa)this.a, paramString);
      return this;
    }
    
    public final a c(String paramString)
    {
      b();
      xa.c((xa)this.a, paramString);
      return this;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.xa
 * JD-Core Version:    0.7.0.1
 */