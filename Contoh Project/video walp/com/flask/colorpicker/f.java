package com.flask.colorpicker;

import android.graphics.Color;

public class f
{
  public static float a(int paramInt)
  {
    return Color.alpha(paramInt) / 255.0F;
  }
  
  public static int a(float paramFloat)
  {
    return Math.round(255.0F * paramFloat);
  }
  
  public static int a(float paramFloat, int paramInt)
  {
    return a(paramFloat) << 24 | 0xFFFFFF & paramInt;
  }
  
  public static int a(int paramInt, float paramFloat)
  {
    float[] arrayOfFloat = new float[3];
    Color.colorToHSV(paramInt, arrayOfFloat);
    arrayOfFloat[2] = paramFloat;
    return Color.HSVToColor(arrayOfFloat);
  }
  
  public static String a(int paramInt, boolean paramBoolean)
  {
    int i;
    if (paramBoolean)
    {
      i = -1;
      if (!paramBoolean) {
        break label45;
      }
    }
    label45:
    for (String str = "#%08X";; str = "#%06X")
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(i & paramInt);
      return String.format(str, arrayOfObject).toUpperCase();
      i = 16777215;
      break;
    }
  }
  
  public static float b(int paramInt)
  {
    float[] arrayOfFloat = new float[3];
    Color.colorToHSV(paramInt, arrayOfFloat);
    return arrayOfFloat[2];
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.flask.colorpicker.f
 * JD-Core Version:    0.7.0.1
 */