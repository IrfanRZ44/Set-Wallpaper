package android.support.v4.f;

public class j<F, S>
{
  public final F a;
  public final S b;
  
  public j(F paramF, S paramS)
  {
    this.a = paramF;
    this.b = paramS;
  }
  
  private static boolean a(Object paramObject1, Object paramObject2)
  {
    return (paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2)));
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof j)) {}
    j localj;
    do
    {
      return false;
      localj = (j)paramObject;
    } while ((!a(localj.a, this.a)) || (!a(localj.b, this.b)));
    return true;
  }
  
  public int hashCode()
  {
    int i;
    int j;
    if (this.a == null)
    {
      i = 0;
      Object localObject = this.b;
      j = 0;
      if (localObject != null) {
        break label35;
      }
    }
    for (;;)
    {
      return i ^ j;
      i = this.a.hashCode();
      break;
      label35:
      j = this.b.hashCode();
    }
  }
  
  public String toString()
  {
    return "Pair{" + String.valueOf(this.a) + " " + String.valueOf(this.b) + "}";
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.f.j
 * JD-Core Version:    0.7.0.1
 */