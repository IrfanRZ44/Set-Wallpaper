package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public final class azu
{
  private final AtomicInteger a = new AtomicInteger();
  private final Set<avs<?>> b = new HashSet();
  private final PriorityBlockingQueue<avs<?>> c = new PriorityBlockingQueue();
  private final PriorityBlockingQueue<avs<?>> d = new PriorityBlockingQueue();
  private final zn e;
  private final aqr f;
  private final b g;
  private final arp[] h;
  private aho i;
  private final List<bav> j = new ArrayList();
  
  public azu(zn paramzn, aqr paramaqr)
  {
    this(paramzn, paramaqr, 4);
  }
  
  private azu(zn paramzn, aqr paramaqr, int paramInt)
  {
    this(paramzn, paramaqr, 4, new amr(new Handler(Looper.getMainLooper())));
  }
  
  private azu(zn paramzn, aqr paramaqr, int paramInt, b paramb)
  {
    this.e = paramzn;
    this.f = paramaqr;
    this.h = new arp[4];
    this.g = paramb;
  }
  
  public final <T> avs<T> a(avs<T> paramavs)
  {
    paramavs.a(this);
    synchronized (this.b)
    {
      this.b.add(paramavs);
      paramavs.a(this.a.incrementAndGet());
      paramavs.b("add-to-queue");
      if (!paramavs.h())
      {
        this.d.add(paramavs);
        return paramavs;
      }
    }
    this.c.add(paramavs);
    return paramavs;
  }
  
  public final void a()
  {
    int k = 0;
    if (this.i != null) {
      this.i.a();
    }
    for (arp localarp2 : this.h) {
      if (localarp2 != null) {
        localarp2.a();
      }
    }
    this.i = new aho(this.c, this.d, this.e, this.g);
    this.i.start();
    while (k < this.h.length)
    {
      arp localarp1 = new arp(this.d, this.f, this.e, this.g);
      this.h[k] = localarp1;
      localarp1.start();
      k++;
    }
  }
  
  final <T> void b(avs<T> paramavs)
  {
    synchronized (this.b)
    {
      this.b.remove(paramavs);
      synchronized (this.j)
      {
        Iterator localIterator = this.j.iterator();
        if (localIterator.hasNext()) {
          ((bav)localIterator.next()).a(paramavs);
        }
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.azu
 * JD-Core Version:    0.7.0.1
 */