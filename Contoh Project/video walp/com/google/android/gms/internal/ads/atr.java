package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class atr
{
  public final int a;
  public final byte[] b;
  public final Map<String, String> c;
  public final List<apr> d;
  public final boolean e;
  private final long f;
  
  private atr(int paramInt, byte[] paramArrayOfByte, Map<String, String> paramMap, List<apr> paramList, boolean paramBoolean, long paramLong)
  {
    this.a = paramInt;
    this.b = paramArrayOfByte;
    this.c = paramMap;
    if (paramList == null) {}
    for (this.d = null;; this.d = Collections.unmodifiableList(paramList))
    {
      this.e = paramBoolean;
      this.f = paramLong;
      return;
    }
  }
  
  @Deprecated
  public atr(int paramInt, byte[] paramArrayOfByte, Map<String, String> paramMap, boolean paramBoolean, long paramLong) {}
  
  public atr(int paramInt, byte[] paramArrayOfByte, boolean paramBoolean, long paramLong, List<apr> paramList) {}
  
  @Deprecated
  public atr(byte[] paramArrayOfByte, Map<String, String> paramMap)
  {
    this(200, paramArrayOfByte, paramMap, false, 0L);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.atr
 * JD-Core Version:    0.7.0.1
 */