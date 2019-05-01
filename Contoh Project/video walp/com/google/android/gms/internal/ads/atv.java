package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.util.c;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@cm
@ParametersAreNonnullByDefault
public class atv
  implements atq
{
  boolean a;
  boolean b;
  private final Object c = new Object();
  private final ats d;
  private final Context e;
  private final atb f;
  private final JSONObject g;
  private final bq h;
  private final att i;
  private final agw j;
  private final zzang k;
  private String l;
  private hy m;
  private WeakReference<View> n = null;
  
  public atv(Context paramContext, ats paramats, bq parambq, agw paramagw, JSONObject paramJSONObject, att paramatt, zzang paramzzang, String paramString)
  {
    this.e = paramContext;
    this.d = paramats;
    this.h = parambq;
    this.j = paramagw;
    this.g = paramJSONObject;
    this.i = paramatt;
    this.k = paramzzang;
    this.l = paramString;
    this.f = new atb(this.h);
  }
  
  private final int a(int paramInt)
  {
    aos.a();
    return lz.b(this.e, paramInt);
  }
  
  private final JSONObject a(Rect paramRect)
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("width", a(paramRect.right - paramRect.left));
    localJSONObject.put("height", a(paramRect.bottom - paramRect.top));
    localJSONObject.put("x", a(paramRect.left));
    localJSONObject.put("y", a(paramRect.top));
    localJSONObject.put("relative_to", "self");
    return localJSONObject;
  }
  
  private final JSONObject a(Map<String, WeakReference<View>> paramMap, View paramView)
  {
    JSONObject localJSONObject1 = new JSONObject();
    if ((paramMap == null) || (paramView == null)) {
      return localJSONObject1;
    }
    int[] arrayOfInt1 = f(paramView);
    for (;;)
    {
      int[] arrayOfInt2;
      JSONObject localJSONObject4;
      try
      {
        Iterator localIterator = paramMap.entrySet().iterator();
        if (!localIterator.hasNext()) {
          break;
        }
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        View localView = (View)((WeakReference)localEntry.getValue()).get();
        if (localView == null) {
          continue;
        }
        arrayOfInt2 = f(localView);
        JSONObject localJSONObject2 = new JSONObject();
        JSONObject localJSONObject3 = new JSONObject();
        try
        {
          localJSONObject3.put("width", a(localView.getMeasuredWidth()));
          localJSONObject3.put("height", a(localView.getMeasuredHeight()));
          localJSONObject3.put("x", a(arrayOfInt2[0] - arrayOfInt1[0]));
          localJSONObject3.put("y", a(arrayOfInt2[1] - arrayOfInt1[1]));
          localJSONObject3.put("relative_to", "ad_view");
          localJSONObject2.put("frame", localJSONObject3);
          Rect localRect = new Rect();
          if (!localView.getLocalVisibleRect(localRect)) {
            break label334;
          }
          localJSONObject4 = a(localRect);
          localJSONObject2.put("visible_bounds", localJSONObject4);
          if ((localView instanceof TextView))
          {
            TextView localTextView = (TextView)localView;
            localJSONObject2.put("text_color", localTextView.getCurrentTextColor());
            localJSONObject2.put("font_size", localTextView.getTextSize());
            localJSONObject2.put("text", localTextView.getText());
          }
          localJSONObject1.put((String)localEntry.getKey(), localJSONObject2);
        }
        catch (JSONException localJSONException)
        {
          je.e("Unable to get asset views information");
        }
        continue;
        localJSONObject4 = new JSONObject();
      }
      finally {}
      label334:
      localJSONObject4.put("width", 0);
      localJSONObject4.put("height", 0);
      localJSONObject4.put("x", a(arrayOfInt2[0] - arrayOfInt1[0]));
      localJSONObject4.put("y", a(arrayOfInt2[1] - arrayOfInt1[1]));
      localJSONObject4.put("relative_to", "ad_view");
    }
    return localJSONObject1;
  }
  
  private final void a(View paramView, JSONObject paramJSONObject1, JSONObject paramJSONObject2, JSONObject paramJSONObject3, JSONObject paramJSONObject4, String paramString, JSONObject paramJSONObject5, JSONObject paramJSONObject6)
  {
    n.b("Invalid call from a non-UI thread.");
    for (;;)
    {
      try
      {
        JSONObject localJSONObject1 = new JSONObject();
        localJSONObject1.put("ad", this.g);
        if (paramJSONObject2 != null) {
          localJSONObject1.put("asset_view_signal", paramJSONObject2);
        }
        if (paramJSONObject1 != null) {
          localJSONObject1.put("ad_view_signal", paramJSONObject1);
        }
        if (paramJSONObject5 != null) {
          localJSONObject1.put("click_signal", paramJSONObject5);
        }
        if (paramJSONObject3 != null) {
          localJSONObject1.put("scroll_view_signal", paramJSONObject3);
        }
        if (paramJSONObject4 != null) {
          localJSONObject1.put("lock_screen_signal", paramJSONObject4);
        }
        JSONObject localJSONObject2 = new JSONObject();
        localJSONObject2.put("asset_id", paramString);
        localJSONObject2.put("template", this.i.k());
        zzbv.zzem();
        localJSONObject2.put("is_privileged_process", jt.e());
        arq localarq = asa.ck;
        if ((((Boolean)aos.f().a(localarq)).booleanValue()) && (this.f.a() != null) && (this.g.optBoolean("custom_one_point_five_click_enabled", false))) {
          localJSONObject2.put("custom_one_point_five_click_eligible", true);
        }
        localJSONObject2.put("timestamp", zzbv.zzer().a());
        if (this.d.zzr(this.i.l()) != null)
        {
          bool1 = true;
          localJSONObject2.put("has_custom_click_handler", bool1);
          if (this.d.zzr(this.i.l()) == null) {
            break label443;
          }
          bool2 = true;
          localJSONObject1.put("has_custom_click_handler", bool2);
          try
          {
            JSONObject localJSONObject3 = this.g.optJSONObject("tracking_urls_and_actions");
            if (localJSONObject3 == null) {
              localJSONObject3 = new JSONObject();
            }
            String str = localJSONObject3.optString("click_string");
            localJSONObject2.put("click_signals", this.j.a().zza(this.e, str, paramView));
          }
          catch (Exception localException)
          {
            je.b("Exception obtaining click signals", localException);
            continue;
          }
          localJSONObject1.put("click", localJSONObject2);
          if (paramJSONObject6 != null) {
            localJSONObject1.put("provided_signals", paramJSONObject6);
          }
          localJSONObject1.put("ads_id", this.l);
          mr.a(this.h.b(localJSONObject1), "NativeAdEngineImpl.performClick");
          return;
        }
      }
      catch (JSONException localJSONException)
      {
        je.b("Unable to create click JSON.", localJSONException);
        return;
      }
      boolean bool1 = false;
      continue;
      label443:
      boolean bool2 = false;
    }
  }
  
  private final boolean a(String paramString)
  {
    if (this.g == null) {}
    for (JSONObject localJSONObject = null; localJSONObject == null; localJSONObject = this.g.optJSONObject("allow_pub_event_reporting")) {
      return false;
    }
    return localJSONObject.optBoolean(paramString, false);
  }
  
  private final boolean a(JSONObject paramJSONObject1, JSONObject paramJSONObject2, JSONObject paramJSONObject3, JSONObject paramJSONObject4, JSONObject paramJSONObject5)
  {
    n.b("Invalid call from a non-UI thread.");
    if (this.a) {
      return true;
    }
    this.a = true;
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("ad", this.g);
      localJSONObject.put("ads_id", this.l);
      if (paramJSONObject2 != null) {
        localJSONObject.put("asset_view_signal", paramJSONObject2);
      }
      if (paramJSONObject1 != null) {
        localJSONObject.put("ad_view_signal", paramJSONObject1);
      }
      if (paramJSONObject3 != null) {
        localJSONObject.put("scroll_view_signal", paramJSONObject3);
      }
      if (paramJSONObject4 != null) {
        localJSONObject.put("lock_screen_signal", paramJSONObject4);
      }
      if (paramJSONObject5 != null) {
        localJSONObject.put("provided_signals", paramJSONObject5);
      }
      mr.a(this.h.c(localJSONObject), "NativeAdEngineImpl.recordImpression");
      this.d.zza(this);
      this.d.zzbv();
      j();
      return true;
    }
    catch (JSONException localJSONException)
    {
      je.b("Unable to create impression JSON.", localJSONException);
    }
    return false;
  }
  
  private static boolean e(View paramView)
  {
    return (paramView.isShown()) && (paramView.getGlobalVisibleRect(new Rect(), null));
  }
  
  private static int[] f(View paramView)
  {
    int[] arrayOfInt = new int[2];
    paramView.getLocationOnScreen(arrayOfInt);
    return arrayOfInt;
  }
  
  private final JSONObject g(View paramView)
  {
    JSONObject localJSONObject1 = new JSONObject();
    if (paramView == null) {
      return localJSONObject1;
    }
    for (;;)
    {
      int[] arrayOfInt;
      try
      {
        arrayOfInt = f(paramView);
        JSONObject localJSONObject2 = new JSONObject();
        localJSONObject2.put("width", a(paramView.getMeasuredWidth()));
        localJSONObject2.put("height", a(paramView.getMeasuredHeight()));
        localJSONObject2.put("x", a(arrayOfInt[0]));
        localJSONObject2.put("y", a(arrayOfInt[1]));
        localJSONObject2.put("relative_to", "window");
        localJSONObject1.put("frame", localJSONObject2);
        Rect localRect = new Rect();
        if (paramView.getGlobalVisibleRect(localRect))
        {
          localJSONObject3 = a(localRect);
          localJSONObject1.put("visible_bounds", localJSONObject3);
          return localJSONObject1;
        }
      }
      catch (Exception localException)
      {
        je.e("Unable to get native ad view bounding box");
        return localJSONObject1;
      }
      JSONObject localJSONObject3 = new JSONObject();
      localJSONObject3.put("width", 0);
      localJSONObject3.put("height", 0);
      localJSONObject3.put("x", a(arrayOfInt[0]));
      localJSONObject3.put("y", a(arrayOfInt[1]));
      localJSONObject3.put("relative_to", "window");
    }
  }
  
  private static JSONObject h(View paramView)
  {
    JSONObject localJSONObject = new JSONObject();
    if (paramView == null) {
      return localJSONObject;
    }
    for (;;)
    {
      try
      {
        zzbv.zzek();
        if (jn.d(paramView) != -1)
        {
          bool = true;
          localJSONObject.put("contained_in_scroll_view", bool);
          return localJSONObject;
        }
      }
      catch (Exception localException)
      {
        return localJSONObject;
      }
      boolean bool = false;
    }
  }
  
  private final JSONObject i(View paramView)
  {
    JSONObject localJSONObject = new JSONObject();
    if (paramView == null) {
      return localJSONObject;
    }
    try
    {
      zzbv.zzek();
      localJSONObject.put("can_show_on_lock_screen", jn.c(paramView));
      zzbv.zzek();
      localJSONObject.put("is_keyguard_locked", jn.j(this.e));
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      je.e("Unable to get lock screen information");
    }
    return localJSONObject;
  }
  
  public View a(View.OnClickListener paramOnClickListener, boolean paramBoolean)
  {
    ata localata = this.i.m();
    if (localata == null) {
      return null;
    }
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
    if (!paramBoolean) {
      switch (localata.h())
      {
      case 1: 
      default: 
        localLayoutParams.addRule(10);
        localLayoutParams.addRule(11);
      }
    }
    for (;;)
    {
      atd localatd = new atd(this.e, localata, localLayoutParams);
      localatd.setOnClickListener(paramOnClickListener);
      arq localarq = asa.ce;
      localatd.setContentDescription((CharSequence)aos.f().a(localarq));
      return localatd;
      localLayoutParams.addRule(10);
      localLayoutParams.addRule(9);
      continue;
      localLayoutParams.addRule(12);
      localLayoutParams.addRule(9);
      continue;
      localLayoutParams.addRule(12);
      localLayoutParams.addRule(11);
    }
  }
  
  public final void a(MotionEvent paramMotionEvent)
  {
    this.j.a(paramMotionEvent);
  }
  
  public void a(View paramView)
  {
    arq localarq = asa.ck;
    if (!((Boolean)aos.f().a(localarq)).booleanValue()) {}
    atb localatb;
    do
    {
      return;
      if (!this.g.optBoolean("custom_one_point_five_click_enabled", false))
      {
        je.e("Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
        return;
      }
      localatb = this.f;
    } while (paramView == null);
    paramView.setOnClickListener(localatb);
    paramView.setClickable(true);
    localatb.c = new WeakReference(paramView);
  }
  
  public final void a(View paramView, ato paramato)
  {
    if (b(paramView, paramato)) {}
    label185:
    for (;;)
    {
      return;
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, -1);
      ((FrameLayout)paramView).removeAllViews();
      if ((this.i instanceof atu))
      {
        atu localatu = (atu)this.i;
        if ((localatu.b() != null) && (localatu.b().size() > 0))
        {
          Object localObject = localatu.b().get(0);
          if ((localObject instanceof IBinder)) {}
          for (aun localaun = auo.a((IBinder)localObject);; localaun = null) {
            for (;;)
            {
              if (localaun == null) {
                break label185;
              }
              try
              {
                a locala = localaun.a();
                if (locala == null) {
                  break;
                }
                Drawable localDrawable = (Drawable)b.a(locala);
                ImageView localImageView = new ImageView(this.e);
                localImageView.setImageDrawable(localDrawable);
                localImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                ((FrameLayout)paramView).addView(localImageView, localLayoutParams);
                return;
              }
              catch (RemoteException localRemoteException)
              {
                je.e("Could not get drawable from image");
                return;
              }
            }
          }
        }
      }
    }
  }
  
  public final void a(View paramView1, String paramString, Bundle paramBundle, Map<String, WeakReference<View>> paramMap, View paramView2)
  {
    JSONObject localJSONObject1 = a(paramMap, paramView2);
    JSONObject localJSONObject2 = g(paramView2);
    JSONObject localJSONObject3 = h(paramView2);
    JSONObject localJSONObject4 = i(paramView2);
    label95:
    for (;;)
    {
      try
      {
        JSONObject localJSONObject6 = zzbv.zzek().a(paramBundle, null);
        JSONObject localJSONObject5 = new JSONObject();
        je.b("Error occurred while grabbing click signals.", localException1);
      }
      catch (Exception localException1)
      {
        try
        {
          localJSONObject5.put("click_point", localJSONObject6);
          localJSONObject5.put("asset_id", paramString);
          a(paramView1, localJSONObject2, localJSONObject1, localJSONObject3, localJSONObject4, paramString, localJSONObject5, null);
          return;
        }
        catch (Exception localException2)
        {
          break label95;
        }
        localException1 = localException1;
        localJSONObject5 = null;
      }
    }
  }
  
  public void a(View paramView, Map<String, WeakReference<View>> paramMap)
  {
    a(g(paramView), a(paramMap, paramView), h(paramView), i(paramView), null);
  }
  
  public void a(View paramView1, Map<String, WeakReference<View>> paramMap, Bundle paramBundle, View paramView2)
  {
    n.b("Invalid call from a non-UI thread.");
    if (paramMap != null) {}
    try
    {
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        if (paramView1.equals((View)((WeakReference)localEntry.getValue()).get()))
        {
          a(paramView1, (String)localEntry.getKey(), paramBundle, paramMap, paramView2);
          return;
        }
      }
      if ("6".equals(this.i.k()))
      {
        a(paramView1, "3099", paramBundle, paramMap, paramView2);
        return;
      }
    }
    finally {}
    if ("2".equals(this.i.k()))
    {
      a(paramView1, "2099", paramBundle, paramMap, paramView2);
      return;
    }
    if ("1".equals(this.i.k())) {
      a(paramView1, "1099", paramBundle, paramMap, paramView2);
    }
  }
  
  public void a(View paramView, Map<String, WeakReference<View>> paramMap1, Map<String, WeakReference<View>> paramMap2, View.OnTouchListener paramOnTouchListener, View.OnClickListener paramOnClickListener)
  {
    arq localarq = asa.cb;
    if (!((Boolean)aos.f().a(localarq)).booleanValue()) {}
    do
    {
      return;
      paramView.setOnTouchListener(paramOnTouchListener);
      paramView.setClickable(true);
      paramView.setOnClickListener(paramOnClickListener);
      if (paramMap1 != null) {
        try
        {
          Iterator localIterator2 = paramMap1.entrySet().iterator();
          while (localIterator2.hasNext())
          {
            View localView2 = (View)((WeakReference)((Map.Entry)localIterator2.next()).getValue()).get();
            if (localView2 != null)
            {
              localView2.setOnTouchListener(paramOnTouchListener);
              localView2.setClickable(true);
              localView2.setOnClickListener(paramOnClickListener);
            }
          }
        }
        finally {}
      }
    } while (paramMap2 == null);
    try
    {
      Iterator localIterator1 = paramMap2.entrySet().iterator();
      while (localIterator1.hasNext())
      {
        View localView1 = (View)((WeakReference)((Map.Entry)localIterator1.next()).getValue()).get();
        if (localView1 != null) {
          localView1.setOnTouchListener(paramOnTouchListener);
        }
      }
    }
    finally {}
  }
  
  public void a(awh paramawh)
  {
    arq localarq = asa.ck;
    if (!((Boolean)aos.f().a(localarq)).booleanValue()) {
      return;
    }
    if (!this.g.optBoolean("custom_one_point_five_click_enabled", false))
    {
      je.e("Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
      return;
    }
    this.f.a(paramawh);
  }
  
  public final void a(Map<String, WeakReference<View>> paramMap)
  {
    if (this.i.o() != null)
    {
      if (!"2".equals(this.i.k())) {
        break label67;
      }
      zzbv.zzeo().l().a(this.d.getAdUnitId(), this.i.k(), paramMap.containsKey("2011"));
    }
    label67:
    while (!"1".equals(this.i.k())) {
      return;
    }
    zzbv.zzeo().l().a(this.d.getAdUnitId(), this.i.k(), paramMap.containsKey("1009"));
  }
  
  public boolean a()
  {
    ata localata = this.i.m();
    return (localata != null) && (localata.i());
  }
  
  public final boolean a(Bundle paramBundle)
  {
    if (!a("impression_reporting"))
    {
      je.c("The ad slot cannot handle external impression events. You must be whitelisted to whitelisted to be able to report your impression events.");
      return false;
    }
    return a(null, null, null, null, zzbv.zzek().a(paramBundle, null));
  }
  
  public final void b(Bundle paramBundle)
  {
    if (paramBundle == null)
    {
      je.b("Click data is null. No click is reported.");
      return;
    }
    if (!a("click_reporting"))
    {
      je.c("The ad slot cannot handle external click events. You must be whitelisted to be able to report your click events.");
      return;
    }
    a(null, null, null, null, null, paramBundle.getBundle("click_signal").getString("asset_id"), null, zzbv.zzek().a(paramBundle, null));
  }
  
  public final void b(View paramView)
  {
    arq localarq = asa.bG;
    if (!((Boolean)aos.f().a(localarq)).booleanValue()) {}
    ags localags;
    do
    {
      do
      {
        return;
      } while (this.j == null);
      localags = this.j.a();
    } while (localags == null);
    localags.zzb(paramView);
  }
  
  public void b(View paramView, Map<String, WeakReference<View>> paramMap)
  {
    arq localarq = asa.ca;
    if (((Boolean)aos.f().a(localarq)).booleanValue()) {}
    do
    {
      return;
      paramView.setOnTouchListener(null);
      paramView.setClickable(false);
      paramView.setOnClickListener(null);
    } while (paramMap == null);
    try
    {
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        View localView = (View)((WeakReference)((Map.Entry)localIterator.next()).getValue()).get();
        if (localView != null)
        {
          localView.setOnTouchListener(null);
          localView.setClickable(false);
          localView.setOnClickListener(null);
        }
      }
    }
    finally {}
  }
  
  public boolean b()
  {
    JSONObject localJSONObject = this.g;
    boolean bool1 = false;
    if (localJSONObject != null)
    {
      boolean bool2 = this.g.optBoolean("allow_pub_owned_ad_view", false);
      bool1 = false;
      if (bool2) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public final boolean b(View paramView, ato paramato)
  {
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
    View localView = this.i.o();
    if (localView != null)
    {
      ViewParent localViewParent = localView.getParent();
      if ((localViewParent instanceof ViewGroup)) {
        ((ViewGroup)localViewParent).removeView(localView);
      }
      ((FrameLayout)paramView).removeAllViews();
      ((FrameLayout)paramView).addView(localView, localLayoutParams);
      this.d.zza(paramato);
      return true;
    }
    return false;
  }
  
  public void c()
  {
    arq localarq = asa.ck;
    if (!((Boolean)aos.f().a(localarq)).booleanValue()) {
      return;
    }
    if (!this.g.optBoolean("custom_one_point_five_click_enabled", false))
    {
      je.e("Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
      return;
    }
    this.f.b();
  }
  
  public final void c(Bundle paramBundle)
  {
    if (paramBundle == null)
    {
      je.b("Touch event data is null. No touch event is reported.");
      return;
    }
    if (!a("touch_reporting"))
    {
      je.c("The ad slot cannot handle external touch events. You must be whitelisted to be able to report your touch events.");
      return;
    }
    int i1 = (int)paramBundle.getFloat("x");
    int i2 = (int)paramBundle.getFloat("y");
    int i3 = paramBundle.getInt("duration_ms");
    this.j.a().zza(i1, i2, i3);
  }
  
  public final void c(View paramView)
  {
    this.n = new WeakReference(paramView);
  }
  
  public final void c(View paramView, Map<String, WeakReference<View>> paramMap)
  {
    synchronized (this.c)
    {
      if (this.a) {
        return;
      }
      if (e(paramView))
      {
        a(paramView, paramMap);
        return;
      }
    }
    arq localarq = asa.cj;
    if ((((Boolean)aos.f().a(localarq)).booleanValue()) && (paramMap != null)) {}
    try
    {
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        View localView = (View)((WeakReference)((Map.Entry)localIterator.next()).getValue()).get();
        if ((localView != null) && (e(localView)))
        {
          a(paramView, paramMap);
          return;
        }
      }
      return;
    }
    finally {}
  }
  
  public void d()
  {
    n.b("Invalid call from a non-UI thread.");
    if (this.b) {
      return;
    }
    this.b = true;
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("ad", this.g);
      localJSONObject.put("ads_id", this.l);
      mr.a(this.h.d(localJSONObject), "NativeAdEngineImpl.recordDownloadedImpression");
      return;
    }
    catch (JSONException localJSONException)
    {
      mk.b("", localJSONException);
    }
  }
  
  public final void d(View paramView)
  {
    this.d.zzi(paramView);
  }
  
  public qe g()
  {
    JSONObject localJSONObject1 = this.g;
    qe localqe = null;
    if (localJSONObject1 != null)
    {
      JSONObject localJSONObject2 = this.g.optJSONObject("overlay");
      localqe = null;
      if (localJSONObject2 != null) {
        break label30;
      }
    }
    label30:
    do
    {
      return localqe;
      zzbv.zzel();
      Context localContext = this.e;
      zzjn localzzjn = zzjn.a(this.e);
      agw localagw = this.j;
      zzang localzzang = this.k;
      localqe = ql.a(localContext, rs.a(localzzjn), localzzjn.a, false, false, localagw, localzzang, null, null, null, amj.a());
    } while (localqe == null);
    localqe.getView().setVisibility(8);
    new atx(localqe).a(this.h);
    return localqe;
  }
  
  public void h()
  {
    this.h.a();
  }
  
  public void i()
  {
    this.d.zzct();
  }
  
  public void j()
  {
    this.d.zzcr();
  }
  
  public void k()
  {
    this.d.zzcs();
  }
  
  public final View l()
  {
    if (this.n != null) {
      return (View)this.n.get();
    }
    return null;
  }
  
  public final Context m()
  {
    return this.e;
  }
  
  public final hy n()
  {
    if (zzbv.zzfh().c(this.e))
    {
      if (this.m == null) {
        this.m = new hy(this.e, this.d.getAdUnitId());
      }
      return this.m;
    }
    return null;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.atv
 * JD-Core Version:    0.7.0.1
 */