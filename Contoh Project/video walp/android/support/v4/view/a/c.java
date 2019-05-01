package android.support.v4.view.a;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

public class c
{
  private final Object a;
  
  public c()
  {
    if (Build.VERSION.SDK_INT >= 19)
    {
      this.a = new b(this);
      return;
    }
    if (Build.VERSION.SDK_INT >= 16)
    {
      this.a = new a(this);
      return;
    }
    this.a = null;
  }
  
  public c(Object paramObject)
  {
    this.a = paramObject;
  }
  
  public b a(int paramInt)
  {
    return null;
  }
  
  public Object a()
  {
    return this.a;
  }
  
  public List<b> a(String paramString, int paramInt)
  {
    return null;
  }
  
  public boolean a(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    return false;
  }
  
  public b b(int paramInt)
  {
    return null;
  }
  
  static class a
    extends AccessibilityNodeProvider
  {
    final c a;
    
    a(c paramc)
    {
      this.a = paramc;
    }
    
    public AccessibilityNodeInfo createAccessibilityNodeInfo(int paramInt)
    {
      b localb = this.a.a(paramInt);
      if (localb == null) {
        return null;
      }
      return localb.a();
    }
    
    public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String paramString, int paramInt)
    {
      List localList = this.a.a(paramString, paramInt);
      if (localList == null) {
        return null;
      }
      ArrayList localArrayList = new ArrayList();
      int i = localList.size();
      for (int j = 0; j < i; j++) {
        localArrayList.add(((b)localList.get(j)).a());
      }
      return localArrayList;
    }
    
    public boolean performAction(int paramInt1, int paramInt2, Bundle paramBundle)
    {
      return this.a.a(paramInt1, paramInt2, paramBundle);
    }
  }
  
  static class b
    extends c.a
  {
    b(c paramc)
    {
      super();
    }
    
    public AccessibilityNodeInfo findFocus(int paramInt)
    {
      b localb = this.a.b(paramInt);
      if (localb == null) {
        return null;
      }
      return localb.a();
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.a.c
 * JD-Core Version:    0.7.0.1
 */