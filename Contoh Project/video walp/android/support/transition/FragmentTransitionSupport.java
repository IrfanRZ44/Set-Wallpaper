package android.support.transition;

import android.graphics.Rect;
import android.support.v4.app.FragmentTransitionImpl;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public class FragmentTransitionSupport
  extends FragmentTransitionImpl
{
  private static boolean a(Transition paramTransition)
  {
    return (!isNullOrEmpty(paramTransition.f())) || (!isNullOrEmpty(paramTransition.h())) || (!isNullOrEmpty(paramTransition.i()));
  }
  
  public void addTarget(Object paramObject, View paramView)
  {
    if (paramObject != null) {
      ((Transition)paramObject).c(paramView);
    }
  }
  
  public void addTargets(Object paramObject, ArrayList<View> paramArrayList)
  {
    int i = 0;
    Transition localTransition = (Transition)paramObject;
    if (localTransition == null) {}
    for (;;)
    {
      return;
      if ((localTransition instanceof TransitionSet))
      {
        TransitionSet localTransitionSet = (TransitionSet)localTransition;
        int m = localTransitionSet.p();
        while (i < m)
        {
          addTargets(localTransitionSet.b(i), paramArrayList);
          i++;
        }
      }
      else if ((!a(localTransition)) && (isNullOrEmpty(localTransition.g())))
      {
        int j = paramArrayList.size();
        for (int k = 0; k < j; k++) {
          localTransition.c((View)paramArrayList.get(k));
        }
      }
    }
  }
  
  public void beginDelayedTransition(ViewGroup paramViewGroup, Object paramObject)
  {
    ae.a(paramViewGroup, (Transition)paramObject);
  }
  
  public boolean canHandle(Object paramObject)
  {
    return paramObject instanceof Transition;
  }
  
  public Object cloneTransition(Object paramObject)
  {
    Transition localTransition = null;
    if (paramObject != null) {
      localTransition = ((Transition)paramObject).n();
    }
    return localTransition;
  }
  
  public Object mergeTransitionsInSequence(Object paramObject1, Object paramObject2, Object paramObject3)
  {
    Transition localTransition1 = (Transition)paramObject1;
    Transition localTransition2 = (Transition)paramObject2;
    Transition localTransition3 = (Transition)paramObject3;
    Object localObject;
    if ((localTransition1 != null) && (localTransition2 != null)) {
      localObject = new TransitionSet().b(localTransition1).b(localTransition2).a(1);
    }
    while (localTransition3 != null)
    {
      TransitionSet localTransitionSet = new TransitionSet();
      if (localObject != null) {
        localTransitionSet.b((Transition)localObject);
      }
      localTransitionSet.b(localTransition3);
      return localTransitionSet;
      if (localTransition1 != null)
      {
        localObject = localTransition1;
      }
      else
      {
        localObject = null;
        if (localTransition2 != null) {
          localObject = localTransition2;
        }
      }
    }
    return localObject;
  }
  
  public Object mergeTransitionsTogether(Object paramObject1, Object paramObject2, Object paramObject3)
  {
    TransitionSet localTransitionSet = new TransitionSet();
    if (paramObject1 != null) {
      localTransitionSet.b((Transition)paramObject1);
    }
    if (paramObject2 != null) {
      localTransitionSet.b((Transition)paramObject2);
    }
    if (paramObject3 != null) {
      localTransitionSet.b((Transition)paramObject3);
    }
    return localTransitionSet;
  }
  
  public void removeTarget(Object paramObject, View paramView)
  {
    if (paramObject != null) {
      ((Transition)paramObject).d(paramView);
    }
  }
  
  public void replaceTargets(Object paramObject, ArrayList<View> paramArrayList1, ArrayList<View> paramArrayList2)
  {
    int i = 0;
    Transition localTransition = (Transition)paramObject;
    if ((localTransition instanceof TransitionSet))
    {
      TransitionSet localTransitionSet = (TransitionSet)localTransition;
      int n = localTransitionSet.p();
      while (i < n)
      {
        replaceTargets(localTransitionSet.b(i), paramArrayList1, paramArrayList2);
        i++;
      }
    }
    if (!a(localTransition))
    {
      List localList = localTransition.g();
      if ((localList.size() == paramArrayList1.size()) && (localList.containsAll(paramArrayList1)))
      {
        if (paramArrayList2 == null) {}
        for (int j = 0;; j = paramArrayList2.size()) {
          for (int k = 0; k < j; k++) {
            localTransition.c((View)paramArrayList2.get(k));
          }
        }
        for (int m = -1 + paramArrayList1.size(); m >= 0; m--) {
          localTransition.d((View)paramArrayList1.get(m));
        }
      }
    }
  }
  
  public void scheduleHideFragmentView(Object paramObject, final View paramView, final ArrayList<View> paramArrayList)
  {
    ((Transition)paramObject).a(new Transition.c()
    {
      public void a(Transition paramAnonymousTransition)
      {
        paramAnonymousTransition.b(this);
        paramView.setVisibility(8);
        int i = paramArrayList.size();
        for (int j = 0; j < i; j++) {
          ((View)paramArrayList.get(j)).setVisibility(0);
        }
      }
      
      public void b(Transition paramAnonymousTransition) {}
      
      public void c(Transition paramAnonymousTransition) {}
      
      public void d(Transition paramAnonymousTransition) {}
    });
  }
  
  public void scheduleRemoveTargets(Object paramObject1, final Object paramObject2, final ArrayList<View> paramArrayList1, final Object paramObject3, final ArrayList<View> paramArrayList2, final Object paramObject4, final ArrayList<View> paramArrayList3)
  {
    ((Transition)paramObject1).a(new Transition.c()
    {
      public void a(Transition paramAnonymousTransition) {}
      
      public void b(Transition paramAnonymousTransition) {}
      
      public void c(Transition paramAnonymousTransition) {}
      
      public void d(Transition paramAnonymousTransition)
      {
        if (paramObject2 != null) {
          FragmentTransitionSupport.this.replaceTargets(paramObject2, paramArrayList1, null);
        }
        if (paramObject3 != null) {
          FragmentTransitionSupport.this.replaceTargets(paramObject3, paramArrayList2, null);
        }
        if (paramObject4 != null) {
          FragmentTransitionSupport.this.replaceTargets(paramObject4, paramArrayList3, null);
        }
      }
    });
  }
  
  public void setEpicenter(Object paramObject, final Rect paramRect)
  {
    if (paramObject != null) {
      ((Transition)paramObject).a(new Transition.b()
      {
        public Rect a(Transition paramAnonymousTransition)
        {
          if ((paramRect == null) || (paramRect.isEmpty())) {
            return null;
          }
          return paramRect;
        }
      });
    }
  }
  
  public void setEpicenter(Object paramObject, View paramView)
  {
    if (paramView != null)
    {
      Transition localTransition = (Transition)paramObject;
      final Rect localRect = new Rect();
      getBoundsOnScreen(paramView, localRect);
      localTransition.a(new Transition.b()
      {
        public Rect a(Transition paramAnonymousTransition)
        {
          return localRect;
        }
      });
    }
  }
  
  public void setSharedElementTargets(Object paramObject, View paramView, ArrayList<View> paramArrayList)
  {
    TransitionSet localTransitionSet = (TransitionSet)paramObject;
    List localList = localTransitionSet.g();
    localList.clear();
    int i = paramArrayList.size();
    for (int j = 0; j < i; j++) {
      bfsAddViewChildren(localList, (View)paramArrayList.get(j));
    }
    localList.add(paramView);
    paramArrayList.add(paramView);
    addTargets(localTransitionSet, paramArrayList);
  }
  
  public void swapSharedElementTargets(Object paramObject, ArrayList<View> paramArrayList1, ArrayList<View> paramArrayList2)
  {
    TransitionSet localTransitionSet = (TransitionSet)paramObject;
    if (localTransitionSet != null)
    {
      localTransitionSet.g().clear();
      localTransitionSet.g().addAll(paramArrayList2);
      replaceTargets(localTransitionSet, paramArrayList1, paramArrayList2);
    }
  }
  
  public Object wrapTransitionInSet(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    TransitionSet localTransitionSet = new TransitionSet();
    localTransitionSet.b((Transition)paramObject);
    return localTransitionSet;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.transition.FragmentTransitionSupport
 * JD-Core Version:    0.7.0.1
 */