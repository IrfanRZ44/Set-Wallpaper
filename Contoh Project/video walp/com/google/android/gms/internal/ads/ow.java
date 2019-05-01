package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import java.util.concurrent.TimeUnit;

@cm
@TargetApi(14)
public final class ow
{
  private final long a;
  private long b;
  private boolean c;
  
  ow()
  {
    TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
    arq localarq = asa.x;
    this.a = localTimeUnit.toNanos(((Long)aos.f().a(localarq)).longValue());
    this.c = true;
  }
  
  public final void a()
  {
    this.c = true;
  }
  
  public final void a(SurfaceTexture paramSurfaceTexture, om paramom)
  {
    if (paramom == null) {}
    long l;
    do
    {
      return;
      l = paramSurfaceTexture.getTimestamp();
    } while ((!this.c) && (Math.abs(l - this.b) < this.a));
    this.c = false;
    this.b = l;
    jn.a.post(new ox(this, paramom));
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ow
 * JD-Core Version:    0.7.0.1
 */