package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.AnimatorSet.Builder;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.support.v4.a.a.a;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

class h
  extends g
{
  private InsetDrawable p;
  
  h(VisibilityAwareImageButton paramVisibilityAwareImageButton, j paramj)
  {
    super(paramVisibilityAwareImageButton, paramj);
  }
  
  public float a()
  {
    return this.n.getElevation();
  }
  
  void a(float paramFloat1, float paramFloat2)
  {
    if (Build.VERSION.SDK_INT == 21) {
      if (this.n.isEnabled())
      {
        this.n.setElevation(paramFloat1);
        if ((this.n.isFocused()) || (this.n.isPressed())) {
          this.n.setTranslationZ(paramFloat2);
        }
      }
    }
    for (;;)
    {
      if (this.o.b()) {
        e();
      }
      return;
      this.n.setTranslationZ(0.0F);
      continue;
      this.n.setElevation(0.0F);
      this.n.setTranslationZ(0.0F);
      continue;
      StateListAnimator localStateListAnimator = new StateListAnimator();
      AnimatorSet localAnimatorSet1 = new AnimatorSet();
      localAnimatorSet1.play(ObjectAnimator.ofFloat(this.n, "elevation", new float[] { paramFloat1 }).setDuration(0L)).with(ObjectAnimator.ofFloat(this.n, View.TRANSLATION_Z, new float[] { paramFloat2 }).setDuration(100L));
      localAnimatorSet1.setInterpolator(a);
      localStateListAnimator.addState(j, localAnimatorSet1);
      AnimatorSet localAnimatorSet2 = new AnimatorSet();
      localAnimatorSet2.play(ObjectAnimator.ofFloat(this.n, "elevation", new float[] { paramFloat1 }).setDuration(0L)).with(ObjectAnimator.ofFloat(this.n, View.TRANSLATION_Z, new float[] { paramFloat2 }).setDuration(100L));
      localAnimatorSet2.setInterpolator(a);
      localStateListAnimator.addState(k, localAnimatorSet2);
      AnimatorSet localAnimatorSet3 = new AnimatorSet();
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(ObjectAnimator.ofFloat(this.n, "elevation", new float[] { paramFloat1 }).setDuration(0L));
      if ((Build.VERSION.SDK_INT >= 22) && (Build.VERSION.SDK_INT <= 24))
      {
        VisibilityAwareImageButton localVisibilityAwareImageButton = this.n;
        Property localProperty = View.TRANSLATION_Z;
        float[] arrayOfFloat = new float[1];
        arrayOfFloat[0] = this.n.getTranslationZ();
        localArrayList.add(ObjectAnimator.ofFloat(localVisibilityAwareImageButton, localProperty, arrayOfFloat).setDuration(100L));
      }
      localArrayList.add(ObjectAnimator.ofFloat(this.n, View.TRANSLATION_Z, new float[] { 0.0F }).setDuration(100L));
      localAnimatorSet3.playSequentially((Animator[])localArrayList.toArray(new ObjectAnimator[0]));
      localAnimatorSet3.setInterpolator(a);
      localStateListAnimator.addState(l, localAnimatorSet3);
      AnimatorSet localAnimatorSet4 = new AnimatorSet();
      localAnimatorSet4.play(ObjectAnimator.ofFloat(this.n, "elevation", new float[] { 0.0F }).setDuration(0L)).with(ObjectAnimator.ofFloat(this.n, View.TRANSLATION_Z, new float[] { 0.0F }).setDuration(0L));
      localAnimatorSet4.setInterpolator(a);
      localStateListAnimator.addState(m, localAnimatorSet4);
      this.n.setStateListAnimator(localStateListAnimator);
    }
  }
  
  void a(int paramInt)
  {
    if ((this.e instanceof RippleDrawable))
    {
      ((RippleDrawable)this.e).setColor(ColorStateList.valueOf(paramInt));
      return;
    }
    super.a(paramInt);
  }
  
  void a(ColorStateList paramColorStateList, PorterDuff.Mode paramMode, int paramInt1, int paramInt2)
  {
    this.d = a.g(k());
    a.a(this.d, paramColorStateList);
    if (paramMode != null) {
      a.a(this.d, paramMode);
    }
    Drawable[] arrayOfDrawable;
    if (paramInt2 > 0)
    {
      this.f = a(paramInt2, paramColorStateList);
      arrayOfDrawable = new Drawable[2];
      arrayOfDrawable[0] = this.f;
      arrayOfDrawable[1] = this.d;
    }
    for (Object localObject = new LayerDrawable(arrayOfDrawable);; localObject = this.d)
    {
      this.e = new RippleDrawable(ColorStateList.valueOf(paramInt1), (Drawable)localObject, null);
      this.g = this.e;
      this.o.a(this.e);
      return;
      this.f = null;
    }
  }
  
  void a(Rect paramRect)
  {
    if (this.o.b())
    {
      float f1 = this.o.a();
      float f2 = a() + this.i;
      int i = (int)Math.ceil(i.b(f2, f1, false));
      int j = (int)Math.ceil(i.a(f2, f1, false));
      paramRect.set(i, j, i, j);
      return;
    }
    paramRect.set(0, 0, 0, 0);
  }
  
  void a(int[] paramArrayOfInt) {}
  
  void b() {}
  
  void b(Rect paramRect)
  {
    if (this.o.b())
    {
      this.p = new InsetDrawable(this.e, paramRect.left, paramRect.top, paramRect.right, paramRect.bottom);
      this.o.a(this.p);
      return;
    }
    this.o.a(this.e);
  }
  
  void d()
  {
    e();
  }
  
  boolean h()
  {
    return false;
  }
  
  c i()
  {
    return new d();
  }
  
  GradientDrawable l()
  {
    return new a();
  }
  
  static class a
    extends GradientDrawable
  {
    public boolean isStateful()
    {
      return true;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.design.widget.h
 * JD-Core Version:    0.7.0.1
 */