package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.location.Location;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Debug.MemoryInfo;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.internal.zzbv;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@cm
public final class et
{
  private static final SimpleDateFormat a = new SimpleDateFormat("yyyyMMdd", Locale.US);
  
  public static zzaej a(Context paramContext, zzaef paramzzaef, String paramString)
  {
    try
    {
      localJSONObject = new JSONObject(paramString);
      str3 = localJSONObject.optString("ad_base_url", null);
      str4 = localJSONObject.optString("ad_url", null);
      str5 = localJSONObject.optString("ad_size", null);
      str6 = localJSONObject.optString("ad_slot_size", str5);
      if ((paramzzaef == null) || (paramzzaef.m == 0)) {
        break label935;
      }
      bool1 = true;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        JSONObject localJSONObject;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        long l1;
        String str8;
        String str9;
        String str10;
        int i;
        JSONArray localJSONArray1;
        List localList1;
        JSONArray localJSONArray2;
        List localList2;
        label331:
        JSONArray localJSONArray3;
        List localList3;
        label361:
        JSONArray localJSONArray4;
        List localList4;
        label391:
        String str12;
        boolean bool2;
        String str13;
        boolean bool3;
        boolean bool4;
        boolean bool5;
        boolean bool6;
        boolean bool7;
        long l4;
        long l5;
        String str14;
        boolean bool8;
        boolean bool9;
        List localList5;
        List localList6;
        zzaig localzzaig;
        boolean bool10;
        zzael localzzael;
        String str15;
        List localList7;
        zzaiq localzzaiq;
        boolean bool11;
        boolean bool12;
        boolean bool13;
        String str16;
        boolean bool14;
        zzaej localzzaej2;
        String str1 = String.valueOf(localJSONException.getMessage());
        if (str1.length() != 0) {}
        for (String str2 = "Could not parse the inline ad response: ".concat(str1);; str2 = new String("Could not parse the inline ad response: "))
        {
          je.e(str2);
          return new zzaej(0);
          localList1 = localzzaej1.c;
          break;
          label873:
          localList2 = localzzaej1.e;
          break label331;
          label883:
          localList3 = localzzaej1.R;
          break label361;
          label893:
          localList4 = localzzaej1.i;
          break label391;
        }
        label918:
        long l3 = l2;
        continue;
        label925:
        String str11 = str7;
        zzaej localzzaej1 = null;
        continue;
        label935:
        boolean bool1 = false;
        continue;
        long l2 = -1L;
      }
    }
    str7 = localJSONObject.optString("ad_json", null);
    if (str7 == null) {
      str7 = localJSONObject.optString("ad_html", null);
    }
    if (str7 == null) {
      str7 = localJSONObject.optString("body", null);
    }
    if ((str7 == null) && (localJSONObject.has("ads"))) {
      str7 = localJSONObject.toString();
    }
    l1 = -1L;
    str8 = localJSONObject.optString("debug_dialog", null);
    str9 = localJSONObject.optString("debug_signals", null);
    if (localJSONObject.has("interstitial_timeout"))
    {
      l2 = (1000.0D * localJSONObject.getDouble("interstitial_timeout"));
      str10 = localJSONObject.optString("orientation", null);
      i = -1;
      if ("portrait".equals(str10)) {
        i = zzbv.zzem().b();
      }
      for (;;)
      {
        if ((!TextUtils.isEmpty(str7)) || (TextUtils.isEmpty(str4))) {
          break label925;
        }
        localzzaej1 = eo.a(paramzzaef, paramContext, paramzzaef.k.a, str4, null, null, null, null, null);
        str3 = localzzaej1.a;
        str11 = localzzaej1.b;
        l1 = localzzaej1.m;
        if (str11 != null) {
          break;
        }
        return new zzaej(0);
        if ("landscape".equals(str10)) {
          i = zzbv.zzem().a();
        }
      }
      localJSONArray1 = localJSONObject.optJSONArray("click_urls");
      if (localzzaej1 == null)
      {
        localList1 = null;
        if (localJSONArray1 != null) {
          localList1 = a(localJSONArray1, localList1);
        }
        localJSONArray2 = localJSONObject.optJSONArray("impression_urls");
        if (localzzaej1 != null) {
          break label873;
        }
        localList2 = null;
        if (localJSONArray2 != null) {
          localList2 = a(localJSONArray2, localList2);
        }
        localJSONArray3 = localJSONObject.optJSONArray("downloaded_impression_urls");
        if (localzzaej1 != null) {
          break label883;
        }
        localList3 = null;
        if (localJSONArray3 != null) {
          localList3 = a(localJSONArray3, localList3);
        }
        localJSONArray4 = localJSONObject.optJSONArray("manual_impression_urls");
        if (localzzaej1 != null) {
          break label893;
        }
        localList4 = null;
        if (localJSONArray4 != null) {
          localList4 = a(localJSONArray4, localList4);
        }
        if (localzzaej1 == null) {
          break label918;
        }
        if (localzzaej1.k != -1) {
          i = localzzaej1.k;
        }
        if (localzzaej1.f <= 0L) {
          break label918;
        }
        l3 = localzzaej1.f;
        str12 = localJSONObject.optString("active_view");
        bool2 = localJSONObject.optBoolean("ad_is_javascript", false);
        str13 = null;
        if (bool2) {
          str13 = localJSONObject.optString("ad_passback_url", null);
        }
        bool3 = localJSONObject.optBoolean("mediation", false);
        bool4 = localJSONObject.optBoolean("custom_render_allowed", false);
        bool5 = localJSONObject.optBoolean("content_url_opted_out", true);
        bool6 = localJSONObject.optBoolean("content_vertical_opted_out", true);
        bool7 = localJSONObject.optBoolean("prefetch", false);
        l4 = localJSONObject.optLong("refresh_interval_milliseconds", -1L);
        l5 = localJSONObject.optLong("mediation_config_cache_time_milliseconds", -1L);
        str14 = localJSONObject.optString("gws_query_id", "");
        bool8 = "height".equals(localJSONObject.optString("fluid", ""));
        bool9 = localJSONObject.optBoolean("native_express", false);
        localList5 = a(localJSONObject.optJSONArray("video_start_urls"), null);
        localList6 = a(localJSONObject.optJSONArray("video_complete_urls"), null);
        localzzaig = zzaig.a(localJSONObject.optJSONArray("rewards"));
        bool10 = localJSONObject.optBoolean("use_displayed_impression", false);
        localzzael = zzael.a(localJSONObject.optJSONObject("auto_protection_configuration"));
        str15 = localJSONObject.optString("set_cookie", "");
        localList7 = a(localJSONObject.optJSONArray("remote_ping_urls"), null);
        localzzaiq = zzaiq.a(localJSONObject.optJSONObject("safe_browsing"));
        bool11 = localJSONObject.optBoolean("render_in_browser", paramzzaef.K);
        bool12 = localJSONObject.optBoolean("custom_close_blocked");
        bool13 = localJSONObject.optBoolean("enable_omid", false);
        str16 = localJSONObject.optString("omid_settings", null);
        bool14 = localJSONObject.optBoolean("disable_closable_area", false);
        localzzaej2 = new zzaej(paramzzaef, str3, str11, localList1, localList2, l3, bool3, l5, localList4, l4, i, str5, l1, str8, bool2, str13, str12, bool4, bool1, paramzzaef.p, bool5, bool7, str14, bool8, bool9, localzzaig, localList5, localList6, bool10, localzzael, paramzzaef.G, str15, localList7, bool11, str6, localzzaiq, str9, bool6, paramzzaef.U, bool12, 0, bool13, localList3, bool14, str16);
        return localzzaej2;
      }
    }
  }
  
  private static Integer a(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = 1;; i = 0) {
      return Integer.valueOf(i);
    }
  }
  
  private static List<String> a(JSONArray paramJSONArray, List<String> paramList)
  {
    if (paramJSONArray == null) {
      paramList = null;
    }
    for (;;)
    {
      return paramList;
      if (paramList == null) {
        paramList = new ArrayList();
      }
      for (int i = 0; i < paramJSONArray.length(); i++) {
        paramList.add(paramJSONArray.getString(i));
      }
    }
  }
  
  private static JSONArray a(List<String> paramList)
  {
    JSONArray localJSONArray = new JSONArray();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext()) {
      localJSONArray.put((String)localIterator.next());
    }
    return localJSONArray;
  }
  
  public static JSONObject a(Context paramContext, em paramem)
  {
    zzaef localzzaef = paramem.j;
    Location localLocation = paramem.d;
    fc localfc = paramem.k;
    Bundle localBundle1 = paramem.a;
    JSONObject localJSONObject = paramem.l;
    HashMap localHashMap1;
    StringBuilder localStringBuilder;
    int i1;
    int i2;
    label667:
    zzjn localzzjn2;
    try
    {
      localHashMap1 = new HashMap();
      arq localarq1 = asa.bT;
      localHashMap1.put("extra_caps", aos.f().a(localarq1));
      if (paramem.c.size() > 0) {
        localHashMap1.put("eid", TextUtils.join(",", paramem.c));
      }
      if (localzzaef.b != null) {
        localHashMap1.put("ad_pos", localzzaef.b);
      }
      zzjj localzzjj = localzzaef.c;
      String str3 = iy.a();
      if (str3 != null) {
        localHashMap1.put("abf", str3);
      }
      if (localzzjj.b != -1L) {
        localHashMap1.put("cust_age", a.format(new Date(localzzjj.b)));
      }
      if (localzzjj.c != null) {
        localHashMap1.put("extras", localzzjj.c);
      }
      if (localzzjj.d != -1) {
        localHashMap1.put("cust_gender", Integer.valueOf(localzzjj.d));
      }
      if (localzzjj.e != null) {
        localHashMap1.put("kw", localzzjj.e);
      }
      if (localzzjj.g != -1) {
        localHashMap1.put("tag_for_child_directed_treatment", Integer.valueOf(localzzjj.g));
      }
      if (localzzjj.f)
      {
        arq localarq10 = asa.dk;
        if (!((Boolean)aos.f().a(localarq10)).booleanValue()) {
          break label695;
        }
        localHashMap1.put("test_request", Boolean.valueOf(true));
      }
      for (;;)
      {
        if (localzzjj.a >= 2)
        {
          if (localzzjj.h) {
            localHashMap1.put("d_imp_hdr", Integer.valueOf(1));
          }
          if (!TextUtils.isEmpty(localzzjj.i)) {
            localHashMap1.put("ppid", localzzjj.i);
          }
        }
        if ((localzzjj.a >= 3) && (localzzjj.l != null)) {
          localHashMap1.put("url", localzzjj.l);
        }
        if (localzzjj.a >= 5)
        {
          if (localzzjj.n != null) {
            localHashMap1.put("custom_targeting", localzzjj.n);
          }
          if (localzzjj.o != null) {
            localHashMap1.put("category_exclusions", localzzjj.o);
          }
          if (localzzjj.p != null) {
            localHashMap1.put("request_agent", localzzjj.p);
          }
        }
        if ((localzzjj.a >= 6) && (localzzjj.q != null)) {
          localHashMap1.put("request_pkg", localzzjj.q);
        }
        if (localzzjj.a >= 7) {
          localHashMap1.put("is_designed_for_families", Boolean.valueOf(localzzjj.r));
        }
        if (localzzaef.d.g != null) {
          break;
        }
        localHashMap1.put("format", localzzaef.d.a);
        if (localzzaef.d.i) {
          localHashMap1.put("fluid", "height");
        }
        if (localzzaef.d.e == -1) {
          localHashMap1.put("smart_w", "full");
        }
        if (localzzaef.d.b == -2) {
          localHashMap1.put("smart_h", "auto");
        }
        if (localzzaef.d.g == null) {
          break label1001;
        }
        localStringBuilder = new StringBuilder();
        zzjn[] arrayOfzzjn2 = localzzaef.d.g;
        int n = arrayOfzzjn2.length;
        i1 = 0;
        i2 = 0;
        if (i1 >= n) {
          break label957;
        }
        localzzjn2 = arrayOfzzjn2[i1];
        if (!localzzjn2.i) {
          break label843;
        }
        i2 = 1;
        break label3944;
        label695:
        localHashMap1.put("adtest", "on");
      }
      String str1;
      str2 = "Problem serializing ad request to JSON: ".concat(str1);
    }
    catch (JSONException localJSONException1)
    {
      str1 = String.valueOf(localJSONException1.getMessage());
      if (str1.length() == 0) {
        break label3929;
      }
    }
    String str2;
    label740:
    je.e(str2);
    return null;
    zzjn[] arrayOfzzjn1 = localzzaef.d.g;
    int i = arrayOfzzjn1.length;
    int j = 0;
    int k = 0;
    int m = 0;
    label770:
    label843:
    label1001:
    String str10;
    label947:
    label957:
    label1225:
    Bundle localBundle11;
    if (m < i)
    {
      zzjn localzzjn1 = arrayOfzzjn1[m];
      if ((!localzzjn1.i) && (k == 0))
      {
        localHashMap1.put("format", localzzjn1.a);
        k = 1;
      }
      if ((localzzjn1.i) && (j == 0))
      {
        localHashMap1.put("fluid", "height");
        j = 1;
        break label3950;
        if (localStringBuilder.length() != 0) {
          localStringBuilder.append("|");
        }
        int i3;
        if (localzzjn2.e == -1)
        {
          i3 = (int)(localzzjn2.f / localfc.s);
          localStringBuilder.append(i3);
          localStringBuilder.append("x");
          if (localzzjn2.b != -2) {
            break label947;
          }
        }
        for (int i4 = (int)(localzzjn2.c / localfc.s);; i4 = localzzjn2.b)
        {
          localStringBuilder.append(i4);
          break label3944;
          i3 = localzzjn2.e;
          break;
        }
        if (i2 != 0)
        {
          if (localStringBuilder.length() != 0) {
            localStringBuilder.insert(0, "|");
          }
          localStringBuilder.insert(0, "320x50");
        }
        localHashMap1.put("sz", localStringBuilder);
        zzpl localzzpl;
        if (localzzaef.m != 0)
        {
          localHashMap1.put("native_version", Integer.valueOf(localzzaef.m));
          localHashMap1.put("native_templates", localzzaef.n);
          localzzpl = localzzaef.y;
          if (localzzpl != null) {
            break label1225;
          }
          str10 = "any";
          label1053:
          localHashMap1.put("native_image_orientation", str10);
          if (!localzzaef.z.isEmpty()) {
            localHashMap1.put("native_custom_templates", localzzaef.z);
          }
          if (localzzaef.a >= 24) {
            localHashMap1.put("max_num_ads", Integer.valueOf(localzzaef.Y));
          }
          boolean bool7 = TextUtils.isEmpty(localzzaef.W);
          if (bool7) {}
        }
        try
        {
          localHashMap1.put("native_advanced_settings", new JSONArray(localzzaef.W));
          if ((localzzaef.V != null) && (localzzaef.V.size() > 0))
          {
            Iterator localIterator = localzzaef.V.iterator();
            for (;;)
            {
              if (localIterator.hasNext())
              {
                localInteger = (Integer)localIterator.next();
                if (localInteger.intValue() == 2)
                {
                  localHashMap1.put("iba", Boolean.valueOf(true));
                  continue;
                  switch (localzzpl.c)
                  {
                  }
                }
              }
            }
          }
        }
        catch (JSONException localJSONException4)
        {
          for (;;)
          {
            Integer localInteger;
            je.c("Problem creating json from native advanced settings", localJSONException4);
            continue;
            if (localInteger.intValue() == 1) {
              localHashMap1.put("ina", Boolean.valueOf(true));
            }
          }
          if (localzzaef.d.j) {
            localHashMap1.put("ene", Boolean.valueOf(true));
          }
          arq localarq2 = asa.ax;
          if (((Boolean)aos.f().a(localarq2)).booleanValue()) {
            localHashMap1.put("xsrve", Boolean.valueOf(true));
          }
          if (localzzaef.O != null)
          {
            localHashMap1.put("is_icon_ad", Boolean.valueOf(true));
            localHashMap1.put("icon_ad_expansion_behavior", Integer.valueOf(localzzaef.O.a));
          }
          localHashMap1.put("slotname", localzzaef.e);
          localHashMap1.put("pn", localzzaef.f.packageName);
          if (localzzaef.g != null) {
            localHashMap1.put("vc", Integer.valueOf(localzzaef.g.versionCode));
          }
          localHashMap1.put("ms", paramem.h);
          localHashMap1.put("seq_num", localzzaef.i);
          localHashMap1.put("session_id", localzzaef.j);
          localHashMap1.put("js", localzzaef.k.a);
          fm localfm = paramem.e;
          Bundle localBundle2 = localzzaef.M;
          Bundle localBundle3 = paramem.b;
          localHashMap1.put("am", Integer.valueOf(localfc.a));
          localHashMap1.put("cog", a(localfc.b));
          localHashMap1.put("coh", a(localfc.c));
          if (!TextUtils.isEmpty(localfc.d)) {
            localHashMap1.put("carrier", localfc.d);
          }
          localHashMap1.put("gl", localfc.e);
          if (localfc.f) {
            localHashMap1.put("simulator", Integer.valueOf(1));
          }
          if (localfc.g) {
            localHashMap1.put("is_sidewinder", Integer.valueOf(1));
          }
          localHashMap1.put("ma", a(localfc.h));
          localHashMap1.put("sp", a(localfc.i));
          localHashMap1.put("hl", localfc.j);
          if (!TextUtils.isEmpty(localfc.k)) {
            localHashMap1.put("mv", localfc.k);
          }
          localHashMap1.put("muv", Integer.valueOf(localfc.m));
          if (localfc.n != -2) {
            localHashMap1.put("cnt", Integer.valueOf(localfc.n));
          }
          localHashMap1.put("gnt", Integer.valueOf(localfc.o));
          localHashMap1.put("pt", Integer.valueOf(localfc.p));
          localHashMap1.put("rm", Integer.valueOf(localfc.q));
          localHashMap1.put("riv", Integer.valueOf(localfc.r));
          Bundle localBundle4 = new Bundle();
          localBundle4.putString("build_build", localfc.z);
          localBundle4.putString("build_device", localfc.A);
          Bundle localBundle5 = new Bundle();
          localBundle5.putBoolean("is_charging", localfc.w);
          localBundle5.putDouble("battery_level", localfc.v);
          localBundle4.putBundle("battery", localBundle5);
          Bundle localBundle6 = new Bundle();
          localBundle6.putInt("active_network_state", localfc.y);
          localBundle6.putBoolean("active_network_metered", localfc.x);
          if (localfm != null)
          {
            Bundle localBundle7 = new Bundle();
            localBundle7.putInt("predicted_latency_micros", localfm.a);
            localBundle7.putLong("predicted_down_throughput_bps", localfm.b);
            localBundle7.putLong("predicted_up_throughput_bps", localfm.c);
            localBundle6.putBundle("predictions", localBundle7);
          }
          localBundle4.putBundle("network", localBundle6);
          Bundle localBundle8 = new Bundle();
          localBundle8.putBoolean("is_browser_custom_tabs_capable", localfc.B);
          localBundle4.putBundle("browser", localBundle8);
          if (localBundle2 != null)
          {
            Bundle localBundle9 = new Bundle();
            localBundle9.putString("runtime_free", Long.toString(localBundle2.getLong("runtime_free_memory", -1L)));
            localBundle9.putString("runtime_max", Long.toString(localBundle2.getLong("runtime_max_memory", -1L)));
            localBundle9.putString("runtime_total", Long.toString(localBundle2.getLong("runtime_total_memory", -1L)));
            localBundle9.putString("web_view_count", Integer.toString(localBundle2.getInt("web_view_count", 0)));
            Debug.MemoryInfo localMemoryInfo = (Debug.MemoryInfo)localBundle2.getParcelable("debug_memory_info");
            if (localMemoryInfo != null)
            {
              localBundle9.putString("debug_info_dalvik_private_dirty", Integer.toString(localMemoryInfo.dalvikPrivateDirty));
              localBundle9.putString("debug_info_dalvik_pss", Integer.toString(localMemoryInfo.dalvikPss));
              localBundle9.putString("debug_info_dalvik_shared_dirty", Integer.toString(localMemoryInfo.dalvikSharedDirty));
              localBundle9.putString("debug_info_native_private_dirty", Integer.toString(localMemoryInfo.nativePrivateDirty));
              localBundle9.putString("debug_info_native_pss", Integer.toString(localMemoryInfo.nativePss));
              localBundle9.putString("debug_info_native_shared_dirty", Integer.toString(localMemoryInfo.nativeSharedDirty));
              localBundle9.putString("debug_info_other_private_dirty", Integer.toString(localMemoryInfo.otherPrivateDirty));
              localBundle9.putString("debug_info_other_pss", Integer.toString(localMemoryInfo.otherPss));
              localBundle9.putString("debug_info_other_shared_dirty", Integer.toString(localMemoryInfo.otherSharedDirty));
            }
            localBundle4.putBundle("android_mem_info", localBundle9);
          }
          Bundle localBundle10 = new Bundle();
          localBundle10.putBundle("parental_controls", localBundle3);
          if (!TextUtils.isEmpty(localfc.l)) {
            localBundle10.putString("package_version", localfc.l);
          }
          localBundle4.putBundle("play_store", localBundle10);
          localHashMap1.put("device", localBundle4);
          localBundle11 = new Bundle();
          localBundle11.putString("doritos", paramem.f);
          localBundle11.putString("doritos_v2", paramem.g);
          arq localarq3 = asa.aJ;
          if (((Boolean)aos.f().a(localarq3)).booleanValue())
          {
            AdvertisingIdClient.Info localInfo = paramem.i;
            boolean bool6 = false;
            String str9 = null;
            if (localInfo != null)
            {
              str9 = paramem.i.getId();
              bool6 = paramem.i.isLimitAdTrackingEnabled();
            }
            if (TextUtils.isEmpty(str9)) {
              break label3594;
            }
            localBundle11.putString("rdid", str9);
            localBundle11.putBoolean("is_lat", bool6);
            localBundle11.putString("idtype", "adid");
          }
        }
        label2521:
        localHashMap1.put("pii", localBundle11);
        localHashMap1.put("platform", Build.MANUFACTURER);
        localHashMap1.put("submodel", Build.MODEL);
        if (localLocation != null)
        {
          a(localHashMap1, localLocation);
          label2566:
          if (localzzaef.a >= 2) {
            localHashMap1.put("quality_signals", localzzaef.l);
          }
          if ((localzzaef.a >= 4) && (localzzaef.p)) {
            localHashMap1.put("forceHttps", Boolean.valueOf(localzzaef.p));
          }
          if (localBundle1 != null) {
            localHashMap1.put("content_info", localBundle1);
          }
          if (localzzaef.a < 5) {
            break label3660;
          }
          localHashMap1.put("u_sd", Float.valueOf(localzzaef.s));
          localHashMap1.put("sh", Integer.valueOf(localzzaef.r));
          localHashMap1.put("sw", Integer.valueOf(localzzaef.q));
          label2690:
          if (localzzaef.a >= 6)
          {
            boolean bool5 = TextUtils.isEmpty(localzzaef.t);
            if (bool5) {}
          }
        }
      }
    }
    for (;;)
    {
      try
      {
        localHashMap1.put("view_hierarchy", new JSONObject(localzzaef.t));
        localHashMap1.put("correlation_id", Long.valueOf(localzzaef.u));
        if (localzzaef.a >= 7) {
          localHashMap1.put("request_id", localzzaef.v);
        }
        if ((localzzaef.a >= 12) && (!TextUtils.isEmpty(localzzaef.B))) {
          localHashMap1.put("anchor", localzzaef.B);
        }
        if (localzzaef.a >= 13) {
          localHashMap1.put("android_app_volume", Float.valueOf(localzzaef.C));
        }
        if (localzzaef.a >= 18) {
          localHashMap1.put("android_app_muted", Boolean.valueOf(localzzaef.I));
        }
        if ((localzzaef.a >= 14) && (localzzaef.D > 0)) {
          localHashMap1.put("target_api", Integer.valueOf(localzzaef.D));
        }
        if (localzzaef.a >= 15)
        {
          if (localzzaef.E == -1)
          {
            i10 = -1;
            localHashMap1.put("scroll_index", Integer.valueOf(i10));
          }
        }
        else
        {
          if (localzzaef.a >= 16) {
            localHashMap1.put("_activity_context", Boolean.valueOf(localzzaef.F));
          }
          if (localzzaef.a >= 18)
          {
            boolean bool4 = TextUtils.isEmpty(localzzaef.J);
            if (bool4) {}
          }
        }
      }
      catch (JSONException localJSONException3)
      {
        try
        {
          int i10;
          localHashMap1.put("app_settings", new JSONObject(localzzaef.J));
          localHashMap1.put("render_in_browser", Boolean.valueOf(localzzaef.K));
          if (localzzaef.a >= 18) {
            localHashMap1.put("android_num_video_cache_tasks", Integer.valueOf(localzzaef.L));
          }
          zzang localzzang = localzzaef.k;
          boolean bool1 = localzzaef.Z;
          boolean bool2 = paramem.m;
          boolean bool3 = localzzaef.ab;
          Bundle localBundle12 = new Bundle();
          Bundle localBundle13 = new Bundle();
          localBundle13.putString("cl", "193400285");
          localBundle13.putString("rapid_rc", "dev");
          localBundle13.putString("rapid_rollup", "HEAD");
          localBundle12.putBundle("build_meta", localBundle13);
          arq localarq4 = asa.bV;
          localBundle12.putString("mf", Boolean.toString(((Boolean)aos.f().a(localarq4)).booleanValue()));
          localBundle12.putBoolean("instant_app", bool1);
          localBundle12.putBoolean("lite", localzzang.e);
          localBundle12.putBoolean("local_service", bool2);
          localBundle12.putBoolean("is_privileged_process", bool3);
          localHashMap1.put("sdk_env", localBundle12);
          localHashMap1.put("cache_state", localJSONObject);
          if (localzzaef.a >= 19) {
            localHashMap1.put("gct", localzzaef.N);
          }
          if ((localzzaef.a >= 21) && (localzzaef.P)) {
            localHashMap1.put("de", "1");
          }
          arq localarq5 = asa.aT;
          if (((Boolean)aos.f().a(localarq5)).booleanValue())
          {
            String str8 = localzzaef.d.a;
            if (str8.equals("interstitial_mb")) {
              break label3996;
            }
            if (!str8.equals("reward_mb")) {
              break label4002;
            }
            break label3996;
            Bundle localBundle14 = localzzaef.Q;
            if (localBundle14 == null) {
              break label4008;
            }
            i9 = 1;
            if ((i8 != 0) && (i9 != 0))
            {
              Bundle localBundle15 = new Bundle();
              localBundle15.putBundle("interstitial_pool", localBundle14);
              localHashMap1.put("counters", localBundle15);
            }
          }
          if (localzzaef.R != null) {
            localHashMap1.put("gmp_app_id", localzzaef.R);
          }
          if (localzzaef.S != null) {
            if ("TIME_OUT".equals(localzzaef.S))
            {
              arq localarq9 = asa.av;
              localHashMap1.put("sai_timeout", aos.f().a(localarq9));
              if (localzzaef.T != null) {
                localHashMap1.put("fbs_aeid", localzzaef.T);
              }
              if (localzzaef.a >= 24) {
                localHashMap1.put("disable_ml", Boolean.valueOf(localzzaef.aa));
              }
              arq localarq6 = asa.E;
              String str4 = (String)aos.f().a(localarq6);
              if ((str4 == null) || (str4.isEmpty())) {
                continue;
              }
              int i5 = Build.VERSION.SDK_INT;
              arq localarq8 = asa.F;
              if (i5 < ((Integer)aos.f().a(localarq8)).intValue()) {
                continue;
              }
              localHashMap2 = new HashMap();
              String[] arrayOfString = str4.split(",");
              int i6 = arrayOfString.length;
              int i7 = 0;
              if (i7 >= i6) {
                continue;
              }
              String str7 = arrayOfString[i7];
              localHashMap2.put(str7, lx.a(str7));
              i7++;
              continue;
              label3594:
              aos.a();
              localBundle11.putString("pdid", lz.b(paramContext));
              localBundle11.putString("pdidtype", "ssaid");
              break label2521;
              if ((localzzaef.c.a < 2) || (localzzaef.c.k == null)) {
                break label2566;
              }
              a(localHashMap1, localzzaef.c.k);
              break label2566;
              label3660:
              localHashMap1.put("u_sd", Float.valueOf(localfc.s));
              localHashMap1.put("sh", Integer.valueOf(localfc.u));
              localHashMap1.put("sw", Integer.valueOf(localfc.t));
              break label2690;
              localJSONException3 = localJSONException3;
              je.c("Problem serializing view hierarchy to JSON", localJSONException3);
              continue;
              i10 = localzzaef.E;
            }
          }
        }
        catch (JSONException localJSONException2)
        {
          HashMap localHashMap2;
          je.c("Problem creating json from app settings", localJSONException2);
          continue;
          localHashMap1.put("fbs_aiid", localzzaef.S);
          continue;
          localHashMap1.put("fbs_aiid", "");
          continue;
          localHashMap1.put("video_decoders", localHashMap2);
          arq localarq7 = asa.dg;
          if (((Boolean)aos.f().a(localarq7)).booleanValue()) {
            localHashMap1.put("omid_v", zzbv.zzfa().b(paramContext));
          }
          if ((localzzaef.ac != null) && (!localzzaef.ac.isEmpty())) {
            localHashMap1.put("android_permissions", localzzaef.ac);
          }
          if (!je.a(2)) {
            break label3905;
          }
        }
      }
      String str5 = String.valueOf(zzbv.zzek().a(localHashMap1).toString(2));
      if (str5.length() != 0) {}
      for (String str6 = "Ad Request JSON: ".concat(str5);; str6 = new String("Ad Request JSON: "))
      {
        je.a(str6);
        label3905:
        return zzbv.zzek().a(localHashMap1);
      }
      label3929:
      str2 = new String("Problem serializing ad request to JSON: ");
      break label740;
      label3944:
      i1++;
      break label667;
      label3950:
      if ((k != 0) && (j != 0)) {
        break;
      }
      m++;
      break label770;
      break;
      str10 = "not_set";
      break label1053;
      str10 = "portrait";
      break label1053;
      str10 = "landscape";
      break label1053;
      str10 = "any";
      break label1053;
      label3996:
      int i8 = 1;
      continue;
      label4002:
      i8 = 0;
      continue;
      label4008:
      int i9 = 0;
    }
  }
  
  public static JSONObject a(zzaej paramzzaej)
  {
    JSONObject localJSONObject1 = new JSONObject();
    if (paramzzaej.a != null) {
      localJSONObject1.put("ad_base_url", paramzzaej.a);
    }
    if (paramzzaej.l != null) {
      localJSONObject1.put("ad_size", paramzzaej.l);
    }
    localJSONObject1.put("native", paramzzaej.s);
    if (paramzzaej.s)
    {
      localJSONObject1.put("ad_json", paramzzaej.b);
      if (paramzzaej.n != null) {
        localJSONObject1.put("debug_dialog", paramzzaej.n);
      }
      if (paramzzaej.L != null) {
        localJSONObject1.put("debug_signals", paramzzaej.L);
      }
      if (paramzzaej.f != -1L) {
        localJSONObject1.put("interstitial_timeout", paramzzaej.f / 1000.0D);
      }
      if (paramzzaej.k != zzbv.zzem().b()) {
        break label619;
      }
      localJSONObject1.put("orientation", "portrait");
      label159:
      if (paramzzaej.c != null) {
        localJSONObject1.put("click_urls", a(paramzzaej.c));
      }
      if (paramzzaej.e != null) {
        localJSONObject1.put("impression_urls", a(paramzzaej.e));
      }
      if (paramzzaej.R != null) {
        localJSONObject1.put("downloaded_impression_urls", a(paramzzaej.R));
      }
      if (paramzzaej.i != null) {
        localJSONObject1.put("manual_impression_urls", a(paramzzaej.i));
      }
      if (paramzzaej.q != null) {
        localJSONObject1.put("active_view", paramzzaej.q);
      }
      localJSONObject1.put("ad_is_javascript", paramzzaej.o);
      if (paramzzaej.p != null) {
        localJSONObject1.put("ad_passback_url", paramzzaej.p);
      }
      localJSONObject1.put("mediation", paramzzaej.g);
      localJSONObject1.put("custom_render_allowed", paramzzaej.r);
      localJSONObject1.put("content_url_opted_out", paramzzaej.u);
      localJSONObject1.put("content_vertical_opted_out", paramzzaej.M);
      localJSONObject1.put("prefetch", paramzzaej.v);
      if (paramzzaej.j != -1L) {
        localJSONObject1.put("refresh_interval_milliseconds", paramzzaej.j);
      }
      if (paramzzaej.h != -1L) {
        localJSONObject1.put("mediation_config_cache_time_milliseconds", paramzzaej.h);
      }
      if (!TextUtils.isEmpty(paramzzaej.x)) {
        localJSONObject1.put("gws_query_id", paramzzaej.x);
      }
      if (!paramzzaej.y) {
        break label644;
      }
    }
    label644:
    for (String str = "height";; str = "")
    {
      localJSONObject1.put("fluid", str);
      localJSONObject1.put("native_express", paramzzaej.z);
      if (paramzzaej.B != null) {
        localJSONObject1.put("video_start_urls", a(paramzzaej.B));
      }
      if (paramzzaej.C != null) {
        localJSONObject1.put("video_complete_urls", a(paramzzaej.C));
      }
      if (paramzzaej.A != null)
      {
        zzaig localzzaig = paramzzaej.A;
        JSONObject localJSONObject2 = new JSONObject();
        localJSONObject2.put("rb_type", localzzaig.a);
        localJSONObject2.put("rb_amount", localzzaig.b);
        JSONArray localJSONArray = new JSONArray();
        localJSONArray.put(localJSONObject2);
        localJSONObject1.put("rewards", localJSONArray);
      }
      localJSONObject1.put("use_displayed_impression", paramzzaej.D);
      localJSONObject1.put("auto_protection_configuration", paramzzaej.E);
      localJSONObject1.put("render_in_browser", paramzzaej.I);
      localJSONObject1.put("disable_closable_area", paramzzaej.S);
      return localJSONObject1;
      localJSONObject1.put("ad_html", paramzzaej.b);
      break;
      label619:
      if (paramzzaej.k != zzbv.zzem().a()) {
        break label159;
      }
      localJSONObject1.put("orientation", "landscape");
      break label159;
    }
  }
  
  private static void a(HashMap<String, Object> paramHashMap, Location paramLocation)
  {
    HashMap localHashMap = new HashMap();
    Float localFloat = Float.valueOf(1000.0F * paramLocation.getAccuracy());
    Long localLong1 = Long.valueOf(1000L * paramLocation.getTime());
    Long localLong2 = Long.valueOf((10000000.0D * paramLocation.getLatitude()));
    Long localLong3 = Long.valueOf((10000000.0D * paramLocation.getLongitude()));
    localHashMap.put("radius", localFloat);
    localHashMap.put("lat", localLong2);
    localHashMap.put("long", localLong3);
    localHashMap.put("time", localLong1);
    paramHashMap.put("uule", localHashMap);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.et
 * JD-Core Version:    0.7.0.1
 */