package com.google.android.gms.internal.ads;

final class aef
{
  private static final aeg a;
  
  static
  {
    int i;
    if ((aed.a()) && (aed.b()))
    {
      i = 1;
      if (i == 0) {
        break label36;
      }
    }
    label36:
    for (Object localObject = new aej();; localObject = new aeh())
    {
      a = (aeg)localObject;
      return;
      i = 0;
      break;
    }
  }
  
  static int a(CharSequence paramCharSequence)
  {
    int i = 0;
    int j = paramCharSequence.length();
    for (int k = 0; (k < j) && (paramCharSequence.charAt(k) < ''); k++) {}
    for (;;)
    {
      if (k < j)
      {
        int i1 = paramCharSequence.charAt(k);
        if (i1 < 2048)
        {
          m += (127 - i1 >>> 31);
          k++;
          continue;
        }
        int i2 = paramCharSequence.length();
        if (k < i2)
        {
          int i3 = paramCharSequence.charAt(k);
          if (i3 < 2048) {
            i += (127 - i3 >>> 31);
          }
          for (;;)
          {
            k++;
            break;
            i += 2;
            if ((55296 <= i3) && (i3 <= 57343))
            {
              if (Character.codePointAt(paramCharSequence, k) < 65536) {
                throw new aei(k, i2);
              }
              k++;
            }
          }
        }
      }
      for (int n = m + i;; n = m)
      {
        if (n < j)
        {
          long l = 4294967296L + n;
          throw new IllegalArgumentException(54 + "UTF-8 length does not fit in int: " + l);
        }
        return n;
      }
      int m = j;
    }
  }
  
  static int a(CharSequence paramCharSequence, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return a.a(paramCharSequence, paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public static boolean a(byte[] paramArrayOfByte)
  {
    return a.a(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static boolean a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return a.a(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  private static int b(int paramInt)
  {
    if (paramInt > -12) {
      paramInt = -1;
    }
    return paramInt;
  }
  
  private static int b(int paramInt1, int paramInt2)
  {
    if ((paramInt1 > -12) || (paramInt2 > -65)) {
      return -1;
    }
    return paramInt1 ^ paramInt2 << 8;
  }
  
  private static int b(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 > -12) || (paramInt2 > -65) || (paramInt3 > -65)) {
      return -1;
    }
    return paramInt1 ^ paramInt2 << 8 ^ paramInt3 << 16;
  }
  
  private static int c(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = paramArrayOfByte[(paramInt1 - 1)];
    switch (paramInt2 - paramInt1)
    {
    default: 
      throw new AssertionError();
    case 0: 
      return b(i);
    case 1: 
      return b(i, paramArrayOfByte[paramInt1]);
    }
    return b(i, paramArrayOfByte[paramInt1], paramArrayOfByte[(paramInt1 + 1)]);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aef
 * JD-Core Version:    0.7.0.1
 */