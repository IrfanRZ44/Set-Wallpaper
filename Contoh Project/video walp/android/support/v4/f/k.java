package android.support.v4.f;

public final class k
{
  public static abstract interface a<T>
  {
    public abstract T a();
    
    public abstract boolean a(T paramT);
  }
  
  public static class b<T>
    implements k.a<T>
  {
    private final Object[] a;
    private int b;
    
    public b(int paramInt)
    {
      if (paramInt <= 0) {
        throw new IllegalArgumentException("The max pool size must be > 0");
      }
      this.a = new Object[paramInt];
    }
    
    private boolean b(T paramT)
    {
      for (int i = 0;; i++)
      {
        int j = this.b;
        boolean bool = false;
        if (i < j)
        {
          if (this.a[i] == paramT) {
            bool = true;
          }
        }
        else {
          return bool;
        }
      }
    }
    
    public T a()
    {
      if (this.b > 0)
      {
        int i = -1 + this.b;
        Object localObject = this.a[i];
        this.a[i] = null;
        this.b = (-1 + this.b);
        return localObject;
      }
      return null;
    }
    
    public boolean a(T paramT)
    {
      if (b(paramT)) {
        throw new IllegalStateException("Already in the pool!");
      }
      if (this.b < this.a.length)
      {
        this.a[this.b] = paramT;
        this.b = (1 + this.b);
        return true;
      }
      return false;
    }
  }
  
  public static class c<T>
    extends k.b<T>
  {
    private final Object a = new Object();
    
    public c(int paramInt)
    {
      super();
    }
    
    public T a()
    {
      synchronized (this.a)
      {
        Object localObject3 = super.a();
        return localObject3;
      }
    }
    
    public boolean a(T paramT)
    {
      synchronized (this.a)
      {
        boolean bool = super.a(paramT);
        return bool;
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.f.k
 * JD-Core Version:    0.7.0.1
 */