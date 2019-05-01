package android.support.v4.f;

public class n<E>
  implements Cloneable
{
  private static final Object a = new Object();
  private boolean b = false;
  private int[] c;
  private Object[] d;
  private int e;
  
  public n()
  {
    this(10);
  }
  
  public n(int paramInt)
  {
    if (paramInt == 0) {
      this.c = c.a;
    }
    int i;
    for (this.d = c.c;; this.d = new Object[i])
    {
      this.e = 0;
      return;
      i = c.a(paramInt);
      this.c = new int[i];
    }
  }
  
  private void d()
  {
    int i = this.e;
    int[] arrayOfInt = this.c;
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
          arrayOfInt[k] = arrayOfInt[j];
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
  
  public n<E> a()
  {
    try
    {
      n localn = (n)super.clone();
      return localn;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException1)
    {
      try
      {
        localn.c = ((int[])this.c.clone());
        localn.d = ((Object[])this.d.clone());
        return localn;
      }
      catch (CloneNotSupportedException localCloneNotSupportedException2) {}
      localCloneNotSupportedException1 = localCloneNotSupportedException1;
      return null;
    }
  }
  
  public E a(int paramInt)
  {
    return a(paramInt, null);
  }
  
  public E a(int paramInt, E paramE)
  {
    int i = c.a(this.c, this.e, paramInt);
    if ((i < 0) || (this.d[i] == a)) {
      return paramE;
    }
    return this.d[i];
  }
  
  public int b()
  {
    if (this.b) {
      d();
    }
    return this.e;
  }
  
  public void b(int paramInt)
  {
    int i = c.a(this.c, this.e, paramInt);
    if ((i >= 0) && (this.d[i] != a))
    {
      this.d[i] = a;
      this.b = true;
    }
  }
  
  public void b(int paramInt, E paramE)
  {
    int i = c.a(this.c, this.e, paramInt);
    if (i >= 0)
    {
      this.d[i] = paramE;
      return;
    }
    int j = i ^ 0xFFFFFFFF;
    if ((j < this.e) && (this.d[j] == a))
    {
      this.c[j] = paramInt;
      this.d[j] = paramE;
      return;
    }
    if ((this.b) && (this.e >= this.c.length))
    {
      d();
      j = 0xFFFFFFFF ^ c.a(this.c, this.e, paramInt);
    }
    if (this.e >= this.c.length)
    {
      int k = c.a(1 + this.e);
      int[] arrayOfInt = new int[k];
      Object[] arrayOfObject = new Object[k];
      System.arraycopy(this.c, 0, arrayOfInt, 0, this.c.length);
      System.arraycopy(this.d, 0, arrayOfObject, 0, this.d.length);
      this.c = arrayOfInt;
      this.d = arrayOfObject;
    }
    if (this.e - j != 0)
    {
      System.arraycopy(this.c, j, this.c, j + 1, this.e - j);
      System.arraycopy(this.d, j, this.d, j + 1, this.e - j);
    }
    this.c[j] = paramInt;
    this.d[j] = paramE;
    this.e = (1 + this.e);
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
  
  public void c(int paramInt)
  {
    b(paramInt);
  }
  
  public void c(int paramInt, E paramE)
  {
    if ((this.e != 0) && (paramInt <= this.c[(-1 + this.e)]))
    {
      b(paramInt, paramE);
      return;
    }
    if ((this.b) && (this.e >= this.c.length)) {
      d();
    }
    int i = this.e;
    if (i >= this.c.length)
    {
      int j = c.a(i + 1);
      int[] arrayOfInt = new int[j];
      Object[] arrayOfObject = new Object[j];
      System.arraycopy(this.c, 0, arrayOfInt, 0, this.c.length);
      System.arraycopy(this.d, 0, arrayOfObject, 0, this.d.length);
      this.c = arrayOfInt;
      this.d = arrayOfObject;
    }
    this.c[i] = paramInt;
    this.d[i] = paramE;
    this.e = (i + 1);
  }
  
  public int d(int paramInt)
  {
    if (this.b) {
      d();
    }
    return this.c[paramInt];
  }
  
  public E e(int paramInt)
  {
    if (this.b) {
      d();
    }
    return this.d[paramInt];
  }
  
  public int f(int paramInt)
  {
    if (this.b) {
      d();
    }
    return c.a(this.c, this.e, paramInt);
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
      localStringBuilder.append(d(i));
      localStringBuilder.append('=');
      Object localObject = e(i);
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
 * Qualified Name:     android.support.v4.f.n
 * JD-Core Version:    0.7.0.1
 */