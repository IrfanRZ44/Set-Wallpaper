package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.support.v7.a.a.j;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.StaticLayout.Builder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

class k
{
  private static final RectF a = new RectF();
  private static ConcurrentHashMap<String, Method> b = new ConcurrentHashMap();
  private int c = 0;
  private boolean d = false;
  private float e = -1.0F;
  private float f = -1.0F;
  private float g = -1.0F;
  private int[] h = new int[0];
  private boolean i = false;
  private TextPaint j;
  private final TextView k;
  private final Context l;
  
  k(TextView paramTextView)
  {
    this.k = paramTextView;
    this.l = this.k.getContext();
  }
  
  private int a(RectF paramRectF)
  {
    int m = this.h.length;
    if (m == 0) {
      throw new IllegalStateException("No available text sizes to choose from.");
    }
    int n = 0;
    int i1 = 1;
    int i2 = m - 1;
    while (i1 <= i2)
    {
      int i3 = (i1 + i2) / 2;
      if (a(this.h[i3], paramRectF))
      {
        int i4 = i3 + 1;
        n = i1;
        i1 = i4;
      }
      else
      {
        i2 = i3 - 1;
        n = i2;
      }
    }
    return this.h[n];
  }
  
  private StaticLayout a(CharSequence paramCharSequence, Layout.Alignment paramAlignment, int paramInt)
  {
    float f1;
    float f2;
    if (Build.VERSION.SDK_INT >= 16)
    {
      f1 = this.k.getLineSpacingMultiplier();
      f2 = this.k.getLineSpacingExtra();
    }
    for (boolean bool = this.k.getIncludeFontPadding();; bool = ((Boolean)a(this.k, "getIncludeFontPadding", Boolean.valueOf(true))).booleanValue())
    {
      return new StaticLayout(paramCharSequence, this.j, paramInt, paramAlignment, f1, f2, bool);
      f1 = ((Float)a(this.k, "getLineSpacingMultiplier", Float.valueOf(1.0F))).floatValue();
      f2 = ((Float)a(this.k, "getLineSpacingExtra", Float.valueOf(0.0F))).floatValue();
    }
  }
  
  private StaticLayout a(CharSequence paramCharSequence, Layout.Alignment paramAlignment, int paramInt1, int paramInt2)
  {
    TextDirectionHeuristic localTextDirectionHeuristic = (TextDirectionHeuristic)a(this.k, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
    StaticLayout.Builder localBuilder = StaticLayout.Builder.obtain(paramCharSequence, 0, paramCharSequence.length(), this.j, paramInt1).setAlignment(paramAlignment).setLineSpacing(this.k.getLineSpacingExtra(), this.k.getLineSpacingMultiplier()).setIncludePad(this.k.getIncludeFontPadding()).setBreakStrategy(this.k.getBreakStrategy()).setHyphenationFrequency(this.k.getHyphenationFrequency());
    if (paramInt2 == -1) {
      paramInt2 = 2147483647;
    }
    return localBuilder.setMaxLines(paramInt2).setTextDirection(localTextDirectionHeuristic).build();
  }
  
  private <T> T a(Object paramObject, String paramString, T paramT)
  {
    m = 0;
    try
    {
      Object localObject2 = a(paramString).invoke(paramObject, new Object[0]);
      paramT = localObject2;
      if (paramT != null) {}
    }
    catch (Exception localException)
    {
      do
      {
        m = 1;
        Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + paramString + "() method", localException);
      } while (0 == 0);
      return null;
    }
    finally
    {
      if ((0 != 0) || (m == 0)) {
        break label81;
      }
    }
    return paramT;
  }
  
