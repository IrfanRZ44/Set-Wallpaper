package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v7.widget.helper.ItemTouchHelper.ViewDropHandler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class LinearLayoutManager
  extends RecyclerView.LayoutManager
  implements RecyclerView.SmoothScroller.ScrollVectorProvider, ItemTouchHelper.ViewDropHandler
{
  static final boolean DEBUG = false;
  public static final int HORIZONTAL = 0;
  public static final int INVALID_OFFSET = -2147483648;
  private static final float MAX_SCROLL_FACTOR = 0.3333333F;
  private static final String TAG = "LinearLayoutManager";
  public static final int VERTICAL = 1;
  final a mAnchorInfo = new a();
  private int mInitialPrefetchItemCount = 2;
  private boolean mLastStackFromEnd;
  private final LayoutChunkResult mLayoutChunkResult = new LayoutChunkResult();
  private b mLayoutState;
  int mOrientation = 1;
  OrientationHelper mOrientationHelper;
  SavedState mPendingSavedState = null;
  int mPendingScrollPosition = -1;
  int mPendingScrollPositionOffset = -2147483648;
  private boolean mRecycleChildrenOnDetach;
  private boolean mReverseLayout = false;
  boolean mShouldReverseLayout = false;
  private boolean mSmoothScrollbarEnabled = true;
  private boolean mStackFromEnd = false;
  
  public LinearLayoutManager(Context paramContext)
  {
    this(paramContext, 1, false);
  }
  
  public LinearLayoutManager(Context paramContext, int paramInt, boolean paramBoolean)
  {
    setOrientation(paramInt);
    setReverseLayout(paramBoolean);
  }
  
  public LinearLayoutManager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    RecyclerView.LayoutManager.Properties localProperties = getProperties(paramContext, paramAttributeSet, paramInt1, paramInt2);
    setOrientation(localProperties.orientation);
    setReverseLayout(localProperties.reverseLayout);
    setStackFromEnd(localProperties.stackFromEnd);
  }
  
  private int computeScrollExtent(RecyclerView.State paramState)
  {
    if (getChildCount() == 0) {
      return 0;
    }
    ensureLayoutState();
    OrientationHelper localOrientationHelper = this.mOrientationHelper;
    if (!this.mSmoothScrollbarEnabled) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      View localView = findFirstVisibleChildClosestToStart(bool1, true);
      boolean bool2 = this.mSmoothScrollbarEnabled;
      boolean bool3 = false;
      if (!bool2) {
        bool3 = true;
      }
      return aa.a(paramState, localOrientationHelper, localView, findFirstVisibleChildClosestToEnd(bool3, true), this, this.mSmoothScrollbarEnabled);
    }
  }
  
  private int computeScrollOffset(RecyclerView.State paramState)
  {
    if (getChildCount() == 0) {
      return 0;
    }
    ensureLayoutState();
    OrientationHelper localOrientationHelper = this.mOrientationHelper;
    if (!this.mSmoothScrollbarEnabled) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      View localView = findFirstVisibleChildClosestToStart(bool1, true);
      boolean bool2 = this.mSmoothScrollbarEnabled;
      boolean bool3 = false;
      if (!bool2) {
        bool3 = true;
      }
      return aa.a(paramState, localOrientationHelper, localView, findFirstVisibleChildClosestToEnd(bool3, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }
  }
  
  private int computeScrollRange(RecyclerView.State paramState)
  {
    if (getChildCount() == 0) {
      return 0;
    }
    ensureLayoutState();
    OrientationHelper localOrientationHelper = this.mOrientationHelper;
    if (!this.mSmoothScrollbarEnabled) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      View localView = findFirstVisibleChildClosestToStart(bool1, true);
      boolean bool2 = this.mSmoothScrollbarEnabled;
      boolean bool3 = false;
      if (!bool2) {
        bool3 = true;
      }
      return aa.b(paramState, localOrientationHelper, localView, findFirstVisibleChildClosestToEnd(bool3, true), this, this.mSmoothScrollbarEnabled);
    }
  }
  
  private View findFirstPartiallyOrCompletelyInvisibleChild(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
  }
  
  private View findFirstReferenceChild(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    return findReferenceChild(paramRecycler, paramState, 0, getChildCount(), paramState.getItemCount());
  }
  
  private View findFirstVisibleChildClosestToEnd(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.mShouldReverseLayout) {
      return findOneVisibleChild(0, getChildCount(), paramBoolean1, paramBoolean2);
    }
    return findOneVisibleChild(-1 + getChildCount(), -1, paramBoolean1, paramBoolean2);
  }
  
  private View findFirstVisibleChildClosestToStart(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.mShouldReverseLayout) {
      return findOneVisibleChild(-1 + getChildCount(), -1, paramBoolean1, paramBoolean2);
    }
    return findOneVisibleChild(0, getChildCount(), paramBoolean1, paramBoolean2);
  }
  
  private View findLastPartiallyOrCompletelyInvisibleChild(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    return findOnePartiallyOrCompletelyInvisibleChild(-1 + getChildCount(), -1);
  }
  
  private View findLastReferenceChild(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    return findReferenceChild(paramRecycler, paramState, -1 + getChildCount(), -1, paramState.getItemCount());
  }
  
  private View findPartiallyOrCompletelyInvisibleChildClosestToEnd(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    if (this.mShouldReverseLayout) {
      return findFirstPartiallyOrCompletelyInvisibleChild(paramRecycler, paramState);
    }
    return findLastPartiallyOrCompletelyInvisibleChild(paramRecycler, paramState);
  }
  
  private View findPartiallyOrCompletelyInvisibleChildClosestToStart(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    if (this.mShouldReverseLayout) {
      return findLastPartiallyOrCompletelyInvisibleChild(paramRecycler, paramState);
    }
    return findFirstPartiallyOrCompletelyInvisibleChild(paramRecycler, paramState);
  }
  
  private View findReferenceChildClosestToEnd(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    if (this.mShouldReverseLayout) {
      return findFirstReferenceChild(paramRecycler, paramState);
    }
    return findLastReferenceChild(paramRecycler, paramState);
  }
  
  private View findReferenceChildClosestToStart(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    if (this.mShouldReverseLayout) {
      return findLastReferenceChild(paramRecycler, paramState);
    }
    return findFirstReferenceChild(paramRecycler, paramState);
  }
  
  private int fixLayoutEndGap(int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, boolean paramBoolean)
  {
    int i = this.mOrientationHelper.getEndAfterPadding() - paramInt;
    if (i > 0)
    {
      int j = -scrollBy(-i, paramRecycler, paramState);
      int k = paramInt + j;
      if (paramBoolean)
      {
        int m = this.mOrientationHelper.getEndAfterPadding() - k;
        if (m > 0)
        {
          this.mOrientationHelper.offsetChildren(m);
          j += m;
        }
      }
      return j;
    }
    return 0;
  }
  
  private int fixLayoutStartGap(int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, boolean paramBoolean)
  {
    int i = paramInt - this.mOrientationHelper.getStartAfterPadding();
    if (i > 0)
    {
      int j = -scrollBy(i, paramRecycler, paramState);
      int k = paramInt + j;
      if (paramBoolean)
      {
        int m = k - this.mOrientationHelper.getStartAfterPadding();
        if (m > 0)
        {
          this.mOrientationHelper.offsetChildren(-m);
          j -= m;
        }
      }
      return j;
    }
    return 0;
  }
  
  private View getChildClosestToEnd()
  {
    if (this.mShouldReverseLayout) {}
    for (int i = 0;; i = -1 + getChildCount()) {
      return getChildAt(i);
    }
  }
  
  private View getChildClosestToStart()
  {
    if (this.mShouldReverseLayout) {}
    for (int i = -1 + getChildCount();; i = 0) {
      return getChildAt(i);
    }
  }
  
  private void layoutForPredictiveAnimations(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, int paramInt1, int paramInt2)
  {
    if ((!paramState.willRunPredictiveAnimations()) || (getChildCount() == 0) || (paramState.isPreLayout()) || (!supportsPredictiveItemAnimations())) {
      return;
    }
    int i = 0;
    int j = 0;
    List localList = paramRecycler.getScrapList();
    int k = localList.size();
    int m = getPosition(getChildAt(0));
    int n = 0;
    if (n < k)
    {
      RecyclerView.ViewHolder localViewHolder = (RecyclerView.ViewHolder)localList.get(n);
      int i3;
      int i4;
      if (localViewHolder.isRemoved())
      {
        i3 = j;
        i4 = i;
      }
      for (;;)
      {
        n++;
        i = i4;
        j = i3;
        break;
        int i1;
        if (localViewHolder.getLayoutPosition() < m)
        {
          i1 = 1;
          label128:
          if (i1 == this.mShouldReverseLayout) {
            break label176;
          }
        }
        label176:
        for (int i2 = -1;; i2 = 1)
        {
          if (i2 != -1) {
            break label182;
          }
          i4 = i + this.mOrientationHelper.getDecoratedMeasurement(localViewHolder.itemView);
          i3 = j;
          break;
          i1 = 0;
          break label128;
        }
        label182:
        i3 = j + this.mOrientationHelper.getDecoratedMeasurement(localViewHolder.itemView);
        i4 = i;
      }
    }
    this.mLayoutState.k = localList;
    if (i > 0)
    {
      updateLayoutStateToFillStart(getPosition(getChildClosestToStart()), paramInt1);
      this.mLayoutState.h = i;
      this.mLayoutState.c = 0;
      this.mLayoutState.a();
      fill(paramRecycler, this.mLayoutState, paramState, false);
    }
    if (j > 0)
    {
      updateLayoutStateToFillEnd(getPosition(getChildClosestToEnd()), paramInt2);
      this.mLayoutState.h = j;
      this.mLayoutState.c = 0;
      this.mLayoutState.a();
      fill(paramRecycler, this.mLayoutState, paramState, false);
    }
    this.mLayoutState.k = null;
  }
  
  private void logChildren()
  {
    Log.d("LinearLayoutManager", "internal representation of views on the screen");
    for (int i = 0; i < getChildCount(); i++)
    {
      View localView = getChildAt(i);
      Log.d("LinearLayoutManager", "item " + getPosition(localView) + ", coord:" + this.mOrientationHelper.getDecoratedStart(localView));
    }
    Log.d("LinearLayoutManager", "==============");
  }
  
  private void recycleByLayoutState(RecyclerView.Recycler paramRecycler, b paramb)
  {
    if ((!paramb.a) || (paramb.l)) {
      return;
    }
    if (paramb.f == -1)
    {
      recycleViewsFromEnd(paramRecycler, paramb.g);
      return;
    }
    recycleViewsFromStart(paramRecycler, paramb.g);
  }
  
  private void recycleChildren(RecyclerView.Recycler paramRecycler, int paramInt1, int paramInt2)
  {
    if (paramInt1 == paramInt2) {}
    for (;;)
    {
      return;
      if (paramInt2 > paramInt1) {
        for (int i = paramInt2 - 1; i >= paramInt1; i--) {
          removeAndRecycleViewAt(i, paramRecycler);
        }
      } else {
        while (paramInt1 > paramInt2)
        {
          removeAndRecycleViewAt(paramInt1, paramRecycler);
          paramInt1--;
        }
      }
    }
  }
  
  private void recycleViewsFromEnd(RecyclerView.Recycler paramRecycler, int paramInt)
  {
    int i = getChildCount();
    if (paramInt < 0) {}
    for (;;)
    {
      return;
      int j = this.mOrientationHelper.getEnd() - paramInt;
      if (this.mShouldReverseLayout) {
        for (int m = 0; m < i; m++)
        {
          View localView2 = getChildAt(m);
          if ((this.mOrientationHelper.getDecoratedStart(localView2) < j) || (this.mOrientationHelper.getTransformedStartWithDecoration(localView2) < j))
          {
            recycleChildren(paramRecycler, 0, m);
            return;
          }
        }
      } else {
        for (int k = i - 1; k >= 0; k--)
        {
          View localView1 = getChildAt(k);
          if ((this.mOrientationHelper.getDecoratedStart(localView1) < j) || (this.mOrientationHelper.getTransformedStartWithDecoration(localView1) < j))
          {
            recycleChildren(paramRecycler, i - 1, k);
            return;
          }
        }
      }
    }
  }
  
  private void recycleViewsFromStart(RecyclerView.Recycler paramRecycler, int paramInt)
  {
    if (paramInt < 0) {}
    for (;;)
    {
      return;
      int i = getChildCount();
      if (this.mShouldReverseLayout) {
        for (int k = i - 1; k >= 0; k--)
        {
          View localView2 = getChildAt(k);
          if ((this.mOrientationHelper.getDecoratedEnd(localView2) > paramInt) || (this.mOrientationHelper.getTransformedEndWithDecoration(localView2) > paramInt))
          {
            recycleChildren(paramRecycler, i - 1, k);
            return;
          }
        }
      } else {
        for (int j = 0; j < i; j++)
        {
          View localView1 = getChildAt(j);
          if ((this.mOrientationHelper.getDecoratedEnd(localView1) > paramInt) || (this.mOrientationHelper.getTransformedEndWithDecoration(localView1) > paramInt))
          {
            recycleChildren(paramRecycler, 0, j);
            return;
          }
        }
      }
    }
  }
  
  private void resolveShouldLayoutReverse()
  {
    int i = 1;
    if ((this.mOrientation == i) || (!isLayoutRTL()))
    {
      this.mShouldReverseLayout = this.mReverseLayout;
      return;
    }
    if (!this.mReverseLayout) {}
    for (;;)
    {
      this.mShouldReverseLayout = i;
      return;
      i = 0;
    }
  }
  
  private boolean updateAnchorFromChildren(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, a parama)
  {
    if (getChildCount() == 0) {}
    do
    {
      return false;
      View localView1 = getFocusedChild();
      if ((localView1 != null) && (parama.a(localView1, paramState)))
      {
        parama.a(localView1, getPosition(localView1));
        return true;
      }
    } while (this.mLastStackFromEnd != this.mStackFromEnd);
    View localView2;
    if (parama.d)
    {
      localView2 = findReferenceChildClosestToEnd(paramRecycler, paramState);
      label70:
      if (localView2 == null) {
        break label191;
      }
      parama.b(localView2, getPosition(localView2));
      if ((!paramState.isPreLayout()) && (supportsPredictiveItemAnimations()))
      {
        int i;
        if (this.mOrientationHelper.getDecoratedStart(localView2) < this.mOrientationHelper.getEndAfterPadding())
        {
          int k = this.mOrientationHelper.getDecoratedEnd(localView2);
          int m = this.mOrientationHelper.getStartAfterPadding();
          i = 0;
          if (k >= m) {}
        }
        else
        {
          i = 1;
        }
        if (i != 0) {
          if (!parama.d) {
            break label193;
          }
        }
      }
    }
    label191:
    label193:
    for (int j = this.mOrientationHelper.getEndAfterPadding();; j = this.mOrientationHelper.getStartAfterPadding())
    {
      parama.c = j;
      return true;
      localView2 = findReferenceChildClosestToStart(paramRecycler, paramState);
      break label70;
      break;
    }
  }
  
  private boolean updateAnchorFromPendingData(RecyclerView.State paramState, a parama)
  {
    if ((paramState.isPreLayout()) || (this.mPendingScrollPosition == -1)) {
      return false;
    }
    if ((this.mPendingScrollPosition < 0) || (this.mPendingScrollPosition >= paramState.getItemCount()))
    {
      this.mPendingScrollPosition = -1;
      this.mPendingScrollPositionOffset = -2147483648;
      return false;
    }
    parama.b = this.mPendingScrollPosition;
    if ((this.mPendingSavedState != null) && (this.mPendingSavedState.hasValidAnchor()))
    {
      parama.d = this.mPendingSavedState.mAnchorLayoutFromEnd;
      if (parama.d)
      {
        parama.c = (this.mOrientationHelper.getEndAfterPadding() - this.mPendingSavedState.mAnchorOffset);
        return true;
      }
      parama.c = (this.mOrientationHelper.getStartAfterPadding() + this.mPendingSavedState.mAnchorOffset);
      return true;
    }
    if (this.mPendingScrollPositionOffset == -2147483648)
    {
      View localView = findViewByPosition(this.mPendingScrollPosition);
      if (localView != null)
      {
        if (this.mOrientationHelper.getDecoratedMeasurement(localView) > this.mOrientationHelper.getTotalSpace())
        {
          parama.b();
          return true;
        }
        if (this.mOrientationHelper.getDecoratedStart(localView) - this.mOrientationHelper.getStartAfterPadding() < 0)
        {
          parama.c = this.mOrientationHelper.getStartAfterPadding();
          parama.d = false;
          return true;
        }
        if (this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(localView) < 0)
        {
          parama.c = this.mOrientationHelper.getEndAfterPadding();
          parama.d = true;
          return true;
        }
        if (parama.d) {}
        for (int j = this.mOrientationHelper.getDecoratedEnd(localView) + this.mOrientationHelper.getTotalSpaceChange();; j = this.mOrientationHelper.getDecoratedStart(localView))
        {
          parama.c = j;
          return true;
        }
      }
      if (getChildCount() > 0)
      {
        int i = getPosition(getChildAt(0));
        if (this.mPendingScrollPosition >= i) {
          break label360;
        }
      }
      label360:
      for (boolean bool1 = true;; bool1 = false)
      {
        boolean bool2 = this.mShouldReverseLayout;
        boolean bool3 = false;
        if (bool1 == bool2) {
          bool3 = true;
        }
        parama.d = bool3;
        parama.b();
        return true;
      }
    }
    parama.d = this.mShouldReverseLayout;
    if (this.mShouldReverseLayout)
    {
      parama.c = (this.mOrientationHelper.getEndAfterPadding() - this.mPendingScrollPositionOffset);
      return true;
    }
    parama.c = (this.mOrientationHelper.getStartAfterPadding() + this.mPendingScrollPositionOffset);
    return true;
  }
  
  private void updateAnchorInfoForLayout(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, a parama)
  {
    if (updateAnchorFromPendingData(paramState, parama)) {}
    while (updateAnchorFromChildren(paramRecycler, paramState, parama)) {
      return;
    }
    parama.b();
    if (this.mStackFromEnd) {}
    for (int i = -1 + paramState.getItemCount();; i = 0)
    {
      parama.b = i;
      return;
    }
  }
  
  private void updateLayoutState(int paramInt1, int paramInt2, boolean paramBoolean, RecyclerView.State paramState)
  {
    int i = -1;
    int j = 1;
    this.mLayoutState.l = resolveIsInfinite();
    this.mLayoutState.h = getExtraLayoutSpace(paramState);
    this.mLayoutState.f = paramInt1;
    int k;
    if (paramInt1 == j)
    {
      b localb4 = this.mLayoutState;
      localb4.h += this.mOrientationHelper.getEndPadding();
      View localView2 = getChildClosestToEnd();
      b localb5 = this.mLayoutState;
      if (this.mShouldReverseLayout) {}
      for (;;)
      {
        localb5.e = i;
        this.mLayoutState.d = (getPosition(localView2) + this.mLayoutState.e);
        this.mLayoutState.b = this.mOrientationHelper.getDecoratedEnd(localView2);
        k = this.mOrientationHelper.getDecoratedEnd(localView2) - this.mOrientationHelper.getEndAfterPadding();
        this.mLayoutState.c = paramInt2;
        if (paramBoolean)
        {
          b localb3 = this.mLayoutState;
          localb3.c -= k;
        }
        this.mLayoutState.g = k;
        return;
        i = j;
      }
    }
    View localView1 = getChildClosestToStart();
    b localb1 = this.mLayoutState;
    localb1.h += this.mOrientationHelper.getStartAfterPadding();
    b localb2 = this.mLayoutState;
    if (this.mShouldReverseLayout) {}
    for (;;)
    {
      localb2.e = j;
      this.mLayoutState.d = (getPosition(localView1) + this.mLayoutState.e);
      this.mLayoutState.b = this.mOrientationHelper.getDecoratedStart(localView1);
      k = -this.mOrientationHelper.getDecoratedStart(localView1) + this.mOrientationHelper.getStartAfterPadding();
      break;
      j = i;
    }
  }
  
  private void updateLayoutStateToFillEnd(int paramInt1, int paramInt2)
  {
    this.mLayoutState.c = (this.mOrientationHelper.getEndAfterPadding() - paramInt2);
    b localb = this.mLayoutState;
    if (this.mShouldReverseLayout) {}
    for (int i = -1;; i = 1)
    {
      localb.e = i;
      this.mLayoutState.d = paramInt1;
      this.mLayoutState.f = 1;
      this.mLayoutState.b = paramInt2;
      this.mLayoutState.g = -2147483648;
      return;
    }
  }
  
  private void updateLayoutStateToFillEnd(a parama)
  {
    updateLayoutStateToFillEnd(parama.b, parama.c);
  }
  
  private void updateLayoutStateToFillStart(int paramInt1, int paramInt2)
  {
    this.mLayoutState.c = (paramInt2 - this.mOrientationHelper.getStartAfterPadding());
    this.mLayoutState.d = paramInt1;
    b localb = this.mLayoutState;
    if (this.mShouldReverseLayout) {}
    for (int i = 1;; i = -1)
    {
      localb.e = i;
      this.mLayoutState.f = -1;
      this.mLayoutState.b = paramInt2;
      this.mLayoutState.g = -2147483648;
      return;
    }
  }
  
  private void updateLayoutStateToFillStart(a parama)
  {
    updateLayoutStateToFillStart(parama.b, parama.c);
  }
  
  public void assertNotInLayoutOrScroll(String paramString)
  {
    if (this.mPendingSavedState == null) {
      super.assertNotInLayoutOrScroll(paramString);
    }
  }
  
  public boolean canScrollHorizontally()
  {
    return this.mOrientation == 0;
  }
  
  public boolean canScrollVertically()
  {
    return this.mOrientation == 1;
  }
  
  public void collectAdjacentPrefetchPositions(int paramInt1, int paramInt2, RecyclerView.State paramState, RecyclerView.LayoutManager.LayoutPrefetchRegistry paramLayoutPrefetchRegistry)
  {
    if (this.mOrientation == 0) {}
    while ((getChildCount() == 0) || (paramInt1 == 0))
    {
      return;
      paramInt1 = paramInt2;
    }
    ensureLayoutState();
    if (paramInt1 > 0) {}
    for (int i = 1;; i = -1)
    {
      updateLayoutState(i, Math.abs(paramInt1), true, paramState);
      collectPrefetchPositionsForLayoutState(paramState, this.mLayoutState, paramLayoutPrefetchRegistry);
      return;
    }
  }
  
  public void collectInitialPrefetchPositions(int paramInt, RecyclerView.LayoutManager.LayoutPrefetchRegistry paramLayoutPrefetchRegistry)
  {
    boolean bool2;
    int i;
    if ((this.mPendingSavedState != null) && (this.mPendingSavedState.hasValidAnchor()))
    {
      bool2 = this.mPendingSavedState.mAnchorLayoutFromEnd;
      i = this.mPendingSavedState.mAnchorPosition;
      if (!bool2) {
        break label142;
      }
    }
    label142:
    for (int j = -1;; j = 1)
    {
      for (int k = 0; (k < this.mInitialPrefetchItemCount) && (i >= 0) && (i < paramInt); k++)
      {
        paramLayoutPrefetchRegistry.addPosition(i, 0);
        i += j;
      }
      resolveShouldLayoutReverse();
      boolean bool1 = this.mShouldReverseLayout;
      if (this.mPendingScrollPosition == -1)
      {
        if (bool1) {}
        for (int m = paramInt - 1;; m = 0)
        {
          i = m;
          bool2 = bool1;
          break;
        }
      }
      i = this.mPendingScrollPosition;
      bool2 = bool1;
      break;
    }
  }
  
  void collectPrefetchPositionsForLayoutState(RecyclerView.State paramState, b paramb, RecyclerView.LayoutManager.LayoutPrefetchRegistry paramLayoutPrefetchRegistry)
  {
    int i = paramb.d;
    if ((i >= 0) && (i < paramState.getItemCount())) {
      paramLayoutPrefetchRegistry.addPosition(i, Math.max(0, paramb.g));
    }
  }
  
  public int computeHorizontalScrollExtent(RecyclerView.State paramState)
  {
    return computeScrollExtent(paramState);
  }
  
  public int computeHorizontalScrollOffset(RecyclerView.State paramState)
  {
    return computeScrollOffset(paramState);
  }
  
  public int computeHorizontalScrollRange(RecyclerView.State paramState)
  {
    return computeScrollRange(paramState);
  }
  
  public PointF computeScrollVectorForPosition(int paramInt)
  {
    int i = 1;
    if (getChildCount() == 0) {
      return null;
    }
    int j = getPosition(getChildAt(0));
    int k = 0;
    if (paramInt < j) {
      k = i;
    }
    if (k != this.mShouldReverseLayout) {
      i = -1;
    }
    if (this.mOrientation == 0) {
      return new PointF(i, 0.0F);
    }
    return new PointF(0.0F, i);
  }
  
  public int computeVerticalScrollExtent(RecyclerView.State paramState)
  {
    return computeScrollExtent(paramState);
  }
  
  public int computeVerticalScrollOffset(RecyclerView.State paramState)
  {
    return computeScrollOffset(paramState);
  }
  
  public int computeVerticalScrollRange(RecyclerView.State paramState)
  {
    return computeScrollRange(paramState);
  }
  
  int convertFocusDirectionToLayoutDirection(int paramInt)
  {
    int i = -1;
    int j = -2147483648;
    int k = 1;
    switch (paramInt)
    {
    default: 
      i = j;
    case 1: 
    case 2: 
    case 33: 
    case 130: 
    case 17: 
      do
      {
        do
        {
          do
          {
            do
            {
              return i;
            } while ((this.mOrientation == k) || (!isLayoutRTL()));
            return k;
            if (this.mOrientation == k) {
              return k;
            }
          } while (isLayoutRTL());
          return k;
        } while (this.mOrientation == k);
        return j;
        if (this.mOrientation == k) {
          j = k;
        }
        return j;
      } while (this.mOrientation == 0);
      return j;
    }
    if (this.mOrientation == 0) {}
    for (;;)
    {
      return k;
      k = j;
    }
  }
  
  b createLayoutState()
  {
    return new b();
  }
  
  void ensureLayoutState()
  {
    if (this.mLayoutState == null) {
      this.mLayoutState = createLayoutState();
    }
  }
  
  int fill(RecyclerView.Recycler paramRecycler, b paramb, RecyclerView.State paramState, boolean paramBoolean)
  {
    int i = paramb.c;
    if (paramb.g != -2147483648)
    {
      if (paramb.c < 0) {
        paramb.g += paramb.c;
      }
      recycleByLayoutState(paramRecycler, paramb);
    }
    int j = paramb.c + paramb.h;
    LayoutChunkResult localLayoutChunkResult = this.mLayoutChunkResult;
    if (((paramb.l) || (j > 0)) && (paramb.a(paramState)))
    {
      localLayoutChunkResult.resetInternal();
      layoutChunk(paramRecycler, paramState, paramb, localLayoutChunkResult);
      if (!localLayoutChunkResult.mFinished) {
        break label108;
      }
    }
    for (;;)
    {
      return i - paramb.c;
      label108:
      paramb.b += localLayoutChunkResult.mConsumed * paramb.f;
      if ((!localLayoutChunkResult.mIgnoreConsumed) || (this.mLayoutState.k != null) || (!paramState.isPreLayout()))
      {
        paramb.c -= localLayoutChunkResult.mConsumed;
        j -= localLayoutChunkResult.mConsumed;
      }
      if (paramb.g != -2147483648)
      {
        paramb.g += localLayoutChunkResult.mConsumed;
        if (paramb.c < 0) {
          paramb.g += paramb.c;
        }
        recycleByLayoutState(paramRecycler, paramb);
      }
      if ((!paramBoolean) || (!localLayoutChunkResult.mFocusable)) {
        break;
      }
    }
  }
  
  public int findFirstCompletelyVisibleItemPosition()
  {
    View localView = findOneVisibleChild(0, getChildCount(), true, false);
    if (localView == null) {
      return -1;
    }
    return getPosition(localView);
  }
  
  public int findFirstVisibleItemPosition()
  {
    View localView = findOneVisibleChild(0, getChildCount(), false, true);
    if (localView == null) {
      return -1;
    }
    return getPosition(localView);
  }
  
  public int findLastCompletelyVisibleItemPosition()
  {
    View localView = findOneVisibleChild(-1 + getChildCount(), -1, true, false);
    if (localView == null) {
      return -1;
    }
    return getPosition(localView);
  }
  
  public int findLastVisibleItemPosition()
  {
    View localView = findOneVisibleChild(-1 + getChildCount(), -1, false, true);
    if (localView == null) {
      return -1;
    }
    return getPosition(localView);
  }
  
  View findOnePartiallyOrCompletelyInvisibleChild(int paramInt1, int paramInt2)
  {
    ensureLayoutState();
    int i;
    if (paramInt2 > paramInt1) {
      i = 1;
    }
    while (i == 0)
    {
      return getChildAt(paramInt1);
      if (paramInt2 < paramInt1) {
        i = -1;
      } else {
        i = 0;
      }
    }
    int j;
    if (this.mOrientationHelper.getDecoratedStart(getChildAt(paramInt1)) < this.mOrientationHelper.getStartAfterPadding()) {
      j = 16644;
    }
    for (int k = 16388; this.mOrientation == 0; k = 4097)
    {
      return this.mHorizontalBoundCheck.a(paramInt1, paramInt2, j, k);
      j = 4161;
    }
    return this.mVerticalBoundCheck.a(paramInt1, paramInt2, j, k);
  }
  
  View findOneVisibleChild(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 320;
    ensureLayoutState();
    int j;
    if (paramBoolean1)
    {
      j = 24579;
      if (!paramBoolean2) {
        break label65;
      }
    }
    for (;;)
    {
      if (this.mOrientation == 0)
      {
        return this.mHorizontalBoundCheck.a(paramInt1, paramInt2, j, i);
        j = i;
        break;
      }
      return this.mVerticalBoundCheck.a(paramInt1, paramInt2, j, i);
      label65:
      i = 0;
    }
  }
  
  View findReferenceChild(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject1 = null;
    ensureLayoutState();
    int i = this.mOrientationHelper.getStartAfterPadding();
    int j = this.mOrientationHelper.getEndAfterPadding();
    int k;
    Object localObject2;
    label37:
    Object localObject3;
    Object localObject4;
    if (paramInt2 > paramInt1)
    {
      k = 1;
      localObject2 = null;
      if (paramInt1 == paramInt2) {
        break label159;
      }
      localObject3 = getChildAt(paramInt1);
      int m = getPosition((View)localObject3);
      if ((m < 0) || (m >= paramInt3)) {
        break label178;
      }
      if (!((RecyclerView.LayoutParams)((View)localObject3).getLayoutParams()).isItemRemoved()) {
        break label115;
      }
      if (localObject2 != null) {
        break label178;
      }
      localObject4 = localObject1;
    }
    for (;;)
    {
      paramInt1 += k;
      localObject1 = localObject4;
      localObject2 = localObject3;
      break label37;
      k = -1;
      break;
      label115:
      if ((this.mOrientationHelper.getDecoratedStart((View)localObject3) >= j) || (this.mOrientationHelper.getDecoratedEnd((View)localObject3) < i))
      {
        if (localObject1 != null) {
          break label178;
        }
        localObject4 = localObject3;
        localObject3 = localObject2;
        continue;
        if (localObject1 == null) {
          break label171;
        }
      }
      for (;;)
      {
        label159:
        localObject3 = localObject1;
        return localObject3;
        label171:
        localObject1 = localObject2;
      }
      label178:
      localObject4 = localObject1;
      localObject3 = localObject2;
    }
  }
  
  public View findViewByPosition(int paramInt)
  {
    int i = getChildCount();
    View localView;
    if (i == 0) {
      localView = null;
    }
    do
    {
      return localView;
      int j = paramInt - getPosition(getChildAt(0));
      if ((j < 0) || (j >= i)) {
        break;
      }
      localView = getChildAt(j);
    } while (getPosition(localView) == paramInt);
    return super.findViewByPosition(paramInt);
  }
  
  public RecyclerView.LayoutParams generateDefaultLayoutParams()
  {
    return new RecyclerView.LayoutParams(-2, -2);
  }
  
  protected int getExtraLayoutSpace(RecyclerView.State paramState)
  {
    if (paramState.hasTargetScrollPosition()) {
      return this.mOrientationHelper.getTotalSpace();
    }
    return 0;
  }
  
  public int getInitialPrefetchItemCount()
  {
    return this.mInitialPrefetchItemCount;
  }
  
  public int getOrientation()
  {
    return this.mOrientation;
  }
  
  public boolean getRecycleChildrenOnDetach()
  {
    return this.mRecycleChildrenOnDetach;
  }
  
  public boolean getReverseLayout()
  {
    return this.mReverseLayout;
  }
  
  public boolean getStackFromEnd()
  {
    return this.mStackFromEnd;
  }
  
  public boolean isAutoMeasureEnabled()
  {
    return true;
  }
  
  protected boolean isLayoutRTL()
  {
    return getLayoutDirection() == 1;
  }
  
  public boolean isSmoothScrollbarEnabled()
  {
    return this.mSmoothScrollbarEnabled;
  }
  
  void layoutChunk(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, b paramb, LayoutChunkResult paramLayoutChunkResult)
  {
    View localView = paramb.a(paramRecycler);
    if (localView == null)
    {
      paramLayoutChunkResult.mFinished = true;
      return;
    }
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)localView.getLayoutParams();
    boolean bool4;
    label66:
    int i1;
    int k;
    label128:
    int j;
    int i;
    int m;
    if (paramb.k == null)
    {
      boolean bool3 = this.mShouldReverseLayout;
      if (paramb.f == -1)
      {
        bool4 = true;
        if (bool3 != bool4) {
          break label211;
        }
        addView(localView);
        measureChildWithMargins(localView, 0, 0);
        paramLayoutChunkResult.mConsumed = this.mOrientationHelper.getDecoratedMeasurement(localView);
        if (this.mOrientation != 1) {
          break label318;
        }
        if (!isLayoutRTL()) {
          break label270;
        }
        i1 = getWidth() - getPaddingRight();
        k = i1 - this.mOrientationHelper.getDecoratedMeasurementInOther(localView);
        if (paramb.f != -1) {
          break label293;
        }
        j = paramb.b;
        i = paramb.b - paramLayoutChunkResult.mConsumed;
        m = i1;
      }
    }
    for (;;)
    {
      layoutDecoratedWithMargins(localView, k, i, m, j);
      if ((localLayoutParams.isItemRemoved()) || (localLayoutParams.isItemChanged())) {
        paramLayoutChunkResult.mIgnoreConsumed = true;
      }
      paramLayoutChunkResult.mFocusable = localView.hasFocusable();
      return;
      bool4 = false;
      break;
      label211:
      addView(localView, 0);
      break label66;
      boolean bool1 = this.mShouldReverseLayout;
      if (paramb.f == -1) {}
      for (boolean bool2 = true;; bool2 = false)
      {
        if (bool1 != bool2) {
          break label260;
        }
        addDisappearingView(localView);
        break;
      }
      label260:
      addDisappearingView(localView, 0);
      break label66;
      label270:
      k = getPaddingLeft();
      i1 = k + this.mOrientationHelper.getDecoratedMeasurementInOther(localView);
      break label128;
      label293:
      i = paramb.b;
      j = paramb.b + paramLayoutChunkResult.mConsumed;
      m = i1;
      continue;
      label318:
      i = getPaddingTop();
      j = i + this.mOrientationHelper.getDecoratedMeasurementInOther(localView);
      if (paramb.f == -1)
      {
        int n = paramb.b;
        k = paramb.b - paramLayoutChunkResult.mConsumed;
        m = n;
      }
      else
      {
        k = paramb.b;
        m = paramb.b + paramLayoutChunkResult.mConsumed;
      }
    }
  }
  
  void onAnchorReady(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, a parama, int paramInt) {}
  
  public void onDetachedFromWindow(RecyclerView paramRecyclerView, RecyclerView.Recycler paramRecycler)
  {
    super.onDetachedFromWindow(paramRecyclerView, paramRecycler);
    if (this.mRecycleChildrenOnDetach)
    {
      removeAndRecycleAllViews(paramRecycler);
      paramRecycler.clear();
    }
  }
  
  public View onFocusSearchFailed(View paramView, int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    resolveShouldLayoutReverse();
    if (getChildCount() == 0)
    {
      localView2 = null;
      return localView2;
    }
    int i = convertFocusDirectionToLayoutDirection(paramInt);
    if (i == -2147483648) {
      return null;
    }
    ensureLayoutState();
    ensureLayoutState();
    updateLayoutState(i, (int)(0.3333333F * this.mOrientationHelper.getTotalSpace()), false, paramState);
    this.mLayoutState.g = -2147483648;
    this.mLayoutState.a = false;
    fill(paramRecycler, this.mLayoutState, paramState, true);
    View localView1;
    if (i == -1)
    {
      localView1 = findPartiallyOrCompletelyInvisibleChildClosestToStart(paramRecycler, paramState);
      label107:
      if (i != -1) {
        break label146;
      }
    }
    label146:
    for (View localView2 = getChildClosestToStart();; localView2 = getChildClosestToEnd())
    {
      if (!localView2.hasFocusable()) {
        break label155;
      }
      if (localView1 != null) {
        break;
      }
      return null;
      localView1 = findPartiallyOrCompletelyInvisibleChildClosestToEnd(paramRecycler, paramState);
      break label107;
    }
    label155:
    return localView1;
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    if (getChildCount() > 0)
    {
      paramAccessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
      paramAccessibilityEvent.setToIndex(findLastVisibleItemPosition());
    }
  }
  
  public void onLayoutChildren(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    int i = -1;
    if (((this.mPendingSavedState != null) || (this.mPendingScrollPosition != i)) && (paramState.getItemCount() == 0))
    {
      removeAndRecycleAllViews(paramRecycler);
      return;
    }
    if ((this.mPendingSavedState != null) && (this.mPendingSavedState.hasValidAnchor())) {
      this.mPendingScrollPosition = this.mPendingSavedState.mAnchorPosition;
    }
    ensureLayoutState();
    this.mLayoutState.a = false;
    resolveShouldLayoutReverse();
    View localView1 = getFocusedChild();
    int j;
    int k;
    label166:
    int m;
    int n;
    View localView2;
    int i19;
    label260:
    label272:
    label291:
    int i13;
    int i15;
    if ((!this.mAnchorInfo.e) || (this.mPendingScrollPosition != i) || (this.mPendingSavedState != null))
    {
      this.mAnchorInfo.a();
      this.mAnchorInfo.d = (this.mShouldReverseLayout ^ this.mStackFromEnd);
      updateAnchorInfoForLayout(paramRecycler, paramState, this.mAnchorInfo);
      this.mAnchorInfo.e = true;
      j = getExtraLayoutSpace(paramState);
      if (this.mLayoutState.j < 0) {
        break label698;
      }
      k = 0;
      m = k + this.mOrientationHelper.getStartAfterPadding();
      n = j + this.mOrientationHelper.getEndPadding();
      if ((paramState.isPreLayout()) && (this.mPendingScrollPosition != i) && (this.mPendingScrollPositionOffset != -2147483648))
      {
        localView2 = findViewByPosition(this.mPendingScrollPosition);
        if (localView2 != null)
        {
          if (!this.mShouldReverseLayout) {
            break label708;
          }
          i19 = this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(localView2) - this.mPendingScrollPositionOffset;
          if (i19 <= 0) {
            break label739;
          }
          m += i19;
        }
      }
      if (!this.mAnchorInfo.d) {
        break label749;
      }
      if (this.mShouldReverseLayout) {
        i = 1;
      }
      onAnchorReady(paramRecycler, paramState, this.mAnchorInfo, i);
      detachAndScrapAttachedViews(paramRecycler);
      this.mLayoutState.l = resolveIsInfinite();
      this.mLayoutState.i = paramState.isPreLayout();
      if (!this.mAnchorInfo.d) {
        break label761;
      }
      updateLayoutStateToFillStart(this.mAnchorInfo);
      this.mLayoutState.h = m;
      fill(paramRecycler, this.mLayoutState, paramState, false);
      i13 = this.mLayoutState.b;
      int i14 = this.mLayoutState.d;
      if (this.mLayoutState.c > 0) {
        n += this.mLayoutState.c;
      }
      updateLayoutStateToFillEnd(this.mAnchorInfo);
      this.mLayoutState.h = n;
      b localb2 = this.mLayoutState;
      localb2.d += this.mLayoutState.e;
      fill(paramRecycler, this.mLayoutState, paramState, false);
      i15 = this.mLayoutState.b;
      if (this.mLayoutState.c <= 0) {
        break label1015;
      }
      int i17 = this.mLayoutState.c;
      updateLayoutStateToFillStart(i14, i13);
      this.mLayoutState.h = i17;
      fill(paramRecycler, this.mLayoutState, paramState, false);
    }
    label535:
    label604:
    label739:
    label749:
    label1005:
    label1015:
    for (int i16 = this.mLayoutState.b;; i16 = i13)
    {
      int i3 = i16;
      int i1 = i15;
      if (getChildCount() > 0)
      {
        if ((this.mShouldReverseLayout ^ this.mStackFromEnd))
        {
          int i9 = fixLayoutEndGap(i1, paramRecycler, paramState, true);
          int i10 = i3 + i9;
          int i11 = i1 + i9;
          int i12 = fixLayoutStartGap(i10, paramRecycler, paramState, false);
          i3 = i10 + i12;
          i1 = i11 + i12;
        }
      }
      else
      {
        layoutForPredictiveAnimations(paramRecycler, paramState, i3, i1);
        if (paramState.isPreLayout()) {
          break label1005;
        }
        this.mOrientationHelper.onLayoutComplete();
      }
      for (;;)
      {
        this.mLastStackFromEnd = this.mStackFromEnd;
        return;
        if ((localView1 == null) || ((this.mOrientationHelper.getDecoratedStart(localView1) < this.mOrientationHelper.getEndAfterPadding()) && (this.mOrientationHelper.getDecoratedEnd(localView1) > this.mOrientationHelper.getStartAfterPadding()))) {
          break;
        }
        this.mAnchorInfo.a(localView1, getPosition(localView1));
        break;
        k = j;
        j = 0;
        break label166;
        int i18 = this.mOrientationHelper.getDecoratedStart(localView2) - this.mOrientationHelper.getStartAfterPadding();
        i19 = this.mPendingScrollPositionOffset - i18;
        break label260;
        n -= i19;
        break label272;
        if (this.mShouldReverseLayout) {
          break label291;
        }
        i = 1;
        break label291;
        label761:
        updateLayoutStateToFillEnd(this.mAnchorInfo);
        this.mLayoutState.h = n;
        fill(paramRecycler, this.mLayoutState, paramState, false);
        i1 = this.mLayoutState.b;
        int i2 = this.mLayoutState.d;
        if (this.mLayoutState.c > 0) {
          m += this.mLayoutState.c;
        }
        updateLayoutStateToFillStart(this.mAnchorInfo);
        this.mLayoutState.h = m;
        b localb1 = this.mLayoutState;
        localb1.d += this.mLayoutState.e;
        fill(paramRecycler, this.mLayoutState, paramState, false);
        i3 = this.mLayoutState.b;
        if (this.mLayoutState.c <= 0) {
          break label535;
        }
        int i4 = this.mLayoutState.c;
        updateLayoutStateToFillEnd(i2, i1);
        this.mLayoutState.h = i4;
        fill(paramRecycler, this.mLayoutState, paramState, false);
        i1 = this.mLayoutState.b;
        break label535;
        int i5 = fixLayoutStartGap(i3, paramRecycler, paramState, true);
        int i6 = i3 + i5;
        int i7 = i1 + i5;
        int i8 = fixLayoutEndGap(i7, paramRecycler, paramState, false);
        i3 = i6 + i8;
        i1 = i7 + i8;
        break label604;
        this.mAnchorInfo.a();
      }
    }
  }
  
  public void onLayoutCompleted(RecyclerView.State paramState)
  {
    super.onLayoutCompleted(paramState);
    this.mPendingSavedState = null;
    this.mPendingScrollPosition = -1;
    this.mPendingScrollPositionOffset = -2147483648;
    this.mAnchorInfo.a();
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof SavedState))
    {
      this.mPendingSavedState = ((SavedState)paramParcelable);
      requestLayout();
    }
  }
  
  public Parcelable onSaveInstanceState()
  {
    if (this.mPendingSavedState != null) {
      return new SavedState(this.mPendingSavedState);
    }
    SavedState localSavedState = new SavedState();
    if (getChildCount() > 0)
    {
      ensureLayoutState();
      boolean bool = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
      localSavedState.mAnchorLayoutFromEnd = bool;
      if (bool)
      {
        View localView2 = getChildClosestToEnd();
        localSavedState.mAnchorOffset = (this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(localView2));
        localSavedState.mAnchorPosition = getPosition(localView2);
        return localSavedState;
      }
      View localView1 = getChildClosestToStart();
      localSavedState.mAnchorPosition = getPosition(localView1);
      localSavedState.mAnchorOffset = (this.mOrientationHelper.getDecoratedStart(localView1) - this.mOrientationHelper.getStartAfterPadding());
      return localSavedState;
    }
    localSavedState.invalidateAnchor();
    return localSavedState;
  }
  
  public void prepareForDrop(View paramView1, View paramView2, int paramInt1, int paramInt2)
  {
    assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
    ensureLayoutState();
    resolveShouldLayoutReverse();
    int i = getPosition(paramView1);
    int j = getPosition(paramView2);
    int k;
    if (i < j) {
      k = 1;
    }
    while (this.mShouldReverseLayout) {
      if (k == 1)
      {
        scrollToPositionWithOffset(j, this.mOrientationHelper.getEndAfterPadding() - (this.mOrientationHelper.getDecoratedStart(paramView2) + this.mOrientationHelper.getDecoratedMeasurement(paramView1)));
        return;
        k = -1;
      }
      else
      {
        scrollToPositionWithOffset(j, this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(paramView2));
        return;
      }
    }
    if (k == -1)
    {
      scrollToPositionWithOffset(j, this.mOrientationHelper.getDecoratedStart(paramView2));
      return;
    }
    scrollToPositionWithOffset(j, this.mOrientationHelper.getDecoratedEnd(paramView2) - this.mOrientationHelper.getDecoratedMeasurement(paramView1));
  }
  
  boolean resolveIsInfinite()
  {
    return (this.mOrientationHelper.getMode() == 0) && (this.mOrientationHelper.getEnd() == 0);
  }
  
  int scrollBy(int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    if ((getChildCount() == 0) || (paramInt == 0)) {
      return 0;
    }
    this.mLayoutState.a = true;
    ensureLayoutState();
    if (paramInt > 0) {}
    int j;
    int k;
    for (int i = 1;; i = -1)
    {
      j = Math.abs(paramInt);
      updateLayoutState(i, j, true, paramState);
      k = this.mLayoutState.g + fill(paramRecycler, this.mLayoutState, paramState, false);
      if (k >= 0) {
        break;
      }
      return 0;
    }
    if (j > k) {
      paramInt = i * k;
    }
    this.mOrientationHelper.offsetChildren(-paramInt);
    this.mLayoutState.j = paramInt;
    return paramInt;
  }
  
  public int scrollHorizontallyBy(int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    if (this.mOrientation == 1) {
      return 0;
    }
    return scrollBy(paramInt, paramRecycler, paramState);
  }
  
  public void scrollToPosition(int paramInt)
  {
    this.mPendingScrollPosition = paramInt;
    this.mPendingScrollPositionOffset = -2147483648;
    if (this.mPendingSavedState != null) {
      this.mPendingSavedState.invalidateAnchor();
    }
    requestLayout();
  }
  
  public void scrollToPositionWithOffset(int paramInt1, int paramInt2)
  {
    this.mPendingScrollPosition = paramInt1;
    this.mPendingScrollPositionOffset = paramInt2;
    if (this.mPendingSavedState != null) {
      this.mPendingSavedState.invalidateAnchor();
    }
    requestLayout();
  }
  
  public int scrollVerticallyBy(int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    if (this.mOrientation == 0) {
      return 0;
    }
    return scrollBy(paramInt, paramRecycler, paramState);
  }
  
  public void setInitialPrefetchItemCount(int paramInt)
  {
    this.mInitialPrefetchItemCount = paramInt;
  }
  
  public void setOrientation(int paramInt)
  {
    if ((paramInt != 0) && (paramInt != 1)) {
      throw new IllegalArgumentException("invalid orientation:" + paramInt);
    }
    assertNotInLayoutOrScroll(null);
    if ((paramInt != this.mOrientation) || (this.mOrientationHelper == null))
    {
      this.mOrientationHelper = OrientationHelper.createOrientationHelper(this, paramInt);
      this.mAnchorInfo.a = this.mOrientationHelper;
      this.mOrientation = paramInt;
      requestLayout();
    }
  }
  
  public void setRecycleChildrenOnDetach(boolean paramBoolean)
  {
    this.mRecycleChildrenOnDetach = paramBoolean;
  }
  
  public void setReverseLayout(boolean paramBoolean)
  {
    assertNotInLayoutOrScroll(null);
    if (paramBoolean == this.mReverseLayout) {
      return;
    }
    this.mReverseLayout = paramBoolean;
    requestLayout();
  }
  
  public void setSmoothScrollbarEnabled(boolean paramBoolean)
  {
    this.mSmoothScrollbarEnabled = paramBoolean;
  }
  
  public void setStackFromEnd(boolean paramBoolean)
  {
    assertNotInLayoutOrScroll(null);
    if (this.mStackFromEnd == paramBoolean) {
      return;
    }
    this.mStackFromEnd = paramBoolean;
    requestLayout();
  }
  
  boolean shouldMeasureTwice()
  {
    return (getHeightMode() != 1073741824) && (getWidthMode() != 1073741824) && (hasFlexibleChildInBothOrientations());
  }
  
  public void smoothScrollToPosition(RecyclerView paramRecyclerView, RecyclerView.State paramState, int paramInt)
  {
    LinearSmoothScroller localLinearSmoothScroller = new LinearSmoothScroller(paramRecyclerView.getContext());
    localLinearSmoothScroller.setTargetPosition(paramInt);
    startSmoothScroll(localLinearSmoothScroller);
  }
  
  public boolean supportsPredictiveItemAnimations()
  {
    return (this.mPendingSavedState == null) && (this.mLastStackFromEnd == this.mStackFromEnd);
  }
  
  void validateChildOrder()
  {
    int i = 1;
    Log.d("LinearLayoutManager", "validating child count " + getChildCount());
    if (getChildCount() < i) {}
    for (;;)
    {
      return;
      int k = getPosition(getChildAt(0));
      int m = this.mOrientationHelper.getDecoratedStart(getChildAt(0));
      int j;
      if (this.mShouldReverseLayout) {
        for (int i3 = i; i3 < getChildCount(); i3++)
        {
          View localView2 = getChildAt(i3);
          int i4 = getPosition(localView2);
          int i5 = this.mOrientationHelper.getDecoratedStart(localView2);
          if (i4 < k)
          {
            logChildren();
            StringBuilder localStringBuilder2 = new StringBuilder().append("detected invalid position. loc invalid? ");
            if (i5 < m) {}
            for (;;)
            {
              throw new RuntimeException(i);
              j = 0;
            }
          }
          if (i5 > m)
          {
            logChildren();
            throw new RuntimeException("detected invalid location");
          }
        }
      } else {
        for (int n = j; n < getChildCount(); n++)
        {
          View localView1 = getChildAt(n);
          int i1 = getPosition(localView1);
          int i2 = this.mOrientationHelper.getDecoratedStart(localView1);
          if (i1 < k)
          {
            logChildren();
            StringBuilder localStringBuilder1 = new StringBuilder().append("detected invalid position. loc invalid? ");
            if (i2 < m) {}
            for (;;)
            {
              throw new RuntimeException(j);
              j = 0;
            }
          }
          if (i2 < m)
          {
            logChildren();
            throw new RuntimeException("detected invalid location");
          }
        }
      }
    }
  }
  
  protected static class LayoutChunkResult
  {
    public int mConsumed;
    public boolean mFinished;
    public boolean mFocusable;
    public boolean mIgnoreConsumed;
    
    void resetInternal()
    {
      this.mConsumed = 0;
      this.mFinished = false;
      this.mIgnoreConsumed = false;
      this.mFocusable = false;
    }
  }
  
  public static class SavedState
    implements Parcelable
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator()
    {
      public LinearLayoutManager.SavedState a(Parcel paramAnonymousParcel)
      {
        return new LinearLayoutManager.SavedState(paramAnonymousParcel);
      }
      
      public LinearLayoutManager.SavedState[] a(int paramAnonymousInt)
      {
        return new LinearLayoutManager.SavedState[paramAnonymousInt];
      }
    };
    boolean mAnchorLayoutFromEnd;
    int mAnchorOffset;
    int mAnchorPosition;
    
    public SavedState() {}
    
    SavedState(Parcel paramParcel)
    {
      this.mAnchorPosition = paramParcel.readInt();
      this.mAnchorOffset = paramParcel.readInt();
      if (paramParcel.readInt() == i) {}
      for (;;)
      {
        this.mAnchorLayoutFromEnd = i;
        return;
        i = 0;
      }
    }
    
    public SavedState(SavedState paramSavedState)
    {
      this.mAnchorPosition = paramSavedState.mAnchorPosition;
      this.mAnchorOffset = paramSavedState.mAnchorOffset;
      this.mAnchorLayoutFromEnd = paramSavedState.mAnchorLayoutFromEnd;
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    boolean hasValidAnchor()
    {
      return this.mAnchorPosition >= 0;
    }
    
    void invalidateAnchor()
    {
      this.mAnchorPosition = -1;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeInt(this.mAnchorPosition);
      paramParcel.writeInt(this.mAnchorOffset);
      if (this.mAnchorLayoutFromEnd) {}
      for (int i = 1;; i = 0)
      {
        paramParcel.writeInt(i);
        return;
      }
    }
  }
  
  static class a
  {
    OrientationHelper a;
    int b;
    int c;
    boolean d;
    boolean e;
    
    a()
    {
      a();
    }
    
    void a()
    {
      this.b = -1;
      this.c = -2147483648;
      this.d = false;
      this.e = false;
    }
    
    public void a(View paramView, int paramInt)
    {
      int i = this.a.getTotalSpaceChange();
      if (i >= 0) {
        b(paramView, paramInt);
      }
      int k;
      int i1;
      do
      {
        int j;
        do
        {
          int i2;
          int i6;
          do
          {
            do
            {
              return;
              this.b = paramInt;
              if (!this.d) {
                break;
              }
              i2 = this.a.getEndAfterPadding() - i - this.a.getDecoratedEnd(paramView);
              this.c = (this.a.getEndAfterPadding() - i2);
            } while (i2 <= 0);
            int i3 = this.a.getDecoratedMeasurement(paramView);
            int i4 = this.c - i3;
            int i5 = this.a.getStartAfterPadding();
            i6 = i4 - (i5 + Math.min(this.a.getDecoratedStart(paramView) - i5, 0));
          } while (i6 >= 0);
          this.c += Math.min(i2, -i6);
          return;
          j = this.a.getDecoratedStart(paramView);
          k = j - this.a.getStartAfterPadding();
          this.c = j;
        } while (k <= 0);
        int m = j + this.a.getDecoratedMeasurement(paramView);
        int n = this.a.getEndAfterPadding() - i - this.a.getDecoratedEnd(paramView);
        i1 = this.a.getEndAfterPadding() - Math.min(0, n) - m;
      } while (i1 >= 0);
      this.c -= Math.min(k, -i1);
    }
    
    boolean a(View paramView, RecyclerView.State paramState)
    {
      RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
      return (!localLayoutParams.isItemRemoved()) && (localLayoutParams.getViewLayoutPosition() >= 0) && (localLayoutParams.getViewLayoutPosition() < paramState.getItemCount());
    }
    
    void b()
    {
      if (this.d) {}
      for (int i = this.a.getEndAfterPadding();; i = this.a.getStartAfterPadding())
      {
        this.c = i;
        return;
      }
    }
    
    public void b(View paramView, int paramInt)
    {
      if (this.d) {}
      for (this.c = (this.a.getDecoratedEnd(paramView) + this.a.getTotalSpaceChange());; this.c = this.a.getDecoratedStart(paramView))
      {
        this.b = paramInt;
        return;
      }
    }
    
    public String toString()
    {
      return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
    }
  }
  
  static class b
  {
    boolean a = true;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h = 0;
    boolean i = false;
    int j;
    List<RecyclerView.ViewHolder> k = null;
    boolean l;
    
    private View b()
    {
      int m = this.k.size();
      int n = 0;
      if (n < m)
      {
        View localView = ((RecyclerView.ViewHolder)this.k.get(n)).itemView;
        RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)localView.getLayoutParams();
        if (localLayoutParams.isItemRemoved()) {}
        while (this.d != localLayoutParams.getViewLayoutPosition())
        {
          n++;
          break;
        }
        a(localView);
        return localView;
      }
      return null;
    }
    
    View a(RecyclerView.Recycler paramRecycler)
    {
      if (this.k != null) {
        return b();
      }
      View localView = paramRecycler.getViewForPosition(this.d);
      this.d += this.e;
      return localView;
    }
    
    public void a()
    {
      a(null);
    }
    
    public void a(View paramView)
    {
      View localView = b(paramView);
      if (localView == null)
      {
        this.d = -1;
        return;
      }
      this.d = ((RecyclerView.LayoutParams)localView.getLayoutParams()).getViewLayoutPosition();
    }
    
    boolean a(RecyclerView.State paramState)
    {
      return (this.d >= 0) && (this.d < paramState.getItemCount());
    }
    
    public View b(View paramView)
    {
      int m = this.k.size();
      Object localObject1 = null;
      int n = 2147483647;
      int i1 = 0;
      if (i1 < m)
      {
        View localView = ((RecyclerView.ViewHolder)this.k.get(i1)).itemView;
        RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)localView.getLayoutParams();
        int i2;
        Object localObject2;
        if (localView != paramView) {
          if (localLayoutParams.isItemRemoved())
          {
            i2 = n;
            localObject2 = localObject1;
          }
        }
        for (;;)
        {
          i1++;
          localObject1 = localObject2;
          n = i2;
          break;
          i2 = (localLayoutParams.getViewLayoutPosition() - this.d) * this.e;
          if (i2 < 0)
          {
            i2 = n;
            localObject2 = localObject1;
          }
          else if (i2 < n)
          {
            if (i2 == 0) {
              return localView;
            }
            localObject2 = localView;
          }
          else
          {
            i2 = n;
            localObject2 = localObject1;
          }
        }
      }
      return localObject1;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.LinearLayoutManager
 * JD-Core Version:    0.7.0.1
 */