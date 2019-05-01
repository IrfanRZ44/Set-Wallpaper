package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.design.a.d;
import android.support.design.a.k;
import android.support.v4.c.a;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.s;
import android.support.v4.widget.r;
import android.support.v4.widget.r.a;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

public class BottomSheetBehavior<V extends View>
  extends CoordinatorLayout.Behavior<V>
{
  int a;
  int b;
  boolean c;
  int d = 4;
  r e;
  int f;
  WeakReference<V> g;
  WeakReference<View> h;
  int i;
  boolean j;
  private float k;
  private int l;
  private boolean m;
  private int n;
  private boolean o;
  private boolean p;
  private int q;
  private boolean r;
  private a s;
  private VelocityTracker t;
  private int u;
  private final r.a v = new r.a()
  {
    public int a(View paramAnonymousView)
    {
      if (BottomSheetBehavior.this.c) {
        return BottomSheetBehavior.this.f - BottomSheetBehavior.this.a;
      }
      return BottomSheetBehavior.this.b - BottomSheetBehavior.this.a;
    }
    
    public int a(View paramAnonymousView, int paramAnonymousInt1, int paramAnonymousInt2)
    {
      int i = BottomSheetBehavior.this.a;
      if (BottomSheetBehavior.this.c) {}
      for (int j = BottomSheetBehavior.this.f;; j = BottomSheetBehavior.this.b) {
        return a.a(paramAnonymousInt1, i, j);
      }
    }
    
    public void a(int paramAnonymousInt)
    {
      if (paramAnonymousInt == 1) {
        BottomSheetBehavior.this.b(1);
      }
    }
    
    public void a(View paramAnonymousView, float paramAnonymousFloat1, float paramAnonymousFloat2)
    {
      int i = 3;
      int j;
      if (paramAnonymousFloat2 < 0.0F) {
        j = BottomSheetBehavior.this.a;
      }
      while (BottomSheetBehavior.this.e.a(paramAnonymousView.getLeft(), j))
      {
        BottomSheetBehavior.this.b(2);
        s.a(paramAnonymousView, new BottomSheetBehavior.b(BottomSheetBehavior.this, paramAnonymousView, i));
        return;
        if ((BottomSheetBehavior.this.c) && (BottomSheetBehavior.this.a(paramAnonymousView, paramAnonymousFloat2)))
        {
          j = BottomSheetBehavior.this.f;
          i = 5;
        }
        else if (paramAnonymousFloat2 == 0.0F)
        {
          int k = paramAnonymousView.getTop();
          if (Math.abs(k - BottomSheetBehavior.this.a) < Math.abs(k - BottomSheetBehavior.this.b))
          {
            j = BottomSheetBehavior.this.a;
          }
          else
          {
            j = BottomSheetBehavior.this.b;
            i = 4;
          }
        }
        else
        {
          j = BottomSheetBehavior.this.b;
          i = 4;
        }
      }
      BottomSheetBehavior.this.b(i);
    }
    
    public void a(View paramAnonymousView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4)
    {
      BottomSheetBehavior.this.c(paramAnonymousInt2);
    }
    
    public boolean a(View paramAnonymousView, int paramAnonymousInt)
    {
      if (BottomSheetBehavior.this.d == 1) {}
      View localView;
      do
      {
        do
        {
          return false;
        } while (BottomSheetBehavior.this.j);
        if ((BottomSheetBehavior.this.d != 3) || (BottomSheetBehavior.this.i != paramAnonymousInt)) {
          break;
        }
        localView = (View)BottomSheetBehavior.this.h.get();
      } while ((localView != null) && (localView.canScrollVertically(-1)));
      if ((BottomSheetBehavior.this.g != null) && (BottomSheetBehavior.this.g.get() == paramAnonymousView)) {}
      for (boolean bool = true;; bool = false) {
        return bool;
      }
    }
    
    public int b(View paramAnonymousView, int paramAnonymousInt1, int paramAnonymousInt2)
    {
      return paramAnonymousView.getLeft();
    }
  };
  
  public BottomSheetBehavior() {}
  
  public BottomSheetBehavior(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, a.k.BottomSheetBehavior_Layout);
    TypedValue localTypedValue = localTypedArray.peekValue(a.k.BottomSheetBehavior_Layout_behavior_peekHeight);
    if ((localTypedValue != null) && (localTypedValue.data == -1)) {
      a(localTypedValue.data);
    }
    for (;;)
    {
      a(localTypedArray.getBoolean(a.k.BottomSheetBehavior_Layout_behavior_hideable, false));
      b(localTypedArray.getBoolean(a.k.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
      localTypedArray.recycle();
      this.k = ViewConfiguration.get(paramContext).getScaledMaximumFlingVelocity();
      return;
      a(localTypedArray.getDimensionPixelSize(a.k.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
    }
  }
  
  private void a()
  {
    this.i = -1;
    if (this.t != null)
    {
      this.t.recycle();
      this.t = null;
    }
  }
  
  private float b()
  {
    this.t.computeCurrentVelocity(1000, this.k);
    return this.t.getYVelocity(this.i);
  }
  
  View a(View paramView)
  {
    if (s.v(paramView)) {
      return paramView;
    }
    if ((paramView instanceof ViewGroup))
    {
      ViewGroup localViewGroup = (ViewGroup)paramView;
      int i1 = localViewGroup.getChildCount();
      for (int i2 = 0; i2 < i1; i2++)
      {
        View localView = a(localViewGroup.getChildAt(i2));
        if (localView != null) {
          return localView;
        }
      }
    }
    return null;
  }
  
  public final void a(int paramInt)
  {
    boolean bool = true;
    if (paramInt == -1)
    {
      if (this.m) {
        break label100;
      }
      this.m = bool;
    }
    for (;;)
    {
      if ((bool) && (this.d == 4) && (this.g != null))
      {
        View localView = (View)this.g.get();
        if (localView != null) {
          localView.requestLayout();
        }
      }
      return;
      if ((this.m) || (this.l != paramInt))
      {
        this.m = false;
        this.l = Math.max(0, paramInt);
        this.b = (this.f - paramInt);
      }
      else
      {
        label100:
        bool = false;
      }
    }
  }
  
  public void a(CoordinatorLayout paramCoordinatorLayout, V paramV, Parcelable paramParcelable)
  {
    SavedState localSavedState = (SavedState)paramParcelable;
    super.a(paramCoordinatorLayout, paramV, localSavedState.getSuperState());
    if ((localSavedState.a == 1) || (localSavedState.a == 2))
    {
      this.d = 4;
      return;
    }
    this.d = localSavedState.a;
  }
  
  public void a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    if (paramView != (View)this.h.get()) {
      return;
    }
    int i1 = paramV.getTop();
    int i2 = i1 - paramInt2;
    if (paramInt2 > 0) {
      if (i2 < this.a)
      {
        paramArrayOfInt[1] = (i1 - this.a);
        s.c(paramV, -paramArrayOfInt[1]);
        b(3);
      }
    }
    for (;;)
    {
      c(paramV.getTop());
      this.q = paramInt2;
      this.r = true;
      return;
      paramArrayOfInt[1] = paramInt2;
      s.c(paramV, -paramInt2);
      b(1);
      continue;
      if ((paramInt2 < 0) && (!paramView.canScrollVertically(-1))) {
        if ((i2 <= this.b) || (this.c))
        {
          paramArrayOfInt[1] = paramInt2;
          s.c(paramV, -paramInt2);
          b(1);
        }
        else
        {
          paramArrayOfInt[1] = (i1 - this.b);
          s.c(paramV, -paramArrayOfInt[1]);
          b(4);
        }
      }
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt)
  {
    if ((s.q(paramCoordinatorLayout)) && (!s.q(paramV))) {
      s.b(paramV, true);
    }
    int i1 = paramV.getTop();
    paramCoordinatorLayout.a(paramV, paramInt);
    this.f = paramCoordinatorLayout.getHeight();
    int i2;
    if (this.m)
    {
      if (this.n == 0) {
        this.n = paramCoordinatorLayout.getResources().getDimensionPixelSize(a.d.design_bottom_sheet_peek_height_min);
      }
      i2 = Math.max(this.n, this.f - 9 * paramCoordinatorLayout.getWidth() / 16);
      this.a = Math.max(0, this.f - paramV.getHeight());
      this.b = Math.max(this.f - i2, this.a);
      if (this.d != 3) {
        break label200;
      }
      s.c(paramV, this.a);
    }
    for (;;)
    {
      if (this.e == null) {
        this.e = r.a(paramCoordinatorLayout, this.v);
      }
      this.g = new WeakReference(paramV);
      this.h = new WeakReference(a(paramV));
      return true;
      i2 = this.l;
      break;
      label200:
      if ((this.c) && (this.d == 5)) {
        s.c(paramV, this.f);
      } else if (this.d == 4) {
        s.c(paramV, this.b);
      } else if ((this.d == 1) || (this.d == 2)) {
        s.c(paramV, i1 - paramV.getTop());
      }
    }
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent)
  {
    int i1 = 1;
    if (!paramV.isShown())
    {
      this.p = i1;
      return false;
    }
    int i3 = paramMotionEvent.getActionMasked();
    if (i3 == 0) {
      a();
    }
    if (this.t == null) {
      this.t = VelocityTracker.obtain();
    }
    this.t.addMovement(paramMotionEvent);
    switch (i3)
    {
    }
    while ((!this.p) && (this.e.a(paramMotionEvent)))
    {
      return i1;
      this.j = false;
      this.i = -1;
      if (this.p)
      {
        this.p = false;
        return false;
        int i4 = (int)paramMotionEvent.getX();
        this.u = ((int)paramMotionEvent.getY());
        View localView1;
        if (this.h != null)
        {
          localView1 = (View)this.h.get();
          label168:
          if ((localView1 != null) && (paramCoordinatorLayout.a(localView1, i4, this.u)))
          {
            this.i = paramMotionEvent.getPointerId(paramMotionEvent.getActionIndex());
            this.j = i1;
          }
          if ((this.i != -1) || (paramCoordinatorLayout.a(paramV, i4, this.u))) {
            break label247;
          }
        }
        label247:
        int i6;
        for (int i5 = i1;; i6 = 0)
        {
          this.p = i5;
          break;
          localView1 = null;
          break label168;
        }
      }
    }
    View localView2 = (View)this.h.get();
    if ((i3 == 2) && (localView2 != null) && (!this.p) && (this.d != i1) && (!paramCoordinatorLayout.a(localView2, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY())) && (Math.abs(this.u - paramMotionEvent.getY()) > this.e.d())) {}
    for (;;)
    {
      return i1;
      int i2 = 0;
    }
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, float paramFloat1, float paramFloat2)
  {
    return (paramView == this.h.get()) && ((this.d != 3) || (super.a(paramCoordinatorLayout, paramV, paramView, paramFloat1, paramFloat2)));
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView1, View paramView2, int paramInt)
  {
    this.q = 0;
    this.r = false;
    int i1 = paramInt & 0x2;
    boolean bool = false;
    if (i1 != 0) {
      bool = true;
    }
    return bool;
  }
  
  boolean a(View paramView, float paramFloat)
  {
    if (this.o) {}
    do
    {
      return true;
      if (paramView.getTop() < this.b) {
        return false;
      }
    } while (Math.abs(paramView.getTop() + 0.1F * paramFloat - this.b) / this.l > 0.5F);
    return false;
  }
  
  public Parcelable b(CoordinatorLayout paramCoordinatorLayout, V paramV)
  {
    return new SavedState(super.b(paramCoordinatorLayout, paramV), this.d);
  }
  
  void b(int paramInt)
  {
    if (this.d == paramInt) {}
    View localView;
    do
    {
      return;
      this.d = paramInt;
      localView = (View)this.g.get();
    } while ((localView == null) || (this.s == null));
    this.s.a(localView, paramInt);
  }
  
  public void b(boolean paramBoolean)
  {
    this.o = paramBoolean;
  }
  
  public boolean b(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent)
  {
    int i1 = 1;
    if (!paramV.isShown()) {
      i1 = 0;
    }
    do
    {
      int i2;
      do
      {
        return i1;
        i2 = paramMotionEvent.getActionMasked();
      } while ((this.d == i1) && (i2 == 0));
      if (this.e != null) {
        this.e.b(paramMotionEvent);
      }
      if (i2 == 0) {
        a();
      }
      if (this.t == null) {
        this.t = VelocityTracker.obtain();
      }
      this.t.addMovement(paramMotionEvent);
      if ((i2 == 2) && (!this.p) && (Math.abs(this.u - paramMotionEvent.getY()) > this.e.d())) {
        this.e.a(paramV, paramMotionEvent.getPointerId(paramMotionEvent.getActionIndex()));
      }
    } while (!this.p);
    return false;
  }
  
  void c(int paramInt)
  {
    View localView = (View)this.g.get();
    if ((localView != null) && (this.s != null))
    {
      if (paramInt > this.b) {
        this.s.a(localView, (this.b - paramInt) / (this.f - this.b));
      }
    }
    else {
      return;
    }
    this.s.a(localView, (this.b - paramInt) / (this.b - this.a));
  }
  
  public void c(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView)
  {
    int i1 = 3;
    if (paramV.getTop() == this.a) {
      b(i1);
    }
    while ((this.h == null) || (paramView != this.h.get()) || (!this.r)) {
      return;
    }
    int i2;
    if (this.q > 0)
    {
      i2 = this.a;
      if (!this.e.a(paramV, paramV.getLeft(), i2)) {
        break label202;
      }
      b(2);
      s.a(paramV, new b(paramV, i1));
    }
    for (;;)
    {
      this.r = false;
      return;
      if ((this.c) && (a(paramV, b())))
      {
        i2 = this.f;
        i1 = 5;
        break;
      }
      if (this.q == 0)
      {
        int i3 = paramV.getTop();
        if (Math.abs(i3 - this.a) < Math.abs(i3 - this.b))
        {
          i2 = this.a;
          break;
        }
        i2 = this.b;
        i1 = 4;
        break;
      }
      i2 = this.b;
      i1 = 4;
      break;
      label202:
      b(i1);
    }
  }
  
  protected static class SavedState
    extends AbsSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator()
    {
      public BottomSheetBehavior.SavedState a(Parcel paramAnonymousParcel)
      {
        return new BottomSheetBehavior.SavedState(paramAnonymousParcel, null);
      }
      
      public BottomSheetBehavior.SavedState a(Parcel paramAnonymousParcel, ClassLoader paramAnonymousClassLoader)
      {
        return new BottomSheetBehavior.SavedState(paramAnonymousParcel, paramAnonymousClassLoader);
      }
      
      public BottomSheetBehavior.SavedState[] a(int paramAnonymousInt)
      {
        return new BottomSheetBehavior.SavedState[paramAnonymousInt];
      }
    };
    final int a;
    
    public SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super(paramClassLoader);
      this.a = paramParcel.readInt();
    }
    
    public SavedState(Parcelable paramParcelable, int paramInt)
    {
      super();
      this.a = paramInt;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(this.a);
    }
  }
  
  public static abstract class a
  {
    public abstract void a(View paramView, float paramFloat);
    
    public abstract void a(View paramView, int paramInt);
  }
  
  private class b
    implements Runnable
  {
    private final View b;
    private final int c;
    
    b(View paramView, int paramInt)
    {
      this.b = paramView;
      this.c = paramInt;
    }
    
    public void run()
    {
      if ((BottomSheetBehavior.this.e != null) && (BottomSheetBehavior.this.e.a(true)))
      {
        s.a(this.b, this);
        return;
      }
      BottomSheetBehavior.this.b(this.c);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.design.widget.BottomSheetBehavior
 * JD-Core Version:    0.7.0.1
 */