package com.google.android.gms.internal.ads;

import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

final class zi
  extends zf
{
  private final zg a = new zg();
  
  public final void a(Throwable paramThrowable, PrintWriter paramPrintWriter)
  {
    paramThrowable.printStackTrace(paramPrintWriter);
    List localList = this.a.a(paramThrowable, false);
    if (localList == null) {
      return;
    }
    try
    {
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        Throwable localThrowable = (Throwable)localIterator.next();
        paramPrintWriter.print("Suppressed: ");
        localThrowable.printStackTrace(paramPrintWriter);
      }
    }
    finally {}
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.zi
 * JD-Core Version:    0.7.0.1
 */