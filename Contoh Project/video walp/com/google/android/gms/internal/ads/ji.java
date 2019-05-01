package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

final class ji
  extends jj
{
  ji(jg paramjg, Bundle paramBundle)
  {
    super(null);
  }
  
  public final void a()
  {
    Iterator localIterator = jg.r(this.b).iterator();
    while (localIterator.hasNext()) {
      ((jk)localIterator.next()).a(this.a);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ji
 * JD-Core Version:    0.7.0.1
 */