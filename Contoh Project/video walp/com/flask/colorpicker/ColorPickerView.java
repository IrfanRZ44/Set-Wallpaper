package com.flask.colorpicker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.flask.colorpicker.a.d.a;
import com.flask.colorpicker.slider.AlphaSlider;
import com.flask.colorpicker.slider.LightnessSlider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ColorPickerView
  extends View
{
  private Bitmap a;
  private Canvas b;
  private int c = 10;
  private float d = 1.0F;
  private float e = 1.0F;
  private int f = 0;
  private Integer[] g = { null, null, null, null, null };
  private int h = 0;
  private Integer i;
  private Integer j;
  private Paint k = com.flask.colorpicker.a.d.a().a(0).a();
  private Paint l = com.flask.colorpicker.a.d.a().a(-1).a();
  private Paint m = com.flask.colorpicker.a.d.a().a(-16777216).a();
  private Paint n = com.flask.colorpicker.a.d.a().a();
  private b o;
  private ArrayList<c> p = new ArrayList();
  private ArrayList<d> q = new ArrayList();
  private LightnessSlider r;
  private AlphaSlider s;
  private EditText t;
  private TextWatcher u = new TextWatcher()
  {
    public void afterTextChanged(Editable paramAnonymousEditable) {}
    
    public void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3) {}
    
    public void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
    {
      try
      {
        int i = Color.parseColor(paramAnonymousCharSequence.toString());
        ColorPickerView.this.b(i, false);
        return;
      }
      catch (Exception localException) {}
    }
  };
  private LinearLayout v;
  private com.flask.colorpicker.b.c w;
  private int x;
  private int y;
  
  public ColorPickerView(Context paramContext)
  {
    super(paramContext);
    a(paramContext, null);
  }
  
  public ColorPickerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }
  
  public ColorPickerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet);
  }
  
  private b a(float paramFloat1, float paramFloat2)
  {
    Object localObject1 = null;
    double d1 = 1.7976931348623157E+308D;
    Iterator localIterator = this.w.b().iterator();
    double d2;
    Object localObject2;
    if (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      d2 = localb.a(paramFloat1, paramFloat2);
      if (d1 <= d2) {
        break label82;
      }
      localObject2 = localb;
    }
    for (double d3 = d2;; d3 = d1)
    {
      d1 = d3;
      localObject1 = localObject2;
      break;
      return localObject1;
      label82:
      localObject2 = localObject1;
    }
  }
  
  private b a(int paramInt)
  {
    float[] arrayOfFloat1 = new float[3];
    Color.colorToHSV(paramInt, arrayOfFloat1);
    Object localObject1 = null;
    double d1 = 1.7976931348623157E+308D;
    double d2 = arrayOfFloat1[1] * Math.cos(3.141592653589793D * arrayOfFloat1[0] / 180.0D);
    double d3 = arrayOfFloat1[1] * Math.sin(3.141592653589793D * arrayOfFloat1[0] / 180.0D);
    Iterator localIterator = this.w.b().iterator();
    double d8;
    Object localObject2;
    if (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      float[] arrayOfFloat2 = localb.c();
      double d4 = arrayOfFloat2[1] * Math.cos(3.141592653589793D * arrayOfFloat2[0] / 180.0D);
      double d5 = arrayOfFloat2[1] * Math.sin(3.141592653589793D * arrayOfFloat2[0] / 180.0D);
      double d6 = d2 - d4;
      double d7 = d3 - d5;
      d8 = d6 * d6 + d7 * d7;
      if (d8 >= d1) {
        break label208;
      }
      localObject2 = localb;
    }
    for (double d9 = d8;; d9 = d1)
    {
      d1 = d9;
      localObject1 = localObject2;
      break;
      return localObject1;
      label208:
      localObject2 = localObject1;
    }
  }
  
  private void a()
  {
    int i1 = getMeasuredWidth();
    int i2 = getMeasuredHeight();
    if (i2 < i1) {}
    for (;;)
    {
      if (i2 <= 0) {
        return;
      }
      if (this.a == null)
      {
        this.a = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        this.b = new Canvas(this.a);
        this.n.setShader(com.flask.colorpicker.a.d.a(8));
      }
      b();
      invalidate();
      return;
      i2 = i1;
    }
  }
  
  private void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, e.d.ColorPickerPreference);
    this.c = localTypedArray.getInt(e.d.ColorPickerPreference_density, 10);
    this.i = Integer.valueOf(localTypedArray.getInt(e.d.ColorPickerPreference_initialColor, -1));
    this.j = Integer.valueOf(localTypedArray.getInt(e.d.ColorPickerPreference_pickerColorEditTextColor, -1));
    com.flask.colorpicker.b.c localc = com.flask.colorpicker.a.c.a(a.a(localTypedArray.getInt(e.d.ColorPickerPreference_wheelType, 0)));
    this.x = localTypedArray.getResourceId(e.d.ColorPickerPreference_alphaSliderView, 0);
    this.y = localTypedArray.getResourceId(e.d.ColorPickerPreference_lightnessSliderView, 0);
    setRenderer(localc);
    setDensity(this.c);
    a(this.i.intValue(), true);
    localTypedArray.recycle();
  }
  
  private void b()
  {
    this.b.drawColor(0, PorterDuff.Mode.CLEAR);
    if (this.w == null) {
      return;
    }
    float f1 = this.b.getWidth() / 2.0F;
    float f2 = f1 - 2.05F - f1 / this.c;
    float f3 = f2 / (-1 + this.c) / 2.0F;
    com.flask.colorpicker.b.b localb = this.w.a();
    localb.a = this.c;
    localb.b = f2;
    localb.c = f3;
    localb.d = 2.05F;
    localb.e = this.e;
    localb.f = this.d;
    localb.g = this.b;
    this.w.a(localb);
    this.w.d();
  }
  
  private void setColorPreviewColor(int paramInt)
  {
    if ((this.v == null) || (this.g == null) || (this.h > this.g.length) || (this.g[this.h] == null)) {}
    View localView;
    do
    {
      do
      {
        return;
      } while ((this.v.getChildCount() == 0) || (this.v.getVisibility() != 0));
      localView = this.v.getChildAt(this.h);
    } while (!(localView instanceof LinearLayout));
    ((ImageView)((LinearLayout)localView).findViewById(e.b.image_preview)).setImageDrawable(new a(paramInt));
  }
  
  private void setColorText(int paramInt)
  {
    if (this.t == null) {
      return;
    }
    EditText localEditText = this.t;
    if (this.s != null) {}
    for (boolean bool = true;; bool = false)
    {
      localEditText.setText(f.a(paramInt, bool));
      return;
    }
  }
  
  private void setColorToSliders(int paramInt)
  {
    if (this.r != null) {
      this.r.setColor(paramInt);
    }
    if (this.s != null) {
      this.s.setColor(paramInt);
    }
  }
  
  private void setHighlightedColor(int paramInt)
  {
    int i1 = this.v.getChildCount();
    if ((i1 == 0) || (this.v.getVisibility() != 0)) {
      return;
    }
    int i2 = 0;
    label25:
    View localView;
    if (i2 < i1)
    {
      localView = this.v.getChildAt(i2);
      if ((localView instanceof LinearLayout)) {
        break label54;
      }
    }
    for (;;)
    {
      i2++;
      break label25;
      break;
      label54:
      LinearLayout localLinearLayout = (LinearLayout)localView;
      if (i2 == paramInt) {
        localLinearLayout.setBackgroundColor(-1);
      } else {
        localLinearLayout.setBackgroundColor(0);
      }
    }
  }
  
  protected void a(int paramInt1, int paramInt2)
  {
    if ((this.p != null) && (paramInt1 != paramInt2))
    {
      Iterator localIterator = this.p.iterator();
      while (localIterator.hasNext())
      {
        c localc = (c)localIterator.next();
        try
        {
          localc.a(paramInt2);
        }
        catch (Exception localException) {}
      }
    }
  }
  
  public void a(int paramInt, boolean paramBoolean)
  {
    float[] arrayOfFloat = new float[3];
    Color.colorToHSV(paramInt, arrayOfFloat);
    this.e = f.a(paramInt);
    this.d = arrayOfFloat[2];
    this.g[this.h] = Integer.valueOf(paramInt);
    this.i = Integer.valueOf(paramInt);
    setColorPreviewColor(paramInt);
    setColorToSliders(paramInt);
    if ((this.t != null) && (paramBoolean)) {
      setColorText(paramInt);
    }
    this.o = a(paramInt);
  }
  
  public void a(LinearLayout paramLinearLayout, Integer paramInteger)
  {
    if (paramLinearLayout == null) {}
    int i1;
    do
    {
      return;
      this.v = paramLinearLayout;
      if (paramInteger == null) {
        paramInteger = Integer.valueOf(0);
      }
      i1 = paramLinearLayout.getChildCount();
    } while ((i1 == 0) || (paramLinearLayout.getVisibility() != 0));
    int i2 = 0;
    label38:
    View localView;
    if (i2 < i1)
    {
      localView = paramLinearLayout.getChildAt(i2);
      if ((localView instanceof LinearLayout)) {
        break label66;
      }
    }
    for (;;)
    {
      i2++;
      break label38;
      break;
      label66:
      LinearLayout localLinearLayout = (LinearLayout)localView;
      if (i2 == paramInteger.intValue()) {
        localLinearLayout.setBackgroundColor(-1);
      }
      ImageView localImageView = (ImageView)localLinearLayout.findViewById(e.b.image_preview);
      localImageView.setClickable(true);
      localImageView.setTag(Integer.valueOf(i2));
      localImageView.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          if (paramAnonymousView == null) {}
          Object localObject;
          do
          {
            return;
            localObject = paramAnonymousView.getTag();
          } while ((localObject == null) || (!(localObject instanceof Integer)));
          ColorPickerView.this.setSelectedColor(((Integer)localObject).intValue());
        }
      });
    }
  }
  
  public void a(d paramd)
  {
    this.q.add(paramd);
  }
  
  public void a(Integer[] paramArrayOfInteger, int paramInt)
  {
    this.g = paramArrayOfInteger;
    this.h = paramInt;
    Integer localInteger = this.g[this.h];
    if (localInteger == null) {
      localInteger = Integer.valueOf(-1);
    }
    a(localInteger.intValue(), true);
  }
  
  public void b(int paramInt, boolean paramBoolean)
  {
    a(paramInt, paramBoolean);
    a();
    invalidate();
  }
  
  public Integer[] getAllColors()
  {
    return this.g;
  }
  
  public int getSelectedColor()
  {
    b localb = this.o;
    int i1 = 0;
    if (localb != null) {
      i1 = Color.HSVToColor(this.o.a(this.d));
    }
    return f.a(this.e, i1);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    paramCanvas.drawColor(this.f);
    if (this.a != null) {
      paramCanvas.drawBitmap(this.a, 0.0F, 0.0F, null);
    }
    if (this.o != null)
    {
      float f1 = (paramCanvas.getWidth() / 2.0F - 2.05F) / this.c / 2.0F;
      this.k.setColor(Color.HSVToColor(this.o.a(this.d)));
      this.k.setAlpha((int)(255.0F * this.e));
      paramCanvas.drawCircle(this.o.a(), this.o.b(), f1 * 2.0F, this.l);
      paramCanvas.drawCircle(this.o.a(), this.o.b(), 1.5F * f1, this.m);
      paramCanvas.drawCircle(this.o.a(), this.o.b(), f1, this.n);
      paramCanvas.drawCircle(this.o.a(), this.o.b(), f1, this.k);
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.x != 0) {
      setAlphaSlider((AlphaSlider)getRootView().findViewById(this.x));
    }
    if (this.y != 0) {
      setLightnessSlider((LightnessSlider)getRootView().findViewById(this.y));
    }
    a();
    this.o = a(this.i.intValue());
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    int i1 = View.MeasureSpec.getMode(paramInt1);
    int i2;
    if (i1 == 0) {
      i2 = paramInt1;
    }
    for (;;)
    {
      int i3 = View.MeasureSpec.getMode(paramInt2);
      int i4;
      if (i3 == 0) {
        i4 = paramInt1;
      }
      for (;;)
      {
        if (i4 < i2) {
          i2 = i4;
        }
        setMeasuredDimension(i2, i2);
        return;
        if (i1 == -2147483648)
        {
          i2 = View.MeasureSpec.getSize(paramInt1);
          break;
        }
        if (i1 != 1073741824) {
          break label120;
        }
        i2 = View.MeasureSpec.getSize(paramInt1);
        break;
        if (i3 == -2147483648)
        {
          i4 = View.MeasureSpec.getSize(paramInt2);
        }
        else
        {
          i4 = 0;
          if (i1 == 1073741824) {
            i4 = View.MeasureSpec.getSize(paramInt2);
          }
        }
      }
      label120:
      i2 = 0;
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    a();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      return true;
      int i2 = getSelectedColor();
      this.o = a(paramMotionEvent.getX(), paramMotionEvent.getY());
      int i3 = getSelectedColor();
      a(i2, i3);
      this.i = Integer.valueOf(i3);
      setColorToSliders(i3);
      invalidate();
      continue;
      int i1 = getSelectedColor();
      if (this.q != null)
      {
        Iterator localIterator = this.q.iterator();
        while (localIterator.hasNext())
        {
          d locald = (d)localIterator.next();
          try
          {
            locald.a(i1);
          }
          catch (Exception localException) {}
        }
      }
      setColorToSliders(i1);
      setColorText(i1);
      setColorPreviewColor(i1);
      invalidate();
    }
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    a();
    this.o = a(this.i.intValue());
  }
  
  public void setAlphaSlider(AlphaSlider paramAlphaSlider)
  {
    this.s = paramAlphaSlider;
    if (paramAlphaSlider != null)
    {
      this.s.setColorPicker(this);
      this.s.setColor(getSelectedColor());
    }
  }
  
  public void setAlphaValue(float paramFloat)
  {
    int i1 = getSelectedColor();
    this.e = paramFloat;
    this.i = Integer.valueOf(Color.HSVToColor(f.a(this.e), this.o.a(this.d)));
    EditText localEditText;
    int i2;
    if (this.t != null)
    {
      localEditText = this.t;
      i2 = this.i.intValue();
      if (this.s == null) {
        break label129;
      }
    }
    label129:
    for (boolean bool = true;; bool = false)
    {
      localEditText.setText(f.a(i2, bool));
      if ((this.r != null) && (this.i != null)) {
        this.r.setColor(this.i.intValue());
      }
      a(i1, this.i.intValue());
      a();
      invalidate();
      return;
    }
  }
  
  public void setColorEdit(EditText paramEditText)
  {
    this.t = paramEditText;
    if (this.t != null)
    {
      this.t.setVisibility(0);
      this.t.addTextChangedListener(this.u);
      setColorEditTextColor(this.j.intValue());
    }
  }
  
  public void setColorEditTextColor(int paramInt)
  {
    this.j = Integer.valueOf(paramInt);
    if (this.t != null) {
      this.t.setTextColor(paramInt);
    }
  }
  
  public void setDensity(int paramInt)
  {
    this.c = Math.max(2, paramInt);
    invalidate();
  }
  
  public void setLightness(float paramFloat)
  {
    int i1 = getSelectedColor();
    this.d = paramFloat;
    this.i = Integer.valueOf(Color.HSVToColor(f.a(this.e), this.o.a(paramFloat)));
    EditText localEditText;
    int i2;
    if (this.t != null)
    {
      localEditText = this.t;
      i2 = this.i.intValue();
      if (this.s == null) {
        break label126;
      }
    }
    label126:
    for (boolean bool = true;; bool = false)
    {
      localEditText.setText(f.a(i2, bool));
      if ((this.s != null) && (this.i != null)) {
        this.s.setColor(this.i.intValue());
      }
      a(i1, this.i.intValue());
      a();
      invalidate();
      return;
    }
  }
  
  public void setLightnessSlider(LightnessSlider paramLightnessSlider)
  {
    this.r = paramLightnessSlider;
    if (paramLightnessSlider != null)
    {
      this.r.setColorPicker(this);
      this.r.setColor(getSelectedColor());
    }
  }
  
  public void setRenderer(com.flask.colorpicker.b.c paramc)
  {
    this.w = paramc;
    invalidate();
  }
  
  public void setSelectedColor(int paramInt)
  {
    if ((this.g == null) || (this.g.length < paramInt)) {}
    Integer localInteger;
    do
    {
      return;
      this.h = paramInt;
      setHighlightedColor(paramInt);
      localInteger = this.g[paramInt];
    } while (localInteger == null);
    b(localInteger.intValue(), true);
  }
  
  public static enum a
  {
    static
    {
      a[] arrayOfa = new a[2];
      arrayOfa[0] = a;
      arrayOfa[1] = b;
      c = arrayOfa;
    }
    
    private a() {}
    
    public static a a(int paramInt)
    {
      switch (paramInt)
      {
      default: 
        return a;
      case 0: 
        return a;
      }
      return b;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.flask.colorpicker.ColorPickerView
 * JD-Core Version:    0.7.0.1
 */