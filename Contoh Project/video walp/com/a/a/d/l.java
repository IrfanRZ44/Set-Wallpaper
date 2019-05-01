package com.a.a.d;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.support.v4.f.a;
import android.util.Log;
import android.view.View;
import com.a.a.c;
import com.a.a.i.i;
import com.a.a.j;
import java.util.HashMap;
import java.util.Map;

public class l
  implements Handler.Callback
{
  private static final a i = new a()
  {
    public j a(c paramAnonymousc, h paramAnonymoush, m paramAnonymousm, Context paramAnonymousContext)
    {
      return new j(paramAnonymousc, paramAnonymoush, paramAnonymousm, paramAnonymousContext);
    }
  };
  final Map<android.app.FragmentManager, k> a = new HashMap();
  final Map<android.support.v4.app.FragmentManager, o> b = new HashMap();
  private volatile j c;
  private final Handler d;
  private final a e;
  private final a<View, android.support.v4.app.Fragment> f = new a();
  private final a<View, android.app.Fragment> g = new a();
  private final Bundle h = new Bundle();
  
  public l(a parama)
  {
    if (parama != null) {}
    for (;;)
    {
      this.e = parama;
      this.d = new Handler(Looper.getMainLooper(), this);
      return;
      parama = i;
    }
  }
  
  private j a(Context paramContext, android.app.FragmentManager paramFragmentManager, android.app.Fragment paramFragment)
  {
    k localk = a(paramFragmentManager, paramFragment);
    j localj = localk.b();
    if (localj == null)
    {
      c localc = c.a(paramContext);
      localj = this.e.a(localc, localk.a(), localk.c(), paramContext);
      localk.a(localj);
    }
    return localj;
  }
  
  private j a(Context paramContext, android.support.v4.app.FragmentManager paramFragmentManager, android.support.v4.app.Fragment paramFragment)
  {
    o localo = a(paramFragmentManager, paramFragment);
    j localj = localo.b();
    if (localj == null)
    {
      c localc = c.a(paramContext);
      localj = this.e.a(localc, localo.a(), localo.c(), paramContext);
      localo.a(localj);
    }
    return localj;
  }
  
  private j b(Context paramContext)
  {
    if (this.c == null) {}
    try
    {
      if (this.c == null)
      {
        c localc = c.a(paramContext.getApplicationContext());
        this.c = this.e.a(localc, new b(), new g(), paramContext.getApplicationContext());
      }
      return this.c;
    }
    finally {}
  }
  
  @TargetApi(17)
  private static void b(Activity paramActivity)
  {
    if ((Build.VERSION.SDK_INT >= 17) && (paramActivity.isDestroyed())) {
      throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }
  }
  
  k a(android.app.FragmentManager paramFragmentManager, android.app.Fragment paramFragment)
  {
    k localk = (k)paramFragmentManager.findFragmentByTag("com.bumptech.glide.manager");
    if (localk == null)
    {
      localk = (k)this.a.get(paramFragmentManager);
      if (localk == null)
      {
        localk = new k();
        localk.a(paramFragment);
        this.a.put(paramFragmentManager, localk);
        paramFragmentManager.beginTransaction().add(localk, "com.bumptech.glide.manager").commitAllowingStateLoss();
        this.d.obtainMessage(1, paramFragmentManager).sendToTarget();
      }
    }
    return localk;
  }
  
  o a(android.support.v4.app.FragmentManager paramFragmentManager, android.support.v4.app.Fragment paramFragment)
  {
    o localo = (o)paramFragmentManager.findFragmentByTag("com.bumptech.glide.manager");
    if (localo == null)
    {
      localo = (o)this.b.get(paramFragmentManager);
      if (localo == null)
      {
        localo = new o();
        localo.a(paramFragment);
        this.b.put(paramFragmentManager, localo);
        paramFragmentManager.beginTransaction().add(localo, "com.bumptech.glide.manager").commitAllowingStateLoss();
        this.d.obtainMessage(2, paramFragmentManager).sendToTarget();
      }
    }
    return localo;
  }
  
  public j a(Activity paramActivity)
  {
    if (i.c()) {
      return a(paramActivity.getApplicationContext());
    }
    b(paramActivity);
    return a(paramActivity, paramActivity.getFragmentManager(), null);
  }
  
  public j a(Context paramContext)
  {
    if (paramContext == null) {
      throw new IllegalArgumentException("You cannot start a load on a null Context");
    }
    if ((i.b()) && (!(paramContext instanceof Application)))
    {
      if ((paramContext instanceof FragmentActivity)) {
        return a((FragmentActivity)paramContext);
      }
      if ((paramContext instanceof Activity)) {
        return a((Activity)paramContext);
      }
      if ((paramContext instanceof ContextWrapper)) {
        return a(((ContextWrapper)paramContext).getBaseContext());
      }
    }
    return b(paramContext);
  }
  
  public j a(FragmentActivity paramFragmentActivity)
  {
    if (i.c()) {
      return a(paramFragmentActivity.getApplicationContext());
    }
    b(paramFragmentActivity);
    return a(paramFragmentActivity, paramFragmentActivity.getSupportFragmentManager(), null);
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    Object localObject1 = null;
    boolean bool = true;
    Object localObject2;
    switch (paramMessage.what)
    {
    default: 
      bool = false;
      localObject2 = null;
    }
    for (;;)
    {
      if ((bool) && (localObject2 == null) && (Log.isLoggable("RMRetriever", 5))) {
        Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + localObject1);
      }
      return bool;
      localObject1 = (android.app.FragmentManager)paramMessage.obj;
      localObject2 = this.a.remove(localObject1);
      continue;
      localObject1 = (android.support.v4.app.FragmentManager)paramMessage.obj;
      localObject2 = this.b.remove(localObject1);
    }
  }
  
  public static abstract interface a
  {
    public abstract j a(c paramc, h paramh, m paramm, Context paramContext);
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.a.a.d.l
 * JD-Core Version:    0.7.0.1
 */