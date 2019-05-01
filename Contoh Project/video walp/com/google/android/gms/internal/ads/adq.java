package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

class adq
  extends AbstractSet<Map.Entry<K, V>>
{
  private adq(adh paramadh) {}
  
  public void clear()
  {
    this.a.clear();
  }
  
  public boolean contains(Object paramObject)
  {
    Map.Entry localEntry = (Map.Entry)paramObject;
    Object localObject1 = this.a.get(localEntry.getKey());
    Object localObject2 = localEntry.getValue();
    return (localObject1 == localObject2) || ((localObject1 != null) && (localObject1.equals(localObject2)));
  }
  
  public Iterator<Map.Entry<K, V>> iterator()
  {
    return new adp(this.a, null);
  }
  
  public boolean remove(Object paramObject)
  {
    Map.Entry localEntry = (Map.Entry)paramObject;
    if (contains(localEntry))
    {
      this.a.remove(localEntry.getKey());
      return true;
    }
    return false;
  }
  
  public int size()
  {
    return this.a.size();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.adq
 * JD-Core Version:    0.7.0.1
 */