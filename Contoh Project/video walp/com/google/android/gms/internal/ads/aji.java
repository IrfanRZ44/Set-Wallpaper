package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public final class aji
  implements ajr
{
  private final Object a = new Object();
  private final WeakHashMap<ij, ajj> b = new WeakHashMap();
  private final ArrayList<ajj> c = new ArrayList();
  private final Context d;
  private final zzang e;
  private final baa f;
  
  public aji(Context paramContext, zzang paramzzang)
  {
    this.d = paramContext.getApplicationContext();
    this.e = paramzzang;
    Context localContext = paramContext.getApplicationContext();
    arq localarq = asa.a;
    this.f = new baa(localContext, paramzzang, (String)aos.f().a(localarq));
  }
  
  private final boolean e(ij paramij)
  {
    for (;;)
    {
      synchronized (this.a)
      {
        ajj localajj = (ajj)this.b.get(paramij);
        if ((localajj != null) && (localajj.c()))
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public final void a(ajj paramajj)
  {
    synchronized (this.a)
    {
      if (!paramajj.c())
      {
        this.c.remove(paramajj);
        Iterator localIterator = this.b.entrySet().iterator();
        while (localIterator.hasNext()) {
          if (((Map.Entry)localIterator.next()).getValue() == paramajj) {
            localIterator.remove();
          }
        }
      }
    }
  }
  
  public final void a(ij paramij)
  {
    synchronized (this.a)
    {
      ajj localajj = (ajj)this.b.get(paramij);
      if (localajj != null) {
        localajj.b();
      }
      return;
    }
  }
  
  public final void a(zzjn paramzzjn, ij paramij)
  {
    a(paramzzjn, paramij, paramij.b.getView());
  }
  
  public final void a(zzjn paramzzjn, ij paramij, View paramView)
  {
    a(paramzzjn, paramij, new ajp(paramView, paramij), null);
  }
  
  public final void a(zzjn paramzzjn, ij paramij, View paramView, qe paramqe)
  {
    a(paramzzjn, paramij, new ajp(paramView, paramij), paramqe);
  }
  
  public final void a(zzjn paramzzjn, ij paramij, akv paramakv, qe paramqe)
  {
    for (;;)
    {
      ajj localajj;
      synchronized (this.a)
      {
        if (e(paramij))
        {
          localajj = (ajj)this.b.get(paramij);
          if (paramqe != null) {
            localajj.a(new ajs(localajj, paramqe));
          }
        }
        else
        {
          localajj = new ajj(this.d, paramzzjn, paramij, this.e, paramakv);
          localajj.a(this);
          this.b.put(paramij, localajj);
          this.c.add(localajj);
        }
      }
      localajj.a(new ajw(localajj, this.f, this.d));
    }
  }
  
  public final void b(ij paramij)
  {
    synchronized (this.a)
    {
      ajj localajj = (ajj)this.b.get(paramij);
      if (localajj != null) {
        localajj.d();
      }
      return;
    }
  }
  
  public final void c(ij paramij)
  {
    synchronized (this.a)
    {
      ajj localajj = (ajj)this.b.get(paramij);
      if (localajj != null) {
        localajj.e();
      }
      return;
    }
  }
  
  public final void d(ij paramij)
  {
    synchronized (this.a)
    {
      ajj localajj = (ajj)this.b.get(paramij);
      if (localajj != null) {
        localajj.f();
      }
      return;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aji
 * JD-Core Version:    0.7.0.1
 */