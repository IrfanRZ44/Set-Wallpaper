package com.a.a.c.d.b;

import com.a.a.c.a.e;
import com.a.a.c.a.e.a;
import java.nio.ByteBuffer;

public class a
  implements e<ByteBuffer>
{
  private final ByteBuffer a;
  
  public a(ByteBuffer paramByteBuffer)
  {
    this.a = paramByteBuffer;
  }
  
  public void b() {}
  
  public ByteBuffer c()
  {
    this.a.position(0);
    return this.a;
  }
  
  public static class a
    implements e.a<ByteBuffer>
  {
    public e<ByteBuffer> a(ByteBuffer paramByteBuffer)
    {
      return new a(paramByteBuffer);
    }
    
    public Class<ByteBuffer> a()
    {
      return ByteBuffer.class;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.d.b.a
 * JD-Core Version:    0.7.0.1
 */