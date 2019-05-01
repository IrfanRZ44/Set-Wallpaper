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
public final class atm
  extends awl
  implements atu
{
  private String a;
  private List<ate> b;
  private String c;
  private aun d;
  private String e;
  private String f;
  private double g;
  private String h;
  private String i;
  private ata j;
  private aqg k;
  private View l;
  private a m;
  private String n;
  private Bundle o;
  private Object p = new Object();
  private atq q;
  
  public atm(String paramString1, List<ate> paramList, String paramString2, aun paramaun, String paramString3, String paramString4, double paramDouble, String paramString5, String paramString6, ata paramata, aqg paramaqg, View paramView, a parama, String paramString7, Bundle paramBundle)
  {
    this.a = paramString1;
    this.b = paramList;
    this.c = paramString2;
    this.d = paramaun;
    this.e = paramString3;
    this.f = paramString4;
    this.g = paramDouble;
    this.h = paramString5;
    this.i = paramString6;
    this.j = paramata;
    this.k = paramaqg;
    this.l = paramView;
    this.m = parama;
    this.n = paramString7;
    this.o = paramBundle;
  }
  
  public final String a()
  {
    return this.a;
  }
  
  public final void a(Bundle paramBundle)
  {
    synchronized (this.p)
    {
      if (this.q == null)
      {
        je.c("#001 Attempt to perform click before app native ad initialized.");
        return;
      }
      this.q.b(paramBundle);
      return;
    }
  }
  
  public final void a(atq paramatq)
  {
    synchronized (this.p)
    {
      this.q = paramatq;
      return;
    }
  }
  
  public final void a(awh paramawh)
  {
    this.q.a(paramawh);
  }
  
  public final List b()
  {
    return this.b;
  }
  
  public final boolean b(Bundle paramBundle)
  {
    synchronized (this.p)
    {
      if (this.q == null)
      {
        je.c("#002 Attempt to record impression before native ad initialized.");
        return false;
      }
      boolean bool = this.q.a(paramBundle);
      return bool;
    }
  }
  
  public final String c()
  {
    return this.c;
  }
  
  public final void c(Bundle paramBundle)
  {
    synchronized (this.p)
    {
      if (this.q == null)
      {
        je.c("#003 Attempt to report touch event before native ad initialized.");
        return;
      }
      this.q.c(paramBundle);
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
  
  public final String f()
  {
    return this.f;
  }
  
  public final double g()
  {
    return this.g;
  }
  
  public final String h()
  {
    return this.h;
  }
  
  public final String i()
  {
    return this.i;
  }
  
  public final aqg j()
  {
    return this.k;
  }
  
  public final String k()
  {
    return "6";
  }
  
  public final String l()
  {
    return "";
  }
  
  public final ata m()
  {
    return this.j;
  }
  
  public final a n()
  {
    return b.a(this.q);
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
  
  public final Bundle r()
  {
    return this.o;
  }
  
  public final auj s()
  {
    return this.j;
  }
  
  public final void t()
  {
    jn.a.post(new atn(this));
  }
  
  public final void u()
  {
    this.q.c();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.atm
 * JD-Core Version:    0.7.0.1
 */