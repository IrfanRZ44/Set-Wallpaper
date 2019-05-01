package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.support.design.a.d;
import android.support.design.a.e;
import android.support.design.a.f;
import android.support.design.a.h;
import android.support.v4.view.q;
import android.support.v4.view.s;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.p.a;
import android.support.v7.widget.TooltipCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;

public class BottomNavigationItemView
  extends FrameLayout
  implements p.a
{
  private static final int[] a = { 16842912 };
  private final int b;
  private final int c;
  private final float d;
  private final float e;
  private boolean f;
  private ImageView g;
  private final TextView h;
  private final TextView i;
  private int j = -1;
  private j k;
  private ColorStateList l;
  
  public BottomNavigationItemView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public BottomNavigationItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public BottomNavigationItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Resources localResources = getResources();
    int m = localResources.getDimensionPixelSize(a.d.design_bottom_navigation_text_size);
    int n = localResources.getDimensionPixelSize(a.d.design_bottom_navigation_active_text_size);
    this.b = localResources.getDimensionPixelSize(a.d.design_bottom_navigation_margin);
    this.c = (m - n);
    this.d = (1.0F * n / m);
    this.e = (1.0F * m / n);
    LayoutInflater.from(paramContext).inflate(a.h.design_bottom_navigation_item, this, true);
    setBackgroundResource(a.e.design_bottom_navigation_item_background);
    this.g = ((ImageView)findViewById(a.f.icon));
    this.h = ((TextView)findViewById(a.f.smallLabel));
    this.i = ((TextView)findViewById(a.f.largeLabel));
  }
  
  public void a(j paramj, int paramInt)
  {
    this.k = paramj;
    setCheckable(paramj.isCheckable());
    setChecked(paramj.isChecked());
    setEnabled(paramj.isEnabled());
    setIcon(paramj.getIcon());
    setTitle(paramj.getTitle());
    setId(paramj.getItemId());
    setContentDescription(paramj.getContentDescription());
    TooltipCompat.setTooltipText(this, paramj.getTooltipText());
  }
  
  public boolean a()
  {
    return false;
  }
  
  public j getItemData()
  {
    return this.k;
  }
  
  public int getItemPosition()
  {
    return this.j;
  }
  
  public int[] onCreateDrawableState(int paramInt)
  {
    int[] arrayOfInt = super.onCreateDrawableState(paramInt + 1);
    if ((this.k != null) && (this.k.isCheckable()) && (this.k.isChecked())) {
      mergeDrawableStates(arrayOfInt, a);
    }
    return arrayOfInt;
  }
  
  public void setCheckable(boolean paramBoolean)
  {
    refreshDrawableState();
  }
  
  public void setChecked(boolean paramBoolean)
  {
    this.i.setPivotX(this.i.getWidth() / 2);
    this.i.setPivotY(this.i.getBaseline());
    this.h.setPivotX(this.h.getWidth() / 2);
    this.h.setPivotY(this.h.getBaseline());
    if (this.f) {
      if (paramBoolean)
      {
        FrameLayout.LayoutParams localLayoutParams4 = (FrameLayout.LayoutParams)this.g.getLayoutParams();
        localLayoutParams4.gravity = 49;
        localLayoutParams4.topMargin = this.b;
        this.g.setLayoutParams(localLayoutParams4);
        this.i.setVisibility(0);
        this.i.setScaleX(1.0F);
        this.i.setScaleY(1.0F);
        this.h.setVisibility(4);
      }
    }
    for (;;)
    {
      refreshDrawableState();
      return;
      FrameLayout.LayoutParams localLayoutParams3 = (FrameLayout.LayoutParams)this.g.getLayoutParams();
      localLayoutParams3.gravity = 17;
      localLayoutParams3.topMargin = this.b;
      this.g.setLayoutParams(localLayoutParams3);
      this.i.setVisibility(4);
      this.i.setScaleX(0.5F);
      this.i.setScaleY(0.5F);
      break;
      if (paramBoolean)
      {
        FrameLayout.LayoutParams localLayoutParams2 = (FrameLayout.LayoutParams)this.g.getLayoutParams();
        localLayoutParams2.gravity = 49;
        localLayoutParams2.topMargin = (this.b + this.c);
        this.g.setLayoutParams(localLayoutParams2);
        this.i.setVisibility(0);
        this.h.setVisibility(4);
        this.i.setScaleX(1.0F);
        this.i.setScaleY(1.0F);
        this.h.setScaleX(this.d);
        this.h.setScaleY(this.d);
      }
      else
      {
        FrameLayout.LayoutParams localLayoutParams1 = (FrameLayout.LayoutParams)this.g.getLayoutParams();
        localLayoutParams1.gravity = 49;
        localLayoutParams1.topMargin = this.b;
        this.g.setLayoutParams(localLayoutParams1);
        this.i.setVisibility(4);
        this.h.setVisibility(0);
        this.i.setScaleX(this.e);
        this.i.setScaleY(this.e);
        this.h.setScaleX(1.0F);
        this.h.setScaleY(1.0F);
      }
    }
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    this.h.setEnabled(paramBoolean);
    this.i.setEnabled(paramBoolean);
    this.g.setEnabled(paramBoolean);
    if (paramBoolean)
    {
      s.a(this, q.a(getContext(), 1002));
      return;
    }
    s.a(this, null);
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    Drawable.ConstantState localConstantState;
    if (paramDrawable != null)
    {
      localConstantState = paramDrawable.getConstantState();
      if (localConstantState != null) {
        break label38;
      }
    }
    for (;;)
    {
      paramDrawable = android.support.v4.a.a.a.g(paramDrawable).mutate();
      android.support.v4.a.a.a.a(paramDrawable, this.l);
      this.g.setImageDrawable(paramDrawable);
      return;
      label38:
      paramDrawable = localConstantState.newDrawable();
    }
  }
  
  public void setIconTintList(ColorStateList paramColorStateList)
  {
    this.l = paramColorStateList;
    if (this.k != null) {
      setIcon(this.k.getIcon());
    }
  }
  
  public void setItemBackground(int paramInt)
  {
    if (paramInt == 0) {}
    for (Drawable localDrawable = null;; localDrawable = android.support.v4.content.a.getDrawable(getContext(), paramInt))
    {
      s.a(this, localDrawable);
      return;
    }
  }
  
  public void setItemPosition(int paramInt)
  {
    this.j = paramInt;
  }
  
  public void setShiftingMode(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }
  
  public void setTextColor(ColorStateList paramColorStateList)
  {
    this.h.setTextColor(paramColorStateList);
    this.i.setTextColor(paramColorStateList);
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    this.h.setText(paramCharSequence);
    this.i.setText(paramCharSequence);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.design.internal.BottomNavigationItemView
 * JD-Core Version:    0.7.0.1
 */