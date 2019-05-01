package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class tu<P>
{
  private static final Charset a = Charset.forName("UTF-8");
  private ConcurrentMap<String, List<tv<P>>> b = new ConcurrentHashMap();
  private tv<P> c;
  
  public final tv<P> a()
  {
    return this.c;
  }
  
  protected final tv<P> a(P paramP, xc.b paramb)
  {
    byte[] arrayOfByte;
    switch (tl.a[paramb.e().ordinal()])
    {
    default: 
      throw new GeneralSecurityException("unknown output prefix type");
    case 1: 
    case 2: 
      arrayOfByte = ByteBuffer.allocate(5).put((byte)0).putInt(paramb.d()).array();
    }
    for (;;)
    {
      tv localtv = new tv(paramP, arrayOfByte, paramb.c(), paramb.e());
      ArrayList localArrayList1 = new ArrayList();
      localArrayList1.add(localtv);
      String str = new String(localtv.b(), a);
      List localList = (List)this.b.put(str, Collections.unmodifiableList(localArrayList1));
      if (localList != null)
      {
        ArrayList localArrayList2 = new ArrayList();
        localArrayList2.addAll(localList);
        localArrayList2.add(localtv);
        this.b.put(str, Collections.unmodifiableList(localArrayList2));
      }
      return localtv;
      arrayOfByte = ByteBuffer.allocate(5).put((byte)1).putInt(paramb.d()).array();
      continue;
      arrayOfByte = tk.a;
    }
  }
  
  protected final void a(tv<P> paramtv)
  {
    this.c = paramtv;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.tu
 * JD-Core Version:    0.7.0.1
 */