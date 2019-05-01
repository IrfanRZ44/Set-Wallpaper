package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.support.v4.content.a.c;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;

public class ChangeTransform
  extends Transition
{
  private static final String[] g;
  private static final Property<b, float[]> h;
  private static final Property<b, PointF> i;
  private static final boolean j;
  private boolean k = true;
  private boolean l = true;
  private Matrix m = new Matrix();
  
  static
  {
    boolean bool = true;
    String[] arrayOfString = new String[3];
    arrayOfString[0] = "android:changeTransform:matrix";
    arrayOfString[bool] = "android:changeTransform:transforms";
    arrayOfString[2] = "android:changeTransform:parentMatrix";
    g = arrayOfString;
    h = new Property([F.class, "nonTranslations")
    {
      public void a(ChangeTransform.b paramAnonymousb, float[] paramAnonymousArrayOfFloat)
      {
        paramAnonymousb.a(paramAnonymousArrayOfFloat);
      }
      
      public float[] a(ChangeTransform.b paramAnonymousb)
      {
        return null;
      }
    };
    i = new Property(PointF.class, "translations")
    {
      public PointF a(ChangeTransform.b paramAnonymousb)
      {
        return null;
      }
      
      public void a(ChangeTransform.b paramAnonymousb, PointF paramAnonymousPointF)
      {
        paramAnonymousb.a(paramAnonymousPointF);
      }
    };
    if (Build.VERSION.SDK_INT >= 21) {}
    for (;;)
    {
      j = bool;
      return;
      bool = false;
    }
  }
  
  public ChangeTransform() {}
  
  public ChangeTransform(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, ac.g);
    this.k = c.a(localTypedArray, (XmlPullParser)paramAttributeSet, "reparentWithOverlay", 1, true);
    this.l = c.a(localTypedArray, (XmlPullParser)paramAttributeSet, "reparent", 0, true);
    localTypedArray.recycle();
  }
  
  private ObjectAnimator a(ah paramah1, ah paramah2, final boolean paramBoolean)
  {
    Matrix localMatrix1 = (Matrix)paramah1.a.get("android:changeTransform:matrix");
    Matrix localMatrix2 = (Matrix)paramah2.a.get("android:changeTransform:matrix");
    if (localMatrix1 == null) {
      localMatrix1 = o.a;
    }
    if (localMatrix2 == null) {}
    for (final Matrix localMatrix3 = o.a;; localMatrix3 = localMatrix2)
    {
      if (localMatrix1.equals(localMatrix3)) {
        return null;
      }
      final c localc = (c)paramah2.a.get("android:changeTransform:transforms");
      final View localView = paramah2.b;
      g(localView);
      float[] arrayOfFloat1 = new float[9];
      localMatrix1.getValues(arrayOfFloat1);
      float[] arrayOfFloat2 = new float[9];
      localMatrix3.getValues(arrayOfFloat2);
      final b localb = new b(localView, arrayOfFloat1);
      PropertyValuesHolder localPropertyValuesHolder = PropertyValuesHolder.ofObject(h, new f(new float[9]), new float[][] { arrayOfFloat1, arrayOfFloat2 });
      Path localPath = l().a(arrayOfFloat1[2], arrayOfFloat1[5], arrayOfFloat2[2], arrayOfFloat2[5]);
      ObjectAnimator localObjectAnimator = ObjectAnimator.ofPropertyValuesHolder(localb, new PropertyValuesHolder[] { localPropertyValuesHolder, u.a(i, localPath) });
      AnimatorListenerAdapter local3 = new AnimatorListenerAdapter()
      {
        private boolean g;
        private Matrix h = new Matrix();
        
        private void a(Matrix paramAnonymousMatrix)
        {
          this.h.set(paramAnonymousMatrix);
          localView.setTag(y.a.transition_transform, this.h);
          localc.a(localView);
        }
        
        public void onAnimationCancel(Animator paramAnonymousAnimator)
        {
          this.g = true;
        }
        
        public void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          if (!this.g)
          {
            if ((!paramBoolean) || (!ChangeTransform.a(ChangeTransform.this))) {
              break label52;
            }
            a(localMatrix3);
          }
          for (;;)
          {
            au.c(localView, null);
            localc.a(localView);
            return;
            label52:
            localView.setTag(y.a.transition_transform, null);
            localView.setTag(y.a.parent_matrix, null);
          }
        }
        
        public void onAnimationPause(Animator paramAnonymousAnimator)
        {
          a(localb.a());
        }
        
        public void onAnimationResume(Animator paramAnonymousAnimator)
        {
          ChangeTransform.a(localView);
        }
      };
      localObjectAnimator.addListener(local3);
      a.a(localObjectAnimator, local3);
      return localObjectAnimator;
    }
  }
  
  private boolean a(ViewGroup paramViewGroup1, ViewGroup paramViewGroup2)
  {
    if ((!b(paramViewGroup1)) || (!b(paramViewGroup2))) {
      if (paramViewGroup1 != paramViewGroup2) {}
    }
    ah localah;
    do
    {
      return true;
      return false;
      localah = b(paramViewGroup1, true);
      if (localah == null) {
        break;
      }
    } while (paramViewGroup2 == localah.b);
    return false;
    return false;
  }
  
  private void b(ah paramah1, ah paramah2)
  {
    Matrix localMatrix1 = (Matrix)paramah2.a.get("android:changeTransform:parentMatrix");
    paramah2.b.setTag(y.a.parent_matrix, localMatrix1);
    Matrix localMatrix2 = this.m;
    localMatrix2.reset();
    localMatrix1.invert(localMatrix2);
    Matrix localMatrix3 = (Matrix)paramah1.a.get("android:changeTransform:matrix");
    Matrix localMatrix4;
    if (localMatrix3 == null)
    {
      localMatrix4 = new Matrix();
      paramah1.a.put("android:changeTransform:matrix", localMatrix4);
    }
    for (Matrix localMatrix5 = localMatrix4;; localMatrix5 = localMatrix3)
    {
      localMatrix5.postConcat((Matrix)paramah1.a.get("android:changeTransform:parentMatrix"));
      localMatrix5.postConcat(localMatrix2);
      return;
    }
  }
  
  private static void b(View paramView, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8)
  {
    paramView.setTranslationX(paramFloat1);
    paramView.setTranslationY(paramFloat2);
    s.b(paramView, paramFloat3);
    paramView.setScaleX(paramFloat4);
    paramView.setScaleY(paramFloat5);
    paramView.setRotationX(paramFloat6);
    paramView.setRotationY(paramFloat7);
    paramView.setRotation(paramFloat8);
  }
  
  private void b(ViewGroup paramViewGroup, ah paramah1, ah paramah2)
  {
    View localView = paramah2.b;
    Matrix localMatrix = new Matrix((Matrix)paramah2.a.get("android:changeTransform:parentMatrix"));
    au.b(paramViewGroup, localMatrix);
    i locali = j.a(localView, paramViewGroup, localMatrix);
    if (locali == null) {}
    do
    {
      return;
      locali.a((ViewGroup)paramah1.a.get("android:changeTransform:parent"), paramah1.b);
      while (this.d != null) {
        this = this.d;
      }
      a(new a(localView, locali));
    } while (!j);
    if (paramah1.b != paramah2.b) {
      au.a(paramah1.b, 0.0F);
    }
    au.a(localView, 1.0F);
  }
  
  private void d(ah paramah)
  {
    View localView = paramah.b;
    if (localView.getVisibility() == 8) {
      return;
    }
    paramah.a.put("android:changeTransform:parent", localView.getParent());
    c localc = new c(localView);
    paramah.a.put("android:changeTransform:transforms", localc);
    Matrix localMatrix1 = localView.getMatrix();
    if ((localMatrix1 == null) || (localMatrix1.isIdentity())) {}
    for (Object localObject = null;; localObject = new Matrix(localMatrix1))
    {
      paramah.a.put("android:changeTransform:matrix", localObject);
      if (!this.l) {
        break;
      }
      Matrix localMatrix2 = new Matrix();
      ViewGroup localViewGroup = (ViewGroup)localView.getParent();
      au.a(localViewGroup, localMatrix2);
      localMatrix2.preTranslate(-localViewGroup.getScrollX(), -localViewGroup.getScrollY());
      paramah.a.put("android:changeTransform:parentMatrix", localMatrix2);
      paramah.a.put("android:changeTransform:intermediateMatrix", localView.getTag(y.a.transition_transform));
      paramah.a.put("android:changeTransform:intermediateParentMatrix", localView.getTag(y.a.parent_matrix));
      return;
    }
  }
  
  private static void g(View paramView)
  {
    b(paramView, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
  }
  
  public Animator a(ViewGroup paramViewGroup, ah paramah1, ah paramah2)
  {
    if ((paramah1 == null) || (paramah2 == null) || (!paramah1.a.containsKey("android:changeTransform:parent")) || (!paramah2.a.containsKey("android:changeTransform:parent"))) {
      return null;
    }
    ViewGroup localViewGroup1 = (ViewGroup)paramah1.a.get("android:changeTransform:parent");
    ViewGroup localViewGroup2 = (ViewGroup)paramah2.a.get("android:changeTransform:parent");
    boolean bool;
    ObjectAnimator localObjectAnimator;
    if ((this.l) && (!a(localViewGroup1, localViewGroup2)))
    {
      bool = true;
      Matrix localMatrix1 = (Matrix)paramah1.a.get("android:changeTransform:intermediateMatrix");
      if (localMatrix1 != null) {
        paramah1.a.put("android:changeTransform:matrix", localMatrix1);
      }
      Matrix localMatrix2 = (Matrix)paramah1.a.get("android:changeTransform:intermediateParentMatrix");
      if (localMatrix2 != null) {
        paramah1.a.put("android:changeTransform:parentMatrix", localMatrix2);
      }
      if (bool) {
        b(paramah1, paramah2);
      }
      localObjectAnimator = a(paramah1, paramah2, bool);
      if ((!bool) || (localObjectAnimator == null) || (!this.k)) {
        break label221;
      }
      b(paramViewGroup, paramah1, paramah2);
    }
    for (;;)
    {
      return localObjectAnimator;
      bool = false;
      break;
      label221:
      if (!j) {
        localViewGroup1.endViewTransition(paramah1.b);
      }
    }
  }
  
  public void a(ah paramah)
  {
    d(paramah);
    if (!j) {
      ((ViewGroup)paramah.b.getParent()).startViewTransition(paramah.b);
    }
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
    extends ad
  {
    private View a;
    private i b;
    
    a(View paramView, i parami)
    {
      this.a = paramView;
      this.b = parami;
    }
    
    public void a(Transition paramTransition)
    {
      paramTransition.b(this);
      j.a(this.a);
      this.a.setTag(y.a.transition_transform, null);
      this.a.setTag(y.a.parent_matrix, null);
    }
    
    public void b(Transition paramTransition)
    {
      this.b.setVisibility(4);
    }
    
    public void c(Transition paramTransition)
    {
      this.b.setVisibility(0);
    }
  }
  
  private static class b
  {
    private final Matrix a = new Matrix();
    private final View b;
    private final float[] c;
    private float d;
    private float e;
    
    b(View paramView, float[] paramArrayOfFloat)
    {
      this.b = paramView;
      this.c = ((float[])paramArrayOfFloat.clone());
      this.d = this.c[2];
      this.e = this.c[5];
      b();
    }
    
    private void b()
    {
      this.c[2] = this.d;
      this.c[5] = this.e;
      this.a.setValues(this.c);
      au.c(this.b, this.a);
    }
    
    Matrix a()
    {
      return this.a;
    }
    
    void a(PointF paramPointF)
    {
      this.d = paramPointF.x;
      this.e = paramPointF.y;
      b();
    }
    
    void a(float[] paramArrayOfFloat)
    {
      System.arraycopy(paramArrayOfFloat, 0, this.c, 0, paramArrayOfFloat.length);
      b();
    }
  }
  
  private static class c
  {
    final float a;
    final float b;
    final float c;
    final float d;
    final float e;
    final float f;
    final float g;
    final float h;
    
    c(View paramView)
    {
      this.a = paramView.getTranslationX();
      this.b = paramView.getTranslationY();
      this.c = s.m(paramView);
      this.d = paramView.getScaleX();
      this.e = paramView.getScaleY();
      this.f = paramView.getRotationX();
      this.g = paramView.getRotationY();
      this.h = paramView.getRotation();
    }
    
    public void a(View paramView)
    {
      ChangeTransform.a(paramView, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
    
    public boolean equals(Object paramObject)
    {
      if (!(paramObject instanceof c)) {}
      c localc;
      do
      {
        return false;
        localc = (c)paramObject;
      } while ((localc.a != this.a) || (localc.b != this.b) || (localc.c != this.c) || (localc.d != this.d) || (localc.e != this.e) || (localc.f != this.f) || (localc.g != this.g) || (localc.h != this.h));
      return true;
    }
    
    public int hashCode()
    {
      int i;
      int k;
      label39:
      int n;
      label65:
      int i2;
      label93:
      int i4;
      label121:
      int i6;
      label149:
      int i7;
      if (this.a != 0.0F)
      {
        i = Float.floatToIntBits(this.a);
        int j = i * 31;
        if (this.b == 0.0F) {
          break label223;
        }
        k = Float.floatToIntBits(this.b);
        int m = 31 * (k + j);
        if (this.c == 0.0F) {
          break label228;
        }
        n = Float.floatToIntBits(this.c);
        int i1 = 31 * (n + m);
        if (this.d == 0.0F) {
          break label234;
        }
        i2 = Float.floatToIntBits(this.d);
        int i3 = 31 * (i2 + i1);
        if (this.e == 0.0F) {
          break label240;
        }
        i4 = Float.floatToIntBits(this.e);
        int i5 = 31 * (i4 + i3);
        if (this.f == 0.0F) {
          break label246;
        }
        i6 = Float.floatToIntBits(this.f);
        i7 = 31 * (i6 + i5);
        if (this.g == 0.0F) {
          break label252;
        }
      }
      label223:
      label228:
      label234:
      label240:
      label246:
      label252:
      for (int i8 = Float.floatToIntBits(this.g);; i8 = 0)
      {
        int i9 = 31 * (i8 + i7);
        boolean bool = this.h < 0.0F;
        int i10 = 0;
        if (bool) {
          i10 = Float.floatToIntBits(this.h);
        }
        return i9 + i10;
        i = 0;
        break;
        k = 0;
        break label39;
        n = 0;
        break label65;
        i2 = 0;
        break label93;
        i4 = 0;
        break label121;
        i6 = 0;
        break label149;
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.transition.ChangeTransform
 * JD-Core Version:    0.7.0.1
 */