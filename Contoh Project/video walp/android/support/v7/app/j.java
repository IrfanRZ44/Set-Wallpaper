package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v4.view.s;
import android.support.v7.view.i;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.h.a;
import android.support.v7.view.menu.o.a;
import android.support.v7.widget.DecorToolbar;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.Toolbar.OnMenuItemClickListener;
import android.support.v7.widget.ToolbarWidgetWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window.Callback;
import java.util.ArrayList;

class j
  extends ActionBar
{
  DecorToolbar a;
  boolean b;
  Window.Callback c;
  private boolean d;
  private boolean e;
  private ArrayList<ActionBar.a> f = new ArrayList();
  private final Runnable g = new Runnable()
  {
    public void run()
    {
      j.this.i();
    }
  };
  private final Toolbar.OnMenuItemClickListener h = new Toolbar.OnMenuItemClickListener()
  {
    public boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
    {
      return j.this.c.onMenuItemSelected(0, paramAnonymousMenuItem);
    }
  };
  
  j(Toolbar paramToolbar, CharSequence paramCharSequence, Window.Callback paramCallback)
  {
    this.a = new ToolbarWidgetWrapper(paramToolbar, false);
    this.c = new c(paramCallback);
    this.a.setWindowCallback(this.c);
    paramToolbar.setOnMenuItemClickListener(this.h);
    this.a.setWindowTitle(paramCharSequence);
  }
  
  private Menu j()
  {
    if (!this.d)
    {
      this.a.setMenuCallbacks(new a(), new b());
      this.d = true;
    }
    return this.a.getMenu();
  }
  
  public int a()
  {
    return this.a.getDisplayOptions();
  }
  
  public void a(float paramFloat)
  {
    s.a(this.a.getViewGroup(), paramFloat);
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    int i = this.a.getDisplayOptions();
    this.a.setDisplayOptions(paramInt1 & paramInt2 | i & (paramInt2 ^ 0xFFFFFFFF));
  }
  
  public void a(Configuration paramConfiguration)
  {
    super.a(paramConfiguration);
  }
  
  public void a(CharSequence paramCharSequence)
  {
    this.a.setTitle(paramCharSequence);
  }
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = 4;; i = 0)
    {
      a(i, 4);
      return;
    }
  }
  
  public boolean a(int paramInt, KeyEvent paramKeyEvent)
  {
    Menu localMenu = j();
    boolean bool1 = false;
    int i;
    if (localMenu != null)
    {
      if (paramKeyEvent == null) {
        break label59;
      }
      i = paramKeyEvent.getDeviceId();
      if (KeyCharacterMap.load(i).getKeyboardType() == 1) {
        break label65;
      }
    }
    label59:
    label65:
    for (boolean bool2 = true;; bool2 = false)
    {
      localMenu.setQwertyMode(bool2);
      bool1 = localMenu.performShortcut(paramInt, paramKeyEvent, 0);
      return bool1;
      i = -1;
      break;
    }
  }
  
  public boolean a(KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getAction() == 1) {
      c();
    }
    return true;
  }
  
  public Context b()
  {
    return this.a.getContext();
  }
  
  public void b(CharSequence paramCharSequence)
  {
    this.a.setWindowTitle(paramCharSequence);
  }
  
  public void b(boolean paramBoolean) {}
  
  public boolean c()
  {
    return this.a.showOverflowMenu();
  }
  
  public void d(boolean paramBoolean) {}
  
  public boolean d()
  {
    return this.a.hideOverflowMenu();
  }
  
  public void e(boolean paramBoolean) {}
  
  public boolean e()
  {
    this.a.getViewGroup().removeCallbacks(this.g);
    s.a(this.a.getViewGroup(), this.g);
    return true;
  }
  
  public void f(boolean paramBoolean)
  {
    if (paramBoolean == this.e) {}
    for (;;)
    {
      return;
      this.e = paramBoolean;
      int i = this.f.size();
      for (int j = 0; j < i; j++) {
        ((ActionBar.a)this.f.get(j)).a(paramBoolean);
      }
    }
  }
  
  public boolean f()
  {
    if (this.a.hasExpandedActionView())
    {
      this.a.collapseActionView();
      return true;
    }
    return false;
  }
  
  void g()
  {
    this.a.getViewGroup().removeCallbacks(this.g);
  }
  
  public Window.Callback h()
  {
    return this.c;
  }
  
  void i()
  {
    Menu localMenu = j();
    if ((localMenu instanceof h)) {}
    for (localh = (h)localMenu;; localh = null)
    {
      if (localh != null) {
        localh.g();
      }
      try
      {
        localMenu.clear();
        if ((!this.c.onCreatePanelMenu(0, localMenu)) || (!this.c.onPreparePanel(0, null, localMenu))) {
          localMenu.clear();
        }
        return;
      }
      finally
      {
        if (localh == null) {
          break;
        }
        localh.h();
      }
    }
  }
  
  private final class a
    implements o.a
  {
    private boolean b;
    
    a() {}
    
    public void a(h paramh, boolean paramBoolean)
    {
      if (this.b) {
        return;
      }
      this.b = true;
      j.this.a.dismissPopupMenus();
      if (j.this.c != null) {
        j.this.c.onPanelClosed(108, paramh);
      }
      this.b = false;
    }
    
    public boolean a(h paramh)
    {
      if (j.this.c != null)
      {
        j.this.c.onMenuOpened(108, paramh);
        return true;
      }
      return false;
    }
  }
  
  private final class b
    implements h.a
  {
    b() {}
    
    public void a(h paramh)
    {
      if (j.this.c != null)
      {
        if (!j.this.a.isOverflowMenuShowing()) {
          break label41;
        }
        j.this.c.onPanelClosed(108, paramh);
      }
      label41:
      while (!j.this.c.onPreparePanel(0, null, paramh)) {
        return;
      }
      j.this.c.onMenuOpened(108, paramh);
    }
    
    public boolean a(h paramh, MenuItem paramMenuItem)
    {
      return false;
    }
  }
  
  private class c
    extends i
  {
    public c(Window.Callback paramCallback)
    {
      super();
    }
    
    public View onCreatePanelView(int paramInt)
    {
      if (paramInt == 0) {
        return new View(j.this.a.getContext());
      }
      return super.onCreatePanelView(paramInt);
    }
    
    public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
    {
      boolean bool = super.onPreparePanel(paramInt, paramView, paramMenu);
      if ((bool) && (!j.this.b))
      {
        j.this.a.setMenuPrepared();
        j.this.b = true;
      }
      return bool;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.app.j
 * JD-Core Version:    0.7.0.1
 */