package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.util.c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public final class op
  extends FrameLayout
  implements om
{
  private final pd a;
  private final FrameLayout b;
  private final asn c;
  private final pf d;
  private final long e;
  private on f;
  private boolean g;
  private boolean h;
  private boolean i;
  private boolean j;
  private long k;
  private long l;
  private String m;
  private Bitmap n;
  private ImageView o;
  private boolean p;
  
  public op(Context paramContext, pd parampd, int paramInt, boolean paramBoolean, asn paramasn, pc parampc)
  {
    super(paramContext);
    this.a = parampd;
    this.c = paramasn;
    this.b = new FrameLayout(paramContext);
    addView(this.b, new FrameLayout.LayoutParams(-1, -1));
    b.a(parampd.e());
    this.f = parampd.e().zzwz.a(paramContext, parampd, paramInt, paramBoolean, paramasn, parampc);
    if (this.f != null)
    {
      this.b.addView(this.f, new FrameLayout.LayoutParams(-1, -1, 17));
      arq localarq3 = asa.w;
      if (((Boolean)aos.f().a(localarq3)).booleanValue()) {
        m();
      }
    }
    this.o = new ImageView(paramContext);
    arq localarq1 = asa.A;
    this.e = ((Long)aos.f().a(localarq1)).longValue();
    arq localarq2 = asa.y;
    this.j = ((Boolean)aos.f().a(localarq2)).booleanValue();
    asn localasn;
    if (this.c != null)
    {
      localasn = this.c;
      if (!this.j) {
        break label268;
      }
    }
    label268:
    for (String str = "1";; str = "0")
    {
      localasn.a("spinner_used", str);
      this.d = new pf(this);
      if (this.f != null) {
        this.f.a(this);
      }
      if (this.f == null) {
        a("AdVideoUnderlay Error", "Allocating player failed.");
      }
      return;
    }
  }
  
  public static void a(pd parampd)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("event", "no_video_view");
    parampd.a("onVideoEvent", localHashMap);
  }
  
  public static void a(pd parampd, String paramString)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("event", "decoderProps");
    localHashMap.put("error", paramString);
    parampd.a("onVideoEvent", localHashMap);
  }
  
  public static void a(pd parampd, Map<String, List<Map<String, Object>>> paramMap)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("event", "decoderProps");
    localHashMap.put("mimeTypes", paramMap);
    parampd.a("onVideoEvent", localHashMap);
  }
  
  private final void a(String paramString, String... paramVarArgs)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("event", paramString);
    int i1 = paramVarArgs.length;
    int i2 = 0;
    Object localObject = null;
    if (i2 < i1)
    {
      String str = paramVarArgs[i2];
      if (localObject == null) {}
      for (;;)
      {
        i2++;
        localObject = str;
        break;
        localHashMap.put(localObject, str);
        str = null;
      }
    }
    this.a.a("onVideoEvent", localHashMap);
  }
  
  private final boolean p()
  {
    return this.o.getParent() != null;
  }
  
  private final void q()
  {
    if (this.a.d() == null) {}
    while ((!this.h) || (this.i)) {
      return;
    }
    this.a.d().getWindow().clearFlags(128);
    this.h = false;
  }
  
  public final void a()
  {
    this.d.b();
    jn.a.post(new or(this));
  }
  
  public final void a(float paramFloat1, float paramFloat2)
  {
    if (this.f != null) {
      this.f.a(paramFloat1, paramFloat2);
    }
  }
  
  public final void a(int paramInt)
  {
    if (this.f == null) {
      return;
    }
    this.f.a(paramInt);
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    if (this.j)
    {
      arq localarq1 = asa.z;
      int i1 = Math.max(paramInt1 / ((Integer)aos.f().a(localarq1)).intValue(), 1);
      arq localarq2 = asa.z;
      int i2 = Math.max(paramInt2 / ((Integer)aos.f().a(localarq2)).intValue(), 1);
      if ((this.n == null) || (this.n.getWidth() != i1) || (this.n.getHeight() != i2))
      {
        this.n = Bitmap.createBitmap(i1, i2, Bitmap.Config.ARGB_8888);
        this.p = false;
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt3 == 0) || (paramInt4 == 0)) {
      return;
    }
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(paramInt3, paramInt4);
    localLayoutParams.setMargins(paramInt1, paramInt2, 0, 0);
    this.b.setLayoutParams(localLayoutParams);
    requestLayout();
  }
  
  @TargetApi(14)
  public final void a(MotionEvent paramMotionEvent)
  {
    if (this.f == null) {
      return;
    }
    this.f.dispatchTouchEvent(paramMotionEvent);
  }
  
  public final void a(String paramString)
  {
    this.m = paramString;
  }
  
  public final void a(String paramString1, String paramString2)
  {
    a("error", new String[] { "what", paramString1, "extra", paramString2 });
  }
  
  public final void b()
  {
    if (this.f == null) {}
    while (this.l != 0L) {
      return;
    }
    float f1 = this.f.getDuration() / 1000.0F;
    int i1 = this.f.getVideoWidth();
    int i2 = this.f.getVideoHeight();
    String[] arrayOfString = new String[6];
    arrayOfString[0] = "duration";
    arrayOfString[1] = String.valueOf(f1);
    arrayOfString[2] = "videoWidth";
    arrayOfString[3] = String.valueOf(i1);
    arrayOfString[4] = "videoHeight";
    arrayOfString[5] = String.valueOf(i2);
    a("canplaythrough", arrayOfString);
  }
  
  public final void c()
  {
    if ((this.a.d() != null) && (!this.h)) {
      if ((0x80 & this.a.d().getWindow().getAttributes().flags) == 0) {
        break label87;
      }
    }
    label87:
    for (boolean bool = true;; bool = false)
    {
      this.i = bool;
      if (!this.i)
      {
        this.a.d().getWindow().addFlags(128);
        this.h = true;
      }
      this.g = true;
      return;
    }
  }
  
  public final void d()
  {
    a("pause", new String[0]);
    q();
    this.g = false;
  }
  
  public final void e()
  {
    a("ended", new String[0]);
    q();
  }
  
  public final void f()
  {
    if ((this.p) && (this.n != null) && (!p()))
    {
      this.o.setImageBitmap(this.n);
      this.o.invalidate();
      this.b.addView(this.o, new FrameLayout.LayoutParams(-1, -1));
      this.b.bringChildToFront(this.o);
    }
    this.d.a();
    this.l = this.k;
    jn.a.post(new os(this));
  }
  
  public final void finalize()
  {
    try
    {
      this.d.a();
      if (this.f != null)
      {
        on localon = this.f;
        Executor localExecutor = nk.a;
        localon.getClass();
        localExecutor.execute(oq.a(localon));
      }
      return;
    }
    finally
    {
      super.finalize();
    }
  }
  
  public final void g()
  {
    if ((this.g) && (p())) {
      this.b.removeView(this.o);
    }
    if (this.n != null)
    {
      long l1 = zzbv.zzer().b();
      if (this.f.getBitmap(this.n) != null) {
        this.p = true;
      }
      long l2 = zzbv.zzer().b() - l1;
      if (je.a()) {
        je.a(46 + "Spinner frame grab took " + l2 + "ms");
      }
      if (l2 > this.e)
      {
        je.e("Spinner frame grab crossed jank threshold! Suspending spinner.");
        this.j = false;
        this.n = null;
        if (this.c != null) {
          this.c.a("spinner_jank", Long.toString(l2));
        }
      }
    }
  }
  
  public final void h()
  {
    if (this.f == null) {
      return;
    }
    if (!TextUtils.isEmpty(this.m))
    {
      this.f.setVideoPath(this.m);
      return;
    }
    a("no_src", new String[0]);
  }
  
  public final void i()
  {
    if (this.f == null) {
      return;
    }
    this.f.d();
  }
  
  public final void j()
  {
    if (this.f == null) {
      return;
    }
    this.f.c();
  }
  
  public final void k()
  {
    if (this.f == null) {
      return;
    }
    on localon = this.f;
    localon.b.a(true);
    localon.e();
  }
  
  public final void l()
  {
    if (this.f == null) {
      return;
    }
    on localon = this.f;
    localon.b.a(false);
    localon.e();
  }
  
  @TargetApi(14)
  public final void m()
  {
    if (this.f == null) {
      return;
    }
    TextView localTextView = new TextView(this.f.getContext());
    String str1 = String.valueOf(this.f.a());
    if (str1.length() != 0) {}
    for (String str2 = "AdMob - ".concat(str1);; str2 = new String("AdMob - "))
    {
      localTextView.setText(str2);
      localTextView.setTextColor(-65536);
      localTextView.setBackgroundColor(-256);
      this.b.addView(localTextView, new FrameLayout.LayoutParams(-2, -2, 17));
      this.b.bringChildToFront(localTextView);
      return;
    }
  }
  
  public final void n()
  {
    this.d.a();
    if (this.f != null) {
      this.f.b();
    }
    q();
  }
  
  final void o()
  {
    if (this.f == null) {}
    long l1;
    do
    {
      return;
      l1 = this.f.getCurrentPosition();
    } while ((this.k == l1) || (l1 <= 0L));
    float f1 = (float)l1 / 1000.0F;
    String[] arrayOfString = new String[2];
    arrayOfString[0] = "time";
    arrayOfString[1] = String.valueOf(f1);
    a("timeupdate", arrayOfString);
    this.k = l1;
  }
  
  public final void onWindowVisibilityChanged(int paramInt)
  {
    if (paramInt == 0) {
      this.d.b();
    }
    for (boolean bool = true;; bool = false)
    {
      jn.a.post(new ot(this, bool));
      return;
      this.d.a();
      this.l = this.k;
    }
  }
  
  public final void setVolume(float paramFloat)
  {
    if (this.f == null) {
      return;
    }
    on localon = this.f;
    localon.b.a(paramFloat);
    localon.e();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.op
 * JD-Core Version:    0.7.0.1
 */