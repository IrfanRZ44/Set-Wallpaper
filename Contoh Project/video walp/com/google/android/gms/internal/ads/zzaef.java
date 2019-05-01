package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public final class zzaef
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzaef> CREATOR = new dm();
  public final long A;
  public final String B;
  public final float C;
  public final int D;
  public final int E;
  public final boolean F;
  public final boolean G;
  public final String H;
  public final boolean I;
  public final String J;
  public final boolean K;
  public final int L;
  public final Bundle M;
  public final String N;
  public final zzlu O;
  public final boolean P;
  public final Bundle Q;
  public final String R;
  public final String S;
  public final String T;
  public final boolean U;
  public final List<Integer> V;
  public final String W;
  public final List<String> X;
  public final int Y;
  public final boolean Z;
  public final int a;
  public final boolean aa;
  public final boolean ab;
  public final ArrayList<String> ac;
  public final Bundle b;
  public final zzjj c;
  public final zzjn d;
  public final String e;
  public final ApplicationInfo f;
  public final PackageInfo g;
  public final String h;
  public final String i;
  public final String j;
  public final zzang k;
  public final Bundle l;
  public final int m;
  public final List<String> n;
  public final Bundle o;
  public final boolean p;
  public final int q;
  public final int r;
  public final float s;
  public final String t;
  public final long u;
  public final String v;
  public final List<String> w;
  public final String x;
  public final zzpl y;
  public final List<String> z;
  
  zzaef(int paramInt1, Bundle paramBundle1, zzjj paramzzjj, zzjn paramzzjn, String paramString1, ApplicationInfo paramApplicationInfo, PackageInfo paramPackageInfo, String paramString2, String paramString3, String paramString4, zzang paramzzang, Bundle paramBundle2, int paramInt2, List<String> paramList1, Bundle paramBundle3, boolean paramBoolean1, int paramInt3, int paramInt4, float paramFloat1, String paramString5, long paramLong1, String paramString6, List<String> paramList2, String paramString7, zzpl paramzzpl, List<String> paramList3, long paramLong2, String paramString8, float paramFloat2, boolean paramBoolean2, int paramInt5, int paramInt6, boolean paramBoolean3, boolean paramBoolean4, String paramString9, String paramString10, boolean paramBoolean5, int paramInt7, Bundle paramBundle4, String paramString11, zzlu paramzzlu, boolean paramBoolean6, Bundle paramBundle5, String paramString12, String paramString13, String paramString14, boolean paramBoolean7, List<Integer> paramList, String paramString15, List<String> paramList4, int paramInt8, boolean paramBoolean8, boolean paramBoolean9, boolean paramBoolean10, ArrayList<String> paramArrayList)
  {
    this.a = paramInt1;
    this.b = paramBundle1;
    this.c = paramzzjj;
    this.d = paramzzjn;
    this.e = paramString1;
    this.f = paramApplicationInfo;
    this.g = paramPackageInfo;
    this.h = paramString2;
    this.i = paramString3;
    this.j = paramString4;
    this.k = paramzzang;
    this.l = paramBundle2;
    this.m = paramInt2;
    this.n = paramList1;
    List localList1;
    if (paramList3 == null)
    {
      localList1 = Collections.emptyList();
      this.z = localList1;
      this.o = paramBundle3;
      this.p = paramBoolean1;
      this.q = paramInt3;
      this.r = paramInt4;
      this.s = paramFloat1;
      this.t = paramString5;
      this.u = paramLong1;
      this.v = paramString6;
      if (paramList2 != null) {
        break label362;
      }
    }
    label362:
    for (List localList2 = Collections.emptyList();; localList2 = Collections.unmodifiableList(paramList2))
    {
      this.w = localList2;
      this.x = paramString7;
      this.y = paramzzpl;
      this.A = paramLong2;
      this.B = paramString8;
      this.C = paramFloat2;
      this.I = paramBoolean2;
      this.D = paramInt5;
      this.E = paramInt6;
      this.F = paramBoolean3;
      this.G = paramBoolean4;
      this.H = paramString9;
      this.J = paramString10;
      this.K = paramBoolean5;
      this.L = paramInt7;
      this.M = paramBundle4;
      this.N = paramString11;
      this.O = paramzzlu;
      this.P = paramBoolean6;
      this.Q = paramBundle5;
      this.R = paramString12;
      this.S = paramString13;
      this.T = paramString14;
      this.U = paramBoolean7;
      this.V = paramList;
      this.W = paramString15;
      this.X = paramList4;
      this.Y = paramInt8;
      this.Z = paramBoolean8;
      this.aa = paramBoolean9;
      this.ab = paramBoolean10;
      this.ac = paramArrayList;
      return;
      localList1 = Collections.unmodifiableList(paramList3);
      break;
    }
  }
  
  private zzaef(Bundle paramBundle1, zzjj paramzzjj, zzjn paramzzjn, String paramString1, ApplicationInfo paramApplicationInfo, PackageInfo paramPackageInfo, String paramString2, String paramString3, String paramString4, zzang paramzzang, Bundle paramBundle2, int paramInt1, List<String> paramList1, List<String> paramList2, Bundle paramBundle3, boolean paramBoolean1, int paramInt2, int paramInt3, float paramFloat1, String paramString5, long paramLong1, String paramString6, List<String> paramList3, String paramString7, zzpl paramzzpl, long paramLong2, String paramString8, float paramFloat2, boolean paramBoolean2, int paramInt4, int paramInt5, boolean paramBoolean3, boolean paramBoolean4, String paramString9, String paramString10, boolean paramBoolean5, int paramInt6, Bundle paramBundle4, String paramString11, zzlu paramzzlu, boolean paramBoolean6, Bundle paramBundle5, String paramString12, String paramString13, String paramString14, boolean paramBoolean7, List<Integer> paramList, String paramString15, List<String> paramList4, int paramInt7, boolean paramBoolean8, boolean paramBoolean9, boolean paramBoolean10, ArrayList<String> paramArrayList)
  {
    this(24, paramBundle1, paramzzjj, paramzzjn, paramString1, paramApplicationInfo, paramPackageInfo, paramString2, paramString3, paramString4, paramzzang, paramBundle2, paramInt1, paramList1, paramBundle3, paramBoolean1, paramInt2, paramInt3, paramFloat1, paramString5, paramLong1, paramString6, paramList3, paramString7, paramzzpl, paramList2, paramLong2, paramString8, paramFloat2, paramBoolean2, paramInt4, paramInt5, paramBoolean3, paramBoolean4, paramString9, paramString10, paramBoolean5, paramInt6, paramBundle4, paramString11, paramzzlu, paramBoolean6, paramBundle5, paramString12, paramString13, paramString14, paramBoolean7, paramList, paramString15, paramList4, paramInt7, paramBoolean8, paramBoolean9, paramBoolean10, paramArrayList);
  }
  
  public zzaef(dl paramdl, long paramLong, String paramString1, String paramString2, String paramString3)
  {
    this(paramdl.a, paramdl.b, paramdl.c, paramdl.d, paramdl.e, paramdl.f, (String)mt.a(paramdl.Q, ""), paramdl.g, paramdl.h, paramdl.j, paramdl.i, paramdl.k, paramdl.l, paramdl.m, paramdl.o, paramdl.p, paramdl.q, paramdl.r, paramdl.s, paramdl.t, paramdl.u, paramdl.v, paramdl.w, paramdl.x, paramdl.y, paramLong, paramdl.z, paramdl.A, paramdl.B, paramdl.C, paramdl.D, paramdl.E, paramdl.F, (String)mt.a(paramdl.G, "", 1L, TimeUnit.SECONDS), paramdl.H, paramdl.I, paramdl.J, paramdl.K, paramdl.L, paramdl.M, paramdl.N, paramdl.O, paramString1, paramString2, paramString3, paramdl.P, paramdl.R, paramdl.S, paramdl.n, paramdl.T, paramdl.U, paramdl.V, paramdl.W, paramdl.X);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i1 = b.a(paramParcel);
    b.a(paramParcel, 1, this.a);
    b.a(paramParcel, 2, this.b, false);
    b.a(paramParcel, 3, this.c, paramInt, false);
    b.a(paramParcel, 4, this.d, paramInt, false);
    b.a(paramParcel, 5, this.e, false);
    b.a(paramParcel, 6, this.f, paramInt, false);
    b.a(paramParcel, 7, this.g, paramInt, false);
    b.a(paramParcel, 8, this.h, false);
    b.a(paramParcel, 9, this.i, false);
    b.a(paramParcel, 10, this.j, false);
    b.a(paramParcel, 11, this.k, paramInt, false);
    b.a(paramParcel, 12, this.l, false);
    b.a(paramParcel, 13, this.m);
    b.b(paramParcel, 14, this.n, false);
    b.a(paramParcel, 15, this.o, false);
    b.a(paramParcel, 16, this.p);
    b.a(paramParcel, 18, this.q);
    b.a(paramParcel, 19, this.r);
    b.a(paramParcel, 20, this.s);
    b.a(paramParcel, 21, this.t, false);
    b.a(paramParcel, 25, this.u);
    b.a(paramParcel, 26, this.v, false);
    b.b(paramParcel, 27, this.w, false);
    b.a(paramParcel, 28, this.x, false);
    b.a(paramParcel, 29, this.y, paramInt, false);
    b.b(paramParcel, 30, this.z, false);
    b.a(paramParcel, 31, this.A);
    b.a(paramParcel, 33, this.B, false);
    b.a(paramParcel, 34, this.C);
    b.a(paramParcel, 35, this.D);
    b.a(paramParcel, 36, this.E);
    b.a(paramParcel, 37, this.F);
    b.a(paramParcel, 38, this.G);
    b.a(paramParcel, 39, this.H, false);
    b.a(paramParcel, 40, this.I);
    b.a(paramParcel, 41, this.J, false);
    b.a(paramParcel, 42, this.K);
    b.a(paramParcel, 43, this.L);
    b.a(paramParcel, 44, this.M, false);
    b.a(paramParcel, 45, this.N, false);
    b.a(paramParcel, 46, this.O, paramInt, false);
    b.a(paramParcel, 47, this.P);
    b.a(paramParcel, 48, this.Q, false);
    b.a(paramParcel, 49, this.R, false);
    b.a(paramParcel, 50, this.S, false);
    b.a(paramParcel, 51, this.T, false);
    b.a(paramParcel, 52, this.U);
    b.a(paramParcel, 53, this.V, false);
    b.a(paramParcel, 54, this.W, false);
    b.b(paramParcel, 55, this.X, false);
    b.a(paramParcel, 56, this.Y);
    b.a(paramParcel, 57, this.Z);
    b.a(paramParcel, 58, this.aa);
    b.a(paramParcel, 59, this.ab);
    b.b(paramParcel, 60, this.ac, false);
    b.a(paramParcel, i1);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.zzaef
 * JD-Core Version:    0.7.0.1
 */