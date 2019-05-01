package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public final class aid
  extends aiy
{
  private static volatile afw d = null;
  private static final Object e = new Object();
  private wk f = null;
  
  public aid(ahn paramahn, String paramString1, String paramString2, zo paramzo, int paramInt1, int paramInt2, wk paramwk)
  {
    super(paramahn, paramString1, paramString2, paramzo, paramInt1, 27);
    this.f = paramwk;
  }
  
  private final String c()
  {
    try
    {
      if (this.a.l() != null) {
        this.a.l().get();
      }
      zo localzo = this.a.k();
      if ((localzo != null) && (localzo.n != null))
      {
        String str = localzo.n;
        return str;
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      return null;
    }
    catch (ExecutionException localExecutionException)
    {
      label52:
      break label52;
    }
  }
  
  protected final void a()
  {
    int i = 3;
    int j;
    if ((d == null) || (ahv.b(d.a)) || (d.a.equals("E")) || (d.a.equals("0000000000000000000000000000000000000000000000000000000000000000")))
    {
      j = 1;
      if (j == 0) {}
    }
    for (;;)
    {
      int k;
      for (;;)
      {
        synchronized (e)
        {
          if (!ahv.b(null))
          {
            i = 4;
            Method localMethod = this.c;
            Object[] arrayOfObject = new Object[3];
            arrayOfObject[0] = this.a.a();
            if (i != 2) {
              break label452;
            }
            bool = true;
            arrayOfObject[1] = Boolean.valueOf(bool);
            arq localarq1 = asa.bI;
            arrayOfObject[2] = aos.f().a(localarq1);
            afw localafw = new afw((String)localMethod.invoke(null, arrayOfObject));
            d = localafw;
            if (ahv.b(localafw.a)) {
              break label411;
            }
            if (d.a.equals("E")) {
              break label411;
            }
          }
        }
        synchronized (this.b)
        {
          if (d != null)
          {
            this.b.n = d.a;
            this.b.t = Long.valueOf(d.b);
            this.b.s = d.c;
            this.b.C = d.d;
            this.b.D = d.e;
          }
          return;
          j = 0;
          break;
          ahv.b(null);
          if (!Boolean.valueOf(false).booleanValue()) {
            break label441;
          }
          if (!this.a.i()) {
            break label446;
          }
          arq localarq2 = asa.bO;
          if (!((Boolean)aos.f().a(localarq2)).booleanValue()) {
            break label446;
          }
          arq localarq3 = asa.bP;
          if (!((Boolean)aos.f().a(localarq3)).booleanValue()) {
            break label446;
          }
          k = 1;
          break label436;
          d.a = null.a;
          continue;
          localObject3 = finally;
          throw localObject3;
          String str = c();
          if (!ahv.b(str)) {
            d.a = str;
          }
        }
      }
      label411:
      switch (i)
      {
      }
      for (;;)
      {
        label436:
        if (k != 0) {
          break label450;
        }
        label441:
        i = 2;
        break;
        label446:
        k = 0;
      }
      label450:
      continue;
      label452:
      boolean bool = false;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aid
 * JD-Core Version:    0.7.0.1
 */