package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@cm
public final class bch
  implements bbs
{
  private final zzaef a;
  private final bck b;
  private final Context c;
  private final Object d = new Object();
  private final bbu e;
  private final boolean f;
  private final long g;
  private final long h;
  private final asn i;
  private final boolean j;
  private final String k;
  private boolean l = false;
  private bby m;
  private List<bcb> n = new ArrayList();
  private final boolean o;
  
  public bch(Context paramContext, zzaef paramzzaef, bck parambck, bbu parambbu, boolean paramBoolean1, boolean paramBoolean2, String paramString, long paramLong1, long paramLong2, asn paramasn, boolean paramBoolean3)
  {
    this.c = paramContext;
    this.a = paramzzaef;
    this.b = parambck;
    this.e = parambbu;
    this.f = paramBoolean1;
    this.j = paramBoolean2;
    this.k = paramString;
    this.g = paramLong1;
    this.h = paramLong2;
    this.i = paramasn;
    this.o = paramBoolean3;
  }
  
  public final bcb a(List<bbt> paramList)
  {
    je.b("Starting mediation.");
    ArrayList localArrayList = new ArrayList();
    asl localasl1 = this.i.a();
    zzjn localzzjn1 = this.a.d;
    int[] arrayOfInt = new int[2];
    int i4;
    zzjn localzzjn2;
    if (localzzjn1.g != null)
    {
      zzbv.zzfd();
      if (bcd.a(this.k, arrayOfInt))
      {
        int i1 = arrayOfInt[0];
        int i2 = arrayOfInt[1];
        zzjn[] arrayOfzzjn = localzzjn1.g;
        int i3 = arrayOfzzjn.length;
        i4 = 0;
        if (i4 < i3)
        {
          localzzjn2 = arrayOfzzjn[i4];
          if ((i1 != localzzjn2.e) || (i2 != localzzjn2.b)) {}
        }
      }
    }
    for (;;)
    {
      Iterator localIterator1 = paramList.iterator();
      label542:
      for (;;)
      {
        if (!localIterator1.hasNext()) {
          break label544;
        }
        bbt localbbt = (bbt)localIterator1.next();
        String str1 = String.valueOf(localbbt.b);
        String str2;
        label177:
        Iterator localIterator2;
        if (str1.length() != 0)
        {
          str2 = "Trying mediation network: ".concat(str1);
          je.d(str2);
          localIterator2 = localbbt.c.iterator();
        }
        for (;;)
        {
          String str3;
          asl localasl2;
          bcb localbcb2;
          for (;;)
          {
            if (!localIterator2.hasNext()) {
              break label542;
            }
            str3 = (String)localIterator2.next();
            localasl2 = this.i.a();
            synchronized (this.d)
            {
              if (this.l)
              {
                bcb localbcb1 = new bcb(-1);
                return localbcb1;
                i4++;
                break;
                str2 = new String("Trying mediation network: ");
                break label177;
              }
              this.m = new bby(this.c, str3, this.b, this.e, localbbt, this.a.c, localzzjn2, this.a.k, this.f, this.j, this.a.y, this.a.n, this.a.z, this.a.X, this.o);
              localbcb2 = this.m.a(this.g, this.h);
              this.n.add(localbcb2);
              if (localbcb2.a == 0)
              {
                je.b("Adapter succeeded.");
                this.i.a("mediation_network_succeed", str3);
                if (!localArrayList.isEmpty()) {
                  this.i.a("mediation_networks_fail", TextUtils.join(",", localArrayList));
                }
                this.i.a(localasl2, new String[] { "mls" });
                this.i.a(localasl1, new String[] { "ttm" });
                return localbcb2;
              }
            }
          }
          localArrayList.add(str3);
          this.i.a(localasl2, new String[] { "mlf" });
          if (localbcb2.c != null) {
            jn.a.post(new bci(this, localbcb2));
          }
        }
      }
      label544:
      if (!localArrayList.isEmpty()) {
        this.i.a("mediation_networks_fail", TextUtils.join(",", localArrayList));
      }
      return new bcb(1);
      localzzjn2 = localzzjn1;
    }
  }
  
  public final void a()
  {
    synchronized (this.d)
    {
      this.l = true;
      if (this.m != null) {
        this.m.a();
      }
      return;
    }
  }
  
  public final List<bcb> b()
  {
    return this.n;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bch
 * JD-Core Version:    0.7.0.1
 */