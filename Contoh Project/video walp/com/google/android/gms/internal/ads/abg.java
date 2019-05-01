package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class abg
{
  static final Charset a = Charset.forName("UTF-8");
  public static final byte[] b;
  private static final Charset c = Charset.forName("ISO-8859-1");
  private static final ByteBuffer d;
  private static final aaf e;
  
  static
  {
    byte[] arrayOfByte1 = new byte[0];
    b = arrayOfByte1;
    d = ByteBuffer.wrap(arrayOfByte1);
    byte[] arrayOfByte2 = b;
    e = aaf.a(arrayOfByte2, 0, arrayOfByte2.length, false);
  }
  
  static int a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    for (int i = paramInt2; i < paramInt2 + paramInt3; i++) {
      paramInt1 = paramInt1 * 31 + paramArrayOfByte[i];
    }
    return paramInt1;
  }
  
  public static int a(long paramLong)
  {
    return (int)(paramLong ^ paramLong >>> 32);
  }
  
  public static int a(boolean paramBoolean)
  {
    if (paramBoolean) {
      return 1231;
    }
    return 1237;
  }
  
  static <T> T a(T paramT)
  {
    if (paramT == null) {
      throw new NullPointerException();
    }
    return paramT;
  }
  
  static Object a(Object paramObject1, Object paramObject2)
  {
    return ((acl)paramObject1).n().a((acl)paramObject2).d();
  }
  
  static <T> T a(T paramT, String paramString)
  {
    if (paramT == null) {
      throw new NullPointerException(paramString);
    }
    return paramT;
  }
  
  static boolean a(acl paramacl)
  {
    return false;
  }
  
  public static boolean a(byte[] paramArrayOfByte)
  {
    return aef.a(paramArrayOfByte);
  }
  
  public static String b(byte[] paramArrayOfByte)
  {
    return new String(paramArrayOfByte, a);
  }
  
  public static int c(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    int j = a(i, paramArrayOfByte, 0, i);
    if (j == 0) {
      j = 1;
    }
    return j;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.abg
 * JD-Core Version:    0.7.0.1
 */