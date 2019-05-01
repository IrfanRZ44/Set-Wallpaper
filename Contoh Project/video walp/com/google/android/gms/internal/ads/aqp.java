package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import java.util.concurrent.atomic.AtomicBoolean;

@cm
public final class aqp
{
  private final bcj a = new bcj();
  private final aoe b;
  private final AtomicBoolean c;
  private final VideoController d = new VideoController();
  private final aou e = new aqq(this);
  private anw f;
  private AdListener g;
  private AdSize[] h;
  private AppEventListener i;
  private Correlator j;
  private apj k;
  private OnCustomRenderedAdLoadedListener l;
  private VideoOptions m;
  private String n;
  private ViewGroup o;
  private int p;
  private boolean q;
  
  public aqp(ViewGroup paramViewGroup)
  {
    this(paramViewGroup, null, false, aoe.a, 0);
  }
  
  public aqp(ViewGroup paramViewGroup, int paramInt)
  {
    this(paramViewGroup, null, false, aoe.a, paramInt);
  }
  
  public aqp(ViewGroup paramViewGroup, AttributeSet paramAttributeSet, boolean paramBoolean)
  {
    this(paramViewGroup, paramAttributeSet, paramBoolean, aoe.a, 0);
  }
  
  public aqp(ViewGroup paramViewGroup, AttributeSet paramAttributeSet, boolean paramBoolean, int paramInt)
  {
    this(paramViewGroup, paramAttributeSet, false, aoe.a, paramInt);
  }
  
  private aqp(ViewGroup paramViewGroup, AttributeSet paramAttributeSet, boolean paramBoolean, aoe paramaoe, int paramInt)
  {
    this(paramViewGroup, paramAttributeSet, paramBoolean, paramaoe, null, paramInt);
  }
  
  private aqp(ViewGroup paramViewGroup, AttributeSet paramAttributeSet, boolean paramBoolean, aoe paramaoe, apj paramapj, int paramInt)
  {
    this.o = paramViewGroup;
    this.b = paramaoe;
    this.k = null;
    this.c = new AtomicBoolean(false);
    this.p = paramInt;
    Context localContext;
    if (paramAttributeSet != null) {
      localContext = paramViewGroup.getContext();
    }
    try
    {
      zzjq localzzjq = new zzjq(localContext, paramAttributeSet);
      this.h = localzzjq.a(paramBoolean);
      this.n = localzzjq.a();
      if (paramViewGroup.isInEditMode())
      {
        lz locallz = aos.a();
        AdSize localAdSize = this.h[0];
        int i1 = this.p;
        zzjn localzzjn = new zzjn(localContext, localAdSize);
        localzzjn.j = a(i1);
        locallz.a(paramViewGroup, localzzjn, "Ads by Google");
      }
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      aos.a().a(paramViewGroup, new zzjn(localContext, AdSize.BANNER), localIllegalArgumentException.getMessage(), localIllegalArgumentException.getMessage());
    }
  }
  
  private static zzjn a(Context paramContext, AdSize[] paramArrayOfAdSize, int paramInt)
  {
    zzjn localzzjn = new zzjn(paramContext, paramArrayOfAdSize);
    localzzjn.j = a(paramInt);
    return localzzjn;
  }
  
  private static boolean a(int paramInt)
  {
    return paramInt == 1;
  }
  
