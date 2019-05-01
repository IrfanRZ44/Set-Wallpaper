package com.naing.b;

public class a
{
  private static final byte[] b;
  private static final byte[] c;
  private static final byte[] d;
  private static final byte[] e;
  
  static
  {
    if (!a.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      a = bool;
      b = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
      c = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95 };
      d = new byte[] { -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9 };
      e = new byte[] { -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9 };
      return;
    }
  }
  
  private static int a(byte[] paramArrayOfByte1, int paramInt1, byte[] paramArrayOfByte2, int paramInt2, byte[] paramArrayOfByte3)
  {
    if (paramArrayOfByte1[(paramInt1 + 2)] == 61)
    {
      paramArrayOfByte2[paramInt2] = ((byte)((paramArrayOfByte3[paramArrayOfByte1[paramInt1]] << 24 >>> 6 | paramArrayOfByte3[paramArrayOfByte1[(paramInt1 + 1)]] << 24 >>> 12) >>> 16));
      return 1;
    }
    if (paramArrayOfByte1[(paramInt1 + 3)] == 61)
    {
      int j = paramArrayOfByte3[paramArrayOfByte1[paramInt1]] << 24 >>> 6 | paramArrayOfByte3[paramArrayOfByte1[(paramInt1 + 1)]] << 24 >>> 12 | paramArrayOfByte3[paramArrayOfByte1[(paramInt1 + 2)]] << 24 >>> 18;
      paramArrayOfByte2[paramInt2] = ((byte)(j >>> 16));
      paramArrayOfByte2[(paramInt2 + 1)] = ((byte)(j >>> 8));
      return 2;
    }
    int i = paramArrayOfByte3[paramArrayOfByte1[paramInt1]] << 24 >>> 6 | paramArrayOfByte3[paramArrayOfByte1[(paramInt1 + 1)]] << 24 >>> 12 | paramArrayOfByte3[paramArrayOfByte1[(paramInt1 + 2)]] << 24 >>> 18 | paramArrayOfByte3[paramArrayOfByte1[(paramInt1 + 3)]] << 24 >>> 24;
    paramArrayOfByte2[paramInt2] = ((byte)(i >> 16));
    paramArrayOfByte2[(paramInt2 + 1)] = ((byte)(i >> 8));
    paramArrayOfByte2[(paramInt2 + 2)] = ((byte)i);
    return 3;
  }
  
  public static byte[] a(String paramString)
  {
    byte[] arrayOfByte = paramString.getBytes();
    return a(arrayOfByte, 0, arrayOfByte.length);
  }
  
  public static byte[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return a(paramArrayOfByte, paramInt1, paramInt2, d);
  }
  
  public static byte[] a(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2)
  {
    byte[] arrayOfByte1 = new byte[2 + paramInt2 * 3 / 4];
    byte[] arrayOfByte2 = new byte[4];
    int i = 0;
    int j = 0;
    int k = 0;
    int i1;
    int i2;
    if (i < paramInt2)
    {
      int m = (byte)(0x7F & paramArrayOfByte1[(i + paramInt1)]);
      int n = paramArrayOfByte2[m];
      if (n >= -5)
      {
        if (n < -1) {
          break label397;
        }
        if (m == 61)
        {
          int i3 = paramInt2 - i;
          int i4 = (byte)(0x7F & paramArrayOfByte1[(paramInt1 + (paramInt2 - 1))]);
          if ((j == 0) || (j == 1)) {
            throw new b("invalid padding byte '=' at byte offset " + i);
          }
          if (((j == 3) && (i3 > 2)) || ((j == 4) && (i3 > 1))) {
            throw new b("padding byte '=' falsely signals end of encoded value at offset " + i);
          }
          if ((i4 == 61) || (i4 == 10)) {
            break label302;
          }
          throw new b("encoded value has invalid trailing byte");
        }
        i1 = j + 1;
        arrayOfByte2[j] = m;
        if (i1 != 4) {
          break label390;
        }
        i2 = k + a(arrayOfByte2, 0, arrayOfByte1, k, paramArrayOfByte2);
        i1 = 0;
      }
    }
    for (;;)
    {
      i++;
      k = i2;
      j = i1;
      break;
      throw new b("Bad Base64 input character at " + i + ": " + paramArrayOfByte1[(i + paramInt1)] + "(decimal)");
      label302:
      if (j != 0)
      {
        if (j == 1) {
          throw new b("single trailing character at offset " + (paramInt2 - 1));
        }
        (j + 1);
        arrayOfByte2[j] = 61;
        k += a(arrayOfByte2, 0, arrayOfByte1, k, paramArrayOfByte2);
      }
      byte[] arrayOfByte3 = new byte[k];
      System.arraycopy(arrayOfByte1, 0, arrayOfByte3, 0, k);
      return arrayOfByte3;
      label390:
      i2 = k;
      continue;
      label397:
      i1 = j;
      i2 = k;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.naing.b.a
 * JD-Core Version:    0.7.0.1
 */