package com.google.android.gms.internal.ads;

abstract class adx<T, B>
{
  abstract B a();
  
  abstract T a(B paramB);
  
  abstract void a(B paramB, int paramInt1, int paramInt2);
  
  abstract void a(B paramB, int paramInt, long paramLong);
  
  abstract void a(B paramB, int paramInt, zw paramzw);
  
  abstract void a(B paramB, int paramInt, T paramT);
  
  abstract void a(T paramT, aer paramaer);
  
  abstract void a(Object paramObject, T paramT);
  
  abstract boolean a(add paramadd);
  
  final boolean a(B paramB, add paramadd)
  {
    int i = paramadd.b();
    int j = i >>> 3;
    switch (i & 0x7)
    {
    default: 
      throw abk.f();
    case 0: 
      a(paramB, j, paramadd.g());
      return true;
    case 5: 
      a(paramB, j, paramadd.j());
      return true;
    case 1: 
      b(paramB, j, paramadd.i());
      return true;
    case 2: 
      a(paramB, j, paramadd.n());
      return true;
    case 3: 
      Object localObject = a();
      int k = 0x4 | j << 3;
      while ((paramadd.a() != 2147483647) && (a(localObject, paramadd))) {}
      if (k != paramadd.b()) {
        throw abk.e();
      }
      a(paramB, j, a(localObject));
      return true;
    }
    return false;
  }
  
  abstract T b(Object paramObject);
  
  abstract void b(B paramB, int paramInt, long paramLong);
  
  abstract void b(T paramT, aer paramaer);
  
  abstract void b(Object paramObject, B paramB);
  
  abstract B c(Object paramObject);
  
  abstract T c(T paramT1, T paramT2);
  
  abstract void d(Object paramObject);
  
  abstract int e(T paramT);
  
  abstract int f(T paramT);
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.adx
 * JD-Core Version:    0.7.0.1
 */