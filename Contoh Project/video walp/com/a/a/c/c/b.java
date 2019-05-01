package com.a.a.c.c;

import com.a.a.c.a;
import com.a.a.c.a.d;
import com.a.a.c.a.d.a;
import com.a.a.c.j;
import com.a.a.g;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class b<Data>
  implements n<byte[], Data>
{
  private final b<Data> a;
  
  public b(b<Data> paramb)
  {
    this.a = paramb;
  }
  
  public n.a<Data> a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, j paramj)
  {
    return new n.a(new com.a.a.h.b(paramArrayOfByte), new c(paramArrayOfByte, this.a));
  }
  
  public boolean a(byte[] paramArrayOfByte)
  {
    return true;
  }
  
  public static class a
    implements o<byte[], ByteBuffer>
  {
    public n<byte[], ByteBuffer> a(r paramr)
    {
      new b(new b.b()
      {
        public Class<ByteBuffer> a()
        {
          return ByteBuffer.class;
        }
        
        public ByteBuffer a(byte[] paramAnonymousArrayOfByte)
        {
          return ByteBuffer.wrap(paramAnonymousArrayOfByte);
        }
      });
    }
  }
  
  public static abstract interface b<Data>
  {
    public abstract Class<Data> a();
    
    public abstract Data b(byte[] paramArrayOfByte);
  }
  
  private static class c<Data>
    implements d<Data>
  {
    private final byte[] a;
    private final b.b<Data> b;
    
    c(byte[] paramArrayOfByte, b.b<Data> paramb)
    {
      this.a = paramArrayOfByte;
      this.b = paramb;
    }
    
    public Class<Data> a()
    {
      return this.b.a();
    }
    
    public void a(g paramg, d.a<? super Data> parama)
    {
      parama.a(this.b.b(this.a));
    }
    
    public void b() {}
    
    public void c() {}
    
    public a d()
    {
      return a.a;
    }
  }
  
  public static class d
    implements o<byte[], InputStream>
  {
    public n<byte[], InputStream> a(r paramr)
    {
      new b(new b.b()
      {
        public InputStream a(byte[] paramAnonymousArrayOfByte)
        {
          return new ByteArrayInputStream(paramAnonymousArrayOfByte);
        }
        
        public Class<InputStream> a()
        {
          return InputStream.class;
        }
      });
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.c.b
 * JD-Core Version:    0.7.0.1
 */