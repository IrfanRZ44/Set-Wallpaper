package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;

public abstract class c
{
  private static int a = -1;
  private static boolean b = false;
  
  public static c a(Activity paramActivity, b paramb)
  {
    return a(paramActivity, paramActivity.getWindow(), paramb);
  }
  
  public static c a(Dialog paramDialog, b paramb)
  {
    return a(paramDialog.getContext(), paramDialog.getWindow(), paramb);
  }
  
  private static c a(Context paramContext, Window paramWindow, b paramb)
  {
    if (Build.VERSION.SDK_INT >= 24) {
      return new e(paramContext, paramWindow, paramb);
    }
    if (Build.VERSION.SDK_INT >= 23) {
      return new g(paramContext, paramWindow, paramb);
    }
    return new f(paramContext, paramWindow, paramb);
  }
  
  public static int j()
  {
    return a;
  }
  
  public static boolean k()
  {
    return b;
  }
  
  public abstract ActionBar a();
  
  public abstract <T extends View> T a(int paramInt);
  
  public abstract void a(Configuration paramConfiguration);
  
  public abstract void a(Bundle paramBundle);
  
  public abstract void a(Toolbar paramToolbar);
  
  public abstract void a(View paramView);
  
  public abstract void a(View paramView, ViewGroup.LayoutParams paramLayoutParams);
  
  public abstract void a(CharSequence paramCharSequence);
  
  public abstract MenuInflater b();
  
  public abstract void b(int paramInt);
  
  public abstract void b(Bundle paramBundle);
  
  public abstract void b(View paramView, ViewGroup.LayoutParams paramLayoutParams);
  
  public abstract void c();
  
  public abstract void c(Bundle paramBundle);
  
  public abstract boolean c(int paramInt);
  
  public abstract void d();
  
  public abstract void e();
  
  public abstract void f();
  
  public abstract void g();
  
  public abstract void h();
  
  public abstract boolean i();
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.app.c
 * JD-Core Version:    0.7.0.1
 */