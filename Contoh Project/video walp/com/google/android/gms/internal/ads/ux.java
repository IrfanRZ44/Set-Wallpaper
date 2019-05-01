package com.google.android.gms.internal.ads;

public final class ux
  extends abe<ux, a>
  implements acn
{
  private static volatile acx<ux> zzakh;
  private static final ux zzdik = new ux();
  private int zzdih;
  private vb zzdii;
  private wn zzdij;
  
  static
  {
    abe.a(ux.class, zzdik);
  }
  
  public static ux a(zw paramzw)
  {
    return (ux)abe.a(zzdik, paramzw);
  }
  
  private final void a(vb paramvb)
  {
    if (paramvb == null) {
      throw new NullPointerException();
    }
    this.zzdii = paramvb;
  }
  
  private final void a(wn paramwn)
  {
    if (paramwn == null) {
      throw new NullPointerException();
    }
    this.zzdij = paramwn;
  }
  
  private final void b(int paramInt)
  {
    this.zzdih = paramInt;
  }
  
  public static a d()
  {
    return (a)zzdik.a(abe.e.e, null, null);
  }
  
  public final int a()
  {
    return this.zzdih;
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    Object localObject1;
    switch (uy.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      localObject1 = new ux();
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      do
      {
        return localObject1;
        return new a(null);
        Object[] arrayOfObject = { "zzdih", "zzdii", "zzdij" };
        return a(zzdik, "", arrayOfObject);
        return zzdik;
        localObject1 = zzakh;
      } while (localObject1 != null);
      try
      {
        Object localObject3 = zzakh;
        if (localObject3 == null)
        {
          localObject3 = new abe.b(zzdik);
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
  
  public final vb b()
  {
    if (this.zzdii == null) {
      return vb.e();
    }
    return this.zzdii;
  }
  
  public final wn c()
  {
    if (this.zzdij == null) {
      return wn.e();
    }
    return this.zzdij;
  }
  
  public static final class a
    extends abe.a<ux, a>
    implements acn
  {
    private a()
    {
      super();
    }
    
    public final a a(int paramInt)
    {
      b();
      ux.a((ux)this.a, paramInt);
      return this;
    }
    
    public final a a(vb paramvb)
    {
      b();
      ux.a((ux)this.a, paramvb);
      return this;
    }
    
    public final a a(wn paramwn)
    {
      b();
      ux.a((ux)this.a, paramwn);
      return this;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ux
 * JD-Core Version:    0.7.0.1
 */