package com.google.android.gms.internal.ads;

public final class we
  extends abe<we, a>
  implements acn
{
  private static volatile acx<we> zzakh;
  private static final we zzdjt = new we();
  private int zzdih;
  private wa zzdjj;
  private zw zzdjr = zw.a;
  private zw zzdjs = zw.a;
  
  static
  {
    abe.a(we.class, zzdjt);
  }
  
  public static we a(zw paramzw)
  {
    return (we)abe.a(zzdjt, paramzw);
  }
  
  private final void a(wa paramwa)
  {
    if (paramwa == null) {
      throw new NullPointerException();
    }
    this.zzdjj = paramwa;
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
    this.zzdjr = paramzw;
  }
  
  private final void c(zw paramzw)
  {
    if (paramzw == null) {
      throw new NullPointerException();
    }
    this.zzdjs = paramzw;
  }
  
  public static a e()
  {
    return (a)zzdjt.a(abe.e.e, null, null);
  }
  
  public static we f()
  {
    return zzdjt;
  }
  
  public final int a()
  {
    return this.zzdih;
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    Object localObject1;
    switch (wf.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      localObject1 = new we();
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      do
      {
        return localObject1;
        return new a(null);
        Object[] arrayOfObject = { "zzdih", "zzdjj", "zzdjr", "zzdjs" };
        return a(zzdjt, "", arrayOfObject);
        return zzdjt;
        localObject1 = zzakh;
      } while (localObject1 != null);
      try
      {
        Object localObject3 = zzakh;
        if (localObject3 == null)
        {
          localObject3 = new abe.b(zzdjt);
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
  
  public final wa b()
  {
    if (this.zzdjj == null) {
      return wa.d();
    }
    return this.zzdjj;
  }
  
  public final zw c()
  {
    return this.zzdjr;
  }
  
  public final zw d()
  {
    return this.zzdjs;
  }
  
  public static final class a
    extends abe.a<we, a>
    implements acn
  {
    private a()
    {
      super();
    }
    
    public final a a(int paramInt)
    {
      b();
      we.a((we)this.a, 0);
      return this;
    }
    
    public final a a(wa paramwa)
    {
      b();
      we.a((we)this.a, paramwa);
      return this;
    }
    
    public final a a(zw paramzw)
    {
      b();
      we.a((we)this.a, paramzw);
      return this;
    }
    
    public final a b(zw paramzw)
    {
      b();
      we.b((we)this.a, paramzw);
      return this;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.we
 * JD-Core Version:    0.7.0.1
 */