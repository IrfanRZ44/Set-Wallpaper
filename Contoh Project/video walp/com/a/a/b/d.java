package com.a.a.b;

import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;

public class d
{
  private final byte[] a = new byte[256];
  private ByteBuffer b;
  private c c;
  private int d = 0;
  
  private void a(int paramInt)
  {
    int i = 0;
    while ((i == 0) && (!o()) && (this.c.c <= paramInt)) {
      switch (m())
      {
      default: 
        this.c.b = 1;
        break;
      case 44: 
        if (this.c.d == null) {
          this.c.d = new b();
        }
        f();
        break;
      case 33: 
        switch (m())
        {
        default: 
          k();
          break;
        case 249: 
          this.c.d = new b();
          e();
          break;
        case 255: 
          l();
          StringBuilder localStringBuilder = new StringBuilder();
          for (int j = 0; j < 11; j++) {
            localStringBuilder.append((char)this.a[j]);
          }
          if (localStringBuilder.toString().equals("NETSCAPE2.0")) {
            g();
          } else {
            k();
          }
          break;
        case 254: 
          k();
          break;
        case 1: 
          k();
        }
        break;
      case 59: 
        i = 1;
      }
    }
  }
  
  /* Error */
  private int[] b(int paramInt)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: iload_1
    //   3: iconst_3
    //   4: imul
    //   5: newarray byte
    //   7: astore_3
    //   8: aload_0
    //   9: getfield 82	com/a/a/b/d:b	Ljava/nio/ByteBuffer;
    //   12: aload_3
    //   13: invokevirtual 88	java/nio/ByteBuffer:get	([B)Ljava/nio/ByteBuffer;
    //   16: pop
    //   17: sipush 256
    //   20: newarray int
    //   22: astore 5
    //   24: iconst_0
    //   25: istore 9
    //   27: iload_2
    //   28: iload_1
    //   29: if_icmpge +119 -> 148
    //   32: iload 9
    //   34: iconst_1
    //   35: iadd
    //   36: istore 10
    //   38: sipush 255
    //   41: aload_3
    //   42: iload 9
    //   44: baload
    //   45: iand
    //   46: istore 11
    //   48: iload 10
    //   50: iconst_1
    //   51: iadd
    //   52: istore 12
    //   54: sipush 255
    //   57: aload_3
    //   58: iload 10
    //   60: baload
    //   61: iand
    //   62: istore 13
    //   64: iload 12
    //   66: iconst_1
    //   67: iadd
    //   68: istore 9
    //   70: sipush 255
    //   73: aload_3
    //   74: iload 12
    //   76: baload
    //   77: iand
    //   78: istore 14
    //   80: iload_2
    //   81: iconst_1
    //   82: iadd
    //   83: istore 15
    //   85: aload 5
    //   87: iload_2
    //   88: iload 14
    //   90: ldc 89
    //   92: iload 11
    //   94: bipush 16
    //   96: ishl
    //   97: ior
    //   98: iload 13
    //   100: bipush 8
    //   102: ishl
    //   103: ior
    //   104: ior
    //   105: iastore
    //   106: iload 15
    //   108: istore_2
    //   109: goto -82 -> 27
    //   112: astore 4
    //   114: aconst_null
    //   115: astore 5
    //   117: aload 4
    //   119: astore 6
    //   121: ldc 91
    //   123: iconst_3
    //   124: invokestatic 97	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   127: ifeq +13 -> 140
    //   130: ldc 91
    //   132: ldc 99
    //   134: aload 6
    //   136: invokestatic 102	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   139: pop
    //   140: aload_0
    //   141: getfield 27	com/a/a/b/d:c	Lcom/a/a/b/c;
    //   144: iconst_1
    //   145: putfield 37	com/a/a/b/c:b	I
    //   148: aload 5
    //   150: areturn
    //   151: astore 6
    //   153: goto -32 -> 121
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	156	0	this	d
    //   0	156	1	paramInt	int
    //   1	108	2	i	int
    //   7	67	3	arrayOfByte	byte[]
    //   112	6	4	localBufferUnderflowException1	java.nio.BufferUnderflowException
    //   22	127	5	arrayOfInt	int[]
    //   119	16	6	localBufferUnderflowException2	java.nio.BufferUnderflowException
    //   151	1	6	localBufferUnderflowException3	java.nio.BufferUnderflowException
    //   25	44	9	j	int
    //   36	23	10	k	int
    //   46	51	11	m	int
    //   52	23	12	n	int
    //   62	41	13	i1	int
    //   78	27	14	i2	int
    //   83	24	15	i3	int
    // Exception table:
    //   from	to	target	type
    //   8	24	112	java/nio/BufferUnderflowException
    //   38	48	151	java/nio/BufferUnderflowException
    //   54	64	151	java/nio/BufferUnderflowException
    //   70	80	151	java/nio/BufferUnderflowException
    //   85	106	151	java/nio/BufferUnderflowException
  }
  
  private void c()
  {
    this.b = null;
    Arrays.fill(this.a, (byte)0);
    this.c = new c();
    this.d = 0;
  }
  
  private void d()
  {
    a(2147483647);
  }
  
  private void e()
  {
    int i = 1;
    m();
    int j = m();
    this.c.d.g = ((j & 0x1C) >> 2);
    if (this.c.d.g == 0) {
      this.c.d.g = i;
    }
    b localb = this.c.d;
    if ((j & 0x1) != 0) {}
    for (;;)
    {
      localb.f = i;
      int k = n();
      if (k < 2) {
        k = 10;
      }
      this.c.d.i = (k * 10);
      this.c.d.h = m();
      m();
      return;
      i = 0;
    }
  }
  
  private void f()
  {
    boolean bool = true;
    this.c.d.a = n();
    this.c.d.b = n();
    this.c.d.c = n();
    this.c.d.d = n();
    int i = m();
    int j;
    int k;
    if ((i & 0x80) != 0)
    {
      j = bool;
      k = (int)Math.pow(2.0D, 1 + (i & 0x7));
      b localb = this.c.d;
      if ((i & 0x40) == 0) {
        break label165;
      }
      label105:
      localb.e = bool;
      if (j == 0) {
        break label170;
      }
    }
    label165:
    label170:
    for (this.c.d.k = b(k);; this.c.d.k = null)
    {
      this.c.d.j = this.b.position();
      j();
      if (!o()) {
        break label184;
      }
      return;
      j = 0;
      break;
      bool = false;
      break label105;
    }
    label184:
    c localc = this.c;
    localc.c = (1 + localc.c);
    this.c.e.add(this.c.d);
  }
  
  private void g()
  {
    do
    {
      l();
      if (this.a[0] == 1)
      {
        int i = 0xFF & this.a[1];
        int j = 0xFF & this.a[2];
        this.c.m = (i | j << 8);
      }
    } while ((this.d > 0) && (!o()));
  }
  
  private void h()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < 6; i++) {
      localStringBuilder.append((char)m());
    }
    if (!localStringBuilder.toString().startsWith("GIF")) {
      this.c.b = 1;
    }
    do
    {
      return;
      i();
    } while ((!this.c.h) || (o()));
    this.c.a = b(this.c.i);
    this.c.l = this.c.a[this.c.j];
  }
  
  private void i()
  {
    this.c.f = n();
    this.c.g = n();
    int i = m();
    c localc = this.c;
    if ((i & 0x80) != 0) {}
    for (boolean bool = true;; bool = false)
    {
      localc.h = bool;
      this.c.i = ((int)Math.pow(2.0D, 1 + (i & 0x7)));
      this.c.j = m();
      this.c.k = m();
      return;
    }
  }
  
  private void j()
  {
    m();
    k();
  }
  
  private void k()
  {
    int i;
    do
    {
      i = m();
      int j = Math.min(i + this.b.position(), this.b.limit());
      this.b.position(j);
    } while (i > 0);
  }
  
  private void l()
  {
    int i = 0;
    this.d = m();
    if (this.d > 0)
    {
      int j = 0;
      try
      {
        while (j < this.d)
        {
          i = this.d - j;
          this.b.get(this.a, j, i);
          j += i;
        }
        return;
      }
      catch (Exception localException)
      {
        if (Log.isLoggable("GifHeaderParser", 3)) {
          Log.d("GifHeaderParser", "Error Reading Block n: " + j + " count: " + i + " blockSize: " + this.d, localException);
        }
        this.c.b = 1;
      }
    }
  }
  
  private int m()
  {
    try
    {
      int i = this.b.get();
      return i & 0xFF;
    }
    catch (Exception localException)
    {
      this.c.b = 1;
    }
    return 0;
  }
  
  private int n()
  {
    return this.b.getShort();
  }
  
  private boolean o()
  {
    return this.c.b != 0;
  }
  
  public d a(ByteBuffer paramByteBuffer)
  {
    c();
    this.b = paramByteBuffer.asReadOnlyBuffer();
    this.b.position(0);
    this.b.order(ByteOrder.LITTLE_ENDIAN);
    return this;
  }
  
  public void a()
  {
    this.b = null;
    this.c = null;
  }
  
  public c b()
  {
    if (this.b == null) {
      throw new IllegalStateException("You must call setData() before parseHeader()");
    }
    if (o()) {
      return this.c;
    }
    h();
    if (!o())
    {
      d();
      if (this.c.c < 0) {
        this.c.b = 1;
      }
    }
    return this.c;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.b.d
 * JD-Core Version:    0.7.0.1
 */