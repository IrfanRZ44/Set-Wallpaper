package androidx.browser.browseractions;

import android.content.Context;
import android.content.res.Resources;
import android.support.customtabs.j.a;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;

public class BrowserActionsFallbackMenuView
  extends LinearLayout
{
  private final int a = getResources().getDimensionPixelOffset(j.a.browser_actions_context_menu_min_padding);
  private final int b = getResources().getDimensionPixelOffset(j.a.browser_actions_context_menu_max_width);
  
  public BrowserActionsFallbackMenuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - 2 * this.a, this.b), 1073741824), paramInt2);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     androidx.browser.browseractions.BrowserActionsFallbackMenuView
 * JD-Core Version:    0.7.0.1
 */