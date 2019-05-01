package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.gmsg.zzv;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.zzbo;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.common.util.l;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public abstract interface qe
  extends zzbo, akk, ayy, azz, pd, ra, rb, rf, ri, rk, rl
{
  public abstract boolean A();
  
  public abstract boolean B();
  
  public abstract boolean C();
  
  public abstract void D();
  
  public abstract void E();
  
  public abstract ato F();
  
  public abstract void G();
  
  public abstract void H();
  
  public abstract void a(int paramInt);
  
  public abstract void a(Context paramContext);
  
  public abstract void a(zzd paramzzd);
  
  public abstract void a(ato paramato);
  
  public abstract void a(qu paramqu);
  
  public abstract void a(rs paramrs);
  
  public abstract void a(String paramString);
  
  public abstract void a(String paramString, zzv<? super qe> paramzzv);
  
  public abstract void a(String paramString, l<zzv<? super qe>> paraml);
  
  public abstract void a(String paramString1, String paramString2, String paramString3);
  
  public abstract qu b();
  
  public abstract void b(zzd paramzzd);
  
  public abstract void b(String paramString, zzv<? super qe> paramzzv);
  
  public abstract void b(boolean paramBoolean);
  
  public abstract void c(boolean paramBoolean);
  
  public abstract Activity d();
  
  public abstract void d(boolean paramBoolean);
  
  public abstract void destroy();
  
  public abstract zzw e();
  
  public abstract void e(boolean paramBoolean);
  
  public abstract Context getContext();
  
  public abstract int getHeight();
  
  public abstract ViewGroup.LayoutParams getLayoutParams();
  
  public abstract void getLocationOnScreen(int[] paramArrayOfInt);
  
  public abstract View.OnClickListener getOnClickListener();
  
  public abstract ViewParent getParent();
  
  public abstract int getRequestedOrientation();
  
  public abstract View getView();
  
  public abstract WebView getWebView();
  
  public abstract int getWidth();
  
  public abstract asm h();
  
  public abstract zzang i();
  
  public abstract void l();
  
  public abstract void loadData(String paramString1, String paramString2, String paramString3);
  
  public abstract void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5);
  
  public abstract void loadUrl(String paramString);
  
  public abstract void m();
  
  public abstract void measure(int paramInt1, int paramInt2);
  
  public abstract void n();
  
  public abstract Context o();
  
  public abstract void onPause();
  
  public abstract void onResume();
  
  public abstract zzd p();
  
  public abstract zzd q();
  
  public abstract rs r();
  
  public abstract String s();
  
  public abstract void setBackgroundColor(int paramInt);
  
  public abstract void setOnClickListener(View.OnClickListener paramOnClickListener);
  
  public abstract void setOnTouchListener(View.OnTouchListener paramOnTouchListener);
  
  public abstract void setRequestedOrientation(int paramInt);
  
  public abstract void setWebChromeClient(WebChromeClient paramWebChromeClient);
  
  public abstract void setWebViewClient(WebViewClient paramWebViewClient);
  
  public abstract void stopLoading();
  
  public abstract rm t();
  
  public abstract WebViewClient u();
  
  public abstract boolean v();
  
  public abstract agw w();
  
  public abstract boolean x();
  
  public abstract boolean y();
  
  public abstract void z();
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.qe
 * JD-Core Version:    0.7.0.1
 */