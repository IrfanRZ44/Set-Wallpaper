package com.a.a.c.d.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.a.a.c;
import com.a.a.c.b.a.e;
import com.a.a.c.b.u;
import java.security.MessageDigest;

public class m
  implements com.a.a.c.m<Drawable>
{
  private final com.a.a.c.m<Bitmap> b;
  private final boolean c;
  
  public m(com.a.a.c.m<Bitmap> paramm, boolean paramBoolean)
  {
    this.b = paramm;
    this.c = paramBoolean;
  }
  
  private u<Drawable> a(Context paramContext, u<Bitmap> paramu)
  {
    return p.a(paramContext.getResources(), paramu);
  }
  
  public u<Drawable> a(Context paramContext, u<Drawable> paramu, int paramInt1, int paramInt2)
  {
    e locale = c.a(paramContext).a();
    Drawable localDrawable = (Drawable)paramu.d();
    u localu1 = l.a(locale, localDrawable, paramInt1, paramInt2);
    u localu2;
    if (localu1 == null)
    {
      if (this.c) {
        throw new IllegalArgumentException("Unable to convert " + localDrawable + " to a Bitmap");
      }
    }
    else
    {
      localu2 = this.b.a(paramContext, localu1, paramInt1, paramInt2);
      if (!localu2.equals(localu1)) {
        break label113;
      }
      localu2.f();
    }
    return paramu;
    label113:
    return a(paramContext, localu2);
  }
  
  public com.a.a.c.m<BitmapDrawable> a()
  {
    return this;
  }
  
  public void a(MessageDigest paramMessageDigest)
  {
    this.b.a(paramMessageDigest);
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof m))
    {
      m localm = (m)paramObject;
      return this.b.equals(localm.b);
    }
    return false;
  }
  
  public int hashCode()
  {
    return this.b.hashCode();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.d.a.m
 * JD-Core Version:    0.7.0.1
 */