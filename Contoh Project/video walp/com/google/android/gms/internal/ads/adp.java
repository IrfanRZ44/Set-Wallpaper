package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class adp
  implements Iterator<Map.Entry<K, V>>
{
  private int a = -1;
  private boolean b;
  private Iterator<Map.Entry<K, V>> c;
  
  private adp(adh paramadh) {}
  
  private final Iterator<Map.Entry<K, V>> a()
  {
    if (this.c == null) {
      this.c = adh.c(this.d).entrySet().iterator();
    }
    return this.c;
  }
  
  public final boolean hasNext()
  {
    return (1 + this.a < adh.b(this.d).size()) || ((!adh.c(this.d).isEmpty()) && (a().hasNext()));
  }
  
  public final void remove()
  {
    if (!this.b) {
      throw new IllegalStateException("remove() was called before next()");
    }
    this.b = false;
    adh.a(this.d);
    if (this.a < adh.b(this.d).size())
    {
      adh localadh = this.d;
      int i = this.a;
      this.a = (i - 1);
      adh.a(localadh, i);
      return;
    }
    a().remove();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.adp
 * JD-Core Version:    0.7.0.1
 */