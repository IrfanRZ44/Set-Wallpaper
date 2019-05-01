package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class m
{
  public static int a(Object... paramVarArgs)
  {
    return Arrays.hashCode(paramVarArgs);
  }
  
  public static a a(Object paramObject)
  {
    return new a(paramObject, null);
  }
  
  public static boolean a(Object paramObject1, Object paramObject2)
  {
    return (paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2)));
  }
  
  public static final class a
  {
    private final List<String> a;
    private final Object b;
    
    private a(Object paramObject)
    {
      this.b = n.a(paramObject);
      this.a = new ArrayList();
    }
    
    public final a a(String paramString, Object paramObject)
    {
      List localList = this.a;
      String str1 = (String)n.a(paramString);
      String str2 = String.valueOf(paramObject);
      localList.add(1 + String.valueOf(str1).length() + String.valueOf(str2).length() + str1 + "=" + str2);
      return this;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder(100).append(this.b.getClass().getSimpleName()).append('{');
      int i = this.a.size();
      for (int j = 0; j < i; j++)
      {
        localStringBuilder.append((String)this.a.get(j));
        if (j < i - 1) {
          localStringBuilder.append(", ");
        }
      }
      return '}';
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.m
 * JD-Core Version:    0.7.0.1
 */