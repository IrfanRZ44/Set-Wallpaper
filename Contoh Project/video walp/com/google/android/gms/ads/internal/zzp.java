package com.google.android.gms.ads.internal;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public final class zzp
{
  private static String a(Bundle paramBundle)
  {
    if (paramBundle == null) {
      return null;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = new TreeSet(paramBundle.keySet()).iterator();
    if (localIterator.hasNext())
    {
      Object localObject = paramBundle.get((String)localIterator.next());
      String str;
      if (localObject == null) {
        str = "null";
      }
      for (;;)
      {
        localStringBuilder.append(str);
        break;
        if ((localObject instanceof Bundle)) {
          str = a((Bundle)localObject);
        } else {
          str = localObject.toString();
        }
      }
    }
    return localStringBuilder.toString();
  }
  
  public static Object[] zza(String paramString1, zzjj paramzzjj, String paramString2, int paramInt, zzjn paramzzjn)
  {
    HashSet localHashSet = new HashSet(Arrays.asList(paramString1.split(",")));
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramString1);
    localArrayList.add(paramString2);
    if (localHashSet.contains("formatString")) {
      localArrayList.add(null);
    }
    if (localHashSet.contains("networkType")) {
      localArrayList.add(Integer.valueOf(paramInt));
    }
    if (localHashSet.contains("birthday")) {
      localArrayList.add(Long.valueOf(paramzzjj.b));
    }
    if (localHashSet.contains("extras")) {
      localArrayList.add(a(paramzzjj.c));
    }
    if (localHashSet.contains("gender")) {
      localArrayList.add(Integer.valueOf(paramzzjj.d));
    }
    if (localHashSet.contains("keywords"))
    {
      if (paramzzjj.e != null) {
        localArrayList.add(paramzzjj.e.toString());
      }
    }
    else
    {
      if (localHashSet.contains("isTestDevice")) {
        localArrayList.add(Boolean.valueOf(paramzzjj.f));
      }
      if (localHashSet.contains("tagForChildDirectedTreatment")) {
        localArrayList.add(Integer.valueOf(paramzzjj.g));
      }
      if (localHashSet.contains("manualImpressionsEnabled")) {
        localArrayList.add(Boolean.valueOf(paramzzjj.h));
      }
      if (localHashSet.contains("publisherProvidedId")) {
        localArrayList.add(paramzzjj.i);
      }
      if (localHashSet.contains("location"))
      {
        if (paramzzjj.k == null) {
          break label507;
        }
        localArrayList.add(paramzzjj.k.toString());
      }
      label318:
      if (localHashSet.contains("contentUrl")) {
        localArrayList.add(paramzzjj.l);
      }
      if (localHashSet.contains("networkExtras")) {
        localArrayList.add(a(paramzzjj.m));
      }
      if (localHashSet.contains("customTargeting")) {
        localArrayList.add(a(paramzzjj.n));
      }
      if (localHashSet.contains("categoryExclusions"))
      {
        if (paramzzjj.o == null) {
          break label517;
        }
        localArrayList.add(paramzzjj.o.toString());
      }
    }
    for (;;)
    {
      if (localHashSet.contains("requestAgent")) {
        localArrayList.add(paramzzjj.p);
      }
      if (localHashSet.contains("requestPackage")) {
        localArrayList.add(paramzzjj.q);
      }
      if (localHashSet.contains("isDesignedForFamilies")) {
        localArrayList.add(Boolean.valueOf(paramzzjj.r));
      }
      return localArrayList.toArray();
      localArrayList.add(null);
      break;
      label507:
      localArrayList.add(null);
      break label318;
      label517:
      localArrayList.add(null);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.zzp
 * JD-Core Version:    0.7.0.1
 */