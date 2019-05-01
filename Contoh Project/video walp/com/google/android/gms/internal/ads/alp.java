package com.google.android.gms.internal.ads;

import java.util.PriorityQueue;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public final class alp
{
  private static long a(long paramLong, int paramInt)
  {
    if (paramInt == 0) {
      paramLong = 1L;
    }
    while (paramInt == 1) {
      return paramLong;
    }
    if (paramInt % 2 == 0) {
      return a(paramLong * paramLong % 1073807359L, paramInt / 2) % 1073807359L;
    }
    return paramLong * (a(paramLong * paramLong % 1073807359L, paramInt / 2) % 1073807359L) % 1073807359L;
  }
  
  private static String a(String[] paramArrayOfString, int paramInt1, int paramInt2)
  {
    if (paramArrayOfString.length < paramInt1 + paramInt2)
    {
      je.c("Unable to construct shingle");
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = paramInt1; i < -1 + (paramInt1 + paramInt2); i++)
    {
      localStringBuilder.append(paramArrayOfString[i]);
      localStringBuilder.append(' ');
    }
    localStringBuilder.append(paramArrayOfString[(-1 + (paramInt1 + paramInt2))]);
    return localStringBuilder.toString();
  }
  
  private static void a(int paramInt1, long paramLong, String paramString, int paramInt2, PriorityQueue<alq> paramPriorityQueue)
  {
    alq localalq = new alq(paramLong, paramString, paramInt2);
    if ((paramPriorityQueue.size() == paramInt1) && ((((alq)paramPriorityQueue.peek()).c > localalq.c) || (((alq)paramPriorityQueue.peek()).a > localalq.a))) {}
    do
    {
      do
      {
        return;
      } while (paramPriorityQueue.contains(localalq));
      paramPriorityQueue.add(localalq);
    } while (paramPriorityQueue.size() <= paramInt1);
    paramPriorityQueue.poll();
  }
  
  public static void a(String[] paramArrayOfString, int paramInt1, int paramInt2, PriorityQueue<alq> paramPriorityQueue)
  {
    if (paramArrayOfString.length < paramInt2) {
      a(paramInt1, b(paramArrayOfString, 0, paramArrayOfString.length), a(paramArrayOfString, 0, paramArrayOfString.length), paramArrayOfString.length, paramPriorityQueue);
    }
    for (;;)
    {
      return;
      long l1 = b(paramArrayOfString, 0, paramInt2);
      a(paramInt1, l1, a(paramArrayOfString, 0, paramInt2), paramInt2, paramPriorityQueue);
      long l2 = a(16785407L, paramInt2 - 1);
      for (int i = 1; i < 1 + (paramArrayOfString.length - paramInt2); i++)
      {
        int j = alm.a(paramArrayOfString[(i - 1)]);
        int k = alm.a(paramArrayOfString[(-1 + (i + paramInt2))]);
        long l3 = l2 * ((2147483647L + j) % 1073807359L) % 1073807359L;
        l1 = (16785407L * ((l1 + 1073807359L - l3) % 1073807359L) % 1073807359L + (2147483647L + k) % 1073807359L) % 1073807359L;
        a(paramInt1, l1, a(paramArrayOfString, i, paramInt2), paramArrayOfString.length, paramPriorityQueue);
      }
    }
  }
  
  private static long b(String[] paramArrayOfString, int paramInt1, int paramInt2)
  {
    long l = (2147483647L + alm.a(paramArrayOfString[0])) % 1073807359L;
    for (int i = 1; i < paramInt2; i++) {
      l = (l * 16785407L % 1073807359L + (2147483647L + alm.a(paramArrayOfString[i])) % 1073807359L) % 1073807359L;
    }
    return l;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.alp
 * JD-Core Version:    0.7.0.1
 */