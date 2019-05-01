package com.a.a.e;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@Deprecated
public final class e
{
  private final Context a;
  
  public e(Context paramContext)
  {
    this.a = paramContext;
  }
  
  private static c a(String paramString)
  {
    Class localClass;
    Object localObject1;
    try
    {
      localClass = Class.forName(paramString);
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      Object localObject2;
      label26:
      throw new IllegalArgumentException("Unable to find GlideModule implementation", localClassNotFoundException);
    }
    try
    {
      localObject2 = localClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
      localObject1 = localObject2;
    }
    catch (InstantiationException localInstantiationException)
    {
      a(localClass, localInstantiationException);
      localObject1 = null;
      break label26;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      a(localClass, localIllegalAccessException);
      localObject1 = null;
      break label26;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      a(localClass, localNoSuchMethodException);
      localObject1 = null;
      break label26;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      a(localClass, localInvocationTargetException);
      localObject1 = null;
      break label26;
    }
    if (!(localObject1 instanceof c)) {
      throw new RuntimeException("Expected instanceof GlideModule, but found: " + localObject1);
    }
    return (c)localObject1;
  }
  
  private static void a(Class<?> paramClass, Exception paramException)
  {
    throw new RuntimeException("Unable to instantiate GlideModule implementation for " + paramClass, paramException);
  }
  
  public List<c> a()
  {
    if (Log.isLoggable("ManifestParser", 3)) {
      Log.d("ManifestParser", "Loading Glide modules");
    }
    ArrayList localArrayList = new ArrayList();
    try
    {
      ApplicationInfo localApplicationInfo = this.a.getPackageManager().getApplicationInfo(this.a.getPackageName(), 128);
      if (localApplicationInfo.metaData == null)
      {
        if (!Log.isLoggable("ManifestParser", 3)) {
          return localArrayList;
        }
        Log.d("ManifestParser", "Got null app info metadata");
        return localArrayList;
      }
      if (Log.isLoggable("ManifestParser", 2)) {
        Log.v("ManifestParser", "Got app info metadata: " + localApplicationInfo.metaData);
      }
      Iterator localIterator = localApplicationInfo.metaData.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if ("GlideModule".equals(localApplicationInfo.metaData.get(str)))
        {
          localArrayList.add(a(str));
          if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loaded Glide module: " + str);
          }
        }
      }
      if (!Log.isLoggable("ManifestParser", 3)) {
        break label242;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      throw new RuntimeException("Unable to find metadata to parse GlideModules", localNameNotFoundException);
    }
    Log.d("ManifestParser", "Finished loading Glide modules");
    label242:
    return localArrayList;
    return localArrayList;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.e.e
 * JD-Core Version:    0.7.0.1
 */