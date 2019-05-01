package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.impl.R.string;
import com.google.android.gms.ads.internal.gmsg.zzv;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.common.util.l;
import java.util.Map;
import org.json.JSONObject;

@cm
public final class qq
  extends FrameLayout
  implements qe
{
  private final qe a;
  private final ou b;
  
  public qq(qe paramqe)
  {
    super(paramqe.getContext());
    this.a = paramqe;
    this.b = new ou(paramqe.o(), this, this);
    addView(this.a.getView());
  }
  
  public final boolean A()
  {
    return this.a.A();
  }
  
  public final boolean B()
  {
    return this.a.B();
  }
  
  public final boolean C()
  {
    return this.a.C();
  }
  
  public final void D()
  {
    this.a.D();
  }
  
  public final void E()
  {
    this.a.E();
  }
  
  public final ato F()
  {
    return this.a.F();
  }
  
  public final void G()
  {
    setBackgroundColor(0);
    this.a.setBackgroundColor(0);
  }
  
  public final void H()
  {
    TextView localTextView = new TextView(getContext());
    Resources localResources = zzbv.zzeo().h();
    String str;
    GradientDrawable localGradientDrawable;
    if (localResources != null)
    {
      str = localResources.getString(R.string.s7);
      localTextView.setText(str);
      localTextView.setTextSize(15.0F);
      localTextView.setTextColor(-1);
      localTextView.setPadding(5, 0, 5, 0);
      localGradientDrawable = new GradientDrawable();
      localGradientDrawable.setShape(0);
      localGradientDrawable.setColor(-12303292);
      localGradientDrawable.setCornerRadius(8.0F);
      if (Build.VERSION.SDK_INT < 16) {
        break label128;
      }
      localTextView.setBackground(localGradientDrawable);
    }
    for (;;)
    {
      addView(localTextView, new FrameLayout.LayoutParams(-2, -2, 49));
      bringChildToFront(localTextView);
      return;
      str = "Test Ad";
      break;
      label128:
      localTextView.setBackgroundDrawable(localGradientDrawable);
    }
  }
  
  public final ou a()
  {
    return this.b;
  }
  
  public final void a(int paramInt)
  {
    this.a.a(paramInt);
  }
  
  public final void a(Context paramContext)
  {
    this.a.a(paramContext);
  }
  
  public final void a(zzc paramzzc)
  {
    this.a.a(paramzzc);
  }
  
  public final void a(zzd paramzzd)
  {
    this.a.a(paramzzd);
  }
  
  public final void a(akj paramakj)
  {
    this.a.a(paramakj);
  }
  
  public final void a(ato paramato)
  {
    this.a.a(paramato);
  }
  
  public final void a(qu paramqu)
  {
    this.a.a(paramqu);
  }
  
  public final void a(rs paramrs)
  {
    this.a.a(paramrs);
  }
  
  public final void a(String paramString)
  {
    this.a.a(paramString);
  }
  
  public final void a(String paramString, zzv<? super qe> paramzzv)
  {
    this.a.a(paramString, paramzzv);
  }
  
  public final void a(String paramString, l<zzv<? super qe>> paraml)
  {
    this.a.a(paramString, paraml);
  }
  
  public final void a(String paramString1, String paramString2, String paramString3)
  {
    this.a.a(paramString1, paramString2, paramString3);
  }
  
  public final void a(String paramString, Map<String, ?> paramMap)
  {
    this.a.a(paramString, paramMap);
  }
  
  public final void a(String paramString, JSONObject paramJSONObject)
  {
    this.a.a(paramString, paramJSONObject);
  }
  
  public final void a(boolean paramBoolean)
  {
    this.a.a(paramBoolean);
  }
  
  public final void a(boolean paramBoolean, int paramInt)
  {
    this.a.a(paramBoolean, paramInt);
  }
  
  public final void a(boolean paramBoolean, int paramInt, String paramString)
  {
    this.a.a(paramBoolean, paramInt, paramString);
  }
  
  public final void a(boolean paramBoolean, int paramInt, String paramString1, String paramString2)
  {
    this.a.a(paramBoolean, paramInt, paramString1, paramString2);
  }
  
  public final qu b()
  {
    return this.a.b();
  }
  
  public final void b(zzd paramzzd)
  {
    this.a.b(paramzzd);
  }
  
  public final void b(String paramString)
  {
    this.a.b(paramString);
  }
  
  public final void b(String paramString, zzv<? super qe> paramzzv)
  {
    this.a.b(paramString, paramzzv);
  }
  
  public final void b(String paramString, JSONObject paramJSONObject)
  {
    this.a.b(paramString, paramJSONObject);
  }
  
  public final void b(boolean paramBoolean)
  {
    this.a.b(paramBoolean);
  }
  
  public final asl c()
  {
    return this.a.c();
  }
  
  public final void c(boolean paramBoolean)
  {
    this.a.c(paramBoolean);
  }
  
  public final Activity d()
  {
    return this.a.d();
  }
  
  public final void d(boolean paramBoolean)
  {
    this.a.d(paramBoolean);
  }
  
  public final void destroy()
  {
    this.a.destroy();
  }
  
  public final zzw e()
  {
    return this.a.e();
  }
  
  public final void e(boolean paramBoolean)
  {
    this.a.e(paramBoolean);
  }
  
  public final void f()
  {
    this.a.f();
  }
  
  public final String g()
  {
    return this.a.g();
  }
  
  public final View.OnClickListener getOnClickListener()
  {
    return this.a.getOnClickListener();
  }
  
  public final int getRequestedOrientation()
  {
    return this.a.getRequestedOrientation();
  }
  
  public final View getView()
  {
    return this;
  }
  
  public final WebView getWebView()
  {
    return this.a.getWebView();
  }
  
  public final asm h()
  {
    return this.a.h();
  }
  
  public final zzang i()
  {
    return this.a.i();
  }
  
  public final int j()
  {
    return getMeasuredHeight();
  }
  
  public final int k()
  {
    return getMeasuredWidth();
  }
  
  public final void l()
  {
    this.a.l();
  }
  
  public final void loadData(String paramString1, String paramString2, String paramString3)
  {
    this.a.loadData(paramString1, paramString2, paramString3);
  }
  
  public final void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    this.a.loadDataWithBaseURL(paramString1, paramString2, paramString3, paramString4, paramString5);
  }
  
  public final void loadUrl(String paramString)
  {
    this.a.loadUrl(paramString);
  }
  
  public final void m()
  {
    this.a.m();
  }
  
  public final void n()
  {
    this.a.n();
  }
  
  public final Context o()
  {
    return this.a.o();
  }
  
  public final void onPause()
  {
    this.b.b();
    this.a.onPause();
  }
  
  public final void onResume()
  {
    this.a.onResume();
  }
  
  public final zzd p()
  {
    return this.a.p();
  }
  
  public final zzd q()
  {
    return this.a.q();
  }
  
  public final rs r()
  {
    return this.a.r();
  }
  
  public final String s()
  {
    return this.a.s();
  }
  
  public final void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.a.setOnClickListener(paramOnClickListener);
  }
  
  public final void setOnTouchListener(View.OnTouchListener paramOnTouchListener)
  {
    this.a.setOnTouchListener(paramOnTouchListener);
  }
  
  public final void setRequestedOrientation(int paramInt)
  {
    this.a.setRequestedOrientation(paramInt);
  }
  
  public final void setWebChromeClient(WebChromeClient paramWebChromeClient)
  {
    this.a.setWebChromeClient(paramWebChromeClient);
  }
  
  public final void setWebViewClient(WebViewClient paramWebViewClient)
  {
    this.a.setWebViewClient(paramWebViewClient);
  }
  
  public final void stopLoading()
  {
    this.a.stopLoading();
  }
  
  public final rm t()
  {
    return this.a.t();
  }
  
  public final WebViewClient u()
  {
    return this.a.u();
  }
  
  public final boolean v()
  {
    return this.a.v();
  }
  
  public final agw w()
  {
    return this.a.w();
  }
  
  public final boolean x()
  {
    return this.a.x();
  }
  
  public final boolean y()
  {
    return this.a.y();
  }
  
  public final void z()
  {
    this.b.c();
    this.a.z();
  }
  
  public final void zzcl()
  {
    this.a.zzcl();
  }
  
  public final void zzcm()
  {
    this.a.zzcm();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.qq
 * JD-Core Version:    0.7.0.1
 */