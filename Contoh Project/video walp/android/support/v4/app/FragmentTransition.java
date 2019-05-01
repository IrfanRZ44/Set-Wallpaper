package android.support.v4.app;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.f.a;
import android.support.v4.view.s;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class FragmentTransition
{
  private static final int[] INVERSE_OPS = { 0, 3, 0, 1, 5, 4, 7, 6, 9, 8 };
  private static final FragmentTransitionImpl PLATFORM_IMPL;
  private static final FragmentTransitionImpl SUPPORT_IMPL;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 21) {}
    for (FragmentTransitionCompat21 localFragmentTransitionCompat21 = new FragmentTransitionCompat21();; localFragmentTransitionCompat21 = null)
    {
      PLATFORM_IMPL = localFragmentTransitionCompat21;
      SUPPORT_IMPL = resolveSupportImpl();
      return;
    }
  }
  
  private static void addSharedElementsWithMatchingNames(ArrayList<View> paramArrayList, a<String, View> parama, Collection<String> paramCollection)
  {
    for (int i = -1 + parama.size(); i >= 0; i--)
    {
      View localView = (View)parama.c(i);
      if (paramCollection.contains(s.n(localView))) {
        paramArrayList.add(localView);
      }
    }
  }
  
  private static void addToFirstInLastOut(BackStackRecord paramBackStackRecord, BackStackRecord.Op paramOp, SparseArray<FragmentContainerTransition> paramSparseArray, boolean paramBoolean1, boolean paramBoolean2)
  {
    Fragment localFragment = paramOp.fragment;
    if (localFragment == null) {}
    int i;
    do
    {
      return;
      i = localFragment.mContainerId;
    } while (i == 0);
    int j;
    label38:
    int i1;
    int m;
    int n;
    int i2;
    FragmentContainerTransition localFragmentContainerTransition1;
    FragmentContainerTransition localFragmentContainerTransition2;
    if (paramBoolean1)
    {
      j = INVERSE_OPS[paramOp.cmd];
      switch (j)
      {
      case 2: 
      default: 
        i1 = 0;
        m = 0;
        n = 0;
        i2 = 0;
        localFragmentContainerTransition1 = (FragmentContainerTransition)paramSparseArray.get(i);
        if (i2 != 0)
        {
          localFragmentContainerTransition2 = ensureContainer(localFragmentContainerTransition1, paramSparseArray, i);
          localFragmentContainerTransition2.lastIn = localFragment;
          localFragmentContainerTransition2.lastInIsPop = paramBoolean1;
          localFragmentContainerTransition2.lastInTransaction = paramBackStackRecord;
        }
        break;
      }
    }
    for (;;)
    {
      if ((!paramBoolean2) && (i1 != 0))
      {
        if ((localFragmentContainerTransition2 != null) && (localFragmentContainerTransition2.firstOut == localFragment)) {
          localFragmentContainerTransition2.firstOut = null;
        }
        FragmentManagerImpl localFragmentManagerImpl = paramBackStackRecord.mManager;
        if ((localFragment.mState < 1) && (localFragmentManagerImpl.mCurState >= 1) && (!paramBackStackRecord.mReorderingAllowed))
        {
          localFragmentManagerImpl.makeActive(localFragment);
          localFragmentManagerImpl.moveToState(localFragment, 1, 0, 0, false);
        }
      }
      FragmentContainerTransition localFragmentContainerTransition3;
      if ((m != 0) && ((localFragmentContainerTransition2 == null) || (localFragmentContainerTransition2.firstOut == null)))
      {
        localFragmentContainerTransition3 = ensureContainer(localFragmentContainerTransition2, paramSparseArray, i);
        localFragmentContainerTransition3.firstOut = localFragment;
        localFragmentContainerTransition3.firstOutIsPop = paramBoolean1;
        localFragmentContainerTransition3.firstOutTransaction = paramBackStackRecord;
      }
      while ((!paramBoolean2) && (n != 0) && (localFragmentContainerTransition3 != null) && (localFragmentContainerTransition3.lastIn == localFragment))
      {
        localFragmentContainerTransition3.lastIn = null;
        return;
        j = paramOp.cmd;
        break label38;
        boolean bool2;
        if (paramBoolean2) {
          if ((localFragment.mHiddenChanged) && (!localFragment.mHidden) && (localFragment.mAdded)) {
            bool2 = true;
          }
        }
        for (;;)
        {
          i1 = 1;
          i2 = bool2;
          m = 0;
          n = 0;
          break;
          bool2 = false;
          continue;
          bool2 = localFragment.mHidden;
        }
        boolean bool1;
        if (paramBoolean2) {
          bool1 = localFragment.mIsNewlyAdded;
        }
        for (;;)
        {
          i1 = 1;
          i2 = bool1;
          m = 0;
          n = 0;
          break;
          if ((!localFragment.mAdded) && (!localFragment.mHidden)) {
            bool1 = true;
          } else {
            bool1 = false;
          }
        }
        int i3;
        if (paramBoolean2) {
          if ((localFragment.mHiddenChanged) && (localFragment.mAdded) && (localFragment.mHidden)) {
            i3 = 1;
          }
        }
        for (;;)
        {
          m = i3;
          n = 1;
          i1 = 0;
          i2 = 0;
          break;
          i3 = 0;
          continue;
          if ((localFragment.mAdded) && (!localFragment.mHidden)) {
            i3 = 1;
          } else {
            i3 = 0;
          }
        }
        int k;
        if (paramBoolean2) {
          if ((!localFragment.mAdded) && (localFragment.mView != null) && (localFragment.mView.getVisibility() == 0) && (localFragment.mPostponedAlpha >= 0.0F)) {
            k = 1;
          }
        }
        for (;;)
        {
          m = k;
          n = 1;
          i1 = 0;
          i2 = 0;
          break;
          k = 0;
          continue;
          if ((localFragment.mAdded) && (!localFragment.mHidden)) {
            k = 1;
          } else {
            k = 0;
          }
        }
        localFragmentContainerTransition3 = localFragmentContainerTransition2;
      }
      localFragmentContainerTransition2 = localFragmentContainerTransition1;
    }
  }
  
  public static void calculateFragments(BackStackRecord paramBackStackRecord, SparseArray<FragmentContainerTransition> paramSparseArray, boolean paramBoolean)
  {
    int i = paramBackStackRecord.mOps.size();
    for (int j = 0; j < i; j++) {
      addToFirstInLastOut(paramBackStackRecord, (BackStackRecord.Op)paramBackStackRecord.mOps.get(j), paramSparseArray, false, paramBoolean);
    }
  }
  
  private static a<String, String> calculateNameOverrides(int paramInt1, ArrayList<BackStackRecord> paramArrayList, ArrayList<Boolean> paramArrayList1, int paramInt2, int paramInt3)
  {
    a locala = new a();
    int i = paramInt3 - 1;
    if (i >= paramInt2)
    {
      BackStackRecord localBackStackRecord = (BackStackRecord)paramArrayList.get(i);
      if (!localBackStackRecord.interactsWith(paramInt1)) {}
      boolean bool;
      do
      {
        i--;
        break;
        bool = ((Boolean)paramArrayList1.get(i)).booleanValue();
      } while (localBackStackRecord.mSharedElementSourceNames == null);
      int j = localBackStackRecord.mSharedElementSourceNames.size();
      ArrayList localArrayList2;
      Object localObject;
      label106:
      int k;
      label109:
      String str1;
      String str2;
      if (bool)
      {
        ArrayList localArrayList3 = localBackStackRecord.mSharedElementSourceNames;
        ArrayList localArrayList4 = localBackStackRecord.mSharedElementTargetNames;
        localArrayList2 = localArrayList3;
        localObject = localArrayList4;
        k = 0;
        if (k < j)
        {
          str1 = (String)((ArrayList)localObject).get(k);
          str2 = (String)localArrayList2.get(k);
          String str3 = (String)locala.remove(str2);
          if (str3 == null) {
            break label194;
          }
          locala.put(str1, str3);
        }
      }
      for (;;)
      {
        k++;
        break label109;
        break;
        ArrayList localArrayList1 = localBackStackRecord.mSharedElementSourceNames;
        localArrayList2 = localBackStackRecord.mSharedElementTargetNames;
        localObject = localArrayList1;
        break label106;
        label194:
        locala.put(str1, str2);
      }
    }
    return locala;
  }
  
  public static void calculatePopFragments(BackStackRecord paramBackStackRecord, SparseArray<FragmentContainerTransition> paramSparseArray, boolean paramBoolean)
  {
    if (!paramBackStackRecord.mManager.mContainer.onHasView()) {}
    for (;;)
    {
      return;
      for (int i = -1 + paramBackStackRecord.mOps.size(); i >= 0; i--) {
        addToFirstInLastOut(paramBackStackRecord, (BackStackRecord.Op)paramBackStackRecord.mOps.get(i), paramSparseArray, true, paramBoolean);
      }
    }
  }
  
  private static void callSharedElementStartEnd(Fragment paramFragment1, Fragment paramFragment2, boolean paramBoolean1, a<String, View> parama, boolean paramBoolean2)
  {
    int i = 0;
    SharedElementCallback localSharedElementCallback;
    ArrayList localArrayList1;
    ArrayList localArrayList2;
    int j;
    if (paramBoolean1)
    {
      localSharedElementCallback = paramFragment2.getEnterTransitionCallback();
      if (localSharedElementCallback == null) {
        break label116;
      }
      localArrayList1 = new ArrayList();
      localArrayList2 = new ArrayList();
      if (parama != null) {
        break label89;
      }
      j = 0;
    }
    for (;;)
    {
      if (i >= j) {
        break label101;
      }
      localArrayList2.add(parama.b(i));
      localArrayList1.add(parama.c(i));
      i++;
      continue;
      localSharedElementCallback = paramFragment1.getEnterTransitionCallback();
      break;
      label89:
      j = parama.size();
      i = 0;
    }
    label101:
    if (paramBoolean2)
    {
      localSharedElementCallback.onSharedElementStart(localArrayList2, localArrayList1, null);
      label116:
      return;
    }
    localSharedElementCallback.onSharedElementEnd(localArrayList2, localArrayList1, null);
  }
  
  private static boolean canHandleAll(FragmentTransitionImpl paramFragmentTransitionImpl, List<Object> paramList)
  {
    int i = paramList.size();
    for (int j = 0; j < i; j++) {
      if (!paramFragmentTransitionImpl.canHandle(paramList.get(j))) {
        return false;
      }
    }
    return true;
  }
  
  private static a<String, View> captureInSharedElements(FragmentTransitionImpl paramFragmentTransitionImpl, a<String, String> parama, Object paramObject, FragmentContainerTransition paramFragmentContainerTransition)
  {
    Fragment localFragment = paramFragmentContainerTransition.lastIn;
    View localView1 = localFragment.getView();
    if ((parama.isEmpty()) || (paramObject == null) || (localView1 == null))
    {
      parama.clear();
      return null;
    }
    a locala = new a();
    paramFragmentTransitionImpl.findNamedViews(locala, localView1);
    BackStackRecord localBackStackRecord = paramFragmentContainerTransition.lastInTransaction;
    ArrayList localArrayList;
    Object localObject;
    int i;
    label129:
    String str1;
    View localView2;
    if (paramFragmentContainerTransition.lastInIsPop)
    {
      SharedElementCallback localSharedElementCallback2 = localFragment.getExitTransitionCallback();
      localArrayList = localBackStackRecord.mSharedElementSourceNames;
      localObject = localSharedElementCallback2;
      if (localArrayList != null)
      {
        locala.a(localArrayList);
        locala.a(parama.values());
      }
      if (localObject == null) {
        break label251;
      }
      ((SharedElementCallback)localObject).onMapSharedElements(localArrayList, locala);
      i = -1 + localArrayList.size();
      if (i < 0) {
        break label257;
      }
      str1 = (String)localArrayList.get(i);
      localView2 = (View)locala.get(str1);
      if (localView2 != null) {
        break label210;
      }
      String str3 = findKeyForValue(parama, str1);
      if (str3 != null) {
        parama.remove(str3);
      }
    }
    for (;;)
    {
      i--;
      break label129;
      SharedElementCallback localSharedElementCallback1 = localFragment.getEnterTransitionCallback();
      localArrayList = localBackStackRecord.mSharedElementTargetNames;
      localObject = localSharedElementCallback1;
      break;
      label210:
      if (!str1.equals(s.n(localView2)))
      {
        String str2 = findKeyForValue(parama, str1);
        if (str2 != null) {
          parama.put(str2, s.n(localView2));
        }
      }
    }
    label251:
    retainValues(parama, locala);
    label257:
    return locala;
  }
  
  private static a<String, View> captureOutSharedElements(FragmentTransitionImpl paramFragmentTransitionImpl, a<String, String> parama, Object paramObject, FragmentContainerTransition paramFragmentContainerTransition)
  {
    if ((parama.isEmpty()) || (paramObject == null))
    {
      parama.clear();
      return null;
    }
    Fragment localFragment = paramFragmentContainerTransition.firstOut;
    a locala = new a();
    paramFragmentTransitionImpl.findNamedViews(locala, localFragment.getView());
    BackStackRecord localBackStackRecord = paramFragmentContainerTransition.firstOutTransaction;
    ArrayList localArrayList;
    Object localObject;
    int i;
    label105:
    String str1;
    View localView;
    if (paramFragmentContainerTransition.firstOutIsPop)
    {
      SharedElementCallback localSharedElementCallback2 = localFragment.getEnterTransitionCallback();
      localArrayList = localBackStackRecord.mSharedElementTargetNames;
      localObject = localSharedElementCallback2;
      locala.a(localArrayList);
      if (localObject == null) {
        break label212;
      }
      ((SharedElementCallback)localObject).onMapSharedElements(localArrayList, locala);
      i = -1 + localArrayList.size();
      if (i < 0) {
        break label222;
      }
      str1 = (String)localArrayList.get(i);
      localView = (View)locala.get(str1);
      if (localView != null) {
        break label173;
      }
      parama.remove(str1);
    }
    for (;;)
    {
      i--;
      break label105;
      SharedElementCallback localSharedElementCallback1 = localFragment.getExitTransitionCallback();
      localArrayList = localBackStackRecord.mSharedElementSourceNames;
      localObject = localSharedElementCallback1;
      break;
      label173:
      if (!str1.equals(s.n(localView)))
      {
        String str2 = (String)parama.remove(str1);
        parama.put(s.n(localView), str2);
      }
    }
    label212:
    parama.a(locala.keySet());
    label222:
    return locala;
  }
  
  private static FragmentTransitionImpl chooseImpl(Fragment paramFragment1, Fragment paramFragment2)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramFragment1 != null)
    {
      Object localObject4 = paramFragment1.getExitTransition();
      if (localObject4 != null) {
        localArrayList.add(localObject4);
      }
      Object localObject5 = paramFragment1.getReturnTransition();
      if (localObject5 != null) {
        localArrayList.add(localObject5);
      }
      Object localObject6 = paramFragment1.getSharedElementReturnTransition();
      if (localObject6 != null) {
        localArrayList.add(localObject6);
      }
    }
    if (paramFragment2 != null)
    {
      Object localObject1 = paramFragment2.getEnterTransition();
      if (localObject1 != null) {
        localArrayList.add(localObject1);
      }
      Object localObject2 = paramFragment2.getReenterTransition();
      if (localObject2 != null) {
        localArrayList.add(localObject2);
      }
      Object localObject3 = paramFragment2.getSharedElementEnterTransition();
      if (localObject3 != null) {
        localArrayList.add(localObject3);
      }
    }
    if (localArrayList.isEmpty()) {}
    do
    {
      return null;
      if ((PLATFORM_IMPL != null) && (canHandleAll(PLATFORM_IMPL, localArrayList))) {
        return PLATFORM_IMPL;
      }
      if ((SUPPORT_IMPL != null) && (canHandleAll(SUPPORT_IMPL, localArrayList))) {
        return SUPPORT_IMPL;
      }
    } while ((PLATFORM_IMPL == null) && (SUPPORT_IMPL == null));
    throw new IllegalArgumentException("Invalid Transition types");
  }
  
  private static ArrayList<View> configureEnteringExitingViews(FragmentTransitionImpl paramFragmentTransitionImpl, Object paramObject, Fragment paramFragment, ArrayList<View> paramArrayList, View paramView)
  {
    ArrayList localArrayList = null;
    if (paramObject != null)
    {
      localArrayList = new ArrayList();
      View localView = paramFragment.getView();
      if (localView != null) {
        paramFragmentTransitionImpl.captureTransitioningViews(localArrayList, localView);
      }
      if (paramArrayList != null) {
        localArrayList.removeAll(paramArrayList);
      }
      if (!localArrayList.isEmpty())
      {
        localArrayList.add(paramView);
        paramFragmentTransitionImpl.addTargets(paramObject, localArrayList);
      }
    }
    return localArrayList;
  }
  
  private static Object configureSharedElementsOrdered(FragmentTransitionImpl paramFragmentTransitionImpl, ViewGroup paramViewGroup, final View paramView, final a<String, String> parama, final FragmentContainerTransition paramFragmentContainerTransition, final ArrayList<View> paramArrayList1, final ArrayList<View> paramArrayList2, final Object paramObject1, Object paramObject2)
  {
    final Fragment localFragment1 = paramFragmentContainerTransition.lastIn;
    final Fragment localFragment2 = paramFragmentContainerTransition.firstOut;
    if ((localFragment1 == null) || (localFragment2 == null)) {
      return null;
    }
    final boolean bool = paramFragmentContainerTransition.lastInIsPop;
    Object localObject1;
    a locala;
    if (parama.isEmpty())
    {
      localObject1 = null;
      locala = captureOutSharedElements(paramFragmentTransitionImpl, parama, localObject1, paramFragmentContainerTransition);
      if (!parama.isEmpty()) {
        break label96;
      }
    }
    for (final Object localObject2 = null;; localObject2 = localObject1)
    {
      if ((paramObject1 != null) || (paramObject2 != null) || (localObject2 != null)) {
        break label114;
      }
      return null;
      localObject1 = getSharedElementTransition(paramFragmentTransitionImpl, localFragment1, localFragment2, bool);
      break;
      label96:
      paramArrayList1.addAll(locala.values());
    }
    label114:
    callSharedElementStartEnd(localFragment1, localFragment2, bool, locala, true);
    final Rect localRect;
    if (localObject2 != null)
    {
      localRect = new Rect();
      paramFragmentTransitionImpl.setSharedElementTargets(localObject2, paramView, paramArrayList1);
      setOutEpicenter(paramFragmentTransitionImpl, localObject2, paramObject2, locala, paramFragmentContainerTransition.firstOutIsPop, paramFragmentContainerTransition.firstOutTransaction);
      if (paramObject1 != null) {
        paramFragmentTransitionImpl.setEpicenter(paramObject1, localRect);
      }
    }
    for (;;)
    {
      OneShotPreDrawListener.add(paramViewGroup, new Runnable()
      {
        public void run()
        {
          a locala = FragmentTransition.captureInSharedElements(this.val$impl, parama, localObject2, paramFragmentContainerTransition);
          if (locala != null)
          {
            paramArrayList2.addAll(locala.values());
            paramArrayList2.add(paramView);
          }
          FragmentTransition.callSharedElementStartEnd(localFragment1, localFragment2, bool, locala, false);
          if (localObject2 != null)
          {
            this.val$impl.swapSharedElementTargets(localObject2, paramArrayList1, paramArrayList2);
            View localView = FragmentTransition.getInEpicenterView(locala, paramFragmentContainerTransition, paramObject1, bool);
            if (localView != null) {
              this.val$impl.getBoundsOnScreen(localView, localRect);
            }
          }
        }
      });
      return localObject2;
      localRect = null;
    }
  }
  
  private static Object configureSharedElementsReordered(final FragmentTransitionImpl paramFragmentTransitionImpl, ViewGroup paramViewGroup, View paramView, a<String, String> parama, FragmentContainerTransition paramFragmentContainerTransition, ArrayList<View> paramArrayList1, ArrayList<View> paramArrayList2, Object paramObject1, Object paramObject2)
  {
    Fragment localFragment1 = paramFragmentContainerTransition.lastIn;
    final Fragment localFragment2 = paramFragmentContainerTransition.firstOut;
    if (localFragment1 != null) {
      localFragment1.getView().setVisibility(0);
    }
    if ((localFragment1 == null) || (localFragment2 == null)) {
      return null;
    }
    final boolean bool = paramFragmentContainerTransition.lastInIsPop;
    Object localObject1;
    a locala1;
    final a locala2;
    Object localObject2;
    if (parama.isEmpty())
    {
      localObject1 = null;
      locala1 = captureOutSharedElements(paramFragmentTransitionImpl, parama, localObject1, paramFragmentContainerTransition);
      locala2 = captureInSharedElements(paramFragmentTransitionImpl, parama, localObject1, paramFragmentContainerTransition);
      if (!parama.isEmpty()) {
        break label141;
      }
      if (locala1 != null) {
        locala1.clear();
      }
      localObject2 = null;
      if (locala2 != null) {
        locala2.clear();
      }
    }
    for (;;)
    {
      if ((paramObject1 != null) || (paramObject2 != null) || (localObject2 != null)) {
        break label170;
      }
      return null;
      localObject1 = getSharedElementTransition(paramFragmentTransitionImpl, localFragment1, localFragment2, bool);
      break;
      label141:
      addSharedElementsWithMatchingNames(paramArrayList1, locala1, parama.keySet());
      addSharedElementsWithMatchingNames(paramArrayList2, locala2, parama.values());
      localObject2 = localObject1;
    }
    label170:
    callSharedElementStartEnd(localFragment1, localFragment2, bool, locala1, true);
    final Rect localRect;
    final View localView;
    if (localObject2 != null)
    {
      paramArrayList2.add(paramView);
      paramFragmentTransitionImpl.setSharedElementTargets(localObject2, paramView, paramArrayList1);
      setOutEpicenter(paramFragmentTransitionImpl, localObject2, paramObject2, locala1, paramFragmentContainerTransition.firstOutIsPop, paramFragmentContainerTransition.firstOutTransaction);
      localRect = new Rect();
      localView = getInEpicenterView(locala2, paramFragmentContainerTransition, paramObject1, bool);
      if (localView != null) {
        paramFragmentTransitionImpl.setEpicenter(paramObject1, localRect);
      }
    }
    for (;;)
    {
      OneShotPreDrawListener.add(paramViewGroup, new Runnable()
      {
        public void run()
        {
          FragmentTransition.callSharedElementStartEnd(this.val$inFragment, localFragment2, bool, locala2, false);
          if (localView != null) {
            paramFragmentTransitionImpl.getBoundsOnScreen(localView, localRect);
          }
        }
      });
      return localObject2;
      localView = null;
      localRect = null;
    }
  }
  
  private static void configureTransitionsOrdered(FragmentManagerImpl paramFragmentManagerImpl, int paramInt, FragmentContainerTransition paramFragmentContainerTransition, View paramView, a<String, String> parama)
  {
    boolean bool1 = paramFragmentManagerImpl.mContainer.onHasView();
    ViewGroup localViewGroup = null;
    if (bool1) {
      localViewGroup = (ViewGroup)paramFragmentManagerImpl.mContainer.onFindViewById(paramInt);
    }
    if (localViewGroup == null) {}
    Fragment localFragment1;
    Fragment localFragment2;
    FragmentTransitionImpl localFragmentTransitionImpl;
    Object localObject1;
    Object localObject2;
    ArrayList localArrayList1;
    ArrayList localArrayList2;
    Object localObject3;
    do
    {
      do
      {
        return;
        localFragment1 = paramFragmentContainerTransition.lastIn;
        localFragment2 = paramFragmentContainerTransition.firstOut;
        localFragmentTransitionImpl = chooseImpl(localFragment2, localFragment1);
      } while (localFragmentTransitionImpl == null);
      boolean bool2 = paramFragmentContainerTransition.lastInIsPop;
      boolean bool3 = paramFragmentContainerTransition.firstOutIsPop;
      localObject1 = getEnterTransition(localFragmentTransitionImpl, localFragment1, bool2);
      localObject2 = getExitTransition(localFragmentTransitionImpl, localFragment2, bool3);
      localArrayList1 = new ArrayList();
      localArrayList2 = new ArrayList();
      localObject3 = configureSharedElementsOrdered(localFragmentTransitionImpl, localViewGroup, paramView, parama, paramFragmentContainerTransition, localArrayList1, localArrayList2, localObject1, localObject2);
    } while ((localObject1 == null) && (localObject3 == null) && (localObject2 == null));
    ArrayList localArrayList3 = configureEnteringExitingViews(localFragmentTransitionImpl, localObject2, localFragment2, localArrayList1, paramView);
    if ((localArrayList3 == null) || (localArrayList3.isEmpty())) {}
    for (Object localObject4 = null;; localObject4 = localObject2)
    {
      localFragmentTransitionImpl.addTarget(localObject1, paramView);
      Object localObject5 = mergeTransitions(localFragmentTransitionImpl, localObject1, localObject4, localObject3, localFragment1, paramFragmentContainerTransition.lastInIsPop);
      if (localObject5 == null) {
        break;
      }
      ArrayList localArrayList4 = new ArrayList();
      localFragmentTransitionImpl.scheduleRemoveTargets(localObject5, localObject1, localArrayList4, localObject4, localArrayList3, localObject3, localArrayList2);
      scheduleTargetChange(localFragmentTransitionImpl, localViewGroup, localFragment1, paramView, localArrayList2, localObject1, localArrayList4, localObject4, localArrayList3);
      localFragmentTransitionImpl.setNameOverridesOrdered(localViewGroup, localArrayList2, parama);
      localFragmentTransitionImpl.beginDelayedTransition(localViewGroup, localObject5);
      localFragmentTransitionImpl.scheduleNameReset(localViewGroup, localArrayList2, parama);
      return;
    }
  }
  
  private static void configureTransitionsReordered(FragmentManagerImpl paramFragmentManagerImpl, int paramInt, FragmentContainerTransition paramFragmentContainerTransition, View paramView, a<String, String> parama)
  {
    boolean bool1 = paramFragmentManagerImpl.mContainer.onHasView();
    ViewGroup localViewGroup = null;
    if (bool1) {
      localViewGroup = (ViewGroup)paramFragmentManagerImpl.mContainer.onFindViewById(paramInt);
    }
    if (localViewGroup == null) {}
    Fragment localFragment2;
    FragmentTransitionImpl localFragmentTransitionImpl;
    ArrayList localArrayList1;
    ArrayList localArrayList2;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    ArrayList localArrayList3;
    ArrayList localArrayList4;
    Object localObject4;
    do
    {
      Fragment localFragment1;
      boolean bool2;
      do
      {
        do
        {
          return;
          localFragment1 = paramFragmentContainerTransition.lastIn;
          localFragment2 = paramFragmentContainerTransition.firstOut;
          localFragmentTransitionImpl = chooseImpl(localFragment2, localFragment1);
        } while (localFragmentTransitionImpl == null);
        bool2 = paramFragmentContainerTransition.lastInIsPop;
        boolean bool3 = paramFragmentContainerTransition.firstOutIsPop;
        localArrayList1 = new ArrayList();
        localArrayList2 = new ArrayList();
        localObject1 = getEnterTransition(localFragmentTransitionImpl, localFragment1, bool2);
        localObject2 = getExitTransition(localFragmentTransitionImpl, localFragment2, bool3);
        localObject3 = configureSharedElementsReordered(localFragmentTransitionImpl, localViewGroup, paramView, parama, paramFragmentContainerTransition, localArrayList2, localArrayList1, localObject1, localObject2);
      } while ((localObject1 == null) && (localObject3 == null) && (localObject2 == null));
      localArrayList3 = configureEnteringExitingViews(localFragmentTransitionImpl, localObject2, localFragment2, localArrayList2, paramView);
      localArrayList4 = configureEnteringExitingViews(localFragmentTransitionImpl, localObject1, localFragment1, localArrayList1, paramView);
      setViewVisibility(localArrayList4, 4);
      localObject4 = mergeTransitions(localFragmentTransitionImpl, localObject1, localObject2, localObject3, localFragment1, bool2);
    } while (localObject4 == null);
    replaceHide(localFragmentTransitionImpl, localObject2, localFragment2, localArrayList3);
    ArrayList localArrayList5 = localFragmentTransitionImpl.prepareSetNameOverridesReordered(localArrayList1);
    localFragmentTransitionImpl.scheduleRemoveTargets(localObject4, localObject1, localArrayList4, localObject2, localArrayList3, localObject3, localArrayList1);
    localFragmentTransitionImpl.beginDelayedTransition(localViewGroup, localObject4);
    localFragmentTransitionImpl.setNameOverridesReordered(localViewGroup, localArrayList2, localArrayList1, localArrayList5, parama);
    setViewVisibility(localArrayList4, 0);
    localFragmentTransitionImpl.swapSharedElementTargets(localObject3, localArrayList2, localArrayList1);
  }
  
  private static FragmentContainerTransition ensureContainer(FragmentContainerTransition paramFragmentContainerTransition, SparseArray<FragmentContainerTransition> paramSparseArray, int paramInt)
  {
    if (paramFragmentContainerTransition == null)
    {
      paramFragmentContainerTransition = new FragmentContainerTransition();
      paramSparseArray.put(paramInt, paramFragmentContainerTransition);
    }
    return paramFragmentContainerTransition;
  }
  
  private static String findKeyForValue(a<String, String> parama, String paramString)
  {
    int i = parama.size();
    for (int j = 0; j < i; j++) {
      if (paramString.equals(parama.c(j))) {
        return (String)parama.b(j);
      }
    }
    return null;
  }
  
  private static Object getEnterTransition(FragmentTransitionImpl paramFragmentTransitionImpl, Fragment paramFragment, boolean paramBoolean)
  {
    if (paramFragment == null) {
      return null;
    }
    if (paramBoolean) {}
    for (Object localObject = paramFragment.getReenterTransition();; localObject = paramFragment.getEnterTransition()) {
      return paramFragmentTransitionImpl.cloneTransition(localObject);
    }
  }
  
  private static Object getExitTransition(FragmentTransitionImpl paramFragmentTransitionImpl, Fragment paramFragment, boolean paramBoolean)
  {
    if (paramFragment == null) {
      return null;
    }
    if (paramBoolean) {}
    for (Object localObject = paramFragment.getReturnTransition();; localObject = paramFragment.getExitTransition()) {
      return paramFragmentTransitionImpl.cloneTransition(localObject);
    }
  }
  
  private static View getInEpicenterView(a<String, View> parama, FragmentContainerTransition paramFragmentContainerTransition, Object paramObject, boolean paramBoolean)
  {
    BackStackRecord localBackStackRecord = paramFragmentContainerTransition.lastInTransaction;
    if ((paramObject != null) && (parama != null) && (localBackStackRecord.mSharedElementSourceNames != null) && (!localBackStackRecord.mSharedElementSourceNames.isEmpty()))
    {
      if (paramBoolean) {}
      for (String str = (String)localBackStackRecord.mSharedElementSourceNames.get(0);; str = (String)localBackStackRecord.mSharedElementTargetNames.get(0)) {
        return (View)parama.get(str);
      }
    }
    return null;
  }
  
  private static Object getSharedElementTransition(FragmentTransitionImpl paramFragmentTransitionImpl, Fragment paramFragment1, Fragment paramFragment2, boolean paramBoolean)
  {
    if ((paramFragment1 == null) || (paramFragment2 == null)) {
      return null;
    }
    if (paramBoolean) {}
    for (Object localObject = paramFragment2.getSharedElementReturnTransition();; localObject = paramFragment1.getSharedElementEnterTransition()) {
      return paramFragmentTransitionImpl.wrapTransitionInSet(paramFragmentTransitionImpl.cloneTransition(localObject));
    }
  }
  
  private static Object mergeTransitions(FragmentTransitionImpl paramFragmentTransitionImpl, Object paramObject1, Object paramObject2, Object paramObject3, Fragment paramFragment, boolean paramBoolean)
  {
    boolean bool = true;
    if ((paramObject1 != null) && (paramObject2 != null) && (paramFragment != null)) {
      if (!paramBoolean) {
        break label41;
      }
    }
    label41:
    for (bool = paramFragment.getAllowReturnTransitionOverlap(); bool; bool = paramFragment.getAllowEnterTransitionOverlap()) {
      return paramFragmentTransitionImpl.mergeTransitionsTogether(paramObject2, paramObject1, paramObject3);
    }
    return paramFragmentTransitionImpl.mergeTransitionsInSequence(paramObject2, paramObject1, paramObject3);
  }
  
  private static void replaceHide(FragmentTransitionImpl paramFragmentTransitionImpl, Object paramObject, Fragment paramFragment, ArrayList<View> paramArrayList)
  {
    if ((paramFragment != null) && (paramObject != null) && (paramFragment.mAdded) && (paramFragment.mHidden) && (paramFragment.mHiddenChanged))
    {
      paramFragment.setHideReplaced(true);
      paramFragmentTransitionImpl.scheduleHideFragmentView(paramObject, paramFragment.getView(), paramArrayList);
      OneShotPreDrawListener.add(paramFragment.mContainer, new Runnable()
      {
        public void run()
        {
          FragmentTransition.setViewVisibility(this.val$exitingViews, 4);
        }
      });
    }
  }
  
  private static FragmentTransitionImpl resolveSupportImpl()
  {
    try
    {
      FragmentTransitionImpl localFragmentTransitionImpl = (FragmentTransitionImpl)Class.forName("android.support.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
      return localFragmentTransitionImpl;
    }
    catch (Exception localException) {}
    return null;
  }
  
  private static void retainValues(a<String, String> parama, a<String, View> parama1)
  {
    for (int i = -1 + parama.size(); i >= 0; i--) {
      if (!parama1.containsKey((String)parama.c(i))) {
        parama.d(i);
      }
    }
  }
  
  private static void scheduleTargetChange(final FragmentTransitionImpl paramFragmentTransitionImpl, ViewGroup paramViewGroup, final Fragment paramFragment, final View paramView, final ArrayList<View> paramArrayList1, Object paramObject1, final ArrayList<View> paramArrayList2, final Object paramObject2, final ArrayList<View> paramArrayList3)
  {
    OneShotPreDrawListener.add(paramViewGroup, new Runnable()
    {
      public void run()
      {
        if (this.val$enterTransition != null)
        {
          paramFragmentTransitionImpl.removeTarget(this.val$enterTransition, paramView);
          ArrayList localArrayList2 = FragmentTransition.configureEnteringExitingViews(paramFragmentTransitionImpl, this.val$enterTransition, paramFragment, paramArrayList1, paramView);
          paramArrayList2.addAll(localArrayList2);
        }
        if (paramArrayList3 != null)
        {
          if (paramObject2 != null)
          {
            ArrayList localArrayList1 = new ArrayList();
            localArrayList1.add(paramView);
            paramFragmentTransitionImpl.replaceTargets(paramObject2, paramArrayList3, localArrayList1);
          }
          paramArrayList3.clear();
          paramArrayList3.add(paramView);
        }
      }
    });
  }
  
  private static void setOutEpicenter(FragmentTransitionImpl paramFragmentTransitionImpl, Object paramObject1, Object paramObject2, a<String, View> parama, boolean paramBoolean, BackStackRecord paramBackStackRecord)
  {
    if ((paramBackStackRecord.mSharedElementSourceNames != null) && (!paramBackStackRecord.mSharedElementSourceNames.isEmpty())) {
      if (!paramBoolean) {
        break label68;
      }
    }
    label68:
    for (String str = (String)paramBackStackRecord.mSharedElementTargetNames.get(0);; str = (String)paramBackStackRecord.mSharedElementSourceNames.get(0))
    {
      View localView = (View)parama.get(str);
      paramFragmentTransitionImpl.setEpicenter(paramObject1, localView);
      if (paramObject2 != null) {
        paramFragmentTransitionImpl.setEpicenter(paramObject2, localView);
      }
      return;
    }
  }
  
  private static void setViewVisibility(ArrayList<View> paramArrayList, int paramInt)
  {
    if (paramArrayList == null) {}
    for (;;)
    {
      return;
      for (int i = -1 + paramArrayList.size(); i >= 0; i--) {
        ((View)paramArrayList.get(i)).setVisibility(paramInt);
      }
    }
  }
  
  static void startTransitions(FragmentManagerImpl paramFragmentManagerImpl, ArrayList<BackStackRecord> paramArrayList, ArrayList<Boolean> paramArrayList1, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramFragmentManagerImpl.mCurState < 1) {}
    SparseArray localSparseArray;
    do
    {
      return;
      localSparseArray = new SparseArray();
      int i = paramInt1;
      if (i < paramInt2)
      {
        BackStackRecord localBackStackRecord = (BackStackRecord)paramArrayList.get(i);
        if (((Boolean)paramArrayList1.get(i)).booleanValue()) {
          calculatePopFragments(localBackStackRecord, localSparseArray, paramBoolean);
        }
        for (;;)
        {
          i++;
          break;
          calculateFragments(localBackStackRecord, localSparseArray, paramBoolean);
        }
      }
    } while (localSparseArray.size() == 0);
    View localView = new View(paramFragmentManagerImpl.mHost.getContext());
    int j = localSparseArray.size();
    int k = 0;
    label115:
    int m;
    a locala;
    FragmentContainerTransition localFragmentContainerTransition;
    if (k < j)
    {
      m = localSparseArray.keyAt(k);
      locala = calculateNameOverrides(m, paramArrayList, paramArrayList1, paramInt1, paramInt2);
      localFragmentContainerTransition = (FragmentContainerTransition)localSparseArray.valueAt(k);
      if (!paramBoolean) {
        break label178;
      }
      configureTransitionsReordered(paramFragmentManagerImpl, m, localFragmentContainerTransition, localView, locala);
    }
    for (;;)
    {
      k++;
      break label115;
      break;
      label178:
      configureTransitionsOrdered(paramFragmentManagerImpl, m, localFragmentContainerTransition, localView, locala);
    }
  }
  
  static boolean supportsTransition()
  {
    return (PLATFORM_IMPL != null) || (SUPPORT_IMPL != null);
  }
  
  static class FragmentContainerTransition
  {
    public Fragment firstOut;
    public boolean firstOutIsPop;
    public BackStackRecord firstOutTransaction;
    public Fragment lastIn;
    public boolean lastInIsPop;
    public BackStackRecord lastInTransaction;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.app.FragmentTransition
 * JD-Core Version:    0.7.0.1
 */