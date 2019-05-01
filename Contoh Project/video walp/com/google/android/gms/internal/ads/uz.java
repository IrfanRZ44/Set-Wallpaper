package com.google.android.gms.internal.ads;

public final class uz
  extends abe<uz, a>
  implements acn
{
  private static volatile acx<uz> zzakh;
  private static final uz zzdin = new uz();
  private vd zzdil;
  private wp zzdim;
  
  static
  {
    abe.a(uz.class, zzdin);
  }
  
  public static uz a(zw paramzw)
  {
    return (uz)abe.a(zzdin, paramzw);
  }
  
  public final vd a()
  {
    if (this.zzdil == null) {
      return vd.c();
    }
    return this.zzdil;
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    Object localObject1;
    switch (va.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      localObject1 = new uz();
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      do
      {
        return localObject1;
        return new a(null);
        Object[] arrayOfObject = { "zzdil", "zzdim" };
        return a(zzdin, "", arrayOfObject);
        return zzdin;
        localObject1 = zzakh;
      } while (localObject1 != null);
      try
      {
        Object localObject3 = zzakh;
        if (localObject3 == null)
        {
          localObject3 = new abe.b(zzdin);
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
  
  public final wp b()
  {
    if (this.zzdim == null) {
      return wp.c();
    }
    return this.zzdim;
  }
  
  public static final class a
    extends abe.a<uz, a>
    implements acn
  {
    private a()
    {
      super();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.uz
 * JD-Core Version:    0.7.0.1
 */