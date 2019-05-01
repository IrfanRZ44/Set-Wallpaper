package com.google.android.gms.internal.ads;

public final class vh
  extends abe<vh, a>
  implements acn
{
  private static volatile acx<vh> zzakh;
  private static final vh zzdiw = new vh();
  private int zzdih;
  private zw zzdip = zw.a;
  private vm zzdiv;
  
  static
  {
    abe.a(vh.class, zzdiw);
  }
  
  public static vh a(zw paramzw)
  {
    return (vh)abe.a(zzdiw, paramzw);
  }
  
  private final void a(vm paramvm)
  {
    if (paramvm == null) {
      throw new NullPointerException();
    }
    this.zzdiv = paramvm;
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
    return (a)zzdiw.a(abe.e.e, null, null);
  }
  
  public final int a()
  {
    return this.zzdih;
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    Object localObject1;
    switch (vi.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      localObject1 = new vh();
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      do
      {
        return localObject1;
        return new a(null);
        Object[] arrayOfObject = { "zzdih", "zzdiv", "zzdip" };
        return a(zzdiw, "", arrayOfObject);
        return zzdiw;
        localObject1 = zzakh;
      } while (localObject1 != null);
      try
      {
        Object localObject3 = zzakh;
        if (localObject3 == null)
        {
          localObject3 = new abe.b(zzdiw);
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
  
  public final vm b()
  {
    if (this.zzdiv == null) {
      return vm.b();
    }
    return this.zzdiv;
  }
  
  public final zw c()
  {
    return this.zzdip;
  }
  
  public static final class a
    extends abe.a<vh, a>
    implements acn
  {
    private a()
    {
      super();
    }
    
    public final a a(int paramInt)
    {
      b();
      vh.a((vh)this.a, 0);
      return this;
    }
    
    public final a a(vm paramvm)
    {
      b();
      vh.a((vh)this.a, paramvm);
      return this;
    }
    
    public final a a(zw paramzw)
    {
      b();
      vh.a((vh)this.a, paramzw);
      return this;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.vh
 * JD-Core Version:    0.7.0.1
 */