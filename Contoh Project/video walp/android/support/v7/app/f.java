package android.support.v7.app;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.View;
import android.view.Window;
import android.view.Window.Callback;

class f
  extends AppCompatDelegateImplV9
{
  private int t = -100;
  private boolean u;
  private boolean v = true;
  private b w;
  
  f(Context paramContext, Window paramWindow, b paramb)
  {
    super(paramContext, paramWindow, paramb);
  }
  
  private boolean h(int paramInt)
  {
    Resources localResources = this.a.getResources();
    Configuration localConfiguration1 = localResources.getConfiguration();
    int i = 0x30 & localConfiguration1.uiMode;
    int j;
    if (paramInt == 2)
    {
      j = 32;
      if (i == j) {
        break label120;
      }
      if (!y()) {
        break label64;
      }
      ((Activity)this.a).recreate();
    }
    for (;;)
    {
      return true;
      j = 16;
      break;
      label64:
      Configuration localConfiguration2 = new Configuration(localConfiguration1);
      DisplayMetrics localDisplayMetrics = localResources.getDisplayMetrics();
      localConfiguration2.uiMode = (j | 0xFFFFFFCF & localConfiguration2.uiMode);
      localResources.updateConfiguration(localConfiguration2, localDisplayMetrics);
      if (Build.VERSION.SDK_INT < 26) {
        i.a(localResources);
      }
    }
    label120:
    return false;
  }
  
  private int w()
  {
    if (this.t != -100) {
      return this.t;
    }
    return j();
  }
  
  private void x()
  {
    if (this.w == null) {
      this.w = new b(l.a(this.a));
    }
  }
  
  private boolean y()
  {
    if ((this.u) && ((this.a instanceof Activity)))
    {
      PackageManager localPackageManager = this.a.getPackageManager();
      try
      {
        int i = localPackageManager.getActivityInfo(new ComponentName(this.a, this.a.getClass()), 0).configChanges;
        return (i & 0x200) == 0;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", localNameNotFoundException);
        return true;
      }
    }
    return false;
  }
  
  View a(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return null;
  }
  
  Window.Callback a(Window.Callback paramCallback)
  {
    return new a(paramCallback);
  }
  
  public void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if ((paramBundle != null) && (this.t == -100)) {
      this.t = paramBundle.getInt("appcompat:local_night_mode", -100);
    }
  }
  
  public void c()
  {
    super.c();
    i();
  }
  
  public void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    if (this.t != -100) {
      paramBundle.putInt("appcompat:local_night_mode", this.t);
    }
  }
  
  int d(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return paramInt;
    case 0: 
      x();
      return this.w.a();
    }
    return -1;
  }
  
  public void d()
  {
    super.d();
    if (this.w != null) {
      this.w.d();
    }
  }
  
  public void g()
  {
    super.g();
    if (this.w != null) {
      this.w.d();
    }
  }
  
  public boolean i()
  {
    int i = w();
    int j = d(i);
    boolean bool = false;
    if (j != -1) {
      bool = h(j);
    }
    if (i == 0)
    {
      x();
      this.w.c();
    }
    this.u = true;
    return bool;
  }
  
  public boolean o()
  {
    return this.v;
  }
  
  class a
    extends d.a
  {
    a(Window.Callback paramCallback)
    {
      super(paramCallback);
    }
    
    final ActionMode a(ActionMode.Callback paramCallback)
    {
      android.support.v7.view.f.a locala = new android.support.v7.view.f.a(f.this.a, paramCallback);
      android.support.v7.view.b localb = f.this.b(locala);
      if (localb != null) {
        return locala.b(localb);
      }
      return null;
    }
    
    public ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback)
    {
      if (f.this.o()) {
        return a(paramCallback);
      }
      return super.onWindowStartingActionMode(paramCallback);
    }
  }
  
  final class b
  {
    private l b;
    private boolean c;
    private BroadcastReceiver d;
    private IntentFilter e;
    
    b(l paraml)
    {
      this.b = paraml;
      this.c = paraml.a();
    }
    
    final int a()
    {
      this.c = this.b.a();
      if (this.c) {
        return 2;
      }
      return 1;
    }
    
    final void b()
    {
      boolean bool = this.b.a();
      if (bool != this.c)
      {
        this.c = bool;
        f.this.i();
      }
    }
    
    final void c()
    {
      d();
      if (this.d == null) {
        this.d = new BroadcastReceiver()
        {
          public void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
          {
            f.b.this.b();
          }
        };
      }
      if (this.e == null)
      {
        this.e = new IntentFilter();
        this.e.addAction("android.intent.action.TIME_SET");
        this.e.addAction("android.intent.action.TIMEZONE_CHANGED");
        this.e.addAction("android.intent.action.TIME_TICK");
      }
      f.this.a.registerReceiver(this.d, this.e);
    }
    
    final void d()
    {
      if (this.d != null)
      {
        f.this.a.unregisterReceiver(this.d);
        this.d = null;
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.app.f
 * JD-Core Version:    0.7.0.1
 */