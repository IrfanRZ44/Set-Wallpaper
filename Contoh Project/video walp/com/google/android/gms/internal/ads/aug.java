package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.FrameLayout;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.internal.zzbv;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@cm
@ParametersAreNonnullByDefault
public final class aug
  extends auy
  implements View.OnClickListener, View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener
{
  static final String[] a = { "2011", "1009", "3010" };
  private final Object b = new Object();
  private final WeakReference<View> c;
  private final Map<String, WeakReference<View>> d = new HashMap();
  private final Map<String, WeakReference<View>> e = new HashMap();
  private final Map<String, WeakReference<View>> f = new HashMap();
  @GuardedBy("mLock")
  private atq g;
  private View h;
  private Point i = new Point();
  private Point j = new Point();
  private WeakReference<akg> k = new WeakReference(null);
  
  public aug(View paramView, HashMap<String, View> paramHashMap1, HashMap<String, View> paramHashMap2)
  {
    zzbv.zzfg();
    nx.a(paramView, this);
    zzbv.zzfg();
    nx.a(paramView, this);
    paramView.setOnTouchListener(this);
    paramView.setOnClickListener(this);
    this.c = new WeakReference(paramView);
    Iterator localIterator1 = paramHashMap1.entrySet().iterator();
    while (localIterator1.hasNext())
    {
      Map.Entry localEntry2 = (Map.Entry)localIterator1.next();
      String str = (String)localEntry2.getKey();
      View localView2 = (View)localEntry2.getValue();
      if (localView2 != null)
      {
        this.d.put(str, new WeakReference(localView2));
        if ((!"1098".equals(str)) && (!"3011".equals(str)))
        {
          localView2.setOnTouchListener(this);
          localView2.setClickable(true);
          localView2.setOnClickListener(this);
        }
      }
    }
    this.f.putAll(this.d);
    Iterator localIterator2 = paramHashMap2.entrySet().iterator();
    while (localIterator2.hasNext())
    {
      Map.Entry localEntry1 = (Map.Entry)localIterator2.next();
      View localView1 = (View)localEntry1.getValue();
      if (localView1 != null)
      {
        this.e.put((String)localEntry1.getKey(), new WeakReference(localView1));
        localView1.setOnTouchListener(this);
      }
    }
    this.f.putAll(this.e);
    asa.a(paramView.getContext());
  }
  
  private final int a(int paramInt)
  {
    synchronized (this.b)
    {
      aos.a();
      int m = lz.b(this.g.m(), paramInt);
      return m;
    }
  }
  
  private final void a(View paramView)
  {
    synchronized (this.b)
    {
      if (this.g != null)
      {
        if (!(this.g instanceof atp)) {
          break label52;
        }
        localatq = ((atp)this.g).f();
        if (localatq != null) {
          localatq.c(paramView);
        }
      }
      return;
      label52:
      atq localatq = this.g;
    }
  }
  
  private final void a(atv paramatv)
  {
    for (;;)
    {
      int n;
      aui localaui;
      synchronized (this.b)
      {
        String[] arrayOfString = a;
        int m = arrayOfString.length;
        n = 0;
        if (n >= m) {
          break label133;
        }
        String str = arrayOfString[n];
        WeakReference localWeakReference = (WeakReference)this.f.get(str);
        if (localWeakReference == null) {
          break label127;
        }
        localView = (View)localWeakReference.get();
        if (!(localView instanceof FrameLayout))
        {
          paramatv.i();
          return;
        }
        localaui = new aui(this, localView);
        if ((paramatv instanceof atp))
        {
          paramatv.b(localView, localaui);
          return;
        }
      }
      paramatv.a(localView, localaui);
      continue;
      label127:
      n++;
      continue;
      label133:
      View localView = null;
    }
  }
  
  private final boolean a(String[] paramArrayOfString)
  {
    int m = paramArrayOfString.length;
    boolean bool;
    for (int n = 0; n < m; n++)
    {
      String str2 = paramArrayOfString[n];
      if (this.d.get(str2) != null)
      {
        bool = true;
        return bool;
      }
    }
    int i1 = paramArrayOfString.length;
    for (int i2 = 0;; i2++)
    {
      bool = false;
      if (i2 >= i1) {
        break;
      }
      String str1 = paramArrayOfString[i2];
      Object localObject = this.e.get(str1);
      bool = false;
      if (localObject != null) {
        break;
      }
    }
  }
  
  public final void a()
  {
    synchronized (this.b)
    {
      this.h = null;
      this.g = null;
      this.i = null;
      this.j = null;
      return;
    }
  }
  
  public final void a(a parama)
  {
    atv localatv1;
    synchronized (this.b)
    {
      a(null);
      Object localObject3 = b.a(parama);
      if (!(localObject3 instanceof atv))
      {
        je.e("Not an instance of native engine. This is most likely a transient error");
        return;
      }
      localatv1 = (atv)localObject3;
      if (!localatv1.b())
      {
        je.c("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
        return;
      }
    }
    View localView1 = (View)this.c.get();
    if ((this.g != null) && (localView1 != null))
    {
      arq localarq = asa.bZ;
      if (((Boolean)aos.f().a(localarq)).booleanValue()) {
        this.g.b(localView1, this.f);
      }
    }
    for (;;)
    {
      label180:
      int m;
      synchronized (this.b)
      {
        if (!(this.g instanceof atv))
        {
          if ((!(this.g instanceof atp)) || (!((atp)this.g).e())) {
            break label444;
          }
          ((atp)this.g).a(localatv1);
          String[] arrayOfString = { "1098", "3011" };
          m = 0;
          if (m >= 2) {
            break label708;
          }
          String str = arrayOfString[m];
          WeakReference localWeakReference = (WeakReference)this.f.get(str);
          if (localWeakReference == null) {
            break label702;
          }
          localView3 = (View)localWeakReference.get();
          if (localView3 != null) {
            break label470;
          }
          je.e("Ad choices asset view is not provided.");
          label254:
          localatv1.a(localView1, this.d, this.e, this, this);
          jn.a.post(new auh(this, localatv1));
          a(localView1);
          this.g.b(localView1);
        }
      }
      for (;;)
      {
        synchronized (this.b)
        {
          if (!(this.g instanceof atv))
          {
            return;
            atv localatv2 = (atv)this.g;
            View localView2 = (View)this.c.get();
            if ((localatv2 != null) && (localatv2.m() != null) && (localView2 != null) && (zzbv.zzfh().c(localView2.getContext())))
            {
              hy localhy = localatv2.n();
              if (localhy != null) {
                localhy.a(false);
              }
              akg localakg2 = (akg)this.k.get();
              if ((localakg2 != null) && (localhy != null)) {
                localakg2.b(localhy);
              }
            }
            break;
            localObject5 = finally;
            throw localObject5;
            label444:
            this.g = localatv1;
            if (!(localatv1 instanceof atp)) {
              break label180;
            }
            ((atp)localatv1).a(null);
            break label180;
            label470:
            if (!(localView3 instanceof ViewGroup)) {
              break label696;
            }
            localViewGroup = (ViewGroup)localView3;
            if (localViewGroup == null) {
              break label254;
            }
            this.h = localatv1.a(this, true);
            if (this.h == null) {
              break label254;
            }
            this.f.put("1007", new WeakReference(this.h));
            this.d.put("1007", new WeakReference(this.h));
            localViewGroup.removeAllViews();
            localViewGroup.addView(this.h);
            break label254;
          }
          atv localatv3 = (atv)this.g;
          View localView4 = (View)this.c.get();
          if ((localatv3 != null) && (localatv3.m() != null) && (localView4 != null) && (zzbv.zzfh().c(localView4.getContext())))
          {
            akg localakg1 = (akg)this.k.get();
            if (localakg1 == null)
            {
              localakg1 = new akg(localView4.getContext(), localView4);
              this.k = new WeakReference(localakg1);
            }
            localakg1.a(localatv3.n());
          }
        }
        label696:
        ViewGroup localViewGroup = null;
      }
      label702:
      m++;
      continue;
      label708:
      View localView3 = null;
    }
  }
  
  public final void b(a parama)
  {
    synchronized (this.b)
    {
      this.g.a((View)b.a(parama));
      return;
    }
  }
  
  public final void onClick(View paramView)
  {
    View localView;
    synchronized (this.b)
    {
      if (this.g == null) {
        return;
      }
      localView = (View)this.c.get();
      if (localView == null) {
        return;
      }
    }
    Bundle localBundle = new Bundle();
    localBundle.putFloat("x", a(this.i.x));
    localBundle.putFloat("y", a(this.i.y));
    localBundle.putFloat("start_x", a(this.j.x));
    localBundle.putFloat("start_y", a(this.j.y));
    if ((this.h != null) && (this.h.equals(paramView))) {
      if ((this.g instanceof atp)) {
        if (((atp)this.g).f() != null) {
          ((atp)this.g).f().a(paramView, "1007", localBundle, this.f, localView);
        }
      }
    }
    for (;;)
    {
      return;
      this.g.a(paramView, "1007", localBundle, this.f, localView);
      continue;
      this.g.a(paramView, this.f, localBundle, localView);
    }
  }
  
  public final void onGlobalLayout()
  {
    synchronized (this.b)
    {
      if (this.g != null)
      {
        View localView = (View)this.c.get();
        if (localView != null) {
          this.g.c(localView, this.f);
        }
      }
      return;
    }
  }
  
  public final void onScrollChanged()
  {
    synchronized (this.b)
    {
      if (this.g != null)
      {
        View localView = (View)this.c.get();
        if (localView != null) {
          this.g.c(localView, this.f);
        }
      }
      return;
    }
  }
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    View localView;
    synchronized (this.b)
    {
      if (this.g == null) {
        return false;
      }
      localView = (View)this.c.get();
      if (localView == null) {
        return false;
      }
    }
    int[] arrayOfInt = new int[2];
    localView.getLocationOnScreen(arrayOfInt);
    float f1 = paramMotionEvent.getRawX() - arrayOfInt[0];
    float f2 = paramMotionEvent.getRawY() - arrayOfInt[1];
    Point localPoint = new Point((int)f1, (int)f2);
    this.i = localPoint;
    if (paramMotionEvent.getAction() == 0) {
      this.j = localPoint;
    }
    MotionEvent localMotionEvent = MotionEvent.obtain(paramMotionEvent);
    localMotionEvent.setLocation(localPoint.x, localPoint.y);
    this.g.a(localMotionEvent);
    localMotionEvent.recycle();
    return false;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aug
 * JD-Core Version:    0.7.0.1
 */