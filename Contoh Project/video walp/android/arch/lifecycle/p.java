package android.arch.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;

public class p
  implements h
{
  private static final p i = new p();
  private int a = 0;
  private int b = 0;
  private boolean c = true;
  private boolean d = true;
  private Handler e;
  private final i f = new i(this);
  private Runnable g = new Runnable()
  {
    public void run()
    {
      p.a(p.this);
      p.b(p.this);
    }
  };
  private q.a h = new q.a()
  {
    public void a() {}
    
    public void b()
    {
      p.this.a();
    }
    
    public void c()
    {
      p.this.b();
    }
  };
  
  static void a(Context paramContext)
  {
    i.b(paramContext);
  }
  
  private void e()
  {
    if (this.b == 0)
    {
      this.c = true;
      this.f.a(e.a.ON_PAUSE);
    }
  }
  
  private void f()
  {
    if ((this.a == 0) && (this.c))
    {
      this.f.a(e.a.ON_STOP);
      this.d = true;
    }
  }
  
  void a()
  {
    this.a = (1 + this.a);
    if ((this.a == 1) && (this.d))
    {
      this.f.a(e.a.ON_START);
      this.d = false;
    }
  }
  
  void b()
  {
    this.b = (1 + this.b);
    if (this.b == 1)
    {
      if (this.c)
      {
        this.f.a(e.a.ON_RESUME);
        this.c = false;
      }
    }
    else {
      return;
    }
    this.e.removeCallbacks(this.g);
  }
  
  void b(Context paramContext)
  {
    this.e = new Handler();
    this.f.a(e.a.ON_CREATE);
    ((Application)paramContext.getApplicationContext()).registerActivityLifecycleCallbacks(new b()
    {
      public void onActivityCreated(Activity paramAnonymousActivity, Bundle paramAnonymousBundle)
      {
        q.b(paramAnonymousActivity).a(p.c(p.this));
      }
      
      public void onActivityPaused(Activity paramAnonymousActivity)
      {
        p.this.c();
      }
      
      public void onActivityStopped(Activity paramAnonymousActivity)
      {
        p.this.d();
      }
    });
  }
  
  void c()
  {
    this.b = (-1 + this.b);
    if (this.b == 0) {
      this.e.postDelayed(this.g, 700L);
    }
  }
  
  void d()
  {
    this.a = (-1 + this.a);
    f();
  }
  
  public e getLifecycle()
  {
    return this.f;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.arch.lifecycle.p
 * JD-Core Version:    0.7.0.1
 */