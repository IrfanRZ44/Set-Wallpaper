package android.arch.lifecycle;

public class CompositeGeneratedAdaptersObserver
  implements GenericLifecycleObserver
{
  private final c[] a;
  
  CompositeGeneratedAdaptersObserver(c[] paramArrayOfc)
  {
    this.a = paramArrayOfc;
  }
  
  public void a(h paramh, e.a parama)
  {
    int i = 0;
    l locall = new l();
    c[] arrayOfc1 = this.a;
    int j = arrayOfc1.length;
    for (int k = 0; k < j; k++) {
      arrayOfc1[k].a(paramh, parama, false, locall);
    }
    c[] arrayOfc2 = this.a;
    int m = arrayOfc2.length;
    while (i < m)
    {
      arrayOfc2[i].a(paramh, parama, true, locall);
      i++;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.arch.lifecycle.CompositeGeneratedAdaptersObserver
 * JD-Core Version:    0.7.0.1
 */