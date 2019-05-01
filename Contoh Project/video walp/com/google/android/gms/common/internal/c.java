package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

public abstract class c<T extends IInterface>
{
  public static final String[] d = { "service_esmobile", "service_googleme" };
  private static final Feature[] e = new Feature[0];
  private ConnectionResult A = null;
  private boolean B = false;
  private volatile ConnectionInfo C = null;
  final Handler a;
  protected d b;
  protected AtomicInteger c = new AtomicInteger(0);
  private int f;
  private long g;
  private long h;
  private int i;
  private long j;
  private g k;
  private final Context l;
  private final Looper m;
  private final f n;
  private final d o;
  private final Object p = new Object();
  private final Object q = new Object();
  @GuardedBy("mServiceBrokerLock")
  private k r;
  @GuardedBy("mLock")
  private T s;
  private final ArrayList<c<T>.c<?>> t = new ArrayList();
  @GuardedBy("mLock")
  private c<T>.f u;
  @GuardedBy("mLock")
  private int v = 1;
  private final a w;
  private final b x;
  private final int y;
  private final String z;
  
  protected c(Context paramContext, Looper paramLooper, int paramInt, a parama, b paramb, String paramString)
  {
    this(paramContext, paramLooper, f.a(paramContext), d.a(), paramInt, (a)n.a(parama), (b)n.a(paramb), paramString);
  }
  
  protected c(Context paramContext, Looper paramLooper, f paramf, d paramd, int paramInt, a parama, b paramb, String paramString)
  {
    this.l = ((Context)n.a(paramContext, "Context must not be null"));
    this.m = ((Looper)n.a(paramLooper, "Looper must not be null"));
    this.n = ((f)n.a(paramf, "Supervisor must not be null"));
    this.o = ((d)n.a(paramd, "API availability must not be null"));
    this.a = new k(paramLooper);
    this.y = paramInt;
    this.w = parama;
    this.x = paramb;
    this.z = paramString;
  }
  
  private final void a(ConnectionInfo paramConnectionInfo)
  {
    this.C = paramConnectionInfo;
  }
  
  private final boolean a(int paramInt1, int paramInt2, T paramT)
  {
    synchronized (this.p)
    {
      if (this.v != paramInt1) {
        return false;
      }
      b(paramInt2, paramT);
      return true;
    }
  }
  
  private final void b(int paramInt, T paramT)
  {
    boolean bool1 = true;
    boolean bool2;
    boolean bool3;
    if (paramInt == 4)
    {
      bool2 = bool1;
      if (paramT == null) {
        break label505;
      }
      bool3 = bool1;
      label17:
      if (bool2 != bool3) {
        break label511;
      }
    }
    for (;;)
    {
      n.b(bool1);
      for (;;)
      {
        synchronized (this.p)
        {
          this.v = paramInt;
          this.s = paramT;
          a(paramInt, paramT);
          switch (paramInt)
          {
          default: 
            return;
          case 2: 
          case 3: 
            if ((this.u != null) && (this.k != null))
            {
              String str3 = this.k.a();
              String str4 = this.k.b();
              Log.e("GmsClient", 70 + String.valueOf(str3).length() + String.valueOf(str4).length() + "Calling connect() while still connected, missing disconnect() for " + str3 + " on " + str4);
              this.n.b(this.k.a(), this.k.b(), this.k.c(), this.u, e());
              this.c.incrementAndGet();
            }
            this.u = new f(this.c.get());
            if ((this.v == 3) && (f() != null))
            {
              localg = new g(k().getPackageName(), f(), true, c());
              this.k = localg;
              if (this.n.a(this.k.a(), this.k.b(), this.k.c(), this.u, e())) {
                continue;
              }
              String str1 = this.k.a();
              String str2 = this.k.b();
              Log.e("GmsClient", 34 + String.valueOf(str1).length() + String.valueOf(str2).length() + "unable to connect to service: " + str1 + " on " + str2);
              a(16, null, this.c.get());
            }
            break;
          }
        }
        g localg = new g(b(), a(), false, c());
        continue;
        a(paramT);
        continue;
        if (this.u != null)
        {
          this.n.b(a(), b(), c(), this.u, e());
          this.u = null;
        }
      }
      bool2 = false;
      break;
      label505:
      bool3 = false;
      break label17;
      label511:
      bool1 = false;
    }
  }
  
