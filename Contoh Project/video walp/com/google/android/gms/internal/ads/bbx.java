package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@cm
@ParametersAreNonnullByDefault
public final class bbx
  extends bcr
{
  private final Object a = new Object();
  @GuardedBy("mLock")
  private bcc b;
  @GuardedBy("mLock")
  private bbv c;
  
  public final void a()
  {
    synchronized (this.a)
    {
      if (this.c != null) {
        this.c.zzce();
      }
      return;
    }
  }
  
  public final void a(int paramInt)
  {
    for (;;)
    {
      synchronized (this.a)
      {
        if (this.b != null)
        {
          if (paramInt == 3)
          {
            i = 1;
            this.b.a(i);
            this.b = null;
          }
        }
        else {
          return;
        }
      }
      int i = 2;
    }
  }
  
  public final void a(avk paramavk, String paramString)
  {
    synchronized (this.a)
    {
      if (this.c != null) {
        this.c.zza(paramavk, paramString);
      }
      return;
    }
  }
  
  public final void a(bbv parambbv)
  {
    synchronized (this.a)
    {
      this.c = parambbv;
      return;
    }
  }
  
  public final void a(bcc parambcc)
  {
    synchronized (this.a)
    {
      this.b = parambcc;
      return;
    }
  }
  
  public final void a(bct parambct)
  {
    synchronized (this.a)
    {
      if (this.b != null)
      {
        this.b.a(0, parambct);
        this.b = null;
        return;
      }
      if (this.c != null) {
        this.c.zzci();
      }
      return;
    }
  }
  
  public final void a(String paramString) {}
  
  public final void a(String paramString1, String paramString2)
  {
    synchronized (this.a)
    {
      if (this.c != null) {
        this.c.zzb(paramString1, paramString2);
      }
      return;
    }
  }
  
  public final void b()
  {
    synchronized (this.a)
    {
      if (this.c != null) {
        this.c.zzcf();
      }
      return;
    }
  }
  
  public final void c()
  {
    synchronized (this.a)
    {
      if (this.c != null) {
        this.c.zzcg();
      }
      return;
    }
  }
  
  public final void d()
  {
    synchronized (this.a)
    {
      if (this.c != null) {
        this.c.zzch();
      }
      return;
    }
  }
  
  public final void e()
  {
    synchronized (this.a)
    {
      if (this.b != null)
      {
        this.b.a(0);
        this.b = null;
        return;
      }
      if (this.c != null) {
        this.c.zzci();
      }
      return;
    }
  }
  
  public final void f()
  {
    synchronized (this.a)
    {
      if (this.c != null) {
        this.c.zzcj();
      }
      return;
    }
  }
  
  public final void g()
  {
    synchronized (this.a)
    {
      if (this.c != null) {
        this.c.zzcd();
      }
      return;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bbx
 * JD-Core Version:    0.7.0.1
 */