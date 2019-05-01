package com.google.android.gms.internal.ads;

abstract class aeg
{
  abstract int a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3);
  
  abstract int a(CharSequence paramCharSequence, byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  final boolean a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = a(0, paramArrayOfByte, paramInt1, paramInt2);
    boolean bool = false;
    if (i == 0) {
      bool = true;
    }
    return bool;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aeg
 * JD-Core Version:    0.7.0.1
 */