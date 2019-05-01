package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.k;
import com.google.android.gms.internal.ads.anw;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.jn;
import com.google.android.gms.internal.ads.zzang;

@cm
public final class zzl
{
  public static void zza(Context paramContext, AdOverlayInfoParcel paramAdOverlayInfoParcel, boolean paramBoolean)
  {
    if ((paramAdOverlayInfoParcel.zzbyu == 4) && (paramAdOverlayInfoParcel.zzbyn == null))
    {
      if (paramAdOverlayInfoParcel.zzbym != null) {
        paramAdOverlayInfoParcel.zzbym.onAdClicked();
      }
      zzbv.zzeh();
      zza.zza(paramContext, paramAdOverlayInfoParcel.zzbyl, paramAdOverlayInfoParcel.zzbyt);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.setClassName(paramContext, "com.google.android.gms.ads.AdActivity");
    localIntent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", paramAdOverlayInfoParcel.zzacr.d);
    localIntent.putExtra("shouldCallOnOverlayOpened", paramBoolean);
    AdOverlayInfoParcel.zza(localIntent, paramAdOverlayInfoParcel);
    if (!k.i()) {
      localIntent.addFlags(524288);
    }
    if (!(paramContext instanceof Activity)) {
      localIntent.addFlags(268435456);
    }
    zzbv.zzek();
    jn.a(paramContext, localIntent);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.zzl
 * JD-Core Version:    0.7.0.1
 */