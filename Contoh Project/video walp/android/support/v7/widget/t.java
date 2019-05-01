package android.support.v7.widget;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

final class t
  implements Runnable
{
  static final ThreadLocal<t> a = new ThreadLocal();
  static Comparator<b> e = new Comparator()
  {
    public int a(t.b paramAnonymousb1, t.b paramAnonymousb2)
    {
      int i = -1;
      int j = 1;
      int k;
      int m;
      if (paramAnonymousb1.d == null)
      {
        k = j;
        if (paramAnonymousb2.d != null) {
          break label50;
        }
        m = j;
        label27:
        if (k == m) {
          break label58;
        }
        if (paramAnonymousb1.d != null) {
          break label56;
        }
      }
      label50:
      label56:
      label58:
      do
      {
        do
        {
          return j;
          k = 0;
          break;
          m = 0;
          break label27;
          return i;
          if (paramAnonymousb1.a != paramAnonymousb2.a)
          {
            if (paramAnonymousb1.a) {}
            for (;;)
            {
              return i;
              i = j;
            }
          }
          j = paramAnonymousb2.b - paramAnonymousb1.b;
        } while (j != 0);
        j = paramAnonymousb1.c - paramAnonymousb2.c;
      } while (j != 0);
      return 0;
    }
  };
  ArrayList<RecyclerView> b = new ArrayList();
  long c;
  long d;
  private ArrayList<b> f = new ArrayList();
  
  /* Error */
  private RecyclerView.ViewHolder a(RecyclerView paramRecyclerView, int paramInt, long paramLong)
  {
    // Byte code:
    //   0: aload_1
    //   1: iload_2
    //   2: invokestatic 46	android/support/v7/widget/t:a	(Landroid/support/v7/widget/RecyclerView;I)Z
    //   5: ifeq +5 -> 10
    //   8: aconst_null
    //   9: areturn
    //   10: aload_1
    //   11: getfield 52	android/support/v7/widget/RecyclerView:mRecycler	Landroid/support/v7/widget/RecyclerView$Recycler;
    //   14: astore 5
    //   16: aload_1
    //   17: invokevirtual 55	android/support/v7/widget/RecyclerView:onEnterLayoutOrScroll	()V
    //   20: aload 5
    //   22: iload_2
    //   23: iconst_0
    //   24: lload_3
    //   25: invokevirtual 61	android/support/v7/widget/RecyclerView$Recycler:tryGetViewHolderForPositionByDeadline	(IZJ)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    //   28: astore 7
    //   30: aload 7
    //   32: ifnull +29 -> 61
    //   35: aload 7
    //   37: invokevirtual 67	android/support/v7/widget/RecyclerView$ViewHolder:isBound	()Z
    //   40: ifeq +29 -> 69
    //   43: aload 7
    //   45: invokevirtual 70	android/support/v7/widget/RecyclerView$ViewHolder:isInvalid	()Z
    //   48: ifne +21 -> 69
    //   51: aload 5
    //   53: aload 7
    //   55: getfield 74	android/support/v7/widget/RecyclerView$ViewHolder:itemView	Landroid/view/View;
    //   58: invokevirtual 78	android/support/v7/widget/RecyclerView$Recycler:recycleView	(Landroid/view/View;)V
    //   61: aload_1
    //   62: iconst_0
    //   63: invokevirtual 82	android/support/v7/widget/RecyclerView:onExitLayoutOrScroll	(Z)V
    //   66: aload 7
    //   68: areturn
    //   69: aload 5
    //   71: aload 7
    //   73: iconst_0
    //   74: invokevirtual 86	android/support/v7/widget/RecyclerView$Recycler:addViewHolderToRecycledViewPool	(Landroid/support/v7/widget/RecyclerView$ViewHolder;Z)V
    //   77: goto -16 -> 61
    //   80: astore 6
    //   82: aload_1
    //   83: iconst_0
    //   84: invokevirtual 82	android/support/v7/widget/RecyclerView:onExitLayoutOrScroll	(Z)V
    //   87: aload 6
    //   89: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	90	0	this	t
    //   0	90	1	paramRecyclerView	RecyclerView
    //   0	90	2	paramInt	int
    //   0	90	3	paramLong	long
    //   14	56	5	localRecycler	RecyclerView.Recycler
    //   80	8	6	localObject	Object
    //   28	44	7	localViewHolder	RecyclerView.ViewHolder
    // Exception table:
    //   from	to	target	type
    //   16	30	80	finally
    //   35	61	80	finally
    //   69	77	80	finally
  }
  
  private void a()
  {
    int i = this.b.size();
    int j = 0;
    int k = 0;
    RecyclerView localRecyclerView2;
    if (j < i)
    {
      localRecyclerView2 = (RecyclerView)this.b.get(j);
      if (localRecyclerView2.getWindowVisibility() != 0) {
        break label307;
      }
      localRecyclerView2.mPrefetchRegistry.a(localRecyclerView2, false);
    }
    label283:
    label307:
    for (int i5 = k + localRecyclerView2.mPrefetchRegistry.d;; i5 = k)
    {
      j++;
      k = i5;
      break;
      this.f.ensureCapacity(k);
      int m = 0;
      int n = 0;
      RecyclerView localRecyclerView1;
      if (m < i)
      {
        localRecyclerView1 = (RecyclerView)this.b.get(m);
        if (localRecyclerView1.getWindowVisibility() == 0) {}
      }
      for (;;)
      {
        m++;
        break;
        a locala = localRecyclerView1.mPrefetchRegistry;
        int i1 = Math.abs(locala.a) + Math.abs(locala.b);
        int i2 = 0;
        int i3 = n;
        if (i2 < 2 * locala.d)
        {
          b localb;
          label194:
          int i4;
          if (i3 >= this.f.size())
          {
            localb = new b();
            this.f.add(localb);
            i4 = locala.c[(i2 + 1)];
            if (i4 > i1) {
              break label283;
            }
          }
          for (boolean bool = true;; bool = false)
          {
            localb.a = bool;
            localb.b = i1;
            localb.c = i4;
            localb.d = localRecyclerView1;
            localb.e = locala.c[i2];
            i3++;
            i2 += 2;
            break;
            localb = (b)this.f.get(i3);
            break label194;
          }
          Collections.sort(this.f, e);
          return;
        }
        n = i3;
      }
    }
  }
  
  private void a(RecyclerView paramRecyclerView, long paramLong)
  {
    if (paramRecyclerView == null) {}
    a locala;
    do
    {
      return;
      if ((paramRecyclerView.mDataSetHasChangedAfterLayout) && (paramRecyclerView.mChildHelper.c() != 0)) {
        paramRecyclerView.removeAndRecycleViews();
      }
      locala = paramRecyclerView.mPrefetchRegistry;
      locala.a(paramRecyclerView, true);
    } while (locala.d == 0);
    try
    {
      android.support.v4.os.c.a("RV Nested Prefetch");
      paramRecyclerView.mState.prepareForNestedPrefetch(paramRecyclerView.mAdapter);
      for (int i = 0; i < 2 * locala.d; i += 2) {
        a(paramRecyclerView, locala.c[i], paramLong);
      }
      return;
    }
    finally
    {
      android.support.v4.os.c.a();
    }
  }
  
  private void a(b paramb, long paramLong)
  {
    if (paramb.a) {}
    for (long l = 9223372036854775807L;; l = paramLong)
    {
      RecyclerView.ViewHolder localViewHolder = a(paramb.d, paramb.e, l);
      if ((localViewHolder != null) && (localViewHolder.mNestedRecyclerView != null) && (localViewHolder.isBound()) && (!localViewHolder.isInvalid())) {
        a((RecyclerView)localViewHolder.mNestedRecyclerView.get(), paramLong);
      }
      return;
    }
  }
  
  static boolean a(RecyclerView paramRecyclerView, int paramInt)
  {
    int i = paramRecyclerView.mChildHelper.c();
    for (int j = 0;; j++)
    {
      boolean bool = false;
      if (j < i)
      {
        RecyclerView.ViewHolder localViewHolder = RecyclerView.getChildViewHolderInt(paramRecyclerView.mChildHelper.d(j));
        if ((localViewHolder.mPosition == paramInt) && (!localViewHolder.isInvalid())) {
          bool = true;
        }
      }
      else
      {
        return bool;
      }
    }
  }
  
  private void b(long paramLong)
  {
    for (int i = 0;; i++)
    {
      b localb;
      if (i < this.f.size())
      {
        localb = (b)this.f.get(i);
        if (localb.d != null) {}
      }
      else
      {
        return;
      }
      a(localb, paramLong);
      localb.a();
    }
  }
  
  void a(long paramLong)
  {
    a();
    b(paramLong);
  }
  
  public void a(RecyclerView paramRecyclerView)
  {
    this.b.add(paramRecyclerView);
  }
  
  void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    if ((paramRecyclerView.isAttachedToWindow()) && (this.c == 0L))
    {
      this.c = paramRecyclerView.getNanoTime();
      paramRecyclerView.post(this);
    }
    paramRecyclerView.mPrefetchRegistry.a(paramInt1, paramInt2);
  }
  
  public void b(RecyclerView paramRecyclerView)
  {
    this.b.remove(paramRecyclerView);
  }
  
  public void run()
  {
    for (;;)
    {
      long l1;
      try
      {
        android.support.v4.os.c.a("RV Prefetch");
        boolean bool = this.b.isEmpty();
        if (bool) {
          return;
        }
        int i = this.b.size();
        int j = 0;
        l1 = 0L;
        if (j < i)
        {
          RecyclerView localRecyclerView = (RecyclerView)this.b.get(j);
          if (localRecyclerView.getWindowVisibility() == 0)
          {
            long l3 = Math.max(localRecyclerView.getDrawingTime(), l1);
            l2 = l3;
            j++;
            l1 = l2;
          }
        }
        else
        {
          if (l1 == 0L) {
            return;
          }
          a(TimeUnit.MILLISECONDS.toNanos(l1) + this.d);
          return;
        }
      }
      finally
      {
        this.c = 0L;
        android.support.v4.os.c.a();
      }
      long l2 = l1;
    }
  }
  
  static class a
    implements RecyclerView.LayoutManager.LayoutPrefetchRegistry
  {
    int a;
    int b;
    int[] c;
    int d;
    
    void a()
    {
      if (this.c != null) {
        Arrays.fill(this.c, -1);
      }
      this.d = 0;
    }
    
    void a(int paramInt1, int paramInt2)
    {
      this.a = paramInt1;
      this.b = paramInt2;
    }
    
    void a(RecyclerView paramRecyclerView, boolean paramBoolean)
    {
      this.d = 0;
      if (this.c != null) {
        Arrays.fill(this.c, -1);
      }
      RecyclerView.LayoutManager localLayoutManager = paramRecyclerView.mLayout;
      if ((paramRecyclerView.mAdapter != null) && (localLayoutManager != null) && (localLayoutManager.isItemPrefetchEnabled()))
      {
        if (!paramBoolean) {
          break label101;
        }
        if (!paramRecyclerView.mAdapterHelper.d()) {
          localLayoutManager.collectInitialPrefetchPositions(paramRecyclerView.mAdapter.getItemCount(), this);
        }
      }
      for (;;)
      {
        if (this.d > localLayoutManager.mPrefetchMaxCountObserved)
        {
          localLayoutManager.mPrefetchMaxCountObserved = this.d;
          localLayoutManager.mPrefetchMaxObservedInInitialPrefetch = paramBoolean;
          paramRecyclerView.mRecycler.updateViewCacheSize();
        }
        return;
        label101:
        if (!paramRecyclerView.hasPendingAdapterUpdates()) {
          localLayoutManager.collectAdjacentPrefetchPositions(this.a, this.b, paramRecyclerView.mState, this);
        }
      }
    }
    
    boolean a(int paramInt)
    {
      int[] arrayOfInt = this.c;
      boolean bool = false;
      int i;
      if (arrayOfInt != null) {
        i = 2 * this.d;
      }
      for (int j = 0;; j += 2)
      {
        bool = false;
        if (j < i)
        {
          if (this.c[j] == paramInt) {
            bool = true;
          }
        }
        else {
          return bool;
        }
      }
    }
    
    public void addPosition(int paramInt1, int paramInt2)
    {
      if (paramInt1 < 0) {
        throw new IllegalArgumentException("Layout positions must be non-negative");
      }
      if (paramInt2 < 0) {
        throw new IllegalArgumentException("Pixel distance must be non-negative");
      }
      int i = 2 * this.d;
      if (this.c == null)
      {
        this.c = new int[4];
        Arrays.fill(this.c, -1);
      }
      for (;;)
      {
        this.c[i] = paramInt1;
        this.c[(i + 1)] = paramInt2;
        this.d = (1 + this.d);
        return;
        if (i >= this.c.length)
        {
          int[] arrayOfInt = this.c;
          this.c = new int[i * 2];
          System.arraycopy(arrayOfInt, 0, this.c, 0, arrayOfInt.length);
        }
      }
    }
  }
  
  static class b
  {
    public boolean a;
    public int b;
    public int c;
    public RecyclerView d;
    public int e;
    
    public void a()
    {
      this.a = false;
      this.b = 0;
      this.c = 0;
      this.d = null;
      this.e = 0;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.t
 * JD-Core Version:    0.7.0.1
 */