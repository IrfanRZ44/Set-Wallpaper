package com.google.android.gms.internal.ads;

final class aej
  extends aeg
{
  private static int a(byte[] paramArrayOfByte, int paramInt1, long paramLong, int paramInt2)
  {
    switch (paramInt2)
    {
    default: 
      throw new AssertionError();
    case 0: 
      return aef.a(paramInt1);
    case 1: 
      return aef.a(paramInt1, aed.a(paramArrayOfByte, paramLong));
    }
    return aef.a(paramInt1, aed.a(paramArrayOfByte, paramLong), aed.a(paramArrayOfByte, 1L + paramLong));
  }
  
  final int a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    if ((paramInt2 | paramInt3 | paramArrayOfByte.length - paramInt3) < 0)
    {
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = Integer.valueOf(paramArrayOfByte.length);
      arrayOfObject[1] = Integer.valueOf(paramInt2);
      arrayOfObject[2] = Integer.valueOf(paramInt3);
      throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", arrayOfObject));
    }
    long l1 = paramInt2;
    int i = (int)(paramInt3 - l1);
    int j;
    long l3;
    int m;
    if (i < 16)
    {
      j = 0;
      int k = i - j;
      l3 = l1 + j;
      m = k;
    }
    label182:
    label251:
    label253:
    long l6;
    label349:
    label351:
    do
    {
      int n;
      long l4;
      int i1;
      long l7;
      do
      {
        do
        {
          n = 0;
          l4 = l3;
          for (;;)
          {
            if (m > 0)
            {
              long l8 = 1L + l4;
              n = aed.a(paramArrayOfByte, l4);
              if (n >= 0)
              {
                m--;
                l4 = l8;
                continue;
                j = 0;
                long l9;
                for (long l2 = l1;; l2 = l9)
                {
                  if (j >= i) {
                    break label182;
                  }
                  l9 = 1L + l2;
                  if (aed.a(paramArrayOfByte, l2) < 0) {
                    break;
                  }
                  j++;
                }
                j = i;
                break;
              }
              l4 = l8;
            }
          }
          if (m == 0) {
            return 0;
          }
          i1 = m - 1;
          if (n >= -32) {
            break label253;
          }
          if (i1 == 0) {
            return n;
          }
          m = i1 - 1;
          if (n < -62) {
            break label251;
          }
          l3 = 1L + l4;
        } while (aed.a(paramArrayOfByte, l4) <= -65);
        return -1;
        if (n >= -16) {
          break label351;
        }
        if (i1 < 2) {
          return a(paramArrayOfByte, n, l4, i1);
        }
        m = i1 - 2;
        l7 = l4 + 1L;
        int i3 = aed.a(paramArrayOfByte, l4);
        if ((i3 > -65) || ((n == -32) && (i3 < -96)) || ((n == -19) && (i3 >= -96))) {
          break label349;
        }
        l3 = 1L + l7;
      } while (aed.a(paramArrayOfByte, l7) <= -65);
      return -1;
      if (i1 < 3) {
        return a(paramArrayOfByte, n, l4, i1);
      }
      m = i1 - 3;
      long l5 = 1L + l4;
      int i2 = aed.a(paramArrayOfByte, l4);
      if ((i2 > -65) || ((n << 28) + (i2 + 112) >> 30 != 0)) {
        break label446;
      }
      l6 = 1L + l5;
      if (aed.a(paramArrayOfByte, l5) > -65) {
        break label446;
      }
      l3 = 1L + l6;
    } while (aed.a(paramArrayOfByte, l6) <= -65);
    label446:
    return -1;
  }
  
  final int a(CharSequence paramCharSequence, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    long l1 = paramInt1;
    long l2 = l1 + paramInt2;
    int i = paramCharSequence.length();
    if ((i > paramInt2) || (paramArrayOfByte.length - paramInt2 < paramInt1))
    {
      char c1 = paramCharSequence.charAt(i - 1);
      int j = paramInt1 + paramInt2;
      throw new ArrayIndexOutOfBoundsException(37 + "Failed writing " + c1 + " at index " + j);
    }
    int k = 0;
    while (k < i)
    {
      int i1 = paramCharSequence.charAt(k);
      if (i1 >= 128) {
        break;
      }
      long l11 = 1L + l1;
      aed.a(paramArrayOfByte, l1, (byte)i1);
      k++;
      l1 = l11;
    }
    if (k == i) {
      return (int)l1;
    }
    for (;;)
    {
      if (k < i)
      {
        int m = paramCharSequence.charAt(k);
        Object localObject;
        long l7;
        if ((m < 128) && (localObject < l2))
        {
          l7 = 1L + localObject;
          aed.a(paramArrayOfByte, localObject, (byte)m);
        }
        for (;;)
        {
          k++;
          l3 = l7;
          break;
          if ((m < 2048) && (l3 <= l2 - 2L))
          {
            long l10 = l3 + 1L;
            aed.a(paramArrayOfByte, l3, (byte)(0x3C0 | m >>> 6));
            l7 = 1L + l10;
            aed.a(paramArrayOfByte, l10, (byte)(0x80 | m & 0x3F));
          }
          else if (((m < 55296) || (57343 < m)) && (l3 <= l2 - 3L))
          {
            long l8 = 1L + l3;
            aed.a(paramArrayOfByte, l3, (byte)(0x1E0 | m >>> 12));
            long l9 = 1L + l8;
            aed.a(paramArrayOfByte, l8, (byte)(0x80 | 0x3F & m >>> 6));
            l7 = 1L + l9;
            aed.a(paramArrayOfByte, l9, (byte)(0x80 | m & 0x3F));
          }
          else
          {
            if (l3 > l2 - 4L) {
              break label545;
            }
            char c2;
            if (k + 1 != i)
            {
              k++;
              c2 = paramCharSequence.charAt(k);
              if (Character.isSurrogatePair(m, c2)) {}
            }
            else
            {
              throw new aei(k - 1, i);
            }
            int n = Character.toCodePoint(m, c2);
            long l4 = 1L + l3;
            aed.a(paramArrayOfByte, l3, (byte)(0xF0 | n >>> 18));
            long l5 = 1L + l4;
            aed.a(paramArrayOfByte, l4, (byte)(0x80 | 0x3F & n >>> 12));
            long l6 = l5 + 1L;
            aed.a(paramArrayOfByte, l5, (byte)(0x80 | 0x3F & n >>> 6));
            l7 = 1L + l6;
            aed.a(paramArrayOfByte, l6, (byte)(0x80 | n & 0x3F));
          }
        }
        label545:
        if ((55296 <= m) && (m <= 57343) && ((k + 1 == i) || (!Character.isSurrogatePair(m, paramCharSequence.charAt(k + 1))))) {
          throw new aei(k, i);
        }
        throw new ArrayIndexOutOfBoundsException(46 + "Failed writing " + m + " at index " + l3);
      }
      return (int)l3;
      long l3 = l1;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aej
 * JD-Core Version:    0.7.0.1
 */