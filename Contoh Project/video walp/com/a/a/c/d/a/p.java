package com.a.a.c.d.a;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.a.a.c.b.q;
import com.a.a.c.b.u;
import com.a.a.i.h;

public final class p
  implements q, u<BitmapDrawable>
{
  private final Resources a;
  private final u<Bitmap> b;
  
  private p(Resources paramResources, u<Bitmap> paramu)
  {
    this.a = ((Resources)h.a(paramResources));
    this.b = ((u)h.a(paramu));
  }
  
  public static u<BitmapDrawable> a(Resources paramResources, u<Bitmap> paramu)
  {
    if (paramu == null) {
      return null;
    }
    return new p(paramResources, paramu);
  }
  
  public void a()
  {
    if ((this.b instanceof q)) {
      ((q)this.b).a();
    }
  }
  
  public BitmapDrawable b()
  {
    return new BitmapDrawable(this.a, (Bitmap)this.b.d());
  }
  
  public Class<BitmapDrawable> c()
  {
    return BitmapDrawable.class;
  }
  
  public int e()
  {
    return this.b.e();
  }
  
  public void f()
  {
    this.b.f();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.d.a.p
 * JD-Core Version:    0.7.0.1
 */