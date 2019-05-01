package android.support.v4.a.a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

class e
  extends d
{
  e(Drawable paramDrawable)
  {
    super(paramDrawable);
  }
  
  e(d.a parama, Resources paramResources)
  {
    super(parama, paramResources);
  }
  
  d.a b()
  {
    return new a(this.b, null);
  }
  
  public boolean isAutoMirrored()
  {
    return this.c.isAutoMirrored();
  }
  
  public void setAutoMirrored(boolean paramBoolean)
  {
    this.c.setAutoMirrored(paramBoolean);
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
      return new e(this, paramResources);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.a.a.e
 * JD-Core Version:    0.7.0.1
 */