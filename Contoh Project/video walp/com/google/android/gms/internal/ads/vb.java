package com.google.android.gms.internal.ads;

public final class vb
  extends abe<vb, a>
  implements acn
{
  private static volatile acx<vb> zzakh;
  private static final vb zzdiq = new vb();
  private int zzdih;
  private vf zzdio;
  private zw zzdip = zw.a;
  
  static
  {
    abe.a(vb.class, zzdiq);
  }
  
  public static vb a(zw paramzw)
  {
    return (vb)abe.a(zzdiq, paramzw);
  }
  
  private final void a(vf paramvf)
  {
    if (paramvf == null) {
      throw new NullPointerException();
    }
    this.zzdio = paramvf;
  }
  
  private final void b(int paramInt)
  {
    this.zzdih = paramInt;
  }
  
  private final void b(zw paramzw)
  {
    if (paramzw == null) {
      throw new NullPointerException();
    }
    this.zzdip = paramzw;
  }
  
  public static a d()
  {
    return (a)zzdiq.a(abe.e.e, null, null);
  }
  
  public static vb e()
  {
    return zzdiq;
  }
  
  public final int a()
  {
    return this.zzdih;
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    Object localObject1;
    switch (vc.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      localObject1 = new vb();
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      do
      {
        return localObject1;
        return new a(null);
        Object[] arrayOfObject = { "zzdih", "zzdio", "zzdip" };
        return a(zzdiq, "", arrayOfObject);
        return zzdiq;
        localObject1 = zzakh;
      } while (localObject1 != null);
      try
      {
        Object localObject3 = zzakh;
        if (localObject3 == null)
        {
          localObject3 = new abe.b(zzdiq);
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
  
  public final vf b()
  {
    if (this.zzdio == null) {
      return vf.b();
    }
    return this.zzdio;
  }
  
  public final zw c()
  {
    return this.zzdip;
  }
  
  public static final class a
    extends abe.a<vb, a>
    implements acn
  {
    private a()
    {
      super();
    }
    
    public final a a(int paramInt)
    {
      b();
      vb.a((vb)this.a, 0);
      return this;
    }
    
    public final a a(vf paramvf)
    {
      b();
      vb.a((vb)this.a, paramvf);
      return this;
    }
    
    public final a a(zw paramzw)
    {
      b();
      vb.a((vb)this.a, paramzw);
      return this;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.vb
 * JD-Core Version:    0.7.0.1
 */