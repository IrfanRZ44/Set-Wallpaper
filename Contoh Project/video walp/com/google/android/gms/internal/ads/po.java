package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@cm
public final class po
  implements Iterable<pm>
{
  private final List<pm> a = new ArrayList();
  
  public static boolean a(pd parampd)
  {
    pm localpm = b(parampd);
    if (localpm != null)
    {
      localpm.b.a();
      return true;
    }
    return false;
  }
  
  static pm b(pd parampd)
  {
    Iterator localIterator = zzbv.zzff().iterator();
    while (localIterator.hasNext())
    {
      pm localpm = (pm)localIterator.next();
      if (localpm.a == parampd) {
        return localpm;
      }
    }
    return null;
  }
  
  public final int a()
  {
    return this.a.size();
  }
  
  public final void a(pm parampm)
  {
    this.a.add(parampm);
  }
  
  public final void b(pm parampm)
  {
    this.a.remove(parampm);
  }
  
  public final Iterator<pm> iterator()
  {
    return this.a.iterator();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.po
 * JD-Core Version:    0.7.0.1
 */