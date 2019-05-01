package android.support.v4.content.a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.a.c;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

public final class b
{
  public static Typeface a(Context paramContext, int paramInt1, TypedValue paramTypedValue, int paramInt2, a parama)
  {
    if (paramContext.isRestricted()) {
      return null;
    }
    return a(paramContext, paramInt1, paramTypedValue, paramInt2, parama, null, true);
  }
  
  private static Typeface a(Context paramContext, int paramInt1, TypedValue paramTypedValue, int paramInt2, a parama, Handler paramHandler, boolean paramBoolean)
  {
    Resources localResources = paramContext.getResources();
    localResources.getValue(paramInt1, paramTypedValue, true);
    Typeface localTypeface = a(paramContext, localResources, paramTypedValue, paramInt1, paramInt2, parama, paramHandler, paramBoolean);
    if ((localTypeface == null) && (parama == null)) {
      throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(paramInt1) + " could not be retrieved.");
    }
    return localTypeface;
  }
  
  private static Typeface a(Context paramContext, Resources paramResources, TypedValue paramTypedValue, int paramInt1, int paramInt2, a parama, Handler paramHandler, boolean paramBoolean)
  {
    if (paramTypedValue.string == null) {
      throw new Resources.NotFoundException("Resource \"" + paramResources.getResourceName(paramInt1) + "\" (" + Integer.toHexString(paramInt1) + ") is not a Font: " + paramTypedValue);
    }
    String str = paramTypedValue.string.toString();
    Typeface localTypeface;
    if (!str.startsWith("res/"))
    {
      if (parama != null) {
        parama.a(-3, paramHandler);
      }
      localTypeface = null;
    }
    for (;;)
    {
      return localTypeface;
      localTypeface = c.a(paramResources, paramInt1, paramInt2);
      if (localTypeface != null)
      {
        if (parama != null)
        {
          parama.a(localTypeface, paramHandler);
          return localTypeface;
        }
      }
      else {
        try
        {
          if (str.toLowerCase().endsWith(".xml"))
          {
            a.a locala = a.a(paramResources.getXml(paramInt1), paramResources);
            if (locala == null)
            {
              Log.e("ResourcesCompat", "Failed to find font-family tag");
              if (parama != null) {
                parama.a(-3, paramHandler);
              }
            }
            else
            {
              return c.a(paramContext, locala, paramResources, paramInt1, paramInt2, parama, paramHandler, paramBoolean);
            }
          }
          else
          {
            localTypeface = c.a(paramContext, paramResources, paramInt1, str, paramInt2);
            if (parama == null) {
              continue;
            }
            if (localTypeface != null)
            {
              parama.a(localTypeface, paramHandler);
              return localTypeface;
            }
          }
        }
        catch (XmlPullParserException localXmlPullParserException)
        {
          Log.e("ResourcesCompat", "Failed to parse xml resource " + str, localXmlPullParserException);
          if (parama != null) {
            parama.a(-3, paramHandler);
          }
          return null;
          parama.a(-3, paramHandler);
          return localTypeface;
        }
        catch (IOException localIOException)
        {
          for (;;)
          {
            Log.e("ResourcesCompat", "Failed to read xml resource " + str, localIOException);
          }
        }
      }
    }
    return null;
  }
  
  public static Drawable a(Resources paramResources, int paramInt, Resources.Theme paramTheme)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return paramResources.getDrawable(paramInt, paramTheme);
    }
    return paramResources.getDrawable(paramInt);
  }
  
  public static abstract class a
  {
    public abstract void a(int paramInt);
    
    public final void a(final int paramInt, Handler paramHandler)
    {
      if (paramHandler == null) {
        paramHandler = new Handler(Looper.getMainLooper());
      }
      paramHandler.post(new Runnable()
      {
        public void run()
        {
          b.a.this.a(paramInt);
        }
      });
    }
    
    public abstract void a(Typeface paramTypeface);
    
    public final void a(final Typeface paramTypeface, Handler paramHandler)
    {
      if (paramHandler == null) {
        paramHandler = new Handler(Looper.getMainLooper());
      }
      paramHandler.post(new Runnable()
      {
        public void run()
        {
          b.a.this.a(paramTypeface);
        }
      });
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.content.a.b
 * JD-Core Version:    0.7.0.1
 */