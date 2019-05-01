package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public final class akw
{
  private final int a;
  private final int b;
  private final int c;
  private final alj d;
  private final alt e;
  private final Object f = new Object();
  private ArrayList<String> g = new ArrayList();
  private ArrayList<String> h = new ArrayList();
  private ArrayList<alh> i = new ArrayList();
  private int j = 0;
  private int k = 0;
  private int l = 0;
  private int m;
  private String n = "";
  private String o = "";
  private String p = "";
  
  public akw(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = new alj(paramInt4);
    this.e = new alt(paramInt5, paramInt6, paramInt7);
  }
  
  private static String a(ArrayList<String> paramArrayList, int paramInt)
  {
    String str;
    if (paramArrayList.isEmpty()) {
      str = "";
    }
    do
    {
      return str;
      StringBuilder localStringBuilder = new StringBuilder();
      ArrayList localArrayList = (ArrayList)paramArrayList;
      int i1 = localArrayList.size();
      int i2 = 0;
      do
      {
        if (i2 >= i1) {
          break;
        }
        Object localObject = localArrayList.get(i2);
        i2++;
        localStringBuilder.append((String)localObject);
        localStringBuilder.append(' ');
      } while (localStringBuilder.length() <= 100);
      localStringBuilder.deleteCharAt(-1 + localStringBuilder.length());
      str = localStringBuilder.toString();
    } while (str.length() < 100);
    return str.substring(0, 100);
  }
  
  private final void c(String paramString, boolean paramBoolean, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    if ((paramString == null) || (paramString.length() < this.c)) {
      return;
    }
    synchronized (this.f)
    {
      this.g.add(paramString);
      this.j += paramString.length();
      if (paramBoolean)
      {
        this.h.add(paramString);
        this.i.add(new alh(paramFloat1, paramFloat2, paramFloat3, paramFloat4, -1 + this.h.size()));
      }
      return;
    }
  }
  
  public final void a(int paramInt)
  {
    this.k = paramInt;
  }
  
  public final void a(String paramString, boolean paramBoolean, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    c(paramString, paramBoolean, paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    synchronized (this.f)
    {
      if (this.l < 0) {
        je.b("ActivityContent: negative number of WebViews.");
      }
      h();
      return;
    }
  }
  
  public final boolean a()
  {
    for (;;)
    {
      synchronized (this.f)
      {
        if (this.l == 0)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public final String b()
  {
    return this.n;
  }
  
  public final void b(String paramString, boolean paramBoolean, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    c(paramString, paramBoolean, paramFloat1, paramFloat2, paramFloat3, paramFloat4);
  }
  
  public final String c()
  {
    return this.o;
  }
  
  public final String d()
  {
    return this.p;
  }
  
  public final void e()
  {
    synchronized (this.f)
    {
      this.m = (-100 + this.m);
      return;
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof akw)) {}
    akw localakw;
    do
    {
      return false;
      if (paramObject == this) {
        return true;
      }
      localakw = (akw)paramObject;
    } while ((localakw.n == null) || (!localakw.n.equals(this.n)));
    return true;
  }
  
  public final void f()
  {
    synchronized (this.f)
    {
      this.l = (-1 + this.l);
      return;
    }
  }
  
  public final void g()
  {
    synchronized (this.f)
    {
      this.l = (1 + this.l);
      return;
    }
  }
  
  public final void h()
  {
    synchronized (this.f)
    {
      int i1 = this.j;
      int i2 = this.k;
      int i3 = i1 * this.a + i2 * this.b;
      if (i3 > this.m)
      {
        this.m = i3;
        arq localarq1 = asa.W;
        if ((((Boolean)aos.f().a(localarq1)).booleanValue()) && (!zzbv.zzeo().l().b()))
        {
          this.n = this.d.a(this.g);
          this.o = this.d.a(this.h);
        }
        arq localarq2 = asa.Y;
        if ((((Boolean)aos.f().a(localarq2)).booleanValue()) && (!zzbv.zzeo().l().d())) {
          this.p = this.e.a(this.h, this.i);
        }
      }
      return;
    }
  }
  
  public final int hashCode()
  {
    return this.n.hashCode();
  }
  
  public final int i()
  {
    return this.m;
  }
  
  final int j()
  {
    return this.j;
  }
  
  public final String toString()
  {
    int i1 = this.k;
    int i2 = this.m;
    int i3 = this.j;
    String str1 = a(this.g, 100);
    String str2 = a(this.h, 100);
    String str3 = this.n;
    String str4 = this.o;
    String str5 = this.p;
    return 165 + String.valueOf(str1).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + "ActivityContent fetchId: " + i1 + " score:" + i2 + " total_length:" + i3 + "\n text: " + str1 + "\n viewableText" + str2 + "\n signture: " + str3 + "\n viewableSignture: " + str4 + "\n viewableSignatureForVertical: " + str5;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.akw
 * JD-Core Version:    0.7.0.1
 */