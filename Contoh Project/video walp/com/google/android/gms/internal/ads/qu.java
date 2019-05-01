package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.common.util.d;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

@cm
public final class qu
  extends aqh
{
  private final pd a;
  private final Object b = new Object();
  private final boolean c;
  private final boolean d;
  private final float e;
  @GuardedBy("lock")
  private int f;
  @GuardedBy("lock")
  private aqj g;
  @GuardedBy("lock")
  private boolean h;
  @GuardedBy("lock")
  private boolean i = true;
  @GuardedBy("lock")
  private float j;
  @GuardedBy("lock")
  private float k;
  @GuardedBy("lock")
  private boolean l = true;
  @GuardedBy("lock")
  private boolean m;
  @GuardedBy("lock")
  private boolean n;
  
  public qu(pd parampd, float paramFloat, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.a = parampd;
    this.e = paramFloat;
    this.c = paramBoolean1;
    this.d = paramBoolean2;
  }
  
  private final void a(String paramString, Map<String, String> paramMap)
  {
    if (paramMap == null) {}
    for (HashMap localHashMap = new HashMap();; localHashMap = new HashMap(paramMap))
    {
      localHashMap.put("action", paramString);
      nk.a.execute(new qv(this, localHashMap));
      return;
    }
  }
  
  public final void a()
  {
    a("play", null);
  }
  
  public final void a(float paramFloat1, int paramInt, boolean paramBoolean, float paramFloat2)
  {
    synchronized (this.b)
    {
      this.j = paramFloat1;
      boolean bool = this.i;
      this.i = paramBoolean;
      int i1 = this.f;
      this.f = paramInt;
      float f1 = this.k;
      this.k = paramFloat2;
      if (Math.abs(this.k - f1) > 1.0E-004F) {
        this.a.getView().invalidate();
      }
      nk.a.execute(new qw(this, i1, paramInt, bool, paramBoolean));
      return;
    }
  }
  
  public final void a(aqj paramaqj)
  {
    synchronized (this.b)
    {
      this.g = paramaqj;
      return;
    }
  }
  
  public final void a(zzmu paramzzmu)
  {
    for (;;)
    {
      synchronized (this.b)
      {
        this.l = paramzzmu.a;
        this.m = paramzzmu.b;
        this.n = paramzzmu.c;
        if (paramzzmu.a)
        {
          str1 = "1";
          if (!paramzzmu.b) {
            break label100;
          }
          str2 = "1";
          if (!paramzzmu.c) {
            break label107;
          }
          str3 = "1";
          a("initialState", d.a("muteStart", str1, "customControlsRequested", str2, "clickToExpandRequested", str3));
          return;
        }
      }
      String str1 = "0";
      continue;
      label100:
      String str2 = "0";
      continue;
      label107:
      String str3 = "0";
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (String str = "mute";; str = "unmute")
    {
      a(str, null);
      return;
    }
  }
  
  public final void b()
  {
    a("pause", null);
  }
  
  public final boolean c()
  {
    synchronized (this.b)
    {
      boolean bool = this.i;
      return bool;
    }
  }
  
  public final int d()
  {
    synchronized (this.b)
    {
      int i1 = this.f;
      return i1;
    }
  }
  
  public final float e()
  {
    synchronized (this.b)
    {
      float f1 = this.k;
      return f1;
    }
  }
  
  public final float f()
  {
    return this.e;
  }
  
  public final float g()
  {
    synchronized (this.b)
    {
      float f1 = this.j;
      return f1;
    }
  }
  
  public final aqj h()
  {
    synchronized (this.b)
    {
      aqj localaqj = this.g;
      return localaqj;
    }
  }
  
  public final boolean i()
  {
    for (;;)
    {
      synchronized (this.b)
      {
        if ((this.c) && (this.m))
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public final boolean j()
  {
    boolean bool1 = i();
    Object localObject1 = this.b;
    if (!bool1) {}
    for (;;)
    {
      try
      {
        if ((this.n) && (this.d))
        {
          bool2 = true;
          return bool2;
        }
      }
      finally {}
      boolean bool2 = false;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.qu
 * JD-Core Version:    0.7.0.1
 */