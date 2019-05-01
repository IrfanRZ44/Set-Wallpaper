package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public final class akx
{
  private final Object a = new Object();
  private int b;
  private List<akw> c = new LinkedList();
  
  public final akw a()
  {
    Object localObject1 = null;
    int n;
    for (int i = 0;; i = n)
    {
      int k;
      synchronized (this.a)
      {
        if (this.c.size() == 0)
        {
          je.b("Queue empty");
          return null;
        }
        if (this.c.size() >= 2)
        {
          j = -2147483648;
          Iterator localIterator = this.c.iterator();
          k = 0;
          if (localIterator.hasNext())
          {
            akw localakw1 = (akw)localIterator.next();
            int m = localakw1.i();
            if (m <= j) {
              break label161;
            }
            i1 = m;
            localObject4 = localakw1;
            n = k;
            break label174;
          }
          this.c.remove(i);
          return localObject1;
        }
      }
      akw localakw2 = (akw)this.c.get(0);
      localakw2.e();
      return localakw2;
      label161:
      n = i;
      Object localObject4 = localObject1;
      int i1 = j;
      label174:
      k++;
      int j = i1;
      localObject1 = localObject4;
    }
  }
  
  public final boolean a(akw paramakw)
  {
    synchronized (this.a)
    {
      return this.c.contains(paramakw);
    }
  }
  
  public final boolean b(akw paramakw)
  {
    synchronized (this.a)
    {
      Iterator localIterator = this.c.iterator();
      while (localIterator.hasNext())
      {
        akw localakw = (akw)localIterator.next();
        arq localarq1 = asa.W;
        if ((((Boolean)aos.f().a(localarq1)).booleanValue()) && (!zzbv.zzeo().l().b()))
        {
          if ((paramakw != localakw) && (localakw.b().equals(paramakw.b())))
          {
            localIterator.remove();
            return true;
          }
        }
        else
        {
          arq localarq2 = asa.Y;
          if ((((Boolean)aos.f().a(localarq2)).booleanValue()) && (!zzbv.zzeo().l().d()) && (paramakw != localakw) && (localakw.d().equals(paramakw.d())))
          {
            localIterator.remove();
            return true;
          }
        }
      }
      return false;
    }
  }
  
  public final void c(akw paramakw)
  {
    synchronized (this.a)
    {
      if (this.c.size() >= 10)
      {
        int j = this.c.size();
        je.b(41 + "Queue is full, current size = " + j);
        this.c.remove(0);
      }
      int i = this.b;
      this.b = (i + 1);
      paramakw.a(i);
      this.c.add(paramakw);
      return;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.akx
 * JD-Core Version:    0.7.0.1
 */