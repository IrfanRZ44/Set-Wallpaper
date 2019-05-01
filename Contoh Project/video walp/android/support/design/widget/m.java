package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.a.a.a;

class m
{
  private static final int[] a;
  
  static
  {
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = a.a.colorPrimary;
    a = arrayOfInt;
  }
  
  static void a(Context paramContext)
  {
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(a);
    boolean bool = localTypedArray.hasValue(0);
    int i = 0;
    if (!bool) {
      i = 1;
    }
    localTypedArray.recycle();
    if (i != 0) {
      throw new IllegalArgumentException("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.design.widget.m
 * JD-Core Version:    0.7.0.1
 */