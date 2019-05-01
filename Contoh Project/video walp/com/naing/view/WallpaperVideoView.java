package com.naing.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.VideoView;

public class WallpaperVideoView
  extends VideoView
{
  private int a;
  private int b;
  
  public WallpaperVideoView(Context paramContext)
  {
    super(paramContext);
  }
  
  public WallpaperVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public WallpaperVideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = getDefaultSize(this.a, paramInt1);
    int j = getDefaultSize(this.b, paramInt2);
    if ((this.a > 0) && (this.b > 0))
    {
      if (j * this.a <= i * this.b) {
        break label70;
      }
      j = i * this.b / this.a;
    }
    for (;;)
    {
      setMeasuredDimension(i, j);
      return;
      label70:
      if (j * this.a < i * this.b) {
        i = j * this.a / this.b;
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.naing.view.WallpaperVideoView
 * JD-Core Version:    0.7.0.1
 */