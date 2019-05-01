package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.v4.content.a.c;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

public abstract class Visibility
  extends Transition
{
  private static final String[] g = { "android:visibility:visibility", "android:visibility:parent" };
  private int h = 3;
  
  public Visibility() {}
  
  public Visibility(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, ac.e);
    int i = c.a(localTypedArray, (XmlResourceParser)paramAttributeSet, "transitionVisibilityMode", 0, 0);
    localTypedArray.recycle();
    if (i != 0) {
      b(i);
    }
  }
  
  private b b(ah paramah1, ah paramah2)
  {
    b localb = new b(null);
    localb.a = false;
    localb.b = false;
    if ((paramah1 != null) && (paramah1.a.containsKey("android:visibility:visibility")))
    {
      localb.c = ((Integer)paramah1.a.get("android:visibility:visibility")).intValue();
      localb.e = ((ViewGroup)paramah1.a.get("android:visibility:parent"));
      if ((paramah2 == null) || (!paramah2.a.containsKey("android:visibility:visibility"))) {
        break label178;
      }
      localb.d = ((Integer)paramah2.a.get("android:visibility:visibility")).intValue();
      localb.f = ((ViewGroup)paramah2.a.get("android:visibility:parent"));
    }
    for (;;)
    {
      if ((paramah1 != null) && (paramah2 != null))
      {
        if ((localb.c == localb.d) && (localb.e == localb.f))
        {
          return localb;
          localb.c = -1;
          localb.e = null;
          break;
          label178:
          localb.d = -1;
          localb.f = null;
          continue;
        }
        if (localb.c != localb.d) {
          if (localb.c == 0)
          {
            localb.b = false;
            localb.a = true;
          }
        }
      }
    }
    for (;;)
    {
      return localb;
      if (localb.d == 0)
      {
        localb.b = true;
        localb.a = true;
        continue;
        if (localb.f == null)
        {
          localb.b = false;
          localb.a = true;
        }
        else if (localb.e == null)
        {
          localb.b = true;
          localb.a = true;
          continue;
          if ((paramah1 == null) && (localb.d == 0))
          {
            localb.b = true;
            localb.a = true;
          }
          else if ((paramah2 == null) && (localb.c == 0))
          {
            localb.b = false;
            localb.a = true;
          }
        }
      }
    }
  }
  
  private void d(ah paramah)
  {
    int i = paramah.b.getVisibility();
    paramah.a.put("android:visibility:visibility", Integer.valueOf(i));
    paramah.a.put("android:visibility:parent", paramah.b.getParent());
    int[] arrayOfInt = new int[2];
    paramah.b.getLocationOnScreen(arrayOfInt);
    paramah.a.put("android:visibility:screenLocation", arrayOfInt);
  }
  
  public Animator a(ViewGroup paramViewGroup, ah paramah1, int paramInt1, ah paramah2, int paramInt2)
  {
    if (((0x1 & this.h) != 1) || (paramah2 == null)) {
      return null;
    }
    if (paramah1 == null)
    {
      View localView = (View)paramah2.b.getParent();
      if (b(b(localView, false), a(localView, false)).a) {
        return null;
      }
    }
    return a(paramViewGroup, paramah2.b, paramah1, paramah2);
  }
  
  public Animator a(ViewGroup paramViewGroup, ah paramah1, ah paramah2)
  {
    b localb = b(paramah1, paramah2);
    if ((localb.a) && ((localb.e != null) || (localb.f != null)))
    {
      if (localb.b) {
        return a(paramViewGroup, paramah1, localb.c, paramah2, localb.d);
      }
      return b(paramViewGroup, paramah1, localb.c, paramah2, localb.d);
    }
    return null;
  }
  
  public Animator a(ViewGroup paramViewGroup, View paramView, ah paramah1, ah paramah2)
  {
    return null;
  }
  
  public void a(ah paramah)
  {
    d(paramah);
  }
  
  public boolean a(ah paramah1, ah paramah2)
  {
    if ((paramah1 == null) && (paramah2 == null)) {}
    b localb;
    do
    {
      do
      {
        return false;
      } while ((paramah1 != null) && (paramah2 != null) && (paramah2.a.containsKey("android:visibility:visibility") != paramah1.a.containsKey("android:visibility:visibility")));
      localb = b(paramah1, paramah2);
    } while ((!localb.a) || ((localb.c != 0) && (localb.d != 0)));
    return true;
  }
  
  public String[] a()
  {
    return g;
  }
  
  public Animator b(ViewGroup paramViewGroup, ah paramah1, int paramInt1, ah paramah2, int paramInt2)
  {
    if ((0x2 & this.h) != 2) {
      return null;
    }
    Object localObject1;
    label22:
    View localView1;
    if (paramah1 != null)
    {
      localObject1 = paramah1.b;
      if (paramah2 == null) {
        break label196;
      }
      localView1 = paramah2.b;
      label34:
      if ((localView1 != null) && (localView1.getParent() != null)) {
        break label330;
      }
      if (localView1 == null) {
        break label202;
      }
      localObject1 = localView1;
      localView1 = null;
    }
    for (;;)
    {
      label59:
      final am localam;
      Animator localAnimator2;
      label196:
      label202:
      View localView2;
      Object localObject2;
      if ((localObject1 != null) && (paramah1 != null))
      {
        int[] arrayOfInt1 = (int[])paramah1.a.get("android:visibility:screenLocation");
        int j = arrayOfInt1[0];
        int k = arrayOfInt1[1];
        int[] arrayOfInt2 = new int[2];
        paramViewGroup.getLocationOnScreen(arrayOfInt2);
        ((View)localObject1).offsetLeftAndRight(j - arrayOfInt2[0] - ((View)localObject1).getLeft());
        ((View)localObject1).offsetTopAndBottom(k - arrayOfInt2[1] - ((View)localObject1).getTop());
        localam = an.a(paramViewGroup);
        localam.a((View)localObject1);
        localAnimator2 = b(paramViewGroup, (View)localObject1, paramah1, paramah2);
        if (localAnimator2 == null)
        {
          localam.b((View)localObject1);
          return localAnimator2;
          localObject1 = null;
          break label22;
          localView1 = null;
          break label34;
          if (localObject1 == null) {
            break label470;
          }
          if (((View)localObject1).getParent() == null)
          {
            localView1 = null;
            continue;
          }
          if (!(((View)localObject1).getParent() instanceof View)) {
            break label470;
          }
          localView2 = (View)((View)localObject1).getParent();
          if (!b(a(localView2, true), b(localView2, true)).a) {
            localObject2 = ag.a(paramViewGroup, (View)localObject1, localView2);
          }
        }
      }
      for (;;)
      {
        localObject1 = localObject2;
        localView1 = null;
        break label59;
        if (localView2.getParent() == null)
        {
          int m = localView2.getId();
          if ((m != -1) && (paramViewGroup.findViewById(m) != null) && (this.e))
          {
            localObject2 = localObject1;
            continue;
            label330:
            if (paramInt2 == 4)
            {
              localObject1 = null;
              break label59;
            }
            if (localObject1 == localView1)
            {
              localObject1 = null;
              break label59;
            }
            localView1 = null;
            break label59;
            localAnimator2.addListener(new AnimatorListenerAdapter()
            {
              public void onAnimationEnd(Animator paramAnonymousAnimator)
              {
                localam.b(this.b);
              }
            });
            return localAnimator2;
            if (localView1 == null) {
              break;
            }
            int i = localView1.getVisibility();
            au.a(localView1, 0);
            Animator localAnimator1 = b(paramViewGroup, localView1, paramah1, paramah2);
            if (localAnimator1 != null)
            {
              a locala = new a(localView1, paramInt2, true);
              localAnimator1.addListener(locala);
              a.a(localAnimator1, locala);
              a(locala);
              return localAnimator1;
            }
            au.a(localView1, i);
            return localAnimator1;
          }
        }
        localObject2 = null;
      }
      label470:
      localView1 = null;
      localObject1 = null;
    }
  }
  
  public Animator b(ViewGroup paramViewGroup, View paramView, ah paramah1, ah paramah2)
  {
    return null;
  }
  
  public void b(int paramInt)
  {
    if ((paramInt & 0xFFFFFFFC) != 0) {
      throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }
    this.h = paramInt;
  }
  
  public void b(ah paramah)
  {
    d(paramah);
  }
  
  public int p()
  {
    return this.h;
  }
  
  private static class a
    extends AnimatorListenerAdapter
    implements Transition.c, b.a
  {
    boolean a = false;
    private final View b;
    private final int c;
    private final ViewGroup d;
    private final boolean e;
    private boolean f;
    
    a(View paramView, int paramInt, boolean paramBoolean)
    {
      this.b = paramView;
      this.c = paramInt;
      this.d = ((ViewGroup)paramView.getParent());
      this.e = paramBoolean;
      a(true);
    }
    
    private void a()
    {
      if (!this.a)
      {
        au.a(this.b, this.c);
        if (this.d != null) {
          this.d.invalidate();
        }
      }
      a(false);
    }
    
    private void a(boolean paramBoolean)
    {
      if ((this.e) && (this.f != paramBoolean) && (this.d != null))
      {
        this.f = paramBoolean;
        an.a(this.d, paramBoolean);
      }
    }
    
    public void a(Transition paramTransition)
    {
      a();
      paramTransition.b(this);
    }
    
    public void b(Transition paramTransition)
    {
      a(false);
    }
    
    public void c(Transition paramTransition)
    {
      a(true);
    }
    
    public void d(Transition paramTransition) {}
    
    public void onAnimationCancel(Animator paramAnimator)
    {
      this.a = true;
    }
    
    public void onAnimationEnd(Animator paramAnimator)
    {
      a();
    }
    
    public void onAnimationPause(Animator paramAnimator)
    {
      if (!this.a) {
        au.a(this.b, this.c);
      }
    }
    
    public void onAnimationRepeat(Animator paramAnimator) {}
    
    public void onAnimationResume(Animator paramAnimator)
    {
      if (!this.a) {
        au.a(this.b, 0);
      }
    }
    
    public void onAnimationStart(Animator paramAnimator) {}
  }
  
  private static class b
  {
    boolean a;
    boolean b;
    int c;
    int d;
    ViewGroup e;
    ViewGroup f;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.transition.Visibility
 * JD-Core Version:    0.7.0.1
 */