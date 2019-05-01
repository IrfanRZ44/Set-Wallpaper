package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

public class k
  extends c<android.support.v4.b.a.b>
  implements MenuItem
{
  private Method c;
  
  k(Context paramContext, android.support.v4.b.a.b paramb)
  {
    super(paramContext, paramb);
  }
  
  a a(ActionProvider paramActionProvider)
  {
    return new a(this.a, paramActionProvider);
  }
  
  public void a(boolean paramBoolean)
  {
    try
    {
      if (this.c == null)
      {
        Class localClass = ((android.support.v4.b.a.b)this.b).getClass();
        Class[] arrayOfClass = new Class[1];
        arrayOfClass[0] = Boolean.TYPE;
        this.c = localClass.getDeclaredMethod("setExclusiveCheckable", arrayOfClass);
      }
      Method localMethod = this.c;
      Object localObject = this.b;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Boolean.valueOf(paramBoolean);
      localMethod.invoke(localObject, arrayOfObject);
      return;
    }
    catch (Exception localException)
    {
      Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", localException);
    }
  }
  
  public boolean collapseActionView()
  {
    return ((android.support.v4.b.a.b)this.b).collapseActionView();
  }
  
  public boolean expandActionView()
  {
    return ((android.support.v4.b.a.b)this.b).expandActionView();
  }
  
  public ActionProvider getActionProvider()
  {
    android.support.v4.view.b localb = ((android.support.v4.b.a.b)this.b).a();
    if ((localb instanceof a)) {
      return ((a)localb).a;
    }
    return null;
  }
  
  public View getActionView()
  {
    View localView = ((android.support.v4.b.a.b)this.b).getActionView();
    if ((localView instanceof b)) {
      localView = ((b)localView).a();
    }
    return localView;
  }
  
  public int getAlphabeticModifiers()
  {
    return ((android.support.v4.b.a.b)this.b).getAlphabeticModifiers();
  }
  
  public char getAlphabeticShortcut()
  {
    return ((android.support.v4.b.a.b)this.b).getAlphabeticShortcut();
  }
  
  public CharSequence getContentDescription()
  {
    return ((android.support.v4.b.a.b)this.b).getContentDescription();
  }
  
  public int getGroupId()
  {
    return ((android.support.v4.b.a.b)this.b).getGroupId();
  }
  
  public Drawable getIcon()
  {
    return ((android.support.v4.b.a.b)this.b).getIcon();
  }
  
  public ColorStateList getIconTintList()
  {
    return ((android.support.v4.b.a.b)this.b).getIconTintList();
  }
  
  public PorterDuff.Mode getIconTintMode()
  {
    return ((android.support.v4.b.a.b)this.b).getIconTintMode();
  }
  
  public Intent getIntent()
  {
    return ((android.support.v4.b.a.b)this.b).getIntent();
  }
  
  public int getItemId()
  {
    return ((android.support.v4.b.a.b)this.b).getItemId();
  }
  
  public ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return ((android.support.v4.b.a.b)this.b).getMenuInfo();
  }
  
  public int getNumericModifiers()
  {
    return ((android.support.v4.b.a.b)this.b).getNumericModifiers();
  }
  
  public char getNumericShortcut()
  {
    return ((android.support.v4.b.a.b)this.b).getNumericShortcut();
  }
  
  public int getOrder()
  {
    return ((android.support.v4.b.a.b)this.b).getOrder();
  }
  
  public SubMenu getSubMenu()
  {
    return a(((android.support.v4.b.a.b)this.b).getSubMenu());
  }
  
  public CharSequence getTitle()
  {
    return ((android.support.v4.b.a.b)this.b).getTitle();
  }
  
  public CharSequence getTitleCondensed()
  {
    return ((android.support.v4.b.a.b)this.b).getTitleCondensed();
  }
  
  public CharSequence getTooltipText()
  {
    return ((android.support.v4.b.a.b)this.b).getTooltipText();
  }
  
  public boolean hasSubMenu()
  {
    return ((android.support.v4.b.a.b)this.b).hasSubMenu();
  }
  
  public boolean isActionViewExpanded()
  {
    return ((android.support.v4.b.a.b)this.b).isActionViewExpanded();
  }
  
  public boolean isCheckable()
  {
    return ((android.support.v4.b.a.b)this.b).isCheckable();
  }
  
  public boolean isChecked()
  {
    return ((android.support.v4.b.a.b)this.b).isChecked();
  }
  
  public boolean isEnabled()
  {
    return ((android.support.v4.b.a.b)this.b).isEnabled();
  }
  
  public boolean isVisible()
  {
    return ((android.support.v4.b.a.b)this.b).isVisible();
  }
  
  public MenuItem setActionProvider(ActionProvider paramActionProvider)
  {
    android.support.v4.b.a.b localb = (android.support.v4.b.a.b)this.b;
    if (paramActionProvider != null) {}
    for (a locala = a(paramActionProvider);; locala = null)
    {
      localb.a(locala);
      return this;
    }
  }
  
  public MenuItem setActionView(int paramInt)
  {
    ((android.support.v4.b.a.b)this.b).setActionView(paramInt);
    View localView = ((android.support.v4.b.a.b)this.b).getActionView();
    if ((localView instanceof CollapsibleActionView)) {
      ((android.support.v4.b.a.b)this.b).setActionView(new b(localView));
    }
    return this;
  }
  
  public MenuItem setActionView(View paramView)
  {
    if ((paramView instanceof CollapsibleActionView)) {
      paramView = new b(paramView);
    }
    ((android.support.v4.b.a.b)this.b).setActionView(paramView);
    return this;
  }
  
  public MenuItem setAlphabeticShortcut(char paramChar)
  {
    ((android.support.v4.b.a.b)this.b).setAlphabeticShortcut(paramChar);
    return this;
  }
  
  public MenuItem setAlphabeticShortcut(char paramChar, int paramInt)
  {
    ((android.support.v4.b.a.b)this.b).setAlphabeticShortcut(paramChar, paramInt);
    return this;
  }
  
  public MenuItem setCheckable(boolean paramBoolean)
  {
    ((android.support.v4.b.a.b)this.b).setCheckable(paramBoolean);
    return this;
  }
  
  public MenuItem setChecked(boolean paramBoolean)
  {
    ((android.support.v4.b.a.b)this.b).setChecked(paramBoolean);
    return this;
  }
  
  public MenuItem setContentDescription(CharSequence paramCharSequence)
  {
    ((android.support.v4.b.a.b)this.b).a(paramCharSequence);
    return this;
  }
  
  public MenuItem setEnabled(boolean paramBoolean)
  {
    ((android.support.v4.b.a.b)this.b).setEnabled(paramBoolean);
    return this;
  }
  
  public MenuItem setIcon(int paramInt)
  {
    ((android.support.v4.b.a.b)this.b).setIcon(paramInt);
    return this;
  }
  
  public MenuItem setIcon(Drawable paramDrawable)
  {
    ((android.support.v4.b.a.b)this.b).setIcon(paramDrawable);
    return this;
  }
  
  public MenuItem setIconTintList(ColorStateList paramColorStateList)
  {
    ((android.support.v4.b.a.b)this.b).setIconTintList(paramColorStateList);
    return this;
  }
  
  public MenuItem setIconTintMode(PorterDuff.Mode paramMode)
  {
    ((android.support.v4.b.a.b)this.b).setIconTintMode(paramMode);
    return this;
  }
  
  public MenuItem setIntent(Intent paramIntent)
  {
    ((android.support.v4.b.a.b)this.b).setIntent(paramIntent);
    return this;
  }
  
  public MenuItem setNumericShortcut(char paramChar)
  {
    ((android.support.v4.b.a.b)this.b).setNumericShortcut(paramChar);
    return this;
  }
  
  public MenuItem setNumericShortcut(char paramChar, int paramInt)
  {
    ((android.support.v4.b.a.b)this.b).setNumericShortcut(paramChar, paramInt);
    return this;
  }
  
  public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    android.support.v4.b.a.b localb = (android.support.v4.b.a.b)this.b;
    if (paramOnActionExpandListener != null) {}
    for (c localc = new c(paramOnActionExpandListener);; localc = null)
    {
      localb.setOnActionExpandListener(localc);
      return this;
    }
  }
  
  public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    android.support.v4.b.a.b localb = (android.support.v4.b.a.b)this.b;
    if (paramOnMenuItemClickListener != null) {}
    for (d locald = new d(paramOnMenuItemClickListener);; locald = null)
    {
      localb.setOnMenuItemClickListener(locald);
      return this;
    }
  }
  
  public MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    ((android.support.v4.b.a.b)this.b).setShortcut(paramChar1, paramChar2);
    return this;
  }
  
  public MenuItem setShortcut(char paramChar1, char paramChar2, int paramInt1, int paramInt2)
  {
    ((android.support.v4.b.a.b)this.b).setShortcut(paramChar1, paramChar2, paramInt1, paramInt2);
    return this;
  }
  
  public void setShowAsAction(int paramInt)
  {
    ((android.support.v4.b.a.b)this.b).setShowAsAction(paramInt);
  }
  
  public MenuItem setShowAsActionFlags(int paramInt)
  {
    ((android.support.v4.b.a.b)this.b).setShowAsActionFlags(paramInt);
    return this;
  }
  
  public MenuItem setTitle(int paramInt)
  {
    ((android.support.v4.b.a.b)this.b).setTitle(paramInt);
    return this;
  }
  
  public MenuItem setTitle(CharSequence paramCharSequence)
  {
    ((android.support.v4.b.a.b)this.b).setTitle(paramCharSequence);
    return this;
  }
  
  public MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    ((android.support.v4.b.a.b)this.b).setTitleCondensed(paramCharSequence);
    return this;
  }
  
  public MenuItem setTooltipText(CharSequence paramCharSequence)
  {
    ((android.support.v4.b.a.b)this.b).b(paramCharSequence);
    return this;
  }
  
  public MenuItem setVisible(boolean paramBoolean)
  {
    return ((android.support.v4.b.a.b)this.b).setVisible(paramBoolean);
  }
  
  class a
    extends android.support.v4.view.b
  {
    final ActionProvider a;
    
    public a(Context paramContext, ActionProvider paramActionProvider)
    {
      super();
      this.a = paramActionProvider;
    }
    
    public boolean hasSubMenu()
    {
      return this.a.hasSubMenu();
    }
    
    public View onCreateActionView()
    {
      return this.a.onCreateActionView();
    }
    
    public boolean onPerformDefaultAction()
    {
      return this.a.onPerformDefaultAction();
    }
    
    public void onPrepareSubMenu(SubMenu paramSubMenu)
    {
      this.a.onPrepareSubMenu(k.this.a(paramSubMenu));
    }
  }
  
  static class b
    extends FrameLayout
    implements android.support.v7.view.c
  {
    final CollapsibleActionView a;
    
    b(View paramView)
    {
      super();
      this.a = ((CollapsibleActionView)paramView);
      addView(paramView);
    }
    
    View a()
    {
      return (View)this.a;
    }
    
    public void onActionViewCollapsed()
    {
      this.a.onActionViewCollapsed();
    }
    
    public void onActionViewExpanded()
    {
      this.a.onActionViewExpanded();
    }
  }
  
  private class c
    extends d<MenuItem.OnActionExpandListener>
    implements MenuItem.OnActionExpandListener
  {
    c(MenuItem.OnActionExpandListener paramOnActionExpandListener)
    {
      super();
    }
    
    public boolean onMenuItemActionCollapse(MenuItem paramMenuItem)
    {
      return ((MenuItem.OnActionExpandListener)this.b).onMenuItemActionCollapse(k.this.a(paramMenuItem));
    }
    
    public boolean onMenuItemActionExpand(MenuItem paramMenuItem)
    {
      return ((MenuItem.OnActionExpandListener)this.b).onMenuItemActionExpand(k.this.a(paramMenuItem));
    }
  }
  
  private class d
    extends d<MenuItem.OnMenuItemClickListener>
    implements MenuItem.OnMenuItemClickListener
  {
    d(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
    {
      super();
    }
    
    public boolean onMenuItemClick(MenuItem paramMenuItem)
    {
      return ((MenuItem.OnMenuItemClickListener)this.b).onMenuItemClick(k.this.a(paramMenuItem));
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.view.menu.k
 * JD-Core Version:    0.7.0.1
 */