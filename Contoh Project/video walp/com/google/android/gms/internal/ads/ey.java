package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@cm
public final class ey
{
  private boolean A = false;
  private zzael B;
  private boolean C = false;
  private String D;
  private List<String> E;
  private boolean F;
  private String G;
  private zzaiq H;
  private boolean I;
  private boolean J;
  private boolean K;
  private boolean L;
  private String M;
  private final zzaef N;
  private String a;
  private String b;
  private String c;
  private List<String> d;
  private String e;
  private String f;
  private String g;
  private List<String> h;
  private List<String> i;
  private long j = -1L;
  private boolean k = false;
  private final long l = -1L;
  private List<String> m;
  private long n = -1L;
  private int o = -1;
  private boolean p = false;
  private boolean q = false;
  private boolean r = false;
  private boolean s = true;
  private boolean t = true;
  private String u = "";
  private boolean v = false;
  private boolean w = false;
  private zzaig x;
  private List<String> y;
  private List<String> z;
  
  public ey(zzaef paramzzaef, String paramString)
  {
    this.b = paramString;
    this.N = paramzzaef;
  }
  
  private static String a(Map<String, List<String>> paramMap, String paramString)
  {
    List localList = (List)paramMap.get(paramString);
    if ((localList != null) && (!localList.isEmpty())) {
      return (String)localList.get(0);
    }
    return null;
  }
  
  private static long b(Map<String, List<String>> paramMap, String paramString)
  {
    List localList = (List)paramMap.get(paramString);
    if ((localList != null) && (!localList.isEmpty()))
    {
      String str = (String)localList.get(0);
      try
      {
        float f1 = Float.parseFloat(str);
        return (f1 * 1000.0F);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        je.e(36 + String.valueOf(paramString).length() + String.valueOf(str).length() + "Could not parse float from " + paramString + " header: " + str);
      }
    }
    return -1L;
  }
  
  private static List<String> c(Map<String, List<String>> paramMap, String paramString)
  {
    List localList = (List)paramMap.get(paramString);
    if ((localList != null) && (!localList.isEmpty()))
    {
      String str = (String)localList.get(0);
      if (str != null) {
        return Arrays.asList(str.trim().split("\\s+"));
      }
    }
    return null;
  }
  
  private static boolean d(Map<String, List<String>> paramMap, String paramString)
  {
    List localList = (List)paramMap.get(paramString);
    if ((localList == null) || (localList.isEmpty())) {
      return false;
    }
    return Boolean.valueOf((String)localList.get(0)).booleanValue();
  }
  
  public final zzaej a(long paramLong, boolean paramBoolean)
  {
    zzaef localzzaef = this.N;
    String str1 = this.b;
    String str2 = this.c;
    List localList1 = this.d;
    List localList2 = this.h;
    long l1 = this.j;
    boolean bool1 = this.k;
    List localList3 = this.m;
    long l2 = this.n;
    int i1 = this.o;
    String str3 = this.a;
    String str4 = this.f;
    String str5 = this.g;
    boolean bool2 = this.p;
    boolean bool3 = this.q;
    boolean bool4 = this.r;
    boolean bool5 = this.s;
    String str6 = this.u;
    boolean bool6 = this.v;
    boolean bool7 = this.w;
    zzaig localzzaig = this.x;
    List localList4 = this.y;
    List localList5 = this.z;
    boolean bool8 = this.A;
    zzael localzzael = this.B;
    boolean bool9 = this.C;
    String str7 = this.D;
    List localList6 = this.E;
    boolean bool10 = this.F;
    String str8 = this.G;
    zzaiq localzzaiq = this.H;
    String str9 = this.e;
    boolean bool11 = this.t;
    boolean bool12 = this.I;
    boolean bool13 = this.J;
    if (paramBoolean) {}
    for (int i2 = 2;; i2 = 1) {
      return new zzaej(localzzaef, str1, str2, localList1, localList2, l1, bool1, -1L, localList3, l2, i1, str3, paramLong, str4, str5, bool2, bool3, bool4, bool5, false, str6, bool6, bool7, localzzaig, localList4, localList5, bool8, localzzael, bool9, str7, localList6, bool10, str8, localzzaiq, str9, bool11, bool12, bool13, i2, this.K, this.i, this.L, this.M);
    }
  }
  
  public final void a(String paramString1, Map<String, List<String>> paramMap, String paramString2)
  {
    this.c = paramString2;
    a(paramMap);
  }
  
