package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;

@cm
public final class id
{
  public static Uri a(Uri paramUri, Context paramContext)
  {
    if ((zzbv.zzfh().f(paramContext)) && (TextUtils.isEmpty(paramUri.getQueryParameter("fbs_aeid"))))
    {
      String str = zzbv.zzfh().j(paramContext);
      paramUri = a(paramUri.toString(), "fbs_aeid", str);
      zzbv.zzfh().d(paramContext, str);
    }
    return paramUri;
  }
  
  private static Uri a(String paramString1, String paramString2, String paramString3)
  {
    int i = paramString1.indexOf("&adurl");
    if (i == -1) {
      i = paramString1.indexOf("?adurl");
    }
    if (i != -1) {
      return Uri.parse(paramString1.substring(0, i + 1) + paramString2 + "=" + paramString3 + "&" + paramString1.substring(i + 1));
    }
    return Uri.parse(paramString1).buildUpon().appendQueryParameter(paramString2, paramString3).build();
  }
  
  public static String a(String paramString, Context paramContext)
  {
    if ((!zzbv.zzfh().a(paramContext)) || (TextUtils.isEmpty(paramString))) {}
    String str1;
    do
    {
      do
      {
        String str2;
        do
        {
          do
          {
            do
            {
              return paramString;
              str1 = zzbv.zzfh().j(paramContext);
            } while (str1 == null);
            arq localarq1 = asa.at;
            if (!((Boolean)aos.f().a(localarq1)).booleanValue()) {
              break;
            }
            arq localarq2 = asa.au;
            str2 = (String)aos.f().a(localarq2);
          } while (!paramString.contains(str2));
          if (zzbv.zzek().d(paramString))
          {
            zzbv.zzfh().d(paramContext, str1);
            return paramString.replace(str2, str1);
          }
        } while (!zzbv.zzek().e(paramString));
        zzbv.zzfh().e(paramContext, str1);
        return paramString.replace(str2, str1);
      } while (paramString.contains("fbs_aeid"));
      if (zzbv.zzek().d(paramString))
      {
        zzbv.zzfh().d(paramContext, str1);
        return a(paramString, "fbs_aeid", str1).toString();
      }
    } while (!zzbv.zzek().e(paramString));
    zzbv.zzfh().e(paramContext, str1);
    return a(paramString, "fbs_aeid", str1).toString();
  }
  
  public static String b(String paramString, Context paramContext)
  {
    if ((!zzbv.zzfh().a(paramContext)) || (TextUtils.isEmpty(paramString))) {}
    String str1;
    do
    {
      String str2;
      do
      {
        do
        {
          return paramString;
          str1 = zzbv.zzfh().j(paramContext);
        } while ((str1 == null) || (!zzbv.zzek().e(paramString)));
        arq localarq1 = asa.at;
        if (!((Boolean)aos.f().a(localarq1)).booleanValue()) {
          break;
        }
        arq localarq2 = asa.au;
        str2 = (String)aos.f().a(localarq2);
      } while (!paramString.contains(str2));
      return paramString.replace(str2, str1);
    } while (paramString.contains("fbs_aeid"));
    return a(paramString, "fbs_aeid", str1).toString();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.id
 * JD-Core Version:    0.7.0.1
 */