  public final void a()
  {
    try
    {
      if (this.k != null) {
        this.k.destroy();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void a(AdListener paramAdListener)
  {
    this.g = paramAdListener;
    this.e.a(paramAdListener);
  }
  
  public final void a(Correlator paramCorrelator)
  {
    this.j = paramCorrelator;
    try
    {
      if (this.k != null)
      {
        apj localapj = this.k;
        if (this.j == null) {}
        aot localaot;
        for (Object localObject = null;; localObject = localaot)
        {
          localapj.zza((apy)localObject);
          return;
          localaot = this.j.zzaz();
        }
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void a(VideoOptions paramVideoOptions)
  {
    this.m = paramVideoOptions;
    try
    {
      if (this.k != null)
      {
        apj localapj = this.k;
        if (paramVideoOptions == null) {}
        for (zzmu localzzmu = null;; localzzmu = new zzmu(paramVideoOptions))
        {
          localapj.zza(localzzmu);
          return;
        }
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void a(AppEventListener paramAppEventListener)
  {
    try
    {
      this.i = paramAppEventListener;
      apj localapj;
      if (this.k != null)
      {
        localapj = this.k;
        if (paramAppEventListener == null) {
          break label40;
        }
      }
      label40:
      for (aog localaog = new aog(paramAppEventListener);; localaog = null)
      {
        localapj.zza(localaog);
        return;
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void a(OnCustomRenderedAdLoadedListener paramOnCustomRenderedAdLoadedListener)
  {
    this.l = paramOnCustomRenderedAdLoadedListener;
    try
    {
      apj localapj;
      if (this.k != null)
      {
        localapj = this.k;
        if (paramOnCustomRenderedAdLoadedListener == null) {
          break label40;
        }
      }
      label40:
      for (asx localasx = new asx(paramOnCustomRenderedAdLoadedListener);; localasx = null)
      {
        localapj.zza(localasx);
        return;
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void a(anw paramanw)
  {
    try
    {
      this.f = paramanw;
      apj localapj;
      if (this.k != null)
      {
        localapj = this.k;
        if (paramanw == null) {
          break label40;
        }
      }
      label40:
      for (anx localanx = new anx(paramanw);; localanx = null)
      {
        localapj.zza(localanx);
        return;
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void a(aqn paramaqn)
  {
    try
    {
      if (this.k != null) {
        break label294;
      }
      if (((this.h != null) && (this.n != null)) || (this.k != null)) {
        break label46;
      }
      throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
    }
    catch (RemoteException localRemoteException1)
    {
      mk.d("#007 Could not call remote method.", localRemoteException1);
    }
    return;
    label46:
    Context localContext = this.o.getContext();
    zzjn localzzjn = a(localContext, this.h, this.p);
    apj localapj;
    if ("search_v2".equals(localzzjn.a))
    {
      localapj = (apj)aoh.a(localContext, false, new aoj(aos.b(), localContext, localzzjn, this.n));
      label108:
      this.k = localapj;
      this.k.zza(new any(this.e));
      if (this.f != null) {
        this.k.zza(new anx(this.f));
      }
      if (this.i != null) {
        this.k.zza(new aog(this.i));
      }
      if (this.l != null) {
        this.k.zza(new asx(this.l));
      }
      if (this.j != null) {
        this.k.zza(this.j.zzaz());
      }
      if (this.m != null) {
        this.k.zza(new zzmu(this.m));
      }
      this.k.setManualImpressionsEnabled(this.q);
    }
    for (;;)
    {
      try
      {
        locala = this.k.zzbj();
        if (locala != null) {
          continue;
        }
      }
      catch (RemoteException localRemoteException2)
      {
        a locala;
        label294:
        mk.d("#007 Could not call remote method.", localRemoteException2);
        continue;
      }
      if (!this.k.zzb(aoe.a(this.o.getContext(), paramaqn))) {
        break;
      }
      this.a.a(paramaqn.j());
      return;
      localapj = (apj)aoh.a(localContext, false, new aoi(aos.b(), localContext, localzzjn, this.n, this.a));
      break label108;
      this.o.addView((View)b.a(locala));
    }
  }
  
  public final void a(String paramString)
  {
    if (this.n != null) {
      throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
    }
    this.n = paramString;
  }
  
  public final void a(boolean paramBoolean)
  {
    this.q = paramBoolean;
    try
    {
      if (this.k != null) {
        this.k.setManualImpressionsEnabled(this.q);
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void a(AdSize... paramVarArgs)
  {
    if (this.h != null) {
      throw new IllegalStateException("The ad size can only be set once on AdView.");
    }
    b(paramVarArgs);
  }
  
  public final boolean a(apj paramapj)
  {
    if (paramapj == null) {
      return false;
    }
    a locala;
    try
    {
      locala = paramapj.zzbj();
      if (locala == null) {
        return false;
      }
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
      return false;
    }
    if (((View)b.a(locala)).getParent() != null) {
      return false;
    }
    this.o.addView((View)b.a(locala));
    this.k = paramapj;
    return true;
  }
  
  public final AdListener b()
  {
    return this.g;
  }
  
  public final void b(AdSize... paramVarArgs)
  {
    this.h = paramVarArgs;
    try
    {
      if (this.k != null) {
        this.k.zza(a(this.o.getContext(), this.h, this.p));
      }
      this.o.requestLayout();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        mk.d("#007 Could not call remote method.", localRemoteException);
      }
    }
  }
  
  public final AdSize c()
  {
    try
    {
      if (this.k != null)
      {
        zzjn localzzjn = this.k.zzbk();
        if (localzzjn != null)
        {
          AdSize localAdSize = localzzjn.b();
          return localAdSize;
        }
      }
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
      if (this.h != null) {
        return this.h[0];
      }
    }
    return null;
  }
  
  public final AdSize[] d()
  {
    return this.h;
  }
  
  public final String e()
  {
    if ((this.n == null) && (this.k != null)) {}
    try
    {
      this.n = this.k.getAdUnitId();
      return this.n;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        mk.d("#007 Could not call remote method.", localRemoteException);
      }
    }
  }
  
  public final AppEventListener f()
  {
    return this.i;
  }
  
  public final OnCustomRenderedAdLoadedListener g()
  {
    return this.l;
  }
  
  public final void h()
  {
    try
    {
      if (this.k != null) {
        this.k.pause();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final void i()
  {
    if (this.c.getAndSet(true)) {}
    for (;;)
    {
      return;
      try
      {
        if (this.k != null)
        {
          this.k.zzbm();
          return;
        }
      }
      catch (RemoteException localRemoteException)
      {
        mk.d("#007 Could not call remote method.", localRemoteException);
      }
    }
  }
  
  public final void j()
  {
    try
    {
      if (this.k != null) {
        this.k.resume();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
  }
  
  public final String k()
  {
    try
    {
      if (this.k != null)
      {
        String str = this.k.zzck();
        return str;
      }
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
    return null;
  }
  
  public final boolean l()
  {
    try
    {
      if (this.k != null)
      {
        boolean bool = this.k.isLoading();
        return bool;
      }
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
    return false;
  }
  
  public final VideoController m()
  {
    return this.d;
  }
  
  public final aqg n()
  {
    if (this.k == null) {
      return null;
    }
    try
    {
      aqg localaqg = this.k.getVideoController();
      return localaqg;
    }
    catch (RemoteException localRemoteException)
    {
      mk.d("#007 Could not call remote method.", localRemoteException);
    }
    return null;
  }
  
  public final VideoOptions o()
  {
    return this.m;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aqp
 * JD-Core Version:    0.7.0.1
 */