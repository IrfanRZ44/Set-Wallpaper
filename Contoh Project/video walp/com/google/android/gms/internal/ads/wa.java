package com.google.android.gms.internal.ads;

public final class wa
  extends abe<wa, a>
  implements acn
{
  private static volatile acx<wa> zzakh;
  private static final wa zzdjo = new wa();
  private wg zzdjl;
  private vw zzdjm;
  private int zzdjn;
  
  static
  {
    abe.a(wa.class, zzdjo);
  }
  
  public static wa d()
  {
    return zzdjo;
  }
  
  public final wg a()
  {
    if (this.zzdjl == null) {
      return wg.d();
    }
    return this.zzdjl;
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    Object localObject1;
    switch (wb.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      localObject1 = new wa();
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      do
      {
        return localObject1;
        return new a(null);
        Object[] arrayOfObject = { "zzdjl", "zzdjm", "zzdjn" };
        return a(zzdjo, "", arrayOfObject);
        return zzdjo;
        localObject1 = zzakh;
      } while (localObject1 != null);
      try
      {
        Object localObject3 = zzakh;
        if (localObject3 == null)
        {
          localObject3 = new abe.b(zzdjo);
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
  
  public final vw b()
  {
    if (this.zzdjm == null) {
      return vw.b();
    }
    return this.zzdjm;
  }
  
  public final vu c()
  {
    vu localvu = vu.a(this.zzdjn);
    if (localvu == null) {
      localvu = vu.d;
    }
    return localvu;
  }
  
  public static final class a
    extends abe.a<wa, a>
    implements acn
  {
    private a()
    {
      super();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.wa
 * JD-Core Version:    0.7.0.1
 */