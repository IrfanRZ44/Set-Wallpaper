package android.support.transition;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

abstract interface i
{
  public abstract void a(ViewGroup paramViewGroup, View paramView);
  
  public abstract void setVisibility(int paramInt);
  
  public static abstract interface a
  {
    public abstract i a(View paramView, ViewGroup paramViewGroup, Matrix paramMatrix);
    
    public abstract void a(View paramView);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.transition.i
 * JD-Core Version:    0.7.0.1
 */