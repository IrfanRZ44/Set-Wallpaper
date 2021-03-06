package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.support.v4.view.s;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DefaultItemAnimator
  extends SimpleItemAnimator
{
  private static final boolean DEBUG;
  private static TimeInterpolator sDefaultInterpolator;
  ArrayList<RecyclerView.ViewHolder> mAddAnimations = new ArrayList();
  ArrayList<ArrayList<RecyclerView.ViewHolder>> mAdditionsList = new ArrayList();
  ArrayList<RecyclerView.ViewHolder> mChangeAnimations = new ArrayList();
  ArrayList<ArrayList<a>> mChangesList = new ArrayList();
  ArrayList<RecyclerView.ViewHolder> mMoveAnimations = new ArrayList();
  ArrayList<ArrayList<b>> mMovesList = new ArrayList();
  private ArrayList<RecyclerView.ViewHolder> mPendingAdditions = new ArrayList();
  private ArrayList<a> mPendingChanges = new ArrayList();
  private ArrayList<b> mPendingMoves = new ArrayList();
  private ArrayList<RecyclerView.ViewHolder> mPendingRemovals = new ArrayList();
  ArrayList<RecyclerView.ViewHolder> mRemoveAnimations = new ArrayList();
  
  private void animateRemoveImpl(final RecyclerView.ViewHolder paramViewHolder)
  {
    final View localView = paramViewHolder.itemView;
    final ViewPropertyAnimator localViewPropertyAnimator = localView.animate();
    this.mRemoveAnimations.add(paramViewHolder);
    localViewPropertyAnimator.setDuration(getRemoveDuration()).alpha(0.0F).setListener(new AnimatorListenerAdapter()
    {
      public void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        localViewPropertyAnimator.setListener(null);
        localView.setAlpha(1.0F);
        DefaultItemAnimator.this.dispatchRemoveFinished(paramViewHolder);
        DefaultItemAnimator.this.mRemoveAnimations.remove(paramViewHolder);
        DefaultItemAnimator.this.dispatchFinishedWhenDone();
      }
      
      public void onAnimationStart(Animator paramAnonymousAnimator)
      {
        DefaultItemAnimator.this.dispatchRemoveStarting(paramViewHolder);
      }
    }).start();
  }
  
  private void endChangeAnimation(List<a> paramList, RecyclerView.ViewHolder paramViewHolder)
  {
    for (int i = -1 + paramList.size(); i >= 0; i--)
    {
      a locala = (a)paramList.get(i);
      if ((endChangeAnimationIfNecessary(locala, paramViewHolder)) && (locala.a == null) && (locala.b == null)) {
        paramList.remove(locala);
      }
    }
  }
  
  private void endChangeAnimationIfNecessary(a parama)
  {
    if (parama.a != null) {
      endChangeAnimationIfNecessary(parama, parama.a);
    }
    if (parama.b != null) {
      endChangeAnimationIfNecessary(parama, parama.b);
    }
  }
  
  private boolean endChangeAnimationIfNecessary(a parama, RecyclerView.ViewHolder paramViewHolder)
  {
    boolean bool1 = false;
    if (parama.b == paramViewHolder) {
      parama.b = null;
    }
    for (;;)
    {
      paramViewHolder.itemView.setAlpha(1.0F);
      paramViewHolder.itemView.setTranslationX(0.0F);
      paramViewHolder.itemView.setTranslationY(0.0F);
      dispatchChangeFinished(paramViewHolder, bool1);
      boolean bool2 = true;
      RecyclerView.ViewHolder localViewHolder;
      do
      {
        return bool2;
        localViewHolder = parama.a;
        bool2 = false;
      } while (localViewHolder != paramViewHolder);
      parama.a = null;
      bool1 = true;
    }
  }
  
  private void resetAnimation(RecyclerView.ViewHolder paramViewHolder)
  {
    if (sDefaultInterpolator == null) {
      sDefaultInterpolator = new ValueAnimator().getInterpolator();
    }
    paramViewHolder.itemView.animate().setInterpolator(sDefaultInterpolator);
    endAnimation(paramViewHolder);
  }
  
  public boolean animateAdd(RecyclerView.ViewHolder paramViewHolder)
  {
    resetAnimation(paramViewHolder);
    paramViewHolder.itemView.setAlpha(0.0F);
    this.mPendingAdditions.add(paramViewHolder);
    return true;
  }
  
  void animateAddImpl(final RecyclerView.ViewHolder paramViewHolder)
  {
    final View localView = paramViewHolder.itemView;
    final ViewPropertyAnimator localViewPropertyAnimator = localView.animate();
    this.mAddAnimations.add(paramViewHolder);
    localViewPropertyAnimator.alpha(1.0F).setDuration(getAddDuration()).setListener(new AnimatorListenerAdapter()
    {
      public void onAnimationCancel(Animator paramAnonymousAnimator)
      {
        localView.setAlpha(1.0F);
      }
      
      public void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        localViewPropertyAnimator.setListener(null);
        DefaultItemAnimator.this.dispatchAddFinished(paramViewHolder);
        DefaultItemAnimator.this.mAddAnimations.remove(paramViewHolder);
        DefaultItemAnimator.this.dispatchFinishedWhenDone();
      }
      
      public void onAnimationStart(Animator paramAnonymousAnimator)
      {
        DefaultItemAnimator.this.dispatchAddStarting(paramViewHolder);
      }
    }).start();
  }
  
  public boolean animateChange(RecyclerView.ViewHolder paramViewHolder1, RecyclerView.ViewHolder paramViewHolder2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramViewHolder1 == paramViewHolder2) {
      return animateMove(paramViewHolder1, paramInt1, paramInt2, paramInt3, paramInt4);
    }
    float f1 = paramViewHolder1.itemView.getTranslationX();
    float f2 = paramViewHolder1.itemView.getTranslationY();
    float f3 = paramViewHolder1.itemView.getAlpha();
    resetAnimation(paramViewHolder1);
    int i = (int)(paramInt3 - paramInt1 - f1);
    int j = (int)(paramInt4 - paramInt2 - f2);
    paramViewHolder1.itemView.setTranslationX(f1);
    paramViewHolder1.itemView.setTranslationY(f2);
    paramViewHolder1.itemView.setAlpha(f3);
    if (paramViewHolder2 != null)
    {
      resetAnimation(paramViewHolder2);
      paramViewHolder2.itemView.setTranslationX(-i);
      paramViewHolder2.itemView.setTranslationY(-j);
      paramViewHolder2.itemView.setAlpha(0.0F);
    }
    this.mPendingChanges.add(new a(paramViewHolder1, paramViewHolder2, paramInt1, paramInt2, paramInt3, paramInt4));
    return true;
  }
  
  void animateChangeImpl(final a parama)
  {
    RecyclerView.ViewHolder localViewHolder1 = parama.a;
    if (localViewHolder1 == null) {}
    for (final View localView1 = null;; localView1 = localViewHolder1.itemView)
    {
      RecyclerView.ViewHolder localViewHolder2 = parama.b;
      final View localView2 = null;
      if (localViewHolder2 != null) {
        localView2 = localViewHolder2.itemView;
      }
      if (localView1 != null)
      {
        final ViewPropertyAnimator localViewPropertyAnimator2 = localView1.animate().setDuration(getChangeDuration());
        this.mChangeAnimations.add(parama.a);
        localViewPropertyAnimator2.translationX(parama.e - parama.c);
        localViewPropertyAnimator2.translationY(parama.f - parama.d);
        localViewPropertyAnimator2.alpha(0.0F).setListener(new AnimatorListenerAdapter()
        {
          public void onAnimationEnd(Animator paramAnonymousAnimator)
          {
            localViewPropertyAnimator2.setListener(null);
            localView1.setAlpha(1.0F);
            localView1.setTranslationX(0.0F);
            localView1.setTranslationY(0.0F);
            DefaultItemAnimator.this.dispatchChangeFinished(parama.a, true);
            DefaultItemAnimator.this.mChangeAnimations.remove(parama.a);
            DefaultItemAnimator.this.dispatchFinishedWhenDone();
          }
          
          public void onAnimationStart(Animator paramAnonymousAnimator)
          {
            DefaultItemAnimator.this.dispatchChangeStarting(parama.a, true);
          }
        }).start();
      }
      if (localView2 != null)
      {
        final ViewPropertyAnimator localViewPropertyAnimator1 = localView2.animate();
        this.mChangeAnimations.add(parama.b);
        localViewPropertyAnimator1.translationX(0.0F).translationY(0.0F).setDuration(getChangeDuration()).alpha(1.0F).setListener(new AnimatorListenerAdapter()
        {
          public void onAnimationEnd(Animator paramAnonymousAnimator)
          {
            localViewPropertyAnimator1.setListener(null);
            localView2.setAlpha(1.0F);
            localView2.setTranslationX(0.0F);
            localView2.setTranslationY(0.0F);
            DefaultItemAnimator.this.dispatchChangeFinished(parama.b, false);
            DefaultItemAnimator.this.mChangeAnimations.remove(parama.b);
            DefaultItemAnimator.this.dispatchFinishedWhenDone();
          }
          
          public void onAnimationStart(Animator paramAnonymousAnimator)
          {
            DefaultItemAnimator.this.dispatchChangeStarting(parama.b, false);
          }
        }).start();
      }
      return;
    }
  }
  
  public boolean animateMove(RecyclerView.ViewHolder paramViewHolder, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    View localView = paramViewHolder.itemView;
    int i = paramInt1 + (int)paramViewHolder.itemView.getTranslationX();
    int j = paramInt2 + (int)paramViewHolder.itemView.getTranslationY();
    resetAnimation(paramViewHolder);
    int k = paramInt3 - i;
    int m = paramInt4 - j;
    if ((k == 0) && (m == 0))
    {
      dispatchMoveFinished(paramViewHolder);
      return false;
    }
    if (k != 0) {
      localView.setTranslationX(-k);
    }
    if (m != 0) {
      localView.setTranslationY(-m);
    }
    this.mPendingMoves.add(new b(paramViewHolder, i, j, paramInt3, paramInt4));
    return true;
  }
  
  void animateMoveImpl(final RecyclerView.ViewHolder paramViewHolder, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    final View localView = paramViewHolder.itemView;
    final int i = paramInt3 - paramInt1;
    final int j = paramInt4 - paramInt2;
    if (i != 0) {
      localView.animate().translationX(0.0F);
    }
    if (j != 0) {
      localView.animate().translationY(0.0F);
    }
    final ViewPropertyAnimator localViewPropertyAnimator = localView.animate();
    this.mMoveAnimations.add(paramViewHolder);
    localViewPropertyAnimator.setDuration(getMoveDuration()).setListener(new AnimatorListenerAdapter()
    {
      public void onAnimationCancel(Animator paramAnonymousAnimator)
      {
        if (i != 0) {
          localView.setTranslationX(0.0F);
        }
        if (j != 0) {
          localView.setTranslationY(0.0F);
        }
      }
      
      public void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        localViewPropertyAnimator.setListener(null);
        DefaultItemAnimator.this.dispatchMoveFinished(paramViewHolder);
        DefaultItemAnimator.this.mMoveAnimations.remove(paramViewHolder);
        DefaultItemAnimator.this.dispatchFinishedWhenDone();
      }
      
      public void onAnimationStart(Animator paramAnonymousAnimator)
      {
        DefaultItemAnimator.this.dispatchMoveStarting(paramViewHolder);
      }
    }).start();
  }
  
  public boolean animateRemove(RecyclerView.ViewHolder paramViewHolder)
  {
    resetAnimation(paramViewHolder);
    this.mPendingRemovals.add(paramViewHolder);
    return true;
  }
  
  public boolean canReuseUpdatedViewHolder(RecyclerView.ViewHolder paramViewHolder, List<Object> paramList)
  {
    return (!paramList.isEmpty()) || (super.canReuseUpdatedViewHolder(paramViewHolder, paramList));
  }
  
  void cancelAll(List<RecyclerView.ViewHolder> paramList)
  {
    for (int i = -1 + paramList.size(); i >= 0; i--) {
      ((RecyclerView.ViewHolder)paramList.get(i)).itemView.animate().cancel();
    }
  }
  
  void dispatchFinishedWhenDone()
  {
    if (!isRunning()) {
      dispatchAnimationsFinished();
    }
  }
  
  public void endAnimation(RecyclerView.ViewHolder paramViewHolder)
  {
    View localView = paramViewHolder.itemView;
    localView.animate().cancel();
    for (int i = -1 + this.mPendingMoves.size(); i >= 0; i--) {
      if (((b)this.mPendingMoves.get(i)).a == paramViewHolder)
      {
        localView.setTranslationY(0.0F);
        localView.setTranslationX(0.0F);
        dispatchMoveFinished(paramViewHolder);
        this.mPendingMoves.remove(i);
      }
    }
    endChangeAnimation(this.mPendingChanges, paramViewHolder);
    if (this.mPendingRemovals.remove(paramViewHolder))
    {
      localView.setAlpha(1.0F);
      dispatchRemoveFinished(paramViewHolder);
    }
    if (this.mPendingAdditions.remove(paramViewHolder))
    {
      localView.setAlpha(1.0F);
      dispatchAddFinished(paramViewHolder);
    }
    for (int j = -1 + this.mChangesList.size(); j >= 0; j--)
    {
      ArrayList localArrayList3 = (ArrayList)this.mChangesList.get(j);
      endChangeAnimation(localArrayList3, paramViewHolder);
      if (localArrayList3.isEmpty()) {
        this.mChangesList.remove(j);
      }
    }
    int k = -1 + this.mMovesList.size();
    if (k >= 0)
    {
      ArrayList localArrayList2 = (ArrayList)this.mMovesList.get(k);
      for (int n = -1 + localArrayList2.size();; n--)
      {
        if (n >= 0)
        {
          if (((b)localArrayList2.get(n)).a != paramViewHolder) {
            continue;
          }
          localView.setTranslationY(0.0F);
          localView.setTranslationX(0.0F);
          dispatchMoveFinished(paramViewHolder);
          localArrayList2.remove(n);
          if (localArrayList2.isEmpty()) {
            this.mMovesList.remove(k);
          }
        }
        k--;
        break;
      }
    }
    for (int m = -1 + this.mAdditionsList.size(); m >= 0; m--)
    {
      ArrayList localArrayList1 = (ArrayList)this.mAdditionsList.get(m);
      if (localArrayList1.remove(paramViewHolder))
      {
        localView.setAlpha(1.0F);
        dispatchAddFinished(paramViewHolder);
        if (localArrayList1.isEmpty()) {
          this.mAdditionsList.remove(m);
        }
      }
    }
    if ((!this.mRemoveAnimations.remove(paramViewHolder)) || ((!this.mAddAnimations.remove(paramViewHolder)) || ((!this.mChangeAnimations.remove(paramViewHolder)) || (this.mMoveAnimations.remove(paramViewHolder))))) {}
    dispatchFinishedWhenDone();
  }
  
  public void endAnimations()
  {
    for (int i = -1 + this.mPendingMoves.size(); i >= 0; i--)
    {
      b localb2 = (b)this.mPendingMoves.get(i);
      View localView2 = localb2.a.itemView;
      localView2.setTranslationY(0.0F);
      localView2.setTranslationX(0.0F);
      dispatchMoveFinished(localb2.a);
      this.mPendingMoves.remove(i);
    }
    for (int j = -1 + this.mPendingRemovals.size(); j >= 0; j--)
    {
      dispatchRemoveFinished((RecyclerView.ViewHolder)this.mPendingRemovals.get(j));
      this.mPendingRemovals.remove(j);
    }
    for (int k = -1 + this.mPendingAdditions.size(); k >= 0; k--)
    {
      RecyclerView.ViewHolder localViewHolder2 = (RecyclerView.ViewHolder)this.mPendingAdditions.get(k);
      localViewHolder2.itemView.setAlpha(1.0F);
      dispatchAddFinished(localViewHolder2);
      this.mPendingAdditions.remove(k);
    }
    for (int m = -1 + this.mPendingChanges.size(); m >= 0; m--) {
      endChangeAnimationIfNecessary((a)this.mPendingChanges.get(m));
    }
    this.mPendingChanges.clear();
    if (!isRunning()) {
      return;
    }
    for (int n = -1 + this.mMovesList.size(); n >= 0; n--)
    {
      ArrayList localArrayList3 = (ArrayList)this.mMovesList.get(n);
      for (int i5 = -1 + localArrayList3.size(); i5 >= 0; i5--)
      {
        b localb1 = (b)localArrayList3.get(i5);
        View localView1 = localb1.a.itemView;
        localView1.setTranslationY(0.0F);
        localView1.setTranslationX(0.0F);
        dispatchMoveFinished(localb1.a);
        localArrayList3.remove(i5);
        if (localArrayList3.isEmpty()) {
          this.mMovesList.remove(localArrayList3);
        }
      }
    }
    for (int i1 = -1 + this.mAdditionsList.size(); i1 >= 0; i1--)
    {
      ArrayList localArrayList2 = (ArrayList)this.mAdditionsList.get(i1);
      for (int i4 = -1 + localArrayList2.size(); i4 >= 0; i4--)
      {
        RecyclerView.ViewHolder localViewHolder1 = (RecyclerView.ViewHolder)localArrayList2.get(i4);
        localViewHolder1.itemView.setAlpha(1.0F);
        dispatchAddFinished(localViewHolder1);
        localArrayList2.remove(i4);
        if (localArrayList2.isEmpty()) {
          this.mAdditionsList.remove(localArrayList2);
        }
      }
    }
    for (int i2 = -1 + this.mChangesList.size(); i2 >= 0; i2--)
    {
      ArrayList localArrayList1 = (ArrayList)this.mChangesList.get(i2);
      for (int i3 = -1 + localArrayList1.size(); i3 >= 0; i3--)
      {
        endChangeAnimationIfNecessary((a)localArrayList1.get(i3));
        if (localArrayList1.isEmpty()) {
          this.mChangesList.remove(localArrayList1);
        }
      }
    }
    cancelAll(this.mRemoveAnimations);
    cancelAll(this.mMoveAnimations);
    cancelAll(this.mAddAnimations);
    cancelAll(this.mChangeAnimations);
    dispatchAnimationsFinished();
  }
  
  public boolean isRunning()
  {
    return (!this.mPendingAdditions.isEmpty()) || (!this.mPendingChanges.isEmpty()) || (!this.mPendingMoves.isEmpty()) || (!this.mPendingRemovals.isEmpty()) || (!this.mMoveAnimations.isEmpty()) || (!this.mRemoveAnimations.isEmpty()) || (!this.mAddAnimations.isEmpty()) || (!this.mChangeAnimations.isEmpty()) || (!this.mMovesList.isEmpty()) || (!this.mAdditionsList.isEmpty()) || (!this.mChangesList.isEmpty());
  }
  
  public void runPendingAnimations()
  {
    int i;
    int j;
    label24:
    int k;
    if (!this.mPendingRemovals.isEmpty())
    {
      i = 1;
      if (this.mPendingMoves.isEmpty()) {
        break label72;
      }
      j = 1;
      if (this.mPendingChanges.isEmpty()) {
        break label77;
      }
      k = 1;
      label36:
      if (this.mPendingAdditions.isEmpty()) {
        break label82;
      }
    }
    label72:
    label77:
    label82:
    for (int m = 1;; m = 0)
    {
      if ((i != 0) || (j != 0) || (m != 0) || (k != 0)) {
        break label88;
      }
      return;
      i = 0;
      break;
      j = 0;
      break label24;
      k = 0;
      break label36;
    }
    label88:
    Iterator localIterator = this.mPendingRemovals.iterator();
    while (localIterator.hasNext()) {
      animateRemoveImpl((RecyclerView.ViewHolder)localIterator.next());
    }
    this.mPendingRemovals.clear();
    Runnable local1;
    label211:
    Runnable local2;
    label291:
    final ArrayList localArrayList3;
    Runnable local3;
    long l1;
    label366:
    long l2;
    if (j != 0)
    {
      final ArrayList localArrayList1 = new ArrayList();
      localArrayList1.addAll(this.mPendingMoves);
      this.mMovesList.add(localArrayList1);
      this.mPendingMoves.clear();
      local1 = new Runnable()
      {
        public void run()
        {
          Iterator localIterator = localArrayList1.iterator();
          while (localIterator.hasNext())
          {
            DefaultItemAnimator.b localb = (DefaultItemAnimator.b)localIterator.next();
            DefaultItemAnimator.this.animateMoveImpl(localb.a, localb.b, localb.c, localb.d, localb.e);
          }
          localArrayList1.clear();
          DefaultItemAnimator.this.mMovesList.remove(localArrayList1);
        }
      };
      if (i != 0) {
        s.a(((b)localArrayList1.get(0)).a.itemView, local1, getRemoveDuration());
      }
    }
    else
    {
      if (k != 0)
      {
        final ArrayList localArrayList2 = new ArrayList();
        localArrayList2.addAll(this.mPendingChanges);
        this.mChangesList.add(localArrayList2);
        this.mPendingChanges.clear();
        local2 = new Runnable()
        {
          public void run()
          {
            Iterator localIterator = localArrayList2.iterator();
            while (localIterator.hasNext())
            {
              DefaultItemAnimator.a locala = (DefaultItemAnimator.a)localIterator.next();
              DefaultItemAnimator.this.animateChangeImpl(locala);
            }
            localArrayList2.clear();
            DefaultItemAnimator.this.mChangesList.remove(localArrayList2);
          }
        };
        if (i == 0) {
          break label428;
        }
        s.a(((a)localArrayList2.get(0)).a.itemView, local2, getRemoveDuration());
      }
      if (m == 0) {
        break label436;
      }
      localArrayList3 = new ArrayList();
      localArrayList3.addAll(this.mPendingAdditions);
      this.mAdditionsList.add(localArrayList3);
      this.mPendingAdditions.clear();
      local3 = new Runnable()
      {
        public void run()
        {
          Iterator localIterator = localArrayList3.iterator();
          while (localIterator.hasNext())
          {
            RecyclerView.ViewHolder localViewHolder = (RecyclerView.ViewHolder)localIterator.next();
            DefaultItemAnimator.this.animateAddImpl(localViewHolder);
          }
          localArrayList3.clear();
          DefaultItemAnimator.this.mAdditionsList.remove(localArrayList3);
        }
      };
      if ((i == 0) && (j == 0) && (k == 0)) {
        break label456;
      }
      if (i == 0) {
        break label438;
      }
      l1 = getRemoveDuration();
      if (j == 0) {
        break label444;
      }
      l2 = getMoveDuration();
      label376:
      if (k == 0) {
        break label450;
      }
    }
    label428:
    label436:
    label438:
    label444:
    label450:
    for (long l3 = getChangeDuration();; l3 = 0L)
    {
      long l4 = l1 + Math.max(l2, l3);
      s.a(((RecyclerView.ViewHolder)localArrayList3.get(0)).itemView, local3, l4);
      return;
      local1.run();
      break label211;
      local2.run();
      break label291;
      break;
      l1 = 0L;
      break label366;
      l2 = 0L;
      break label376;
    }
    label456:
    local3.run();
  }
  
  private static class a
  {
    public RecyclerView.ViewHolder a;
    public RecyclerView.ViewHolder b;
    public int c;
    public int d;
    public int e;
    public int f;
    
    private a(RecyclerView.ViewHolder paramViewHolder1, RecyclerView.ViewHolder paramViewHolder2)
    {
      this.a = paramViewHolder1;
      this.b = paramViewHolder2;
    }
    
    a(RecyclerView.ViewHolder paramViewHolder1, RecyclerView.ViewHolder paramViewHolder2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      this(paramViewHolder1, paramViewHolder2);
      this.c = paramInt1;
      this.d = paramInt2;
      this.e = paramInt3;
      this.f = paramInt4;
    }
    
    public String toString()
    {
      return "ChangeInfo{oldHolder=" + this.a + ", newHolder=" + this.b + ", fromX=" + this.c + ", fromY=" + this.d + ", toX=" + this.e + ", toY=" + this.f + '}';
    }
  }
  
  private static class b
  {
    public RecyclerView.ViewHolder a;
    public int b;
    public int c;
    public int d;
    public int e;
    
    b(RecyclerView.ViewHolder paramViewHolder, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      this.a = paramViewHolder;
      this.b = paramInt1;
      this.c = paramInt2;
      this.d = paramInt3;
      this.e = paramInt4;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.DefaultItemAnimator
 * JD-Core Version:    0.7.0.1
 */