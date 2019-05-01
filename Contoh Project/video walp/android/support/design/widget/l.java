package android.support.design.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

final class l
{
  ValueAnimator a = null;
  private final ArrayList<a> b = new ArrayList();
  private a c = null;
  private final Animator.AnimatorListener d = new AnimatorListenerAdapter()
  {
    public void onAnimationEnd(Animator paramAnonymousAnimator)
    {
      if (l.this.a == paramAnonymousAnimator) {
        l.this.a = null;
      }
    }
  };
  
  private void a(a parama)
  {
    this.a = parama.b;
    this.a.start();
  }
  
  private void b()
  {
    if (this.a != null)
    {
      this.a.cancel();
      this.a = null;
    }
  }
  
  public void a()
  {
    if (this.a != null)
    {
      this.a.end();
      this.a = null;
    }
  }
  
  void a(int[] paramArrayOfInt)
  {
    int i = this.b.size();
    int j = 0;
    a locala;
    if (j < i)
    {
      locala = (a)this.b.get(j);
      if (!StateSet.stateSetMatches(locala.a, paramArrayOfInt)) {}
    }
    for (;;)
    {
      if (locala == this.c) {}
      do
      {
        return;
        j++;
        break;
        if (this.c != null) {
          b();
        }
        this.c = locala;
      } while (locala == null);
      a(locala);
      return;
      locala = null;
    }
  }
  
  public void a(int[] paramArrayOfInt, ValueAnimator paramValueAnimator)
  {
    a locala = new a(paramArrayOfInt, paramValueAnimator);
    paramValueAnimator.addListener(this.d);
    this.b.add(locala);
  }
  
  static class a
  {
    final int[] a;
    final ValueAnimator b;
    
    a(int[] paramArrayOfInt, ValueAnimator paramValueAnimator)
    {
      this.a = paramArrayOfInt;
      this.b = paramValueAnimator;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.design.widget.l
 * JD-Core Version:    0.7.0.1
 */