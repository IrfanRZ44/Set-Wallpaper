package com.google.android.gms.internal.ads;

public final class yu
{
  private final byte[] a;
  
  private yu(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.a = new byte[paramInt2];
    System.arraycopy(paramArrayOfByte, 0, this.a, 0, paramInt2);
  }
  
  public static yu a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    return new yu(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public final byte[] a()
  {
    byte[] arrayOfByte = new byte[this.a.length];
    System.arraycopy(this.a, 0, arrayOfByte, 0, this.a.length);
    return arrayOfByte;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.yu
 * JD-Core Version:    0.7.0.1
 */