package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.gmsg.zzv;
import java.lang.ref.WeakReference;
import java.util.Map;

final class aua
  implements zzv<Object>
{
  aua(atx paramatx, bq parambq) {}
  
  public final void zza(Object paramObject, Map<String, String> paramMap)
  {
    qe localqe = (qe)atx.a(this.b).get();
    if (localqe == null)
    {
      this.a.b("/showOverlay", this);
      return;
    }
    localqe.getView().setVisibility(0);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aua
 * JD-Core Version:    0.7.0.1
 */