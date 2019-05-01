package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class adj
  implements Iterator<Map.Entry<K, V>>
{
  private int a = adh.b(this.c).size();
  private Iterator<Map.Entry<K, V>> b;
  
  private adj(adh paramadh) {}
  
  private final Iterator<Map.Entry<K, V>> a()
  {
    if (this.b == null) {
      this.b = adh.d(this.c).entrySet().iterator();
    }
    return this.b;
  }
  
  public final boolean hasNext()
  {
    return ((this.a > 0) && (this.a <= adh.b(this.c).size())) || (a().hasNext());
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.adj
 * JD-Core Version:    0.7.0.1
 */