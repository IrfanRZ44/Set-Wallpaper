package org.greenrobot.eventbus;

final class k
{
  private j a;
  private j b;
  
  j a()
  {
    try
    {
      j localj = this.a;
      if (this.a != null)
      {
        this.a = this.a.c;
        if (this.a == null) {
          this.b = null;
        }
      }
      return localj;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  j a(int paramInt)
  {
    try
    {
      if (this.a == null) {
        wait(paramInt);
      }
      j localj = a();
      return localj;
    }
    finally {}
  }
  
  void a(j paramj)
  {
    if (paramj == null) {
      try
      {
        throw new NullPointerException("null cannot be enqueued");
      }
      finally {}
    }
    if (this.b != null)
    {
      this.b.c = paramj;
      this.b = paramj;
    }
    for (;;)
    {
      notifyAll();
      return;
      if (this.a != null) {
        break;
      }
      this.b = paramj;
      this.a = paramj;
    }
    throw new IllegalStateException("Head present, but no tail");
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     org.greenrobot.eventbus.k
 * JD-Core Version:    0.7.0.1
 */