package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.WindowInsets;

public class aa
{
  private final Object a;
  
  private aa(Object paramObject)
  {
    this.a = paramObject;
  }
  
  static aa a(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    return new aa(paramObject);
  }
  
  static Object a(aa paramaa)
  {
    if (paramaa == null) {
      return null;
    }
    return paramaa.a;
  }
  
  public int a()
  {
    if (Build.VERSION.SDK_INT >= 20) {
      return ((WindowInsets)this.a).getSystemWindowInsetLeft();
    }
    return 0;
  }
  
  public aa a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (Build.VERSION.SDK_INT >= 20) {
      return new aa(((WindowInsets)this.a).replaceSystemWindowInsets(paramInt1, paramInt2, paramInt3, paramInt4));
    }
    return null;
  }
  
  public int b()
  {
    if (Build.VERSION.SDK_INT >= 20) {
      return ((WindowInsets)this.a).getSystemWindowInsetTop();
    }
    return 0;
  }
  
  public int c()
  {
    if (Build.VERSION.SDK_INT >= 20) {
      return ((WindowInsets)this.a).getSystemWindowInsetRight();
    }
    return 0;
  }
  
  public int d()
  {
    if (Build.VERSION.SDK_INT >= 20) {
      return ((WindowInsets)this.a).getSystemWindowInsetBottom();
    }
    return 0;
  }
  
  public boolean e()
  {
    if (Build.VERSION.SDK_INT >= 20) {
      return ((WindowInsets)this.a).hasSystemWindowInsets();
    }
    return false;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    aa localaa;
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass())) {
        return false;
      }
      localaa = (aa)paramObject;
      if (this.a != null) {
        break;
      }
    } while (localaa.a == null);
    return false;
    return this.a.equals(localaa.a);
  }
  
  public boolean f()
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return ((WindowInsets)this.a).isConsumed();
    }
    return false;
  }
  
  public aa g()
  {
    if (Build.VERSION.SDK_INT >= 20) {
      return new aa(((WindowInsets)this.a).consumeSystemWindowInsets());
    }
    return null;
  }
  
  public int hashCode()
  {
    if (this.a == null) {
      return 0;
    }
    return this.a.hashCode();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.aa
 * JD-Core Version:    0.7.0.1
 */