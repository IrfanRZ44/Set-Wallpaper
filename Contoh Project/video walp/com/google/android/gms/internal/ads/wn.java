package com.google.android.gms.internal.ads;

public final class wn
  extends abe<wn, a>
  implements acn
{
  private static volatile acx<wn> zzakh;
  private static final wn zzdkn = new wn();
  private int zzdih;
  private zw zzdip = zw.a;
  private wr zzdkm;
  
  static
  {
    abe.a(wn.class, zzdkn);
  }
  
  public static wn a(zw paramzw)
  {
    return (wn)abe.a(zzdkn, paramzw);
  }
  
  private final void a(wr paramwr)
  {
    if (paramwr == null) {
      throw new NullPointerException();
    }
    this.zzdkm = paramwr;
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
    return (a)zzdkn.a(abe.e.e, null, null);
  }
  
  public static wn e()
  {
    return zzdkn;
  }
  
  public final int a()
  {
    return this.zzdih;
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    Object localObject1;
    switch (wo.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      localObject1 = new wn();
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      do
      {
        return localObject1;
        return new a(null);
        Object[] arrayOfObject = { "zzdih", "zzdkm", "zzdip" };
        return a(zzdkn, "", arrayOfObject);
        return zzdkn;
        localObject1 = zzakh;
      } while (localObject1 != null);
      try
      {
        Object localObject3 = zzakh;
        if (localObject3 == null)
        {
          localObject3 = new abe.b(zzdkn);
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
  
  public final wr b()
  {
    if (this.zzdkm == null) {
      return wr.c();
    }
    return this.zzdkm;
  }
  
  public final zw c()
  {
    return this.zzdip;
  }
  
  public static final class a
    extends abe.a<wn, a>
    implements acn
  {
    private a()
    {
      super();
    }
    
    public final a a(int paramInt)
    {
      b();
      wn.a((wn)this.a, 0);
      return this;
    }
    
    public final a a(wr paramwr)
    {
      b();
      wn.a((wn)this.a, paramwr);
      return this;
    }
    
    public final a a(zw paramzw)
    {
      b();
      wn.a((wn)this.a, paramzw);
      return this;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.wn
 * JD-Core Version:    0.7.0.1
 */