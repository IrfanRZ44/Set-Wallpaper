package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONObject;

@cm
@ParametersAreNonnullByDefault
public final class bbt
{
  public final String a;
  public final String b;
  public final List<String> c;
  public final String d;
  public final String e;
  public final List<String> f;
  public final List<String> g;
  public final List<String> h;
  public final List<String> i;
  public final List<String> j;
  public final String k;
  public final List<String> l;
  public final List<String> m;
  public final List<String> n;
  public final String o;
  public final String p;
  public final String q;
  public final List<String> r;
  public final String s;
  public final long t;
  private final String u;
  
  public bbt(String paramString1, String paramString2, List<String> paramList1, String paramString3, String paramString4, List<String> paramList2, List<String> paramList3, List<String> paramList4, List<String> paramList5, String paramString5, String paramString6, List<String> paramList6, List<String> paramList7, List<String> paramList8, String paramString7, String paramString8, String paramString9, List<String> paramList9, String paramString10, List<String> paramList10, String paramString11, long paramLong)
  {
    this.a = paramString1;
    this.b = null;
    this.c = paramList1;
    this.d = null;
    this.e = null;
    this.f = paramList2;
    this.g = paramList3;
    this.h = paramList4;
    this.i = paramList5;
    this.k = paramString5;
    this.l = paramList6;
    this.m = paramList7;
    this.n = paramList8;
    this.o = null;
    this.p = null;
    this.q = null;
    this.r = null;
    this.s = null;
    this.j = paramList10;
    this.u = null;
    this.t = -1L;
  }
  
  public bbt(JSONObject paramJSONObject)
  {
    this.b = paramJSONObject.optString("id");
    JSONArray localJSONArray = paramJSONObject.getJSONArray("adapters");
    ArrayList localArrayList = new ArrayList(localJSONArray.length());
    for (int i1 = 0; i1 < localJSONArray.length(); i1++) {
      localArrayList.add(localJSONArray.getString(i1));
    }
    this.c = Collections.unmodifiableList(localArrayList);
    this.d = paramJSONObject.optString("allocation_id", null);
    zzbv.zzfd();
    this.f = bcd.a(paramJSONObject, "clickurl");
    zzbv.zzfd();
    this.g = bcd.a(paramJSONObject, "imp_urls");
    zzbv.zzfd();
    this.h = bcd.a(paramJSONObject, "downloaded_imp_urls");
    zzbv.zzfd();
    this.j = bcd.a(paramJSONObject, "fill_urls");
    zzbv.zzfd();
    this.l = bcd.a(paramJSONObject, "video_start_urls");
    zzbv.zzfd();
    this.n = bcd.a(paramJSONObject, "video_complete_urls");
    zzbv.zzfd();
    List localList1 = bcd.a(paramJSONObject, "video_reward_urls");
    arq localarq = asa.ax;
    List localList2;
    List localList3;
    label237:
    String str1;
    label255:
    String str2;
    label281:
    String str3;
    label301:
    String str4;
    label349:
    JSONObject localJSONObject4;
    if (((Boolean)aos.f().a(localarq)).booleanValue())
    {
      localList2 = localList1;
      this.m = localList2;
      JSONObject localJSONObject1 = paramJSONObject.optJSONObject("ad");
      if (localJSONObject1 == null) {
        break label429;
      }
      zzbv.zzfd();
      localList3 = bcd.a(localJSONObject1, "manual_impression_urls");
      this.i = localList3;
      if (localJSONObject1 == null) {
        break label435;
      }
      str1 = localJSONObject1.toString();
      this.a = str1;
      JSONObject localJSONObject2 = paramJSONObject.optJSONObject("data");
      if (localJSONObject2 == null) {
        break label441;
      }
      str2 = localJSONObject2.toString();
      this.k = str2;
      if (localJSONObject2 == null) {
        break label447;
      }
      str3 = localJSONObject2.optString("class_name");
      this.e = str3;
      this.o = paramJSONObject.optString("html_template", null);
      this.p = paramJSONObject.optString("ad_base_url", null);
      JSONObject localJSONObject3 = paramJSONObject.optJSONObject("assets");
      if (localJSONObject3 == null) {
        break label453;
      }
      str4 = localJSONObject3.toString();
      this.q = str4;
      zzbv.zzfd();
      this.r = bcd.a(paramJSONObject, "template_ids");
      localJSONObject4 = paramJSONObject.optJSONObject("ad_loader_options");
      if (localJSONObject4 == null) {
        break label459;
      }
    }
    label429:
    label435:
    label441:
    label447:
    label453:
    label459:
    for (String str5 = localJSONObject4.toString();; str5 = null)
    {
      this.s = str5;
      this.u = paramJSONObject.optString("response_type", null);
      this.t = paramJSONObject.optLong("ad_network_timeout_millis", -1L);
      return;
      localList2 = this.n;
      break;
      localList3 = null;
      break label237;
      str1 = null;
      break label255;
      str2 = null;
      break label281;
      str3 = null;
      break label301;
      str4 = null;
      break label349;
    }
  }
  
  public final boolean a()
  {
    return "banner".equalsIgnoreCase(this.u);
  }
  
  public final boolean b()
  {
    return "native".equalsIgnoreCase(this.u);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bbt
 * JD-Core Version:    0.7.0.1
 */