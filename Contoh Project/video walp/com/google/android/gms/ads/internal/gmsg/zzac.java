package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.ads.internal.zzx;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.o;
import com.google.android.gms.internal.ads.qe;
import java.util.Map;

@cm
public final class zzac
  implements zzv<qe>
{
  private static final Map<String, Integer> d;
  private final zzx a;
  private final com.google.android.gms.internal.ads.d b;
  private final o c;
  
  static
  {
    String[] arrayOfString = { "resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload" };
    Integer[] arrayOfInteger = new Integer[7];
    arrayOfInteger[0] = Integer.valueOf(1);
    arrayOfInteger[1] = Integer.valueOf(2);
    arrayOfInteger[2] = Integer.valueOf(3);
    arrayOfInteger[3] = Integer.valueOf(4);
    arrayOfInteger[4] = Integer.valueOf(5);
    arrayOfInteger[5] = Integer.valueOf(6);
    arrayOfInteger[6] = Integer.valueOf(7);
    d = com.google.android.gms.common.util.d.a(arrayOfString, arrayOfInteger);
  }
  
  public zzac(zzx paramzzx, com.google.android.gms.internal.ads.d paramd, o paramo)
  {
    this.a = paramzzx;
    this.b = paramd;
    this.c = paramo;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.zzac
 * JD-Core Version:    0.7.0.1
 */