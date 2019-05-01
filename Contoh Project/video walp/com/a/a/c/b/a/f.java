package com.a.a.c.b.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;

public class f
  implements e
{
  public Bitmap a(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    return Bitmap.createBitmap(paramInt1, paramInt2, paramConfig);
  }
  
  public void a() {}
  
  public void a(int paramInt) {}
  
  public void a(Bitmap paramBitmap)
  {
    paramBitmap.recycle();
  }
  
  public Bitmap b(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    return a(paramInt1, paramInt2, paramConfig);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.b.a.f
 * JD-Core Version:    0.7.0.1
 */