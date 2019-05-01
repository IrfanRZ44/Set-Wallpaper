package android.support.v7.app;

import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

class i
{
  private static Field a;
  private static boolean b;
  private static Class c;
  private static boolean d;
  private static Field e;
  private static boolean f;
  private static Field g;
  private static boolean h;
  
  static boolean a(Resources paramResources)
  {
    if (Build.VERSION.SDK_INT >= 24) {
      return d(paramResources);
    }
    if (Build.VERSION.SDK_INT >= 23) {
      return c(paramResources);
    }
    if (Build.VERSION.SDK_INT >= 21) {
      return b(paramResources);
    }
    return false;
  }
  
  private static boolean a(Object paramObject)
  {
    if (!d) {}
    try
    {
      c = Class.forName("android.content.res.ThemedResourceCache");
      d = true;
      if (c == null) {
        return false;
      }
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      for (;;)
      {
        Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", localClassNotFoundException);
      }
      if (!f) {}
      try
      {
        e = c.getDeclaredField("mUnthemedEntries");
        e.setAccessible(true);
        f = true;
        if (e == null) {
          return false;
        }
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        for (;;)
        {
          Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", localNoSuchFieldException);
        }
        try
        {
          localLongSparseArray = (LongSparseArray)e.get(paramObject);
          if (localLongSparseArray != null)
          {
            localLongSparseArray.clear();
            return true;
          }
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          for (;;)
          {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", localIllegalAccessException);
            LongSparseArray localLongSparseArray = null;
          }
        }
      }
    }
    return false;
  }
  
  private static boolean b(Resources paramResources)
  {
    if (!b) {}
    try
    {
      a = Resources.class.getDeclaredField("mDrawableCache");
      a.setAccessible(true);
      b = true;
      if (a == null) {}
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      try
      {
        localMap = (Map)a.get(paramResources);
        if (localMap != null)
        {
          localMap.clear();
          return true;
          localNoSuchFieldException = localNoSuchFieldException;
          Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", localNoSuchFieldException);
        }
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        for (;;)
        {
          Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", localIllegalAccessException);
          Map localMap = null;
        }
      }
    }
    return false;
  }
  
  private static boolean c(Resources paramResources)
  {
    boolean bool = true;
    if (!b) {}
    Object localObject1;
    try
    {
      a = Resources.class.getDeclaredField("mDrawableCache");
      a.setAccessible(true);
      b = bool;
      if (a == null) {}
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;)
      {
        try
        {
          Object localObject2 = a.get(paramResources);
          localObject1 = localObject2;
          if (localObject1 != null) {
            break;
          }
          return false;
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", localIllegalAccessException);
        }
        localNoSuchFieldException = localNoSuchFieldException;
        Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", localNoSuchFieldException);
        continue;
        localObject1 = null;
      }
      if (localObject1 == null) {
        break label96;
      }
    }
    if (a(localObject1)) {}
    for (;;)
    {
      return bool;
      label96:
      bool = false;
    }
  }
  
  private static boolean d(Resources paramResources)
  {
    bool = true;
    if (!h) {}
    do
    {
      try
      {
        g = Resources.class.getDeclaredField("mResourcesImpl");
        g.setAccessible(true);
        h = bool;
        if (g == null) {
          return false;
        }
      }
      catch (NoSuchFieldException localNoSuchFieldException2)
      {
        for (;;)
        {
          Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", localNoSuchFieldException2);
        }
      }
      try
      {
        Object localObject4 = g.get(paramResources);
        localObject1 = localObject4;
      }
      catch (IllegalAccessException localIllegalAccessException1)
      {
        try
        {
          a = localObject1.getClass().getDeclaredField("mDrawableCache");
          a.setAccessible(true);
          b = bool;
          if (a == null) {
            break label178;
          }
          try
          {
            Object localObject3 = a.get(localObject1);
            localObject2 = localObject3;
            if ((localObject2 == null) || (!a(localObject2))) {
              break label184;
            }
            return bool;
          }
          catch (IllegalAccessException localIllegalAccessException2)
          {
            Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", localIllegalAccessException2);
          }
          localIllegalAccessException1 = localIllegalAccessException1;
          Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", localIllegalAccessException1);
          Object localObject1 = null;
        }
        catch (NoSuchFieldException localNoSuchFieldException1)
        {
          for (;;)
          {
            Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", localNoSuchFieldException1);
            continue;
            Object localObject2 = null;
            continue;
            bool = false;
          }
        }
      }
    } while (localObject1 == null);
    if (b) {}
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.support.v7.app.i
 * JD-Core Version:    0.7.0.1
 */