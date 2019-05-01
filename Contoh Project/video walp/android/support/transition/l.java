package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

class l
  implements n
{
  public void a(ImageView paramImageView)
  {
    ImageView.ScaleType localScaleType = paramImageView.getScaleType();
    paramImageView.setTag(y.a.save_scale_type, localScaleType);
    if (localScaleType == ImageView.ScaleType.MATRIX) {
      paramImageView.setTag(y.a.save_image_matrix, paramImageView.getImageMatrix());
    }
    for (;;)
    {
      paramImageView.setImageMatrix(o.a);
      return;
      paramImageView.setScaleType(ImageView.ScaleType.MATRIX);
    }
  }
  
  public void a(final ImageView paramImageView, Animator paramAnimator)
  {
    paramAnimator.addListener(new AnimatorListenerAdapter()
    {
      public void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        ImageView.ScaleType localScaleType = (ImageView.ScaleType)paramImageView.getTag(y.a.save_scale_type);
        paramImageView.setScaleType(localScaleType);
        paramImageView.setTag(y.a.save_scale_type, null);
        if (localScaleType == ImageView.ScaleType.MATRIX)
        {
          paramImageView.setImageMatrix((Matrix)paramImageView.getTag(y.a.save_image_matrix));
          paramImageView.setTag(y.a.save_image_matrix, null);
        }
        paramAnonymousAnimator.removeListener(this);
      }
    });
  }
  
  public void a(ImageView paramImageView, Matrix paramMatrix)
  {
    paramImageView.setImageMatrix(paramMatrix);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.transition.l
 * JD-Core Version:    0.7.0.1
 */