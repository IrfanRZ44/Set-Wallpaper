package com.a.a.i;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

public final class a
{
  private static final AtomicReference<byte[]> a = new AtomicReference();
  
  /* Error */
  public static ByteBuffer a(java.io.File paramFile)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: invokevirtual 25	java/io/File:length	()J
    //   6: lstore 6
    //   8: lload 6
    //   10: ldc2_w 26
    //   13: lcmp
    //   14: ifle +34 -> 48
    //   17: new 19	java/io/IOException
    //   20: dup
    //   21: ldc 29
    //   23: invokespecial 32	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   26: athrow
    //   27: astore_2
    //   28: aconst_null
    //   29: astore_3
    //   30: aload_1
    //   31: ifnull +7 -> 38
    //   34: aload_1
    //   35: invokevirtual 37	java/nio/channels/FileChannel:close	()V
    //   38: aload_3
    //   39: ifnull +7 -> 46
    //   42: aload_3
    //   43: invokevirtual 40	java/io/RandomAccessFile:close	()V
    //   46: aload_2
    //   47: athrow
    //   48: lload 6
    //   50: lconst_0
    //   51: lcmp
    //   52: ifne +13 -> 65
    //   55: new 19	java/io/IOException
    //   58: dup
    //   59: ldc 42
    //   61: invokespecial 32	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   64: athrow
    //   65: new 39	java/io/RandomAccessFile
    //   68: dup
    //   69: aload_0
    //   70: ldc 44
    //   72: invokespecial 47	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   75: astore 8
    //   77: aload 8
    //   79: invokevirtual 51	java/io/RandomAccessFile:getChannel	()Ljava/nio/channels/FileChannel;
    //   82: astore 9
    //   84: aload 9
    //   86: getstatic 57	java/nio/channels/FileChannel$MapMode:READ_ONLY	Ljava/nio/channels/FileChannel$MapMode;
    //   89: lconst_0
    //   90: lload 6
    //   92: invokevirtual 61	java/nio/channels/FileChannel:map	(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
    //   95: invokevirtual 67	java/nio/MappedByteBuffer:load	()Ljava/nio/MappedByteBuffer;
    //   98: astore 11
    //   100: aload 9
    //   102: ifnull +8 -> 110
    //   105: aload 9
    //   107: invokevirtual 37	java/nio/channels/FileChannel:close	()V
    //   110: aload 8
    //   112: ifnull +8 -> 120
    //   115: aload 8
    //   117: invokevirtual 40	java/io/RandomAccessFile:close	()V
    //   120: aload 11
    //   122: areturn
    //   123: astore 13
    //   125: goto -15 -> 110
    //   128: astore 12
    //   130: aload 11
    //   132: areturn
    //   133: astore 5
    //   135: goto -97 -> 38
    //   138: astore 4
    //   140: goto -94 -> 46
    //   143: astore_2
    //   144: aload 8
    //   146: astore_3
    //   147: aconst_null
    //   148: astore_1
    //   149: goto -119 -> 30
    //   152: astore 10
    //   154: aload 8
    //   156: astore_3
    //   157: aload 10
    //   159: astore_2
    //   160: aload 9
    //   162: astore_1
    //   163: goto -133 -> 30
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	166	0	paramFile	java.io.File
    //   1	162	1	localObject1	Object
    //   27	20	2	localObject2	Object
    //   143	1	2	localObject3	Object
    //   159	1	2	localObject4	Object
    //   29	128	3	localObject5	Object
    //   138	1	4	localIOException1	IOException
    //   133	1	5	localIOException2	IOException
    //   6	85	6	l	long
    //   75	80	8	localRandomAccessFile	java.io.RandomAccessFile
    //   82	79	9	localFileChannel	java.nio.channels.FileChannel
    //   152	6	10	localObject6	Object
    //   98	33	11	localMappedByteBuffer	java.nio.MappedByteBuffer
    //   128	1	12	localIOException3	IOException
    //   123	1	13	localIOException4	IOException
    // Exception table:
    //   from	to	target	type
    //   2	8	27	finally
    //   17	27	27	finally
    //   55	65	27	finally
    //   65	77	27	finally
    //   105	110	123	java/io/IOException
    //   115	120	128	java/io/IOException
    //   34	38	133	java/io/IOException
    //   42	46	138	java/io/IOException
    //   77	84	143	finally
    //   84	100	152	finally
  }
  
  /* Error */
  public static void a(ByteBuffer paramByteBuffer, java.io.File paramFile)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: iconst_0
    //   4: invokevirtual 74	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
    //   7: pop
    //   8: new 39	java/io/RandomAccessFile
    //   11: dup
    //   12: aload_1
    //   13: ldc 76
    //   15: invokespecial 47	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   18: astore 4
    //   20: aload 4
    //   22: invokevirtual 51	java/io/RandomAccessFile:getChannel	()Ljava/nio/channels/FileChannel;
    //   25: astore_2
    //   26: aload_2
    //   27: aload_0
    //   28: invokevirtual 80	java/nio/channels/FileChannel:write	(Ljava/nio/ByteBuffer;)I
    //   31: pop
    //   32: aload_2
    //   33: iconst_0
    //   34: invokevirtual 84	java/nio/channels/FileChannel:force	(Z)V
    //   37: aload_2
    //   38: invokevirtual 37	java/nio/channels/FileChannel:close	()V
    //   41: aload 4
    //   43: invokevirtual 40	java/io/RandomAccessFile:close	()V
    //   46: aload_2
    //   47: ifnull +7 -> 54
    //   50: aload_2
    //   51: invokevirtual 37	java/nio/channels/FileChannel:close	()V
    //   54: aload 4
    //   56: ifnull +8 -> 64
    //   59: aload 4
    //   61: invokevirtual 40	java/io/RandomAccessFile:close	()V
    //   64: return
    //   65: astore 5
    //   67: aconst_null
    //   68: astore 4
    //   70: aload_2
    //   71: ifnull +7 -> 78
    //   74: aload_2
    //   75: invokevirtual 37	java/nio/channels/FileChannel:close	()V
    //   78: aload 4
    //   80: ifnull +8 -> 88
    //   83: aload 4
    //   85: invokevirtual 40	java/io/RandomAccessFile:close	()V
    //   88: aload 5
    //   90: athrow
    //   91: astore 10
    //   93: goto -39 -> 54
    //   96: astore 9
    //   98: return
    //   99: astore 7
    //   101: goto -23 -> 78
    //   104: astore 6
    //   106: goto -18 -> 88
    //   109: astore 5
    //   111: goto -41 -> 70
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	114	0	paramByteBuffer	ByteBuffer
    //   0	114	1	paramFile	java.io.File
    //   1	74	2	localFileChannel	java.nio.channels.FileChannel
    //   18	66	4	localRandomAccessFile	java.io.RandomAccessFile
    //   65	24	5	localObject1	Object
    //   109	1	5	localObject2	Object
    //   104	1	6	localIOException1	IOException
    //   99	1	7	localIOException2	IOException
    //   96	1	9	localIOException3	IOException
    //   91	1	10	localIOException4	IOException
    // Exception table:
    //   from	to	target	type
    //   8	20	65	finally
    //   50	54	91	java/io/IOException
    //   59	64	96	java/io/IOException
    //   74	78	99	java/io/IOException
    //   83	88	104	java/io/IOException
    //   20	46	109	finally
  }
  
  public static byte[] a(ByteBuffer paramByteBuffer)
  {
    b localb = c(paramByteBuffer);
    if ((localb != null) && (localb.a == 0) && (localb.b == localb.c.length)) {
      return paramByteBuffer.array();
    }
    ByteBuffer localByteBuffer = paramByteBuffer.asReadOnlyBuffer();
    byte[] arrayOfByte = new byte[localByteBuffer.limit()];
    localByteBuffer.position(0);
    localByteBuffer.get(arrayOfByte);
    return arrayOfByte;
  }
  
  public static InputStream b(ByteBuffer paramByteBuffer)
  {
    return new a(paramByteBuffer);
  }
  
  private static b c(ByteBuffer paramByteBuffer)
  {
    if ((!paramByteBuffer.isReadOnly()) && (paramByteBuffer.hasArray())) {
      return new b(paramByteBuffer.array(), paramByteBuffer.arrayOffset(), paramByteBuffer.limit());
    }
    return null;
  }
  
  private static class a
    extends InputStream
  {
    private final ByteBuffer a;
    private int b = -1;
    
    a(ByteBuffer paramByteBuffer)
    {
      this.a = paramByteBuffer;
    }
    
    public int available()
    {
      return this.a.remaining();
    }
    
    public void mark(int paramInt)
    {
      try
      {
        this.b = this.a.position();
        return;
      }
      finally
      {
        localObject = finally;
        throw localObject;
      }
    }
    
    public boolean markSupported()
    {
      return true;
    }
    
    public int read()
    {
      if (!this.a.hasRemaining()) {
        return -1;
      }
      return this.a.get();
    }
    
    public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      if (!this.a.hasRemaining()) {
        return -1;
      }
      int i = Math.min(paramInt2, available());
      this.a.get(paramArrayOfByte, paramInt1, i);
      return i;
    }
    
    public void reset()
    {
      try
      {
        if (this.b == -1) {
          throw new IOException("Cannot reset to unset mark position");
        }
      }
      finally {}
      this.a.position(this.b);
    }
    
    public long skip(long paramLong)
    {
      if (!this.a.hasRemaining()) {
        return -1L;
      }
      long l = Math.min(paramLong, available());
      this.a.position((int)(l + this.a.position()));
      return l;
    }
  }
  
  static final class b
  {
    final int a;
    final int b;
    final byte[] c;
    
    b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      this.c = paramArrayOfByte;
      this.a = paramInt1;
      this.b = paramInt2;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.i.a
 * JD-Core Version:    0.7.0.1
 */