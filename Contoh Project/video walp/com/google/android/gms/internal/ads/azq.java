package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.google.android.gms.ads.internal.gmsg.zzv;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzw;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@cm
@ParametersAreNonnullByDefault
public final class azq
  implements azi, azo
{
  private final qe a;
  private final Context b;
  
  public azq(Context paramContext, zzang paramzzang, agw paramagw, zzw paramzzw)
  {
    this.b = paramContext;
    zzbv.zzel();
    this.a = ql.a(paramContext, rs.a(), "", false, false, paramagw, paramzzang, null, null, null, amj.a());
    this.a.getView().setWillNotDraw(true);
  }
  
  private static void a(Runnable paramRunnable)
  {
    aos.a();
    if (lz.b())
    {
      paramRunnable.run();
      return;
    }
    jn.a.post(paramRunnable);
  }
  
  public final void a()
  {
    this.a.destroy();
  }
  
  public final void a(azp paramazp)
  {
    rm localrm = this.a.t();
    paramazp.getClass();
    localrm.a(azt.a(paramazp));
  }
  
  public final void a(String paramString)
  {
    a(new azv(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[] { paramString })));
  }
  
  public final void a(String paramString, zzv<? super bax> paramzzv)
  {
    this.a.a(paramString, new azy(this, paramzzv));
  }
  
  public final void a(String paramString1, String paramString2)
  {
    azj.a(this, paramString1, paramString2);
  }
  
  public final void a(String paramString, Map paramMap)
  {
    azj.a(this, paramString, paramMap);
  }
  
  public final void a(String paramString, JSONObject paramJSONObject)
  {
    azj.b(this, paramString, paramJSONObject);
  }
  
  public final bay b()
  {
    return new baz(this);
  }
  
  public final void b(String paramString)
  {
    a(new azr(this, paramString));
  }
  
  public final void b(String paramString, zzv<? super bax> paramzzv)
  {
    this.a.a(paramString, new azs(paramzzv));
  }
  
  public final void b(String paramString, JSONObject paramJSONObject)
  {
    azj.a(this, paramString, paramJSONObject);
  }
  
  public final void c(String paramString)
  {
    a(new azw(this, paramString));
  }
  
  public final void d(String paramString)
  {
    a(new azx(this, paramString));
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.azq
 * JD-Core Version:    0.7.0.1
 */