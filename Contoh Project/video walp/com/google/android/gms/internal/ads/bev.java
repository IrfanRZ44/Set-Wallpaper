package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract.Events;
import android.text.TextUtils;
import com.google.android.gms.ads.impl.R.string;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Map;

@cm
public final class bev
  extends n
{
  private final Map<String, String> a;
  private final Context b;
  private String c;
  private long d;
  private long e;
  private String f;
  private String g;
  
  public bev(qe paramqe, Map<String, String> paramMap)
  {
    super(paramqe, "createCalendarEvent");
    this.a = paramMap;
    this.b = paramqe.d();
    this.c = d("description");
    this.f = d("summary");
    this.d = e("start_ticks");
    this.e = e("end_ticks");
    this.g = d("location");
  }
  
  private final String d(String paramString)
  {
    if (TextUtils.isEmpty((CharSequence)this.a.get(paramString))) {
      return "";
    }
    return (String)this.a.get(paramString);
  }
  
  private final long e(String paramString)
  {
    String str = (String)this.a.get(paramString);
    if (str == null) {
      return -1L;
    }
    try
    {
      long l = Long.parseLong(str);
      return l;
    }
    catch (NumberFormatException localNumberFormatException) {}
    return -1L;
  }
  
  public final void a()
  {
    if (this.b == null)
    {
      a("Activity context is not available.");
      return;
    }
    zzbv.zzek();
    if (!jn.f(this.b).d())
    {
      a("This feature is not available on the device.");
      return;
    }
    zzbv.zzek();
    AlertDialog.Builder localBuilder = jn.e(this.b);
    Resources localResources = zzbv.zzeo().h();
    String str1;
    String str2;
    label95:
    String str3;
    if (localResources != null)
    {
      str1 = localResources.getString(R.string.s5);
      localBuilder.setTitle(str1);
      if (localResources == null) {
        break label177;
      }
      str2 = localResources.getString(R.string.s6);
      localBuilder.setMessage(str2);
      if (localResources == null) {
        break label184;
      }
      str3 = localResources.getString(R.string.s3);
      label117:
      localBuilder.setPositiveButton(str3, new bew(this));
      if (localResources == null) {
        break label191;
      }
    }
    label177:
    label184:
    label191:
    for (String str4 = localResources.getString(R.string.s4);; str4 = "Decline")
    {
      localBuilder.setNegativeButton(str4, new c(this));
      localBuilder.create().show();
      return;
      str1 = "Create calendar event";
      break;
      str2 = "Allow Ad to create a calendar event?";
      break label95;
      str3 = "Accept";
      break label117;
    }
  }
  
  @TargetApi(14)
  final Intent b()
  {
    Intent localIntent = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
    localIntent.putExtra("title", this.c);
    localIntent.putExtra("eventLocation", this.g);
    localIntent.putExtra("description", this.f);
    if (this.d > -1L) {
      localIntent.putExtra("beginTime", this.d);
    }
    if (this.e > -1L) {
      localIntent.putExtra("endTime", this.e);
    }
    localIntent.setFlags(268435456);
    return localIntent;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bev
 * JD-Core Version:    0.7.0.1
 */