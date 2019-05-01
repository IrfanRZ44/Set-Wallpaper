package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

@cm
public final class zzaiq
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzaiq> CREATOR = new hs();
  public final String a;
  public final String b;
  public final boolean c;
  public final boolean d;
  public final List<String> e;
  public final boolean f;
  public final boolean g;
  public final List<String> h;
  
  public zzaiq(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2, List<String> paramList1, boolean paramBoolean3, boolean paramBoolean4, List<String> paramList2)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramBoolean1;
    this.d = paramBoolean2;
    this.e = paramList1;
    this.f = paramBoolean3;
    this.g = paramBoolean4;
    if (paramList2 == null) {
      paramList2 = new ArrayList();
    }
    this.h = paramList2;
  }
  
  public static zzaiq a(JSONObject paramJSONObject)
  {
    if (paramJSONObject == null) {
      return null;
    }
    String str1 = paramJSONObject.optString("click_string", "");
    String str2 = paramJSONObject.optString("report_url", "");
    boolean bool1 = paramJSONObject.optBoolean("rendered_ad_enabled", false);
    boolean bool2 = paramJSONObject.optBoolean("non_malicious_reporting_enabled", false);
    List localList1 = li.a(paramJSONObject.optJSONArray("allowed_headers"), null);
    List localList2 = li.a(paramJSONObject.optJSONArray("webview_permissions"), null);
    return new zzaiq(str1, str2, bool1, bool2, localList1, paramJSONObject.optBoolean("protection_enabled", false), paramJSONObject.optBoolean("malicious_reporting_enabled", false), localList2);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 2, this.a, false);
    b.a(paramParcel, 3, this.b, false);
    b.a(paramParcel, 4, this.c);
    b.a(paramParcel, 5, this.d);
    b.b(paramParcel, 6, this.e, false);
    b.a(paramParcel, 7, this.f);
    b.a(paramParcel, 8, this.g);
    b.b(paramParcel, 9, this.h, false);
    b.a(paramParcel, i);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.zzaiq
 * JD-Core Version:    0.7.0.1
 */