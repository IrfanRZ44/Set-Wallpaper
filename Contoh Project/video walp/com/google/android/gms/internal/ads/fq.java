package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.internal.gmsg.zzb;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzbw;
import com.google.android.gms.common.internal.n;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@cm
public final class fq
{
  private static final bcj a = new bcj();
  private final bck b;
  private final zzbw c;
  private final Map<String, he> d = new HashMap();
  private final gw e;
  private final zzb f;
  private final ap g;
  
  public fq(zzbw paramzzbw, bck parambck, gw paramgw, zzb paramzzb, ap paramap)
  {
    this.c = paramzzbw;
    this.b = parambck;
    this.e = paramgw;
    this.f = paramzzb;
    this.g = paramap;
  }
  
  public static boolean a(ij paramij1, ij paramij2)
  {
    return true;
  }
  
  public final zzb a()
  {
    return this.f;
  }
  
  public final he a(String paramString)
  {
    Object localObject1 = (he)this.d.get(paramString);
    if (localObject1 == null) {}
    try
    {
      localbck = this.b;
      if ("com.google.ads.mediation.admob.AdMobAdapter".equals(paramString))
      {
        localObject4 = a;
        localObject3 = new he(((bck)localObject4).a(paramString), this.e);
      }
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        bck localbck;
        try
        {
          this.d.put(paramString, localObject3);
          localObject1 = localObject3;
          return localObject1;
        }
        catch (Exception localException2)
        {
          Object localObject3;
          String str1;
          String str2;
          Object localObject2 = localException2;
          continue;
        }
        localException1 = localException1;
        localObject2 = localException1;
        localObject3 = localObject1;
        str1 = String.valueOf(paramString);
        if (str1.length() != 0)
        {
          str2 = "Fail to instantiate adapter ".concat(str1);
          je.c(str2, (Throwable)localObject2);
          return localObject3;
        }
        str2 = new String("Fail to instantiate adapter ");
        continue;
        Object localObject4 = localbck;
      }
    }
  }
  
  public final zzaig a(zzaig paramzzaig)
  {
    if ((this.c.zzacw != null) && (this.c.zzacw.r != null) && (!TextUtils.isEmpty(this.c.zzacw.r.k))) {
      paramzzaig = new zzaig(this.c.zzacw.r.k, this.c.zzacw.r.l);
    }
    if ((this.c.zzacw != null) && (this.c.zzacw.o != null))
    {
      zzbv.zzfd();
      bcd.a(this.c.zzrt, this.c.zzacr.a, this.c.zzacw.o.m, this.c.zzadr, paramzzaig);
    }
    return paramzzaig;
  }
  
  public final void a(Context paramContext)
  {
    Iterator localIterator = this.d.values().iterator();
    while (localIterator.hasNext())
    {
      he localhe = (he)localIterator.next();
      try
      {
        localhe.a().a(b.a(paramContext));
      }
      catch (RemoteException localRemoteException)
      {
        je.b("Unable to call Adapter.onContextChanged.", localRemoteException);
      }
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    he localhe = a(this.c.zzacw.q);
    if ((localhe != null) && (localhe.a() != null)) {}
    try
    {
      localhe.a().a(paramBoolean);
      localhe.a().f();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      je.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final ap b()
  {
    return this.g;
  }
  
  public final void c()
  {
    this.c.zzadv = 0;
    zzbw localzzbw = this.c;
    zzbv.zzej();
    gz localgz = new gz(this.c.zzrt, this.c.zzacx, this);
    String str1 = String.valueOf(localgz.getClass().getName());
    if (str1.length() != 0) {}
    for (String str2 = "AdRenderer: ".concat(str1);; str2 = new String("AdRenderer: "))
    {
      je.b(str2);
      localgz.c();
      localzzbw.zzacu = localgz;
      return;
    }
  }
  
  public final void d()
  {
    n.b("pause must be called on the main UI thread.");
    Iterator localIterator = this.d.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      try
      {
        he localhe = (he)this.d.get(str);
        if ((localhe != null) && (localhe.a() != null)) {
          localhe.a().d();
        }
      }
      catch (RemoteException localRemoteException)
      {
        je.d("#007 Could not call remote method.", localRemoteException);
      }
    }
  }
  
  public final void e()
  {
    n.b("resume must be called on the main UI thread.");
    Iterator localIterator = this.d.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      try
      {
        he localhe = (he)this.d.get(str);
        if ((localhe != null) && (localhe.a() != null)) {
          localhe.a().e();
        }
      }
      catch (RemoteException localRemoteException)
      {
        je.d("#007 Could not call remote method.", localRemoteException);
      }
    }
  }
  
  public final void f()
  {
    n.b("destroy must be called on the main UI thread.");
    Iterator localIterator = this.d.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      try
      {
        he localhe = (he)this.d.get(str);
        if ((localhe != null) && (localhe.a() != null)) {
          localhe.a().c();
        }
      }
      catch (RemoteException localRemoteException)
      {
        je.d("#007 Could not call remote method.", localRemoteException);
      }
    }
  }
  
  public final void g()
  {
    if ((this.c.zzacw != null) && (this.c.zzacw.o != null))
    {
      zzbv.zzfd();
      bcd.a(this.c.zzrt, this.c.zzacr.a, this.c.zzacw, this.c.zzacp, false, this.c.zzacw.o.l);
    }
  }
  
  public final void h()
  {
    if ((this.c.zzacw != null) && (this.c.zzacw.o != null))
    {
      zzbv.zzfd();
      bcd.a(this.c.zzrt, this.c.zzacr.a, this.c.zzacw, this.c.zzacp, false, this.c.zzacw.o.n);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.fq
 * JD-Core Version:    0.7.0.1
 */