package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

final class mf
{
  long a;
  final String b;
  final String c;
  final long d;
  final long e;
  final long f;
  final long g;
  final List<apr> h;
  
  mf(String paramString, agn paramagn) {}
  
  private mf(String paramString1, String paramString2, long paramLong1, long paramLong2, long paramLong3, long paramLong4, List<apr> paramList)
  {
    this.b = paramString1;
    if ("".equals(paramString2)) {
      paramString2 = null;
    }
    this.c = paramString2;
    this.d = paramLong1;
    this.e = paramLong2;
    this.f = paramLong3;
    this.g = paramLong4;
    this.h = paramList;
  }
  
  static mf a(nf paramnf)
  {
    if (le.a(paramnf) != 538247942) {
      throw new IOException();
    }
    return new mf(le.a(paramnf), le.a(paramnf), le.b(paramnf), le.b(paramnf), le.b(paramnf), le.b(paramnf), le.b(paramnf));
  }
  
  final boolean a(OutputStream paramOutputStream)
  {
    for (;;)
    {
      try
      {
        le.a(paramOutputStream, 538247942);
        le.a(paramOutputStream, this.b);
        if (this.c == null)
        {
          str = "";
          le.a(paramOutputStream, str);
          le.a(paramOutputStream, this.d);
          le.a(paramOutputStream, this.e);
          le.a(paramOutputStream, this.f);
          le.a(paramOutputStream, this.g);
          List localList = this.h;
          if (localList == null) {
            break;
          }
          le.a(paramOutputStream, localList.size());
          Iterator localIterator = localList.iterator();
          if (!localIterator.hasNext()) {
            break label172;
          }
          apr localapr = (apr)localIterator.next();
          le.a(paramOutputStream, localapr.a());
          le.a(paramOutputStream, localapr.b());
          continue;
        }
        Object[] arrayOfObject;
        String str = this.c;
      }
      catch (IOException localIOException)
      {
        arrayOfObject = new Object[1];
        arrayOfObject[0] = localIOException.toString();
        eb.b("%s", arrayOfObject);
        return false;
      }
    }
    le.a(paramOutputStream, 0);
    label172:
    paramOutputStream.flush();
    return true;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.mf
 * JD-Core Version:    0.7.0.1
 */