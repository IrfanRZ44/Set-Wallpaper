package com.a.a.c.a;

import com.a.a.c.b.a.b;
import com.a.a.c.d.a.q;
import java.io.InputStream;

public final class k
  implements e<InputStream>
{
  private final q a;
  
  k(InputStream paramInputStream, b paramb)
  {
    this.a = new q(paramInputStream, paramb);
    this.a.mark(5242880);
  }
  
  public void b()
  {
    this.a.b();
  }
  
  public InputStream c()
  {
    this.a.reset();
    return this.a;
  }
  
  public static final class a
    implements e.a<InputStream>
  {
    private final b a;
    
    public a(b paramb)
    {
      this.a = paramb;
    }
    
    public e<InputStream> a(InputStream paramInputStream)
    {
      return new k(paramInputStream, this.a);
    }
    
    public Class<InputStream> a()
    {
      return InputStream.class;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.a.k
 * JD-Core Version:    0.7.0.1
 */