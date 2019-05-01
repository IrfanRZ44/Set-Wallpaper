package com.a.a.c.c;

import android.util.Log;
import com.a.a.c.d;
import com.a.a.c.j;
import com.a.a.i.a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public class c
  implements d<ByteBuffer>
{
  public boolean a(ByteBuffer paramByteBuffer, File paramFile, j paramj)
  {
    try
    {
      a.a(paramByteBuffer, paramFile);
      bool2 = true;
    }
    catch (IOException localIOException)
    {
      boolean bool1;
      do
      {
        bool1 = Log.isLoggable("ByteBufferEncoder", 3);
        boolean bool2 = false;
      } while (!bool1);
      Log.d("ByteBufferEncoder", "Failed to write data", localIOException);
    }
    return bool2;
    return false;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.c.c
 * JD-Core Version:    0.7.0.1
 */