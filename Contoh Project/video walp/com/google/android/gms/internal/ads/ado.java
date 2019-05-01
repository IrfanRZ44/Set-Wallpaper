package com.google.android.gms.internal.ads;

import java.util.Map.Entry;

final class ado
  implements Comparable<ado>, Map.Entry<K, V>
{
  private final K a;
  private V b;
  
  ado(K paramK, V paramV)
  {
    this.a = paramV;
    Object localObject;
    this.b = localObject;
  }
  
  ado(Map.Entry<K, V> paramEntry)
  {
    this(paramEntry, (Comparable)localObject.getKey(), localObject.getValue());
  }
  
  private static boolean a(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == null) {
      return paramObject2 == null;
    }
    return paramObject1.equals(paramObject2);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    Map.Entry localEntry;
    do
    {
      return true;
      if (!(paramObject instanceof Map.Entry)) {
        return false;
      }
      localEntry = (Map.Entry)paramObject;
    } while ((a(this.a, localEntry.getKey())) && (a(this.b, localEntry.getValue())));
    return false;
  }
  
  public final V getValue()
  {
    return this.b;
  }
  
  public final int hashCode()
  {
    int i;
    int j;
    if (this.a == null)
    {
      i = 0;
      Object localObject = this.b;
      j = 0;
      if (localObject != null) {
        break label35;
      }
    }
    for (;;)
    {
      return i ^ j;
      i = this.a.hashCode();
      break;
      label35:
      j = this.b.hashCode();
    }
  }
  
  public final V setValue(V paramV)
  {
    adh.a(this.c);
    Object localObject = this.b;
    this.b = paramV;
    return localObject;
  }
  
  public final String toString()
  {
    String str1 = String.valueOf(this.a);
    String str2 = String.valueOf(this.b);
    return 1 + String.valueOf(str1).length() + String.valueOf(str2).length() + str1 + "=" + str2;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ado
 * JD-Core Version:    0.7.0.1
 */