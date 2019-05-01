package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.util.Arrays;

final class adb
{
  private int A;
  private int B;
  private Field C;
  private Object D;
  private Object E;
  private Object F;
  private final adc a;
  private final Object[] b;
  private Class<?> c;
  private final int d;
  private final int e;
  private final int f;
  private final int g;
  private final int h;
  private final int i;
  private final int j;
  private final int k;
  private final int l;
  private final int m;
  private final int[] n;
  private int o;
  private int p;
  private int q = 2147483647;
  private int r = -2147483648;
  private int s = 0;
  private int t = 0;
  private int u = 0;
  private int v = 0;
  private int w = 0;
  private int x;
  private int y;
  private int z;
  
  adb(Class<?> paramClass, String paramString, Object[] paramArrayOfObject)
  {
    this.c = paramClass;
    this.a = new adc(paramString);
    this.b = paramArrayOfObject;
    this.d = this.a.b();
    this.e = this.a.b();
    if (this.e == 0)
    {
      this.f = 0;
      this.g = 0;
      this.h = 0;
      this.i = 0;
      this.j = 0;
      this.l = 0;
      this.k = 0;
      this.m = 0;
      this.n = null;
      return;
    }
    this.f = this.a.b();
    this.g = this.a.b();
    this.h = this.a.b();
    this.i = this.a.b();
    this.l = this.a.b();
    this.k = this.a.b();
    this.j = this.a.b();
    this.m = this.a.b();
    int i1 = this.a.b();
    int[] arrayOfInt = null;
    if (i1 == 0) {}
    for (;;)
    {
      this.n = arrayOfInt;
      this.o = ((this.f << 1) + this.g);
      return;
      arrayOfInt = new int[i1];
    }
  }
  
  private static Field a(Class<?> paramClass, String paramString)
  {
    try
    {
      Field localField2 = paramClass.getDeclaredField(paramString);
      localField1 = localField2;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      Field localField1;
      Field[] arrayOfField = paramClass.getDeclaredFields();
      int i1 = arrayOfField.length;
      for (int i2 = 0;; i2++)
      {
        if (i2 >= i1) {
          break label58;
        }
        localField1 = arrayOfField[i2];
        if (paramString.equals(localField1.getName())) {
          break;
        }
      }
      label58:
      String str1 = paramClass.getName();
      String str2 = Arrays.toString(arrayOfField);
      throw new RuntimeException(40 + String.valueOf(paramString).length() + String.valueOf(str1).length() + String.valueOf(str2).length() + "Field " + paramString + " for " + str1 + " not found. Known fields are " + str2);
    }
    return localField1;
  }
  
  private final Object p()
  {
    Object[] arrayOfObject = this.b;
    int i1 = this.o;
    this.o = (i1 + 1);
    return arrayOfObject[i1];
  }
  
  private final boolean q()
  {
    return (0x1 & this.d) == 1;
  }
  
  final boolean a()
  {
    if (!this.a.a()) {
      return false;
    }
    this.x = this.a.b();
    this.y = this.a.b();
    this.z = (0xFF & this.y);
    if (this.x < this.q) {
      this.q = this.x;
    }
    if (this.x > this.r) {
      this.r = this.x;
    }
    label158:
    int i1;
    if (this.z == aaz.k.a())
    {
      this.s = (1 + this.s);
      this.w = (1 + this.w);
      if (!adg.a(this.q, this.x, this.w)) {
        break label318;
      }
      this.v = (1 + this.x);
      this.u = (this.v - this.q);
      if ((0x400 & this.y) == 0) {
        break label331;
      }
      i1 = 1;
      label171:
      if (i1 != 0)
      {
        int[] arrayOfInt = this.n;
        int i4 = this.p;
        this.p = (i4 + 1);
        arrayOfInt[i4] = this.x;
      }
      this.D = null;
      this.E = null;
      this.F = null;
      if (!d()) {
        break label370;
      }
      this.A = this.a.b();
      if ((this.z != 51 + aaz.a.a()) && (this.z != 51 + aaz.c.a())) {
        break label336;
      }
      this.D = p();
    }
    for (;;)
    {
      return true;
      if ((this.z < aaz.d.a()) || (this.z > aaz.j.a())) {
        break;
      }
      this.t = (1 + this.t);
      break;
      label318:
      this.u = (1 + this.u);
      break label158;
      label331:
      i1 = 0;
      break label171;
      label336:
      if ((this.z == 51 + aaz.b.a()) && (q()))
      {
        this.E = p();
        continue;
        label370:
        this.C = a(this.c, (String)p());
        if (h()) {
          this.B = this.a.b();
        }
        if ((this.z == aaz.a.a()) || (this.z == aaz.c.a()))
        {
          this.D = this.C.getType();
        }
        else if ((this.z == aaz.e.a()) || (this.z == aaz.j.a()))
        {
          this.D = p();
        }
        else if ((this.z == aaz.b.a()) || (this.z == aaz.f.a()) || (this.z == aaz.h.a()))
        {
          if (q()) {
            this.E = p();
          }
        }
        else if (this.z == aaz.k.a())
        {
          this.F = p();
          int i2 = 0x800 & this.y;
          int i3 = 0;
          if (i2 != 0) {
            i3 = 1;
          }
          if (i3 != 0) {
            this.E = p();
          }
        }
      }
    }
  }
  
  final int b()
  {
    return this.x;
  }
  
  final int c()
  {
    return this.z;
  }
  
  final boolean d()
  {
    return this.z > aaz.k.a();
  }
  
  final Field e()
  {
    int i1 = this.A << 1;
    Object localObject = this.b[i1];
    if ((localObject instanceof Field)) {
      return (Field)localObject;
    }
    Field localField = a(this.c, (String)localObject);
    this.b[i1] = localField;
    return localField;
  }
  
  final Field f()
  {
    int i1 = 1 + (this.A << 1);
    Object localObject = this.b[i1];
    if ((localObject instanceof Field)) {
      return (Field)localObject;
    }
    Field localField = a(this.c, (String)localObject);
    this.b[i1] = localField;
    return localField;
  }
  
  final Field g()
  {
    return this.C;
  }
  
  final boolean h()
  {
    return (q()) && (this.z <= aaz.c.a());
  }
  
  final Field i()
  {
    int i1 = (this.f << 1) + this.B / 32;
    Object localObject = this.b[i1];
    if ((localObject instanceof Field)) {
      return (Field)localObject;
    }
    Field localField = a(this.c, (String)localObject);
    this.b[i1] = localField;
    return localField;
  }
  
  final int j()
  {
    return this.B % 32;
  }
  
  final boolean k()
  {
    return (0x100 & this.y) != 0;
  }
  
  final boolean l()
  {
    return (0x200 & this.y) != 0;
  }
  
  final Object m()
  {
    return this.D;
  }
  
  final Object n()
  {
    return this.E;
  }
  
  final Object o()
  {
    return this.F;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.adb
 * JD-Core Version:    0.7.0.1
 */