package com.google.android.gms.internal.ads;

final class aoq
  implements Runnable
{
  private final avs a;
  private final bbw b;
  private final Runnable c;
  
  public aoq(amr paramamr, avs paramavs, bbw parambbw, Runnable paramRunnable)
  {
    this.a = paramavs;
    this.b = parambbw;
    this.c = paramRunnable;
  }
  
  public final void run()
  {
    this.a.g();
    int i;
    if (this.b.c == null)
    {
      i = 1;
      if (i == 0) {
        break label79;
      }
      this.a.a(this.b.a);
      label38:
      if (!this.b.d) {
        break label96;
      }
      this.a.b("intermediate-response");
    }
    for (;;)
    {
      if (this.c != null) {
        this.c.run();
      }
      return;
      i = 0;
      break;
      label79:
      this.a.a(this.b.c);
      break label38;
      label96:
      this.a.c("done");
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aoq
 * JD-Core Version:    0.7.0.1
 */