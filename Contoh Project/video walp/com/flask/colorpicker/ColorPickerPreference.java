package com.flask.colorpicker;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.preference.Preference;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import com.flask.colorpicker.a.b;

public class ColorPickerPreference
  extends Preference
{
  protected boolean a;
  protected boolean b;
  protected int c = 0;
  protected ColorPickerView.a d;
  protected int e;
  protected ImageView f;
  private String g;
  private String h;
  private String i;
  
  public ColorPickerPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }
  
  public ColorPickerPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet);
  }
  
  public static int a(int paramInt, float paramFloat)
  {
    int j = Color.alpha(paramInt);
    int k = Color.red(paramInt);
    int m = Color.green(paramInt);
    int n = Color.blue(paramInt);
    return Color.argb(j, Math.max((int)(paramFloat * k), 0), Math.max((int)(paramFloat * m), 0), Math.max((int)(paramFloat * n), 0));
  }
  
  private void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, e.d.ColorPickerPreference);
    try
    {
      this.a = localTypedArray.getBoolean(e.d.ColorPickerPreference_alphaSlider, false);
      this.b = localTypedArray.getBoolean(e.d.ColorPickerPreference_lightnessSlider, false);
      this.e = localTypedArray.getInt(e.d.ColorPickerPreference_density, 10);
      this.d = ColorPickerView.a.a(localTypedArray.getInt(e.d.ColorPickerPreference_wheelType, 0));
      this.c = localTypedArray.getInt(e.d.ColorPickerPreference_initialColor, -1);
      this.g = localTypedArray.getString(e.d.ColorPickerPreference_pickerTitle);
      if (this.g == null) {
        this.g = "Choose color";
      }
      this.h = localTypedArray.getString(e.d.ColorPickerPreference_pickerButtonCancel);
      if (this.h == null) {
        this.h = "cancel";
      }
      this.i = localTypedArray.getString(e.d.ColorPickerPreference_pickerButtonOk);
      if (this.i == null) {
        this.i = "ok";
      }
      localTypedArray.recycle();
      setWidgetLayoutResource(e.c.color_widget);
      return;
    }
    finally
    {
      localTypedArray.recycle();
    }
  }
  
  public void a(int paramInt)
  {
    if (callChangeListener(Integer.valueOf(paramInt)))
    {
      this.c = paramInt;
      persistInt(paramInt);
      notifyChanged();
    }
  }
  
  protected void onBindView(View paramView)
  {
    super.onBindView(paramView);
    Resources localResources = paramView.getContext().getResources();
    this.f = ((ImageView)paramView.findViewById(e.b.color_indicator));
    Drawable localDrawable = this.f.getDrawable();
    if ((localDrawable != null) && ((localDrawable instanceof GradientDrawable))) {}
    for (GradientDrawable localGradientDrawable = (GradientDrawable)localDrawable;; localGradientDrawable = null)
    {
      if (localGradientDrawable == null)
      {
        localGradientDrawable = new GradientDrawable();
        localGradientDrawable.setShape(1);
      }
      if (isEnabled()) {}
      for (int j = this.c;; j = a(this.c, 0.5F))
      {
        localGradientDrawable.setColor(j);
        localGradientDrawable.setStroke((int)TypedValue.applyDimension(1, 1.0F, localResources.getDisplayMetrics()), a(j, 0.8F));
        this.f.setImageDrawable(localGradientDrawable);
        return;
      }
    }
  }
  
  protected void onClick()
  {
    b localb = b.a(getContext()).a(this.g).b(this.c).a(this.d).c(this.e).a(this.i, new com.flask.colorpicker.a.a()
    {
      public void a(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt, Integer[] paramAnonymousArrayOfInteger)
      {
        ColorPickerPreference.this.a(paramAnonymousInt);
      }
    }).a(this.h, null);
    if ((!this.a) && (!this.b)) {
      localb.a();
    }
    for (;;)
    {
      localb.d().show();
      return;
      if (!this.a) {
        localb.c();
      } else if (!this.b) {
        localb.b();
      }
    }
  }
  
  protected void onSetInitialValue(boolean paramBoolean, Object paramObject)
  {
    if (paramBoolean) {}
    for (int j = getPersistedInt(0);; j = ((Integer)paramObject).intValue())
    {
      a(j);
      return;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.flask.colorpicker.ColorPickerPreference
 * JD-Core Version:    0.7.0.1
 */