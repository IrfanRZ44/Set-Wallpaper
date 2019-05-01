package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.android.gms.common.a.b;
import com.google.android.gms.common.a.c;
import com.google.android.gms.common.internal.n;
import java.util.List;

@cm
public final class arl
{
  private final Context a;
  
  public arl(Context paramContext)
  {
    n.a(paramContext, "Context can not be null");
    this.a = paramContext;
  }
  
  private final boolean a(Intent paramIntent)
  {
    n.a(paramIntent, "Intent can not be null");
    boolean bool1 = this.a.getPackageManager().queryIntentActivities(paramIntent, 0).isEmpty();
    boolean bool2 = false;
    if (!bool1) {
      bool2 = true;
    }
    return bool2;
  }
  
  public final boolean a()
  {
    Intent localIntent = new Intent("android.intent.action.DIAL");
    localIntent.setData(Uri.parse("tel:"));
    return a(localIntent);
  }
  
  public final boolean b()
  {
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setData(Uri.parse("sms:"));
    return a(localIntent);
  }
  
  public final boolean c()
  {
    return (((Boolean)lq.a(this.a, new arm())).booleanValue()) && (c.b(this.a).a("android.permission.WRITE_EXTERNAL_STORAGE") == 0);
  }
  
  @TargetApi(14)
  public final boolean d()
  {
    return a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.arl
 * JD-Core Version:    0.7.0.1
 */