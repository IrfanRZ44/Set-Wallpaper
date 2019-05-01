package org.greenrobot.eventbus;

import java.util.ArrayList;
import java.util.List;

final class j
{
  private static final List<j> d = new ArrayList();
  Object a;
  q b;
  j c;
  
  private j(Object paramObject, q paramq)
  {
    this.a = paramObject;
    this.b = paramq;
  }
  
  static j a(q paramq, Object paramObject)
  {
    synchronized (d)
    {
      int i = d.size();
      if (i > 0)
      {
        j localj = (j)d.remove(i - 1);
        localj.a = paramObject;
        localj.b = paramq;
        localj.c = null;
        return localj;
      }
      return new j(paramObject, paramq);
    }
  }
  
  static void a(j paramj)
  {
    paramj.a = null;
    paramj.b = null;
    paramj.c = null;
    synchronized (d)
    {
      if (d.size() < 10000) {
        d.add(paramj);
      }
      return;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     org.greenrobot.eventbus.j
 * JD-Core Version:    0.7.0.1
 */