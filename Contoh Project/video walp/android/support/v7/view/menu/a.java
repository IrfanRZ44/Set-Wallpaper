package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;

public class a
  implements android.support.v4.b.a.b
{
  private final int a;
  private final int b;
  private final int c;
  private final int d;
  private CharSequence e;
  private CharSequence f;
  private Intent g;
  private char h;
  private int i = 4096;
  private char j;
  private int k = 4096;
  private Drawable l;
  private int m = 0;
  private Context n;
  private MenuItem.OnMenuItemClickListener o;
  private CharSequence p;
  private CharSequence q;
  private ColorStateList r = null;
  private PorterDuff.Mode s = null;
  private boolean t = false;
  private boolean u = false;
  private int v = 16;
  
  public a(Context paramContext, int paramInt1, int paramInt2, int paramInt3, int paramInt4, CharSequence paramCharSequence)
  {
    this.n = paramContext;
    this.a = paramInt2;
    this.b = paramInt1;
    this.c = paramInt3;
    this.d = paramInt4;
    this.e = paramCharSequence;
  }
  
  private void b()
  {
    if ((this.l != null) && ((this.t) || (this.u)))
    {
      this.l = android.support.v4.a.a.a.g(this.l);
      this.l = this.l.mutate();
      if (this.t) {
        android.support.v4.a.a.a.a(this.l, this.r);
      }
      if (this.u) {
        android.support.v4.a.a.a.a(this.l, this.s);
      }
    }
  }
  
  public android.support.v4.b.a.b a(int paramInt)
  {
    throw new UnsupportedOperationException();
  }
  
  public android.support.v4.b.a.b a(android.support.v4.view.b paramb)
  {
    throw new UnsupportedOperationException();
  }
  
  public android.support.v4.b.a.b a(View paramView)
  {
    throw new UnsupportedOperationException();
  }
  
  public android.support.v4.b.a.b a(CharSequence paramCharSequence)
  {
    this.p = paramCharSequence;
    return this;
  }
  
  public android.support.v4.view.b a()
  {
    return null;
  }
  
  public android.support.v4.b.a.b b(int paramInt)
  {
    setShowAsAction(paramInt);
    return this;
  }
  
  public android.support.v4.b.a.b b(CharSequence paramCharSequence)
  {
    this.q = paramCharSequence;
    return this;
  }
  
  public boolean collapseActionView()
  {
    return false;
  }
  
  public boolean expandActionView()
  {
    return false;
  }
  
  public ActionProvider getActionProvider()
  {
    throw new UnsupportedOperationException();
  }
  
  public View getActionView()
  {
    return null;
  }
  
  public int getAlphabeticModifiers()
  {
    return this.k;
  }
  
  public char getAlphabeticShortcut()
  {
    return this.j;
  }
  
  public CharSequence getContentDescription()
  {
    return this.p;
  }
  
  public int getGroupId()
  {
    return this.b;
  }
  
  public Drawable getIcon()
  {
    return this.l;
  }
  
  public ColorStateList getIconTintList()
  {
    return this.r;
  }
  
  public PorterDuff.Mode getIconTintMode()
  {
    return this.s;
  }
  
  public Intent getIntent()
  {
    return this.g;
  }
  
  public int getItemId()
  {
    return this.a;
  }
  
  public ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return null;
  }
  
  public int getNumericModifiers()
  {
    return this.i;
  }
  
  public char getNumericShortcut()
  {
    return this.h;
  }
  
  public int getOrder()
  {
    return this.d;
  }
  
  public SubMenu getSubMenu()
  {
    return null;
  }
  
  public CharSequence getTitle()
  {
    return this.e;
  }
  
  public CharSequence getTitleCondensed()
  {
    if (this.f != null) {
      return this.f;
    }
    return this.e;
  }
  
  public CharSequence getTooltipText()
  {
    return this.q;
  }
  
  public boolean hasSubMenu()
  {
    return false;
  }
  
  public boolean isActionViewExpanded()
  {
    return false;
  }
  
  public boolean isCheckable()
  {
    return (0x1 & this.v) != 0;
  }
  
  public boolean isChecked()
  {
    return (0x2 & this.v) != 0;
  }
  
  public boolean isEnabled()
  {
    return (0x10 & this.v) != 0;
  }
  
  public boolean isVisible()
  {
    return (0x8 & this.v) == 0;
  }
  
  public MenuItem setActionProvider(ActionProvider paramActionProvider)
  {
    throw new UnsupportedOperationException();
  }
  
  public MenuItem setAlphabeticShortcut(char paramChar)
  {
    this.j = Character.toLowerCase(paramChar);
    return this;
  }
  
  public MenuItem setAlphabeticShortcut(char paramChar, int paramInt)
  {
    this.j = Character.toLowerCase(paramChar);
    this.k = KeyEvent.normalizeMetaState(paramInt);
    return this;
  }
  
  public MenuItem setCheckable(boolean paramBoolean)
  {
    int i1 = 0xFFFFFFFE & this.v;
    if (paramBoolean) {}
    for (int i2 = 1;; i2 = 0)
    {
      this.v = (i2 | i1);
      return this;
    }
  }
  
  public MenuItem setChecked(boolean paramBoolean)
  {
    int i1 = 0xFFFFFFFD & this.v;
    if (paramBoolean) {}
    for (int i2 = 2;; i2 = 0)
    {
      this.v = (i2 | i1);
      return this;
    }
  }
  
  public MenuItem setEnabled(boolean paramBoolean)
  {
    int i1 = 0xFFFFFFEF & this.v;
    if (paramBoolean) {}
    for (int i2 = 16;; i2 = 0)
    {
      this.v = (i2 | i1);
      return this;
    }
  }
  
  public MenuItem setIcon(int paramInt)
  {
    this.m = paramInt;
    this.l = android.support.v4.content.a.getDrawable(this.n, paramInt);
    b();
    return this;
  }
  
  public MenuItem setIcon(Drawable paramDrawable)
  {
    this.l = paramDrawable;
    this.m = 0;
    b();
    return this;
  }
  
  public MenuItem setIconTintList(ColorStateList paramColorStateList)
  {
    this.r = paramColorStateList;
    this.t = true;
    b();
    return this;
  }
  
  public MenuItem setIconTintMode(PorterDuff.Mode paramMode)
  {
    this.s = paramMode;
    this.u = true;
    b();
    return this;
  }
  
  public MenuItem setIntent(Intent paramIntent)
  {
    this.g = paramIntent;
    return this;
  }
  
  public MenuItem setNumericShortcut(char paramChar)
  {
    this.h = paramChar;
    return this;
  }
  
  public MenuItem setNumericShortcut(char paramChar, int paramInt)
  {
    this.h = paramChar;
    this.i = KeyEvent.normalizeMetaState(paramInt);
    return this;
  }
  
  public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    throw new UnsupportedOperationException();
  }
  
  public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.o = paramOnMenuItemClickListener;
    return this;
  }
  
  public MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    this.h = paramChar1;
    this.j = Character.toLowerCase(paramChar2);
    return this;
  }
  
  public MenuItem setShortcut(char paramChar1, char paramChar2, int paramInt1, int paramInt2)
  {
    this.h = paramChar1;
    this.i = KeyEvent.normalizeMetaState(paramInt1);
    this.j = Character.toLowerCase(paramChar2);
    this.k = KeyEvent.normalizeMetaState(paramInt2);
    return this;
  }
  
  public void setShowAsAction(int paramInt) {}
  
  public MenuItem setTitle(int paramInt)
  {
    this.e = this.n.getResources().getString(paramInt);
    return this;
  }
  
  public MenuItem setTitle(CharSequence paramCharSequence)
  {
    this.e = paramCharSequence;
    return this;
  }
  
  public MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    this.f = paramCharSequence;
    return this;
  }
  
  public MenuItem setVisible(boolean paramBoolean)
  {
    int i1 = 0x8 & this.v;
    if (paramBoolean) {}
    for (int i2 = 0;; i2 = 8)
    {
      this.v = (i2 | i1);
      return this;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.view.menu.a
 * JD-Core Version:    0.7.0.1
 */