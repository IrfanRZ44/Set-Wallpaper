package com.google.android.gms.internal.ads;

import java.util.Map.Entry;

final class abp<K>
  implements Map.Entry<K, Object>
{
  private Map.Entry<K, abn> a;
  
  private abp(Map.Entry<K, abn> paramEntry)
  {
    this.a = paramEntry;
  }
  
  public final abn a()
  {
    return (abn)this.a.getValue();
  }
  
  public final K getKey()
  {
    return this.a.getKey();
  }
  
  public final Object getValue()
  {
    if ((abn)this.a.getValue() == null) {
      return null;
    }
    return abn.a();
  }
  
  public final Object setValue(Object paramObject)
  {
    if (!(paramObject instanceof acl)) {
      throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
    return ((abn)this.a.getValue()).a((acl)paramObject);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.abp
 * JD-Core Version:    0.7.0.1
 */