package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@cm
final class axl
{
  private final List<ayl> a = new ArrayList();
  
  final void a(aym paramaym)
  {
    Handler localHandler = jn.a;
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      localHandler.post(new ayk(this, (ayl)localIterator.next(), paramaym));
    }
    this.a.clear();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.axl
 * JD-Core Version:    0.7.0.1
 */