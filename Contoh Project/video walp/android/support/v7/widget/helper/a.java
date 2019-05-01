package android.support.v7.widget.helper;

import android.graphics.Canvas;
import android.support.v4.view.s;
import android.support.v7.widget.RecyclerView;
import android.view.View;

class a
{
  static class a
    extends a.b
  {
    private float a(RecyclerView paramRecyclerView, View paramView)
    {
      int i = paramRecyclerView.getChildCount();
      int j = 0;
      float f1 = 0.0F;
      if (j < i)
      {
        View localView = paramRecyclerView.getChildAt(j);
        if (localView == paramView) {}
        for (;;)
        {
          j++;
          break;
          float f2 = s.l(localView);
          if (f2 > f1) {
            f1 = f2;
          }
        }
      }
      return f1;
    }
    
    public void clearView(View paramView)
    {
      Object localObject = paramView.getTag(android.support.v7.e.a.b.item_touch_helper_previous_elevation);
      if ((localObject != null) && ((localObject instanceof Float))) {
        s.a(paramView, ((Float)localObject).floatValue());
      }
      paramView.setTag(android.support.v7.e.a.b.item_touch_helper_previous_elevation, null);
      super.clearView(paramView);
    }
    
    public void onDraw(Canvas paramCanvas, RecyclerView paramRecyclerView, View paramView, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean)
    {
      if ((paramBoolean) && (paramView.getTag(android.support.v7.e.a.b.item_touch_helper_previous_elevation) == null))
      {
        Float localFloat = Float.valueOf(s.l(paramView));
        s.a(paramView, 1.0F + a(paramRecyclerView, paramView));
        paramView.setTag(android.support.v7.e.a.b.item_touch_helper_previous_elevation, localFloat);
      }
      super.onDraw(paramCanvas, paramRecyclerView, paramView, paramFloat1, paramFloat2, paramInt, paramBoolean);
    }
  }
  
  static class b
    implements ItemTouchUIUtil
  {
    public void clearView(View paramView)
    {
      paramView.setTranslationX(0.0F);
      paramView.setTranslationY(0.0F);
    }
    
    public void onDraw(Canvas paramCanvas, RecyclerView paramRecyclerView, View paramView, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean)
    {
      paramView.setTranslationX(paramFloat1);
      paramView.setTranslationY(paramFloat2);
    }
    
    public void onDrawOver(Canvas paramCanvas, RecyclerView paramRecyclerView, View paramView, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean) {}
    
    public void onSelected(View paramView) {}
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.helper.a
 * JD-Core Version:    0.7.0.1
 */