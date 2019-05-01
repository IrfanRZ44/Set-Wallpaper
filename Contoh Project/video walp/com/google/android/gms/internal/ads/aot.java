package com.google.android.gms.internal.ads;

import java.util.Random;

@cm
public final class aot
  extends apz
{
  private final Random a = new Random();
  private long b;
  private Object c = new Object();
  
  public aot()
  {
    a();
  }
  
  public final void a()
  {
    Object localObject1 = this.c;
    int i = 3;
    long l = 0L;
    for (;;)
    {
      i--;
      if (i > 0) {}
      try
      {
        l = 2147483648L + this.a.nextInt();
        if ((l == this.b) || (l == 0L)) {
          continue;
        }
        this.b = l;
        return;
      }
      finally {}
    }
  }
  
  public final long b()
  {
    return this.b;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aot
 * JD-Core Version:    0.7.0.1
 */