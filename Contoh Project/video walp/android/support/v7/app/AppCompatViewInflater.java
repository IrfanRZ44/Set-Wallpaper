package android.support.v7.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v4.f.a;
import android.support.v4.view.s;
import android.support.v7.a.a.j;
import android.support.v7.view.d;
import android.support.v7.widget.AppCompatAutoCompleteTextView;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.AppCompatCheckedTextView;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.AppCompatImageButton;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatMultiAutoCompleteTextView;
import android.support.v7.widget.AppCompatRadioButton;
import android.support.v7.widget.AppCompatRatingBar;
import android.support.v7.widget.AppCompatSeekBar;
import android.support.v7.widget.AppCompatSpinner;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.TintContextWrapper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

public class AppCompatViewInflater
{
  private static final Class<?>[] a = { Context.class, AttributeSet.class };
  private static final int[] b = { 16843375 };
  private static final String[] c = { "android.widget.", "android.view.", "android.webkit." };
  private static final Map<String, Constructor<? extends View>> d = new a();
  private final Object[] e = new Object[2];
  
  private static Context a(Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean1, boolean paramBoolean2)
  {
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, a.j.View, 0, 0);
    if (paramBoolean1) {}
    for (int i = localTypedArray.getResourceId(a.j.View_android_theme, 0);; i = 0)
    {
      if ((paramBoolean2) && (i == 0))
      {
        i = localTypedArray.getResourceId(a.j.View_theme, 0);
        if (i != 0) {
          Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
      }
      int j = i;
      localTypedArray.recycle();
      if ((j != 0) && ((!(paramContext instanceof d)) || (((d)paramContext).a() != j))) {
        paramContext = new d(paramContext, j);
      }
      return paramContext;
    }
  }
  
  private View a(Context paramContext, String paramString1, String paramString2)
  {
    Constructor localConstructor = (Constructor)d.get(paramString1);
    if (localConstructor == null) {}
    try
    {
      ClassLoader localClassLoader = paramContext.getClassLoader();
      if (paramString2 != null) {}
      for (String str = paramString2 + paramString1;; str = paramString1)
      {
        localConstructor = localClassLoader.loadClass(str).asSubclass(View.class).getConstructor(a);
        d.put(paramString1, localConstructor);
        localConstructor.setAccessible(true);
        View localView = (View)localConstructor.newInstance(this.e);
        return localView;
      }
      return null;
    }
    catch (Exception localException) {}
  }
  
  private void a(View paramView, AttributeSet paramAttributeSet)
  {
    Context localContext = paramView.getContext();
    if ((!(localContext instanceof ContextWrapper)) || ((Build.VERSION.SDK_INT >= 15) && (!s.B(paramView)))) {
      return;
    }
    TypedArray localTypedArray = localContext.obtainStyledAttributes(paramAttributeSet, b);
    String str = localTypedArray.getString(0);
    if (str != null) {
      paramView.setOnClickListener(new a(paramView, str));
    }
    localTypedArray.recycle();
  }
  
