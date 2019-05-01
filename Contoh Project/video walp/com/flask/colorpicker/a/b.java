package com.flask.colorpicker.a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.a.a;
import android.text.InputFilter;
import android.text.InputFilter.AllCaps;
import android.text.InputFilter.LengthFilter;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.flask.colorpicker.ColorPickerView;
import com.flask.colorpicker.ColorPickerView.a;
import com.flask.colorpicker.d;
import com.flask.colorpicker.e.a;
import com.flask.colorpicker.e.b;
import com.flask.colorpicker.e.c;
import com.flask.colorpicker.f;
import com.flask.colorpicker.slider.AlphaSlider;
import com.flask.colorpicker.slider.LightnessSlider;

public class b
{
  private a.a a;
  private LinearLayout b;
  private ColorPickerView c;
  private LightnessSlider d;
  private AlphaSlider e;
  private EditText f;
  private LinearLayout g;
  private boolean h = true;
  private boolean i = true;
  private boolean j = false;
  private boolean k = false;
  private int l = 1;
  private int m = 0;
  private Integer[] n = { null, null, null, null, null };
  
  private b(Context paramContext)
  {
    this(paramContext, 0);
  }
  
  private b(Context paramContext, int paramInt)
  {
    this.m = a(paramContext, e.a.default_slider_margin);
    int i1 = a(paramContext, e.a.default_slider_margin_btw_title);
    this.a = new a.a(paramContext, paramInt);
    this.b = new LinearLayout(paramContext);
    this.b.setOrientation(1);
    this.b.setGravity(1);
    this.b.setPadding(this.m, i1, this.m, this.m);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, 0);
    localLayoutParams.weight = 1.0F;
    this.c = new ColorPickerView(paramContext);
    this.b.addView(this.c, localLayoutParams);
    this.a.b(this.b);
  }
  
  private static int a(Context paramContext, int paramInt)
  {
    return (int)(0.5F + paramContext.getResources().getDimension(paramInt));
  }
  
  public static b a(Context paramContext)
  {
    return new b(paramContext);
  }
  
  private Integer a(Integer[] paramArrayOfInteger)
  {
    int i1 = 0;
    Integer localInteger = Integer.valueOf(0);
    for (;;)
    {
      if ((i1 >= paramArrayOfInteger.length) || (paramArrayOfInteger[i1] == null)) {
        return localInteger;
      }
      localInteger = Integer.valueOf((i1 + 1) / 2);
      i1++;
    }
  }
  
  private void a(DialogInterface paramDialogInterface, a parama)
  {
    parama.a(paramDialogInterface, this.c.getSelectedColor(), this.c.getAllColors());
  }
  
  private int b(Integer[] paramArrayOfInteger)
  {
    Integer localInteger = a(paramArrayOfInteger);
    if (localInteger == null) {
      return -1;
    }
    return paramArrayOfInteger[localInteger.intValue()].intValue();
  }
  
  public b a()
  {
    this.h = false;
    this.i = false;
    return this;
  }
  
  public b a(int paramInt)
  {
    this.a.a(paramInt);
    return this;
  }
  
  public b a(int paramInt, DialogInterface.OnClickListener paramOnClickListener)
  {
    this.a.b(paramInt, paramOnClickListener);
    return this;
  }
  
  public b a(int paramInt, final a parama)
  {
    this.a.a(paramInt, new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        b.a(b.this, paramAnonymousDialogInterface, parama);
      }
    });
    return this;
  }
  
  public b a(ColorPickerView.a parama)
  {
    com.flask.colorpicker.b.c localc = c.a(parama);
    this.c.setRenderer(localc);
    return this;
  }
  
  public b a(d paramd)
  {
    this.c.a(paramd);
    return this;
  }
  
  public b a(CharSequence paramCharSequence, DialogInterface.OnClickListener paramOnClickListener)
  {
    this.a.b(paramCharSequence, paramOnClickListener);
    return this;
  }
  
  public b a(CharSequence paramCharSequence, final a parama)
  {
    this.a.a(paramCharSequence, new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        b.a(b.this, paramAnonymousDialogInterface, parama);
      }
    });
    return this;
  }
  
  public b a(String paramString)
  {
    this.a.a(paramString);
    return this;
  }
  
  public b b()
  {
    this.h = false;
    this.i = true;
    return this;
  }
  
  public b b(int paramInt)
  {
    this.n[0] = Integer.valueOf(paramInt);
    return this;
  }
  
  public b c()
  {
    this.h = true;
    this.i = false;
    return this;
  }
  
  public b c(int paramInt)
  {
    this.c.setDensity(paramInt);
    return this;
  }
  
  public android.support.v7.app.a d()
  {
    Context localContext = this.a.a();
    this.c.a(this.n, a(this.n).intValue());
    if (this.h)
    {
      LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(-1, a(localContext, e.a.default_slider_height));
      this.d = new LightnessSlider(localContext);
      this.d.setLayoutParams(localLayoutParams1);
      this.b.addView(this.d);
      this.c.setLightnessSlider(this.d);
      this.d.setColor(b(this.n));
    }
    if (this.i)
    {
      LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-1, a(localContext, e.a.default_slider_height));
      this.e = new AlphaSlider(localContext);
      this.e.setLayoutParams(localLayoutParams2);
      this.b.addView(this.e);
      this.c.setAlphaSlider(this.e);
      this.e.setColor(b(this.n));
    }
    int i1;
    if (this.j)
    {
      LinearLayout.LayoutParams localLayoutParams3 = new LinearLayout.LayoutParams(-2, -2);
      this.f = ((EditText)View.inflate(localContext, e.c.picker_edit, null));
      EditText localEditText1 = this.f;
      InputFilter[] arrayOfInputFilter1 = new InputFilter[1];
      arrayOfInputFilter1[0] = new InputFilter.AllCaps();
      localEditText1.setFilters(arrayOfInputFilter1);
      this.f.setSingleLine();
      this.f.setVisibility(8);
      if (this.i)
      {
        i1 = 9;
        EditText localEditText2 = this.f;
        InputFilter[] arrayOfInputFilter2 = new InputFilter[1];
        arrayOfInputFilter2[0] = new InputFilter.LengthFilter(i1);
        localEditText2.setFilters(arrayOfInputFilter2);
        this.b.addView(this.f, localLayoutParams3);
        this.f.setText(f.a(b(this.n), this.i));
        this.c.setColorEdit(this.f);
      }
    }
    else if (this.k)
    {
      this.g = ((LinearLayout)View.inflate(localContext, e.c.color_preview, null));
      this.g.setVisibility(8);
      this.b.addView(this.g);
      if (this.n.length != 0) {
        break label474;
      }
      ((ImageView)View.inflate(localContext, e.c.color_selector, null)).setImageDrawable(new ColorDrawable(-1));
    }
    for (;;)
    {
      this.g.setVisibility(0);
      this.c.a(this.g, a(this.n));
      return this.a.b();
      i1 = 7;
      break;
      label474:
      for (int i2 = 0; (i2 < this.n.length) && (i2 < this.l) && (this.n[i2] != null); i2++)
      {
        LinearLayout localLinearLayout = (LinearLayout)View.inflate(localContext, e.c.color_selector, null);
        ((ImageView)localLinearLayout.findViewById(e.b.image_preview)).setImageDrawable(new ColorDrawable(this.n[i2].intValue()));
        this.g.addView(localLinearLayout);
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.flask.colorpicker.a.b
 * JD-Core Version:    0.7.0.1
 */