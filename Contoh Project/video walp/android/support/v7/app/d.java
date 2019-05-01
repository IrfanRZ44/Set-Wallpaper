package android.support.v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.view.b.a;
import android.support.v7.view.g;
import android.support.v7.view.i;
import android.support.v7.view.menu.h;
import android.support.v7.widget.TintTypedArray;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;
import android.view.Window.Callback;

abstract class d
  extends c
{
  private static boolean m;
  private static final boolean n;
  private static final int[] o;
  final Context a;
  final Window b;
  final Window.Callback c;
  final Window.Callback d;
  final b e;
  ActionBar f;
  MenuInflater g;
  boolean h;
  boolean i;
  boolean j;
  boolean k;
  boolean l;
  private CharSequence p;
  private boolean q;
  private boolean r;
  
  static
  {
    if (Build.VERSION.SDK_INT < 21) {}
    for (boolean bool = true;; bool = false)
    {
      n = bool;
      if ((n) && (!m))
      {
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler()
        {
          private boolean a(Throwable paramAnonymousThrowable)
          {
            boolean bool1 = paramAnonymousThrowable instanceof Resources.NotFoundException;
            boolean bool2 = false;
            if (bool1)
            {
              String str = paramAnonymousThrowable.getMessage();
              bool2 = false;
              if (str != null) {
                if (!str.contains("drawable"))
                {
                  boolean bool3 = str.contains("Drawable");
                  bool2 = false;
                  if (!bool3) {}
                }
                else
                {
                  bool2 = true;
                }
              }
            }
            return bool2;
          }
          
          public void uncaughtException(Thread paramAnonymousThread, Throwable paramAnonymousThrowable)
          {
            if (a(paramAnonymousThrowable))
            {
              Resources.NotFoundException localNotFoundException = new Resources.NotFoundException(paramAnonymousThrowable.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
              localNotFoundException.initCause(paramAnonymousThrowable.getCause());
              localNotFoundException.setStackTrace(paramAnonymousThrowable.getStackTrace());
              this.a.uncaughtException(paramAnonymousThread, localNotFoundException);
              return;
            }
            this.a.uncaughtException(paramAnonymousThread, paramAnonymousThrowable);
          }
        });
        m = true;
      }
      o = new int[] { 16842836 };
      return;
    }
  }
  
  d(Context paramContext, Window paramWindow, b paramb)
  {
    this.a = paramContext;
    this.b = paramWindow;
    this.e = paramb;
    this.c = this.b.getCallback();
    if ((this.c instanceof a)) {
      throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }
    this.d = a(this.c);
    this.b.setCallback(this.d);
    TintTypedArray localTintTypedArray = TintTypedArray.obtainStyledAttributes(paramContext, null, o);
    Drawable localDrawable = localTintTypedArray.getDrawableIfKnown(0);
    if (localDrawable != null) {
      this.b.setBackgroundDrawable(localDrawable);
    }
    localTintTypedArray.recycle();
  }
  
  public ActionBar a()
  {
    l();
    return this.f;
  }
  
  abstract android.support.v7.view.b a(b.a parama);
  
  Window.Callback a(Window.Callback paramCallback)
  {
    return new a(paramCallback);
  }
  
  abstract void a(int paramInt, Menu paramMenu);
  
  public final void a(CharSequence paramCharSequence)
  {
    this.p = paramCharSequence;
    b(paramCharSequence);
  }
  
  abstract boolean a(int paramInt, KeyEvent paramKeyEvent);
  
  abstract boolean a(KeyEvent paramKeyEvent);
  
  public MenuInflater b()
  {
    if (this.g == null)
    {
      l();
      if (this.f == null) {
        break label43;
      }
    }
    label43:
    for (Context localContext = this.f.b();; localContext = this.a)
    {
      this.g = new g(localContext);
      return this.g;
    }
  }
  
  abstract void b(CharSequence paramCharSequence);
  
  abstract boolean b(int paramInt, Menu paramMenu);
  
  public void c()
  {
    this.q = true;
  }
  
  public void c(Bundle paramBundle) {}
  
  public void d()
  {
    this.q = false;
  }
  
  public void g()
  {
    this.r = true;
  }
  
  public boolean i()
  {
    return false;
  }
  
  abstract void l();
  
  final ActionBar m()
  {
    return this.f;
  }
  
  final Context n()
  {
    ActionBar localActionBar = a();
    Context localContext = null;
    if (localActionBar != null) {
      localContext = localActionBar.b();
    }
    if (localContext == null) {
      localContext = this.a;
    }
    return localContext;
  }
  
  public boolean o()
  {
    return false;
  }
  
  final boolean p()
  {
    return this.r;
  }
  
  final Window.Callback q()
  {
    return this.b.getCallback();
  }
  
  final CharSequence r()
  {
    if ((this.c instanceof Activity)) {
      return ((Activity)this.c).getTitle();
    }
    return this.p;
  }
  
  class a
    extends i
  {
    a(Window.Callback paramCallback)
    {
      super();
    }
    
    public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
    {
      return (d.this.a(paramKeyEvent)) || (super.dispatchKeyEvent(paramKeyEvent));
    }
    
    public boolean dispatchKeyShortcutEvent(KeyEvent paramKeyEvent)
    {
      return (super.dispatchKeyShortcutEvent(paramKeyEvent)) || (d.this.a(paramKeyEvent.getKeyCode(), paramKeyEvent));
    }
    
    public void onContentChanged() {}
    
    public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
    {
      if ((paramInt == 0) && (!(paramMenu instanceof h))) {
        return false;
      }
      return super.onCreatePanelMenu(paramInt, paramMenu);
    }
    
    public boolean onMenuOpened(int paramInt, Menu paramMenu)
    {
      super.onMenuOpened(paramInt, paramMenu);
      d.this.b(paramInt, paramMenu);
      return true;
    }
    
    public void onPanelClosed(int paramInt, Menu paramMenu)
    {
      super.onPanelClosed(paramInt, paramMenu);
      d.this.a(paramInt, paramMenu);
    }
    
    public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
    {
      h localh;
      boolean bool;
      if ((paramMenu instanceof h))
      {
        localh = (h)paramMenu;
        if ((paramInt != 0) || (localh != null)) {
          break label34;
        }
        bool = false;
      }
      label34:
      do
      {
        return bool;
        localh = null;
        break;
        if (localh != null) {
          localh.c(true);
        }
        bool = super.onPreparePanel(paramInt, paramView, paramMenu);
      } while (localh == null);
      localh.c(false);
      return bool;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.app.d
 * JD-Core Version:    0.7.0.1
 */