package android.support.v4.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.support.v4.content.a.a.b;
import android.support.v4.content.a.a.c;
import android.support.v4.d.b.b;
import android.support.v4.f.m;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

class e
  extends g
{
  private static final Class a;
  private static final Constructor b;
  private static final Method c;
  private static final Method d;
  
  static
  {
    try
    {
      Class localClass2 = Class.forName("android.graphics.FontFamily");
      Constructor localConstructor2 = localClass2.getConstructor(new Class[0]);
      Class[] arrayOfClass1 = new Class[5];
      arrayOfClass1[0] = ByteBuffer.class;
      arrayOfClass1[1] = Integer.TYPE;
      arrayOfClass1[2] = List.class;
      arrayOfClass1[3] = Integer.TYPE;
      arrayOfClass1[4] = Boolean.TYPE;
      Method localMethod3 = localClass2.getMethod("addFontWeightStyle", arrayOfClass1);
      Object localObject = Array.newInstance(localClass2, 1);
      Class[] arrayOfClass2 = new Class[1];
      arrayOfClass2[0] = localObject.getClass();
      Method localMethod4 = Typeface.class.getMethod("createFromFamiliesWithDefault", arrayOfClass2);
      localMethod1 = localMethod4;
      localMethod2 = localMethod3;
      localConstructor1 = localConstructor2;
      localClass1 = localClass2;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      for (;;)
      {
        Log.e("TypefaceCompatApi24Impl", localClassNotFoundException.getClass().getName(), localClassNotFoundException);
        Method localMethod1 = null;
        Method localMethod2 = null;
        Constructor localConstructor1 = null;
        Class localClass1 = null;
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      label136:
      break label136;
    }
    b = localConstructor1;
    a = localClass1;
    c = localMethod2;
    d = localMethod1;
  }
  
  private static Typeface a(Object paramObject)
  {
    try
    {
      Object localObject = Array.newInstance(a, 1);
      Array.set(localObject, 0, paramObject);
      Typeface localTypeface = (Typeface)d.invoke(null, new Object[] { localObject });
      return localTypeface;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new RuntimeException(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      label36:
      break label36;
    }
  }
  
  public static boolean a()
  {
    if (c == null) {
      Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
    }
    return c != null;
  }
  
  private static boolean a(Object paramObject, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    try
    {
      Method localMethod = c;
      Object[] arrayOfObject = new Object[5];
      arrayOfObject[0] = paramByteBuffer;
      arrayOfObject[1] = Integer.valueOf(paramInt1);
      arrayOfObject[2] = null;
      arrayOfObject[3] = Integer.valueOf(paramInt2);
      arrayOfObject[4] = Boolean.valueOf(paramBoolean);
      boolean bool = ((Boolean)localMethod.invoke(paramObject, arrayOfObject)).booleanValue();
      return bool;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new RuntimeException(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      label67:
      break label67;
    }
  }
  
  private static Object b()
  {
    try
    {
      Object localObject = b.newInstance(new Object[0]);
      return localObject;
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new RuntimeException(localInstantiationException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      break label14;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      label14:
      break label14;
    }
  }
  
  public Typeface a(Context paramContext, CancellationSignal paramCancellationSignal, b.b[] paramArrayOfb, int paramInt)
  {
    Object localObject = b();
    m localm = new m();
    int i = paramArrayOfb.length;
    for (int j = 0; j < i; j++)
    {
      b.b localb = paramArrayOfb[j];
      Uri localUri = localb.a();
      ByteBuffer localByteBuffer = (ByteBuffer)localm.get(localUri);
      if (localByteBuffer == null)
      {
        localByteBuffer = h.a(paramContext, paramCancellationSignal, localUri);
        localm.put(localUri, localByteBuffer);
      }
      if (!a(localObject, localByteBuffer, localb.b(), localb.c(), localb.d())) {
        return null;
      }
    }
    return Typeface.create(a(localObject), paramInt);
  }
  
  public Typeface a(Context paramContext, a.b paramb, Resources paramResources, int paramInt)
  {
    Object localObject = b();
    for (a.c localc : paramb.a())
    {
      ByteBuffer localByteBuffer = h.a(paramContext, paramResources, localc.d());
      if (localByteBuffer == null) {}
      while (!a(localObject, localByteBuffer, 0, localc.b(), localc.c())) {
        return null;
      }
    }
    return a(localObject);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.a.e
 * JD-Core Version:    0.7.0.1
 */