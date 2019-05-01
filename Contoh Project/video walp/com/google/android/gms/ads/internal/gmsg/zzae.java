package com.google.android.gms.ads.internal.gmsg;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.internal.ads.agw;
import com.google.android.gms.internal.ads.aos;
import com.google.android.gms.internal.ads.arq;
import com.google.android.gms.internal.ads.ary;
import com.google.android.gms.internal.ads.asa;
import com.google.android.gms.internal.ads.io;
import com.google.android.gms.internal.ads.jn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class zzae
{
  private final Context a;
  private final agw b;
  private final View c;
  
  public zzae(Context paramContext, agw paramagw, View paramView)
  {
    this.a = paramContext;
    this.b = paramagw;
    this.c = paramView;
  }
  
  private static Intent a(Intent paramIntent, ResolveInfo paramResolveInfo)
  {
    Intent localIntent = new Intent(paramIntent);
    localIntent.setClassName(paramResolveInfo.activityInfo.packageName, paramResolveInfo.activityInfo.name);
    return localIntent;
  }
  
  private static Intent a(Uri paramUri)
  {
    if (paramUri == null) {
      return null;
    }
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.addFlags(268435456);
    localIntent.setData(paramUri);
    localIntent.setAction("android.intent.action.VIEW");
    return localIntent;
  }
  
  private final ResolveInfo a(Intent paramIntent)
  {
    return a(paramIntent, new ArrayList());
  }
  
  private final ResolveInfo a(Intent paramIntent, ArrayList<ResolveInfo> paramArrayList)
  {
    for (;;)
    {
      try
      {
        PackageManager localPackageManager = this.a.getPackageManager();
        if (localPackageManager == null) {
          return null;
        }
        localList = localPackageManager.queryIntentActivities(paramIntent, 65536);
        ResolveInfo localResolveInfo2 = localPackageManager.resolveActivity(paramIntent, 65536);
        if ((localList == null) || (localResolveInfo2 == null)) {
          continue;
        }
        i = 0;
        if (i >= localList.size()) {
          continue;
        }
        ResolveInfo localResolveInfo3 = (ResolveInfo)localList.get(i);
        if (localResolveInfo2 == null) {
          continue;
        }
        boolean bool = localResolveInfo2.activityInfo.name.equals(localResolveInfo3.activityInfo.name);
        if (!bool) {
          continue;
        }
        localResolveInfo1 = localResolveInfo2;
      }
      catch (Throwable localThrowable1)
      {
        List localList;
        int i;
        Object localObject = localThrowable1;
        ResolveInfo localResolveInfo1 = null;
        continue;
        localResolveInfo1 = null;
        continue;
      }
      try
      {
        paramArrayList.addAll(localList);
        return localResolveInfo1;
      }
      catch (Throwable localThrowable2) {}
      zzbv.zzeo().a(localThrowable2, "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent");
      return localResolveInfo1;
      i++;
    }
  }
  
  public final Intent zzi(Map<String, String> paramMap)
  {
    ActivityManager localActivityManager = (ActivityManager)this.a.getSystemService("activity");
    String str = (String)paramMap.get("u");
    boolean bool1 = TextUtils.isEmpty(str);
    Intent localIntent1 = null;
    if (bool1) {}
    boolean bool2;
    boolean bool3;
    ArrayList localArrayList1;
    Intent localIntent2;
    label249:
    do
    {
      return localIntent1;
      Uri localUri1 = Uri.parse(zzad.a(this.a, this.b, str, this.c, null));
      bool2 = Boolean.parseBoolean((String)paramMap.get("use_first_package"));
      bool3 = Boolean.parseBoolean((String)paramMap.get("use_running_process"));
      int i;
      Uri localUri2;
      if (!Boolean.parseBoolean((String)paramMap.get("use_custom_tabs")))
      {
        arq localarq = asa.cM;
        if (!((Boolean)aos.f().a(localarq)).booleanValue()) {}
      }
      else
      {
        i = 1;
        if (!"http".equalsIgnoreCase(localUri1.getScheme())) {
          break label249;
        }
        localUri2 = localUri1.buildUpon().scheme("https").build();
      }
      Intent localIntent3;
      for (;;)
      {
        localArrayList1 = new ArrayList();
        localIntent2 = a(localUri1);
        localIntent3 = a(localUri2);
        if (i != 0)
        {
          zzbv.zzek();
          jn.b(this.a, localIntent2);
          zzbv.zzek();
          jn.b(this.a, localIntent3);
        }
        ResolveInfo localResolveInfo1 = a(localIntent2, localArrayList1);
        if (localResolveInfo1 == null) {
          break label287;
        }
        return a(localIntent2, localResolveInfo1);
        i = 0;
        break;
        boolean bool4 = "https".equalsIgnoreCase(localUri1.getScheme());
        localUri2 = null;
        if (bool4) {
          localUri2 = localUri1.buildUpon().scheme("http").build();
        }
      }
      if (localIntent3 == null) {
        break;
      }
      ResolveInfo localResolveInfo3 = a(localIntent3);
      if (localResolveInfo3 == null) {
        break;
      }
      localIntent1 = a(localIntent2, localResolveInfo3);
    } while (a(localIntent1) != null);
    label287:
    if (localArrayList1.size() == 0) {
      return localIntent2;
    }
    if ((bool3) && (localActivityManager != null))
    {
      List localList = localActivityManager.getRunningAppProcesses();
      if (localList != null)
      {
        ArrayList localArrayList2 = (ArrayList)localArrayList1;
        int j = localArrayList2.size();
        int m;
        for (int k = 0; k < j; k = m)
        {
          Object localObject = localArrayList2.get(k);
          m = k + 1;
          ResolveInfo localResolveInfo2 = (ResolveInfo)localObject;
          Iterator localIterator = localList.iterator();
          while (localIterator.hasNext()) {
            if (((ActivityManager.RunningAppProcessInfo)localIterator.next()).processName.equals(localResolveInfo2.activityInfo.packageName)) {
              return a(localIntent2, localResolveInfo2);
            }
          }
        }
      }
    }
    if (bool2) {
      return a(localIntent2, (ResolveInfo)localArrayList1.get(0));
    }
    return localIntent2;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.zzae
 * JD-Core Version:    0.7.0.1
 */