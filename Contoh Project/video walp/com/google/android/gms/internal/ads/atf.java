package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public final class atf
  extends avd
  implements atu
{
  private String a;
  private List<ate> b;
  private String c;
  private aun d;
  private String e;
  private double f;
  private String g;
  private String h;
  private ata i;
  private Bundle j;
  private aqg k;
  private View l;
  private a m;
  private String n;
  private Object o = new Object();
  private atq p;
  
  public atf(String paramString1, List<ate> paramList, String paramString2, aun paramaun, String paramString3, double paramDouble, String paramString4, String paramString5, ata paramata, Bundle paramBundle, aqg paramaqg, View paramView, a parama, String paramString6)
  {
    this.a = paramString1;
    this.b = paramList;
    this.c = paramString2;
    this.d = paramaun;
    this.e = paramString3;
    this.f = paramDouble;
    this.g = paramString4;
    this.h = paramString5;
    this.i = paramata;
    this.j = paramBundle;
    this.k = paramaqg;
    this.l = paramView;
    this.m = parama;
    this.n = paramString6;
  }
  
  public final String a()
  {
    return this.a;
  }
  
  public final void a(Bundle paramBundle)
  {
    synchronized (this.o)
    {
      if (this.p == null)
      {
        je.c("#001 Attempt to perform click before app native ad initialized.");
        return;
      }
      this.p.b(paramBundle);
      return;
    }
  }
  
  public final void a(atq paramatq)
  {
    synchronized (this.o)
    {
      this.p = paramatq;
      return;
    }
  }
  
  public final List b()
  {
    return this.b;
  }
  
  public final boolean b(Bundle paramBundle)
  {
    synchronized (this.o)
    {
      if (this.p == null)
      {
        je.c("#002 Attempt to record impression before native ad initialized.");
        return false;
      }
      boolean bool = this.p.a(paramBundle);
      return bool;
    }
  }
  
  public final String c()
  {
    return this.c;
  }
  
  public final void c(Bundle paramBundle)
  {
    synchronized (this.o)
    {
      if (this.p == null)
      {
        je.c("#003 Attempt to report touch event before native ad initialized.");
        return;
      }
      this.p.c(paramBundle);
      return;
    }
  }
  
  public final aun d()
  {
    return this.d;
  }
  
  public final String e()
  {
    return this.e;
  }
  
  public final double f()
  {
    return this.f;
  }
  
  public final String g()
  {
    return this.g;
  }
  
  public final String h()
  {
    return this.h;
  }
  
  public final aqg i()
  {
    return this.k;
  }
  
  public final a j()
  {
    return b.a(this.p);
  }
  
  public final String k()
  {
    return "2";
  }
  
  public final String l()
  {
    return "";
  }
  
  public final ata m()
  {
    return this.i;
  }
  
  public final Bundle n()
  {
    return this.j;
  }
  
  public final View o()
  {
    return this.l;
  }
  
  public final a p()
  {
    return this.m;
  }
  
  public final String q()
  {
    return this.n;
  }
  
  public final auj r()
  {
    return this.i;
  }
  
  public final void s()
  {
    jn.a.post(new atg(this));
    this.a = null;
    this.b = null;
    this.c = null;
    this.d = null;
    this.e = null;
    this.f = 0.0D;
    this.g = null;
    this.h = null;
    this.i = null;
    this.j = null;
    this.o = null;
    this.k = null;
    this.l = null;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.atf
 * JD-Core Version:    0.7.0.1
 */