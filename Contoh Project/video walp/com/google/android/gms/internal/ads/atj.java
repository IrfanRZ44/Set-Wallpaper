package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.support.v4.f.m;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import java.util.Arrays;
import java.util.List;

@cm
public final class atj
  extends avl
  implements att
{
  private final ata a;
  private final String b;
  private final m<String, ate> c;
  private final m<String, String> d;
  private aqg e;
  private View f;
  private final Object g = new Object();
  private atq h;
  
  public atj(String paramString, m<String, ate> paramm, m<String, String> paramm1, ata paramata, aqg paramaqg, View paramView)
  {
    this.b = paramString;
    this.c = paramm;
    this.d = paramm1;
    this.a = paramata;
    this.e = paramaqg;
    this.f = paramView;
  }
  
  public final String a(String paramString)
  {
    return (String)this.d.get(paramString);
  }
  
  public final List<String> a()
  {
    String[] arrayOfString = new String[this.c.size() + this.d.size()];
    int i = 0;
    int j = 0;
    int m;
    for (;;)
    {
      int k = this.c.size();
      m = 0;
      if (i >= k) {
        break;
      }
      arrayOfString[j] = ((String)this.c.b(i));
      int n = i + 1;
      j++;
      i = n;
    }
    while (m < this.d.size())
    {
      arrayOfString[j] = ((String)this.d.b(m));
      m++;
      j++;
    }
    return Arrays.asList(arrayOfString);
  }
  
  public final void a(atq paramatq)
  {
    synchronized (this.g)
    {
      this.h = paramatq;
      return;
    }
  }
  
  public final boolean a(a parama)
  {
    if (this.h == null) {
      mk.c("Attempt to call renderVideoInMediaView before ad initialized.");
    }
    while (this.f == null) {
      return false;
    }
    atk localatk = new atk(this);
    FrameLayout localFrameLayout = (FrameLayout)b.a(parama);
    this.h.a(localFrameLayout, localatk);
    return true;
  }
  
  public final a b()
  {
    return b.a(this.h);
  }
  
  public final aun b(String paramString)
  {
    return (aun)this.c.get(paramString);
  }
  
  public final aqg c()
  {
    return this.e;
  }
  
  public final void c(String paramString)
  {
    synchronized (this.g)
    {
      if (this.h == null)
      {
        mk.c("#001 Attempt to perform click before app native ad initialized.");
        return;
      }
      this.h.a(null, paramString, null, null, null);
      return;
    }
  }
  
  public final void d()
  {
    synchronized (this.g)
    {
      if (this.h == null)
      {
        mk.c("#002 Attempt to record impression before native ad initialized.");
        return;
      }
      this.h.a(null, null);
      return;
    }
  }
  
  public final a e()
  {
    return b.a(this.h.m().getApplicationContext());
  }
  
  public final void f()
  {
    jn.a.post(new atl(this));
    this.e = null;
    this.f = null;
  }
  
  public final String k()
  {
    return "3";
  }
  
  public final String l()
  {
    return this.b;
  }
  
  public final ata m()
  {
    return this.a;
  }
  
  public final View o()
  {
    return this.f;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.atj
 * JD-Core Version:    0.7.0.1
 */