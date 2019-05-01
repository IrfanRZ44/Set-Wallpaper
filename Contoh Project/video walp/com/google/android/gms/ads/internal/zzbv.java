package com.google.android.gms.ads.internal;

import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.overlay.zza;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.overlay.zzu;
import com.google.android.gms.ads.internal.overlay.zzv;
import com.google.android.gms.common.util.c;
import com.google.android.gms.common.util.f;
import com.google.android.gms.internal.ads.aky;
import com.google.android.gms.internal.ads.alv;
import com.google.android.gms.internal.ads.alw;
import com.google.android.gms.internal.ads.ami;
import com.google.android.gms.internal.ads.ao;
import com.google.android.gms.internal.ads.asf;
import com.google.android.gms.internal.ads.ayp;
import com.google.android.gms.internal.ads.azk;
import com.google.android.gms.internal.ads.bbc;
import com.google.android.gms.internal.ads.bcd;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.cn;
import com.google.android.gms.internal.ads.fe;
import com.google.android.gms.internal.ads.hz;
import com.google.android.gms.internal.ads.io;
import com.google.android.gms.internal.ads.ix;
import com.google.android.gms.internal.ads.jn;
import com.google.android.gms.internal.ads.jt;
import com.google.android.gms.internal.ads.jy;
import com.google.android.gms.internal.ads.jz;
import com.google.android.gms.internal.ads.ka;
import com.google.android.gms.internal.ads.kb;
import com.google.android.gms.internal.ads.kc;
import com.google.android.gms.internal.ads.ke;
import com.google.android.gms.internal.ads.kf;
import com.google.android.gms.internal.ads.ko;
import com.google.android.gms.internal.ads.ll;
import com.google.android.gms.internal.ads.lm;
import com.google.android.gms.internal.ads.lv;
import com.google.android.gms.internal.ads.nq;
import com.google.android.gms.internal.ads.nx;
import com.google.android.gms.internal.ads.p;
import com.google.android.gms.internal.ads.po;
import com.google.android.gms.internal.ads.ql;

@cm
public final class zzbv
{
  private static final Object a = new Object();
  private static zzbv b;
  private final zzbb A;
  private final p B;
  private final ami C;
  private final hz D;
  private final po E;
  private final nx F;
  private final azk G;
  private final kf H;
  private final lv I;
  private final ix J;
  private final zza c = new zza();
  private final cn d = new cn();
  private final zzl e = new zzl();
  private final ao f = new ao();
  private final jn g = new jn();
  private final ql h = new ql();
  private final jt i;
  private final aky j;
  private final io k;
  private final alv l;
  private final alw m;
  private final c n;
  private final zzad o;
  private final asf p;
  private final ko q;
  private final fe r;
  private final nq s;
  private final ayp t;
  private final bbc u;
  private final ll v;
  private final zzu w;
  private final zzv x;
  private final bcd y;
  private final lm z;
  
  static
  {
    zzbv localzzbv = new zzbv();
    synchronized (a)
    {
      b = localzzbv;
      return;
    }
  }
  
  protected zzbv()
  {
    int i1 = Build.VERSION.SDK_INT;
    Object localObject;
    if (i1 >= 21) {
      localObject = new ke();
    }
    for (;;)
    {
      this.i = ((jt)localObject);
      this.j = new aky();
      this.k = new io();
      this.J = new ix();
      this.l = new alv();
      this.m = new alw();
      this.n = f.d();
      this.o = new zzad();
      this.p = new asf();
      this.q = new ko();
      this.r = new fe();
      this.G = new azk();
      this.s = new nq();
      this.t = new ayp();
      this.u = new bbc();
      this.v = new ll();
      this.w = new zzu();
      this.x = new zzv();
      this.y = new bcd();
      this.z = new lm();
      this.A = new zzbb();
      this.B = new p();
      this.C = new ami();
      this.D = new hz();
      this.E = new po();
      this.F = new nx();
      this.H = new kf();
      this.I = new lv();
      return;
      if (i1 >= 19) {
        localObject = new kc();
      } else if (i1 >= 18) {
        localObject = new ka();
      } else if (i1 >= 17) {
        localObject = new jz();
      } else if (i1 >= 16) {
        localObject = new kb();
      } else {
        localObject = new jy();
      }
    }
  }
  
  private static zzbv a()
  {
    synchronized (a)
    {
      zzbv localzzbv = b;
      return localzzbv;
    }
  }
  
  public static cn zzeg()
  {
    return a().d;
  }
  
  public static zza zzeh()
  {
    return a().c;
  }
  
  public static zzl zzei()
  {
    return a().e;
  }
  
  public static ao zzej()
  {
    return a().f;
  }
  
  public static jn zzek()
  {
    return a().g;
  }
  
  public static ql zzel()
  {
    return a().h;
  }
  
  public static jt zzem()
  {
    return a().i;
  }
  
  public static aky zzen()
  {
    return a().j;
  }
  
  public static io zzeo()
  {
    return a().k;
  }
  
  public static ix zzep()
  {
    return a().J;
  }
  
  public static alw zzeq()
  {
    return a().m;
  }
  
  public static c zzer()
  {
    return a().n;
  }
  
  public static zzad zzes()
  {
    return a().o;
  }
  
  public static asf zzet()
  {
    return a().p;
  }
  
  public static ko zzeu()
  {
    return a().q;
  }
  
  public static fe zzev()
  {
    return a().r;
  }
  
  public static nq zzew()
  {
    return a().s;
  }
  
  public static ayp zzex()
  {
    return a().t;
  }
  
  public static bbc zzey()
  {
    return a().u;
  }
  
  public static ll zzez()
  {
    return a().v;
  }
  
  public static p zzfa()
  {
    return a().B;
  }
  
  public static zzu zzfb()
  {
    return a().w;
  }
  
  public static zzv zzfc()
  {
    return a().x;
  }
  
  public static bcd zzfd()
  {
    return a().y;
  }
  
  public static lm zzfe()
  {
    return a().z;
  }
  
  public static po zzff()
  {
    return a().E;
  }
  
  public static nx zzfg()
  {
    return a().F;
  }
  
  public static hz zzfh()
  {
    return a().D;
  }
  
  public static azk zzfi()
  {
    return a().G;
  }
  
  public static kf zzfj()
  {
    return a().H;
  }
  
  public static lv zzfk()
  {
    return a().I;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.zzbv
 * JD-Core Version:    0.7.0.1
 */