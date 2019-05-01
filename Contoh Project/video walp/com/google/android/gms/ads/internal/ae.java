package com.google.android.gms.ads.internal;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.aos;
import com.google.android.gms.internal.ads.arq;
import com.google.android.gms.internal.ads.ary;
import com.google.android.gms.internal.ads.asa;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzmq;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

final class ae
{
  private final String a;
  private final Map<String, String> b;
  private String c;
  private String d;
  
  public ae(String paramString)
  {
    this.a = paramString;
    this.b = new TreeMap();
  }
  
  public final String a()
  {
    return this.d;
  }
  
  public final void a(zzjj paramzzjj, zzang paramzzang)
  {
    this.c = paramzzjj.j.a;
    if (paramzzjj.m != null) {}
    for (Bundle localBundle = paramzzjj.m.getBundle(AdMobAdapter.class.getName());; localBundle = null)
    {
      if (localBundle == null) {
        return;
      }
      arq localarq = asa.cy;
      String str1 = (String)aos.f().a(localarq);
      Iterator localIterator = localBundle.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str2 = (String)localIterator.next();
        if (str1.equals(str2)) {
          this.d = localBundle.getString(str2);
        } else if (str2.startsWith("csa_")) {
          this.b.put(str2.substring(4), localBundle.getString(str2));
        }
      }
      this.b.put("SDKVersion", paramzzang.a);
      return;
    }
  }
  
  public final String b()
  {
    return this.c;
  }
  
  public final String c()
  {
    return this.a;
  }
  
  public final Map<String, String> d()
  {
    return this.b;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.ae
 * JD-Core Version:    0.7.0.1
 */