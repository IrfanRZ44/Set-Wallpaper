package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.common.internal.n;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public final class atp
  extends atv
{
  private bcw c;
  private bda d;
  private bdd e;
  private final ats f;
  private atq g;
  private boolean h = false;
  private Object i = new Object();
  
  private atp(Context paramContext, ats paramats, agw paramagw, att paramatt)
  {
    super(paramContext, paramats, null, paramagw, null, paramatt, null, null);
    this.f = paramats;
  }
  
  public atp(Context paramContext, ats paramats, agw paramagw, bcw parambcw, att paramatt)
  {
    this(paramContext, paramats, paramagw, paramatt);
    this.c = parambcw;
  }
  
  public atp(Context paramContext, ats paramats, agw paramagw, bda parambda, att paramatt)
  {
    this(paramContext, paramats, paramagw, paramatt);
    this.d = parambda;
  }
  
  public atp(Context paramContext, ats paramats, agw paramagw, bdd parambdd, att paramatt)
  {
    this(paramContext, paramats, paramagw, paramatt);
    this.e = parambdd;
  }
  
  private static HashMap<String, View> b(Map<String, WeakReference<View>> paramMap)
  {
    HashMap localHashMap = new HashMap();
    if (paramMap == null) {
      return localHashMap;
    }
    try
    {
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        View localView = (View)((WeakReference)localEntry.getValue()).get();
        if (localView != null) {
          localHashMap.put((String)localEntry.getKey(), localView);
        }
      }
    }
    finally {}
    return localHashMap;
  }
  
  public final View a(View.OnClickListener paramOnClickListener, boolean paramBoolean)
  {
    for (;;)
    {
      synchronized (this.i)
      {
        if (this.g != null)
        {
          View localView2 = this.g.a(paramOnClickListener, paramBoolean);
          return localView2;
        }
        try
        {
          if (this.e == null) {
            break label81;
          }
          a locala2 = this.e.l();
          localObject3 = locala2;
        }
        catch (RemoteException localRemoteException)
        {
          View localView1;
          a locala1;
          je.c("Failed to call getAdChoicesContent", localRemoteException);
          break label143;
          return null;
          Object localObject3 = null;
          continue;
        }
        if (localObject3 == null) {
          break;
        }
        localView1 = (View)b.a((a)localObject3);
        return localView1;
      }
      label81:
      if (this.c != null)
      {
        localObject3 = this.c.n();
      }
      else
      {
        if (this.d == null) {
          break label143;
        }
        locala1 = this.d.k();
        localObject3 = locala1;
      }
    }
  }
  
  public final void a(View paramView)
  {
    synchronized (this.i)
    {
      if (this.g != null) {
        this.g.a(paramView);
      }
      return;
    }
  }
  
  public final void a(View paramView, Map<String, WeakReference<View>> paramMap)
  {
    n.b("recordImpression must be called on the main UI thread.");
    for (;;)
    {
      synchronized (this.i)
      {
        this.a = true;
        if (this.g != null)
        {
          this.g.a(paramView, paramMap);
          this.f.recordImpression();
          return;
        }
        try
        {
          if ((this.e != null) && (!this.e.p()))
          {
            this.e.r();
            this.f.recordImpression();
          }
        }
        catch (RemoteException localRemoteException)
        {
          je.c("Failed to call recordImpression", localRemoteException);
        }
      }
      if ((this.c != null) && (!this.c.j()))
      {
        this.c.i();
        this.f.recordImpression();
      }
      else if ((this.d != null) && (!this.d.h()))
      {
        this.d.g();
        this.f.recordImpression();
      }
    }
  }
  
  public final void a(View paramView1, Map<String, WeakReference<View>> paramMap, Bundle paramBundle, View paramView2)
  {
    n.b("performClick must be called on the main UI thread.");
    for (;;)
    {
      synchronized (this.i)
      {
        if (this.g != null)
        {
          this.g.a(paramView1, paramMap, paramBundle, paramView2);
          this.f.onAdClicked();
          return;
        }
        try
        {
          if ((this.e != null) && (!this.e.q()))
          {
            this.e.a(b.a(paramView1));
            this.f.onAdClicked();
          }
        }
        catch (RemoteException localRemoteException)
        {
          je.c("Failed to call performClick", localRemoteException);
        }
      }
      if ((this.c != null) && (!this.c.k()))
      {
        this.c.a(b.a(paramView1));
        this.f.onAdClicked();
      }
      else if ((this.d != null) && (!this.d.i()))
      {
        this.d.a(b.a(paramView1));
        this.f.onAdClicked();
      }
    }
  }
  
  public final void a(View paramView, Map<String, WeakReference<View>> paramMap1, Map<String, WeakReference<View>> paramMap2, View.OnTouchListener paramOnTouchListener, View.OnClickListener paramOnClickListener)
  {
    for (;;)
    {
      HashMap localHashMap1;
      HashMap localHashMap2;
      synchronized (this.i)
      {
        this.h = true;
        localHashMap1 = b(paramMap1);
        localHashMap2 = b(paramMap2);
        try
        {
          if (this.e != null)
          {
            this.e.a(b.a(paramView), b.a(localHashMap1), b.a(localHashMap2));
            this.h = false;
            return;
          }
          if (this.c != null)
          {
            this.c.a(b.a(paramView), b.a(localHashMap1), b.a(localHashMap2));
            this.c.b(b.a(paramView));
            continue;
          }
        }
        catch (RemoteException localRemoteException)
        {
          je.c("Failed to call prepareAd", localRemoteException);
          continue;
        }
      }
      if (this.d != null)
      {
        this.d.a(b.a(paramView), b.a(localHashMap1), b.a(localHashMap2));
        this.d.b(b.a(paramView));
      }
    }
  }
  
  public final void a(atq paramatq)
  {
    synchronized (this.i)
    {
      this.g = paramatq;
      return;
    }
  }
  
  public final void a(awh paramawh)
  {
    synchronized (this.i)
    {
      if (this.g != null) {
        this.g.a(paramawh);
      }
      return;
    }
  }
  
  public final boolean a()
  {
    synchronized (this.i)
    {
      if (this.g != null)
      {
        boolean bool2 = this.g.a();
        return bool2;
      }
      boolean bool1 = this.f.zzcu();
      return bool1;
    }
  }
  
  public final void b(View paramView, Map<String, WeakReference<View>> paramMap)
  {
    for (;;)
    {
      synchronized (this.i)
      {
        try
        {
          if (this.e != null)
          {
            this.e.b(b.a(paramView));
            return;
          }
          if (this.c != null)
          {
            this.c.c(b.a(paramView));
            continue;
          }
        }
        catch (RemoteException localRemoteException)
        {
          je.c("Failed to call untrackView", localRemoteException);
          continue;
        }
      }
      if (this.d != null) {
        this.d.c(b.a(paramView));
      }
    }
  }
  
  public final boolean b()
  {
    synchronized (this.i)
    {
      if (this.g != null)
      {
        boolean bool2 = this.g.b();
        return bool2;
      }
      boolean bool1 = this.f.zzcv();
      return bool1;
    }
  }
  
  public final void c()
  {
    synchronized (this.i)
    {
      if (this.g != null) {
        this.g.c();
      }
      return;
    }
  }
  
  public final void d()
  {
    n.b("recordDownloadedImpression must be called on main UI thread.");
    synchronized (this.i)
    {
      this.b = true;
      if (this.g != null) {
        this.g.d();
      }
      return;
    }
  }
  
  public final boolean e()
  {
    synchronized (this.i)
    {
      boolean bool = this.h;
      return bool;
    }
  }
  
  public final atq f()
  {
    synchronized (this.i)
    {
      atq localatq = this.g;
      return localatq;
    }
  }
  
  public final qe g()
  {
    return null;
  }
  
  public final void h() {}
  
  public final void i() {}
  
  public final void j()
  {
    if (this.g != null) {
      this.g.j();
    }
  }
  
  public final void k()
  {
    if (this.g != null) {
      this.g.k();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.atp
 * JD-Core Version:    0.7.0.1
 */