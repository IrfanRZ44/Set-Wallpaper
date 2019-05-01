package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

public final class e
{
  private static final c a = new c();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 23)
    {
      a = new b();
      return;
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      a = new a();
      return;
    }
  }
  
  public static Drawable a(CompoundButton paramCompoundButton)
  {
    return a.a(paramCompoundButton);
  }
  
  public static void a(CompoundButton paramCompoundButton, ColorStateList paramColorStateList)
  {
    a.a(paramCompoundButton, paramColorStateList);
  }
  
  public static void a(CompoundButton paramCompoundButton, PorterDuff.Mode paramMode)
  {
    a.a(paramCompoundButton, paramMode);
  }
  
  static class a
    extends e.c
  {
    public void a(CompoundButton paramCompoundButton, ColorStateList paramColorStateList)
    {
      paramCompoundButton.setButtonTintList(paramColorStateList);
    }
    
    public void a(CompoundButton paramCompoundButton, PorterDuff.Mode paramMode)
    {
      paramCompoundButton.setButtonTintMode(paramMode);
    }
  }
  
  static class b
    extends e.a
  {
    public Drawable a(CompoundButton paramCompoundButton)
    {
      return paramCompoundButton.getButtonDrawable();
    }
  }
  
  static class c
  {
    private static Field a;
    private static boolean b;
    
    public Drawable a(CompoundButton paramCompoundButton)
    {
      if (!b) {}
      try
      {
        a = CompoundButton.class.getDeclaredField("mButtonDrawable");
        a.setAccessible(true);
        b = true;
        if (a == null) {}
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        for (;;)
        {
          try
          {
            Drawable localDrawable = (Drawable)a.get(paramCompoundButton);
            return localDrawable;
          }
          catch (IllegalAccessException localIllegalAccessException)
          {
            Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", localIllegalAccessException);
            a = null;
          }
          localNoSuchFieldException = localNoSuchFieldException;
          Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", localNoSuchFieldException);
        }
      }
      return null;
    }
    
    public void a(CompoundButton paramCompoundButton, ColorStateList paramColorStateList)
    {
      if ((paramCompoundButton instanceof p)) {
        ((p)paramCompoundButton).setSupportButtonTintList(paramColorStateList);
      }
    }
    
    public void a(CompoundButton paramCompoundButton, PorterDuff.Mode paramMode)
    {
      if ((paramCompoundButton instanceof p)) {
        ((p)paramCompoundButton).setSupportButtonTintMode(paramMode);
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.widget.e
 * JD-Core Version:    0.7.0.1
 */