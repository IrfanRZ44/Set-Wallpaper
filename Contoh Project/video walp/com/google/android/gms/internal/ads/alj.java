package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

@cm
public final class alj
{
  private final int a;
  private final int b;
  private final int c;
  private final ali d = new aln();
  
  public alj(int paramInt)
  {
    this.b = paramInt;
    this.a = 6;
    this.c = 0;
  }
  
  private final String a(String paramString)
  {
    String[] arrayOfString1 = paramString.split("\n");
    if (arrayOfString1.length == 0) {
      return "";
    }
    all localall = new all();
    PriorityQueue localPriorityQueue = new PriorityQueue(this.b, new alk(this));
    for (int i = 0; i < arrayOfString1.length; i++)
    {
      String[] arrayOfString2 = alm.a(arrayOfString1[i], false);
      if (arrayOfString2.length != 0) {
        alp.a(arrayOfString2, this.b, this.a, localPriorityQueue);
      }
    }
    Iterator localIterator = localPriorityQueue.iterator();
    for (;;)
    {
      if (localIterator.hasNext())
      {
        alq localalq = (alq)localIterator.next();
        try
        {
          localall.a(this.d.a(localalq.b));
        }
        catch (IOException localIOException)
        {
          je.b("Error while writing hash to byteStream", localIOException);
        }
      }
    }
    return localall.toString();
  }
  
  public final String a(ArrayList<String> paramArrayList)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    ArrayList localArrayList = (ArrayList)paramArrayList;
    int i = localArrayList.size();
    int j = 0;
    while (j < i)
    {
      Object localObject = localArrayList.get(j);
      j++;
      localStringBuilder.append(((String)localObject).toLowerCase(Locale.US));
      localStringBuilder.append('\n');
    }
    return a(localStringBuilder.toString());
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.alj
 * JD-Core Version:    0.7.0.1
 */