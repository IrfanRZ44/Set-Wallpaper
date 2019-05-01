package android.support.c.a;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

public class c
  extends h
  implements b
{
  final Drawable.Callback a = new Drawable.Callback()
  {
    public void invalidateDrawable(Drawable paramAnonymousDrawable)
    {
      c.this.invalidateSelf();
    }
    
    public void scheduleDrawable(Drawable paramAnonymousDrawable, Runnable paramAnonymousRunnable, long paramAnonymousLong)
    {
      c.this.scheduleSelf(paramAnonymousRunnable, paramAnonymousLong);
    }
    
    public void unscheduleDrawable(Drawable paramAnonymousDrawable, Runnable paramAnonymousRunnable)
    {
      c.this.unscheduleSelf(paramAnonymousRunnable);
    }
  };
  private a c;
  private Context d;
  private ArgbEvaluator e = null;
  private Animator.AnimatorListener f = null;
  private ArrayList<Object> g = null;
  
  c()
  {
    this(null, null, null);
  }
  
  private c(Context paramContext)
  {
    this(paramContext, null, null);
  }
  
  private c(Context paramContext, a parama, Resources paramResources)
  {
    this.d = paramContext;
    if (parama != null)
    {
      this.c = parama;
      return;
    }
    this.c = new a(paramContext, parama, this.a, paramResources);
  }
  
  public static c a(Context paramContext, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    c localc = new c(paramContext);
    localc.inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    return localc;
  }
  
  private void a(Animator paramAnimator)
  {
    if ((paramAnimator instanceof AnimatorSet))
    {
      ArrayList localArrayList = ((AnimatorSet)paramAnimator).getChildAnimations();
      if (localArrayList != null) {
        for (int i = 0; i < localArrayList.size(); i++) {
          a((Animator)localArrayList.get(i));
        }
      }
    }
    if ((paramAnimator instanceof ObjectAnimator))
    {
      ObjectAnimator localObjectAnimator = (ObjectAnimator)paramAnimator;
      String str = localObjectAnimator.getPropertyName();
      if (("fillColor".equals(str)) || ("strokeColor".equals(str)))
      {
        if (this.e == null) {
          this.e = new ArgbEvaluator();
        }
        localObjectAnimator.setEvaluator(this.e);
      }
    }
  }
  
  private void a(String paramString, Animator paramAnimator)
  {
    paramAnimator.setTarget(this.c.b.a(paramString));
    if (Build.VERSION.SDK_INT < 21) {
      a(paramAnimator);
    }
    if (a.a(this.c) == null)
    {
      a.a(this.c, new ArrayList());
      this.c.d = new android.support.v4.f.a();
    }
    a.a(this.c).add(paramAnimator);
    this.c.d.put(paramAnimator, paramString);
  }
  
  public void applyTheme(Resources.Theme paramTheme)
  {
    if (this.b != null) {
      android.support.v4.a.a.a.a(this.b, paramTheme);
    }
  }
  
  public boolean canApplyTheme()
  {
    if (this.b != null) {
      return android.support.v4.a.a.a.d(this.b);
    }
    return false;
  }
  
  public void draw(Canvas paramCanvas)
  {
    if (this.b != null) {
      this.b.draw(paramCanvas);
    }
    do
    {
      return;
      this.c.b.draw(paramCanvas);
    } while (!this.c.c.isStarted());
    invalidateSelf();
  }
  
  public int getAlpha()
  {
    if (this.b != null) {
      return android.support.v4.a.a.a.c(this.b);
    }
    return this.c.b.getAlpha();
  }
  
  public int getChangingConfigurations()
  {
    if (this.b != null) {
      return this.b.getChangingConfigurations();
    }
    return super.getChangingConfigurations() | this.c.a;
  }
  
  public Drawable.ConstantState getConstantState()
  {
    if ((this.b != null) && (Build.VERSION.SDK_INT >= 24)) {
      return new b(this.b.getConstantState());
    }
    return null;
  }
  
  public int getIntrinsicHeight()
  {
    if (this.b != null) {
      return this.b.getIntrinsicHeight();
    }
    return this.c.b.getIntrinsicHeight();
  }
  
  public int getIntrinsicWidth()
  {
    if (this.b != null) {
      return this.b.getIntrinsicWidth();
    }
    return this.c.b.getIntrinsicWidth();
  }
  
  public int getOpacity()
  {
    if (this.b != null) {
      return this.b.getOpacity();
    }
    return this.c.b.getOpacity();
  }
  
  public void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet)
  {
    inflate(paramResources, paramXmlPullParser, paramAttributeSet, null);
  }
  
  public void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    if (this.b != null)
    {
      android.support.v4.a.a.a.a(this.b, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
      return;
    }
    int i = paramXmlPullParser.getEventType();
    int j = 1 + paramXmlPullParser.getDepth();
    if ((i != 1) && ((paramXmlPullParser.getDepth() >= j) || (i != 3)))
    {
      String str1;
      if (i == 2)
      {
        str1 = paramXmlPullParser.getName();
        if (!"animated-vector".equals(str1)) {
          break label182;
        }
        TypedArray localTypedArray2 = android.support.v4.content.a.c.a(paramResources, paramTheme, paramAttributeSet, a.e);
        int m = localTypedArray2.getResourceId(0, 0);
        if (m != 0)
        {
          i locali = i.a(paramResources, m, paramTheme);
          locali.a(false);
          locali.setCallback(this.a);
          if (this.c.b != null) {
            this.c.b.setCallback(null);
          }
          this.c.b = locali;
        }
        localTypedArray2.recycle();
      }
      label182:
      TypedArray localTypedArray1;
      for (;;)
      {
        i = paramXmlPullParser.next();
        break;
        if ("target".equals(str1))
        {
          localTypedArray1 = paramResources.obtainAttributes(paramAttributeSet, a.f);
          String str2 = localTypedArray1.getString(0);
          int k = localTypedArray1.getResourceId(1, 0);
          if (k != 0)
          {
            if (this.d == null) {
              break label255;
            }
            a(str2, e.a(this.d, k));
          }
          localTypedArray1.recycle();
        }
      }
      label255:
      localTypedArray1.recycle();
      throw new IllegalStateException("Context can't be null when inflating animators");
    }
    this.c.a();
  }
  
  public boolean isAutoMirrored()
  {
    if (this.b != null) {
      return android.support.v4.a.a.a.b(this.b);
    }
    return this.c.b.isAutoMirrored();
  }
  
  public boolean isRunning()
  {
    if (this.b != null) {
      return ((AnimatedVectorDrawable)this.b).isRunning();
    }
    return this.c.c.isRunning();
  }
  
  public boolean isStateful()
  {
    if (this.b != null) {
      return this.b.isStateful();
    }
    return this.c.b.isStateful();
  }
  
  public Drawable mutate()
  {
    if (this.b != null) {
      this.b.mutate();
    }
    return this;
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    if (this.b != null)
    {
      this.b.setBounds(paramRect);
      return;
    }
    this.c.b.setBounds(paramRect);
  }
  
  protected boolean onLevelChange(int paramInt)
  {
    if (this.b != null) {
      return this.b.setLevel(paramInt);
    }
    return this.c.b.setLevel(paramInt);
  }
  
  protected boolean onStateChange(int[] paramArrayOfInt)
  {
    if (this.b != null) {
      return this.b.setState(paramArrayOfInt);
    }
    return this.c.b.setState(paramArrayOfInt);
  }
  
  public void setAlpha(int paramInt)
  {
    if (this.b != null)
    {
      this.b.setAlpha(paramInt);
      return;
    }
    this.c.b.setAlpha(paramInt);
  }
  
  public void setAutoMirrored(boolean paramBoolean)
  {
    if (this.b != null)
    {
      android.support.v4.a.a.a.a(this.b, paramBoolean);
      return;
    }
    this.c.b.setAutoMirrored(paramBoolean);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    if (this.b != null)
    {
      this.b.setColorFilter(paramColorFilter);
      return;
    }
    this.c.b.setColorFilter(paramColorFilter);
  }
  
  public void setTint(int paramInt)
  {
    if (this.b != null)
    {
      android.support.v4.a.a.a.a(this.b, paramInt);
      return;
    }
    this.c.b.setTint(paramInt);
  }
  
  public void setTintList(ColorStateList paramColorStateList)
  {
    if (this.b != null)
    {
      android.support.v4.a.a.a.a(this.b, paramColorStateList);
      return;
    }
    this.c.b.setTintList(paramColorStateList);
  }
  
  public void setTintMode(PorterDuff.Mode paramMode)
  {
    if (this.b != null)
    {
      android.support.v4.a.a.a.a(this.b, paramMode);
      return;
    }
    this.c.b.setTintMode(paramMode);
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.b != null) {
      return this.b.setVisible(paramBoolean1, paramBoolean2);
    }
    this.c.b.setVisible(paramBoolean1, paramBoolean2);
    return super.setVisible(paramBoolean1, paramBoolean2);
  }
  
  public void start()
  {
    if (this.b != null) {
      ((AnimatedVectorDrawable)this.b).start();
    }
    while (this.c.c.isStarted()) {
      return;
    }
    this.c.c.start();
    invalidateSelf();
  }
  
  public void stop()
  {
    if (this.b != null)
    {
      ((AnimatedVectorDrawable)this.b).stop();
      return;
    }
    this.c.c.end();
  }
  
  private static class a
    extends Drawable.ConstantState
  {
    int a;
    i b;
    AnimatorSet c;
    android.support.v4.f.a<Animator, String> d;
    private ArrayList<Animator> e;
    
    public a(Context paramContext, a parama, Drawable.Callback paramCallback, Resources paramResources)
    {
      if (parama != null)
      {
        this.a = parama.a;
        Drawable.ConstantState localConstantState;
        if (parama.b != null)
        {
          localConstantState = parama.b.getConstantState();
          if (paramResources == null) {
            break label224;
          }
        }
        label224:
        for (this.b = ((i)localConstantState.newDrawable(paramResources));; this.b = ((i)localConstantState.newDrawable()))
        {
          this.b = ((i)this.b.mutate());
          this.b.setCallback(paramCallback);
          this.b.setBounds(parama.b.getBounds());
          this.b.a(false);
          if (parama.e == null) {
            return;
          }
          int j = parama.e.size();
          this.e = new ArrayList(j);
          this.d = new android.support.v4.f.a(j);
          while (i < j)
          {
            Animator localAnimator1 = (Animator)parama.e.get(i);
            Animator localAnimator2 = localAnimator1.clone();
            String str = (String)parama.d.get(localAnimator1);
            localAnimator2.setTarget(this.b.a(str));
            this.e.add(localAnimator2);
            this.d.put(localAnimator2, str);
            i++;
          }
        }
        a();
      }
    }
    
    public void a()
    {
      if (this.c == null) {
        this.c = new AnimatorSet();
      }
      this.c.playTogether(this.e);
    }
    
    public int getChangingConfigurations()
    {
      return this.a;
    }
    
    public Drawable newDrawable()
    {
      throw new IllegalStateException("No constant state support for SDK < 24.");
    }
    
    public Drawable newDrawable(Resources paramResources)
    {
      throw new IllegalStateException("No constant state support for SDK < 24.");
    }
  }
  
  private static class b
    extends Drawable.ConstantState
  {
    private final Drawable.ConstantState a;
    
    public b(Drawable.ConstantState paramConstantState)
    {
      this.a = paramConstantState;
    }
    
    public boolean canApplyTheme()
    {
      return this.a.canApplyTheme();
    }
    
    public int getChangingConfigurations()
    {
      return this.a.getChangingConfigurations();
    }
    
    public Drawable newDrawable()
    {
      c localc = new c();
      localc.b = this.a.newDrawable();
      localc.b.setCallback(localc.a);
      return localc;
    }
    
    public Drawable newDrawable(Resources paramResources)
    {
      c localc = new c();
      localc.b = this.a.newDrawable(paramResources);
      localc.b.setCallback(localc.a);
      return localc;
    }
    
    public Drawable newDrawable(Resources paramResources, Resources.Theme paramTheme)
    {
      c localc = new c();
      localc.b = this.a.newDrawable(paramResources, paramTheme);
      localc.b.setCallback(localc.a);
      return localc;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.c.a.c
 * JD-Core Version:    0.7.0.1
 */