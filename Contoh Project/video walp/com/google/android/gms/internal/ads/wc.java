package com.google.android.gms.internal.ads;

public final class wc
  extends abe<wc, a>
  implements acn
{
  private static volatile acx<wc> zzakh;
  private static final wc zzdjq = new wc();
  private int zzdih;
  private zw zzdip = zw.a;
  private we zzdjp;
  
  static
  {
    abe.a(wc.class, zzdjq);
  }
  
  public static wc a(zw paramzw)
  {
    return (wc)abe.a(zzdjq, paramzw);
  }
  
  private final void a(we paramwe)
  {
    if (paramwe == null) {
      throw new NullPointerException();
    }
    this.zzdjp = paramwe;
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
    return (a)zzdjq.a(abe.e.e, null, null);
  }
  
  public final int a()
  {
    return this.zzdih;
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    Object localObject1;
    switch (wd.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      localObject1 = new wc();
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      do
      {
        return localObject1;
        return new a(null);
        Object[] arrayOfObject = { "zzdih", "zzdjp", "zzdip" };
        return a(zzdjq, "", arrayOfObject);
        return zzdjq;
        localObject1 = zzakh;
      } while (localObject1 != null);
      try
      {
        Object localObject3 = zzakh;
        if (localObject3 == null)
        {
          localObject3 = new abe.b(zzdjq);
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
  
  public final we b()
  {
    if (this.zzdjp == null) {
      return we.f();
    }
    return this.zzdjp;
  }
  
  public final zw c()
  {
    return this.zzdip;
  }
  
  public static final class a
    extends abe.a<wc, a>
    implements acn
  {
    private a()
    {
      super();
    }
    
    public final a a(int paramInt)
    {
      b();
      wc.a((wc)this.a, 0);
      return this;
    }
    
    public final a a(we paramwe)
    {
      b();
      wc.a((wc)this.a, paramwe);
      return this;
    }
    
    public final a a(zw paramzw)
    {
      b();
      wc.a((wc)this.a, paramzw);
      return this;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.wc
 * JD-Core Version:    0.7.0.1
 */