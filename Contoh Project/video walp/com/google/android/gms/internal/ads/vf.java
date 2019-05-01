package com.google.android.gms.internal.ads;

public final class vf
  extends abe<vf, a>
  implements acn
{
  private static volatile acx<vf> zzakh;
  private static final vf zzdiu = new vf();
  private int zzdit;
  
  static
  {
    abe.a(vf.class, zzdiu);
  }
  
  public static vf b()
  {
    return zzdiu;
  }
  
  public final int a()
  {
    return this.zzdit;
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    Object localObject1;
    switch (vg.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      localObject1 = new vf();
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      do
      {
        return localObject1;
        return new a(null);
        Object[] arrayOfObject = { "zzdit" };
        return a(zzdiu, "", arrayOfObject);
        return zzdiu;
        localObject1 = zzakh;
      } while (localObject1 != null);
      try
      {
        Object localObject3 = zzakh;
        if (localObject3 == null)
        {
          localObject3 = new abe.b(zzdiu);
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
    extends abe.a<vf, a>
    implements acn
  {
    private a()
    {
      super();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.vf
 * JD-Core Version:    0.7.0.1
 */