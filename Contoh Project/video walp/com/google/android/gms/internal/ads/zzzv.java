package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.customtabs.c;
import android.support.customtabs.c.a;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.common.util.k;

@cm
public final class zzzv
  implements MediationInterstitialAdapter
{
  private Activity a;
  private MediationInterstitialListener b;
  private Uri c;
  
  public final void onDestroy()
  {
    mk.b("Destroying AdMobCustomTabsAdapter adapter.");
  }
  
  public final void onPause()
  {
    mk.b("Pausing AdMobCustomTabsAdapter adapter.");
  }
  
  public final void onResume()
  {
    mk.b("Resuming AdMobCustomTabsAdapter adapter.");
  }
  
  public final void requestInterstitialAd(Context paramContext, MediationInterstitialListener paramMediationInterstitialListener, Bundle paramBundle1, MediationAdRequest paramMediationAdRequest, Bundle paramBundle2)
  {
    this.b = paramMediationInterstitialListener;
    if (this.b == null)
    {
      mk.e("Listener not set for mediation. Returning.");
      return;
    }
    if (!(paramContext instanceof Activity))
    {
      mk.e("AdMobCustomTabs can only work with Activity context. Bailing out.");
      this.b.onAdFailedToLoad(this, 0);
      return;
    }
    if ((k.c()) && (asy.a(paramContext))) {}
    for (int i = 1; i == 0; i = 0)
    {
      mk.e("Default browser does not support custom tabs. Bailing out.");
      this.b.onAdFailedToLoad(this, 0);
      return;
    }
    String str = paramBundle1.getString("tab_url");
    if (TextUtils.isEmpty(str))
    {
      mk.e("The tab_url retrieved from mediation metadata is empty. Bailing out.");
      this.b.onAdFailedToLoad(this, 0);
      return;
    }
    this.a = ((Activity)paramContext);
    this.c = Uri.parse(str);
    this.b.onAdLoaded(this);
  }
  
  public final void showInterstitial()
  {
    c localc = new c.a().a();
    localc.a.setData(this.c);
    AdOverlayInfoParcel localAdOverlayInfoParcel = new AdOverlayInfoParcel(new zzc(localc.a), null, new bet(this), null, new zzang(0, 0, false));
    jn.a.post(new beu(this, localAdOverlayInfoParcel));
    zzbv.zzeo().f();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.zzzv
 * JD-Core Version:    0.7.0.1
 */