package android.support.design.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.design.a.d;
import android.support.design.a.f;
import android.support.design.a.k;
import android.support.design.widget.b.c;
import android.support.v4.view.s;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SnackbarContentLayout
  extends LinearLayout
  implements b.c
{
  private TextView a;
  private Button b;
  private int c;
  private int d;
  
  public SnackbarContentLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SnackbarContentLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, a.k.SnackbarLayout);
    this.c = localTypedArray.getDimensionPixelSize(a.k.SnackbarLayout_android_maxWidth, -1);
    this.d = localTypedArray.getDimensionPixelSize(a.k.SnackbarLayout_maxActionInlineWidth, -1);
    localTypedArray.recycle();
  }
  
  private static void a(View paramView, int paramInt1, int paramInt2)
  {
    if (s.s(paramView))
    {
      s.b(paramView, s.g(paramView), paramInt1, s.h(paramView), paramInt2);
      return;
    }
    paramView.setPadding(paramView.getPaddingLeft(), paramInt1, paramView.getPaddingRight(), paramInt2);
  }
  
  private boolean a(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = getOrientation();
    boolean bool = false;
    if (paramInt1 != i)
    {
      setOrientation(paramInt1);
      bool = true;
    }
    if ((this.a.getPaddingTop() != paramInt2) || (this.a.getPaddingBottom() != paramInt3))
    {
      a(this.a, paramInt2, paramInt3);
      bool = true;
    }
    return bool;
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    this.a.setAlpha(0.0F);
    this.a.animate().alpha(1.0F).setDuration(paramInt2).setStartDelay(paramInt1).start();
    if (this.b.getVisibility() == 0)
    {
      this.b.setAlpha(0.0F);
      this.b.animate().alpha(1.0F).setDuration(paramInt2).setStartDelay(paramInt1).start();
    }
  }
  
  public void b(int paramInt1, int paramInt2)
  {
    this.a.setAlpha(1.0F);
    this.a.animate().alpha(0.0F).setDuration(paramInt2).setStartDelay(paramInt1).start();
    if (this.b.getVisibility() == 0)
    {
      this.b.setAlpha(1.0F);
      this.b.animate().alpha(0.0F).setDuration(paramInt2).setStartDelay(paramInt1).start();
    }
  }
  
  public Button getActionView()
  {
    return this.b;
  }
  
  public TextView getMessageView()
  {
    return this.a;
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((TextView)findViewById(a.f.snackbar_text));
    this.b = ((Button)findViewById(a.f.snackbar_action));
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if ((this.c > 0) && (getMeasuredWidth() > this.c))
    {
      paramInt1 = View.MeasureSpec.makeMeasureSpec(this.c, 1073741824);
      super.onMeasure(paramInt1, paramInt2);
    }
    int i = getResources().getDimensionPixelSize(a.d.design_snackbar_padding_vertical_2lines);
    int j = getResources().getDimensionPixelSize(a.d.design_snackbar_padding_vertical);
    int k;
    int m;
    if (this.a.getLayout().getLineCount() > 1)
    {
      k = 1;
      if ((k == 0) || (this.d <= 0) || (this.b.getMeasuredWidth() <= this.d)) {
        break label140;
      }
      if (!a(1, i, i - j)) {
        break label167;
      }
      m = 1;
    }
    for (;;)
    {
      if (m != 0) {
        super.onMeasure(paramInt1, paramInt2);
      }
      return;
      k = 0;
      break;
      label140:
      if (k != 0) {}
      for (;;)
      {
        if (!a(0, i, i)) {
          break label167;
        }
        m = 1;
        break;
        i = j;
      }
      label167:
      m = 0;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.design.internal.SnackbarContentLayout
 * JD-Core Version:    0.7.0.1
 */