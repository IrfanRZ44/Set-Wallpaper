package com.google.android.gms.internal.ads;

import java.lang.reflect.Type;

public enum aaz
{
  private static final aaz[] ae;
  private static final Type[] af;
  private final abm Z;
  private final int aa;
  private final abb ab;
  private final Class<?> ac;
  private final boolean ad;
  
  static
  {
    int i1 = 0;
    l = new aaz("DOUBLE", 0, 0, abb.a, abm.e);
    m = new aaz("FLOAT", 1, 1, abb.a, abm.d);
    n = new aaz("INT64", 2, 2, abb.a, abm.c);
    o = new aaz("UINT64", 3, 3, abb.a, abm.c);
    p = new aaz("INT32", 4, 4, abb.a, abm.b);
    q = new aaz("FIXED64", 5, 5, abb.a, abm.c);
    r = new aaz("FIXED32", 6, 6, abb.a, abm.b);
    s = new aaz("BOOL", 7, 7, abb.a, abm.f);
    t = new aaz("STRING", 8, 8, abb.a, abm.g);
    a = new aaz("MESSAGE", 9, 9, abb.a, abm.j);
    u = new aaz("BYTES", 10, 10, abb.a, abm.h);
    v = new aaz("UINT32", 11, 11, abb.a, abm.b);
    b = new aaz("ENUM", 12, 12, abb.a, abm.i);
    w = new aaz("SFIXED32", 13, 13, abb.a, abm.b);
    x = new aaz("SFIXED64", 14, 14, abb.a, abm.c);
    y = new aaz("SINT32", 15, 15, abb.a, abm.b);
    z = new aaz("SINT64", 16, 16, abb.a, abm.c);
    c = new aaz("GROUP", 17, 17, abb.a, abm.j);
    d = new aaz("DOUBLE_LIST", 18, 18, abb.b, abm.e);
    A = new aaz("FLOAT_LIST", 19, 19, abb.b, abm.d);
    B = new aaz("INT64_LIST", 20, 20, abb.b, abm.c);
    C = new aaz("UINT64_LIST", 21, 21, abb.b, abm.c);
    D = new aaz("INT32_LIST", 22, 22, abb.b, abm.b);
    E = new aaz("FIXED64_LIST", 23, 23, abb.b, abm.c);
    F = new aaz("FIXED32_LIST", 24, 24, abb.b, abm.b);
    G = new aaz("BOOL_LIST", 25, 25, abb.b, abm.f);
    H = new aaz("STRING_LIST", 26, 26, abb.b, abm.g);
    e = new aaz("MESSAGE_LIST", 27, 27, abb.b, abm.j);
    I = new aaz("BYTES_LIST", 28, 28, abb.b, abm.h);
    J = new aaz("UINT32_LIST", 29, 29, abb.b, abm.b);
    f = new aaz("ENUM_LIST", 30, 30, abb.b, abm.i);
    K = new aaz("SFIXED32_LIST", 31, 31, abb.b, abm.b);
    L = new aaz("SFIXED64_LIST", 32, 32, abb.b, abm.c);
    M = new aaz("SINT32_LIST", 33, 33, abb.b, abm.b);
    N = new aaz("SINT64_LIST", 34, 34, abb.b, abm.c);
    g = new aaz("DOUBLE_LIST_PACKED", 35, 35, abb.c, abm.e);
    O = new aaz("FLOAT_LIST_PACKED", 36, 36, abb.c, abm.d);
    P = new aaz("INT64_LIST_PACKED", 37, 37, abb.c, abm.c);
    Q = new aaz("UINT64_LIST_PACKED", 38, 38, abb.c, abm.c);
    R = new aaz("INT32_LIST_PACKED", 39, 39, abb.c, abm.b);
    S = new aaz("FIXED64_LIST_PACKED", 40, 40, abb.c, abm.c);
    T = new aaz("FIXED32_LIST_PACKED", 41, 41, abb.c, abm.b);
    U = new aaz("BOOL_LIST_PACKED", 42, 42, abb.c, abm.f);
    V = new aaz("UINT32_LIST_PACKED", 43, 43, abb.c, abm.b);
    h = new aaz("ENUM_LIST_PACKED", 44, 44, abb.c, abm.i);
    W = new aaz("SFIXED32_LIST_PACKED", 45, 45, abb.c, abm.b);
    X = new aaz("SFIXED64_LIST_PACKED", 46, 46, abb.c, abm.c);
    Y = new aaz("SINT32_LIST_PACKED", 47, 47, abb.c, abm.b);
    i = new aaz("SINT64_LIST_PACKED", 48, 48, abb.c, abm.c);
    j = new aaz("GROUP_LIST", 49, 49, abb.b, abm.j);
    k = new aaz("MAP", 50, 50, abb.d, abm.a);
    aaz[] arrayOfaaz1 = new aaz[51];
    arrayOfaaz1[0] = l;
    arrayOfaaz1[1] = m;
    arrayOfaaz1[2] = n;
    arrayOfaaz1[3] = o;
    arrayOfaaz1[4] = p;
    arrayOfaaz1[5] = q;
    arrayOfaaz1[6] = r;
    arrayOfaaz1[7] = s;
    arrayOfaaz1[8] = t;
    arrayOfaaz1[9] = a;
    arrayOfaaz1[10] = u;
    arrayOfaaz1[11] = v;
    arrayOfaaz1[12] = b;
    arrayOfaaz1[13] = w;
    arrayOfaaz1[14] = x;
    arrayOfaaz1[15] = y;
    arrayOfaaz1[16] = z;
    arrayOfaaz1[17] = c;
    arrayOfaaz1[18] = d;
    arrayOfaaz1[19] = A;
    arrayOfaaz1[20] = B;
    arrayOfaaz1[21] = C;
    arrayOfaaz1[22] = D;
    arrayOfaaz1[23] = E;
    arrayOfaaz1[24] = F;
    arrayOfaaz1[25] = G;
    arrayOfaaz1[26] = H;
    arrayOfaaz1[27] = e;
    arrayOfaaz1[28] = I;
    arrayOfaaz1[29] = J;
    arrayOfaaz1[30] = f;
    arrayOfaaz1[31] = K;
    arrayOfaaz1[32] = L;
    arrayOfaaz1[33] = M;
    arrayOfaaz1[34] = N;
    arrayOfaaz1[35] = g;
    arrayOfaaz1[36] = O;
    arrayOfaaz1[37] = P;
    arrayOfaaz1[38] = Q;
    arrayOfaaz1[39] = R;
    arrayOfaaz1[40] = S;
    arrayOfaaz1[41] = T;
    arrayOfaaz1[42] = U;
    arrayOfaaz1[43] = V;
    arrayOfaaz1[44] = h;
    arrayOfaaz1[45] = W;
    arrayOfaaz1[46] = X;
    arrayOfaaz1[47] = Y;
    arrayOfaaz1[48] = i;
    arrayOfaaz1[49] = j;
    arrayOfaaz1[50] = k;
    ag = arrayOfaaz1;
    af = new Type[0];
    aaz[] arrayOfaaz2 = values();
    ae = new aaz[arrayOfaaz2.length];
    int i2 = arrayOfaaz2.length;
    while (i1 < i2)
    {
      aaz localaaz = arrayOfaaz2[i1];
      ae[localaaz.aa] = localaaz;
      i1++;
    }
  }
  
  private aaz(int paramInt, abb paramabb, abm paramabm)
  {
    this.aa = paramInt;
    this.ab = paramabb;
    this.Z = paramabm;
    switch (aba.a[paramabb.ordinal()])
    {
    default: 
      this.ac = null;
    }
    for (;;)
    {
      abb localabb1 = abb.a;
      boolean bool = false;
      if (paramabb == localabb1)
      {
        int i1 = aba.b[paramabm.ordinal()];
        bool = false;
        switch (i1)
        {
        default: 
          bool = true;
        }
      }
      this.ad = bool;
      return;
      this.ac = paramabm.a();
      continue;
      this.ac = paramabm.a();
    }
  }
  
  public final int a()
  {
    return this.aa;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aaz
 * JD-Core Version:    0.7.0.1
 */