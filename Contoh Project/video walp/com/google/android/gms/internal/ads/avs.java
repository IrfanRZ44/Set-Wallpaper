package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

public abstract class avs<T>
  implements Comparable<avs<T>>
{
  private final eb.a a;
  private final int b;
  private final String c;
  private final int d;
  private final Object e;
  private bcx f;
  private Integer g;
  private azu h;
  private boolean i;
  private boolean j;
  private boolean k;
  private boolean l;
  private ac m;
  private agn n;
  private axs o;
  
  public avs(int paramInt, String paramString, bcx parambcx)
  {
    eb.a locala;
    String str;
    if (eb.a.a)
    {
      locala = new eb.a();
      this.a = locala;
      this.e = new Object();
      this.i = true;
      this.j = false;
      this.k = false;
      this.l = false;
      this.n = null;
      this.b = paramInt;
      this.c = paramString;
      this.f = parambcx;
      this.m = new als();
      if (TextUtils.isEmpty(paramString)) {
        break label137;
      }
      Uri localUri = Uri.parse(paramString);
      if (localUri == null) {
        break label137;
      }
      str = localUri.getHost();
      if (str == null) {
        break label137;
      }
    }
    label137:
    for (int i1 = str.hashCode();; i1 = 0)
    {
      this.d = i1;
      return;
      locala = null;
      break;
    }
  }
  
  public final avs<?> a(int paramInt)
  {
    this.g = Integer.valueOf(paramInt);
    return this;
  }
  
  public final avs<?> a(agn paramagn)
  {
    this.n = paramagn;
    return this;
  }
  
  public final avs<?> a(azu paramazu)
  {
    this.h = paramazu;
    return this;
  }
  
  protected abstract bbw<T> a(atr paramatr);
  
  final void a(axs paramaxs)
  {
    synchronized (this.e)
    {
      this.o = paramaxs;
      return;
    }
  }
  
  final void a(bbw<?> parambbw)
  {
    synchronized (this.e)
    {
      axs localaxs = this.o;
      if (localaxs != null) {
        localaxs.a(this, parambbw);
      }
      return;
    }
  }
  
  public final void a(df paramdf)
  {
    synchronized (this.e)
    {
      bcx localbcx = this.f;
      if (localbcx != null) {
        localbcx.a(paramdf);
      }
      return;
    }
  }
  
  protected abstract void a(T paramT);
  
  public byte[] a()
  {
    return null;
  }
  
  public Map<String, String> b()
  {
    return Collections.emptyMap();
  }
  
  public final void b(String paramString)
  {
    if (eb.a.a) {
      this.a.a(paramString, Thread.currentThread().getId());
    }
  }
  
  public final int c()
  {
    return this.b;
  }
  
  final void c(String paramString)
  {
    if (this.h != null) {
      this.h.b(this);
    }
    long l1;
    if (eb.a.a)
    {
      l1 = Thread.currentThread().getId();
      if (Looper.myLooper() != Looper.getMainLooper()) {
        new Handler(Looper.getMainLooper()).post(new awt(this, paramString, l1));
      }
    }
    else
    {
      return;
    }
    this.a.a(paramString, l1);
    this.a.a(toString());
  }
  
  public final int d()
  {
    return this.d;
  }
  
  public final String e()
  {
    return this.c;
  }
  
  public final agn f()
  {
    return this.n;
  }
  
  public final boolean g()
  {
    synchronized (this.e)
    {
      return false;
    }
  }
  
  public final boolean h()
  {
    return this.i;
  }
  
  public final int i()
  {
    return this.m.a();
  }
  
  public final ac j()
  {
    return this.m;
  }
  
  public final void k()
  {
    synchronized (this.e)
    {
      this.k = true;
      return;
    }
  }
  
  public final boolean l()
  {
    synchronized (this.e)
    {
      boolean bool = this.k;
      return bool;
    }
  }
  
  final void m()
  {
    synchronized (this.e)
    {
      axs localaxs = this.o;
      if (localaxs != null) {
        localaxs.a(this);
      }
      return;
    }
  }
  
  public String toString()
  {
    String str1 = String.valueOf(Integer.toHexString(this.d));
    if (str1.length() != 0) {}
    for (String str2 = "0x".concat(str1);; str2 = new String("0x"))
    {
      String str3 = this.c;
      String str4 = String.valueOf(ayt.a);
      String str5 = String.valueOf(this.g);
      return 3 + String.valueOf("[ ] ").length() + String.valueOf(str3).length() + String.valueOf(str2).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + "[ ] " + str3 + " " + str2 + " " + str4 + " " + str5;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.avs
 * JD-Core Version:    0.7.0.1
 */