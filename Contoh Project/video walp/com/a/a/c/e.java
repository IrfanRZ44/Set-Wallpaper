package com.a.a.c;

import java.io.IOException;

public final class e
  extends IOException
{
  private final int a;
  
  public e(int paramInt)
  {
    this("Http request failed with status code: " + paramInt, paramInt);
  }
  
  public e(String paramString)
  {
    this(paramString, -1);
  }
  
  public e(String paramString, int paramInt)
  {
    this(paramString, paramInt, null);
  }
  
  public e(String paramString, int paramInt, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
    this.a = paramInt;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.e
 * JD-Core Version:    0.7.0.1
 */