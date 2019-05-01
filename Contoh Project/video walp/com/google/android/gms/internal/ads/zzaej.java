package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public final class zzaej
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzaej> CREATOR = new do();
  public final zzaig A;
  public final List<String> B;
  public final List<String> C;
  public final boolean D;
  public final zzael E;
  public final boolean F;
  public String G;
  public final List<String> H;
  public final boolean I;
  public final String J;
  public final zzaiq K;
  public final String L;
  public final boolean M;
  public final boolean N;
  public final boolean O;
  public final int P;
  public final boolean Q;
  public final List<String> R;
  public final boolean S;
  public final String T;
  private zzaef U;
  private final int V;
  private zzaev W;
  private Bundle X;
  public final String a;
  public String b;
  public final List<String> c;
  public final int d;
  public final List<String> e;
  public final long f;
  public final boolean g;
  public final long h;
  public final List<String> i;
  public final long j;
  public final int k;
  public final String l;
  public final long m;
  public final String n;
  public final boolean o;
  public final String p;
  public final String q;
  public final boolean r;
  public final boolean s;
  public final boolean t;
  public final boolean u;
  public final boolean v;
  public String w;
  public final String x;
  public final boolean y;
  public final boolean z;
  
  public zzaej(int paramInt)
  {
    this(19, null, null, null, paramInt, null, -1L, false, -1L, null, -1L, -1, null, -1L, null, false, null, null, false, false, false, true, false, null, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, true, false, null, false, 0, false, null, false, null);
  }
  
  public zzaej(int paramInt, long paramLong)
  {
    this(19, null, null, null, paramInt, null, -1L, false, -1L, null, paramLong, -1, null, -1L, null, false, null, null, false, false, false, true, false, null, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, true, false, null, false, 0, false, null, false, null);
  }
  
  zzaej(int paramInt1, String paramString1, String paramString2, List<String> paramList1, int paramInt2, List<String> paramList2, long paramLong1, boolean paramBoolean1, long paramLong2, List<String> paramList3, long paramLong3, int paramInt3, String paramString3, long paramLong4, String paramString4, boolean paramBoolean2, String paramString5, String paramString6, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7, zzaev paramzzaev, String paramString7, String paramString8, boolean paramBoolean8, boolean paramBoolean9, zzaig paramzzaig, List<String> paramList4, List<String> paramList5, boolean paramBoolean10, zzael paramzzael, boolean paramBoolean11, String paramString9, List<String> paramList6, boolean paramBoolean12, String paramString10, zzaiq paramzzaiq, String paramString11, boolean paramBoolean13, boolean paramBoolean14, Bundle paramBundle, boolean paramBoolean15, int paramInt4, boolean paramBoolean16, List<String> paramList7, boolean paramBoolean17, String paramString12)
  {
    this.V = paramInt1;
    this.a = paramString1;
    this.b = paramString2;
    List localList1;
    List localList2;
    label55:
    List localList3;
    if (paramList1 != null)
    {
      localList1 = Collections.unmodifiableList(paramList1);
      this.c = localList1;
      this.d = paramInt2;
      if (paramList2 == null) {
        break label404;
      }
      localList2 = Collections.unmodifiableList(paramList2);
      this.e = localList2;
      this.f = paramLong1;
      this.g = paramBoolean1;
      this.h = paramLong2;
      if (paramList3 == null) {
        break label410;
      }
      localList3 = Collections.unmodifiableList(paramList3);
      label91:
      this.i = localList3;
      this.j = paramLong3;
      this.k = paramInt3;
      this.l = paramString3;
      this.m = paramLong4;
      this.n = paramString4;
      this.o = paramBoolean2;
      this.p = paramString5;
      this.q = paramString6;
      this.r = paramBoolean3;
      this.s = paramBoolean4;
      this.t = paramBoolean5;
      this.u = paramBoolean6;
      this.M = paramBoolean13;
      this.v = paramBoolean7;
      this.W = paramzzaev;
      this.w = paramString7;
      this.x = paramString8;
      if ((this.b == null) && (this.W != null))
      {
        zzafj localzzafj = (zzafj)this.W.a(zzafj.CREATOR);
        if ((localzzafj != null) && (!TextUtils.isEmpty(localzzafj.a))) {
          this.b = localzzafj.a;
        }
      }
      this.y = paramBoolean8;
      this.z = paramBoolean9;
      this.A = paramzzaig;
      this.B = paramList4;
      this.C = paramList5;
      this.D = paramBoolean10;
      this.E = paramzzael;
      this.F = paramBoolean11;
      this.G = paramString9;
      this.H = paramList6;
      this.I = paramBoolean12;
      this.J = paramString10;
      this.K = paramzzaiq;
      this.L = paramString11;
      this.N = paramBoolean14;
      this.X = paramBundle;
      this.O = paramBoolean15;
      this.P = paramInt4;
      this.Q = paramBoolean16;
      if (paramList7 == null) {
        break label416;
      }
    }
    label404:
    label410:
    label416:
    for (List localList4 = Collections.unmodifiableList(paramList7);; localList4 = null)
    {
      this.R = localList4;
      this.S = paramBoolean17;
      this.T = paramString12;
      return;
      localList1 = null;
      break;
      localList2 = null;
      break label55;
      localList3 = null;
      break label91;
    }
  }
  
  public zzaej(zzaef paramzzaef, String paramString1, String paramString2, List<String> paramList1, List<String> paramList2, long paramLong1, boolean paramBoolean1, long paramLong2, List<String> paramList3, long paramLong3, int paramInt1, String paramString3, long paramLong4, String paramString4, String paramString5, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, String paramString6, boolean paramBoolean7, boolean paramBoolean8, zzaig paramzzaig, List<String> paramList4, List<String> paramList5, boolean paramBoolean9, zzael paramzzael, boolean paramBoolean10, String paramString7, List<String> paramList6, boolean paramBoolean11, String paramString8, zzaiq paramzzaiq, String paramString9, boolean paramBoolean12, boolean paramBoolean13, boolean paramBoolean14, int paramInt2, boolean paramBoolean15, List<String> paramList7, boolean paramBoolean16, String paramString10)
  {
    this(19, paramString1, paramString2, paramList1, -2, paramList2, paramLong1, paramBoolean1, -1L, paramList3, paramLong3, paramInt1, paramString3, paramLong4, paramString4, false, null, paramString5, paramBoolean2, paramBoolean3, paramBoolean4, paramBoolean5, false, null, null, paramString6, paramBoolean7, paramBoolean8, paramzzaig, paramList4, paramList5, paramBoolean9, paramzzael, paramBoolean10, paramString7, paramList6, paramBoolean11, paramString8, paramzzaiq, paramString9, paramBoolean12, paramBoolean13, null, paramBoolean14, paramInt2, paramBoolean15, paramList7, paramBoolean16, paramString10);
    this.U = paramzzaef;
  }
  
  public zzaej(zzaef paramzzaef, String paramString1, String paramString2, List<String> paramList1, List<String> paramList2, long paramLong1, boolean paramBoolean1, long paramLong2, List<String> paramList3, long paramLong3, int paramInt1, String paramString3, long paramLong4, String paramString4, boolean paramBoolean2, String paramString5, String paramString6, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7, String paramString7, boolean paramBoolean8, boolean paramBoolean9, zzaig paramzzaig, List<String> paramList4, List<String> paramList5, boolean paramBoolean10, zzael paramzzael, boolean paramBoolean11, String paramString8, List<String> paramList6, boolean paramBoolean12, String paramString9, zzaiq paramzzaiq, String paramString10, boolean paramBoolean13, boolean paramBoolean14, boolean paramBoolean15, int paramInt2, boolean paramBoolean16, List<String> paramList7, boolean paramBoolean17, String paramString11)
  {
    this(19, paramString1, paramString2, paramList1, -2, paramList2, paramLong1, paramBoolean1, paramLong2, paramList3, paramLong3, paramInt1, paramString3, paramLong4, paramString4, paramBoolean2, paramString5, paramString6, paramBoolean3, paramBoolean4, paramBoolean5, paramBoolean6, paramBoolean7, null, null, paramString7, paramBoolean8, paramBoolean9, paramzzaig, paramList4, paramList5, paramBoolean10, paramzzael, paramBoolean11, paramString8, paramList6, paramBoolean12, paramString9, paramzzaiq, paramString10, paramBoolean13, paramBoolean14, null, paramBoolean15, 0, paramBoolean16, paramList7, paramBoolean17, paramString11);
    this.U = paramzzaef;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if ((this.U != null) && (this.U.a >= 9) && (!TextUtils.isEmpty(this.b)))
    {
      this.W = new zzaev(new zzafj(this.b));
      this.b = null;
    }
    int i1 = b.a(paramParcel);
    b.a(paramParcel, 1, this.V);
    b.a(paramParcel, 2, this.a, false);
    b.a(paramParcel, 3, this.b, false);
    b.b(paramParcel, 4, this.c, false);
    b.a(paramParcel, 5, this.d);
    b.b(paramParcel, 6, this.e, false);
    b.a(paramParcel, 7, this.f);
    b.a(paramParcel, 8, this.g);
    b.a(paramParcel, 9, this.h);
    b.b(paramParcel, 10, this.i, false);
    b.a(paramParcel, 11, this.j);
    b.a(paramParcel, 12, this.k);
    b.a(paramParcel, 13, this.l, false);
    b.a(paramParcel, 14, this.m);
    b.a(paramParcel, 15, this.n, false);
    b.a(paramParcel, 18, this.o);
    b.a(paramParcel, 19, this.p, false);
    b.a(paramParcel, 21, this.q, false);
    b.a(paramParcel, 22, this.r);
    b.a(paramParcel, 23, this.s);
    b.a(paramParcel, 24, this.t);
    b.a(paramParcel, 25, this.u);
    b.a(paramParcel, 26, this.v);
    b.a(paramParcel, 28, this.W, paramInt, false);
    b.a(paramParcel, 29, this.w, false);
    b.a(paramParcel, 30, this.x, false);
    b.a(paramParcel, 31, this.y);
    b.a(paramParcel, 32, this.z);
    b.a(paramParcel, 33, this.A, paramInt, false);
    b.b(paramParcel, 34, this.B, false);
    b.b(paramParcel, 35, this.C, false);
    b.a(paramParcel, 36, this.D);
    b.a(paramParcel, 37, this.E, paramInt, false);
    b.a(paramParcel, 38, this.F);
    b.a(paramParcel, 39, this.G, false);
    b.b(paramParcel, 40, this.H, false);
    b.a(paramParcel, 42, this.I);
    b.a(paramParcel, 43, this.J, false);
    b.a(paramParcel, 44, this.K, paramInt, false);
    b.a(paramParcel, 45, this.L, false);
    b.a(paramParcel, 46, this.M);
    b.a(paramParcel, 47, this.N);
    b.a(paramParcel, 48, this.X, false);
    b.a(paramParcel, 49, this.O);
    b.a(paramParcel, 50, this.P);
    b.a(paramParcel, 51, this.Q);
    b.b(paramParcel, 52, this.R, false);
    b.a(paramParcel, 53, this.S);
    b.a(paramParcel, 54, this.T, false);
    b.a(paramParcel, i1);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.zzaej
 * JD-Core Version:    0.7.0.1
 */