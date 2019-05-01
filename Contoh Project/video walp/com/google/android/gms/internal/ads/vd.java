package com.google.android.gms.internal.ads;

public final class vd
  extends abe<vd, a>
  implements acn
{
  private static volatile acx<vd> zzakh;
  private static final vd zzdis = new vd();
  private vf zzdio;
  private int zzdir;
  
  static
  {
    abe.a(vd.class, zzdis);
  }
  
  public static vd a(zw paramzw)
  {
    return (vd)abe.a(zzdis, paramzw);
  }
  
  public static vd c()
  {
    return zzdis;
  }
  
  public final vf a()
  {
    if (this.zzdio == null) {
      return vf.b();
    }
    return this.zzdio;
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    Object localObject1;
    switch (ve.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      localObject1 = new vd();
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      do
      {
        return localObject1;
        return new a(null);
        Object[] arrayOfObject = { "zzdio", "zzdir" };
        return a(zzdis, "", arrayOfObject);
        return zzdis;
        localObject1 = zzakh;
      } while (localObject1 != null);
      try
      {
        Object localObject3 = zzakh;
        if (localObject3 == null)
        {
          localObject3 = new abe.b(zzdis);
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
  
  public final int b()
  {
    return this.zzdir;
  }
  
  public static final class a
    extends abe.a<vd, a>
    implements acn
  {
    private a()
    {
      super();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.vd
 * JD-Core Version:    0.7.0.1
 */