package android.support.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.v4.content.a.c;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

public class TransitionSet
  extends Transition
{
  private ArrayList<Transition> g = new ArrayList();
  private boolean h = true;
  private int i;
  private boolean j = false;
  
  public TransitionSet() {}
  
  public TransitionSet(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, ac.i);
    a(c.a(localTypedArray, (XmlResourceParser)paramAttributeSet, "transitionOrdering", 0, 0));
    localTypedArray.recycle();
  }
  
  private void q()
  {
    a locala = new a(this);
    Iterator localIterator = this.g.iterator();
    while (localIterator.hasNext()) {
      ((Transition)localIterator.next()).a(locala);
    }
    this.i = this.g.size();
  }
  
  public TransitionSet a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + paramInt);
    case 1: 
      this.h = false;
      return this;
    }
    this.h = true;
    return this;
  }
  
  public TransitionSet a(View paramView)
  {
    for (int k = 0; k < this.g.size(); k++) {
      ((Transition)this.g.get(k)).c(paramView);
    }
    return (TransitionSet)super.c(paramView);
  }
  
  String a(String paramString)
  {
    Object localObject = super.a(paramString);
    int k = 0;
    while (k < this.g.size())
    {
      String str = (String)localObject + "\n" + ((Transition)this.g.get(k)).a(new StringBuilder().append(paramString).append("  ").toString());
      k++;
      localObject = str;
    }
    return localObject;
  }
  
  public void a(Transition.b paramb)
  {
    super.a(paramb);
    int k = this.g.size();
    for (int m = 0; m < k; m++) {
      ((Transition)this.g.get(m)).a(paramb);
    }
  }
  
  public void a(af paramaf)
  {
    super.a(paramaf);
    int k = this.g.size();
    for (int m = 0; m < k; m++) {
      ((Transition)this.g.get(m)).a(paramaf);
    }
  }
  
  public void a(ah paramah)
  {
    if (b(paramah.b))
    {
      Iterator localIterator = this.g.iterator();
      while (localIterator.hasNext())
      {
        Transition localTransition = (Transition)localIterator.next();
        if (localTransition.b(paramah.b))
        {
          localTransition.a(paramah);
          paramah.c.add(localTransition);
        }
      }
    }
  }
  
  protected void a(ViewGroup paramViewGroup, ai paramai1, ai paramai2, ArrayList<ah> paramArrayList1, ArrayList<ah> paramArrayList2)
  {
    long l1 = c();
    int k = this.g.size();
    int m = 0;
    if (m < k)
    {
      Transition localTransition = (Transition)this.g.get(m);
      if ((l1 > 0L) && ((this.h) || (m == 0)))
      {
        long l2 = localTransition.c();
        if (l2 <= 0L) {
          break label101;
        }
        localTransition.b(l2 + l1);
      }
      for (;;)
      {
        localTransition.a(paramViewGroup, paramai1, paramai2, paramArrayList1, paramArrayList2);
        m++;
        break;
        label101:
        localTransition.b(l1);
      }
    }
  }
  
  public Transition b(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.g.size())) {
      return null;
    }
    return (Transition)this.g.get(paramInt);
  }
  
  public TransitionSet b(TimeInterpolator paramTimeInterpolator)
  {
    return (TransitionSet)super.a(paramTimeInterpolator);
  }
  
  public TransitionSet b(Transition paramTransition)
  {
    this.g.add(paramTransition);
    paramTransition.d = this;
    if (this.a >= 0L) {
      paramTransition.a(this.a);
    }
    return this;
  }
  
  public void b(ah paramah)
  {
    if (b(paramah.b))
    {
      Iterator localIterator = this.g.iterator();
      while (localIterator.hasNext())
      {
        Transition localTransition = (Transition)localIterator.next();
        if (localTransition.b(paramah.b))
        {
          localTransition.b(paramah);
          paramah.c.add(localTransition);
        }
      }
    }
  }
  
  public TransitionSet c(long paramLong)
  {
    super.a(paramLong);
    if (this.a >= 0L)
    {
      int k = this.g.size();
      for (int m = 0; m < k; m++) {
        ((Transition)this.g.get(m)).a(paramLong);
      }
    }
    return this;
  }
  
  public TransitionSet c(Transition.c paramc)
  {
    return (TransitionSet)super.a(paramc);
  }
  
  void c(ah paramah)
  {
    super.c(paramah);
    int k = this.g.size();
    for (int m = 0; m < k; m++) {
      ((Transition)this.g.get(m)).c(paramah);
    }
  }
  
  public TransitionSet d(long paramLong)
  {
    return (TransitionSet)super.b(paramLong);
  }
  
  public TransitionSet d(Transition.c paramc)
  {
    return (TransitionSet)super.b(paramc);
  }
  
  protected void e()
  {
    if (this.g.isEmpty())
    {
      j();
      k();
    }
    for (;;)
    {
      return;
      q();
      if (!this.h)
      {
        for (int k = 1; k < this.g.size(); k++) {
          ((Transition)this.g.get(k - 1)).a(new ad()
          {
            public void a(Transition paramAnonymousTransition)
            {
              this.a.e();
              paramAnonymousTransition.b(this);
            }
          });
        }
        Transition localTransition = (Transition)this.g.get(0);
        if (localTransition != null) {
          localTransition.e();
        }
      }
      else
      {
        Iterator localIterator = this.g.iterator();
        while (localIterator.hasNext()) {
          ((Transition)localIterator.next()).e();
        }
      }
    }
  }
  
  public void e(View paramView)
  {
    super.e(paramView);
    int k = this.g.size();
    for (int m = 0; m < k; m++) {
      ((Transition)this.g.get(m)).e(paramView);
    }
  }
  
  public void f(View paramView)
  {
    super.f(paramView);
    int k = this.g.size();
    for (int m = 0; m < k; m++) {
      ((Transition)this.g.get(m)).f(paramView);
    }
  }
  
  public TransitionSet g(View paramView)
  {
    for (int k = 0; k < this.g.size(); k++) {
      ((Transition)this.g.get(k)).d(paramView);
    }
    return (TransitionSet)super.d(paramView);
  }
  
  public Transition n()
  {
    TransitionSet localTransitionSet = (TransitionSet)super.n();
    localTransitionSet.g = new ArrayList();
    int k = this.g.size();
    for (int m = 0; m < k; m++) {
      localTransitionSet.b(((Transition)this.g.get(m)).n());
    }
    return localTransitionSet;
  }
  
  public int p()
  {
    return this.g.size();
  }
  
  static class a
    extends ad
  {
    TransitionSet a;
    
    a(TransitionSet paramTransitionSet)
    {
      this.a = paramTransitionSet;
    }
    
    public void a(Transition paramTransition)
    {
      TransitionSet.b(this.a);
      if (TransitionSet.c(this.a) == 0)
      {
        TransitionSet.a(this.a, false);
        this.a.k();
      }
      paramTransition.b(this);
    }
    
    public void d(Transition paramTransition)
    {
      if (!TransitionSet.a(this.a))
      {
        this.a.j();
        TransitionSet.a(this.a, true);
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.transition.TransitionSet
 * JD-Core Version:    0.7.0.1
 */