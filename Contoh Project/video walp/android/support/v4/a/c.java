package android.support.v4.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.os.Handler;
import android.support.v4.content.a.a.a;
import android.support.v4.content.a.a.b;
import android.support.v4.content.a.a.d;
import android.support.v4.content.a.b.a;
import android.support.v4.d.b;
import android.support.v4.d.b.b;

public class c
{
  private static final a a;
  private static final android.support.v4.f.g<String, Typeface> b;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 26) {
      a = new f();
    }
    for (;;)
    {
      b = new android.support.v4.f.g(16);
      return;
      if ((Build.VERSION.SDK_INT >= 24) && (e.a())) {
        a = new e();
      } else if (Build.VERSION.SDK_INT >= 21) {
        a = new d();
      } else {
        a = new g();
      }
    }
  }
  
  public static Typeface a(Context paramContext, Resources paramResources, int paramInt1, String paramString, int paramInt2)
  {
    Typeface localTypeface = a.a(paramContext, paramResources, paramInt1, paramString, paramInt2);
    if (localTypeface != null)
    {
      String str = b(paramResources, paramInt1, paramInt2);
      b.a(str, localTypeface);
    }
    return localTypeface;
  }
  
  public static Typeface a(Context paramContext, CancellationSignal paramCancellationSignal, b.b[] paramArrayOfb, int paramInt)
  {
    return a.a(paramContext, paramCancellationSignal, paramArrayOfb, paramInt);
  }
  
  public static Typeface a(Context paramContext, a.a parama, Resources paramResources, int paramInt1, int paramInt2, b.a parama1, Handler paramHandler, boolean paramBoolean)
  {
    boolean bool = true;
    int i;
    label41:
    Typeface localTypeface;
    if ((parama instanceof a.d))
    {
      a.d locald = (a.d)parama;
      if (paramBoolean) {
        if (locald.b() == 0)
        {
          if (!paramBoolean) {
            break label103;
          }
          i = locald.c();
          localTypeface = b.a(paramContext, locald.a(), parama1, paramHandler, bool, i, paramInt2);
        }
      }
    }
    for (;;)
    {
      if (localTypeface != null) {
        b.a(b(paramResources, paramInt1, paramInt2), localTypeface);
      }
      return localTypeface;
      bool = false;
      break;
      if (parama1 == null) {
        break;
      }
      bool = false;
      break;
      label103:
      i = -1;
      break label41;
      localTypeface = a.a(paramContext, (a.b)parama, paramResources, paramInt2);
      if (parama1 != null) {
        if (localTypeface != null) {
          parama1.a(localTypeface, paramHandler);
        } else {
          parama1.a(-3, paramHandler);
        }
      }
    }
  }
  
  public static Typeface a(Resources paramResources, int paramInt1, int paramInt2)
  {
    return (Typeface)b.a(b(paramResources, paramInt1, paramInt2));
  }
  
  private static String b(Resources paramResources, int paramInt1, int paramInt2)
  {
    return paramResources.getResourcePackageName(paramInt1) + "-" + paramInt1 + "-" + paramInt2;
  }
  
  static abstract interface a
  {
    public abstract Typeface a(Context paramContext, Resources paramResources, int paramInt1, String paramString, int paramInt2);
    
    public abstract Typeface a(Context paramContext, CancellationSignal paramCancellationSignal, b.b[] paramArrayOfb, int paramInt);
    
    public abstract Typeface a(Context paramContext, a.b paramb, Resources paramResources, int paramInt);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.a.c
 * JD-Core Version:    0.7.0.1
 */