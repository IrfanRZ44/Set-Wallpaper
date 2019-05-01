package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.content.a.c;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

public class ChangeBounds
  extends Transition
{
  private static final String[] g = { "android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY" };
  private static final Property<Drawable, PointF> h = new Property(PointF.class, "boundsOrigin")
  {
    private Rect a = new Rect();
    
    public PointF a(Drawable paramAnonymousDrawable)
    {
      paramAnonymousDrawable.copyBounds(this.a);
      return new PointF(this.a.left, this.a.top);
    }
    
    public void a(Drawable paramAnonymousDrawable, PointF paramAnonymousPointF)
    {
      paramAnonymousDrawable.copyBounds(this.a);
      this.a.offsetTo(Math.round(paramAnonymousPointF.x), Math.round(paramAnonymousPointF.y));
      paramAnonymousDrawable.setBounds(this.a);
    }
  };
  private static final Property<a, PointF> i = new Property(PointF.class, "topLeft")
  {
    public PointF a(ChangeBounds.a paramAnonymousa)
    {
      return null;
    }
    
    public void a(ChangeBounds.a paramAnonymousa, PointF paramAnonymousPointF)
    {
      paramAnonymousa.a(paramAnonymousPointF);
    }
  };
  private static final Property<a, PointF> j = new Property(PointF.class, "bottomRight")
  {
    public PointF a(ChangeBounds.a paramAnonymousa)
    {
      return null;
    }
    
    public void a(ChangeBounds.a paramAnonymousa, PointF paramAnonymousPointF)
    {
      paramAnonymousa.b(paramAnonymousPointF);
    }
  };
  private static final Property<View, PointF> k = new Property(PointF.class, "bottomRight")
  {
    public PointF a(View paramAnonymousView)
    {
      return null;
    }
    
    public void a(View paramAnonymousView, PointF paramAnonymousPointF)
    {
      au.a(paramAnonymousView, paramAnonymousView.getLeft(), paramAnonymousView.getTop(), Math.round(paramAnonymousPointF.x), Math.round(paramAnonymousPointF.y));
    }
  };
  private static final Property<View, PointF> l = new Property(PointF.class, "topLeft")
  {
    public PointF a(View paramAnonymousView)
    {
      return null;
    }
    
    public void a(View paramAnonymousView, PointF paramAnonymousPointF)
    {
      au.a(paramAnonymousView, Math.round(paramAnonymousPointF.x), Math.round(paramAnonymousPointF.y), paramAnonymousView.getRight(), paramAnonymousView.getBottom());
    }
  };
  private static final Property<View, PointF> m = new Property(PointF.class, "position")
  {
    public PointF a(View paramAnonymousView)
    {
      return null;
    }
    
    public void a(View paramAnonymousView, PointF paramAnonymousPointF)
    {
      int i = Math.round(paramAnonymousPointF.x);
      int j = Math.round(paramAnonymousPointF.y);
      au.a(paramAnonymousView, i, j, i + paramAnonymousView.getWidth(), j + paramAnonymousView.getHeight());
    }
  };
  private static z q = new z();
  private int[] n = new int[2];
  private boolean o = false;
  private boolean p = false;
  
  public ChangeBounds() {}
  
  public ChangeBounds(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, ac.d);
    boolean bool = c.a(localTypedArray, (XmlResourceParser)paramAttributeSet, "resizeClip", 0, false);
    localTypedArray.recycle();
    a(bool);
  }
  
  private boolean a(View paramView1, View paramView2)
  {
    ah localah;
    if (this.p)
    {
      localah = b(paramView1, true);
      if (localah != null) {
        break label27;
      }
      if (paramView1 != paramView2) {
        break label25;
      }
    }
    label25:
    label27:
    while (paramView2 == localah.b)
    {
      return true;
      return false;
    }
    return false;
  }
  
  private void d(ah paramah)
  {
    View localView = paramah.b;
    if ((s.x(localView)) || (localView.getWidth() != 0) || (localView.getHeight() != 0))
    {
      paramah.a.put("android:changeBounds:bounds", new Rect(localView.getLeft(), localView.getTop(), localView.getRight(), localView.getBottom()));
      paramah.a.put("android:changeBounds:parent", paramah.b.getParent());
      if (this.p)
      {
        paramah.b.getLocationInWindow(this.n);
        paramah.a.put("android:changeBounds:windowX", Integer.valueOf(this.n[0]));
        paramah.a.put("android:changeBounds:windowY", Integer.valueOf(this.n[1]));
      }
      if (this.o) {
        paramah.a.put("android:changeBounds:clip", s.z(localView));
      }
    }
  }
  
  public Animator a(final ViewGroup paramViewGroup, ah paramah1, ah paramah2)
  {
    Object localObject;
    if ((paramah1 == null) || (paramah2 == null))
    {
      localObject = null;
      return localObject;
    }
    Map localMap1 = paramah1.a;
    Map localMap2 = paramah2.a;
    ViewGroup localViewGroup1 = (ViewGroup)localMap1.get("android:changeBounds:parent");
    ViewGroup localViewGroup2 = (ViewGroup)localMap2.get("android:changeBounds:parent");
    if ((localViewGroup1 == null) || (localViewGroup2 == null)) {
      return null;
    }
    final View localView = paramah2.b;
    final int i6;
    final int i8;
    final int i10;
    final int i12;
    int i13;
    int i14;
    int i15;
    int i16;
    Rect localRect3;
    final Rect localRect4;
    label400:
    Path localPath2;
    if (a(localViewGroup1, localViewGroup2))
    {
      Rect localRect1 = (Rect)paramah1.a.get("android:changeBounds:bounds");
      Rect localRect2 = (Rect)paramah2.a.get("android:changeBounds:bounds");
      int i5 = localRect1.left;
      i6 = localRect2.left;
      int i7 = localRect1.top;
      i8 = localRect2.top;
      int i9 = localRect1.right;
      i10 = localRect2.right;
      int i11 = localRect1.bottom;
      i12 = localRect2.bottom;
      i13 = i9 - i5;
      i14 = i11 - i7;
      i15 = i10 - i6;
      i16 = i12 - i8;
      localRect3 = (Rect)paramah1.a.get("android:changeBounds:clip");
      localRect4 = (Rect)paramah2.a.get("android:changeBounds:clip");
      int i17;
      if ((i13 == 0) || (i14 == 0))
      {
        i17 = 0;
        if (i15 != 0)
        {
          i17 = 0;
          if (i16 == 0) {}
        }
      }
      else
      {
        if (i5 == i6)
        {
          i17 = 0;
          if (i7 == i8) {}
        }
        else
        {
          i17 = 1;
        }
        if ((i9 != i10) || (i11 != i12)) {
          i17++;
        }
      }
      if (((localRect3 != null) && (!localRect3.equals(localRect4))) || ((localRect3 == null) && (localRect4 != null))) {
        i17++;
      }
      if (i17 <= 0) {
        break label1126;
      }
      if (!this.o)
      {
        au.a(localView, i5, i7, i9, i11);
        if (i17 == 2) {
          if ((i13 == i15) && (i14 == i16))
          {
            Path localPath7 = l().a(i5, i7, i6, i8);
            localObject = p.a(localView, m, localPath7);
          }
        }
        while ((localView.getParent() instanceof ViewGroup))
        {
          final ViewGroup localViewGroup3 = (ViewGroup)localView.getParent();
          an.a(localViewGroup3, true);
          a(new ad()
          {
            boolean a = false;
            
            public void a(Transition paramAnonymousTransition)
            {
              if (!this.a) {
                an.a(localViewGroup3, false);
              }
              paramAnonymousTransition.b(this);
            }
            
            public void b(Transition paramAnonymousTransition)
            {
              an.a(localViewGroup3, false);
            }
            
            public void c(Transition paramAnonymousTransition)
            {
              an.a(localViewGroup3, true);
            }
          });
          return localObject;
          final a locala = new a(localView);
          Path localPath5 = l().a(i5, i7, i6, i8);
          ObjectAnimator localObjectAnimator5 = p.a(locala, i, localPath5);
          Path localPath6 = l().a(i9, i11, i10, i12);
          ObjectAnimator localObjectAnimator6 = p.a(locala, j, localPath6);
          AnimatorSet localAnimatorSet = new AnimatorSet();
          localAnimatorSet.playTogether(new Animator[] { localObjectAnimator5, localObjectAnimator6 });
          localAnimatorSet.addListener(new AnimatorListenerAdapter()
          {
            private ChangeBounds.a mViewBounds = locala;
          });
          localObject = localAnimatorSet;
          continue;
          if ((i5 != i6) || (i7 != i8))
          {
            Path localPath3 = l().a(i5, i7, i6, i8);
            localObject = p.a(localView, l, localPath3);
          }
          else
          {
            Path localPath4 = l().a(i9, i11, i10, i12);
            localObject = p.a(localView, k, localPath4);
          }
        }
      }
      int i18 = Math.max(i13, i15);
      int i19 = Math.max(i14, i16);
      au.a(localView, i5, i7, i18 + i5, i19 + i7);
      if ((i5 == i6) && (i7 == i8)) {
        break label1148;
      }
      localPath2 = l().a(i5, i7, i6, i8);
    }
    label1126:
    label1148:
    for (ObjectAnimator localObjectAnimator2 = p.a(localView, m, localPath2);; localObjectAnimator2 = null)
    {
      if (localRect3 == null) {}
      for (Rect localRect5 = new Rect(0, 0, i13, i14);; localRect5 = localRect3)
      {
        if (localRect4 == null) {}
        for (Rect localRect6 = new Rect(0, 0, i15, i16);; localRect6 = localRect4)
        {
          ObjectAnimator localObjectAnimator4;
          if (!localRect5.equals(localRect6))
          {
            s.a(localView, localRect5);
            localObjectAnimator4 = ObjectAnimator.ofObject(localView, "clipBounds", q, new Object[] { localRect5, localRect6 });
            localObjectAnimator4.addListener(new AnimatorListenerAdapter()
            {
              private boolean h;
              
              public void onAnimationCancel(Animator paramAnonymousAnimator)
              {
                this.h = true;
              }
              
              public void onAnimationEnd(Animator paramAnonymousAnimator)
              {
                if (!this.h)
                {
                  s.a(localView, localRect4);
                  au.a(localView, i6, i8, i10, i12);
                }
              }
            });
          }
          for (ObjectAnimator localObjectAnimator3 = localObjectAnimator4;; localObjectAnimator3 = null)
          {
            localObject = ag.a(localObjectAnimator2, localObjectAnimator3);
            break label400;
            break;
            int i1 = ((Integer)paramah1.a.get("android:changeBounds:windowX")).intValue();
            int i2 = ((Integer)paramah1.a.get("android:changeBounds:windowY")).intValue();
            int i3 = ((Integer)paramah2.a.get("android:changeBounds:windowX")).intValue();
            int i4 = ((Integer)paramah2.a.get("android:changeBounds:windowY")).intValue();
            if ((i1 != i3) || (i2 != i4))
            {
              paramViewGroup.getLocationInWindow(this.n);
              Bitmap localBitmap = Bitmap.createBitmap(localView.getWidth(), localView.getHeight(), Bitmap.Config.ARGB_8888);
              localView.draw(new Canvas(localBitmap));
              final BitmapDrawable localBitmapDrawable = new BitmapDrawable(localBitmap);
              final float f = au.c(localView);
              au.a(localView, 0.0F);
              au.a(paramViewGroup).a(localBitmapDrawable);
              Path localPath1 = l().a(i1 - this.n[0], i2 - this.n[1], i3 - this.n[0], i4 - this.n[1]);
              ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofPropertyValuesHolder(localBitmapDrawable, new PropertyValuesHolder[] { u.a(h, localPath1) });
              localObjectAnimator1.addListener(new AnimatorListenerAdapter()
              {
                public void onAnimationEnd(Animator paramAnonymousAnimator)
                {
                  au.a(paramViewGroup).b(localBitmapDrawable);
                  au.a(localView, f);
                }
              });
              return localObjectAnimator1;
            }
            return null;
          }
        }
      }
    }
  }
  
  public void a(ah paramah)
  {
    d(paramah);
  }
  
  public void a(boolean paramBoolean)
  {
    this.o = paramBoolean;
  }
  
  public String[] a()
  {
    return g;
  }
  
  public void b(ah paramah)
  {
    d(paramah);
  }
  
  private static class a
  {
    private int a;
    private int b;
    private int c;
    private int d;
    private View e;
    private int f;
    private int g;
    
    a(View paramView)
    {
      this.e = paramView;
    }
    
    private void a()
    {
      au.a(this.e, this.a, this.b, this.c, this.d);
      this.f = 0;
      this.g = 0;
    }
    
    void a(PointF paramPointF)
    {
      this.a = Math.round(paramPointF.x);
      this.b = Math.round(paramPointF.y);
      this.f = (1 + this.f);
      if (this.f == this.g) {
        a();
      }
    }
    
    void b(PointF paramPointF)
    {
      this.c = Math.round(paramPointF.x);
      this.d = Math.round(paramPointF.y);
      this.g = (1 + this.g);
      if (this.f == this.g) {
        a();
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.transition.ChangeBounds
 * JD-Core Version:    0.7.0.1
 */