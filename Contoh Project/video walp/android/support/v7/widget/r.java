package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.w;
import android.support.v4.widget.k;
import android.support.v7.a.a.a;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

class r
  extends ListView
{
  public static final int INVALID_POSITION = -1;
  public static final int NO_POSITION = -1;
  private w mClickAnimation;
  private boolean mDrawsInPressedState;
  private boolean mHijackFocus;
  private Field mIsChildViewEnabled;
  private boolean mListSelectionHidden;
  private int mMotionPosition;
  private b mResolveHoverRunnable;
  private k mScrollHelper;
  private int mSelectionBottomPadding = 0;
  private int mSelectionLeftPadding = 0;
  private int mSelectionRightPadding = 0;
  private int mSelectionTopPadding = 0;
  private a mSelector;
  private final Rect mSelectorRect = new Rect();
  
  r(Context paramContext, boolean paramBoolean)
  {
    super(paramContext, null, a.a.dropDownListViewStyle);
    this.mHijackFocus = paramBoolean;
    setCacheColorHint(0);
    try
    {
      this.mIsChildViewEnabled = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
      this.mIsChildViewEnabled.setAccessible(true);
      return;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      localNoSuchFieldException.printStackTrace();
    }
  }
  
  private void clearPressedItem()
  {
    this.mDrawsInPressedState = false;
    setPressed(false);
    drawableStateChanged();
    View localView = getChildAt(this.mMotionPosition - getFirstVisiblePosition());
    if (localView != null) {
      localView.setPressed(false);
    }
    if (this.mClickAnimation != null)
    {
      this.mClickAnimation.b();
      this.mClickAnimation = null;
    }
  }
  
  private void clickPressedItem(View paramView, int paramInt)
  {
    performItemClick(paramView, paramInt, getItemIdAtPosition(paramInt));
  }
  
  private void drawSelectorCompat(Canvas paramCanvas)
  {
    if (!this.mSelectorRect.isEmpty())
    {
      Drawable localDrawable = getSelector();
      if (localDrawable != null)
      {
        localDrawable.setBounds(this.mSelectorRect);
        localDrawable.draw(paramCanvas);
      }
    }
  }
  
  private void positionSelectorCompat(int paramInt, View paramView)
  {
    Rect localRect = this.mSelectorRect;
    localRect.set(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom());
    localRect.left -= this.mSelectionLeftPadding;
    localRect.top -= this.mSelectionTopPadding;
    localRect.right += this.mSelectionRightPadding;
    localRect.bottom += this.mSelectionBottomPadding;
    try
    {
      boolean bool1 = this.mIsChildViewEnabled.getBoolean(this);
      Field localField;
      if (paramView.isEnabled() != bool1)
      {
        localField = this.mIsChildViewEnabled;
        if (bool1) {
          break label131;
        }
      }
      label131:
      for (boolean bool2 = true;; bool2 = false)
      {
        localField.set(this, Boolean.valueOf(bool2));
        if (paramInt != -1) {
          refreshDrawableState();
        }
        return;
      }
      return;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      localIllegalAccessException.printStackTrace();
    }
  }
  
  private void positionSelectorLikeFocusCompat(int paramInt, View paramView)
  {
    boolean bool1 = true;
    Drawable localDrawable = getSelector();
    boolean bool2;
    float f1;
    float f2;
    if ((localDrawable != null) && (paramInt != -1))
    {
      bool2 = bool1;
      if (bool2) {
        localDrawable.setVisible(false, false);
      }
      positionSelectorCompat(paramInt, paramView);
      if (bool2)
      {
        Rect localRect = this.mSelectorRect;
        f1 = localRect.exactCenterX();
        f2 = localRect.exactCenterY();
        if (getVisibility() != 0) {
          break label96;
        }
      }
    }
    for (;;)
    {
      localDrawable.setVisible(bool1, false);
      android.support.v4.a.a.a.a(localDrawable, f1, f2);
      return;
      bool2 = false;
      break;
      label96:
      bool1 = false;
    }
  }
  
  private void positionSelectorLikeTouchCompat(int paramInt, View paramView, float paramFloat1, float paramFloat2)
  {
    positionSelectorLikeFocusCompat(paramInt, paramView);
    Drawable localDrawable = getSelector();
    if ((localDrawable != null) && (paramInt != -1)) {
      android.support.v4.a.a.a.a(localDrawable, paramFloat1, paramFloat2);
    }
  }
  
  private void setPressedItem(View paramView, int paramInt, float paramFloat1, float paramFloat2)
  {
    this.mDrawsInPressedState = true;
    if (Build.VERSION.SDK_INT >= 21) {
      drawableHotspotChanged(paramFloat1, paramFloat2);
    }
    if (!isPressed()) {
      setPressed(true);
    }
    layoutChildren();
    if (this.mMotionPosition != -1)
    {
      View localView = getChildAt(this.mMotionPosition - getFirstVisiblePosition());
      if ((localView != null) && (localView != paramView) && (localView.isPressed())) {
        localView.setPressed(false);
      }
    }
    this.mMotionPosition = paramInt;
    float f1 = paramFloat1 - paramView.getLeft();
    float f2 = paramFloat2 - paramView.getTop();
    if (Build.VERSION.SDK_INT >= 21) {
      paramView.drawableHotspotChanged(f1, f2);
    }
    if (!paramView.isPressed()) {
      paramView.setPressed(true);
    }
    positionSelectorLikeTouchCompat(paramInt, paramView, paramFloat1, paramFloat2);
    setSelectorEnabled(false);
    refreshDrawableState();
  }
  
  private void setSelectorEnabled(boolean paramBoolean)
  {
    if (this.mSelector != null) {
      this.mSelector.a(paramBoolean);
    }
  }
  
  private boolean touchModeDrawsInPressedStateCompat()
  {
    return this.mDrawsInPressedState;
  }
  
  private void updateSelectorStateCompat()
  {
    Drawable localDrawable = getSelector();
    if ((localDrawable != null) && (touchModeDrawsInPressedStateCompat()) && (isPressed())) {
      localDrawable.setState(getDrawableState());
    }
  }
  
  protected void dispatchDraw(Canvas paramCanvas)
  {
    drawSelectorCompat(paramCanvas);
    super.dispatchDraw(paramCanvas);
  }
  
  protected void drawableStateChanged()
  {
    if (this.mResolveHoverRunnable != null) {
      return;
    }
    super.drawableStateChanged();
    setSelectorEnabled(true);
    updateSelectorStateCompat();
  }
  
  public boolean hasFocus()
  {
    return (this.mHijackFocus) || (super.hasFocus());
  }
  
  public boolean hasWindowFocus()
  {
    return (this.mHijackFocus) || (super.hasWindowFocus());
  }
  
  public boolean isFocused()
  {
    return (this.mHijackFocus) || (super.isFocused());
  }
  
  public boolean isInTouchMode()
  {
    return ((this.mHijackFocus) && (this.mListSelectionHidden)) || (super.isInTouchMode());
  }
  
  public int lookForSelectablePosition(int paramInt, boolean paramBoolean)
  {
    ListAdapter localListAdapter = getAdapter();
    if ((localListAdapter == null) || (isInTouchMode())) {
      paramInt = -1;
    }
    int i;
    do
    {
      do
      {
        return paramInt;
        i = localListAdapter.getCount();
        if (getAdapter().areAllItemsEnabled()) {
          break;
        }
        if (paramBoolean) {
          for (paramInt = Math.max(0, paramInt); (paramInt < i) && (!localListAdapter.isEnabled(paramInt)); paramInt++) {}
        }
        for (paramInt = Math.min(paramInt, i - 1); (paramInt >= 0) && (!localListAdapter.isEnabled(paramInt)); paramInt--) {}
      } while ((paramInt >= 0) && (paramInt < i));
      return -1;
    } while ((paramInt >= 0) && (paramInt < i));
    return -1;
  }
  
  public int measureHeightOfChildrenCompat(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    int i = getListPaddingTop();
    int j = getListPaddingBottom();
    getListPaddingLeft();
    getListPaddingRight();
    int k = getDividerHeight();
    Drawable localDrawable = getDivider();
    ListAdapter localListAdapter = getAdapter();
    if (localListAdapter == null)
    {
      paramInt4 = i + j;
      return paramInt4;
    }
    int m = j + i;
    label72:
    int n;
    View localView1;
    int i3;
    label93:
    View localView2;
    label125:
    int i5;
    if ((k > 0) && (localDrawable != null))
    {
      n = 0;
      localView1 = null;
      int i1 = 0;
      int i2 = localListAdapter.getCount();
      i3 = 0;
      if (i3 >= i2) {
        break label296;
      }
      int i4 = localListAdapter.getItemViewType(i3);
      if (i4 == i1) {
        break label299;
      }
      localView2 = null;
      i1 = i4;
      localView1 = localListAdapter.getView(i3, localView2, this);
      ViewGroup.LayoutParams localLayoutParams = localView1.getLayoutParams();
      if (localLayoutParams == null)
      {
        localLayoutParams = generateDefaultLayoutParams();
        localView1.setLayoutParams(localLayoutParams);
      }
      if (localLayoutParams.height <= 0) {
        break label260;
      }
      i5 = View.MeasureSpec.makeMeasureSpec(localLayoutParams.height, 1073741824);
      label185:
      localView1.measure(paramInt1, i5);
      localView1.forceLayout();
      if (i3 <= 0) {
        break label306;
      }
    }
    label260:
    label296:
    label299:
    label306:
    for (int i6 = m + k;; i6 = m)
    {
      int i7 = i6 + localView1.getMeasuredHeight();
      if (i7 >= paramInt4)
      {
        if ((paramInt5 < 0) || (i3 <= paramInt5) || (n <= 0) || (i7 == paramInt4)) {
          break;
        }
        return n;
        k = 0;
        break label72;
        i5 = View.MeasureSpec.makeMeasureSpec(0, 0);
        break label185;
      }
      if ((paramInt5 >= 0) && (i3 >= paramInt5)) {
        n = i7;
      }
      i3++;
      m = i7;
      break label93;
      return m;
      localView2 = localView1;
      break label125;
    }
  }
  
  protected void onDetachedFromWindow()
  {
    this.mResolveHoverRunnable = null;
    super.onDetachedFromWindow();
  }
  
  public boolean onForwardedEvent(MotionEvent paramMotionEvent, int paramInt)
  {
    int i = paramMotionEvent.getActionMasked();
    int k;
    boolean bool2;
    switch (i)
    {
    default: 
      k = 0;
    case 3: 
      for (bool2 = true;; bool2 = false)
      {
        label38:
        if ((!bool2) || (k != 0)) {
          clearPressedItem();
        }
        if (!bool2) {
          break;
        }
        if (this.mScrollHelper == null) {
          this.mScrollHelper = new k(this);
        }
        this.mScrollHelper.a(true);
        this.mScrollHelper.onTouch(this, paramMotionEvent);
        label95:
        return bool2;
        k = 0;
      }
    }
    for (boolean bool1 = false;; bool1 = true)
    {
      int j = paramMotionEvent.findPointerIndex(paramInt);
      if (j < 0)
      {
        k = 0;
        bool2 = false;
        break label38;
      }
      int m = (int)paramMotionEvent.getX(j);
      int n = (int)paramMotionEvent.getY(j);
      int i1 = pointToPosition(m, n);
      if (i1 == -1)
      {
        bool2 = bool1;
        k = 1;
        break label38;
      }
      View localView = getChildAt(i1 - getFirstVisiblePosition());
      setPressedItem(localView, i1, m, n);
      if (i != 1) {
        break;
      }
      clickPressedItem(localView, i1);
      break;
      if (this.mScrollHelper == null) {
        break label95;
      }
      this.mScrollHelper.a(false);
      return bool2;
    }
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    boolean bool;
    if (Build.VERSION.SDK_INT < 26) {
      bool = super.onHoverEvent(paramMotionEvent);
    }
    int j;
    do
    {
      return bool;
      int i = paramMotionEvent.getActionMasked();
      if ((i == 10) && (this.mResolveHoverRunnable == null))
      {
        this.mResolveHoverRunnable = new b(null);
        this.mResolveHoverRunnable.b();
      }
      bool = super.onHoverEvent(paramMotionEvent);
      if ((i != 9) && (i != 7)) {
        break;
      }
      j = pointToPosition((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
    } while ((j == -1) || (j == getSelectedItemPosition()));
    View localView = getChildAt(j - getFirstVisiblePosition());
    if (localView.isEnabled()) {
      setSelectionFromTop(j, localView.getTop() - getTop());
    }
    updateSelectorStateCompat();
    return bool;
    setSelection(-1);
    return bool;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      if (this.mResolveHoverRunnable != null) {
        this.mResolveHoverRunnable.a();
      }
      return super.onTouchEvent(paramMotionEvent);
      this.mMotionPosition = pointToPosition((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
    }
  }
  
  void setListSelectionHidden(boolean paramBoolean)
  {
    this.mListSelectionHidden = paramBoolean;
  }
  
  public void setSelector(Drawable paramDrawable)
  {
    if (paramDrawable != null) {}
    for (a locala = new a(paramDrawable);; locala = null)
    {
      this.mSelector = locala;
      super.setSelector(this.mSelector);
      Rect localRect = new Rect();
      if (paramDrawable != null) {
        paramDrawable.getPadding(localRect);
      }
      this.mSelectionLeftPadding = localRect.left;
      this.mSelectionTopPadding = localRect.top;
      this.mSelectionRightPadding = localRect.right;
      this.mSelectionBottomPadding = localRect.bottom;
      return;
    }
  }
  
  private static class a
    extends android.support.v7.d.a.a
  {
    private boolean a = true;
    
    a(Drawable paramDrawable)
    {
      super();
    }
    
    void a(boolean paramBoolean)
    {
      this.a = paramBoolean;
    }
    
    public void draw(Canvas paramCanvas)
    {
      if (this.a) {
        super.draw(paramCanvas);
      }
    }
    
    public void setHotspot(float paramFloat1, float paramFloat2)
    {
      if (this.a) {
        super.setHotspot(paramFloat1, paramFloat2);
      }
    }
    
    public void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      if (this.a) {
        super.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4);
      }
    }
    
    public boolean setState(int[] paramArrayOfInt)
    {
      if (this.a) {
        return super.setState(paramArrayOfInt);
      }
      return false;
    }
    
    public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
    {
      if (this.a) {
        return super.setVisible(paramBoolean1, paramBoolean2);
      }
      return false;
    }
  }
  
  private class b
    implements Runnable
  {
    private b() {}
    
    public void a()
    {
      r.access$102(r.this, null);
      r.this.removeCallbacks(this);
    }
    
    public void b()
    {
      r.this.post(this);
    }
    
    public void run()
    {
      r.access$102(r.this, null);
      r.this.drawableStateChanged();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.r
 * JD-Core Version:    0.7.0.1
 */