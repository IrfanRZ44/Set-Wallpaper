package com.admob.android.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import java.lang.ref.WeakReference;

public class AdView
  extends RelativeLayout
{
  static final Handler a = new Handler();
  private static Boolean b;
  private g c;
  private int d;
  private boolean e;
  private a f;
  private int g;
  private int h;
  private int i;
  private String j;
  private String k;
  private AdListener l;
  private boolean m;
  private boolean n = true;
  private boolean o;
  private long p;
  private d.a q;
  
  public AdView(Activity paramActivity)
  {
    this(paramActivity, null, 0);
  }
  
  public AdView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public AdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setDescendantFocusability(262144);
    setClickable(true);
    setLongClickable(false);
    setGravity(17);
    int i1;
    int i3;
    int i2;
    if (paramAttributeSet != null)
    {
      String str = "http://schemas.android.com/apk/res/" + paramContext.getPackageName();
      if (paramAttributeSet.getAttributeBooleanValue(str, "testing", false)) {
        Log.w("AdMobSDK", "AdView's \"testing\" XML attribute has been deprecated and will be ignored.  Please delete it from your XML layout and use AdManager.setTestDevices instead.");
      }
      int i4 = paramAttributeSet.getAttributeUnsignedIntValue(str, "backgroundColor", -16777216);
      int i5 = paramAttributeSet.getAttributeUnsignedIntValue(str, "textColor", -1);
      if (i5 >= 0) {
        setTextColor(i5);
      }
      int i6 = paramAttributeSet.getAttributeUnsignedIntValue(str, "primaryTextColor", -1);
      int i7 = paramAttributeSet.getAttributeUnsignedIntValue(str, "secondaryTextColor", -1);
      this.j = paramAttributeSet.getAttributeValue(str, "keywords");
      setRequestInterval(paramAttributeSet.getAttributeIntValue(str, "refreshInterval", 0));
      boolean bool = paramAttributeSet.getAttributeBooleanValue(str, "isGoneWithoutAd", false);
      if (bool) {
        setGoneWithoutAd(bool);
      }
      i1 = i7;
      i3 = i4;
      i2 = i6;
    }
    for (;;)
    {
      setBackgroundColor(i3);
      setPrimaryTextColor(i2);
      setSecondaryTextColor(i1);
      this.c = null;
      this.q = null;
      if (b == null) {
        b = Boolean.valueOf(a(paramContext));
      }
      if (b.booleanValue())
      {
        TextView localTextView = new TextView(paramContext, paramAttributeSet, paramInt);
        localTextView.setBackgroundColor(getBackgroundColor());
        localTextView.setTextColor(getPrimaryTextColor());
        localTextView.setPadding(10, 10, 10, 10);
        localTextView.setTextSize(16.0F);
        localTextView.setGravity(16);
        localTextView.setText("Ads by AdMob");
        addView(localTextView, new RelativeLayout.LayoutParams(-1, -1));
      }
      return;
      i1 = -1;
      i2 = -1;
      i3 = -16777216;
    }
  }
  
  private void a()
  {
    t.a(getContext());
    if ((!this.n) && (super.getVisibility() != 0)) {
      Log.w("AdMobSDK", "Cannot requestFreshAd() when the AdView is not visible.  Call AdView.setVisibility(View.VISIBLE) first.");
    }
    do
    {
      return;
      if (!this.o) {
        break;
      }
    } while (!Log.isLoggable("AdMobSDK", 5));
    Log.w("AdMobSDK", "Ignoring requestFreshAd() because we are requesting an ad right now already.");
    return;
    this.o = true;
    this.p = SystemClock.uptimeMillis();
    new a(this).start();
  }
  
  /* Error */
  private void a(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iload_1
    //   3: ifeq +102 -> 105
    //   6: aload_0
    //   7: getfield 299	com/admob/android/ads/AdView:d	I
    //   10: ifle +95 -> 105
    //   13: aload_0
    //   14: invokevirtual 300	com/admob/android/ads/AdView:getVisibility	()I
    //   17: ifne +88 -> 105
    //   20: aload_0
    //   21: getfield 299	com/admob/android/ads/AdView:d	I
    //   24: istore_3
    //   25: aload_0
    //   26: invokespecial 302	com/admob/android/ads/AdView:b	()V
    //   29: aload_0
    //   30: invokespecial 304	com/admob/android/ads/AdView:c	()Z
    //   33: ifeq +69 -> 102
    //   36: aload_0
    //   37: new 306	com/admob/android/ads/AdView$a
    //   40: dup
    //   41: aload_0
    //   42: invokespecial 307	com/admob/android/ads/AdView$a:<init>	(Lcom/admob/android/ads/AdView;)V
    //   45: putfield 309	com/admob/android/ads/AdView:f	Lcom/admob/android/ads/AdView$a;
    //   48: getstatic 40	com/admob/android/ads/AdView:a	Landroid/os/Handler;
    //   51: aload_0
    //   52: getfield 309	com/admob/android/ads/AdView:f	Lcom/admob/android/ads/AdView$a;
    //   55: iload_3
    //   56: i2l
    //   57: invokevirtual 313	android/os/Handler:postDelayed	(Ljava/lang/Runnable;J)Z
    //   60: pop
    //   61: ldc 91
    //   63: iconst_3
    //   64: invokestatic 222	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   67: ifeq +35 -> 102
    //   70: ldc 91
    //   72: new 65	java/lang/StringBuilder
    //   75: dup
    //   76: invokespecial 66	java/lang/StringBuilder:<init>	()V
    //   79: ldc_w 315
    //   82: invokevirtual 72	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   85: iload_3
    //   86: invokevirtual 318	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   89: ldc_w 320
    //   92: invokevirtual 72	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   95: invokevirtual 81	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   98: invokestatic 322	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   101: pop
    //   102: aload_0
    //   103: monitorexit
    //   104: return
    //   105: iload_1
    //   106: ifeq +10 -> 116
    //   109: aload_0
    //   110: getfield 299	com/admob/android/ads/AdView:d	I
    //   113: ifne -11 -> 102
    //   116: aload_0
    //   117: invokespecial 302	com/admob/android/ads/AdView:b	()V
    //   120: goto -18 -> 102
    //   123: astore_2
    //   124: aload_0
    //   125: monitorexit
    //   126: aload_2
    //   127: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	128	0	this	AdView
    //   0	128	1	paramBoolean	boolean
    //   123	4	2	localObject	Object
    //   24	62	3	i1	int
    // Exception table:
    //   from	to	target	type
    //   6	102	123	finally
    //   102	104	123	finally
    //   109	116	123	finally
    //   116	120	123	finally
    //   124	126	123	finally
  }
  
  private static boolean a(Context paramContext)
  {
    try
    {
      Class localClass = Class.forName("org.json.JSONException");
      if (localClass != null) {
        return false;
      }
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      if (AdManager.getUserId(paramContext) == null) {
        return true;
      }
    }
    return false;
  }
  
  private void b()
  {
    if (this.f != null)
    {
      this.f.a = true;
      this.f = null;
      if (Log.isLoggable("AdMobSDK", 2)) {
        Log.v("AdMobSDK", "Cancelled an ad refresh scheduled for the future.");
      }
    }
  }
  
  private boolean c()
  {
    if (this.c != null)
    {
      d locald = this.c.b();
      if ((locald != null) && (locald.d()) && (this.c.g() < 120L))
      {
        if (Log.isLoggable("AdMobSDK", 3)) {
          Log.d("AdMobSDK", "Cannot refresh CPM ads.  Ignoring request to refresh the ad.");
        }
        return false;
      }
    }
    return true;
  }
  
  final void a(d paramd, g paramg)
  {
    int i1 = super.getVisibility();
    double d1 = paramd.a();
    if (d1 >= 0.0D)
    {
      this.e = true;
      setRequestInterval((int)d1);
      a(true);
    }
    for (;;)
    {
      boolean bool = this.n;
      if (bool) {
        this.n = false;
      }
      paramg.a(paramd);
      paramg.setVisibility(i1);
      paramg.setGravity(17);
      paramd.a(paramg);
      paramg.setLayoutParams(new RelativeLayout.LayoutParams(paramd.a(paramd.e()), paramd.a(paramd.f())));
      a.post(new b(this, paramg, i1, bool));
      return;
      this.e = false;
    }
  }
  
  public void cleanup()
  {
    if (this.c != null)
    {
      this.c.d();
      this.c = null;
    }
  }
  
  public AdListener getAdListener()
  {
    return this.l;
  }
  
  public int getBackgroundColor()
  {
    return this.g;
  }
  
  public String getKeywords()
  {
    return this.j;
  }
  
  public int getPrimaryTextColor()
  {
    return this.h;
  }
  
  public int getRequestInterval()
  {
    return this.d / 1000;
  }
  
  public String getSearchQuery()
  {
    return this.k;
  }
  
  public int getSecondaryTextColor()
  {
    return this.i;
  }
  
  @Deprecated
  public int getTextColor()
  {
    Log.w("AdMobSDK", "Calling the deprecated method getTextColor!  Please use getPrimaryTextColor and getSecondaryTextColor instead.");
    return getPrimaryTextColor();
  }
  
  public boolean hasAd()
  {
    return (this.c != null) && (this.c.b() != null);
  }
  
  @Deprecated
  public boolean isGoneWithoutAd()
  {
    Log.w("AdMobSDK", "Deprecated method isGoneWithoutAd was called.  See JavaDoc for instructions to remove.");
    return false;
  }
  
  protected void onAttachedToWindow()
  {
    this.m = true;
    a(true);
    super.onAttachedToWindow();
  }
  
  protected void onDetachedFromWindow()
  {
    this.m = false;
    a(false);
    super.onDetachedFromWindow();
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    int i1 = View.MeasureSpec.getSize(paramInt1);
    int i2 = View.MeasureSpec.getMode(paramInt1);
    int i3 = View.MeasureSpec.getSize(paramInt2);
    int i4 = View.MeasureSpec.getMode(paramInt2);
    int i5;
    int i6;
    if ((i2 == -2147483648) || (i2 == 1073741824))
    {
      i5 = i1;
      if (i4 != 1073741824) {
        break label244;
      }
      i6 = i3;
    }
    for (;;)
    {
      setMeasuredDimension(i5, i6);
      if (Log.isLoggable("AdMobSDK", 2))
      {
        Log.v("AdMobSDK", "AdView.onMeasure:  widthSize " + i1 + " heightSize " + i3);
        Log.v("AdMobSDK", "AdView.onMeasure:  measuredWidth " + i5 + " measuredHeight " + i6);
      }
      int i7 = getMeasuredWidth();
      int i8 = getMeasuredHeight();
      if (Log.isLoggable("AdMobSDK", 3)) {
        Log.d("AdMobSDK", "AdView size is " + i7 + " by " + i8);
      }
      if ((this.n) && (!b.booleanValue())) {
        a();
      }
      return;
      i5 = AdManager.getScreenWidth(getContext());
      break;
      label244:
      if (this.c != null)
      {
        d locald = this.c.b();
        if (locald != null)
        {
          int i9 = locald.a(locald.f());
          if ((i4 == -2147483648) && (i3 < i9))
          {
            Log.w("AdMobSDK", "Cannot display ad because its container is too small.  The ad is " + i9 + " pixels tall but is only given " + i3 + " at most to draw into.  Please make your view containing AdView taller.");
            i6 = 0;
            continue;
          }
          i6 = i9;
          continue;
        }
      }
      i6 = 0;
    }
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    a(paramBoolean);
  }
  
  protected void onWindowVisibilityChanged(int paramInt)
  {
    if (paramInt == 0) {}
    for (boolean bool = true;; bool = false)
    {
      a(bool);
      return;
    }
  }
  
  public void requestFreshAd()
  {
    if (this.e) {
      if (Log.isLoggable("AdMobSDK", 3)) {
        Log.d("AdMobSDK", "Request interval overridden by the server.  Ignoring requestFreshAd.");
      }
    }
    do
    {
      long l1;
      do
      {
        return;
        l1 = (SystemClock.uptimeMillis() - this.p) / 1000L;
        if ((l1 <= 0L) || (l1 >= 13L)) {
          break;
        }
      } while (!Log.isLoggable("AdMobSDK", 3));
      Log.d("AdMobSDK", "Ignoring requestFreshAd.  Called " + l1 + " seconds since last refresh.  " + "Refreshes must be at least " + 13 + " apart.");
      return;
    } while (!c());
    a();
  }
  
  public void setAdListener(AdListener paramAdListener)
  {
    try
    {
      this.l = paramAdListener;
      return;
    }
    finally {}
  }
  
  public void setBackgroundColor(int paramInt)
  {
    this.g = (0xFF000000 | paramInt);
    invalidate();
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    if (paramBoolean)
    {
      setVisibility(0);
      return;
    }
    setVisibility(8);
  }
  
  @Deprecated
  public void setGoneWithoutAd(boolean paramBoolean)
  {
    Log.w("AdMobSDK", "Deprecated method setGoneWithoutAd was called.  See JavaDoc for instructions to remove.");
  }
  
  public void setKeywords(String paramString)
  {
    this.j = paramString;
  }
  
  public void setPrimaryTextColor(int paramInt)
  {
    this.h = (0xFF000000 | paramInt);
  }
  
  public void setRequestInterval(int paramInt)
  {
    int i1 = paramInt * 1000;
    if (this.d != i1) {
      if (paramInt > 0)
      {
        if (paramInt >= 13) {
          break label111;
        }
        Log.w("AdMobSDK", "AdView.setRequestInterval(" + paramInt + ") seconds must be >= " + 13);
        i1 = 13000;
      }
    }
    for (;;)
    {
      this.d = i1;
      if (paramInt <= 0) {
        b();
      }
      Log.i("AdMobSDK", "Requesting fresh ads every " + paramInt + " seconds.");
      return;
      label111:
      if (paramInt > 600)
      {
        Log.w("AdMobSDK", "AdView.setRequestInterval(" + paramInt + ") seconds must be <= " + 600);
        i1 = 600000;
      }
    }
  }
  
  public void setSearchQuery(String paramString)
  {
    this.k = paramString;
  }
  
  public void setSecondaryTextColor(int paramInt)
  {
    this.i = (0xFF000000 | paramInt);
  }
  
  @Deprecated
  public void setTextColor(int paramInt)
  {
    Log.w("AdMobSDK", "Calling the deprecated method setTextColor!  Please use setPrimaryTextColor and setSecondaryTextColor instead.");
    setPrimaryTextColor(paramInt);
    setSecondaryTextColor(paramInt);
  }
  
  public void setVisibility(int paramInt)
  {
    if (super.getVisibility() != paramInt) {}
    for (;;)
    {
      try
      {
        int i1 = getChildCount();
        int i2 = 0;
        if (i2 < i1)
        {
          getChildAt(i2).setVisibility(paramInt);
          i2++;
          continue;
        }
        super.setVisibility(paramInt);
        invalidate();
        if (paramInt == 0)
        {
          bool = true;
          a(bool);
          return;
        }
      }
      finally {}
      boolean bool = false;
    }
  }
  
  private static final class a
    implements Runnable
  {
    boolean a;
    private WeakReference<AdView> b;
    
    public a(AdView paramAdView)
    {
      this.b = new WeakReference(paramAdView);
    }
    
    public final void run()
    {
      try
      {
        AdView localAdView = (AdView)this.b.get();
        if ((!this.a) && (localAdView != null))
        {
          if (Log.isLoggable("AdMobSDK", 3))
          {
            int i = AdView.h(localAdView) / 1000;
            if (Log.isLoggable("AdMobSDK", 3)) {
              Log.d("AdMobSDK", "Requesting a fresh ad because a request interval passed (" + i + " seconds).");
            }
          }
          AdView.i(localAdView);
        }
        return;
      }
      catch (Exception localException)
      {
        while (!Log.isLoggable("AdMobSDK", 6)) {}
        Log.e("AdMobSDK", "exception caught in RefreshHandler.run(), " + localException.getMessage());
      }
    }
  }
  
  private static final class b
    implements Runnable
  {
    private WeakReference<AdView> a;
    private WeakReference<g> b;
    private int c;
    private boolean d;
    
    public b(AdView paramAdView, g paramg, int paramInt, boolean paramBoolean)
    {
      this.a = new WeakReference(paramAdView);
      this.b = new WeakReference(paramg);
      this.c = paramInt;
      this.d = paramBoolean;
    }
    
    public final void run()
    {
      AdView localAdView;
      g localg;
      try
      {
        localAdView = (AdView)this.a.get();
        localg = (g)this.b.get();
        if ((localAdView == null) || (localg == null)) {
          return;
        }
        localAdView.addView(localg);
        AdView.a(localAdView, localg.b());
        if (this.c == 0)
        {
          if (this.d)
          {
            AdView.a(localAdView, localg);
            return;
          }
          AdView.b(localAdView, localg);
          return;
        }
      }
      catch (Exception localException)
      {
        Log.e("AdMobSDK", "Unhandled exception placing AdContainer into AdView.", localException);
        return;
      }
      AdView.c(localAdView, localg);
    }
  }
  
  private static final class c
    implements Runnable
  {
    private WeakReference<AdView> a;
    private WeakReference<g> b;
    
    public c(g paramg, AdView paramAdView)
    {
      this.b = new WeakReference(paramg);
      this.a = new WeakReference(paramAdView);
    }
    
    public final void run()
    {
      try
      {
        final AdView localAdView = (AdView)this.a.get();
        final g localg1 = (g)this.b.get();
        if ((localAdView != null) && (localg1 != null))
        {
          final g localg2 = AdView.a(localAdView);
          if (localg2 != null) {
            localg2.setVisibility(8);
          }
          localg1.setVisibility(0);
          j localj = new j(90.0F, 0.0F, localAdView.getWidth() / 2.0F, localAdView.getHeight() / 2.0F, -0.4F * localAdView.getWidth(), false);
          localj.setDuration(700L);
          localj.setFillAfter(true);
          localj.setInterpolator(new DecelerateInterpolator());
          localj.setAnimationListener(new Animation.AnimationListener()
          {
            public final void onAnimationEnd(Animation paramAnonymousAnimation)
            {
              if (localg2 != null) {
                localAdView.removeView(localg2);
              }
              AdView.c(localAdView, localg1);
              if (localg2 != null) {
                localg2.d();
              }
            }
            
            public final void onAnimationRepeat(Animation paramAnonymousAnimation) {}
            
            public final void onAnimationStart(Animation paramAnonymousAnimation) {}
          });
          localAdView.startAnimation(localj);
        }
        return;
      }
      catch (Exception localException)
      {
        while (!Log.isLoggable("AdMobSDK", 6)) {}
        Log.e("AdMobSDK", "exception caught in SwapViews.run(), " + localException.getMessage());
      }
    }
  }
  
  private static final class d
    implements Runnable
  {
    private WeakReference<AdView> a;
    
    public d(AdView paramAdView)
    {
      this.a = new WeakReference(paramAdView);
    }
    
    public final void run()
    {
      AdView localAdView = (AdView)this.a.get();
      if ((localAdView == null) || ((AdView.a(localAdView) == null) || (AdView.a(localAdView).getParent() == null))) {
        try
        {
          AdView.b(localAdView).onFailedToReceiveAd(localAdView);
          return;
        }
        catch (Exception localException1)
        {
          Log.w("AdMobSDK", "Unhandled exception raised in your AdListener.onFailedToReceiveAd.", localException1);
          return;
        }
      }
      try
      {
        AdView.b(localAdView).onFailedToReceiveRefreshedAd(localAdView);
        return;
      }
      catch (Exception localException2)
      {
        Log.w("AdMobSDK", "Unhandled exception raised in your AdListener.onFailedToReceiveRefreshedAd.", localException2);
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\Video 2\classes_dex2jar.jar
 * Qualified Name:     com.admob.android.ads.AdView
 * JD-Core Version:    0.7.0.1
 */