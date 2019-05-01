package com.a.a.i;

public class g
{
  private Class<?> a;
  private Class<?> b;
  private Class<?> c;
  
  public g() {}
  
  public g(Class<?> paramClass1, Class<?> paramClass2)
  {
    a(paramClass1, paramClass2);
  }
  
  public g(Class<?> paramClass1, Class<?> paramClass2, Class<?> paramClass3)
  {
    a(paramClass1, paramClass2, paramClass3);
  }
  
  public void a(Class<?> paramClass1, Class<?> paramClass2)
  {
    a(paramClass1, paramClass2, null);
  }
  
  public void a(Class<?> paramClass1, Class<?> paramClass2, Class<?> paramClass3)
  {
    this.a = paramClass1;
    this.b = paramClass2;
    this.c = paramClass3;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    g localg;
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass())) {
        return false;
      }
      localg = (g)paramObject;
      if (!this.a.equals(localg.a)) {
        return false;
      }
      if (!this.b.equals(localg.b)) {
        return false;
      }
    } while (i.a(this.c, localg.c));
    return false;
  }
  
  public int hashCode()
  {
    int i = 31 * (31 * this.a.hashCode() + this.b.hashCode());
    if (this.c != null) {}
    for (int j = this.c.hashCode();; j = 0) {
      return j + i;
    }
  }
  
  public String toString()
  {
    return "MultiClassKey{first=" + this.a + ", second=" + this.b + '}';
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.i.g
 * JD-Core Version:    0.7.0.1
 */