  private final void c(int paramInt)
  {
    int i1;
    if (x())
    {
      i1 = 5;
      this.B = true;
    }
    for (;;)
    {
      this.a.sendMessage(this.a.obtainMessage(i1, this.c.get(), 16));
      return;
      i1 = 4;
    }
  }
  
  private final boolean x()
  {
    for (;;)
    {
      synchronized (this.p)
      {
        if (this.v == 3)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  private final boolean y()
  {
    if (this.B) {}
    while ((TextUtils.isEmpty(d())) || (TextUtils.isEmpty(f()))) {
      return false;
    }
    try
    {
      Class.forName(d());
      return true;
    }
    catch (ClassNotFoundException localClassNotFoundException) {}
    return false;
  }
  
  protected abstract T a(IBinder paramIBinder);
  
  protected abstract String a();
  
  protected void a(int paramInt)
  {
    this.f = paramInt;
    this.g = System.currentTimeMillis();
  }
  
  protected void a(int paramInt1, Bundle paramBundle, int paramInt2)
  {
    this.a.sendMessage(this.a.obtainMessage(7, paramInt2, -1, new i(paramInt1, paramBundle)));
  }
  
  protected void a(int paramInt1, IBinder paramIBinder, Bundle paramBundle, int paramInt2)
  {
    this.a.sendMessage(this.a.obtainMessage(1, paramInt2, -1, new h(paramInt1, paramIBinder, paramBundle)));
  }
  
  void a(int paramInt, T paramT) {}
  
  protected void a(T paramT)
  {
    this.h = System.currentTimeMillis();
  }
  
  protected void a(ConnectionResult paramConnectionResult)
  {
    this.i = paramConnectionResult.b();
    this.j = System.currentTimeMillis();
  }
  
  public void a(d paramd)
  {
    this.b = ((d)n.a(paramd, "Connection progress callbacks cannot be null."));
    b(2, null);
  }
  
  protected void a(d paramd, int paramInt, PendingIntent paramPendingIntent)
  {
    this.b = ((d)n.a(paramd, "Connection progress callbacks cannot be null."));
    this.a.sendMessage(this.a.obtainMessage(3, this.c.get(), paramInt, paramPendingIntent));
  }
  
  /* Error */
  public void a(h paramh, Set<Scope> paramSet)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 367	com/google/android/gms/common/internal/c:p	()Landroid/os/Bundle;
    //   4: astore_3
    //   5: new 369	com/google/android/gms/common/internal/GetServiceRequest
    //   8: dup
    //   9: aload_0
    //   10: getfield 160	com/google/android/gms/common/internal/c:y	I
    //   13: invokespecial 370	com/google/android/gms/common/internal/GetServiceRequest:<init>	(I)V
    //   16: aload_0
    //   17: getfield 137	com/google/android/gms/common/internal/c:l	Landroid/content/Context;
    //   20: invokevirtual 258	android/content/Context:getPackageName	()Ljava/lang/String;
    //   23: invokevirtual 373	com/google/android/gms/common/internal/GetServiceRequest:a	(Ljava/lang/String;)Lcom/google/android/gms/common/internal/GetServiceRequest;
    //   26: aload_3
    //   27: invokevirtual 376	com/google/android/gms/common/internal/GetServiceRequest:a	(Landroid/os/Bundle;)Lcom/google/android/gms/common/internal/GetServiceRequest;
    //   30: astore 4
    //   32: aload_2
    //   33: ifnull +10 -> 43
    //   36: aload 4
    //   38: aload_2
    //   39: invokevirtual 379	com/google/android/gms/common/internal/GetServiceRequest:a	(Ljava/util/Collection;)Lcom/google/android/gms/common/internal/GetServiceRequest;
    //   42: pop
    //   43: aload_0
    //   44: invokevirtual 381	com/google/android/gms/common/internal/c:t	()Z
    //   47: ifeq +83 -> 130
    //   50: aload 4
    //   52: aload_0
    //   53: invokevirtual 384	com/google/android/gms/common/internal/c:o	()Landroid/accounts/Account;
    //   56: invokevirtual 387	com/google/android/gms/common/internal/GetServiceRequest:a	(Landroid/accounts/Account;)Lcom/google/android/gms/common/internal/GetServiceRequest;
    //   59: aload_1
    //   60: invokevirtual 390	com/google/android/gms/common/internal/GetServiceRequest:a	(Lcom/google/android/gms/common/internal/h;)Lcom/google/android/gms/common/internal/GetServiceRequest;
    //   63: pop
    //   64: aload 4
    //   66: aload_0
    //   67: invokevirtual 393	com/google/android/gms/common/internal/c:m	()[Lcom/google/android/gms/common/Feature;
    //   70: invokevirtual 396	com/google/android/gms/common/internal/GetServiceRequest:a	([Lcom/google/android/gms/common/Feature;)Lcom/google/android/gms/common/internal/GetServiceRequest;
    //   73: pop
    //   74: aload 4
    //   76: aload_0
    //   77: invokevirtual 398	com/google/android/gms/common/internal/c:n	()[Lcom/google/android/gms/common/Feature;
    //   80: invokevirtual 400	com/google/android/gms/common/internal/GetServiceRequest:b	([Lcom/google/android/gms/common/Feature;)Lcom/google/android/gms/common/internal/GetServiceRequest;
    //   83: pop
    //   84: aload_0
    //   85: getfield 108	com/google/android/gms/common/internal/c:q	Ljava/lang/Object;
    //   88: astore 13
    //   90: aload 13
    //   92: monitorenter
    //   93: aload_0
    //   94: getfield 170	com/google/android/gms/common/internal/c:r	Lcom/google/android/gms/common/internal/k;
    //   97: ifnull +53 -> 150
    //   100: aload_0
    //   101: getfield 170	com/google/android/gms/common/internal/c:r	Lcom/google/android/gms/common/internal/k;
    //   104: new 402	com/google/android/gms/common/internal/c$e
    //   107: dup
    //   108: aload_0
    //   109: aload_0
    //   110: getfield 128	com/google/android/gms/common/internal/c:c	Ljava/util/concurrent/atomic/AtomicInteger;
    //   113: invokevirtual 248	java/util/concurrent/atomic/AtomicInteger:get	()I
    //   116: invokespecial 403	com/google/android/gms/common/internal/c$e:<init>	(Lcom/google/android/gms/common/internal/c;I)V
    //   119: aload 4
    //   121: invokeinterface 408 3 0
    //   126: aload 13
    //   128: monitorexit
    //   129: return
    //   130: aload_0
    //   131: invokevirtual 410	com/google/android/gms/common/internal/c:u	()Z
    //   134: ifeq -70 -> 64
    //   137: aload 4
    //   139: aload_0
    //   140: invokevirtual 412	com/google/android/gms/common/internal/c:l	()Landroid/accounts/Account;
    //   143: invokevirtual 387	com/google/android/gms/common/internal/GetServiceRequest:a	(Landroid/accounts/Account;)Lcom/google/android/gms/common/internal/GetServiceRequest;
    //   146: pop
    //   147: goto -83 -> 64
    //   150: ldc 206
    //   152: ldc_w 414
    //   155: invokestatic 416	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   158: pop
    //   159: goto -33 -> 126
    //   162: astore 14
    //   164: aload 13
    //   166: monitorexit
    //   167: aload 14
    //   169: athrow
    //   170: astore 11
    //   172: ldc 206
    //   174: ldc_w 418
    //   177: aload 11
    //   179: invokestatic 421	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   182: pop
    //   183: aload_0
    //   184: iconst_1
    //   185: invokevirtual 423	com/google/android/gms/common/internal/c:b	(I)V
    //   188: return
    //   189: astore 10
    //   191: aload 10
    //   193: athrow
    //   194: astore 8
    //   196: ldc 206
    //   198: ldc_w 418
    //   201: aload 8
    //   203: invokestatic 421	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   206: pop
    //   207: aload_0
    //   208: bipush 8
    //   210: aconst_null
    //   211: aconst_null
    //   212: aload_0
    //   213: getfield 128	com/google/android/gms/common/internal/c:c	Ljava/util/concurrent/atomic/AtomicInteger;
    //   216: invokevirtual 248	java/util/concurrent/atomic/AtomicInteger:get	()I
    //   219: invokevirtual 425	com/google/android/gms/common/internal/c:a	(ILandroid/os/IBinder;Landroid/os/Bundle;I)V
    //   222: return
    //   223: astore 8
    //   225: goto -29 -> 196
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	228	0	this	c
    //   0	228	1	paramh	h
    //   0	228	2	paramSet	Set<Scope>
    //   4	23	3	localBundle	Bundle
    //   30	108	4	localGetServiceRequest	GetServiceRequest
    //   194	8	8	localRemoteException	RemoteException
    //   223	1	8	localRuntimeException	RuntimeException
    //   189	3	10	localSecurityException	java.lang.SecurityException
    //   170	8	11	localDeadObjectException	DeadObjectException
    //   162	6	14	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   93	126	162	finally
    //   126	129	162	finally
    //   150	159	162	finally
    //   164	167	162	finally
    //   84	93	170	android/os/DeadObjectException
    //   167	170	170	android/os/DeadObjectException
    //   84	93	189	java/lang/SecurityException
    //   167	170	189	java/lang/SecurityException
    //   84	93	194	android/os/RemoteException
    //   167	170	194	android/os/RemoteException
    //   84	93	223	java/lang/RuntimeException
    //   167	170	223	java/lang/RuntimeException
  }
  
  protected String b()
  {
    return "com.google.android.gms";
  }
  
  public void b(int paramInt)
  {
    this.a.sendMessage(this.a.obtainMessage(6, this.c.get(), paramInt));
  }
  
  protected int c()
  {
    return 129;
  }
  
  protected abstract String d();
  
  protected final String e()
  {
    if (this.z == null) {
      return this.l.getClass().getName();
    }
    return this.z;
  }
  
  protected String f()
  {
    return null;
  }
  
  public void g()
  {
    int i1 = this.o.a(this.l, w());
    if (i1 != 0)
    {
      b(1, null);
      a(new g(), i1, null);
      return;
    }
    a(new g());
  }
  
  public boolean h()
  {
    for (;;)
    {
      synchronized (this.p)
      {
        if (this.v == 4)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public boolean i()
  {
    for (;;)
    {
      synchronized (this.p)
      {
        if (this.v != 2)
        {
          if (this.v != 3) {
            break label40;
          }
          break label35;
          return bool;
        }
      }
      label35:
      boolean bool = true;
      continue;
      label40:
      bool = false;
    }
  }
  
  public void j()
  {
    this.c.incrementAndGet();
    synchronized (this.t)
    {
      int i1 = this.t.size();
      for (int i2 = 0; i2 < i1; i2++) {
        ((c)this.t.get(i2)).d();
      }
      this.t.clear();
    }
    synchronized (this.q)
    {
      this.r = null;
      b(1, null);
      return;
      localObject1 = finally;
      throw localObject1;
    }
  }
  
  public final Context k()
  {
    return this.l;
  }
  
  public Account l()
  {
    return null;
  }
  
  public Feature[] m()
  {
    return e;
  }
  
  public Feature[] n()
  {
    return e;
  }
  
  public final Account o()
  {
    if (l() != null) {
      return l();
    }
    return new Account("<<default account>>", "com.google");
  }
  
  protected Bundle p()
  {
    return new Bundle();
  }
  
  protected final void q()
  {
    if (!h()) {
      throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
    }
  }
  
  public Bundle r()
  {
    return null;
  }
  
  public final T s()
  {
    synchronized (this.p)
    {
      if (this.v == 5) {
        throw new DeadObjectException();
      }
    }
    q();
    if (this.s != null) {}
    for (boolean bool = true;; bool = false)
    {
      n.a(bool, "Client is connected but service is null");
      IInterface localIInterface = this.s;
      return localIInterface;
    }
  }
  
  public boolean t()
  {
    return false;
  }
  
  public boolean u()
  {
    return false;
  }
  
  protected Set<Scope> v()
  {
    return Collections.EMPTY_SET;
  }
  
  public int w()
  {
    return d.a;
  }
  
  public static abstract interface a
  {
    public abstract void a(int paramInt);
    
    public abstract void a(Bundle paramBundle);
  }
  
  public static abstract interface b
  {
    public abstract void a(ConnectionResult paramConnectionResult);
  }
  
  protected abstract class c<TListener>
  {
    private TListener a;
    private boolean b;
    
    public c()
    {
      Object localObject;
      this.a = localObject;
      this.b = false;
    }
    
    protected abstract void a();
    
    protected abstract void a(TListener paramTListener);
    
    public void b()
    {
      for (;;)
      {
        try
        {
          Object localObject2 = this.a;
          if (this.b)
          {
            String str = String.valueOf(this);
            Log.w("GmsClient", 47 + String.valueOf(str).length() + "Callback proxy " + str + " being reused. This is not safe.");
          }
          if (localObject2 != null) {}
          a();
        }
        finally
        {
          try
          {
            a(localObject2);
          }
          catch (RuntimeException localRuntimeException)
          {
            a();
            throw localRuntimeException;
          }
          try
          {
            this.b = true;
            c();
            return;
          }
          finally {}
          localObject1 = finally;
        }
      }
    }
    
    public void c()
    {
      d();
      synchronized (c.f(c.this))
      {
        c.f(c.this).remove(this);
        return;
      }
    }
    
    public void d()
    {
      try
      {
        this.a = null;
        return;
      }
      finally {}
    }
  }
  
  public static abstract interface d
  {
    public abstract void a(ConnectionResult paramConnectionResult);
  }
  
  public static final class e
    extends j.a
  {
    private c a;
    private final int b;
    
    public e(c paramc, int paramInt)
    {
      this.a = paramc;
      this.b = paramInt;
    }
    
    public final void a(int paramInt, Bundle paramBundle)
    {
      Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }
    
    public final void a(int paramInt, IBinder paramIBinder, Bundle paramBundle)
    {
      n.a(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
      this.a.a(paramInt, paramIBinder, paramBundle, this.b);
      this.a = null;
    }
    
    public final void a(int paramInt, IBinder paramIBinder, ConnectionInfo paramConnectionInfo)
    {
      n.a(this.a, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
      n.a(paramConnectionInfo);
      c.a(this.a, paramConnectionInfo);
      a(paramInt, paramIBinder, paramConnectionInfo.a());
    }
  }
  
  public final class f
    implements ServiceConnection
  {
    private final int a;
    
    public f(int paramInt)
    {
      this.a = paramInt;
    }
    
    public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
    {
      if (paramIBinder == null)
      {
        c.a(c.this, 16);
        return;
      }
      synchronized (c.a(c.this))
      {
        c.a(c.this, k.a.a(paramIBinder));
        c.this.a(0, null, this.a);
        return;
      }
    }
    
    public final void onServiceDisconnected(ComponentName paramComponentName)
    {
      synchronized (c.a(c.this))
      {
        c.a(c.this, null);
        c.this.a.sendMessage(c.this.a.obtainMessage(6, this.a, 1));
        return;
      }
    }
  }
  
  protected class g
    implements c.d
  {
    public g() {}
    
    public void a(ConnectionResult paramConnectionResult)
    {
      if (paramConnectionResult.a()) {
        c.this.a(null, c.this.v());
      }
      while (c.g(c.this) == null) {
        return;
      }
      c.g(c.this).a(paramConnectionResult);
    }
  }
  
  protected final class h
    extends c.j
  {
    public final IBinder a;
    
    public h(int paramInt, IBinder paramIBinder, Bundle paramBundle)
    {
      super(paramInt, paramBundle);
      this.a = paramIBinder;
    }
    
    protected final void a(ConnectionResult paramConnectionResult)
    {
      if (c.g(c.this) != null) {
        c.g(c.this).a(paramConnectionResult);
      }
      c.this.a(paramConnectionResult);
    }
    
    protected final boolean e()
    {
      IInterface localIInterface;
      do
      {
        try
        {
          String str1 = this.a.getInterfaceDescriptor();
          if (!c.this.d().equals(str1))
          {
            String str2 = c.this.d();
            Log.e("GmsClient", 34 + String.valueOf(str2).length() + String.valueOf(str1).length() + "service descriptor mismatch: " + str2 + " vs. " + str1);
            return false;
          }
        }
        catch (RemoteException localRemoteException)
        {
          Log.w("GmsClient", "service probably died");
          return false;
        }
        localIInterface = c.this.a(this.a);
      } while ((localIInterface == null) || ((!c.a(c.this, 2, 4, localIInterface)) && (!c.a(c.this, 3, 4, localIInterface))));
      c.a(c.this, null);
      Bundle localBundle = c.this.r();
      if (c.e(c.this) != null) {
        c.e(c.this).a(localBundle);
      }
      return true;
    }
  }
  
  protected final class i
    extends c.j
  {
    public i(int paramInt, Bundle paramBundle)
    {
      super(paramInt, paramBundle);
    }
    
    protected final void a(ConnectionResult paramConnectionResult)
    {
      c.this.b.a(paramConnectionResult);
      c.this.a(paramConnectionResult);
    }
    
    protected final boolean e()
    {
      c.this.b.a(ConnectionResult.a);
      return true;
    }
  }
  
  private abstract class j
    extends c<T>.c<Boolean>
  {
    public final int b;
    public final Bundle c;
    
    protected j(int paramInt, Bundle paramBundle)
    {
      super(Boolean.valueOf(true));
      this.b = paramInt;
      this.c = paramBundle;
    }
    
    protected void a() {}
    
    protected abstract void a(ConnectionResult paramConnectionResult);
    
    protected void a(Boolean paramBoolean)
    {
      if (paramBoolean == null) {
        c.a(c.this, 1, null);
      }
      do
      {
        return;
        switch (this.b)
        {
        default: 
          c.a(c.this, 1, null);
          Bundle localBundle = this.c;
          PendingIntent localPendingIntent = null;
          if (localBundle != null) {
            localPendingIntent = (PendingIntent)this.c.getParcelable("pendingIntent");
          }
          a(new ConnectionResult(this.b, localPendingIntent));
          return;
        }
      } while (e());
      c.a(c.this, 1, null);
      a(new ConnectionResult(8, null));
      return;
      c.a(c.this, 1, null);
      throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
    }
    
    protected abstract boolean e();
  }
  
  final class k
    extends Handler
  {
    public k(Looper paramLooper)
    {
      super();
    }
    
    private static void a(Message paramMessage)
    {
      c.c localc = (c.c)paramMessage.obj;
      localc.a();
      localc.c();
    }
    
    private static boolean b(Message paramMessage)
    {
      return (paramMessage.what == 2) || (paramMessage.what == 1) || (paramMessage.what == 7);
    }
    
    public final void handleMessage(Message paramMessage)
    {
      if (c.this.c.get() != paramMessage.arg1)
      {
        if (b(paramMessage)) {
          a(paramMessage);
        }
        return;
      }
      if (((paramMessage.what == 1) || (paramMessage.what == 7) || (paramMessage.what == 4) || (paramMessage.what == 5)) && (!c.this.i()))
      {
        a(paramMessage);
        return;
      }
      if (paramMessage.what == 4)
      {
        c.a(c.this, new ConnectionResult(paramMessage.arg2));
        if ((c.b(c.this)) && (!c.c(c.this)))
        {
          c.a(c.this, 3, null);
          return;
        }
        if (c.d(c.this) != null) {}
        for (ConnectionResult localConnectionResult3 = c.d(c.this);; localConnectionResult3 = new ConnectionResult(8))
        {
          c.this.b.a(localConnectionResult3);
          c.this.a(localConnectionResult3);
          return;
        }
      }
      if (paramMessage.what == 5)
      {
        if (c.d(c.this) != null) {}
        for (ConnectionResult localConnectionResult2 = c.d(c.this);; localConnectionResult2 = new ConnectionResult(8))
        {
          c.this.b.a(localConnectionResult2);
          c.this.a(localConnectionResult2);
          return;
        }
      }
      if (paramMessage.what == 3)
      {
        boolean bool = paramMessage.obj instanceof PendingIntent;
        PendingIntent localPendingIntent = null;
        if (bool) {
          localPendingIntent = (PendingIntent)paramMessage.obj;
        }
        ConnectionResult localConnectionResult1 = new ConnectionResult(paramMessage.arg2, localPendingIntent);
        c.this.b.a(localConnectionResult1);
        c.this.a(localConnectionResult1);
        return;
      }
      if (paramMessage.what == 6)
      {
        c.a(c.this, 5, null);
        if (c.e(c.this) != null) {
          c.e(c.this).a(paramMessage.arg2);
        }
        c.this.a(paramMessage.arg2);
        c.a(c.this, 5, 1, null);
        return;
      }
      if ((paramMessage.what == 2) && (!c.this.h()))
      {
        a(paramMessage);
        return;
      }
      if (b(paramMessage))
      {
        ((c.c)paramMessage.obj).b();
        return;
      }
      int i = paramMessage.what;
      Log.wtf("GmsClient", 45 + "Don't know how to handle message: " + i, new Exception());
    }
  }
}


/* Location:           C:\Users\IrfanRZ\Desktop\video walp\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.c
 * JD-Core Version:    0.7.0.1
 */