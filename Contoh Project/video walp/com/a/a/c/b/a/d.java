package com.a.a.c.b.a;

import com.a.a.i.i;
import java.util.Queue;

abstract class d<T extends m>
{
  private final Queue<T> a = i.a(20);
  
  public void a(T paramT)
  {
    if (this.a.size() < 20) {
      this.a.offer(paramT);
    }
  }
  
  abstract T b();
  
  T c()
  {
    m localm = (m)this.a.poll();
    if (localm == null) {
      localm = b();
    }
    return localm;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.b.a.d
 * JD-Core Version:    0.7.0.1
 */