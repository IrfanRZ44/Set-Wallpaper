package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.TextureView;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.c;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

@cm
public final class pe
{
  private final Context a;
  private final String b;
  private final zzang c;
  private final asl d;
  private final asn e;
  private final kt f = new kw().a("min_1", 4.9E-324D, 1.0D).a("1_5", 1.0D, 5.0D).a("5_10", 5.0D, 10.0D).a("10_20", 10.0D, 20.0D).a("20_30", 20.0D, 30.0D).a("30_max", 30.0D, 1.7976931348623157E+308D).a();
  private final long[] g;
  private final String[] h;
  private boolean i = false;
  private boolean j = false;
  private boolean k = false;
  private boolean l = false;
  private boolean m;
  private on n;
  private boolean o;
  private boolean p;
  private long q = -1L;
  
  public pe(Context paramContext, zzang paramzzang, String paramString, asn paramasn, asl paramasl)
  {
    this.a = paramContext;
    this.c = paramzzang;
    this.b = paramString;
    this.e = paramasn;
    this.d = paramasl;
    arq localarq = asa.u;
    String str = (String)aos.f().a(localarq);
    if (str == null)
    {
      this.h = new String[0];
      this.g = new long[0];
      return;
    }
    String[] arrayOfString = TextUtils.split(str, ",");
    this.h = new String[arrayOfString.length];
    this.g = new long[arrayOfString.length];
    int i1 = 0;
    while (i1 < arrayOfString.length) {
      try
      {
        this.g[i1] = Long.parseLong(arrayOfString[i1]);
        i1++;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        for (;;)
        {
          je.c("Unable to parse frame hash target time number.", localNumberFormatException);
          this.g[i1] = -1L;
        }
      }
    }
  }
  
  public final void a()
  {
    if ((!this.i) || (this.j)) {
      return;
    }
    asg.a(this.e, this.d, new String[] { "vfr2" });
    this.j = true;
  }
  
  public final void a(on paramon)
  {
    asg.a(this.e, this.d, new String[] { "vpc2" });
    this.i = true;
    if (this.e != null) {
      this.e.a("vpn", paramon.a());
    }
    this.n = paramon;
  }
  
  public final void b()
  {
    arq localarq = asa.t;
    if ((((Boolean)aos.f().a(localarq)).booleanValue()) && (!this.o))
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("type", "native-player-metrics");
      localBundle.putString("request", this.b);
      localBundle.putString("player", this.n.a());
      Iterator localIterator = this.f.a().iterator();
      if (localIterator.hasNext())
      {
        kv localkv = (kv)localIterator.next();
        String str3 = String.valueOf("fps_c_");
        String str4 = String.valueOf(localkv.a);
        String str5;
        label133:
        String str6;
        String str7;
        if (str4.length() != 0)
        {
          str5 = str3.concat(str4);
          localBundle.putString(str5, Integer.toString(localkv.c));
          str6 = String.valueOf("fps_p_");
          str7 = String.valueOf(localkv.a);
          if (str7.length() == 0) {
            break label212;
          }
        }
        label212:
        for (String str8 = str6.concat(str7);; str8 = new String(str6))
        {
          localBundle.putString(str8, Double.toString(localkv.b));
          break;
          str5 = new String(str3);
          break label133;
        }
      }
      for (int i1 = 0; i1 < this.g.length; i1++)
      {
        String str1 = this.h[i1];
        if (str1 != null)
        {
          String str2 = String.valueOf(Long.valueOf(this.g[i1]));
          localBundle.putString(3 + String.valueOf(str2).length() + "fh_" + str2, str1);
        }
      }
      zzbv.zzek().a(this.a, this.c.a, "gmob-apps", localBundle, true);
      this.o = true;
    }
  }
  
  public final void b(on paramon)
  {
    if ((this.k) && (!this.l))
    {
      if ((je.a()) && (!this.l)) {
        je.a("VideoMetricsMixin first frame");
      }
      asg.a(this.e, this.d, new String[] { "vff2" });
      this.l = true;
    }
    long l1 = zzbv.zzer().c();
    if ((this.m) && (this.p) && (this.q != -1L))
    {
      double d1 = TimeUnit.SECONDS.toNanos(1L) / (l1 - this.q);
      this.f.a(d1);
    }
    this.p = this.m;
    this.q = l1;
    arq localarq = asa.v;
    long l2 = ((Long)aos.f().a(localarq)).longValue();
    long l3 = paramon.getCurrentPosition();
    for (int i1 = 0;; i1++) {
      if (i1 < this.h.length)
      {
        if ((this.h[i1] == null) && (l2 > Math.abs(l3 - this.g[i1])))
        {
          String[] arrayOfString = this.h;
          Bitmap localBitmap = paramon.getBitmap(8, 8);
          long l4 = 0L;
          long l5 = 63L;
          int i2 = 0;
          while (i2 < 8)
          {
            int i3 = 0;
            long l6 = l4;
            long l7 = l5;
            if (i3 < 8)
            {
              int i4 = localBitmap.getPixel(i3, i2);
              if (Color.blue(i4) + Color.red(i4) + Color.green(i4) > 128) {}
              for (long l8 = 1L;; l8 = 0L)
              {
                l6 |= l8 << (int)l7;
                i3++;
                l7 -= 1L;
                break;
              }
            }
            i2++;
            l5 = l7;
            l4 = l6;
          }
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = Long.valueOf(l4);
          arrayOfString[i1] = String.format("%016X", arrayOfObject);
        }
      }
      else {
        return;
      }
    }
  }
  
  public final void c()
  {
    this.m = true;
    if ((this.j) && (!this.k))
    {
      asg.a(this.e, this.d, new String[] { "vfp2" });
      this.k = true;
    }
  }
  
  public final void d()
  {
    this.m = false;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.pe
 * JD-Core Version:    0.7.0.1
 */