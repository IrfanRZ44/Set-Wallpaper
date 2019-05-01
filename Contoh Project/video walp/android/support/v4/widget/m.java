package android.support.v4.widget;

import android.os.Build.VERSION;
import android.support.v4.view.d;
import android.support.v4.view.s;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class m
{
  static final d a = new d();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 23)
    {
      a = new c();
      return;
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      a = new b();
      return;
    }
    if (Build.VERSION.SDK_INT >= 19)
    {
      a = new a();
      return;
    }
  }
  
  public static void a(PopupWindow paramPopupWindow, int paramInt)
  {
    a.a(paramPopupWindow, paramInt);
  }
  
  public static void a(PopupWindow paramPopupWindow, View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    a.a(paramPopupWindow, paramView, paramInt1, paramInt2, paramInt3);
  }
  
  public static void a(PopupWindow paramPopupWindow, boolean paramBoolean)
  {
    a.a(paramPopupWindow, paramBoolean);
  }
  
  static class a
    extends m.d
  {
    public void a(PopupWindow paramPopupWindow, View paramView, int paramInt1, int paramInt2, int paramInt3)
    {
      paramPopupWindow.showAsDropDown(paramView, paramInt1, paramInt2, paramInt3);
    }
  }
  
  static class b
    extends m.a
  {
    private static Field a;
    
    static
    {
      try
      {
        a = PopupWindow.class.getDeclaredField("mOverlapAnchor");
        a.setAccessible(true);
        return;
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", localNoSuchFieldException);
      }
    }
    
    public void a(PopupWindow paramPopupWindow, boolean paramBoolean)
    {
      if (a != null) {}
      try
      {
        a.set(paramPopupWindow, Boolean.valueOf(paramBoolean));
        return;
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", localIllegalAccessException);
      }
    }
  }
  
  static class c
    extends m.b
  {
    public void a(PopupWindow paramPopupWindow, int paramInt)
    {
      paramPopupWindow.setWindowLayoutType(paramInt);
    }
    
    public void a(PopupWindow paramPopupWindow, boolean paramBoolean)
    {
      paramPopupWindow.setOverlapAnchor(paramBoolean);
    }
  }
  
  static class d
  {
    private static Method a;
    private static boolean b;
    
    public void a(PopupWindow paramPopupWindow, int paramInt)
    {
      if (!b) {}
      try
      {
        Class[] arrayOfClass = new Class[1];
        arrayOfClass[0] = Integer.TYPE;
        a = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", arrayOfClass);
        a.setAccessible(true);
        label38:
        b = true;
        if (a != null) {}
        try
        {
          Method localMethod = a;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = Integer.valueOf(paramInt);
          localMethod.invoke(paramPopupWindow, arrayOfObject);
          return;
        }
        catch (Exception localException1) {}
      }
      catch (Exception localException2)
      {
        break label38;
      }
    }
    
    public void a(PopupWindow paramPopupWindow, View paramView, int paramInt1, int paramInt2, int paramInt3)
    {
      if ((0x7 & d.a(paramInt3, s.e(paramView))) == 5) {
        paramInt1 -= paramPopupWindow.getWidth() - paramView.getWidth();
      }
      paramPopupWindow.showAsDropDown(paramView, paramInt1, paramInt2);
    }
    
    public void a(PopupWindow paramPopupWindow, boolean paramBoolean) {}
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.widget.m
 * JD-Core Version:    0.7.0.1
 */