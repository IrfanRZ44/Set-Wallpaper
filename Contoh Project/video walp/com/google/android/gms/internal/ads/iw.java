package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.zzbv;
import javax.annotation.concurrent.GuardedBy;

@cm
public final class iw
{
  private final Object a = new Object();
  @GuardedBy("mLock")
  private int b;
  @GuardedBy("mLock")
  private int c;
  private final ix d;
  private final String e;
  
  private iw(ix paramix, String paramString)
  {
    this.d = paramix;
    this.e = paramString;
  }
  
  public iw(String paramString)
  {
    this(zzbv.zzep(), paramString);
  }
  
  public final String a()
  {
    return this.e;
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    synchronized (this.a)
    {
      this.b = paramInt1;
      this.c = paramInt2;
      this.d.a(this);
      return;
    }
  }
  
  public final Bundle b()
  {
    synchronized (this.a)
    {
      Bundle localBundle = new Bundle();
      localBundle.putInt("pmnli", this.b);
      localBundle.putInt("pmnll", this.c);
      return localBundle;
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    iw localiw;
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass())) {
        return false;
      }
      localiw = (iw)paramObject;
      if (this.e != null) {
        return this.e.equals(localiw.e);
      }
    } while (localiw.e == null);
    return false;
  }
  
  public final int hashCode()
  {
    if (this.e != null) {
      return this.e.hashCode();
    }
    return 0;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.iw
 * JD-Core Version:    0.7.0.1
 */