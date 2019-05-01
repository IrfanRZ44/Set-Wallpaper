package android.support.v7.widget;

import android.view.View;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

class ViewBoundsCheck
{
  final b a;
  a b;
  
  ViewBoundsCheck(b paramb)
  {
    this.a = paramb;
    this.b = new a();
  }
  
  View a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = this.a.a();
    int j = this.a.b();
    if (paramInt2 > paramInt1) {}
    Object localObject1;
    Object localObject2;
    for (int k = 1;; k = -1)
    {
      localObject1 = null;
      if (paramInt1 == paramInt2) {
        break label172;
      }
      localObject2 = this.a.a(paramInt1);
      int m = this.a.a((View)localObject2);
      int n = this.a.b((View)localObject2);
      this.b.a(i, j, m, n);
      if (paramInt3 == 0) {
        break;
      }
      this.b.a();
      this.b.a(paramInt3);
      if (!this.b.b()) {
        break;
      }
      return localObject2;
    }
    if (paramInt4 != 0)
    {
      this.b.a();
      this.b.a(paramInt4);
      if (!this.b.b()) {}
    }
    for (;;)
    {
      paramInt1 += k;
      localObject1 = localObject2;
      break;
      label172:
      return localObject1;
      localObject2 = localObject1;
    }
  }
  
  boolean a(View paramView, int paramInt)
  {
    this.b.a(this.a.a(), this.a.b(), this.a.a(paramView), this.a.b(paramView));
    if (paramInt != 0)
    {
      this.b.a();
      this.b.a(paramInt);
      return this.b.b();
    }
    return false;
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface ViewBounds {}
  
  static class a
  {
    int a = 0;
    int b;
    int c;
    int d;
    int e;
    
    int a(int paramInt1, int paramInt2)
    {
      if (paramInt1 > paramInt2) {
        return 1;
      }
      if (paramInt1 == paramInt2) {
        return 2;
      }
      return 4;
    }
    
    void a()
    {
      this.a = 0;
    }
    
    void a(int paramInt)
    {
      this.a = (paramInt | this.a);
    }
    
    void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      this.b = paramInt1;
      this.c = paramInt2;
      this.d = paramInt3;
      this.e = paramInt4;
    }
    
    boolean b()
    {
      if (((0x7 & this.a) != 0) && ((this.a & a(this.d, this.b) << 0) == 0)) {}
      while ((((0x70 & this.a) != 0) && ((this.a & a(this.d, this.c) << 4) == 0)) || (((0x700 & this.a) != 0) && ((this.a & a(this.e, this.b) << 8) == 0)) || (((0x7000 & this.a) != 0) && ((this.a & a(this.e, this.c) << 12) == 0))) {
        return false;
      }
      return true;
    }
  }
  
  static abstract interface b
  {
    public abstract int a();
    
    public abstract int a(View paramView);
    
    public abstract View a(int paramInt);
    
    public abstract int b();
    
    public abstract int b(View paramView);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.ViewBoundsCheck
 * JD-Core Version:    0.7.0.1
 */