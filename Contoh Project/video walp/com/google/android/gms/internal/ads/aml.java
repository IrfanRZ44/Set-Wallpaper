package com.google.android.gms.internal.ads;

public final class aml
{
  public static final class a
    extends abe<a, a>
    implements acn
  {
    private static final a zzakg = new a();
    private static volatile acx<a> zzakh;
    
    static
    {
      abe.a(a.class, zzakg);
    }
    
    protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
    {
      Object localObject1;
      switch (amm.a[(paramInt - 1)])
      {
      default: 
        throw new UnsupportedOperationException();
      case 1: 
        localObject1 = new a();
      case 2: 
      case 3: 
      case 4: 
      case 5: 
        do
        {
          return localObject1;
          return new a(null);
          return a(zzakg, "", null);
          return zzakg;
          localObject1 = zzakh;
        } while (localObject1 != null);
        try
        {
          Object localObject3 = zzakh;
          if (localObject3 == null)
          {
            localObject3 = new abe.b(zzakg);
            zzakh = (acx)localObject3;
          }
          return localObject3;
        }
        finally {}
      case 6: 
        return Byte.valueOf((byte)1);
      }
      return null;
    }
    
    public static final class a
      extends abe.a<aml.a, a>
      implements acn
    {
      private a()
      {
        super();
      }
    }
    
    public static enum b
      implements abh
    {
      private static final abi<b> D = new amn();
      private final int E;
      
      static
      {
        a = new b("AD_REQUEST", 1, 1);
        b = new b("AD_LOADED", 2, 2);
        c = new b("AD_FAILED_TO_LOAD", 3, 3);
        d = new b("AD_FAILED_TO_LOAD_NO_FILL", 4, 4);
        e = new b("AD_IMPRESSION", 5, 5);
        i = new b("AD_FIRST_CLICK", 6, 6);
        j = new b("AD_SUBSEQUENT_CLICK", 7, 7);
        k = new b("REQUEST_WILL_START", 8, 8);
        l = new b("REQUEST_DID_END", 9, 9);
        m = new b("REQUEST_WILL_UPDATE_SIGNALS", 10, 10);
        n = new b("REQUEST_DID_UPDATE_SIGNALS", 11, 11);
        o = new b("REQUEST_WILL_BUILD_URL", 12, 12);
        p = new b("REQUEST_DID_BUILD_URL", 13, 13);
        q = new b("REQUEST_WILL_MAKE_NETWORK_REQUEST", 14, 14);
        r = new b("REQUEST_DID_RECEIVE_NETWORK_RESPONSE", 15, 15);
        s = new b("REQUEST_WILL_PROCESS_RESPONSE", 16, 16);
        t = new b("REQUEST_DID_PROCESS_RESPONSE", 17, 17);
        u = new b("REQUEST_WILL_RENDER", 18, 18);
        v = new b("REQUEST_DID_RENDER", 19, 19);
        w = new b("REQUEST_WILL_UPDATE_GMS_SIGNALS", 20, 1000);
        x = new b("REQUEST_DID_UPDATE_GMS_SIGNALS", 21, 1001);
        y = new b("REQUEST_FAILED_TO_UPDATE_GMS_SIGNALS", 22, 1002);
        z = new b("REQUEST_FAILED_TO_BUILD_URL", 23, 1003);
        A = new b("REQUEST_FAILED_TO_MAKE_NETWORK_REQUEST", 24, 1004);
        B = new b("REQUEST_FAILED_TO_PROCESS_RESPONSE", 25, 1005);
        C = new b("REQUEST_FAILED_TO_UPDATE_SIGNALS", 26, 1006);
        f = new b("BANNER_SIZE_INVALID", 27, 10000);
        g = new b("BANNER_SIZE_VALID", 28, 10001);
        b[] arrayOfb = new b[29];
        arrayOfb[0] = h;
        arrayOfb[1] = a;
        arrayOfb[2] = b;
        arrayOfb[3] = c;
        arrayOfb[4] = d;
        arrayOfb[5] = e;
        arrayOfb[6] = i;
        arrayOfb[7] = j;
        arrayOfb[8] = k;
        arrayOfb[9] = l;
        arrayOfb[10] = m;
        arrayOfb[11] = n;
        arrayOfb[12] = o;
        arrayOfb[13] = p;
        arrayOfb[14] = q;
        arrayOfb[15] = r;
        arrayOfb[16] = s;
        arrayOfb[17] = t;
        arrayOfb[18] = u;
        arrayOfb[19] = v;
        arrayOfb[20] = w;
        arrayOfb[21] = x;
        arrayOfb[22] = y;
        arrayOfb[23] = z;
        arrayOfb[24] = A;
        arrayOfb[25] = B;
        arrayOfb[26] = C;
        arrayOfb[27] = f;
        arrayOfb[28] = g;
        F = arrayOfb;
      }
      
      private b(int paramInt)
      {
        this.E = paramInt;
      }
      
      public static b a(int paramInt)
      {
        switch (paramInt)
        {
        default: 
          return null;
        case 0: 
          return h;
        case 1: 
          return a;
        case 2: 
          return b;
        case 3: 
          return c;
        case 4: 
          return d;
        case 5: 
          return e;
        case 6: 
          return i;
        case 7: 
          return j;
        case 8: 
          return k;
        case 9: 
          return l;
        case 10: 
          return m;
        case 11: 
          return n;
        case 12: 
          return o;
        case 13: 
          return p;
        case 14: 
          return q;
        case 15: 
          return r;
        case 16: 
          return s;
        case 17: 
          return t;
        case 18: 
          return u;
        case 19: 
          return v;
        case 1000: 
          return w;
        case 1001: 
          return x;
        case 1002: 
          return y;
        case 1003: 
          return z;
        case 1004: 
          return A;
        case 1005: 
          return B;
        case 1006: 
          return C;
        case 10000: 
          return f;
        }
        return g;
      }
      
      public final int a()
      {
        return this.E;
      }
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aml
 * JD-Core Version:    0.7.0.1
 */