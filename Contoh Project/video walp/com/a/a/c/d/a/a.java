package com.a.a.c.d.a;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.a.a.c.b.u;
import com.a.a.c.j;
import com.a.a.c.k;
import com.a.a.i.h;

public class a<DataType>
  implements k<DataType, BitmapDrawable>
{
  private final k<DataType, Bitmap> a;
  private final Resources b;
  
  public a(Resources paramResources, k<DataType, Bitmap> paramk)
  {
    this.b = ((Resources)h.a(paramResources));
    this.a = ((k)h.a(paramk));
  }
  
  public u<BitmapDrawable> a(DataType paramDataType, int paramInt1, int paramInt2, j paramj)
  {
    u localu = this.a.a(paramDataType, paramInt1, paramInt2, paramj);
    return p.a(this.b, localu);
  }
  
  public boolean a(DataType paramDataType, j paramj)
  {
    return this.a.a(paramDataType, paramj);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.d.a.a
 * JD-Core Version:    0.7.0.1
 */