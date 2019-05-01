package com.google.android.gms.internal.ads;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.PowerManager;
import android.provider.Settings.System;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@cm
@ParametersAreNonnullByDefault
public final class ajj
  implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener
{
  protected final ajh a;
  private final Object b = new Object();
  private final WeakReference<ij> c;
  private WeakReference<ViewTreeObserver> d;
  private final akv e;
  private final Context f;
  private final WindowManager g;
  private final PowerManager h;
  private final KeyguardManager i;
  private final DisplayMetrics j;
  private ajr k;
  private boolean l;
  private boolean m = false;
  private boolean n = false;
  private boolean o;
  private boolean p;
  private boolean q;
  private BroadcastReceiver r;
  private final HashSet<ajg> s = new HashSet();
  private lo t;
  private final HashSet<akf> u = new HashSet();
  private final Rect v = new Rect();
  private final ajm w;
  private float x;
  
  public ajj(Context paramContext, zzjn paramzzjn, ij paramij, zzang paramzzang, akv paramakv)
  {
    this.c = new WeakReference(paramij);
    this.e = paramakv;
    this.d = new WeakReference(null);
    this.o = true;
    this.q = false;
    this.t = new lo(200L);
    this.a = new ajh(UUID.randomUUID().toString(), paramzzang, paramzzjn.a, paramij.k, paramij.a(), paramzzjn.h);
    this.g = ((WindowManager)paramContext.getSystemService("window"));
    this.h = ((PowerManager)paramContext.getApplicationContext().getSystemService("power"));
    this.i = ((KeyguardManager)paramContext.getSystemService("keyguard"));
    this.f = paramContext;
    this.w = new ajm(this, new Handler());
    this.f.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.w);
    this.j = paramContext.getResources().getDisplayMetrics();
    Display localDisplay = this.g.getDefaultDisplay();
    this.v.right = localDisplay.getWidth();
    this.v.bottom = localDisplay.getHeight();
    a();
  }
  
  private static int a(int paramInt, DisplayMetrics paramDisplayMetrics)
  {
    float f1 = paramDisplayMetrics.density;
    return (int)(paramInt / f1);
  }
  
  private final JSONObject a(View paramView, Boolean paramBoolean)
  {
    if (paramView == null) {
      return i().put("isAttachedToWindow", false).put("isScreenOn", j()).put("isVisible", false);
    }
    boolean bool1 = zzbv.zzem().a(paramView);
    int[] arrayOfInt1 = new int[2];
    int[] arrayOfInt2 = new int[2];
    try
    {
      paramView.getLocationOnScreen(arrayOfInt1);
      paramView.getLocationInWindow(arrayOfInt2);
      Rect localRect1 = new Rect();
      localRect1.left = arrayOfInt1[0];
      localRect1.top = arrayOfInt1[1];
      localRect1.right = (localRect1.left + paramView.getWidth());
      localRect1.bottom = (localRect1.top + paramView.getHeight());
      Rect localRect2 = new Rect();
      boolean bool2 = paramView.getGlobalVisibleRect(localRect2, null);
      Rect localRect3 = new Rect();
      boolean bool3 = paramView.getLocalVisibleRect(localRect3);
      Rect localRect4 = new Rect();
      paramView.getHitRect(localRect4);
      JSONObject localJSONObject = i();
      localJSONObject.put("windowVisibility", paramView.getWindowVisibility()).put("isAttachedToWindow", bool1).put("viewBox", new JSONObject().put("top", a(this.v.top, this.j)).put("bottom", a(this.v.bottom, this.j)).put("left", a(this.v.left, this.j)).put("right", a(this.v.right, this.j))).put("adBox", new JSONObject().put("top", a(localRect1.top, this.j)).put("bottom", a(localRect1.bottom, this.j)).put("left", a(localRect1.left, this.j)).put("right", a(localRect1.right, this.j))).put("globalVisibleBox", new JSONObject().put("top", a(localRect2.top, this.j)).put("bottom", a(localRect2.bottom, this.j)).put("left", a(localRect2.left, this.j)).put("right", a(localRect2.right, this.j))).put("globalVisibleBoxVisible", bool2).put("localVisibleBox", new JSONObject().put("top", a(localRect3.top, this.j)).put("bottom", a(localRect3.bottom, this.j)).put("left", a(localRect3.left, this.j)).put("right", a(localRect3.right, this.j))).put("localVisibleBoxVisible", bool3).put("hitBox", new JSONObject().put("top", a(localRect4.top, this.j)).put("bottom", a(localRect4.bottom, this.j)).put("left", a(localRect4.left, this.j)).put("right", a(localRect4.right, this.j))).put("screenDensity", this.j.density);
      if (paramBoolean == null) {
        paramBoolean = Boolean.valueOf(zzbv.zzek().a(paramView, this.h, this.i));
      }
      localJSONObject.put("isVisible", paramBoolean.booleanValue());
      return localJSONObject;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        je.b("Failure getting view location.", localException);
      }
    }
  }
  
  private static JSONObject a(JSONObject paramJSONObject)
  {
    JSONArray localJSONArray = new JSONArray();
    JSONObject localJSONObject = new JSONObject();
    localJSONArray.put(paramJSONObject);
    localJSONObject.put("units", localJSONArray);
    return localJSONObject;
  }
  
  private final void a(JSONObject paramJSONObject, boolean paramBoolean)
  {
    try
    {
      JSONObject localJSONObject = a(paramJSONObject);
      ArrayList localArrayList = (ArrayList)new ArrayList(this.u);
      int i1 = localArrayList.size();
      int i2 = 0;
      while (i2 < i1)
      {
        Object localObject = localArrayList.get(i2);
        i2++;
        ((akf)localObject).a(localJSONObject, paramBoolean);
      }
      return;
    }
    catch (Throwable localThrowable)
    {
      je.b("Skipping active view message.", localThrowable);
    }
  }
  
  private final void g()
  {
    if (this.k != null) {
      this.k.a(this);
    }
  }
  
  private final void h()
  {
    ViewTreeObserver localViewTreeObserver = (ViewTreeObserver)this.d.get();
    if ((localViewTreeObserver == null) || (!localViewTreeObserver.isAlive())) {
      return;
    }
    localViewTreeObserver.removeOnScrollChangedListener(this);
    localViewTreeObserver.removeGlobalOnLayoutListener(this);
  }
  
  private final JSONObject i()
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("afmaVersion", this.a.b()).put("activeViewJSON", this.a.c()).put("timestamp", zzbv.zzer().b()).put("adFormat", this.a.a()).put("hashCode", this.a.d()).put("isMraid", this.a.e()).put("isStopped", this.n).put("isPaused", this.m).put("isNative", this.a.f()).put("isScreenOn", j()).put("appMuted", zzbv.zzfj().b()).put("appVolume", zzbv.zzfj().a()).put("deviceVolume", this.x);
    return localJSONObject;
  }
  
  private final boolean j()
  {
    if (Build.VERSION.SDK_INT >= 20) {
      return this.h.isInteractive();
    }
    return this.h.isScreenOn();
  }
  
  public final void a()
  {
    this.x = kf.a(this.f);
  }
  
  protected final void a(int paramInt)
  {
    for (;;)
    {
      int i1;
      View localView1;
      synchronized (this.b)
      {
        Iterator localIterator = this.u.iterator();
        if (!localIterator.hasNext()) {
          break label358;
        }
        if (!((akf)localIterator.next()).a()) {
          continue;
        }
        i1 = 1;
        if ((i1 == 0) || (!this.o)) {
          return;
        }
        localView1 = this.e.a();
        if ((localView1 != null) && (zzbv.zzek().a(localView1, this.h, this.i)))
        {
          bool1 = true;
          if ((localView1 == null) || (!bool1) || (!localView1.getGlobalVisibleRect(new Rect(), null))) {
            break label159;
          }
          bool2 = true;
          if (!this.e.b()) {
            break label165;
          }
          b();
          return;
        }
      }
      boolean bool1 = false;
      continue;
      label159:
      boolean bool2 = false;
      continue;
      label165:
      if ((paramInt == 1) && (!this.t.a()) && (bool2 == this.q)) {
        return;
      }
      if ((!bool2) && (!this.q) && (paramInt == 1)) {
        return;
      }
      try
      {
        a(a(localView1, Boolean.valueOf(bool1)), false);
        this.q = bool2;
        for (;;)
        {
          View localView2 = this.e.c().a();
          if (localView2 != null)
          {
            ViewTreeObserver localViewTreeObserver1 = (ViewTreeObserver)this.d.get();
            ViewTreeObserver localViewTreeObserver2 = localView2.getViewTreeObserver();
            if (localViewTreeObserver2 != localViewTreeObserver1)
            {
              h();
              if ((!this.l) || ((localViewTreeObserver1 != null) && (localViewTreeObserver1.isAlive())))
              {
                this.l = true;
                localViewTreeObserver2.addOnScrollChangedListener(this);
                localViewTreeObserver2.addOnGlobalLayoutListener(this);
              }
              this.d = new WeakReference(localViewTreeObserver2);
            }
          }
          g();
          return;
          label342:
          Throwable localThrowable;
          je.a("Active view update failed.", localThrowable);
        }
      }
      catch (JSONException localJSONException)
      {
        break label342;
        i1 = 0;
      }
      catch (RuntimeException localRuntimeException)
      {
        label358:
        break label342;
      }
    }
  }
  
  public final void a(ajr paramajr)
  {
    synchronized (this.b)
    {
      this.k = paramajr;
      return;
    }
  }
  
  public final void a(akf paramakf)
  {
    if (this.u.isEmpty()) {}
    synchronized (this.b)
    {
      if (this.r != null)
      {
        a(3);
        this.u.add(paramakf);
      }
      try
      {
        paramakf.a(a(a(this.e.a(), null)), false);
        return;
      }
      catch (JSONException localJSONException)
      {
        IntentFilter localIntentFilter;
        je.b("Skipping measurement update for new client.", localJSONException);
      }
      localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.intent.action.SCREEN_ON");
      localIntentFilter.addAction("android.intent.action.SCREEN_OFF");
      this.r = new ajk(this);
      zzbv.zzfk().a(this.f, this.r, localIntentFilter);
    }
  }
  
  final void a(akf paramakf, Map<String, String> paramMap)
  {
    String str1 = String.valueOf(this.a.d());
    if (str1.length() != 0) {}
    for (String str2 = "Received request to untrack: ".concat(str1);; str2 = new String("Received request to untrack: "))
    {
      je.b(str2);
      b(paramakf);
      return;
    }
  }
  
  final boolean a(Map<String, String> paramMap)
  {
    if (paramMap == null) {
      return false;
    }
    String str = (String)paramMap.get("hashCode");
    return (!TextUtils.isEmpty(str)) && (str.equals(this.a.d()));
  }
  
  public final void b()
  {
    synchronized (this.b)
    {
      if (this.o) {
        this.p = true;
      }
    }
    try
    {
      JSONObject localJSONObject = i();
      localJSONObject.put("doneReasonCode", "u");
      a(localJSONObject, true);
      String str1 = String.valueOf(this.a.d());
      if (str1.length() != 0)
      {
        str2 = "Untracking ad unit: ".concat(str1);
        je.b(str2);
        return;
      }
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        je.b("JSON failure while processing active view data.", localJSONException);
      }
      localObject2 = finally;
      throw localObject2;
    }
    catch (RuntimeException localRuntimeException)
    {
      for (;;)
      {
        je.b("Failure while processing active view data.", localRuntimeException);
        continue;
        String str2 = new String("Untracking ad unit: ");
      }
    }
  }
  
  public final void b(akf paramakf)
  {
    this.u.remove(paramakf);
    paramakf.b();
    if (this.u.isEmpty())
    {
      synchronized (this.b)
      {
        h();
        synchronized (this.b)
        {
          BroadcastReceiver localBroadcastReceiver = this.r;
          if (localBroadcastReceiver == null) {}
        }
      }
      try
      {
        zzbv.zzfk().a(this.f, this.r);
        this.r = null;
        this.f.getContentResolver().unregisterContentObserver(this.w);
        this.o = false;
        g();
        ArrayList localArrayList = (ArrayList)new ArrayList(this.u);
        int i1 = localArrayList.size();
        int i2 = 0;
        while (i2 < i1)
        {
          Object localObject5 = localArrayList.get(i2);
          i2++;
          b((akf)localObject5);
          continue;
          localObject2 = finally;
          throw localObject2;
        }
      }
      catch (IllegalStateException localIllegalStateException)
      {
        for (;;)
        {
          je.b("Failed trying to unregister the receiver", localIllegalStateException);
        }
        localObject4 = finally;
        throw localObject4;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          zzbv.zzeo().a(localException, "ActiveViewUnit.stopScreenStatusMonitoring");
        }
      }
    }
  }
  
  final void b(Map<String, String> paramMap)
  {
    a(3);
  }
  
  final void c(Map<String, String> paramMap)
  {
    if (!paramMap.containsKey("isVisible")) {
      return;
    }
    if (("1".equals(paramMap.get("isVisible"))) || ("true".equals(paramMap.get("isVisible")))) {}
    for (boolean bool = true;; bool = false)
    {
      Iterator localIterator = this.s.iterator();
      while (localIterator.hasNext()) {
        ((ajg)localIterator.next()).a(this, bool);
      }
      break;
    }
  }
  
  public final boolean c()
  {
    synchronized (this.b)
    {
      boolean bool = this.o;
      return bool;
    }
  }
  
  public final void d()
  {
    synchronized (this.b)
    {
      this.n = true;
      a(3);
      return;
    }
  }
  
  public final void e()
  {
    synchronized (this.b)
    {
      this.m = true;
      a(3);
      return;
    }
  }
  
  public final void f()
  {
    synchronized (this.b)
    {
      this.m = false;
      a(3);
      return;
    }
  }
  
  public final void onGlobalLayout()
  {
    a(2);
  }
  
  public final void onScrollChanged()
  {
    a(1);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ajj
 * JD-Core Version:    0.7.0.1
 */