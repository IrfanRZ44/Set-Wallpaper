package com.google.android.gms.internal.ads;

public abstract class aew<M extends aew<M>>
  extends afc
{
  protected aey Y;
  
  protected int a()
  {
    int i = 0;
    if (this.Y != null)
    {
      j = 0;
      while (i < this.Y.a())
      {
        j += this.Y.b(i).a();
        i++;
      }
    }
    int j = 0;
    return j;
  }
  
  public void a(aeu paramaeu)
  {
    if (this.Y == null) {}
    for (;;)
    {
      return;
      for (int i = 0; i < this.Y.a(); i++) {
        this.Y.b(i).a(paramaeu);
      }
    }
  }
  
  protected final boolean a(aes paramaes, int paramInt)
  {
    int i = paramaes.j();
    if (!paramaes.b(paramInt)) {
      return false;
    }
    int j = paramInt >>> 3;
    afe localafe = new afe(paramInt, paramaes.a(i, paramaes.j() - i));
    aez localaez = null;
    if (this.Y == null) {
      this.Y = new aey();
    }
    for (;;)
    {
      if (localaez == null)
      {
        localaez = new aez();
        this.Y.a(j, localaez);
      }
      localaez.a(localafe);
      return true;
      localaez = this.Y.a(j);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aew
 * JD-Core Version:    0.7.0.1
 */