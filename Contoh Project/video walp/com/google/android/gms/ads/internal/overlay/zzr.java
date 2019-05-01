package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.je;

@cm
public final class zzr
  extends zzd
{
  public zzr(Activity paramActivity)
  {
    super(paramActivity);
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    je.a("AdOverlayParcel is null or does not contain valid overlay type.");
    this.d = 3;
    this.a.finish();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.zzr
 * JD-Core Version:    0.7.0.1
 */