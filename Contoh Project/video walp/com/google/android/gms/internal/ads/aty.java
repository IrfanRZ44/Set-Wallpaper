package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.zzv;
import java.lang.ref.WeakReference;
import java.util.Map;

final class aty
  implements zzv<Object>
{
  aty(atx paramatx, bq parambq) {}
  
  public final void zza(Object paramObject, Map<String, String> paramMap)
  {
    qe localqe = (qe)atx.a(this.a).get();
    if (localqe == null)
    {
      this.b.b("/loadHtml", this);
      return;
    }
    localqe.t().a(new atz(this, paramMap, this.b));
    String str1 = (String)paramMap.get("overlayHtml");
    String str2 = (String)paramMap.get("baseUrl");
    if (TextUtils.isEmpty(str2))
    {
      localqe.loadData(str1, "text/html", "UTF-8");
      return;
    }
    localqe.loadDataWithBaseURL(str2, str1, "text/html", "UTF-8", null);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aty
 * JD-Core Version:    0.7.0.1
 */