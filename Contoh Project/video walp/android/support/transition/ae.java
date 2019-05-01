package android.support.transition;

import android.support.v4.f.a;
import android.support.v4.view.s;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class ae
{
  private static Transition a = new AutoTransition();
  private static ThreadLocal<WeakReference<a<ViewGroup, ArrayList<Transition>>>> b = new ThreadLocal();
  private static ArrayList<ViewGroup> c = new ArrayList();
  
  static a<ViewGroup, ArrayList<Transition>> a()
  {
    WeakReference localWeakReference = (WeakReference)b.get();
    if ((localWeakReference == null) || (localWeakReference.get() == null))
    {
      localWeakReference = new WeakReference(new a());
      b.set(localWeakReference);
    }
    return (a)localWeakReference.get();
  }
  
  public static void a(ViewGroup paramViewGroup, Transition paramTransition)
  {
    if ((!c.contains(paramViewGroup)) && (s.x(paramViewGroup)))
    {
      c.add(paramViewGroup);
      if (paramTransition == null) {
        paramTransition = a;
      }
      Transition localTransition = paramTransition.n();
      c(paramViewGroup, localTransition);
      aa.a(paramViewGroup, null);
      b(paramViewGroup, localTransition);
    }
  }
  
  private static void b(ViewGroup paramViewGroup, Transition paramTransition)
  {
    if ((paramTransition != null) && (paramViewGroup != null))
    {
      a locala = new a(paramTransition, paramViewGroup);
      paramViewGroup.addOnAttachStateChangeListener(locala);
      paramViewGroup.getViewTreeObserver().addOnPreDrawListener(locala);
    }
  }
  
  private static void c(ViewGroup paramViewGroup, Transition paramTransition)
  {
    ArrayList localArrayList = (ArrayList)a().get(paramViewGroup);
    if ((localArrayList != null) && (localArrayList.size() > 0))
    {
      Iterator localIterator = localArrayList.iterator();
      while (localIterator.hasNext()) {
        ((Transition)localIterator.next()).e(paramViewGroup);
      }
    }
    if (paramTransition != null) {
      paramTransition.a(paramViewGroup, true);
    }
    aa localaa = aa.a(paramViewGroup);
    if (localaa != null) {
      localaa.a();
    }
  }
  
  private static class a
    implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener
  {
    Transition a;
    ViewGroup b;
    
    a(Transition paramTransition, ViewGroup paramViewGroup)
    {
      this.a = paramTransition;
      this.b = paramViewGroup;
    }
    
    private void a()
    {
      this.b.getViewTreeObserver().removeOnPreDrawListener(this);
      this.b.removeOnAttachStateChangeListener(this);
    }
    
    public boolean onPreDraw()
    {
      a();
      if (!ae.b().remove(this.b)) {
        return true;
      }
      final a locala = ae.a();
      ArrayList localArrayList1 = (ArrayList)locala.get(this.b);
      ArrayList localArrayList3;
      Object localObject;
      if (localArrayList1 == null)
      {
        ArrayList localArrayList2 = new ArrayList();
        locala.put(this.b, localArrayList2);
        localArrayList3 = localArrayList2;
        localObject = null;
      }
      for (;;)
      {
        localArrayList3.add(this.a);
        this.a.a(new ad()
        {
          public void a(Transition paramAnonymousTransition)
          {
            ((ArrayList)locala.get(ae.a.this.b)).remove(paramAnonymousTransition);
          }
        });
        this.a.a(this.b, false);
        if (localObject != null)
        {
          Iterator localIterator = localObject.iterator();
          for (;;)
          {
            if (localIterator.hasNext())
            {
              ((Transition)localIterator.next()).f(this.b);
              continue;
              if (localArrayList1.size() <= 0) {
                break label184;
              }
              ArrayList localArrayList4 = new ArrayList(localArrayList1);
              localArrayList3 = localArrayList1;
              localObject = localArrayList4;
              break;
            }
          }
        }
        this.a.a(this.b);
        return true;
        label184:
        localArrayList3 = localArrayList1;
        localObject = null;
      }
    }
    
    public void onViewAttachedToWindow(View paramView) {}
    
    public void onViewDetachedFromWindow(View paramView)
    {
      a();
      ae.b().remove(this.b);
      ArrayList localArrayList = (ArrayList)ae.a().get(this.b);
      if ((localArrayList != null) && (localArrayList.size() > 0))
      {
        Iterator localIterator = localArrayList.iterator();
        while (localIterator.hasNext()) {
          ((Transition)localIterator.next()).f(this.b);
        }
      }
      this.a.b(true);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.transition.ae
 * JD-Core Version:    0.7.0.1
 */