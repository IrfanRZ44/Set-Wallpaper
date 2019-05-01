package com.naing.b;

import org.json.JSONObject;

public class j
{
  String a;
  String b;
  String c;
  String d;
  String e;
  String f;
  String g;
  
  public j(String paramString1, String paramString2)
  {
    this.a = paramString1;
    this.g = paramString2;
    JSONObject localJSONObject = new JSONObject(this.g);
    this.b = localJSONObject.optString("productId");
    this.c = localJSONObject.optString("type");
    this.d = localJSONObject.optString("price");
    this.e = localJSONObject.optString("title");
    this.f = localJSONObject.optString("description");
  }
  
  public String a()
  {
    return this.b;
  }
  
  public String toString()
  {
    return "SkuDetails:" + this.g;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.naing.b.j
 * JD-Core Version:    0.7.0.1
 */