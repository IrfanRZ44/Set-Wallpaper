package com.google.android.gms.common.util;

import android.support.v4.f.a;
import android.support.v4.f.b;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class d
{
  private static <K, V> Map<K, V> a(int paramInt, boolean paramBoolean, K[] paramArrayOfK, V[] paramArrayOfV)
  {
    Map localMap = b(paramInt, paramBoolean);
    a(localMap, paramArrayOfK, paramArrayOfV);
    return localMap;
  }
  
  public static <K, V> Map<K, V> a(K paramK1, V paramV1, K paramK2, V paramV2, K paramK3, V paramV3)
  {
    Map localMap = b(3, false);
    localMap.put(paramK1, paramV1);
    localMap.put(paramK2, paramV2);
    localMap.put(paramK3, paramV3);
    return Collections.unmodifiableMap(localMap);
  }
  
  public static <K, V> Map<K, V> a(K[] paramArrayOfK, V[] paramArrayOfV)
  {
    b(paramArrayOfK, paramArrayOfV);
    switch (paramArrayOfK.length)
    {
    default: 
      return Collections.unmodifiableMap(a(paramArrayOfK.length, false, paramArrayOfK, paramArrayOfV));
    case 0: 
      return b();
    }
    return b(paramArrayOfK[0], paramArrayOfV[0]);
  }
  
  @Deprecated
  public static <T> Set<T> a()
  {
    return Collections.emptySet();
  }
  
  private static <T> Set<T> a(int paramInt, boolean paramBoolean)
  {
    float f;
    if (paramBoolean)
    {
      f = 0.75F;
      if (!paramBoolean) {
        break label34;
      }
    }
    label34:
    for (int i = 128;; i = 256)
    {
      if (paramInt > i) {
        break label41;
      }
      return new b(paramInt);
      f = 1.0F;
      break;
    }
    label41:
    return new HashSet(paramInt, f);
  }
  
  private static <T> Set<T> a(int paramInt, boolean paramBoolean, T[] paramArrayOfT)
  {
    Set localSet = a(paramInt, paramBoolean);
    Collections.addAll(localSet, paramArrayOfT);
    return localSet;
  }
  
  @Deprecated
  public static <T> Set<T> a(T paramT)
  {
    return Collections.singleton(paramT);
  }
  
  @Deprecated
  public static <T> Set<T> a(T paramT1, T paramT2)
  {
    Set localSet = a(2, false);
    localSet.add(paramT1);
    localSet.add(paramT2);
    return Collections.unmodifiableSet(localSet);
  }
  
  @Deprecated
  public static <T> Set<T> a(T paramT1, T paramT2, T paramT3)
  {
    Set localSet = a(3, false);
    localSet.add(paramT1);
    localSet.add(paramT2);
    localSet.add(paramT3);
    return Collections.unmodifiableSet(localSet);
  }
  
  @Deprecated
  public static <T> Set<T> a(T paramT1, T paramT2, T paramT3, T paramT4)
  {
    Set localSet = a(4, false);
    localSet.add(paramT1);
    localSet.add(paramT2);
    localSet.add(paramT3);
    localSet.add(paramT4);
    return Collections.unmodifiableSet(localSet);
  }
  
  @Deprecated
  public static <T> Set<T> a(T... paramVarArgs)
  {
    switch (paramVarArgs.length)
    {
    default: 
      return Collections.unmodifiableSet(a(paramVarArgs.length, false, paramVarArgs));
    case 0: 
      return a();
    case 1: 
      return a(paramVarArgs[0]);
    case 2: 
      return a(paramVarArgs[0], paramVarArgs[1]);
    case 3: 
      return a(paramVarArgs[0], paramVarArgs[1], paramVarArgs[2]);
    }
    return a(paramVarArgs[0], paramVarArgs[1], paramVarArgs[2], paramVarArgs[3]);
  }
  
  private static <K, V> void a(Map<K, V> paramMap, K[] paramArrayOfK, V[] paramArrayOfV)
  {
    for (int i = 0; i < paramArrayOfK.length; i++) {
      paramMap.put(paramArrayOfK[i], paramArrayOfV[i]);
    }
  }
  
  public static <K, V> Map<K, V> b()
  {
    return Collections.emptyMap();
  }
  
  private static <K, V> Map<K, V> b(int paramInt, boolean paramBoolean)
  {
    float f;
    if (paramBoolean)
    {
      f = 0.75F;
      if (!paramBoolean) {
        break label34;
      }
    }
    label34:
    for (int i = 128;; i = 256)
    {
      if (paramInt > i) {
        break label41;
      }
      return new a(paramInt);
      f = 1.0F;
      break;
    }
    label41:
    return new HashMap(paramInt, f);
  }
  
  public static <K, V> Map<K, V> b(K paramK, V paramV)
  {
    return Collections.singletonMap(paramK, paramV);
  }
  
  private static <K, V> void b(K[] paramArrayOfK, V[] paramArrayOfV)
  {
    if (paramArrayOfK.length != paramArrayOfV.length)
    {
      int i = paramArrayOfK.length;
      int j = paramArrayOfV.length;
      throw new IllegalArgumentException(66 + "Key and values array lengths not equal: " + i + " != " + j);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.util.d
 * JD-Core Version:    0.7.0.1
 */