package android.support.v4.f;

public class f<E>
  implements Cloneable
{
  private static final Object a = new Object();
  private boolean b = false;
  private long[] c;
  private Object[] d;
  private int e;
  
  public f()
  {
    this(10);
  }
  
  public f(int paramInt)
  {
    if (paramInt == 0) {
      this.c = c.b;
    }
    int i;
    for (this.d = c.c;; this.d = new Object[i])
    {
      this.e = 0;
      return;
      i = c.b(paramInt);
      this.c = new long[i];
    }
  }
  
  private void d()
  {
    int i = this.e;
    long[] arrayOfLong = this.c;
    Object[] arrayOfObject = this.d;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      Object localObject = arrayOfObject[j];
      if (localObject != a)
      {
        if (j != k)
        {
          arrayOfLong[k] = arrayOfLong[j];
          arrayOfObject[k] = localObject;
          arrayOfObject[j] = null;
        }
        k++;
      }
      j++;
    }
    this.b = false;
    this.e = k;
  }
  
  public f<E> a()
  {
    try
    {
      f localf = (f)super.clone();
      return localf;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException1)
    {
      try
      {
        localf.c = ((long[])this.c.clone());
        localf.d = ((Object[])this.d.clone());
        return localf;
      }
      catch (CloneNotSupportedException localCloneNotSupportedException2) {}
      localCloneNotSupportedException1 = localCloneNotSupportedException1;
      return null;
    }
  }
  
  public E a(long paramLong)
  {
    return a(paramLong, null);
  }
  
  public E a(long paramLong, E paramE)
  {
    int i = c.a(this.c, this.e, paramLong);
    if ((i < 0) || (this.d[i] == a)) {
      return paramE;
    }
    return this.d[i];
  }
  
  public void a(int paramInt)
  {
    if (this.d[paramInt] != a)
    {
      this.d[paramInt] = a;
      this.b = true;
    }
  }
  
  public int b()
  {
    if (this.b) {
      d();
    }
    return this.e;
  }
  
  public long b(int paramInt)
  {
    if (this.b) {
      d();
    }
    return this.c[paramInt];
  }
  
  public void b(long paramLong)
  {
    int i = c.a(this.c, this.e, paramLong);
    if ((i >= 0) && (this.d[i] != a))
    {
      this.d[i] = a;
      this.b = true;
    }
  }
  
  public void b(long paramLong, E paramE)
  {
    int i = c.a(this.c, this.e, paramLong);
    if (i >= 0)
    {
      this.d[i] = paramE;
      return;
    }
    int j = i ^ 0xFFFFFFFF;
    if ((j < this.e) && (this.d[j] == a))
    {
      this.c[j] = paramLong;
      this.d[j] = paramE;
      return;
    }
    if ((this.b) && (this.e >= this.c.length))
    {
      d();
      j = 0xFFFFFFFF ^ c.a(this.c, this.e, paramLong);
    }
    if (this.e >= this.c.length)
    {
      int k = c.b(1 + this.e);
      long[] arrayOfLong = new long[k];
      Object[] arrayOfObject = new Object[k];
      System.arraycopy(this.c, 0, arrayOfLong, 0, this.c.length);
      System.arraycopy(this.d, 0, arrayOfObject, 0, this.d.length);
      this.c = arrayOfLong;
      this.d = arrayOfObject;
    }
    if (this.e - j != 0)
    {
      System.arraycopy(this.c, j, this.c, j + 1, this.e - j);
      System.arraycopy(this.d, j, this.d, j + 1, this.e - j);
    }
    this.c[j] = paramLong;
    this.d[j] = paramE;
    this.e = (1 + this.e);
  }
  
  public int c(long paramLong)
  {
    if (this.b) {
      d();
    }
    return c.a(this.c, this.e, paramLong);
  }
  
  public E c(int paramInt)
  {
    if (this.b) {
      d();
    }
    return this.d[paramInt];
  }
  
  public void c()
  {
    int i = this.e;
    Object[] arrayOfObject = this.d;
    for (int j = 0; j < i; j++) {
      arrayOfObject[j] = null;
    }
    this.e = 0;
    this.b = false;
  }
  
  public String toString()
  {
    if (b() <= 0) {
      return "{}";
    }
    StringBuilder localStringBuilder = new StringBuilder(28 * this.e);
    localStringBuilder.append('{');
    int i = 0;
    if (i < this.e)
    {
      if (i > 0) {
        localStringBuilder.append(", ");
      }
      localStringBuilder.append(b(i));
      localStringBuilder.append('=');
      Object localObject = c(i);
      if (localObject != this) {
        localStringBuilder.append(localObject);
      }
      for (;;)
      {
        i++;
        break;
        localStringBuilder.append("(this Map)");
      }
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.f.f
 * JD-Core Version:    0.7.0.1
 */