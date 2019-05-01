package com.a.a.c.b.b;

import java.io.File;

public class d
  implements a.a
{
  private final long a;
  private final a b;
  
  public d(a parama, long paramLong)
  {
    this.a = paramLong;
    this.b = parama;
  }
  
  public a a()
  {
    File localFile = this.b.a();
    if (localFile == null) {}
    while ((!localFile.mkdirs()) && ((!localFile.exists()) || (!localFile.isDirectory()))) {
      return null;
    }
    return e.a(localFile, this.a);
  }
  
  public static abstract interface a
  {
    public abstract File a();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.b.b.d
 * JD-Core Version:    0.7.0.1
 */