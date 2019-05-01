package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.ImageView;

public class j
{
  static final b a = new a();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      a = new c();
      return;
    }
  }
  
  public static ColorStateList a(ImageView paramImageView)
  {
    return a.a(paramImageView);
  }
  
  public static void a(ImageView paramImageView, ColorStateList paramColorStateList)
  {
    a.a(paramImageView, paramColorStateList);
  }
  
  public static void a(ImageView paramImageView, PorterDuff.Mode paramMode)
  {
    a.a(paramImageView, paramMode);
  }
  
  public static PorterDuff.Mode b(ImageView paramImageView)
  {
    return a.b(paramImageView);
  }
  
  static class a
    implements j.b
  {
    public ColorStateList a(ImageView paramImageView)
    {
      if ((paramImageView instanceof q)) {
        return ((q)paramImageView).getSupportImageTintList();
      }
      return null;
    }
    
    public void a(ImageView paramImageView, ColorStateList paramColorStateList)
    {
      if ((paramImageView instanceof q)) {
        ((q)paramImageView).setSupportImageTintList(paramColorStateList);
      }
    }
    
    public void a(ImageView paramImageView, PorterDuff.Mode paramMode)
    {
      if ((paramImageView instanceof q)) {
        ((q)paramImageView).setSupportImageTintMode(paramMode);
      }
    }
    
    public PorterDuff.Mode b(ImageView paramImageView)
    {
      if ((paramImageView instanceof q)) {
        return ((q)paramImageView).getSupportImageTintMode();
      }
      return null;
    }
  }
  
  static abstract interface b
  {
    public abstract ColorStateList a(ImageView paramImageView);
    
    public abstract void a(ImageView paramImageView, ColorStateList paramColorStateList);
    
    public abstract void a(ImageView paramImageView, PorterDuff.Mode paramMode);
    
    public abstract PorterDuff.Mode b(ImageView paramImageView);
  }
  
  static class c
    extends j.a
  {
    public ColorStateList a(ImageView paramImageView)
    {
      return paramImageView.getImageTintList();
    }
    
    public void a(ImageView paramImageView, ColorStateList paramColorStateList)
    {
      paramImageView.setImageTintList(paramColorStateList);
      Drawable localDrawable;
      if (Build.VERSION.SDK_INT == 21)
      {
        localDrawable = paramImageView.getDrawable();
        if ((paramImageView.getImageTintList() == null) || (paramImageView.getImageTintMode() == null)) {
          break label66;
        }
      }
      label66:
      for (int i = 1;; i = 0)
      {
        if ((localDrawable != null) && (i != 0))
        {
          if (localDrawable.isStateful()) {
            localDrawable.setState(paramImageView.getDrawableState());
          }
          paramImageView.setImageDrawable(localDrawable);
        }
        return;
      }
    }
    
    public void a(ImageView paramImageView, PorterDuff.Mode paramMode)
    {
      paramImageView.setImageTintMode(paramMode);
      Drawable localDrawable;
      if (Build.VERSION.SDK_INT == 21)
      {
        localDrawable = paramImageView.getDrawable();
        if ((paramImageView.getImageTintList() == null) || (paramImageView.getImageTintMode() == null)) {
          break label66;
        }
      }
      label66:
      for (int i = 1;; i = 0)
      {
        if ((localDrawable != null) && (i != 0))
        {
          if (localDrawable.isStateful()) {
            localDrawable.setState(paramImageView.getDrawableState());
          }
          paramImageView.setImageDrawable(localDrawable);
        }
        return;
      }
    }
    
    public PorterDuff.Mode b(ImageView paramImageView)
    {
      return paramImageView.getImageTintMode();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.widget.j
 * JD-Core Version:    0.7.0.1
 */