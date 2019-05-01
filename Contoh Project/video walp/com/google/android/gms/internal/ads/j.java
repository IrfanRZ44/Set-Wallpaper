package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

@cm
public final class j
{
  private final boolean a;
  private final boolean b;
  private final boolean c;
  private final boolean d;
  private final boolean e;
  
  private j(l paraml)
  {
    this.a = l.a(paraml);
    this.b = l.b(paraml);
    this.c = l.c(paraml);
    this.d = l.d(paraml);
    this.e = l.e(paraml);
  }
  
  public final JSONObject a()
  {
    try
    {
      JSONObject localJSONObject = new JSONObject().put("sms", this.a).put("tel", this.b).put("calendar", this.c).put("storePicture", this.d).put("inlineVideo", this.e);
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      je.b("Error occured while obtaining the MRAID capabilities.", localJSONException);
    }
    return null;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.j
 * JD-Core Version:    0.7.0.1
 */