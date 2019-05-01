package com.naing.model;

public class a
{
  private int a;
  private int b;
  private String c;
  private String d;
  private String e;
  
  public a() {}
  
  public a(String paramString)
  {
    String[] arrayOfString = paramString.split("@@");
    this.b = Integer.parseInt(arrayOfString[0]);
    this.d = arrayOfString[1];
    this.a = Integer.parseInt(arrayOfString[2]);
    this.c = arrayOfString[3];
    this.e = arrayOfString[4];
  }
  
  public int a()
  {
    return this.a;
  }
  
  public String b()
  {
    return this.c;
  }
  
  public String c()
  {
    return this.d;
  }
  
  public String toString()
  {
    return this.b + "@@" + this.d + "@@" + this.a + "@@" + this.c + "@@" + this.e;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.naing.model.a
 * JD-Core Version:    0.7.0.1
 */