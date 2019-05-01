package android.support.v4.a.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;

class d
  extends Drawable
  implements Drawable.Callback, b, c
{
  static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
  a b;
  Drawable c;
  private int d;
  private PorterDuff.Mode e;
  private boolean f;
  private boolean g;
  
  d(Drawable paramDrawable)
  {
    this.b = b();
    a(paramDrawable);
  }
  
  d(a parama, Resources paramResources)
  {
    this.b = parama;
    a(paramResources);
  }
  
  private void a(Resources paramResources)
  {
    if ((this.b != null) && (this.b.b != null)) {
      a(this.b.b.newDrawable(paramResources));
    }
  }
  
  private boolean a(int[] paramArrayOfInt)
  {
    if (!c()) {}
    PorterDuff.Mode localMode;
    int i;
    do
    {
      return false;
      ColorStateList localColorStateList = this.b.c;
      localMode = this.b.d;
      if ((localColorStateList == null) || (localMode == null)) {
        break;
      }
      i = localColorStateList.getColorForState(paramArrayOfInt, localColorStateList.getDefaultColor());
    } while ((this.f) && (i == this.d) && (localMode == this.e));
    setColorFilter(i, localMode);
    this.d = i;
    this.e = localMode;
    this.f = true;
    return true;
    this.f = false;
    clearColorFilter();
    return false;
  }
  
  public final Drawable a()
  {
    return this.c;
  }
  
  public final void a(Drawable paramDrawable)
  {
    if (this.c != null) {
      this.c.setCallback(null);
    }
    this.c = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      setVisible(paramDrawable.isVisible(), true);
      setState(paramDrawable.getState());
      setLevel(paramDrawable.getLevel());
      setBounds(paramDrawable.getBounds());
      if (this.b != null) {
        this.b.b = paramDrawable.getConstantState();
      }
    }
    invalidateSelf();
  }
  
  a b()
  {
    return new b(this.b, null);
  }
  
  protected boolean c()
  {
    return true;
  }
  
  public void draw(Canvas paramCanvas)
  {
    this.c.draw(paramCanvas);
  }
  
  public int getChangingConfigurations()
  {
    int i = super.getChangingConfigurations();
    if (this.b != null) {}
    for (int j = this.b.getChangingConfigurations();; j = 0) {
      return j | i | this.c.getChangingConfigurations();
    }
  }
  
  public Drawable.ConstantState getConstantState()
  {
    if ((this.b != null) && (this.b.a()))
    {
      this.b.a = getChangingConfigurations();
      return this.b;
    }
    return null;
  }
  
  public Drawable getCurrent()
  {
    return this.c.getCurrent();
  }
  
  public int getIntrinsicHeight()
  {
    return this.c.getIntrinsicHeight();
  }
  
  public int getIntrinsicWidth()
  {
    return this.c.getIntrinsicWidth();
  }
  
  public int getMinimumHeight()
  {
    return this.c.getMinimumHeight();
  }
  
  public int getMinimumWidth()
  {
    return this.c.getMinimumWidth();
  }
  
  public int getOpacity()
  {
    return this.c.getOpacity();
  }
  
  public boolean getPadding(Rect paramRect)
  {
    return this.c.getPadding(paramRect);
  }
  
  public int[] getState()
  {
    return this.c.getState();
  }
  
  public Region getTransparentRegion()
  {
    return this.c.getTransparentRegion();
  }
  
  public void invalidateDrawable(Drawable paramDrawable)
  {
    invalidateSelf();
  }
  
  public boolean isStateful()
  {
    if ((c()) && (this.b != null)) {}
    for (ColorStateList localColorStateList = this.b.c; ((localColorStateList != null) && (localColorStateList.isStateful())) || (this.c.isStateful()); localColorStateList = null) {
      return true;
    }
    return false;
  }
  
  public void jumpToCurrentState()
  {
    this.c.jumpToCurrentState();
  }
  
  public Drawable mutate()
  {
    a locala;
    if ((!this.g) && (super.mutate() == this))
    {
      this.b = b();
      if (this.c != null) {
        this.c.mutate();
      }
      if (this.b != null)
      {
        locala = this.b;
        if (this.c == null) {
          break label77;
        }
      }
    }
    label77:
    for (Drawable.ConstantState localConstantState = this.c.getConstantState();; localConstantState = null)
    {
      locala.b = localConstantState;
      this.g = true;
      return this;
    }
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    if (this.c != null) {
      this.c.setBounds(paramRect);
    }
  }
  
  protected boolean onLevelChange(int paramInt)
  {
    return this.c.setLevel(paramInt);
  }
  
  public void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong)
  {
    scheduleSelf(paramRunnable, paramLong);
  }
  
  public void setAlpha(int paramInt)
  {
    this.c.setAlpha(paramInt);
  }
  
  public void setChangingConfigurations(int paramInt)
  {
    this.c.setChangingConfigurations(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.c.setColorFilter(paramColorFilter);
  }
  
  public void setDither(boolean paramBoolean)
  {
    this.c.setDither(paramBoolean);
  }
  
  public void setFilterBitmap(boolean paramBoolean)
  {
    this.c.setFilterBitmap(paramBoolean);
  }
  
  public boolean setState(int[] paramArrayOfInt)
  {
    boolean bool = this.c.setState(paramArrayOfInt);
    return (a(paramArrayOfInt)) || (bool);
  }
  
  public void setTint(int paramInt)
  {
    setTintList(ColorStateList.valueOf(paramInt));
  }
  
  public void setTintList(ColorStateList paramColorStateList)
  {
    this.b.c = paramColorStateList;
    a(getState());
  }
  
  public void setTintMode(PorterDuff.Mode paramMode)
  {
    this.b.d = paramMode;
    a(getState());
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    return (super.setVisible(paramBoolean1, paramBoolean2)) || (this.c.setVisible(paramBoolean1, paramBoolean2));
  }
  
  public void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable)
  {
    unscheduleSelf(paramRunnable);
  }
  
  protected static abstract class a
    extends Drawable.ConstantState
  {
    int a;
    Drawable.ConstantState b;
    ColorStateList c = null;
    PorterDuff.Mode d = d.a;
    
    a(a parama, Resources paramResources)
    {
      if (parama != null)
      {
        this.a = parama.a;
        this.b = parama.b;
        this.c = parama.c;
        this.d = parama.d;
      }
    }
    
    boolean a()
    {
      return this.b != null;
    }
    
    public int getChangingConfigurations()
    {
      int i = this.a;
      if (this.b != null) {}
      for (int j = this.b.getChangingConfigurations();; j = 0) {
        return j | i;
      }
    }
    
    public Drawable newDrawable()
    {
      return newDrawable(null);
    }
    
    public abstract Drawable newDrawable(Resources paramResources);
  }
  
  private static class b
    extends d.a
  {
    b(d.a parama, Resources paramResources)
    {
      super(paramResources);
    }
    
    public Drawable newDrawable(Resources paramResources)
    {
      return new d(this, paramResources);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.a.a.d
 * JD-Core Version:    0.7.0.1
 */