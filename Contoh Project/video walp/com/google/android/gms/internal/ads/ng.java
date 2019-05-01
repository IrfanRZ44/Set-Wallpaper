package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

@cm
final class ng
{
  private final Object a = new Object();
  private final List<Runnable> b = new ArrayList();
  private boolean c = false;
  
  public final void a()
  {
    ArrayList localArrayList1 = new ArrayList();
    synchronized (this.a)
    {
      if (this.c) {
        return;
      }
      localArrayList1.addAll(this.b);
      this.b.clear();
      this.c = true;
      ArrayList localArrayList2 = (ArrayList)localArrayList1;
      int i = localArrayList2.size();
      int j = 0;
      if (j < i)
      {
        Object localObject3 = localArrayList2.get(j);
        j++;
        ((Runnable)localObject3).run();
      }
    }
  }
  
  public final void a(Runnable paramRunnable, Executor paramExecutor)
  {
    synchronized (this.a)
    {
      if (this.c)
      {
        paramExecutor.execute(paramRunnable);
        return;
      }
      this.b.add(new nh(paramExecutor, paramRunnable));
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ng
 * JD-Core Version:    0.7.0.1
 */