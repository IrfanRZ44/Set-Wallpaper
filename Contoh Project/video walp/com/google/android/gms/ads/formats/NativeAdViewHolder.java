package com.google.android.gms.ads.formats;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.internal.ads.aoh;
import com.google.android.gms.internal.ads.aos;
import com.google.android.gms.internal.ads.aux;
import com.google.android.gms.internal.ads.mk;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public final class NativeAdViewHolder
{
  public static WeakHashMap<View, NativeAdViewHolder> zzvk = new WeakHashMap();
  private aux a;
  private WeakReference<View> b;
  
  public NativeAdViewHolder(View paramView, Map<String, View> paramMap1, Map<String, View> paramMap2)
  {
    n.a(paramView, "ContainerView must not be null");
    if (((paramView instanceof NativeAdView)) || ((paramView instanceof UnifiedNativeAdView)))
    {
      mk.c("The provided containerView is of type of NativeAdView, which cannot be usedwith NativeAdViewHolder.");
      return;
    }
    if (zzvk.get(paramView) != null)
    {
      mk.c("The provided containerView is already in use with another NativeAdViewHolder.");
      return;
    }
    zzvk.put(paramView, this);
    this.b = new WeakReference(paramView);
    HashMap localHashMap1 = a(paramMap1);
    HashMap localHashMap2 = a(paramMap2);
    this.a = aos.b().a(paramView, localHashMap1, localHashMap2);
  }
  
  private static HashMap<String, View> a(Map<String, View> paramMap)
  {
    if (paramMap == null) {
      return new HashMap();
    }
    return new HashMap(paramMap);
  }
  
  private final void a(a parama)
  {
    View localView;
    if (this.b != null)
    {
      localView = (View)this.b.get();
      if (localView != null) {
        break label33;
      }
      mk.e("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
    }
    label33:
    do
    {
      return;
      localView = null;
      break;
      if (!zzvk.containsKey(localView)) {
        zzvk.put(localView, this);
      }
    } while (this.a == null);
    try
    {
      this.a.a(parama);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.b("Unable to call setNativeAd on delegate", localRemoteException);
    }
  }
  
  public final void setClickConfirmingView(View paramView)
  {
    try
    {
      this.a.b(b.a(paramView));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.b("Unable to call setClickConfirmingView on delegate", localRemoteException);
    }
  }
  
  public final void setNativeAd(NativeAd paramNativeAd)
  {
    a((a)paramNativeAd.a());
  }
  
  public final void setNativeAd(UnifiedNativeAd paramUnifiedNativeAd)
  {
    a((a)paramUnifiedNativeAd.a());
  }
  
  public final void unregisterNativeAd()
  {
    if (this.a != null) {}
    try
    {
      this.a.a();
      if (this.b != null)
      {
        localView = (View)this.b.get();
        if (localView != null) {
          zzvk.remove(localView);
        }
        return;
      }
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        mk.b("Unable to call unregisterNativeAd on delegate", localRemoteException);
        continue;
        View localView = null;
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.formats.NativeAdViewHolder
 * JD-Core Version:    0.7.0.1
 */