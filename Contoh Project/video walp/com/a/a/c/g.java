package com.a.a.c;

import com.a.a.c.b.a.b;
import com.a.a.c.d.a.q;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class g
{
  public static f.a a(List<f> paramList, InputStream paramInputStream, b paramb)
  {
    if (paramInputStream == null) {
      return f.a.h;
    }
    if (!paramInputStream.markSupported()) {
      paramInputStream = new q(paramInputStream, paramb);
    }
    paramInputStream.mark(5242880);
    int i = paramList.size();
    int j = 0;
    while (j < i)
    {
      f localf = (f)paramList.get(j);
      try
      {
        f.a locala1 = localf.a(paramInputStream);
        f.a locala2 = f.a.h;
        if (locala1 != locala2) {
          return locala1;
        }
        paramInputStream.reset();
        j++;
      }
      finally
      {
        paramInputStream.reset();
      }
    }
    return f.a.h;
  }
  
  public static f.a a(List<f> paramList, ByteBuffer paramByteBuffer)
  {
    f.a locala;
    if (paramByteBuffer == null)
    {
      locala = f.a.h;
      return locala;
    }
    int i = paramList.size();
    for (int j = 0;; j++)
    {
      if (j >= i) {
        break label58;
      }
      locala = ((f)paramList.get(j)).a(paramByteBuffer);
      if (locala != f.a.h) {
        break;
      }
    }
    label58:
    return f.a.h;
  }
  
  public static int b(List<f> paramList, InputStream paramInputStream, b paramb)
  {
    if (paramInputStream == null) {
      return -1;
    }
    if (!paramInputStream.markSupported()) {
      paramInputStream = new q(paramInputStream, paramb);
    }
    paramInputStream.mark(5242880);
    int i = paramList.size();
    int j = 0;
    while (j < i)
    {
      f localf = (f)paramList.get(j);
      try
      {
        int k = localf.a(paramInputStream, paramb);
        if (k != -1) {
          return k;
        }
        paramInputStream.reset();
        j++;
      }
      finally
      {
        paramInputStream.reset();
      }
    }
    return -1;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.g
 * JD-Core Version:    0.7.0.1
 */