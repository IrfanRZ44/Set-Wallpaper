package com.a.a;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.a.a.c.c.a.b;
import com.a.a.c.c.a.c;
import com.a.a.c.c.a.c.a;
import com.a.a.c.c.a.d.a;
import com.a.a.c.c.a.e.a;
import com.a.a.c.c.b.d;
import com.a.a.c.c.d.b;
import com.a.a.c.c.e.c;
import com.a.a.c.c.f.b;
import com.a.a.c.c.f.e;
import com.a.a.c.c.g;
import com.a.a.c.c.s.a;
import com.a.a.c.c.s.b;
import com.a.a.c.c.s.c;
import com.a.a.c.c.s.d;
import com.a.a.c.c.t;
import com.a.a.c.c.u.a;
import com.a.a.c.c.u.b;
import com.a.a.c.c.u.c;
import com.a.a.c.c.v.a;
import com.a.a.c.c.w.a;
import com.a.a.c.c.w.b;
import com.a.a.c.c.w.d;
import com.a.a.c.c.x.a;
import com.a.a.c.d.a.r;
import com.a.a.c.d.a.s;
import com.a.a.c.d.a.u;
import com.a.a.c.d.a.v;
import com.a.a.d.l;
import com.a.a.d.l.a;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class c
  implements ComponentCallbacks2
{
  private static volatile c a;
  private static volatile boolean b;
  private final com.a.a.c.b.j c;
  private final com.a.a.c.b.a.e d;
  private final com.a.a.c.b.b.h e;
  private final com.a.a.c.b.d.a f;
  private final e g;
  private final h h;
  private final com.a.a.c.b.a.b i;
  private final l j;
  private final com.a.a.d.d k;
  private final List<j> l = new ArrayList();
  private f m = f.b;
  
  c(Context paramContext, com.a.a.c.b.j paramj, com.a.a.c.b.b.h paramh, com.a.a.c.b.a.e parame, com.a.a.c.b.a.b paramb, l paraml, com.a.a.d.d paramd, int paramInt, com.a.a.g.e parame1, Map<Class<?>, k<?, ?>> paramMap)
  {
    this.c = paramj;
    this.d = parame;
    this.i = paramb;
    this.e = paramh;
    this.j = paraml;
    this.k = paramd;
    this.f = new com.a.a.c.b.d.a(paramh, parame, (com.a.a.c.b)parame1.l().a(com.a.a.c.d.a.k.a));
    Resources localResources = paramContext.getResources();
    this.h = new h();
    this.h.a(new com.a.a.c.d.a.i());
    com.a.a.c.d.a.k localk = new com.a.a.c.d.a.k(this.h.a(), localResources.getDisplayMetrics(), parame, paramb);
    com.a.a.c.d.e.a locala = new com.a.a.c.d.e.a(paramContext, this.h.a(), parame, paramb);
    com.a.a.c.k localk1 = v.b(parame);
    com.a.a.c.d.a.f localf = new com.a.a.c.d.a.f(localk);
    s locals = new s(localk, paramb);
    com.a.a.c.d.c.d locald = new com.a.a.c.d.c.d(paramContext);
    s.c localc = new s.c(localResources);
    s.d locald1 = new s.d(localResources);
    s.b localb = new s.b(localResources);
    s.a locala1 = new s.a(localResources);
    com.a.a.c.d.a.c localc1 = new com.a.a.c.d.a.c(paramb);
    com.a.a.c.d.f.a locala2 = new com.a.a.c.d.f.a();
    com.a.a.c.d.f.d locald2 = new com.a.a.c.d.f.d();
    ContentResolver localContentResolver = paramContext.getContentResolver();
    h localh1 = this.h.a(ByteBuffer.class, new com.a.a.c.c.c());
    t localt = new t(paramb);
    h localh2 = localh1.a(InputStream.class, localt).a("Bitmap", ByteBuffer.class, Bitmap.class, localf).a("Bitmap", InputStream.class, Bitmap.class, locals).a("Bitmap", ParcelFileDescriptor.class, Bitmap.class, localk1).a("Bitmap", AssetFileDescriptor.class, Bitmap.class, v.a(parame)).a(Bitmap.class, Bitmap.class, v.a.a()).a("Bitmap", Bitmap.class, Bitmap.class, new u()).a(Bitmap.class, localc1);
    com.a.a.c.d.a.a locala3 = new com.a.a.c.d.a.a(localResources, localf);
    h localh3 = localh2.a("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, locala3);
    com.a.a.c.d.a.a locala4 = new com.a.a.c.d.a.a(localResources, locals);
    h localh4 = localh3.a("BitmapDrawable", InputStream.class, BitmapDrawable.class, locala4);
    com.a.a.c.d.a.a locala5 = new com.a.a.c.d.a.a(localResources, localk1);
    h localh5 = localh4.a("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, locala5).a(BitmapDrawable.class, new com.a.a.c.d.a.b(parame, localc1));
    com.a.a.c.d.e.j localj = new com.a.a.c.d.e.j(this.h.a(), locala, paramb);
    localh5.a("Gif", InputStream.class, com.a.a.c.d.e.c.class, localj).a("Gif", ByteBuffer.class, com.a.a.c.d.e.c.class, locala).a(com.a.a.c.d.e.c.class, new com.a.a.c.d.e.d()).a(com.a.a.b.a.class, com.a.a.b.a.class, v.a.a()).a("Bitmap", com.a.a.b.a.class, Bitmap.class, new com.a.a.c.d.e.h(parame)).a(Uri.class, Drawable.class, locald).a(Uri.class, Bitmap.class, new r(locald, parame)).a(new com.a.a.c.d.b.a.a()).a(File.class, ByteBuffer.class, new d.b()).a(File.class, InputStream.class, new f.e()).a(File.class, File.class, new com.a.a.c.d.d.a()).a(File.class, ParcelFileDescriptor.class, new f.b()).a(File.class, File.class, v.a.a()).a(new com.a.a.c.a.k.a(paramb)).a(Integer.TYPE, InputStream.class, localc).a(Integer.TYPE, ParcelFileDescriptor.class, localb).a(Integer.class, InputStream.class, localc).a(Integer.class, ParcelFileDescriptor.class, localb).a(Integer.class, Uri.class, locald1).a(Integer.TYPE, AssetFileDescriptor.class, locala1).a(Integer.class, AssetFileDescriptor.class, locala1).a(Integer.TYPE, Uri.class, locald1).a(String.class, InputStream.class, new e.c()).a(String.class, InputStream.class, new u.c()).a(String.class, ParcelFileDescriptor.class, new u.b()).a(String.class, AssetFileDescriptor.class, new u.a()).a(Uri.class, InputStream.class, new com.a.a.c.c.a.b.a()).a(Uri.class, InputStream.class, new a.c(paramContext.getAssets())).a(Uri.class, ParcelFileDescriptor.class, new a.b(paramContext.getAssets())).a(Uri.class, InputStream.class, new c.a(paramContext)).a(Uri.class, InputStream.class, new d.a(paramContext)).a(Uri.class, InputStream.class, new w.d(localContentResolver)).a(Uri.class, ParcelFileDescriptor.class, new w.b(localContentResolver)).a(Uri.class, AssetFileDescriptor.class, new w.a(localContentResolver)).a(Uri.class, InputStream.class, new x.a()).a(URL.class, InputStream.class, new e.a()).a(Uri.class, File.class, new com.a.a.c.c.k.a(paramContext)).a(g.class, InputStream.class, new com.a.a.c.c.a.a.a()).a([B.class, ByteBuffer.class, new com.a.a.c.c.b.a()).a([B.class, InputStream.class, new b.d()).a(Uri.class, Uri.class, v.a.a()).a(Drawable.class, Drawable.class, v.a.a()).a(Drawable.class, Drawable.class, new com.a.a.c.d.c.e()).a(Bitmap.class, BitmapDrawable.class, new com.a.a.c.d.f.b(localResources)).a(Bitmap.class, [B.class, locala2).a(Drawable.class, [B.class, new com.a.a.c.d.f.c(parame, locala2, locald2)).a(com.a.a.c.d.e.c.class, [B.class, locald2);
    com.a.a.g.a.e locale = new com.a.a.g.a.e();
    this.g = new e(paramContext, paramb, this.h, locale, parame1, paramMap, paramj, paramInt);
  }
  
  public static c a(Context paramContext)
  {
    if (a == null) {}
    try
    {
      if (a == null) {
        c(paramContext);
      }
      return a;
    }
    finally {}
  }
  
  public static j a(Activity paramActivity)
  {
    return e(paramActivity).a(paramActivity);
  }
  
  private static void a(Context paramContext, d paramd)
  {
    Context localContext = paramContext.getApplicationContext();
    a locala = i();
    List localList1 = Collections.emptyList();
    if ((locala == null) || (locala.c())) {}
    for (List localList2 = new com.a.a.e.e(localContext).a();; localList2 = localList1)
    {
      if ((locala != null) && (!locala.a().isEmpty()))
      {
        Set localSet = locala.a();
        Iterator localIterator4 = localList2.iterator();
        while (localIterator4.hasNext())
        {
          com.a.a.e.c localc2 = (com.a.a.e.c)localIterator4.next();
          if (localSet.contains(localc2.getClass()))
          {
            if (Log.isLoggable("Glide", 3)) {
              Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + localc2);
            }
            localIterator4.remove();
          }
        }
      }
      if (Log.isLoggable("Glide", 3))
      {
        Iterator localIterator3 = localList2.iterator();
        while (localIterator3.hasNext())
        {
          com.a.a.e.c localc1 = (com.a.a.e.c)localIterator3.next();
          Log.d("Glide", "Discovered GlideModule from manifest: " + localc1.getClass());
        }
      }
      if (locala != null) {}
      for (l.a locala1 = locala.b();; locala1 = null)
      {
        paramd.a(locala1);
        Iterator localIterator1 = localList2.iterator();
        while (localIterator1.hasNext()) {
          ((com.a.a.e.c)localIterator1.next()).a(localContext, paramd);
        }
      }
      if (locala != null) {
        locala.a(localContext, paramd);
      }
      c localc = paramd.a(localContext);
      Iterator localIterator2 = localList2.iterator();
      while (localIterator2.hasNext()) {
        ((com.a.a.e.c)localIterator2.next()).a(localContext, localc, localc.h);
      }
      if (locala != null) {
        locala.a(localContext, localc, localc.h);
      }
      localContext.registerComponentCallbacks(localc);
      a = localc;
      return;
    }
  }
  
  private static void a(Exception paramException)
  {
    throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", paramException);
  }
  
  public static j b(Context paramContext)
  {
    return e(paramContext).a(paramContext);
  }
  
  private static void c(Context paramContext)
  {
    if (b) {
      throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }
    b = true;
    d(paramContext);
    b = false;
  }
  
  private static void d(Context paramContext)
  {
    a(paramContext, new d());
  }
  
  private static l e(Context paramContext)
  {
    com.a.a.i.h.a(paramContext, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
    return a(paramContext).g();
  }
  
  private static a i()
  {
    try
    {
      a locala = (a)Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
      return locala;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      if (Log.isLoggable("Glide", 5)) {
        Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
      }
      return null;
    }
    catch (InstantiationException localInstantiationException)
    {
      a(localInstantiationException);
      return null;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      a(localIllegalAccessException);
      return null;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      a(localNoSuchMethodException);
      return null;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      a(localInvocationTargetException);
    }
    return null;
  }
  
  public com.a.a.c.b.a.e a()
  {
    return this.d;
  }
  
  public void a(int paramInt)
  {
    com.a.a.i.i.a();
    this.e.a(paramInt);
    this.d.a(paramInt);
    this.i.a(paramInt);
  }
  
  void a(j paramj)
  {
    synchronized (this.l)
    {
      if (this.l.contains(paramj)) {
        throw new IllegalStateException("Cannot register already registered manager");
      }
    }
    this.l.add(paramj);
  }
  
  boolean a(com.a.a.g.a.h<?> paramh)
  {
    synchronized (this.l)
    {
      Iterator localIterator = this.l.iterator();
      while (localIterator.hasNext()) {
        if (((j)localIterator.next()).b(paramh)) {
          return true;
        }
      }
      return false;
    }
  }
  
  public com.a.a.c.b.a.b b()
  {
    return this.i;
  }
  
  void b(j paramj)
  {
    synchronized (this.l)
    {
      if (!this.l.contains(paramj)) {
        throw new IllegalStateException("Cannot unregister not yet registered manager");
      }
    }
    this.l.remove(paramj);
  }
  
  public Context c()
  {
    return this.g.getBaseContext();
  }
  
  com.a.a.d.d d()
  {
    return this.k;
  }
  
  e e()
  {
    return this.g;
  }
  
  public void f()
  {
    com.a.a.i.i.a();
    this.e.a();
    this.d.a();
    this.i.a();
  }
  
  public l g()
  {
    return this.j;
  }
  
  public h h()
  {
    return this.h;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration) {}
  
  public void onLowMemory()
  {
    f();
  }
  
  public void onTrimMemory(int paramInt)
  {
    a(paramInt);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.c
 * JD-Core Version:    0.7.0.1
 */