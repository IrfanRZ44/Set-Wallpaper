package com.google.android.gms.internal.ads;

public final class vo
  extends abe<vo, a>
  implements acn
{
  private static volatile acx<vo> zzakh;
  private static final vo zzdiz = new vo();
  private int zzdih;
  private zw zzdip = zw.a;
  
  static
  {
    abe.a(vo.class, zzdiz);
  }
  
  public static vo a(zw paramzw)
  {
    return (vo)abe.a(zzdiz, paramzw);
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
  
  public static a c()
  {
    return (a)zzdiz.a(abe.e.e, null, null);
  }
  
  public final int a()
  {
    return this.zzdih;
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    Object localObject1;
    switch (vp.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      localObject1 = new vo();
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      do
      {
        return localObject1;
        return new a(null);
        Object[] arrayOfObject = { "zzdih", "zzdip" };
        return a(zzdiz, "", arrayOfObject);
        return zzdiz;
        localObject1 = zzakh;
      } while (localObject1 != null);
      try
      {
        Object localObject3 = zzakh;
        if (localObject3 == null)
        {
          localObject3 = new abe.b(zzdiz);
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
  
  public final zw b()
  {
    return this.zzdip;
  }
  
  public static final class a
    extends abe.a<vo, a>
    implements acn
  {
    private a()
    {
      super();
    }
    
    public final a a(int paramInt)
    {
      b();
      vo.a((vo)this.a, 0);
      return this;
    }
    
    public final a a(zw paramzw)
    {
      b();
      vo.a((vo)this.a, paramzw);
      return this;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.vo
 * JD-Core Version:    0.7.0.1
 */