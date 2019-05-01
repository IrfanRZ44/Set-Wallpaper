package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.n;

public final class bar
  extends nv<azo>
{
  private final Object a = new Object();
  private ks<azo> b;
  private boolean c;
  private int d;
  
  public bar(ks<azo> paramks)
  {
    this.b = paramks;
    this.c = false;
    this.d = 0;
  }
  
  private final void f()
  {
    for (;;)
    {
      synchronized (this.a)
      {
        if (this.d >= 0)
        {
          bool = true;
          n.a(bool);
          if ((this.c) && (this.d == 0))
          {
            je.a("No reference is left (including root). Cleaning up engine.");
            a(new bau(this), new nt());
            return;
          }
          je.a("There are still references to the engine. Not destroying.");
        }
      }
      boolean bool = false;
    }
  }
  
  public final ban c()
  {
    ban localban = new ban(this);
    for (;;)
    {
      synchronized (this.a)
      {
        a(new bas(this, localban), new bat(this, localban));
        if (this.d >= 0)
        {
          bool = true;
          n.a(bool);
          this.d = (1 + this.d);
          return localban;
        }
      }
      boolean bool = false;
    }
  }
  
  protected final void d()
  {
    for (;;)
    {
      synchronized (this.a)
      {
        if (this.d > 0)
        {
          bool = true;
          n.a(bool);
          je.a("Releasing 1 reference for JS Engine");
          this.d = (-1 + this.d);
          f();
          return;
        }
      }
      boolean bool = false;
    }
  }
  
  public final void e()
  {
    for (boolean bool = true;; bool = false) {
      synchronized (this.a)
      {
        if (this.d >= 0)
        {
          n.a(bool);
          je.a("Releasing root reference. JS Engine will be destroyed once other references are released.");
          this.c = true;
          f();
          return;
        }
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bar
 * JD-Core Version:    0.7.0.1
 */