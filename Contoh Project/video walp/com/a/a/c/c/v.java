package com.a.a.c.c;

import com.a.a.c.a;
import com.a.a.c.a.d;
import com.a.a.c.a.d.a;
import com.a.a.c.j;
import com.a.a.g;
import com.a.a.h.b;

public class v<Model>
  implements n<Model, Model>
{
  private static final v<?> a = new v();
  
  public static <T> v<T> a()
  {
    return a;
  }
  
  public n.a<Model> a(Model paramModel, int paramInt1, int paramInt2, j paramj)
  {
    return new n.a(new b(paramModel), new b(paramModel));
  }
  
  public boolean a(Model paramModel)
  {
    return true;
  }
  
  public static class a<Model>
    implements o<Model, Model>
  {
    private static final a<?> a = new a();
    
    public static <T> a<T> a()
    {
      return a;
    }
    
    public n<Model, Model> a(r paramr)
    {
      return v.a();
    }
  }
  
  private static class b<Model>
    implements d<Model>
  {
    private final Model a;
    
    b(Model paramModel)
    {
      this.a = paramModel;
    }
    
    public Class<Model> a()
    {
      return this.a.getClass();
    }
    
    public void a(g paramg, d.a<? super Model> parama)
    {
      parama.a(this.a);
    }
    
    public void b() {}
    
    public void c() {}
    
    public a d()
    {
      return a.a;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.c.v
 * JD-Core Version:    0.7.0.1
 */