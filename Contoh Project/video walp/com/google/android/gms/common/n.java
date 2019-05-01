package com.google.android.gms.common;

import java.lang.ref.WeakReference;

abstract class n
  extends e.a
{
  private static final WeakReference<byte[]> b = new WeakReference(null);
  private WeakReference<byte[]> a = b;
  
  n(byte[] paramArrayOfByte)
  {
    super(paramArrayOfByte);
  }
  
  final byte[] a()
  {
    try
    {
      byte[] arrayOfByte = (byte[])this.a.get();
      if (arrayOfByte == null)
      {
        arrayOfByte = d();
        this.a = new WeakReference(arrayOfByte);
      }
      return arrayOfByte;
    }
    finally {}
  }
  
  protected abstract byte[] d();
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.n
 * JD-Core Version:    0.7.0.1
 */