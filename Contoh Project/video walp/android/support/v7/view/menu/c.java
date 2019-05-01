package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.b.a.b;
import android.support.v4.f.a;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class c<T>
  extends d<T>
{
  final Context a;
  private Map<b, MenuItem> c;
  private Map<android.support.v4.b.a.c, SubMenu> d;
  
  c(Context paramContext, T paramT)
  {
    super(paramT);
    this.a = paramContext;
  }
  
  final MenuItem a(MenuItem paramMenuItem)
  {
    if ((paramMenuItem instanceof b))
    {
      b localb = (b)paramMenuItem;
      if (this.c == null) {
        this.c = new a();
      }
      MenuItem localMenuItem = (MenuItem)this.c.get(paramMenuItem);
      if (localMenuItem == null)
      {
        localMenuItem = q.a(this.a, localb);
        this.c.put(localb, localMenuItem);
      }
      return localMenuItem;
    }
    return paramMenuItem;
  }
  
  final SubMenu a(SubMenu paramSubMenu)
  {
    if ((paramSubMenu instanceof android.support.v4.b.a.c))
    {
      android.support.v4.b.a.c localc = (android.support.v4.b.a.c)paramSubMenu;
      if (this.d == null) {
        this.d = new a();
      }
      SubMenu localSubMenu = (SubMenu)this.d.get(localc);
      if (localSubMenu == null)
      {
        localSubMenu = q.a(this.a, localc);
        this.d.put(localc, localSubMenu);
      }
      return localSubMenu;
    }
    return paramSubMenu;
  }
  
  final void a()
  {
    if (this.c != null) {
      this.c.clear();
    }
    if (this.d != null) {
      this.d.clear();
    }
  }
  
  final void a(int paramInt)
  {
    if (this.c == null) {}
    for (;;)
    {
      return;
      Iterator localIterator = this.c.keySet().iterator();
      while (localIterator.hasNext()) {
        if (paramInt == ((MenuItem)localIterator.next()).getGroupId()) {
          localIterator.remove();
        }
      }
    }
  }
  
  final void b(int paramInt)
  {
    if (this.c == null) {}
    Iterator localIterator;
    do
    {
      return;
      while (!localIterator.hasNext()) {
        localIterator = this.c.keySet().iterator();
      }
    } while (paramInt != ((MenuItem)localIterator.next()).getItemId());
    localIterator.remove();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.view.menu.c
 * JD-Core Version:    0.7.0.1
 */