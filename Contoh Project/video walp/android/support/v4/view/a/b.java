package android.support.v4.view.a;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;

public class b
{
  public int a = -1;
  private final AccessibilityNodeInfo b;
  
  private b(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    this.b = paramAccessibilityNodeInfo;
  }
  
  public static b a(b paramb)
  {
    return a(AccessibilityNodeInfo.obtain(paramb.b));
  }
  
  public static b a(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    return new b(paramAccessibilityNodeInfo);
  }
  
  private static String c(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return "ACTION_UNKNOWN";
    case 1: 
      return "ACTION_FOCUS";
    case 2: 
      return "ACTION_CLEAR_FOCUS";
    case 4: 
      return "ACTION_SELECT";
    case 8: 
      return "ACTION_CLEAR_SELECTION";
    case 16: 
      return "ACTION_CLICK";
    case 32: 
      return "ACTION_LONG_CLICK";
    case 64: 
      return "ACTION_ACCESSIBILITY_FOCUS";
    case 128: 
      return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
    case 256: 
      return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
    case 512: 
      return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
    case 1024: 
      return "ACTION_NEXT_HTML_ELEMENT";
    case 2048: 
      return "ACTION_PREVIOUS_HTML_ELEMENT";
    case 4096: 
      return "ACTION_SCROLL_FORWARD";
    case 8192: 
      return "ACTION_SCROLL_BACKWARD";
    case 65536: 
      return "ACTION_CUT";
    case 16384: 
      return "ACTION_COPY";
    case 32768: 
      return "ACTION_PASTE";
    }
    return "ACTION_SET_SELECTION";
  }
  
  public AccessibilityNodeInfo a()
  {
    return this.b;
  }
  
  public void a(int paramInt)
  {
    this.b.addAction(paramInt);
  }
  
  public void a(Rect paramRect)
  {
    this.b.getBoundsInParent(paramRect);
  }
  
  public void a(View paramView)
  {
    this.b.setSource(paramView);
  }
  
  public void a(CharSequence paramCharSequence)
  {
    this.b.setPackageName(paramCharSequence);
  }
  
  public void a(Object paramObject)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      this.b.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo)((b)paramObject).a);
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.b.setCheckable(paramBoolean);
  }
  
  public boolean a(a parama)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return this.b.removeAction((AccessibilityNodeInfo.AccessibilityAction)parama.E);
    }
    return false;
  }
  
  public int b()
  {
    return this.b.getActions();
  }
  
  public void b(int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 16) {
      this.b.setMovementGranularities(paramInt);
    }
  }
  
  public void b(Rect paramRect)
  {
    this.b.setBoundsInParent(paramRect);
  }
  
  public void b(View paramView)
  {
    this.b.addChild(paramView);
  }
  
  public void b(CharSequence paramCharSequence)
  {
    this.b.setClassName(paramCharSequence);
  }
  
  public void b(Object paramObject)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      this.b.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo)((c)paramObject).a);
    }
  }
  
  public void b(boolean paramBoolean)
  {
    this.b.setChecked(paramBoolean);
  }
  
  public int c()
  {
    if (Build.VERSION.SDK_INT >= 16) {
      return this.b.getMovementGranularities();
    }
    return 0;
  }
  
  public void c(Rect paramRect)
  {
    this.b.getBoundsInScreen(paramRect);
  }
  
  public void c(View paramView)
  {
    this.b.setParent(paramView);
  }
  
  public void c(CharSequence paramCharSequence)
  {
    this.b.setText(paramCharSequence);
  }
  
  public void c(boolean paramBoolean)
  {
    this.b.setFocusable(paramBoolean);
  }
  
  public void d(Rect paramRect)
  {
    this.b.setBoundsInScreen(paramRect);
  }
  
  public void d(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 17) {
      this.b.setLabelFor(paramView);
    }
  }
  
  public void d(CharSequence paramCharSequence)
  {
    this.b.setContentDescription(paramCharSequence);
  }
  
  public void d(boolean paramBoolean)
  {
    this.b.setFocused(paramBoolean);
  }
  
  public boolean d()
  {
    return this.b.isCheckable();
  }
  
  public void e(CharSequence paramCharSequence)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      this.b.setError(paramCharSequence);
    }
  }
  
  public void e(boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 16) {
      this.b.setVisibleToUser(paramBoolean);
    }
  }
  
  public boolean e()
  {
    return this.b.isChecked();
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    b localb;
    do
    {
      do
      {
        return true;
        if (paramObject == null) {
          return false;
        }
        if (getClass() != paramObject.getClass()) {
          return false;
        }
        localb = (b)paramObject;
        if (this.b != null) {
          break;
        }
      } while (localb.b == null);
      return false;
    } while (this.b.equals(localb.b));
    return false;
  }
  
  public void f(boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 16) {
      this.b.setAccessibilityFocused(paramBoolean);
    }
  }
  
  public boolean f()
  {
    return this.b.isFocusable();
  }
  
  public void g(boolean paramBoolean)
  {
    this.b.setSelected(paramBoolean);
  }
  
  public boolean g()
  {
    return this.b.isFocused();
  }
  
  public void h(boolean paramBoolean)
  {
    this.b.setClickable(paramBoolean);
  }
  
  public boolean h()
  {
    if (Build.VERSION.SDK_INT >= 16) {
      return this.b.isVisibleToUser();
    }
    return false;
  }
  
  public int hashCode()
  {
    if (this.b == null) {
      return 0;
    }
    return this.b.hashCode();
  }
  
  public void i(boolean paramBoolean)
  {
    this.b.setLongClickable(paramBoolean);
  }
  
  public boolean i()
  {
    if (Build.VERSION.SDK_INT >= 16) {
      return this.b.isAccessibilityFocused();
    }
    return false;
  }
  
  public void j(boolean paramBoolean)
  {
    this.b.setEnabled(paramBoolean);
  }
  
  public boolean j()
  {
    return this.b.isSelected();
  }
  
  public void k(boolean paramBoolean)
  {
    this.b.setScrollable(paramBoolean);
  }
  
  public boolean k()
  {
    return this.b.isClickable();
  }
  
  public void l(boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      this.b.setContentInvalid(paramBoolean);
    }
  }
  
  public boolean l()
  {
    return this.b.isLongClickable();
  }
  
  public void m(boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      this.b.setCanOpenPopup(paramBoolean);
    }
  }
  
  public boolean m()
  {
    return this.b.isEnabled();
  }
  
  public boolean n()
  {
    return this.b.isPassword();
  }
  
  public boolean o()
  {
    return this.b.isScrollable();
  }
  
  public CharSequence p()
  {
    return this.b.getPackageName();
  }
  
  public CharSequence q()
  {
    return this.b.getClassName();
  }
  
  public CharSequence r()
  {
    return this.b.getText();
  }
  
  public CharSequence s()
  {
    return this.b.getContentDescription();
  }
  
  public void t()
  {
    this.b.recycle();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(super.toString());
    Rect localRect = new Rect();
    a(localRect);
    localStringBuilder.append("; boundsInParent: " + localRect);
    c(localRect);
    localStringBuilder.append("; boundsInScreen: " + localRect);
    localStringBuilder.append("; packageName: ").append(p());
    localStringBuilder.append("; className: ").append(q());
    localStringBuilder.append("; text: ").append(r());
    localStringBuilder.append("; contentDescription: ").append(s());
    localStringBuilder.append("; viewId: ").append(u());
    localStringBuilder.append("; checkable: ").append(d());
    localStringBuilder.append("; checked: ").append(e());
    localStringBuilder.append("; focusable: ").append(f());
    localStringBuilder.append("; focused: ").append(g());
    localStringBuilder.append("; selected: ").append(j());
    localStringBuilder.append("; clickable: ").append(k());
    localStringBuilder.append("; longClickable: ").append(l());
    localStringBuilder.append("; enabled: ").append(m());
    localStringBuilder.append("; password: ").append(n());
    localStringBuilder.append("; scrollable: " + o());
    localStringBuilder.append("; [");
    int i = b();
    while (i != 0)
    {
      int j = 1 << Integer.numberOfTrailingZeros(i);
      i &= (j ^ 0xFFFFFFFF);
      localStringBuilder.append(c(j));
      if (i != 0) {
        localStringBuilder.append(", ");
      }
    }
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public String u()
  {
    if (Build.VERSION.SDK_INT >= 18) {
      return this.b.getViewIdResourceName();
    }
    return null;
  }
  
  public static class a
  {
    public static final a A;
    public static final a B;
    public static final a C;
    public static final a D;
    public static final a a = new a(1, null);
    public static final a b = new a(2, null);
    public static final a c = new a(4, null);
    public static final a d = new a(8, null);
    public static final a e = new a(16, null);
    public static final a f = new a(32, null);
    public static final a g = new a(64, null);
    public static final a h = new a(128, null);
    public static final a i = new a(256, null);
    public static final a j = new a(512, null);
    public static final a k = new a(1024, null);
    public static final a l = new a(2048, null);
    public static final a m = new a(4096, null);
    public static final a n = new a(8192, null);
    public static final a o = new a(16384, null);
    public static final a p = new a(32768, null);
    public static final a q = new a(65536, null);
    public static final a r = new a(131072, null);
    public static final a s = new a(262144, null);
    public static final a t = new a(524288, null);
    public static final a u = new a(1048576, null);
    public static final a v = new a(2097152, null);
    public static final a w;
    public static final a x;
    public static final a y;
    public static final a z;
    final Object E;
    
    static
    {
      AccessibilityNodeInfo.AccessibilityAction localAccessibilityAction1;
      AccessibilityNodeInfo.AccessibilityAction localAccessibilityAction2;
      label326:
      AccessibilityNodeInfo.AccessibilityAction localAccessibilityAction3;
      label349:
      AccessibilityNodeInfo.AccessibilityAction localAccessibilityAction4;
      label372:
      AccessibilityNodeInfo.AccessibilityAction localAccessibilityAction5;
      label396:
      AccessibilityNodeInfo.AccessibilityAction localAccessibilityAction6;
      if (Build.VERSION.SDK_INT >= 23)
      {
        localAccessibilityAction1 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
        w = new a(localAccessibilityAction1);
        if (Build.VERSION.SDK_INT < 23) {
          break label496;
        }
        localAccessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
        x = new a(localAccessibilityAction2);
        if (Build.VERSION.SDK_INT < 23) {
          break label501;
        }
        localAccessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
        y = new a(localAccessibilityAction3);
        if (Build.VERSION.SDK_INT < 23) {
          break label506;
        }
        localAccessibilityAction4 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
        z = new a(localAccessibilityAction4);
        if (Build.VERSION.SDK_INT < 23) {
          break label511;
        }
        localAccessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
        A = new a(localAccessibilityAction5);
        if (Build.VERSION.SDK_INT < 23) {
          break label517;
        }
        localAccessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
        label421:
        B = new a(localAccessibilityAction6);
        if (Build.VERSION.SDK_INT < 23) {
          break label523;
        }
      }
      label517:
      label523:
      for (AccessibilityNodeInfo.AccessibilityAction localAccessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;; localAccessibilityAction7 = null)
      {
        C = new a(localAccessibilityAction7);
        int i1 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo.AccessibilityAction localAccessibilityAction8 = null;
        if (i1 >= 24) {
          localAccessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
        }
        D = new a(localAccessibilityAction8);
        return;
        localAccessibilityAction1 = null;
        break;
        label496:
        localAccessibilityAction2 = null;
        break label326;
        label501:
        localAccessibilityAction3 = null;
        break label349;
        label506:
        localAccessibilityAction4 = null;
        break label372;
        label511:
        localAccessibilityAction5 = null;
        break label396;
        localAccessibilityAction6 = null;
        break label421;
      }
    }
    
    public a(int paramInt, CharSequence paramCharSequence) {}
    
    a(Object paramObject)
    {
      this.E = paramObject;
    }
  }
  
  public static class b
  {
    final Object a;
    
    b(Object paramObject)
    {
      this.a = paramObject;
    }
    
    public static b a(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3)
    {
      if (Build.VERSION.SDK_INT >= 21) {
        return new b(AccessibilityNodeInfo.CollectionInfo.obtain(paramInt1, paramInt2, paramBoolean, paramInt3));
      }
      if (Build.VERSION.SDK_INT >= 19) {
        return new b(AccessibilityNodeInfo.CollectionInfo.obtain(paramInt1, paramInt2, paramBoolean));
      }
      return new b(null);
    }
  }
  
  public static class c
  {
    final Object a;
    
    c(Object paramObject)
    {
      this.a = paramObject;
    }
    
    public static c a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean1, boolean paramBoolean2)
    {
      if (Build.VERSION.SDK_INT >= 21) {
        return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean1, paramBoolean2));
      }
      if (Build.VERSION.SDK_INT >= 19) {
        return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean1));
      }
      return new c(null);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.a.b
 * JD-Core Version:    0.7.0.1
 */