package com.google.android.gms.internal.ads;

import java.io.IOException;

public abstract class afc
{
  protected volatile int Z = -1;
  
  public static final <T extends afc> T a(T paramT, byte[] paramArrayOfByte)
  {
    return a(paramT, paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  private static final <T extends afc> T a(T paramT, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      aes localaes = aes.a(paramArrayOfByte, 0, paramInt2);
      paramT.a(localaes);
      localaes.a(0);
      return paramT;
    }
    catch (afb localafb)
    {
      throw localafb;
    }
    catch (IOException localIOException)
    {
      throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", localIOException);
    }
  }
  
  public static final byte[] a(afc paramafc)
  {
    byte[] arrayOfByte = new byte[paramafc.d()];
    int i = arrayOfByte.length;
    try
    {
      aeu localaeu = aeu.a(arrayOfByte, 0, i);
      paramafc.a(localaeu);
      localaeu.a();
      return arrayOfByte;
    }
    catch (IOException localIOException)
    {
      throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", localIOException);
    }
  }
  
  protected int a()
  {
    return 0;
  }
  
  public abstract afc a(aes paramaes);
  
  public void a(aeu paramaeu) {}
  
  public afc c()
  {
    return (afc)super.clone();
  }
  
  public final int d()
  {
    int i = a();
    this.Z = i;
    return i;
  }
  
  public String toString()
  {
    return afd.a(this);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.afc
 * JD-Core Version:    0.7.0.1
 */