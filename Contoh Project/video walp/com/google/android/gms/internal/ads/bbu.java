package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@cm
public final class bbu
{
  public final List<bbt> a;
  public final long b;
  public final List<String> c;
  public final List<String> d;
  public final List<String> e;
  public final List<String> f;
  public final List<String> g;
  public final boolean h;
  public final String i;
  public final long j;
  public final String k;
  public final int l;
  public final int m;
  public final long n;
  public final boolean o;
  public final boolean p;
  public final boolean q;
  public int r;
  public int s;
  public boolean t;
  
  public bbu(String paramString)
  {
    this(new JSONObject(paramString));
  }
  
  public bbu(List<bbt> paramList, long paramLong1, List<String> paramList1, List<String> paramList2, List<String> paramList3, List<String> paramList4, List<String> paramList5, boolean paramBoolean1, String paramString1, long paramLong2, int paramInt1, int paramInt2, String paramString2, int paramInt3, int paramInt4, long paramLong3, boolean paramBoolean2)
  {
    this.a = paramList;
    this.b = paramLong1;
    this.c = paramList1;
    this.d = paramList2;
    this.e = paramList3;
    this.f = paramList4;
    this.g = paramList5;
    this.h = paramBoolean1;
    this.i = paramString1;
    this.j = -1L;
    this.r = 0;
    this.s = 1;
    this.k = null;
    this.l = 0;
    this.m = -1;
    this.n = -1L;
    this.o = false;
    this.p = false;
    this.q = false;
    this.t = false;
  }
  
  public bbu(JSONObject paramJSONObject)
  {
    String str2;
    JSONArray localJSONArray;
    ArrayList localArrayList;
    int i1;
    int i2;
    if (je.a(2))
    {
      String str1 = String.valueOf(paramJSONObject.toString(2));
      if (str1.length() != 0)
      {
        str2 = "Mediation Response JSON: ".concat(str1);
        je.a(str2);
      }
    }
    else
    {
      localJSONArray = paramJSONObject.getJSONArray("ad_networks");
      localArrayList = new ArrayList(localJSONArray.length());
      i1 = 0;
      i2 = -1;
      label68:
      if (i1 >= localJSONArray.length()) {
        break label197;
      }
      bbt localbbt = new bbt(localJSONArray.getJSONObject(i1));
      if (localbbt.a()) {
        this.t = true;
      }
      localArrayList.add(localbbt);
      if (i2 < 0)
      {
        Iterator localIterator = localbbt.c.iterator();
        do
        {
          if (!localIterator.hasNext()) {
            break;
          }
        } while (!((String)localIterator.next()).equals("com.google.ads.mediation.admob.AdMobAdapter"));
      }
    }
    for (int i3 = 1;; i3 = 0)
    {
      if (i3 != 0) {
        i2 = i1;
      }
      i1++;
      break label68;
      str2 = new String("Mediation Response JSON: ");
      break;
    }
    label197:
    this.r = i2;
    this.s = localJSONArray.length();
    this.a = Collections.unmodifiableList(localArrayList);
    this.i = paramJSONObject.optString("qdata");
    this.m = paramJSONObject.optInt("fs_model_type", -1);
    this.n = paramJSONObject.optLong("timeout_ms", -1L);
    JSONObject localJSONObject = paramJSONObject.optJSONObject("settings");
    if (localJSONObject != null)
    {
      this.b = localJSONObject.optLong("ad_network_timeout_millis", -1L);
      zzbv.zzfd();
      this.c = bcd.a(localJSONObject, "click_urls");
      zzbv.zzfd();
      this.d = bcd.a(localJSONObject, "imp_urls");
      zzbv.zzfd();
      this.e = bcd.a(localJSONObject, "downloaded_imp_urls");
      zzbv.zzfd();
      this.f = bcd.a(localJSONObject, "nofill_urls");
      zzbv.zzfd();
      this.g = bcd.a(localJSONObject, "remote_ping_urls");
      this.h = localJSONObject.optBoolean("render_in_browser", false);
      long l1 = localJSONObject.optLong("refresh", -1L);
      long l2;
      zzaig localzzaig;
      if (l1 > 0L)
      {
        l2 = l1 * 1000L;
        this.j = l2;
        localzzaig = zzaig.a(localJSONObject.optJSONArray("rewards"));
        if (localzzaig != null) {
          break label472;
        }
        this.k = null;
      }
      for (this.l = 0;; this.l = localzzaig.b)
      {
        this.o = localJSONObject.optBoolean("use_displayed_impression", false);
        this.p = localJSONObject.optBoolean("allow_pub_rendered_attribution", false);
        this.q = localJSONObject.optBoolean("allow_pub_owned_ad_view", false);
        return;
        l2 = -1L;
        break;
        label472:
        this.k = localzzaig.a;
      }
    }
    this.b = -1L;
    this.c = null;
    this.d = null;
    this.e = null;
    this.f = null;
    this.g = null;
    this.j = -1L;
    this.k = null;
    this.l = 0;
    this.o = false;
    this.h = false;
    this.p = false;
    this.q = false;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bbu
 * JD-Core Version:    0.7.0.1
 */