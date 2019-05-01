package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@cm
@ParametersAreNonnullByDefault
public final class ij
{
  public final String A;
  public final String B;
  public final att C;
  public boolean D = false;
  public boolean E = false;
  public boolean F = false;
  public boolean G = false;
  public boolean H = false;
  public boolean I = false;
  public final List<String> J;
  public final amj K;
  public final boolean L;
  public final boolean M;
  public final boolean N;
  public final boolean O;
  private final zzael P;
  private final long Q;
  private final long R;
  private final String S;
  public final zzjj a;
  public final qe b;
  public final List<String> c;
  public final int d;
  public final List<String> e;
  public final List<String> f;
  public final List<String> g;
  public final int h;
  public final long i;
  public final String j;
  public final JSONObject k;
  public final boolean l;
  public boolean m;
  public final boolean n;
  public final bbt o;
  public final bcn p;
  public final String q;
  public final bbu r;
  public final bbx s;
  public final String t;
  public final zzjn u;
  public final zzaig v;
  public final List<String> w;
  public final List<String> x;
  public final long y;
  public final long z;
  
  public ij(ik paramik, qe paramqe, bbt parambbt, bcn parambcn, String paramString1, bbx parambbx, att paramatt, String paramString2)
  {
    this(paramik.a.c, null, paramik.b.c, paramik.e, paramik.b.e, paramik.b.i, paramik.b.k, paramik.b.j, paramik.a.i, paramik.b.g, null, null, null, paramik.c, null, paramik.b.h, paramik.d, paramik.b.f, paramik.f, paramik.g, paramik.b.n, paramik.h, null, paramik.b.A, paramik.b.B, paramik.b.B, paramik.b.D, paramik.b.E, null, paramik.b.H, paramik.b.L, paramik.i, paramik.b.O, paramik.j, paramik.b.Q, paramik.b.R, paramik.b.S, paramik.b.T);
  }
  
  public ij(zzjj paramzzjj, qe paramqe, List<String> paramList1, int paramInt1, List<String> paramList2, List<String> paramList3, int paramInt2, long paramLong1, String paramString1, boolean paramBoolean1, bbt parambbt, bcn parambcn, String paramString2, bbu parambbu, bbx parambbx, long paramLong2, zzjn paramzzjn, long paramLong3, long paramLong4, long paramLong5, String paramString3, JSONObject paramJSONObject, att paramatt, zzaig paramzzaig, List<String> paramList4, List<String> paramList5, boolean paramBoolean2, zzael paramzzael, String paramString4, List<String> paramList6, String paramString5, amj paramamj, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, List<String> paramList7, boolean paramBoolean6, String paramString6)
  {
    this.a = paramzzjj;
    this.b = paramqe;
    this.c = a(paramList1);
    this.d = paramInt1;
    this.e = a(paramList2);
    this.g = a(paramList3);
    this.h = paramInt2;
    this.i = paramLong1;
    this.j = paramString1;
    this.n = paramBoolean1;
    this.o = parambbt;
    this.p = parambcn;
    this.q = paramString2;
    this.r = parambbu;
    this.s = parambbx;
    this.Q = paramLong2;
    this.u = paramzzjn;
    this.R = paramLong3;
    this.y = paramLong4;
    this.z = paramLong5;
    this.A = paramString3;
    this.k = paramJSONObject;
    this.C = paramatt;
    this.v = paramzzaig;
    this.w = a(paramList4);
    this.x = a(paramList5);
    this.l = paramBoolean2;
    this.P = paramzzael;
    this.t = paramString4;
    this.J = a(paramList6);
    this.B = paramString5;
    this.K = paramamj;
    this.L = paramBoolean3;
    this.M = paramBoolean4;
    this.N = paramBoolean5;
    this.f = a(paramList7);
    this.O = paramBoolean6;
    this.S = paramString6;
  }
  
  private static <T> List<T> a(List<T> paramList)
  {
    if (paramList == null) {
      return null;
    }
    return Collections.unmodifiableList(paramList);
  }
  
  public final boolean a()
  {
    if ((this.b == null) || (this.b.t() == null)) {
      return false;
    }
    return this.b.t().b();
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.ij
 * JD-Core Version:    0.7.0.1
 */