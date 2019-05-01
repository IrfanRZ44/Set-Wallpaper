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
public final class ath
  extends avh
  implements atu
{
  private String a;
  private List<ate> b;
  private String c;
  private aun d;
  private String e;
  private String f;
  private ata g;
  private Bundle h;
  private aqg i;
  private View j;
  private a k;
  private String l;
  private Object m = new Object();
  private atq n;
  
  public ath(String paramString1, List<ate> paramList, String paramString2, aun paramaun, String paramString3, String paramString4, ata paramata, Bundle paramBundle, aqg paramaqg, View paramView, a parama, String paramString5)
  {
    this.a = paramString1;
    this.b = paramList;
    this.c = paramString2;
    this.d = paramaun;
    this.e = paramString3;
    this.f = paramString4;
    this.g = paramata;
    this.h = paramBundle;
    this.i = paramaqg;
    this.j = paramView;
    this.k = parama;
    this.l = paramString5;
  }
  
  public final String a()
  {
    return this.a;
  }
  
  public final void a(Bundle paramBundle)
  {
    synchronized (this.m)
    {
      if (this.n == null)
      {
        je.c("#001 Attempt to perform click before app native ad initialized.");
        return;
      }
      this.n.b(paramBundle);
      return;
    }
  }
  
  public final void a(atq paramatq)
  {
    synchronized (this.m)
    {
      this.n = paramatq;
      return;
    }
  }
  
  public final List b()
  {
    return this.b;
  }
  
  public final boolean b(Bundle paramBundle)
  {
    synchronized (this.m)
    {
      if (this.n == null)
      {
        je.c("#002 Attempt to record impression before native ad initialized.");
        return false;
      }
      boolean bool = this.n.a(paramBundle);
      return bool;
    }
  }
  
  public final a c()
  {
    return this.k;
  }
  
  public final void c(Bundle paramBundle)
  {
    synchronized (this.m)
    {
      if (this.n == null)
      {
        je.c("#003 Attempt to report touch event before native ad initialized.");
        return;
      }
      this.n.c(paramBundle);
      return;
    }
  }
  
  public final String d()
  {
    return this.l;
  }
  
  public final String e()
  {
    return this.c;
  }
  
  public final aun f()
  {
    return this.d;
  }
  
  public final String g()
  {
    return this.e;
  }
  
  public final String h()
  {
    return this.f;
  }
  
  public final aqg i()
  {
    return this.i;
  }
  
  public final a j()
  {
    return b.a(this.n);
  }
  
  public final String k()
  {
    return "1";
  }
  
  public final String l()
  {
    return "";
  }
  
  public final ata m()
  {
    return this.g;
  }
  
  public final Bundle n()
  {
    return this.h;
  }
  
  public final View o()
  {
    return this.j;
  }
  
  public final auj p()
  {
    return this.g;
  }
  
  public final void q()
  {
    jn.a.post(new ati(this));
    this.a = null;
    this.b = null;
    this.c = null;
    this.d = null;
    this.e = null;
    this.f = null;
    this.g = null;
    this.h = null;
    this.m = null;
    this.i = null;
    this.j = null;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ath
 * JD-Core Version:    0.7.0.1
 */