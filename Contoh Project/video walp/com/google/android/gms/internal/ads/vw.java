package com.google.android.gms.internal.ads;

public final class vw
  extends abe<vw, a>
  implements acn
{
  private static volatile acx<vw> zzakh;
  private static final vw zzdji = new vw();
  private wy zzdjh;
  
  static
  {
    abe.a(vw.class, zzdji);
  }
  
  public static vw b()
  {
    return zzdji;
  }
  
  public final wy a()
  {
    if (this.zzdjh == null) {
      return wy.c();
    }
    return this.zzdjh;
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    Object localObject1;
    switch (vx.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      localObject1 = new vw();
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      do
      {
        return localObject1;
        return new a(null);
        Object[] arrayOfObject = { "zzdjh" };
        return a(zzdji, "", arrayOfObject);
        return zzdji;
        localObject1 = zzakh;
      } while (localObject1 != null);
      try
      {
        Object localObject3 = zzakh;
        if (localObject3 == null)
        {
          localObject3 = new abe.b(zzdji);
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
  
  public static final class a
    extends abe.a<vw, a>
    implements acn
  {
    private a()
    {
      super();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.vw
 * JD-Core Version:    0.7.0.1
 */