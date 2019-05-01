package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;

@cm
public final class aqn
{
  private final Date a;
  private final String b;
  private final int c;
  private final Set<String> d;
  private final Location e;
  private final boolean f;
  private final Bundle g;
  private final Map<Class<? extends NetworkExtras>, NetworkExtras> h;
  private final String i;
  private final String j;
  private final SearchAdRequest k;
  private final int l;
  private final Set<String> m;
  private final Bundle n;
  private final Set<String> o;
  private final boolean p;
  
  public aqn(aqo paramaqo)
  {
    this(paramaqo, null);
  }
  
  public aqn(aqo paramaqo, SearchAdRequest paramSearchAdRequest)
  {
    this.a = aqo.a(paramaqo);
    this.b = aqo.b(paramaqo);
    this.c = aqo.c(paramaqo);
    this.d = Collections.unmodifiableSet(aqo.d(paramaqo));
    this.e = aqo.e(paramaqo);
    this.f = aqo.f(paramaqo);
    this.g = aqo.g(paramaqo);
    this.h = Collections.unmodifiableMap(aqo.h(paramaqo));
    this.i = aqo.i(paramaqo);
    this.j = aqo.j(paramaqo);
    this.k = paramSearchAdRequest;
    this.l = aqo.k(paramaqo);
    this.m = Collections.unmodifiableSet(aqo.l(paramaqo));
    this.n = aqo.m(paramaqo);
    this.o = Collections.unmodifiableSet(aqo.n(paramaqo));
    this.p = aqo.o(paramaqo);
  }
  
  @Deprecated
  public final <T extends NetworkExtras> T a(Class<T> paramClass)
  {
    return (NetworkExtras)this.h.get(paramClass);
  }
  
  public final Date a()
  {
    return this.a;
  }
  
  public final boolean a(Context paramContext)
  {
    Set localSet = this.m;
    aos.a();
    return localSet.contains(lz.a(paramContext));
  }
  
  public final Bundle b(Class<? extends MediationAdapter> paramClass)
  {
    return this.g.getBundle(paramClass.getName());
  }
  
  public final String b()
  {
    return this.b;
  }
  
  public final int c()
  {
    return this.c;
  }
  
  public final Bundle c(Class<? extends CustomEvent> paramClass)
  {
    Bundle localBundle = this.g.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
    if (localBundle != null) {
      return localBundle.getBundle(paramClass.getName());
    }
    return null;
  }
  
  public final Set<String> d()
  {
    return this.d;
  }
  
  public final Location e()
  {
    return this.e;
  }
  
  public final boolean f()
  {
    return this.f;
  }
  
  public final String g()
  {
    return this.i;
  }
  
  public final String h()
  {
    return this.j;
  }
  
  public final SearchAdRequest i()
  {
    return this.k;
  }
  
  public final Map<Class<? extends NetworkExtras>, NetworkExtras> j()
  {
    return this.h;
  }
  
  public final Bundle k()
  {
    return this.g;
  }
  
  public final int l()
  {
    return this.l;
  }
  
  public final Bundle m()
  {
    return this.n;
  }
  
  public final Set<String> n()
  {
    return this.o;
  }
  
  public final boolean o()
  {
    return this.p;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aqn
 * JD-Core Version:    0.7.0.1
 */