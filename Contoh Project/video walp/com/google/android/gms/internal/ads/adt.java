package com.google.android.gms.internal.ads;

final class adt
{
  static String a(zw paramzw)
  {
    adu localadu = new adu(paramzw);
    StringBuilder localStringBuilder = new StringBuilder(localadu.a());
    int i = 0;
    if (i < localadu.a())
    {
      int j = localadu.a(i);
      switch (j)
      {
      default: 
        if ((j >= 32) && (j <= 126)) {
          localStringBuilder.append((char)j);
        }
        break;
      }
      for (;;)
      {
        i++;
        break;
        localStringBuilder.append("\\a");
        continue;
        localStringBuilder.append("\\b");
        continue;
        localStringBuilder.append("\\f");
        continue;
        localStringBuilder.append("\\n");
        continue;
        localStringBuilder.append("\\r");
        continue;
        localStringBuilder.append("\\t");
        continue;
        localStringBuilder.append("\\v");
        continue;
        localStringBuilder.append("\\\\");
        continue;
        localStringBuilder.append("\\'");
        continue;
        localStringBuilder.append("\\\"");
        continue;
        localStringBuilder.append('\\');
        localStringBuilder.append((char)(48 + (0x3 & j >>> 6)));
        localStringBuilder.append((char)(48 + (0x7 & j >>> 3)));
        localStringBuilder.append((char)(48 + (j & 0x7)));
      }
    }
    return localStringBuilder.toString();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.adt
 * JD-Core Version:    0.7.0.1
 */