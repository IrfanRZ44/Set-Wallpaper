package android.support.design.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.design.a.k;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;
import android.view.View;

public final class TabItem
  extends View
{
  final CharSequence a;
  final Drawable b;
  final int c;
  
  public TabItem(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TintTypedArray localTintTypedArray = TintTypedArray.obtainStyledAttributes(paramContext, paramAttributeSet, a.k.TabItem);
    this.a = localTintTypedArray.getText(a.k.TabItem_android_text);
    this.b = localTintTypedArray.getDrawable(a.k.TabItem_android_icon);
    this.c = localTintTypedArray.getResourceId(a.k.TabItem_android_layout, 0);
    localTintTypedArray.recycle();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.design.widget.TabItem
 * JD-Core Version:    0.7.0.1
 */