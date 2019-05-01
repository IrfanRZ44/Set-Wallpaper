package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public final class asn
{
  private boolean a;
  private final List<asl> b = new LinkedList();
  private final Map<String, String> c = new LinkedHashMap();
  private final Object d = new Object();
  private String e;
  private asn f;
  
  public asn(boolean paramBoolean, String paramString1, String paramString2)
  {
    this.a = paramBoolean;
    this.c.put("action", paramString1);
    this.c.put("ad_format", paramString2);
  }
  
  public final asl a()
  {
    return a(zzbv.zzer().b());
  }
  
  public final asl a(long paramLong)
  {
    if (!this.a) {
      return null;
    }
    return new asl(paramLong, null, null);
  }
  
  public final void a(asn paramasn)
  {
    synchronized (this.d)
    {
      this.f = paramasn;
      return;
    }
  }
  
  public final void a(String paramString)
  {
    if (!this.a) {
      return;
    }
    synchronized (this.d)
    {
      this.e = paramString;
      return;
    }
  }
  
  public final void a(String paramString1, String paramString2)
  {
    if ((!this.a) || (TextUtils.isEmpty(paramString2))) {}
    asd localasd;
    do
    {
      return;
      localasd = zzbv.zzeo().b();
    } while (localasd == null);
    synchronized (this.d)
    {
      ash localash = localasd.a(paramString1);
      Map localMap = this.c;
      localMap.put(paramString1, localash.a((String)localMap.get(paramString1), paramString2));
      return;
    }
  }
  
  public final boolean a(asl paramasl, long paramLong, String... paramVarArgs)
  {
    synchronized (this.d)
    {
      int i = paramVarArgs.length;
      for (int j = 0; j < i; j++)
      {
        asl localasl = new asl(paramLong, paramVarArgs[j], paramasl);
        this.b.add(localasl);
      }
      return true;
    }
  }
  
  public final boolean a(asl paramasl, String... paramVarArgs)
  {
    if ((!this.a) || (paramasl == null)) {
      return false;
    }
    return a(paramasl, zzbv.zzer().b(), paramVarArgs);
  }
  
  public final String b()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    synchronized (this.d)
    {
      Iterator localIterator = this.b.iterator();
      while (localIterator.hasNext())
      {
        asl localasl1 = (asl)localIterator.next();
        long l1 = localasl1.a();
        String str2 = localasl1.b();
        asl localasl2 = localasl1.c();
        if ((localasl2 != null) && (l1 > 0L))
        {
          long l2 = l1 - localasl2.a();
          localStringBuilder.append(str2).append('.').append(l2).append(',');
        }
      }
    }
    this.b.clear();
    if (!TextUtils.isEmpty(this.e)) {
      localStringBuilder.append(this.e);
    }
    for (;;)
    {
      String str1 = localStringBuilder.toString();
      return str1;
      if (localStringBuilder.length() > 0) {
        localStringBuilder.setLength(-1 + localStringBuilder.length());
      }
    }
  }
  
  final Map<String, String> c()
  {
    synchronized (this.d)
    {
      asd localasd = zzbv.zzeo().b();
      if ((localasd == null) || (this.f == null))
      {
        Map localMap1 = this.c;
        return localMap1;
      }
      Map localMap2 = localasd.a(this.c, this.f.c());
      return localMap2;
    }
  }
  
  public final asl d()
  {
    synchronized (this.d)
    {
      return null;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.asn
 * JD-Core Version:    0.7.0.1
 */