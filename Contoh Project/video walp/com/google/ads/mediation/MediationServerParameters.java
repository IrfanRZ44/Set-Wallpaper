package com.google.ads.mediation;

import com.google.android.gms.internal.ads.mk;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

@Deprecated
public class MediationServerParameters
{
  public void load(Map<String, String> paramMap)
  {
    HashMap localHashMap = new HashMap();
    for (Field localField3 : getClass().getFields())
    {
      Parameter localParameter = (Parameter)localField3.getAnnotation(Parameter.class);
      if (localParameter != null) {
        localHashMap.put(localParameter.name(), localField3);
      }
    }
    if (localHashMap.isEmpty()) {
      mk.e("No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.");
    }
    Iterator localIterator1 = paramMap.entrySet().iterator();
    while (localIterator1.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator1.next();
      Field localField2 = (Field)localHashMap.remove(localEntry.getKey());
      if (localField2 != null)
      {
        try
        {
          localField2.set(this, localEntry.getValue());
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          String str8 = (String)localEntry.getKey();
          mk.e(49 + String.valueOf(str8).length() + "Server option \"" + str8 + "\" could not be set: Illegal Access");
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          String str7 = (String)localEntry.getKey();
          mk.e(43 + String.valueOf(str7).length() + "Server option \"" + str7 + "\" could not be set: Bad Type");
        }
      }
      else
      {
        String str5 = (String)localEntry.getKey();
        String str6 = (String)localEntry.getValue();
        mk.b(31 + String.valueOf(str5).length() + String.valueOf(str6).length() + "Unexpected server option: " + str5 + " = \"" + str6 + "\"");
      }
    }
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator2 = localHashMap.values().iterator();
    while (localIterator2.hasNext())
    {
      Field localField1 = (Field)localIterator2.next();
      if (((Parameter)localField1.getAnnotation(Parameter.class)).required())
      {
        String str3 = String.valueOf(((Parameter)localField1.getAnnotation(Parameter.class)).name());
        if (str3.length() != 0) {}
        for (String str4 = "Required server option missing: ".concat(str3);; str4 = new String("Required server option missing: "))
        {
          mk.e(str4);
          if (localStringBuilder.length() > 0) {
            localStringBuilder.append(", ");
          }
          localStringBuilder.append(((Parameter)localField1.getAnnotation(Parameter.class)).name());
          break;
        }
      }
    }
    if (localStringBuilder.length() > 0)
    {
      String str1 = String.valueOf(localStringBuilder.toString());
      if (str1.length() != 0) {}
      for (String str2 = "Required server option(s) missing: ".concat(str1);; str2 = new String("Required server option(s) missing: ")) {
        throw new MappingException(str2);
      }
    }
  }
  
  public static final class MappingException
    extends Exception
  {
    public MappingException(String paramString)
    {
      super();
    }
  }
  
  @Retention(RetentionPolicy.RUNTIME)
  @Target({java.lang.annotation.ElementType.FIELD})
  public static @interface Parameter
  {
    String name();
    
    boolean required() default true;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.mediation.MediationServerParameters
 * JD-Core Version:    0.7.0.1
 */