package android.support.v7.widget;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.List;

class q
{
  final b a;
  final a b;
  final List<View> c;
  
  q(b paramb)
  {
    this.a = paramb;
    this.b = new a();
    this.c = new ArrayList();
  }
  
  private int f(int paramInt)
  {
    if (paramInt < 0)
    {
      j = -1;
      return j;
    }
    int i = this.a.a();
    int j = paramInt;
    for (;;)
    {
      if (j >= i) {
        break label69;
      }
      int k = paramInt - (j - this.b.e(j));
      if (k == 0)
      {
        while (this.b.c(j)) {
          j++;
        }
        break;
      }
      j += k;
    }
    label69:
    return -1;
  }
  
  private void g(View paramView)
  {
    this.c.add(paramView);
    this.a.c(paramView);
  }
  
  private boolean h(View paramView)
  {
    if (this.c.remove(paramView))
    {
      this.a.d(paramView);
      return true;
    }
    return false;
  }
  
  void a()
  {
    this.b.a();
    for (int i = -1 + this.c.size(); i >= 0; i--)
    {
      this.a.d((View)this.c.get(i));
      this.c.remove(i);
    }
    this.a.b();
  }
  
  void a(int paramInt)
  {
    int i = f(paramInt);
    View localView = this.a.b(i);
    if (localView == null) {
      return;
    }
    if (this.b.d(i)) {
      h(localView);
    }
    this.a.a(i);
  }
  
  void a(View paramView)
  {
    int i = this.a.a(paramView);
    if (i < 0) {
      return;
    }
    if (this.b.d(i)) {
      h(paramView);
    }
    this.a.a(i);
  }
  
  void a(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams, boolean paramBoolean)
  {
    if (paramInt < 0) {}
    for (int i = this.a.a();; i = f(paramInt))
    {
      this.b.a(i, paramBoolean);
      if (paramBoolean) {
        g(paramView);
      }
      this.a.a(paramView, i, paramLayoutParams);
      return;
    }
  }
  
  void a(View paramView, int paramInt, boolean paramBoolean)
  {
    if (paramInt < 0) {}
    for (int i = this.a.a();; i = f(paramInt))
    {
      this.b.a(i, paramBoolean);
      if (paramBoolean) {
        g(paramView);
      }
      this.a.a(paramView, i);
      return;
    }
  }
  
  void a(View paramView, boolean paramBoolean)
  {
    a(paramView, -1, paramBoolean);
  }
  
  int b()
  {
    return this.a.a() - this.c.size();
  }
  
  int b(View paramView)
  {
    int i = this.a.a(paramView);
    if (i == -1) {}
    while (this.b.c(i)) {
      return -1;
    }
    return i - this.b.e(i);
  }
  
  View b(int paramInt)
  {
    int i = f(paramInt);
    return this.a.b(i);
  }
  
  int c()
  {
    return this.a.a();
  }
  
  View c(int paramInt)
  {
    int i = this.c.size();
    for (int j = 0; j < i; j++)
    {
      View localView = (View)this.c.get(j);
      RecyclerView.ViewHolder localViewHolder = this.a.b(localView);
      if ((localViewHolder.getLayoutPosition() == paramInt) && (!localViewHolder.isInvalid()) && (!localViewHolder.isRemoved())) {
        return localView;
      }
    }
    return null;
  }
  
  boolean c(View paramView)
  {
    return this.c.contains(paramView);
  }
  
  View d(int paramInt)
  {
    return this.a.b(paramInt);
  }
  
  void d(View paramView)
  {
    int i = this.a.a(paramView);
    if (i < 0) {
      throw new IllegalArgumentException("view is not a child, cannot hide " + paramView);
    }
    this.b.a(i);
    g(paramView);
  }
  
  void e(int paramInt)
  {
    int i = f(paramInt);
    this.b.d(i);
    this.a.c(i);
  }
  
  void e(View paramView)
  {
    int i = this.a.a(paramView);
    if (i < 0) {
      throw new IllegalArgumentException("view is not a child, cannot hide " + paramView);
    }
    if (!this.b.c(i)) {
      throw new RuntimeException("trying to unhide a view that was not hidden" + paramView);
    }
    this.b.b(i);
    h(paramView);
  }
  
