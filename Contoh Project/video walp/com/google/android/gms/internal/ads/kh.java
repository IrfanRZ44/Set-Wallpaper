package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager.BadTokenException;
import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@cm
public final class kh
{
  private final Context a;
  private String b;
  private String c;
  private String d;
  private String e;
  private final float f;
  private float g;
  private float h;
  private float i;
  private int j = 0;
  private int k;
  private float l;
  private float m;
  private float n;
  private float o;
  private Handler p;
  private Runnable q = new ki(this);
  
  public kh(Context paramContext)
  {
    this.a = paramContext;
    this.f = paramContext.getResources().getDisplayMetrics().density;
    this.k = ViewConfiguration.get(this.a).getScaledTouchSlop();
    zzbv.zzez().a();
    this.p = zzbv.zzez().b();
  }
  
  public kh(Context paramContext, String paramString)
  {
    this(paramContext);
    this.b = paramString;
  }
  
  private static int a(List<String> paramList, String paramString, boolean paramBoolean)
  {
    if (!paramBoolean) {
      return -1;
    }
    paramList.add(paramString);
    return -1 + paramList.size();
  }
  
  private final void a(int paramInt, float paramFloat1, float paramFloat2)
  {
    if (paramInt == 0)
    {
      this.j = 0;
      this.g = paramFloat1;
      this.h = paramFloat2;
      this.i = paramFloat2;
    }
    label24:
    label224:
    do
    {
      do
      {
        break label24;
        do
        {
          return;
        } while (this.j == -1);
        if (paramInt != 2) {
          break;
        }
        if (paramFloat2 > this.h) {
          this.h = paramFloat2;
        }
        while (this.h - this.i > 30.0F * this.f)
        {
          this.j = -1;
          return;
          if (paramFloat2 < this.i) {
            this.i = paramFloat2;
          }
        }
        if ((this.j == 0) || (this.j == 2)) {
          if (paramFloat1 - this.g >= 50.0F * this.f) {
            this.g = paramFloat1;
          }
        }
        for (this.j = (1 + this.j);; this.j = (1 + this.j))
        {
          do
          {
            if ((this.j != 1) && (this.j != 3)) {
              break label224;
            }
            if (paramFloat1 <= this.g) {
              break;
            }
            this.g = paramFloat1;
            return;
          } while (((this.j != 1) && (this.j != 3)) || (paramFloat1 - this.g > -50.0F * this.f));
          this.g = paramFloat1;
        }
      } while ((this.j != 2) || (paramFloat1 >= this.g));
      this.g = paramFloat1;
      return;
    } while ((paramInt != 1) || (this.j != 4));
    a();
  }
  
