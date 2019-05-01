package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

public class k
{
  private ViewParent a;
  private ViewParent b;
  private final View c;
  private boolean d;
  private int[] e;
  
  public k(View paramView)
  {
    this.c = paramView;
  }
  
  private void a(int paramInt, ViewParent paramViewParent)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      this.a = paramViewParent;
      return;
    }
    this.b = paramViewParent;
  }
  
  private ViewParent d(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 0: 
      return this.a;
    }
    return this.b;
  }
  
  public void a(boolean paramBoolean)
  {
    if (this.d) {
      s.w(this.c);
    }
    this.d = paramBoolean;
  }
  
  public boolean a()
  {
    return this.d;
  }
  
  public boolean a(float paramFloat1, float paramFloat2)
  {
    boolean bool1 = a();
    boolean bool2 = false;
    if (bool1)
    {
      ViewParent localViewParent = d(0);
      bool2 = false;
      if (localViewParent != null) {
        bool2 = v.a(localViewParent, this.c, paramFloat1, paramFloat2);
      }
    }
    return bool2;
  }
  
  public boolean a(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    boolean bool1 = a();
    boolean bool2 = false;
    if (bool1)
    {
      ViewParent localViewParent = d(0);
      bool2 = false;
      if (localViewParent != null) {
        bool2 = v.a(localViewParent, this.c, paramFloat1, paramFloat2, paramBoolean);
      }
    }
    return bool2;
  }
  
  public boolean a(int paramInt)
  {
    return d(paramInt) != null;
  }
  
  public boolean a(int paramInt1, int paramInt2)
  {
    if (a(paramInt2)) {
      return true;
    }
    if (a())
    {
      ViewParent localViewParent = this.c.getParent();
      View localView = this.c;
      while (localViewParent != null)
      {
        if (v.a(localViewParent, localView, this.c, paramInt1, paramInt2))
        {
          a(paramInt2, localViewParent);
          v.b(localViewParent, localView, this.c, paramInt1, paramInt2);
          return true;
        }
        if ((localViewParent instanceof View)) {
          localView = (View)localViewParent;
        }
        localViewParent = localViewParent.getParent();
      }
    }
    return false;
  }
  
  public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    return a(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt, 0);
  }
  
  public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt, int paramInt5)
  {
    ViewParent localViewParent;
    int k;
    int i;
    if (a())
    {
      localViewParent = d(paramInt5);
      if (localViewParent == null) {
        return false;
      }
      if ((paramInt1 != 0) || (paramInt2 != 0) || (paramInt3 != 0) || (paramInt4 != 0))
      {
        if (paramArrayOfInt == null) {
          break label140;
        }
        this.c.getLocationInWindow(paramArrayOfInt);
        k = paramArrayOfInt[0];
        i = paramArrayOfInt[1];
      }
    }
    for (int j = k;; j = 0)
    {
      v.a(localViewParent, this.c, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
      if (paramArrayOfInt != null)
      {
        this.c.getLocationInWindow(paramArrayOfInt);
        paramArrayOfInt[0] -= j;
        paramArrayOfInt[1] -= i;
      }
      return true;
      if (paramArrayOfInt != null)
      {
        paramArrayOfInt[0] = 0;
        paramArrayOfInt[1] = 0;
      }
      return false;
      label140:
      i = 0;
    }
  }
  
  public boolean a(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    return a(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2, 0);
  }
  
  public boolean a(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt3)
  {
    ViewParent localViewParent;
    if (a())
    {
      localViewParent = d(paramInt3);
      if (localViewParent != null) {}
    }
    else
    {
      return false;
    }
    int k;
    int i;
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      if (paramArrayOfInt2 == null) {
        break label194;
      }
      this.c.getLocationInWindow(paramArrayOfInt2);
      k = paramArrayOfInt2[0];
      i = paramArrayOfInt2[1];
    }
    for (int j = k;; j = 0)
    {
      if (paramArrayOfInt1 == null) {
        if (this.e == null) {
          this.e = new int[2];
        }
      }
      for (int[] arrayOfInt = this.e;; arrayOfInt = paramArrayOfInt1)
      {
        arrayOfInt[0] = 0;
        arrayOfInt[1] = 0;
        v.a(localViewParent, this.c, paramInt1, paramInt2, arrayOfInt, paramInt3);
        if (paramArrayOfInt2 != null)
        {
          this.c.getLocationInWindow(paramArrayOfInt2);
          paramArrayOfInt2[0] -= j;
          paramArrayOfInt2[1] -= i;
        }
        if ((arrayOfInt[0] != 0) || (arrayOfInt[1] != 0)) {}
        for (boolean bool = true;; bool = false) {
          return bool;
        }
        if (paramArrayOfInt2 == null) {
          break;
        }
        paramArrayOfInt2[0] = 0;
        paramArrayOfInt2[1] = 0;
        return false;
      }
      label194:
      i = 0;
    }
  }
  
  public boolean b()
  {
    return a(0);
  }
  
  public boolean b(int paramInt)
  {
    return a(paramInt, 0);
  }
  
  public void c()
  {
    c(0);
  }
  
  public void c(int paramInt)
  {
    ViewParent localViewParent = d(paramInt);
    if (localViewParent != null)
    {
      v.a(localViewParent, this.c, paramInt);
      a(paramInt, null);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.k
 * JD-Core Version:    0.7.0.1
 */