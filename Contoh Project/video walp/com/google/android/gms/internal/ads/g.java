package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.R.string;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Map;

@cm
public final class g
  extends n
{
  private final Map<String, String> a;
  private final Context b;
  
  public g(qe paramqe, Map<String, String> paramMap)
  {
    super(paramqe, "storePicture");
    this.a = paramMap;
    this.b = paramqe.d();
  }
  
  public final void a()
  {
    if (this.b == null)
    {
      a("Activity context is not available");
      return;
    }
    zzbv.zzek();
    if (!jn.f(this.b).c())
    {
      a("Feature is not supported by the device.");
      return;
    }
    String str1 = (String)this.a.get("iurl");
    if (TextUtils.isEmpty(str1))
    {
      a("Image url cannot be empty.");
      return;
    }
    if (!URLUtil.isValidUrl(str1))
    {
      String str9 = String.valueOf(str1);
      if (str9.length() != 0) {}
      for (String str10 = "Invalid image url: ".concat(str9);; str10 = new String("Invalid image url: "))
      {
        a(str10);
        return;
      }
    }
    String str2 = Uri.parse(str1).getLastPathSegment();
    zzbv.zzek();
    if (!jn.c(str2))
    {
      String str7 = String.valueOf(str2);
      if (str7.length() != 0) {}
      for (String str8 = "Image type not recognized: ".concat(str7);; str8 = new String("Image type not recognized: "))
      {
        a(str8);
        return;
      }
    }
    Resources localResources = zzbv.zzeo().h();
    zzbv.zzek();
    AlertDialog.Builder localBuilder = jn.e(this.b);
    String str3;
    String str4;
    label240:
    String str5;
    if (localResources != null)
    {
      str3 = localResources.getString(R.string.s1);
      localBuilder.setTitle(str3);
      if (localResources == null) {
        break label328;
      }
      str4 = localResources.getString(R.string.s2);
      localBuilder.setMessage(str4);
      if (localResources == null) {
        break label335;
      }
      str5 = localResources.getString(R.string.s3);
      label263:
      localBuilder.setPositiveButton(str5, new h(this, str1, str2));
      if (localResources == null) {
        break label342;
      }
    }
    label328:
    label335:
    label342:
    for (String str6 = localResources.getString(R.string.s4);; str6 = "Decline")
    {
      localBuilder.setNegativeButton(str6, new i(this));
      localBuilder.create().show();
      return;
      str3 = "Save image";
      break;
      str4 = "Allow Ad to store image in Picture gallery?";
      break label240;
      str5 = "Accept";
      break label263;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.g
 * JD-Core Version:    0.7.0.1
 */