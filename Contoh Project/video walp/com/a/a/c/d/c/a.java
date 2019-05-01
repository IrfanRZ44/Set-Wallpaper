package com.a.a.c.d.c;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;

public final class a
{
  private static volatile boolean a = true;
  
  public static Drawable a(Context paramContext, int paramInt)
  {
    return a(paramContext, paramInt, null);
  }
  
  public static Drawable a(Context paramContext, int paramInt, Resources.Theme paramTheme)
  {
    try
    {
      if (a)
      {
        Drawable localDrawable = b(paramContext, paramInt);
        return localDrawable;
      }
    }
    catch (NoClassDefFoundError localNoClassDefFoundError)
    {
      a = false;
      if (paramTheme != null) {}
      for (;;)
      {
        return b(paramContext, paramInt, paramTheme);
        paramTheme = paramContext.getTheme();
      }
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
      label22:
      break label22;
    }
  }
  
  private static Drawable b(Context paramContext, int paramInt)
  {
    return android.support.v7.c.a.b.b(paramContext, paramInt);
  }
  
  private static Drawable b(Context paramContext, int paramInt, Resources.Theme paramTheme)
  {
    return android.support.v4.content.a.b.a(paramContext.getResources(), paramInt, paramTheme);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c.d.c.a
 * JD-Core Version:    0.7.0.1
 */