  private void a(View paramView, String paramString)
  {
    if (paramView == null) {
      throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + paramString + ">, but returned null");
    }
  }
  
  private View b(Context paramContext, String paramString, AttributeSet paramAttributeSet)
  {
    if (paramString.equals("view")) {
      paramString = paramAttributeSet.getAttributeValue(null, "class");
    }
    try
    {
      this.e[0] = paramContext;
      this.e[1] = paramAttributeSet;
      if (-1 == paramString.indexOf('.'))
      {
        for (int i = 0; i < c.length; i++)
        {
          View localView1 = a(paramContext, paramString, c[i]);
          if (localView1 != null) {
            return localView1;
          }
        }
        return null;
      }
      View localView2 = a(paramContext, paramString, null);
      return localView2;
    }
    catch (Exception localException)
    {
      return null;
    }
    finally
    {
      this.e[0] = null;
      this.e[1] = null;
    }
  }
  
  protected AppCompatTextView a(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new AppCompatTextView(paramContext, paramAttributeSet);
  }
  
  protected View a(Context paramContext, String paramString, AttributeSet paramAttributeSet)
  {
    return null;
  }
  
  final View a(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    if ((paramBoolean1) && (paramView != null)) {}
    for (Context localContext = paramView.getContext();; localContext = paramContext)
    {
      if ((paramBoolean2) || (paramBoolean3)) {
        localContext = a(localContext, paramAttributeSet, paramBoolean2, paramBoolean3);
      }
      if (paramBoolean4) {
        localContext = TintContextWrapper.wrap(localContext);
      }
      int i = -1;
      Object localObject1;
      switch (paramString.hashCode())
      {
      default: 
        switch (i)
        {
        default: 
          localObject1 = a(localContext, paramString, paramAttributeSet);
          label251:
          if ((localObject1 != null) || (paramContext == localContext)) {}
          break;
        }
        break;
      }
      for (Object localObject2 = b(localContext, paramString, paramAttributeSet);; localObject2 = localObject1)
      {
        if (localObject2 != null) {
          a((View)localObject2, paramAttributeSet);
        }
        return localObject2;
        if (!paramString.equals("TextView")) {
          break;
        }
        i = 0;
        break;
        if (!paramString.equals("ImageView")) {
          break;
        }
        i = 1;
        break;
        if (!paramString.equals("Button")) {
          break;
        }
        i = 2;
        break;
        if (!paramString.equals("EditText")) {
          break;
        }
        i = 3;
        break;
        if (!paramString.equals("Spinner")) {
          break;
        }
        i = 4;
        break;
        if (!paramString.equals("ImageButton")) {
          break;
        }
        i = 5;
        break;
        if (!paramString.equals("CheckBox")) {
          break;
        }
        i = 6;
        break;
        if (!paramString.equals("RadioButton")) {
          break;
        }
        i = 7;
        break;
        if (!paramString.equals("CheckedTextView")) {
          break;
        }
        i = 8;
        break;
        if (!paramString.equals("AutoCompleteTextView")) {
          break;
        }
        i = 9;
        break;
        if (!paramString.equals("MultiAutoCompleteTextView")) {
          break;
        }
        i = 10;
        break;
        if (!paramString.equals("RatingBar")) {
          break;
        }
        i = 11;
        break;
        if (!paramString.equals("SeekBar")) {
          break;
        }
        i = 12;
        break;
        localObject1 = a(localContext, paramAttributeSet);
        a((View)localObject1, paramString);
        break label251;
        localObject1 = b(localContext, paramAttributeSet);
        a((View)localObject1, paramString);
        break label251;
        localObject1 = c(localContext, paramAttributeSet);
        a((View)localObject1, paramString);
        break label251;
        localObject1 = d(localContext, paramAttributeSet);
        a((View)localObject1, paramString);
        break label251;
        localObject1 = e(localContext, paramAttributeSet);
        a((View)localObject1, paramString);
        break label251;
        localObject1 = f(localContext, paramAttributeSet);
        a((View)localObject1, paramString);
        break label251;
        localObject1 = g(localContext, paramAttributeSet);
        a((View)localObject1, paramString);
        break label251;
        localObject1 = h(localContext, paramAttributeSet);
        a((View)localObject1, paramString);
        break label251;
        localObject1 = i(localContext, paramAttributeSet);
        a((View)localObject1, paramString);
        break label251;
        localObject1 = j(localContext, paramAttributeSet);
        a((View)localObject1, paramString);
        break label251;
        localObject1 = k(localContext, paramAttributeSet);
        a((View)localObject1, paramString);
        break label251;
        localObject1 = l(localContext, paramAttributeSet);
        a((View)localObject1, paramString);
        break label251;
        localObject1 = m(localContext, paramAttributeSet);
        a((View)localObject1, paramString);
        break label251;
      }
    }
  }
  
  protected AppCompatImageView b(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new AppCompatImageView(paramContext, paramAttributeSet);
  }
  
  protected AppCompatButton c(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new AppCompatButton(paramContext, paramAttributeSet);
  }
  
  protected AppCompatEditText d(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new AppCompatEditText(paramContext, paramAttributeSet);
  }
  
  protected AppCompatSpinner e(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new AppCompatSpinner(paramContext, paramAttributeSet);
  }
  
  protected AppCompatImageButton f(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new AppCompatImageButton(paramContext, paramAttributeSet);
  }
  
  protected AppCompatCheckBox g(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new AppCompatCheckBox(paramContext, paramAttributeSet);
  }
  
  protected AppCompatRadioButton h(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new AppCompatRadioButton(paramContext, paramAttributeSet);
  }
  
  protected AppCompatCheckedTextView i(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new AppCompatCheckedTextView(paramContext, paramAttributeSet);
  }
  
  protected AppCompatAutoCompleteTextView j(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new AppCompatAutoCompleteTextView(paramContext, paramAttributeSet);
  }
  
  protected AppCompatMultiAutoCompleteTextView k(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new AppCompatMultiAutoCompleteTextView(paramContext, paramAttributeSet);
  }
  
  protected AppCompatRatingBar l(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new AppCompatRatingBar(paramContext, paramAttributeSet);
  }
  
  protected AppCompatSeekBar m(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new AppCompatSeekBar(paramContext, paramAttributeSet);
  }
  
  private static class a
    implements View.OnClickListener
  {
    private final View a;
    private final String b;
    private Method c;
    private Context d;
    
    public a(View paramView, String paramString)
    {
      this.a = paramView;
      this.b = paramString;
    }
    
    private void a(Context paramContext, String paramString)
    {
      Context localContext = paramContext;
      while (localContext != null) {
        try
        {
          if (!localContext.isRestricted())
          {
            Method localMethod = localContext.getClass().getMethod(this.b, new Class[] { View.class });
            if (localMethod != null)
            {
              this.c = localMethod;
              this.d = localContext;
              return;
            }
          }
        }
        catch (NoSuchMethodException localNoSuchMethodException)
        {
          if ((localContext instanceof ContextWrapper)) {
            localContext = ((ContextWrapper)localContext).getBaseContext();
          } else {
            localContext = null;
          }
        }
      }
      int i = this.a.getId();
      if (i == -1) {}
      for (String str = "";; str = " with id '" + this.a.getContext().getResources().getResourceEntryName(i) + "'") {
        throw new IllegalStateException("Could not find method " + this.b + "(View) in a parent or ancestor Context for android:onClick " + "attribute defined on view " + this.a.getClass() + str);
      }
    }
    
    public void onClick(View paramView)
    {
      if (this.c == null) {
        a(this.a.getContext(), this.b);
      }
      try
      {
        this.c.invoke(this.d, new Object[] { paramView });
        return;
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        throw new IllegalStateException("Could not execute non-public method for android:onClick", localIllegalAccessException);
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        throw new IllegalStateException("Could not execute method for android:onClick", localInvocationTargetException);
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.app.AppCompatViewInflater
 * JD-Core Version:    0.7.0.1
 */