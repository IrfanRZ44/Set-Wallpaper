package com.a.a.c.c;

import android.util.Log;
import com.a.a.c.j;
import com.a.a.g;
import com.a.a.h.b;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public class d
  implements n<File, ByteBuffer>
{
  public n.a<ByteBuffer> a(File paramFile, int paramInt1, int paramInt2, j paramj)
  {
    return new n.a(new b(paramFile), new a(paramFile));
  }
  
  public boolean a(File paramFile)
  {
    return true;
  }
  
  private static final class a
    implements com.a.a.c.a.d<ByteBuffer>
  {
    private final File a;
    
    a(File paramFile)
    {
      this.a = paramFile;
    }
    
    public Class<ByteBuffer> a()
    {
      return ByteBuffer.class;
    }
    
    public void a(g paramg, com.a.a.c.a.d.a<? super ByteBuffer> parama)
    {
      try
      {
        ByteBuffer localByteBuffer = com.a.a.i.a.a(this.a);
        parama.a(localByteBuffer);
        return;
      }
      catch (IOException localIOException)
      {
        if (Log.isLoggable("ByteBufferFileLoader", 3)) {
          Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", localIOException);
        }
        parama.a(localIOException);
      }
    }
    
    public void b() {}
    
    public void c() {}
    
    public com.a.a.c.a d()
    {
      return com.a.a.c.a.a;
    }
  }
  
  public static class b
    implements o<File, ByteBuffer>
  {
    public n<File, ByteBuffer> a(r paramr)
    {
      return new d();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.c.d
 * JD-Core Version:    0.7.0.1
 */