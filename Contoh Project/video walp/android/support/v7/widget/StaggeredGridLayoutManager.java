package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.a.b;
import android.support.v4.view.a.b.c;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager
  extends RecyclerView.LayoutManager
  implements RecyclerView.SmoothScroller.ScrollVectorProvider
{
  static final boolean DEBUG = false;
  @Deprecated
  public static final int GAP_HANDLING_LAZY = 1;
  public static final int GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS = 2;
  public static final int GAP_HANDLING_NONE = 0;
  public static final int HORIZONTAL = 0;
  static final int INVALID_OFFSET = -2147483648;
  private static final float MAX_SCROLL_FACTOR = 0.3333333F;
  private static final String TAG = "StaggeredGridLManager";
  public static final int VERTICAL = 1;
  private final a mAnchorInfo = new a();
  private final Runnable mCheckForGapsRunnable = new Runnable()
  {
    public void run()
    {
      StaggeredGridLayoutManager.this.checkForGaps();
    }
  };
  private int mFullSizeSpec;
  private int mGapStrategy = 2;
  private boolean mLaidOutInvalidFullSpan = false;
  private boolean mLastLayoutFromEnd;
  private boolean mLastLayoutRTL;
  private final u mLayoutState;
  LazySpanLookup mLazySpanLookup = new LazySpanLookup();
  private int mOrientation;
  private SavedState mPendingSavedState;
  int mPendingScrollPosition = -1;
  int mPendingScrollPositionOffset = -2147483648;
  private int[] mPrefetchDistances;
  OrientationHelper mPrimaryOrientation;
  private BitSet mRemainingSpans;
  boolean mReverseLayout = false;
  OrientationHelper mSecondaryOrientation;
  boolean mShouldReverseLayout = false;
  private int mSizePerSpan;
  private boolean mSmoothScrollbarEnabled = true;
  private int mSpanCount = -1;
  b[] mSpans;
  private final Rect mTmpRect = new Rect();
  
  public StaggeredGridLayoutManager(int paramInt1, int paramInt2)
  {
    this.mOrientation = paramInt2;
    setSpanCount(paramInt1);
    this.mLayoutState = new u();
    createOrientationHelpers();
  }
  
  public StaggeredGridLayoutManager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    RecyclerView.LayoutManager.Properties localProperties = getProperties(paramContext, paramAttributeSet, paramInt1, paramInt2);
    setOrientation(localProperties.orientation);
    setSpanCount(localProperties.spanCount);
    setReverseLayout(localProperties.reverseLayout);
    this.mLayoutState = new u();
    createOrientationHelpers();
  }
  
  private void appendViewToAllSpans(View paramView)
  {
    for (int i = -1 + this.mSpanCount; i >= 0; i--) {
      this.mSpans[i].b(paramView);
    }
  }
  
  private void applyPendingSavedState(a parama)
  {
    if (this.mPendingSavedState.mSpanOffsetsSize > 0) {
      if (this.mPendingSavedState.mSpanOffsetsSize == this.mSpanCount)
      {
        int i = 0;
        if (i < this.mSpanCount)
        {
          this.mSpans[i].e();
          int j = this.mPendingSavedState.mSpanOffsets[i];
          if (j != -2147483648)
          {
            if (!this.mPendingSavedState.mAnchorLayoutFromEnd) {
              break label95;
            }
            j += this.mPrimaryOrientation.getEndAfterPadding();
          }
          for (;;)
          {
            this.mSpans[i].c(j);
            i++;
            break;
            label95:
            j += this.mPrimaryOrientation.getStartAfterPadding();
          }
        }
      }
      else
      {
        this.mPendingSavedState.invalidateSpanInfo();
        this.mPendingSavedState.mAnchorPosition = this.mPendingSavedState.mVisibleAnchorPosition;
      }
    }
    this.mLastLayoutRTL = this.mPendingSavedState.mLastLayoutRTL;
    setReverseLayout(this.mPendingSavedState.mReverseLayout);
    resolveShouldLayoutReverse();
    if (this.mPendingSavedState.mAnchorPosition != -1) {
      this.mPendingScrollPosition = this.mPendingSavedState.mAnchorPosition;
    }
    for (parama.c = this.mPendingSavedState.mAnchorLayoutFromEnd;; parama.c = this.mShouldReverseLayout)
    {
      if (this.mPendingSavedState.mSpanLookupSize > 1)
      {
        this.mLazySpanLookup.a = this.mPendingSavedState.mSpanLookup;
        this.mLazySpanLookup.b = this.mPendingSavedState.mFullSpanItems;
      }
      return;
    }
  }
  
  private void attachViewToSpans(View paramView, LayoutParams paramLayoutParams, u paramu)
  {
    if (paramu.e == 1)
    {
      if (paramLayoutParams.mFullSpan)
      {
        appendViewToAllSpans(paramView);
        return;
      }
      paramLayoutParams.mSpan.b(paramView);
      return;
    }
    if (paramLayoutParams.mFullSpan)
    {
      prependViewToAllSpans(paramView);
      return;
    }
    paramLayoutParams.mSpan.a(paramView);
  }
  
  private int calculateScrollDirectionForPosition(int paramInt)
  {
    int i = -1;
    if (getChildCount() == 0)
    {
      if (this.mShouldReverseLayout) {
        return 1;
      }
      return i;
    }
    int j;
    if (paramInt < getFirstChildPosition())
    {
      j = 1;
      if (j == this.mShouldReverseLayout) {
        break label45;
      }
    }
    for (;;)
    {
      return i;
      j = 0;
      break;
      label45:
      i = 1;
    }
  }
  
  private boolean checkSpanForGap(b paramb)
  {
    boolean bool = true;
    if (this.mShouldReverseLayout)
    {
      if (paramb.d() < this.mPrimaryOrientation.getEndAfterPadding())
      {
        if (!paramb.c((View)paramb.a.get(-1 + paramb.a.size())).mFullSpan) {
          return bool;
        }
        return false;
      }
    }
    else if (paramb.b() > this.mPrimaryOrientation.getStartAfterPadding())
    {
      if (!paramb.c((View)paramb.a.get(0)).mFullSpan) {}
      for (;;)
      {
        return bool;
        bool = false;
      }
    }
    return false;
  }
  
  private int computeScrollExtent(RecyclerView.State paramState)
  {
    boolean bool1 = true;
    if (getChildCount() == 0) {
      return 0;
    }
    OrientationHelper localOrientationHelper = this.mPrimaryOrientation;
    boolean bool2;
    View localView;
    if (!this.mSmoothScrollbarEnabled)
    {
      bool2 = bool1;
      localView = findFirstVisibleItemClosestToStart(bool2);
      if (this.mSmoothScrollbarEnabled) {
        break label65;
      }
    }
    for (;;)
    {
      return aa.a(paramState, localOrientationHelper, localView, findFirstVisibleItemClosestToEnd(bool1), this, this.mSmoothScrollbarEnabled);
      bool2 = false;
      break;
      label65:
      bool1 = false;
    }
  }
  
  private int computeScrollOffset(RecyclerView.State paramState)
  {
    boolean bool1 = true;
    if (getChildCount() == 0) {
      return 0;
    }
    OrientationHelper localOrientationHelper = this.mPrimaryOrientation;
    boolean bool2;
    View localView;
    if (!this.mSmoothScrollbarEnabled)
    {
      bool2 = bool1;
      localView = findFirstVisibleItemClosestToStart(bool2);
      if (this.mSmoothScrollbarEnabled) {
        break label69;
      }
    }
    for (;;)
    {
      return aa.a(paramState, localOrientationHelper, localView, findFirstVisibleItemClosestToEnd(bool1), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
      bool2 = false;
      break;
      label69:
      bool1 = false;
    }
  }
  
  private int computeScrollRange(RecyclerView.State paramState)
  {
    boolean bool1 = true;
    if (getChildCount() == 0) {
      return 0;
    }
    OrientationHelper localOrientationHelper = this.mPrimaryOrientation;
    boolean bool2;
    View localView;
    if (!this.mSmoothScrollbarEnabled)
    {
      bool2 = bool1;
      localView = findFirstVisibleItemClosestToStart(bool2);
      if (this.mSmoothScrollbarEnabled) {
        break label65;
      }
    }
    for (;;)
    {
      return aa.b(paramState, localOrientationHelper, localView, findFirstVisibleItemClosestToEnd(bool1), this, this.mSmoothScrollbarEnabled);
      bool2 = false;
      break;
      label65:
      bool1 = false;
    }
  }
  
  private int convertFocusDirectionToLayoutDirection(int paramInt)
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
  
  private StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem createFullSpanItemFromEnd(int paramInt)
  {
    StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem = new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem();
    localFullSpanItem.c = new int[this.mSpanCount];
    for (int i = 0; i < this.mSpanCount; i++) {
      localFullSpanItem.c[i] = (paramInt - this.mSpans[i].b(paramInt));
    }
    return localFullSpanItem;
  }
  
  private StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem createFullSpanItemFromStart(int paramInt)
  {
    StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem = new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem();
    localFullSpanItem.c = new int[this.mSpanCount];
    for (int i = 0; i < this.mSpanCount; i++) {
      localFullSpanItem.c[i] = (this.mSpans[i].a(paramInt) - paramInt);
    }
    return localFullSpanItem;
  }
  
  private void createOrientationHelpers()
  {
    this.mPrimaryOrientation = OrientationHelper.createOrientationHelper(this, this.mOrientation);
    this.mSecondaryOrientation = OrientationHelper.createOrientationHelper(this, 1 - this.mOrientation);
  }
  
  private int fill(RecyclerView.Recycler paramRecycler, u paramu, RecyclerView.State paramState)
  {
    this.mRemainingSpans.set(0, this.mSpanCount, true);
    int i;
    int j;
    label62:
    int k;
    label65:
    View localView;
    LayoutParams localLayoutParams;
    int i1;
    int i2;
    int i3;
    label137:
    b localb2;
    label158:
    b localb1;
    label173:
    label194:
    int i13;
    label227:
    int i6;
    int i5;
    if (this.mLayoutState.i) {
      if (paramu.e == 1)
      {
        i = 2147483647;
        updateAllRemainingSpans(paramu.e, i);
        if (!this.mShouldReverseLayout) {
          break label507;
        }
        j = this.mPrimaryOrientation.getEndAfterPadding();
        k = 0;
        if ((!paramu.a(paramState)) || ((!this.mLayoutState.i) && (this.mRemainingSpans.isEmpty()))) {
          break label885;
        }
        localView = paramu.a(paramRecycler);
        localLayoutParams = (LayoutParams)localView.getLayoutParams();
        i1 = localLayoutParams.getViewLayoutPosition();
        i2 = this.mLazySpanLookup.c(i1);
        if (i2 != -1) {
          break label519;
        }
        i3 = 1;
        if (i3 == 0) {
          break label535;
        }
        if (!localLayoutParams.mFullSpan) {
          break label525;
        }
        localb2 = this.mSpans[0];
        this.mLazySpanLookup.a(i1, localb2);
        localb1 = localb2;
        localLayoutParams.mSpan = localb1;
        if (paramu.e != 1) {
          break label547;
        }
        addView(localView);
        measureChildWithDecorationsAndMargin(localView, localLayoutParams, false);
        if (paramu.e != 1) {
          break label569;
        }
        if (!localLayoutParams.mFullSpan) {
          break label557;
        }
        i13 = getMaxEnd(j);
        i6 = i13 + this.mPrimaryOrientation.getDecoratedMeasurement(localView);
        if ((i3 == 0) || (!localLayoutParams.mFullSpan)) {
          break label976;
        }
        StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem3 = createFullSpanItemFromEnd(i13);
        localFullSpanItem3.b = -1;
        localFullSpanItem3.a = i1;
        this.mLazySpanLookup.a(localFullSpanItem3);
        i5 = i13;
      }
    }
    for (;;)
    {
      label314:
      int i11;
      label355:
      int i9;
      int i8;
      if ((localLayoutParams.mFullSpan) && (paramu.d == -1))
      {
        if (i3 != 0) {
          this.mLaidOutInvalidFullSpan = true;
        }
      }
      else
      {
        attachViewToSpans(localView, localLayoutParams, paramu);
        if ((!isLayoutRTL()) || (this.mOrientation != 1)) {
          break label769;
        }
        if (!localLayoutParams.mFullSpan) {
          break label739;
        }
        i11 = this.mSecondaryOrientation.getEndAfterPadding();
        i9 = i11 - this.mSecondaryOrientation.getDecoratedMeasurement(localView);
        i8 = i11;
        if (this.mOrientation != 1) {
          break label830;
        }
        layoutDecoratedWithMargins(localView, i9, i5, i8, i6);
        label395:
        if (!localLayoutParams.mFullSpan) {
          break label847;
        }
        updateAllRemainingSpans(this.mLayoutState.e, i);
        label416:
        recycle(paramRecycler, this.mLayoutState);
        if ((this.mLayoutState.h) && (localView.hasFocusable()))
        {
          if (!localLayoutParams.mFullSpan) {
            break label869;
          }
          this.mRemainingSpans.clear();
        }
      }
      for (;;)
      {
        k = 1;
        break label65;
        i = -2147483648;
        break;
        if (paramu.e == 1)
        {
          i = paramu.g + paramu.b;
          break;
        }
        i = paramu.f - paramu.b;
        break;
        label507:
        j = this.mPrimaryOrientation.getStartAfterPadding();
        break label62;
        label519:
        i3 = 0;
        break label137;
        label525:
        localb2 = getNextSpan(paramu);
        break label158;
        label535:
        localb1 = this.mSpans[i2];
        break label173;
        label547:
        addView(localView, 0);
        break label194;
        label557:
        i13 = localb1.b(j);
        break label227;
        label569:
        if (localLayoutParams.mFullSpan) {}
        for (int i4 = getMinStart(j);; i4 = localb1.a(j))
        {
          i5 = i4 - this.mPrimaryOrientation.getDecoratedMeasurement(localView);
          if ((i3 != 0) && (localLayoutParams.mFullSpan))
          {
            StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem2 = createFullSpanItemFromStart(i4);
            localFullSpanItem2.b = 1;
            localFullSpanItem2.a = i1;
            this.mLazySpanLookup.a(localFullSpanItem2);
          }
          i6 = i4;
          break;
        }
        int i12;
        if (paramu.e == 1) {
          if (!areAllEndsEqual()) {
            i12 = 1;
          }
        }
        for (;;)
        {
          if (i12 == 0) {
            break label737;
          }
          StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem1 = this.mLazySpanLookup.f(i1);
          if (localFullSpanItem1 != null) {
            localFullSpanItem1.d = true;
          }
          this.mLaidOutInvalidFullSpan = true;
          break;
          i12 = 0;
          continue;
          if (!areAllStartsEqual()) {
            i12 = 1;
          } else {
            i12 = 0;
          }
        }
        label737:
        break label314;
        label739:
        i11 = this.mSecondaryOrientation.getEndAfterPadding() - (-1 + this.mSpanCount - localb1.e) * this.mSizePerSpan;
        break label355;
        label769:
        if (localLayoutParams.mFullSpan) {}
        for (int i7 = this.mSecondaryOrientation.getStartAfterPadding();; i7 = localb1.e * this.mSizePerSpan + this.mSecondaryOrientation.getStartAfterPadding())
        {
          i8 = i7 + this.mSecondaryOrientation.getDecoratedMeasurement(localView);
          i9 = i7;
          break;
        }
        label830:
        layoutDecoratedWithMargins(localView, i5, i9, i6, i8);
        break label395;
        label847:
        int i10 = this.mLayoutState.e;
        updateRemainingSpans(localb1, i10, i);
        break label416;
        label869:
        this.mRemainingSpans.set(localb1.e, false);
      }
      label885:
      if (k == 0) {
        recycle(paramRecycler, this.mLayoutState);
      }
      int n;
      if (this.mLayoutState.e == -1) {
        n = getMinStart(this.mPrimaryOrientation.getStartAfterPadding());
      }
      for (int m = this.mPrimaryOrientation.getStartAfterPadding() - n; m > 0; m = getMaxEnd(this.mPrimaryOrientation.getEndAfterPadding()) - this.mPrimaryOrientation.getEndAfterPadding()) {
        return Math.min(paramu.b, m);
      }
      return 0;
      label976:
      i5 = i13;
    }
  }
  
  private int findFirstReferenceChildPosition(int paramInt)
  {
    int i = getChildCount();
    for (int j = 0; j < i; j++)
    {
      int k = getPosition(getChildAt(j));
      if ((k >= 0) && (k < paramInt)) {
        return k;
      }
    }
    return 0;
  }
  
  private int findLastReferenceChildPosition(int paramInt)
  {
    for (int i = -1 + getChildCount(); i >= 0; i--)
    {
      int j = getPosition(getChildAt(i));
      if ((j >= 0) && (j < paramInt)) {
        return j;
      }
    }
    return 0;
  }
  
  private void fixEndGap(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, boolean paramBoolean)
  {
    int i = getMaxEnd(-2147483648);
    if (i == -2147483648) {}
    int k;
    do
    {
      int j;
      do
      {
        return;
        j = this.mPrimaryOrientation.getEndAfterPadding() - i;
      } while (j <= 0);
      k = j - -scrollBy(-j, paramRecycler, paramState);
    } while ((!paramBoolean) || (k <= 0));
    this.mPrimaryOrientation.offsetChildren(k);
  }
  
  private void fixStartGap(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, boolean paramBoolean)
  {
    int i = getMinStart(2147483647);
    if (i == 2147483647) {}
    int k;
    do
    {
      int j;
      do
      {
        return;
        j = i - this.mPrimaryOrientation.getStartAfterPadding();
      } while (j <= 0);
      k = j - scrollBy(j, paramRecycler, paramState);
    } while ((!paramBoolean) || (k <= 0));
    this.mPrimaryOrientation.offsetChildren(-k);
  }
  
  private int getMaxEnd(int paramInt)
  {
    int i = this.mSpans[0].b(paramInt);
    for (int j = 1; j < this.mSpanCount; j++)
    {
      int k = this.mSpans[j].b(paramInt);
      if (k > i) {
        i = k;
      }
    }
    return i;
  }
  
  private int getMaxStart(int paramInt)
  {
    int i = this.mSpans[0].a(paramInt);
    for (int j = 1; j < this.mSpanCount; j++)
    {
      int k = this.mSpans[j].a(paramInt);
      if (k > i) {
        i = k;
      }
    }
    return i;
  }
  
  private int getMinEnd(int paramInt)
  {
    int i = this.mSpans[0].b(paramInt);
    for (int j = 1; j < this.mSpanCount; j++)
    {
      int k = this.mSpans[j].b(paramInt);
      if (k < i) {
        i = k;
      }
    }
    return i;
  }
  
  private int getMinStart(int paramInt)
  {
    int i = this.mSpans[0].a(paramInt);
    for (int j = 1; j < this.mSpanCount; j++)
    {
      int k = this.mSpans[j].a(paramInt);
      if (k < i) {
        i = k;
      }
    }
    return i;
  }
  
  private b getNextSpan(u paramu)
  {
    Object localObject1 = null;
    int i = -1;
    int k;
    int j;
    int i4;
    int i5;
    label52:
    b localb2;
    int i6;
    if (preferLastSpan(paramu.e))
    {
      k = -1 + this.mSpanCount;
      j = i;
      if (paramu.e != 1) {
        break label118;
      }
      int i3 = this.mPrimaryOrientation.getStartAfterPadding();
      i4 = k;
      i5 = 2147483647;
      if (i4 == j) {
        break label187;
      }
      localb2 = this.mSpans[i4];
      i6 = localb2.b(i3);
      if (i6 >= i5) {
        break label199;
      }
    }
    for (Object localObject3 = localb2;; localObject3 = localObject1)
    {
      i4 += i;
      localObject1 = localObject3;
      i5 = i6;
      break label52;
      j = this.mSpanCount;
      i = 1;
      k = 0;
      break;
      label118:
      int m = this.mPrimaryOrientation.getEndAfterPadding();
      int n = k;
      int i1 = -2147483648;
      b localb1;
      int i2;
      if (n != j)
      {
        localb1 = this.mSpans[n];
        i2 = localb1.a(m);
        if (i2 <= i1) {
          break label189;
        }
      }
      for (Object localObject2 = localb1;; localObject2 = localObject1)
      {
        n += i;
        localObject1 = localObject2;
        i1 = i2;
        break;
        label187:
        return localObject1;
        label189:
        i2 = i1;
      }
      label199:
      i6 = i5;
    }
  }
  
  private void handleUpdate(int paramInt1, int paramInt2, int paramInt3)
  {
    int i;
    int j;
    int k;
    if (this.mShouldReverseLayout)
    {
      i = getLastChildPosition();
      if (paramInt3 != 8) {
        break label104;
      }
      if (paramInt1 >= paramInt2) {
        break label93;
      }
      j = paramInt2 + 1;
      k = paramInt1;
      label32:
      this.mLazySpanLookup.b(k);
      switch (paramInt3)
      {
      default: 
        label76:
        if (j > i) {
          break;
        }
      }
    }
    for (;;)
    {
      return;
      i = getFirstChildPosition();
      break;
      label93:
      j = paramInt1 + 1;
      k = paramInt2;
      break label32;
      label104:
      j = paramInt1 + paramInt2;
      k = paramInt1;
      break label32;
      this.mLazySpanLookup.b(paramInt1, paramInt2);
      break label76;
      this.mLazySpanLookup.a(paramInt1, paramInt2);
      break label76;
      this.mLazySpanLookup.a(paramInt1, 1);
      this.mLazySpanLookup.b(paramInt2, 1);
      break label76;
      if (this.mShouldReverseLayout) {}
      for (int m = getFirstChildPosition(); k <= m; m = getLastChildPosition())
      {
        requestLayout();
        return;
      }
    }
  }
  
  private void measureChildWithDecorationsAndMargin(View paramView, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    calculateItemDecorationsForChild(paramView, this.mTmpRect);
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    int i = updateSpecWithExtra(paramInt1, localLayoutParams.leftMargin + this.mTmpRect.left, localLayoutParams.rightMargin + this.mTmpRect.right);
    int j = updateSpecWithExtra(paramInt2, localLayoutParams.topMargin + this.mTmpRect.top, localLayoutParams.bottomMargin + this.mTmpRect.bottom);
    if (paramBoolean) {}
    for (boolean bool = shouldReMeasureChild(paramView, i, j, localLayoutParams);; bool = shouldMeasureChild(paramView, i, j, localLayoutParams))
    {
      if (bool) {
        paramView.measure(i, j);
      }
      return;
    }
  }
  
  private void measureChildWithDecorationsAndMargin(View paramView, LayoutParams paramLayoutParams, boolean paramBoolean)
  {
    if (paramLayoutParams.mFullSpan)
    {
      if (this.mOrientation == 1)
      {
        measureChildWithDecorationsAndMargin(paramView, this.mFullSizeSpec, getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), paramLayoutParams.height, true), paramBoolean);
        return;
      }
      measureChildWithDecorationsAndMargin(paramView, getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), paramLayoutParams.width, true), this.mFullSizeSpec, paramBoolean);
      return;
    }
    if (this.mOrientation == 1)
    {
      measureChildWithDecorationsAndMargin(paramView, getChildMeasureSpec(this.mSizePerSpan, getWidthMode(), 0, paramLayoutParams.width, false), getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), paramLayoutParams.height, true), paramBoolean);
      return;
    }
    measureChildWithDecorationsAndMargin(paramView, getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), paramLayoutParams.width, true), getChildMeasureSpec(this.mSizePerSpan, getHeightMode(), 0, paramLayoutParams.height, false), paramBoolean);
  }
  
  private void onLayoutChildren(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, boolean paramBoolean)
  {
    a locala = this.mAnchorInfo;
    if (((this.mPendingSavedState != null) || (this.mPendingScrollPosition != -1)) && (paramState.getItemCount() == 0))
    {
      removeAndRecycleAllViews(paramRecycler);
      locala.a();
      return;
    }
    int i;
    if ((!locala.e) || (this.mPendingScrollPosition != -1) || (this.mPendingSavedState != null))
    {
      i = 1;
      if (i != 0)
      {
        locala.a();
        if (this.mPendingSavedState == null) {
          break label244;
        }
        applyPendingSavedState(locala);
      }
    }
    for (;;)
    {
      updateAnchorInfoForLayout(paramState, locala);
      locala.e = true;
      if ((this.mPendingSavedState == null) && (this.mPendingScrollPosition == -1) && ((locala.c != this.mLastLayoutFromEnd) || (isLayoutRTL() != this.mLastLayoutRTL)))
      {
        this.mLazySpanLookup.a();
        locala.d = true;
      }
      if ((getChildCount() <= 0) || ((this.mPendingSavedState != null) && (this.mPendingSavedState.mSpanOffsetsSize >= 1))) {
        break label323;
      }
      if (!locala.d) {
        break label260;
      }
      for (int i1 = 0; i1 < this.mSpanCount; i1++)
      {
        this.mSpans[i1].e();
        if (locala.b != -2147483648) {
          this.mSpans[i1].c(locala.b);
        }
      }
      i = 0;
      break;
      label244:
      resolveShouldLayoutReverse();
      locala.c = this.mShouldReverseLayout;
    }
    label260:
    label323:
    label454:
    int k;
    if ((i != 0) || (this.mAnchorInfo.f == null))
    {
      for (int m = 0; m < this.mSpanCount; m++) {
        this.mSpans[m].a(this.mShouldReverseLayout, locala.b);
      }
      this.mAnchorInfo.a(this.mSpans);
      detachAndScrapAttachedViews(paramRecycler);
      this.mLayoutState.a = false;
      this.mLaidOutInvalidFullSpan = false;
      updateMeasureSpecs(this.mSecondaryOrientation.getTotalSpace());
      updateLayoutState(locala.a, paramState);
      if (!locala.c) {
        break label618;
      }
      setLayoutStateDirection(-1);
      fill(paramRecycler, this.mLayoutState, paramState);
      setLayoutStateDirection(1);
      this.mLayoutState.c = (locala.a + this.mLayoutState.d);
      fill(paramRecycler, this.mLayoutState, paramState);
      label422:
      repositionToWrapContentIfNecessary();
      if (getChildCount() > 0)
      {
        if (!this.mShouldReverseLayout) {
          break label673;
        }
        fixEndGap(paramRecycler, paramState, true);
        fixStartGap(paramRecycler, paramState, false);
      }
      if ((!paramBoolean) || (paramState.isPreLayout())) {
        break label696;
      }
      if ((this.mGapStrategy == 0) || (getChildCount() <= 0) || ((!this.mLaidOutInvalidFullSpan) && (hasGapsToFix() == null))) {
        break label690;
      }
      k = 1;
      label496:
      if (k == 0) {
        break label696;
      }
      removeCallbacks(this.mCheckForGapsRunnable);
      if (!checkForGaps()) {
        break label696;
      }
    }
    label673:
    label690:
    label696:
    for (int j = 1;; j = 0)
    {
      if (paramState.isPreLayout()) {
        this.mAnchorInfo.a();
      }
      this.mLastLayoutFromEnd = locala.c;
      this.mLastLayoutRTL = isLayoutRTL();
      if (j == 0) {
        break;
      }
      this.mAnchorInfo.a();
      onLayoutChildren(paramRecycler, paramState, false);
      return;
      for (int n = 0; n < this.mSpanCount; n++)
      {
        b localb = this.mSpans[n];
        localb.e();
        localb.c(this.mAnchorInfo.f[n]);
      }
      break label323;
      label618:
      setLayoutStateDirection(1);
      fill(paramRecycler, this.mLayoutState, paramState);
      setLayoutStateDirection(-1);
      this.mLayoutState.c = (locala.a + this.mLayoutState.d);
      fill(paramRecycler, this.mLayoutState, paramState);
      break label422;
      fixStartGap(paramRecycler, paramState, true);
      fixEndGap(paramRecycler, paramState, false);
      break label454;
      k = 0;
      break label496;
    }
  }
  
  private boolean preferLastSpan(int paramInt)
  {
    int k;
    if (this.mOrientation == 0) {
      if (paramInt == -1)
      {
        k = 1;
        if (k == this.mShouldReverseLayout) {
          break label32;
        }
      }
    }
    label32:
    label66:
    label69:
    for (;;)
    {
      return true;
      k = 0;
      break;
      return false;
      int i;
      if (paramInt == -1)
      {
        i = 1;
        if (i != this.mShouldReverseLayout) {
          break label66;
        }
      }
      for (int j = 1;; j = 0)
      {
        if (j == isLayoutRTL()) {
          break label69;
        }
        return false;
        i = 0;
        break;
      }
    }
  }
  
  private void prependViewToAllSpans(View paramView)
  {
    for (int i = -1 + this.mSpanCount; i >= 0; i--) {
      this.mSpans[i].a(paramView);
    }
  }
  
  private void recycle(RecyclerView.Recycler paramRecycler, u paramu)
  {
    if ((!paramu.a) || (paramu.i)) {
      return;
    }
    if (paramu.b == 0)
    {
      if (paramu.e == -1)
      {
        recycleFromEnd(paramRecycler, paramu.g);
        return;
      }
      recycleFromStart(paramRecycler, paramu.f);
      return;
    }
    if (paramu.e == -1)
    {
      int k = paramu.f - getMaxStart(paramu.f);
      if (k < 0) {}
      for (int m = paramu.g;; m = paramu.g - Math.min(k, paramu.b))
      {
        recycleFromEnd(paramRecycler, m);
        return;
      }
    }
    int i = getMinEnd(paramu.g) - paramu.g;
    if (i < 0) {}
    for (int j = paramu.f;; j = paramu.f + Math.min(i, paramu.b))
    {
      recycleFromStart(paramRecycler, j);
      return;
    }
  }
  
  private void recycleFromEnd(RecyclerView.Recycler paramRecycler, int paramInt)
  {
    for (int i = -1 + getChildCount();; i--)
    {
      View localView;
      LayoutParams localLayoutParams;
      if (i >= 0)
      {
        localView = getChildAt(i);
        if ((this.mPrimaryOrientation.getDecoratedStart(localView) >= paramInt) && (this.mPrimaryOrientation.getTransformedStartWithDecoration(localView) >= paramInt))
        {
          localLayoutParams = (LayoutParams)localView.getLayoutParams();
          if (!localLayoutParams.mFullSpan) {
            break label126;
          }
          j = 0;
          if (j >= this.mSpanCount) {
            break label98;
          }
          if (this.mSpans[j].a.size() != 1) {
            break label92;
          }
        }
      }
      label92:
      label98:
      label126:
      while (localLayoutParams.mSpan.a.size() == 1)
      {
        for (;;)
        {
          int j;
          return;
          j++;
        }
        for (int k = 0; k < this.mSpanCount; k++) {
          this.mSpans[k].g();
        }
      }
      localLayoutParams.mSpan.g();
      removeAndRecycleView(localView, paramRecycler);
    }
  }
  
  private void recycleFromStart(RecyclerView.Recycler paramRecycler, int paramInt)
  {
    for (;;)
    {
      View localView;
      LayoutParams localLayoutParams;
      if (getChildCount() > 0)
      {
        localView = getChildAt(0);
        if ((this.mPrimaryOrientation.getDecoratedEnd(localView) <= paramInt) && (this.mPrimaryOrientation.getTransformedEndWithDecoration(localView) <= paramInt))
        {
          localLayoutParams = (LayoutParams)localView.getLayoutParams();
          if (!localLayoutParams.mFullSpan) {
            break label118;
          }
          i = 0;
          if (i >= this.mSpanCount) {
            break label90;
          }
          if (this.mSpans[i].a.size() != 1) {
            break label84;
          }
        }
      }
      label84:
      label90:
      label118:
      while (localLayoutParams.mSpan.a.size() == 1)
      {
        for (;;)
        {
          int i;
          return;
          i++;
        }
        for (int j = 0; j < this.mSpanCount; j++) {
          this.mSpans[j].h();
        }
      }
      localLayoutParams.mSpan.h();
      removeAndRecycleView(localView, paramRecycler);
    }
  }
  
  private void repositionToWrapContentIfNecessary()
  {
    if (this.mSecondaryOrientation.getMode() == 1073741824) {
      return;
    }
    float f1 = 0.0F;
    int i = getChildCount();
    int j = 0;
    float f2;
    float f4;
    while (j < i)
    {
      View localView2 = getChildAt(j);
      f2 = this.mSecondaryOrientation.getDecoratedMeasurement(localView2);
      if (f2 < f1)
      {
        f4 = f1;
        label57:
        j++;
        f1 = f4;
      }
      else
      {
        if (!((LayoutParams)localView2.getLayoutParams()).isFullSpan()) {
          break label329;
        }
      }
    }
    label165:
    label329:
    for (float f3 = 1.0F * f2 / this.mSpanCount;; f3 = f2)
    {
      f4 = Math.max(f1, f3);
      break label57;
      int k = this.mSizePerSpan;
      int m = Math.round(f1 * this.mSpanCount);
      if (this.mSecondaryOrientation.getMode() == -2147483648) {
        m = Math.min(m, this.mSecondaryOrientation.getTotalSpace());
      }
      updateMeasureSpecs(m);
      if (this.mSizePerSpan == k) {
        break;
      }
      int n = 0;
      View localView1;
      LayoutParams localLayoutParams;
      if (n < i)
      {
        localView1 = getChildAt(n);
        localLayoutParams = (LayoutParams)localView1.getLayoutParams();
        if (!localLayoutParams.mFullSpan) {
          break label203;
        }
      }
      for (;;)
      {
        n++;
        break label165;
        break;
        label203:
        if ((isLayoutRTL()) && (this.mOrientation == 1))
        {
          localView1.offsetLeftAndRight(-(-1 + this.mSpanCount - localLayoutParams.mSpan.e) * this.mSizePerSpan - k * -(-1 + this.mSpanCount - localLayoutParams.mSpan.e));
        }
        else
        {
          int i1 = localLayoutParams.mSpan.e * this.mSizePerSpan;
          int i2 = k * localLayoutParams.mSpan.e;
          if (this.mOrientation == 1) {
            localView1.offsetLeftAndRight(i1 - i2);
          } else {
            localView1.offsetTopAndBottom(i1 - i2);
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
  
  private void setLayoutStateDirection(int paramInt)
  {
    int i = 1;
    this.mLayoutState.e = paramInt;
    u localu = this.mLayoutState;
    int j = this.mShouldReverseLayout;
    if (paramInt == -1)
    {
      int k = i;
      if (j != k) {
        break label48;
      }
    }
    for (;;)
    {
      localu.d = i;
      return;
      int m = 0;
      break;
      label48:
      i = -1;
    }
  }
  
  private void updateAllRemainingSpans(int paramInt1, int paramInt2)
  {
    int i = 0;
    if (i < this.mSpanCount)
    {
      if (this.mSpans[i].a.isEmpty()) {}
      for (;;)
      {
        i++;
        break;
        updateRemainingSpans(this.mSpans[i], paramInt1, paramInt2);
      }
    }
  }
  
  private boolean updateAnchorFromChildren(RecyclerView.State paramState, a parama)
  {
    if (this.mLastLayoutFromEnd) {}
    for (int i = findLastReferenceChildPosition(paramState.getItemCount());; i = findFirstReferenceChildPosition(paramState.getItemCount()))
    {
      parama.a = i;
      parama.b = -2147483648;
      return true;
    }
  }
  
  private void updateLayoutState(int paramInt, RecyclerView.State paramState)
  {
    this.mLayoutState.b = 0;
    this.mLayoutState.c = paramInt;
    boolean bool3;
    int i;
    int j;
    if (isSmoothScrolling())
    {
      int n = paramState.getTargetScrollPosition();
      if (n != -1)
      {
        boolean bool2 = this.mShouldReverseLayout;
        if (n < paramInt)
        {
          bool3 = true;
          if (bool2 != bool3) {
            break label181;
          }
          i = this.mPrimaryOrientation.getTotalSpace();
          j = 0;
        }
      }
    }
    for (;;)
    {
      label68:
      if (getClipToPadding())
      {
        this.mLayoutState.f = (this.mPrimaryOrientation.getStartAfterPadding() - j);
        this.mLayoutState.g = (i + this.mPrimaryOrientation.getEndAfterPadding());
      }
      for (;;)
      {
        this.mLayoutState.h = false;
        this.mLayoutState.a = true;
        u localu = this.mLayoutState;
        int k = this.mPrimaryOrientation.getMode();
        boolean bool1 = false;
        if (k == 0)
        {
          int m = this.mPrimaryOrientation.getEnd();
          bool1 = false;
          if (m == 0) {
            bool1 = true;
          }
        }
        localu.i = bool1;
        return;
        bool3 = false;
        break;
        label181:
        j = this.mPrimaryOrientation.getTotalSpace();
        i = 0;
        break label68;
        this.mLayoutState.g = (i + this.mPrimaryOrientation.getEnd());
        this.mLayoutState.f = (-j);
      }
      i = 0;
      j = 0;
    }
  }
  
  private void updateRemainingSpans(b paramb, int paramInt1, int paramInt2)
  {
    int i = paramb.i();
    if (paramInt1 == -1) {
      if (i + paramb.b() <= paramInt2) {
        this.mRemainingSpans.set(paramb.e, false);
      }
    }
    while (paramb.d() - i < paramInt2) {
      return;
    }
    this.mRemainingSpans.set(paramb.e, false);
  }
  
  private int updateSpecWithExtra(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt2 == 0) && (paramInt3 == 0)) {}
    int i;
    do
    {
      return paramInt1;
      i = View.MeasureSpec.getMode(paramInt1);
    } while ((i != -2147483648) && (i != 1073741824));
    return View.MeasureSpec.makeMeasureSpec(Math.max(0, View.MeasureSpec.getSize(paramInt1) - paramInt2 - paramInt3), i);
  }
  
  boolean areAllEndsEqual()
  {
    int i = 1;
    int j = this.mSpans[0].b(-2147483648);
    for (int k = i;; k++) {
      if (k < this.mSpanCount)
      {
        if (this.mSpans[k].b(-2147483648) != j) {
          i = 0;
        }
      }
      else {
        return i;
      }
    }
  }
  
  boolean areAllStartsEqual()
  {
    int i = 1;
    int j = this.mSpans[0].a(-2147483648);
    for (int k = i;; k++) {
      if (k < this.mSpanCount)
      {
        if (this.mSpans[k].a(-2147483648) != j) {
          i = 0;
        }
      }
      else {
        return i;
      }
    }
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
  
  boolean checkForGaps()
  {
    if ((getChildCount() == 0) || (this.mGapStrategy == 0) || (!isAttachedToWindow())) {
      return false;
    }
    int i2;
    int k;
    if (this.mShouldReverseLayout)
    {
      int i1 = getLastChildPosition();
      i2 = getFirstChildPosition();
      k = i1;
    }
    int j;
    for (int m = i2; (k == 0) && (hasGapsToFix() != null); m = j)
    {
      this.mLazySpanLookup.a();
      requestSimpleAnimationsInNextLayout();
      requestLayout();
      return true;
      int i = getFirstChildPosition();
      j = getLastChildPosition();
      k = i;
    }
    if (!this.mLaidOutInvalidFullSpan) {
      return false;
    }
    if (this.mShouldReverseLayout) {}
    StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem1;
    for (int n = -1;; n = 1)
    {
      localFullSpanItem1 = this.mLazySpanLookup.a(k, m + 1, n, true);
      if (localFullSpanItem1 != null) {
        break;
      }
      this.mLaidOutInvalidFullSpan = false;
      this.mLazySpanLookup.a(m + 1);
      return false;
    }
    StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem2 = this.mLazySpanLookup.a(k, localFullSpanItem1.a, n * -1, true);
    if (localFullSpanItem2 == null) {
      this.mLazySpanLookup.a(localFullSpanItem1.a);
    }
    for (;;)
    {
      requestSimpleAnimationsInNextLayout();
      requestLayout();
      return true;
      this.mLazySpanLookup.a(1 + localFullSpanItem2.a);
    }
  }
  
  public boolean checkLayoutParams(RecyclerView.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof LayoutParams;
  }
  
  public void collectAdjacentPrefetchPositions(int paramInt1, int paramInt2, RecyclerView.State paramState, RecyclerView.LayoutManager.LayoutPrefetchRegistry paramLayoutPrefetchRegistry)
  {
    int i = 0;
    if (this.mOrientation == 0) {
      if ((getChildCount() != 0) && (paramInt1 != 0)) {
        break label27;
      }
    }
    for (;;)
    {
      return;
      paramInt1 = paramInt2;
      break;
      label27:
      prepareLayoutStateForDelta(paramInt1, paramState);
      if ((this.mPrefetchDistances == null) || (this.mPrefetchDistances.length < this.mSpanCount)) {
        this.mPrefetchDistances = new int[this.mSpanCount];
      }
      int j = 0;
      int k = 0;
      if (j < this.mSpanCount)
      {
        if (this.mLayoutState.d == -1) {}
        for (int m = this.mLayoutState.f - this.mSpans[j].a(this.mLayoutState.f);; m = this.mSpans[j].b(this.mLayoutState.g) - this.mLayoutState.g)
        {
          if (m >= 0)
          {
            this.mPrefetchDistances[k] = m;
            k++;
          }
          j++;
          break;
        }
      }
      Arrays.sort(this.mPrefetchDistances, 0, k);
      while ((i < k) && (this.mLayoutState.a(paramState)))
      {
        paramLayoutPrefetchRegistry.addPosition(this.mLayoutState.c, this.mPrefetchDistances[i]);
        u localu = this.mLayoutState;
        localu.c += this.mLayoutState.d;
        i++;
      }
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
    int i = calculateScrollDirectionForPosition(paramInt);
    PointF localPointF = new PointF();
    if (i == 0) {
      return null;
    }
    if (this.mOrientation == 0)
    {
      localPointF.x = i;
      localPointF.y = 0.0F;
      return localPointF;
    }
    localPointF.x = 0.0F;
    localPointF.y = i;
    return localPointF;
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
  
  public int[] findFirstCompletelyVisibleItemPositions(int[] paramArrayOfInt)
  {
    if (paramArrayOfInt == null) {
      paramArrayOfInt = new int[this.mSpanCount];
    }
    while (paramArrayOfInt.length >= this.mSpanCount) {
      for (int i = 0; i < this.mSpanCount; i++) {
        paramArrayOfInt[i] = this.mSpans[i].l();
      }
    }
    throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.mSpanCount + ", array size:" + paramArrayOfInt.length);
    return paramArrayOfInt;
  }
  
  View findFirstVisibleItemClosestToEnd(boolean paramBoolean)
  {
    int i = this.mPrimaryOrientation.getStartAfterPadding();
    int j = this.mPrimaryOrientation.getEndAfterPadding();
    int k = -1 + getChildCount();
    Object localObject = null;
    if (k >= 0)
    {
      View localView = getChildAt(k);
      int m = this.mPrimaryOrientation.getDecoratedStart(localView);
      int n = this.mPrimaryOrientation.getDecoratedEnd(localView);
      if ((n <= i) || (m >= j)) {}
      for (;;)
      {
        k--;
        break;
        if ((n <= j) || (!paramBoolean)) {
          return localView;
        }
        if (localObject == null) {
          localObject = localView;
        }
      }
    }
    return localObject;
  }
  
  View findFirstVisibleItemClosestToStart(boolean paramBoolean)
  {
    int i = this.mPrimaryOrientation.getStartAfterPadding();
    int j = this.mPrimaryOrientation.getEndAfterPadding();
    int k = getChildCount();
    int m = 0;
    Object localObject = null;
    if (m < k)
    {
      View localView = getChildAt(m);
      int n = this.mPrimaryOrientation.getDecoratedStart(localView);
      if ((this.mPrimaryOrientation.getDecoratedEnd(localView) <= i) || (n >= j)) {}
      for (;;)
      {
        m++;
        break;
        if ((n >= i) || (!paramBoolean)) {
          return localView;
        }
        if (localObject == null) {
          localObject = localView;
        }
      }
    }
    return localObject;
  }
  
  int findFirstVisibleItemPositionInt()
  {
    if (this.mShouldReverseLayout) {}
    for (View localView = findFirstVisibleItemClosestToEnd(true); localView == null; localView = findFirstVisibleItemClosestToStart(true)) {
      return -1;
    }
    return getPosition(localView);
  }
  
  public int[] findFirstVisibleItemPositions(int[] paramArrayOfInt)
  {
    if (paramArrayOfInt == null) {
      paramArrayOfInt = new int[this.mSpanCount];
    }
    while (paramArrayOfInt.length >= this.mSpanCount) {
      for (int i = 0; i < this.mSpanCount; i++) {
        paramArrayOfInt[i] = this.mSpans[i].j();
      }
    }
    throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.mSpanCount + ", array size:" + paramArrayOfInt.length);
    return paramArrayOfInt;
  }
  
  public int[] findLastCompletelyVisibleItemPositions(int[] paramArrayOfInt)
  {
    if (paramArrayOfInt == null) {
      paramArrayOfInt = new int[this.mSpanCount];
    }
    while (paramArrayOfInt.length >= this.mSpanCount) {
      for (int i = 0; i < this.mSpanCount; i++) {
        paramArrayOfInt[i] = this.mSpans[i].o();
      }
    }
    throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.mSpanCount + ", array size:" + paramArrayOfInt.length);
    return paramArrayOfInt;
  }
  
  public int[] findLastVisibleItemPositions(int[] paramArrayOfInt)
  {
    if (paramArrayOfInt == null) {
      paramArrayOfInt = new int[this.mSpanCount];
    }
    while (paramArrayOfInt.length >= this.mSpanCount) {
      for (int i = 0; i < this.mSpanCount; i++) {
        paramArrayOfInt[i] = this.mSpans[i].m();
      }
    }
    throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.mSpanCount + ", array size:" + paramArrayOfInt.length);
    return paramArrayOfInt;
  }
  
  public RecyclerView.LayoutParams generateDefaultLayoutParams()
  {
    if (this.mOrientation == 0) {
      return new LayoutParams(-2, -1);
    }
    return new LayoutParams(-1, -2);
  }
  
  public RecyclerView.LayoutParams generateLayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new LayoutParams(paramContext, paramAttributeSet);
  }
  
  public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new LayoutParams(paramLayoutParams);
  }
  
  public int getColumnCountForAccessibility(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    if (this.mOrientation == 1) {
      return this.mSpanCount;
    }
    return super.getColumnCountForAccessibility(paramRecycler, paramState);
  }
  
  int getFirstChildPosition()
  {
    if (getChildCount() == 0) {
      return 0;
    }
    return getPosition(getChildAt(0));
  }
  
  public int getGapStrategy()
  {
    return this.mGapStrategy;
  }
  
  int getLastChildPosition()
  {
    int i = getChildCount();
    if (i == 0) {
      return 0;
    }
    return getPosition(getChildAt(i - 1));
  }
  
  public int getOrientation()
  {
    return this.mOrientation;
  }
  
  public boolean getReverseLayout()
  {
    return this.mReverseLayout;
  }
  
  public int getRowCountForAccessibility(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    if (this.mOrientation == 0) {
      return this.mSpanCount;
    }
    return super.getRowCountForAccessibility(paramRecycler, paramState);
  }
  
  public int getSpanCount()
  {
    return this.mSpanCount;
  }
  
  View hasGapsToFix()
  {
    int i = -1 + getChildCount();
    BitSet localBitSet = new BitSet(this.mSpanCount);
    localBitSet.set(0, this.mSpanCount, true);
    int j;
    int k;
    if ((this.mOrientation == 1) && (isLayoutRTL()))
    {
      j = 1;
      if (!this.mShouldReverseLayout) {
        break label128;
      }
      k = -1;
      label56:
      if (i >= k) {
        break label138;
      }
    }
    int n;
    View localView1;
    LayoutParams localLayoutParams1;
    label128:
    label138:
    for (int m = 1;; m = -1)
    {
      n = i;
      if (n == k) {
        break label356;
      }
      localView1 = getChildAt(n);
      localLayoutParams1 = (LayoutParams)localView1.getLayoutParams();
      if (!localBitSet.get(localLayoutParams1.mSpan.e)) {
        break label156;
      }
      if (!checkSpanForGap(localLayoutParams1.mSpan)) {
        break label144;
      }
      return localView1;
      j = -1;
      break;
      k = i + 1;
      i = 0;
      break label56;
    }
    label144:
    localBitSet.clear(localLayoutParams1.mSpan.e);
    label156:
    if (localLayoutParams1.mFullSpan) {}
    label282:
    label350:
    label354:
    label356:
    label358:
    label362:
    for (;;)
    {
      n += m;
      break;
      if (n + m != k)
      {
        View localView2 = getChildAt(n + m);
        int i3;
        if (this.mShouldReverseLayout)
        {
          int i6 = this.mPrimaryOrientation.getDecoratedEnd(localView1);
          int i7 = this.mPrimaryOrientation.getDecoratedEnd(localView2);
          if (i6 < i7) {
            return localView1;
          }
          if (i6 != i7) {
            break label358;
          }
          i3 = 1;
        }
        for (;;)
        {
          if (i3 == 0) {
            break label362;
          }
          LayoutParams localLayoutParams2 = (LayoutParams)localView2.getLayoutParams();
          int i4;
          if (localLayoutParams1.mSpan.e - localLayoutParams2.mSpan.e < 0)
          {
            i4 = 1;
            if (j >= 0) {
              break label350;
            }
          }
          for (int i5 = 1;; i5 = 0)
          {
            if (i4 == i5) {
              break label354;
            }
            return localView1;
            int i1 = this.mPrimaryOrientation.getDecoratedStart(localView1);
            int i2 = this.mPrimaryOrientation.getDecoratedStart(localView2);
            if (i1 > i2) {
              return localView1;
            }
            if (i1 != i2) {
              break label358;
            }
            i3 = 1;
            break;
            i4 = 0;
            break label282;
          }
          break;
          return null;
          i3 = 0;
        }
      }
    }
  }
  
  public void invalidateSpanAssignments()
  {
    this.mLazySpanLookup.a();
    requestLayout();
  }
  
  public boolean isAutoMeasureEnabled()
  {
    return this.mGapStrategy != 0;
  }
  
  boolean isLayoutRTL()
  {
    return getLayoutDirection() == 1;
  }
  
  public void offsetChildrenHorizontal(int paramInt)
  {
    super.offsetChildrenHorizontal(paramInt);
    for (int i = 0; i < this.mSpanCount; i++) {
      this.mSpans[i].d(paramInt);
    }
  }
  
  public void offsetChildrenVertical(int paramInt)
  {
    super.offsetChildrenVertical(paramInt);
    for (int i = 0; i < this.mSpanCount; i++) {
      this.mSpans[i].d(paramInt);
    }
  }
  
  public void onDetachedFromWindow(RecyclerView paramRecyclerView, RecyclerView.Recycler paramRecycler)
  {
    super.onDetachedFromWindow(paramRecyclerView, paramRecycler);
    removeCallbacks(this.mCheckForGapsRunnable);
    for (int i = 0; i < this.mSpanCount; i++) {
      this.mSpans[i].e();
    }
    paramRecyclerView.requestLayout();
  }
  
  public View onFocusSearchFailed(View paramView, int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    View localView4;
    if (getChildCount() == 0)
    {
      localView4 = null;
      return localView4;
    }
    View localView1 = findContainingItemView(paramView);
    if (localView1 == null) {
      return null;
    }
    resolveShouldLayoutReverse();
    int i = convertFocusDirectionToLayoutDirection(paramInt);
    if (i == -2147483648) {
      return null;
    }
    LayoutParams localLayoutParams = (LayoutParams)localView1.getLayoutParams();
    boolean bool1 = localLayoutParams.mFullSpan;
    b localb = localLayoutParams.mSpan;
    if (i == 1) {}
    for (int j = getLastChildPosition();; j = getFirstChildPosition())
    {
      updateLayoutState(j, paramState);
      setLayoutStateDirection(i);
      this.mLayoutState.c = (j + this.mLayoutState.d);
      this.mLayoutState.b = ((int)(0.3333333F * this.mPrimaryOrientation.getTotalSpace()));
      this.mLayoutState.h = true;
      this.mLayoutState.a = false;
      fill(paramRecycler, this.mLayoutState, paramState);
      this.mLastLayoutFromEnd = this.mShouldReverseLayout;
      if (bool1) {
        break;
      }
      View localView7 = localb.a(j, i);
      if ((localView7 == null) || (localView7 == localView1)) {
        break;
      }
      return localView7;
    }
    if (preferLastSpan(i)) {
      for (int i7 = -1 + this.mSpanCount; i7 >= 0; i7--)
      {
        View localView6 = this.mSpans[i7].a(j, i);
        if ((localView6 != null) && (localView6 != localView1)) {
          return localView6;
        }
      }
    }
    for (int k = 0; k < this.mSpanCount; k++)
    {
      View localView5 = this.mSpans[k].a(j, i);
      if ((localView5 != null) && (localView5 != localView1)) {
        return localView5;
      }
    }
    int m;
    label327:
    int n;
    label336:
    int i1;
    if (!this.mReverseLayout)
    {
      m = 1;
      if (i != -1) {
        break label434;
      }
      n = 1;
      if (m != n) {
        break label440;
      }
      i1 = 1;
      label346:
      if (!bool1) {
        if (i1 == 0) {
          break label446;
        }
      }
    }
    int i2;
    int i4;
    label434:
    label440:
    label446:
    for (int i6 = localb.k();; i6 = localb.n())
    {
      localView4 = findViewByPosition(i6);
      if ((localView4 != null) && (localView4 != localView1)) {
        break;
      }
      boolean bool2 = preferLastSpan(i);
      i2 = 0;
      if (!bool2) {
        break label514;
      }
      for (i4 = -1 + this.mSpanCount;; i4--)
      {
        if (i4 < 0) {
          break label578;
        }
        if (i4 != localb.e) {
          break;
        }
      }
      m = 0;
      break label327;
      n = 0;
      break label336;
      i1 = 0;
      break label346;
    }
    if (i1 != 0) {}
    for (int i5 = this.mSpans[i4].k();; i5 = this.mSpans[i4].n())
    {
      View localView3 = findViewByPosition(i5);
      if ((localView3 == null) || (localView3 == localView1)) {
        break;
      }
      return localView3;
    }
    i2++;
    label514:
    if (i2 < this.mSpanCount)
    {
      if (i1 != 0) {}
      for (int i3 = this.mSpans[i2].k();; i3 = this.mSpans[i2].n())
      {
        View localView2 = findViewByPosition(i3);
        if ((localView2 == null) || (localView2 == localView1)) {
          break;
        }
        return localView2;
      }
    }
    label578:
    return null;
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    View localView1;
    View localView2;
    if (getChildCount() > 0)
    {
      localView1 = findFirstVisibleItemClosestToStart(false);
      localView2 = findFirstVisibleItemClosestToEnd(false);
      if ((localView1 != null) && (localView2 != null)) {}
    }
    else
    {
      return;
    }
    int i = getPosition(localView1);
    int j = getPosition(localView2);
    if (i < j)
    {
      paramAccessibilityEvent.setFromIndex(i);
      paramAccessibilityEvent.setToIndex(j);
      return;
    }
    paramAccessibilityEvent.setFromIndex(j);
    paramAccessibilityEvent.setToIndex(i);
  }
  
  public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, View paramView, b paramb)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if (!(localLayoutParams instanceof LayoutParams))
    {
      super.onInitializeAccessibilityNodeInfoForItem(paramView, paramb);
      return;
    }
    LayoutParams localLayoutParams1 = (LayoutParams)localLayoutParams;
    if (this.mOrientation == 0)
    {
      int k = localLayoutParams1.getSpanIndex();
      if (localLayoutParams1.mFullSpan) {}
      for (int m = this.mSpanCount;; m = 1)
      {
        paramb.b(b.c.a(k, m, -1, -1, localLayoutParams1.mFullSpan, false));
        return;
      }
    }
    int i = localLayoutParams1.getSpanIndex();
    if (localLayoutParams1.mFullSpan) {}
    for (int j = this.mSpanCount;; j = 1)
    {
      paramb.b(b.c.a(-1, -1, i, j, localLayoutParams1.mFullSpan, false));
      return;
    }
  }
  
  public void onItemsAdded(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    handleUpdate(paramInt1, paramInt2, 1);
  }
  
  public void onItemsChanged(RecyclerView paramRecyclerView)
  {
    this.mLazySpanLookup.a();
    requestLayout();
  }
  
  public void onItemsMoved(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, int paramInt3)
  {
    handleUpdate(paramInt1, paramInt2, 8);
  }
  
  public void onItemsRemoved(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    handleUpdate(paramInt1, paramInt2, 2);
  }
  
  public void onItemsUpdated(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, Object paramObject)
  {
    handleUpdate(paramInt1, paramInt2, 4);
  }
  
  public void onLayoutChildren(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    onLayoutChildren(paramRecycler, paramState, true);
  }
  
  public void onLayoutCompleted(RecyclerView.State paramState)
  {
    super.onLayoutCompleted(paramState);
    this.mPendingScrollPosition = -1;
    this.mPendingScrollPositionOffset = -2147483648;
    this.mPendingSavedState = null;
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
    localSavedState.mReverseLayout = this.mReverseLayout;
    localSavedState.mAnchorLayoutFromEnd = this.mLastLayoutFromEnd;
    localSavedState.mLastLayoutRTL = this.mLastLayoutRTL;
    int i;
    label118:
    int j;
    label151:
    int k;
    if ((this.mLazySpanLookup != null) && (this.mLazySpanLookup.a != null))
    {
      localSavedState.mSpanLookup = this.mLazySpanLookup.a;
      localSavedState.mSpanLookupSize = localSavedState.mSpanLookup.length;
      localSavedState.mFullSpanItems = this.mLazySpanLookup.b;
      if (getChildCount() <= 0) {
        break label263;
      }
      if (!this.mLastLayoutFromEnd) {
        break label220;
      }
      i = getLastChildPosition();
      localSavedState.mAnchorPosition = i;
      localSavedState.mVisibleAnchorPosition = findFirstVisibleItemPositionInt();
      localSavedState.mSpanOffsetsSize = this.mSpanCount;
      localSavedState.mSpanOffsets = new int[this.mSpanCount];
      j = 0;
      if (j >= this.mSpanCount) {
        return localSavedState;
      }
      if (!this.mLastLayoutFromEnd) {
        break label228;
      }
      k = this.mSpans[j].b(-2147483648);
      if (k != -2147483648) {
        k -= this.mPrimaryOrientation.getEndAfterPadding();
      }
    }
    for (;;)
    {
      localSavedState.mSpanOffsets[j] = k;
      j++;
      break label151;
      localSavedState.mSpanLookupSize = 0;
      break;
      label220:
      i = getFirstChildPosition();
      break label118;
      label228:
      k = this.mSpans[j].a(-2147483648);
      if (k != -2147483648) {
        k -= this.mPrimaryOrientation.getStartAfterPadding();
      }
    }
    label263:
    localSavedState.mAnchorPosition = -1;
    localSavedState.mVisibleAnchorPosition = -1;
    localSavedState.mSpanOffsetsSize = 0;
    return localSavedState;
  }
  
  public void onScrollStateChanged(int paramInt)
  {
    if (paramInt == 0) {
      checkForGaps();
    }
  }
  
  void prepareLayoutStateForDelta(int paramInt, RecyclerView.State paramState)
  {
    int j;
    int i;
    if (paramInt > 0)
    {
      j = getLastChildPosition();
      i = 1;
    }
    for (;;)
    {
      this.mLayoutState.a = true;
      updateLayoutState(j, paramState);
      setLayoutStateDirection(i);
      this.mLayoutState.c = (j + this.mLayoutState.d);
      this.mLayoutState.b = Math.abs(paramInt);
      return;
      i = -1;
      j = getFirstChildPosition();
    }
  }
  
  int scrollBy(int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    if ((getChildCount() == 0) || (paramInt == 0)) {
      return 0;
    }
    prepareLayoutStateForDelta(paramInt, paramState);
    int i = fill(paramRecycler, this.mLayoutState, paramState);
    if (this.mLayoutState.b < i) {}
    for (;;)
    {
      this.mPrimaryOrientation.offsetChildren(-paramInt);
      this.mLastLayoutFromEnd = this.mShouldReverseLayout;
      this.mLayoutState.b = 0;
      recycle(paramRecycler, this.mLayoutState);
      return paramInt;
      if (paramInt < 0) {
        paramInt = -i;
      } else {
        paramInt = i;
      }
    }
  }
  
  public int scrollHorizontallyBy(int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    return scrollBy(paramInt, paramRecycler, paramState);
  }
  
  public void scrollToPosition(int paramInt)
  {
    if ((this.mPendingSavedState != null) && (this.mPendingSavedState.mAnchorPosition != paramInt)) {
      this.mPendingSavedState.invalidateAnchorPositionInfo();
    }
    this.mPendingScrollPosition = paramInt;
    this.mPendingScrollPositionOffset = -2147483648;
    requestLayout();
  }
  
  public void scrollToPositionWithOffset(int paramInt1, int paramInt2)
  {
    if (this.mPendingSavedState != null) {
      this.mPendingSavedState.invalidateAnchorPositionInfo();
    }
    this.mPendingScrollPosition = paramInt1;
    this.mPendingScrollPositionOffset = paramInt2;
    requestLayout();
  }
  
  public int scrollVerticallyBy(int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    return scrollBy(paramInt, paramRecycler, paramState);
  }
  
  public void setGapStrategy(int paramInt)
  {
    assertNotInLayoutOrScroll(null);
    if (paramInt == this.mGapStrategy) {
      return;
    }
    if ((paramInt != 0) && (paramInt != 2)) {
      throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
    }
    this.mGapStrategy = paramInt;
    requestLayout();
  }
  
  public void setMeasuredDimension(Rect paramRect, int paramInt1, int paramInt2)
  {
    int i = getPaddingLeft() + getPaddingRight();
    int j = getPaddingTop() + getPaddingBottom();
    int m;
    int k;
    if (this.mOrientation == 1)
    {
      m = chooseSize(paramInt2, j + paramRect.height(), getMinimumHeight());
      k = chooseSize(paramInt1, i + this.mSizePerSpan * this.mSpanCount, getMinimumWidth());
    }
    for (;;)
    {
      setMeasuredDimension(k, m);
      return;
      k = chooseSize(paramInt1, i + paramRect.width(), getMinimumWidth());
      m = chooseSize(paramInt2, j + this.mSizePerSpan * this.mSpanCount, getMinimumHeight());
    }
  }
  
  public void setOrientation(int paramInt)
  {
    if ((paramInt != 0) && (paramInt != 1)) {
      throw new IllegalArgumentException("invalid orientation.");
    }
    assertNotInLayoutOrScroll(null);
    if (paramInt == this.mOrientation) {
      return;
    }
    this.mOrientation = paramInt;
    OrientationHelper localOrientationHelper = this.mPrimaryOrientation;
    this.mPrimaryOrientation = this.mSecondaryOrientation;
    this.mSecondaryOrientation = localOrientationHelper;
    requestLayout();
  }
  
  public void setReverseLayout(boolean paramBoolean)
  {
    assertNotInLayoutOrScroll(null);
    if ((this.mPendingSavedState != null) && (this.mPendingSavedState.mReverseLayout != paramBoolean)) {
      this.mPendingSavedState.mReverseLayout = paramBoolean;
    }
    this.mReverseLayout = paramBoolean;
    requestLayout();
  }
  
  public void setSpanCount(int paramInt)
  {
    assertNotInLayoutOrScroll(null);
    if (paramInt != this.mSpanCount)
    {
      invalidateSpanAssignments();
      this.mSpanCount = paramInt;
      this.mRemainingSpans = new BitSet(this.mSpanCount);
      this.mSpans = new b[this.mSpanCount];
      for (int i = 0; i < this.mSpanCount; i++) {
        this.mSpans[i] = new b(i);
      }
      requestLayout();
    }
  }
  
  public void smoothScrollToPosition(RecyclerView paramRecyclerView, RecyclerView.State paramState, int paramInt)
  {
    LinearSmoothScroller localLinearSmoothScroller = new LinearSmoothScroller(paramRecyclerView.getContext());
    localLinearSmoothScroller.setTargetPosition(paramInt);
    startSmoothScroll(localLinearSmoothScroller);
  }
  
  public boolean supportsPredictiveItemAnimations()
  {
    return this.mPendingSavedState == null;
  }
  
  boolean updateAnchorFromPendingData(RecyclerView.State paramState, a parama)
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
    if ((this.mPendingSavedState == null) || (this.mPendingSavedState.mAnchorPosition == -1) || (this.mPendingSavedState.mSpanOffsetsSize < 1))
    {
      View localView = findViewByPosition(this.mPendingScrollPosition);
      if (localView != null)
      {
        if (this.mShouldReverseLayout) {}
        for (int j = getLastChildPosition();; j = getFirstChildPosition())
        {
          parama.a = j;
          if (this.mPendingScrollPositionOffset == -2147483648) {
            break label188;
          }
          if (!parama.c) {
            break;
          }
          parama.b = (this.mPrimaryOrientation.getEndAfterPadding() - this.mPendingScrollPositionOffset - this.mPrimaryOrientation.getDecoratedEnd(localView));
          return true;
        }
        parama.b = (this.mPrimaryOrientation.getStartAfterPadding() + this.mPendingScrollPositionOffset - this.mPrimaryOrientation.getDecoratedStart(localView));
        return true;
        label188:
        if (this.mPrimaryOrientation.getDecoratedMeasurement(localView) > this.mPrimaryOrientation.getTotalSpace())
        {
          if (parama.c) {}
          for (int n = this.mPrimaryOrientation.getEndAfterPadding();; n = this.mPrimaryOrientation.getStartAfterPadding())
          {
            parama.b = n;
            return true;
          }
        }
        int k = this.mPrimaryOrientation.getDecoratedStart(localView) - this.mPrimaryOrientation.getStartAfterPadding();
        if (k < 0)
        {
          parama.b = (-k);
          return true;
        }
        int m = this.mPrimaryOrientation.getEndAfterPadding() - this.mPrimaryOrientation.getDecoratedEnd(localView);
        if (m < 0)
        {
          parama.b = m;
          return true;
        }
        parama.b = -2147483648;
        return true;
      }
      parama.a = this.mPendingScrollPosition;
      if (this.mPendingScrollPositionOffset == -2147483648)
      {
        int i = calculateScrollDirectionForPosition(parama.a);
        boolean bool = false;
        if (i == 1) {
          bool = true;
        }
        parama.c = bool;
        parama.b();
      }
      for (;;)
      {
        parama.d = true;
        return true;
        parama.a(this.mPendingScrollPositionOffset);
      }
    }
    parama.b = -2147483648;
    parama.a = this.mPendingScrollPosition;
    return true;
  }
  
  void updateAnchorInfoForLayout(RecyclerView.State paramState, a parama)
  {
    if (updateAnchorFromPendingData(paramState, parama)) {}
    while (updateAnchorFromChildren(paramState, parama)) {
      return;
    }
    parama.b();
    parama.a = 0;
  }
  
  void updateMeasureSpecs(int paramInt)
  {
    this.mSizePerSpan = (paramInt / this.mSpanCount);
    this.mFullSizeSpec = View.MeasureSpec.makeMeasureSpec(paramInt, this.mSecondaryOrientation.getMode());
  }
  
  public static class LayoutParams
    extends RecyclerView.LayoutParams
  {
    public static final int INVALID_SPAN_ID = -1;
    boolean mFullSpan;
    StaggeredGridLayoutManager.b mSpan;
    
    public LayoutParams(int paramInt1, int paramInt2)
    {
      super(paramInt2);
    }
    
    public LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }
    
    public LayoutParams(RecyclerView.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public LayoutParams(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      super();
    }
    
    public final int getSpanIndex()
    {
      if (this.mSpan == null) {
        return -1;
      }
      return this.mSpan.e;
    }
    
    public boolean isFullSpan()
    {
      return this.mFullSpan;
    }
    
    public void setFullSpan(boolean paramBoolean)
    {
      this.mFullSpan = paramBoolean;
    }
  }
  
  static class LazySpanLookup
  {
    int[] a;
    List<FullSpanItem> b;
    
    private void c(int paramInt1, int paramInt2)
    {
      if (this.b == null) {
        return;
      }
      int i = paramInt1 + paramInt2;
      int j = -1 + this.b.size();
      label25:
      FullSpanItem localFullSpanItem;
      if (j >= 0)
      {
        localFullSpanItem = (FullSpanItem)this.b.get(j);
        if (localFullSpanItem.a >= paramInt1) {
          break label61;
        }
      }
      for (;;)
      {
        j--;
        break label25;
        break;
        label61:
        if (localFullSpanItem.a < i) {
          this.b.remove(j);
        } else {
          localFullSpanItem.a -= paramInt2;
        }
      }
    }
    
    private void d(int paramInt1, int paramInt2)
    {
      if (this.b == null) {
        return;
      }
      int i = -1 + this.b.size();
      label20:
      FullSpanItem localFullSpanItem;
      if (i >= 0)
      {
        localFullSpanItem = (FullSpanItem)this.b.get(i);
        if (localFullSpanItem.a >= paramInt1) {
          break label54;
        }
      }
      for (;;)
      {
        i--;
        break label20;
        break;
        label54:
        localFullSpanItem.a = (paramInt2 + localFullSpanItem.a);
      }
    }
    
    private int g(int paramInt)
    {
      if (this.b == null) {
        return -1;
      }
      FullSpanItem localFullSpanItem1 = f(paramInt);
      if (localFullSpanItem1 != null) {
        this.b.remove(localFullSpanItem1);
      }
      int i = this.b.size();
      int j = 0;
      if (j < i) {
        if (((FullSpanItem)this.b.get(j)).a < paramInt) {}
      }
      for (;;)
      {
        if (j != -1)
        {
          FullSpanItem localFullSpanItem2 = (FullSpanItem)this.b.get(j);
          this.b.remove(j);
          return localFullSpanItem2.a;
          j++;
          break;
        }
        return -1;
        j = -1;
      }
    }
    
    int a(int paramInt)
    {
      if (this.b != null) {
        for (int i = -1 + this.b.size(); i >= 0; i--) {
          if (((FullSpanItem)this.b.get(i)).a >= paramInt) {
            this.b.remove(i);
          }
        }
      }
      return b(paramInt);
    }
    
    public FullSpanItem a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
    {
      FullSpanItem localFullSpanItem;
      if (this.b == null)
      {
        localFullSpanItem = null;
        return localFullSpanItem;
      }
      int i = this.b.size();
      for (int j = 0;; j++)
      {
        if (j >= i) {
          break label102;
        }
        localFullSpanItem = (FullSpanItem)this.b.get(j);
        if (localFullSpanItem.a >= paramInt2) {
          return null;
        }
        if ((localFullSpanItem.a >= paramInt1) && ((paramInt3 == 0) || (localFullSpanItem.b == paramInt3) || ((paramBoolean) && (localFullSpanItem.d)))) {
          break;
        }
      }
      label102:
      return null;
    }
    
    void a()
    {
      if (this.a != null) {
        Arrays.fill(this.a, -1);
      }
      this.b = null;
    }
    
    void a(int paramInt1, int paramInt2)
    {
      if ((this.a == null) || (paramInt1 >= this.a.length)) {
        return;
      }
      e(paramInt1 + paramInt2);
      System.arraycopy(this.a, paramInt1 + paramInt2, this.a, paramInt1, this.a.length - paramInt1 - paramInt2);
      Arrays.fill(this.a, this.a.length - paramInt2, this.a.length, -1);
      c(paramInt1, paramInt2);
    }
    
    void a(int paramInt, StaggeredGridLayoutManager.b paramb)
    {
      e(paramInt);
      this.a[paramInt] = paramb.e;
    }
    
    public void a(FullSpanItem paramFullSpanItem)
    {
      if (this.b == null) {
        this.b = new ArrayList();
      }
      int i = this.b.size();
      for (int j = 0; j < i; j++)
      {
        FullSpanItem localFullSpanItem = (FullSpanItem)this.b.get(j);
        if (localFullSpanItem.a == paramFullSpanItem.a) {
          this.b.remove(j);
        }
        if (localFullSpanItem.a >= paramFullSpanItem.a)
        {
          this.b.add(j, paramFullSpanItem);
          return;
        }
      }
      this.b.add(paramFullSpanItem);
    }
    
    int b(int paramInt)
    {
      if (this.a == null) {}
      while (paramInt >= this.a.length) {
        return -1;
      }
      int i = g(paramInt);
      if (i == -1)
      {
        Arrays.fill(this.a, paramInt, this.a.length, -1);
        return this.a.length;
      }
      Arrays.fill(this.a, paramInt, i + 1, -1);
      return i + 1;
    }
    
    void b(int paramInt1, int paramInt2)
    {
      if ((this.a == null) || (paramInt1 >= this.a.length)) {
        return;
      }
      e(paramInt1 + paramInt2);
      System.arraycopy(this.a, paramInt1, this.a, paramInt1 + paramInt2, this.a.length - paramInt1 - paramInt2);
      Arrays.fill(this.a, paramInt1, paramInt1 + paramInt2, -1);
      d(paramInt1, paramInt2);
    }
    
    int c(int paramInt)
    {
      if ((this.a == null) || (paramInt >= this.a.length)) {
        return -1;
      }
      return this.a[paramInt];
    }
    
    int d(int paramInt)
    {
      int i = this.a.length;
      while (i <= paramInt) {
        i *= 2;
      }
      return i;
    }
    
    void e(int paramInt)
    {
      if (this.a == null)
      {
        this.a = new int[1 + Math.max(paramInt, 10)];
        Arrays.fill(this.a, -1);
      }
      while (paramInt < this.a.length) {
        return;
      }
      int[] arrayOfInt = this.a;
      this.a = new int[d(paramInt)];
      System.arraycopy(arrayOfInt, 0, this.a, 0, arrayOfInt.length);
      Arrays.fill(this.a, arrayOfInt.length, this.a.length, -1);
    }
    
    public FullSpanItem f(int paramInt)
    {
      FullSpanItem localFullSpanItem;
      if (this.b == null)
      {
        localFullSpanItem = null;
        return localFullSpanItem;
      }
      for (int i = -1 + this.b.size();; i--)
      {
        if (i < 0) {
          break label55;
        }
        localFullSpanItem = (FullSpanItem)this.b.get(i);
        if (localFullSpanItem.a == paramInt) {
          break;
        }
      }
      label55:
      return null;
    }
    
    static class FullSpanItem
      implements Parcelable
    {
      public static final Parcelable.Creator<FullSpanItem> CREATOR = new Parcelable.Creator()
      {
        public StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem a(Parcel paramAnonymousParcel)
        {
          return new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem(paramAnonymousParcel);
        }
        
        public StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem[] a(int paramAnonymousInt)
        {
          return new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem[paramAnonymousInt];
        }
      };
      int a;
      int b;
      int[] c;
      boolean d;
      
      FullSpanItem() {}
      
      FullSpanItem(Parcel paramParcel)
      {
        this.a = paramParcel.readInt();
        this.b = paramParcel.readInt();
        if (paramParcel.readInt() == i) {}
        for (;;)
        {
          this.d = i;
          int j = paramParcel.readInt();
          if (j > 0)
          {
            this.c = new int[j];
            paramParcel.readIntArray(this.c);
          }
          return;
          i = 0;
        }
      }
      
      int a(int paramInt)
      {
        if (this.c == null) {
          return 0;
        }
        return this.c[paramInt];
      }
      
      public int describeContents()
      {
        return 0;
      }
      
      public String toString()
      {
        return "FullSpanItem{mPosition=" + this.a + ", mGapDir=" + this.b + ", mHasUnwantedGapAfter=" + this.d + ", mGapPerSpan=" + Arrays.toString(this.c) + '}';
      }
      
      public void writeToParcel(Parcel paramParcel, int paramInt)
      {
        paramParcel.writeInt(this.a);
        paramParcel.writeInt(this.b);
        if (this.d) {}
        for (int i = 1;; i = 0)
        {
          paramParcel.writeInt(i);
          if ((this.c == null) || (this.c.length <= 0)) {
            break;
          }
          paramParcel.writeInt(this.c.length);
          paramParcel.writeIntArray(this.c);
          return;
        }
        paramParcel.writeInt(0);
      }
    }
  }
  
  public static class SavedState
    implements Parcelable
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator()
    {
      public StaggeredGridLayoutManager.SavedState a(Parcel paramAnonymousParcel)
      {
        return new StaggeredGridLayoutManager.SavedState(paramAnonymousParcel);
      }
      
      public StaggeredGridLayoutManager.SavedState[] a(int paramAnonymousInt)
      {
        return new StaggeredGridLayoutManager.SavedState[paramAnonymousInt];
      }
    };
    boolean mAnchorLayoutFromEnd;
    int mAnchorPosition;
    List<StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem> mFullSpanItems;
    boolean mLastLayoutRTL;
    boolean mReverseLayout;
    int[] mSpanLookup;
    int mSpanLookupSize;
    int[] mSpanOffsets;
    int mSpanOffsetsSize;
    int mVisibleAnchorPosition;
    
    public SavedState() {}
    
    SavedState(Parcel paramParcel)
    {
      this.mAnchorPosition = paramParcel.readInt();
      this.mVisibleAnchorPosition = paramParcel.readInt();
      this.mSpanOffsetsSize = paramParcel.readInt();
      if (this.mSpanOffsetsSize > 0)
      {
        this.mSpanOffsets = new int[this.mSpanOffsetsSize];
        paramParcel.readIntArray(this.mSpanOffsets);
      }
      this.mSpanLookupSize = paramParcel.readInt();
      if (this.mSpanLookupSize > 0)
      {
        this.mSpanLookup = new int[this.mSpanLookupSize];
        paramParcel.readIntArray(this.mSpanLookup);
      }
      int j;
      int k;
      if (paramParcel.readInt() == i)
      {
        j = i;
        this.mReverseLayout = j;
        if (paramParcel.readInt() != i) {
          break label152;
        }
        k = i;
        label114:
        this.mAnchorLayoutFromEnd = k;
        if (paramParcel.readInt() != i) {
          break label158;
        }
      }
      for (;;)
      {
        this.mLastLayoutRTL = i;
        this.mFullSpanItems = paramParcel.readArrayList(StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem.class.getClassLoader());
        return;
        j = 0;
        break;
        label152:
        k = 0;
        break label114;
        label158:
        i = 0;
      }
    }
    
    public SavedState(SavedState paramSavedState)
    {
      this.mSpanOffsetsSize = paramSavedState.mSpanOffsetsSize;
      this.mAnchorPosition = paramSavedState.mAnchorPosition;
      this.mVisibleAnchorPosition = paramSavedState.mVisibleAnchorPosition;
      this.mSpanOffsets = paramSavedState.mSpanOffsets;
      this.mSpanLookupSize = paramSavedState.mSpanLookupSize;
      this.mSpanLookup = paramSavedState.mSpanLookup;
      this.mReverseLayout = paramSavedState.mReverseLayout;
      this.mAnchorLayoutFromEnd = paramSavedState.mAnchorLayoutFromEnd;
      this.mLastLayoutRTL = paramSavedState.mLastLayoutRTL;
      this.mFullSpanItems = paramSavedState.mFullSpanItems;
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    void invalidateAnchorPositionInfo()
    {
      this.mSpanOffsets = null;
      this.mSpanOffsetsSize = 0;
      this.mAnchorPosition = -1;
      this.mVisibleAnchorPosition = -1;
    }
    
    void invalidateSpanInfo()
    {
      this.mSpanOffsets = null;
      this.mSpanOffsetsSize = 0;
      this.mSpanLookupSize = 0;
      this.mSpanLookup = null;
      this.mFullSpanItems = null;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      int i = 1;
      paramParcel.writeInt(this.mAnchorPosition);
      paramParcel.writeInt(this.mVisibleAnchorPosition);
      paramParcel.writeInt(this.mSpanOffsetsSize);
      if (this.mSpanOffsetsSize > 0) {
        paramParcel.writeIntArray(this.mSpanOffsets);
      }
      paramParcel.writeInt(this.mSpanLookupSize);
      if (this.mSpanLookupSize > 0) {
        paramParcel.writeIntArray(this.mSpanLookup);
      }
      int j;
      int k;
      if (this.mReverseLayout)
      {
        j = i;
        paramParcel.writeInt(j);
        if (!this.mAnchorLayoutFromEnd) {
          break label123;
        }
        k = i;
        label90:
        paramParcel.writeInt(k);
        if (!this.mLastLayoutRTL) {
          break label129;
        }
      }
      for (;;)
      {
        paramParcel.writeInt(i);
        paramParcel.writeList(this.mFullSpanItems);
        return;
        j = 0;
        break;
        label123:
        k = 0;
        break label90;
        label129:
        i = 0;
      }
    }
  }
  
  class a
  {
    int a;
    int b;
    boolean c;
    boolean d;
    boolean e;
    int[] f;
    
    a()
    {
      a();
    }
    
    void a()
    {
      this.a = -1;
      this.b = -2147483648;
      this.c = false;
      this.d = false;
      this.e = false;
      if (this.f != null) {
        Arrays.fill(this.f, -1);
      }
    }
    
    void a(int paramInt)
    {
      if (this.c)
      {
        this.b = (StaggeredGridLayoutManager.this.mPrimaryOrientation.getEndAfterPadding() - paramInt);
        return;
      }
      this.b = (paramInt + StaggeredGridLayoutManager.this.mPrimaryOrientation.getStartAfterPadding());
    }
    
    void a(StaggeredGridLayoutManager.b[] paramArrayOfb)
    {
      int i = paramArrayOfb.length;
      if ((this.f == null) || (this.f.length < i)) {
        this.f = new int[StaggeredGridLayoutManager.this.mSpans.length];
      }
      for (int j = 0; j < i; j++) {
        this.f[j] = paramArrayOfb[j].a(-2147483648);
      }
    }
    
    void b()
    {
      if (this.c) {}
      for (int i = StaggeredGridLayoutManager.this.mPrimaryOrientation.getEndAfterPadding();; i = StaggeredGridLayoutManager.this.mPrimaryOrientation.getStartAfterPadding())
      {
        this.b = i;
        return;
      }
    }
  }
  
  class b
  {
    ArrayList<View> a = new ArrayList();
    int b = -2147483648;
    int c = -2147483648;
    int d = 0;
    final int e;
    
    b(int paramInt)
    {
      this.e = paramInt;
    }
    
    int a(int paramInt)
    {
      if (this.b != -2147483648) {
        paramInt = this.b;
      }
      while (this.a.size() == 0) {
        return paramInt;
      }
      a();
      return this.b;
    }
    
    int a(int paramInt1, int paramInt2, boolean paramBoolean)
    {
      return a(paramInt1, paramInt2, paramBoolean, true, false);
    }
    
    int a(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
    {
      int i = StaggeredGridLayoutManager.this.mPrimaryOrientation.getStartAfterPadding();
      int j = StaggeredGridLayoutManager.this.mPrimaryOrientation.getEndAfterPadding();
      int k;
      if (paramInt2 > paramInt1) {
        k = 1;
      }
      while (paramInt1 != paramInt2)
      {
        View localView = (View)this.a.get(paramInt1);
        int m = StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedStart(localView);
        int n = StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedEnd(localView);
        int i1;
        label93:
        int i2;
        if (paramBoolean3) {
          if (m <= j)
          {
            i1 = 1;
            if (!paramBoolean3) {
              break label188;
            }
            if (n < i) {
              break label182;
            }
            i2 = 1;
          }
        }
        for (;;)
        {
          if ((i1 != 0) && (i2 != 0))
          {
            if ((paramBoolean1) && (paramBoolean2))
            {
              if ((m < i) || (n > j)) {
                break label246;
              }
              return StaggeredGridLayoutManager.this.getPosition(localView);
              k = -1;
              break;
              i1 = 0;
              break label93;
              if (m < j)
              {
                i1 = 1;
                break label93;
              }
              i1 = 0;
              break label93;
              label182:
              i2 = 0;
              continue;
              label188:
              if (n > i)
              {
                i2 = 1;
                continue;
              }
              i2 = 0;
              continue;
            }
            if (paramBoolean2) {
              return StaggeredGridLayoutManager.this.getPosition(localView);
            }
            if ((m < i) || (n > j)) {
              return StaggeredGridLayoutManager.this.getPosition(localView);
            }
          }
        }
        label246:
        paramInt1 += k;
      }
      return -1;
    }
    
    public View a(int paramInt1, int paramInt2)
    {
      Object localObject = null;
      if (paramInt2 == -1)
      {
        int j = this.a.size();
        int k = 0;
        for (;;)
        {
          View localView2;
          if (k < j)
          {
            localView2 = (View)this.a.get(k);
            if (((!StaggeredGridLayoutManager.this.mReverseLayout) || (StaggeredGridLayoutManager.this.getPosition(localView2) > paramInt1)) && ((StaggeredGridLayoutManager.this.mReverseLayout) || (StaggeredGridLayoutManager.this.getPosition(localView2) < paramInt1))) {
              break label88;
            }
          }
          label88:
          while (!localView2.hasFocusable()) {
            return localObject;
          }
          k++;
          localObject = localView2;
        }
      }
      int i = -1 + this.a.size();
      while (i >= 0)
      {
        View localView1 = (View)this.a.get(i);
        if ((StaggeredGridLayoutManager.this.mReverseLayout) && (StaggeredGridLayoutManager.this.getPosition(localView1) >= paramInt1)) {
          break;
        }
        if ((!StaggeredGridLayoutManager.this.mReverseLayout) && (StaggeredGridLayoutManager.this.getPosition(localView1) <= paramInt1)) {
          return localObject;
        }
        if (!localView1.hasFocusable()) {
          break;
        }
        i--;
        localObject = localView1;
      }
      return localObject;
    }
    
    void a()
    {
      View localView = (View)this.a.get(0);
      StaggeredGridLayoutManager.LayoutParams localLayoutParams = c(localView);
      this.b = StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedStart(localView);
      if (localLayoutParams.mFullSpan)
      {
        StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem = StaggeredGridLayoutManager.this.mLazySpanLookup.f(localLayoutParams.getViewLayoutPosition());
        if ((localFullSpanItem != null) && (localFullSpanItem.b == -1)) {
          this.b -= localFullSpanItem.a(this.e);
        }
      }
    }
    
    void a(View paramView)
    {
      StaggeredGridLayoutManager.LayoutParams localLayoutParams = c(paramView);
      localLayoutParams.mSpan = this;
      this.a.add(0, paramView);
      this.b = -2147483648;
      if (this.a.size() == 1) {
        this.c = -2147483648;
      }
      if ((localLayoutParams.isItemRemoved()) || (localLayoutParams.isItemChanged())) {
        this.d += StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedMeasurement(paramView);
      }
    }
    
    void a(boolean paramBoolean, int paramInt)
    {
      int i;
      if (paramBoolean)
      {
        i = b(-2147483648);
        e();
        if (i != -2147483648) {
          break label32;
        }
      }
      label32:
      while (((paramBoolean) && (i < StaggeredGridLayoutManager.this.mPrimaryOrientation.getEndAfterPadding())) || ((!paramBoolean) && (i > StaggeredGridLayoutManager.this.mPrimaryOrientation.getStartAfterPadding())))
      {
        return;
        i = a(-2147483648);
        break;
      }
      if (paramInt != -2147483648) {
        i += paramInt;
      }
      this.c = i;
      this.b = i;
    }
    
    int b()
    {
      if (this.b != -2147483648) {
        return this.b;
      }
      a();
      return this.b;
    }
    
    int b(int paramInt)
    {
      if (this.c != -2147483648) {
        paramInt = this.c;
      }
      while (this.a.size() == 0) {
        return paramInt;
      }
      c();
      return this.c;
    }
    
    int b(int paramInt1, int paramInt2, boolean paramBoolean)
    {
      return a(paramInt1, paramInt2, false, false, paramBoolean);
    }
    
    void b(View paramView)
    {
      StaggeredGridLayoutManager.LayoutParams localLayoutParams = c(paramView);
      localLayoutParams.mSpan = this;
      this.a.add(paramView);
      this.c = -2147483648;
      if (this.a.size() == 1) {
        this.b = -2147483648;
      }
      if ((localLayoutParams.isItemRemoved()) || (localLayoutParams.isItemChanged())) {
        this.d += StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedMeasurement(paramView);
      }
    }
    
    StaggeredGridLayoutManager.LayoutParams c(View paramView)
    {
      return (StaggeredGridLayoutManager.LayoutParams)paramView.getLayoutParams();
    }
    
    void c()
    {
      View localView = (View)this.a.get(-1 + this.a.size());
      StaggeredGridLayoutManager.LayoutParams localLayoutParams = c(localView);
      this.c = StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedEnd(localView);
      if (localLayoutParams.mFullSpan)
      {
        StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem = StaggeredGridLayoutManager.this.mLazySpanLookup.f(localLayoutParams.getViewLayoutPosition());
        if ((localFullSpanItem != null) && (localFullSpanItem.b == 1)) {
          this.c += localFullSpanItem.a(this.e);
        }
      }
    }
    
    void c(int paramInt)
    {
      this.b = paramInt;
      this.c = paramInt;
    }
    
    int d()
    {
      if (this.c != -2147483648) {
        return this.c;
      }
      c();
      return this.c;
    }
    
    void d(int paramInt)
    {
      if (this.b != -2147483648) {
        this.b = (paramInt + this.b);
      }
      if (this.c != -2147483648) {
        this.c = (paramInt + this.c);
      }
    }
    
    void e()
    {
      this.a.clear();
      f();
      this.d = 0;
    }
    
    void f()
    {
      this.b = -2147483648;
      this.c = -2147483648;
    }
    
    void g()
    {
      int i = this.a.size();
      View localView = (View)this.a.remove(i - 1);
      StaggeredGridLayoutManager.LayoutParams localLayoutParams = c(localView);
      localLayoutParams.mSpan = null;
      if ((localLayoutParams.isItemRemoved()) || (localLayoutParams.isItemChanged())) {
        this.d -= StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedMeasurement(localView);
      }
      if (i == 1) {
        this.b = -2147483648;
      }
      this.c = -2147483648;
    }
    
    void h()
    {
      View localView = (View)this.a.remove(0);
      StaggeredGridLayoutManager.LayoutParams localLayoutParams = c(localView);
      localLayoutParams.mSpan = null;
      if (this.a.size() == 0) {
        this.c = -2147483648;
      }
      if ((localLayoutParams.isItemRemoved()) || (localLayoutParams.isItemChanged())) {
        this.d -= StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedMeasurement(localView);
      }
      this.b = -2147483648;
    }
    
    public int i()
    {
      return this.d;
    }
    
    public int j()
    {
      if (StaggeredGridLayoutManager.this.mReverseLayout) {
        return a(-1 + this.a.size(), -1, false);
      }
      return a(0, this.a.size(), false);
    }
    
    public int k()
    {
      if (StaggeredGridLayoutManager.this.mReverseLayout) {
        return b(-1 + this.a.size(), -1, true);
      }
      return b(0, this.a.size(), true);
    }
    
    public int l()
    {
      if (StaggeredGridLayoutManager.this.mReverseLayout) {
        return a(-1 + this.a.size(), -1, true);
      }
      return a(0, this.a.size(), true);
    }
    
    public int m()
    {
      if (StaggeredGridLayoutManager.this.mReverseLayout) {
        return a(0, this.a.size(), false);
      }
      return a(-1 + this.a.size(), -1, false);
    }
    
    public int n()
    {
      if (StaggeredGridLayoutManager.this.mReverseLayout) {
        return b(0, this.a.size(), true);
      }
      return b(-1 + this.a.size(), -1, true);
    }
    
    public int o()
    {
      if (StaggeredGridLayoutManager.this.mReverseLayout) {
        return a(0, this.a.size(), true);
      }
      return a(-1 + this.a.size(), -1, true);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.StaggeredGridLayoutManager
 * JD-Core Version:    0.7.0.1
 */