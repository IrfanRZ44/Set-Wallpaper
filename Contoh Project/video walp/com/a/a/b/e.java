package com.a.a.b;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class e
  implements a
{
  private static final String a = e.class.getSimpleName();
  private int[] b;
  private final int[] c = new int[256];
  private final a.a d;
  private ByteBuffer e;
  private byte[] f;
  private short[] g;
  private byte[] h;
  private byte[] i;
  private byte[] j;
  private int[] k;
  private int l;
  private c m;
  private Bitmap n;
  private boolean o;
  private int p;
  private int q;
  private int r;
  private int s;
  private Boolean t;
  private Bitmap.Config u = Bitmap.Config.ARGB_8888;
  
  public e(a.a parama)
  {
    this.d = parama;
    this.m = new c();
  }
  
  public e(a.a parama, c paramc, ByteBuffer paramByteBuffer, int paramInt)
  {
    this(parama);
    a(paramc, paramByteBuffer, paramInt);
  }
  
  private int a(int paramInt1, int paramInt2, int paramInt3)
  {
    int i1 = paramInt1;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    while ((i1 < paramInt1 + this.q) && (i1 < this.j.length) && (i1 < paramInt2))
    {
      int i10 = 0xFF & this.j[i1];
      int i11 = this.b[i10];
      if (i11 != 0)
      {
        i6 += (0xFF & i11 >> 24);
        i5 += (0xFF & i11 >> 16);
        i4 += (0xFF & i11 >> 8);
        i3 += (i11 & 0xFF);
        i2++;
      }
      i1++;
    }
    for (int i7 = paramInt1 + paramInt3; (i7 < paramInt1 + paramInt3 + this.q) && (i7 < this.j.length) && (i7 < paramInt2); i7++)
    {
      int i8 = 0xFF & this.j[i7];
      int i9 = this.b[i8];
      if (i9 != 0)
      {
        i6 += (0xFF & i9 >> 24);
        i5 += (0xFF & i9 >> 16);
        i4 += (0xFF & i9 >> 8);
        i3 += (i9 & 0xFF);
        i2++;
      }
    }
    if (i2 == 0) {
      return 0;
    }
    return i6 / i2 << 24 | i5 / i2 << 16 | i4 / i2 << 8 | i3 / i2;
  }
  
  private Bitmap a(b paramb1, b paramb2)
  {
    int[] arrayOfInt = this.k;
    if (paramb2 == null)
    {
      if (this.n != null) {
        this.d.a(this.n);
      }
      this.n = null;
      Arrays.fill(arrayOfInt, 0);
    }
    if ((paramb2 != null) && (paramb2.g == 3) && (this.n == null)) {
      Arrays.fill(arrayOfInt, 0);
    }
    if ((paramb2 != null) && (paramb2.g > 0))
    {
      if (paramb2.g == 2)
      {
        int i1;
        int i4;
        int i5;
        int i6;
        if (!paramb1.f)
        {
          i1 = this.m.l;
          if ((paramb1.k != null) && (this.m.j == paramb1.h)) {
            i1 = 0;
          }
          int i2 = paramb2.d / this.q;
          int i3 = paramb2.b / this.q;
          i4 = paramb2.c / this.q;
          i5 = paramb2.a / this.q + i3 * this.s;
          i6 = i5 + i2 * this.s;
        }
        for (;;)
        {
          if (i5 >= i6) {
            break label294;
          }
          int i7 = i5 + i4;
          int i8 = i5;
          for (;;)
          {
            if (i8 < i7)
            {
              arrayOfInt[i8] = i1;
              i8++;
              continue;
              if (this.l == 0) {
                this.t = Boolean.valueOf(true);
              }
              i1 = 0;
              break;
            }
          }
          i5 += this.s;
        }
      }
      if ((paramb2.g == 3) && (this.n != null)) {
        this.n.getPixels(arrayOfInt, 0, this.s, 0, 0, this.s, this.r);
      }
    }
    label294:
    c(paramb1);
    if ((paramb1.e) || (this.q != 1)) {
      b(paramb1);
    }
    for (;;)
    {
      if ((this.o) && ((paramb1.g == 0) || (paramb1.g == 1)))
      {
        if (this.n == null) {
          this.n = l();
        }
        this.n.setPixels(arrayOfInt, 0, this.s, 0, 0, this.s, this.r);
      }
      Bitmap localBitmap = l();
      localBitmap.setPixels(arrayOfInt, 0, this.s, 0, 0, this.s, this.r);
      return localBitmap;
      a(paramb1);
    }
  }
  
  private void a(b paramb)
  {
    int[] arrayOfInt1 = this.k;
    int i1 = paramb.d;
    int i2 = paramb.b;
    int i3 = paramb.c;
    int i4 = paramb.a;
    int i5;
    int i6;
    byte[] arrayOfByte;
    int[] arrayOfInt2;
    int i7;
    int i8;
    if (this.l == 0)
    {
      i5 = 1;
      i6 = this.s;
      arrayOfByte = this.j;
      arrayOfInt2 = this.b;
      i7 = -1;
      i8 = 0;
    }
    for (;;)
    {
      if (i8 >= i1) {
        break label216;
      }
      int i9 = i6 * (i8 + i2);
      int i10 = i9 + i4;
      int i11 = i10 + i3;
      if (i9 + i6 < i11) {
        i11 = i9 + i6;
      }
      int i12 = i8 * paramb.c;
      int i13 = i10;
      int i14 = i7;
      int i15 = i12;
      label130:
      if (i13 < i11)
      {
        int i16 = arrayOfByte[i15];
        int i17 = i16 & 0xFF;
        if (i17 != i14)
        {
          int i19 = arrayOfInt2[i17];
          if (i19 == 0) {
            break label199;
          }
          arrayOfInt1[i13] = i19;
        }
        for (;;)
        {
          int i18 = i15 + 1;
          i13++;
          i15 = i18;
          break label130;
          i5 = 0;
          break;
          label199:
          i14 = i16;
        }
      }
      i8++;
      i7 = i14;
    }
    label216:
    if ((this.t == null) && (i5 != 0) && (i7 != -1)) {}
    for (boolean bool = true;; bool = false)
    {
      this.t = Boolean.valueOf(bool);
      return;
    }
  }
  
  private void b(b paramb)
  {
    int[] arrayOfInt1 = this.k;
    int i1 = paramb.d / this.q;
    int i2 = paramb.b / this.q;
    int i3 = paramb.c / this.q;
    int i4 = paramb.a / this.q;
    int i5 = 1;
    int i6 = 8;
    int i7 = 0;
    int i8;
    int i9;
    int i10;
    int i11;
    byte[] arrayOfByte;
    int[] arrayOfInt2;
    Object localObject1;
    int i12;
    label107:
    int i13;
    label156:
    int i14;
    int i15;
    if (this.l == 0)
    {
      i8 = 1;
      i9 = this.q;
      i10 = this.s;
      i11 = this.r;
      arrayOfByte = this.j;
      arrayOfInt2 = this.b;
      localObject1 = this.t;
      i12 = 0;
      if (i12 >= i1) {
        break label476;
      }
      if (!paramb.e) {
        break label511;
      }
      if (i7 >= i1) {
        i5++;
      }
      switch (i5)
      {
      default: 
        i13 = i7 + i6;
        i14 = i6;
        i15 = i5;
      }
    }
    for (;;)
    {
      int i16 = i7 + i2;
      int i17;
      label187:
      int i19;
      int i20;
      int i21;
      int i26;
      int i27;
      if (i9 == 1)
      {
        i17 = 1;
        if (i16 >= i11) {
          break label450;
        }
        int i18 = i16 * i10;
        i19 = i18 + i4;
        i20 = i19 + i3;
        if (i18 + i10 < i20) {
          i20 = i18 + i10;
        }
        i21 = i12 * i9 * paramb.c;
        if (i17 == 0) {
          break label361;
        }
        localObject2 = localObject1;
        i26 = i19;
        i27 = i21;
        label261:
        if (i26 >= i20) {
          break label454;
        }
        int i28 = arrayOfInt2[(0xFF & arrayOfByte[i27])];
        if (i28 == 0) {
          break label342;
        }
        arrayOfInt1[i26] = i28;
      }
      for (;;)
      {
        i27 += i9;
        i26++;
        break label261;
        i8 = 0;
        break;
        i7 = 4;
        break label156;
        i7 = 2;
        i6 = 4;
        break label156;
        i7 = 1;
        i6 = 2;
        break label156;
        i17 = 0;
        break label187;
        label342:
        if ((i8 != 0) && (localObject2 == null)) {
          localObject2 = Boolean.valueOf(true);
        }
      }
      label361:
      int i22 = i21 + i9 * (i20 - i19);
      Object localObject2 = localObject1;
      int i23 = i19;
      int i24 = i21;
      if (i23 < i20)
      {
        int i25 = a(i24, i22, paramb.c);
        if (i25 != 0) {
          arrayOfInt1[i23] = i25;
        }
        for (;;)
        {
          i24 += i9;
          i23++;
          break;
          if ((i8 != 0) && (localObject2 == null)) {
            localObject2 = Boolean.valueOf(true);
          }
        }
        label450:
        localObject2 = localObject1;
      }
      label454:
      i12++;
      localObject1 = localObject2;
      i7 = i13;
      i5 = i15;
      i6 = i14;
      break label107;
      label476:
      if (this.t == null) {
        if (localObject1 != null) {
          break label501;
        }
      }
      label501:
      for (boolean bool = false;; bool = ((Boolean)localObject1).booleanValue())
      {
        this.t = Boolean.valueOf(bool);
        return;
      }
      label511:
      i13 = i7;
      i14 = i6;
      i15 = i5;
      i7 = i12;
    }
  }
  
  private void c(b paramb)
  {
    if (paramb != null) {
      this.e.position(paramb.j);
    }
    if (paramb == null) {}
    byte[] arrayOfByte1;
    short[] arrayOfShort;
    byte[] arrayOfByte2;
    byte[] arrayOfByte3;
    int i2;
    int i3;
    int i4;
    int i5;
    int i6;
    int i7;
    for (int i1 = this.m.f * this.m.g;; i1 = paramb.c * paramb.d)
    {
      if ((this.j == null) || (this.j.length < i1)) {
        this.j = this.d.a(i1);
      }
      arrayOfByte1 = this.j;
      if (this.g == null) {
        this.g = new short[4096];
      }
      arrayOfShort = this.g;
      if (this.h == null) {
        this.h = new byte[4096];
      }
      arrayOfByte2 = this.h;
      if (this.i == null) {
        this.i = new byte[4097];
      }
      arrayOfByte3 = this.i;
      i2 = j();
      i3 = 1 << i2;
      i4 = i3 + 1;
      i5 = i3 + 2;
      i6 = i2 + 1;
      i7 = -1 + (1 << i6);
      for (int i8 = 0; i8 < i3; i8++)
      {
        arrayOfShort[i8] = 0;
        arrayOfByte2[i8] = ((byte)i8);
      }
    }
    byte[] arrayOfByte4 = this.f;
    int i9 = 0;
    int i10 = 0;
    int i11 = 0;
    int i12 = 0;
    int i13 = -1;
    int i14 = i6;
    int i15 = i7;
    int i16 = i5;
    int i17 = 0;
    int i18 = 0;
    int i19 = 0;
    int i20 = 0;
    for (;;)
    {
      if (i9 < i1)
      {
        if (i19 != 0) {
          break label302;
        }
        i19 = k();
        if (i19 <= 0) {
          this.p = 3;
        }
      }
      else
      {
        Arrays.fill(arrayOfByte1, i10, i1, (byte)0);
        return;
      }
      i17 = 0;
      label302:
      int i21 = i18 + ((0xFF & arrayOfByte4[i17]) << i20);
      int i22 = i20 + 8;
      int i23 = i17 + 1;
      int i24 = i19 - 1;
      int i25 = i14;
      int i26 = i15;
      int i27 = i9;
      int i28 = i10;
      int i29 = i12;
      int i30 = i13;
      int i31 = i21;
      int i32 = i16;
      int i33 = i22;
      int i34 = i30;
      for (;;)
      {
        if (i33 >= i25)
        {
          int i36 = i31 & i26;
          int i37 = i31 >> i25;
          i33 -= i25;
          if (i36 == i3)
          {
            i25 = i2 + 1;
            i26 = -1 + (1 << i25);
            i32 = i3 + 2;
            i31 = i37;
            i34 = -1;
          }
          else
          {
            if (i36 == i4)
            {
              i12 = i29;
              i13 = i34;
              i10 = i28;
              i20 = i33;
              i9 = i27;
              i16 = i32;
              i18 = i37;
              i15 = i26;
              i14 = i25;
              i19 = i24;
              i17 = i23;
              break;
            }
            if (i34 == -1)
            {
              arrayOfByte3[i11] = arrayOfByte2[i36];
              i11++;
              i29 = i36;
              i31 = i37;
              i34 = i36;
            }
            else
            {
              int i38;
              if (i36 >= i32)
              {
                arrayOfByte3[i11] = ((byte)i29);
                i11++;
                i38 = i34;
              }
              for (;;)
              {
                if (i38 >= i3)
                {
                  arrayOfByte3[i11] = arrayOfByte2[i38];
                  i11++;
                  i38 = arrayOfShort[i38];
                }
                else
                {
                  int i39 = 0xFF & arrayOfByte2[i38];
                  arrayOfByte1[i28] = ((byte)i39);
                  int i40 = i28 + 1;
                  for (int i41 = i27 + 1; i11 > 0; i41++)
                  {
                    i11--;
                    arrayOfByte1[i40] = arrayOfByte3[i11];
                    i40++;
                  }
                  if (i32 < 4096)
                  {
                    arrayOfShort[i32] = ((short)i34);
                    arrayOfByte2[i32] = ((byte)i39);
                    i32++;
                    if (((i32 & i26) == 0) && (i32 < 4096))
                    {
                      i25++;
                      i26 += i32;
                    }
                  }
                  i27 = i41;
                  i34 = i36;
                  i28 = i40;
                  i29 = i39;
                  i31 = i37;
                  break;
                  i38 = i36;
                }
              }
            }
          }
        }
      }
      i12 = i29;
      i14 = i25;
      i10 = i28;
      i17 = i23;
      i9 = i27;
      i15 = i26;
      i19 = i24;
      int i35 = i34;
      i20 = i33;
      i16 = i32;
      i18 = i31;
      i13 = i35;
    }
  }
  
  private int j()
  {
    return 0xFF & this.e.get();
  }
  
  private int k()
  {
    int i1 = j();
    if (i1 <= 0) {
      return i1;
    }
    this.e.get(this.f, 0, Math.min(i1, this.e.remaining()));
    return i1;
  }
  
  private Bitmap l()
  {
    if ((this.t == null) || (this.t.booleanValue())) {}
    for (Bitmap.Config localConfig = Bitmap.Config.ARGB_8888;; localConfig = this.u)
    {
      Bitmap localBitmap = this.d.a(this.s, this.r, localConfig);
      localBitmap.setHasAlpha(true);
      return localBitmap;
    }
  }
  
  public int a(int paramInt)
  {
    int i1 = -1;
    if ((paramInt >= 0) && (paramInt < this.m.c)) {
      i1 = ((b)this.m.e.get(paramInt)).i;
    }
    return i1;
  }
  
  public ByteBuffer a()
  {
    return this.e;
  }
  
  public void a(Bitmap.Config paramConfig)
  {
    if ((paramConfig != Bitmap.Config.ARGB_8888) && (paramConfig != Bitmap.Config.RGB_565)) {
      throw new IllegalArgumentException("Unsupported format: " + paramConfig + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }
    this.u = paramConfig;
  }
  
  public void a(c paramc, ByteBuffer paramByteBuffer, int paramInt)
  {
    if (paramInt <= 0) {
      try
      {
        throw new IllegalArgumentException("Sample size must be >=0, not: " + paramInt);
      }
      finally {}
    }
    int i1 = Integer.highestOneBit(paramInt);
    this.p = 0;
    this.m = paramc;
    this.l = -1;
    this.e = paramByteBuffer.asReadOnlyBuffer();
    this.e.position(0);
    this.e.order(ByteOrder.LITTLE_ENDIAN);
    this.o = false;
    Iterator localIterator = paramc.e.iterator();
    while (localIterator.hasNext()) {
      if (((b)localIterator.next()).g == 3) {
        this.o = true;
      }
    }
    this.q = i1;
    this.s = (paramc.f / i1);
    this.r = (paramc.g / i1);
    this.j = this.d.a(paramc.f * paramc.g);
    this.k = this.d.b(this.s * this.r);
  }
  
  public void b()
  {
    this.l = ((1 + this.l) % this.m.c);
  }
  
  public int c()
  {
    if ((this.m.c <= 0) || (this.l < 0)) {
      return 0;
    }
    return a(this.l);
  }
  
  public int d()
  {
    return this.m.c;
  }
  
  public int e()
  {
    return this.l;
  }
  
  public void f()
  {
    this.l = -1;
  }
  
  public int g()
  {
    return this.e.limit() + this.j.length + 4 * this.k.length;
  }
  
  public Bitmap h()
  {
    for (;;)
    {
      try
      {
        if ((this.m.c <= 0) || (this.l < 0))
        {
          if (Log.isLoggable(a, 3)) {
            Log.d(a, "Unable to decode frame, frameCount=" + this.m.c + ", framePointer=" + this.l);
          }
          this.p = 1;
        }
        Object localObject2;
        if ((this.p == 1) || (this.p == 2))
        {
          if (Log.isLoggable(a, 3)) {
            Log.d(a, "Unable to decode frame, status=" + this.p);
          }
          localObject2 = null;
          return localObject2;
        }
        this.p = 0;
        if (this.f == null) {
          this.f = this.d.a(255);
        }
        b localb1 = (b)this.m.e.get(this.l);
        int i1 = -1 + this.l;
        b localb2;
        if (i1 >= 0)
        {
          localb2 = (b)this.m.e.get(i1);
          int[] arrayOfInt;
          if (localb1.k != null)
          {
            arrayOfInt = localb1.k;
            this.b = arrayOfInt;
            if (this.b == null)
            {
              if (Log.isLoggable(a, 3)) {
                Log.d(a, "No valid color table found for frame #" + this.l);
              }
              this.p = 1;
              localObject2 = null;
            }
          }
          else
          {
            arrayOfInt = this.m.a;
            continue;
          }
          if (localb1.f)
          {
            System.arraycopy(this.b, 0, this.c, 0, this.b.length);
            this.b = this.c;
            this.b[localb1.h] = 0;
          }
          Bitmap localBitmap = a(localb1, localb2);
          localObject2 = localBitmap;
        }
        else
        {
          localb2 = null;
        }
      }
      finally {}
    }
  }
  
  public void i()
  {
    this.m = null;
    if (this.j != null) {
      this.d.a(this.j);
    }
    if (this.k != null) {
      this.d.a(this.k);
    }
    if (this.n != null) {
      this.d.a(this.n);
    }
    this.n = null;
    this.e = null;
    this.t = null;
    if (this.f != null) {
      this.d.a(this.f);
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.b.e
 * JD-Core Version:    0.7.0.1
 */