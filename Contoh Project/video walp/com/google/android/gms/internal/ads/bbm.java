package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzaf;
import com.google.android.gms.ads.internal.gmsg.zzf;
import com.google.android.gms.ads.internal.zzbv;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@cm
@ParametersAreNonnullByDefault
public final class bbm<I, O>
  implements bbb<I, O>
{
  private final bbd<O> a;
  private final bbe<I> b;
  private final baa c;
  private final String d;
  
  bbm(baa parambaa, String paramString, bbe<I> parambbe, bbd<O> parambbd)
  {
    this.c = parambaa;
    this.d = paramString;
    this.b = parambbe;
    this.a = parambbd;
  }
  
  private final void a(ban paramban, bax parambax, I paramI, np<O> paramnp)
  {
    try
    {
      zzbv.zzek();
      String str = jn.a();
      zzf.zzbmc.zza(str, new bbp(this, paramban, paramnp));
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("id", str);
      localJSONObject.put("args", this.b.a(paramI));
      parambax.b(this.d, localJSONObject);
      return;
    }
    catch (Exception localException)
    {
      try
      {
        paramnp.a(localException);
        je.b("Unable to invokeJavaScript", localException);
        return;
      }
      finally
      {
        paramban.c();
      }
    }
  }
  
  public final ne<O> a(@Nullable I paramI)
  {
    return b(paramI);
  }
  
  public final ne<O> b(I paramI)
  {
    np localnp = new np();
    ban localban = this.c.b(null);
    localban.a(new bbn(this, localban, paramI, localnp), new bbo(this, localnp, localban));
    return localnp;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bbm
 * JD-Core Version:    0.7.0.1
 */