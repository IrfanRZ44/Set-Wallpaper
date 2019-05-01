package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzd;
import com.google.android.gms.ads.internal.zzw;
import javax.annotation.concurrent.GuardedBy;

@cm
public final class fs
  extends gd
{
  private final Context a;
  private final Object b = new Object();
  private final zzang c;
  @GuardedBy("mLock")
  private final ft d;
  
  public fs(Context paramContext, zzw paramzzw, bck parambck, zzang paramzzang)
  {
    this(paramContext, paramzzang, new ft(paramContext, paramzzw, zzjn.a(), parambck, paramzzang));
  }
  
  private fs(Context paramContext, zzang paramzzang, ft paramft)
  {
    this.a = paramContext;
    this.c = paramzzang;
    this.d = paramft;
  }
  
  public final void a()
  {
    synchronized (this.b)
    {
      this.d.j();
      return;
    }
  }
  
  public final void a(a parama)
  {
    synchronized (this.b)
    {
      this.d.pause();
      return;
    }
  }
  
  public final void a(apo paramapo)
  {
    arq localarq = asa.aF;
    if (((Boolean)aos.f().a(localarq)).booleanValue()) {
      synchronized (this.b)
      {
        this.d.zza(paramapo);
        return;
      }
    }
  }
  
  public final void a(fz paramfz)
  {
    synchronized (this.b)
    {
      this.d.zza(paramfz);
      return;
    }
  }
  
  public final void a(gh paramgh)
  {
    synchronized (this.b)
    {
      this.d.zza(paramgh);
      return;
    }
  }
  
  public final void a(zzahk paramzzahk)
  {
    synchronized (this.b)
    {
      this.d.a(paramzzahk);
      return;
    }
  }
  
  public final void a(String paramString)
  {
    synchronized (this.b)
    {
      this.d.setUserId(paramString);
      return;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    synchronized (this.b)
    {
      this.d.setImmersiveMode(paramBoolean);
      return;
    }
  }
  
  public final Bundle b()
  {
    arq localarq = asa.aF;
    if (((Boolean)aos.f().a(localarq)).booleanValue()) {
      synchronized (this.b)
      {
        Bundle localBundle = this.d.zzba();
        return localBundle;
      }
    }
    return new Bundle();
  }
  
  public final void b(a parama)
  {
    Object localObject1 = this.b;
    Context localContext;
    if (parama == null) {
      localContext = null;
    }
    for (;;)
    {
      if (localContext != null) {}
      try
      {
        this.d.a(localContext);
        this.d.resume();
        return;
        localContext = (Context)b.a(parama);
      }
      catch (Exception localException)
      {
        for (;;)
        {
          je.c("Unable to extract updated context.", localException);
        }
      }
      finally {}
    }
  }
  
  public final void c(a parama)
  {
    synchronized (this.b)
    {
      this.d.destroy();
      return;
    }
  }
  
  public final boolean c()
  {
    synchronized (this.b)
    {
      boolean bool = this.d.l();
      return bool;
    }
  }
  
  public final void d()
  {
    a(null);
  }
  
  public final void e()
  {
    b(null);
  }
  
  public final void f()
  {
    c(null);
  }
  
  public final String g()
  {
    synchronized (this.b)
    {
      String str = this.d.getMediationAdapterClassName();
      return str;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.fs
 * JD-Core Version:    0.7.0.1
 */