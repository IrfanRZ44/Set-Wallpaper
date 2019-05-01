package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.n;
import java.util.Iterator;
import java.util.LinkedList;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
final class ayr
{
  private final LinkedList<ays> a;
  private zzjj b;
  private final String c;
  private final int d;
  private boolean e;
  
  ayr(zzjj paramzzjj, String paramString, int paramInt)
  {
    n.a(paramzzjj);
    n.a(paramString);
    this.a = new LinkedList();
    this.b = paramzzjj;
    this.c = paramString;
    this.d = paramInt;
  }
  
  final ays a(zzjj paramzzjj)
  {
    if (paramzzjj != null) {
      this.b = paramzzjj;
    }
    return (ays)this.a.remove();
  }
  
  final zzjj a()
  {
    return this.b;
  }
  
  final void a(axk paramaxk, zzjj paramzzjj)
  {
    ays localays = new ays(this, paramaxk, paramzzjj);
    this.a.add(localays);
  }
  
  final boolean a(axk paramaxk)
  {
    ays localays = new ays(this, paramaxk);
    this.a.add(localays);
    return localays.a();
  }
  
  final int b()
  {
    return this.d;
  }
  
  final String c()
  {
    return this.c;
  }
  
  final int d()
  {
    return this.a.size();
  }
  
  final int e()
  {
    Iterator localIterator = this.a.iterator();
    int i = 0;
    if (localIterator.hasNext()) {
      if (!((ays)localIterator.next()).e) {
        break label45;
      }
    }
    label45:
    for (int j = i + 1;; j = i)
    {
      i = j;
      break;
      return i;
    }
  }
  
  final int f()
  {
    Iterator localIterator = this.a.iterator();
    int i = 0;
    if (localIterator.hasNext()) {
      if (!((ays)localIterator.next()).a()) {
        break label45;
      }
    }
    label45:
    for (int j = i + 1;; j = i)
    {
      i = j;
      break;
      return i;
    }
  }
  
  final void g()
  {
    this.e = true;
  }
  
  final boolean h()
  {
    return this.e;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ayr
 * JD-Core Version:    0.7.0.1
 */