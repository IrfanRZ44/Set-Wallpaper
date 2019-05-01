package com.a.a.i.a;

public abstract class b
{
  public static b a()
  {
    return new a();
  }
  
  abstract void a(boolean paramBoolean);
  
  public abstract void b();
  
  private static class a
    extends b
  {
    private volatile boolean a;
    
    a()
    {
      super();
    }
    
    public void a(boolean paramBoolean)
    {
      this.a = paramBoolean;
    }
    
    public void b()
    {
      if (this.a) {
        throw new IllegalStateException("Already released");
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.i.a.b
 * JD-Core Version:    0.7.0.1
 */