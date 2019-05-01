package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class bcg
  implements Runnable
{
  bcg(bce parambce, ne paramne) {}
  
  public final void run()
  {
    Iterator localIterator = bce.e(this.b).keySet().iterator();
    while (localIterator.hasNext())
    {
      ne localne = (ne)localIterator.next();
      if (localne != this.a) {
        ((bby)bce.e(this.b).get(localne)).a();
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bcg
 * JD-Core Version:    0.7.0.1
 */