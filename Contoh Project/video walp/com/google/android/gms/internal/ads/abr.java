package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map.Entry;

final class abr<K>
  implements Iterator<Map.Entry<K, Object>>
{
  private Iterator<Map.Entry<K, Object>> a;
  
  public abr(Iterator<Map.Entry<K, Object>> paramIterator)
  {
    this.a = paramIterator;
  }
  
  public final boolean hasNext()
  {
    return this.a.hasNext();
  }
  
  public final void remove()
  {
    this.a.remove();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.abr
 * JD-Core Version:    0.7.0.1
 */