  public final void a(Map<String, List<String>> paramMap)
  {
    this.a = a(paramMap, "X-Afma-Ad-Size");
    this.G = a(paramMap, "X-Afma-Ad-Slot-Size");
    List localList1 = c(paramMap, "X-Afma-Click-Tracking-Urls");
    if (localList1 != null) {
      this.d = localList1;
    }
    this.e = a(paramMap, "X-Afma-Debug-Signals");
    List localList2 = (List)paramMap.get("X-Afma-Debug-Dialog");
    if ((localList2 != null) && (!localList2.isEmpty())) {
      this.f = ((String)localList2.get(0));
    }
    List localList3 = c(paramMap, "X-Afma-Tracking-Urls");
    if (localList3 != null) {
      this.h = localList3;
    }
    List localList4 = c(paramMap, "X-Afma-Downloaded-Impression-Urls");
    if (localList4 != null) {
      this.i = localList4;
    }
    long l1 = b(paramMap, "X-Afma-Interstitial-Timeout");
    if (l1 != -1L) {
      this.j = l1;
    }
    this.k |= d(paramMap, "X-Afma-Mediation");
    List localList5 = c(paramMap, "X-Afma-Manual-Tracking-Urls");
    if (localList5 != null) {
      this.m = localList5;
    }
    long l2 = b(paramMap, "X-Afma-Refresh-Rate");
    if (l2 != -1L) {
      this.n = l2;
    }
    List localList6 = (List)paramMap.get("X-Afma-Orientation");
    String str6;
    if ((localList6 != null) && (!localList6.isEmpty()))
    {
      str6 = (String)localList6.get(0);
      if (!"portrait".equalsIgnoreCase(str6)) {
        break label954;
      }
      this.o = zzbv.zzem().b();
    }
    for (;;)
    {
      this.g = a(paramMap, "X-Afma-ActiveView");
      List localList7 = (List)paramMap.get("X-Afma-Use-HTTPS");
      if ((localList7 != null) && (!localList7.isEmpty())) {
        this.r = Boolean.valueOf((String)localList7.get(0)).booleanValue();
      }
      this.p |= d(paramMap, "X-Afma-Custom-Rendering-Allowed");
      this.q = "native".equals(a(paramMap, "X-Afma-Ad-Format"));
      List localList8 = (List)paramMap.get("X-Afma-Content-Url-Opted-Out");
      if ((localList8 != null) && (!localList8.isEmpty())) {
        this.s = Boolean.valueOf((String)localList8.get(0)).booleanValue();
      }
      List localList9 = (List)paramMap.get("X-Afma-Content-Vertical-Opted-Out");
      if ((localList9 != null) && (!localList9.isEmpty())) {
        this.t = Boolean.valueOf((String)localList9.get(0)).booleanValue();
      }
      List localList10 = (List)paramMap.get("X-Afma-Gws-Query-Id");
      if ((localList10 != null) && (!localList10.isEmpty())) {
        this.u = ((String)localList10.get(0));
      }
      String str1 = a(paramMap, "X-Afma-Fluid");
      if ((str1 != null) && (str1.equals("height"))) {
        this.v = true;
      }
      this.w = "native_express".equals(a(paramMap, "X-Afma-Ad-Format"));
      this.x = zzaig.a(a(paramMap, "X-Afma-Rewards"));
      if (this.y == null) {
        this.y = c(paramMap, "X-Afma-Reward-Video-Start-Urls");
      }
      if (this.z == null) {
        this.z = c(paramMap, "X-Afma-Reward-Video-Complete-Urls");
      }
      this.A |= d(paramMap, "X-Afma-Use-Displayed-Impression");
      this.C |= d(paramMap, "X-Afma-Auto-Collect-Location");
      this.D = a(paramMap, "Set-Cookie");
      String str2 = a(paramMap, "X-Afma-Auto-Protection-Configuration");
      label804:
      String str4;
      if ((str2 == null) || (TextUtils.isEmpty(str2)))
      {
        Uri.Builder localBuilder = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204").buildUpon();
        localBuilder.appendQueryParameter("id", "gmob-apps-blocked-navigation");
        if (!TextUtils.isEmpty(this.f)) {
          localBuilder.appendQueryParameter("debugDialog", this.f);
        }
        arq localarq = asa.g;
        boolean bool = ((Boolean)aos.f().a(localarq)).booleanValue();
        String[] arrayOfString = new String[1];
        String str3 = localBuilder.toString();
        arrayOfString[0] = (31 + String.valueOf(str3).length() + str3 + "&navigationURL={NAVIGATION_URL}");
        this.B = new zzael(bool, Arrays.asList(arrayOfString));
        List localList11 = c(paramMap, "X-Afma-Remote-Ping-Urls");
        if (localList11 != null) {
          this.E = localList11;
        }
        str4 = a(paramMap, "X-Afma-Safe-Browsing");
        if (TextUtils.isEmpty(str4)) {}
      }
      try
      {
        this.H = zzaiq.a(new JSONObject(str4));
        this.F |= d(paramMap, "X-Afma-Render-In-Browser");
        str5 = a(paramMap, "X-Afma-Pool");
        if (TextUtils.isEmpty(str5)) {}
      }
      catch (JSONException localJSONException2)
      {
        try
        {
          for (;;)
          {
            String str5;
            this.I = new JSONObject(str5).getBoolean("never_pool");
            this.J = d(paramMap, "X-Afma-Custom-Close-Blocked");
            this.K = d(paramMap, "X-Afma-Enable-Omid");
            this.L = d(paramMap, "X-Afma-Disable-Closable-Area");
            this.M = a(paramMap, "X-Afma-Omid-Settings");
            return;
            label954:
            if (!"landscape".equalsIgnoreCase(str6)) {
              break;
            }
            this.o = zzbv.zzem().a();
            break;
            try
            {
              this.B = zzael.a(new JSONObject(str2));
            }
            catch (JSONException localJSONException3)
            {
              je.c("Error parsing configuration JSON", localJSONException3);
              this.B = new zzael();
            }
          }
          break label804;
          localJSONException2 = localJSONException2;
          je.c("Error parsing safe browsing header", localJSONException2);
        }
        catch (JSONException localJSONException1)
        {
          for (;;)
          {
            je.c("Error parsing interstitial pool header", localJSONException1);
          }
        }
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ey
 * JD-Core Version:    0.7.0.1
 */