  private Method a(String paramString)
  {
    try
    {
      Method localMethod = (Method)b.get(paramString);
      if (localMethod == null)
      {
        localMethod = TextView.class.getDeclaredMethod(paramString, new Class[0]);
        if (localMethod != null)
        {
          localMethod.setAccessible(true);
          b.put(paramString, localMethod);
        }
      }
      return localMethod;
    }
    catch (Exception localException)
    {
      Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + paramString + "() method", localException);
    }
    return null;
  }
  
  private void a(float paramFloat)
  {
    if (paramFloat != this.k.getPaint().getTextSize())
    {
      this.k.getPaint().setTextSize(paramFloat);
      if (Build.VERSION.SDK_INT < 18) {
        break label128;
      }
    }
    label128:
    for (boolean bool = this.k.isInLayout();; bool = false)
    {
      if (this.k.getLayout() != null) {
        this.d = false;
      }
      try
      {
        Method localMethod = a("nullLayouts");
        if (localMethod != null) {
          localMethod.invoke(this.k, new Object[0]);
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", localException);
          continue;
          this.k.forceLayout();
        }
      }
      if (!bool)
      {
        this.k.requestLayout();
        this.k.invalidate();
        return;
      }
    }
  }
  
  private void a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (paramFloat1 <= 0.0F) {
      throw new IllegalArgumentException("Minimum auto-size text size (" + paramFloat1 + "px) is less or equal to (0px)");
    }
    if (paramFloat2 <= paramFloat1) {
      throw new IllegalArgumentException("Maximum auto-size text size (" + paramFloat2 + "px) is less or equal to minimum auto-size " + "text size (" + paramFloat1 + "px)");
    }
    if (paramFloat3 <= 0.0F) {
      throw new IllegalArgumentException("The auto-size step granularity (" + paramFloat3 + "px) is less or equal to (0px)");
    }
    this.c = 1;
    this.f = paramFloat1;
    this.g = paramFloat2;
    this.e = paramFloat3;
    this.i = false;
  }
  
  private void a(TypedArray paramTypedArray)
  {
    int m = paramTypedArray.length();
    int[] arrayOfInt = new int[m];
    if (m > 0)
    {
      for (int n = 0; n < m; n++) {
        arrayOfInt[n] = paramTypedArray.getDimensionPixelSize(n, -1);
      }
      this.h = a(arrayOfInt);
      h();
    }
  }
  
  private boolean a(int paramInt, RectF paramRectF)
  {
    Object localObject = this.k.getText();
    TransformationMethod localTransformationMethod = this.k.getTransformationMethod();
    if (localTransformationMethod != null)
    {
      CharSequence localCharSequence = localTransformationMethod.getTransformation((CharSequence)localObject, this.k);
      if (localCharSequence != null) {
        localObject = localCharSequence;
      }
    }
    int m;
    label79:
    Layout.Alignment localAlignment;
    if (Build.VERSION.SDK_INT >= 16)
    {
      m = this.k.getMaxLines();
      if (this.j != null) {
        break label192;
      }
      this.j = new TextPaint();
      this.j.set(this.k.getPaint());
      this.j.setTextSize(paramInt);
      localAlignment = (Layout.Alignment)a(this.k, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
      if (Build.VERSION.SDK_INT < 23) {
        break label202;
      }
    }
    label192:
    label202:
    for (StaticLayout localStaticLayout = a((CharSequence)localObject, localAlignment, Math.round(paramRectF.right), m);; localStaticLayout = a((CharSequence)localObject, localAlignment, Math.round(paramRectF.right)))
    {
      if ((m == -1) || ((localStaticLayout.getLineCount() <= m) && (localStaticLayout.getLineEnd(-1 + localStaticLayout.getLineCount()) == ((CharSequence)localObject).length()))) {
        break label221;
      }
      return false;
      m = -1;
      break;
      this.j.reset();
      break label79;
    }
    label221:
    return localStaticLayout.getHeight() <= paramRectF.bottom;
  }
  
  private int[] a(int[] paramArrayOfInt)
  {
    int m = paramArrayOfInt.length;
    if (m == 0) {}
    for (;;)
    {
      return paramArrayOfInt;
      Arrays.sort(paramArrayOfInt);
      ArrayList localArrayList = new ArrayList();
      for (int n = 0; n < m; n++)
      {
        int i3 = paramArrayOfInt[n];
        if ((i3 > 0) && (Collections.binarySearch(localArrayList, Integer.valueOf(i3)) < 0)) {
          localArrayList.add(Integer.valueOf(i3));
        }
      }
      if (m != localArrayList.size())
      {
        int i1 = localArrayList.size();
        paramArrayOfInt = new int[i1];
        for (int i2 = 0; i2 < i1; i2++) {
          paramArrayOfInt[i2] = ((Integer)localArrayList.get(i2)).intValue();
        }
      }
    }
  }
  
  private boolean h()
  {
    int m = this.h.length;
    if (m > 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.i = bool;
      if (this.i)
      {
        this.c = 1;
        this.f = this.h[0];
        this.g = this.h[(m - 1)];
        this.e = -1.0F;
      }
      return this.i;
    }
  }
  
  private boolean i()
  {
    if ((k()) && (this.c == 1)) {
      if ((!this.i) || (this.h.length == 0))
      {
        float f1 = Math.round(this.f);
        int m = 1;
        while (Math.round(f1 + this.e) <= Math.round(this.g))
        {
          m++;
          f1 += this.e;
        }
        int[] arrayOfInt = new int[m];
        float f2 = this.f;
        for (int n = 0; n < m; n++)
        {
          arrayOfInt[n] = Math.round(f2);
          f2 += this.e;
        }
        this.h = a(arrayOfInt);
      }
    }
    for (this.d = true;; this.d = false) {
      return this.d;
    }
  }
  
  private void j()
  {
    this.c = 0;
    this.f = -1.0F;
    this.g = -1.0F;
    this.e = -1.0F;
    this.h = new int[0];
    this.d = false;
  }
  
  private boolean k()
  {
    return !(this.k instanceof AppCompatEditText);
  }
  
  int a()
  {
    return this.c;
  }
  
  void a(int paramInt)
  {
    if (k()) {
      switch (paramInt)
      {
      default: 
        throw new IllegalArgumentException("Unknown auto-size text type: " + paramInt);
      case 0: 
        j();
      }
    }
    do
    {
      return;
      DisplayMetrics localDisplayMetrics = this.l.getResources().getDisplayMetrics();
      a(TypedValue.applyDimension(2, 12.0F, localDisplayMetrics), TypedValue.applyDimension(2, 112.0F, localDisplayMetrics), 1.0F);
    } while (!i());
    f();
  }
  
  void a(int paramInt, float paramFloat)
  {
    if (this.l == null) {}
    for (Resources localResources = Resources.getSystem();; localResources = this.l.getResources())
    {
      a(TypedValue.applyDimension(paramInt, paramFloat, localResources.getDisplayMetrics()));
      return;
    }
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (k())
    {
      DisplayMetrics localDisplayMetrics = this.l.getResources().getDisplayMetrics();
      a(TypedValue.applyDimension(paramInt4, paramInt1, localDisplayMetrics), TypedValue.applyDimension(paramInt4, paramInt2, localDisplayMetrics), TypedValue.applyDimension(paramInt4, paramInt3, localDisplayMetrics));
      if (i()) {
        f();
      }
    }
  }
  
  void a(AttributeSet paramAttributeSet, int paramInt)
  {
    TypedArray localTypedArray1 = this.l.obtainStyledAttributes(paramAttributeSet, a.j.AppCompatTextView, paramInt, 0);
    if (localTypedArray1.hasValue(a.j.AppCompatTextView_autoSizeTextType)) {
      this.c = localTypedArray1.getInt(a.j.AppCompatTextView_autoSizeTextType, 0);
    }
    if (localTypedArray1.hasValue(a.j.AppCompatTextView_autoSizeStepGranularity)) {}
    for (float f1 = localTypedArray1.getDimension(a.j.AppCompatTextView_autoSizeStepGranularity, -1.0F);; f1 = -1.0F)
    {
      if (localTypedArray1.hasValue(a.j.AppCompatTextView_autoSizeMinTextSize)) {}
      for (float f2 = localTypedArray1.getDimension(a.j.AppCompatTextView_autoSizeMinTextSize, -1.0F);; f2 = -1.0F)
      {
        if (localTypedArray1.hasValue(a.j.AppCompatTextView_autoSizeMaxTextSize)) {}
        for (float f3 = localTypedArray1.getDimension(a.j.AppCompatTextView_autoSizeMaxTextSize, -1.0F);; f3 = -1.0F)
        {
          if (localTypedArray1.hasValue(a.j.AppCompatTextView_autoSizePresetSizes))
          {
            int m = localTypedArray1.getResourceId(a.j.AppCompatTextView_autoSizePresetSizes, 0);
            if (m > 0)
            {
              TypedArray localTypedArray2 = localTypedArray1.getResources().obtainTypedArray(m);
              a(localTypedArray2);
              localTypedArray2.recycle();
            }
          }
          localTypedArray1.recycle();
          if (k())
          {
            if (this.c == 1)
            {
              if (!this.i)
              {
                DisplayMetrics localDisplayMetrics = this.l.getResources().getDisplayMetrics();
                if (f2 == -1.0F) {
                  f2 = TypedValue.applyDimension(2, 12.0F, localDisplayMetrics);
                }
                if (f3 == -1.0F) {
                  f3 = TypedValue.applyDimension(2, 112.0F, localDisplayMetrics);
                }
                if (f1 == -1.0F) {
                  f1 = 1.0F;
                }
                a(f2, f3, f1);
              }
              i();
            }
            return;
          }
          this.c = 0;
          return;
        }
      }
    }
  }
  
  void a(int[] paramArrayOfInt, int paramInt)
  {
    int m = 0;
    if (k())
    {
      int n = paramArrayOfInt.length;
      if (n > 0)
      {
        int[] arrayOfInt = new int[n];
        if (paramInt == 0) {
          arrayOfInt = Arrays.copyOf(paramArrayOfInt, n);
        }
        for (;;)
        {
          this.h = a(arrayOfInt);
          if (h()) {
            break;
          }
          throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(paramArrayOfInt));
          DisplayMetrics localDisplayMetrics = this.l.getResources().getDisplayMetrics();
          while (m < n)
          {
            arrayOfInt[m] = Math.round(TypedValue.applyDimension(paramInt, paramArrayOfInt[m], localDisplayMetrics));
            m++;
          }
        }
      }
      this.i = false;
      if (i()) {
        f();
      }
    }
  }
  
  int b()
  {
    return Math.round(this.e);
  }
  
  int c()
  {
    return Math.round(this.f);
  }
  
  int d()
  {
    return Math.round(this.g);
  }
  
  int[] e()
  {
    return this.h;
  }
  
  void f()
  {
    if (!g()) {}
    do
    {
      return;
      if (!this.d) {
        break;
      }
    } while ((this.k.getMeasuredHeight() <= 0) || (this.k.getMeasuredWidth() <= 0));
    int m;
    if (((Boolean)a(this.k, "getHorizontallyScrolling", Boolean.valueOf(false))).booleanValue()) {
      m = 1048576;
    }
    for (;;)
    {
      int n = this.k.getHeight() - this.k.getCompoundPaddingBottom() - this.k.getCompoundPaddingTop();
      if ((m <= 0) || (n <= 0)) {
        break;
      }
      synchronized (a)
      {
        a.setEmpty();
        a.right = m;
        a.bottom = n;
        float f1 = a(a);
        if (f1 != this.k.getTextSize()) {
          a(0, f1);
        }
        this.d = true;
        return;
        m = this.k.getMeasuredWidth() - this.k.getTotalPaddingLeft() - this.k.getTotalPaddingRight();
      }
    }
  }
  
  boolean g()
  {
    return (k()) && (this.c != 0);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.k
 * JD-Core Version:    0.7.0.1
 */