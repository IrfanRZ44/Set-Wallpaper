package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.b;
import android.support.customtabs.d;
import android.support.customtabs.e;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public final class asy
  implements afs
{
  private e a;
  private b b;
  private d c;
  private asz d;
  
  public static boolean a(Context paramContext)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    if (localPackageManager == null) {}
    for (;;)
    {
      return false;
      Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
      ResolveInfo localResolveInfo1 = localPackageManager.resolveActivity(localIntent, 0);
      List localList = localPackageManager.queryIntentActivities(localIntent, 65536);
      if ((localList != null) && (localResolveInfo1 != null)) {
        for (int i = 0; i < localList.size(); i++)
        {
          ResolveInfo localResolveInfo2 = (ResolveInfo)localList.get(i);
          if (localResolveInfo1.activityInfo.name.equals(localResolveInfo2.activityInfo.name)) {
            return localResolveInfo1.activityInfo.packageName.equals(afq.a(paramContext));
          }
        }
      }
    }
  }
  
  public final void a()
  {
    this.b = null;
    this.a = null;
    if (this.d != null) {
      this.d.b();
    }
  }
  
  public final void a(Activity paramActivity)
  {
    if (this.c == null) {
      return;
    }
    paramActivity.unbindService(this.c);
    this.b = null;
    this.a = null;
    this.c = null;
  }
  
  public final void a(b paramb)
  {
    this.b = paramb;
    this.b.a(0L);
    if (this.d != null) {
      this.d.a();
    }
  }
  
  public final void a(asz paramasz)
  {
    this.d = paramasz;
  }
  
  public final boolean a(Uri paramUri, Bundle paramBundle, List<Bundle> paramList)
  {
    if (this.b == null) {
      return false;
    }
    if (this.b == null) {
      this.a = null;
    }
    for (;;)
    {
      e locale = this.a;
      if (locale == null) {
        break;
      }
      return locale.a(paramUri, null, null);
      if (this.a == null) {
        this.a = this.b.a(null);
      }
    }
  }
  
  public final void b(Activity paramActivity)
  {
    if (this.b != null) {}
    String str;
    do
    {
      return;
      str = afq.a(paramActivity);
    } while (str == null);
    this.c = new afr(this);
    b.a(paramActivity, str, this.c);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.asy
 * JD-Core Version:    0.7.0.1
 */