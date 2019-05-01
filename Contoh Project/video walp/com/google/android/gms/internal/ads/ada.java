package com.google.android.gms.internal.ads;

final class ada
  implements acj
{
  private final acl a;
  private final String b;
  private final adb c;
  
  ada(acl paramacl, String paramString, Object[] paramArrayOfObject)
  {
    this.a = paramacl;
    this.b = paramString;
    this.c = new adb(paramacl.getClass(), paramString, paramArrayOfObject);
  }
  
  public final int a()
  {
    if ((0x1 & adb.a(this.c)) == 1) {
      return abe.e.h;
    }
    return abe.e.i;
  }
  
  public final boolean b()
  {
    return (0x2 & adb.a(this.c)) == 2;
  }
  
  public final acl c()
  {
    return this.a;
  }
  
  final adb d()
  {
    return this.c;
  }
  
  public final int e()
  {
    return adb.b(this.c);
  }
  
  public final int f()
  {
    return adb.c(this.c);
  }
  
  public final int g()
  {
    return adb.d(this.c);
  }
  
  public final int h()
  {
    return adb.e(this.c);
  }
  
  public final int i()
  {
    return adb.f(this.c);
  }
  
  final int[] j()
  {
    return adb.g(this.c);
  }
  
  public final int k()
  {
    return adb.h(this.c);
  }
  
  public final int l()
  {
    return adb.i(this.c);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ada
 * JD-Core Version:    0.7.0.1
 */