package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

@cm
public final class aoe
{
  public static final aoe a = new aoe();
  
  public static zzjj a(Context paramContext, aqn paramaqn)
  {
    Date localDate = paramaqn.a();
    long l;
    String str1;
    int i;
    List localList;
    label56:
    boolean bool1;
    int j;
    Location localLocation;
    Bundle localBundle;
    boolean bool2;
    String str2;
    SearchAdRequest localSearchAdRequest;
    if (localDate != null)
    {
      l = localDate.getTime();
      str1 = paramaqn.b();
      i = paramaqn.c();
      Set localSet = paramaqn.d();
      if (localSet.isEmpty()) {
        break label229;
      }
      localList = Collections.unmodifiableList(new ArrayList(localSet));
      bool1 = paramaqn.a(paramContext);
      j = paramaqn.l();
      localLocation = paramaqn.e();
      localBundle = paramaqn.b(AdMobAdapter.class);
      bool2 = paramaqn.f();
      str2 = paramaqn.g();
      localSearchAdRequest = paramaqn.i();
      if (localSearchAdRequest == null) {
        break label235;
      }
    }
    label229:
    label235:
    for (zzmq localzzmq = new zzmq(localSearchAdRequest);; localzzmq = null)
    {
      Context localContext = paramContext.getApplicationContext();
      String str3 = null;
      if (localContext != null)
      {
        String str4 = localContext.getPackageName();
        aos.a();
        str3 = lz.a(Thread.currentThread().getStackTrace(), str4);
      }
      boolean bool3 = paramaqn.o();
      return new zzjj(7, l, localBundle, i, localList, bool1, j, bool2, str2, localzzmq, localLocation, str1, paramaqn.k(), paramaqn.m(), Collections.unmodifiableList(new ArrayList(paramaqn.n())), paramaqn.h(), str3, bool3);
      l = -1L;
      break;
      localList = null;
      break label56;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aoe
 * JD-Core Version:    0.7.0.1
 */