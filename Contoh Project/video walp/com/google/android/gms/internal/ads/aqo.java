package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

public final class aqo
{
  private final HashSet<String> a = new HashSet();
  private final Bundle b = new Bundle();
  private final HashMap<Class<? extends NetworkExtras>, NetworkExtras> c = new HashMap();
  private final HashSet<String> d = new HashSet();
  private final Bundle e = new Bundle();
  private final HashSet<String> f = new HashSet();
  private Date g;
  private String h;
  private int i = -1;
  private Location j;
  private boolean k = false;
  private String l;
  private String m;
  private int n = -1;
  private boolean o;
  
  public final void a(int paramInt)
  {
    this.i = paramInt;
  }
  
  public final void a(Location paramLocation)
  {
    this.j = paramLocation;
  }
  
  @Deprecated
  public final void a(NetworkExtras paramNetworkExtras)
  {
    if ((paramNetworkExtras instanceof AdMobExtras))
    {
      a(AdMobAdapter.class, ((AdMobExtras)paramNetworkExtras).getExtras());
      return;
    }
    this.c.put(paramNetworkExtras.getClass(), paramNetworkExtras);
  }
  
  public final void a(Class<? extends MediationAdapter> paramClass, Bundle paramBundle)
  {
    this.b.putBundle(paramClass.getName(), paramBundle);
  }
  
  public final void a(String paramString)
  {
    this.a.add(paramString);
  }
  
  public final void a(String paramString1, String paramString2)
  {
    this.e.putString(paramString1, paramString2);
  }
  
  public final void a(Date paramDate)
  {
    this.g = paramDate;
  }
  
  public final void a(boolean paramBoolean)
  {
    this.k = paramBoolean;
  }
  
  public final void b(Class<? extends CustomEvent> paramClass, Bundle paramBundle)
  {
    if (this.b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
      this.b.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
    }
    this.b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter").putBundle(paramClass.getName(), paramBundle);
  }
  
  public final void b(String paramString)
  {
    this.d.add(paramString);
  }
  
  public final void b(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i1 = 1;; i1 = 0)
    {
      this.n = i1;
      return;
    }
  }
  
  public final void c(String paramString)
  {
    this.d.remove(paramString);
  }
  
  public final void c(boolean paramBoolean)
  {
    this.o = paramBoolean;
  }
  
  public final void d(String paramString)
  {
    this.h = paramString;
  }
  
  public final void e(String paramString)
  {
    this.l = paramString;
  }
  
  public final void f(String paramString)
  {
    this.m = paramString;
  }
  
  public final void g(String paramString)
  {
    this.f.add(paramString);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aqo
 * JD-Core Version:    0.7.0.1
 */