package com.a.a.g;

import android.content.res.Resources.Theme;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.a.a.c.d.a.k;
import com.a.a.c.d.a.n;
import com.a.a.c.d.e.c;
import com.a.a.c.d.e.f;
import com.a.a.h.a;
import java.util.HashMap;
import java.util.Map;

public class e
  implements Cloneable
{
  private int a;
  private float b = 1.0F;
  private com.a.a.c.b.i c = com.a.a.c.b.i.e;
  private com.a.a.g d = com.a.a.g.c;
  private Drawable e;
  private int f;
  private Drawable g;
  private int h;
  private boolean i = true;
  private int j = -1;
  private int k = -1;
  private com.a.a.c.h l = a.a();
  private boolean m;
  private boolean n = true;
  private Drawable o;
  private int p;
  private com.a.a.c.j q = new com.a.a.c.j();
  private Map<Class<?>, com.a.a.c.m<?>> r = new HashMap();
  private Class<?> s = Object.class;
  private boolean t;
  private Resources.Theme u;
  private boolean v;
  private boolean w;
  private boolean x;
  private boolean y = true;
  private boolean z;
  
  private e H()
  {
    if (this.t) {
      throw new IllegalStateException("You cannot modify locked RequestOptions, consider clone()");
    }
    return this;
  }
  
  public static e a(com.a.a.c.b.i parami)
  {
    return new e().b(parami);
  }
  
  private e a(com.a.a.c.d.a.j paramj, com.a.a.c.m<Bitmap> paramm, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (e locale = b(paramj, paramm);; locale = a(paramj, paramm))
    {
      locale.y = true;
      return locale;
    }
  }
  
  public static e a(com.a.a.c.h paramh)
  {
    return new e().b(paramh);
  }
  
  private e a(com.a.a.c.m<Bitmap> paramm, boolean paramBoolean)
  {
    if (this.v) {
      return a().a(paramm, paramBoolean);
    }
    com.a.a.c.d.a.m localm = new com.a.a.c.d.a.m(paramm, paramBoolean);
    a(Bitmap.class, paramm, paramBoolean);
    a(Drawable.class, localm, paramBoolean);
    a(BitmapDrawable.class, localm.a(), paramBoolean);
    a(c.class, new f(paramm), paramBoolean);
    return H();
  }
  
  public static e a(Class<?> paramClass)
  {
    return new e().b(paramClass);
  }
  
  private <T> e a(Class<T> paramClass, com.a.a.c.m<T> paramm, boolean paramBoolean)
  {
    if (this.v) {
      return a().a(paramClass, paramm, paramBoolean);
    }
    com.a.a.i.h.a(paramClass);
    com.a.a.i.h.a(paramm);
    this.r.put(paramClass, paramm);
    this.a = (0x800 | this.a);
    this.n = true;
    this.a = (0x10000 | this.a);
    this.y = false;
    if (paramBoolean)
    {
      this.a = (0x20000 | this.a);
      this.m = true;
    }
    return H();
  }
  
  private boolean b(int paramInt)
  {
    return b(this.a, paramInt);
  }
  
  private static boolean b(int paramInt1, int paramInt2)
  {
    return (paramInt1 & paramInt2) != 0;
  }
  
  private e c(com.a.a.c.d.a.j paramj, com.a.a.c.m<Bitmap> paramm)
  {
    return a(paramj, paramm, false);
  }
  
  public final boolean A()
  {
    return com.a.a.i.i.a(this.k, this.j);
  }
  
  public final int B()
  {
    return this.j;
  }
  
  public final float C()
  {
    return this.b;
  }
  
  boolean D()
  {
    return this.y;
  }
  
  public final boolean E()
  {
    return this.w;
  }
  
  public final boolean F()
  {
    return this.z;
  }
  
  public final boolean G()
  {
    return this.x;
  }
  
  public e a()
  {
    try
    {
      e locale = (e)super.clone();
      locale.q = new com.a.a.c.j();
      locale.q.a(this.q);
      locale.r = new HashMap();
      locale.r.putAll(this.r);
      locale.t = false;
      locale.v = false;
      return locale;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new RuntimeException(localCloneNotSupportedException);
    }
  }
  
  public e a(float paramFloat)
  {
    if (this.v) {
      return a().a(paramFloat);
    }
    if ((paramFloat < 0.0F) || (paramFloat > 1.0F)) {
      throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
    }
    this.b = paramFloat;
    this.a = (0x2 | this.a);
    return H();
  }
  
  public e a(int paramInt)
  {
    if (this.v) {
      return a().a(paramInt);
    }
    this.h = paramInt;
    this.a = (0x80 | this.a);
    return H();
  }
  
  public e a(int paramInt1, int paramInt2)
  {
    if (this.v) {
      return a().a(paramInt1, paramInt2);
    }
    this.k = paramInt1;
    this.j = paramInt2;
    this.a = (0x200 | this.a);
    return H();
  }
  
  public e a(com.a.a.c.d.a.j paramj)
  {
    return a(k.b, com.a.a.i.h.a(paramj));
  }
  
  final e a(com.a.a.c.d.a.j paramj, com.a.a.c.m<Bitmap> paramm)
  {
    if (this.v) {
      return a().a(paramj, paramm);
    }
    a(paramj);
    return a(paramm, false);
  }
  
  public <T> e a(com.a.a.c.i<T> parami, T paramT)
  {
    if (this.v) {
      return a().a(parami, paramT);
    }
    com.a.a.i.h.a(parami);
    com.a.a.i.h.a(paramT);
    this.q.a(parami, paramT);
    return H();
  }
  
  public e a(com.a.a.c.m<Bitmap> paramm)
  {
    return a(paramm, true);
  }
  
  public e a(e parame)
  {
    if (this.v) {
      return a().a(parame);
    }
    if (b(parame.a, 2)) {
      this.b = parame.b;
    }
    if (b(parame.a, 262144)) {
      this.w = parame.w;
    }
    if (b(parame.a, 1048576)) {
      this.z = parame.z;
    }
    if (b(parame.a, 4)) {
      this.c = parame.c;
    }
    if (b(parame.a, 8)) {
      this.d = parame.d;
    }
    if (b(parame.a, 16)) {
      this.e = parame.e;
    }
    if (b(parame.a, 32)) {
      this.f = parame.f;
    }
    if (b(parame.a, 64)) {
      this.g = parame.g;
    }
    if (b(parame.a, 128)) {
      this.h = parame.h;
    }
    if (b(parame.a, 256)) {
      this.i = parame.i;
    }
    if (b(parame.a, 512))
    {
      this.k = parame.k;
      this.j = parame.j;
    }
    if (b(parame.a, 1024)) {
      this.l = parame.l;
    }
    if (b(parame.a, 4096)) {
      this.s = parame.s;
    }
    if (b(parame.a, 8192)) {
      this.o = parame.o;
    }
    if (b(parame.a, 16384)) {
      this.p = parame.p;
    }
    if (b(parame.a, 32768)) {
      this.u = parame.u;
    }
    if (b(parame.a, 65536)) {
      this.n = parame.n;
    }
    if (b(parame.a, 131072)) {
      this.m = parame.m;
    }
    if (b(parame.a, 2048))
    {
      this.r.putAll(parame.r);
      this.y = parame.y;
    }
    if (b(parame.a, 524288)) {
      this.x = parame.x;
    }
    if (!this.n)
    {
      this.r.clear();
      this.a = (0xFFFFF7FF & this.a);
      this.m = false;
      this.a = (0xFFFDFFFF & this.a);
      this.y = true;
    }
    this.a |= parame.a;
    this.q.a(parame.q);
    return H();
  }
  
  public e a(com.a.a.g paramg)
  {
    if (this.v) {
      return a().a(paramg);
    }
    this.d = ((com.a.a.g)com.a.a.i.h.a(paramg));
    this.a = (0x8 | this.a);
    return H();
  }
  
  public e a(boolean paramBoolean)
  {
    if (this.v) {
      return a().a(paramBoolean);
    }
    this.z = paramBoolean;
    this.a = (0x100000 | this.a);
    return H();
  }
  
  public e b(com.a.a.c.b.i parami)
  {
    if (this.v) {
      return a().b(parami);
    }
    this.c = ((com.a.a.c.b.i)com.a.a.i.h.a(parami));
    this.a = (0x4 | this.a);
    return H();
  }
  
  final e b(com.a.a.c.d.a.j paramj, com.a.a.c.m<Bitmap> paramm)
  {
    if (this.v) {
      return a().b(paramj, paramm);
    }
    a(paramj);
    return a(paramm);
  }
  
  public e b(com.a.a.c.h paramh)
  {
    if (this.v) {
      return a().b(paramh);
    }
    this.l = ((com.a.a.c.h)com.a.a.i.h.a(paramh));
    this.a = (0x400 | this.a);
    return H();
  }
  
  public e b(Class<?> paramClass)
  {
    if (this.v) {
      return a().b(paramClass);
    }
    this.s = ((Class)com.a.a.i.h.a(paramClass));
    this.a = (0x1000 | this.a);
    return H();
  }
  
  public e b(boolean paramBoolean)
  {
    boolean bool = true;
    if (this.v) {
      return a().b(bool);
    }
    if (!paramBoolean) {}
    for (;;)
    {
      this.i = bool;
      this.a = (0x100 | this.a);
      return H();
      bool = false;
    }
  }
  
  public final boolean b()
  {
    return this.n;
  }
  
  public final boolean c()
  {
    return b(2048);
  }
  
  public e d()
  {
    return a(com.a.a.c.d.a.j.b, new com.a.a.c.d.a.g());
  }
  
  public e e()
  {
    return b(com.a.a.c.d.a.j.b, new com.a.a.c.d.a.g());
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof e;
    boolean bool2 = false;
    if (bool1)
    {
      e locale = (e)paramObject;
      int i1 = Float.compare(locale.b, this.b);
      bool2 = false;
      if (i1 == 0)
      {
        int i2 = this.f;
        int i3 = locale.f;
        bool2 = false;
        if (i2 == i3)
        {
          boolean bool3 = com.a.a.i.i.a(this.e, locale.e);
          bool2 = false;
          if (bool3)
          {
            int i4 = this.h;
            int i5 = locale.h;
            bool2 = false;
            if (i4 == i5)
            {
              boolean bool4 = com.a.a.i.i.a(this.g, locale.g);
              bool2 = false;
              if (bool4)
              {
                int i6 = this.p;
                int i7 = locale.p;
                bool2 = false;
                if (i6 == i7)
                {
                  boolean bool5 = com.a.a.i.i.a(this.o, locale.o);
                  bool2 = false;
                  if (bool5)
                  {
                    boolean bool6 = this.i;
                    boolean bool7 = locale.i;
                    bool2 = false;
                    if (bool6 == bool7)
                    {
                      int i8 = this.j;
                      int i9 = locale.j;
                      bool2 = false;
                      if (i8 == i9)
                      {
                        int i10 = this.k;
                        int i11 = locale.k;
                        bool2 = false;
                        if (i10 == i11)
                        {
                          boolean bool8 = this.m;
                          boolean bool9 = locale.m;
                          bool2 = false;
                          if (bool8 == bool9)
                          {
                            boolean bool10 = this.n;
                            boolean bool11 = locale.n;
                            bool2 = false;
                            if (bool10 == bool11)
                            {
                              boolean bool12 = this.w;
                              boolean bool13 = locale.w;
                              bool2 = false;
                              if (bool12 == bool13)
                              {
                                boolean bool14 = this.x;
                                boolean bool15 = locale.x;
                                bool2 = false;
                                if (bool14 == bool15)
                                {
                                  boolean bool16 = this.c.equals(locale.c);
                                  bool2 = false;
                                  if (bool16)
                                  {
                                    com.a.a.g localg1 = this.d;
                                    com.a.a.g localg2 = locale.d;
                                    bool2 = false;
                                    if (localg1 == localg2)
                                    {
                                      boolean bool17 = this.q.equals(locale.q);
                                      bool2 = false;
                                      if (bool17)
                                      {
                                        boolean bool18 = this.r.equals(locale.r);
                                        bool2 = false;
                                        if (bool18)
                                        {
                                          boolean bool19 = this.s.equals(locale.s);
                                          bool2 = false;
                                          if (bool19)
                                          {
                                            boolean bool20 = com.a.a.i.i.a(this.l, locale.l);
                                            bool2 = false;
                                            if (bool20)
                                            {
                                              boolean bool21 = com.a.a.i.i.a(this.u, locale.u);
                                              bool2 = false;
                                              if (bool21) {
                                                bool2 = true;
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
    return bool2;
  }
  
  public e f()
  {
    return c(com.a.a.c.d.a.j.a, new n());
  }
  
  public e g()
  {
    return c(com.a.a.c.d.a.j.e, new com.a.a.c.d.a.h());
  }
  
  public e h()
  {
    this.t = true;
    return this;
  }
  
  public int hashCode()
  {
    int i1 = com.a.a.i.i.a(this.b);
    int i2 = com.a.a.i.i.b(this.f, i1);
    int i3 = com.a.a.i.i.a(this.e, i2);
    int i4 = com.a.a.i.i.b(this.h, i3);
    int i5 = com.a.a.i.i.a(this.g, i4);
    int i6 = com.a.a.i.i.b(this.p, i5);
    int i7 = com.a.a.i.i.a(this.o, i6);
    int i8 = com.a.a.i.i.a(this.i, i7);
    int i9 = com.a.a.i.i.b(this.j, i8);
    int i10 = com.a.a.i.i.b(this.k, i9);
    int i11 = com.a.a.i.i.a(this.m, i10);
    int i12 = com.a.a.i.i.a(this.n, i11);
    int i13 = com.a.a.i.i.a(this.w, i12);
    int i14 = com.a.a.i.i.a(this.x, i13);
    int i15 = com.a.a.i.i.a(this.c, i14);
    int i16 = com.a.a.i.i.a(this.d, i15);
    int i17 = com.a.a.i.i.a(this.q, i16);
    int i18 = com.a.a.i.i.a(this.r, i17);
    int i19 = com.a.a.i.i.a(this.s, i18);
    int i20 = com.a.a.i.i.a(this.l, i19);
    return com.a.a.i.i.a(this.u, i20);
  }
  
  public e i()
  {
    if ((this.t) && (!this.v)) {
      throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }
    this.v = true;
    return h();
  }
  
  public final Map<Class<?>, com.a.a.c.m<?>> j()
  {
    return this.r;
  }
  
  public final boolean k()
  {
    return this.m;
  }
  
  public final com.a.a.c.j l()
  {
    return this.q;
  }
  
  public final Class<?> m()
  {
    return this.s;
  }
  
  public final com.a.a.c.b.i n()
  {
    return this.c;
  }
  
  public final Drawable o()
  {
    return this.e;
  }
  
  public final int p()
  {
    return this.f;
  }
  
  public final int q()
  {
    return this.h;
  }
  
  public final Drawable r()
  {
    return this.g;
  }
  
  public final int s()
  {
    return this.p;
  }
  
  public final Drawable t()
  {
    return this.o;
  }
  
  public final Resources.Theme u()
  {
    return this.u;
  }
  
  public final boolean v()
  {
    return this.i;
  }
  
  public final com.a.a.c.h w()
  {
    return this.l;
  }
  
  public final boolean x()
  {
    return b(8);
  }
  
  public final com.a.a.g y()
  {
    return this.d;
  }
  
  public final int z()
  {
    return this.k;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.g.e
 * JD-Core Version:    0.7.0.1
 */