package org.greenrobot.eventbus;

import java.util.concurrent.ExecutorService;

class a
  implements Runnable, l
{
  private final k a;
  private final c b;
  
  a(c paramc)
  {
    this.b = paramc;
    this.a = new k();
  }
  
  public void a(q paramq, Object paramObject)
  {
    j localj = j.a(paramq, paramObject);
    this.a.a(localj);
    this.b.b().execute(this);
  }
  
  public void run()
  {
    j localj = this.a.a();
    if (localj == null) {
      throw new IllegalStateException("No pending post available");
    }
    this.b.a(localj);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     org.greenrobot.eventbus.a
 * JD-Core Version:    0.7.0.1
 */