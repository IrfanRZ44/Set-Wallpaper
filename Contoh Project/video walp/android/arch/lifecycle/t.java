package android.arch.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class t
{
  private final b a;
  private final v b;
  
  public t(v paramv, b paramb)
  {
    this.a = paramb;
    this.b = paramv;
  }
  
  public <T extends s> T a(Class<T> paramClass)
  {
    String str = paramClass.getCanonicalName();
    if (str == null) {
      throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
    return a("android.arch.lifecycle.ViewModelProvider.DefaultKey:" + str, paramClass);
  }
  
  public <T extends s> T a(String paramString, Class<T> paramClass)
  {
    s locals1 = this.b.a(paramString);
    if (paramClass.isInstance(locals1)) {
      return locals1;
    }
    if (locals1 != null) {}
    s locals2 = this.a.create(paramClass);
    this.b.a(paramString, locals2);
    return locals2;
  }
  
  public static class a
    extends t.c
  {
    private static a a;
    private Application b;
    
    public a(Application paramApplication)
    {
      this.b = paramApplication;
    }
    
    public static a a(Application paramApplication)
    {
      if (a == null) {
        a = new a(paramApplication);
      }
      return a;
    }
    
    public <T extends s> T create(Class<T> paramClass)
    {
      if (AndroidViewModel.class.isAssignableFrom(paramClass)) {
        try
        {
          Constructor localConstructor = paramClass.getConstructor(new Class[] { Application.class });
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = this.b;
          s locals = (s)localConstructor.newInstance(arrayOfObject);
          return locals;
        }
        catch (NoSuchMethodException localNoSuchMethodException)
        {
          throw new RuntimeException("Cannot create an instance of " + paramClass, localNoSuchMethodException);
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          throw new RuntimeException("Cannot create an instance of " + paramClass, localIllegalAccessException);
        }
        catch (InstantiationException localInstantiationException)
        {
          throw new RuntimeException("Cannot create an instance of " + paramClass, localInstantiationException);
        }
        catch (InvocationTargetException localInvocationTargetException)
        {
          throw new RuntimeException("Cannot create an instance of " + paramClass, localInvocationTargetException);
        }
      }
      return super.create(paramClass);
    }
  }
  
  public static abstract interface b
  {
    public abstract <T extends s> T create(Class<T> paramClass);
  }
  
  public static class c
    implements t.b
  {
    public <T extends s> T create(Class<T> paramClass)
    {
      try
      {
        s locals = (s)paramClass.newInstance();
        return locals;
      }
      catch (InstantiationException localInstantiationException)
      {
        throw new RuntimeException("Cannot create an instance of " + paramClass, localInstantiationException);
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        throw new RuntimeException("Cannot create an instance of " + paramClass, localIllegalAccessException);
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     android.arch.lifecycle.t
 * JD-Core Version:    0.7.0.1
 */