package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.a.a;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.internal.ads.anw;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.s;

@cm
public final class zzs
  extends s
{
  private AdOverlayInfoParcel a;
  private Activity b;
  private boolean c = false;
  private boolean d = false;
  
  public zzs(Activity paramActivity, AdOverlayInfoParcel paramAdOverlayInfoParcel)
  {
    this.a = paramAdOverlayInfoParcel;
    this.b = paramActivity;
  }
  
  private final void a()
  {
    try
    {
      if (!this.d)
      {
        if (this.a.zzbyn != null) {
          this.a.zzbyn.zzcb();
        }
        this.d = true;
      }
      return;
    }
    finally {}
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  public final void onBackPressed() {}
  
  public final void onCreate(Bundle paramBundle)
  {
    boolean bool = false;
    if (paramBundle != null) {
      bool = paramBundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
    }
    if (this.a == null) {
      this.b.finish();
    }
    do
    {
      return;
      if (bool)
      {
        this.b.finish();
        return;
      }
      if (paramBundle == null)
      {
        if (this.a.zzbym != null) {
          this.a.zzbym.onAdClicked();
        }
        if ((this.b.getIntent() != null) && (this.b.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true)) && (this.a.zzbyn != null)) {
          this.a.zzbyn.zzcc();
        }
      }
      zzbv.zzeh();
    } while (zza.zza(this.b, this.a.zzbyl, this.a.zzbyt));
    this.b.finish();
  }
  
  public final void onDestroy()
  {
    if (this.b.isFinishing()) {
      a();
    }
  }
  
  public final void onPause()
  {
    if (this.a.zzbyn != null) {
      this.a.zzbyn.onPause();
    }
    if (this.b.isFinishing()) {
      a();
    }
  }
  
  public final void onRestart() {}
  
  public final void onResume()
  {
    if (this.c) {
      this.b.finish();
    }
    do
    {
      return;
      this.c = true;
    } while (this.a.zzbyn == null);
    this.a.zzbyn.onResume();
  }
  
  public final void onSaveInstanceState(Bundle paramBundle)
  {
    paramBundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.c);
  }
  
  public final void onStart() {}
  
  public final void onStop()
  {
    if (this.b.isFinishing()) {
      a();
    }
  }
  
  public final void zzax() {}
  
  public final boolean zznj()
  {
    return false;
  }
  
  public final void zzo(a parama) {}
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.zzs
 * JD-Core Version:    0.7.0.1
 */