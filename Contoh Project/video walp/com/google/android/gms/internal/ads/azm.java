package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.gmsg.zzv;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public abstract class azm<ReferenceT>
{
  private final Map<String, CopyOnWriteArrayList<zzv<? super ReferenceT>>> a = new HashMap();
  
  private final void a(String paramString, Map<String, String> paramMap)
  {
    for (;;)
    {
      try
      {
        if (!je.a(2)) {
          break;
        }
        String str1 = String.valueOf(paramString);
        if (str1.length() != 0)
        {
          str2 = "Received GMSG: ".concat(str1);
          je.a(str2);
          Iterator localIterator2 = paramMap.keySet().iterator();
          if (!localIterator2.hasNext()) {
            break;
          }
          String str3 = (String)localIterator2.next();
          String str4 = (String)paramMap.get(str3);
          je.a(4 + String.valueOf(str3).length() + String.valueOf(str4).length() + "  " + str3 + ": " + str4);
          continue;
        }
        String str2 = new String("Received GMSG: ");
      }
      finally {}
    }
    CopyOnWriteArrayList localCopyOnWriteArrayList = (CopyOnWriteArrayList)this.a.get(paramString);
    if (localCopyOnWriteArrayList != null)
    {
      Iterator localIterator1 = localCopyOnWriteArrayList.iterator();
      while (localIterator1.hasNext())
      {
        zzv localzzv = (zzv)localIterator1.next();
        nk.a.execute(new azn(this, localzzv, paramMap));
      }
    }
  }
  
  public final void a(String paramString, zzv<? super ReferenceT> paramzzv)
  {
    try
    {
      CopyOnWriteArrayList localCopyOnWriteArrayList = (CopyOnWriteArrayList)this.a.get(paramString);
      if (localCopyOnWriteArrayList == null)
      {
        localCopyOnWriteArrayList = new CopyOnWriteArrayList();
        this.a.put(paramString, localCopyOnWriteArrayList);
      }
      localCopyOnWriteArrayList.add(paramzzv);
      return;
    }
    finally {}
  }
  
  public final void a(String paramString, l<zzv<? super ReferenceT>> paraml)
  {
    for (;;)
    {
      try
      {
        CopyOnWriteArrayList localCopyOnWriteArrayList = (CopyOnWriteArrayList)this.a.get(paramString);
        if (localCopyOnWriteArrayList == null) {
          return;
        }
        ArrayList localArrayList = new ArrayList();
        Iterator localIterator = localCopyOnWriteArrayList.iterator();
        if (localIterator.hasNext())
        {
          zzv localzzv = (zzv)localIterator.next();
          if (paraml.a(localzzv)) {
            localArrayList.add(localzzv);
          }
        }
        else
        {
          localCopyOnWriteArrayList.removeAll(localArrayList);
        }
      }
      finally {}
    }
  }
  
  public final boolean a(Uri paramUri)
  {
    if (("gmsg".equalsIgnoreCase(paramUri.getScheme())) && ("mobileads.google.com".equalsIgnoreCase(paramUri.getHost())))
    {
      String str = paramUri.getPath();
      zzbv.zzek();
      a(str, jn.a(paramUri));
      return true;
    }
    return false;
  }
  
  /* Error */
  public final void b(String paramString, zzv<? super ReferenceT> paramzzv)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 19	com/google/android/gms/internal/ads/azm:a	Ljava/util/Map;
    //   6: aload_1
    //   7: invokeinterface 70 2 0
    //   12: checkcast 91	java/util/concurrent/CopyOnWriteArrayList
    //   15: astore 4
    //   17: aload 4
    //   19: ifnonnull +6 -> 25
    //   22: aload_0
    //   23: monitorexit
    //   24: return
    //   25: aload 4
    //   27: aload_2
    //   28: invokevirtual 172	java/util/concurrent/CopyOnWriteArrayList:remove	(Ljava/lang/Object;)Z
    //   31: pop
    //   32: goto -10 -> 22
    //   35: astore_3
    //   36: aload_0
    //   37: monitorexit
    //   38: aload_3
    //   39: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	40	0	this	azm
    //   0	40	1	paramString	String
    //   0	40	2	paramzzv	zzv<? super ReferenceT>
    //   35	4	3	localObject	Object
    //   15	11	4	localCopyOnWriteArrayList	CopyOnWriteArrayList
    // Exception table:
    //   from	to	target	type
    //   2	17	35	finally
    //   25	32	35	finally
  }
  
  public void k()
  {
    try
    {
      this.a.clear();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public abstract ReferenceT o();
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.azm
 * JD-Core Version:    0.7.0.1
 */