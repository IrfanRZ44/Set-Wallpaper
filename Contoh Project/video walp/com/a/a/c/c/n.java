package com.a.a.c.c;

import com.a.a.c.a.d;
import com.a.a.c.j;
import java.util.Collections;
import java.util.List;

public abstract interface n<Model, Data>
{
  public abstract a<Data> a(Model paramModel, int paramInt1, int paramInt2, j paramj);
  
  public abstract boolean a(Model paramModel);
  
  public static class a<Data>
  {
    public final com.a.a.c.h a;
    public final List<com.a.a.c.h> b;
    public final d<Data> c;
    
    public a(com.a.a.c.h paramh, d<Data> paramd)
    {
      this(paramh, Collections.emptyList(), paramd);
    }
    
    public a(com.a.a.c.h paramh, List<com.a.a.c.h> paramList, d<Data> paramd)
    {
      this.a = ((com.a.a.c.h)com.a.a.i.h.a(paramh));
      this.b = ((List)com.a.a.i.h.a(paramList));
      this.c = ((d)com.a.a.i.h.a(paramd));
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.c.n
 * JD-Core Version:    0.7.0.1
 */