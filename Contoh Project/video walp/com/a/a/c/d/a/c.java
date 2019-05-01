package com.a.a.c.d.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.a.a.c.b.a.b;
import com.a.a.c.i;
import com.a.a.c.j;
import com.a.a.c.l;

public class c
  implements l<Bitmap>
{
  public static final i<Integer> a = i.a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", Integer.valueOf(90));
  public static final i<Bitmap.CompressFormat> b = i.a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");
  private final b c;
  
  @Deprecated
  public c()
  {
    this.c = null;
  }
  
  public c(b paramb)
  {
    this.c = paramb;
  }
  
  private Bitmap.CompressFormat a(Bitmap paramBitmap, j paramj)
  {
    Bitmap.CompressFormat localCompressFormat = (Bitmap.CompressFormat)paramj.a(b);
    if (localCompressFormat != null) {
      return localCompressFormat;
    }
    if (paramBitmap.hasAlpha()) {
      return Bitmap.CompressFormat.PNG;
    }
    return Bitmap.CompressFormat.JPEG;
  }
  
  public com.a.a.c.c a(j paramj)
  {
    return com.a.a.c.c.b;
  }
  
  /* Error */
  public boolean a(com.a.a.c.b.u<Bitmap> paramu, java.io.File paramFile, j paramj)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface 81 1 0
    //   6: checkcast 55	android/graphics/Bitmap
    //   9: astore 4
    //   11: aload_0
    //   12: aload 4
    //   14: aload_3
    //   15: invokespecial 83	com/a/a/c/d/a/c:a	(Landroid/graphics/Bitmap;Lcom/a/a/c/j;)Landroid/graphics/Bitmap$CompressFormat;
    //   18: astore 5
    //   20: new 85	java/lang/StringBuilder
    //   23: dup
    //   24: invokespecial 86	java/lang/StringBuilder:<init>	()V
    //   27: ldc 88
    //   29: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   32: aload 4
    //   34: invokevirtual 96	android/graphics/Bitmap:getWidth	()I
    //   37: invokevirtual 99	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   40: ldc 101
    //   42: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: aload 4
    //   47: invokevirtual 104	android/graphics/Bitmap:getHeight	()I
    //   50: invokevirtual 99	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   53: ldc 106
    //   55: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   58: aload 5
    //   60: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   63: invokevirtual 113	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   66: invokestatic 118	android/support/v4/os/c:a	(Ljava/lang/String;)V
    //   69: invokestatic 123	com/a/a/i/d:a	()J
    //   72: lstore 7
    //   74: aload_3
    //   75: getstatic 31	com/a/a/c/d/a/c:a	Lcom/a/a/c/i;
    //   78: invokevirtual 51	com/a/a/c/j:a	(Lcom/a/a/c/i;)Ljava/lang/Object;
    //   81: checkcast 20	java/lang/Integer
    //   84: invokevirtual 126	java/lang/Integer:intValue	()I
    //   87: istore 9
    //   89: new 128	java/io/FileOutputStream
    //   92: dup
    //   93: aload_2
    //   94: invokespecial 131	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   97: astore 10
    //   99: aload_0
    //   100: getfield 44	com/a/a/c/d/a/c:c	Lcom/a/a/c/b/a/b;
    //   103: ifnull +18 -> 121
    //   106: new 133	com/a/a/c/a/c
    //   109: dup
    //   110: aload 10
    //   112: aload_0
    //   113: getfield 44	com/a/a/c/d/a/c:c	Lcom/a/a/c/b/a/b;
    //   116: invokespecial 136	com/a/a/c/a/c:<init>	(Ljava/io/OutputStream;Lcom/a/a/c/b/a/b;)V
    //   119: astore 10
    //   121: aload 4
    //   123: aload 5
    //   125: iload 9
    //   127: aload 10
    //   129: invokevirtual 140	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   132: pop
    //   133: aload 10
    //   135: invokevirtual 145	java/io/OutputStream:close	()V
    //   138: iconst_1
    //   139: istore 14
    //   141: aload 10
    //   143: ifnull +8 -> 151
    //   146: aload 10
    //   148: invokevirtual 145	java/io/OutputStream:close	()V
    //   151: ldc 147
    //   153: iconst_2
    //   154: invokestatic 153	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   157: ifeq +83 -> 240
    //   160: ldc 147
    //   162: new 85	java/lang/StringBuilder
    //   165: dup
    //   166: invokespecial 86	java/lang/StringBuilder:<init>	()V
    //   169: ldc 155
    //   171: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   174: aload 5
    //   176: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   179: ldc 157
    //   181: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   184: aload 4
    //   186: invokestatic 162	com/a/a/i/i:a	(Landroid/graphics/Bitmap;)I
    //   189: invokevirtual 99	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   192: ldc 164
    //   194: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   197: lload 7
    //   199: invokestatic 167	com/a/a/i/d:a	(J)D
    //   202: invokevirtual 170	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   205: ldc 172
    //   207: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   210: aload_3
    //   211: getstatic 38	com/a/a/c/d/a/c:b	Lcom/a/a/c/i;
    //   214: invokevirtual 51	com/a/a/c/j:a	(Lcom/a/a/c/i;)Ljava/lang/Object;
    //   217: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   220: ldc 174
    //   222: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   225: aload 4
    //   227: invokevirtual 59	android/graphics/Bitmap:hasAlpha	()Z
    //   230: invokevirtual 177	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   233: invokevirtual 113	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   236: invokestatic 181	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   239: pop
    //   240: invokestatic 183	android/support/v4/os/c:a	()V
    //   243: iload 14
    //   245: ireturn
    //   246: astore 11
    //   248: aconst_null
    //   249: astore 10
    //   251: ldc 147
    //   253: iconst_3
    //   254: invokestatic 153	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   257: ifeq +13 -> 270
    //   260: ldc 147
    //   262: ldc 185
    //   264: aload 11
    //   266: invokestatic 188	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   269: pop
    //   270: aload 10
    //   272: ifnull +68 -> 340
    //   275: aload 10
    //   277: invokevirtual 145	java/io/OutputStream:close	()V
    //   280: iconst_0
    //   281: istore 14
    //   283: goto -132 -> 151
    //   286: astore 16
    //   288: iconst_0
    //   289: istore 14
    //   291: goto -140 -> 151
    //   294: astore 12
    //   296: aconst_null
    //   297: astore 10
    //   299: aload 10
    //   301: ifnull +8 -> 309
    //   304: aload 10
    //   306: invokevirtual 145	java/io/OutputStream:close	()V
    //   309: aload 12
    //   311: athrow
    //   312: astore 6
    //   314: invokestatic 183	android/support/v4/os/c:a	()V
    //   317: aload 6
    //   319: athrow
    //   320: astore 19
    //   322: goto -171 -> 151
    //   325: astore 13
    //   327: goto -18 -> 309
    //   330: astore 12
    //   332: goto -33 -> 299
    //   335: astore 11
    //   337: goto -86 -> 251
    //   340: iconst_0
    //   341: istore 14
    //   343: goto -192 -> 151
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	346	0	this	c
    //   0	346	1	paramu	com.a.a.c.b.u<Bitmap>
    //   0	346	2	paramFile	java.io.File
    //   0	346	3	paramj	j
    //   9	217	4	localBitmap	Bitmap
    //   18	157	5	localCompressFormat	Bitmap.CompressFormat
    //   312	6	6	localObject1	Object
    //   72	126	7	l	long
    //   87	39	9	i	int
    //   97	208	10	localObject2	Object
    //   246	19	11	localIOException1	java.io.IOException
    //   335	1	11	localIOException2	java.io.IOException
    //   294	16	12	localObject3	Object
    //   330	1	12	localObject4	Object
    //   325	1	13	localIOException3	java.io.IOException
    //   139	203	14	bool	boolean
    //   286	1	16	localIOException4	java.io.IOException
    //   320	1	19	localIOException5	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   89	99	246	java/io/IOException
    //   275	280	286	java/io/IOException
    //   89	99	294	finally
    //   69	89	312	finally
    //   146	151	312	finally
    //   151	240	312	finally
    //   275	280	312	finally
    //   304	309	312	finally
    //   309	312	312	finally
    //   146	151	320	java/io/IOException
    //   304	309	325	java/io/IOException
    //   99	121	330	finally
    //   121	138	330	finally
    //   251	270	330	finally
    //   99	121	335	java/io/IOException
    //   121	138	335	java/io/IOException
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.d.a.c
 * JD-Core Version:    0.7.0.1
 */