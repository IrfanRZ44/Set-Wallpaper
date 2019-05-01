package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.design.a.c;
import android.support.design.a.d;
import android.support.design.a.j;
import android.support.design.a.k;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.internal.BottomNavigationPresenter;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.s;
import android.support.v7.a.a.a;
import android.support.v7.c.a.b;
import android.support.v7.view.g;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.h.a;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

public class BottomNavigationView
  extends FrameLayout
{
  private static final int[] a = { 16842912 };
  private static final int[] b = { -16842910 };
  private final h c;
  private final BottomNavigationMenuView d;
  private final BottomNavigationPresenter e = new BottomNavigationPresenter();
  private MenuInflater f;
  private b g;
  private a h;
  
  public BottomNavigationView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public BottomNavigationView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public BottomNavigationView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    m.a(paramContext);
    this.c = new android.support.design.internal.a(paramContext);
    this.d = new BottomNavigationMenuView(paramContext);
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-2, -2);
    localLayoutParams.gravity = 17;
    this.d.setLayoutParams(localLayoutParams);
    this.e.a(this.d);
    this.e.a(1);
    this.d.setPresenter(this.e);
    this.c.a(this.e);
    this.e.a(getContext(), this.c);
    TintTypedArray localTintTypedArray = TintTypedArray.obtainStyledAttributes(paramContext, paramAttributeSet, a.k.BottomNavigationView, paramInt, a.j.Widget_Design_BottomNavigationView);
    if (localTintTypedArray.hasValue(a.k.BottomNavigationView_itemIconTint))
    {
      this.d.setIconTintList(localTintTypedArray.getColorStateList(a.k.BottomNavigationView_itemIconTint));
      if (!localTintTypedArray.hasValue(a.k.BottomNavigationView_itemTextColor)) {
        break label326;
      }
      this.d.setItemTextColor(localTintTypedArray.getColorStateList(a.k.BottomNavigationView_itemTextColor));
    }
    for (;;)
    {
      if (localTintTypedArray.hasValue(a.k.BottomNavigationView_elevation)) {
        s.a(this, localTintTypedArray.getDimensionPixelSize(a.k.BottomNavigationView_elevation, 0));
      }
      int i = localTintTypedArray.getResourceId(a.k.BottomNavigationView_itemBackground, 0);
      this.d.setItemBackgroundRes(i);
      if (localTintTypedArray.hasValue(a.k.BottomNavigationView_menu)) {
        a(localTintTypedArray.getResourceId(a.k.BottomNavigationView_menu, 0));
      }
      localTintTypedArray.recycle();
      addView(this.d, localLayoutParams);
      if (Build.VERSION.SDK_INT < 21) {
        a(paramContext);
      }
      this.c.a(new h.a()
      {
        public void a(h paramAnonymoush) {}
        
        public boolean a(h paramAnonymoush, MenuItem paramAnonymousMenuItem)
        {
          if ((BottomNavigationView.a(BottomNavigationView.this) != null) && (paramAnonymousMenuItem.getItemId() == BottomNavigationView.this.getSelectedItemId())) {
            BottomNavigationView.a(BottomNavigationView.this).a(paramAnonymousMenuItem);
          }
          while ((BottomNavigationView.b(BottomNavigationView.this) != null) && (!BottomNavigationView.b(BottomNavigationView.this).a(paramAnonymousMenuItem))) {
            return true;
          }
          return false;
        }
      });
      return;
      this.d.setIconTintList(b(16842808));
      break;
      label326:
      this.d.setItemTextColor(b(16842808));
    }
  }
  
  private void a(Context paramContext)
  {
    View localView = new View(paramContext);
    localView.setBackgroundColor(android.support.v4.content.a.getColor(paramContext, a.c.design_bottom_navigation_shadow_color));
    localView.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(a.d.design_bottom_navigation_shadow_height)));
    addView(localView);
  }
  
  private ColorStateList b(int paramInt)
  {
    TypedValue localTypedValue = new TypedValue();
    if (!getContext().getTheme().resolveAttribute(paramInt, localTypedValue, true)) {}
    ColorStateList localColorStateList;
    do
    {
      return null;
      localColorStateList = b.a(getContext(), localTypedValue.resourceId);
    } while (!getContext().getTheme().resolveAttribute(a.a.colorPrimary, localTypedValue, true));
    int i = localTypedValue.data;
    int j = localColorStateList.getDefaultColor();
    int[][] arrayOfInt = new int[3][];
    arrayOfInt[0] = b;
    arrayOfInt[1] = a;
    arrayOfInt[2] = EMPTY_STATE_SET;
    int[] arrayOfInt1 = new int[3];
    arrayOfInt1[0] = localColorStateList.getColorForState(b, j);
    arrayOfInt1[1] = i;
    arrayOfInt1[2] = j;
    return new ColorStateList(arrayOfInt, arrayOfInt1);
  }
  
  private MenuInflater getMenuInflater()
  {
    if (this.f == null) {
      this.f = new g(getContext());
    }
    return this.f;
  }
  
  public void a(int paramInt)
  {
    this.e.b(true);
    getMenuInflater().inflate(paramInt, this.c);
    this.e.b(false);
    this.e.a(true);
  }
  
  public int getItemBackgroundResource()
  {
    return this.d.getItemBackgroundRes();
  }
  
  public ColorStateList getItemIconTintList()
  {
    return this.d.getIconTintList();
  }
  
  public ColorStateList getItemTextColor()
  {
    return this.d.getItemTextColor();
  }
  
  public int getMaxItemCount()
  {
    return 5;
  }
  
  public Menu getMenu()
  {
    return this.c;
  }
  
  public int getSelectedItemId()
  {
    return this.d.getSelectedItemId();
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    SavedState localSavedState = (SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    this.c.b(localSavedState.a);
  }
  
  protected Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    localSavedState.a = new Bundle();
    this.c.a(localSavedState.a);
    return localSavedState;
  }
  
  public void setItemBackgroundResource(int paramInt)
  {
    this.d.setItemBackgroundRes(paramInt);
  }
  
  public void setItemIconTintList(ColorStateList paramColorStateList)
  {
    this.d.setIconTintList(paramColorStateList);
  }
  
  public void setItemTextColor(ColorStateList paramColorStateList)
  {
    this.d.setItemTextColor(paramColorStateList);
  }
  
  public void setOnNavigationItemReselectedListener(a parama)
  {
    this.h = parama;
  }
  
  public void setOnNavigationItemSelectedListener(b paramb)
  {
    this.g = paramb;
  }
  
  public void setSelectedItemId(int paramInt)
  {
    MenuItem localMenuItem = this.c.findItem(paramInt);
    if ((localMenuItem != null) && (!this.c.a(localMenuItem, this.e, 0))) {
      localMenuItem.setChecked(true);
    }
  }
  
  static class SavedState
    extends AbsSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator()
    {
      public BottomNavigationView.SavedState a(Parcel paramAnonymousParcel)
      {
        return new BottomNavigationView.SavedState(paramAnonymousParcel, null);
      }
      
      public BottomNavigationView.SavedState a(Parcel paramAnonymousParcel, ClassLoader paramAnonymousClassLoader)
      {
        return new BottomNavigationView.SavedState(paramAnonymousParcel, paramAnonymousClassLoader);
      }
      
      public BottomNavigationView.SavedState[] a(int paramAnonymousInt)
      {
        return new BottomNavigationView.SavedState[paramAnonymousInt];
      }
    };
    Bundle a;
    
    public SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super(paramClassLoader);
      a(paramParcel, paramClassLoader);
    }
    
    public SavedState(Parcelable paramParcelable)
    {
      super();
    }
    
    private void a(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      this.a = paramParcel.readBundle(paramClassLoader);
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeBundle(this.a);
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(MenuItem paramMenuItem);
  }
  
  public static abstract interface b
  {
    public abstract boolean a(MenuItem paramMenuItem);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.design.widget.BottomNavigationView
 * JD-Core Version:    0.7.0.1
 */