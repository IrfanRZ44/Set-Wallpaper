package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.nio.charset.Charset;

public abstract class zw
  implements Serializable, Iterable<Byte>
{
  public static final zw a = new aad(abg.b);
  private static final aaa b;
  private int c = 0;
  
  static
  {
    if (zr.a()) {}
    for (Object localObject = new aae(null);; localObject = new zy(null))
    {
      b = (aaa)localObject;
      return;
    }
  }
  
  public static zw a(String paramString)
  {
    return new aad(paramString.getBytes(abg.a));
  }
  
  public static zw a(byte[] paramArrayOfByte)
  {
    return a(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static zw a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return new aad(b.a(paramArrayOfByte, paramInt1, paramInt2));
  }
  
  static int b(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt2 - paramInt1;
    if ((i | paramInt1 | paramInt2 | paramInt3 - paramInt2) < 0)
    {
      if (paramInt1 < 0) {
        throw new IndexOutOfBoundsException(32 + "Beginning index: " + paramInt1 + " < 0");
      }
      if (paramInt2 < paramInt1) {
        throw new IndexOutOfBoundsException(66 + "Beginning index larger than ending index: " + paramInt1 + ", " + paramInt2);
      }
      throw new IndexOutOfBoundsException(37 + "End index: " + paramInt2 + " >= " + paramInt3);
    }
    return i;
  }
  
  static aab b(int paramInt)
  {
    return new aab(paramInt, null);
  }
  
  static zw b(byte[] paramArrayOfByte)
  {
    return new aad(paramArrayOfByte);
  }
  
  public abstract byte a(int paramInt);
  
  public abstract int a();
  
  protected abstract int a(int paramInt1, int paramInt2, int paramInt3);
  
  public abstract zw a(int paramInt1, int paramInt2);
  
  protected abstract String a(Charset paramCharset);
  
  abstract void a(zv paramzv);
  
  protected abstract void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3);
  
  public final byte[] b()
  {
    int i = a();
    if (i == 0) {
      return abg.b;
    }
    byte[] arrayOfByte = new byte[i];
    a(arrayOfByte, 0, 0, i);
    return arrayOfByte;
  }
  
  public final String c()
  {
    Charset localCharset = abg.a;
    if (a() == 0) {
      return "";
    }
    return a(localCharset);
  }
  
  public abstract boolean d();
  
  public abstract aaf e();
  
  public abstract boolean equals(Object paramObject);
  
  protected final int f()
  {
    return this.c;
  }
  
  public final int hashCode()
  {
    int i = this.c;
    if (i == 0)
    {
      int j = a();
      i = a(j, 0, j);
      if (i == 0) {
        i = 1;
      }
      this.c = i;
    }
    return i;
  }
  
  public final String toString()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.toHexString(System.identityHashCode(this));
    arrayOfObject[1] = Integer.valueOf(a());
    return String.format("<ByteString@%s size=%d>", arrayOfObject);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.zw
 * JD-Core Version:    0.7.0.1
 */