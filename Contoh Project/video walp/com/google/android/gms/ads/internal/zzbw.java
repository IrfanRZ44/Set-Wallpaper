package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.RemoteException;
import android.support.v4.f.m;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.internal.ads.ags;
import com.google.android.gms.internal.ads.agw;
import com.google.android.gms.internal.ads.aos;
import com.google.android.gms.internal.ads.aov;
import com.google.android.gms.internal.ads.aoy;
import com.google.android.gms.internal.ads.apo;
import com.google.android.gms.internal.ads.aps;
import com.google.android.gms.internal.ads.apy;
import com.google.android.gms.internal.ads.arq;
import com.google.android.gms.internal.ads.ary;
import com.google.android.gms.internal.ads.asa;
import com.google.android.gms.internal.ads.asd;
import com.google.android.gms.internal.ads.asu;
import com.google.android.gms.internal.ads.avo;
import com.google.android.gms.internal.ads.avr;
import com.google.android.gms.internal.ads.avv;
import com.google.android.gms.internal.ads.avy;
import com.google.android.gms.internal.ads.awb;
import com.google.android.gms.internal.ads.awe;
import com.google.android.gms.internal.ads.bcn;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.fz;
import com.google.android.gms.internal.ads.gh;
import com.google.android.gms.internal.ads.ij;
import com.google.android.gms.internal.ads.ik;
import com.google.android.gms.internal.ads.il;
import com.google.android.gms.internal.ads.io;
import com.google.android.gms.internal.ads.iw;
import com.google.android.gms.internal.ads.iz;
import com.google.android.gms.internal.ads.je;
import com.google.android.gms.internal.ads.kg;
import com.google.android.gms.internal.ads.lo;
import com.google.android.gms.internal.ads.lz;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.rm;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzlu;
import com.google.android.gms.internal.ads.zzmu;
import com.google.android.gms.internal.ads.zzpl;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public final class zzbw
  implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener
{
  private int A = -1;
  private lo B;
  private boolean C = true;
  private boolean D = true;
  private boolean E = false;
  final String a;
  final agw b;
  zzbx c;
  aov d;
  aoy e;
  aps f;
  apo g;
  apy h;
  avo i;
  avr j;
  awe k;
  m<String, avv> l;
  m<String, avy> m;
  zzpl n;
  zzmu o;
  zzlu p;
  awb q;
  List<Integer> r;
  asu s;
  gh t;
  fz u;
  List<String> v;
  View w = null;
  boolean x = false;
  private HashSet<il> y = null;
  private int z = -1;
  public String zzacp;
  public final zzang zzacr;
  public iz zzact;
  public kg zzacu;
  public zzjn zzacv;
  public ij zzacw;
  public ik zzacx;
  public il zzacy;
  public String zzadr;
  public iw zzadt = null;
  public int zzadv = 0;
  public final Context zzrt;
  
  public zzbw(Context paramContext, zzjn paramzzjn, String paramString, zzang paramzzang)
  {
    this(paramContext, paramzzjn, paramString, paramzzang, null);
  }
  
  private zzbw(Context paramContext, zzjn paramzzjn, String paramString, zzang paramzzang, agw paramagw)
  {
    asa.a(paramContext);
    if (zzbv.zzeo().b() != null)
    {
      List localList = asa.b();
      if (paramzzang.b != 0) {
        localList.add(Integer.toString(paramzzang.b));
      }
      zzbv.zzeo().b().a(localList);
    }
    this.a = UUID.randomUUID().toString();
    if ((paramzzjn.d) || (paramzzjn.h)) {
      this.c = null;
    }
    for (;;)
    {
      this.zzacv = paramzzjn;
      this.zzacp = paramString;
      this.zzrt = paramContext;
      this.zzacr = paramzzang;
      this.b = new agw(new zzag(this));
      this.B = new lo(200L);
      this.m = new m();
      return;
      this.c = new zzbx(paramContext, paramString, paramzzang.a, this, this);
      this.c.setMinimumWidth(paramzzjn.f);
      this.c.setMinimumHeight(paramzzjn.c);
      this.c.setVisibility(4);
    }
  }
  
