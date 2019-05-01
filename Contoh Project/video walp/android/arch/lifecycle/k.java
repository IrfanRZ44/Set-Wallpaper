package android.arch.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class k
{
  private static Map<Class, Integer> a = new HashMap();
  private static Map<Class, List<Constructor<? extends c>>> b = new HashMap();
  
  static GenericLifecycleObserver a(Object paramObject)
  {
    if ((paramObject instanceof FullLifecycleObserver)) {
      return new FullLifecycleObserverAdapter((FullLifecycleObserver)paramObject);
    }
    if ((paramObject instanceof GenericLifecycleObserver)) {
      return (GenericLifecycleObserver)paramObject;
    }
    Class localClass = paramObject.getClass();
    if (b(localClass) == 2)
    {
      List localList = (List)b.get(localClass);
      if (localList.size() == 1) {
        return new SingleGeneratedAdapterObserver(a((Constructor)localList.get(0), paramObject));
      }
      c[] arrayOfc = new c[localList.size()];
      for (int i = 0; i < localList.size(); i++) {
        arrayOfc[i] = a((Constructor)localList.get(i), paramObject);
      }
      return new CompositeGeneratedAdaptersObserver(arrayOfc);
    }
    return new ReflectiveGenericLifecycleObserver(paramObject);
  }
  
  private static c a(Constructor<? extends c> paramConstructor, Object paramObject)
  {
    try
    {
      c localc = (c)paramConstructor.newInstance(new Object[] { paramObject });
      return localc;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new RuntimeException(localIllegalAccessException);
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new RuntimeException(localInstantiationException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw new RuntimeException(localInvocationTargetException);
    }
  }
  
  public static String a(String paramString)
  {
    return paramString.replace(".", "_") + "_LifecycleAdapter";
  }
  
  private static Constructor<? extends c> a(Class<?> paramClass)
  {
    for (;;)
    {
      try
      {
        Package localPackage = paramClass.getPackage();
        String str1 = paramClass.getCanonicalName();
        if (localPackage != null)
        {
          str2 = localPackage.getName();
          Constructor localConstructor;
          if (str2.isEmpty())
          {
            localObject = a(str1);
            if (str2.isEmpty())
            {
              localConstructor = Class.forName((String)localObject).getDeclaredConstructor(new Class[] { paramClass });
              if (localConstructor.isAccessible()) {
                break label143;
              }
              localConstructor.setAccessible(true);
              return localConstructor;
            }
          }
          else
          {
            str1 = str1.substring(1 + str2.length());
            continue;
          }
          String str3 = str2 + "." + (String)localObject;
          Object localObject = str3;
          continue;
          return localConstructor;
        }
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        return null;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        throw new RuntimeException(localNoSuchMethodException);
      }
      label143:
      String str2 = "";
    }
  }
  
  private static int b(Class<?> paramClass)
  {
    if (a.containsKey(paramClass)) {
      return ((Integer)a.get(paramClass)).intValue();
    }
    int i = c(paramClass);
    a.put(paramClass, Integer.valueOf(i));
    return i;
  }
  
  private static int c(Class<?> paramClass)
  {
    if (paramClass.getCanonicalName() == null) {
      return 1;
    }
    Constructor localConstructor = a(paramClass);
    if (localConstructor != null)
    {
      b.put(paramClass, Collections.singletonList(localConstructor));
      return 2;
    }
    if (a.a.a(paramClass)) {
      return 1;
    }
    Class localClass1 = paramClass.getSuperclass();
    boolean bool = d(localClass1);
    Object localObject1 = null;
    if (bool)
    {
      if (b(localClass1) == 1) {
        return 1;
      }
      localObject1 = new ArrayList((Collection)b.get(localClass1));
    }
    Class[] arrayOfClass = paramClass.getInterfaces();
    int i = arrayOfClass.length;
    int j = 0;
    Class localClass2;
    while (j < i)
    {
      localClass2 = arrayOfClass[j];
      if (!d(localClass2))
      {
        j++;
      }
      else
      {
        if (b(localClass2) == 1) {
          return 1;
        }
        if (localObject1 != null) {
          break label210;
        }
      }
    }
    label210:
    for (Object localObject2 = new ArrayList();; localObject2 = localObject1)
    {
      ((List)localObject2).addAll((Collection)b.get(localClass2));
      localObject1 = localObject2;
      break;
      if (localObject1 != null)
      {
        b.put(paramClass, localObject1);
        return 2;
      }
      return 1;
    }
  }
  
  private static boolean d(Class<?> paramClass)
  {
    return (paramClass != null) && (g.class.isAssignableFrom(paramClass));
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.arch.lifecycle.k
 * JD-Core Version:    0.7.0.1
 */