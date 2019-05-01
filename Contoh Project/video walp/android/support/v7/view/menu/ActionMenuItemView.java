package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.a.a.j;
import android.support.v7.widget.ActionMenuView.ActionMenuChildView;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.ForwardingListener;
import android.support.v7.widget.TooltipCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;

public class ActionMenuItemView
  extends AppCompatTextView
  implements p.a, ActionMenuView.ActionMenuChildView, View.OnClickListener
{
  j b;
  h.b c;
  b d;
  private CharSequence e;
  private Drawable f;
  private ForwardingListener g;
  private boolean h;
  private boolean i;
  private int j;
  private int k;
  private int l;
  
  public ActionMenuItemView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ActionMenuItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ActionMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Resources localResources = paramContext.getResources();
    this.h = c();
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, a.j.ActionMenuItemView, paramInt, 0);
    this.j = localTypedArray.getDimensionPixelSize(a.j.ActionMenuItemView_android_minWidth, 0);
    localTypedArray.recycle();
    this.l = ((int)(0.5F + 32.0F * localResources.getDisplayMetrics().density));
    setOnClickListener(this);
    this.k = -1;
    setSaveEnabled(false);
  }
  
  private boolean c()
  {
    Configuration localConfiguration = getContext().getResources().getConfiguration();
    int m = localConfiguration.screenWidthDp;
    int n = localConfiguration.screenHeightDp;
    return (m >= 480) || ((m >= 640) && (n >= 480)) || (localConfiguration.orientation == 2);
  }
  
  private void d()
  {
    int m;
    label57:
    CharSequence localCharSequence1;
    label71:
    CharSequence localCharSequence2;
    CharSequence localCharSequence5;
    label101:
    label107:
    CharSequence localCharSequence3;
    CharSequence localCharSequence4;
    if (!TextUtils.isEmpty(this.e))
    {
      m = 1;
      if (this.f != null)
      {
        boolean bool1 = this.b.m();
        n = 0;
        if (!bool1) {
          break label57;
        }
        if (!this.h)
        {
          boolean bool2 = this.i;
          n = 0;
          if (!bool2) {
            break label57;
          }
        }
      }
      int n = 1;
      int i1 = m & n;
      if (i1 == 0) {
        break label143;
      }
      localCharSequence1 = this.e;
      setText(localCharSequence1);
      localCharSequence2 = this.b.getContentDescription();
      if (!TextUtils.isEmpty(localCharSequence2)) {
        break label161;
      }
      if (i1 == 0) {
        break label149;
      }
      localCharSequence5 = null;
      setContentDescription(localCharSequence5);
      localCharSequence3 = this.b.getTooltipText();
      if (!TextUtils.isEmpty(localCharSequence3)) {
        break label182;
      }
      localCharSequence4 = null;
      if (i1 == 0) {
        break label170;
      }
    }
    for (;;)
    {
      TooltipCompat.setTooltipText(this, localCharSequence4);
      return;
      m = 0;
      break;
      label143:
      localCharSequence1 = null;
      break label71;
      label149:
      localCharSequence5 = this.b.getTitle();
      break label101;
      label161:
      setContentDescription(localCharSequence2);
      break label107;
      label170:
      localCharSequence4 = this.b.getTitle();
    }
    label182:
    TooltipCompat.setTooltipText(this, localCharSequence3);
  }
  
  public void a(j paramj, int paramInt)
  {
    this.b = paramj;
    setIcon(paramj.getIcon());
    setTitle(paramj.a(this));
    setId(paramj.getItemId());
    if (paramj.isVisible()) {}
    for (int m = 0;; m = 8)
    {
      setVisibility(m);
      setEnabled(paramj.isEnabled());
      if ((paramj.hasSubMenu()) && (this.g == null)) {
        this.g = new a();
      }
      return;
    }
  }
  
  public boolean a()
  {
    return true;
  }
  
  public boolean b()
  {
    return !TextUtils.isEmpty(getText());
  }
  
  public j getItemData()
  {
    return this.b;
  }
  
  public boolean needsDividerAfter()
  {
    return b();
  }
  
  public boolean needsDividerBefore()
  {
    return (b()) && (this.b.getIcon() == null);
  }
  
  public void onClick(View paramView)
  {
    if (this.c != null) {
      this.c.invokeItem(this.b);
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    this.h = c();
    d();
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    boolean bool = b();
    if ((bool) && (this.k >= 0)) {
      super.setPadding(this.k, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }
    super.onMeasure(paramInt1, paramInt2);
    int m = View.MeasureSpec.getMode(paramInt1);
    int n = View.MeasureSpec.getSize(paramInt1);
    int i1 = getMeasuredWidth();
    if (m == -2147483648) {}
    for (int i2 = Math.min(n, this.j);; i2 = this.j)
    {
      if ((m != 1073741824) && (this.j > 0) && (i1 < i2)) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i2, 1073741824), paramInt2);
      }
      if ((!bool) && (this.f != null)) {
        super.setPadding((getMeasuredWidth() - this.f.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
      }
      return;
    }
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    super.onRestoreInstanceState(null);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((this.b.hasSubMenu()) && (this.g != null) && (this.g.onTouch(this, paramMotionEvent))) {
      return true;
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setCheckable(boolean paramBoolean) {}
  
  public void setChecked(boolean paramBoolean) {}
  
  public void setExpandedFormat(boolean paramBoolean)
  {
    if (this.i != paramBoolean)
    {
      this.i = paramBoolean;
      if (this.b != null) {
        this.b.h();
      }
    }
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    this.f = paramDrawable;
    if (paramDrawable != null)
    {
      int m = paramDrawable.getIntrinsicWidth();
      int n = paramDrawable.getIntrinsicHeight();
      if (m > this.l)
      {
        float f2 = this.l / m;
        m = this.l;
        n = (int)(f2 * n);
      }
      if (n > this.l)
      {
        float f1 = this.l / n;
        n = this.l;
        m = (int)(f1 * m);
      }
      paramDrawable.setBounds(0, 0, m, n);
    }
    setCompoundDrawables(paramDrawable, null, null, null);
    d();
  }
  
  public void setItemInvoker(h.b paramb)
  {
    this.c = paramb;
  }
  
  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.k = paramInt1;
    super.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void setPopupCallback(b paramb)
  {
    this.d = paramb;
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    this.e = paramCharSequence;
    d();
  }
  
  private class a
    extends ForwardingListener
  {
    public a()
    {
      super();
    }
    
    public s getPopup()
    {
      if (ActionMenuItemView.this.d != null) {
        return ActionMenuItemView.this.d.a();
      }
      return null;
    }
    
    protected boolean onForwardingStarted()
    {
      h.b localb = ActionMenuItemView.this.c;
      boolean bool1 = false;
      if (localb != null)
      {
        boolean bool2 = ActionMenuItemView.this.c.invokeItem(ActionMenuItemView.this.b);
        bool1 = false;
        if (bool2)
        {
          s locals = getPopup();
          bool1 = false;
          if (locals != null)
          {
            boolean bool3 = locals.isShowing();
            bool1 = false;
            if (bool3) {
              bool1 = true;
            }
          }
        }
      }
      return bool1;
    }
  }
  
  public static abstract class b
  {
    public abstract s a();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.view.menu.ActionMenuItemView
 * JD-Core Version:    0.7.0.1
 */