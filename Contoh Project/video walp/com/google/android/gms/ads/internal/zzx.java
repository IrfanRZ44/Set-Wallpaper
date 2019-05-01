package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.hu;
import com.google.android.gms.internal.ads.jn;
import com.google.android.gms.internal.ads.zzael;
import com.google.android.gms.internal.ads.zzaiq;
import java.util.Iterator;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public final class zzx
{
  private final Context a;
  private boolean b;
  private hu c;
  private zzael d;
  
  public zzx(Context paramContext, hu paramhu, zzael paramzzael)
  {
    this.a = paramContext;
    this.c = paramhu;
    this.d = paramzzael;
    if (this.d == null) {
      this.d = new zzael();
    }
  }
  
  private final boolean a()
  {
    return ((this.c != null) && (this.c.a().f)) || (this.d.a);
  }
  
  public final void recordClick()
  {
    this.b = true;
  }
  
  public final boolean zzcy()
  {
    return (!a()) || (this.b);
  }
  
  public final void zzs(String paramString)
  {
    if (!a()) {}
    for (;;)
    {
      return;
      if (paramString != null) {}
      while (this.c != null)
      {
        this.c.a(paramString, null, 3);
        return;
        paramString = "";
      }
      if ((this.d.a) && (this.d.b != null))
      {
        Iterator localIterator = this.d.b.iterator();
        while (localIterator.hasNext())
        {
          String str1 = (String)localIterator.next();
          if (!TextUtils.isEmpty(str1))
          {
            String str2 = str1.replace("{NAVIGATION_URL}", Uri.encode(paramString));
            zzbv.zzek();
            jn.a(this.a, "", str2);
          }
        }
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.zzx
 * JD-Core Version:    0.7.0.1
 */