package android.support.v4.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.arch.lifecycle.v;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.f.b;
import android.support.v4.f.d;
import android.support.v4.f.e;
import android.support.v4.f.j;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

final class FragmentManagerImpl
  extends FragmentManager
  implements LayoutInflater.Factory2
{
  static final Interpolator ACCELERATE_CUBIC = new AccelerateInterpolator(1.5F);
  static final Interpolator ACCELERATE_QUINT;
  static final int ANIM_DUR = 220;
  public static final int ANIM_STYLE_CLOSE_ENTER = 3;
  public static final int ANIM_STYLE_CLOSE_EXIT = 4;
  public static final int ANIM_STYLE_FADE_ENTER = 5;
  public static final int ANIM_STYLE_FADE_EXIT = 6;
  public static final int ANIM_STYLE_OPEN_ENTER = 1;
  public static final int ANIM_STYLE_OPEN_EXIT = 2;
  static boolean DEBUG = false;
  static final Interpolator DECELERATE_CUBIC;
  static final Interpolator DECELERATE_QUINT;
  static final String TAG = "FragmentManager";
  static final String TARGET_REQUEST_CODE_STATE_TAG = "android:target_req_state";
  static final String TARGET_STATE_TAG = "android:target_state";
  static final String USER_VISIBLE_HINT_TAG = "android:user_visible_hint";
  static final String VIEW_STATE_TAG = "android:view_state";
  static Field sAnimationListenerField = null;
  SparseArray<Fragment> mActive;
  final ArrayList<Fragment> mAdded = new ArrayList();
  ArrayList<Integer> mAvailBackStackIndices;
  ArrayList<BackStackRecord> mBackStack;
  ArrayList<FragmentManager.OnBackStackChangedListener> mBackStackChangeListeners;
  ArrayList<BackStackRecord> mBackStackIndices;
  FragmentContainer mContainer;
  ArrayList<Fragment> mCreatedMenus;
  int mCurState = 0;
  boolean mDestroyed;
  Runnable mExecCommit = new Runnable()
  {
    public void run()
    {
      FragmentManagerImpl.this.execPendingActions();
    }
  };
  boolean mExecutingActions;
  boolean mHavePendingDeferredStart;
  FragmentHostCallback mHost;
  private final CopyOnWriteArrayList<j<FragmentManager.FragmentLifecycleCallbacks, Boolean>> mLifecycleCallbacks = new CopyOnWriteArrayList();
  boolean mNeedMenuInvalidate;
  int mNextFragmentIndex = 0;
  String mNoTransactionsBecause;
  Fragment mParent;
  ArrayList<OpGenerator> mPendingActions;
  ArrayList<StartEnterTransitionListener> mPostponedTransactions;
  Fragment mPrimaryNav;
  FragmentManagerNonConfig mSavedNonConfig;
  SparseArray<Parcelable> mStateArray = null;
  Bundle mStateBundle = null;
  boolean mStateSaved;
  boolean mStopped;
  ArrayList<Fragment> mTmpAddedFragments;
  ArrayList<Boolean> mTmpIsPop;
  ArrayList<BackStackRecord> mTmpRecords;
  
  static
  {
    DECELERATE_QUINT = new DecelerateInterpolator(2.5F);
    DECELERATE_CUBIC = new DecelerateInterpolator(1.5F);
    ACCELERATE_QUINT = new AccelerateInterpolator(2.5F);
  }
  
  private void addAddedFragments(b<Fragment> paramb)
  {
    if (this.mCurState < 1) {}
    for (;;)
    {
      return;
      int i = Math.min(this.mCurState, 4);
      int j = this.mAdded.size();
      for (int k = 0; k < j; k++)
      {
        Fragment localFragment = (Fragment)this.mAdded.get(k);
        if (localFragment.mState < i)
        {
          moveToState(localFragment, i, localFragment.getNextAnim(), localFragment.getNextTransition(), false);
          if ((localFragment.mView != null) && (!localFragment.mHidden) && (localFragment.mIsNewlyAdded)) {
            paramb.add(localFragment);
          }
        }
      }
    }
  }
  
  private void animateRemoveFragment(final Fragment paramFragment, AnimationOrAnimator paramAnimationOrAnimator, int paramInt)
  {
    final View localView = paramFragment.mView;
    final ViewGroup localViewGroup = paramFragment.mContainer;
    localViewGroup.startViewTransition(localView);
    paramFragment.setStateAfterAnimating(paramInt);
    if (paramAnimationOrAnimator.animation != null)
    {
      EndViewTransitionAnimator localEndViewTransitionAnimator = new EndViewTransitionAnimator(paramAnimationOrAnimator.animation, localViewGroup, localView);
      paramFragment.setAnimatingAway(paramFragment.mView);
      localEndViewTransitionAnimator.setAnimationListener(new AnimationListenerWrapper(getAnimationListener(localEndViewTransitionAnimator), localViewGroup)
      {
        public void onAnimationEnd(Animation paramAnonymousAnimation)
        {
          super.onAnimationEnd(paramAnonymousAnimation);
          localViewGroup.post(new Runnable()
          {
            public void run()
            {
              if (FragmentManagerImpl.2.this.val$fragment.getAnimatingAway() != null)
              {
                FragmentManagerImpl.2.this.val$fragment.setAnimatingAway(null);
                FragmentManagerImpl.this.moveToState(FragmentManagerImpl.2.this.val$fragment, FragmentManagerImpl.2.this.val$fragment.getStateAfterAnimating(), 0, 0, false);
              }
            }
          });
        }
      });
      setHWLayerAnimListenerIfAlpha(localView, paramAnimationOrAnimator);
      paramFragment.mView.startAnimation(localEndViewTransitionAnimator);
      return;
    }
    Animator localAnimator = paramAnimationOrAnimator.animator;
    paramFragment.setAnimator(paramAnimationOrAnimator.animator);
    localAnimator.addListener(new AnimatorListenerAdapter()
    {
      public void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        localViewGroup.endViewTransition(localView);
        Animator localAnimator = paramFragment.getAnimator();
        paramFragment.setAnimator(null);
        if ((localAnimator != null) && (localViewGroup.indexOfChild(localView) < 0)) {
          FragmentManagerImpl.this.moveToState(paramFragment, paramFragment.getStateAfterAnimating(), 0, 0, false);
        }
      }
    });
    localAnimator.setTarget(paramFragment.mView);
    setHWLayerAnimListenerIfAlpha(paramFragment.mView, paramAnimationOrAnimator);
    localAnimator.start();
  }
  
  private void burpActive()
  {
    if (this.mActive != null) {
      for (int i = -1 + this.mActive.size(); i >= 0; i--) {
        if (this.mActive.valueAt(i) == null) {
          this.mActive.delete(this.mActive.keyAt(i));
        }
      }
    }
  }
  
  private void checkStateLoss()
  {
    if (isStateSaved()) {
      throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }
    if (this.mNoTransactionsBecause != null) {
      throw new IllegalStateException("Can not perform this action inside of " + this.mNoTransactionsBecause);
    }
  }
  
  private void cleanupExec()
  {
    this.mExecutingActions = false;
    this.mTmpIsPop.clear();
    this.mTmpRecords.clear();
  }
  
  private void completeExecute(BackStackRecord paramBackStackRecord, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    int j;
    label95:
    Fragment localFragment;
    if (paramBoolean1)
    {
      paramBackStackRecord.executePopOps(paramBoolean3);
      ArrayList localArrayList1 = new ArrayList(1);
      ArrayList localArrayList2 = new ArrayList(1);
      localArrayList1.add(paramBackStackRecord);
      localArrayList2.add(Boolean.valueOf(paramBoolean1));
      if (paramBoolean2) {
        FragmentTransition.startTransitions(this, localArrayList1, localArrayList2, 0, 1, true);
      }
      if (paramBoolean3) {
        moveToState(this.mCurState, true);
      }
      if (this.mActive == null) {
        return;
      }
      int i = this.mActive.size();
      j = 0;
      if (j >= i) {
        return;
      }
      localFragment = (Fragment)this.mActive.valueAt(j);
      if ((localFragment != null) && (localFragment.mView != null) && (localFragment.mIsNewlyAdded) && (paramBackStackRecord.interactsWith(localFragment.mContainerId)))
      {
        if (localFragment.mPostponedAlpha > 0.0F) {
          localFragment.mView.setAlpha(localFragment.mPostponedAlpha);
        }
        if (!paramBoolean3) {
          break label196;
        }
        localFragment.mPostponedAlpha = 0.0F;
      }
    }
    for (;;)
    {
      j++;
      break label95;
      paramBackStackRecord.executeOps();
      break;
      label196:
      localFragment.mPostponedAlpha = -1.0F;
      localFragment.mIsNewlyAdded = false;
    }
  }
  
  private void dispatchStateChange(int paramInt)
  {
    try
    {
      this.mExecutingActions = true;
      moveToState(paramInt, false);
      this.mExecutingActions = false;
      execPendingActions();
      return;
    }
    finally
    {
      this.mExecutingActions = false;
    }
  }
  
  private void endAnimatingAwayFragments()
  {
    int i;
    int j;
    label11:
    Fragment localFragment;
    if (this.mActive == null)
    {
      i = 0;
      j = 0;
      if (j >= i) {
        return;
      }
      localFragment = (Fragment)this.mActive.valueAt(j);
      if (localFragment != null)
      {
        if (localFragment.getAnimatingAway() == null) {
          break label105;
        }
        int k = localFragment.getStateAfterAnimating();
        View localView = localFragment.getAnimatingAway();
        Animation localAnimation = localView.getAnimation();
        if (localAnimation != null)
        {
          localAnimation.cancel();
          localView.clearAnimation();
        }
        localFragment.setAnimatingAway(null);
        moveToState(localFragment, k, 0, 0, false);
      }
    }
    for (;;)
    {
      j++;
      break label11;
      i = this.mActive.size();
      break;
      label105:
      if (localFragment.getAnimator() != null) {
        localFragment.getAnimator().end();
      }
    }
  }
  
  private void ensureExecReady(boolean paramBoolean)
  {
    if (this.mExecutingActions) {
      throw new IllegalStateException("FragmentManager is already executing transactions");
    }
    if (this.mHost == null) {
      throw new IllegalStateException("Fragment host has been destroyed");
    }
    if (Looper.myLooper() != this.mHost.getHandler().getLooper()) {
      throw new IllegalStateException("Must be called from main thread of fragment host");
    }
    if (!paramBoolean) {
      checkStateLoss();
    }
    if (this.mTmpRecords == null)
    {
      this.mTmpRecords = new ArrayList();
      this.mTmpIsPop = new ArrayList();
    }
    this.mExecutingActions = true;
    try
    {
      executePostponedTransaction(null, null);
      return;
    }
    finally
    {
      this.mExecutingActions = false;
    }
  }
  
  private static void executeOps(ArrayList<BackStackRecord> paramArrayList, ArrayList<Boolean> paramArrayList1, int paramInt1, int paramInt2)
  {
    if (paramInt1 < paramInt2)
    {
      BackStackRecord localBackStackRecord = (BackStackRecord)paramArrayList.get(paramInt1);
      boolean bool;
      if (((Boolean)paramArrayList1.get(paramInt1)).booleanValue())
      {
        localBackStackRecord.bumpBackStackNesting(-1);
        if (paramInt1 == paramInt2 - 1)
        {
          bool = true;
          label45:
          localBackStackRecord.executePopOps(bool);
        }
      }
      for (;;)
      {
        paramInt1++;
        break;
        bool = false;
        break label45;
        localBackStackRecord.bumpBackStackNesting(1);
        localBackStackRecord.executeOps();
      }
    }
  }
  
  private void executeOpsTogether(ArrayList<BackStackRecord> paramArrayList, ArrayList<Boolean> paramArrayList1, int paramInt1, int paramInt2)
  {
    boolean bool = ((BackStackRecord)paramArrayList.get(paramInt1)).mReorderingAllowed;
    int i;
    Object localObject;
    int j;
    label59:
    BackStackRecord localBackStackRecord2;
    Fragment localFragment2;
    if (this.mTmpAddedFragments == null)
    {
      this.mTmpAddedFragments = new ArrayList();
      this.mTmpAddedFragments.addAll(this.mAdded);
      Fragment localFragment1 = getPrimaryNavigationFragment();
      i = paramInt1;
      localObject = localFragment1;
      j = 0;
      if (i >= paramInt2) {
        break label167;
      }
      localBackStackRecord2 = (BackStackRecord)paramArrayList.get(i);
      if (((Boolean)paramArrayList1.get(i)).booleanValue()) {
        break label145;
      }
      localFragment2 = localBackStackRecord2.expandOps(this.mTmpAddedFragments, (Fragment)localObject);
      label105:
      if ((j == 0) && (!localBackStackRecord2.mAddToBackStack)) {
        break label161;
      }
    }
    label145:
    label161:
    for (int m = 1;; m = 0)
    {
      i++;
      localObject = localFragment2;
      j = m;
      break label59;
      this.mTmpAddedFragments.clear();
      break;
      localFragment2 = localBackStackRecord2.trackAddedFragmentsInPop(this.mTmpAddedFragments, (Fragment)localObject);
      break label105;
    }
    label167:
    this.mTmpAddedFragments.clear();
    if (!bool) {
      FragmentTransition.startTransitions(this, paramArrayList, paramArrayList1, paramInt1, paramInt2, false);
    }
    executeOps(paramArrayList, paramArrayList1, paramInt1, paramInt2);
    int k;
    if (bool)
    {
      b localb = new b();
      addAddedFragments(localb);
      k = postponePostponableTransactions(paramArrayList, paramArrayList1, paramInt1, paramInt2, localb);
      makeRemovedFragmentsInvisible(localb);
    }
    for (;;)
    {
      if ((k != paramInt1) && (bool))
      {
        FragmentTransition.startTransitions(this, paramArrayList, paramArrayList1, paramInt1, k, true);
        moveToState(this.mCurState, true);
      }
      while (paramInt1 < paramInt2)
      {
        BackStackRecord localBackStackRecord1 = (BackStackRecord)paramArrayList.get(paramInt1);
        if ((((Boolean)paramArrayList1.get(paramInt1)).booleanValue()) && (localBackStackRecord1.mIndex >= 0))
        {
          freeBackStackIndex(localBackStackRecord1.mIndex);
          localBackStackRecord1.mIndex = -1;
        }
        localBackStackRecord1.runOnCommitRunnables();
        paramInt1++;
      }
      if (j != 0) {
        reportBackStackChanged();
      }
      return;
      k = paramInt2;
    }
  }
  
  private void executePostponedTransaction(ArrayList<BackStackRecord> paramArrayList, ArrayList<Boolean> paramArrayList1)
  {
    int i;
    int j;
    int k;
    label15:
    StartEnterTransitionListener localStartEnterTransitionListener;
    int m;
    int n;
    if (this.mPostponedTransactions == null)
    {
      i = 0;
      j = 0;
      k = i;
      if (j >= k) {
        return;
      }
      localStartEnterTransitionListener = (StartEnterTransitionListener)this.mPostponedTransactions.get(j);
      if ((paramArrayList == null) || (localStartEnterTransitionListener.mIsBack)) {
        break label117;
      }
      int i2 = paramArrayList.indexOf(localStartEnterTransitionListener.mRecord);
      if ((i2 == -1) || (!((Boolean)paramArrayList1.get(i2)).booleanValue())) {
        break label117;
      }
      localStartEnterTransitionListener.cancelTransaction();
      m = j;
      n = k;
    }
    for (;;)
    {
      j = m + 1;
      k = n;
      break label15;
      i = this.mPostponedTransactions.size();
      break;
      label117:
      if ((localStartEnterTransitionListener.isReady()) || ((paramArrayList != null) && (localStartEnterTransitionListener.mRecord.interactsWith(paramArrayList, 0, paramArrayList.size()))))
      {
        this.mPostponedTransactions.remove(j);
        j--;
        k--;
        if ((paramArrayList != null) && (!localStartEnterTransitionListener.mIsBack))
        {
          int i1 = paramArrayList.indexOf(localStartEnterTransitionListener.mRecord);
          if ((i1 != -1) && (((Boolean)paramArrayList1.get(i1)).booleanValue()))
          {
            localStartEnterTransitionListener.cancelTransaction();
            m = j;
            n = k;
            continue;
          }
        }
        localStartEnterTransitionListener.completeTransaction();
      }
      else
      {
        m = j;
        n = k;
      }
    }
  }
  
  private Fragment findFragmentUnder(Fragment paramFragment)
  {
    ViewGroup localViewGroup = paramFragment.mContainer;
    View localView = paramFragment.mView;
    Fragment localFragment;
    if ((localViewGroup == null) || (localView == null))
    {
      localFragment = null;
      return localFragment;
    }
    for (int i = -1 + this.mAdded.indexOf(paramFragment);; i--)
    {
      if (i < 0) {
        break label78;
      }
      localFragment = (Fragment)this.mAdded.get(i);
      if ((localFragment.mContainer == localViewGroup) && (localFragment.mView != null)) {
        break;
      }
    }
    label78:
    return null;
  }
  
  private void forcePostponedTransactions()
  {
    if (this.mPostponedTransactions != null) {
      while (!this.mPostponedTransactions.isEmpty()) {
        ((StartEnterTransitionListener)this.mPostponedTransactions.remove(0)).completeTransaction();
      }
    }
  }
  
  private boolean generateOpsForPendingActions(ArrayList<BackStackRecord> paramArrayList, ArrayList<Boolean> paramArrayList1)
  {
    try
    {
      if ((this.mPendingActions == null) || (this.mPendingActions.size() == 0)) {
        return false;
      }
      int i = this.mPendingActions.size();
      int j = 0;
      boolean bool = false;
      while (j < i)
      {
        bool |= ((OpGenerator)this.mPendingActions.get(j)).generateOps(paramArrayList, paramArrayList1);
        j++;
      }
      this.mPendingActions.clear();
      this.mHost.getHandler().removeCallbacks(this.mExecCommit);
      return bool;
    }
    finally {}
  }
  
  private static Animation.AnimationListener getAnimationListener(Animation paramAnimation)
  {
    try
    {
      if (sAnimationListenerField == null)
      {
        sAnimationListenerField = Animation.class.getDeclaredField("mListener");
        sAnimationListenerField.setAccessible(true);
      }
      Animation.AnimationListener localAnimationListener = (Animation.AnimationListener)sAnimationListenerField.get(paramAnimation);
      return localAnimationListener;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      Log.e("FragmentManager", "No field with the name mListener is found in Animation class", localNoSuchFieldException);
      return null;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      Log.e("FragmentManager", "Cannot access Animation's mListener field", localIllegalAccessException);
    }
    return null;
  }
  
  static AnimationOrAnimator makeFadeAnimation(Context paramContext, float paramFloat1, float paramFloat2)
  {
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(paramFloat1, paramFloat2);
    localAlphaAnimation.setInterpolator(DECELERATE_CUBIC);
    localAlphaAnimation.setDuration(220L);
    return new AnimationOrAnimator(localAlphaAnimation, null);
  }
  
  static AnimationOrAnimator makeOpenCloseAnimation(Context paramContext, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    AnimationSet localAnimationSet = new AnimationSet(false);
    ScaleAnimation localScaleAnimation = new ScaleAnimation(paramFloat1, paramFloat2, paramFloat1, paramFloat2, 1, 0.5F, 1, 0.5F);
    localScaleAnimation.setInterpolator(DECELERATE_QUINT);
    localScaleAnimation.setDuration(220L);
    localAnimationSet.addAnimation(localScaleAnimation);
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(paramFloat3, paramFloat4);
    localAlphaAnimation.setInterpolator(DECELERATE_CUBIC);
    localAlphaAnimation.setDuration(220L);
    localAnimationSet.addAnimation(localAlphaAnimation);
    return new AnimationOrAnimator(localAnimationSet, null);
  }
  
  private void makeRemovedFragmentsInvisible(b<Fragment> paramb)
  {
    int i = paramb.size();
    for (int j = 0; j < i; j++)
    {
      Fragment localFragment = (Fragment)paramb.b(j);
      if (!localFragment.mAdded)
      {
        View localView = localFragment.getView();
        localFragment.mPostponedAlpha = localView.getAlpha();
        localView.setAlpha(0.0F);
      }
    }
  }
  
  static boolean modifiesAlpha(Animator paramAnimator)
  {
    if (paramAnimator == null) {}
    for (;;)
    {
      return false;
      if ((paramAnimator instanceof ValueAnimator))
      {
        PropertyValuesHolder[] arrayOfPropertyValuesHolder = ((ValueAnimator)paramAnimator).getValues();
        for (int j = 0; j < arrayOfPropertyValuesHolder.length; j++) {
          if ("alpha".equals(arrayOfPropertyValuesHolder[j].getPropertyName())) {
            return true;
          }
        }
      }
      else if ((paramAnimator instanceof AnimatorSet))
      {
        ArrayList localArrayList = ((AnimatorSet)paramAnimator).getChildAnimations();
        for (int i = 0; i < localArrayList.size(); i++) {
          if (modifiesAlpha((Animator)localArrayList.get(i))) {
            return true;
          }
        }
      }
    }
  }
  
  static boolean modifiesAlpha(AnimationOrAnimator paramAnimationOrAnimator)
  {
    boolean bool;
    if ((paramAnimationOrAnimator.animation instanceof AlphaAnimation))
    {
      bool = true;
      return bool;
    }
    if ((paramAnimationOrAnimator.animation instanceof AnimationSet))
    {
      List localList = ((AnimationSet)paramAnimationOrAnimator.animation).getAnimations();
      for (int i = 0;; i++)
      {
        int j = localList.size();
        bool = false;
        if (i >= j) {
          break;
        }
        if ((localList.get(i) instanceof AlphaAnimation)) {
          return true;
        }
      }
    }
    return modifiesAlpha(paramAnimationOrAnimator.animator);
  }
  
  private boolean popBackStackImmediate(String paramString, int paramInt1, int paramInt2)
  {
    execPendingActions();
    ensureExecReady(true);
    if ((this.mPrimaryNav != null) && (paramInt1 < 0) && (paramString == null))
    {
      FragmentManager localFragmentManager = this.mPrimaryNav.peekChildFragmentManager();
      if ((localFragmentManager != null) && (localFragmentManager.popBackStackImmediate())) {
        return true;
      }
    }
    boolean bool = popBackStackState(this.mTmpRecords, this.mTmpIsPop, paramString, paramInt1, paramInt2);
    if (bool) {
      this.mExecutingActions = true;
    }
    try
    {
      removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
      cleanupExec();
      doPendingDeferredStart();
      return bool;
    }
    finally
    {
      cleanupExec();
    }
  }
  
  private int postponePostponableTransactions(ArrayList<BackStackRecord> paramArrayList, ArrayList<Boolean> paramArrayList1, int paramInt1, int paramInt2, b<Fragment> paramb)
  {
    int i = paramInt2 - 1;
    int j = paramInt2;
    BackStackRecord localBackStackRecord;
    int k;
    label67:
    int n;
    if (i >= paramInt1)
    {
      localBackStackRecord = (BackStackRecord)paramArrayList.get(i);
      boolean bool = ((Boolean)paramArrayList1.get(i)).booleanValue();
      if ((localBackStackRecord.isPostponed()) && (!localBackStackRecord.interactsWith(paramArrayList, i + 1, paramInt2)))
      {
        k = 1;
        if (k == 0) {
          break label196;
        }
        if (this.mPostponedTransactions == null) {
          this.mPostponedTransactions = new ArrayList();
        }
        StartEnterTransitionListener localStartEnterTransitionListener = new StartEnterTransitionListener(localBackStackRecord, bool);
        this.mPostponedTransactions.add(localStartEnterTransitionListener);
        localBackStackRecord.setOnStartPostponedListener(localStartEnterTransitionListener);
        if (!bool) {
          break label184;
        }
        localBackStackRecord.executeOps();
        label130:
        n = j - 1;
        if (i != n)
        {
          paramArrayList.remove(i);
          paramArrayList.add(n, localBackStackRecord);
        }
        addAddedFragments(paramb);
      }
    }
    label184:
    label196:
    for (int m = n;; m = j)
    {
      i--;
      j = m;
      break;
      k = 0;
      break label67;
      localBackStackRecord.executePopOps(false);
      break label130;
      return j;
    }
  }
  
  private void removeRedundantOperationsAndExecute(ArrayList<BackStackRecord> paramArrayList, ArrayList<Boolean> paramArrayList1)
  {
    int i = 0;
    if ((paramArrayList == null) || (paramArrayList.isEmpty())) {
      return;
    }
    if ((paramArrayList1 == null) || (paramArrayList.size() != paramArrayList1.size())) {
      throw new IllegalStateException("Internal error with the back stack records");
    }
    executePostponedTransaction(paramArrayList, paramArrayList1);
    int j = paramArrayList.size();
    int k = 0;
    label55:
    int i2;
    if (i < j)
    {
      if (((BackStackRecord)paramArrayList.get(i)).mReorderingAllowed) {
        break label205;
      }
      if (k != i) {
        executeOpsTogether(paramArrayList, paramArrayList1, k, i);
      }
      int n = i + 1;
      if (((Boolean)paramArrayList1.get(i)).booleanValue()) {
        while ((n < j) && (((Boolean)paramArrayList1.get(n)).booleanValue()) && (!((BackStackRecord)paramArrayList.get(n)).mReorderingAllowed)) {
          n++;
        }
      }
      int i1 = n;
      executeOpsTogether(paramArrayList, paramArrayList1, i, i1);
      i2 = i1 - 1;
      k = i1;
    }
    label205:
    for (int m = i2;; m = i)
    {
      i = m + 1;
      break label55;
      if (k == j) {
        break;
      }
      executeOpsTogether(paramArrayList, paramArrayList1, k, j);
      return;
    }
  }
  
  public static int reverseTransit(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return 0;
    case 4097: 
      return 8194;
    case 8194: 
      return 4097;
    }
    return 4099;
  }
  
  private void scheduleCommit()
  {
    int i = 1;
    label44:
    label73:
    label92:
    label97:
    label100:
    for (;;)
    {
      int j;
      try
      {
        if ((this.mPostponedTransactions == null) || (this.mPostponedTransactions.isEmpty())) {
          break label92;
        }
        j = i;
        if ((this.mPendingActions == null) || (this.mPendingActions.size() != i)) {
          break label97;
        }
      }
      finally {}
      this.mHost.getHandler().removeCallbacks(this.mExecCommit);
      this.mHost.getHandler().post(this.mExecCommit);
      return;
      for (;;)
      {
        if (j != 0) {
          break label100;
        }
        if (i == 0) {
          break label73;
        }
        break label44;
        j = 0;
        break;
        i = 0;
      }
    }
  }
  
  private static void setHWLayerAnimListenerIfAlpha(View paramView, AnimationOrAnimator paramAnimationOrAnimator)
  {
    if ((paramView == null) || (paramAnimationOrAnimator == null)) {}
    while (!shouldRunOnHWLayer(paramView, paramAnimationOrAnimator)) {
      return;
    }
    if (paramAnimationOrAnimator.animator != null)
    {
      paramAnimationOrAnimator.animator.addListener(new AnimatorOnHWLayerIfNeededListener(paramView));
      return;
    }
    Animation.AnimationListener localAnimationListener = getAnimationListener(paramAnimationOrAnimator.animation);
    paramView.setLayerType(2, null);
    paramAnimationOrAnimator.animation.setAnimationListener(new AnimateOnHWLayerIfNeededListener(paramView, localAnimationListener));
  }
  
  private static void setRetaining(FragmentManagerNonConfig paramFragmentManagerNonConfig)
  {
    if (paramFragmentManagerNonConfig == null) {}
    for (;;)
    {
      return;
      List localList1 = paramFragmentManagerNonConfig.getFragments();
      if (localList1 != null)
      {
        Iterator localIterator2 = localList1.iterator();
        while (localIterator2.hasNext()) {
          ((Fragment)localIterator2.next()).mRetaining = true;
        }
      }
      List localList2 = paramFragmentManagerNonConfig.getChildNonConfigs();
      if (localList2 != null)
      {
        Iterator localIterator1 = localList2.iterator();
        while (localIterator1.hasNext()) {
          setRetaining((FragmentManagerNonConfig)localIterator1.next());
        }
      }
    }
  }
  
  static boolean shouldRunOnHWLayer(View paramView, AnimationOrAnimator paramAnimationOrAnimator)
  {
    if ((paramView == null) || (paramAnimationOrAnimator == null)) {}
    while ((Build.VERSION.SDK_INT < 19) || (paramView.getLayerType() != 0) || (!s.r(paramView)) || (!modifiesAlpha(paramAnimationOrAnimator))) {
      return false;
    }
    return true;
  }
  
  private void throwException(RuntimeException paramRuntimeException)
  {
    Log.e("FragmentManager", paramRuntimeException.getMessage());
    Log.e("FragmentManager", "Activity state:");
    PrintWriter localPrintWriter = new PrintWriter(new e("FragmentManager"));
    if (this.mHost != null) {}
    for (;;)
    {
      try
      {
        this.mHost.onDump("  ", null, localPrintWriter, new String[0]);
        throw paramRuntimeException;
      }
      catch (Exception localException2)
      {
        Log.e("FragmentManager", "Failed dumping state", localException2);
        continue;
      }
      try
      {
        dump("  ", null, localPrintWriter, new String[0]);
      }
      catch (Exception localException1)
      {
        Log.e("FragmentManager", "Failed dumping state", localException1);
      }
    }
  }
  
  public static int transitToStyleIndex(int paramInt, boolean paramBoolean)
  {
    switch (paramInt)
    {
    default: 
      return -1;
    case 4097: 
      if (paramBoolean) {
        return 1;
      }
      return 2;
    case 8194: 
      if (paramBoolean) {
        return 3;
      }
      return 4;
    }
    if (paramBoolean) {
      return 5;
    }
    return 6;
  }
  
  void addBackStackState(BackStackRecord paramBackStackRecord)
  {
    if (this.mBackStack == null) {
      this.mBackStack = new ArrayList();
    }
    this.mBackStack.add(paramBackStackRecord);
  }
  
  public void addFragment(Fragment paramFragment, boolean paramBoolean)
  {
    if (DEBUG) {
      Log.v("FragmentManager", "add: " + paramFragment);
    }
    makeActive(paramFragment);
    if (!paramFragment.mDetached) {
      if (this.mAdded.contains(paramFragment)) {
        throw new IllegalStateException("Fragment already added: " + paramFragment);
      }
    }
    synchronized (this.mAdded)
    {
      this.mAdded.add(paramFragment);
      paramFragment.mAdded = true;
      paramFragment.mRemoving = false;
      if (paramFragment.mView == null) {
        paramFragment.mHiddenChanged = false;
      }
      if ((paramFragment.mHasMenu) && (paramFragment.mMenuVisible)) {
        this.mNeedMenuInvalidate = true;
      }
      if (paramBoolean) {
        moveToState(paramFragment);
      }
      return;
    }
  }
  
  public void addOnBackStackChangedListener(FragmentManager.OnBackStackChangedListener paramOnBackStackChangedListener)
  {
    if (this.mBackStackChangeListeners == null) {
      this.mBackStackChangeListeners = new ArrayList();
    }
    this.mBackStackChangeListeners.add(paramOnBackStackChangedListener);
  }
  
  public int allocBackStackIndex(BackStackRecord paramBackStackRecord)
  {
    try
    {
      if ((this.mAvailBackStackIndices == null) || (this.mAvailBackStackIndices.size() <= 0))
      {
        if (this.mBackStackIndices == null) {
          this.mBackStackIndices = new ArrayList();
        }
        int i = this.mBackStackIndices.size();
        if (DEBUG) {
          Log.v("FragmentManager", "Setting back stack index " + i + " to " + paramBackStackRecord);
        }
        this.mBackStackIndices.add(paramBackStackRecord);
        return i;
      }
      int j = ((Integer)this.mAvailBackStackIndices.remove(-1 + this.mAvailBackStackIndices.size())).intValue();
      if (DEBUG) {
        Log.v("FragmentManager", "Adding back stack index " + j + " with " + paramBackStackRecord);
      }
      this.mBackStackIndices.set(j, paramBackStackRecord);
      return j;
    }
    finally {}
  }
  
  public void attachController(FragmentHostCallback paramFragmentHostCallback, FragmentContainer paramFragmentContainer, Fragment paramFragment)
  {
    if (this.mHost != null) {
      throw new IllegalStateException("Already attached");
    }
    this.mHost = paramFragmentHostCallback;
    this.mContainer = paramFragmentContainer;
    this.mParent = paramFragment;
  }
  
  public void attachFragment(Fragment paramFragment)
  {
    if (DEBUG) {
      Log.v("FragmentManager", "attach: " + paramFragment);
    }
    if (paramFragment.mDetached)
    {
      paramFragment.mDetached = false;
      if (!paramFragment.mAdded)
      {
        if (this.mAdded.contains(paramFragment)) {
          throw new IllegalStateException("Fragment already added: " + paramFragment);
        }
        if (DEBUG) {
          Log.v("FragmentManager", "add from attach: " + paramFragment);
        }
      }
    }
    synchronized (this.mAdded)
    {
      this.mAdded.add(paramFragment);
      paramFragment.mAdded = true;
      if ((paramFragment.mHasMenu) && (paramFragment.mMenuVisible)) {
        this.mNeedMenuInvalidate = true;
      }
      return;
    }
  }
  
  public FragmentTransaction beginTransaction()
  {
    return new BackStackRecord(this);
  }
  
  void completeShowHideFragment(final Fragment paramFragment)
  {
    boolean bool;
    AnimationOrAnimator localAnimationOrAnimator;
    if (paramFragment.mView != null)
    {
      int i = paramFragment.getNextTransition();
      if (paramFragment.mHidden) {
        break label135;
      }
      bool = true;
      localAnimationOrAnimator = loadAnimation(paramFragment, i, bool, paramFragment.getNextTransitionStyle());
      if ((localAnimationOrAnimator == null) || (localAnimationOrAnimator.animator == null)) {
        break label194;
      }
      localAnimationOrAnimator.animator.setTarget(paramFragment.mView);
      if (!paramFragment.mHidden) {
        break label183;
      }
      if (!paramFragment.isHideReplaced()) {
        break label140;
      }
      paramFragment.setHideReplaced(false);
    }
    for (;;)
    {
      setHWLayerAnimListenerIfAlpha(paramFragment.mView, localAnimationOrAnimator);
      localAnimationOrAnimator.animator.start();
      if ((paramFragment.mAdded) && (paramFragment.mHasMenu) && (paramFragment.mMenuVisible)) {
        this.mNeedMenuInvalidate = true;
      }
      paramFragment.mHiddenChanged = false;
      paramFragment.onHiddenChanged(paramFragment.mHidden);
      return;
      label135:
      bool = false;
      break;
      label140:
      final ViewGroup localViewGroup = paramFragment.mContainer;
      final View localView = paramFragment.mView;
      localViewGroup.startViewTransition(localView);
      localAnimationOrAnimator.animator.addListener(new AnimatorListenerAdapter()
      {
        public void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          localViewGroup.endViewTransition(localView);
          paramAnonymousAnimator.removeListener(this);
          if (paramFragment.mView != null) {
            paramFragment.mView.setVisibility(8);
          }
        }
      });
      continue;
      label183:
      paramFragment.mView.setVisibility(0);
    }
    label194:
    if (localAnimationOrAnimator != null)
    {
      setHWLayerAnimListenerIfAlpha(paramFragment.mView, localAnimationOrAnimator);
      paramFragment.mView.startAnimation(localAnimationOrAnimator.animation);
      localAnimationOrAnimator.animation.start();
    }
    if ((paramFragment.mHidden) && (!paramFragment.isHideReplaced())) {}
    for (int j = 8;; j = 0)
    {
      paramFragment.mView.setVisibility(j);
      if (!paramFragment.isHideReplaced()) {
        break;
      }
      paramFragment.setHideReplaced(false);
      break;
    }
  }
  
  public void detachFragment(Fragment paramFragment)
  {
    if (DEBUG) {
      Log.v("FragmentManager", "detach: " + paramFragment);
    }
    if (!paramFragment.mDetached)
    {
      paramFragment.mDetached = true;
      if (paramFragment.mAdded) {
        if (DEBUG) {
          Log.v("FragmentManager", "remove from detach: " + paramFragment);
        }
      }
    }
    synchronized (this.mAdded)
    {
      this.mAdded.remove(paramFragment);
      if ((paramFragment.mHasMenu) && (paramFragment.mMenuVisible)) {
        this.mNeedMenuInvalidate = true;
      }
      paramFragment.mAdded = false;
      return;
    }
  }
  
  public void dispatchActivityCreated()
  {
    this.mStateSaved = false;
    this.mStopped = false;
    dispatchStateChange(2);
  }
  
  public void dispatchConfigurationChanged(Configuration paramConfiguration)
  {
    for (int i = 0; i < this.mAdded.size(); i++)
    {
      Fragment localFragment = (Fragment)this.mAdded.get(i);
      if (localFragment != null) {
        localFragment.performConfigurationChanged(paramConfiguration);
      }
    }
  }
  
  public boolean dispatchContextItemSelected(MenuItem paramMenuItem)
  {
    if (this.mCurState < 1) {}
    for (;;)
    {
      return false;
      for (int i = 0; i < this.mAdded.size(); i++)
      {
        Fragment localFragment = (Fragment)this.mAdded.get(i);
        if ((localFragment != null) && (localFragment.performContextItemSelected(paramMenuItem))) {
          return true;
        }
      }
    }
  }
  
  public void dispatchCreate()
  {
    this.mStateSaved = false;
    this.mStopped = false;
    dispatchStateChange(1);
  }
  
  public boolean dispatchCreateOptionsMenu(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    if (this.mCurState < 1) {
      return false;
    }
    ArrayList localArrayList1 = null;
    int i = 0;
    boolean bool1 = false;
    if (i < this.mAdded.size())
    {
      Fragment localFragment2 = (Fragment)this.mAdded.get(i);
      if ((localFragment2 == null) || (!localFragment2.performCreateOptionsMenu(paramMenu, paramMenuInflater))) {
        break label163;
      }
      if (localArrayList1 == null) {
        localArrayList1 = new ArrayList();
      }
      localArrayList1.add(localFragment2);
    }
    label163:
    for (boolean bool2 = true;; bool2 = bool1)
    {
      i++;
      bool1 = bool2;
      break;
      ArrayList localArrayList2 = this.mCreatedMenus;
      int j = 0;
      if (localArrayList2 != null) {
        while (j < this.mCreatedMenus.size())
        {
          Fragment localFragment1 = (Fragment)this.mCreatedMenus.get(j);
          if ((localArrayList1 == null) || (!localArrayList1.contains(localFragment1))) {
            localFragment1.onDestroyOptionsMenu();
          }
          j++;
        }
      }
      this.mCreatedMenus = localArrayList1;
      return bool1;
    }
  }
  
  public void dispatchDestroy()
  {
    this.mDestroyed = true;
    execPendingActions();
    dispatchStateChange(0);
    this.mHost = null;
    this.mContainer = null;
    this.mParent = null;
  }
  
  public void dispatchDestroyView()
  {
    dispatchStateChange(1);
  }
  
  public void dispatchLowMemory()
  {
    for (int i = 0; i < this.mAdded.size(); i++)
    {
      Fragment localFragment = (Fragment)this.mAdded.get(i);
      if (localFragment != null) {
        localFragment.performLowMemory();
      }
    }
  }
  
  public void dispatchMultiWindowModeChanged(boolean paramBoolean)
  {
    for (int i = -1 + this.mAdded.size(); i >= 0; i--)
    {
      Fragment localFragment = (Fragment)this.mAdded.get(i);
      if (localFragment != null) {
        localFragment.performMultiWindowModeChanged(paramBoolean);
      }
    }
  }
  
  void dispatchOnFragmentActivityCreated(Fragment paramFragment, Bundle paramBundle, boolean paramBoolean)
  {
    if (this.mParent != null)
    {
      FragmentManager localFragmentManager = this.mParent.getFragmentManager();
      if ((localFragmentManager instanceof FragmentManagerImpl)) {
        ((FragmentManagerImpl)localFragmentManager).dispatchOnFragmentActivityCreated(paramFragment, paramBundle, true);
      }
    }
    Iterator localIterator = this.mLifecycleCallbacks.iterator();
    while (localIterator.hasNext())
    {
      j localj = (j)localIterator.next();
      if ((!paramBoolean) || (((Boolean)localj.b).booleanValue())) {
        ((FragmentManager.FragmentLifecycleCallbacks)localj.a).onFragmentActivityCreated(this, paramFragment, paramBundle);
      }
    }
  }
  
  void dispatchOnFragmentAttached(Fragment paramFragment, Context paramContext, boolean paramBoolean)
  {
    if (this.mParent != null)
    {
      FragmentManager localFragmentManager = this.mParent.getFragmentManager();
      if ((localFragmentManager instanceof FragmentManagerImpl)) {
        ((FragmentManagerImpl)localFragmentManager).dispatchOnFragmentAttached(paramFragment, paramContext, true);
      }
    }
    Iterator localIterator = this.mLifecycleCallbacks.iterator();
    while (localIterator.hasNext())
    {
      j localj = (j)localIterator.next();
      if ((!paramBoolean) || (((Boolean)localj.b).booleanValue())) {
        ((FragmentManager.FragmentLifecycleCallbacks)localj.a).onFragmentAttached(this, paramFragment, paramContext);
      }
    }
  }
  
  void dispatchOnFragmentCreated(Fragment paramFragment, Bundle paramBundle, boolean paramBoolean)
  {
    if (this.mParent != null)
    {
      FragmentManager localFragmentManager = this.mParent.getFragmentManager();
      if ((localFragmentManager instanceof FragmentManagerImpl)) {
        ((FragmentManagerImpl)localFragmentManager).dispatchOnFragmentCreated(paramFragment, paramBundle, true);
      }
    }
    Iterator localIterator = this.mLifecycleCallbacks.iterator();
    while (localIterator.hasNext())
    {
      j localj = (j)localIterator.next();
      if ((!paramBoolean) || (((Boolean)localj.b).booleanValue())) {
        ((FragmentManager.FragmentLifecycleCallbacks)localj.a).onFragmentCreated(this, paramFragment, paramBundle);
      }
    }
  }
  
  void dispatchOnFragmentDestroyed(Fragment paramFragment, boolean paramBoolean)
  {
    if (this.mParent != null)
    {
      FragmentManager localFragmentManager = this.mParent.getFragmentManager();
      if ((localFragmentManager instanceof FragmentManagerImpl)) {
        ((FragmentManagerImpl)localFragmentManager).dispatchOnFragmentDestroyed(paramFragment, true);
      }
    }
    Iterator localIterator = this.mLifecycleCallbacks.iterator();
    while (localIterator.hasNext())
    {
      j localj = (j)localIterator.next();
      if ((!paramBoolean) || (((Boolean)localj.b).booleanValue())) {
        ((FragmentManager.FragmentLifecycleCallbacks)localj.a).onFragmentDestroyed(this, paramFragment);
      }
    }
  }
  
  void dispatchOnFragmentDetached(Fragment paramFragment, boolean paramBoolean)
  {
    if (this.mParent != null)
    {
      FragmentManager localFragmentManager = this.mParent.getFragmentManager();
      if ((localFragmentManager instanceof FragmentManagerImpl)) {
        ((FragmentManagerImpl)localFragmentManager).dispatchOnFragmentDetached(paramFragment, true);
      }
    }
    Iterator localIterator = this.mLifecycleCallbacks.iterator();
    while (localIterator.hasNext())
    {
      j localj = (j)localIterator.next();
      if ((!paramBoolean) || (((Boolean)localj.b).booleanValue())) {
        ((FragmentManager.FragmentLifecycleCallbacks)localj.a).onFragmentDetached(this, paramFragment);
      }
    }
  }
  
  void dispatchOnFragmentPaused(Fragment paramFragment, boolean paramBoolean)
  {
    if (this.mParent != null)
    {
      FragmentManager localFragmentManager = this.mParent.getFragmentManager();
      if ((localFragmentManager instanceof FragmentManagerImpl)) {
        ((FragmentManagerImpl)localFragmentManager).dispatchOnFragmentPaused(paramFragment, true);
      }
    }
    Iterator localIterator = this.mLifecycleCallbacks.iterator();
    while (localIterator.hasNext())
    {
      j localj = (j)localIterator.next();
      if ((!paramBoolean) || (((Boolean)localj.b).booleanValue())) {
        ((FragmentManager.FragmentLifecycleCallbacks)localj.a).onFragmentPaused(this, paramFragment);
      }
    }
  }
  
  void dispatchOnFragmentPreAttached(Fragment paramFragment, Context paramContext, boolean paramBoolean)
  {
    if (this.mParent != null)
    {
      FragmentManager localFragmentManager = this.mParent.getFragmentManager();
      if ((localFragmentManager instanceof FragmentManagerImpl)) {
        ((FragmentManagerImpl)localFragmentManager).dispatchOnFragmentPreAttached(paramFragment, paramContext, true);
      }
    }
    Iterator localIterator = this.mLifecycleCallbacks.iterator();
    while (localIterator.hasNext())
    {
      j localj = (j)localIterator.next();
      if ((!paramBoolean) || (((Boolean)localj.b).booleanValue())) {
        ((FragmentManager.FragmentLifecycleCallbacks)localj.a).onFragmentPreAttached(this, paramFragment, paramContext);
      }
    }
  }
  
  void dispatchOnFragmentPreCreated(Fragment paramFragment, Bundle paramBundle, boolean paramBoolean)
  {
    if (this.mParent != null)
    {
      FragmentManager localFragmentManager = this.mParent.getFragmentManager();
      if ((localFragmentManager instanceof FragmentManagerImpl)) {
        ((FragmentManagerImpl)localFragmentManager).dispatchOnFragmentPreCreated(paramFragment, paramBundle, true);
      }
    }
    Iterator localIterator = this.mLifecycleCallbacks.iterator();
    while (localIterator.hasNext())
    {
      j localj = (j)localIterator.next();
      if ((!paramBoolean) || (((Boolean)localj.b).booleanValue())) {
        ((FragmentManager.FragmentLifecycleCallbacks)localj.a).onFragmentPreCreated(this, paramFragment, paramBundle);
      }
    }
  }
  
  void dispatchOnFragmentResumed(Fragment paramFragment, boolean paramBoolean)
  {
    if (this.mParent != null)
    {
      FragmentManager localFragmentManager = this.mParent.getFragmentManager();
      if ((localFragmentManager instanceof FragmentManagerImpl)) {
        ((FragmentManagerImpl)localFragmentManager).dispatchOnFragmentResumed(paramFragment, true);
      }
    }
    Iterator localIterator = this.mLifecycleCallbacks.iterator();
    while (localIterator.hasNext())
    {
      j localj = (j)localIterator.next();
      if ((!paramBoolean) || (((Boolean)localj.b).booleanValue())) {
        ((FragmentManager.FragmentLifecycleCallbacks)localj.a).onFragmentResumed(this, paramFragment);
      }
    }
  }
  
  void dispatchOnFragmentSaveInstanceState(Fragment paramFragment, Bundle paramBundle, boolean paramBoolean)
  {
    if (this.mParent != null)
    {
      FragmentManager localFragmentManager = this.mParent.getFragmentManager();
      if ((localFragmentManager instanceof FragmentManagerImpl)) {
        ((FragmentManagerImpl)localFragmentManager).dispatchOnFragmentSaveInstanceState(paramFragment, paramBundle, true);
      }
    }
    Iterator localIterator = this.mLifecycleCallbacks.iterator();
    while (localIterator.hasNext())
    {
      j localj = (j)localIterator.next();
      if ((!paramBoolean) || (((Boolean)localj.b).booleanValue())) {
        ((FragmentManager.FragmentLifecycleCallbacks)localj.a).onFragmentSaveInstanceState(this, paramFragment, paramBundle);
      }
    }
  }
  
  void dispatchOnFragmentStarted(Fragment paramFragment, boolean paramBoolean)
  {
    if (this.mParent != null)
    {
      FragmentManager localFragmentManager = this.mParent.getFragmentManager();
      if ((localFragmentManager instanceof FragmentManagerImpl)) {
        ((FragmentManagerImpl)localFragmentManager).dispatchOnFragmentStarted(paramFragment, true);
      }
    }
    Iterator localIterator = this.mLifecycleCallbacks.iterator();
    while (localIterator.hasNext())
    {
      j localj = (j)localIterator.next();
      if ((!paramBoolean) || (((Boolean)localj.b).booleanValue())) {
        ((FragmentManager.FragmentLifecycleCallbacks)localj.a).onFragmentStarted(this, paramFragment);
      }
    }
  }
  
  void dispatchOnFragmentStopped(Fragment paramFragment, boolean paramBoolean)
  {
    if (this.mParent != null)
    {
      FragmentManager localFragmentManager = this.mParent.getFragmentManager();
      if ((localFragmentManager instanceof FragmentManagerImpl)) {
        ((FragmentManagerImpl)localFragmentManager).dispatchOnFragmentStopped(paramFragment, true);
      }
    }
    Iterator localIterator = this.mLifecycleCallbacks.iterator();
    while (localIterator.hasNext())
    {
      j localj = (j)localIterator.next();
      if ((!paramBoolean) || (((Boolean)localj.b).booleanValue())) {
        ((FragmentManager.FragmentLifecycleCallbacks)localj.a).onFragmentStopped(this, paramFragment);
      }
    }
  }
  
  void dispatchOnFragmentViewCreated(Fragment paramFragment, View paramView, Bundle paramBundle, boolean paramBoolean)
  {
    if (this.mParent != null)
    {
      FragmentManager localFragmentManager = this.mParent.getFragmentManager();
      if ((localFragmentManager instanceof FragmentManagerImpl)) {
        ((FragmentManagerImpl)localFragmentManager).dispatchOnFragmentViewCreated(paramFragment, paramView, paramBundle, true);
      }
    }
    Iterator localIterator = this.mLifecycleCallbacks.iterator();
    while (localIterator.hasNext())
    {
      j localj = (j)localIterator.next();
      if ((!paramBoolean) || (((Boolean)localj.b).booleanValue())) {
        ((FragmentManager.FragmentLifecycleCallbacks)localj.a).onFragmentViewCreated(this, paramFragment, paramView, paramBundle);
      }
    }
  }
  
  void dispatchOnFragmentViewDestroyed(Fragment paramFragment, boolean paramBoolean)
  {
    if (this.mParent != null)
    {
      FragmentManager localFragmentManager = this.mParent.getFragmentManager();
      if ((localFragmentManager instanceof FragmentManagerImpl)) {
        ((FragmentManagerImpl)localFragmentManager).dispatchOnFragmentViewDestroyed(paramFragment, true);
      }
    }
    Iterator localIterator = this.mLifecycleCallbacks.iterator();
    while (localIterator.hasNext())
    {
      j localj = (j)localIterator.next();
      if ((!paramBoolean) || (((Boolean)localj.b).booleanValue())) {
        ((FragmentManager.FragmentLifecycleCallbacks)localj.a).onFragmentViewDestroyed(this, paramFragment);
      }
    }
  }
  
  public boolean dispatchOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (this.mCurState < 1) {}
    for (;;)
    {
      return false;
      for (int i = 0; i < this.mAdded.size(); i++)
      {
        Fragment localFragment = (Fragment)this.mAdded.get(i);
        if ((localFragment != null) && (localFragment.performOptionsItemSelected(paramMenuItem))) {
          return true;
        }
      }
    }
  }
  
  public void dispatchOptionsMenuClosed(Menu paramMenu)
  {
    if (this.mCurState < 1) {}
    for (;;)
    {
      return;
      for (int i = 0; i < this.mAdded.size(); i++)
      {
        Fragment localFragment = (Fragment)this.mAdded.get(i);
        if (localFragment != null) {
          localFragment.performOptionsMenuClosed(paramMenu);
        }
      }
    }
  }
  
  public void dispatchPause()
  {
    dispatchStateChange(4);
  }
  
  public void dispatchPictureInPictureModeChanged(boolean paramBoolean)
  {
    for (int i = -1 + this.mAdded.size(); i >= 0; i--)
    {
      Fragment localFragment = (Fragment)this.mAdded.get(i);
      if (localFragment != null) {
        localFragment.performPictureInPictureModeChanged(paramBoolean);
      }
    }
  }
  
  public boolean dispatchPrepareOptionsMenu(Menu paramMenu)
  {
    if (this.mCurState < 1) {
      return false;
    }
    int i = 0;
    boolean bool = false;
    while (i < this.mAdded.size())
    {
      Fragment localFragment = (Fragment)this.mAdded.get(i);
      if ((localFragment != null) && (localFragment.performPrepareOptionsMenu(paramMenu))) {
        bool = true;
      }
      i++;
    }
    return bool;
  }
  
  public void dispatchReallyStop()
  {
    dispatchStateChange(2);
  }
  
  public void dispatchResume()
  {
    this.mStateSaved = false;
    this.mStopped = false;
    dispatchStateChange(5);
  }
  
  public void dispatchStart()
  {
    this.mStateSaved = false;
    this.mStopped = false;
    dispatchStateChange(4);
  }
  
  public void dispatchStop()
  {
    this.mStopped = true;
    dispatchStateChange(3);
  }
  
  void doPendingDeferredStart()
  {
    if (this.mHavePendingDeferredStart)
    {
      this.mHavePendingDeferredStart = false;
      startPendingDeferredFragments();
    }
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    int i = 0;
    String str = paramString + "    ";
    if (this.mActive != null)
    {
      int i6 = this.mActive.size();
      if (i6 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("Active Fragments in ");
        paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this)));
        paramPrintWriter.println(":");
        for (int i7 = 0; i7 < i6; i7++)
        {
          Fragment localFragment3 = (Fragment)this.mActive.valueAt(i7);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i7);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(localFragment3);
          if (localFragment3 != null) {
            localFragment3.dump(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
          }
        }
      }
    }
    int j = this.mAdded.size();
    if (j > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Added Fragments:");
      for (int i5 = 0; i5 < j; i5++)
      {
        Fragment localFragment2 = (Fragment)this.mAdded.get(i5);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(i5);
        paramPrintWriter.print(": ");
        paramPrintWriter.println(localFragment2.toString());
      }
    }
    if (this.mCreatedMenus != null)
    {
      int i3 = this.mCreatedMenus.size();
      if (i3 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Fragments Created Menus:");
        for (int i4 = 0; i4 < i3; i4++)
        {
          Fragment localFragment1 = (Fragment)this.mCreatedMenus.get(i4);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i4);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(localFragment1.toString());
        }
      }
    }
    if (this.mBackStack != null)
    {
      int i1 = this.mBackStack.size();
      if (i1 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Back Stack:");
        for (int i2 = 0; i2 < i1; i2++)
        {
          BackStackRecord localBackStackRecord2 = (BackStackRecord)this.mBackStack.get(i2);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i2);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(localBackStackRecord2.toString());
          localBackStackRecord2.dump(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
        }
      }
    }
    try
    {
      if (this.mBackStackIndices != null)
      {
        int m = this.mBackStackIndices.size();
        if (m > 0)
        {
          paramPrintWriter.print(paramString);
          paramPrintWriter.println("Back Stack Indices:");
          for (int n = 0; n < m; n++)
          {
            BackStackRecord localBackStackRecord1 = (BackStackRecord)this.mBackStackIndices.get(n);
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("  #");
            paramPrintWriter.print(n);
            paramPrintWriter.print(": ");
            paramPrintWriter.println(localBackStackRecord1);
          }
        }
      }
      if ((this.mAvailBackStackIndices != null) && (this.mAvailBackStackIndices.size() > 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mAvailBackStackIndices: ");
        paramPrintWriter.println(Arrays.toString(this.mAvailBackStackIndices.toArray()));
      }
      if (this.mPendingActions != null)
      {
        int k = this.mPendingActions.size();
        if (k > 0)
        {
          paramPrintWriter.print(paramString);
          paramPrintWriter.println("Pending Actions:");
          while (i < k)
          {
            OpGenerator localOpGenerator = (OpGenerator)this.mPendingActions.get(i);
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("  #");
            paramPrintWriter.print(i);
            paramPrintWriter.print(": ");
            paramPrintWriter.println(localOpGenerator);
            i++;
          }
        }
      }
      paramPrintWriter.print(paramString);
    }
    finally {}
    paramPrintWriter.println("FragmentManager misc state:");
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mHost=");
    paramPrintWriter.println(this.mHost);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mContainer=");
    paramPrintWriter.println(this.mContainer);
    if (this.mParent != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mParent=");
      paramPrintWriter.println(this.mParent);
    }
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mCurState=");
    paramPrintWriter.print(this.mCurState);
    paramPrintWriter.print(" mStateSaved=");
    paramPrintWriter.print(this.mStateSaved);
    paramPrintWriter.print(" mStopped=");
    paramPrintWriter.print(this.mStopped);
    paramPrintWriter.print(" mDestroyed=");
    paramPrintWriter.println(this.mDestroyed);
    if (this.mNeedMenuInvalidate)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mNeedMenuInvalidate=");
      paramPrintWriter.println(this.mNeedMenuInvalidate);
    }
    if (this.mNoTransactionsBecause != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mNoTransactionsBecause=");
      paramPrintWriter.println(this.mNoTransactionsBecause);
    }
  }
  
  public void enqueueAction(OpGenerator paramOpGenerator, boolean paramBoolean)
  {
    if (!paramBoolean) {
      checkStateLoss();
    }
    try
    {
      if ((this.mDestroyed) || (this.mHost == null))
      {
        if (paramBoolean) {
          return;
        }
        throw new IllegalStateException("Activity has been destroyed");
      }
    }
    finally {}
    if (this.mPendingActions == null) {
      this.mPendingActions = new ArrayList();
    }
    this.mPendingActions.add(paramOpGenerator);
    scheduleCommit();
  }
  
  void ensureInflatedFragmentView(Fragment paramFragment)
  {
    if ((paramFragment.mFromLayout) && (!paramFragment.mPerformedCreateView))
    {
      paramFragment.mView = paramFragment.performCreateView(paramFragment.performGetLayoutInflater(paramFragment.mSavedFragmentState), null, paramFragment.mSavedFragmentState);
      if (paramFragment.mView != null)
      {
        paramFragment.mInnerView = paramFragment.mView;
        paramFragment.mView.setSaveFromParentEnabled(false);
        if (paramFragment.mHidden) {
          paramFragment.mView.setVisibility(8);
        }
        paramFragment.onViewCreated(paramFragment.mView, paramFragment.mSavedFragmentState);
        dispatchOnFragmentViewCreated(paramFragment, paramFragment.mView, paramFragment.mSavedFragmentState, false);
      }
    }
    else
    {
      return;
    }
    paramFragment.mInnerView = null;
  }
  
  public boolean execPendingActions()
  {
    ensureExecReady(true);
    boolean bool = false;
    for (;;)
    {
      if (generateOpsForPendingActions(this.mTmpRecords, this.mTmpIsPop)) {
        this.mExecutingActions = true;
      }
      try
      {
        removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
        cleanupExec();
        bool = true;
      }
      finally
      {
        cleanupExec();
      }
    }
    burpActive();
    return bool;
  }
  
  public void execSingleAction(OpGenerator paramOpGenerator, boolean paramBoolean)
  {
    if ((paramBoolean) && ((this.mHost == null) || (this.mDestroyed))) {
      return;
    }
    ensureExecReady(paramBoolean);
    if (paramOpGenerator.generateOps(this.mTmpRecords, this.mTmpIsPop)) {
      this.mExecutingActions = true;
    }
    try
    {
      removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
      cleanupExec();
      doPendingDeferredStart();
      return;
    }
    finally
    {
      cleanupExec();
    }
  }
  
  public boolean executePendingTransactions()
  {
    boolean bool = execPendingActions();
    forcePostponedTransactions();
    return bool;
  }
  
  public Fragment findFragmentById(int paramInt)
  {
    Fragment localFragment;
    for (int i = -1 + this.mAdded.size(); i >= 0; i--)
    {
      localFragment = (Fragment)this.mAdded.get(i);
      if ((localFragment != null) && (localFragment.mFragmentId == paramInt)) {
        return localFragment;
      }
    }
    if (this.mActive != null) {
      for (int j = -1 + this.mActive.size();; j--)
      {
        if (j < 0) {
          break label104;
        }
        localFragment = (Fragment)this.mActive.valueAt(j);
        if ((localFragment != null) && (localFragment.mFragmentId == paramInt)) {
          break;
        }
      }
    }
    label104:
    return null;
  }
  
  public Fragment findFragmentByTag(String paramString)
  {
    Fragment localFragment;
    if (paramString != null) {
      for (int j = -1 + this.mAdded.size(); j >= 0; j--)
      {
        localFragment = (Fragment)this.mAdded.get(j);
        if ((localFragment != null) && (paramString.equals(localFragment.mTag))) {
          return localFragment;
        }
      }
    }
    if ((this.mActive != null) && (paramString != null)) {
      for (int i = -1 + this.mActive.size();; i--)
      {
        if (i < 0) {
          break label114;
        }
        localFragment = (Fragment)this.mActive.valueAt(i);
        if ((localFragment != null) && (paramString.equals(localFragment.mTag))) {
          break;
        }
      }
    }
    label114:
    return null;
  }
  
  public Fragment findFragmentByWho(String paramString)
  {
    if ((this.mActive != null) && (paramString != null)) {
      for (int i = -1 + this.mActive.size(); i >= 0; i--)
      {
        Fragment localFragment1 = (Fragment)this.mActive.valueAt(i);
        if (localFragment1 != null)
        {
          Fragment localFragment2 = localFragment1.findFragmentByWho(paramString);
          if (localFragment2 != null) {
            return localFragment2;
          }
        }
      }
    }
    return null;
  }
  
  public void freeBackStackIndex(int paramInt)
  {
    try
    {
      this.mBackStackIndices.set(paramInt, null);
      if (this.mAvailBackStackIndices == null) {
        this.mAvailBackStackIndices = new ArrayList();
      }
      if (DEBUG) {
        Log.v("FragmentManager", "Freeing back stack index " + paramInt);
      }
      this.mAvailBackStackIndices.add(Integer.valueOf(paramInt));
      return;
    }
    finally {}
  }
  
  int getActiveFragmentCount()
  {
    if (this.mActive == null) {
      return 0;
    }
    return this.mActive.size();
  }
  
  List<Fragment> getActiveFragments()
  {
    Object localObject;
    if (this.mActive == null) {
      localObject = null;
    }
    for (;;)
    {
      return localObject;
      int i = this.mActive.size();
      localObject = new ArrayList(i);
      for (int j = 0; j < i; j++) {
        ((ArrayList)localObject).add(this.mActive.valueAt(j));
      }
    }
  }
  
  public FragmentManager.BackStackEntry getBackStackEntryAt(int paramInt)
  {
    return (FragmentManager.BackStackEntry)this.mBackStack.get(paramInt);
  }
  
  public int getBackStackEntryCount()
  {
    if (this.mBackStack != null) {
      return this.mBackStack.size();
    }
    return 0;
  }
  
  public Fragment getFragment(Bundle paramBundle, String paramString)
  {
    int i = paramBundle.getInt(paramString, -1);
    Fragment localFragment;
    if (i == -1) {
      localFragment = null;
    }
    do
    {
      return localFragment;
      localFragment = (Fragment)this.mActive.get(i);
    } while (localFragment != null);
    throwException(new IllegalStateException("Fragment no longer exists for key " + paramString + ": index " + i));
    return localFragment;
  }
  
  public List<Fragment> getFragments()
  {
    if (this.mAdded.isEmpty()) {
      return Collections.EMPTY_LIST;
    }
    synchronized (this.mAdded)
    {
      List localList = (List)this.mAdded.clone();
      return localList;
    }
  }
  
  LayoutInflater.Factory2 getLayoutInflaterFactory()
  {
    return this;
  }
  
  public Fragment getPrimaryNavigationFragment()
  {
    return this.mPrimaryNav;
  }
  
  public void hideFragment(Fragment paramFragment)
  {
    boolean bool = true;
    if (DEBUG) {
      Log.v("FragmentManager", "hide: " + paramFragment);
    }
    if (!paramFragment.mHidden)
    {
      paramFragment.mHidden = bool;
      if (paramFragment.mHiddenChanged) {
        break label59;
      }
    }
    for (;;)
    {
      paramFragment.mHiddenChanged = bool;
      return;
      label59:
      bool = false;
    }
  }
  
  public boolean isDestroyed()
  {
    return this.mDestroyed;
  }
  
  boolean isStateAtLeast(int paramInt)
  {
    return this.mCurState >= paramInt;
  }
  
  public boolean isStateSaved()
  {
    return (this.mStateSaved) || (this.mStopped);
  }
  
  AnimationOrAnimator loadAnimation(Fragment paramFragment, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    int i = paramFragment.getNextAnim();
    Animation localAnimation1 = paramFragment.onCreateAnimation(paramInt1, paramBoolean, i);
    if (localAnimation1 != null) {
      return new AnimationOrAnimator(localAnimation1, null);
    }
    Animator localAnimator1 = paramFragment.onCreateAnimator(paramInt1, paramBoolean, i);
    if (localAnimator1 != null) {
      return new AnimationOrAnimator(localAnimator1, null);
    }
    boolean bool;
    if (i != 0)
    {
      bool = "anim".equals(this.mHost.getContext().getResources().getResourceTypeName(i));
      if (!bool) {
        break label407;
      }
    }
    for (;;)
    {
      try
      {
        Animation localAnimation3 = AnimationUtils.loadAnimation(this.mHost.getContext(), i);
        if (localAnimation3 != null)
        {
          AnimationOrAnimator localAnimationOrAnimator2 = new AnimationOrAnimator(localAnimation3, null);
          return localAnimationOrAnimator2;
        }
      }
      catch (Resources.NotFoundException localNotFoundException)
      {
        throw localNotFoundException;
        k = 1;
        if (k == 0)
        {
          try
          {
            Animator localAnimator2 = AnimatorInflater.loadAnimator(this.mHost.getContext(), i);
            if (localAnimator2 == null) {
              break label220;
            }
            AnimationOrAnimator localAnimationOrAnimator1 = new AnimationOrAnimator(localAnimator2, null);
            return localAnimationOrAnimator1;
          }
          catch (RuntimeException localRuntimeException1)
          {
            if (!bool) {
              continue;
            }
          }
          throw localRuntimeException1;
        }
      }
      catch (RuntimeException localRuntimeException2)
      {
        k = 0;
        continue;
        Animation localAnimation2 = AnimationUtils.loadAnimation(this.mHost.getContext(), i);
        if (localAnimation2 != null) {
          return new AnimationOrAnimator(localAnimation2, null);
        }
      }
      label220:
      if (paramInt1 == 0) {
        return null;
      }
      int j = transitToStyleIndex(paramInt1, paramBoolean);
      if (j < 0) {
        return null;
      }
      switch (j)
      {
      default: 
        if ((paramInt2 == 0) && (this.mHost.onHasWindowAnimations())) {
          paramInt2 = this.mHost.onGetWindowAnimations();
        }
        if (paramInt2 == 0) {
          return null;
        }
        break;
      case 1: 
        return makeOpenCloseAnimation(this.mHost.getContext(), 1.125F, 1.0F, 0.0F, 1.0F);
      case 2: 
        return makeOpenCloseAnimation(this.mHost.getContext(), 1.0F, 0.975F, 1.0F, 0.0F);
      case 3: 
        return makeOpenCloseAnimation(this.mHost.getContext(), 0.975F, 1.0F, 0.0F, 1.0F);
      case 4: 
        return makeOpenCloseAnimation(this.mHost.getContext(), 1.0F, 1.075F, 1.0F, 0.0F);
      case 5: 
        return makeFadeAnimation(this.mHost.getContext(), 0.0F, 1.0F);
      case 6: 
        return makeFadeAnimation(this.mHost.getContext(), 1.0F, 0.0F);
      }
      return null;
      label407:
      int k = 0;
    }
  }
  
  void makeActive(Fragment paramFragment)
  {
    if (paramFragment.mIndex >= 0) {}
    do
    {
      return;
      int i = this.mNextFragmentIndex;
      this.mNextFragmentIndex = (i + 1);
      paramFragment.setIndex(i, this.mParent);
      if (this.mActive == null) {
        this.mActive = new SparseArray();
      }
      this.mActive.put(paramFragment.mIndex, paramFragment);
    } while (!DEBUG);
    Log.v("FragmentManager", "Allocated fragment index " + paramFragment);
  }
  
  void makeInactive(Fragment paramFragment)
  {
    if (paramFragment.mIndex < 0) {
      return;
    }
    if (DEBUG) {
      Log.v("FragmentManager", "Freeing fragment index " + paramFragment);
    }
    this.mActive.put(paramFragment.mIndex, null);
    paramFragment.initState();
  }
  
  void moveFragmentToExpectedState(Fragment paramFragment)
  {
    if (paramFragment == null) {}
    label256:
    for (;;)
    {
      return;
      int i = this.mCurState;
      AnimationOrAnimator localAnimationOrAnimator;
      if (paramFragment.mRemoving)
      {
        if (paramFragment.isInBackStack()) {
          i = Math.min(i, 1);
        }
      }
      else
      {
        moveToState(paramFragment, i, paramFragment.getNextTransition(), paramFragment.getNextTransitionStyle(), false);
        if (paramFragment.mView != null)
        {
          Fragment localFragment = findFragmentUnder(paramFragment);
          if (localFragment != null)
          {
            View localView = localFragment.mView;
            ViewGroup localViewGroup = paramFragment.mContainer;
            int j = localViewGroup.indexOfChild(localView);
            int k = localViewGroup.indexOfChild(paramFragment.mView);
            if (k < j)
            {
              localViewGroup.removeViewAt(k);
              localViewGroup.addView(paramFragment.mView, j);
            }
          }
          if ((paramFragment.mIsNewlyAdded) && (paramFragment.mContainer != null))
          {
            if (paramFragment.mPostponedAlpha > 0.0F) {
              paramFragment.mView.setAlpha(paramFragment.mPostponedAlpha);
            }
            paramFragment.mPostponedAlpha = 0.0F;
            paramFragment.mIsNewlyAdded = false;
            localAnimationOrAnimator = loadAnimation(paramFragment, paramFragment.getNextTransition(), true, paramFragment.getNextTransitionStyle());
            if (localAnimationOrAnimator != null)
            {
              setHWLayerAnimListenerIfAlpha(paramFragment.mView, localAnimationOrAnimator);
              if (localAnimationOrAnimator.animation == null) {
                break label235;
              }
              paramFragment.mView.startAnimation(localAnimationOrAnimator.animation);
            }
          }
        }
      }
      for (;;)
      {
        if (!paramFragment.mHiddenChanged) {
          break label256;
        }
        completeShowHideFragment(paramFragment);
        return;
        i = Math.min(i, 0);
        break;
        label235:
        localAnimationOrAnimator.animator.setTarget(paramFragment.mView);
        localAnimationOrAnimator.animator.start();
      }
    }
  }
  
  void moveToState(int paramInt, boolean paramBoolean)
  {
    if ((this.mHost == null) && (paramInt != 0)) {
      throw new IllegalStateException("No activity");
    }
    if ((!paramBoolean) && (paramInt == this.mCurState)) {}
    do
    {
      do
      {
        return;
        this.mCurState = paramInt;
      } while (this.mActive == null);
      int i = this.mAdded.size();
      for (int j = 0; j < i; j++) {
        moveFragmentToExpectedState((Fragment)this.mAdded.get(j));
      }
      int k = this.mActive.size();
      for (int m = 0; m < k; m++)
      {
        Fragment localFragment = (Fragment)this.mActive.valueAt(m);
        if ((localFragment != null) && ((localFragment.mRemoving) || (localFragment.mDetached)) && (!localFragment.mIsNewlyAdded)) {
          moveFragmentToExpectedState(localFragment);
        }
      }
      startPendingDeferredFragments();
    } while ((!this.mNeedMenuInvalidate) || (this.mHost == null) || (this.mCurState != 5));
    this.mHost.onSupportInvalidateOptionsMenu();
    this.mNeedMenuInvalidate = false;
  }
  
  void moveToState(Fragment paramFragment)
  {
    moveToState(paramFragment, this.mCurState, 0, 0, false);
  }
  
  void moveToState(Fragment paramFragment, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int i = 1;
    if (((!paramFragment.mAdded) || (paramFragment.mDetached)) && (paramInt1 > i)) {
      paramInt1 = i;
    }
    if ((paramFragment.mRemoving) && (paramInt1 > paramFragment.mState)) {
      if ((paramFragment.mState != 0) || (!paramFragment.isInBackStack())) {
        break label103;
      }
    }
    label103:
    for (paramInt1 = i;; paramInt1 = paramFragment.mState)
    {
      if ((paramFragment.mDeferStart) && (paramFragment.mState < 4) && (paramInt1 > 3)) {
        paramInt1 = 3;
      }
      if (paramFragment.mState > paramInt1) {
        break label1257;
      }
      if ((!paramFragment.mFromLayout) || (paramFragment.mInLayout)) {
        break;
      }
      return;
    }
    if ((paramFragment.getAnimatingAway() != null) || (paramFragment.getAnimator() != null))
    {
      paramFragment.setAnimatingAway(null);
      paramFragment.setAnimator(null);
      moveToState(paramFragment, paramFragment.getStateAfterAnimating(), 0, 0, i);
    }
    label188:
    label577:
    label710:
    ViewGroup localViewGroup;
    switch (paramFragment.mState)
    {
    default: 
      if (paramFragment.mState == paramInt1) {
        break label1837;
      }
      Log.w("FragmentManager", "moveToState: Fragment state for " + paramFragment + " not updated inline; " + "expected state " + paramInt1 + " found " + paramFragment.mState);
      paramFragment.mState = paramInt1;
      return;
    case 0: 
      if (paramInt1 > 0)
      {
        if (DEBUG) {
          Log.v("FragmentManager", "moveto CREATED: " + paramFragment);
        }
        if (paramFragment.mSavedFragmentState != null)
        {
          paramFragment.mSavedFragmentState.setClassLoader(this.mHost.getContext().getClassLoader());
          paramFragment.mSavedViewState = paramFragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
          paramFragment.mTarget = getFragment(paramFragment.mSavedFragmentState, "android:target_state");
          if (paramFragment.mTarget != null) {
            paramFragment.mTargetRequestCode = paramFragment.mSavedFragmentState.getInt("android:target_req_state", 0);
          }
          if (paramFragment.mSavedUserVisibleHint == null) {
            break label521;
          }
          paramFragment.mUserVisibleHint = paramFragment.mSavedUserVisibleHint.booleanValue();
          paramFragment.mSavedUserVisibleHint = null;
          if (!paramFragment.mUserVisibleHint)
          {
            paramFragment.mDeferStart = i;
            if (paramInt1 > 3) {
              paramInt1 = 3;
            }
          }
        }
        paramFragment.mHost = this.mHost;
        paramFragment.mParentFragment = this.mParent;
        if (this.mParent != null) {}
        for (FragmentManagerImpl localFragmentManagerImpl = this.mParent.mChildFragmentManager;; localFragmentManagerImpl = this.mHost.getFragmentManagerImpl())
        {
          paramFragment.mFragmentManager = localFragmentManagerImpl;
          if (paramFragment.mTarget == null) {
            break label577;
          }
          if (this.mActive.get(paramFragment.mTarget.mIndex) == paramFragment.mTarget) {
            break label551;
          }
          throw new IllegalStateException("Fragment " + paramFragment + " declared target fragment " + paramFragment.mTarget + " that does not belong to this FragmentManager!");
          paramFragment.mUserVisibleHint = paramFragment.mSavedFragmentState.getBoolean("android:user_visible_hint", i);
          break;
        }
        if (paramFragment.mTarget.mState < i) {
          moveToState(paramFragment.mTarget, i, 0, 0, i);
        }
        dispatchOnFragmentPreAttached(paramFragment, this.mHost.getContext(), false);
        paramFragment.mCalled = false;
        paramFragment.onAttach(this.mHost.getContext());
        if (!paramFragment.mCalled) {
          throw new SuperNotCalledException("Fragment " + paramFragment + " did not call through to super.onAttach()");
        }
        if (paramFragment.mParentFragment != null) {
          break label1205;
        }
        this.mHost.onAttachFragment(paramFragment);
        dispatchOnFragmentAttached(paramFragment, this.mHost.getContext(), false);
        if (paramFragment.mIsCreated) {
          break label1216;
        }
        dispatchOnFragmentPreCreated(paramFragment, paramFragment.mSavedFragmentState, false);
        paramFragment.performCreate(paramFragment.mSavedFragmentState);
        dispatchOnFragmentCreated(paramFragment, paramFragment.mSavedFragmentState, false);
        paramFragment.mRetaining = false;
      }
    case 1: 
      label521:
      label551:
      ensureInflatedFragmentView(paramFragment);
      label662:
      if (paramInt1 > i)
      {
        if (DEBUG) {
          Log.v("FragmentManager", "moveto ACTIVITY_CREATED: " + paramFragment);
        }
        if (!paramFragment.mFromLayout)
        {
          if (paramFragment.mContainerId == 0) {
            break label1845;
          }
          if (paramFragment.mContainerId == -1) {
            throwException(new IllegalArgumentException("Cannot create fragment " + paramFragment + " for a container view with no id"));
          }
          localViewGroup = (ViewGroup)this.mContainer.onFindViewById(paramFragment.mContainerId);
          if ((localViewGroup != null) || (paramFragment.mRestored)) {}
        }
      }
      break;
    }
    try
    {
      String str2 = paramFragment.getResources().getResourceName(paramFragment.mContainerId);
      str1 = str2;
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
      for (;;)
      {
        label1205:
        label1216:
        String str1 = "unknown";
        continue;
        i = 0;
        continue;
        paramFragment.mInnerView = null;
      }
    }
    throwException(new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(paramFragment.mContainerId) + " (" + str1 + ") for fragment " + paramFragment));
    for (;;)
    {
      paramFragment.mContainer = localViewGroup;
      paramFragment.mView = paramFragment.performCreateView(paramFragment.performGetLayoutInflater(paramFragment.mSavedFragmentState), localViewGroup, paramFragment.mSavedFragmentState);
      if (paramFragment.mView != null)
      {
        paramFragment.mInnerView = paramFragment.mView;
        paramFragment.mView.setSaveFromParentEnabled(false);
        if (localViewGroup != null) {
          localViewGroup.addView(paramFragment.mView);
        }
        if (paramFragment.mHidden) {
          paramFragment.mView.setVisibility(8);
        }
        paramFragment.onViewCreated(paramFragment.mView, paramFragment.mSavedFragmentState);
        dispatchOnFragmentViewCreated(paramFragment, paramFragment.mView, paramFragment.mSavedFragmentState, false);
        if ((paramFragment.mView.getVisibility() == 0) && (paramFragment.mContainer != null))
        {
          paramFragment.mIsNewlyAdded = i;
          paramFragment.performActivityCreated(paramFragment.mSavedFragmentState);
          dispatchOnFragmentActivityCreated(paramFragment, paramFragment.mSavedFragmentState, false);
          if (paramFragment.mView != null) {
            paramFragment.restoreViewState(paramFragment.mSavedFragmentState);
          }
          paramFragment.mSavedFragmentState = null;
          if (paramInt1 > 2) {
            paramFragment.mState = 3;
          }
          if (paramInt1 > 3)
          {
            if (DEBUG) {
              Log.v("FragmentManager", "moveto STARTED: " + paramFragment);
            }
            paramFragment.performStart();
            dispatchOnFragmentStarted(paramFragment, false);
          }
          if (paramInt1 <= 4) {
            break label188;
          }
          if (DEBUG) {
            Log.v("FragmentManager", "moveto RESUMED: " + paramFragment);
          }
          paramFragment.performResume();
          dispatchOnFragmentResumed(paramFragment, false);
          paramFragment.mSavedFragmentState = null;
          paramFragment.mSavedViewState = null;
          break label188;
          paramFragment.mParentFragment.onAttachFragment(paramFragment);
          break label662;
          paramFragment.restoreChildFragmentState(paramFragment.mSavedFragmentState);
          paramFragment.mState = i;
          break label710;
        }
      }
      label1257:
      if (paramFragment.mState <= paramInt1) {
        break label188;
      }
      switch (paramFragment.mState)
      {
      default: 
        break;
      case 1: 
      case 5: 
      case 4: 
      case 3: 
      case 2: 
        label1307:
        label1343:
        do
        {
          if (paramInt1 >= i) {
            break;
          }
          if (this.mDestroyed)
          {
            if (paramFragment.getAnimatingAway() == null) {
              break label1708;
            }
            View localView = paramFragment.getAnimatingAway();
            paramFragment.setAnimatingAway(null);
            localView.clearAnimation();
          }
          if ((paramFragment.getAnimatingAway() == null) && (paramFragment.getAnimator() == null)) {
            break label1734;
          }
          paramFragment.setStateAfterAnimating(paramInt1);
          paramInt1 = i;
          break;
          if (paramInt1 < 5)
          {
            if (DEBUG) {
              Log.v("FragmentManager", "movefrom RESUMED: " + paramFragment);
            }
            paramFragment.performPause();
            dispatchOnFragmentPaused(paramFragment, false);
          }
          if (paramInt1 < 4)
          {
            if (DEBUG) {
              Log.v("FragmentManager", "movefrom STARTED: " + paramFragment);
            }
            paramFragment.performStop();
            dispatchOnFragmentStopped(paramFragment, false);
          }
          if (paramInt1 < 3)
          {
            if (DEBUG) {
              Log.v("FragmentManager", "movefrom STOPPED: " + paramFragment);
            }
            paramFragment.performReallyStop();
          }
        } while (paramInt1 >= 2);
        if (DEBUG) {
          Log.v("FragmentManager", "movefrom ACTIVITY_CREATED: " + paramFragment);
        }
        if ((paramFragment.mView != null) && (this.mHost.onShouldSaveFragmentState(paramFragment)) && (paramFragment.mSavedViewState == null)) {
          saveFragmentViewState(paramFragment);
        }
        paramFragment.performDestroyView();
        dispatchOnFragmentViewDestroyed(paramFragment, false);
        if ((paramFragment.mView != null) && (paramFragment.mContainer != null))
        {
          paramFragment.mContainer.endViewTransition(paramFragment.mView);
          paramFragment.mView.clearAnimation();
          if ((this.mCurState <= 0) || (this.mDestroyed) || (paramFragment.mView.getVisibility() != 0) || (paramFragment.mPostponedAlpha < 0.0F)) {
            break label1839;
          }
        }
        label1708:
        label1837:
        label1839:
        for (AnimationOrAnimator localAnimationOrAnimator = loadAnimation(paramFragment, paramInt2, false, paramInt3);; localAnimationOrAnimator = null)
        {
          paramFragment.mPostponedAlpha = 0.0F;
          if (localAnimationOrAnimator != null) {
            animateRemoveFragment(paramFragment, localAnimationOrAnimator, paramInt1);
          }
          paramFragment.mContainer.removeView(paramFragment.mView);
          paramFragment.mContainer = null;
          paramFragment.mView = null;
          paramFragment.mInnerView = null;
          paramFragment.mInLayout = false;
          break label1307;
          if (paramFragment.getAnimator() == null) {
            break label1343;
          }
          Animator localAnimator = paramFragment.getAnimator();
          paramFragment.setAnimator(null);
          localAnimator.cancel();
          break label1343;
          label1734:
          if (DEBUG) {
            Log.v("FragmentManager", "movefrom CREATED: " + paramFragment);
          }
          if (!paramFragment.mRetaining)
          {
            paramFragment.performDestroy();
            dispatchOnFragmentDestroyed(paramFragment, false);
          }
          for (;;)
          {
            paramFragment.performDetach();
            dispatchOnFragmentDetached(paramFragment, false);
            if (paramBoolean) {
              break;
            }
            if (paramFragment.mRetaining) {
              break label1821;
            }
            makeInactive(paramFragment);
            break;
            paramFragment.mState = 0;
          }
          paramFragment.mHost = null;
          paramFragment.mParentFragment = null;
          paramFragment.mFragmentManager = null;
          break label188;
          break;
        }
        label1821:
        label1845:
        localViewGroup = null;
      }
    }
  }
  
  public void noteStateNotSaved()
  {
    this.mSavedNonConfig = null;
    this.mStateSaved = false;
    this.mStopped = false;
    int i = this.mAdded.size();
    for (int j = 0; j < i; j++)
    {
      Fragment localFragment = (Fragment)this.mAdded.get(j);
      if (localFragment != null) {
        localFragment.noteStateNotSaved();
      }
    }
  }
  
  public View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    if (!"fragment".equals(paramString)) {
      return null;
    }
    String str1 = paramAttributeSet.getAttributeValue(null, "class");
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, FragmentTag.Fragment);
    if (str1 == null) {}
    for (String str2 = localTypedArray.getString(0);; str2 = str1)
    {
      int i = localTypedArray.getResourceId(1, -1);
      String str3 = localTypedArray.getString(2);
      localTypedArray.recycle();
      if (!Fragment.isSupportFragmentClass(this.mHost.getContext(), str2)) {
        return null;
      }
      if (paramView != null) {}
      for (int j = paramView.getId(); (j == -1) && (i == -1) && (str3 == null); j = 0) {
        throw new IllegalArgumentException(paramAttributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str2);
      }
      Fragment localFragment1;
      int k;
      label302:
      Fragment localFragment2;
      if (i != -1)
      {
        localFragment1 = findFragmentById(i);
        if ((localFragment1 == null) && (str3 != null)) {
          localFragment1 = findFragmentByTag(str3);
        }
        if ((localFragment1 == null) && (j != -1)) {
          localFragment1 = findFragmentById(j);
        }
        if (DEBUG) {
          Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(i) + " fname=" + str2 + " existing=" + localFragment1);
        }
        if (localFragment1 != null) {
          break label456;
        }
        Fragment localFragment3 = this.mContainer.instantiate(paramContext, str2, null);
        localFragment3.mFromLayout = true;
        if (i == 0) {
          break label449;
        }
        k = i;
        localFragment3.mFragmentId = k;
        localFragment3.mContainerId = j;
        localFragment3.mTag = str3;
        localFragment3.mInLayout = true;
        localFragment3.mFragmentManager = this;
        localFragment3.mHost = this.mHost;
        localFragment3.onInflate(this.mHost.getContext(), paramAttributeSet, localFragment3.mSavedFragmentState);
        addFragment(localFragment3, true);
        localFragment2 = localFragment3;
        label374:
        if ((this.mCurState >= 1) || (!localFragment2.mFromLayout)) {
          break label591;
        }
        moveToState(localFragment2, 1, 0, 0, false);
      }
      for (;;)
      {
        if (localFragment2.mView != null) {
          break label600;
        }
        throw new IllegalStateException("Fragment " + str2 + " did not create a view.");
        localFragment1 = null;
        break;
        label449:
        k = j;
        break label302;
        label456:
        if (localFragment1.mInLayout) {
          throw new IllegalArgumentException(paramAttributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(i) + ", tag " + str3 + ", or parent id 0x" + Integer.toHexString(j) + " with another fragment for " + str2);
        }
        localFragment1.mInLayout = true;
        localFragment1.mHost = this.mHost;
        if (!localFragment1.mRetaining) {
          localFragment1.onInflate(this.mHost.getContext(), paramAttributeSet, localFragment1.mSavedFragmentState);
        }
        localFragment2 = localFragment1;
        break label374;
        label591:
        moveToState(localFragment2);
      }
      label600:
      if (i != 0) {
        localFragment2.mView.setId(i);
      }
      if (localFragment2.mView.getTag() == null) {
        localFragment2.mView.setTag(str3);
      }
      return localFragment2.mView;
    }
  }
  
  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return onCreateView(null, paramString, paramContext, paramAttributeSet);
  }
  
  public void performPendingDeferredStart(Fragment paramFragment)
  {
    if (paramFragment.mDeferStart)
    {
      if (this.mExecutingActions) {
        this.mHavePendingDeferredStart = true;
      }
    }
    else {
      return;
    }
    paramFragment.mDeferStart = false;
    moveToState(paramFragment, this.mCurState, 0, 0, false);
  }
  
  public void popBackStack()
  {
    enqueueAction(new PopBackStackState(null, -1, 0), false);
  }
  
  public void popBackStack(int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0) {
      throw new IllegalArgumentException("Bad id: " + paramInt1);
    }
    enqueueAction(new PopBackStackState(null, paramInt1, paramInt2), false);
  }
  
  public void popBackStack(String paramString, int paramInt)
  {
    enqueueAction(new PopBackStackState(paramString, -1, paramInt), false);
  }
  
  public boolean popBackStackImmediate()
  {
    checkStateLoss();
    return popBackStackImmediate(null, -1, 0);
  }
  
  public boolean popBackStackImmediate(int paramInt1, int paramInt2)
  {
    checkStateLoss();
    execPendingActions();
    if (paramInt1 < 0) {
      throw new IllegalArgumentException("Bad id: " + paramInt1);
    }
    return popBackStackImmediate(null, paramInt1, paramInt2);
  }
  
  public boolean popBackStackImmediate(String paramString, int paramInt)
  {
    checkStateLoss();
    return popBackStackImmediate(paramString, -1, paramInt);
  }
  
  boolean popBackStackState(ArrayList<BackStackRecord> paramArrayList, ArrayList<Boolean> paramArrayList1, String paramString, int paramInt1, int paramInt2)
  {
    if (this.mBackStack == null) {
      return false;
    }
    if ((paramString == null) && (paramInt1 < 0) && ((paramInt2 & 0x1) == 0))
    {
      int m = -1 + this.mBackStack.size();
      if (m < 0) {
        return false;
      }
      paramArrayList.add(this.mBackStack.remove(m));
      paramArrayList1.add(Boolean.valueOf(true));
    }
    for (;;)
    {
      return true;
      int i = -1;
      if ((paramString != null) || (paramInt1 >= 0))
      {
        for (int j = -1 + this.mBackStack.size();; j--)
        {
          BackStackRecord localBackStackRecord2;
          if (j >= 0)
          {
            localBackStackRecord2 = (BackStackRecord)this.mBackStack.get(j);
            if ((paramString == null) || (!paramString.equals(localBackStackRecord2.getName()))) {
              break label133;
            }
          }
          label133:
          while ((paramInt1 >= 0) && (paramInt1 == localBackStackRecord2.mIndex))
          {
            if (j >= 0) {
              break;
            }
            return false;
          }
        }
        if ((paramInt2 & 0x1) != 0)
        {
          j--;
          while (j >= 0)
          {
            BackStackRecord localBackStackRecord1 = (BackStackRecord)this.mBackStack.get(j);
            if (((paramString == null) || (!paramString.equals(localBackStackRecord1.getName()))) && ((paramInt1 < 0) || (paramInt1 != localBackStackRecord1.mIndex))) {
              break;
            }
            j--;
          }
        }
        i = j;
      }
      if (i == -1 + this.mBackStack.size()) {
        return false;
      }
      for (int k = -1 + this.mBackStack.size(); k > i; k--)
      {
        paramArrayList.add(this.mBackStack.remove(k));
        paramArrayList1.add(Boolean.valueOf(true));
      }
    }
  }
  
  public void putFragment(Bundle paramBundle, String paramString, Fragment paramFragment)
  {
    if (paramFragment.mIndex < 0) {
      throwException(new IllegalStateException("Fragment " + paramFragment + " is not currently in the FragmentManager"));
    }
    paramBundle.putInt(paramString, paramFragment.mIndex);
  }
  
  public void registerFragmentLifecycleCallbacks(FragmentManager.FragmentLifecycleCallbacks paramFragmentLifecycleCallbacks, boolean paramBoolean)
  {
    this.mLifecycleCallbacks.add(new j(paramFragmentLifecycleCallbacks, Boolean.valueOf(paramBoolean)));
  }
  
  public void removeFragment(Fragment paramFragment)
  {
    if (DEBUG) {
      Log.v("FragmentManager", "remove: " + paramFragment + " nesting=" + paramFragment.mBackStackNesting);
    }
    int i;
    if (!paramFragment.isInBackStack()) {
      i = 1;
    }
    for (;;)
    {
      if ((!paramFragment.mDetached) || (i != 0)) {}
      synchronized (this.mAdded)
      {
        this.mAdded.remove(paramFragment);
        if ((paramFragment.mHasMenu) && (paramFragment.mMenuVisible)) {
          this.mNeedMenuInvalidate = true;
        }
        paramFragment.mAdded = false;
        paramFragment.mRemoving = true;
        return;
        i = 0;
      }
    }
  }
  
  public void removeOnBackStackChangedListener(FragmentManager.OnBackStackChangedListener paramOnBackStackChangedListener)
  {
    if (this.mBackStackChangeListeners != null) {
      this.mBackStackChangeListeners.remove(paramOnBackStackChangedListener);
    }
  }
  
  void reportBackStackChanged()
  {
    if (this.mBackStackChangeListeners != null) {
      for (int i = 0; i < this.mBackStackChangeListeners.size(); i++) {
        ((FragmentManager.OnBackStackChangedListener)this.mBackStackChangeListeners.get(i)).onBackStackChanged();
      }
    }
  }
  
  void restoreAllState(Parcelable paramParcelable, FragmentManagerNonConfig paramFragmentManagerNonConfig)
  {
    if (paramParcelable == null) {}
    FragmentManagerState localFragmentManagerState;
    do
    {
      return;
      localFragmentManagerState = (FragmentManagerState)paramParcelable;
    } while (localFragmentManagerState.mActive == null);
    List localList5;
    label301:
    List localList1;
    if (paramFragmentManagerNonConfig != null)
    {
      List localList4 = paramFragmentManagerNonConfig.getFragments();
      localList5 = paramFragmentManagerNonConfig.getChildNonConfigs();
      List localList6 = paramFragmentManagerNonConfig.getViewModelStores();
      int i1;
      if (localList4 != null) {
        i1 = localList4.size();
      }
      for (int i2 = 0;; i2++)
      {
        if (i2 >= i1) {
          break label301;
        }
        Fragment localFragment4 = (Fragment)localList4.get(i2);
        if (DEBUG) {
          Log.v("FragmentManager", "restoreAllState: re-attaching retained " + localFragment4);
        }
        int i3 = 0;
        for (;;)
        {
          if ((i3 < localFragmentManagerState.mActive.length) && (localFragmentManagerState.mActive[i3].mIndex != localFragment4.mIndex))
          {
            i3++;
            continue;
            i1 = 0;
            break;
          }
        }
        if (i3 == localFragmentManagerState.mActive.length) {
          throwException(new IllegalStateException("Could not find active fragment with index " + localFragment4.mIndex));
        }
        FragmentState localFragmentState2 = localFragmentManagerState.mActive[i3];
        localFragmentState2.mInstance = localFragment4;
        localFragment4.mSavedViewState = null;
        localFragment4.mBackStackNesting = 0;
        localFragment4.mInLayout = false;
        localFragment4.mAdded = false;
        localFragment4.mTarget = null;
        if (localFragmentState2.mSavedFragmentState != null)
        {
          localFragmentState2.mSavedFragmentState.setClassLoader(this.mHost.getContext().getClassLoader());
          localFragment4.mSavedViewState = localFragmentState2.mSavedFragmentState.getSparseParcelableArray("android:view_state");
          localFragment4.mSavedFragmentState = localFragmentState2.mSavedFragmentState;
        }
      }
      localList1 = localList6;
    }
    for (List localList2 = localList5;; localList2 = null)
    {
      this.mActive = new SparseArray(localFragmentManagerState.mActive.length);
      int i = 0;
      FragmentState localFragmentState1;
      if (i < localFragmentManagerState.mActive.length)
      {
        localFragmentState1 = localFragmentManagerState.mActive[i];
        if (localFragmentState1 != null) {
          if ((localList2 == null) || (i >= localList2.size())) {
            break label1062;
          }
        }
      }
      label1062:
      for (FragmentManagerNonConfig localFragmentManagerNonConfig = (FragmentManagerNonConfig)localList2.get(i);; localFragmentManagerNonConfig = null)
      {
        if ((localList1 != null) && (i < localList1.size())) {}
        for (v localv = (v)localList1.get(i);; localv = null)
        {
          Fragment localFragment3 = localFragmentState1.instantiate(this.mHost, this.mContainer, this.mParent, localFragmentManagerNonConfig, localv);
          if (DEBUG) {
            Log.v("FragmentManager", "restoreAllState: active #" + i + ": " + localFragment3);
          }
          this.mActive.put(localFragment3.mIndex, localFragment3);
          localFragmentState1.mInstance = null;
          i++;
          break;
          if (paramFragmentManagerNonConfig != null)
          {
            List localList3 = paramFragmentManagerNonConfig.getFragments();
            if (localList3 != null) {}
            for (int m = localList3.size();; m = 0) {
              for (int n = 0; n < m; n++)
              {
                Fragment localFragment2 = (Fragment)localList3.get(n);
                if (localFragment2.mTargetIndex >= 0)
                {
                  localFragment2.mTarget = ((Fragment)this.mActive.get(localFragment2.mTargetIndex));
                  if (localFragment2.mTarget == null) {
                    Log.w("FragmentManager", "Re-attaching retained fragment " + localFragment2 + " target no longer exists: " + localFragment2.mTargetIndex);
                  }
                }
              }
            }
          }
          this.mAdded.clear();
          if (localFragmentManagerState.mAdded != null)
          {
            int k = 0;
            while (k < localFragmentManagerState.mAdded.length)
            {
              Fragment localFragment1 = (Fragment)this.mActive.get(localFragmentManagerState.mAdded[k]);
              if (localFragment1 == null) {
                throwException(new IllegalStateException("No instantiated fragment for index #" + localFragmentManagerState.mAdded[k]));
              }
              localFragment1.mAdded = true;
              if (DEBUG) {
                Log.v("FragmentManager", "restoreAllState: added #" + k + ": " + localFragment1);
              }
              if (this.mAdded.contains(localFragment1)) {
                throw new IllegalStateException("Already added!");
              }
              synchronized (this.mAdded)
              {
                this.mAdded.add(localFragment1);
                k++;
              }
            }
          }
          if (localFragmentManagerState.mBackStack != null)
          {
            this.mBackStack = new ArrayList(localFragmentManagerState.mBackStack.length);
            for (int j = 0; j < localFragmentManagerState.mBackStack.length; j++)
            {
              BackStackRecord localBackStackRecord = localFragmentManagerState.mBackStack[j].instantiate(this);
              if (DEBUG)
              {
                Log.v("FragmentManager", "restoreAllState: back stack #" + j + " (index " + localBackStackRecord.mIndex + "): " + localBackStackRecord);
                PrintWriter localPrintWriter = new PrintWriter(new e("FragmentManager"));
                localBackStackRecord.dump("  ", localPrintWriter, false);
                localPrintWriter.close();
              }
              this.mBackStack.add(localBackStackRecord);
              if (localBackStackRecord.mIndex >= 0) {
                setBackStackIndex(localBackStackRecord.mIndex, localBackStackRecord);
              }
            }
          }
          this.mBackStack = null;
          if (localFragmentManagerState.mPrimaryNavActiveIndex >= 0) {
            this.mPrimaryNav = ((Fragment)this.mActive.get(localFragmentManagerState.mPrimaryNavActiveIndex));
          }
          this.mNextFragmentIndex = localFragmentManagerState.mNextFragmentIndex;
          return;
        }
      }
      localList1 = null;
    }
  }
  
  FragmentManagerNonConfig retainNonConfig()
  {
    setRetaining(this.mSavedNonConfig);
    return this.mSavedNonConfig;
  }
  
  Parcelable saveAllState()
  {
    forcePostponedTransactions();
    endAnimatingAwayFragments();
    execPendingActions();
    this.mStateSaved = true;
    this.mSavedNonConfig = null;
    if ((this.mActive == null) || (this.mActive.size() <= 0)) {
      return null;
    }
    int i = this.mActive.size();
    FragmentState[] arrayOfFragmentState = new FragmentState[i];
    int j = 0;
    int k = 0;
    label61:
    Fragment localFragment;
    FragmentState localFragmentState;
    if (j < i)
    {
      localFragment = (Fragment)this.mActive.valueAt(j);
      if (localFragment == null) {
        break label767;
      }
      if (localFragment.mIndex < 0) {
        throwException(new IllegalStateException("Failure saving state: active " + localFragment + " has cleared index: " + localFragment.mIndex));
      }
      localFragmentState = new FragmentState(localFragment);
      arrayOfFragmentState[j] = localFragmentState;
      if ((localFragment.mState > 0) && (localFragmentState.mSavedFragmentState == null))
      {
        localFragmentState.mSavedFragmentState = saveFragmentBasicState(localFragment);
        if (localFragment.mTarget != null)
        {
          if (localFragment.mTarget.mIndex < 0) {
            throwException(new IllegalStateException("Failure saving state: " + localFragment + " has target not in fragment manager: " + localFragment.mTarget));
          }
          if (localFragmentState.mSavedFragmentState == null) {
            localFragmentState.mSavedFragmentState = new Bundle();
          }
          putFragment(localFragmentState.mSavedFragmentState, "android:target_state", localFragment.mTarget);
          if (localFragment.mTargetRequestCode != 0) {
            localFragmentState.mSavedFragmentState.putInt("android:target_req_state", localFragment.mTargetRequestCode);
          }
        }
        label308:
        if (DEBUG) {
          Log.v("FragmentManager", "Saved state of " + localFragment + ": " + localFragmentState.mSavedFragmentState);
        }
      }
    }
    label767:
    for (int i3 = 1;; i3 = k)
    {
      j++;
      k = i3;
      break label61;
      localFragmentState.mSavedFragmentState = localFragment.mSavedFragmentState;
      break label308;
      if (k == 0)
      {
        if (!DEBUG) {
          break;
        }
        Log.v("FragmentManager", "saveAllState: no fragments!");
        return null;
      }
      int m = this.mAdded.size();
      if (m > 0)
      {
        arrayOfInt = new int[m];
        for (int i2 = 0; i2 < m; i2++)
        {
          arrayOfInt[i2] = ((Fragment)this.mAdded.get(i2)).mIndex;
          if (arrayOfInt[i2] < 0) {
            throwException(new IllegalStateException("Failure saving state: active " + this.mAdded.get(i2) + " has cleared index: " + arrayOfInt[i2]));
          }
          if (DEBUG) {
            Log.v("FragmentManager", "saveAllState: adding fragment #" + i2 + ": " + this.mAdded.get(i2));
          }
        }
      }
      int[] arrayOfInt = null;
      ArrayList localArrayList = this.mBackStack;
      BackStackState[] arrayOfBackStackState = null;
      if (localArrayList != null)
      {
        int n = this.mBackStack.size();
        arrayOfBackStackState = null;
        if (n > 0)
        {
          arrayOfBackStackState = new BackStackState[n];
          for (int i1 = 0; i1 < n; i1++)
          {
            arrayOfBackStackState[i1] = new BackStackState((BackStackRecord)this.mBackStack.get(i1));
            if (DEBUG) {
              Log.v("FragmentManager", "saveAllState: adding back stack #" + i1 + ": " + this.mBackStack.get(i1));
            }
          }
        }
      }
      FragmentManagerState localFragmentManagerState = new FragmentManagerState();
      localFragmentManagerState.mActive = arrayOfFragmentState;
      localFragmentManagerState.mAdded = arrayOfInt;
      localFragmentManagerState.mBackStack = arrayOfBackStackState;
      if (this.mPrimaryNav != null) {
        localFragmentManagerState.mPrimaryNavActiveIndex = this.mPrimaryNav.mIndex;
      }
      localFragmentManagerState.mNextFragmentIndex = this.mNextFragmentIndex;
      saveNonConfig();
      return localFragmentManagerState;
    }
  }
  
  Bundle saveFragmentBasicState(Fragment paramFragment)
  {
    if (this.mStateBundle == null) {
      this.mStateBundle = new Bundle();
    }
    paramFragment.performSaveInstanceState(this.mStateBundle);
    dispatchOnFragmentSaveInstanceState(paramFragment, this.mStateBundle, false);
    Bundle localBundle;
    if (!this.mStateBundle.isEmpty())
    {
      localBundle = this.mStateBundle;
      this.mStateBundle = null;
    }
    for (;;)
    {
      if (paramFragment.mView != null) {
        saveFragmentViewState(paramFragment);
      }
      if (paramFragment.mSavedViewState != null)
      {
        if (localBundle == null) {
          localBundle = new Bundle();
        }
        localBundle.putSparseParcelableArray("android:view_state", paramFragment.mSavedViewState);
      }
      if (!paramFragment.mUserVisibleHint)
      {
        if (localBundle == null) {
          localBundle = new Bundle();
        }
        localBundle.putBoolean("android:user_visible_hint", paramFragment.mUserVisibleHint);
      }
      return localBundle;
      localBundle = null;
    }
  }
  
  public Fragment.SavedState saveFragmentInstanceState(Fragment paramFragment)
  {
    if (paramFragment.mIndex < 0) {
      throwException(new IllegalStateException("Fragment " + paramFragment + " is not currently in the FragmentManager"));
    }
    int i = paramFragment.mState;
    Fragment.SavedState localSavedState = null;
    if (i > 0)
    {
      Bundle localBundle = saveFragmentBasicState(paramFragment);
      localSavedState = null;
      if (localBundle != null) {
        localSavedState = new Fragment.SavedState(localBundle);
      }
    }
    return localSavedState;
  }
  
  void saveFragmentViewState(Fragment paramFragment)
  {
    if (paramFragment.mInnerView == null) {
      return;
    }
    if (this.mStateArray == null) {
      this.mStateArray = new SparseArray();
    }
    for (;;)
    {
      paramFragment.mInnerView.saveHierarchyState(this.mStateArray);
      if (this.mStateArray.size() <= 0) {
        break;
      }
      paramFragment.mSavedViewState = this.mStateArray;
      this.mStateArray = null;
      return;
      this.mStateArray.clear();
    }
  }
  
  void saveNonConfig()
  {
    if (this.mActive != null)
    {
      int i = 0;
      localObject1 = null;
      localObject2 = null;
      localObject3 = null;
      while (i < this.mActive.size())
      {
        Fragment localFragment = (Fragment)this.mActive.valueAt(i);
        if (localFragment != null)
        {
          int m;
          if (localFragment.mRetainInstance)
          {
            if (localObject3 == null) {
              localObject3 = new ArrayList();
            }
            ((ArrayList)localObject3).add(localFragment);
            if (localFragment.mTarget == null) {
              break label204;
            }
            m = localFragment.mTarget.mIndex;
            localFragment.mTargetIndex = m;
            if (DEBUG) {
              Log.v("FragmentManager", "retainNonConfig: keeping retained " + localFragment);
            }
          }
          if (localFragment.mChildFragmentManager != null) {
            localFragment.mChildFragmentManager.saveNonConfig();
          }
          for (FragmentManagerNonConfig localFragmentManagerNonConfig = localFragment.mChildFragmentManager.mSavedNonConfig;; localFragmentManagerNonConfig = localFragment.mChildNonConfig)
          {
            if ((localObject2 != null) || (localFragmentManagerNonConfig == null)) {
              break label220;
            }
            localObject2 = new ArrayList(this.mActive.size());
            for (int k = 0; k < i; k++) {
              ((ArrayList)localObject2).add(null);
            }
            label204:
            m = -1;
            break;
          }
          label220:
          if (localObject2 != null) {
            ((ArrayList)localObject2).add(localFragmentManagerNonConfig);
          }
          if ((localObject1 == null) && (localFragment.mViewModelStore != null))
          {
            localObject1 = new ArrayList(this.mActive.size());
            for (int j = 0; j < i; j++) {
              ((ArrayList)localObject1).add(null);
            }
          }
          if (localObject1 != null) {
            ((ArrayList)localObject1).add(localFragment.mViewModelStore);
          }
        }
        Object localObject4 = localObject1;
        Object localObject5 = localObject2;
        Object localObject6 = localObject3;
        i++;
        localObject3 = localObject6;
        localObject2 = localObject5;
        localObject1 = localObject4;
      }
    }
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    if ((localObject3 == null) && (localObject2 == null) && (localObject1 == null))
    {
      this.mSavedNonConfig = null;
      return;
    }
    this.mSavedNonConfig = new FragmentManagerNonConfig((List)localObject3, (List)localObject2, (List)localObject1);
  }
  
  /* Error */
  public void setBackStackIndex(int paramInt, BackStackRecord paramBackStackRecord)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 861	android/support/v4/app/FragmentManagerImpl:mBackStackIndices	Ljava/util/ArrayList;
    //   6: ifnonnull +14 -> 20
    //   9: aload_0
    //   10: new 127	java/util/ArrayList
    //   13: dup
    //   14: invokespecial 128	java/util/ArrayList:<init>	()V
    //   17: putfield 861	android/support/v4/app/FragmentManagerImpl:mBackStackIndices	Ljava/util/ArrayList;
    //   20: aload_0
    //   21: getfield 861	android/support/v4/app/FragmentManagerImpl:mBackStackIndices	Ljava/util/ArrayList;
    //   24: invokevirtual 170	java/util/ArrayList:size	()I
    //   27: istore 4
    //   29: iload_1
    //   30: iload 4
    //   32: if_icmpge +58 -> 90
    //   35: getstatic 100	android/support/v4/app/FragmentManagerImpl:DEBUG	Z
    //   38: ifeq +39 -> 77
    //   41: ldc 33
    //   43: new 317	java/lang/StringBuilder
    //   46: dup
    //   47: invokespecial 318	java/lang/StringBuilder:<init>	()V
    //   50: ldc_w 863
    //   53: invokevirtual 324	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   56: iload_1
    //   57: invokevirtual 866	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   60: ldc_w 868
    //   63: invokevirtual 324	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   66: aload_2
    //   67: invokevirtual 820	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   70: invokevirtual 328	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   73: invokestatic 823	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   76: pop
    //   77: aload_0
    //   78: getfield 861	android/support/v4/app/FragmentManagerImpl:mBackStackIndices	Ljava/util/ArrayList;
    //   81: iload_1
    //   82: aload_2
    //   83: invokevirtual 881	java/util/ArrayList:set	(ILjava/lang/Object;)Ljava/lang/Object;
    //   86: pop
    //   87: aload_0
    //   88: monitorexit
    //   89: return
    //   90: iload 4
    //   92: iload_1
    //   93: if_icmpge +82 -> 175
    //   96: aload_0
    //   97: getfield 861	android/support/v4/app/FragmentManagerImpl:mBackStackIndices	Ljava/util/ArrayList;
    //   100: aconst_null
    //   101: invokevirtual 347	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   104: pop
    //   105: aload_0
    //   106: getfield 859	android/support/v4/app/FragmentManagerImpl:mAvailBackStackIndices	Ljava/util/ArrayList;
    //   109: ifnonnull +14 -> 123
    //   112: aload_0
    //   113: new 127	java/util/ArrayList
    //   116: dup
    //   117: invokespecial 128	java/util/ArrayList:<init>	()V
    //   120: putfield 859	android/support/v4/app/FragmentManagerImpl:mAvailBackStackIndices	Ljava/util/ArrayList;
    //   123: getstatic 100	android/support/v4/app/FragmentManagerImpl:DEBUG	Z
    //   126: ifeq +30 -> 156
    //   129: ldc 33
    //   131: new 317	java/lang/StringBuilder
    //   134: dup
    //   135: invokespecial 318	java/lang/StringBuilder:<init>	()V
    //   138: ldc_w 1859
    //   141: invokevirtual 324	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   144: iload 4
    //   146: invokevirtual 866	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   149: invokevirtual 328	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   152: invokestatic 823	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   155: pop
    //   156: aload_0
    //   157: getfield 859	android/support/v4/app/FragmentManagerImpl:mAvailBackStackIndices	Ljava/util/ArrayList;
    //   160: iload 4
    //   162: invokestatic 1235	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   165: invokevirtual 347	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   168: pop
    //   169: iinc 4 1
    //   172: goto -82 -> 90
    //   175: getstatic 100	android/support/v4/app/FragmentManagerImpl:DEBUG	Z
    //   178: ifeq +39 -> 217
    //   181: ldc 33
    //   183: new 317	java/lang/StringBuilder
    //   186: dup
    //   187: invokespecial 318	java/lang/StringBuilder:<init>	()V
    //   190: ldc_w 875
    //   193: invokevirtual 324	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   196: iload_1
    //   197: invokevirtual 866	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   200: ldc_w 877
    //   203: invokevirtual 324	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: aload_2
    //   207: invokevirtual 820	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   210: invokevirtual 328	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   213: invokestatic 823	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   216: pop
    //   217: aload_0
    //   218: getfield 861	android/support/v4/app/FragmentManagerImpl:mBackStackIndices	Ljava/util/ArrayList;
    //   221: aload_2
    //   222: invokevirtual 347	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   225: pop
    //   226: goto -139 -> 87
    //   229: astore_3
    //   230: aload_0
    //   231: monitorexit
    //   232: aload_3
    //   233: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	234	0	this	FragmentManagerImpl
    //   0	234	1	paramInt	int
    //   0	234	2	paramBackStackRecord	BackStackRecord
    //   229	4	3	localObject	Object
    //   27	143	4	i	int
    // Exception table:
    //   from	to	target	type
    //   2	20	229	finally
    //   20	29	229	finally
    //   35	77	229	finally
    //   77	87	229	finally
    //   87	89	229	finally
    //   96	123	229	finally
    //   123	156	229	finally
    //   156	169	229	finally
    //   175	217	229	finally
    //   217	226	229	finally
    //   230	232	229	finally
  }
  
  public void setPrimaryNavigationFragment(Fragment paramFragment)
  {
    if ((paramFragment != null) && ((this.mActive.get(paramFragment.mIndex) != paramFragment) || ((paramFragment.mHost != null) && (paramFragment.getFragmentManager() != this)))) {
      throw new IllegalArgumentException("Fragment " + paramFragment + " is not an active fragment of FragmentManager " + this);
    }
    this.mPrimaryNav = paramFragment;
  }
  
  public void showFragment(Fragment paramFragment)
  {
    if (DEBUG) {
      Log.v("FragmentManager", "show: " + paramFragment);
    }
    if (paramFragment.mHidden)
    {
      paramFragment.mHidden = false;
      boolean bool1 = paramFragment.mHiddenChanged;
      boolean bool2 = false;
      if (!bool1) {
        bool2 = true;
      }
      paramFragment.mHiddenChanged = bool2;
    }
  }
  
  void startPendingDeferredFragments()
  {
    if (this.mActive == null) {}
    for (;;)
    {
      return;
      for (int i = 0; i < this.mActive.size(); i++)
      {
        Fragment localFragment = (Fragment)this.mActive.valueAt(i);
        if (localFragment != null) {
          performPendingDeferredStart(localFragment);
        }
      }
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("FragmentManager{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" in ");
    if (this.mParent != null) {
      d.a(this.mParent, localStringBuilder);
    }
    for (;;)
    {
      localStringBuilder.append("}}");
      return localStringBuilder.toString();
      d.a(this.mHost, localStringBuilder);
    }
  }
  
  public void unregisterFragmentLifecycleCallbacks(FragmentManager.FragmentLifecycleCallbacks paramFragmentLifecycleCallbacks)
  {
    for (;;)
    {
      int j;
      synchronized (this.mLifecycleCallbacks)
      {
        int i = this.mLifecycleCallbacks.size();
        j = 0;
        if (j < i)
        {
          if (((j)this.mLifecycleCallbacks.get(j)).a == paramFragmentLifecycleCallbacks) {
            this.mLifecycleCallbacks.remove(j);
          }
        }
        else {
          return;
        }
      }
      j++;
    }
  }
  
  private static class AnimateOnHWLayerIfNeededListener
    extends FragmentManagerImpl.AnimationListenerWrapper
  {
    View mView;
    
    AnimateOnHWLayerIfNeededListener(View paramView, Animation.AnimationListener paramAnimationListener)
    {
      super(null);
      this.mView = paramView;
    }
    
    public void onAnimationEnd(Animation paramAnimation)
    {
      if ((s.A(this.mView)) || (Build.VERSION.SDK_INT >= 24)) {
        this.mView.post(new Runnable()
        {
          public void run()
          {
            FragmentManagerImpl.AnimateOnHWLayerIfNeededListener.this.mView.setLayerType(0, null);
          }
        });
      }
      for (;;)
      {
        super.onAnimationEnd(paramAnimation);
        return;
        this.mView.setLayerType(0, null);
      }
    }
  }
  
  private static class AnimationListenerWrapper
    implements Animation.AnimationListener
  {
    private final Animation.AnimationListener mWrapped;
    
    private AnimationListenerWrapper(Animation.AnimationListener paramAnimationListener)
    {
      this.mWrapped = paramAnimationListener;
    }
    
    public void onAnimationEnd(Animation paramAnimation)
    {
      if (this.mWrapped != null) {
        this.mWrapped.onAnimationEnd(paramAnimation);
      }
    }
    
    public void onAnimationRepeat(Animation paramAnimation)
    {
      if (this.mWrapped != null) {
        this.mWrapped.onAnimationRepeat(paramAnimation);
      }
    }
    
    public void onAnimationStart(Animation paramAnimation)
    {
      if (this.mWrapped != null) {
        this.mWrapped.onAnimationStart(paramAnimation);
      }
    }
  }
  
  private static class AnimationOrAnimator
  {
    public final Animation animation;
    public final Animator animator;
    
    private AnimationOrAnimator(Animator paramAnimator)
    {
      this.animation = null;
      this.animator = paramAnimator;
      if (paramAnimator == null) {
        throw new IllegalStateException("Animator cannot be null");
      }
    }
    
    private AnimationOrAnimator(Animation paramAnimation)
    {
      this.animation = paramAnimation;
      this.animator = null;
      if (paramAnimation == null) {
        throw new IllegalStateException("Animation cannot be null");
      }
    }
  }
  
  private static class AnimatorOnHWLayerIfNeededListener
    extends AnimatorListenerAdapter
  {
    View mView;
    
    AnimatorOnHWLayerIfNeededListener(View paramView)
    {
      this.mView = paramView;
    }
    
    public void onAnimationEnd(Animator paramAnimator)
    {
      this.mView.setLayerType(0, null);
      paramAnimator.removeListener(this);
    }
    
    public void onAnimationStart(Animator paramAnimator)
    {
      this.mView.setLayerType(2, null);
    }
  }
  
  private static class EndViewTransitionAnimator
    extends AnimationSet
    implements Runnable
  {
    private final View mChild;
    private boolean mEnded;
    private final ViewGroup mParent;
    private boolean mTransitionEnded;
    
    EndViewTransitionAnimator(Animation paramAnimation, ViewGroup paramViewGroup, View paramView)
    {
      super();
      this.mParent = paramViewGroup;
      this.mChild = paramView;
      addAnimation(paramAnimation);
    }
    
    public boolean getTransformation(long paramLong, Transformation paramTransformation)
    {
      if (this.mEnded) {
        if (this.mTransitionEnded) {}
      }
      while (super.getTransformation(paramLong, paramTransformation))
      {
        return true;
        return false;
      }
      this.mEnded = true;
      OneShotPreDrawListener.add(this.mParent, this);
      return true;
    }
    
    public boolean getTransformation(long paramLong, Transformation paramTransformation, float paramFloat)
    {
      if (this.mEnded) {
        if (this.mTransitionEnded) {}
      }
      while (super.getTransformation(paramLong, paramTransformation, paramFloat))
      {
        return true;
        return false;
      }
      this.mEnded = true;
      OneShotPreDrawListener.add(this.mParent, this);
      return true;
    }
    
    public void run()
    {
      this.mParent.endViewTransition(this.mChild);
      this.mTransitionEnded = true;
    }
  }
  
  static class FragmentTag
  {
    public static final int[] Fragment = { 16842755, 16842960, 16842961 };
    public static final int Fragment_id = 1;
    public static final int Fragment_name = 0;
    public static final int Fragment_tag = 2;
  }
  
  static abstract interface OpGenerator
  {
    public abstract boolean generateOps(ArrayList<BackStackRecord> paramArrayList, ArrayList<Boolean> paramArrayList1);
  }
  
  private class PopBackStackState
    implements FragmentManagerImpl.OpGenerator
  {
    final int mFlags;
    final int mId;
    final String mName;
    
    PopBackStackState(String paramString, int paramInt1, int paramInt2)
    {
      this.mName = paramString;
      this.mId = paramInt1;
      this.mFlags = paramInt2;
    }
    
    public boolean generateOps(ArrayList<BackStackRecord> paramArrayList, ArrayList<Boolean> paramArrayList1)
    {
      if ((FragmentManagerImpl.this.mPrimaryNav != null) && (this.mId < 0) && (this.mName == null))
      {
        FragmentManager localFragmentManager = FragmentManagerImpl.this.mPrimaryNav.peekChildFragmentManager();
        if ((localFragmentManager != null) && (localFragmentManager.popBackStackImmediate())) {
          return false;
        }
      }
      return FragmentManagerImpl.this.popBackStackState(paramArrayList, paramArrayList1, this.mName, this.mId, this.mFlags);
    }
  }
  
  static class StartEnterTransitionListener
    implements Fragment.OnStartEnterTransitionListener
  {
    private final boolean mIsBack;
    private int mNumPostponed;
    private final BackStackRecord mRecord;
    
    StartEnterTransitionListener(BackStackRecord paramBackStackRecord, boolean paramBoolean)
    {
      this.mIsBack = paramBoolean;
      this.mRecord = paramBackStackRecord;
    }
    
    public void cancelTransaction()
    {
      this.mRecord.mManager.completeExecute(this.mRecord, this.mIsBack, false, false);
    }
    
    public void completeTransaction()
    {
      if (this.mNumPostponed > 0) {}
      for (int i = 1;; i = 0)
      {
        FragmentManagerImpl localFragmentManagerImpl1 = this.mRecord.mManager;
        int j = localFragmentManagerImpl1.mAdded.size();
        for (int k = 0; k < j; k++)
        {
          Fragment localFragment = (Fragment)localFragmentManagerImpl1.mAdded.get(k);
          localFragment.setOnStartEnterTransitionListener(null);
          if ((i != 0) && (localFragment.isPostponed())) {
            localFragment.startPostponedEnterTransition();
          }
        }
      }
      FragmentManagerImpl localFragmentManagerImpl2 = this.mRecord.mManager;
      BackStackRecord localBackStackRecord = this.mRecord;
      boolean bool1 = this.mIsBack;
      boolean bool2 = false;
      if (i == 0) {
        bool2 = true;
      }
      localFragmentManagerImpl2.completeExecute(localBackStackRecord, bool1, bool2, true);
    }
    
    public boolean isReady()
    {
      return this.mNumPostponed == 0;
    }
    
    public void onStartEnterTransition()
    {
      this.mNumPostponed = (-1 + this.mNumPostponed);
      if (this.mNumPostponed != 0) {
        return;
      }
      this.mRecord.mManager.scheduleCommit();
    }
    
    public void startListening()
    {
      this.mNumPostponed = (1 + this.mNumPostponed);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.app.FragmentManagerImpl
 * JD-Core Version:    0.7.0.1
 */