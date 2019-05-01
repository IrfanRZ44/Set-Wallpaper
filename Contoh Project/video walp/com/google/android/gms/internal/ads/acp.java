package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import sun.misc.Unsafe;

final class acp<T>
  implements ade<T>
{
  private static final Unsafe a = ;
  private final int[] b;
  private final Object[] c;
  private final int d;
  private final int e;
  private final int f;
  private final acl g;
  private final boolean h;
  private final boolean i;
  private final boolean j;
  private final boolean k;
  private final int[] l;
  private final int[] m;
  private final int[] n;
  private final acu o;
  private final abv p;
  private final adx<?, ?> q;
  private final aat<?> r;
  private final acg s;
  
  private acp(int[] paramArrayOfInt1, Object[] paramArrayOfObject, int paramInt1, int paramInt2, int paramInt3, acl paramacl, boolean paramBoolean1, boolean paramBoolean2, int[] paramArrayOfInt2, int[] paramArrayOfInt3, int[] paramArrayOfInt4, acu paramacu, abv paramabv, adx<?, ?> paramadx, aat<?> paramaat, acg paramacg)
  {
    this.b = paramArrayOfInt1;
    this.c = paramArrayOfObject;
    this.d = paramInt1;
    this.e = paramInt2;
    this.f = paramInt3;
    this.i = (paramacl instanceof abe);
    this.j = paramBoolean1;
    if ((paramaat != null) && (paramaat.a(paramacl))) {}
    for (boolean bool = true;; bool = false)
    {
      this.h = bool;
      this.k = false;
      this.l = paramArrayOfInt2;
      this.m = paramArrayOfInt3;
      this.n = paramArrayOfInt4;
      this.o = paramacu;
      this.p = paramabv;
      this.q = paramadx;
      this.r = paramaat;
      this.g = paramacl;
      this.s = paramacg;
      return;
    }
  }
  
  private static int a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, Object paramObject, zt paramzt)
  {
    return zs.a(paramInt1, paramArrayOfByte, paramInt2, paramInt3, e(paramObject), paramzt);
  }
  
  private static int a(ade<?> paramade, int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, abj<?> paramabj, zt paramzt)
  {
    int i1 = a(paramade, paramArrayOfByte, paramInt2, paramInt3, paramzt);
    paramabj.add(paramzt.c);
    while (i1 < paramInt3)
    {
      int i2 = zs.a(paramArrayOfByte, i1, paramzt);
      if (paramInt1 != paramzt.a) {
        break;
      }
      i1 = a(paramade, paramArrayOfByte, i2, paramInt3, paramzt);
      paramabj.add(paramzt.c);
    }
    return i1;
  }
  
  private static int a(ade paramade, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, zt paramzt)
  {
    acp localacp = (acp)paramade;
    Object localObject = localacp.a();
    int i1 = localacp.a(localObject, paramArrayOfByte, paramInt1, paramInt2, paramInt3, paramzt);
    localacp.c(localObject);
    paramzt.c = localObject;
    return i1;
  }
  
  private static int a(ade paramade, byte[] paramArrayOfByte, int paramInt1, int paramInt2, zt paramzt)
  {
    int i1 = paramInt1 + 1;
    int i2 = paramArrayOfByte[paramInt1];
    if (i2 < 0) {
      i1 = zs.a(i2, paramArrayOfByte, i1, paramzt);
    }
    for (int i3 = paramzt.a;; i3 = i2)
    {
      if ((i3 < 0) || (i3 > paramInt2 - i1)) {
        throw abk.a();
      }
      Object localObject = paramade.a();
      paramade.a(localObject, paramArrayOfByte, i1, i1 + i3, paramzt);
      paramade.c(localObject);
      paramzt.c = localObject;
      return i1 + i3;
    }
  }
  
  private static <UT, UB> int a(adx<UT, UB> paramadx, T paramT)
  {
    return paramadx.f(paramadx.b(paramT));
  }
  
  private final int a(T paramT, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong, int paramInt8, zt paramzt)
  {
    Unsafe localUnsafe = a;
    long l1 = 0xFFFFF & this.b[(paramInt8 + 2)];
    int i2;
    switch (paramInt7)
    {
    default: 
    case 51: 
      do
      {
        return paramInt1;
      } while (paramInt5 != 1);
      localUnsafe.putObject(paramT, paramLong, Double.valueOf(zs.c(paramArrayOfByte, paramInt1)));
      i2 = paramInt1 + 8;
    }
    for (;;)
    {
      localUnsafe.putInt(paramT, l1, paramInt4);
      return i2;
      if (paramInt5 != 5) {
        break;
      }
      localUnsafe.putObject(paramT, paramLong, Float.valueOf(zs.d(paramArrayOfByte, paramInt1)));
      i2 = paramInt1 + 4;
      continue;
      if (paramInt5 != 0) {
        break;
      }
      i2 = zs.b(paramArrayOfByte, paramInt1, paramzt);
      localUnsafe.putObject(paramT, paramLong, Long.valueOf(paramzt.b));
      continue;
      if (paramInt5 != 0) {
        break;
      }
      i2 = zs.a(paramArrayOfByte, paramInt1, paramzt);
      localUnsafe.putObject(paramT, paramLong, Integer.valueOf(paramzt.a));
      continue;
      if (paramInt5 != 1) {
        break;
      }
      localUnsafe.putObject(paramT, paramLong, Long.valueOf(zs.b(paramArrayOfByte, paramInt1)));
      i2 = paramInt1 + 8;
      continue;
      if (paramInt5 != 5) {
        break;
      }
      localUnsafe.putObject(paramT, paramLong, Integer.valueOf(zs.a(paramArrayOfByte, paramInt1)));
      i2 = paramInt1 + 4;
      continue;
      if (paramInt5 != 0) {
        break;
      }
      int i9 = zs.b(paramArrayOfByte, paramInt1, paramzt);
      if (paramzt.b != 0L) {}
      for (boolean bool = true;; bool = false)
      {
        localUnsafe.putObject(paramT, paramLong, Boolean.valueOf(bool));
        i2 = i9;
        break;
      }
      if (paramInt5 != 2) {
        break;
      }
      int i7 = zs.a(paramArrayOfByte, paramInt1, paramzt);
      int i8 = paramzt.a;
      if (i8 == 0) {
        localUnsafe.putObject(paramT, paramLong, "");
      }
      for (;;)
      {
        localUnsafe.putInt(paramT, l1, paramInt4);
        return i7;
        if (((0x20000000 & paramInt6) != 0) && (!aef.a(paramArrayOfByte, i7, i7 + i8))) {
          throw abk.h();
        }
        localUnsafe.putObject(paramT, paramLong, new String(paramArrayOfByte, i7, i8, abg.a));
        i7 += i8;
      }
      if (paramInt5 != 2) {
        break;
      }
      int i6 = a(a(paramInt8), paramArrayOfByte, paramInt1, paramInt2, paramzt);
      Object localObject2;
      if (localUnsafe.getInt(paramT, l1) == paramInt4)
      {
        localObject2 = localUnsafe.getObject(paramT, paramLong);
        if (localObject2 != null) {
          break label553;
        }
        localUnsafe.putObject(paramT, paramLong, paramzt.c);
      }
      for (;;)
      {
        localUnsafe.putInt(paramT, l1, paramInt4);
        return i6;
        localObject2 = null;
        break;
        label553:
        localUnsafe.putObject(paramT, paramLong, abg.a(localObject2, paramzt.c));
      }
      if (paramInt5 != 2) {
        break;
      }
      int i4 = zs.a(paramArrayOfByte, paramInt1, paramzt);
      int i5 = paramzt.a;
      if (i5 == 0) {
        localUnsafe.putObject(paramT, paramLong, zw.a);
      }
      for (;;)
      {
        localUnsafe.putInt(paramT, l1, paramInt4);
        return i4;
        localUnsafe.putObject(paramT, paramLong, zw.a(paramArrayOfByte, i4, i5));
        i4 += i5;
      }
      if (paramInt5 != 0) {
        break;
      }
      i2 = zs.a(paramArrayOfByte, paramInt1, paramzt);
      int i3 = paramzt.a;
      abi localabi = c(paramInt8);
      if ((localabi == null) || (localabi.a(i3) != null))
      {
        localUnsafe.putObject(paramT, paramLong, Integer.valueOf(i3));
      }
      else
      {
        e(paramT).a(paramInt3, Long.valueOf(i3));
        return i2;
        if (paramInt5 != 0) {
          break;
        }
        i2 = zs.a(paramArrayOfByte, paramInt1, paramzt);
        localUnsafe.putObject(paramT, paramLong, Integer.valueOf(aaf.f(paramzt.a)));
        continue;
        if (paramInt5 != 0) {
          break;
        }
        i2 = zs.b(paramArrayOfByte, paramInt1, paramzt);
        localUnsafe.putObject(paramT, paramLong, Long.valueOf(aaf.a(paramzt.b)));
        continue;
        if (paramInt5 != 3) {
          break;
        }
        int i1 = 0x4 | paramInt3 & 0xFFFFFFF8;
        i2 = a(a(paramInt8), paramArrayOfByte, paramInt1, paramInt2, i1, paramzt);
        if (localUnsafe.getInt(paramT, l1) == paramInt4) {}
        for (Object localObject1 = localUnsafe.getObject(paramT, paramLong);; localObject1 = null)
        {
          if (localObject1 != null) {
            break label887;
          }
          localUnsafe.putObject(paramT, paramLong, paramzt.c);
          break;
        }
        label887:
        localUnsafe.putObject(paramT, paramLong, abg.a(localObject1, paramzt.c));
      }
    }
  }
  
  private final int a(T paramT, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong1, int paramInt7, long paramLong2, zt paramzt)
  {
    abj localabj1 = (abj)a.getObject(paramT, paramLong2);
    int i31;
    int i32;
    abj localabj2;
    if (!localabj1.a())
    {
      i31 = localabj1.size();
      if (i31 == 0)
      {
        i32 = 10;
        localabj2 = localabj1.a(i32);
        a.putObject(paramT, paramLong2, localabj2);
      }
    }
    for (;;)
    {
      switch (paramInt7)
      {
      }
      label1051:
      label1114:
      int i7;
      label2171:
      for (;;)
      {
        return paramInt1;
        i32 = i31 << 1;
        break;
        if (paramInt5 == 2)
        {
          aan localaan2 = (aan)localabj2;
          paramInt1 = zs.a(paramArrayOfByte, paramInt1, paramzt);
          int i30 = paramInt1 + paramzt.a;
          while (paramInt1 < i30)
          {
            localaan2.a(zs.c(paramArrayOfByte, paramInt1));
            paramInt1 += 8;
          }
          if (paramInt1 != i30) {
            throw abk.a();
          }
        }
        else if (paramInt5 == 1)
        {
          aan localaan1 = (aan)localabj2;
          localaan1.a(zs.c(paramArrayOfByte, paramInt1));
          paramInt1 += 8;
          while (paramInt1 < paramInt2)
          {
            int i29 = zs.a(paramArrayOfByte, paramInt1, paramzt);
            if (paramInt3 != paramzt.a) {
              break;
            }
            localaan1.a(zs.c(paramArrayOfByte, i29));
            paramInt1 = i29 + 8;
          }
          if (paramInt5 == 2)
          {
            abc localabc2 = (abc)localabj2;
            paramInt1 = zs.a(paramArrayOfByte, paramInt1, paramzt);
            int i28 = paramInt1 + paramzt.a;
            while (paramInt1 < i28)
            {
              localabc2.a(zs.d(paramArrayOfByte, paramInt1));
              paramInt1 += 4;
            }
            if (paramInt1 != i28) {
              throw abk.a();
            }
          }
          else if (paramInt5 == 5)
          {
            abc localabc1 = (abc)localabj2;
            localabc1.a(zs.d(paramArrayOfByte, paramInt1));
            paramInt1 += 4;
            while (paramInt1 < paramInt2)
            {
              int i27 = zs.a(paramArrayOfByte, paramInt1, paramzt);
              if (paramInt3 != paramzt.a) {
                break;
              }
              localabc1.a(zs.d(paramArrayOfByte, i27));
              paramInt1 = i27 + 4;
            }
            if (paramInt5 == 2)
            {
              abz localabz6 = (abz)localabj2;
              paramInt1 = zs.a(paramArrayOfByte, paramInt1, paramzt);
              int i26 = paramInt1 + paramzt.a;
              while (paramInt1 < i26)
              {
                paramInt1 = zs.b(paramArrayOfByte, paramInt1, paramzt);
                localabz6.a(paramzt.b);
              }
              if (paramInt1 != i26) {
                throw abk.a();
              }
            }
            else if (paramInt5 == 0)
            {
              abz localabz5 = (abz)localabj2;
              paramInt1 = zs.b(paramArrayOfByte, paramInt1, paramzt);
              localabz5.a(paramzt.b);
              while (paramInt1 < paramInt2)
              {
                int i25 = zs.a(paramArrayOfByte, paramInt1, paramzt);
                if (paramInt3 != paramzt.a) {
                  break;
                }
                paramInt1 = zs.b(paramArrayOfByte, i25, paramzt);
                localabz5.a(paramzt.b);
              }
              if (paramInt5 == 2) {
                return zs.a(paramArrayOfByte, paramInt1, localabj2, paramzt);
              }
              if (paramInt5 == 0)
              {
                return zs.a(paramInt3, paramArrayOfByte, paramInt1, paramInt2, localabj2, paramzt);
                if (paramInt5 == 2)
                {
                  abz localabz4 = (abz)localabj2;
                  paramInt1 = zs.a(paramArrayOfByte, paramInt1, paramzt);
                  int i24 = paramInt1 + paramzt.a;
                  while (paramInt1 < i24)
                  {
                    localabz4.a(zs.b(paramArrayOfByte, paramInt1));
                    paramInt1 += 8;
                  }
                  if (paramInt1 != i24) {
                    throw abk.a();
                  }
                }
                else if (paramInt5 == 1)
                {
                  abz localabz3 = (abz)localabj2;
                  localabz3.a(zs.b(paramArrayOfByte, paramInt1));
                  paramInt1 += 8;
                  while (paramInt1 < paramInt2)
                  {
                    int i23 = zs.a(paramArrayOfByte, paramInt1, paramzt);
                    if (paramInt3 != paramzt.a) {
                      break;
                    }
                    localabz3.a(zs.b(paramArrayOfByte, i23));
                    paramInt1 = i23 + 8;
                  }
                  if (paramInt5 == 2)
                  {
                    abf localabf4 = (abf)localabj2;
                    paramInt1 = zs.a(paramArrayOfByte, paramInt1, paramzt);
                    int i22 = paramInt1 + paramzt.a;
                    while (paramInt1 < i22)
                    {
                      localabf4.c(zs.a(paramArrayOfByte, paramInt1));
                      paramInt1 += 4;
                    }
                    if (paramInt1 != i22) {
                      throw abk.a();
                    }
                  }
                  else if (paramInt5 == 5)
                  {
                    abf localabf3 = (abf)localabj2;
                    localabf3.c(zs.a(paramArrayOfByte, paramInt1));
                    paramInt1 += 4;
                    while (paramInt1 < paramInt2)
                    {
                      int i21 = zs.a(paramArrayOfByte, paramInt1, paramzt);
                      if (paramInt3 != paramzt.a) {
                        break;
                      }
                      localabf3.c(zs.a(paramArrayOfByte, i21));
                      paramInt1 = i21 + 4;
                    }
                    if (paramInt5 == 2)
                    {
                      zu localzu2 = (zu)localabj2;
                      paramInt1 = zs.a(paramArrayOfByte, paramInt1, paramzt);
                      int i20 = paramInt1 + paramzt.a;
                      if (paramInt1 < i20)
                      {
                        paramInt1 = zs.b(paramArrayOfByte, paramInt1, paramzt);
                        if (paramzt.b != 0L) {}
                        for (boolean bool3 = true;; bool3 = false)
                        {
                          localzu2.a(bool3);
                          break;
                        }
                      }
                      if (paramInt1 != i20) {
                        throw abk.a();
                      }
                    }
                    else if (paramInt5 == 0)
                    {
                      zu localzu1 = (zu)localabj2;
                      paramInt1 = zs.b(paramArrayOfByte, paramInt1, paramzt);
                      boolean bool1;
                      if (paramzt.b != 0L)
                      {
                        bool1 = true;
                        localzu1.a(bool1);
                        if (paramInt1 >= paramInt2) {
                          continue;
                        }
                        int i19 = zs.a(paramArrayOfByte, paramInt1, paramzt);
                        if (paramInt3 != paramzt.a) {
                          continue;
                        }
                        paramInt1 = zs.b(paramArrayOfByte, i19, paramzt);
                        if (paramzt.b == 0L) {
                          break label1114;
                        }
                      }
                      for (boolean bool2 = true;; bool2 = false)
                      {
                        localzu1.a(bool2);
                        break label1051;
                        bool1 = false;
                        break;
                      }
                      if (paramInt5 == 2)
                      {
                        if ((0x20000000 & paramLong1) == 0L)
                        {
                          paramInt1 = zs.a(paramArrayOfByte, paramInt1, paramzt);
                          int i16 = paramzt.a;
                          if (i16 == 0) {
                            localabj2.add("");
                          }
                          while (paramInt1 < paramInt2)
                          {
                            int i17 = zs.a(paramArrayOfByte, paramInt1, paramzt);
                            if (paramInt3 != paramzt.a) {
                              break;
                            }
                            paramInt1 = zs.a(paramArrayOfByte, i17, paramzt);
                            int i18 = paramzt.a;
                            if (i18 == 0)
                            {
                              localabj2.add("");
                              continue;
                              Charset localCharset3 = abg.a;
                              localabj2.add(new String(paramArrayOfByte, paramInt1, i16, localCharset3));
                              paramInt1 += i16;
                            }
                            else
                            {
                              Charset localCharset4 = abg.a;
                              localabj2.add(new String(paramArrayOfByte, paramInt1, i18, localCharset4));
                              paramInt1 += i18;
                            }
                          }
                        }
                        paramInt1 = zs.a(paramArrayOfByte, paramInt1, paramzt);
                        int i11 = paramzt.a;
                        if (i11 == 0) {
                          localabj2.add("");
                        }
                        while (paramInt1 < paramInt2)
                        {
                          int i13 = zs.a(paramArrayOfByte, paramInt1, paramzt);
                          if (paramInt3 != paramzt.a) {
                            break;
                          }
                          paramInt1 = zs.a(paramArrayOfByte, i13, paramzt);
                          int i14 = paramzt.a;
                          if (i14 == 0)
                          {
                            localabj2.add("");
                            continue;
                            int i12 = paramInt1 + i11;
                            if (!aef.a(paramArrayOfByte, paramInt1, i12)) {
                              throw abk.h();
                            }
                            Charset localCharset1 = abg.a;
                            localabj2.add(new String(paramArrayOfByte, paramInt1, i11, localCharset1));
                            paramInt1 += i11;
                          }
                          else
                          {
                            int i15 = paramInt1 + i14;
                            if (!aef.a(paramArrayOfByte, paramInt1, i15)) {
                              throw abk.h();
                            }
                            Charset localCharset2 = abg.a;
                            localabj2.add(new String(paramArrayOfByte, paramInt1, i14, localCharset2));
                            paramInt1 += i14;
                          }
                        }
                        if (paramInt5 == 2)
                        {
                          return a(a(paramInt6), paramInt3, paramArrayOfByte, paramInt1, paramInt2, localabj2, paramzt);
                          if (paramInt5 == 2)
                          {
                            paramInt1 = zs.a(paramArrayOfByte, paramInt1, paramzt);
                            int i8 = paramzt.a;
                            if (i8 == 0) {
                              localabj2.add(zw.a);
                            }
                            while (paramInt1 < paramInt2)
                            {
                              int i9 = zs.a(paramArrayOfByte, paramInt1, paramzt);
                              if (paramInt3 != paramzt.a) {
                                break;
                              }
                              paramInt1 = zs.a(paramArrayOfByte, i9, paramzt);
                              int i10 = paramzt.a;
                              if (i10 == 0)
                              {
                                localabj2.add(zw.a);
                                continue;
                                localabj2.add(zw.a(paramArrayOfByte, paramInt1, i8));
                                paramInt1 += i8;
                              }
                              else
                              {
                                localabj2.add(zw.a(paramArrayOfByte, paramInt1, i10));
                                paramInt1 += i10;
                              }
                            }
                            if (paramInt5 == 2) {}
                            for (i7 = zs.a(paramArrayOfByte, paramInt1, localabj2, paramzt);; i7 = zs.a(paramInt3, paramArrayOfByte, paramInt1, paramInt2, localabj2, paramzt))
                            {
                              ady localady1 = ((abe)paramT).zzdtt;
                              if (localady1 == ady.a()) {
                                localady1 = null;
                              }
                              ady localady2 = (ady)adg.a(paramInt4, localabj2, c(paramInt6), localady1, this.q);
                              if (localady2 == null) {
                                break label2173;
                              }
                              ((abe)paramT).zzdtt = localady2;
                              return i7;
                              if (paramInt5 != 0) {
                                break;
                              }
                            }
                            if (paramInt5 == 2)
                            {
                              abf localabf2 = (abf)localabj2;
                              paramInt1 = zs.a(paramArrayOfByte, paramInt1, paramzt);
                              int i6 = paramInt1 + paramzt.a;
                              while (paramInt1 < i6)
                              {
                                paramInt1 = zs.a(paramArrayOfByte, paramInt1, paramzt);
                                localabf2.c(aaf.f(paramzt.a));
                              }
                              if (paramInt1 != i6) {
                                throw abk.a();
                              }
                            }
                            else if (paramInt5 == 0)
                            {
                              abf localabf1 = (abf)localabj2;
                              paramInt1 = zs.a(paramArrayOfByte, paramInt1, paramzt);
                              localabf1.c(aaf.f(paramzt.a));
                              while (paramInt1 < paramInt2)
                              {
                                int i5 = zs.a(paramArrayOfByte, paramInt1, paramzt);
                                if (paramInt3 != paramzt.a) {
                                  break;
                                }
                                paramInt1 = zs.a(paramArrayOfByte, i5, paramzt);
                                localabf1.c(aaf.f(paramzt.a));
                              }
                              if (paramInt5 == 2)
                              {
                                abz localabz2 = (abz)localabj2;
                                paramInt1 = zs.a(paramArrayOfByte, paramInt1, paramzt);
                                int i4 = paramInt1 + paramzt.a;
                                while (paramInt1 < i4)
                                {
                                  paramInt1 = zs.b(paramArrayOfByte, paramInt1, paramzt);
                                  localabz2.a(aaf.a(paramzt.b));
                                }
                                if (paramInt1 != i4) {
                                  throw abk.a();
                                }
                              }
                              else if (paramInt5 == 0)
                              {
                                abz localabz1 = (abz)localabj2;
                                paramInt1 = zs.b(paramArrayOfByte, paramInt1, paramzt);
                                localabz1.a(aaf.a(paramzt.b));
                                while (paramInt1 < paramInt2)
                                {
                                  int i3 = zs.a(paramArrayOfByte, paramInt1, paramzt);
                                  if (paramInt3 != paramzt.a) {
                                    break;
                                  }
                                  paramInt1 = zs.b(paramArrayOfByte, i3, paramzt);
                                  localabz1.a(aaf.a(paramzt.b));
                                }
                                if (paramInt5 == 3)
                                {
                                  ade localade = a(paramInt6);
                                  int i1 = 0x4 | paramInt3 & 0xFFFFFFF8;
                                  paramInt1 = a(localade, paramArrayOfByte, paramInt1, paramInt2, i1, paramzt);
                                  localabj2.add(paramzt.c);
                                  for (;;)
                                  {
                                    if (paramInt1 >= paramInt2) {
                                      break label2171;
                                    }
                                    int i2 = zs.a(paramArrayOfByte, paramInt1, paramzt);
                                    if (paramInt3 != paramzt.a) {
                                      break;
                                    }
                                    paramInt1 = a(localade, paramArrayOfByte, i2, paramInt2, i1, paramzt);
                                    localabj2.add(paramzt.c);
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      label2173:
      return i7;
      localabj2 = localabj1;
    }
  }
  
  private final <K, V> int a(T paramT, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong, zt paramzt)
  {
    Unsafe localUnsafe = a;
    Object localObject1 = b(paramInt3);
    Object localObject2 = localUnsafe.getObject(paramT, paramLong);
    Object localObject3;
    if (this.s.c(localObject2))
    {
      localObject3 = this.s.e(localObject1);
      this.s.a(localObject3, localObject2);
      localUnsafe.putObject(paramT, paramLong, localObject3);
    }
    for (;;)
    {
      ace localace = this.s.f(localObject1);
      Map localMap = this.s.a(localObject3);
      int i1 = zs.a(paramArrayOfByte, paramInt1, paramzt);
      int i2 = paramzt.a;
      if ((i2 < 0) || (i2 > paramInt2 - i1)) {
        throw abk.a();
      }
      int i3 = i1 + i2;
      Object localObject4 = localace.b;
      Object localObject5 = localace.d;
      Object localObject6 = localObject4;
      int i4 = i1;
      while (i4 < i3)
      {
        int i5 = i4 + 1;
        int i6 = paramArrayOfByte[i4];
        if (i6 < 0)
        {
          i5 = zs.a(i6, paramArrayOfByte, i5, paramzt);
          i6 = paramzt.a;
        }
        int i7 = i6 >>> 3;
        int i8 = i6 & 0x7;
        switch (i7)
        {
        }
        do
        {
          do
          {
            i4 = zs.a(i6, paramArrayOfByte, i5, paramInt2, paramzt);
            break;
          } while (i8 != localace.a.b());
          int i10 = a(paramArrayOfByte, i5, paramInt2, localace.a, null, paramzt);
          localObject6 = paramzt.c;
          i4 = i10;
          break;
        } while (i8 != localace.c.b());
        int i9 = a(paramArrayOfByte, i5, paramInt2, localace.c, localace.d.getClass(), paramzt);
        localObject5 = paramzt.c;
        i4 = i9;
      }
      if (i4 != i3) {
        throw abk.g();
      }
      localMap.put(localObject6, localObject5);
      return i3;
      localObject3 = localObject2;
    }
  }
  
  private final int a(T paramT, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, zt paramzt)
  {
    Unsafe localUnsafe = a;
    int i1 = -1;
    int i2 = 0;
    int i3 = 0;
    int i4 = paramInt1;
    int i9;
    int i10;
    int i11;
    int i12;
    int i13;
    int i14;
    long l1;
    int i5;
    int i6;
    label292:
    abj localabj1;
    int i15;
    int i16;
    label1106:
    abj localabj2;
    if (i4 < paramInt2)
    {
      i9 = i4 + 1;
      i3 = paramArrayOfByte[i4];
      if (i3 < 0)
      {
        i9 = zs.a(i3, paramArrayOfByte, i9, paramzt);
        i3 = paramzt.a;
      }
      i10 = i3 >>> 3;
      i11 = i3 & 0x7;
      i12 = g(i10);
      if (i12 == -1) {
        break label1451;
      }
      i13 = this.b[(i12 + 1)];
      i14 = (0xFF00000 & i13) >>> 20;
      l1 = 0xFFFFF & i13;
      if (i14 <= 17)
      {
        int i17 = this.b[(i12 + 2)];
        int i18 = 1 << (i17 >>> 20);
        int i19 = i17 & 0xFFFFF;
        if (i19 != i1)
        {
          if (i1 != -1) {
            localUnsafe.putInt(paramT, i1, i2);
          }
          i2 = localUnsafe.getInt(paramT, i19);
          i1 = i19;
        }
        switch (i14)
        {
        }
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  do
                  {
                    do
                    {
                      do
                      {
                        do
                        {
                          do
                          {
                            do
                            {
                              do
                              {
                                do
                                {
                                  do
                                  {
                                    i5 = i2;
                                    i6 = i1;
                                    i4 = i9;
                                    if ((i3 == paramInt3) && (paramInt3 != 0)) {
                                      break label1324;
                                    }
                                    i4 = a(i3, paramArrayOfByte, i4, paramInt2, paramT, paramzt);
                                    i2 = i5;
                                    i1 = i6;
                                    break;
                                  } while (i11 != 1);
                                  aed.a(paramT, l1, zs.c(paramArrayOfByte, i9));
                                  i4 = i9 + 8;
                                  i2 |= i18;
                                  break;
                                } while (i11 != 5);
                                aed.a(paramT, l1, zs.d(paramArrayOfByte, i9));
                                i4 = i9 + 4;
                                i2 |= i18;
                                break;
                              } while (i11 != 0);
                              i4 = zs.b(paramArrayOfByte, i9, paramzt);
                              localUnsafe.putLong(paramT, l1, paramzt.b);
                              i2 |= i18;
                              break;
                            } while (i11 != 0);
                            i4 = zs.a(paramArrayOfByte, i9, paramzt);
                            localUnsafe.putInt(paramT, l1, paramzt.a);
                            i2 |= i18;
                            break;
                          } while (i11 != 1);
                          localUnsafe.putLong(paramT, l1, zs.b(paramArrayOfByte, i9));
                          i4 = i9 + 8;
                          i2 |= i18;
                          break;
                        } while (i11 != 5);
                        localUnsafe.putInt(paramT, l1, zs.a(paramArrayOfByte, i9));
                        i4 = i9 + 4;
                        i2 |= i18;
                        break;
                      } while (i11 != 0);
                      i4 = zs.b(paramArrayOfByte, i9, paramzt);
                      if (paramzt.b != 0L) {}
                      for (boolean bool = true;; bool = false)
                      {
                        aed.a(paramT, l1, bool);
                        i2 |= i18;
                        break;
                      }
                    } while (i11 != 2);
                    if ((0x20000000 & i13) == 0) {}
                    for (int i22 = zs.c(paramArrayOfByte, i9, paramzt);; i22 = zs.d(paramArrayOfByte, i9, paramzt))
                    {
                      localUnsafe.putObject(paramT, l1, paramzt.c);
                      i2 |= i18;
                      i4 = i22;
                      break;
                    }
                  } while (i11 != 2);
                  i4 = a(a(i12), paramArrayOfByte, i9, paramInt2, paramzt);
                  if ((i2 & i18) == 0) {
                    localUnsafe.putObject(paramT, l1, paramzt.c);
                  }
                  for (;;)
                  {
                    i2 |= i18;
                    break;
                    localUnsafe.putObject(paramT, l1, abg.a(localUnsafe.getObject(paramT, l1), paramzt.c));
                  }
                } while (i11 != 2);
                i4 = zs.e(paramArrayOfByte, i9, paramzt);
                localUnsafe.putObject(paramT, l1, paramzt.c);
                i2 |= i18;
                break;
              } while (i11 != 0);
              i4 = zs.a(paramArrayOfByte, i9, paramzt);
              int i21 = paramzt.a;
              abi localabi = c(i12);
              if ((localabi == null) || (localabi.a(i21) != null))
              {
                localUnsafe.putInt(paramT, l1, i21);
                i2 |= i18;
                break;
              }
              ady localady = e(paramT);
              Long localLong = Long.valueOf(i21);
              localady.a(i3, localLong);
              break;
            } while (i11 != 0);
            i4 = zs.a(paramArrayOfByte, i9, paramzt);
            localUnsafe.putInt(paramT, l1, aaf.f(paramzt.a));
            i2 |= i18;
            break;
          } while (i11 != 0);
          i4 = zs.b(paramArrayOfByte, i9, paramzt);
          localUnsafe.putLong(paramT, l1, aaf.a(paramzt.b));
          i2 |= i18;
          break;
        } while (i11 != 3);
        int i20 = 0x4 | i10 << 3;
        i4 = a(a(i12), paramArrayOfByte, i9, paramInt2, i20, paramzt);
        if ((i2 & i18) == 0) {
          localUnsafe.putObject(paramT, l1, paramzt.c);
        }
        for (;;)
        {
          i2 |= i18;
          break;
          localUnsafe.putObject(paramT, l1, abg.a(localUnsafe.getObject(paramT, l1), paramzt.c));
        }
      }
      if (i14 == 27)
      {
        if (i11 != 2) {
          break label1451;
        }
        localabj1 = (abj)localUnsafe.getObject(paramT, l1);
        if (localabj1.a()) {
          break label1466;
        }
        i15 = localabj1.size();
        if (i15 == 0)
        {
          i16 = 10;
          localabj2 = localabj1.a(i16);
          localUnsafe.putObject(paramT, l1, localabj2);
        }
      }
    }
    for (;;)
    {
      i4 = a(a(i12), i3, paramArrayOfByte, i9, paramInt2, localabj2, paramzt);
      break;
      i16 = i15 << 1;
      break label1106;
      if (i14 <= 49)
      {
        long l2 = i13;
        i4 = a(paramT, paramArrayOfByte, i9, paramInt2, i3, i10, i11, i12, l2, i14, l1, paramzt);
        if (i4 != i9) {
          break;
        }
        i5 = i2;
        i6 = i1;
        break label292;
      }
      if (i14 == 50)
      {
        if (i11 != 2) {
          break label1451;
        }
        i4 = a(paramT, paramArrayOfByte, i9, paramInt2, i12, i10, l1, paramzt);
        if (i4 != i9) {
          break;
        }
        i5 = i2;
        i6 = i1;
        break label292;
      }
      i4 = a(paramT, paramArrayOfByte, i9, paramInt2, i3, i10, i11, i13, i14, l1, i12, paramzt);
      if (i4 != i9) {
        break;
      }
      i5 = i2;
      i6 = i1;
      break label292;
      i5 = i2;
      i6 = i1;
      label1324:
      if (i6 != -1) {
        localUnsafe.putInt(paramT, i6, i5);
      }
      if (this.m != null)
      {
        int[] arrayOfInt = this.m;
        int i7 = arrayOfInt.length;
        Object localObject = null;
        for (int i8 = 0; i8 < i7; i8++) {
          localObject = (ady)a(paramT, arrayOfInt[i8], localObject, this.q);
        }
        if (localObject != null) {
          this.q.b(paramT, localObject);
        }
      }
      if (paramInt3 == 0)
      {
        if (i4 != paramInt2) {
          throw abk.g();
        }
      }
      else if ((i4 > paramInt2) || (i3 != paramInt3)) {
        throw abk.g();
      }
      return i4;
      label1451:
      i5 = i2;
      i6 = i1;
      i4 = i9;
      break label292;
      label1466:
      localabj2 = localabj1;
    }
  }
  
  private static int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, ael paramael, Class<?> paramClass, zt paramzt)
  {
    switch (acq.a[paramael.ordinal()])
    {
    default: 
      throw new RuntimeException("unsupported field type.");
    case 1: 
      int i5 = zs.b(paramArrayOfByte, paramInt1, paramzt);
      if (paramzt.b != 0L) {}
      for (boolean bool = true;; bool = false)
      {
        paramzt.c = Boolean.valueOf(bool);
        return i5;
      }
    case 2: 
      return zs.e(paramArrayOfByte, paramInt1, paramzt);
    case 3: 
      paramzt.c = Double.valueOf(zs.c(paramArrayOfByte, paramInt1));
      return paramInt1 + 8;
    case 4: 
    case 5: 
      paramzt.c = Integer.valueOf(zs.a(paramArrayOfByte, paramInt1));
      return paramInt1 + 4;
    case 6: 
    case 7: 
      paramzt.c = Long.valueOf(zs.b(paramArrayOfByte, paramInt1));
      return paramInt1 + 8;
    case 8: 
      paramzt.c = Float.valueOf(zs.d(paramArrayOfByte, paramInt1));
      return paramInt1 + 4;
    case 9: 
    case 10: 
    case 11: 
      int i4 = zs.a(paramArrayOfByte, paramInt1, paramzt);
      paramzt.c = Integer.valueOf(paramzt.a);
      return i4;
    case 12: 
    case 13: 
      int i3 = zs.b(paramArrayOfByte, paramInt1, paramzt);
      paramzt.c = Long.valueOf(paramzt.b);
      return i3;
    case 14: 
      return a(acy.a().a(paramClass), paramArrayOfByte, paramInt1, paramInt2, paramzt);
    case 15: 
      int i2 = zs.a(paramArrayOfByte, paramInt1, paramzt);
      paramzt.c = Integer.valueOf(aaf.f(paramzt.a));
      return i2;
    case 16: 
      int i1 = zs.b(paramArrayOfByte, paramInt1, paramzt);
      paramzt.c = Long.valueOf(aaf.a(paramzt.b));
      return i1;
    }
    return zs.d(paramArrayOfByte, paramInt1, paramzt);
  }
  
  static <T> acp<T> a(Class<T> paramClass, acj paramacj, acu paramacu, abv paramabv, adx<?, ?> paramadx, aat<?> paramaat, acg paramacg)
  {
    if ((paramacj instanceof ada))
    {
      ada localada = (ada)paramacj;
      boolean bool;
      int i1;
      int i2;
      int i3;
      label44:
      int[] arrayOfInt1;
      Object[] arrayOfObject;
      int[] arrayOfInt2;
      if (localada.a() == abe.e.i)
      {
        bool = true;
        if (localada.g() != 0) {
          break label178;
        }
        i1 = 0;
        i2 = 0;
        i3 = 0;
        arrayOfInt1 = new int[i3 << 2];
        arrayOfObject = new Object[i3 << 1];
        if (localada.h() <= 0) {
          break label202;
        }
        arrayOfInt2 = new int[localada.h()];
        label78:
        if (localada.i() <= 0) {
          break label208;
        }
      }
      int i4;
      int i5;
      adb localadb;
      int i6;
      int i7;
      label178:
      label202:
      label208:
      for (int[] arrayOfInt3 = new int[localada.i()];; arrayOfInt3 = null)
      {
        i4 = 0;
        i5 = 0;
        localadb = localada.d();
        if (!localadb.a()) {
          break label611;
        }
        i6 = localadb.b();
        i7 = 0;
        if ((i6 >= localada.l()) || (i7 >= i6 - i1 << 2)) {
          break label214;
        }
        for (int i17 = 0; i17 < 4; i17++) {
          arrayOfInt1[(i7 + i17)] = -1;
        }
        bool = false;
        break;
        i1 = localada.e();
        i2 = localada.f();
        i3 = localada.k();
        break label44;
        arrayOfInt2 = null;
        break label78;
      }
      label214:
      int i8;
      int i9;
      int i10;
      label247:
      int i12;
      label275:
      int i13;
      label288:
      label371:
      int i14;
      if (localadb.d())
      {
        i8 = (int)aed.a(localadb.e());
        i9 = (int)aed.a(localadb.f());
        i10 = 0;
        arrayOfInt1[i7] = localadb.b();
        int i11 = i7 + 1;
        if (!localadb.l()) {
          break label476;
        }
        i12 = 536870912;
        if (!localadb.k()) {
          break label482;
        }
        i13 = 268435456;
        arrayOfInt1[i11] = (i8 | i12 | i13 | localadb.c() << 20);
        arrayOfInt1[(i7 + 2)] = (i9 | i10 << 20);
        if (localadb.o() == null) {
          break label515;
        }
        arrayOfObject[(i7 / 4 << 1)] = localadb.o();
        if (localadb.m() == null) {
          break label488;
        }
        arrayOfObject[(1 + (i7 / 4 << 1))] = localadb.m();
        i14 = localadb.c();
        if (i14 != aaz.k.ordinal()) {
          break label569;
        }
        int i16 = i4 + 1;
        arrayOfInt2[i4] = i7;
        i4 = i16;
      }
      for (;;)
      {
        if (!localadb.a()) {
          break label611;
        }
        i6 = localadb.b();
        i7 += 4;
        break;
        i8 = (int)aed.a(localadb.g());
        if (localadb.h())
        {
          i9 = (int)aed.a(localadb.i());
          i10 = localadb.j();
          break label247;
        }
        i9 = 0;
        i10 = 0;
        break label247;
        label476:
        i12 = 0;
        break label275;
        label482:
        i13 = 0;
        break label288;
        label488:
        if (localadb.n() == null) {
          break label371;
        }
        arrayOfObject[(1 + (i7 / 4 << 1))] = localadb.n();
        break label371;
        label515:
        if (localadb.m() != null)
        {
          arrayOfObject[(1 + (i7 / 4 << 1))] = localadb.m();
          break label371;
        }
        if (localadb.n() == null) {
          break label371;
        }
        arrayOfObject[(1 + (i7 / 4 << 1))] = localadb.n();
        break label371;
        label569:
        if ((i14 >= 18) && (i14 <= 49))
        {
          int i15 = i5 + 1;
          arrayOfInt3[i5] = (0xFFFFF & arrayOfInt1[(i7 + 1)]);
          i5 = i15;
        }
      }
      label611:
      return new acp(arrayOfInt1, arrayOfObject, i1, i2, localada.l(), localada.c(), bool, false, localada.j(), arrayOfInt2, arrayOfInt3, paramacu, paramabv, paramadx, paramaat, paramacg);
    }
    ((adr)paramacj).a();
    throw new NoSuchMethodError();
  }
  
  private final ade a(int paramInt)
  {
    int i1 = paramInt / 4 << 1;
    ade localade1 = (ade)this.c[i1];
    if (localade1 != null) {
      return localade1;
    }
    ade localade2 = acy.a().a((Class)this.c[(i1 + 1)]);
    this.c[i1] = localade2;
    return localade2;
  }
  
  private final <K, V, UT, UB> UB a(int paramInt1, int paramInt2, Map<K, V> paramMap, abi<?> paramabi, UB paramUB, adx<UT, UB> paramadx)
  {
    ace localace = this.s.f(b(paramInt1));
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (paramabi.a(((Integer)localEntry.getValue()).intValue()) == null)
      {
        if (paramUB == null) {
          paramUB = paramadx.a();
        }
        aab localaab = zw.b(acd.a(localace, localEntry.getKey(), localEntry.getValue()));
        aak localaak = localaab.b();
        try
        {
          acd.a(localaak, localace, localEntry.getKey(), localEntry.getValue());
          paramadx.a(paramUB, paramInt2, localaab.a());
          localIterator.remove();
        }
        catch (IOException localIOException)
        {
          throw new RuntimeException(localIOException);
        }
      }
    }
    return paramUB;
  }
  
  private final <UT, UB> UB a(Object paramObject, int paramInt, UB paramUB, adx<UT, UB> paramadx)
  {
    int i1 = this.b[paramInt];
    Object localObject = aed.f(paramObject, 0xFFFFF & d(paramInt));
    if (localObject == null) {}
    abi localabi;
    do
    {
      return paramUB;
      localabi = c(paramInt);
    } while (localabi == null);
    return a(paramInt, i1, this.s.a(localObject), localabi, paramUB, paramadx);
  }
  
  private static <E> List<E> a(Object paramObject, long paramLong)
  {
    return (List)aed.f(paramObject, paramLong);
  }
  
  private static void a(int paramInt, Object paramObject, aer paramaer)
  {
    if ((paramObject instanceof String))
    {
      paramaer.a(paramInt, (String)paramObject);
      return;
    }
    paramaer.a(paramInt, (zw)paramObject);
  }
  
  private static <UT, UB> void a(adx<UT, UB> paramadx, T paramT, aer paramaer)
  {
    paramadx.a(paramadx.b(paramT), paramaer);
  }
  
  private final <K, V> void a(aer paramaer, int paramInt1, Object paramObject, int paramInt2)
  {
    if (paramObject != null) {
      paramaer.a(paramInt1, this.s.f(b(paramInt2)), this.s.b(paramObject));
    }
  }
  
  private final void a(Object paramObject, int paramInt, add paramadd)
  {
    if (f(paramInt))
    {
      aed.a(paramObject, paramInt & 0xFFFFF, paramadd.m());
      return;
    }
    if (this.i)
    {
      aed.a(paramObject, paramInt & 0xFFFFF, paramadd.l());
      return;
    }
    aed.a(paramObject, paramInt & 0xFFFFF, paramadd.n());
  }
  
  private final void a(T paramT1, T paramT2, int paramInt)
  {
    long l1 = 0xFFFFF & d(paramInt);
    if (!a(paramT2, paramInt)) {}
    Object localObject2;
    do
    {
      return;
      Object localObject1 = aed.f(paramT1, l1);
      localObject2 = aed.f(paramT2, l1);
      if ((localObject1 != null) && (localObject2 != null))
      {
        aed.a(paramT1, l1, abg.a(localObject1, localObject2));
        b(paramT1, paramInt);
        return;
      }
    } while (localObject2 == null);
    aed.a(paramT1, l1, localObject2);
    b(paramT1, paramInt);
  }
  
  private final boolean a(T paramT, int paramInt)
  {
    if (this.j)
    {
      int i2 = d(paramInt);
      long l1 = i2 & 0xFFFFF;
      switch ((i2 & 0xFF00000) >>> 20)
      {
      default: 
        throw new IllegalArgumentException();
      case 0: 
        return aed.e(paramT, l1) != 0.0D;
      case 1: 
        return aed.d(paramT, l1) != 0.0F;
      case 2: 
        return aed.b(paramT, l1) != 0L;
      case 3: 
        return aed.b(paramT, l1) != 0L;
      case 4: 
        return aed.a(paramT, l1) != 0;
      case 5: 
        return aed.b(paramT, l1) != 0L;
      case 6: 
        return aed.a(paramT, l1) != 0;
      case 7: 
        return aed.c(paramT, l1);
      case 8: 
        Object localObject = aed.f(paramT, l1);
        if ((localObject instanceof String)) {
          return !((String)localObject).isEmpty();
        }
        if ((localObject instanceof zw)) {
          return !zw.a.equals(localObject);
        }
        throw new IllegalArgumentException();
      case 9: 
        return aed.f(paramT, l1) != null;
      case 10: 
        return !zw.a.equals(aed.f(paramT, l1));
      case 11: 
        return aed.a(paramT, l1) != 0;
      case 12: 
        return aed.a(paramT, l1) != 0;
      case 13: 
        return aed.a(paramT, l1) != 0;
      case 14: 
        return aed.b(paramT, l1) != 0L;
      case 15: 
        return aed.a(paramT, l1) != 0;
      case 16: 
        return aed.b(paramT, l1) != 0L;
      }
      return aed.f(paramT, l1) != null;
    }
    int i1 = e(paramInt);
    return (1 << (i1 >>> 20) & aed.a(paramT, i1 & 0xFFFFF)) != 0;
  }
  
  private final boolean a(T paramT, int paramInt1, int paramInt2)
  {
    return aed.a(paramT, 0xFFFFF & e(paramInt2)) == paramInt1;
  }
  
  private final boolean a(T paramT, int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.j) {
      return a(paramT, paramInt1);
    }
    return (paramInt2 & paramInt3) != 0;
  }
  
  private static boolean a(Object paramObject, int paramInt, ade paramade)
  {
    return paramade.d(aed.f(paramObject, 0xFFFFF & paramInt));
  }
  
  private static <T> double b(T paramT, long paramLong)
  {
    return ((Double)aed.f(paramT, paramLong)).doubleValue();
  }
  
  private final Object b(int paramInt)
  {
    return this.c[(paramInt / 4 << 1)];
  }
  
  private final void b(T paramT, int paramInt)
  {
    if (this.j) {
      return;
    }
    int i1 = e(paramInt);
    int i2 = 1 << (i1 >>> 20);
    long l1 = i1 & 0xFFFFF;
    aed.a(paramT, l1, i2 | aed.a(paramT, l1));
  }
  
  private final void b(T paramT, int paramInt1, int paramInt2)
  {
    aed.a(paramT, 0xFFFFF & e(paramInt2), paramInt1);
  }
  
  private final void b(T paramT, aer paramaer)
  {
    boolean bool1 = this.h;
    Map.Entry localEntry1 = null;
    Iterator localIterator = null;
    if (bool1)
    {
      aaw localaaw = this.r.a(paramT);
      boolean bool2 = localaaw.b();
      localEntry1 = null;
      localIterator = null;
      if (!bool2)
      {
        localIterator = localaaw.e();
        localEntry1 = (Map.Entry)localIterator.next();
      }
    }
    int i1 = this.b.length;
    Unsafe localUnsafe = a;
    int i2 = 0;
    int i3 = -1;
    Object localObject1 = localEntry1;
    int i4 = 0;
    int i12;
    Object localObject3;
    int i8;
    int i10;
    int i9;
    label197:
    Object localObject2;
    if (i2 < i1)
    {
      int i5 = d(i2);
      int i6 = this.b[i2];
      int i7 = (0xFF00000 & i5) >>> 20;
      if ((!this.j) && (i7 <= 17))
      {
        int i11 = this.b[(i2 + 2)];
        i12 = 0xFFFFF & i11;
        if (i12 != i3)
        {
          i4 = localUnsafe.getInt(paramT, i12);
          int i13 = 1 << (i11 >>> 20);
          localObject3 = localObject1;
          i8 = i12;
          i10 = i13;
          i9 = i4;
          if ((localObject3 != null) && (this.r.a(localObject3) <= i6))
          {
            this.r.a(paramaer, localObject3);
            if (localIterator.hasNext()) {}
            for (Map.Entry localEntry2 = (Map.Entry)localIterator.next();; localEntry2 = null)
            {
              localObject3 = localEntry2;
              break;
            }
          }
          long l1 = 0xFFFFF & i5;
          switch (i7)
          {
          }
          for (;;)
          {
            i2 += 4;
            i4 = i9;
            i3 = i8;
            localObject1 = localObject3;
            break;
            if ((i9 & i10) != 0)
            {
              paramaer.a(i6, aed.e(paramT, l1));
              continue;
              if ((i9 & i10) != 0)
              {
                paramaer.a(i6, aed.d(paramT, l1));
                continue;
                if ((i9 & i10) != 0)
                {
                  paramaer.a(i6, localUnsafe.getLong(paramT, l1));
                  continue;
                  if ((i9 & i10) != 0)
                  {
                    paramaer.c(i6, localUnsafe.getLong(paramT, l1));
                    continue;
                    if ((i9 & i10) != 0)
                    {
                      paramaer.c(i6, localUnsafe.getInt(paramT, l1));
                      continue;
                      if ((i9 & i10) != 0)
                      {
                        paramaer.d(i6, localUnsafe.getLong(paramT, l1));
                        continue;
                        if ((i9 & i10) != 0)
                        {
                          paramaer.d(i6, localUnsafe.getInt(paramT, l1));
                          continue;
                          if ((i9 & i10) != 0)
                          {
                            paramaer.a(i6, aed.c(paramT, l1));
                            continue;
                            if ((i9 & i10) != 0)
                            {
                              a(i6, localUnsafe.getObject(paramT, l1), paramaer);
                              continue;
                              if ((i9 & i10) != 0)
                              {
                                paramaer.a(i6, localUnsafe.getObject(paramT, l1), a(i2));
                                continue;
                                if ((i9 & i10) != 0)
                                {
                                  paramaer.a(i6, (zw)localUnsafe.getObject(paramT, l1));
                                  continue;
                                  if ((i9 & i10) != 0)
                                  {
                                    paramaer.e(i6, localUnsafe.getInt(paramT, l1));
                                    continue;
                                    if ((i9 & i10) != 0)
                                    {
                                      paramaer.b(i6, localUnsafe.getInt(paramT, l1));
                                      continue;
                                      if ((i9 & i10) != 0)
                                      {
                                        paramaer.a(i6, localUnsafe.getInt(paramT, l1));
                                        continue;
                                        if ((i9 & i10) != 0)
                                        {
                                          paramaer.b(i6, localUnsafe.getLong(paramT, l1));
                                          continue;
                                          if ((i9 & i10) != 0)
                                          {
                                            paramaer.f(i6, localUnsafe.getInt(paramT, l1));
                                            continue;
                                            if ((i9 & i10) != 0)
                                            {
                                              paramaer.e(i6, localUnsafe.getLong(paramT, l1));
                                              continue;
                                              if ((i9 & i10) != 0)
                                              {
                                                paramaer.b(i6, localUnsafe.getObject(paramT, l1), a(i2));
                                                continue;
                                                adg.a(this.b[i2], (List)localUnsafe.getObject(paramT, l1), paramaer, false);
                                                continue;
                                                adg.b(this.b[i2], (List)localUnsafe.getObject(paramT, l1), paramaer, false);
                                                continue;
                                                adg.c(this.b[i2], (List)localUnsafe.getObject(paramT, l1), paramaer, false);
                                                continue;
                                                adg.d(this.b[i2], (List)localUnsafe.getObject(paramT, l1), paramaer, false);
                                                continue;
                                                adg.h(this.b[i2], (List)localUnsafe.getObject(paramT, l1), paramaer, false);
                                                continue;
                                                adg.f(this.b[i2], (List)localUnsafe.getObject(paramT, l1), paramaer, false);
                                                continue;
                                                adg.k(this.b[i2], (List)localUnsafe.getObject(paramT, l1), paramaer, false);
                                                continue;
                                                adg.n(this.b[i2], (List)localUnsafe.getObject(paramT, l1), paramaer, false);
                                                continue;
                                                adg.a(this.b[i2], (List)localUnsafe.getObject(paramT, l1), paramaer);
                                                continue;
                                                adg.a(this.b[i2], (List)localUnsafe.getObject(paramT, l1), paramaer, a(i2));
                                                continue;
                                                adg.b(this.b[i2], (List)localUnsafe.getObject(paramT, l1), paramaer);
                                                continue;
                                                adg.i(this.b[i2], (List)localUnsafe.getObject(paramT, l1), paramaer, false);
                                                continue;
                                                adg.m(this.b[i2], (List)localUnsafe.getObject(paramT, l1), paramaer, false);
                                                continue;
                                                adg.l(this.b[i2], (List)localUnsafe.getObject(paramT, l1), paramaer, false);
                                                continue;
                                                adg.g(this.b[i2], (List)localUnsafe.getObject(paramT, l1), paramaer, false);
                                                continue;
                                                adg.j(this.b[i2], (List)localUnsafe.getObject(paramT, l1), paramaer, false);
                                                continue;
                                                adg.e(this.b[i2], (List)localUnsafe.getObject(paramT, l1), paramaer, false);
                                                continue;
                                                adg.a(this.b[i2], (List)localUnsafe.getObject(paramT, l1), paramaer, true);
                                                continue;
                                                adg.b(this.b[i2], (List)localUnsafe.getObject(paramT, l1), paramaer, true);
                                                continue;
                                                adg.c(this.b[i2], (List)localUnsafe.getObject(paramT, l1), paramaer, true);
                                                continue;
                                                adg.d(this.b[i2], (List)localUnsafe.getObject(paramT, l1), paramaer, true);
                                                continue;
                                                adg.h(this.b[i2], (List)localUnsafe.getObject(paramT, l1), paramaer, true);
                                                continue;
                                                adg.f(this.b[i2], (List)localUnsafe.getObject(paramT, l1), paramaer, true);
                                                continue;
                                                adg.k(this.b[i2], (List)localUnsafe.getObject(paramT, l1), paramaer, true);
                                                continue;
                                                adg.n(this.b[i2], (List)localUnsafe.getObject(paramT, l1), paramaer, true);
                                                continue;
                                                adg.i(this.b[i2], (List)localUnsafe.getObject(paramT, l1), paramaer, true);
                                                continue;
                                                adg.m(this.b[i2], (List)localUnsafe.getObject(paramT, l1), paramaer, true);
                                                continue;
                                                adg.l(this.b[i2], (List)localUnsafe.getObject(paramT, l1), paramaer, true);
                                                continue;
                                                adg.g(this.b[i2], (List)localUnsafe.getObject(paramT, l1), paramaer, true);
                                                continue;
                                                adg.j(this.b[i2], (List)localUnsafe.getObject(paramT, l1), paramaer, true);
                                                continue;
                                                adg.e(this.b[i2], (List)localUnsafe.getObject(paramT, l1), paramaer, true);
                                                continue;
                                                adg.b(this.b[i2], (List)localUnsafe.getObject(paramT, l1), paramaer, a(i2));
                                                continue;
                                                a(paramaer, i6, localUnsafe.getObject(paramT, l1), i2);
                                                continue;
                                                if (a(paramT, i6, i2))
                                                {
                                                  paramaer.a(i6, b(paramT, l1));
                                                  continue;
                                                  if (a(paramT, i6, i2))
                                                  {
                                                    paramaer.a(i6, c(paramT, l1));
                                                    continue;
                                                    if (a(paramT, i6, i2))
                                                    {
                                                      paramaer.a(i6, e(paramT, l1));
                                                      continue;
                                                      if (a(paramT, i6, i2))
                                                      {
                                                        paramaer.c(i6, e(paramT, l1));
                                                        continue;
                                                        if (a(paramT, i6, i2))
                                                        {
                                                          paramaer.c(i6, d(paramT, l1));
                                                          continue;
                                                          if (a(paramT, i6, i2))
                                                          {
                                                            paramaer.d(i6, e(paramT, l1));
                                                            continue;
                                                            if (a(paramT, i6, i2))
                                                            {
                                                              paramaer.d(i6, d(paramT, l1));
                                                              continue;
                                                              if (a(paramT, i6, i2))
                                                              {
                                                                paramaer.a(i6, f(paramT, l1));
                                                                continue;
                                                                if (a(paramT, i6, i2))
                                                                {
                                                                  a(i6, localUnsafe.getObject(paramT, l1), paramaer);
                                                                  continue;
                                                                  if (a(paramT, i6, i2))
                                                                  {
                                                                    paramaer.a(i6, localUnsafe.getObject(paramT, l1), a(i2));
                                                                    continue;
                                                                    if (a(paramT, i6, i2))
                                                                    {
                                                                      paramaer.a(i6, (zw)localUnsafe.getObject(paramT, l1));
                                                                      continue;
                                                                      if (a(paramT, i6, i2))
                                                                      {
                                                                        paramaer.e(i6, d(paramT, l1));
                                                                        continue;
                                                                        if (a(paramT, i6, i2))
                                                                        {
                                                                          paramaer.b(i6, d(paramT, l1));
                                                                          continue;
                                                                          if (a(paramT, i6, i2))
                                                                          {
                                                                            paramaer.a(i6, d(paramT, l1));
                                                                            continue;
                                                                            if (a(paramT, i6, i2))
                                                                            {
                                                                              paramaer.b(i6, e(paramT, l1));
                                                                              continue;
                                                                              if (a(paramT, i6, i2))
                                                                              {
                                                                                paramaer.f(i6, d(paramT, l1));
                                                                                continue;
                                                                                if (a(paramT, i6, i2))
                                                                                {
                                                                                  paramaer.e(i6, e(paramT, l1));
                                                                                  continue;
                                                                                  if (a(paramT, i6, i2)) {
                                                                                    paramaer.b(i6, localUnsafe.getObject(paramT, l1), a(i2));
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          label2474:
          localObject2 = null;
        }
      }
    }
    for (;;)
    {
      if (localObject2 != null)
      {
        this.r.a(paramaer, (Map.Entry)localObject2);
        if (!localIterator.hasNext()) {
          break label2474;
        }
        localObject2 = (Map.Entry)localIterator.next();
        continue;
      }
      a(this.q, paramT, paramaer);
      return;
      i12 = i3;
      break;
      localObject3 = localObject1;
      i8 = i3;
      i9 = i4;
      i10 = 0;
      break label197;
      localObject2 = localObject1;
    }
  }
  
  private final void b(T paramT1, T paramT2, int paramInt)
  {
    int i1 = d(paramInt);
    int i2 = this.b[paramInt];
    long l1 = i1 & 0xFFFFF;
    if (!a(paramT2, i2, paramInt)) {}
    Object localObject2;
    do
    {
      return;
      Object localObject1 = aed.f(paramT1, l1);
      localObject2 = aed.f(paramT2, l1);
      if ((localObject1 != null) && (localObject2 != null))
      {
        aed.a(paramT1, l1, abg.a(localObject1, localObject2));
        b(paramT1, i2, paramInt);
        return;
      }
    } while (localObject2 == null);
    aed.a(paramT1, l1, localObject2);
    b(paramT1, i2, paramInt);
  }
  
  private static <T> float c(T paramT, long paramLong)
  {
    return ((Float)aed.f(paramT, paramLong)).floatValue();
  }
  
  private final abi<?> c(int paramInt)
  {
    return (abi)this.c[(1 + (paramInt / 4 << 1))];
  }
  
  private final boolean c(T paramT1, T paramT2, int paramInt)
  {
    return a(paramT1, paramInt) == a(paramT2, paramInt);
  }
  
  private final int d(int paramInt)
  {
    return this.b[(paramInt + 1)];
  }
  
  private static <T> int d(T paramT, long paramLong)
  {
    return ((Integer)aed.f(paramT, paramLong)).intValue();
  }
  
  private final int e(int paramInt)
  {
    return this.b[(paramInt + 2)];
  }
  
  private static <T> long e(T paramT, long paramLong)
  {
    return ((Long)aed.f(paramT, paramLong)).longValue();
  }
  
  private static ady e(Object paramObject)
  {
    ady localady = ((abe)paramObject).zzdtt;
    if (localady == ady.a())
    {
      localady = ady.b();
      ((abe)paramObject).zzdtt = localady;
    }
    return localady;
  }
  
  private static boolean f(int paramInt)
  {
    return (0x20000000 & paramInt) != 0;
  }
  
  private static <T> boolean f(T paramT, long paramLong)
  {
    return ((Boolean)aed.f(paramT, paramLong)).booleanValue();
  }
  
  private final int g(int paramInt)
  {
    if (paramInt >= this.d)
    {
      int i6;
      if (paramInt < this.f)
      {
        i6 = paramInt - this.d << 2;
        if (this.b[i6] == paramInt) {
          return i6;
        }
        return -1;
      }
      if (paramInt <= this.e)
      {
        int i1 = this.f - this.d;
        int i2 = -1 + this.b.length / 4;
        int i3 = i1;
        int i4 = i2;
        for (;;)
        {
          if (i3 > i4) {
            break label137;
          }
          int i5 = i4 + i3 >>> 1;
          i6 = i5 << 2;
          int i7 = this.b[i6];
          if (paramInt == i7) {
            break;
          }
          if (paramInt < i7) {
            i4 = i5 - 1;
          } else {
            i3 = i5 + 1;
          }
        }
        label137:
        return -1;
      }
    }
    return -1;
  }
  
  public final int a(T paramT)
  {
    int i1 = this.b.length;
    int i2 = 0;
    int i3 = 0;
    int i6;
    long l1;
    int i7;
    label344:
    Object localObject4;
    if (i2 < i1)
    {
      int i5 = d(i2);
      i6 = this.b[i2];
      l1 = 0xFFFFF & i5;
      switch ((i5 & 0xFF00000) >>> 20)
      {
      default: 
        i7 = i3;
      case 0: 
      case 1: 
      case 2: 
      case 3: 
      case 4: 
      case 5: 
      case 6: 
      case 7: 
      case 8: 
        for (;;)
        {
          i2 += 4;
          i3 = i7;
          break;
          i7 = i3 * 53 + abg.a(Double.doubleToLongBits(aed.e(paramT, l1)));
          continue;
          i7 = i3 * 53 + Float.floatToIntBits(aed.d(paramT, l1));
          continue;
          i7 = i3 * 53 + abg.a(aed.b(paramT, l1));
          continue;
          i7 = i3 * 53 + abg.a(aed.b(paramT, l1));
          continue;
          i7 = i3 * 53 + aed.a(paramT, l1);
          continue;
          i7 = i3 * 53 + abg.a(aed.b(paramT, l1));
          continue;
          i7 = i3 * 53 + aed.a(paramT, l1);
          continue;
          i7 = i3 * 53 + abg.a(aed.c(paramT, l1));
          continue;
          i7 = i3 * 53 + ((String)aed.f(paramT, l1)).hashCode();
        }
      case 9: 
        localObject4 = aed.f(paramT, l1);
        if (localObject4 == null) {
          break;
        }
      }
    }
    for (int i9 = localObject4.hashCode();; i9 = 37)
    {
      i7 = i9 + i3 * 53;
      break label344;
      i7 = i3 * 53 + aed.f(paramT, l1).hashCode();
      break label344;
      i7 = i3 * 53 + aed.a(paramT, l1);
      break label344;
      i7 = i3 * 53 + aed.a(paramT, l1);
      break label344;
      i7 = i3 * 53 + aed.a(paramT, l1);
      break label344;
      i7 = i3 * 53 + abg.a(aed.b(paramT, l1));
      break label344;
      i7 = i3 * 53 + aed.a(paramT, l1);
      break label344;
      i7 = i3 * 53 + abg.a(aed.b(paramT, l1));
      break label344;
      Object localObject3 = aed.f(paramT, l1);
      if (localObject3 != null) {}
      for (int i8 = localObject3.hashCode();; i8 = 37)
      {
        i7 = i8 + i3 * 53;
        break label344;
        i7 = i3 * 53 + aed.f(paramT, l1).hashCode();
        break label344;
        i7 = i3 * 53 + aed.f(paramT, l1).hashCode();
        break label344;
        if (!a(paramT, i6, i2)) {
          break;
        }
        i7 = i3 * 53 + abg.a(Double.doubleToLongBits(b(paramT, l1)));
        break label344;
        if (!a(paramT, i6, i2)) {
          break;
        }
        i7 = i3 * 53 + Float.floatToIntBits(c(paramT, l1));
        break label344;
        if (!a(paramT, i6, i2)) {
          break;
        }
        i7 = i3 * 53 + abg.a(e(paramT, l1));
        break label344;
        if (!a(paramT, i6, i2)) {
          break;
        }
        i7 = i3 * 53 + abg.a(e(paramT, l1));
        break label344;
        if (!a(paramT, i6, i2)) {
          break;
        }
        i7 = i3 * 53 + d(paramT, l1);
        break label344;
        if (!a(paramT, i6, i2)) {
          break;
        }
        i7 = i3 * 53 + abg.a(e(paramT, l1));
        break label344;
        if (!a(paramT, i6, i2)) {
          break;
        }
        i7 = i3 * 53 + d(paramT, l1);
        break label344;
        if (!a(paramT, i6, i2)) {
          break;
        }
        i7 = i3 * 53 + abg.a(f(paramT, l1));
        break label344;
        if (!a(paramT, i6, i2)) {
          break;
        }
        i7 = i3 * 53 + ((String)aed.f(paramT, l1)).hashCode();
        break label344;
        if (!a(paramT, i6, i2)) {
          break;
        }
        Object localObject2 = aed.f(paramT, l1);
        i7 = i3 * 53 + localObject2.hashCode();
        break label344;
        if (!a(paramT, i6, i2)) {
          break;
        }
        i7 = i3 * 53 + aed.f(paramT, l1).hashCode();
        break label344;
        if (!a(paramT, i6, i2)) {
          break;
        }
        i7 = i3 * 53 + d(paramT, l1);
        break label344;
        if (!a(paramT, i6, i2)) {
          break;
        }
        i7 = i3 * 53 + d(paramT, l1);
        break label344;
        if (!a(paramT, i6, i2)) {
          break;
        }
        i7 = i3 * 53 + d(paramT, l1);
        break label344;
        if (!a(paramT, i6, i2)) {
          break;
        }
        i7 = i3 * 53 + abg.a(e(paramT, l1));
        break label344;
        if (!a(paramT, i6, i2)) {
          break;
        }
        i7 = i3 * 53 + d(paramT, l1);
        break label344;
        if (!a(paramT, i6, i2)) {
          break;
        }
        i7 = i3 * 53 + abg.a(e(paramT, l1));
        break label344;
        if (!a(paramT, i6, i2)) {
          break;
        }
        Object localObject1 = aed.f(paramT, l1);
        i7 = i3 * 53 + localObject1.hashCode();
        break label344;
        int i4 = i3 * 53 + this.q.b(paramT).hashCode();
        if (this.h) {
          i4 = i4 * 53 + this.r.a(paramT).hashCode();
        }
        return i4;
      }
    }
  }
  
  public final T a()
  {
    return this.o.a(this.g);
  }
  
  public final void a(T paramT, add paramadd, aar paramaar)
  {
    if (paramaar == null) {
      throw new NullPointerException();
    }
    adx localadx = this.q;
    aat localaat = this.r;
    Object localObject1 = null;
    aaw localaaw = null;
    int i3;
    int i4;
    label122:
    int i5;
    for (;;)
    {
      try
      {
        i3 = paramadd.a();
        i4 = g(i3);
        if (i4 < 0)
        {
          if (i3 == 2147483647)
          {
            if (this.m != null)
            {
              int[] arrayOfInt5 = this.m;
              int i14 = arrayOfInt5.length;
              int i15 = 0;
              if (i15 < i14)
              {
                localObject1 = a(paramT, arrayOfInt5[i15], localObject1, localadx);
                i15++;
                continue;
              }
            }
            if (localObject1 != null) {
              localadx.b(paramT, localObject1);
            }
            return;
          }
          Object localObject9;
          if (!this.h)
          {
            localObject9 = null;
            if (localObject9 != null)
            {
              if (localaaw == null) {
                localaaw = localaat.b(paramT);
              }
              localObject1 = localaat.a(paramadd, localObject9, paramaar, localaaw, localObject1, localadx);
            }
          }
          else
          {
            localObject9 = localaat.a(paramaar, this.g, i3);
            continue;
          }
          localadx.a(paramadd);
          if (localObject1 == null) {
            localObject1 = localadx.c(paramT);
          }
          boolean bool3 = localadx.a(localObject1, paramadd);
          if (bool3) {
            continue;
          }
          if (this.m != null)
          {
            int[] arrayOfInt4 = this.m;
            int i12 = arrayOfInt4.length;
            int i13 = 0;
            if (i13 < i12)
            {
              localObject1 = a(paramT, arrayOfInt4[i13], localObject1, localadx);
              i13++;
              continue;
            }
          }
          if (localObject1 == null) {
            continue;
          }
          localadx.b(paramT, localObject1);
          return;
        }
        i5 = d(i4);
        switch ((0xFF00000 & i5) >>> 20)
        {
        default: 
          if (localObject1 != null) {}
        case 0: 
          boolean bool1;
          try
          {
            localObject1 = localadx.a();
            boolean bool2 = localadx.a(localObject1, paramadd);
            if (bool2) {
              continue;
            }
            if (this.m == null) {
              break label3089;
            }
            int[] arrayOfInt3 = this.m;
            int i10 = arrayOfInt3.length;
            int i11 = 0;
            if (i11 >= i10) {
              break label3089;
            }
            localObject1 = a(paramT, arrayOfInt3[i11], localObject1, localadx);
            i11++;
            continue;
            long l6 = 0xFFFFF & i5;
            aed.a(paramT, l6, paramadd.d());
            b(paramT, i4);
          }
          catch (abl localabl)
          {
            localadx.a(paramadd);
            if (localObject1 == null) {
              localObject1 = localadx.c(paramT);
            }
            bool1 = localadx.a(localObject1, paramadd);
          }
          if (bool1) {
            continue;
          }
          if (this.m == null) {
            break label3103;
          }
          int[] arrayOfInt2 = this.m;
          int i6 = arrayOfInt2.length;
          int i7 = 0;
          if (i7 >= i6) {
            break label3103;
          }
          localObject1 = a(paramT, arrayOfInt2[i7], localObject1, localadx);
          i7++;
          break;
        case 1: 
          long l5 = 0xFFFFF & i5;
          aed.a(paramT, l5, paramadd.e());
          b(paramT, i4);
          continue;
          arrayOfInt1 = this.m;
        }
      }
      finally
      {
        if (this.m == null) {
          break label3117;
        }
      }
      int[] arrayOfInt1;
      int i1 = arrayOfInt1.length;
      for (int i2 = 0; i2 < i1; i2++) {
        localObject1 = a(paramT, arrayOfInt1[i2], localObject1, localadx);
      }
      long l4 = 0xFFFFF & i5;
      aed.a(paramT, l4, paramadd.g());
      b(paramT, i4);
      continue;
      aed.a(paramT, 0xFFFFF & i5, paramadd.f());
      b(paramT, i4);
      continue;
      aed.a(paramT, 0xFFFFF & i5, paramadd.h());
      b(paramT, i4);
      continue;
      aed.a(paramT, 0xFFFFF & i5, paramadd.i());
      b(paramT, i4);
      continue;
      aed.a(paramT, 0xFFFFF & i5, paramadd.j());
      b(paramT, i4);
      continue;
      aed.a(paramT, 0xFFFFF & i5, paramadd.k());
      b(paramT, i4);
      continue;
      a(paramT, i5, paramadd);
      b(paramT, i4);
      continue;
      if (a(paramT, i4))
      {
        Object localObject8 = abg.a(aed.f(paramT, 0xFFFFF & i5), paramadd.a(a(i4), paramaar));
        aed.a(paramT, 0xFFFFF & i5, localObject8);
      }
      else
      {
        aed.a(paramT, 0xFFFFF & i5, paramadd.a(a(i4), paramaar));
        b(paramT, i4);
        continue;
        aed.a(paramT, 0xFFFFF & i5, paramadd.n());
        b(paramT, i4);
        continue;
        aed.a(paramT, 0xFFFFF & i5, paramadd.o());
        b(paramT, i4);
        continue;
        int i9 = paramadd.p();
        abi localabi2 = c(i4);
        if ((localabi2 == null) || (localabi2.a(i9) != null))
        {
          aed.a(paramT, 0xFFFFF & i5, i9);
          b(paramT, i4);
        }
        else
        {
          localObject1 = adg.a(i3, i9, localObject1, localadx);
          continue;
          aed.a(paramT, 0xFFFFF & i5, paramadd.q());
          b(paramT, i4);
          continue;
          aed.a(paramT, 0xFFFFF & i5, paramadd.r());
          b(paramT, i4);
          continue;
          aed.a(paramT, 0xFFFFF & i5, paramadd.s());
          b(paramT, i4);
          continue;
          aed.a(paramT, 0xFFFFF & i5, paramadd.t());
          b(paramT, i4);
          continue;
          if (a(paramT, i4))
          {
            Object localObject7 = abg.a(aed.f(paramT, 0xFFFFF & i5), paramadd.b(a(i4), paramaar));
            aed.a(paramT, 0xFFFFF & i5, localObject7);
          }
          else
          {
            aed.a(paramT, 0xFFFFF & i5, paramadd.b(a(i4), paramaar));
            b(paramT, i4);
            continue;
            paramadd.a(this.p.a(paramT, 0xFFFFF & i5));
            continue;
            paramadd.b(this.p.a(paramT, 0xFFFFF & i5));
            continue;
            paramadd.d(this.p.a(paramT, 0xFFFFF & i5));
            continue;
            paramadd.c(this.p.a(paramT, 0xFFFFF & i5));
            continue;
            paramadd.e(this.p.a(paramT, 0xFFFFF & i5));
            continue;
            paramadd.f(this.p.a(paramT, 0xFFFFF & i5));
            continue;
            paramadd.g(this.p.a(paramT, 0xFFFFF & i5));
            continue;
            paramadd.h(this.p.a(paramT, 0xFFFFF & i5));
            continue;
            if (f(i5))
            {
              paramadd.j(this.p.a(paramT, 0xFFFFF & i5));
            }
            else
            {
              paramadd.i(this.p.a(paramT, 0xFFFFF & i5));
              continue;
              ade localade2 = a(i4);
              long l3 = 0xFFFFF & i5;
              paramadd.a(this.p.a(paramT, l3), localade2, paramaar);
              continue;
              paramadd.k(this.p.a(paramT, 0xFFFFF & i5));
              continue;
              paramadd.l(this.p.a(paramT, 0xFFFFF & i5));
              continue;
              List localList2 = this.p.a(paramT, i5 & 0xFFFFF);
              paramadd.m(localList2);
              localObject1 = adg.a(i3, localList2, c(i4), localObject1, localadx);
              continue;
              paramadd.n(this.p.a(paramT, 0xFFFFF & i5));
              continue;
              paramadd.o(this.p.a(paramT, 0xFFFFF & i5));
              continue;
              paramadd.p(this.p.a(paramT, 0xFFFFF & i5));
              continue;
              paramadd.q(this.p.a(paramT, 0xFFFFF & i5));
              continue;
              paramadd.a(this.p.a(paramT, 0xFFFFF & i5));
              continue;
              paramadd.b(this.p.a(paramT, 0xFFFFF & i5));
              continue;
              paramadd.d(this.p.a(paramT, 0xFFFFF & i5));
              continue;
              paramadd.c(this.p.a(paramT, 0xFFFFF & i5));
              continue;
              paramadd.e(this.p.a(paramT, 0xFFFFF & i5));
              continue;
              paramadd.f(this.p.a(paramT, 0xFFFFF & i5));
              continue;
              paramadd.g(this.p.a(paramT, 0xFFFFF & i5));
              continue;
              paramadd.h(this.p.a(paramT, 0xFFFFF & i5));
              continue;
              paramadd.l(this.p.a(paramT, 0xFFFFF & i5));
              continue;
              List localList1 = this.p.a(paramT, i5 & 0xFFFFF);
              paramadd.m(localList1);
              localObject1 = adg.a(i3, localList1, c(i4), localObject1, localadx);
              continue;
              paramadd.n(this.p.a(paramT, 0xFFFFF & i5));
              continue;
              paramadd.o(this.p.a(paramT, 0xFFFFF & i5));
              continue;
              paramadd.p(this.p.a(paramT, 0xFFFFF & i5));
              continue;
              paramadd.q(this.p.a(paramT, 0xFFFFF & i5));
              continue;
              long l2 = 0xFFFFF & i5;
              ade localade1 = a(i4);
              paramadd.b(this.p.a(paramT, l2), localade1, paramaar);
            }
          }
        }
      }
    }
    Object localObject4 = b(i4);
    long l1 = 0xFFFFF & d(i4);
    Object localObject5 = aed.f(paramT, l1);
    Object localObject6;
    if (localObject5 == null)
    {
      localObject6 = this.s.e(localObject4);
      aed.a(paramT, l1, localObject6);
    }
    for (;;)
    {
      paramadd.a(this.s.a(localObject6), this.s.f(localObject4), paramaar);
      break;
      if (this.s.c(localObject5))
      {
        localObject6 = this.s.e(localObject4);
        this.s.a(localObject6, localObject5);
        aed.a(paramT, l1, localObject6);
        continue;
        aed.a(paramT, i5 & 0xFFFFF, Double.valueOf(paramadd.d()));
        b(paramT, i3, i4);
        break;
        aed.a(paramT, i5 & 0xFFFFF, Float.valueOf(paramadd.e()));
        b(paramT, i3, i4);
        break;
        aed.a(paramT, i5 & 0xFFFFF, Long.valueOf(paramadd.g()));
        b(paramT, i3, i4);
        break;
        aed.a(paramT, i5 & 0xFFFFF, Long.valueOf(paramadd.f()));
        b(paramT, i3, i4);
        break;
        aed.a(paramT, i5 & 0xFFFFF, Integer.valueOf(paramadd.h()));
        b(paramT, i3, i4);
        break;
        aed.a(paramT, i5 & 0xFFFFF, Long.valueOf(paramadd.i()));
        b(paramT, i3, i4);
        break;
        aed.a(paramT, i5 & 0xFFFFF, Integer.valueOf(paramadd.j()));
        b(paramT, i3, i4);
        break;
        aed.a(paramT, i5 & 0xFFFFF, Boolean.valueOf(paramadd.k()));
        b(paramT, i3, i4);
        break;
        a(paramT, i5, paramadd);
        b(paramT, i3, i4);
        break;
        if (a(paramT, i3, i4))
        {
          Object localObject3 = abg.a(aed.f(paramT, 0xFFFFF & i5), paramadd.a(a(i4), paramaar));
          aed.a(paramT, i5 & 0xFFFFF, localObject3);
        }
        for (;;)
        {
          b(paramT, i3, i4);
          break;
          aed.a(paramT, i5 & 0xFFFFF, paramadd.a(a(i4), paramaar));
          b(paramT, i4);
        }
        aed.a(paramT, i5 & 0xFFFFF, paramadd.n());
        b(paramT, i3, i4);
        break;
        aed.a(paramT, i5 & 0xFFFFF, Integer.valueOf(paramadd.o()));
        b(paramT, i3, i4);
        break;
        int i8 = paramadd.p();
        abi localabi1 = c(i4);
        if ((localabi1 == null) || (localabi1.a(i8) != null))
        {
          aed.a(paramT, i5 & 0xFFFFF, Integer.valueOf(i8));
          b(paramT, i3, i4);
          break;
        }
        localObject1 = adg.a(i3, i8, localObject1, localadx);
        break;
        aed.a(paramT, i5 & 0xFFFFF, Integer.valueOf(paramadd.q()));
        b(paramT, i3, i4);
        break;
        aed.a(paramT, i5 & 0xFFFFF, Long.valueOf(paramadd.r()));
        b(paramT, i3, i4);
        break;
        aed.a(paramT, i5 & 0xFFFFF, Integer.valueOf(paramadd.s()));
        b(paramT, i3, i4);
        break;
        aed.a(paramT, i5 & 0xFFFFF, Long.valueOf(paramadd.t()));
        b(paramT, i3, i4);
        break;
        aed.a(paramT, i5 & 0xFFFFF, paramadd.b(a(i4), paramaar));
        b(paramT, i3, i4);
        break;
        label3089:
        if (localObject1 == null) {
          break label122;
        }
        localadx.b(paramT, localObject1);
        return;
        label3103:
        if (localObject1 == null) {
          break label122;
        }
        localadx.b(paramT, localObject1);
        return;
        label3117:
        if (localObject1 != null) {
          localadx.b(paramT, localObject1);
        }
        throw localObject2;
      }
      localObject6 = localObject5;
    }
  }
  
  public final void a(T paramT, aer paramaer)
  {
    if (paramaer.a() == abe.e.k)
    {
      a(this.q, paramT, paramaer);
      boolean bool3 = this.h;
      Object localObject3 = null;
      Iterator localIterator2 = null;
      if (bool3)
      {
        aaw localaaw2 = this.r.a(paramT);
        boolean bool4 = localaaw2.b();
        localObject3 = null;
        localIterator2 = null;
        if (!bool4)
        {
          localIterator2 = localaaw2.f();
          localObject3 = (Map.Entry)localIterator2.next();
        }
      }
      int i5 = -4 + this.b.length;
      if (i5 >= 0)
      {
        int i6 = d(i5);
        int i7 = this.b[i5];
        Object localObject4 = localObject3;
        if ((localObject4 != null) && (this.r.a(localObject4) > i7))
        {
          this.r.a(paramaer, localObject4);
          if (localIterator2.hasNext()) {}
          for (Map.Entry localEntry2 = (Map.Entry)localIterator2.next();; localEntry2 = null)
          {
            localObject4 = localEntry2;
            break;
          }
        }
        switch ((0xFF00000 & i6) >>> 20)
        {
        }
        for (;;)
        {
          i5 -= 4;
          localObject3 = localObject4;
          break;
          if (a(paramT, i5))
          {
            paramaer.a(i7, aed.e(paramT, 0xFFFFF & i6));
            continue;
            if (a(paramT, i5))
            {
              paramaer.a(i7, aed.d(paramT, 0xFFFFF & i6));
              continue;
              if (a(paramT, i5))
              {
                paramaer.a(i7, aed.b(paramT, 0xFFFFF & i6));
                continue;
                if (a(paramT, i5))
                {
                  paramaer.c(i7, aed.b(paramT, 0xFFFFF & i6));
                  continue;
                  if (a(paramT, i5))
                  {
                    paramaer.c(i7, aed.a(paramT, 0xFFFFF & i6));
                    continue;
                    if (a(paramT, i5))
                    {
                      paramaer.d(i7, aed.b(paramT, 0xFFFFF & i6));
                      continue;
                      if (a(paramT, i5))
                      {
                        paramaer.d(i7, aed.a(paramT, 0xFFFFF & i6));
                        continue;
                        if (a(paramT, i5))
                        {
                          paramaer.a(i7, aed.c(paramT, 0xFFFFF & i6));
                          continue;
                          if (a(paramT, i5))
                          {
                            a(i7, aed.f(paramT, 0xFFFFF & i6), paramaer);
                            continue;
                            if (a(paramT, i5))
                            {
                              paramaer.a(i7, aed.f(paramT, 0xFFFFF & i6), a(i5));
                              continue;
                              if (a(paramT, i5))
                              {
                                paramaer.a(i7, (zw)aed.f(paramT, 0xFFFFF & i6));
                                continue;
                                if (a(paramT, i5))
                                {
                                  paramaer.e(i7, aed.a(paramT, 0xFFFFF & i6));
                                  continue;
                                  if (a(paramT, i5))
                                  {
                                    paramaer.b(i7, aed.a(paramT, 0xFFFFF & i6));
                                    continue;
                                    if (a(paramT, i5))
                                    {
                                      paramaer.a(i7, aed.a(paramT, 0xFFFFF & i6));
                                      continue;
                                      if (a(paramT, i5))
                                      {
                                        paramaer.b(i7, aed.b(paramT, 0xFFFFF & i6));
                                        continue;
                                        if (a(paramT, i5))
                                        {
                                          paramaer.f(i7, aed.a(paramT, 0xFFFFF & i6));
                                          continue;
                                          if (a(paramT, i5))
                                          {
                                            paramaer.e(i7, aed.b(paramT, 0xFFFFF & i6));
                                            continue;
                                            if (a(paramT, i5))
                                            {
                                              paramaer.b(i7, aed.f(paramT, 0xFFFFF & i6), a(i5));
                                              continue;
                                              adg.a(this.b[i5], (List)aed.f(paramT, 0xFFFFF & i6), paramaer, false);
                                              continue;
                                              adg.b(this.b[i5], (List)aed.f(paramT, 0xFFFFF & i6), paramaer, false);
                                              continue;
                                              adg.c(this.b[i5], (List)aed.f(paramT, 0xFFFFF & i6), paramaer, false);
                                              continue;
                                              adg.d(this.b[i5], (List)aed.f(paramT, 0xFFFFF & i6), paramaer, false);
                                              continue;
                                              adg.h(this.b[i5], (List)aed.f(paramT, 0xFFFFF & i6), paramaer, false);
                                              continue;
                                              adg.f(this.b[i5], (List)aed.f(paramT, 0xFFFFF & i6), paramaer, false);
                                              continue;
                                              adg.k(this.b[i5], (List)aed.f(paramT, 0xFFFFF & i6), paramaer, false);
                                              continue;
                                              adg.n(this.b[i5], (List)aed.f(paramT, 0xFFFFF & i6), paramaer, false);
                                              continue;
                                              adg.a(this.b[i5], (List)aed.f(paramT, 0xFFFFF & i6), paramaer);
                                              continue;
                                              adg.a(this.b[i5], (List)aed.f(paramT, 0xFFFFF & i6), paramaer, a(i5));
                                              continue;
                                              adg.b(this.b[i5], (List)aed.f(paramT, 0xFFFFF & i6), paramaer);
                                              continue;
                                              adg.i(this.b[i5], (List)aed.f(paramT, 0xFFFFF & i6), paramaer, false);
                                              continue;
                                              adg.m(this.b[i5], (List)aed.f(paramT, 0xFFFFF & i6), paramaer, false);
                                              continue;
                                              adg.l(this.b[i5], (List)aed.f(paramT, 0xFFFFF & i6), paramaer, false);
                                              continue;
                                              adg.g(this.b[i5], (List)aed.f(paramT, 0xFFFFF & i6), paramaer, false);
                                              continue;
                                              adg.j(this.b[i5], (List)aed.f(paramT, 0xFFFFF & i6), paramaer, false);
                                              continue;
                                              adg.e(this.b[i5], (List)aed.f(paramT, 0xFFFFF & i6), paramaer, false);
                                              continue;
                                              adg.a(this.b[i5], (List)aed.f(paramT, 0xFFFFF & i6), paramaer, true);
                                              continue;
                                              adg.b(this.b[i5], (List)aed.f(paramT, 0xFFFFF & i6), paramaer, true);
                                              continue;
                                              adg.c(this.b[i5], (List)aed.f(paramT, 0xFFFFF & i6), paramaer, true);
                                              continue;
                                              adg.d(this.b[i5], (List)aed.f(paramT, 0xFFFFF & i6), paramaer, true);
                                              continue;
                                              adg.h(this.b[i5], (List)aed.f(paramT, 0xFFFFF & i6), paramaer, true);
                                              continue;
                                              adg.f(this.b[i5], (List)aed.f(paramT, 0xFFFFF & i6), paramaer, true);
                                              continue;
                                              adg.k(this.b[i5], (List)aed.f(paramT, 0xFFFFF & i6), paramaer, true);
                                              continue;
                                              adg.n(this.b[i5], (List)aed.f(paramT, 0xFFFFF & i6), paramaer, true);
                                              continue;
                                              adg.i(this.b[i5], (List)aed.f(paramT, 0xFFFFF & i6), paramaer, true);
                                              continue;
                                              adg.m(this.b[i5], (List)aed.f(paramT, 0xFFFFF & i6), paramaer, true);
                                              continue;
                                              adg.l(this.b[i5], (List)aed.f(paramT, 0xFFFFF & i6), paramaer, true);
                                              continue;
                                              adg.g(this.b[i5], (List)aed.f(paramT, 0xFFFFF & i6), paramaer, true);
                                              continue;
                                              adg.j(this.b[i5], (List)aed.f(paramT, 0xFFFFF & i6), paramaer, true);
                                              continue;
                                              adg.e(this.b[i5], (List)aed.f(paramT, 0xFFFFF & i6), paramaer, true);
                                              continue;
                                              adg.b(this.b[i5], (List)aed.f(paramT, 0xFFFFF & i6), paramaer, a(i5));
                                              continue;
                                              a(paramaer, i7, aed.f(paramT, 0xFFFFF & i6), i5);
                                              continue;
                                              if (a(paramT, i7, i5))
                                              {
                                                paramaer.a(i7, b(paramT, 0xFFFFF & i6));
                                                continue;
                                                if (a(paramT, i7, i5))
                                                {
                                                  paramaer.a(i7, c(paramT, 0xFFFFF & i6));
                                                  continue;
                                                  if (a(paramT, i7, i5))
                                                  {
                                                    paramaer.a(i7, e(paramT, 0xFFFFF & i6));
                                                    continue;
                                                    if (a(paramT, i7, i5))
                                                    {
                                                      paramaer.c(i7, e(paramT, 0xFFFFF & i6));
                                                      continue;
                                                      if (a(paramT, i7, i5))
                                                      {
                                                        paramaer.c(i7, d(paramT, 0xFFFFF & i6));
                                                        continue;
                                                        if (a(paramT, i7, i5))
                                                        {
                                                          paramaer.d(i7, e(paramT, 0xFFFFF & i6));
                                                          continue;
                                                          if (a(paramT, i7, i5))
                                                          {
                                                            paramaer.d(i7, d(paramT, 0xFFFFF & i6));
                                                            continue;
                                                            if (a(paramT, i7, i5))
                                                            {
                                                              paramaer.a(i7, f(paramT, 0xFFFFF & i6));
                                                              continue;
                                                              if (a(paramT, i7, i5))
                                                              {
                                                                a(i7, aed.f(paramT, 0xFFFFF & i6), paramaer);
                                                                continue;
                                                                if (a(paramT, i7, i5))
                                                                {
                                                                  paramaer.a(i7, aed.f(paramT, 0xFFFFF & i6), a(i5));
                                                                  continue;
                                                                  if (a(paramT, i7, i5))
                                                                  {
                                                                    paramaer.a(i7, (zw)aed.f(paramT, 0xFFFFF & i6));
                                                                    continue;
                                                                    if (a(paramT, i7, i5))
                                                                    {
                                                                      paramaer.e(i7, d(paramT, 0xFFFFF & i6));
                                                                      continue;
                                                                      if (a(paramT, i7, i5))
                                                                      {
                                                                        paramaer.b(i7, d(paramT, 0xFFFFF & i6));
                                                                        continue;
                                                                        if (a(paramT, i7, i5))
                                                                        {
                                                                          paramaer.a(i7, d(paramT, 0xFFFFF & i6));
                                                                          continue;
                                                                          if (a(paramT, i7, i5))
                                                                          {
                                                                            paramaer.b(i7, e(paramT, 0xFFFFF & i6));
                                                                            continue;
                                                                            if (a(paramT, i7, i5))
                                                                            {
                                                                              paramaer.f(i7, d(paramT, 0xFFFFF & i6));
                                                                              continue;
                                                                              if (a(paramT, i7, i5))
                                                                              {
                                                                                paramaer.e(i7, e(paramT, 0xFFFFF & i6));
                                                                                continue;
                                                                                if (a(paramT, i7, i5)) {
                                                                                  paramaer.b(i7, aed.f(paramT, 0xFFFFF & i6), a(i5));
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      for (localObject3 = null;; localObject3 = (Map.Entry)localIterator2.next())
      {
        if (localObject3 == null) {
          break label5278;
        }
        this.r.a(paramaer, (Map.Entry)localObject3);
        if (!localIterator2.hasNext()) {
          break;
        }
      }
    }
    if (this.j)
    {
      boolean bool1 = this.h;
      Object localObject1 = null;
      Iterator localIterator1 = null;
      if (bool1)
      {
        aaw localaaw1 = this.r.a(paramT);
        boolean bool2 = localaaw1.b();
        localObject1 = null;
        localIterator1 = null;
        if (!bool2)
        {
          localIterator1 = localaaw1.e();
          localObject1 = (Map.Entry)localIterator1.next();
        }
      }
      int i1 = this.b.length;
      int i2 = 0;
      if (i2 < i1)
      {
        int i3 = d(i2);
        int i4 = this.b[i2];
        Object localObject2 = localObject1;
        if ((localObject2 != null) && (this.r.a(localObject2) <= i4))
        {
          this.r.a(paramaer, localObject2);
          if (localIterator1.hasNext()) {}
          for (Map.Entry localEntry1 = (Map.Entry)localIterator1.next();; localEntry1 = null)
          {
            localObject2 = localEntry1;
            break;
          }
        }
        switch ((0xFF00000 & i3) >>> 20)
        {
        }
        for (;;)
        {
          i2 += 4;
          localObject1 = localObject2;
          break;
          if (a(paramT, i2))
          {
            paramaer.a(i4, aed.e(paramT, 0xFFFFF & i3));
            continue;
            if (a(paramT, i2))
            {
              paramaer.a(i4, aed.d(paramT, 0xFFFFF & i3));
              continue;
              if (a(paramT, i2))
              {
                paramaer.a(i4, aed.b(paramT, 0xFFFFF & i3));
                continue;
                if (a(paramT, i2))
                {
                  paramaer.c(i4, aed.b(paramT, 0xFFFFF & i3));
                  continue;
                  if (a(paramT, i2))
                  {
                    paramaer.c(i4, aed.a(paramT, 0xFFFFF & i3));
                    continue;
                    if (a(paramT, i2))
                    {
                      paramaer.d(i4, aed.b(paramT, 0xFFFFF & i3));
                      continue;
                      if (a(paramT, i2))
                      {
                        paramaer.d(i4, aed.a(paramT, 0xFFFFF & i3));
                        continue;
                        if (a(paramT, i2))
                        {
                          paramaer.a(i4, aed.c(paramT, 0xFFFFF & i3));
                          continue;
                          if (a(paramT, i2))
                          {
                            a(i4, aed.f(paramT, 0xFFFFF & i3), paramaer);
                            continue;
                            if (a(paramT, i2))
                            {
                              paramaer.a(i4, aed.f(paramT, 0xFFFFF & i3), a(i2));
                              continue;
                              if (a(paramT, i2))
                              {
                                paramaer.a(i4, (zw)aed.f(paramT, 0xFFFFF & i3));
                                continue;
                                if (a(paramT, i2))
                                {
                                  paramaer.e(i4, aed.a(paramT, 0xFFFFF & i3));
                                  continue;
                                  if (a(paramT, i2))
                                  {
                                    paramaer.b(i4, aed.a(paramT, 0xFFFFF & i3));
                                    continue;
                                    if (a(paramT, i2))
                                    {
                                      paramaer.a(i4, aed.a(paramT, 0xFFFFF & i3));
                                      continue;
                                      if (a(paramT, i2))
                                      {
                                        paramaer.b(i4, aed.b(paramT, 0xFFFFF & i3));
                                        continue;
                                        if (a(paramT, i2))
                                        {
                                          paramaer.f(i4, aed.a(paramT, 0xFFFFF & i3));
                                          continue;
                                          if (a(paramT, i2))
                                          {
                                            paramaer.e(i4, aed.b(paramT, 0xFFFFF & i3));
                                            continue;
                                            if (a(paramT, i2))
                                            {
                                              paramaer.b(i4, aed.f(paramT, 0xFFFFF & i3), a(i2));
                                              continue;
                                              adg.a(this.b[i2], (List)aed.f(paramT, 0xFFFFF & i3), paramaer, false);
                                              continue;
                                              adg.b(this.b[i2], (List)aed.f(paramT, 0xFFFFF & i3), paramaer, false);
                                              continue;
                                              adg.c(this.b[i2], (List)aed.f(paramT, 0xFFFFF & i3), paramaer, false);
                                              continue;
                                              adg.d(this.b[i2], (List)aed.f(paramT, 0xFFFFF & i3), paramaer, false);
                                              continue;
                                              adg.h(this.b[i2], (List)aed.f(paramT, 0xFFFFF & i3), paramaer, false);
                                              continue;
                                              adg.f(this.b[i2], (List)aed.f(paramT, 0xFFFFF & i3), paramaer, false);
                                              continue;
                                              adg.k(this.b[i2], (List)aed.f(paramT, 0xFFFFF & i3), paramaer, false);
                                              continue;
                                              adg.n(this.b[i2], (List)aed.f(paramT, 0xFFFFF & i3), paramaer, false);
                                              continue;
                                              adg.a(this.b[i2], (List)aed.f(paramT, 0xFFFFF & i3), paramaer);
                                              continue;
                                              adg.a(this.b[i2], (List)aed.f(paramT, 0xFFFFF & i3), paramaer, a(i2));
                                              continue;
                                              adg.b(this.b[i2], (List)aed.f(paramT, 0xFFFFF & i3), paramaer);
                                              continue;
                                              adg.i(this.b[i2], (List)aed.f(paramT, 0xFFFFF & i3), paramaer, false);
                                              continue;
                                              adg.m(this.b[i2], (List)aed.f(paramT, 0xFFFFF & i3), paramaer, false);
                                              continue;
                                              adg.l(this.b[i2], (List)aed.f(paramT, 0xFFFFF & i3), paramaer, false);
                                              continue;
                                              adg.g(this.b[i2], (List)aed.f(paramT, 0xFFFFF & i3), paramaer, false);
                                              continue;
                                              adg.j(this.b[i2], (List)aed.f(paramT, 0xFFFFF & i3), paramaer, false);
                                              continue;
                                              adg.e(this.b[i2], (List)aed.f(paramT, 0xFFFFF & i3), paramaer, false);
                                              continue;
                                              adg.a(this.b[i2], (List)aed.f(paramT, 0xFFFFF & i3), paramaer, true);
                                              continue;
                                              adg.b(this.b[i2], (List)aed.f(paramT, 0xFFFFF & i3), paramaer, true);
                                              continue;
                                              adg.c(this.b[i2], (List)aed.f(paramT, 0xFFFFF & i3), paramaer, true);
                                              continue;
                                              adg.d(this.b[i2], (List)aed.f(paramT, 0xFFFFF & i3), paramaer, true);
                                              continue;
                                              adg.h(this.b[i2], (List)aed.f(paramT, 0xFFFFF & i3), paramaer, true);
                                              continue;
                                              adg.f(this.b[i2], (List)aed.f(paramT, 0xFFFFF & i3), paramaer, true);
                                              continue;
                                              adg.k(this.b[i2], (List)aed.f(paramT, 0xFFFFF & i3), paramaer, true);
                                              continue;
                                              adg.n(this.b[i2], (List)aed.f(paramT, 0xFFFFF & i3), paramaer, true);
                                              continue;
                                              adg.i(this.b[i2], (List)aed.f(paramT, 0xFFFFF & i3), paramaer, true);
                                              continue;
                                              adg.m(this.b[i2], (List)aed.f(paramT, 0xFFFFF & i3), paramaer, true);
                                              continue;
                                              adg.l(this.b[i2], (List)aed.f(paramT, 0xFFFFF & i3), paramaer, true);
                                              continue;
                                              adg.g(this.b[i2], (List)aed.f(paramT, 0xFFFFF & i3), paramaer, true);
                                              continue;
                                              adg.j(this.b[i2], (List)aed.f(paramT, 0xFFFFF & i3), paramaer, true);
                                              continue;
                                              adg.e(this.b[i2], (List)aed.f(paramT, 0xFFFFF & i3), paramaer, true);
                                              continue;
                                              adg.b(this.b[i2], (List)aed.f(paramT, 0xFFFFF & i3), paramaer, a(i2));
                                              continue;
                                              a(paramaer, i4, aed.f(paramT, 0xFFFFF & i3), i2);
                                              continue;
                                              if (a(paramT, i4, i2))
                                              {
                                                paramaer.a(i4, b(paramT, 0xFFFFF & i3));
                                                continue;
                                                if (a(paramT, i4, i2))
                                                {
                                                  paramaer.a(i4, c(paramT, 0xFFFFF & i3));
                                                  continue;
                                                  if (a(paramT, i4, i2))
                                                  {
                                                    paramaer.a(i4, e(paramT, 0xFFFFF & i3));
                                                    continue;
                                                    if (a(paramT, i4, i2))
                                                    {
                                                      paramaer.c(i4, e(paramT, 0xFFFFF & i3));
                                                      continue;
                                                      if (a(paramT, i4, i2))
                                                      {
                                                        paramaer.c(i4, d(paramT, 0xFFFFF & i3));
                                                        continue;
                                                        if (a(paramT, i4, i2))
                                                        {
                                                          paramaer.d(i4, e(paramT, 0xFFFFF & i3));
                                                          continue;
                                                          if (a(paramT, i4, i2))
                                                          {
                                                            paramaer.d(i4, d(paramT, 0xFFFFF & i3));
                                                            continue;
                                                            if (a(paramT, i4, i2))
                                                            {
                                                              paramaer.a(i4, f(paramT, 0xFFFFF & i3));
                                                              continue;
                                                              if (a(paramT, i4, i2))
                                                              {
                                                                a(i4, aed.f(paramT, 0xFFFFF & i3), paramaer);
                                                                continue;
                                                                if (a(paramT, i4, i2))
                                                                {
                                                                  paramaer.a(i4, aed.f(paramT, 0xFFFFF & i3), a(i2));
                                                                  continue;
                                                                  if (a(paramT, i4, i2))
                                                                  {
                                                                    paramaer.a(i4, (zw)aed.f(paramT, 0xFFFFF & i3));
                                                                    continue;
                                                                    if (a(paramT, i4, i2))
                                                                    {
                                                                      paramaer.e(i4, d(paramT, 0xFFFFF & i3));
                                                                      continue;
                                                                      if (a(paramT, i4, i2))
                                                                      {
                                                                        paramaer.b(i4, d(paramT, 0xFFFFF & i3));
                                                                        continue;
                                                                        if (a(paramT, i4, i2))
                                                                        {
                                                                          paramaer.a(i4, d(paramT, 0xFFFFF & i3));
                                                                          continue;
                                                                          if (a(paramT, i4, i2))
                                                                          {
                                                                            paramaer.b(i4, e(paramT, 0xFFFFF & i3));
                                                                            continue;
                                                                            if (a(paramT, i4, i2))
                                                                            {
                                                                              paramaer.f(i4, d(paramT, 0xFFFFF & i3));
                                                                              continue;
                                                                              if (a(paramT, i4, i2))
                                                                              {
                                                                                paramaer.e(i4, e(paramT, 0xFFFFF & i3));
                                                                                continue;
                                                                                if (a(paramT, i4, i2)) {
                                                                                  paramaer.b(i4, aed.f(paramT, 0xFFFFF & i3), a(i2));
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      for (localObject1 = null;; localObject1 = (Map.Entry)localIterator1.next())
      {
        if (localObject1 == null) {
          break label5269;
        }
        this.r.a(paramaer, (Map.Entry)localObject1);
        if (!localIterator1.hasNext()) {
          break;
        }
      }
      label5269:
      a(this.q, paramT, paramaer);
      label5278:
      return;
    }
    b(paramT, paramaer);
  }
  
  public final void a(T paramT, byte[] paramArrayOfByte, int paramInt1, int paramInt2, zt paramzt)
  {
    int i1;
    int i2;
    int i3;
    int i4;
    int i5;
    int i6;
    int i7;
    int i8;
    long l1;
    label208:
    abj localabj1;
    int i9;
    int i10;
    label765:
    abj localabj2;
    if (this.j)
    {
      Unsafe localUnsafe = a;
      i1 = paramInt1;
      for (;;)
      {
        if (i1 < paramInt2)
        {
          i2 = i1 + 1;
          i3 = paramArrayOfByte[i1];
          if (i3 < 0)
          {
            i2 = zs.a(i3, paramArrayOfByte, i2, paramzt);
            i3 = paramzt.a;
          }
          i4 = i3 >>> 3;
          i5 = i3 & 0x7;
          i6 = g(i4);
          if (i6 < 0) {
            break label972;
          }
          i7 = this.b[(i6 + 1)];
          i8 = (0xFF00000 & i7) >>> 20;
          l1 = 0xFFFFF & i7;
          if (i8 <= 17)
          {
            switch (i8)
            {
            default: 
              i1 = i2;
              i1 = a(i3, paramArrayOfByte, i1, paramInt2, paramT, paramzt);
              break;
            case 0: 
              if (i5 != 1) {
                break label972;
              }
              aed.a(paramT, l1, zs.c(paramArrayOfByte, i2));
              i1 = i2 + 8;
              break;
            case 1: 
              if (i5 != 5) {
                break label972;
              }
              aed.a(paramT, l1, zs.d(paramArrayOfByte, i2));
              i1 = i2 + 4;
              break;
            case 2: 
            case 3: 
              if (i5 != 0) {
                break label972;
              }
              i1 = zs.b(paramArrayOfByte, i2, paramzt);
              localUnsafe.putLong(paramT, l1, paramzt.b);
              break;
            case 4: 
            case 11: 
              if (i5 != 0) {
                break label972;
              }
              i1 = zs.a(paramArrayOfByte, i2, paramzt);
              localUnsafe.putInt(paramT, l1, paramzt.a);
              break;
            case 5: 
            case 14: 
              if (i5 != 1) {
                break label972;
              }
              localUnsafe.putLong(paramT, l1, zs.b(paramArrayOfByte, i2));
              i1 = i2 + 8;
              break;
            case 6: 
            case 13: 
              if (i5 != 5) {
                break label972;
              }
              localUnsafe.putInt(paramT, l1, zs.a(paramArrayOfByte, i2));
              i1 = i2 + 4;
              break;
            case 7: 
              if (i5 != 0) {
                break label972;
              }
              i1 = zs.b(paramArrayOfByte, i2, paramzt);
              if (paramzt.b != 0L) {}
              for (boolean bool = true;; bool = false)
              {
                aed.a(paramT, l1, bool);
                break;
              }
            case 8: 
              if (i5 != 2) {
                break label972;
              }
              if ((0x20000000 & i7) == 0) {}
              for (int i11 = zs.c(paramArrayOfByte, i2, paramzt);; i11 = zs.d(paramArrayOfByte, i2, paramzt))
              {
                localUnsafe.putObject(paramT, l1, paramzt.c);
                i1 = i11;
                break;
              }
            case 9: 
              if (i5 != 2) {
                break label972;
              }
              i1 = a(a(i6), paramArrayOfByte, i2, paramInt2, paramzt);
              Object localObject = localUnsafe.getObject(paramT, l1);
              if (localObject == null)
              {
                localUnsafe.putObject(paramT, l1, paramzt.c);
                continue;
              }
              localUnsafe.putObject(paramT, l1, abg.a(localObject, paramzt.c));
              break;
            case 10: 
              if (i5 != 2) {
                break label972;
              }
              i1 = zs.e(paramArrayOfByte, i2, paramzt);
              localUnsafe.putObject(paramT, l1, paramzt.c);
              break;
            case 12: 
              if (i5 != 0) {
                break label972;
              }
              i1 = zs.a(paramArrayOfByte, i2, paramzt);
              localUnsafe.putInt(paramT, l1, paramzt.a);
              break;
            case 15: 
              if (i5 != 0) {
                break label972;
              }
              i1 = zs.a(paramArrayOfByte, i2, paramzt);
              localUnsafe.putInt(paramT, l1, aaf.f(paramzt.a));
              break;
            case 16: 
              if (i5 != 0) {
                break label972;
              }
              i1 = zs.b(paramArrayOfByte, i2, paramzt);
              localUnsafe.putLong(paramT, l1, aaf.a(paramzt.b));
              break;
            }
          }
          else if (i8 == 27)
          {
            if (i5 != 2) {
              break label972;
            }
            localabj1 = (abj)localUnsafe.getObject(paramT, l1);
            if (localabj1.a()) {
              break label979;
            }
            i9 = localabj1.size();
            if (i9 == 0)
            {
              i10 = 10;
              localabj2 = localabj1.a(i10);
              localUnsafe.putObject(paramT, l1, localabj2);
            }
          }
        }
      }
    }
    for (;;)
    {
      i1 = a(a(i6), i3, paramArrayOfByte, i2, paramInt2, localabj2, paramzt);
      break;
      i10 = i9 << 1;
      break label765;
      if (i8 <= 49)
      {
        i1 = a(paramT, paramArrayOfByte, i2, paramInt2, i3, i4, i5, i6, i7, i8, l1, paramzt);
        if (i1 != i2) {
          break;
        }
        break label208;
      }
      if (i8 == 50)
      {
        if (i5 != 2) {
          break label972;
        }
        i1 = a(paramT, paramArrayOfByte, i2, paramInt2, i6, i4, l1, paramzt);
        if (i1 != i2) {
          break;
        }
        break label208;
      }
      i1 = a(paramT, paramArrayOfByte, i2, paramInt2, i3, i4, i5, i7, i8, l1, i6, paramzt);
      if (i1 != i2) {
        break;
      }
      break label208;
      if (i1 != paramInt2)
      {
        throw abk.g();
        a(paramT, paramArrayOfByte, paramInt1, paramInt2, 0, paramzt);
      }
      return;
      label972:
      i1 = i2;
      break label208;
      label979:
      localabj2 = localabj1;
    }
  }
  
  public final boolean a(T paramT1, T paramT2)
  {
    int i1 = this.b.length;
    int i2 = 0;
    if (i2 < i1)
    {
      i3 = d(i2);
      l1 = i3 & 0xFFFFF;
      switch ((i3 & 0xFF00000) >>> 20)
      {
      default: 
        bool = true;
        if (bool) {
          break;
        }
      }
    }
    while (!this.q.b(paramT1).equals(this.q.b(paramT2)))
    {
      for (;;)
      {
        int i3;
        long l1;
        boolean bool;
        return false;
        if ((!c(paramT1, paramT2, i2)) || (aed.b(paramT1, l1) != aed.b(paramT2, l1)))
        {
          bool = false;
          continue;
          if ((!c(paramT1, paramT2, i2)) || (aed.a(paramT1, l1) != aed.a(paramT2, l1)))
          {
            bool = false;
            continue;
            if ((!c(paramT1, paramT2, i2)) || (aed.b(paramT1, l1) != aed.b(paramT2, l1)))
            {
              bool = false;
              continue;
              if ((!c(paramT1, paramT2, i2)) || (aed.b(paramT1, l1) != aed.b(paramT2, l1)))
              {
                bool = false;
                continue;
                if ((!c(paramT1, paramT2, i2)) || (aed.a(paramT1, l1) != aed.a(paramT2, l1)))
                {
                  bool = false;
                  continue;
                  if ((!c(paramT1, paramT2, i2)) || (aed.b(paramT1, l1) != aed.b(paramT2, l1)))
                  {
                    bool = false;
                    continue;
                    if ((!c(paramT1, paramT2, i2)) || (aed.a(paramT1, l1) != aed.a(paramT2, l1)))
                    {
                      bool = false;
                      continue;
                      if ((!c(paramT1, paramT2, i2)) || (aed.c(paramT1, l1) != aed.c(paramT2, l1)))
                      {
                        bool = false;
                        continue;
                        if ((!c(paramT1, paramT2, i2)) || (!adg.a(aed.f(paramT1, l1), aed.f(paramT2, l1))))
                        {
                          bool = false;
                          continue;
                          if ((!c(paramT1, paramT2, i2)) || (!adg.a(aed.f(paramT1, l1), aed.f(paramT2, l1))))
                          {
                            bool = false;
                            continue;
                            if ((!c(paramT1, paramT2, i2)) || (!adg.a(aed.f(paramT1, l1), aed.f(paramT2, l1))))
                            {
                              bool = false;
                              continue;
                              if ((!c(paramT1, paramT2, i2)) || (aed.a(paramT1, l1) != aed.a(paramT2, l1)))
                              {
                                bool = false;
                                continue;
                                if ((!c(paramT1, paramT2, i2)) || (aed.a(paramT1, l1) != aed.a(paramT2, l1)))
                                {
                                  bool = false;
                                  continue;
                                  if ((!c(paramT1, paramT2, i2)) || (aed.a(paramT1, l1) != aed.a(paramT2, l1)))
                                  {
                                    bool = false;
                                    continue;
                                    if ((!c(paramT1, paramT2, i2)) || (aed.b(paramT1, l1) != aed.b(paramT2, l1)))
                                    {
                                      bool = false;
                                      continue;
                                      if ((!c(paramT1, paramT2, i2)) || (aed.a(paramT1, l1) != aed.a(paramT2, l1)))
                                      {
                                        bool = false;
                                        continue;
                                        if ((!c(paramT1, paramT2, i2)) || (aed.b(paramT1, l1) != aed.b(paramT2, l1)))
                                        {
                                          bool = false;
                                          continue;
                                          if ((!c(paramT1, paramT2, i2)) || (!adg.a(aed.f(paramT1, l1), aed.f(paramT2, l1))))
                                          {
                                            bool = false;
                                            continue;
                                            bool = adg.a(aed.f(paramT1, l1), aed.f(paramT2, l1));
                                            continue;
                                            bool = adg.a(aed.f(paramT1, l1), aed.f(paramT2, l1));
                                            continue;
                                            int i4 = e(i2);
                                            if ((aed.a(paramT1, i4 & 0xFFFFF) != aed.a(paramT2, i4 & 0xFFFFF)) || (!adg.a(aed.f(paramT1, l1), aed.f(paramT2, l1)))) {
                                              bool = false;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      i2 += 4;
      break;
    }
    if (this.h) {
      return this.r.a(paramT1).equals(this.r.a(paramT2));
    }
    return true;
  }
  
  public final int b(T paramT)
  {
    label100:
    int i5;
    if (this.j)
    {
      Unsafe localUnsafe2 = a;
      int i30 = 0;
      int i31 = 0;
      if (i31 < this.b.length)
      {
        int i32 = d(i31);
        int i33 = (0xFF00000 & i32) >>> 20;
        int i34 = this.b[i31];
        long l2 = i32 & 0xFFFFF;
        int i35;
        if ((i33 >= aaz.g.a()) && (i33 <= aaz.i.a()))
        {
          i35 = 0xFFFFF & this.b[(i31 + 2)];
          switch (i33)
          {
          }
        }
        for (;;)
        {
          i31 += 4;
          break;
          i35 = 0;
          break label100;
          if (a(paramT, i31))
          {
            i30 += aak.b(i34, 0.0D);
            continue;
            if (a(paramT, i31))
            {
              i30 += aak.b(i34, 0.0F);
              continue;
              if (a(paramT, i31))
              {
                i30 += aak.d(i34, aed.b(paramT, l2));
                continue;
                if (a(paramT, i31))
                {
                  i30 += aak.e(i34, aed.b(paramT, l2));
                  continue;
                  if (a(paramT, i31))
                  {
                    i30 += aak.f(i34, aed.a(paramT, l2));
                    continue;
                    if (a(paramT, i31))
                    {
                      i30 += aak.g(i34, 0L);
                      continue;
                      if (a(paramT, i31))
                      {
                        i30 += aak.i(i34, 0);
                        continue;
                        if (a(paramT, i31))
                        {
                          i30 += aak.b(i34, true);
                          continue;
                          if (a(paramT, i31))
                          {
                            Object localObject4 = aed.f(paramT, l2);
                            if ((localObject4 instanceof zw))
                            {
                              i30 += aak.c(i34, (zw)localObject4);
                            }
                            else
                            {
                              i30 += aak.b(i34, (String)localObject4);
                              continue;
                              if (a(paramT, i31))
                              {
                                i30 += adg.a(i34, aed.f(paramT, l2), a(i31));
                                continue;
                                if (a(paramT, i31))
                                {
                                  i30 += aak.c(i34, (zw)aed.f(paramT, l2));
                                  continue;
                                  if (a(paramT, i31))
                                  {
                                    i30 += aak.g(i34, aed.a(paramT, l2));
                                    continue;
                                    if (a(paramT, i31))
                                    {
                                      i30 += aak.k(i34, aed.a(paramT, l2));
                                      continue;
                                      if (a(paramT, i31))
                                      {
                                        i30 += aak.j(i34, 0);
                                        continue;
                                        if (a(paramT, i31))
                                        {
                                          i30 += aak.h(i34, 0L);
                                          continue;
                                          if (a(paramT, i31))
                                          {
                                            i30 += aak.h(i34, aed.a(paramT, l2));
                                            continue;
                                            if (a(paramT, i31))
                                            {
                                              i30 += aak.f(i34, aed.b(paramT, l2));
                                              continue;
                                              if (a(paramT, i31))
                                              {
                                                i30 += aak.c(i34, (acl)aed.f(paramT, l2), a(i31));
                                                continue;
                                                i30 += adg.i(i34, a(paramT, l2), false);
                                                continue;
                                                i30 += adg.h(i34, a(paramT, l2), false);
                                                continue;
                                                i30 += adg.a(i34, a(paramT, l2), false);
                                                continue;
                                                i30 += adg.b(i34, a(paramT, l2), false);
                                                continue;
                                                i30 += adg.e(i34, a(paramT, l2), false);
                                                continue;
                                                i30 += adg.i(i34, a(paramT, l2), false);
                                                continue;
                                                i30 += adg.h(i34, a(paramT, l2), false);
                                                continue;
                                                i30 += adg.j(i34, a(paramT, l2), false);
                                                continue;
                                                i30 += adg.a(i34, a(paramT, l2));
                                                continue;
                                                i30 += adg.a(i34, a(paramT, l2), a(i31));
                                                continue;
                                                i30 += adg.b(i34, a(paramT, l2));
                                                continue;
                                                i30 += adg.f(i34, a(paramT, l2), false);
                                                continue;
                                                i30 += adg.d(i34, a(paramT, l2), false);
                                                continue;
                                                i30 += adg.h(i34, a(paramT, l2), false);
                                                continue;
                                                i30 += adg.i(i34, a(paramT, l2), false);
                                                continue;
                                                i30 += adg.g(i34, a(paramT, l2), false);
                                                continue;
                                                i30 += adg.c(i34, a(paramT, l2), false);
                                                continue;
                                                int i49 = adg.i((List)localUnsafe2.getObject(paramT, l2));
                                                if (i49 > 0)
                                                {
                                                  if (this.k) {
                                                    localUnsafe2.putInt(paramT, i35, i49);
                                                  }
                                                  i30 += i49 + (aak.e(i34) + aak.g(i49));
                                                  continue;
                                                  int i48 = adg.h((List)localUnsafe2.getObject(paramT, l2));
                                                  if (i48 > 0)
                                                  {
                                                    if (this.k) {
                                                      localUnsafe2.putInt(paramT, i35, i48);
                                                    }
                                                    i30 += i48 + (aak.e(i34) + aak.g(i48));
                                                    continue;
                                                    int i47 = adg.a((List)localUnsafe2.getObject(paramT, l2));
                                                    if (i47 > 0)
                                                    {
                                                      if (this.k) {
                                                        localUnsafe2.putInt(paramT, i35, i47);
                                                      }
                                                      i30 += i47 + (aak.e(i34) + aak.g(i47));
                                                      continue;
                                                      int i46 = adg.b((List)localUnsafe2.getObject(paramT, l2));
                                                      if (i46 > 0)
                                                      {
                                                        if (this.k) {
                                                          localUnsafe2.putInt(paramT, i35, i46);
                                                        }
                                                        i30 += i46 + (aak.e(i34) + aak.g(i46));
                                                        continue;
                                                        int i45 = adg.e((List)localUnsafe2.getObject(paramT, l2));
                                                        if (i45 > 0)
                                                        {
                                                          if (this.k) {
                                                            localUnsafe2.putInt(paramT, i35, i45);
                                                          }
                                                          i30 += i45 + (aak.e(i34) + aak.g(i45));
                                                          continue;
                                                          int i44 = adg.i((List)localUnsafe2.getObject(paramT, l2));
                                                          if (i44 > 0)
                                                          {
                                                            if (this.k) {
                                                              localUnsafe2.putInt(paramT, i35, i44);
                                                            }
                                                            i30 += i44 + (aak.e(i34) + aak.g(i44));
                                                            continue;
                                                            int i43 = adg.h((List)localUnsafe2.getObject(paramT, l2));
                                                            if (i43 > 0)
                                                            {
                                                              if (this.k) {
                                                                localUnsafe2.putInt(paramT, i35, i43);
                                                              }
                                                              i30 += i43 + (aak.e(i34) + aak.g(i43));
                                                              continue;
                                                              int i42 = adg.j((List)localUnsafe2.getObject(paramT, l2));
                                                              if (i42 > 0)
                                                              {
                                                                if (this.k) {
                                                                  localUnsafe2.putInt(paramT, i35, i42);
                                                                }
                                                                i30 += i42 + (aak.e(i34) + aak.g(i42));
                                                                continue;
                                                                int i41 = adg.f((List)localUnsafe2.getObject(paramT, l2));
                                                                if (i41 > 0)
                                                                {
                                                                  if (this.k) {
                                                                    localUnsafe2.putInt(paramT, i35, i41);
                                                                  }
                                                                  i30 += i41 + (aak.e(i34) + aak.g(i41));
                                                                  continue;
                                                                  int i40 = adg.d((List)localUnsafe2.getObject(paramT, l2));
                                                                  if (i40 > 0)
                                                                  {
                                                                    if (this.k) {
                                                                      localUnsafe2.putInt(paramT, i35, i40);
                                                                    }
                                                                    i30 += i40 + (aak.e(i34) + aak.g(i40));
                                                                    continue;
                                                                    int i39 = adg.h((List)localUnsafe2.getObject(paramT, l2));
                                                                    if (i39 > 0)
                                                                    {
                                                                      if (this.k) {
                                                                        localUnsafe2.putInt(paramT, i35, i39);
                                                                      }
                                                                      i30 += i39 + (aak.e(i34) + aak.g(i39));
                                                                      continue;
                                                                      int i38 = adg.i((List)localUnsafe2.getObject(paramT, l2));
                                                                      if (i38 > 0)
                                                                      {
                                                                        if (this.k) {
                                                                          localUnsafe2.putInt(paramT, i35, i38);
                                                                        }
                                                                        i30 += i38 + (aak.e(i34) + aak.g(i38));
                                                                        continue;
                                                                        int i37 = adg.g((List)localUnsafe2.getObject(paramT, l2));
                                                                        if (i37 > 0)
                                                                        {
                                                                          if (this.k) {
                                                                            localUnsafe2.putInt(paramT, i35, i37);
                                                                          }
                                                                          i30 += i37 + (aak.e(i34) + aak.g(i37));
                                                                          continue;
                                                                          int i36 = adg.c((List)localUnsafe2.getObject(paramT, l2));
                                                                          if (i36 > 0)
                                                                          {
                                                                            if (this.k) {
                                                                              localUnsafe2.putInt(paramT, i35, i36);
                                                                            }
                                                                            i30 += i36 + (aak.e(i34) + aak.g(i36));
                                                                            continue;
                                                                            i30 += adg.b(i34, a(paramT, l2), a(i31));
                                                                            continue;
                                                                            i30 += this.s.a(i34, aed.f(paramT, l2), b(i31));
                                                                            continue;
                                                                            if (a(paramT, i34, i31))
                                                                            {
                                                                              i30 += aak.b(i34, 0.0D);
                                                                              continue;
                                                                              if (a(paramT, i34, i31))
                                                                              {
                                                                                i30 += aak.b(i34, 0.0F);
                                                                                continue;
                                                                                if (a(paramT, i34, i31))
                                                                                {
                                                                                  i30 += aak.d(i34, e(paramT, l2));
                                                                                  continue;
                                                                                  if (a(paramT, i34, i31))
                                                                                  {
                                                                                    i30 += aak.e(i34, e(paramT, l2));
                                                                                    continue;
                                                                                    if (a(paramT, i34, i31))
                                                                                    {
                                                                                      i30 += aak.f(i34, d(paramT, l2));
                                                                                      continue;
                                                                                      if (a(paramT, i34, i31))
                                                                                      {
                                                                                        i30 += aak.g(i34, 0L);
                                                                                        continue;
                                                                                        if (a(paramT, i34, i31))
                                                                                        {
                                                                                          i30 += aak.i(i34, 0);
                                                                                          continue;
                                                                                          if (a(paramT, i34, i31))
                                                                                          {
                                                                                            i30 += aak.b(i34, true);
                                                                                            continue;
                                                                                            if (a(paramT, i34, i31))
                                                                                            {
                                                                                              Object localObject3 = aed.f(paramT, l2);
                                                                                              if ((localObject3 instanceof zw))
                                                                                              {
                                                                                                i30 += aak.c(i34, (zw)localObject3);
                                                                                              }
                                                                                              else
                                                                                              {
                                                                                                i30 += aak.b(i34, (String)localObject3);
                                                                                                continue;
                                                                                                if (a(paramT, i34, i31))
                                                                                                {
                                                                                                  i30 += adg.a(i34, aed.f(paramT, l2), a(i31));
                                                                                                  continue;
                                                                                                  if (a(paramT, i34, i31))
                                                                                                  {
                                                                                                    i30 += aak.c(i34, (zw)aed.f(paramT, l2));
                                                                                                    continue;
                                                                                                    if (a(paramT, i34, i31))
                                                                                                    {
                                                                                                      i30 += aak.g(i34, d(paramT, l2));
                                                                                                      continue;
                                                                                                      if (a(paramT, i34, i31))
                                                                                                      {
                                                                                                        i30 += aak.k(i34, d(paramT, l2));
                                                                                                        continue;
                                                                                                        if (a(paramT, i34, i31))
                                                                                                        {
                                                                                                          i30 += aak.j(i34, 0);
                                                                                                          continue;
                                                                                                          if (a(paramT, i34, i31))
                                                                                                          {
                                                                                                            i30 += aak.h(i34, 0L);
                                                                                                            continue;
                                                                                                            if (a(paramT, i34, i31))
                                                                                                            {
                                                                                                              i30 += aak.h(i34, d(paramT, l2));
                                                                                                              continue;
                                                                                                              if (a(paramT, i34, i31))
                                                                                                              {
                                                                                                                i30 += aak.f(i34, e(paramT, l2));
                                                                                                                continue;
                                                                                                                if (a(paramT, i34, i31)) {
                                                                                                                  i30 += aak.c(i34, (acl)aed.f(paramT, l2), a(i31));
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      i5 = i30 + a(this.q, paramT);
      return i5;
    }
    Unsafe localUnsafe1 = a;
    int i1 = -1;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i6;
    int i7;
    int i8;
    int i9;
    int i10;
    int i11;
    int i12;
    if (i3 < this.b.length)
    {
      i6 = d(i3);
      i7 = this.b[i3];
      i8 = (0xFF00000 & i6) >>> 20;
      if (i8 <= 17)
      {
        int i27 = this.b[(i3 + 2)];
        int i28 = 0xFFFFF & i27;
        int i29 = 1 << (i27 >>> 20);
        if (i28 != i1)
        {
          i4 = localUnsafe1.getInt(paramT, i28);
          i1 = i28;
        }
        i9 = i1;
        i10 = i4;
        i11 = i29;
        i12 = i27;
      }
    }
    for (;;)
    {
      label2906:
      long l1 = 0xFFFFF & i6;
      switch (i8)
      {
      }
      for (;;)
      {
        i3 += 4;
        i4 = i10;
        i1 = i9;
        break;
        if ((!this.k) || (i8 < aaz.g.a()) || (i8 > aaz.i.a())) {
          break label5701;
        }
        i12 = 0xFFFFF & this.b[(i3 + 2)];
        i9 = i1;
        i10 = i4;
        i11 = 0;
        break label2906;
        if ((i11 & i10) != 0)
        {
          i2 += aak.b(i7, 0.0D);
          continue;
          if ((i11 & i10) != 0)
          {
            i2 += aak.b(i7, 0.0F);
            continue;
            if ((i11 & i10) != 0)
            {
              i2 += aak.d(i7, localUnsafe1.getLong(paramT, l1));
              continue;
              if ((i11 & i10) != 0)
              {
                i2 += aak.e(i7, localUnsafe1.getLong(paramT, l1));
                continue;
                if ((i11 & i10) != 0)
                {
                  i2 += aak.f(i7, localUnsafe1.getInt(paramT, l1));
                  continue;
                  if ((i11 & i10) != 0)
                  {
                    i2 += aak.g(i7, 0L);
                    continue;
                    if ((i11 & i10) != 0)
                    {
                      i2 += aak.i(i7, 0);
                      continue;
                      if ((i11 & i10) != 0)
                      {
                        i2 += aak.b(i7, true);
                        continue;
                        if ((i11 & i10) != 0)
                        {
                          Object localObject2 = localUnsafe1.getObject(paramT, l1);
                          if ((localObject2 instanceof zw))
                          {
                            i2 += aak.c(i7, (zw)localObject2);
                          }
                          else
                          {
                            i2 += aak.b(i7, (String)localObject2);
                            continue;
                            if ((i11 & i10) != 0)
                            {
                              i2 += adg.a(i7, localUnsafe1.getObject(paramT, l1), a(i3));
                              continue;
                              if ((i11 & i10) != 0)
                              {
                                i2 += aak.c(i7, (zw)localUnsafe1.getObject(paramT, l1));
                                continue;
                                if ((i11 & i10) != 0)
                                {
                                  i2 += aak.g(i7, localUnsafe1.getInt(paramT, l1));
                                  continue;
                                  if ((i11 & i10) != 0)
                                  {
                                    i2 += aak.k(i7, localUnsafe1.getInt(paramT, l1));
                                    continue;
                                    if ((i11 & i10) != 0)
                                    {
                                      i2 += aak.j(i7, 0);
                                      continue;
                                      if ((i11 & i10) != 0)
                                      {
                                        i2 += aak.h(i7, 0L);
                                        continue;
                                        if ((i11 & i10) != 0)
                                        {
                                          i2 += aak.h(i7, localUnsafe1.getInt(paramT, l1));
                                          continue;
                                          if ((i11 & i10) != 0)
                                          {
                                            i2 += aak.f(i7, localUnsafe1.getLong(paramT, l1));
                                            continue;
                                            if ((i11 & i10) != 0)
                                            {
                                              i2 += aak.c(i7, (acl)localUnsafe1.getObject(paramT, l1), a(i3));
                                              continue;
                                              i2 += adg.i(i7, (List)localUnsafe1.getObject(paramT, l1), false);
                                              continue;
                                              i2 += adg.h(i7, (List)localUnsafe1.getObject(paramT, l1), false);
                                              continue;
                                              i2 += adg.a(i7, (List)localUnsafe1.getObject(paramT, l1), false);
                                              continue;
                                              i2 += adg.b(i7, (List)localUnsafe1.getObject(paramT, l1), false);
                                              continue;
                                              i2 += adg.e(i7, (List)localUnsafe1.getObject(paramT, l1), false);
                                              continue;
                                              i2 += adg.i(i7, (List)localUnsafe1.getObject(paramT, l1), false);
                                              continue;
                                              i2 += adg.h(i7, (List)localUnsafe1.getObject(paramT, l1), false);
                                              continue;
                                              i2 += adg.j(i7, (List)localUnsafe1.getObject(paramT, l1), false);
                                              continue;
                                              i2 += adg.a(i7, (List)localUnsafe1.getObject(paramT, l1));
                                              continue;
                                              i2 += adg.a(i7, (List)localUnsafe1.getObject(paramT, l1), a(i3));
                                              continue;
                                              i2 += adg.b(i7, (List)localUnsafe1.getObject(paramT, l1));
                                              continue;
                                              i2 += adg.f(i7, (List)localUnsafe1.getObject(paramT, l1), false);
                                              continue;
                                              i2 += adg.d(i7, (List)localUnsafe1.getObject(paramT, l1), false);
                                              continue;
                                              i2 += adg.h(i7, (List)localUnsafe1.getObject(paramT, l1), false);
                                              continue;
                                              i2 += adg.i(i7, (List)localUnsafe1.getObject(paramT, l1), false);
                                              continue;
                                              i2 += adg.g(i7, (List)localUnsafe1.getObject(paramT, l1), false);
                                              continue;
                                              i2 += adg.c(i7, (List)localUnsafe1.getObject(paramT, l1), false);
                                              continue;
                                              int i26 = adg.i((List)localUnsafe1.getObject(paramT, l1));
                                              if (i26 > 0)
                                              {
                                                if (this.k) {
                                                  localUnsafe1.putInt(paramT, i12, i26);
                                                }
                                                i2 += i26 + (aak.e(i7) + aak.g(i26));
                                                continue;
                                                int i25 = adg.h((List)localUnsafe1.getObject(paramT, l1));
                                                if (i25 > 0)
                                                {
                                                  if (this.k) {
                                                    localUnsafe1.putInt(paramT, i12, i25);
                                                  }
                                                  i2 += i25 + (aak.e(i7) + aak.g(i25));
                                                  continue;
                                                  int i24 = adg.a((List)localUnsafe1.getObject(paramT, l1));
                                                  if (i24 > 0)
                                                  {
                                                    if (this.k) {
                                                      localUnsafe1.putInt(paramT, i12, i24);
                                                    }
                                                    i2 += i24 + (aak.e(i7) + aak.g(i24));
                                                    continue;
                                                    int i23 = adg.b((List)localUnsafe1.getObject(paramT, l1));
                                                    if (i23 > 0)
                                                    {
                                                      if (this.k) {
                                                        localUnsafe1.putInt(paramT, i12, i23);
                                                      }
                                                      i2 += i23 + (aak.e(i7) + aak.g(i23));
                                                      continue;
                                                      int i22 = adg.e((List)localUnsafe1.getObject(paramT, l1));
                                                      if (i22 > 0)
                                                      {
                                                        if (this.k) {
                                                          localUnsafe1.putInt(paramT, i12, i22);
                                                        }
                                                        i2 += i22 + (aak.e(i7) + aak.g(i22));
                                                        continue;
                                                        int i21 = adg.i((List)localUnsafe1.getObject(paramT, l1));
                                                        if (i21 > 0)
                                                        {
                                                          if (this.k) {
                                                            localUnsafe1.putInt(paramT, i12, i21);
                                                          }
                                                          i2 += i21 + (aak.e(i7) + aak.g(i21));
                                                          continue;
                                                          int i20 = adg.h((List)localUnsafe1.getObject(paramT, l1));
                                                          if (i20 > 0)
                                                          {
                                                            if (this.k) {
                                                              localUnsafe1.putInt(paramT, i12, i20);
                                                            }
                                                            i2 += i20 + (aak.e(i7) + aak.g(i20));
                                                            continue;
                                                            int i19 = adg.j((List)localUnsafe1.getObject(paramT, l1));
                                                            if (i19 > 0)
                                                            {
                                                              if (this.k) {
                                                                localUnsafe1.putInt(paramT, i12, i19);
                                                              }
                                                              i2 += i19 + (aak.e(i7) + aak.g(i19));
                                                              continue;
                                                              int i18 = adg.f((List)localUnsafe1.getObject(paramT, l1));
                                                              if (i18 > 0)
                                                              {
                                                                if (this.k) {
                                                                  localUnsafe1.putInt(paramT, i12, i18);
                                                                }
                                                                i2 += i18 + (aak.e(i7) + aak.g(i18));
                                                                continue;
                                                                int i17 = adg.d((List)localUnsafe1.getObject(paramT, l1));
                                                                if (i17 > 0)
                                                                {
                                                                  if (this.k) {
                                                                    localUnsafe1.putInt(paramT, i12, i17);
                                                                  }
                                                                  i2 += i17 + (aak.e(i7) + aak.g(i17));
                                                                  continue;
                                                                  int i16 = adg.h((List)localUnsafe1.getObject(paramT, l1));
                                                                  if (i16 > 0)
                                                                  {
                                                                    if (this.k) {
                                                                      localUnsafe1.putInt(paramT, i12, i16);
                                                                    }
                                                                    i2 += i16 + (aak.e(i7) + aak.g(i16));
                                                                    continue;
                                                                    int i15 = adg.i((List)localUnsafe1.getObject(paramT, l1));
                                                                    if (i15 > 0)
                                                                    {
                                                                      if (this.k) {
                                                                        localUnsafe1.putInt(paramT, i12, i15);
                                                                      }
                                                                      i2 += i15 + (aak.e(i7) + aak.g(i15));
                                                                      continue;
                                                                      int i14 = adg.g((List)localUnsafe1.getObject(paramT, l1));
                                                                      if (i14 > 0)
                                                                      {
                                                                        if (this.k) {
                                                                          localUnsafe1.putInt(paramT, i12, i14);
                                                                        }
                                                                        i2 += i14 + (aak.e(i7) + aak.g(i14));
                                                                        continue;
                                                                        int i13 = adg.c((List)localUnsafe1.getObject(paramT, l1));
                                                                        if (i13 > 0)
                                                                        {
                                                                          if (this.k) {
                                                                            localUnsafe1.putInt(paramT, i12, i13);
                                                                          }
                                                                          i2 += i13 + (aak.e(i7) + aak.g(i13));
                                                                          continue;
                                                                          i2 += adg.b(i7, (List)localUnsafe1.getObject(paramT, l1), a(i3));
                                                                          continue;
                                                                          i2 += this.s.a(i7, localUnsafe1.getObject(paramT, l1), b(i3));
                                                                          continue;
                                                                          if (a(paramT, i7, i3))
                                                                          {
                                                                            i2 += aak.b(i7, 0.0D);
                                                                            continue;
                                                                            if (a(paramT, i7, i3))
                                                                            {
                                                                              i2 += aak.b(i7, 0.0F);
                                                                              continue;
                                                                              if (a(paramT, i7, i3))
                                                                              {
                                                                                i2 += aak.d(i7, e(paramT, l1));
                                                                                continue;
                                                                                if (a(paramT, i7, i3))
                                                                                {
                                                                                  i2 += aak.e(i7, e(paramT, l1));
                                                                                  continue;
                                                                                  if (a(paramT, i7, i3))
                                                                                  {
                                                                                    i2 += aak.f(i7, d(paramT, l1));
                                                                                    continue;
                                                                                    if (a(paramT, i7, i3))
                                                                                    {
                                                                                      i2 += aak.g(i7, 0L);
                                                                                      continue;
                                                                                      if (a(paramT, i7, i3))
                                                                                      {
                                                                                        i2 += aak.i(i7, 0);
                                                                                        continue;
                                                                                        if (a(paramT, i7, i3))
                                                                                        {
                                                                                          i2 += aak.b(i7, true);
                                                                                          continue;
                                                                                          if (a(paramT, i7, i3))
                                                                                          {
                                                                                            Object localObject1 = localUnsafe1.getObject(paramT, l1);
                                                                                            if ((localObject1 instanceof zw))
                                                                                            {
                                                                                              i2 += aak.c(i7, (zw)localObject1);
                                                                                            }
                                                                                            else
                                                                                            {
                                                                                              i2 += aak.b(i7, (String)localObject1);
                                                                                              continue;
                                                                                              if (a(paramT, i7, i3))
                                                                                              {
                                                                                                i2 += adg.a(i7, localUnsafe1.getObject(paramT, l1), a(i3));
                                                                                                continue;
                                                                                                if (a(paramT, i7, i3))
                                                                                                {
                                                                                                  i2 += aak.c(i7, (zw)localUnsafe1.getObject(paramT, l1));
                                                                                                  continue;
                                                                                                  if (a(paramT, i7, i3))
                                                                                                  {
                                                                                                    i2 += aak.g(i7, d(paramT, l1));
                                                                                                    continue;
                                                                                                    if (a(paramT, i7, i3))
                                                                                                    {
                                                                                                      i2 += aak.k(i7, d(paramT, l1));
                                                                                                      continue;
                                                                                                      if (a(paramT, i7, i3))
                                                                                                      {
                                                                                                        i2 += aak.j(i7, 0);
                                                                                                        continue;
                                                                                                        if (a(paramT, i7, i3))
                                                                                                        {
                                                                                                          i2 += aak.h(i7, 0L);
                                                                                                          continue;
                                                                                                          if (a(paramT, i7, i3))
                                                                                                          {
                                                                                                            i2 += aak.h(i7, d(paramT, l1));
                                                                                                            continue;
                                                                                                            if (a(paramT, i7, i3))
                                                                                                            {
                                                                                                              i2 += aak.f(i7, e(paramT, l1));
                                                                                                              continue;
                                                                                                              if (a(paramT, i7, i3)) {
                                                                                                                i2 += aak.c(i7, (acl)localUnsafe1.getObject(paramT, l1), a(i3));
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      i5 = i2 + a(this.q, paramT);
      if (!this.h) {
        break;
      }
      return i5 + this.r.a(paramT).h();
      label5701:
      i9 = i1;
      i10 = i4;
      i11 = 0;
      i12 = 0;
    }
  }
  
  public final void b(T paramT1, T paramT2)
  {
    if (paramT2 == null) {
      throw new NullPointerException();
    }
    int i1 = 0;
    if (i1 < this.b.length)
    {
      int i2 = d(i1);
      long l1 = 0xFFFFF & i2;
      int i3 = this.b[i1];
      switch ((i2 & 0xFF00000) >>> 20)
      {
      }
      for (;;)
      {
        i1 += 4;
        break;
        if (a(paramT2, i1))
        {
          aed.a(paramT1, l1, aed.e(paramT2, l1));
          b(paramT1, i1);
          continue;
          if (a(paramT2, i1))
          {
            aed.a(paramT1, l1, aed.d(paramT2, l1));
            b(paramT1, i1);
            continue;
            if (a(paramT2, i1))
            {
              aed.a(paramT1, l1, aed.b(paramT2, l1));
              b(paramT1, i1);
              continue;
              if (a(paramT2, i1))
              {
                aed.a(paramT1, l1, aed.b(paramT2, l1));
                b(paramT1, i1);
                continue;
                if (a(paramT2, i1))
                {
                  aed.a(paramT1, l1, aed.a(paramT2, l1));
                  b(paramT1, i1);
                  continue;
                  if (a(paramT2, i1))
                  {
                    aed.a(paramT1, l1, aed.b(paramT2, l1));
                    b(paramT1, i1);
                    continue;
                    if (a(paramT2, i1))
                    {
                      aed.a(paramT1, l1, aed.a(paramT2, l1));
                      b(paramT1, i1);
                      continue;
                      if (a(paramT2, i1))
                      {
                        aed.a(paramT1, l1, aed.c(paramT2, l1));
                        b(paramT1, i1);
                        continue;
                        if (a(paramT2, i1))
                        {
                          aed.a(paramT1, l1, aed.f(paramT2, l1));
                          b(paramT1, i1);
                          continue;
                          a(paramT1, paramT2, i1);
                          continue;
                          if (a(paramT2, i1))
                          {
                            aed.a(paramT1, l1, aed.f(paramT2, l1));
                            b(paramT1, i1);
                            continue;
                            if (a(paramT2, i1))
                            {
                              aed.a(paramT1, l1, aed.a(paramT2, l1));
                              b(paramT1, i1);
                              continue;
                              if (a(paramT2, i1))
                              {
                                aed.a(paramT1, l1, aed.a(paramT2, l1));
                                b(paramT1, i1);
                                continue;
                                if (a(paramT2, i1))
                                {
                                  aed.a(paramT1, l1, aed.a(paramT2, l1));
                                  b(paramT1, i1);
                                  continue;
                                  if (a(paramT2, i1))
                                  {
                                    aed.a(paramT1, l1, aed.b(paramT2, l1));
                                    b(paramT1, i1);
                                    continue;
                                    if (a(paramT2, i1))
                                    {
                                      aed.a(paramT1, l1, aed.a(paramT2, l1));
                                      b(paramT1, i1);
                                      continue;
                                      if (a(paramT2, i1))
                                      {
                                        aed.a(paramT1, l1, aed.b(paramT2, l1));
                                        b(paramT1, i1);
                                        continue;
                                        a(paramT1, paramT2, i1);
                                        continue;
                                        this.p.a(paramT1, paramT2, l1);
                                        continue;
                                        adg.a(this.s, paramT1, paramT2, l1);
                                        continue;
                                        if (a(paramT2, i3, i1))
                                        {
                                          aed.a(paramT1, l1, aed.f(paramT2, l1));
                                          b(paramT1, i3, i1);
                                          continue;
                                          b(paramT1, paramT2, i1);
                                          continue;
                                          if (a(paramT2, i3, i1))
                                          {
                                            aed.a(paramT1, l1, aed.f(paramT2, l1));
                                            b(paramT1, i3, i1);
                                            continue;
                                            b(paramT1, paramT2, i1);
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    if (!this.j)
    {
      adg.a(this.q, paramT1, paramT2);
      if (this.h) {
        adg.a(this.r, paramT1, paramT2);
      }
    }
  }
  
  public final void c(T paramT)
  {
    int i1 = 0;
    if (this.m != null)
    {
      int[] arrayOfInt2 = this.m;
      int i4 = arrayOfInt2.length;
      for (int i5 = 0; i5 < i4; i5++)
      {
        long l1 = 0xFFFFF & d(arrayOfInt2[i5]);
        Object localObject = aed.f(paramT, l1);
        if (localObject != null) {
          aed.a(paramT, l1, this.s.d(localObject));
        }
      }
    }
    if (this.n != null)
    {
      int[] arrayOfInt1 = this.n;
      int i2 = arrayOfInt1.length;
      while (i1 < i2)
      {
        int i3 = arrayOfInt1[i1];
        this.p.b(paramT, i3);
        i1++;
      }
    }
    this.q.d(paramT);
    if (this.h) {
      this.r.c(paramT);
    }
  }
  
  public final boolean d(T paramT)
  {
    if ((this.l == null) || (this.l.length == 0)) {
      return true;
    }
    int i1 = -1;
    int i2 = 0;
    int[] arrayOfInt = this.l;
    int i3 = arrayOfInt.length;
    int i4 = 0;
    int i5;
    int i6;
    int i7;
    int i8;
    int i9;
    if (i4 < i3)
    {
      i5 = arrayOfInt[i4];
      i6 = g(i5);
      i7 = d(i6);
      boolean bool = this.j;
      i8 = 0;
      if (bool) {
        break label575;
      }
      int i15 = this.b[(i6 + 2)];
      int i16 = 0xFFFFF & i15;
      i8 = 1 << (i15 >>> 20);
      if (i16 == i1) {
        break label575;
      }
      int i17 = a.getInt(paramT, i16);
      i1 = i16;
      i9 = i17;
    }
    for (int i10 = i8;; i10 = i8)
    {
      if ((0x10000000 & i7) != 0) {}
      for (int i11 = 1; (i11 != 0) && (!a(paramT, i6, i9, i10)); i11 = 0) {
        return false;
      }
      switch ((0xFF00000 & i7) >>> 20)
      {
      }
      for (;;)
      {
        i4++;
        i2 = i9;
        break;
        if ((a(paramT, i6, i9, i10)) && (!a(paramT, i7, a(i6))))
        {
          return false;
          List localList = (List)aed.f(paramT, 0xFFFFF & i7);
          int i14;
          if (!localList.isEmpty())
          {
            ade localade2 = a(i6);
            i14 = 0;
            if (i14 < localList.size()) {
              if (localade2.d(localList.get(i14))) {}
            }
          }
          for (int i13 = 0;; i13 = 1)
          {
            if (i13 != 0) {
              break label375;
            }
            return false;
            i14++;
            break;
          }
          label375:
          continue;
          if ((a(paramT, i5, i6)) && (!a(paramT, i7, a(i6))))
          {
            return false;
            Map localMap = this.s.b(aed.f(paramT, 0xFFFFF & i7));
            if (!localMap.isEmpty())
            {
              Object localObject1 = b(i6);
              if (this.s.f(localObject1).c.a() == aeq.i)
              {
                ade localade1 = null;
                Iterator localIterator = localMap.values().iterator();
                Object localObject2;
                do
                {
                  if (!localIterator.hasNext()) {
                    break;
                  }
                  localObject2 = localIterator.next();
                  if (localade1 == null) {
                    localade1 = acy.a().a(localObject2.getClass());
                  }
                } while (localade1.d(localObject2));
              }
            }
            for (int i12 = 0; i12 == 0; i12 = 1) {
              return false;
            }
          }
        }
      }
      return (!this.h) || (this.r.a(paramT).g());
      label575:
      i9 = i2;
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.acp
 * JD-Core Version:    0.7.0.1
 */