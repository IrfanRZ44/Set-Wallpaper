package android.support.v4.a.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.util.Log;
import java.lang.reflect.Method;

class f
  extends e
{
  private static Method d;
  
  f(Drawable paramDrawable)
  {
    super(paramDrawable);
    d();
  }
  
  f(d.a parama, Resources paramResources)
  {
    super(parama, paramResources);
    d();
  }
  
  private void d()
  {
    if (d == null) {}
    try
    {
      d = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
      return;
    }
    catch (Exception localException)
    {
      Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", localException);
    }
  }
  
  d.a b()
  {
    return new a(this.b, null);
  }
  
  protected boolean c()
  {
    int i = Build.VERSION.SDK_INT;
    boolean bool1 = false;
    if (i == 21)
    {
      Drawable localDrawable = this.c;
      if ((!(localDrawable instanceof GradientDrawable)) && (!(localDrawable instanceof DrawableContainer)) && (!(localDrawable instanceof InsetDrawable)))
      {
        boolean bool2 = localDrawable instanceof RippleDrawable;
        bool1 = false;
        if (!bool2) {}
      }
      else
      {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public Rect getDirtyBounds()
  {
    return this.c.getDirtyBounds();
  }
  
  public void getOutline(Outline paramOutline)
  {
    this.c.getOutline(paramOutline);
  }
  
  public void setHotspot(float paramFloat1, float paramFloat2)
  {
    this.c.setHotspot(paramFloat1, paramFloat2);
  }
  
  public void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.c.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public boolean setState(int[] paramArrayOfInt)
  {
    if (super.setState(paramArrayOfInt))
    {
      invalidateSelf();
      return true;
    }
    return false;
  }
  
  public void setTint(int paramInt)
  {
    if (c())
    {
      super.setTint(paramInt);
      return;
    }
    this.c.setTint(paramInt);
  }
  
  public void setTintList(ColorStateList paramColorStateList)
  {
    if (c())
    {
      super.setTintList(paramColorStateList);
      return;
    }
    this.c.setTintList(paramColorStateList);
  }
  
  public void setTintMode(PorterDuff.Mode paramMode)
  {
    if (c())
    {
      super.setTintMode(paramMode);
      return;
    }
    this.c.setTintMode(paramMode);
  }
  
  private static class a
    extends d.a
  {
    a(d.a parama, Resources paramResources)
    {
      super(paramResources);
    }
    
    public Drawable newDrawable(Resources paramResources)
    {
      return new f(this, paramResources);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.a.a.f
 * JD-Core Version:    0.7.0.1
 */