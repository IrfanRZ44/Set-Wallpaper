package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

@cm
public final class ix
  implements alb
{
  private final Object a = new Object();
  private final it b;
  private final HashSet<il> c = new HashSet();
  private final HashSet<iw> d = new HashSet();
  
  public ix()
  {
    this(aos.c());
  }
  
  private ix(String paramString)
  {
    this.b = new it(paramString);
  }
  
  public final Bundle a(Context paramContext, iu paramiu, String paramString)
  {
    Bundle localBundle1;
    Bundle localBundle2;
    synchronized (this.a)
    {
      localBundle1 = new Bundle();
      localBundle1.putBundle("app", this.b.a(paramContext, paramString));
      localBundle2 = new Bundle();
      Iterator localIterator1 = this.d.iterator();
      if (localIterator1.hasNext())
      {
        iw localiw = (iw)localIterator1.next();
        localBundle2.putBundle(localiw.a(), localiw.b());
      }
    }
    localBundle1.putBundle("slots", localBundle2);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator2 = this.c.iterator();
    while (localIterator2.hasNext()) {
      localArrayList.add(((il)localIterator2.next()).d());
    }
    localBundle1.putParcelableArrayList("ads", localArrayList);
    paramiu.zza(this.c);
    this.c.clear();
    return localBundle1;
  }
  
  public final void a()
  {
    synchronized (this.a)
    {
      this.b.a();
      return;
    }
  }
  
  public final void a(il paramil)
  {
    synchronized (this.a)
    {
      this.c.add(paramil);
      return;
    }
  }
  
  public final void a(iw paramiw)
  {
    synchronized (this.a)
    {
      this.d.add(paramiw);
      return;
    }
  }
  
  public final void a(zzjj paramzzjj, long paramLong)
  {
    synchronized (this.a)
    {
      this.b.a(paramzzjj, paramLong);
      return;
    }
  }
  
  public final void a(HashSet<il> paramHashSet)
  {
    synchronized (this.a)
    {
      this.c.addAll(paramHashSet);
      return;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    long l1 = zzbv.zzer().a();
    if (paramBoolean)
    {
      long l2 = l1 - zzbv.zzeo().l().i();
      arq localarq = asa.aI;
      if (l2 > ((Long)aos.f().a(localarq)).longValue())
      {
        this.b.a = -1;
        return;
      }
      this.b.a = zzbv.zzeo().l().j();
      return;
    }
    zzbv.zzeo().l().a(l1);
    zzbv.zzeo().l().b(this.b.a);
  }
  
  public final void b()
  {
    synchronized (this.a)
    {
      this.b.b();
      return;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ix
 * JD-Core Version:    0.7.0.1
 */