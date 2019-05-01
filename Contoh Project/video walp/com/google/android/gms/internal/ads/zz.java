package com.google.android.gms.internal.ads;

final class zz
  extends aad
{
  private final int c;
  private final int d;
  
  zz(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    super(paramArrayOfByte);
    b(paramInt1, paramInt1 + paramInt2, paramArrayOfByte.length);
    this.c = paramInt1;
    this.d = paramInt2;
  }
  
  public final byte a(int paramInt)
  {
    int i = a();
    if ((paramInt | i - (paramInt + 1)) < 0)
    {
      if (paramInt < 0) {
        throw new ArrayIndexOutOfBoundsException(22 + "Index < 0: " + paramInt);
      }
      throw new ArrayIndexOutOfBoundsException(40 + "Index > length: " + paramInt + ", " + i);
    }
    return this.b[(paramInt + this.c)];
  }
  
  public final int a()
  {
    return this.d;
  }
  
  protected final void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    System.arraycopy(this.b, g(), paramArrayOfByte, 0, paramInt3);
  }
  
  protected final int g()
  {
    return this.c;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.zz
 * JD-Core Version:    0.7.0.1
 */