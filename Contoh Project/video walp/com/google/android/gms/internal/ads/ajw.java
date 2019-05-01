package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.gmsg.zzab;
import com.google.android.gms.ads.internal.gmsg.zzv;
import com.google.android.gms.ads.internal.zzbv;
import org.json.JSONObject;

@cm
public final class ajw
  implements akf
{
  private final ajj a;
  private final Context b;
  private final zzab c;
  private ban d;
  private boolean e;
  private final zzv<bax> f = new akb(this);
  private final zzv<bax> g = new akc(this);
  private final zzv<bax> h = new akd(this);
  private final zzv<bax> i = new ake(this);
  
  public ajw(ajj paramajj, baa parambaa, Context paramContext)
  {
    this.a = paramajj;
    this.b = paramContext;
    this.c = new zzab(this.b);
    this.d = parambaa.b(null);
    this.d.a(new ajx(this), new ajy(this));
    String str1 = String.valueOf(this.a.a.d());
    if (str1.length() != 0) {}
    for (String str2 = "Core JS tracking ad unit: ".concat(str1);; str2 = new String("Core JS tracking ad unit: "))
    {
      je.b(str2);
      return;
    }
  }
  
  final void a(bax parambax)
  {
    parambax.a("/updateActiveView", this.f);
    parambax.a("/untrackActiveViewUnit", this.g);
    parambax.a("/visibilityChanged", this.h);
    if (zzbv.zzfh().a(this.b)) {
      parambax.a("/logScionEvent", this.i);
    }
  }
  
  public final void a(JSONObject paramJSONObject, boolean paramBoolean)
  {
    this.d.a(new ajz(this, paramJSONObject), new nt());
  }
  
  public final boolean a()
  {
    return this.e;
  }
  
  public final void b()
  {
    this.d.a(new aka(this), new nt());
    this.d.c();
  }
  
  final void b(bax parambax)
  {
    parambax.b("/visibilityChanged", this.h);
    parambax.b("/untrackActiveViewUnit", this.g);
    parambax.b("/updateActiveView", this.f);
    if (zzbv.zzfh().a(this.b)) {
      parambax.b("/logScionEvent", this.i);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ajw
 * JD-Core Version:    0.7.0.1
 */