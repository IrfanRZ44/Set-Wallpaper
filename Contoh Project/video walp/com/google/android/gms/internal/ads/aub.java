package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.gmsg.zzv;
import java.lang.ref.WeakReference;
import java.util.Map;

final class aub
  implements zzv<Object>
{
  aub(atx paramatx, bq parambq) {}
  
  public final void zza(Object paramObject, Map<String, String> paramMap)
  {
    qe localqe = (qe)atx.a(this.b).get();
    if (localqe == null)
    {
      this.a.b("/hideOverlay", this);
      return;
    }
    localqe.getView().setVisibility(8);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aub
 * JD-Core Version:    0.7.0.1
 */