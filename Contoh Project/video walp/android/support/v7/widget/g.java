package android.support.v7.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.support.v4.a.a.c;
import android.util.AttributeSet;
import android.widget.ProgressBar;

class g
{
  private static final int[] a = { 16843067, 16843068 };
  private final ProgressBar b;
  private Bitmap c;
  
  g(ProgressBar paramProgressBar)
  {
    this.b = paramProgressBar;
  }
  
  private Drawable a(Drawable paramDrawable)
  {
    if ((paramDrawable instanceof AnimationDrawable))
    {
      AnimationDrawable localAnimationDrawable1 = (AnimationDrawable)paramDrawable;
      int i = localAnimationDrawable1.getNumberOfFrames();
      AnimationDrawable localAnimationDrawable2 = new AnimationDrawable();
      localAnimationDrawable2.setOneShot(localAnimationDrawable1.isOneShot());
      for (int j = 0; j < i; j++)
      {
        Drawable localDrawable = a(localAnimationDrawable1.getFrame(j), true);
        localDrawable.setLevel(10000);
        localAnimationDrawable2.addFrame(localDrawable, localAnimationDrawable1.getDuration(j));
      }
      localAnimationDrawable2.setLevel(10000);
      paramDrawable = localAnimationDrawable2;
    }
    return paramDrawable;
  }
  
  private Drawable a(Drawable paramDrawable, boolean paramBoolean)
  {
    int i = 0;
    if ((paramDrawable instanceof c))
    {
      Drawable localDrawable2 = ((c)paramDrawable).a();
      if (localDrawable2 != null)
      {
        Drawable localDrawable3 = a(localDrawable2, paramBoolean);
        ((c)paramDrawable).a(localDrawable3);
      }
    }
    do
    {
      Object localObject = paramDrawable;
      for (;;)
      {
        return localObject;
        if (!(paramDrawable instanceof LayerDrawable)) {
          break;
        }
        LayerDrawable localLayerDrawable = (LayerDrawable)paramDrawable;
        int j = localLayerDrawable.getNumberOfLayers();
        Drawable[] arrayOfDrawable = new Drawable[j];
        int k = 0;
        if (k < j)
        {
          int m = localLayerDrawable.getId(k);
          Drawable localDrawable1 = localLayerDrawable.getDrawable(k);
          if ((m == 16908301) || (m == 16908303)) {}
          for (boolean bool = true;; bool = false)
          {
            arrayOfDrawable[k] = a(localDrawable1, bool);
            k++;
            break;
          }
        }
        localObject = new LayerDrawable(arrayOfDrawable);
        while (i < j)
        {
          ((LayerDrawable)localObject).setId(i, localLayerDrawable.getId(i));
          i++;
        }
      }
    } while (!(paramDrawable instanceof BitmapDrawable));
    BitmapDrawable localBitmapDrawable = (BitmapDrawable)paramDrawable;
    Bitmap localBitmap = localBitmapDrawable.getBitmap();
    if (this.c == null) {
      this.c = localBitmap;
    }
    ShapeDrawable localShapeDrawable = new ShapeDrawable(b());
    BitmapShader localBitmapShader = new BitmapShader(localBitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
    localShapeDrawable.getPaint().setShader(localBitmapShader);
    localShapeDrawable.getPaint().setColorFilter(localBitmapDrawable.getPaint().getColorFilter());
    if (paramBoolean) {
      return new ClipDrawable(localShapeDrawable, 3, 1);
    }
    return localShapeDrawable;
  }
  
  private Shape b()
  {
    return new RoundRectShape(new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F }, null, null);
  }
  
  Bitmap a()
  {
    return this.c;
  }
  
  void a(AttributeSet paramAttributeSet, int paramInt)
  {
    TintTypedArray localTintTypedArray = TintTypedArray.obtainStyledAttributes(this.b.getContext(), paramAttributeSet, a, paramInt, 0);
    Drawable localDrawable1 = localTintTypedArray.getDrawableIfKnown(0);
    if (localDrawable1 != null) {
      this.b.setIndeterminateDrawable(a(localDrawable1));
    }
    Drawable localDrawable2 = localTintTypedArray.getDrawableIfKnown(1);
    if (localDrawable2 != null) {
      this.b.setProgressDrawable(a(localDrawable2, false));
    }
    localTintTypedArray.recycle();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.g
 * JD-Core Version:    0.7.0.1
 */