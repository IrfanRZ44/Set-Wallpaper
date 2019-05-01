package android.support.v7.widget;

import android.view.View;

class u
{
  boolean a = true;
  int b;
  int c;
  int d;
  int e;
  int f = 0;
  int g = 0;
  boolean h;
  boolean i;
  
  View a(RecyclerView.Recycler paramRecycler)
  {
    View localView = paramRecycler.getViewForPosition(this.c);
    this.c += this.d;
    return localView;
  }
  
  boolean a(RecyclerView.State paramState)
  {
    return (this.c >= 0) && (this.c < paramState.getItemCount());
  }
  
  public String toString()
  {
    return "LayoutState{mAvailable=" + this.b + ", mCurrentPosition=" + this.c + ", mItemDirection=" + this.d + ", mLayoutDirection=" + this.e + ", mStartLine=" + this.f + ", mEndLine=" + this.g + '}';
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.u
 * JD-Core Version:    0.7.0.1
 */