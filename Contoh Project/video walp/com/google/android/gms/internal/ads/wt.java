package com.google.android.gms.internal.ads;

public final class wt
  extends abe<wt, a>
  implements acn
{
  private static volatile acx<wt> zzakh;
  private static final wt zzdkv = new wt();
  private String zzdks = "";
  private zw zzdkt = zw.a;
  private int zzdku;
  
  static
  {
    abe.a(wt.class, zzdkv);
  }
  
  private final void a(b paramb)
  {
    if (paramb == null) {
      throw new NullPointerException();
    }
    this.zzdku = paramb.a();
  }
  
  private final void a(zw paramzw)
  {
    if (paramzw == null) {
      throw new NullPointerException();
    }
    this.zzdkt = paramzw;
  }
  
  private final void a(String paramString)
  {
    if (paramString == null) {
      throw new NullPointerException();
    }
    this.zzdks = paramString;
  }
  
  public static a d()
  {
    return (a)zzdkv.a(abe.e.e, null, null);
  }
  
  public static wt e()
  {
    return zzdkv;
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    Object localObject1;
    switch (wu.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      localObject1 = new wt();
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      do
      {
        return localObject1;
        return new a(null);
        Object[] arrayOfObject = { "zzdks", "zzdkt", "zzdku" };
        return a(zzdkv, "", arrayOfObject);
        return zzdkv;
        localObject1 = zzakh;
      } while (localObject1 != null);
      try
      {
        Object localObject3 = zzakh;
        if (localObject3 == null)
        {
          localObject3 = new abe.b(zzdkv);
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
    return this.zzdks;
  }
  
  public final zw b()
  {
    return this.zzdkt;
  }
  
  public final b c()
  {
    b localb = b.a(this.zzdku);
    if (localb == null) {
      localb = b.f;
    }
    return localb;
  }
  
  public static final class a
    extends abe.a<wt, a>
    implements acn
  {
    private a()
    {
      super();
    }
    
    public final a a(wt.b paramb)
    {
      b();
      wt.a((wt)this.a, paramb);
      return this;
    }
    
    public final a a(zw paramzw)
    {
      b();
      wt.a((wt)this.a, paramzw);
      return this;
    }
    
    public final a a(String paramString)
    {
      b();
      wt.a((wt)this.a, paramString);
      return this;
    }
  }
  
  public static enum b
    implements abh
  {
    private static final abi<b> g = new wv();
    private final int h;
    
    static
    {
      b[] arrayOfb = new b[6];
      arrayOfb[0] = a;
      arrayOfb[1] = b;
      arrayOfb[2] = c;
      arrayOfb[3] = d;
      arrayOfb[4] = e;
      arrayOfb[5] = f;
      i = arrayOfb;
    }
    
    private b(int paramInt)
    {
      this.h = paramInt;
    }
    
    public static b a(int paramInt)
    {
      switch (paramInt)
      {
      default: 
        return null;
      case 0: 
        return a;
      case 1: 
        return b;
      case 2: 
        return c;
      case 3: 
        return d;
      }
      return e;
    }
    
    public final int a()
    {
      if (this == f) {
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
      }
      return this.h;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.wt
 * JD-Core Version:    0.7.0.1
 */