package com.google.android.gms.internal.ads;

public final class vm
  extends abe<vm, a>
  implements acn
{
  private static volatile acx<vm> zzakh;
  private static final vm zzdiy = new vm();
  private int zzdit;
  
  static
  {
    abe.a(vm.class, zzdiy);
  }
  
  public static vm b()
  {
    return zzdiy;
  }
  
  public final int a()
  {
    return this.zzdit;
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    Object localObject1;
    switch (vn.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 1: 
      localObject1 = new vm();
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      do
      {
        return localObject1;
        return new a(null);
        Object[] arrayOfObject = { "zzdit" };
        return a(zzdiy, "", arrayOfObject);
        return zzdiy;
        localObject1 = zzakh;
      } while (localObject1 != null);
      try
      {
        Object localObject3 = zzakh;
        if (localObject3 == null)
        {
          localObject3 = new abe.b(zzdiy);
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
    extends abe.a<vm, a>
    implements acn
  {
    private a()
    {
      super();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.vm
 * JD-Core Version:    0.7.0.1
 */