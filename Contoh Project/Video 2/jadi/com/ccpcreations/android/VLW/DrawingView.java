package com.ccpcreations.android.VLW;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

public class DrawingView
  extends View
{
  Bitmap drawingBitmap = null;
  Object lockingObject = new Object();
  
  public DrawingView(Context paramContext)
  {
    super(paramContext);
  }
  
  public DrawingView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public DrawingView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public void exchangeBitmap(Bitmap paramBitmap)
  {
    synchronized (this.lockingObject)
    {
      if (this.drawingBitmap != null) {
        this.drawingBitmap.recycle();
      }
      this.drawingBitmap = paramBitmap;
      return;
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    synchronized (this.lockingObject)
    {
      if (this.drawingBitmap != null) {
        paramCanvas.drawBitmap(this.drawingBitmap, 0.0F, 0.0F, null);
      }
      return;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\Video 2\classes_dex2jar.jar
 * Qualified Name:     com.ccpcreations.android.VLW.DrawingView
 * JD-Core Version:    0.7.0.1
 */