  boolean f(View paramView)
  {
    int i = this.a.a(paramView);
    if (i == -1)
    {
      if (h(paramView)) {}
      return true;
    }
    if (this.b.c(i))
    {
      this.b.d(i);
      if (!h(paramView)) {}
      this.a.a(i);
      return true;
    }
    return false;
  }
  
  public String toString()
  {
    return this.b.toString() + ", hidden list:" + this.c.size();
  }
  
  static class a
  {
    long a = 0L;
    a b;
    
    private void b()
    {
      if (this.b == null) {
        this.b = new a();
      }
    }
    
    void a()
    {
      this.a = 0L;
      if (this.b != null) {
        this.b.a();
      }
    }
    
    void a(int paramInt)
    {
      if (paramInt >= 64)
      {
        b();
        this.b.a(paramInt - 64);
        return;
      }
      this.a |= 1L << paramInt;
    }
    
    void a(int paramInt, boolean paramBoolean)
    {
      if (paramInt >= 64)
      {
        b();
        this.b.a(paramInt - 64, paramBoolean);
      }
      label109:
      label115:
      for (;;)
      {
        return;
        boolean bool;
        if ((0x0 & this.a) != 0L)
        {
          bool = true;
          long l = (1L << paramInt) - 1L;
          this.a = (l & this.a | (this.a & (l ^ 0xFFFFFFFF)) << 1);
          if (!paramBoolean) {
            break label109;
          }
          a(paramInt);
        }
        for (;;)
        {
          if ((!bool) && (this.b == null)) {
            break label115;
          }
          b();
          this.b.a(0, bool);
          return;
          bool = false;
          break;
          b(paramInt);
        }
      }
    }
    
    void b(int paramInt)
    {
      if (paramInt >= 64)
      {
        if (this.b != null) {
          this.b.b(paramInt - 64);
        }
        return;
      }
      this.a &= (0xFFFFFFFF ^ 1L << paramInt);
    }
    
    boolean c(int paramInt)
    {
      if (paramInt >= 64)
      {
        b();
        return this.b.c(paramInt - 64);
      }
      return (this.a & 1L << paramInt) != 0L;
    }
    
    boolean d(int paramInt)
    {
      if (paramInt >= 64)
      {
        b();
        bool = this.b.d(paramInt - 64);
        return bool;
      }
      long l1 = 1L << paramInt;
      if ((l1 & this.a) != 0L) {}
      for (boolean bool = true;; bool = false)
      {
        this.a &= (l1 ^ 0xFFFFFFFF);
        long l2 = l1 - 1L;
        this.a = (l2 & this.a | Long.rotateRight(this.a & (l2 ^ 0xFFFFFFFF), 1));
        if (this.b == null) {
          break;
        }
        if (this.b.c(0)) {
          a(63);
        }
        this.b.d(0);
        return bool;
      }
    }
    
    int e(int paramInt)
    {
      if (this.b == null)
      {
        if (paramInt >= 64) {
          return Long.bitCount(this.a);
        }
        return Long.bitCount(this.a & (1L << paramInt) - 1L);
      }
      if (paramInt < 64) {
        return Long.bitCount(this.a & (1L << paramInt) - 1L);
      }
      return this.b.e(paramInt - 64) + Long.bitCount(this.a);
    }
    
    public String toString()
    {
      if (this.b == null) {
        return Long.toBinaryString(this.a);
      }
      return this.b.toString() + "xx" + Long.toBinaryString(this.a);
    }
  }
  
  static abstract interface b
  {
    public abstract int a();
    
    public abstract int a(View paramView);
    
    public abstract void a(int paramInt);
    
    public abstract void a(View paramView, int paramInt);
    
    public abstract void a(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams);
    
    public abstract RecyclerView.ViewHolder b(View paramView);
    
    public abstract View b(int paramInt);
    
    public abstract void b();
    
    public abstract void c(int paramInt);
    
    public abstract void c(View paramView);
    
    public abstract void d(View paramView);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.q
 * JD-Core Version:    0.7.0.1
 */