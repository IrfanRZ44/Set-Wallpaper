package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class zx
  implements Iterator
{
  private int a = 0;
  private final int b = this.c.a();
  
  zx(zw paramzw) {}
  
  private final byte a()
  {
    try
    {
      zw localzw = this.c;
      int i = this.a;
      this.a = (i + 1);
      byte b1 = localzw.a(i);
      return b1;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      throw new NoSuchElementException(localIndexOutOfBoundsException.getMessage());
    }
  }
  
  public final boolean hasNext()
  {
    return this.a < this.b;
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.zx
 * JD-Core Version:    0.7.0.1
 */