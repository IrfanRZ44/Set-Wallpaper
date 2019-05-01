package com.naing.b;

import org.json.JSONObject;

public class h
{
  String a;
  String b;
  String c;
  String d;
  long e;
  int f;
  String g;
  String h;
  String i;
  String j;
  
  public h(String paramString1, String paramString2, String paramString3)
  {
    this.a = paramString1;
    this.i = paramString2;
    JSONObject localJSONObject = new JSONObject(this.i);
    this.b = localJSONObject.optString("orderId");
    this.c = localJSONObject.optString("packageName");
    this.d = localJSONObject.optString("productId");
    this.e = localJSONObject.optLong("purchaseTime");
    this.f = localJSONObject.optInt("purchaseState");
    this.g = localJSONObject.optString("developerPayload");
    this.h = localJSONObject.optString("token", localJSONObject.optString("purchaseToken"));
    this.j = paramString3;
  }
  
  public String a()
  {
    return this.a;
  }
  
  public String b()
  {
    return this.d;
  }
  
  public String c()
  {
    return this.g;
  }
  
  public String d()
  {
    return this.h;
  }
  
  public String toString()
  {
    return "PurchaseInfo(type:" + this.a + "):" + this.i;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.naing.b.h
 * JD-Core Version:    0.7.0.1
 */