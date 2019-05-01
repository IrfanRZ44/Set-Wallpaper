package com.google.android.gms.internal.ads;

public final class zk
{
  private final byte[] a = new byte[256];
  private int b;
  private int c;
  
  public zk(byte[] paramArrayOfByte)
  {
    for (int i = 0; i < 256; i++) {
      this.a[i] = ((byte)i);
    }
    int j = 0;
    for (int k = 0; k < 256; k++)
    {
      j = 0xFF & j + this.a[k] + paramArrayOfByte[(k % paramArrayOfByte.length)];
      int m = this.a[k];
      this.a[k] = this.a[j];
      this.a[j] = m;
    }
    this.b = 0;
    this.c = 0;
  }
  
  public final void a(byte[] paramArrayOfByte)
  {
    int i = this.b;
    int j = this.c;
    for (int k = 0; k < paramArrayOfByte.length; k++)
    {
      i = 0xFF & i + 1;
      j = 0xFF & j + this.a[i];
      int m = this.a[i];
      this.a[i] = this.a[j];
      this.a[j] = m;
      paramArrayOfByte[k] = ((byte)(paramArrayOfByte[k] ^ this.a[(0xFF & this.a[i] + this.a[j])]));
    }
    this.b = i;
    this.c = j;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.zk
 * JD-Core Version:    0.7.0.1
 */