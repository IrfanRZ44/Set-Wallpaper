package com.a.a.c.b;

import com.a.a.c.h;
import java.util.HashMap;
import java.util.Map;

final class r
{
  private final Map<h, k<?>> a = new HashMap();
  private final Map<h, k<?>> b = new HashMap();
  
  private Map<h, k<?>> a(boolean paramBoolean)
  {
    if (paramBoolean) {
      return this.b;
    }
    return this.a;
  }
  
  k<?> a(h paramh, boolean paramBoolean)
  {
    return (k)a(paramBoolean).get(paramh);
  }
  
  void a(h paramh, k<?> paramk)
  {
    a(paramk.a()).put(paramh, paramk);
  }
  
  void b(h paramh, k<?> paramk)
  {
    Map localMap = a(paramk.a());
    if (paramk.equals(localMap.get(paramh))) {
      localMap.remove(paramh);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.b.r
 * JD-Core Version:    0.7.0.1
 */