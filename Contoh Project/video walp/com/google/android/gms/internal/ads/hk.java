package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.a.b;
import com.google.android.gms.common.a.c;
import com.google.android.gms.common.d;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.util.k;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@cm
@ParametersAreNonnullByDefault
public final class hk
  implements hu
{
  private static List<Future<Void>> a = Collections.synchronizedList(new ArrayList());
  private static ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor();
  @GuardedBy("mLock")
  private final afg c;
  @GuardedBy("mLock")
  private final LinkedHashMap<String, afo> d;
  @GuardedBy("mLock")
  private final List<String> e = new ArrayList();
  @GuardedBy("mLock")
  private final List<String> f = new ArrayList();
  private final Context g;
  private final hw h;
  private boolean i;
  private final zzaiq j;
  private final hx k;
  private final Object l = new Object();
  private HashSet<String> m = new HashSet();
  private boolean n = false;
  private boolean o = false;
  private boolean p = false;
  
  public hk(Context paramContext, zzang paramzzang, zzaiq paramzzaiq, String paramString, hw paramhw)
  {
    n.a(paramzzaiq, "SafeBrowsing config is not present.");
    if (paramContext.getApplicationContext() != null) {
      paramContext = paramContext.getApplicationContext();
    }
    this.g = paramContext;
    this.d = new LinkedHashMap();
    this.h = paramhw;
    this.j = paramzzaiq;
    Iterator localIterator = this.j.e.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      this.m.add(str.toLowerCase(Locale.ENGLISH));
    }
    this.m.remove("cookie".toLowerCase(Locale.ENGLISH));
    afg localafg = new afg();
    localafg.a = Integer.valueOf(8);
    localafg.b = paramString;
    localafg.c = paramString;
    localafg.d = new afh();
    localafg.d.a = this.j.a;
    afp localafp = new afp();
    localafp.a = paramzzang.a;
    localafp.c = Boolean.valueOf(c.b(this.g).a());
    long l1 = d.a().b(this.g);
    if (l1 > 0L) {
      localafp.b = Long.valueOf(l1);
    }
    localafg.h = localafp;
    this.c = localafg;
    this.k = new hx(this.g, this.j.h, this);
  }
  
  private final afo e(String paramString)
  {
    synchronized (this.l)
    {
      afo localafo = (afo)this.d.get(paramString);
      return localafo;
    }
  }
  
  private final ne<Void> f()
  {
    int i1 = 1;
    if (((this.i) && (this.j.g)) || ((this.p) && (this.j.f)) || ((!this.i) && (this.j.d))) {}
    while (i1 == 0)
    {
      return mt.a(null);
      i1 = 0;
    }
    synchronized (this.l)
    {
      this.c.e = new afo[this.d.size()];
      this.d.values().toArray(this.c.e);
      this.c.i = ((String[])this.e.toArray(new String[0]));
      this.c.j = ((String[])this.f.toArray(new String[0]));
      if (ht.a())
      {
        String str2 = this.c.b;
        String str3 = this.c.f;
        StringBuilder localStringBuilder = new StringBuilder(53 + String.valueOf(str2).length() + String.valueOf(str3).length() + "Sending SB report\n  url: " + str2 + "\n  clickUrl: " + str3 + "\n  resources: \n");
        for (afo localafo : this.c.e)
        {
          localStringBuilder.append("    [");
          localStringBuilder.append(localafo.e.length);
          localStringBuilder.append("] ");
          localStringBuilder.append(localafo.b);
        }
        ht.a(localStringBuilder.toString());
      }
      byte[] arrayOfByte = afc.a(this.c);
      String str1 = this.j.b;
      ne localne1 = new kx(this.g).a(1, str1, null, arrayOfByte);
      if (ht.a()) {
        localne1.a(new hp(this), jl.a);
      }
      ne localne2 = mt.a(localne1, hm.a, nk.b);
      return localne2;
    }
  }
  
  public final zzaiq a()
  {
    return this.j;
  }
  
  public final void a(View paramView)
  {
    if (!this.j.c) {}
    while (this.o) {
      return;
    }
    zzbv.zzek();
    Bitmap localBitmap = jn.b(paramView);
    if (localBitmap == null)
    {
      ht.a("Failed to capture the webview bitmap.");
      return;
    }
    this.o = true;
    jn.a(new hn(this, localBitmap));
  }
  
  public final void a(String paramString)
  {
    synchronized (this.l)
    {
      this.c.f = paramString;
      return;
    }
  }
  
  public final void a(String paramString, Map<String, String> paramMap, int paramInt)
  {
    Object localObject1 = this.l;
    if (paramInt == 3) {}
    afo localafo;
    ArrayList localArrayList;
    for (;;)
    {
      try
      {
        this.p = true;
        if (this.d.containsKey(paramString))
        {
          if (paramInt == 3) {
            ((afo)this.d.get(paramString)).d = Integer.valueOf(paramInt);
          }
          return;
        }
        localafo = new afo();
        localafo.d = Integer.valueOf(paramInt);
        localafo.a = Integer.valueOf(this.d.size());
        localafo.b = paramString;
        localafo.c = new afj();
        if ((this.m.size() <= 0) || (paramMap == null)) {
          break label347;
        }
        localArrayList = new ArrayList();
        Iterator localIterator = paramMap.entrySet().iterator();
        if (!localIterator.hasNext()) {
          break;
        }
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        try
        {
          if (localEntry.getKey() == null) {
            break label299;
          }
          str1 = (String)localEntry.getKey();
          if (localEntry.getValue() == null) {
            break label307;
          }
          str2 = (String)localEntry.getValue();
          String str3 = str1.toLowerCase(Locale.ENGLISH);
          if (!this.m.contains(str3)) {
            continue;
          }
          afi localafi = new afi();
          localafi.a = str1.getBytes("UTF-8");
          localafi.b = str2.getBytes("UTF-8");
          localArrayList.add(localafi);
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
          ht.a("Cannot convert string to bytes, skip header.");
        }
        continue;
        String str1 = "";
      }
      finally {}
      label299:
      continue;
      label307:
      String str2 = "";
    }
    afi[] arrayOfafi = new afi[localArrayList.size()];
    localArrayList.toArray(arrayOfafi);
    localafo.c.a = arrayOfafi;
    label347:
    this.d.put(paramString, localafo);
  }
  
  public final String[] a(String[] paramArrayOfString)
  {
    return (String[])this.k.a(paramArrayOfString).toArray(new String[0]);
  }
  
  final void b(String paramString)
  {
    synchronized (this.l)
    {
      this.e.add(paramString);
      return;
    }
  }
  
  public final boolean b()
  {
    return (k.g()) && (this.j.c) && (!this.o);
  }
  
  public final void c()
  {
    this.n = true;
  }
  
  final void c(String paramString)
  {
    synchronized (this.l)
    {
      this.f.add(paramString);
      return;
    }
  }
  
  public final void d()
  {
    synchronized (this.l)
    {
      ne localne1 = mt.a(this.h.a(this.g, this.d.keySet()), new hl(this), nk.b);
      ne localne2 = mt.a(localne1, 10L, TimeUnit.SECONDS, b);
      mt.a(localne1, new ho(this, localne2), nk.b);
      a.add(localne2);
      return;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.hk
 * JD-Core Version:    0.7.0.1
 */