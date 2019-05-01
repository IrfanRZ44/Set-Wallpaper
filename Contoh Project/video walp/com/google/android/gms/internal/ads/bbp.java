package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzag;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

final class bbp
  implements zzag
{
  private final ban a;
  private final np b;
  
  public bbp(bbm parambbm, ban paramban, np paramnp)
  {
    this.a = paramban;
    this.b = paramnp;
  }
  
  public final void zzau(@Nullable String paramString)
  {
    if (paramString == null) {}
    for (;;)
    {
      try
      {
        this.b.a(new bba());
        return;
      }
      catch (IllegalStateException localIllegalStateException)
      {
        return;
      }
      finally
      {
        this.a.c();
      }
      this.b.a(new bba(paramString));
    }
  }
  
  public final void zzd(JSONObject paramJSONObject)
  {
    try
    {
      this.b.b(bbm.a(this.c).a(paramJSONObject));
      return;
    }
    catch (IllegalStateException localIllegalStateException) {}catch (JSONException localJSONException)
    {
      this.b.b(localJSONException);
      return;
    }
    finally
    {
      this.a.c();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.bbp
 * JD-Core Version:    0.7.0.1
 */