package com.naing.b;

public class e
{
  int a;
  String b;
  
  public e(int paramInt, String paramString)
  {
    this.a = paramInt;
    if ((paramString == null) || (paramString.trim().length() == 0))
    {
      this.b = d.a(paramInt);
      return;
    }
    this.b = (paramString + " (response: " + d.a(paramInt) + ")");
  }
  
  public String a()
  {
    return this.b;
  }
  
  public boolean b()
  {
    return this.a == 0;
  }
  
  public boolean c()
  {
    return !b();
  }
  
  public String toString()
  {
    return "IabResult: " + a();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.naing.b.e
 * JD-Core Version:    0.7.0.1
 */