package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@cm
public final class zzhl
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzhl> CREATOR = new amd();
  public final String a;
  private final long b;
  private final String c;
  private final String d;
  private final String e;
  private final Bundle f;
  private final boolean g;
  private long h;
  
  zzhl(String paramString1, long paramLong1, String paramString2, String paramString3, String paramString4, Bundle paramBundle, boolean paramBoolean, long paramLong2)
  {
    this.a = paramString1;
    this.b = paramLong1;
    if (paramString2 != null)
    {
      this.c = paramString2;
      if (paramString3 == null) {
        break label78;
      }
      label30:
      this.d = paramString3;
      if (paramString4 == null) {
        break label85;
      }
      label41:
      this.e = paramString4;
      if (paramBundle == null) {
        break label92;
      }
    }
    for (;;)
    {
      this.f = paramBundle;
      this.g = paramBoolean;
      this.h = paramLong2;
      return;
      paramString2 = "";
      break;
      label78:
      paramString3 = "";
      break label30;
      label85:
      paramString4 = "";
      break label41;
      label92:
      paramBundle = new Bundle();
    }
  }
  
  public static zzhl a(Uri paramUri)
  {
    l = 0L;
    try
    {
      if (!"gcache".equals(paramUri.getScheme())) {
        return null;
      }
      List localList = paramUri.getPathSegments();
      if (localList.size() != 2)
      {
        int i = localList.size();
        je.e(62 + "Expected 2 path parts for namespace and id, found :" + i);
        return null;
      }
      str1 = (String)localList.get(0);
      str2 = (String)localList.get(1);
      str3 = paramUri.getHost();
      str4 = paramUri.getQueryParameter("url");
      bool = "1".equals(paramUri.getQueryParameter("read_only"));
      str5 = paramUri.getQueryParameter("expiration");
      if (str5 != null) {
        break label219;
      }
    }
    catch (NullPointerException localNullPointerException)
    {
      String str1;
      String str2;
      String str3;
      String str4;
      boolean bool;
      Bundle localBundle;
      for (;;)
      {
        String str5;
        Iterator localIterator;
        je.c("Unable to parse Uri into cache offering.", localNullPointerException);
        return null;
        l = Long.parseLong(str5);
      }
      zzhl localzzhl = new zzhl(str4, l, str3, str1, str2, localBundle, bool, 0L);
      return localzzhl;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      break label211;
    }
    localBundle = new Bundle();
    localIterator = zzbv.zzem().a(paramUri).iterator();
    while (localIterator.hasNext())
    {
      String str6 = (String)localIterator.next();
      if (str6.startsWith("tag.")) {
        localBundle.putString(str6.substring(4), paramUri.getQueryParameter(str6));
      }
    }
  }
  
  public static zzhl a(String paramString)
  {
    return a(Uri.parse(paramString));
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 2, this.a, false);
    b.a(paramParcel, 3, this.b);
    b.a(paramParcel, 4, this.c, false);
    b.a(paramParcel, 5, this.d, false);
    b.a(paramParcel, 6, this.e, false);
    b.a(paramParcel, 7, this.f, false);
    b.a(paramParcel, 8, this.g);
    b.a(paramParcel, 9, this.h);
    b.a(paramParcel, i);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.zzhl
 * JD-Core Version:    0.7.0.1
 */