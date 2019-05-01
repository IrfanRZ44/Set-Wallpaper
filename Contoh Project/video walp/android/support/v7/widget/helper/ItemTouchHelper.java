package android.support.v7.widget.helper;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.view.c;
import android.support.v4.view.s;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ChildDrawingOrderCallback;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.support.v7.widget.RecyclerView.ItemDecoration;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener;
import android.support.v7.widget.RecyclerView.OnItemTouchListener;
import android.support.v7.widget.RecyclerView.State;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.Log;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

public class ItemTouchHelper
  extends RecyclerView.ItemDecoration
  implements RecyclerView.OnChildAttachStateChangeListener
{
  static final int ACTION_MODE_DRAG_MASK = 16711680;
  private static final int ACTION_MODE_IDLE_MASK = 255;
  static final int ACTION_MODE_SWIPE_MASK = 65280;
  public static final int ACTION_STATE_DRAG = 2;
  public static final int ACTION_STATE_IDLE = 0;
  public static final int ACTION_STATE_SWIPE = 1;
  static final int ACTIVE_POINTER_ID_NONE = -1;
  public static final int ANIMATION_TYPE_DRAG = 8;
  public static final int ANIMATION_TYPE_SWIPE_CANCEL = 4;
  public static final int ANIMATION_TYPE_SWIPE_SUCCESS = 2;
  static final boolean DEBUG = false;
  static final int DIRECTION_FLAG_COUNT = 8;
  public static final int DOWN = 2;
  public static final int END = 32;
  public static final int LEFT = 4;
  private static final int PIXELS_PER_SECOND = 1000;
  public static final int RIGHT = 8;
  public static final int START = 16;
  static final String TAG = "ItemTouchHelper";
  public static final int UP = 1;
  int mActionState = 0;
  int mActivePointerId = -1;
  Callback mCallback;
  private RecyclerView.ChildDrawingOrderCallback mChildDrawingOrderCallback = null;
  private List<Integer> mDistances;
  private long mDragScrollStartTimeInMs;
  float mDx;
  float mDy;
  c mGestureDetector;
  float mInitialTouchX;
  float mInitialTouchY;
  private a mItemTouchHelperGestureListener;
  float mMaxSwipeVelocity;
  private final RecyclerView.OnItemTouchListener mOnItemTouchListener = new RecyclerView.OnItemTouchListener()
  {
    public boolean onInterceptTouchEvent(RecyclerView paramAnonymousRecyclerView, MotionEvent paramAnonymousMotionEvent)
    {
      ItemTouchHelper.this.mGestureDetector.a(paramAnonymousMotionEvent);
      int i = paramAnonymousMotionEvent.getActionMasked();
      if (i == 0)
      {
        ItemTouchHelper.this.mActivePointerId = paramAnonymousMotionEvent.getPointerId(0);
        ItemTouchHelper.this.mInitialTouchX = paramAnonymousMotionEvent.getX();
        ItemTouchHelper.this.mInitialTouchY = paramAnonymousMotionEvent.getY();
        ItemTouchHelper.this.obtainVelocityTracker();
        if (ItemTouchHelper.this.mSelected == null)
        {
          ItemTouchHelper.b localb = ItemTouchHelper.this.findAnimation(paramAnonymousMotionEvent);
          if (localb != null)
          {
            ItemTouchHelper localItemTouchHelper1 = ItemTouchHelper.this;
            localItemTouchHelper1.mInitialTouchX -= localb.l;
            ItemTouchHelper localItemTouchHelper2 = ItemTouchHelper.this;
            localItemTouchHelper2.mInitialTouchY -= localb.m;
            ItemTouchHelper.this.endRecoverAnimation(localb.h, true);
            if (ItemTouchHelper.this.mPendingCleanup.remove(localb.h.itemView)) {
              ItemTouchHelper.this.mCallback.clearView(ItemTouchHelper.this.mRecyclerView, localb.h);
            }
            ItemTouchHelper.this.select(localb.h, localb.i);
            ItemTouchHelper.this.updateDxDy(paramAnonymousMotionEvent, ItemTouchHelper.this.mSelectedFlags, 0);
          }
        }
      }
      for (;;)
      {
        if (ItemTouchHelper.this.mVelocityTracker != null) {
          ItemTouchHelper.this.mVelocityTracker.addMovement(paramAnonymousMotionEvent);
        }
        if (ItemTouchHelper.this.mSelected == null) {
          break;
        }
        return true;
        if ((i == 3) || (i == 1))
        {
          ItemTouchHelper.this.mActivePointerId = -1;
          ItemTouchHelper.this.select(null, 0);
        }
        else if (ItemTouchHelper.this.mActivePointerId != -1)
        {
          int j = paramAnonymousMotionEvent.findPointerIndex(ItemTouchHelper.this.mActivePointerId);
          if (j >= 0) {
            ItemTouchHelper.this.checkSelectForSwipe(i, paramAnonymousMotionEvent, j);
          }
        }
      }
      return false;
    }
    
    public void onRequestDisallowInterceptTouchEvent(boolean paramAnonymousBoolean)
    {
      if (!paramAnonymousBoolean) {
        return;
      }
      ItemTouchHelper.this.select(null, 0);
    }
    
    public void onTouchEvent(RecyclerView paramAnonymousRecyclerView, MotionEvent paramAnonymousMotionEvent)
    {
      ItemTouchHelper.this.mGestureDetector.a(paramAnonymousMotionEvent);
      if (ItemTouchHelper.this.mVelocityTracker != null) {
        ItemTouchHelper.this.mVelocityTracker.addMovement(paramAnonymousMotionEvent);
      }
      if (ItemTouchHelper.this.mActivePointerId == -1) {}
      int k;
      do
      {
        int i;
        int j;
        RecyclerView.ViewHolder localViewHolder;
        do
        {
          return;
          i = paramAnonymousMotionEvent.getActionMasked();
          j = paramAnonymousMotionEvent.findPointerIndex(ItemTouchHelper.this.mActivePointerId);
          if (j >= 0) {
            ItemTouchHelper.this.checkSelectForSwipe(i, paramAnonymousMotionEvent, j);
          }
          localViewHolder = ItemTouchHelper.this.mSelected;
        } while (localViewHolder == null);
        switch (i)
        {
        case 4: 
        case 5: 
        default: 
          return;
        case 1: 
        case 2: 
        case 3: 
          for (;;)
          {
            ItemTouchHelper.this.select(null, 0);
            ItemTouchHelper.this.mActivePointerId = -1;
            return;
            if (j < 0) {
              break;
            }
            ItemTouchHelper.this.updateDxDy(paramAnonymousMotionEvent, ItemTouchHelper.this.mSelectedFlags, j);
            ItemTouchHelper.this.moveIfNecessary(localViewHolder);
            ItemTouchHelper.this.mRecyclerView.removeCallbacks(ItemTouchHelper.this.mScrollRunnable);
            ItemTouchHelper.this.mScrollRunnable.run();
            ItemTouchHelper.this.mRecyclerView.invalidate();
            return;
            if (ItemTouchHelper.this.mVelocityTracker != null) {
              ItemTouchHelper.this.mVelocityTracker.clear();
            }
          }
        }
        k = paramAnonymousMotionEvent.getActionIndex();
      } while (paramAnonymousMotionEvent.getPointerId(k) != ItemTouchHelper.this.mActivePointerId);
      int m = 0;
      if (k == 0) {
        m = 1;
      }
      ItemTouchHelper.this.mActivePointerId = paramAnonymousMotionEvent.getPointerId(m);
      ItemTouchHelper.this.updateDxDy(paramAnonymousMotionEvent, ItemTouchHelper.this.mSelectedFlags, k);
    }
  };
  View mOverdrawChild = null;
  int mOverdrawChildPosition = -1;
  final List<View> mPendingCleanup = new ArrayList();
  List<b> mRecoverAnimations = new ArrayList();
  RecyclerView mRecyclerView;
  final Runnable mScrollRunnable = new Runnable()
  {
    public void run()
    {
      if ((ItemTouchHelper.this.mSelected != null) && (ItemTouchHelper.this.scrollIfNecessary()))
      {
        if (ItemTouchHelper.this.mSelected != null) {
          ItemTouchHelper.this.moveIfNecessary(ItemTouchHelper.this.mSelected);
        }
        ItemTouchHelper.this.mRecyclerView.removeCallbacks(ItemTouchHelper.this.mScrollRunnable);
        s.a(ItemTouchHelper.this.mRecyclerView, this);
      }
    }
  };
  RecyclerView.ViewHolder mSelected = null;
  int mSelectedFlags;
  float mSelectedStartX;
  float mSelectedStartY;
  private int mSlop;
  private List<RecyclerView.ViewHolder> mSwapTargets;
  float mSwipeEscapeVelocity;
  private final float[] mTmpPosition = new float[2];
  private Rect mTmpRect;
  VelocityTracker mVelocityTracker;
  
  public ItemTouchHelper(Callback paramCallback)
  {
    this.mCallback = paramCallback;
  }
  
  private void addChildDrawingOrderCallback()
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return;
    }
    if (this.mChildDrawingOrderCallback == null) {
      this.mChildDrawingOrderCallback = new RecyclerView.ChildDrawingOrderCallback()
      {
        public int onGetChildDrawingOrder(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          if (ItemTouchHelper.this.mOverdrawChild == null) {}
          int i;
          do
          {
            return paramAnonymousInt2;
            i = ItemTouchHelper.this.mOverdrawChildPosition;
            if (i == -1)
            {
              i = ItemTouchHelper.this.mRecyclerView.indexOfChild(ItemTouchHelper.this.mOverdrawChild);
              ItemTouchHelper.this.mOverdrawChildPosition = i;
            }
            if (paramAnonymousInt2 == paramAnonymousInt1 - 1) {
              return i;
            }
          } while (paramAnonymousInt2 < i);
          return paramAnonymousInt2 + 1;
        }
      };
    }
    this.mRecyclerView.setChildDrawingOrderCallback(this.mChildDrawingOrderCallback);
  }
  
  private int checkHorizontalSwipe(RecyclerView.ViewHolder paramViewHolder, int paramInt)
  {
    int i = 8;
    if ((paramInt & 0xC) != 0)
    {
      int j;
      float f2;
      float f3;
      if (this.mDx > 0.0F)
      {
        j = i;
        if ((this.mVelocityTracker == null) || (this.mActivePointerId <= -1)) {
          break label151;
        }
        this.mVelocityTracker.computeCurrentVelocity(1000, this.mCallback.getSwipeVelocityThreshold(this.mMaxSwipeVelocity));
        f2 = this.mVelocityTracker.getXVelocity(this.mActivePointerId);
        f3 = this.mVelocityTracker.getYVelocity(this.mActivePointerId);
        if (f2 <= 0.0F) {
          break label146;
        }
      }
      for (;;)
      {
        float f4 = Math.abs(f2);
        if (((i & paramInt) == 0) || (j != i) || (f4 < this.mCallback.getSwipeEscapeVelocity(this.mSwipeEscapeVelocity)) || (f4 <= Math.abs(f3))) {
          break label151;
        }
        return i;
        j = 4;
        break;
        label146:
        i = 4;
      }
      label151:
      float f1 = this.mRecyclerView.getWidth() * this.mCallback.getSwipeThreshold(paramViewHolder);
      if (((paramInt & j) != 0) && (Math.abs(this.mDx) > f1)) {
        return j;
      }
    }
    return 0;
  }
  
  private int checkVerticalSwipe(RecyclerView.ViewHolder paramViewHolder, int paramInt)
  {
    int i = 2;
    if ((paramInt & 0x3) != 0)
    {
      int j;
      float f2;
      float f3;
      if (this.mDy > 0.0F)
      {
        j = i;
        if ((this.mVelocityTracker == null) || (this.mActivePointerId <= -1)) {
          break label149;
        }
        this.mVelocityTracker.computeCurrentVelocity(1000, this.mCallback.getSwipeVelocityThreshold(this.mMaxSwipeVelocity));
        f2 = this.mVelocityTracker.getXVelocity(this.mActivePointerId);
        f3 = this.mVelocityTracker.getYVelocity(this.mActivePointerId);
        if (f3 <= 0.0F) {
          break label144;
        }
      }
      for (;;)
      {
        float f4 = Math.abs(f3);
        if (((i & paramInt) == 0) || (i != j) || (f4 < this.mCallback.getSwipeEscapeVelocity(this.mSwipeEscapeVelocity)) || (f4 <= Math.abs(f2))) {
          break label149;
        }
        return i;
        j = 1;
        break;
        label144:
        i = 1;
      }
      label149:
      float f1 = this.mRecyclerView.getHeight() * this.mCallback.getSwipeThreshold(paramViewHolder);
      if (((paramInt & j) != 0) && (Math.abs(this.mDy) > f1)) {
        return j;
      }
    }
    return 0;
  }
  
  private void destroyCallbacks()
  {
    this.mRecyclerView.removeItemDecoration(this);
    this.mRecyclerView.removeOnItemTouchListener(this.mOnItemTouchListener);
    this.mRecyclerView.removeOnChildAttachStateChangeListener(this);
    for (int i = -1 + this.mRecoverAnimations.size(); i >= 0; i--)
    {
      b localb = (b)this.mRecoverAnimations.get(0);
      this.mCallback.clearView(this.mRecyclerView, localb.h);
    }
    this.mRecoverAnimations.clear();
    this.mOverdrawChild = null;
    this.mOverdrawChildPosition = -1;
    releaseVelocityTracker();
    stopGestureDetection();
  }
  
  private List<RecyclerView.ViewHolder> findSwapTargets(RecyclerView.ViewHolder paramViewHolder)
  {
    int j;
    int k;
    int m;
    int n;
    int i1;
    int i2;
    int i4;
    label135:
    View localView;
    if (this.mSwapTargets == null)
    {
      this.mSwapTargets = new ArrayList();
      this.mDistances = new ArrayList();
      int i = this.mCallback.getBoundingBoxMargin();
      j = Math.round(this.mSelectedStartX + this.mDx) - i;
      k = Math.round(this.mSelectedStartY + this.mDy) - i;
      m = j + paramViewHolder.itemView.getWidth() + i * 2;
      n = k + paramViewHolder.itemView.getHeight() + i * 2;
      i1 = (j + m) / 2;
      i2 = (k + n) / 2;
      RecyclerView.LayoutManager localLayoutManager = this.mRecyclerView.getLayoutManager();
      int i3 = localLayoutManager.getChildCount();
      i4 = 0;
      if (i4 >= i3) {
        break label399;
      }
      localView = localLayoutManager.getChildAt(i4);
      if (localView != paramViewHolder.itemView) {
        break label187;
      }
    }
    for (;;)
    {
      i4++;
      break label135;
      this.mSwapTargets.clear();
      this.mDistances.clear();
      break;
      label187:
      if ((localView.getBottom() >= k) && (localView.getTop() <= n) && (localView.getRight() >= j) && (localView.getLeft() <= m))
      {
        RecyclerView.ViewHolder localViewHolder = this.mRecyclerView.getChildViewHolder(localView);
        if (this.mCallback.canDropOver(this.mRecyclerView, this.mSelected, localViewHolder))
        {
          int i5 = Math.abs(i1 - (localView.getLeft() + localView.getRight()) / 2);
          int i6 = Math.abs(i2 - (localView.getTop() + localView.getBottom()) / 2);
          int i7 = i5 * i5 + i6 * i6;
          int i8 = this.mSwapTargets.size();
          int i9 = 0;
          for (int i10 = 0; (i10 < i8) && (i7 > ((Integer)this.mDistances.get(i10)).intValue()); i10++) {
            i9++;
          }
          this.mSwapTargets.add(i9, localViewHolder);
          this.mDistances.add(i9, Integer.valueOf(i7));
        }
      }
    }
    label399:
    return this.mSwapTargets;
  }
  
  private RecyclerView.ViewHolder findSwipedView(MotionEvent paramMotionEvent)
  {
    RecyclerView.LayoutManager localLayoutManager = this.mRecyclerView.getLayoutManager();
    if (this.mActivePointerId == -1) {}
    View localView;
    do
    {
      float f3;
      float f4;
      do
      {
        return null;
        int i = paramMotionEvent.findPointerIndex(this.mActivePointerId);
        float f1 = paramMotionEvent.getX(i) - this.mInitialTouchX;
        float f2 = paramMotionEvent.getY(i) - this.mInitialTouchY;
        f3 = Math.abs(f1);
        f4 = Math.abs(f2);
      } while (((f3 < this.mSlop) && (f4 < this.mSlop)) || ((f3 > f4) && (localLayoutManager.canScrollHorizontally())) || ((f4 > f3) && (localLayoutManager.canScrollVertically())));
      localView = findChildView(paramMotionEvent);
    } while (localView == null);
    return this.mRecyclerView.getChildViewHolder(localView);
  }
  
  private void getSelectedDxDy(float[] paramArrayOfFloat)
  {
    if ((0xC & this.mSelectedFlags) != 0) {
      paramArrayOfFloat[0] = (this.mSelectedStartX + this.mDx - this.mSelected.itemView.getLeft());
    }
    while ((0x3 & this.mSelectedFlags) != 0)
    {
      paramArrayOfFloat[1] = (this.mSelectedStartY + this.mDy - this.mSelected.itemView.getTop());
      return;
      paramArrayOfFloat[0] = this.mSelected.itemView.getTranslationX();
    }
    paramArrayOfFloat[1] = this.mSelected.itemView.getTranslationY();
  }
  
  private static boolean hitTest(View paramView, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    return (paramFloat1 >= paramFloat3) && (paramFloat1 <= paramFloat3 + paramView.getWidth()) && (paramFloat2 >= paramFloat4) && (paramFloat2 <= paramFloat4 + paramView.getHeight());
  }
  
  private void releaseVelocityTracker()
  {
    if (this.mVelocityTracker != null)
    {
      this.mVelocityTracker.recycle();
      this.mVelocityTracker = null;
    }
  }
  
  private void setupCallbacks()
  {
    this.mSlop = ViewConfiguration.get(this.mRecyclerView.getContext()).getScaledTouchSlop();
    this.mRecyclerView.addItemDecoration(this);
    this.mRecyclerView.addOnItemTouchListener(this.mOnItemTouchListener);
    this.mRecyclerView.addOnChildAttachStateChangeListener(this);
    startGestureDetection();
  }
  
  private void startGestureDetection()
  {
    this.mItemTouchHelperGestureListener = new a();
    this.mGestureDetector = new c(this.mRecyclerView.getContext(), this.mItemTouchHelperGestureListener);
  }
  
  private void stopGestureDetection()
  {
    if (this.mItemTouchHelperGestureListener != null)
    {
      this.mItemTouchHelperGestureListener.a();
      this.mItemTouchHelperGestureListener = null;
    }
    if (this.mGestureDetector != null) {
      this.mGestureDetector = null;
    }
  }
  
  private int swipeIfNecessary(RecyclerView.ViewHolder paramViewHolder)
  {
    if (this.mActionState == 2) {}
    int k;
    int n;
    do
    {
      int j;
      int i2;
      do
      {
        int i;
        do
        {
          return 0;
          i = this.mCallback.getMovementFlags(this.mRecyclerView, paramViewHolder);
          j = (0xFF00 & this.mCallback.convertToAbsoluteDirection(i, s.e(this.mRecyclerView))) >> 8;
        } while (j == 0);
        k = (i & 0xFF00) >> 8;
        if (Math.abs(this.mDx) <= Math.abs(this.mDy)) {
          break;
        }
        int i1 = checkHorizontalSwipe(paramViewHolder, j);
        if (i1 > 0)
        {
          if ((k & i1) == 0) {
            return Callback.convertToRelativeDirection(i1, s.e(this.mRecyclerView));
          }
          return i1;
        }
        i2 = checkVerticalSwipe(paramViewHolder, j);
      } while (i2 <= 0);
      return i2;
      int m = checkVerticalSwipe(paramViewHolder, j);
      if (m > 0) {
        return m;
      }
      n = checkHorizontalSwipe(paramViewHolder, j);
    } while (n <= 0);
    if ((k & n) == 0) {
      return Callback.convertToRelativeDirection(n, s.e(this.mRecyclerView));
    }
    return n;
  }
  
  public void attachToRecyclerView(RecyclerView paramRecyclerView)
  {
    if (this.mRecyclerView == paramRecyclerView) {}
    do
    {
      return;
      if (this.mRecyclerView != null) {
        destroyCallbacks();
      }
      this.mRecyclerView = paramRecyclerView;
    } while (paramRecyclerView == null);
    Resources localResources = paramRecyclerView.getResources();
    this.mSwipeEscapeVelocity = localResources.getDimension(android.support.v7.e.a.a.item_touch_helper_swipe_escape_velocity);
    this.mMaxSwipeVelocity = localResources.getDimension(android.support.v7.e.a.a.item_touch_helper_swipe_escape_max_velocity);
    setupCallbacks();
  }
  
  boolean checkSelectForSwipe(int paramInt1, MotionEvent paramMotionEvent, int paramInt2)
  {
    if ((this.mSelected != null) || (paramInt1 != 2) || (this.mActionState == 2) || (!this.mCallback.isItemViewSwipeEnabled())) {}
    RecyclerView.ViewHolder localViewHolder;
    int i;
    float f3;
    float f4;
    do
    {
      float f5;
      float f6;
      do
      {
        do
        {
          do
          {
            do
            {
              return false;
            } while (this.mRecyclerView.getScrollState() == 1);
            localViewHolder = findSwipedView(paramMotionEvent);
          } while (localViewHolder == null);
          i = (0xFF00 & this.mCallback.getAbsoluteMovementFlags(this.mRecyclerView, localViewHolder)) >> 8;
        } while (i == 0);
        float f1 = paramMotionEvent.getX(paramInt2);
        float f2 = paramMotionEvent.getY(paramInt2);
        f3 = f1 - this.mInitialTouchX;
        f4 = f2 - this.mInitialTouchY;
        f5 = Math.abs(f3);
        f6 = Math.abs(f4);
      } while ((f5 < this.mSlop) && (f6 < this.mSlop));
      if (f5 <= f6) {
        break;
      }
    } while (((f3 < 0.0F) && ((i & 0x4) == 0)) || ((f3 > 0.0F) && ((i & 0x8) == 0)));
    do
    {
      this.mDy = 0.0F;
      this.mDx = 0.0F;
      this.mActivePointerId = paramMotionEvent.getPointerId(0);
      select(localViewHolder, 1);
      return true;
      if ((f4 < 0.0F) && ((i & 0x1) == 0)) {
        break;
      }
    } while ((f4 <= 0.0F) || ((i & 0x2) != 0));
    return false;
  }
  
  int endRecoverAnimation(RecyclerView.ViewHolder paramViewHolder, boolean paramBoolean)
  {
    for (int i = -1 + this.mRecoverAnimations.size(); i >= 0; i--)
    {
      b localb = (b)this.mRecoverAnimations.get(i);
      if (localb.h == paramViewHolder)
      {
        localb.n = (paramBoolean | localb.n);
        if (!localb.o) {
          localb.b();
        }
        this.mRecoverAnimations.remove(i);
        return localb.j;
      }
    }
    return 0;
  }
  
  b findAnimation(MotionEvent paramMotionEvent)
  {
    b localb;
    if (this.mRecoverAnimations.isEmpty())
    {
      localb = null;
      return localb;
    }
    View localView = findChildView(paramMotionEvent);
    for (int i = -1 + this.mRecoverAnimations.size();; i--)
    {
      if (i < 0) {
        break label73;
      }
      localb = (b)this.mRecoverAnimations.get(i);
      if (localb.h.itemView == localView) {
        break;
      }
    }
    label73:
    return null;
  }
  
  View findChildView(MotionEvent paramMotionEvent)
  {
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    if (this.mSelected != null)
    {
      View localView2 = this.mSelected.itemView;
      if (hitTest(localView2, f1, f2, this.mSelectedStartX + this.mDx, this.mSelectedStartY + this.mDy)) {
        return localView2;
      }
    }
    for (int i = -1 + this.mRecoverAnimations.size(); i >= 0; i--)
    {
      b localb = (b)this.mRecoverAnimations.get(i);
      View localView1 = localb.h.itemView;
      if (hitTest(localView1, f1, f2, localb.l, localb.m)) {
        return localView1;
      }
    }
    return this.mRecyclerView.findChildViewUnder(f1, f2);
  }
  
  public void getItemOffsets(Rect paramRect, View paramView, RecyclerView paramRecyclerView, RecyclerView.State paramState)
  {
    paramRect.setEmpty();
  }
  
  boolean hasRunningRecoverAnim()
  {
    int i = this.mRecoverAnimations.size();
    for (int j = 0; j < i; j++) {
      if (!((b)this.mRecoverAnimations.get(j)).o) {
        return true;
      }
    }
    return false;
  }
  
  void moveIfNecessary(RecyclerView.ViewHolder paramViewHolder)
  {
    if (this.mRecyclerView.isLayoutRequested()) {}
    label10:
    int i;
    int j;
    RecyclerView.ViewHolder localViewHolder;
    int k;
    int m;
    do
    {
      List localList;
      do
      {
        float f;
        do
        {
          break label10;
          do
          {
            return;
          } while (this.mActionState != 2);
          f = this.mCallback.getMoveThreshold(paramViewHolder);
          i = (int)(this.mSelectedStartX + this.mDx);
          j = (int)(this.mSelectedStartY + this.mDy);
        } while ((Math.abs(j - paramViewHolder.itemView.getTop()) < f * paramViewHolder.itemView.getHeight()) && (Math.abs(i - paramViewHolder.itemView.getLeft()) < f * paramViewHolder.itemView.getWidth()));
        localList = findSwapTargets(paramViewHolder);
      } while (localList.size() == 0);
      localViewHolder = this.mCallback.chooseDropTarget(paramViewHolder, localList, i, j);
      if (localViewHolder == null)
      {
        this.mSwapTargets.clear();
        this.mDistances.clear();
        return;
      }
      k = localViewHolder.getAdapterPosition();
      m = paramViewHolder.getAdapterPosition();
    } while (!this.mCallback.onMove(this.mRecyclerView, paramViewHolder, localViewHolder));
    this.mCallback.onMoved(this.mRecyclerView, paramViewHolder, m, localViewHolder, k, i, j);
  }
  
  void obtainVelocityTracker()
  {
    if (this.mVelocityTracker != null) {
      this.mVelocityTracker.recycle();
    }
    this.mVelocityTracker = VelocityTracker.obtain();
  }
  
  public void onChildViewAttachedToWindow(View paramView) {}
  
  public void onChildViewDetachedFromWindow(View paramView)
  {
    removeChildDrawingOrderCallbackIfNecessary(paramView);
    RecyclerView.ViewHolder localViewHolder = this.mRecyclerView.getChildViewHolder(paramView);
    if (localViewHolder == null) {}
    do
    {
      return;
      if ((this.mSelected != null) && (localViewHolder == this.mSelected))
      {
        select(null, 0);
        return;
      }
      endRecoverAnimation(localViewHolder, false);
    } while (!this.mPendingCleanup.remove(localViewHolder.itemView));
    this.mCallback.clearView(this.mRecyclerView, localViewHolder);
  }
  
  public void onDraw(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.State paramState)
  {
    this.mOverdrawChildPosition = -1;
    float f1;
    if (this.mSelected != null)
    {
      getSelectedDxDy(this.mTmpPosition);
      f1 = this.mTmpPosition[0];
    }
    for (float f2 = this.mTmpPosition[1];; f2 = 0.0F)
    {
      this.mCallback.onDraw(paramCanvas, paramRecyclerView, this.mSelected, this.mRecoverAnimations, this.mActionState, f1, f2);
      return;
      f1 = 0.0F;
    }
  }
  
  public void onDrawOver(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.State paramState)
  {
    float f1;
    if (this.mSelected != null)
    {
      getSelectedDxDy(this.mTmpPosition);
      f1 = this.mTmpPosition[0];
    }
    for (float f2 = this.mTmpPosition[1];; f2 = 0.0F)
    {
      this.mCallback.onDrawOver(paramCanvas, paramRecyclerView, this.mSelected, this.mRecoverAnimations, this.mActionState, f1, f2);
      return;
      f1 = 0.0F;
    }
  }
  
  void postDispatchSwipe(final b paramb, final int paramInt)
  {
    this.mRecyclerView.post(new Runnable()
    {
      public void run()
      {
        if ((ItemTouchHelper.this.mRecyclerView != null) && (ItemTouchHelper.this.mRecyclerView.isAttachedToWindow()) && (!paramb.n) && (paramb.h.getAdapterPosition() != -1))
        {
          RecyclerView.ItemAnimator localItemAnimator = ItemTouchHelper.this.mRecyclerView.getItemAnimator();
          if (((localItemAnimator == null) || (!localItemAnimator.isRunning(null))) && (!ItemTouchHelper.this.hasRunningRecoverAnim())) {
            ItemTouchHelper.this.mCallback.onSwiped(paramb.h, paramInt);
          }
        }
        else
        {
          return;
        }
        ItemTouchHelper.this.mRecyclerView.post(this);
      }
    });
  }
  
  void removeChildDrawingOrderCallbackIfNecessary(View paramView)
  {
    if (paramView == this.mOverdrawChild)
    {
      this.mOverdrawChild = null;
      if (this.mChildDrawingOrderCallback != null) {
        this.mRecyclerView.setChildDrawingOrderCallback(null);
      }
    }
  }
  
  boolean scrollIfNecessary()
  {
    if (this.mSelected == null)
    {
      this.mDragScrollStartTimeInMs = -9223372036854775808L;
      return false;
    }
    long l1 = System.currentTimeMillis();
    long l2;
    int i3;
    int i;
    label130:
    int i2;
    int j;
    if (this.mDragScrollStartTimeInMs == -9223372036854775808L)
    {
      l2 = 0L;
      RecyclerView.LayoutManager localLayoutManager = this.mRecyclerView.getLayoutManager();
      if (this.mTmpRect == null) {
        this.mTmpRect = new Rect();
      }
      localLayoutManager.calculateItemDecorationsForChild(this.mSelected.itemView, this.mTmpRect);
      if (!localLayoutManager.canScrollHorizontally()) {
        break label378;
      }
      i3 = (int)(this.mSelectedStartX + this.mDx);
      i = i3 - this.mTmpRect.left - this.mRecyclerView.getPaddingLeft();
      if ((this.mDx >= 0.0F) || (i >= 0)) {
        break label325;
      }
      if (!localLayoutManager.canScrollVertically()) {
        break label437;
      }
      i2 = (int)(this.mSelectedStartY + this.mDy);
      j = i2 - this.mTmpRect.top - this.mRecyclerView.getPaddingTop();
      if ((this.mDy >= 0.0F) || (j >= 0)) {
        break label384;
      }
      label184:
      if (i == 0) {
        break label459;
      }
    }
    label325:
    label459:
    for (int k = this.mCallback.interpolateOutOfBoundsScroll(this.mRecyclerView, this.mSelected.itemView.getWidth(), i, this.mRecyclerView.getWidth(), l2);; k = i)
    {
      Callback localCallback;
      RecyclerView localRecyclerView;
      int n;
      int i1;
      if (j != 0)
      {
        localCallback = this.mCallback;
        localRecyclerView = this.mRecyclerView;
        n = this.mSelected.itemView.getHeight();
        i1 = this.mRecyclerView.getHeight();
      }
      for (int m = localCallback.interpolateOutOfBoundsScroll(localRecyclerView, n, j, i1, l2);; m = j)
      {
        if ((k != 0) || (m != 0))
        {
          if (this.mDragScrollStartTimeInMs == -9223372036854775808L) {
            this.mDragScrollStartTimeInMs = l1;
          }
          this.mRecyclerView.scrollBy(k, m);
          return true;
          l2 = l1 - this.mDragScrollStartTimeInMs;
          break;
          if (this.mDx > 0.0F)
          {
            i = i3 + this.mSelected.itemView.getWidth() + this.mTmpRect.right - (this.mRecyclerView.getWidth() - this.mRecyclerView.getPaddingRight());
            if (i > 0) {
              break label130;
            }
          }
          label378:
          i = 0;
          break label130;
          if (this.mDy > 0.0F)
          {
            j = i2 + this.mSelected.itemView.getHeight() + this.mTmpRect.bottom - (this.mRecyclerView.getHeight() - this.mRecyclerView.getPaddingBottom());
            if (j > 0) {
              break label184;
            }
          }
          j = 0;
          break label184;
        }
        this.mDragScrollStartTimeInMs = -9223372036854775808L;
        return false;
      }
    }
  }
  
  void select(RecyclerView.ViewHolder paramViewHolder, int paramInt)
  {
    if ((paramViewHolder == this.mSelected) && (paramInt == this.mActionState)) {
      return;
    }
    this.mDragScrollStartTimeInMs = -9223372036854775808L;
    int i = this.mActionState;
    endRecoverAnimation(paramViewHolder, true);
    this.mActionState = paramInt;
    if (paramInt == 2)
    {
      this.mOverdrawChild = paramViewHolder.itemView;
      addChildDrawingOrderCallback();
    }
    int j = -1 + (1 << 8 + paramInt * 8);
    RecyclerView.ViewHolder localViewHolder1 = this.mSelected;
    int k = 0;
    final RecyclerView.ViewHolder localViewHolder2;
    final int n;
    float f2;
    float f1;
    label182:
    int i1;
    label191:
    int m;
    label290:
    ViewParent localViewParent;
    if (localViewHolder1 != null)
    {
      localViewHolder2 = this.mSelected;
      if (localViewHolder2.itemView.getParent() == null) {
        break label523;
      }
      if (i == 2)
      {
        n = 0;
        releaseVelocityTracker();
      }
    }
    else
    {
      switch (n)
      {
      default: 
        f2 = 0.0F;
        f1 = 0.0F;
        if (i == 2)
        {
          i1 = 8;
          getSelectedDxDy(this.mTmpPosition);
          float f3 = this.mTmpPosition[0];
          float f4 = this.mTmpPosition[1];
          b local3 = new b(localViewHolder2, i1, i, f3, f4, f2, f1)
          {
            public void onAnimationEnd(Animator paramAnonymousAnimator)
            {
              super.onAnimationEnd(paramAnonymousAnimator);
              if (this.n) {}
              for (;;)
              {
                return;
                if (n <= 0) {
                  ItemTouchHelper.this.mCallback.clearView(ItemTouchHelper.this.mRecyclerView, localViewHolder2);
                }
                while (ItemTouchHelper.this.mOverdrawChild == localViewHolder2.itemView)
                {
                  ItemTouchHelper.this.removeChildDrawingOrderCallbackIfNecessary(localViewHolder2.itemView);
                  return;
                  ItemTouchHelper.this.mPendingCleanup.add(localViewHolder2.itemView);
                  this.k = true;
                  if (n > 0) {
                    ItemTouchHelper.this.postDispatchSwipe(this, n);
                  }
                }
              }
            }
          };
          local3.a(this.mCallback.getAnimationDuration(this.mRecyclerView, i1, f2 - f3, f1 - f4));
          this.mRecoverAnimations.add(local3);
          local3.a();
          k = 1;
          this.mSelected = null;
          m = k;
          if (paramViewHolder != null)
          {
            this.mSelectedFlags = ((j & this.mCallback.getAbsoluteMovementFlags(this.mRecyclerView, paramViewHolder)) >> 8 * this.mActionState);
            this.mSelectedStartX = paramViewHolder.itemView.getLeft();
            this.mSelectedStartY = paramViewHolder.itemView.getTop();
            this.mSelected = paramViewHolder;
            if (paramInt == 2) {
              this.mSelected.itemView.performHapticFeedback(0);
            }
          }
          localViewParent = this.mRecyclerView.getParent();
          if (localViewParent != null) {
            if (this.mSelected == null) {
              break label551;
            }
          }
        }
        break;
      }
    }
    label523:
    label551:
    for (boolean bool = true;; bool = false)
    {
      localViewParent.requestDisallowInterceptTouchEvent(bool);
      if (m == 0) {
        this.mRecyclerView.getLayoutManager().requestSimpleAnimationsInNextLayout();
      }
      this.mCallback.onSelectedChanged(this.mSelected, this.mActionState);
      this.mRecyclerView.invalidate();
      return;
      n = swipeIfNecessary(localViewHolder2);
      break;
      f2 = Math.signum(this.mDx) * this.mRecyclerView.getWidth();
      f1 = 0.0F;
      break label182;
      f1 = Math.signum(this.mDy) * this.mRecyclerView.getHeight();
      f2 = 0.0F;
      break label182;
      if (n > 0)
      {
        i1 = 2;
        break label191;
      }
      i1 = 4;
      break label191;
      removeChildDrawingOrderCallbackIfNecessary(localViewHolder2.itemView);
      this.mCallback.clearView(this.mRecyclerView, localViewHolder2);
      k = 0;
      break label290;
    }
  }
  
  public void startDrag(RecyclerView.ViewHolder paramViewHolder)
  {
    if (!this.mCallback.hasDragFlag(this.mRecyclerView, paramViewHolder))
    {
      Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
      return;
    }
    if (paramViewHolder.itemView.getParent() != this.mRecyclerView)
    {
      Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
      return;
    }
    obtainVelocityTracker();
    this.mDy = 0.0F;
    this.mDx = 0.0F;
    select(paramViewHolder, 2);
  }
  
  public void startSwipe(RecyclerView.ViewHolder paramViewHolder)
  {
    if (!this.mCallback.hasSwipeFlag(this.mRecyclerView, paramViewHolder))
    {
      Log.e("ItemTouchHelper", "Start swipe has been called but swiping is not enabled");
      return;
    }
    if (paramViewHolder.itemView.getParent() != this.mRecyclerView)
    {
      Log.e("ItemTouchHelper", "Start swipe has been called with a view holder which is not a child of the RecyclerView controlled by this ItemTouchHelper.");
      return;
    }
    obtainVelocityTracker();
    this.mDy = 0.0F;
    this.mDx = 0.0F;
    select(paramViewHolder, 1);
  }
  
  void updateDxDy(MotionEvent paramMotionEvent, int paramInt1, int paramInt2)
  {
    float f1 = paramMotionEvent.getX(paramInt2);
    float f2 = paramMotionEvent.getY(paramInt2);
    this.mDx = (f1 - this.mInitialTouchX);
    this.mDy = (f2 - this.mInitialTouchY);
    if ((paramInt1 & 0x4) == 0) {
      this.mDx = Math.max(0.0F, this.mDx);
    }
    if ((paramInt1 & 0x8) == 0) {
      this.mDx = Math.min(0.0F, this.mDx);
    }
    if ((paramInt1 & 0x1) == 0) {
      this.mDy = Math.max(0.0F, this.mDy);
    }
    if ((paramInt1 & 0x2) == 0) {
      this.mDy = Math.min(0.0F, this.mDy);
    }
  }
  
  public static abstract class Callback
  {
    private static final int ABS_HORIZONTAL_DIR_FLAGS = 789516;
    public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
    public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;
    private static final long DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS = 2000L;
    static final int RELATIVE_DIR_FLAGS = 3158064;
    private static final Interpolator sDragScrollInterpolator = new Interpolator()
    {
      public float getInterpolation(float paramAnonymousFloat)
      {
        return paramAnonymousFloat * (paramAnonymousFloat * (paramAnonymousFloat * (paramAnonymousFloat * paramAnonymousFloat)));
      }
    };
    private static final Interpolator sDragViewScrollCapInterpolator = new Interpolator()
    {
      public float getInterpolation(float paramAnonymousFloat)
      {
        float f = paramAnonymousFloat - 1.0F;
        return 1.0F + f * (f * (f * (f * f)));
      }
    };
    private static final ItemTouchUIUtil sUICallback = new a.b();
    private int mCachedMaxScrollSpeed = -1;
    
    static
    {
      if (Build.VERSION.SDK_INT >= 21)
      {
        sUICallback = new a.a();
        return;
      }
    }
    
    public static int convertToRelativeDirection(int paramInt1, int paramInt2)
    {
      int i = paramInt1 & 0xC0C0C;
      if (i == 0) {
        return paramInt1;
      }
      int j = paramInt1 & (i ^ 0xFFFFFFFF);
      if (paramInt2 == 0) {
        return j | i << 2;
      }
      return j | 0xFFF3F3F3 & i << 1 | (0xC0C0C & i << 1) << 2;
    }
    
    public static ItemTouchUIUtil getDefaultUIUtil()
    {
      return sUICallback;
    }
    
    private int getMaxDragScroll(RecyclerView paramRecyclerView)
    {
      if (this.mCachedMaxScrollSpeed == -1) {
        this.mCachedMaxScrollSpeed = paramRecyclerView.getResources().getDimensionPixelSize(android.support.v7.e.a.a.item_touch_helper_max_drag_scroll_per_frame);
      }
      return this.mCachedMaxScrollSpeed;
    }
    
    public static int makeFlag(int paramInt1, int paramInt2)
    {
      return paramInt2 << paramInt1 * 8;
    }
    
    public static int makeMovementFlags(int paramInt1, int paramInt2)
    {
      return makeFlag(0, paramInt2 | paramInt1) | makeFlag(1, paramInt2) | makeFlag(2, paramInt1);
    }
    
    public boolean canDropOver(RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder1, RecyclerView.ViewHolder paramViewHolder2)
    {
      return true;
    }
    
    public RecyclerView.ViewHolder chooseDropTarget(RecyclerView.ViewHolder paramViewHolder, List<RecyclerView.ViewHolder> paramList, int paramInt1, int paramInt2)
    {
      int i = paramInt1 + paramViewHolder.itemView.getWidth();
      int j = paramInt2 + paramViewHolder.itemView.getHeight();
      Object localObject1 = null;
      int k = -1;
      int m = paramInt1 - paramViewHolder.itemView.getLeft();
      int n = paramInt2 - paramViewHolder.itemView.getTop();
      int i1 = paramList.size();
      int i2 = 0;
      RecyclerView.ViewHolder localViewHolder;
      int i3;
      Object localObject2;
      label146:
      int i4;
      if (i2 < i1)
      {
        localViewHolder = (RecyclerView.ViewHolder)paramList.get(i2);
        if (m <= 0) {
          break label343;
        }
        int i11 = localViewHolder.itemView.getRight() - i;
        if ((i11 >= 0) || (localViewHolder.itemView.getRight() <= paramViewHolder.itemView.getRight())) {
          break label343;
        }
        int i12 = Math.abs(i11);
        if (i12 <= k) {
          break label343;
        }
        i3 = i12;
        localObject2 = localViewHolder;
        if (m >= 0) {
          break label372;
        }
        int i10 = localViewHolder.itemView.getLeft() - paramInt1;
        if ((i10 <= 0) || (localViewHolder.itemView.getLeft() >= paramViewHolder.itemView.getLeft())) {
          break label372;
        }
        i4 = Math.abs(i10);
        if (i4 <= i3) {
          break label372;
        }
        localObject2 = localViewHolder;
      }
      for (;;)
      {
        int i5;
        if (n < 0)
        {
          int i9 = localViewHolder.itemView.getTop() - paramInt2;
          if ((i9 > 0) && (localViewHolder.itemView.getTop() < paramViewHolder.itemView.getTop()))
          {
            i5 = Math.abs(i9);
            if (i5 > i4) {
              localObject2 = localViewHolder;
            }
          }
        }
        for (;;)
        {
          Object localObject3;
          int i6;
          if (n > 0)
          {
            int i7 = localViewHolder.itemView.getBottom() - j;
            if ((i7 < 0) && (localViewHolder.itemView.getBottom() > paramViewHolder.itemView.getBottom()))
            {
              int i8 = Math.abs(i7);
              if (i8 > i5)
              {
                localObject3 = localViewHolder;
                i6 = i8;
              }
            }
          }
          for (;;)
          {
            i2++;
            localObject1 = localObject3;
            k = i6;
            break;
            return localObject1;
            label343:
            localObject2 = localObject1;
            i3 = k;
            break label146;
            i6 = i5;
            localObject3 = localObject2;
          }
          i5 = i4;
        }
        label372:
        i4 = i3;
      }
    }
    
    public void clearView(RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder)
    {
      sUICallback.clearView(paramViewHolder.itemView);
    }
    
    public int convertToAbsoluteDirection(int paramInt1, int paramInt2)
    {
      int i = paramInt1 & 0x303030;
      if (i == 0) {
        return paramInt1;
      }
      int j = paramInt1 & (i ^ 0xFFFFFFFF);
      if (paramInt2 == 0) {
        return j | i >> 2;
      }
      return j | 0xFFCFCFCF & i >> 1 | (0x303030 & i >> 1) >> 2;
    }
    
    final int getAbsoluteMovementFlags(RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder)
    {
      return convertToAbsoluteDirection(getMovementFlags(paramRecyclerView, paramViewHolder), s.e(paramRecyclerView));
    }
    
    public long getAnimationDuration(RecyclerView paramRecyclerView, int paramInt, float paramFloat1, float paramFloat2)
    {
      RecyclerView.ItemAnimator localItemAnimator = paramRecyclerView.getItemAnimator();
      if (localItemAnimator == null)
      {
        if (paramInt == 8) {
          return 200L;
        }
        return 250L;
      }
      if (paramInt == 8) {
        return localItemAnimator.getMoveDuration();
      }
      return localItemAnimator.getRemoveDuration();
    }
    
    public int getBoundingBoxMargin()
    {
      return 0;
    }
    
    public float getMoveThreshold(RecyclerView.ViewHolder paramViewHolder)
    {
      return 0.5F;
    }
    
    public abstract int getMovementFlags(RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder);
    
    public float getSwipeEscapeVelocity(float paramFloat)
    {
      return paramFloat;
    }
    
    public float getSwipeThreshold(RecyclerView.ViewHolder paramViewHolder)
    {
      return 0.5F;
    }
    
    public float getSwipeVelocityThreshold(float paramFloat)
    {
      return paramFloat;
    }
    
    boolean hasDragFlag(RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder)
    {
      return (0xFF0000 & getAbsoluteMovementFlags(paramRecyclerView, paramViewHolder)) != 0;
    }
    
    boolean hasSwipeFlag(RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder)
    {
      return (0xFF00 & getAbsoluteMovementFlags(paramRecyclerView, paramViewHolder)) != 0;
    }
    
    public int interpolateOutOfBoundsScroll(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, int paramInt3, long paramLong)
    {
      float f1 = 1.0F;
      int i = getMaxDragScroll(paramRecyclerView);
      int j = Math.abs(paramInt2);
      int k = (int)Math.signum(paramInt2);
      float f2 = Math.min(f1, f1 * j / paramInt1);
      int m = (int)(i * k * sDragViewScrollCapInterpolator.getInterpolation(f2));
      if (paramLong > 2000L) {}
      for (;;)
      {
        int n = (int)(m * sDragScrollInterpolator.getInterpolation(f1));
        if (n == 0)
        {
          if (paramInt2 <= 0) {
            break;
          }
          n = 1;
        }
        return n;
        f1 = (float)paramLong / 2000.0F;
      }
      return -1;
    }
    
    public boolean isItemViewSwipeEnabled()
    {
      return true;
    }
    
    public boolean isLongPressDragEnabled()
    {
      return true;
    }
    
    public void onChildDraw(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean)
    {
      sUICallback.onDraw(paramCanvas, paramRecyclerView, paramViewHolder.itemView, paramFloat1, paramFloat2, paramInt, paramBoolean);
    }
    
    public void onChildDrawOver(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean)
    {
      sUICallback.onDrawOver(paramCanvas, paramRecyclerView, paramViewHolder.itemView, paramFloat1, paramFloat2, paramInt, paramBoolean);
    }
    
    void onDraw(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder, List<ItemTouchHelper.b> paramList, int paramInt, float paramFloat1, float paramFloat2)
    {
      int i = paramList.size();
      for (int j = 0; j < i; j++)
      {
        ItemTouchHelper.b localb = (ItemTouchHelper.b)paramList.get(j);
        localb.c();
        int m = paramCanvas.save();
        onChildDraw(paramCanvas, paramRecyclerView, localb.h, localb.l, localb.m, localb.i, false);
        paramCanvas.restoreToCount(m);
      }
      if (paramViewHolder != null)
      {
        int k = paramCanvas.save();
        onChildDraw(paramCanvas, paramRecyclerView, paramViewHolder, paramFloat1, paramFloat2, paramInt, true);
        paramCanvas.restoreToCount(k);
      }
    }
    
    void onDrawOver(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder, List<ItemTouchHelper.b> paramList, int paramInt, float paramFloat1, float paramFloat2)
    {
      int i = paramList.size();
      for (int j = 0; j < i; j++)
      {
        ItemTouchHelper.b localb2 = (ItemTouchHelper.b)paramList.get(j);
        int i2 = paramCanvas.save();
        onChildDrawOver(paramCanvas, paramRecyclerView, localb2.h, localb2.l, localb2.m, localb2.i, false);
        paramCanvas.restoreToCount(i2);
      }
      if (paramViewHolder != null)
      {
        int i1 = paramCanvas.save();
        onChildDrawOver(paramCanvas, paramRecyclerView, paramViewHolder, paramFloat1, paramFloat2, paramInt, true);
        paramCanvas.restoreToCount(i1);
      }
      int k = 0;
      int m = i - 1;
      ItemTouchHelper.b localb1;
      int n;
      if (m >= 0)
      {
        localb1 = (ItemTouchHelper.b)paramList.get(m);
        if ((localb1.o) && (!localb1.k))
        {
          paramList.remove(m);
          n = k;
        }
      }
      for (;;)
      {
        m--;
        k = n;
        break;
        if (!localb1.o)
        {
          n = 1;
          continue;
          if (k != 0) {
            paramRecyclerView.invalidate();
          }
        }
        else
        {
          n = k;
        }
      }
    }
    
    public abstract boolean onMove(RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder1, RecyclerView.ViewHolder paramViewHolder2);
    
    public void onMoved(RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder1, int paramInt1, RecyclerView.ViewHolder paramViewHolder2, int paramInt2, int paramInt3, int paramInt4)
    {
      RecyclerView.LayoutManager localLayoutManager = paramRecyclerView.getLayoutManager();
      if ((localLayoutManager instanceof ItemTouchHelper.ViewDropHandler)) {
        ((ItemTouchHelper.ViewDropHandler)localLayoutManager).prepareForDrop(paramViewHolder1.itemView, paramViewHolder2.itemView, paramInt3, paramInt4);
      }
      do
      {
        do
        {
          return;
          if (localLayoutManager.canScrollHorizontally())
          {
            if (localLayoutManager.getDecoratedLeft(paramViewHolder2.itemView) <= paramRecyclerView.getPaddingLeft()) {
              paramRecyclerView.scrollToPosition(paramInt2);
            }
            if (localLayoutManager.getDecoratedRight(paramViewHolder2.itemView) >= paramRecyclerView.getWidth() - paramRecyclerView.getPaddingRight()) {
              paramRecyclerView.scrollToPosition(paramInt2);
            }
          }
        } while (!localLayoutManager.canScrollVertically());
        if (localLayoutManager.getDecoratedTop(paramViewHolder2.itemView) <= paramRecyclerView.getPaddingTop()) {
          paramRecyclerView.scrollToPosition(paramInt2);
        }
      } while (localLayoutManager.getDecoratedBottom(paramViewHolder2.itemView) < paramRecyclerView.getHeight() - paramRecyclerView.getPaddingBottom());
      paramRecyclerView.scrollToPosition(paramInt2);
    }
    
    public void onSelectedChanged(RecyclerView.ViewHolder paramViewHolder, int paramInt)
    {
      if (paramViewHolder != null) {
        sUICallback.onSelected(paramViewHolder.itemView);
      }
    }
    
    public abstract void onSwiped(RecyclerView.ViewHolder paramViewHolder, int paramInt);
  }
  
  public static abstract class SimpleCallback
    extends ItemTouchHelper.Callback
  {
    private int mDefaultDragDirs;
    private int mDefaultSwipeDirs;
    
    public SimpleCallback(int paramInt1, int paramInt2)
    {
      this.mDefaultSwipeDirs = paramInt2;
      this.mDefaultDragDirs = paramInt1;
    }
    
    public int getDragDirs(RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder)
    {
      return this.mDefaultDragDirs;
    }
    
    public int getMovementFlags(RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder)
    {
      return makeMovementFlags(getDragDirs(paramRecyclerView, paramViewHolder), getSwipeDirs(paramRecyclerView, paramViewHolder));
    }
    
    public int getSwipeDirs(RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder)
    {
      return this.mDefaultSwipeDirs;
    }
    
    public void setDefaultDragDirs(int paramInt)
    {
      this.mDefaultDragDirs = paramInt;
    }
    
    public void setDefaultSwipeDirs(int paramInt)
    {
      this.mDefaultSwipeDirs = paramInt;
    }
  }
  
  public static abstract interface ViewDropHandler
  {
    public abstract void prepareForDrop(View paramView1, View paramView2, int paramInt1, int paramInt2);
  }
  
  private class a
    extends GestureDetector.SimpleOnGestureListener
  {
    private boolean b = true;
    
    a() {}
    
    void a()
    {
      this.b = false;
    }
    
    public boolean onDown(MotionEvent paramMotionEvent)
    {
      return true;
    }
    
    public void onLongPress(MotionEvent paramMotionEvent)
    {
      if (!this.b) {}
      RecyclerView.ViewHolder localViewHolder;
      do
      {
        do
        {
          View localView;
          do
          {
            return;
            localView = ItemTouchHelper.this.findChildView(paramMotionEvent);
          } while (localView == null);
          localViewHolder = ItemTouchHelper.this.mRecyclerView.getChildViewHolder(localView);
        } while ((localViewHolder == null) || (!ItemTouchHelper.this.mCallback.hasDragFlag(ItemTouchHelper.this.mRecyclerView, localViewHolder)) || (paramMotionEvent.getPointerId(0) != ItemTouchHelper.this.mActivePointerId));
        int i = paramMotionEvent.findPointerIndex(ItemTouchHelper.this.mActivePointerId);
        float f1 = paramMotionEvent.getX(i);
        float f2 = paramMotionEvent.getY(i);
        ItemTouchHelper.this.mInitialTouchX = f1;
        ItemTouchHelper.this.mInitialTouchY = f2;
        ItemTouchHelper localItemTouchHelper = ItemTouchHelper.this;
        ItemTouchHelper.this.mDy = 0.0F;
        localItemTouchHelper.mDx = 0.0F;
      } while (!ItemTouchHelper.this.mCallback.isLongPressDragEnabled());
      ItemTouchHelper.this.select(localViewHolder, 2);
    }
  }
  
  private static class b
    implements Animator.AnimatorListener
  {
    private final ValueAnimator a;
    private float b;
    final float d;
    final float e;
    final float f;
    final float g;
    final RecyclerView.ViewHolder h;
    final int i;
    final int j;
    public boolean k;
    float l;
    float m;
    boolean n = false;
    boolean o = false;
    
    b(RecyclerView.ViewHolder paramViewHolder, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
    {
      this.i = paramInt2;
      this.j = paramInt1;
      this.h = paramViewHolder;
      this.d = paramFloat1;
      this.e = paramFloat2;
      this.f = paramFloat3;
      this.g = paramFloat4;
      this.a = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
      this.a.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
      {
        public void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
        {
          ItemTouchHelper.b.this.a(paramAnonymousValueAnimator.getAnimatedFraction());
        }
      });
      this.a.setTarget(paramViewHolder.itemView);
      this.a.addListener(this);
      a(0.0F);
    }
    
    public void a()
    {
      this.h.setIsRecyclable(false);
      this.a.start();
    }
    
    public void a(float paramFloat)
    {
      this.b = paramFloat;
    }
    
    public void a(long paramLong)
    {
      this.a.setDuration(paramLong);
    }
    
    public void b()
    {
      this.a.cancel();
    }
    
    public void c()
    {
      if (this.d == this.f) {}
      for (this.l = this.h.itemView.getTranslationX(); this.e == this.g; this.l = (this.d + this.b * (this.f - this.d)))
      {
        this.m = this.h.itemView.getTranslationY();
        return;
      }
      this.m = (this.e + this.b * (this.g - this.e));
    }
    
    public void onAnimationCancel(Animator paramAnimator)
    {
      a(1.0F);
    }
    
    public void onAnimationEnd(Animator paramAnimator)
    {
      if (!this.o) {
        this.h.setIsRecyclable(true);
      }
      this.o = true;
    }
    
    public void onAnimationRepeat(Animator paramAnimator) {}
    
    public void onAnimationStart(Animator paramAnimator) {}
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.helper.ItemTouchHelper
 * JD-Core Version:    0.7.0.1
 */