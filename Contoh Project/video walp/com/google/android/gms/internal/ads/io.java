package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.a.b;
import com.google.android.gms.common.a.c;
import com.google.android.gms.common.util.k;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.a;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@cm
@ParametersAreNonnullByDefault
public final class io
  implements jk
{
  private final Object a = new Object();
  private aji b;
  private final iv c = new iv();
  private final jg d = new jg();
  private boolean e = false;
  private Context f;
  private zzang g;
  @Nullable
  private asd h = null;
  @Nullable
  private alc i = null;
  @Nullable
  private akx j = null;
  @Nullable
  private Boolean k = null;
  private String l;
  private final AtomicInteger m = new AtomicInteger(0);
  private final ir n = new ir(null);
  private final Object o = new Object();
  private ne<ArrayList<String>> p;
  
  @Nullable
  private final alc a(@Nullable Context paramContext, boolean paramBoolean1, boolean paramBoolean2)
  {
    arq localarq1 = asa.Q;
    if (!((Boolean)aos.f().a(localarq1)).booleanValue()) {
      return null;
    }
    if (!k.b()) {
      return null;
    }
    arq localarq2 = asa.Y;
    if (!((Boolean)aos.f().a(localarq2)).booleanValue())
    {
      arq localarq3 = asa.W;
      if (!((Boolean)aos.f().a(localarq3)).booleanValue()) {
        return null;
      }
    }
    if ((paramBoolean1) && (paramBoolean2)) {
      return null;
    }
    synchronized (this.a)
    {
      if ((Looper.getMainLooper() == null) || (paramContext == null)) {
        return null;
      }
      if (this.j == null) {
        this.j = new akx();
      }
      if (this.i == null) {
        this.i = new alc(this.j, cg.a(paramContext, this.g));
      }
      this.i.a();
      je.d("start fetching content...");
      alc localalc = this.i;
      return localalc;
    }
  }
  
  @TargetApi(16)
  private static ArrayList<String> b(Context paramContext)
  {
    ArrayList localArrayList = new ArrayList();
    PackageInfo localPackageInfo;
    try
    {
      localPackageInfo = c.b(paramContext).b(paramContext.getApplicationInfo().packageName, 4096);
      if ((localPackageInfo.requestedPermissions == null) || (localPackageInfo.requestedPermissionsFlags == null)) {
        return localArrayList;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      return localArrayList;
    }
    for (int i1 = 0; i1 < localPackageInfo.requestedPermissions.length; i1++) {
      if ((0x2 & localPackageInfo.requestedPermissionsFlags[i1]) != 0) {
        localArrayList.add(localPackageInfo.requestedPermissions[i1]);
      }
    }
    return localArrayList;
  }
  
  @Nullable
  public final alc a(@Nullable Context paramContext)
  {
    return a(paramContext, this.d.b(), this.d.d());
  }
  
  public final iv a()
  {
    return this.c;
  }
  
  @TargetApi(23)
  public final void a(Context paramContext, zzang paramzzang)
  {
    synchronized (this.a)
    {
      if (!this.e)
      {
        this.f = paramContext.getApplicationContext();
        this.g = paramzzang;
        zzbv.zzen().a(zzbv.zzep());
        this.d.a(this.f);
        this.d.a(this);
        cg.a(this.f, this.g);
        this.l = zzbv.zzek().b(paramContext, paramzzang.a);
        this.b = new aji(paramContext.getApplicationContext(), this.g);
        zzbv.zzet();
        arq localarq = asa.N;
        if (!((Boolean)aos.f().a(localarq)).booleanValue())
        {
          je.a("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
          localasd = null;
          this.h = localasd;
          mr.a((ne)new iq(this).c(), "AppState.registerCsiReporter");
          this.e = true;
          n();
        }
      }
      else
      {
        return;
      }
      asd localasd = new asd();
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    if ((paramBundle.containsKey("content_url_opted_out")) && (paramBundle.containsKey("content_vertical_opted_out"))) {
      a(this.f, paramBundle.getBoolean("content_url_opted_out"), paramBundle.getBoolean("content_vertical_opted_out"));
    }
  }
  
  public final void a(Boolean paramBoolean)
  {
    synchronized (this.a)
    {
      this.k = paramBoolean;
      return;
    }
  }
  
  public final void a(Throwable paramThrowable, String paramString)
  {
    cg.a(this.f, this.g).a(paramThrowable, paramString);
  }
  
  public final void a(boolean paramBoolean)
  {
    this.n.a(paramBoolean);
  }
  
  @Nullable
  public final asd b()
  {
    synchronized (this.a)
    {
      asd localasd = this.h;
      return localasd;
    }
  }
  
  public final void b(Throwable paramThrowable, String paramString)
  {
    ck localck = cg.a(this.f, this.g);
    arq localarq = asa.f;
    localck.a(paramThrowable, paramString, ((Float)aos.f().a(localarq)).floatValue());
  }
  
  public final Boolean c()
  {
    synchronized (this.a)
    {
      Boolean localBoolean = this.k;
      return localBoolean;
    }
  }
  
  public final boolean d()
  {
    return this.n.a();
  }
  
  public final boolean e()
  {
    return this.n.b();
  }
  
  public final void f()
  {
    this.n.c();
  }
  
  public final aji g()
  {
    return this.b;
  }
  
  @Nullable
  public final Resources h()
  {
    Resources localResources1;
    if (this.g.d) {
      localResources1 = this.f.getResources();
    }
    for (;;)
    {
      return localResources1;
      try
      {
        DynamiteModule localDynamiteModule = DynamiteModule.a(this.f, DynamiteModule.a, "com.google.android.gms.ads.dynamite");
        localResources1 = null;
        if (localDynamiteModule != null)
        {
          Resources localResources2 = localDynamiteModule.a().getResources();
          return localResources2;
        }
      }
      catch (DynamiteModule.a locala)
      {
        je.c("Cannot load resource from dynamite apk or local jar", locala);
      }
    }
    return null;
  }
  
  public final void i()
  {
    this.m.incrementAndGet();
  }
  
  public final void j()
  {
    this.m.decrementAndGet();
  }
  
  public final int k()
  {
    return this.m.get();
  }
  
  public final jg l()
  {
    synchronized (this.a)
    {
      jg localjg = this.d;
      return localjg;
    }
  }
  
  @Nullable
  public final Context m()
  {
    return this.f;
  }
  
  public final ne<ArrayList<String>> n()
  {
    if ((this.f != null) && (k.d()))
    {
      arq localarq = asa.bH;
      if (!((Boolean)aos.f().a(localarq)).booleanValue()) {}
    }
    else
    {
      return mt.a(new ArrayList());
    }
    synchronized (this.o)
    {
      if (this.p != null)
      {
        ne localne2 = this.p;
        return localne2;
      }
    }
    ne localne1 = jl.a(new ip(this));
    this.p = localne1;
    return localne1;
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ads.io
 * JD-Core Version:    0.7.0.1
 */