  private final void a(boolean paramBoolean)
  {
    boolean bool = true;
    if ((this.c == null) || (this.zzacw == null) || (this.zzacw.b == null) || (this.zzacw.b.t() == null))
    {
      break label41;
      break label41;
    }
    label41:
    while ((paramBoolean) && (!this.B.a())) {
      return;
    }
    rm localrm;
    int i3;
    int i4;
    if (this.zzacw.b.t().b())
    {
      int[] arrayOfInt = new int[2];
      this.c.getLocationOnScreen(arrayOfInt);
      aos.a();
      int i1 = lz.b(this.zzrt, arrayOfInt[0]);
      aos.a();
      int i2 = lz.b(this.zzrt, arrayOfInt[bool]);
      if ((i1 != this.z) || (i2 != this.A))
      {
        this.z = i1;
        this.A = i2;
        localrm = this.zzacw.b.t();
        i3 = this.z;
        i4 = this.A;
        if (paramBoolean) {
          break label293;
        }
      }
    }
    for (;;)
    {
      localrm.a(i3, i4, bool);
      if (this.c == null) {
        break;
      }
      View localView = this.c.getRootView().findViewById(16908290);
      if (localView == null) {
        break;
      }
      Rect localRect1 = new Rect();
      Rect localRect2 = new Rect();
      this.c.getGlobalVisibleRect(localRect1);
      localView.getGlobalVisibleRect(localRect2);
      if (localRect1.top != localRect2.top) {
        this.C = false;
      }
      if (localRect1.bottom == localRect2.bottom) {
        break;
      }
      this.D = false;
      return;
      label293:
      bool = false;
    }
  }
  
  final void a(View paramView)
  {
    arq localarq = asa.bG;
    if (!((Boolean)aos.f().a(localarq)).booleanValue()) {}
    ags localags;
    do
    {
      return;
      localags = this.b.a();
    } while (localags == null);
    localags.zzb(paramView);
  }
  
  public final void onGlobalLayout()
  {
    a(false);
  }
  
  public final void onScrollChanged()
  {
    a(true);
    this.E = true;
  }
  
  public final void zza(HashSet<il> paramHashSet)
  {
    this.y = paramHashSet;
  }
  
  public final HashSet<il> zzfl()
  {
    return this.y;
  }
  
  public final void zzfm()
  {
    if ((this.zzacw != null) && (this.zzacw.b != null)) {
      this.zzacw.b.destroy();
    }
  }
  
  public final void zzfn()
  {
    if ((this.zzacw != null) && (this.zzacw.p != null)) {}
    try
    {
      this.zzacw.p.c();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      je.e("Could not destroy mediation adapter.");
    }
  }
  
  public final boolean zzfo()
  {
    return this.zzadv == 0;
  }
  
  public final boolean zzfp()
  {
    return this.zzadv == 1;
  }
  
  public final String zzfq()
  {
    if ((this.C) && (this.D)) {
      return "";
    }
    if (this.C)
    {
      if (this.E) {
        return "top-scrollable";
      }
      return "top-locked";
    }
    if (this.D)
    {
      if (this.E) {
        return "bottom-scrollable";
      }
      return "bottom-locked";
    }
    return "";
  }
  
  public final void zzg(boolean paramBoolean)
  {
    if ((this.zzadv == 0) && (this.zzacw != null) && (this.zzacw.b != null)) {
      this.zzacw.b.stopLoading();
    }
    if (this.zzact != null) {
      this.zzact.b();
    }
    if (this.zzacu != null) {
      this.zzacu.b();
    }
    if (paramBoolean) {
      this.zzacw = null;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.zzbw
 * JD-Core Version:    0.7.0.1
 */