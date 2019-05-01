package com.google.android.gms.internal.ads;

final class ch
  implements Thread.UncaughtExceptionHandler
{
  ch(cg paramcg, Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler) {}
  
  public final void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    try
    {
      this.b.a(paramThread, paramThrowable);
      return;
    }
    catch (Throwable localThrowable)
    {
      mk.c("AdMob exception reporter failed reporting the exception.");
      return;
    }
    finally
    {
      if (this.a != null) {
        this.a.uncaughtException(paramThread, paramThrowable);
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ch
 * JD-Core Version:    0.7.0.1
 */