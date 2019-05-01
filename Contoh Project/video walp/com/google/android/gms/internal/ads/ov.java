package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.common.util.k;

@cm
public final class ov
  extends oo
{
  public final on a(Context paramContext, pd parampd, int paramInt, boolean paramBoolean, asn paramasn, pc parampc)
  {
    ApplicationInfo localApplicationInfo = paramContext.getApplicationInfo();
    if ((k.b()) && ((localApplicationInfo == null) || (localApplicationInfo.targetSdkVersion >= 11))) {}
    for (int i = 1; i == 0; i = 0) {
      return null;
    }
    ob localob = new ob(paramContext, paramBoolean, parampd.r().d(), parampc, new pe(paramContext, parampd.i(), parampd.g(), paramasn, parampd.c()));
    return localob;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ov
 * JD-Core Version:    0.7.0.1
 */