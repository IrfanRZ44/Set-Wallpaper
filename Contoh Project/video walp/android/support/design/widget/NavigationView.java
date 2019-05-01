package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.design.a.j;
import android.support.design.a.k;
import android.support.design.internal.ScrimInsetsFrameLayout;
import android.support.design.internal.c;
import android.support.v4.content.a;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.aa;
import android.support.v4.view.s;
import android.support.v7.a.a.a;
import android.support.v7.view.g;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.h.a;
import android.support.v7.view.menu.j;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;

public class NavigationView
  extends ScrimInsetsFrameLayout
{
  private static final int[] d = { 16842912 };
  private static final int[] e = { -16842910 };
  a c;
  private final android.support.design.internal.b f;
  private final c g = new c();
  private int h;
  private MenuInflater i;
  
  public NavigationView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public NavigationView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    m.a(paramContext);
    this.f = new android.support.design.internal.b(paramContext);
    TintTypedArray localTintTypedArray = TintTypedArray.obtainStyledAttributes(paramContext, paramAttributeSet, a.k.NavigationView, paramInt, a.j.Widget_Design_NavigationView);
    s.a(this, localTintTypedArray.getDrawable(a.k.NavigationView_android_background));
    if (localTintTypedArray.hasValue(a.k.NavigationView_elevation)) {
      s.a(this, localTintTypedArray.getDimensionPixelSize(a.k.NavigationView_elevation, 0));
    }
    s.b(this, localTintTypedArray.getBoolean(a.k.NavigationView_android_fitsSystemWindows, false));
    this.h = localTintTypedArray.getDimensionPixelSize(a.k.NavigationView_android_maxWidth, 0);
    ColorStateList localColorStateList1;
    int j;
    if (localTintTypedArray.hasValue(a.k.NavigationView_itemIconTint))
    {
      localColorStateList1 = localTintTypedArray.getColorStateList(a.k.NavigationView_itemIconTint);
      if (!localTintTypedArray.hasValue(a.k.NavigationView_itemTextAppearance)) {
        break label381;
      }
      j = localTintTypedArray.getResourceId(a.k.NavigationView_itemTextAppearance, 0);
    }
    for (int k = 1;; k = 0)
    {
      boolean bool = localTintTypedArray.hasValue(a.k.NavigationView_itemTextColor);
      ColorStateList localColorStateList2 = null;
      if (bool) {
        localColorStateList2 = localTintTypedArray.getColorStateList(a.k.NavigationView_itemTextColor);
      }
      if ((k == 0) && (localColorStateList2 == null)) {
        localColorStateList2 = c(16842806);
      }
      Drawable localDrawable = localTintTypedArray.getDrawable(a.k.NavigationView_itemBackground);
      this.f.a(new h.a()
      {
        public void a(h paramAnonymoush) {}
        
        public boolean a(h paramAnonymoush, MenuItem paramAnonymousMenuItem)
        {
          return (NavigationView.this.c != null) && (NavigationView.this.c.a(paramAnonymousMenuItem));
        }
      });
      this.g.a(1);
      this.g.a(paramContext, this.f);
      this.g.a(localColorStateList1);
      if (k != 0) {
        this.g.c(j);
      }
      this.g.b(localColorStateList2);
      this.g.a(localDrawable);
      this.f.a(this.g);
      addView((View)this.g.a(this));
      if (localTintTypedArray.hasValue(a.k.NavigationView_menu)) {
        a(localTintTypedArray.getResourceId(a.k.NavigationView_menu, 0));
      }
      if (localTintTypedArray.hasValue(a.k.NavigationView_headerLayout)) {
        b(localTintTypedArray.getResourceId(a.k.NavigationView_headerLayout, 0));
      }
      localTintTypedArray.recycle();
      return;
      localColorStateList1 = c(16842808);
      break;
      label381:
      j = 0;
    }
  }
  
  private ColorStateList c(int paramInt)
  {
    TypedValue localTypedValue = new TypedValue();
    if (!getContext().getTheme().resolveAttribute(paramInt, localTypedValue, true)) {}
    ColorStateList localColorStateList;
    do
    {
      return null;
      localColorStateList = android.support.v7.c.a.b.a(getContext(), localTypedValue.resourceId);
    } while (!getContext().getTheme().resolveAttribute(a.a.colorPrimary, localTypedValue, true));
    int j = localTypedValue.data;
    int k = localColorStateList.getDefaultColor();
    int[][] arrayOfInt = new int[3][];
    arrayOfInt[0] = e;
    arrayOfInt[1] = d;
    arrayOfInt[2] = EMPTY_STATE_SET;
    int[] arrayOfInt1 = new int[3];
    arrayOfInt1[0] = localColorStateList.getColorForState(e, k);
    arrayOfInt1[1] = j;
    arrayOfInt1[2] = k;
    return new ColorStateList(arrayOfInt, arrayOfInt1);
  }
  
  private MenuInflater getMenuInflater()
  {
    if (this.i == null) {
      this.i = new g(getContext());
    }
    return this.i;
  }
  
  public void a(int paramInt)
  {
    this.g.b(true);
    getMenuInflater().inflate(paramInt, this.f);
    this.g.b(false);
    this.g.a(false);
  }
  
  protected void a(aa paramaa)
  {
    this.g.a(paramaa);
  }
  
  public View b(int paramInt)
  {
    return this.g.b(paramInt);
  }
  
  public int getHeaderCount()
  {
    return this.g.d();
  }
  
  public Drawable getItemBackground()
  {
    return this.g.g();
  }
  
  public ColorStateList getItemIconTintList()
  {
    return this.g.e();
  }
  
  public ColorStateList getItemTextColor()
  {
    return this.g.f();
  }
  
  public Menu getMenu()
  {
    return this.f;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    switch (View.MeasureSpec.getMode(paramInt1))
    {
    }
    for (;;)
    {
      super.onMeasure(paramInt1, paramInt2);
      return;
      paramInt1 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(paramInt1), this.h), 1073741824);
      continue;
      paramInt1 = View.MeasureSpec.makeMeasureSpec(this.h, 1073741824);
    }
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
    this.f.b(localSavedState.a);
  }
  
  protected Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    localSavedState.a = new Bundle();
    this.f.a(localSavedState.a);
    return localSavedState;
  }
  
  public void setCheckedItem(int paramInt)
  {
    MenuItem localMenuItem = this.f.findItem(paramInt);
    if (localMenuItem != null) {
      this.g.a((j)localMenuItem);
    }
  }
  
  public void setItemBackground(Drawable paramDrawable)
  {
    this.g.a(paramDrawable);
  }
  
  public void setItemBackgroundResource(int paramInt)
  {
    setItemBackground(a.getDrawable(getContext(), paramInt));
  }
  
  public void setItemIconTintList(ColorStateList paramColorStateList)
  {
    this.g.a(paramColorStateList);
  }
  
  public void setItemTextAppearance(int paramInt)
  {
    this.g.c(paramInt);
  }
  
  public void setItemTextColor(ColorStateList paramColorStateList)
  {
    this.g.b(paramColorStateList);
  }
  
  public void setNavigationItemSelectedListener(a parama)
  {
    this.c = parama;
  }
  
  public static class SavedState
    extends AbsSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator()
    {
      public NavigationView.SavedState a(Parcel paramAnonymousParcel)
      {
        return new NavigationView.SavedState(paramAnonymousParcel, null);
      }
      
      public NavigationView.SavedState a(Parcel paramAnonymousParcel, ClassLoader paramAnonymousClassLoader)
      {
        return new NavigationView.SavedState(paramAnonymousParcel, paramAnonymousClassLoader);
      }
      
      public NavigationView.SavedState[] a(int paramAnonymousInt)
      {
        return new NavigationView.SavedState[paramAnonymousInt];
      }
    };
    public Bundle a;
    
    public SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super(paramClassLoader);
      this.a = paramParcel.readBundle(paramClassLoader);
    }
    
    public SavedState(Parcelable paramParcelable)
    {
      super();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeBundle(this.a);
    }
  }
  
  public static abstract interface a
  {
    public abstract boolean a(MenuItem paramMenuItem);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.design.widget.NavigationView
 * JD-Core Version:    0.7.0.1
 */