package com.naing.b;

public class c
  extends Exception
{
  e a;
  
  public c(int paramInt, String paramString)
  {
    this(new e(paramInt, paramString));
  }
  
  public c(int paramInt, String paramString, Exception paramException)
  {
    this(new e(paramInt, paramString), paramException);
  }
  
  public c(e parame)
  {
    this(parame, null);
  }
  
  public c(e parame, Exception paramException)
  {
    super(parame.a(), paramException);
    this.a = parame;
  }
  
  public e a()
  {
    return this.a;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.naing.b.c
 * JD-Core Version:    0.7.0.1
 */