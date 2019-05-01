package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.internal.ads.aos;
import com.google.android.gms.internal.ads.arq;
import com.google.android.gms.internal.ads.ary;
import com.google.android.gms.internal.ads.asa;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.je;
import com.google.android.gms.internal.ads.jn;

@cm
public final class zza
{
  private static boolean a(Context paramContext, Intent paramIntent, zzt paramzzt)
  {
    try
    {
      String str1 = String.valueOf(paramIntent.toURI());
      if (str1.length() != 0) {}
      for (String str2 = "Launching an intent: ".concat(str1);; str2 = new String("Launching an intent: "))
      {
        je.a(str2);
        zzbv.zzek();
        jn.a(paramContext, paramIntent);
        if (paramzzt == null) {
          break;
        }
        paramzzt.zzbl();
        break;
      }
      return true;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      je.e(localActivityNotFoundException.getMessage());
      return false;
    }
  }
  
  public static boolean zza(Context paramContext, zzc paramzzc, zzt paramzzt)
  {
    if (paramzzc == null)
    {
      je.e("No intent data for launcher overlay.");
      return false;
    }
    asa.a(paramContext);
    if (paramzzc.intent != null) {
      return a(paramContext, paramzzc.intent, paramzzt);
    }
    localIntent = new Intent();
    if (TextUtils.isEmpty(paramzzc.url))
    {
      je.e("Open GMSG did not contain a URL.");
      return false;
    }
    String[] arrayOfString;
    String str2;
    if (!TextUtils.isEmpty(paramzzc.mimeType))
    {
      localIntent.setDataAndType(Uri.parse(paramzzc.url), paramzzc.mimeType);
      localIntent.setAction("android.intent.action.VIEW");
      if (!TextUtils.isEmpty(paramzzc.packageName)) {
        localIntent.setPackage(paramzzc.packageName);
      }
      if (TextUtils.isEmpty(paramzzc.zzbxj)) {
        break label213;
      }
      arrayOfString = paramzzc.zzbxj.split("/", 2);
      if (arrayOfString.length >= 2) {
        break label200;
      }
      str2 = String.valueOf(paramzzc.zzbxj);
      if (str2.length() == 0) {
        break label186;
      }
    }
    label186:
    for (String str3 = "Could not parse component name from open GMSG: ".concat(str2);; str3 = new String("Could not parse component name from open GMSG: "))
    {
      je.e(str3);
      return false;
      localIntent.setData(Uri.parse(paramzzc.url));
      break;
    }
    label200:
    localIntent.setClassName(arrayOfString[0], arrayOfString[1]);
    label213:
    String str1 = paramzzc.zzbxk;
    if (!TextUtils.isEmpty(str1)) {}
    try
    {
      int j = Integer.parseInt(str1);
      i = j;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        arq localarq1;
        je.e("Could not parse intent flags.");
        int i = 0;
        continue;
        arq localarq2 = asa.cM;
        if (((Boolean)aos.f().a(localarq2)).booleanValue())
        {
          zzbv.zzek();
          jn.b(paramContext, localIntent);
        }
      }
    }
    localIntent.addFlags(i);
    localarq1 = asa.cN;
    if (((Boolean)aos.f().a(localarq1)).booleanValue())
    {
      localIntent.addFlags(268435456);
      localIntent.putExtra("android.support.customtabs.extra.user_opt_out", true);
      return a(paramContext, localIntent, paramzzt);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.zza
 * JD-Core Version:    0.7.0.1
 */