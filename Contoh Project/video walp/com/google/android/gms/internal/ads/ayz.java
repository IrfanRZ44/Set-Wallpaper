package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@cm
@ParametersAreNonnullByDefault
public final class ayz
  extends azm<bax>
  implements azi, azo
{
  private final sf a;
  
  public ayz(Context paramContext, zzang paramzzang)
  {
    try
    {
      this.a = new sf(new rr(paramContext));
      this.a.setWillNotDraw(true);
      this.a.a(new aza(this));
      this.a.a(new azb(this));
      this.a.addJavascriptInterface(new azh(this, null), "GoogleJsInterface");
      zzbv.zzek().a(paramContext, paramzzang.a, this.a.getSettings());
      return;
    }
    catch (Throwable localThrowable)
    {
      throw new qp("Init failed.", localThrowable);
    }
  }
  
  public final void a()
  {
    this.a.destroy();
  }
  
  public final void a(azp paramazp)
  {
    this.a.a(new aze(paramazp));
  }
  
  public final void a(String paramString)
  {
    c(String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head></html>", new Object[] { paramString }));
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
    nk.a.execute(new azf(this, paramString));
  }
  
  public final void b(String paramString, JSONObject paramJSONObject)
  {
    azj.a(this, paramString, paramJSONObject);
  }
  
  public final void c(String paramString)
  {
    nk.a.execute(new azc(this, paramString));
  }
  
  public final void d(String paramString)
  {
    nk.a.execute(new azd(this, paramString));
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ayz
 * JD-Core Version:    0.7.0.1
 */