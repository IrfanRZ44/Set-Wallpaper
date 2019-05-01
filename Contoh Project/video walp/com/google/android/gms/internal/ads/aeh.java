package com.google.android.gms.internal.ads;

final class aeh
  extends aeg
{
  final int a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    for (int i = paramInt2; (i < paramInt3) && (paramArrayOfByte[i] >= 0); i++) {}
    int k;
    label36:
    int j;
    if (i >= paramInt3)
    {
      k = 0;
      return k;
      i = j;
    }
    label102:
    label104:
    int i1;
    label191:
    label193:
    do
    {
      int i2;
      do
      {
        do
        {
          if (i >= paramInt3) {
            return 0;
          }
          j = i + 1;
          k = paramArrayOfByte[i];
          if (k >= 0) {
            break label36;
          }
          if (k >= -32) {
            break label104;
          }
          if (j >= paramInt3) {
            break;
          }
          if (k < -62) {
            break label102;
          }
          i = j + 1;
        } while (paramArrayOfByte[j] <= -65);
        return -1;
        if (k >= -16) {
          break label193;
        }
        if (j >= paramInt3 - 1) {
          return aef.b(paramArrayOfByte, j, paramInt3);
        }
        i2 = j + 1;
        int i3 = paramArrayOfByte[j];
        if ((i3 > -65) || ((k == -32) && (i3 < -96)) || ((k == -19) && (i3 >= -96))) {
          break label191;
        }
        i = i2 + 1;
      } while (paramArrayOfByte[i2] <= -65);
      return -1;
      if (j >= paramInt3 - 2) {
        return aef.b(paramArrayOfByte, j, paramInt3);
      }
      int m = j + 1;
      int n = paramArrayOfByte[j];
      if ((n > -65) || ((k << 28) + (n + 112) >> 30 != 0)) {
        break label277;
      }
      i1 = m + 1;
      if (paramArrayOfByte[m] > -65) {
        break label277;
      }
      i = i1 + 1;
    } while (paramArrayOfByte[i1] <= -65);
    label277:
    return -1;
  }
  
  final int a(CharSequence paramCharSequence, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = paramCharSequence.length();
    int j = 0;
    int k = paramInt1 + paramInt2;
    while ((j < i) && (j + paramInt1 < k))
    {
      int i9 = paramCharSequence.charAt(j);
      if (i9 >= 128) {
        break;
      }
      paramArrayOfByte[(paramInt1 + j)] = ((byte)i9);
      j++;
    }
    if (j == i) {
      return paramInt1 + i;
    }
    int m = paramInt1 + j;
    if (j < i)
    {
      int n = paramCharSequence.charAt(j);
      int i5;
      if ((n < 128) && (m < k))
      {
        i5 = m + 1;
        paramArrayOfByte[m] = ((byte)n);
      }
      for (;;)
      {
        j++;
        m = i5;
        break;
        if ((n < 2048) && (m <= k - 2))
        {
          int i8 = m + 1;
          paramArrayOfByte[m] = ((byte)(0x3C0 | n >>> 6));
          i5 = i8 + 1;
          paramArrayOfByte[i8] = ((byte)(0x80 | n & 0x3F));
        }
        else if (((n < 55296) || (57343 < n)) && (m <= k - 3))
        {
          int i6 = m + 1;
          paramArrayOfByte[m] = ((byte)(0x1E0 | n >>> 12));
          int i7 = i6 + 1;
          paramArrayOfByte[i6] = ((byte)(0x80 | 0x3F & n >>> 6));
          i5 = i7 + 1;
          paramArrayOfByte[i7] = ((byte)(0x80 | n & 0x3F));
        }
        else
        {
          if (m > k - 4) {
            break label445;
          }
          char c;
          if (j + 1 != paramCharSequence.length())
          {
            j++;
            c = paramCharSequence.charAt(j);
            if (Character.isSurrogatePair(n, c)) {}
          }
          else
          {
            throw new aei(j - 1, i);
          }
          int i1 = Character.toCodePoint(n, c);
          int i2 = m + 1;
          paramArrayOfByte[m] = ((byte)(0xF0 | i1 >>> 18));
          int i3 = i2 + 1;
          paramArrayOfByte[i2] = ((byte)(0x80 | 0x3F & i1 >>> 12));
          int i4 = i3 + 1;
          paramArrayOfByte[i3] = ((byte)(0x80 | 0x3F & i1 >>> 6));
          i5 = i4 + 1;
          paramArrayOfByte[i4] = ((byte)(0x80 | i1 & 0x3F));
        }
      }
      label445:
      if ((55296 <= n) && (n <= 57343) && ((j + 1 == paramCharSequence.length()) || (!Character.isSurrogatePair(n, paramCharSequence.charAt(j + 1))))) {
        throw new aei(j, i);
      }
      throw new ArrayIndexOutOfBoundsException(37 + "Failed writing " + n + " at index " + m);
    }
    return m;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aeh
 * JD-Core Version:    0.7.0.1
 */