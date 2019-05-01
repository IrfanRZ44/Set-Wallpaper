package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@cm
public final class lm
{
  private Map<Integer, Bitmap> a = new ConcurrentHashMap();
  private AtomicInteger b = new AtomicInteger(0);
  
  public final int a(Bitmap paramBitmap)
  {
    if (paramBitmap == null)
    {
      je.b("Bitmap is null. Skipping putting into the Memory Map.");
      return -1;
    }
    int i = this.b.getAndIncrement();
    this.a.put(Integer.valueOf(i), paramBitmap);
    return i;
  }
  
  public final Bitmap a(Integer paramInteger)
  {
    return (Bitmap)this.a.get(paramInteger);
  }
  
  public final void b(Integer paramInteger)
  {
    this.a.remove(paramInteger);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.lm
 * JD-Core Version:    0.7.0.1
 */