  private final boolean a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    return (Math.abs(this.l - paramFloat1) < this.k) && (Math.abs(this.m - paramFloat2) < this.k) && (Math.abs(this.n - paramFloat3) < this.k) && (Math.abs(this.o - paramFloat4) < this.k);
  }
  
  private final void e()
  {
    if (!(this.a instanceof Activity))
    {
      je.d("Can not create dialog without Activity Context");
      return;
    }
    String str1 = this.b;
    String str2;
    if (!TextUtils.isEmpty(str1))
    {
      String str3 = str1.replaceAll("\\+", "%20");
      Uri localUri = new Uri.Builder().encodedQuery(str3).build();
      StringBuilder localStringBuilder = new StringBuilder();
      zzbv.zzek();
      Map localMap = jn.a(localUri);
      Iterator localIterator = localMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str4 = (String)localIterator.next();
        localStringBuilder.append(str4).append(" = ").append((String)localMap.get(str4)).append("\n\n");
      }
      str2 = localStringBuilder.toString().trim();
      if (TextUtils.isEmpty(str2)) {}
    }
    for (;;)
    {
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.a);
      localBuilder.setMessage(str2);
      localBuilder.setTitle("Ad Information");
      localBuilder.setPositiveButton("Share", new kk(this, str2));
      localBuilder.setNegativeButton("Close", kl.a);
      localBuilder.create().show();
      return;
      str2 = "No debug information";
    }
  }
  
  public final void a()
  {
    try
    {
      arq localarq1 = asa.cP;
      if (!((Boolean)aos.f().a(localarq1)).booleanValue())
      {
        arq localarq4 = asa.cO;
        if (!((Boolean)aos.f().a(localarq4)).booleanValue()) {
          break label259;
        }
      }
      if (!(this.a instanceof Activity))
      {
        je.d("Can not create dialog without Activity Context");
        return;
      }
      if (TextUtils.isEmpty(zzbv.zzeu().a())) {
        break label251;
      }
      str1 = "Creative Preview (Enabled)";
    }
    catch (WindowManager.BadTokenException localBadTokenException)
    {
      String str1;
      while (je.a())
      {
        Log.v("Ads", "", localBadTokenException);
        return;
        label251:
        str1 = "Creative Preview";
        continue;
        label259:
        e();
      }
      return;
    }
    if (zzbv.zzeu().b()) {}
    for (String str2 = "Troubleshooting (Enabled)";; str2 = "Troubleshooting")
    {
      ArrayList localArrayList = new ArrayList();
      int i1 = a(localArrayList, "Ad Information", true);
      arq localarq2 = asa.cO;
      int i2 = a(localArrayList, str1, ((Boolean)aos.f().a(localarq2)).booleanValue());
      arq localarq3 = asa.cP;
      int i3 = a(localArrayList, str2, ((Boolean)aos.f().a(localarq3)).booleanValue());
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.a, zzbv.zzem().f());
      localBuilder.setTitle("Select a Debug Mode").setItems((CharSequence[])localArrayList.toArray(new String[0]), new kj(this, i1, i2, i3));
      localBuilder.create().show();
      return;
    }
  }
  
  public final void a(MotionEvent paramMotionEvent)
  {
    int i1 = 1;
    arq localarq1 = asa.cQ;
    int i4;
    int i5;
    int i6;
    if (((Boolean)aos.f().a(localarq1)).booleanValue())
    {
      i4 = paramMotionEvent.getActionMasked();
      i5 = paramMotionEvent.getHistorySize();
      i6 = paramMotionEvent.getPointerCount();
      if (i4 == 0)
      {
        this.j = 0;
        this.l = paramMotionEvent.getX();
        this.m = paramMotionEvent.getY();
      }
    }
    for (;;)
    {
      return;
      if (this.j != -1)
      {
        if ((this.j == 0) && (i4 == 5))
        {
          this.j = 5;
          this.n = paramMotionEvent.getX(i1);
          this.o = paramMotionEvent.getY(i1);
          Handler localHandler = this.p;
          Runnable localRunnable = this.q;
          arq localarq2 = asa.cR;
          localHandler.postDelayed(localRunnable, ((Long)aos.f().a(localarq2)).longValue());
          return;
        }
        if (this.j != 5) {
          break;
        }
        if (i6 != 2) {}
        while (i1 != 0)
        {
          this.j = -1;
          this.p.removeCallbacks(this.q);
          return;
          if (i4 == 2)
          {
            int i7 = 0;
            int i8 = 0;
            while (i7 < i5)
            {
              if (!a(paramMotionEvent.getHistoricalX(0, i7), paramMotionEvent.getHistoricalY(0, i7), paramMotionEvent.getHistoricalX(i1, i7), paramMotionEvent.getHistoricalY(i1, i7))) {
                i8 = i1;
              }
              i7++;
            }
            if (a(paramMotionEvent.getX(), paramMotionEvent.getY(), paramMotionEvent.getX(i1), paramMotionEvent.getY(i1)))
            {
              i1 = i8;
              continue;
              int i2 = paramMotionEvent.getHistorySize();
              for (int i3 = 0; i3 < i2; i3++) {
                a(paramMotionEvent.getActionMasked(), paramMotionEvent.getHistoricalX(0, i3), paramMotionEvent.getHistoricalY(0, i3));
              }
              a(paramMotionEvent.getActionMasked(), paramMotionEvent.getX(), paramMotionEvent.getY());
            }
          }
          else
          {
            i1 = 0;
          }
        }
      }
    }
  }
  
  public final void a(String paramString)
  {
    this.c = paramString;
  }
  
  public final void b(String paramString)
  {
    this.d = paramString;
  }
  
  public final void c(String paramString)
  {
    this.b = paramString;
  }
  
  public final void d(String paramString)
  {
    this.e = paramString;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.kh
 * JD-Core Version:    0.7.0.1
 */