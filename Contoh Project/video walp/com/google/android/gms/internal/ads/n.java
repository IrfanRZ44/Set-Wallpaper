package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

@cm
public class n
{
  private final qe a;
  private final String b;
  
  public n(qe paramqe)
  {
    this(paramqe, "");
  }
  
  public n(qe paramqe, String paramString)
  {
    this.a = paramqe;
    this.b = paramString;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject().put("x", paramInt1).put("y", paramInt2).put("width", paramInt3).put("height", paramInt4);
      this.a.a("onSizeChanged", localJSONObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      je.b("Error occured while dispatching size change.", localJSONException);
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject().put("width", paramInt1).put("height", paramInt2).put("maxSizeWidth", paramInt3).put("maxSizeHeight", paramInt4).put("density", paramFloat).put("rotation", paramInt5);
      this.a.a("onScreenInfoChanged", localJSONObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      je.b("Error occured while obtaining screen information.", localJSONException);
    }
  }
  
  public final void a(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject().put("message", paramString).put("action", this.b);
      this.a.a("onError", localJSONObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      je.b("Error occurred while dispatching error event.", localJSONException);
    }
  }
  
  public final void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject().put("x", paramInt1).put("y", paramInt2).put("width", paramInt3).put("height", paramInt4);
      this.a.a("onDefaultPositionReceived", localJSONObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      je.b("Error occured while dispatching default position.", localJSONException);
    }
  }
  
  public final void b(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject().put("js", paramString);
      this.a.a("onReadyEventReceived", localJSONObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      je.b("Error occured while dispatching ready Event.", localJSONException);
    }
  }
  
  public final void c(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject().put("state", paramString);
      this.a.a("onStateChanged", localJSONObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      je.b("Error occured while dispatching state change.", localJSONException);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.n
 * JD-Core Version:    0.7.0.1
 */