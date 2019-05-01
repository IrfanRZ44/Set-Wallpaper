package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public final class aoc
{
  private long a;
  private Bundle b;
  private int c;
  private List<String> d;
  private boolean e;
  private int f;
  private boolean g;
  private String h;
  private zzmq i;
  private Location j;
  private String k;
  private Bundle l;
  private Bundle m;
  private List<String> n;
  private String o;
  private String p;
  private boolean q;
  
  public aoc()
  {
    this.a = -1L;
    this.b = new Bundle();
    this.c = -1;
    this.d = new ArrayList();
    this.e = false;
    this.f = -1;
    this.g = false;
    this.h = null;
    this.i = null;
    this.j = null;
    this.k = null;
    this.l = new Bundle();
    this.m = new Bundle();
    this.n = new ArrayList();
    this.o = null;
    this.p = null;
    this.q = false;
  }
  
  public aoc(zzjj paramzzjj)
  {
    this.a = paramzzjj.b;
    this.b = paramzzjj.c;
    this.c = paramzzjj.d;
    this.d = paramzzjj.e;
    this.e = paramzzjj.f;
    this.f = paramzzjj.g;
    this.g = paramzzjj.h;
    this.h = paramzzjj.i;
    this.i = paramzzjj.j;
    this.j = paramzzjj.k;
    this.k = paramzzjj.l;
    this.l = paramzzjj.m;
    this.m = paramzzjj.n;
    this.n = paramzzjj.o;
    this.o = paramzzjj.p;
    this.p = paramzzjj.q;
  }
  
  public final aoc a(Location paramLocation)
  {
    this.j = null;
    return this;
  }
  
  public final zzjj a()
  {
    return new zzjj(7, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, false);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.aoc
 * JD-Core Version:    0.7.0.1
 */