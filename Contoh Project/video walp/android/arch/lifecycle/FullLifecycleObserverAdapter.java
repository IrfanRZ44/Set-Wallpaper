package android.arch.lifecycle;

class FullLifecycleObserverAdapter
  implements GenericLifecycleObserver
{
  private final FullLifecycleObserver a;
  
  FullLifecycleObserverAdapter(FullLifecycleObserver paramFullLifecycleObserver)
  {
    this.a = paramFullLifecycleObserver;
  }
  
  public void a(h paramh, e.a parama)
  {
    switch (1.a[parama.ordinal()])
    {
    default: 
      return;
    case 1: 
      this.a.a(paramh);
      return;
    case 2: 
      this.a.b(paramh);
      return;
    case 3: 
      this.a.c(paramh);
      return;
    case 4: 
      this.a.d(paramh);
      return;
    case 5: 
      this.a.e(paramh);
      return;
    case 6: 
      this.a.f(paramh);
      return;
    }
    throw new IllegalArgumentException("ON_ANY must not been send by anybody");
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.arch.lifecycle.FullLifecycleObserverAdapter
 * JD-Core Version:    0.7.0.1
 */