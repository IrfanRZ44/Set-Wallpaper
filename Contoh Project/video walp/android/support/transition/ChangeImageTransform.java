package android.support.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.Map;

public class ChangeImageTransform
  extends Transition
{
  private static final String[] g = { "android:changeImageTransform:matrix", "android:changeImageTransform:bounds" };
  private static final TypeEvaluator<Matrix> h = new TypeEvaluator()
  {
    public Matrix a(float paramAnonymousFloat, Matrix paramAnonymousMatrix1, Matrix paramAnonymousMatrix2)
    {
      return null;
    }
  };
  private static final Property<ImageView, Matrix> i = new Property(Matrix.class, "animatedTransform")
  {
    public Matrix a(ImageView paramAnonymousImageView)
    {
      return null;
    }
    
    public void a(ImageView paramAnonymousImageView, Matrix paramAnonymousMatrix)
    {
      k.a(paramAnonymousImageView, paramAnonymousMatrix);
    }
  };
  
  public ChangeImageTransform() {}
  
  public ChangeImageTransform(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private ObjectAnimator a(ImageView paramImageView)
  {
    return ObjectAnimator.ofObject(paramImageView, i, h, new Matrix[] { null, null });
  }
  
  private ObjectAnimator a(ImageView paramImageView, Matrix paramMatrix1, Matrix paramMatrix2)
  {
    return ObjectAnimator.ofObject(paramImageView, i, new ag.a(), new Matrix[] { paramMatrix1, paramMatrix2 });
  }
  
  private static Matrix b(ImageView paramImageView)
  {
    switch (3.a[paramImageView.getScaleType().ordinal()])
    {
    default: 
      return new Matrix(paramImageView.getImageMatrix());
    case 1: 
      return c(paramImageView);
    }
    return d(paramImageView);
  }
  
  private static Matrix c(ImageView paramImageView)
  {
    Drawable localDrawable = paramImageView.getDrawable();
    Matrix localMatrix = new Matrix();
    localMatrix.postScale(paramImageView.getWidth() / localDrawable.getIntrinsicWidth(), paramImageView.getHeight() / localDrawable.getIntrinsicHeight());
    return localMatrix;
  }
  
  private static Matrix d(ImageView paramImageView)
  {
    Drawable localDrawable = paramImageView.getDrawable();
    int j = localDrawable.getIntrinsicWidth();
    int k = paramImageView.getWidth();
    float f1 = k / j;
    int m = localDrawable.getIntrinsicHeight();
    int n = paramImageView.getHeight();
    float f2 = Math.max(f1, n / m);
    float f3 = f2 * j;
    float f4 = f2 * m;
    int i1 = Math.round((k - f3) / 2.0F);
    int i2 = Math.round((n - f4) / 2.0F);
    Matrix localMatrix = new Matrix();
    localMatrix.postScale(f2, f2);
    localMatrix.postTranslate(i1, i2);
    return localMatrix;
  }
  
  private void d(ah paramah)
  {
    View localView = paramah.b;
    if ((!(localView instanceof ImageView)) || (localView.getVisibility() != 0)) {}
    ImageView localImageView;
    do
    {
      return;
      localImageView = (ImageView)localView;
    } while (localImageView.getDrawable() == null);
    Map localMap = paramah.a;
    localMap.put("android:changeImageTransform:bounds", new Rect(localView.getLeft(), localView.getTop(), localView.getRight(), localView.getBottom()));
    localMap.put("android:changeImageTransform:matrix", b(localImageView));
  }
  
  public Animator a(ViewGroup paramViewGroup, ah paramah1, ah paramah2)
  {
    if ((paramah1 == null) || (paramah2 == null)) {
      return null;
    }
    Rect localRect1 = (Rect)paramah1.a.get("android:changeImageTransform:bounds");
    Rect localRect2 = (Rect)paramah2.a.get("android:changeImageTransform:bounds");
    if ((localRect1 == null) || (localRect2 == null)) {
      return null;
    }
    Matrix localMatrix1 = (Matrix)paramah1.a.get("android:changeImageTransform:matrix");
    Matrix localMatrix2 = (Matrix)paramah2.a.get("android:changeImageTransform:matrix");
    if (((localMatrix1 == null) && (localMatrix2 == null)) || ((localMatrix1 != null) && (localMatrix1.equals(localMatrix2)))) {}
    for (int j = 1; (localRect1.equals(localRect2)) && (j != 0); j = 0) {
      return null;
    }
    ImageView localImageView = (ImageView)paramah2.b;
    Drawable localDrawable = localImageView.getDrawable();
    int k = localDrawable.getIntrinsicWidth();
    int m = localDrawable.getIntrinsicHeight();
    k.a(localImageView);
    if ((k == 0) || (m == 0)) {}
    for (ObjectAnimator localObjectAnimator = a(localImageView);; localObjectAnimator = a(localImageView, localMatrix1, localMatrix2))
    {
      k.a(localImageView, localObjectAnimator);
      return localObjectAnimator;
      if (localMatrix1 == null) {
        localMatrix1 = o.a;
      }
      if (localMatrix2 == null) {
        localMatrix2 = o.a;
      }
      i.set(localImageView, localMatrix1);
    }
  }
  
  public void a(ah paramah)
  {
    d(paramah);
  }
  
  public String[] a()
  {
    return g;
  }
  
  public void b(ah paramah)
  {
    d(paramah);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.transition.ChangeImageTransform
 * JD-Core Version:    0.7.0.1
 */