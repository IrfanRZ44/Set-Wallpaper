package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

@cm
public final class au
  extends ak
{
  protected bcb g;
  private bck h;
  private bbs i;
  private bbu j;
  private final asn k;
  private final qe l;
  private boolean m;
  
  au(Context paramContext, ik paramik, bck parambck, ap paramap, asn paramasn, qe paramqe)
  {
    super(paramContext, paramik, paramap);
    this.h = parambck;
    this.j = paramik.c;
    this.k = paramasn;
    this.l = paramqe;
  }
  
  protected final ij a(int paramInt)
  {
    zzaef localzzaef = this.e.a;
    zzjj localzzjj = localzzaef.c;
    qe localqe = this.l;
    List localList1 = this.f.c;
    List localList2 = this.f.e;
    List localList3 = this.f.i;
    int n = this.f.k;
    long l1 = this.f.j;
    String str1 = localzzaef.i;
    boolean bool1 = this.f.g;
    bbt localbbt;
    bcn localbcn;
    label111:
    String str2;
    label127:
    bbu localbbu;
    bbx localbbx;
    label149:
    long l2;
    zzjn localzzjn;
    long l3;
    long l4;
    long l5;
    String str3;
    JSONObject localJSONObject;
    zzaig localzzaig;
    List localList4;
    List localList5;
    boolean bool2;
    label255:
    zzael localzzael;
    List localList6;
    String str4;
    if (this.g != null)
    {
      localbbt = this.g.b;
      if (this.g == null) {
        break label426;
      }
      localbcn = this.g.c;
      if (this.g == null) {
        break label432;
      }
      str2 = this.g.d;
      localbbu = this.j;
      if (this.g == null) {
        break label442;
      }
      localbbx = this.g.e;
      l2 = this.f.h;
      localzzjn = this.e.d;
      l3 = this.f.f;
      l4 = this.e.f;
      l5 = this.f.m;
      str3 = this.f.n;
      localJSONObject = this.e.h;
      localzzaig = this.f.A;
      localList4 = this.f.B;
      localList5 = this.f.C;
      if (this.j == null) {
        break label448;
      }
      bool2 = this.j.o;
      localzzael = this.f.E;
      if (this.i == null) {
        break label766;
      }
      localList6 = this.i.b();
      if (localList6 != null) {
        break label454;
      }
      str4 = "".toString();
    }
    for (;;)
    {
      return new ij(localzzjj, localqe, localList1, paramInt, localList2, localList3, n, l1, str1, bool1, localbbt, localbcn, str2, localbbu, localbbx, l2, localzzjn, l3, l4, l5, str3, localJSONObject, null, localzzaig, localList4, localList5, bool2, localzzael, str4, this.f.H, this.f.L, this.e.i, this.f.O, this.e.j, this.f.Q, this.f.R, this.f.S, this.f.T);
      localbbt = null;
      break;
      label426:
      localbcn = null;
      break label111;
      label432:
      str2 = AdMobAdapter.class.getName();
      break label127;
      label442:
      localbbx = null;
      break label149;
      label448:
      bool2 = false;
      break label255;
      label454:
      Iterator localIterator = localList6.iterator();
      String str5 = "";
      while (localIterator.hasNext())
      {
        bcb localbcb = (bcb)localIterator.next();
        if ((localbcb != null) && (localbcb.b != null) && (!TextUtils.isEmpty(localbcb.b.d)))
        {
          String str6 = String.valueOf(str5);
          String str7 = localbcb.b.d;
          int i2;
          switch (localbcb.a)
          {
          case 2: 
          default: 
            i2 = 6;
          }
          for (;;)
          {
            long l6 = localbcb.g;
            int i3 = 33 + String.valueOf(str7).length();
            StringBuilder localStringBuilder1 = new StringBuilder(i3);
            String str8 = str7 + "." + i2 + "." + l6;
            int i4 = 1 + String.valueOf(str6).length() + String.valueOf(str8).length();
            StringBuilder localStringBuilder2 = new StringBuilder(i4);
            str5 = str6 + str8 + "_";
            break;
            i2 = 0;
            continue;
            i2 = 1;
            continue;
            i2 = 2;
            continue;
            i2 = 3;
            continue;
            i2 = 4;
            continue;
            i2 = 5;
          }
        }
      }
      int i1 = Math.max(0, -1 + str5.length());
      str4 = str5.substring(0, i1);
      continue;
      label766:
      str4 = null;
    }
  }
  
  protected final void a(long paramLong)
  {
    ArrayList localArrayList;
    synchronized (this.d)
    {
      Object localObject3;
      if (this.j.m != -1)
      {
        Context localContext2 = this.b;
        zzaef localzzaef2 = this.e.a;
        bck localbck2 = this.h;
        bbu localbbu2 = this.j;
        boolean bool4 = this.f.s;
        boolean bool5 = this.f.z;
        String str3 = this.f.J;
        arq localarq2 = asa.bB;
        localObject3 = new bce(localContext2, localzzaef2, localbck2, localbbu2, bool4, bool5, str3, paramLong, ((Long)aos.f().a(localarq2)).longValue(), 2, this.e.j);
        this.i = ((bbs)localObject3);
        localArrayList = new ArrayList(this.j.a);
        Bundle localBundle1 = this.e.a.c.m;
        boolean bool3 = false;
        if (localBundle1 != null)
        {
          Bundle localBundle2 = localBundle1.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
          bool3 = false;
          if (localBundle2 != null) {
            bool3 = localBundle2.getBoolean("_skipMediation");
          }
        }
        if (bool3)
        {
          ListIterator localListIterator = localArrayList.listIterator();
          while (localListIterator.hasNext()) {
            if (!((bbt)localListIterator.next()).c.contains("com.google.ads.mediation.admob.AdMobAdapter")) {
              localListIterator.remove();
            }
          }
        }
      }
      else
      {
        Context localContext1 = this.b;
        zzaef localzzaef1 = this.e.a;
        bck localbck1 = this.h;
        bbu localbbu1 = this.j;
        boolean bool1 = this.f.s;
        boolean bool2 = this.f.z;
        String str1 = this.f.J;
        arq localarq1 = asa.bB;
        localObject3 = new bch(localContext1, localzzaef1, localbck1, localbbu1, bool1, bool2, str1, paramLong, ((Long)aos.f().a(localarq1)).longValue(), this.k, this.e.j);
      }
    }
    this.g = this.i.a(localArrayList);
    switch (this.g.a)
    {
    default: 
      int n = this.g.a;
      throw new an(40 + "Unexpected mediation result: " + n, 0);
    case 1: 
      throw new an("No fill from any mediation ad networks.", 3);
    }
    if ((this.g.b != null) && (this.g.b.o != null))
    {
      CountDownLatch localCountDownLatch = new CountDownLatch(1);
      jn.a.post(new av(this, localCountDownLatch));
      try
      {
        localCountDownLatch.await(10L, TimeUnit.SECONDS);
        synchronized (this.d)
        {
          if (!this.m) {
            throw new an("View could not be prepared", 0);
          }
        }
        String str2;
        if (!this.l.y()) {
          break label645;
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        str2 = String.valueOf(localInterruptedException);
        throw new an(38 + String.valueOf(str2).length() + "Interrupted while waiting for latch : " + str2, 0);
      }
      throw new an("Assets not loaded, web view is destroyed", 0);
    }
    label645:
  }
  
  public final void b_()
  {
    synchronized (this.d)
    {
      super.b_();
      if (this.i != null) {
        this.i.a();
      }
      return;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.au
 * JD-Core Version:    0.7.0.1
 */