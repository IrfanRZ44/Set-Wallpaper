package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.view.MotionEvent;
import android.view.View;

public final class agw
{
  private static final String[] e = { "/aclk", "/pcs/click" };
  private String a = "googleads.g.doubleclick.net";
  private String b = "/pagead/ads";
  private String c = "ad.doubleclick.net";
  private String[] d = { ".doubleclick.net", ".googleadservices.com", ".googlesyndication.com" };
  private ags f;
  
  public agw(ags paramags)
  {
    this.f = paramags;
  }
  
  private final Uri a(Uri paramUri, Context paramContext, String paramString, boolean paramBoolean, View paramView, Activity paramActivity)
  {
    boolean bool;
    try
    {
      bool = c(paramUri);
      if (bool)
      {
        if (!paramUri.toString().contains("dc_ms=")) {
          break label65;
        }
        throw new agx("Parameter already exists: dc_ms");
      }
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      throw new agx("Provided Uri is not in a valid state");
    }
    if (paramUri.getQueryParameter("ms") != null) {
      throw new agx("Query parameter already exists: ms");
    }
    label65:
    String str1;
    if (paramBoolean) {
      str1 = this.f.zza(paramContext, paramString, paramView, paramActivity);
    }
    while (bool)
    {
      String str2 = paramUri.toString();
      int i = str2.indexOf(";adurl");
      if (i != -1)
      {
        return Uri.parse(str2.substring(0, i + 1) + "dc_ms" + "=" + str1 + ";" + str2.substring(i + 1));
        str1 = this.f.zza(paramContext);
      }
      else
      {
        String str3 = paramUri.getEncodedPath();
        int j = str2.indexOf(str3);
        return Uri.parse(str2.substring(0, j + str3.length()) + ";" + "dc_ms" + "=" + str1 + ";" + str2.substring(j + str3.length()));
      }
    }
    String str4 = paramUri.toString();
    int k = str4.indexOf("&adurl");
    if (k == -1) {
      k = str4.indexOf("?adurl");
    }
    if (k != -1) {
      return Uri.parse(str4.substring(0, k + 1) + "ms" + "=" + str1 + "&" + str4.substring(k + 1));
    }
    Uri localUri = paramUri.buildUpon().appendQueryParameter("ms", str1).build();
    return localUri;
  }
  
  private final boolean c(Uri paramUri)
  {
    if (paramUri == null) {
      throw new NullPointerException();
    }
    try
    {
      boolean bool = paramUri.getHost().equals(this.c);
      return bool;
    }
    catch (NullPointerException localNullPointerException) {}
    return false;
  }
  
  public final Uri a(Uri paramUri, Context paramContext)
  {
    return a(paramUri, paramContext, null, false, null, null);
  }
  
  public final Uri a(Uri paramUri, Context paramContext, View paramView, Activity paramActivity)
  {
    try
    {
      Uri localUri = a(paramUri, paramContext, paramUri.getQueryParameter("ai"), true, paramView, paramActivity);
      return localUri;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      throw new agx("Provided Uri is not in a valid state");
    }
  }
  
  public final ags a()
  {
    return this.f;
  }
  
  public final void a(MotionEvent paramMotionEvent)
  {
    this.f.zza(paramMotionEvent);
  }
  
  public final boolean a(Uri paramUri)
  {
    if (paramUri == null) {
      throw new NullPointerException();
    }
    try
    {
      String str = paramUri.getHost();
      String[] arrayOfString = this.d;
      int i = arrayOfString.length;
      for (int j = 0;; j++)
      {
        boolean bool1 = false;
        if (j < i)
        {
          boolean bool2 = str.endsWith(arrayOfString[j]);
          if (bool2) {
            bool1 = true;
          }
        }
        else
        {
          return bool1;
        }
      }
      return false;
    }
    catch (NullPointerException localNullPointerException) {}
  }
  
  public final boolean b(Uri paramUri)
  {
    boolean bool1 = a(paramUri);
    boolean bool2 = false;
    String[] arrayOfString;
    int i;
    if (bool1)
    {
      arrayOfString = e;
      i = arrayOfString.length;
    }
    for (int j = 0;; j++)
    {
      bool2 = false;
      if (j < i)
      {
        String str = arrayOfString[j];
        if (paramUri.getPath().endsWith(str)) {
          bool2 = true;
        }
      }
      else
      {
        return bool2;
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.agw
 * JD-Core Version:    0.7.0.1
 */