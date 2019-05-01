package com.google.android.gms.internal.ads;

@cm
public abstract class iz
  implements kg<ne>
{
  private final Runnable a = new ja(this);
  private volatile Thread b;
  private boolean c;
  
  public iz()
  {
    this.c = false;
  }
  
  public iz(boolean paramBoolean)
  {
    this.c = true;
  }
  
  public abstract void a();
  
  public final void b()
  {
    b_();
    if (this.b != null) {
      this.b.interrupt();
    }
  }
  
  public abstract void b_();
  
  public final ne h()
  {
    if (this.c) {
      return jl.b(this.a);
    }
    return jl.a(this.a);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.iz
 * JD-Core Version:    0.7.0.1
 */