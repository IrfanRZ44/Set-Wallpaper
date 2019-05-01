package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.DrawableContainer;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.design.a.f;
import android.support.design.a.h;
import android.support.design.a.j;
import android.support.design.a.k;
import android.support.v4.view.AbsSavedState;
import android.support.v4.widget.Space;
import android.support.v7.a.a.c;
import android.support.v7.widget.AppCompatDrawableManager;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.DrawableUtils;
import android.support.v7.widget.TintTypedArray;
import android.support.v7.widget.WithHint;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AccelerateInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import java.util.List;

public class TextInputLayout
  extends LinearLayout
  implements WithHint
{
  private boolean A;
  private Drawable B;
  private Drawable C;
  private ColorStateList D;
  private boolean E;
  private PorterDuff.Mode F;
  private boolean G;
  private ColorStateList H;
  private ColorStateList I;
  private boolean J;
  private boolean K;
  private ValueAnimator L;
  private boolean M;
  private boolean N;
  private boolean O;
  EditText a;
  TextView b;
  boolean c;
  final e d = new e(this);
  private final FrameLayout e;
  private CharSequence f;
  private boolean g;
  private CharSequence h;
  private Paint i;
  private final Rect j = new Rect();
  private LinearLayout k;
  private int l;
  private Typeface m;
  private boolean n;
  private int o;
  private boolean p;
  private CharSequence q;
  private TextView r;
  private int s;
  private int t;
  private int u;
  private boolean v;
  private boolean w;
  private Drawable x;
  private CharSequence y;
  private CheckableImageButton z;
  
  public TextInputLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public TextInputLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    m.a(paramContext);
    setOrientation(1);
    setWillNotDraw(false);
    setAddStatesFromChildren(true);
    this.e = new FrameLayout(paramContext);
    this.e.setAddStatesFromChildren(true);
    addView(this.e);
    this.d.a(a.b);
    this.d.b(new AccelerateInterpolator());
    this.d.b(8388659);
    TintTypedArray localTintTypedArray = TintTypedArray.obtainStyledAttributes(paramContext, paramAttributeSet, a.k.TextInputLayout, paramInt, a.j.Widget_Design_TextInputLayout);
    this.g = localTintTypedArray.getBoolean(a.k.TextInputLayout_hintEnabled, true);
    setHint(localTintTypedArray.getText(a.k.TextInputLayout_android_hint));
    this.K = localTintTypedArray.getBoolean(a.k.TextInputLayout_hintAnimationEnabled, true);
    if (localTintTypedArray.hasValue(a.k.TextInputLayout_android_textColorHint))
    {
      ColorStateList localColorStateList = localTintTypedArray.getColorStateList(a.k.TextInputLayout_android_textColorHint);
      this.I = localColorStateList;
      this.H = localColorStateList;
    }
    if (localTintTypedArray.getResourceId(a.k.TextInputLayout_hintTextAppearance, -1) != -1) {
      setHintTextAppearance(localTintTypedArray.getResourceId(a.k.TextInputLayout_hintTextAppearance, 0));
    }
    this.o = localTintTypedArray.getResourceId(a.k.TextInputLayout_errorTextAppearance, 0);
    boolean bool1 = localTintTypedArray.getBoolean(a.k.TextInputLayout_errorEnabled, false);
    boolean bool2 = localTintTypedArray.getBoolean(a.k.TextInputLayout_counterEnabled, false);
    setCounterMaxLength(localTintTypedArray.getInt(a.k.TextInputLayout_counterMaxLength, -1));
    this.t = localTintTypedArray.getResourceId(a.k.TextInputLayout_counterTextAppearance, 0);
    this.u = localTintTypedArray.getResourceId(a.k.TextInputLayout_counterOverflowTextAppearance, 0);
    this.w = localTintTypedArray.getBoolean(a.k.TextInputLayout_passwordToggleEnabled, false);
    this.x = localTintTypedArray.getDrawable(a.k.TextInputLayout_passwordToggleDrawable);
    this.y = localTintTypedArray.getText(a.k.TextInputLayout_passwordToggleContentDescription);
    if (localTintTypedArray.hasValue(a.k.TextInputLayout_passwordToggleTint))
    {
      this.E = true;
      this.D = localTintTypedArray.getColorStateList(a.k.TextInputLayout_passwordToggleTint);
    }
    if (localTintTypedArray.hasValue(a.k.TextInputLayout_passwordToggleTintMode))
    {
      this.G = true;
      this.F = o.a(localTintTypedArray.getInt(a.k.TextInputLayout_passwordToggleTintMode, -1), null);
    }
    localTintTypedArray.recycle();
    setErrorEnabled(bool1);
    setCounterEnabled(bool2);
    h();
    if (android.support.v4.view.s.d(this) == 0) {
      android.support.v4.view.s.a(this, 1);
    }
    android.support.v4.view.s.a(this, new a());
  }
  
  private void a()
  {
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)this.e.getLayoutParams();
    if (this.g)
    {
      if (this.i == null) {
        this.i = new Paint();
      }
      this.i.setTypeface(this.d.d());
      this.i.setTextSize(this.d.h());
    }
    for (int i1 = (int)-this.i.ascent();; i1 = 0)
    {
      if (i1 != localLayoutParams.topMargin)
      {
        localLayoutParams.topMargin = i1;
        this.e.requestLayout();
      }
      return;
    }
  }
  
  private static void a(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    int i1 = paramViewGroup.getChildCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      View localView = paramViewGroup.getChildAt(i2);
      localView.setEnabled(paramBoolean);
      if ((localView instanceof ViewGroup)) {
        a((ViewGroup)localView, paramBoolean);
      }
    }
  }
  
  private void a(TextView paramTextView)
  {
    if (this.k != null)
    {
      this.k.removeView(paramTextView);
      int i1 = -1 + this.l;
      this.l = i1;
      if (i1 == 0) {
        this.k.setVisibility(8);
      }
    }
  }
  
  private void a(TextView paramTextView, int paramInt)
  {
    if (this.k == null)
    {
      this.k = new LinearLayout(getContext());
      this.k.setOrientation(0);
      addView(this.k, -1, -2);
      Space localSpace = new Space(getContext());
      LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(0, 0, 1.0F);
      this.k.addView(localSpace, localLayoutParams);
      if (this.a != null) {
        b();
      }
    }
    this.k.setVisibility(0);
    this.k.addView(paramTextView, paramInt);
    this.l = (1 + this.l);
  }
  
  private void a(final CharSequence paramCharSequence, boolean paramBoolean)
  {
    boolean bool = true;
    this.q = paramCharSequence;
    if (!this.n)
    {
      if (TextUtils.isEmpty(paramCharSequence)) {
        return;
      }
      setErrorEnabled(bool);
    }
    if (!TextUtils.isEmpty(paramCharSequence))
    {
      this.p = bool;
      this.b.animate().cancel();
      if (!this.p) {
        break label159;
      }
      this.b.setText(paramCharSequence);
      this.b.setVisibility(0);
      if (!paramBoolean) {
        break label148;
      }
      if (this.b.getAlpha() == 1.0F) {
        this.b.setAlpha(0.0F);
      }
      this.b.animate().alpha(1.0F).setDuration(200L).setInterpolator(a.d).setListener(new AnimatorListenerAdapter()
      {
        public void onAnimationStart(Animator paramAnonymousAnimator)
        {
          TextInputLayout.this.b.setVisibility(0);
        }
      }).start();
    }
    for (;;)
    {
      c();
      a(paramBoolean);
      return;
      bool = false;
      break;
      label148:
      this.b.setAlpha(1.0F);
      continue;
      label159:
      if (this.b.getVisibility() == 0) {
        if (paramBoolean)
        {
          this.b.animate().alpha(0.0F).setDuration(200L).setInterpolator(a.c).setListener(new AnimatorListenerAdapter()
          {
            public void onAnimationEnd(Animator paramAnonymousAnimator)
            {
              TextInputLayout.this.b.setText(paramCharSequence);
              TextInputLayout.this.b.setVisibility(4);
            }
          }).start();
        }
        else
        {
          this.b.setText(paramCharSequence);
          this.b.setVisibility(4);
        }
      }
    }
  }
  
  private static boolean a(int[] paramArrayOfInt, int paramInt)
  {
    int i1 = paramArrayOfInt.length;
    for (int i2 = 0;; i2++)
    {
      boolean bool = false;
      if (i2 < i1)
      {
        if (paramArrayOfInt[i2] == paramInt) {
          bool = true;
        }
      }
      else {
        return bool;
      }
    }
  }
  
  private void b()
  {
    android.support.v4.view.s.b(this.k, android.support.v4.view.s.g(this.a), 0, android.support.v4.view.s.h(this.a), this.a.getPaddingBottom());
  }
  
  private void b(boolean paramBoolean)
  {
    int i1;
    if (this.w)
    {
      i1 = this.a.getSelectionEnd();
      if (!f()) {
        break label66;
      }
      this.a.setTransformationMethod(null);
    }
    for (this.A = true;; this.A = false)
    {
      this.z.setChecked(this.A);
      if (paramBoolean) {
        this.z.jumpDrawablesToCurrentState();
      }
      this.a.setSelection(i1);
      return;
      label66:
      this.a.setTransformationMethod(PasswordTransformationMethod.getInstance());
    }
  }
  
  private void c()
  {
    if (this.a == null) {}
    Drawable localDrawable;
    do
    {
      return;
      localDrawable = this.a.getBackground();
    } while (localDrawable == null);
    d();
    if (DrawableUtils.canSafelyMutateDrawable(localDrawable)) {
      localDrawable = localDrawable.mutate();
    }
    if ((this.p) && (this.b != null))
    {
      localDrawable.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(this.b.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
      return;
    }
    if ((this.v) && (this.r != null))
    {
      localDrawable.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(this.r.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
      return;
    }
    android.support.v4.a.a.a.f(localDrawable);
    this.a.refreshDrawableState();
  }
  
  private void c(boolean paramBoolean)
  {
    if ((this.L != null) && (this.L.isRunning())) {
      this.L.cancel();
    }
    if ((paramBoolean) && (this.K)) {
      a(1.0F);
    }
    for (;;)
    {
      this.J = false;
      return;
      this.d.b(1.0F);
    }
  }
  
  private void d()
  {
    int i1 = Build.VERSION.SDK_INT;
    if ((i1 != 21) && (i1 != 22)) {}
    Drawable localDrawable2;
    do
    {
      Drawable localDrawable1;
      do
      {
        return;
        localDrawable1 = this.a.getBackground();
      } while ((localDrawable1 == null) || (this.M));
      localDrawable2 = localDrawable1.getConstantState().newDrawable();
      if ((localDrawable1 instanceof DrawableContainer)) {
        this.M = f.a((DrawableContainer)localDrawable1, localDrawable2.getConstantState());
      }
    } while (this.M);
    android.support.v4.view.s.a(this.a, localDrawable2);
    this.M = true;
  }
  
  private void d(boolean paramBoolean)
  {
    if ((this.L != null) && (this.L.isRunning())) {
      this.L.cancel();
    }
    if ((paramBoolean) && (this.K)) {
      a(0.0F);
    }
    for (;;)
    {
      this.J = true;
      return;
      this.d.b(0.0F);
    }
  }
  
  private void e()
  {
    if (this.a == null) {}
    Drawable[] arrayOfDrawable1;
    do
    {
      do
      {
        return;
        if (g())
        {
          if (this.z == null)
          {
            this.z = ((CheckableImageButton)LayoutInflater.from(getContext()).inflate(a.h.design_text_input_password_icon, this.e, false));
            this.z.setImageDrawable(this.x);
            this.z.setContentDescription(this.y);
            this.e.addView(this.z);
            this.z.setOnClickListener(new View.OnClickListener()
            {
              public void onClick(View paramAnonymousView)
              {
                TextInputLayout.a(TextInputLayout.this, false);
              }
            });
          }
          if ((this.a != null) && (android.support.v4.view.s.j(this.a) <= 0)) {
            this.a.setMinimumHeight(android.support.v4.view.s.j(this.z));
          }
          this.z.setVisibility(0);
          this.z.setChecked(this.A);
          if (this.B == null) {
            this.B = new ColorDrawable();
          }
          this.B.setBounds(0, 0, this.z.getMeasuredWidth(), 1);
          Drawable[] arrayOfDrawable2 = android.support.v4.widget.o.b(this.a);
          if (arrayOfDrawable2[2] != this.B) {
            this.C = arrayOfDrawable2[2];
          }
          android.support.v4.widget.o.a(this.a, arrayOfDrawable2[0], arrayOfDrawable2[1], this.B, arrayOfDrawable2[3]);
          this.z.setPadding(this.a.getPaddingLeft(), this.a.getPaddingTop(), this.a.getPaddingRight(), this.a.getPaddingBottom());
          return;
        }
        if ((this.z != null) && (this.z.getVisibility() == 0)) {
          this.z.setVisibility(8);
        }
      } while (this.B == null);
      arrayOfDrawable1 = android.support.v4.widget.o.b(this.a);
    } while (arrayOfDrawable1[2] != this.B);
    android.support.v4.widget.o.a(this.a, arrayOfDrawable1[0], arrayOfDrawable1[1], this.C, arrayOfDrawable1[3]);
    this.B = null;
  }
  
  private boolean f()
  {
    return (this.a != null) && ((this.a.getTransformationMethod() instanceof PasswordTransformationMethod));
  }
  
  private boolean g()
  {
    return (this.w) && ((f()) || (this.A));
  }
  
  private void h()
  {
    if ((this.x != null) && ((this.E) || (this.G)))
    {
      this.x = android.support.v4.a.a.a.g(this.x).mutate();
      if (this.E) {
        android.support.v4.a.a.a.a(this.x, this.D);
      }
      if (this.G) {
        android.support.v4.a.a.a.a(this.x, this.F);
      }
      if ((this.z != null) && (this.z.getDrawable() != this.x)) {
        this.z.setImageDrawable(this.x);
      }
    }
  }
  
  private void setEditText(EditText paramEditText)
  {
    if (this.a != null) {
      throw new IllegalArgumentException("We already have an EditText, can only have one");
    }
    if (!(paramEditText instanceof TextInputEditText)) {
      Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
    }
    this.a = paramEditText;
    if (!f()) {
      this.d.c(this.a.getTypeface());
    }
    this.d.a(this.a.getTextSize());
    int i1 = this.a.getGravity();
    this.d.b(0x30 | i1 & 0xFFFFFF8F);
    this.d.a(i1);
    this.a.addTextChangedListener(new TextWatcher()
    {
      public void afterTextChanged(Editable paramAnonymousEditable)
      {
        TextInputLayout localTextInputLayout = TextInputLayout.this;
        if (!TextInputLayout.a(TextInputLayout.this)) {}
        for (boolean bool = true;; bool = false)
        {
          localTextInputLayout.a(bool);
          if (TextInputLayout.this.c) {
            TextInputLayout.this.a(paramAnonymousEditable.length());
          }
          return;
        }
      }
      
      public void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3) {}
      
      public void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3) {}
    });
    if (this.H == null) {
      this.H = this.a.getHintTextColors();
    }
    if ((this.g) && (TextUtils.isEmpty(this.h)))
    {
      this.f = this.a.getHint();
      setHint(this.f);
      this.a.setHint(null);
    }
    if (this.r != null) {
      a(this.a.getText().length());
    }
    if (this.k != null) {
      b();
    }
    e();
    a(false, true);
  }
  
  private void setHintInternal(CharSequence paramCharSequence)
  {
    this.h = paramCharSequence;
    this.d.a(paramCharSequence);
  }
  
  void a(float paramFloat)
  {
    if (this.d.g() == paramFloat) {
      return;
    }
    if (this.L == null)
    {
      this.L = new ValueAnimator();
      this.L.setInterpolator(a.a);
      this.L.setDuration(200L);
      this.L.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
      {
        public void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
        {
          TextInputLayout.this.d.b(((Float)paramAnonymousValueAnimator.getAnimatedValue()).floatValue());
        }
      });
    }
    ValueAnimator localValueAnimator = this.L;
    float[] arrayOfFloat = new float[2];
    arrayOfFloat[0] = this.d.g();
    arrayOfFloat[1] = paramFloat;
    localValueAnimator.setFloatValues(arrayOfFloat);
    this.L.start();
  }
  
  void a(int paramInt)
  {
    boolean bool1 = this.v;
    if (this.s == -1)
    {
      this.r.setText(String.valueOf(paramInt));
      this.v = false;
      if ((this.a != null) && (bool1 != this.v))
      {
        a(false);
        c();
      }
      return;
    }
    boolean bool2;
    label64:
    TextView localTextView2;
    if (paramInt > this.s)
    {
      bool2 = true;
      this.v = bool2;
      if (bool1 != this.v)
      {
        localTextView2 = this.r;
        if (!this.v) {
          break label167;
        }
      }
    }
    label167:
    for (int i2 = this.u;; i2 = this.t)
    {
      android.support.v4.widget.o.a(localTextView2, i2);
      TextView localTextView1 = this.r;
      Context localContext = getContext();
      int i1 = android.support.design.a.i.character_counter_pattern;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(paramInt);
      arrayOfObject[1] = Integer.valueOf(this.s);
      localTextView1.setText(localContext.getString(i1, arrayOfObject));
      break;
      bool2 = false;
      break label64;
    }
  }
  
  void a(boolean paramBoolean)
  {
    a(paramBoolean, false);
  }
  
  void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i1 = 1;
    boolean bool1 = isEnabled();
    int i2;
    boolean bool2;
    if ((this.a != null) && (!TextUtils.isEmpty(this.a.getText())))
    {
      i2 = i1;
      bool2 = a(getDrawableState(), 16842908);
      if (TextUtils.isEmpty(getError())) {
        break label148;
      }
      label53:
      if (this.H != null) {
        this.d.b(this.H);
      }
      if ((!bool1) || (!this.v) || (this.r == null)) {
        break label153;
      }
      this.d.a(this.r.getTextColors());
      label104:
      if ((i2 == 0) && ((!isEnabled()) || ((!bool2) && (i1 == 0)))) {
        break label205;
      }
      if ((paramBoolean2) || (this.J)) {
        c(paramBoolean1);
      }
    }
    label148:
    label153:
    label205:
    while ((!paramBoolean2) && (this.J))
    {
      return;
      i2 = 0;
      break;
      i1 = 0;
      break label53;
      if ((bool1) && (bool2) && (this.I != null))
      {
        this.d.a(this.I);
        break label104;
      }
      if (this.H == null) {
        break label104;
      }
      this.d.a(this.H);
      break label104;
    }
    d(paramBoolean1);
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramView instanceof EditText))
    {
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(paramLayoutParams);
      localLayoutParams.gravity = (0x10 | 0xFFFFFF8F & localLayoutParams.gravity);
      this.e.addView(paramView, localLayoutParams);
      this.e.setLayoutParams(paramLayoutParams);
      a();
      setEditText((EditText)paramView);
      return;
    }
    super.addView(paramView, paramInt, paramLayoutParams);
  }
  
  public void dispatchProvideAutofillStructure(ViewStructure paramViewStructure, int paramInt)
  {
    if ((this.f == null) || (this.a == null))
    {
      super.dispatchProvideAutofillStructure(paramViewStructure, paramInt);
      return;
    }
    CharSequence localCharSequence = this.a.getHint();
    this.a.setHint(this.f);
    try
    {
      super.dispatchProvideAutofillStructure(paramViewStructure, paramInt);
      return;
    }
    finally
    {
      this.a.setHint(localCharSequence);
    }
  }
  
  protected void dispatchRestoreInstanceState(SparseArray<Parcelable> paramSparseArray)
  {
    this.O = true;
    super.dispatchRestoreInstanceState(paramSparseArray);
    this.O = false;
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    if (this.g) {
      this.d.a(paramCanvas);
    }
  }
  
  protected void drawableStateChanged()
  {
    boolean bool1 = true;
    if (this.N) {
      return;
    }
    this.N = bool1;
    super.drawableStateChanged();
    int[] arrayOfInt = getDrawableState();
    if ((android.support.v4.view.s.x(this)) && (isEnabled()))
    {
      a(bool1);
      c();
      if (this.d == null) {
        break label84;
      }
    }
    label84:
    for (boolean bool2 = false | this.d.a(arrayOfInt);; bool2 = false)
    {
      if (bool2) {
        invalidate();
      }
      this.N = false;
      return;
      bool1 = false;
      break;
    }
  }
  
  public int getCounterMaxLength()
  {
    return this.s;
  }
  
  public EditText getEditText()
  {
    return this.a;
  }
  
  public CharSequence getError()
  {
    if (this.n) {
      return this.q;
    }
    return null;
  }
  
  public CharSequence getHint()
  {
    if (this.g) {
      return this.h;
    }
    return null;
  }
  
  public CharSequence getPasswordVisibilityToggleContentDescription()
  {
    return this.y;
  }
  
  public Drawable getPasswordVisibilityToggleDrawable()
  {
    return this.x;
  }
  
  public Typeface getTypeface()
  {
    return this.m;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((this.g) && (this.a != null))
    {
      Rect localRect = this.j;
      android.support.v4.widget.s.b(this, this.a, localRect);
      int i1 = localRect.left + this.a.getCompoundPaddingLeft();
      int i2 = localRect.right - this.a.getCompoundPaddingRight();
      this.d.a(i1, localRect.top + this.a.getCompoundPaddingTop(), i2, localRect.bottom - this.a.getCompoundPaddingBottom());
      this.d.b(i1, getPaddingTop(), i2, paramInt4 - paramInt2 - getPaddingBottom());
      this.d.i();
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    e();
    super.onMeasure(paramInt1, paramInt2);
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    SavedState localSavedState = (SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    setError(localSavedState.a);
    if (localSavedState.b) {
      b(true);
    }
    requestLayout();
  }
  
  public Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    if (this.p) {
      localSavedState.a = getError();
    }
    localSavedState.b = this.A;
    return localSavedState;
  }
  
  public void setCounterEnabled(boolean paramBoolean)
  {
    if (this.c != paramBoolean)
    {
      if (!paramBoolean) {
        break label151;
      }
      this.r = new AppCompatTextView(getContext());
      this.r.setId(a.f.textinput_counter);
      if (this.m != null) {
        this.r.setTypeface(this.m);
      }
      this.r.setMaxLines(1);
    }
    for (;;)
    {
      try
      {
        android.support.v4.widget.o.a(this.r, this.t);
        a(this.r, -1);
        if (this.a == null)
        {
          a(0);
          this.c = paramBoolean;
          return;
        }
      }
      catch (Exception localException)
      {
        android.support.v4.widget.o.a(this.r, android.support.v7.a.a.i.TextAppearance_AppCompat_Caption);
        this.r.setTextColor(android.support.v4.content.a.getColor(getContext(), a.c.error_color_material));
        continue;
        a(this.a.getText().length());
        continue;
      }
      label151:
      a(this.r);
      this.r = null;
    }
  }
  
  public void setCounterMaxLength(int paramInt)
  {
    if (this.s != paramInt)
    {
      if (paramInt <= 0) {
        break label39;
      }
      this.s = paramInt;
      if (this.c) {
        if (this.a != null) {
          break label47;
        }
      }
    }
    label39:
    label47:
    for (int i1 = 0;; i1 = this.a.getText().length())
    {
      a(i1);
      return;
      this.s = -1;
      break;
    }
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    a(this, paramBoolean);
    super.setEnabled(paramBoolean);
  }
  
  public void setError(CharSequence paramCharSequence)
  {
    if ((android.support.v4.view.s.x(this)) && (isEnabled()) && ((this.b == null) || (!TextUtils.equals(this.b.getText(), paramCharSequence)))) {}
    for (boolean bool = true;; bool = false)
    {
      a(paramCharSequence, bool);
      return;
    }
  }
  
  public void setErrorEnabled(boolean paramBoolean)
  {
    if (this.n != paramBoolean)
    {
      if (this.b != null) {
        this.b.animate().cancel();
      }
      if (!paramBoolean) {
        break label181;
      }
      this.b = new AppCompatTextView(getContext());
      this.b.setId(a.f.textinput_error);
      if (this.m != null) {
        this.b.setTypeface(this.m);
      }
    }
    for (;;)
    {
      try
      {
        android.support.v4.widget.o.a(this.b, this.o);
        if (Build.VERSION.SDK_INT < 23) {
          break label206;
        }
        int i2 = this.b.getTextColors().getDefaultColor();
        if (i2 != -65281) {
          break label206;
        }
        i1 = 1;
      }
      catch (Exception localException)
      {
        i1 = 1;
        continue;
      }
      if (i1 != 0)
      {
        android.support.v4.widget.o.a(this.b, android.support.v7.a.a.i.TextAppearance_AppCompat_Caption);
        this.b.setTextColor(android.support.v4.content.a.getColor(getContext(), a.c.error_color_material));
      }
      this.b.setVisibility(4);
      android.support.v4.view.s.b(this.b, 1);
      a(this.b, 0);
      this.n = paramBoolean;
      return;
      label181:
      this.p = false;
      c();
      a(this.b);
      this.b = null;
      continue;
      label206:
      int i1 = 0;
    }
  }
  
  public void setErrorTextAppearance(int paramInt)
  {
    this.o = paramInt;
    if (this.b != null) {
      android.support.v4.widget.o.a(this.b, paramInt);
    }
  }
  
  public void setHint(CharSequence paramCharSequence)
  {
    if (this.g)
    {
      setHintInternal(paramCharSequence);
      sendAccessibilityEvent(2048);
    }
  }
  
  public void setHintAnimationEnabled(boolean paramBoolean)
  {
    this.K = paramBoolean;
  }
  
  public void setHintEnabled(boolean paramBoolean)
  {
    CharSequence localCharSequence;
    if (paramBoolean != this.g)
    {
      this.g = paramBoolean;
      localCharSequence = this.a.getHint();
      if (this.g) {
        break label73;
      }
      if ((!TextUtils.isEmpty(this.h)) && (TextUtils.isEmpty(localCharSequence))) {
        this.a.setHint(this.h);
      }
      setHintInternal(null);
    }
    for (;;)
    {
      if (this.a != null) {
        a();
      }
      return;
      label73:
      if (!TextUtils.isEmpty(localCharSequence))
      {
        if (TextUtils.isEmpty(this.h)) {
          setHint(localCharSequence);
        }
        this.a.setHint(null);
      }
    }
  }
  
  public void setHintTextAppearance(int paramInt)
  {
    this.d.c(paramInt);
    this.I = this.d.k();
    if (this.a != null)
    {
      a(false);
      a();
    }
  }
  
  public void setPasswordVisibilityToggleContentDescription(int paramInt)
  {
    if (paramInt != 0) {}
    for (CharSequence localCharSequence = getResources().getText(paramInt);; localCharSequence = null)
    {
      setPasswordVisibilityToggleContentDescription(localCharSequence);
      return;
    }
  }
  
  public void setPasswordVisibilityToggleContentDescription(CharSequence paramCharSequence)
  {
    this.y = paramCharSequence;
    if (this.z != null) {
      this.z.setContentDescription(paramCharSequence);
    }
  }
  
  public void setPasswordVisibilityToggleDrawable(int paramInt)
  {
    if (paramInt != 0) {}
    for (Drawable localDrawable = android.support.v7.c.a.b.b(getContext(), paramInt);; localDrawable = null)
    {
      setPasswordVisibilityToggleDrawable(localDrawable);
      return;
    }
  }
  
  public void setPasswordVisibilityToggleDrawable(Drawable paramDrawable)
  {
    this.x = paramDrawable;
    if (this.z != null) {
      this.z.setImageDrawable(paramDrawable);
    }
  }
  
  public void setPasswordVisibilityToggleEnabled(boolean paramBoolean)
  {
    if (this.w != paramBoolean)
    {
      this.w = paramBoolean;
      if ((!paramBoolean) && (this.A) && (this.a != null)) {
        this.a.setTransformationMethod(PasswordTransformationMethod.getInstance());
      }
      this.A = false;
      e();
    }
  }
  
  public void setPasswordVisibilityToggleTintList(ColorStateList paramColorStateList)
  {
    this.D = paramColorStateList;
    this.E = true;
    h();
  }
  
  public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode paramMode)
  {
    this.F = paramMode;
    this.G = true;
    h();
  }
  
  public void setTypeface(Typeface paramTypeface)
  {
    if (((this.m != null) && (!this.m.equals(paramTypeface))) || ((this.m == null) && (paramTypeface != null)))
    {
      this.m = paramTypeface;
      this.d.c(paramTypeface);
      if (this.r != null) {
        this.r.setTypeface(paramTypeface);
      }
      if (this.b != null) {
        this.b.setTypeface(paramTypeface);
      }
    }
  }
  
  static class SavedState
    extends AbsSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator()
    {
      public TextInputLayout.SavedState a(Parcel paramAnonymousParcel)
      {
        return new TextInputLayout.SavedState(paramAnonymousParcel, null);
      }
      
      public TextInputLayout.SavedState a(Parcel paramAnonymousParcel, ClassLoader paramAnonymousClassLoader)
      {
        return new TextInputLayout.SavedState(paramAnonymousParcel, paramAnonymousClassLoader);
      }
      
      public TextInputLayout.SavedState[] a(int paramAnonymousInt)
      {
        return new TextInputLayout.SavedState[paramAnonymousInt];
      }
    };
    CharSequence a;
    boolean b;
    
    SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super(paramClassLoader);
      this.a = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
      if (paramParcel.readInt() == 1) {}
      for (boolean bool = true;; bool = false)
      {
        this.b = bool;
        return;
      }
    }
    
    SavedState(Parcelable paramParcelable)
    {
      super();
    }
    
    public String toString()
    {
      return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.a + "}";
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      TextUtils.writeToParcel(this.a, paramParcel, paramInt);
      if (this.b) {}
      for (int i = 1;; i = 0)
      {
        paramParcel.writeInt(i);
        return;
      }
    }
  }
  
  private class a
    extends android.support.v4.view.a
  {
    a() {}
    
    public void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
      paramAccessibilityEvent.setClassName(TextInputLayout.class.getSimpleName());
    }
    
    public void onInitializeAccessibilityNodeInfo(View paramView, android.support.v4.view.a.b paramb)
    {
      super.onInitializeAccessibilityNodeInfo(paramView, paramb);
      paramb.b(TextInputLayout.class.getSimpleName());
      CharSequence localCharSequence1 = TextInputLayout.this.d.j();
      if (!TextUtils.isEmpty(localCharSequence1)) {
        paramb.c(localCharSequence1);
      }
      if (TextInputLayout.this.a != null) {
        paramb.d(TextInputLayout.this.a);
      }
      if (TextInputLayout.this.b != null) {}
      for (CharSequence localCharSequence2 = TextInputLayout.this.b.getText();; localCharSequence2 = null)
      {
        if (!TextUtils.isEmpty(localCharSequence2))
        {
          paramb.l(true);
          paramb.e(localCharSequence2);
        }
        return;
      }
    }
    
    public void onPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      super.onPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
      CharSequence localCharSequence = TextInputLayout.this.d.j();
      if (!TextUtils.isEmpty(localCharSequence)) {
        paramAccessibilityEvent.getText().add(localCharSequence);
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.design.widget.TextInputLayout
 * JD-Core Version:    0.7.0.1
 */