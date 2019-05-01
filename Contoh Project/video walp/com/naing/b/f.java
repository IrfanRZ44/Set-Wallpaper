package com.naing.b;

import android.app.Activity;
import android.support.v7.app.a;
import android.support.v7.app.a.a;
import android.util.Log;
import com.naing.c.b;

public class f
{
  d.c a = new d.c()
  {
    public void a(e paramAnonymouse, g paramAnonymousg)
    {
      if (f.b(f.this) == null) {
        return;
      }
      if (paramAnonymouse.c())
      {
        Log.e("IabSetup", "Query inventory was failed.");
        f.a(f.this);
        return;
      }
      Log.e("IabSetup", "Query inventory was successful.");
      h localh = paramAnonymousg.a("premium");
      f localf = f.this;
      boolean bool;
      StringBuilder localStringBuilder;
      if ((localh != null) && (f.this.a(localh)))
      {
        bool = true;
        f.a(localf, bool);
        localStringBuilder = new StringBuilder().append("User is ");
        if (!f.c(f.this)) {
          break label150;
        }
      }
      label150:
      for (String str = "PREMIUM";; str = "NOT PREMIUM")
      {
        Log.e("IabSetup", str);
        f.a(f.this);
        Log.e("IabSetup", "Initial inventory query finished; enabling main UI.");
        return;
        bool = false;
        break;
      }
    }
  };
  d.a b = new d.a()
  {
    public void a(e paramAnonymouse, h paramAnonymoush)
    {
      if (f.b(f.this) == null) {}
      while ((paramAnonymouse.c()) || (!f.this.a(paramAnonymoush)) || (!paramAnonymoush.b().equals("premium"))) {
        return;
      }
      f.this.a(f.d(f.this).getString(2131558455));
      f.a(f.this, true);
      f.e(f.this);
    }
  };
  private d c = null;
  private a d = null;
  private boolean e = false;
  private Activity f;
  
  public f(Activity paramActivity)
  {
    this.f = paramActivity;
  }
  
  private void e()
  {
    if ((!this.e) && (this.d != null)) {
      this.d.b();
    }
    if (this.e) {
      f();
    }
  }
  
  private void f()
  {
    if (this.d != null) {
      this.d.a();
    }
  }
  
  public void a(a parama)
  {
    this.d = parama;
  }
  
  void a(String paramString)
  {
    new a.a(this.f).b(paramString).a(17039370, null).b().show();
  }
  
  public boolean a()
  {
    return this.e;
  }
  
  boolean a(h paramh)
  {
    return paramh.c().trim().equals("vwallpaper_premium_upgrade");
  }
  
  public void b()
  {
    Log.e("IabSetup", "Destroying helper.");
    if (this.c != null)
    {
      this.c.a();
      this.c = null;
    }
  }
  
  public void c()
  {
    try
    {
      Log.e("IabSetup", "Upgrade button clicked; launching purchase flow for upgrade.");
      this.c.a(this.f, "premium", 10001, this.b, "vwallpaper_premium_upgrade");
      return;
    }
    catch (Exception localException)
    {
      b.a(this.f, "Error : Unable to launch purchase flow");
    }
  }
  
  public void d()
  {
    try
    {
      String str = b.a(b.a(), b.c);
      this.c = new d(this.f, str);
      this.c.a(new d.b()
      {
        public void a(e paramAnonymouse)
        {
          if (!paramAnonymouse.b())
          {
            Log.e("IabSetup", "IabSetup was failed.");
            f.a(f.this);
          }
          while (f.b(f.this) == null) {
            return;
          }
          try
          {
            f.b(f.this).a(f.this.a);
            return;
          }
          catch (Exception localException) {}
        }
      });
      return;
    }
    catch (Exception localException)
    {
      this.c = null;
      e();
    }
  }
  
  public static abstract interface a
  {
    public abstract void a();
    
    public abstract void b();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.naing.b.f
 * JD-Core Version:    0.7.0.1
 */