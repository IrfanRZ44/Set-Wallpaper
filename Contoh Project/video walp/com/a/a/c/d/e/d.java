package com.a.a.c.d.e;

import android.util.Log;
import com.a.a.c.b.u;
import com.a.a.c.j;
import com.a.a.c.l;
import com.a.a.i.a;
import java.io.File;
import java.io.IOException;

public class d
  implements l<c>
{
  public com.a.a.c.c a(j paramj)
  {
    return com.a.a.c.c.a;
  }
  
  public boolean a(u<c> paramu, File paramFile, j paramj)
  {
    c localc = (c)paramu.d();
    try
    {
      a.a(localc.c(), paramFile);
      return true;
    }
    catch (IOException localIOException)
    {
      if (Log.isLoggable("GifEncoder", 5)) {
        Log.w("GifEncoder", "Failed to encode GIF drawable data", localIOException);
      }
    }
    return false;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.d.e.d
 * JD-Core Version:    0.7.0.1
 */