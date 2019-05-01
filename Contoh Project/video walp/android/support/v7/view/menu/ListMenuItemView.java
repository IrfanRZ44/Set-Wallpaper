package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.s;
import android.support.v7.a.a.a;
import android.support.v7.a.a.f;
import android.support.v7.a.a.g;
import android.support.v7.a.a.j;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioButton;
import android.widget.TextView;

public class ListMenuItemView
  extends LinearLayout
  implements p.a
{
  private j a;
  private ImageView b;
  private RadioButton c;
  private TextView d;
  private CheckBox e;
  private TextView f;
  private ImageView g;
  private Drawable h;
  private int i;
  private Context j;
  private boolean k;
  private Drawable l;
  private int m;
  private LayoutInflater n;
  private boolean o;
  
  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, a.a.listMenuViewStyle);
  }
  
  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    TintTypedArray localTintTypedArray = TintTypedArray.obtainStyledAttributes(getContext(), paramAttributeSet, a.j.MenuView, paramInt, 0);
    this.h = localTintTypedArray.getDrawable(a.j.MenuView_android_itemBackground);
    this.i = localTintTypedArray.getResourceId(a.j.MenuView_android_itemTextAppearance, -1);
    this.k = localTintTypedArray.getBoolean(a.j.MenuView_preserveIconSpacing, false);
    this.j = paramContext;
    this.l = localTintTypedArray.getDrawable(a.j.MenuView_subMenuArrow);
    localTintTypedArray.recycle();
  }
  
  private void b()
  {
    this.b = ((ImageView)getInflater().inflate(a.g.abc_list_menu_item_icon, this, false));
    addView(this.b, 0);
  }
  
  private void c()
  {
    this.c = ((RadioButton)getInflater().inflate(a.g.abc_list_menu_item_radio, this, false));
    addView(this.c);
  }
  
  private void d()
  {
    this.e = ((CheckBox)getInflater().inflate(a.g.abc_list_menu_item_checkbox, this, false));
    addView(this.e);
  }
  
  private LayoutInflater getInflater()
  {
    if (this.n == null) {
      this.n = LayoutInflater.from(getContext());
    }
    return this.n;
  }
  
  private void setSubMenuArrowVisible(boolean paramBoolean)
  {
    ImageView localImageView;
    if (this.g != null)
    {
      localImageView = this.g;
      if (!paramBoolean) {
        break label24;
      }
    }
    label24:
    for (int i1 = 0;; i1 = 8)
    {
      localImageView.setVisibility(i1);
      return;
    }
  }
  
  public void a(j paramj, int paramInt)
  {
    this.a = paramj;
    this.m = paramInt;
    if (paramj.isVisible()) {}
    for (int i1 = 0;; i1 = 8)
    {
      setVisibility(i1);
      setTitle(paramj.a(this));
      setCheckable(paramj.isCheckable());
      a(paramj.f(), paramj.d());
      setIcon(paramj.getIcon());
      setEnabled(paramj.isEnabled());
      setSubMenuArrowVisible(paramj.hasSubMenu());
      setContentDescription(paramj.getContentDescription());
      return;
    }
  }
  
  public void a(boolean paramBoolean, char paramChar)
  {
    if ((paramBoolean) && (this.a.f())) {}
    for (int i1 = 0;; i1 = 8)
    {
      if (i1 == 0) {
        this.f.setText(this.a.e());
      }
      if (this.f.getVisibility() != i1) {
        this.f.setVisibility(i1);
      }
      return;
    }
  }
  
  public boolean a()
  {
    return false;
  }
  
  public j getItemData()
  {
    return this.a;
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    s.a(this, this.h);
    this.d = ((TextView)findViewById(a.f.title));
    if (this.i != -1) {
      this.d.setTextAppearance(this.j, this.i);
    }
    this.f = ((TextView)findViewById(a.f.shortcut));
    this.g = ((ImageView)findViewById(a.f.submenuarrow));
    if (this.g != null) {
      this.g.setImageDrawable(this.l);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if ((this.b != null) && (this.k))
    {
      ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
      LinearLayout.LayoutParams localLayoutParams1 = (LinearLayout.LayoutParams)this.b.getLayoutParams();
      if ((localLayoutParams.height > 0) && (localLayoutParams1.width <= 0)) {
        localLayoutParams1.width = localLayoutParams.height;
      }
    }
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void setCheckable(boolean paramBoolean)
  {
    if ((!paramBoolean) && (this.c == null) && (this.e == null)) {}
    label60:
    do
    {
      return;
      Object localObject1;
      Object localObject2;
      if (this.a.g())
      {
        if (this.c == null) {
          c();
        }
        RadioButton localRadioButton2 = this.c;
        CheckBox localCheckBox2 = this.e;
        localObject1 = localRadioButton2;
        localObject2 = localCheckBox2;
        if (!paramBoolean) {
          break label160;
        }
        ((CompoundButton)localObject1).setChecked(this.a.isChecked());
        if (!paramBoolean) {
          break label153;
        }
      }
      for (int i1 = 0;; i1 = 8)
      {
        if (((CompoundButton)localObject1).getVisibility() != i1) {
          ((CompoundButton)localObject1).setVisibility(i1);
        }
        if ((localObject2 == null) || (((CompoundButton)localObject2).getVisibility() == 8)) {
          break;
        }
        ((CompoundButton)localObject2).setVisibility(8);
        return;
        if (this.e == null) {
          d();
        }
        CheckBox localCheckBox1 = this.e;
        RadioButton localRadioButton1 = this.c;
        localObject1 = localCheckBox1;
        localObject2 = localRadioButton1;
        break label60;
      }
      if (this.e != null) {
        this.e.setVisibility(8);
      }
    } while (this.c == null);
    label153:
    label160:
    this.c.setVisibility(8);
  }
  
  public void setChecked(boolean paramBoolean)
  {
    if (this.a.g()) {
      if (this.c == null) {
        c();
      }
    }
    for (Object localObject = this.c;; localObject = this.e)
    {
      ((CompoundButton)localObject).setChecked(paramBoolean);
      return;
      if (this.e == null) {
        d();
      }
    }
  }
  
  public void setForceShowIcon(boolean paramBoolean)
  {
    this.o = paramBoolean;
    this.k = paramBoolean;
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    int i1;
    if ((this.a.i()) || (this.o))
    {
      i1 = 1;
      if ((i1 != 0) || (this.k)) {
        break label36;
      }
    }
    label36:
    while ((this.b == null) && (paramDrawable == null) && (!this.k))
    {
      return;
      i1 = 0;
      break;
    }
    if (this.b == null) {
      b();
    }
    if ((paramDrawable != null) || (this.k))
    {
      ImageView localImageView = this.b;
      if (i1 != 0) {}
      for (;;)
      {
        localImageView.setImageDrawable(paramDrawable);
        if (this.b.getVisibility() == 0) {
          break;
        }
        this.b.setVisibility(0);
        return;
        paramDrawable = null;
      }
    }
    this.b.setVisibility(8);
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    if (paramCharSequence != null)
    {
      this.d.setText(paramCharSequence);
      if (this.d.getVisibility() != 0) {
        this.d.setVisibility(0);
      }
    }
    while (this.d.getVisibility() == 8) {
      return;
    }
    this.d.setVisibility(8);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.view.menu.ListMenuItemView
 * JD-Core Version:    0.7.0.1
 */