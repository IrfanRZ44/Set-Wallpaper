package com.google.android.gms.internal.ads;

import java.io.IOException;

public abstract class zl<MessageType extends zl<MessageType, BuilderType>, BuilderType extends zm<MessageType, BuilderType>>
  implements acl
{
  private static boolean zzdpg = false;
  protected int zzdpf = 0;
  
  void a(int paramInt)
  {
    throw new UnsupportedOperationException();
  }
  
  public final zw h()
  {
    try
    {
      aab localaab = zw.b(l());
      a(localaab.b());
      zw localzw = localaab.a();
      return localzw;
    }
    catch (IOException localIOException)
    {
      String str = getClass().getName();
      throw new RuntimeException(62 + String.valueOf(str).length() + String.valueOf("ByteString").length() + "Serializing " + str + " to a " + "ByteString" + " threw an IOException (should never happen).", localIOException);
    }
  }
  
  public final byte[] i()
  {
    try
    {
      byte[] arrayOfByte = new byte[l()];
      aak localaak = aak.a(arrayOfByte);
      a(localaak);
      localaak.b();
      return arrayOfByte;
    }
    catch (IOException localIOException)
    {
      String str = getClass().getName();
      throw new RuntimeException(62 + String.valueOf(str).length() + String.valueOf("byte array").length() + "Serializing " + str + " to a " + "byte array" + " threw an IOException (should never happen).", localIOException);
    }
  }
  
  int j()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.zl
 * JD-Core Version:    0.7.0.1
 */