package android.support.v7.widget;

import android.os.Build.VERSION;
import android.view.View;

public class TooltipCompat
{
  public static void setTooltipText(View paramView, CharSequence paramCharSequence)
  {
    if (Build.VERSION.SDK_INT >= 26)
    {
      paramView.setTooltipText(paramCharSequence);
      return;
    }
    af.a(paramView, paramCharSequence);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.TooltipCompat
 * JD-Core Version:    0.7.0.1
 */