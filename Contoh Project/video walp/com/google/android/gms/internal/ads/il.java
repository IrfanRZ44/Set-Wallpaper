package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import javax.annotation.concurrent.GuardedBy;

@cm
public final class il
{
  private final ix a;
  @GuardedBy("mLock")
  private final LinkedList<im> b;
  private final Object c = new Object();
  private final String d;
  private final String e;
  @GuardedBy("mLock")
  private long f = -1L;
  @GuardedBy("mLock")
  private long g = -1L;
  @GuardedBy("mLock")
  private boolean h = false;
  @GuardedBy("mLock")
  private long i = -1L;
  @GuardedBy("mLock")
  private long j = 0L;
  @GuardedBy("mLock")
  private long k = -1L;
  @GuardedBy("mLock")
  private long l = -1L;
  
  private il(ix paramix, String paramString1, String paramString2)
  {
    this.a = paramix;
    this.d = paramString1;
    this.e = paramString2;
    this.b = new LinkedList();
  }
  
  public il(String paramString1, String paramString2)
  {
    this(zzbv.zzep(), paramString1, paramString2);
  }
  
  public final void a()
  {
    synchronized (this.c)
    {
      if ((this.l != -1L) && (this.g == -1L))
      {
        this.g = SystemClock.elapsedRealtime();
        this.a.a(this);
      }
      this.a.b();
      return;
    }
  }
  
  public final void a(long paramLong)
  {
    synchronized (this.c)
    {
      this.l = paramLong;
      if (this.l != -1L) {
        this.a.a(this);
      }
      return;
    }
  }
  
  public final void a(zzjj paramzzjj)
  {
    synchronized (this.c)
    {
      this.k = SystemClock.elapsedRealtime();
      this.a.a(paramzzjj, this.k);
      return;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    synchronized (this.c)
    {
      if (this.l != -1L)
      {
        this.i = SystemClock.elapsedRealtime();
        if (!paramBoolean)
        {
          this.g = this.i;
          this.a.a(this);
        }
      }
      return;
    }
  }
  
  public final void b()
  {
    synchronized (this.c)
    {
      if (this.l != -1L)
      {
        im localim = new im();
        localim.c();
        this.b.add(localim);
        this.j = (1L + this.j);
        this.a.a();
        this.a.a(this);
      }
      return;
    }
  }
  
  public final void b(long paramLong)
  {
    synchronized (this.c)
    {
      if (this.l != -1L)
      {
        this.f = paramLong;
        this.a.a(this);
      }
      return;
    }
  }
  
  public final void b(boolean paramBoolean)
  {
    synchronized (this.c)
    {
      if (this.l != -1L)
      {
        this.h = paramBoolean;
        this.a.a(this);
      }
      return;
    }
  }
  
  public final void c()
  {
    synchronized (this.c)
    {
      if ((this.l != -1L) && (!this.b.isEmpty()))
      {
        im localim = (im)this.b.getLast();
        if (localim.a() == -1L)
        {
          localim.b();
          this.a.a(this);
        }
      }
      return;
    }
  }
  
  public final Bundle d()
  {
    Bundle localBundle;
    ArrayList localArrayList;
    synchronized (this.c)
    {
      localBundle = new Bundle();
      localBundle.putString("seq_num", this.d);
      localBundle.putString("slotid", this.e);
      localBundle.putBoolean("ismediation", this.h);
      localBundle.putLong("treq", this.k);
      localBundle.putLong("tresponse", this.l);
      localBundle.putLong("timp", this.g);
      localBundle.putLong("tload", this.i);
      localBundle.putLong("pcc", this.j);
      localBundle.putLong("tfetch", this.f);
      localArrayList = new ArrayList();
      Iterator localIterator = this.b.iterator();
      if (localIterator.hasNext()) {
        localArrayList.add(((im)localIterator.next()).d());
      }
    }
    localBundle.putParcelableArrayList("tclick", localArrayList);
    return localBundle;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.il
 * JD-Core Version:    0.7.0.1
 */