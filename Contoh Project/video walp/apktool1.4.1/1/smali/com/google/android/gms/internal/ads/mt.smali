.class public final Lcom/google/android/gms/internal/ads/mt;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/cm;
.end annotation


# direct methods
.method public static a(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/nc;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Throwable;",
            ")",
            "Lcom/google/android/gms/internal/ads/nc",
            "<TT;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ads/nc;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/nc;-><init>(Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/nd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Lcom/google/android/gms/internal/ads/nd",
            "<TT;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ads/nd;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/nd;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static a(Lcom/google/android/gms/internal/ads/ne;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/google/android/gms/internal/ads/ne;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/ads/ne",
            "<TV;>;J",
            "Ljava/util/concurrent/TimeUnit;",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            ")",
            "Lcom/google/android/gms/internal/ads/ne",
            "<TV;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ads/np;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/np;-><init>()V

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/ads/mt;->a(Lcom/google/android/gms/internal/ads/ne;Ljava/util/concurrent/Future;)V

    new-instance v1, Lcom/google/android/gms/internal/ads/mx;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/mx;-><init>(Lcom/google/android/gms/internal/ads/np;)V

    invoke-interface {p4, v1, p1, p2, p3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v1

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/ads/mt;->a(Lcom/google/android/gms/internal/ads/ne;Lcom/google/android/gms/internal/ads/np;)V

    new-instance v2, Lcom/google/android/gms/internal/ads/my;

    invoke-direct {v2, v1}, Lcom/google/android/gms/internal/ads/my;-><init>(Ljava/util/concurrent/Future;)V

    sget-object v1, Lcom/google/android/gms/internal/ads/nk;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/ads/np;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method public static a(Lcom/google/android/gms/internal/ads/ne;Lcom/google/android/gms/internal/ads/mo;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/ne;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A:",
            "Ljava/lang/Object;",
            "B:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/ads/ne",
            "<TA;>;",
            "Lcom/google/android/gms/internal/ads/mo",
            "<-TA;+TB;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lcom/google/android/gms/internal/ads/ne",
            "<TB;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ads/np;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/np;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/ads/mw;

    invoke-direct {v1, v0, p1, p0}, Lcom/google/android/gms/internal/ads/mw;-><init>(Lcom/google/android/gms/internal/ads/np;Lcom/google/android/gms/internal/ads/mo;Lcom/google/android/gms/internal/ads/ne;)V

    invoke-interface {p0, v1, p2}, Lcom/google/android/gms/internal/ads/ne;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/ads/mt;->a(Lcom/google/android/gms/internal/ads/ne;Ljava/util/concurrent/Future;)V

    return-object v0
.end method

.method public static a(Lcom/google/android/gms/internal/ads/ne;Lcom/google/android/gms/internal/ads/mp;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/ne;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A:",
            "Ljava/lang/Object;",
            "B:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/ads/ne",
            "<TA;>;",
            "Lcom/google/android/gms/internal/ads/mp",
            "<TA;TB;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lcom/google/android/gms/internal/ads/ne",
            "<TB;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ads/np;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/np;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/ads/mv;

    invoke-direct {v1, v0, p1, p0}, Lcom/google/android/gms/internal/ads/mv;-><init>(Lcom/google/android/gms/internal/ads/np;Lcom/google/android/gms/internal/ads/mp;Lcom/google/android/gms/internal/ads/ne;)V

    invoke-interface {p0, v1, p2}, Lcom/google/android/gms/internal/ads/ne;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/ads/mt;->a(Lcom/google/android/gms/internal/ads/ne;Ljava/util/concurrent/Future;)V

    return-object v0
.end method

.method public static a(Lcom/google/android/gms/internal/ads/ne;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/mo;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/ne;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            "X:",
            "Ljava/lang/Throwable;",
            ">(",
            "Lcom/google/android/gms/internal/ads/ne",
            "<+TV;>;",
            "Ljava/lang/Class",
            "<TX;>;",
            "Lcom/google/android/gms/internal/ads/mo",
            "<-TX;+TV;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lcom/google/android/gms/internal/ads/ne",
            "<TV;>;"
        }
    .end annotation

    new-instance v1, Lcom/google/android/gms/internal/ads/np;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/np;-><init>()V

    invoke-static {v1, p0}, Lcom/google/android/gms/internal/ads/mt;->a(Lcom/google/android/gms/internal/ads/ne;Ljava/util/concurrent/Future;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/mz;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/mz;-><init>(Lcom/google/android/gms/internal/ads/np;Lcom/google/android/gms/internal/ads/ne;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/mo;Ljava/util/concurrent/Executor;)V

    sget-object v2, Lcom/google/android/gms/internal/ads/nk;->b:Ljava/util/concurrent/Executor;

    invoke-interface {p0, v0, v2}, Lcom/google/android/gms/internal/ads/ne;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-object v1
.end method

.method public static a(Ljava/util/concurrent/Future;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Future",
            "<TT;>;TT;)TT;"
        }
    .end annotation

    const/4 v3, 0x1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/asa;->bz:Lcom/google/android/gms/internal/ads/arq;

    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->f()Lcom/google/android/gms/internal/ads/ary;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/ary;->a(Lcom/google/android/gms/internal/ads/arq;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p0, v0, v1, v2}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object p1

    :goto_0
    return-object p1

    :catch_0
    move-exception v0

    invoke-interface {p0, v3}, Ljava/util/concurrent/Future;->cancel(Z)Z

    const-string v1, "InterruptedException caught while resolving future."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/je;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzeo()Lcom/google/android/gms/internal/ads/io;

    move-result-object v1

    const-string v2, "Futures.resolveFuture"

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ads/io;->b(Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception v0

    invoke-interface {p0, v3}, Ljava/util/concurrent/Future;->cancel(Z)Z

    const-string v1, "Error waiting for future."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/je;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzeo()Lcom/google/android/gms/internal/ads/io;

    move-result-object v1

    const-string v2, "Futures.resolveFuture"

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ads/io;->b(Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public static a(Ljava/util/concurrent/Future;Ljava/lang/Object;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Future",
            "<TT;>;TT;J",
            "Ljava/util/concurrent/TimeUnit;",
            ")TT;"
        }
    .end annotation

    const/4 v1, 0x1

    :try_start_0
    invoke-interface {p0, p2, p3, p4}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object p1

    :goto_0
    return-object p1

    :catch_0
    move-exception v0

    invoke-interface {p0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    const-string v1, "InterruptedException caught while resolving future."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/je;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzeo()Lcom/google/android/gms/internal/ads/io;

    move-result-object v1

    const-string v2, "Futures.resolveFuture"

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ads/io;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception v0

    invoke-interface {p0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    const-string v1, "Error waiting for future."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/je;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzeo()Lcom/google/android/gms/internal/ads/io;

    move-result-object v1

    const-string v2, "Futures.resolveFuture"

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ads/io;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public static a(Lcom/google/android/gms/internal/ads/ne;Lcom/google/android/gms/internal/ads/mq;Ljava/util/concurrent/Executor;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/ads/ne",
            "<TV;>;",
            "Lcom/google/android/gms/internal/ads/mq",
            "<TV;>;",
            "Ljava/util/concurrent/Executor;",
            ")V"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ads/mu;

    invoke-direct {v0, p1, p0}, Lcom/google/android/gms/internal/ads/mu;-><init>(Lcom/google/android/gms/internal/ads/mq;Lcom/google/android/gms/internal/ads/ne;)V

    invoke-interface {p0, v0, p2}, Lcom/google/android/gms/internal/ads/ne;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method private static a(Lcom/google/android/gms/internal/ads/ne;Lcom/google/android/gms/internal/ads/np;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/ads/ne",
            "<+TV;>;",
            "Lcom/google/android/gms/internal/ads/np",
            "<TV;>;)V"
        }
    .end annotation

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/ads/mt;->a(Lcom/google/android/gms/internal/ads/ne;Ljava/util/concurrent/Future;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/na;

    invoke-direct {v0, p1, p0}, Lcom/google/android/gms/internal/ads/na;-><init>(Lcom/google/android/gms/internal/ads/np;Lcom/google/android/gms/internal/ads/ne;)V

    sget-object v1, Lcom/google/android/gms/internal/ads/nk;->b:Ljava/util/concurrent/Executor;

    invoke-interface {p0, v0, v1}, Lcom/google/android/gms/internal/ads/ne;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method private static a(Lcom/google/android/gms/internal/ads/ne;Ljava/util/concurrent/Future;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A:",
            "Ljava/lang/Object;",
            "B:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/ads/ne",
            "<TA;>;",
            "Ljava/util/concurrent/Future",
            "<TB;>;)V"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ads/nb;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/nb;-><init>(Lcom/google/android/gms/internal/ads/ne;Ljava/util/concurrent/Future;)V

    sget-object v1, Lcom/google/android/gms/internal/ads/nk;->b:Ljava/util/concurrent/Executor;

    invoke-interface {p0, v0, v1}, Lcom/google/android/gms/internal/ads/ne;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method static final synthetic a(Lcom/google/android/gms/internal/ads/np;Lcom/google/android/gms/internal/ads/mo;Lcom/google/android/gms/internal/ads/ne;)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/np;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    :try_start_0
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/ne;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/mo;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/ne;

    move-result-object v0

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/ads/mt;->a(Lcom/google/android/gms/internal/ads/ne;Lcom/google/android/gms/internal/ads/np;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/np;->cancel(Z)Z

    goto :goto_0

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/np;->a(Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_2
    move-exception v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/np;->a(Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_3
    move-exception v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/np;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method static final synthetic a(Lcom/google/android/gms/internal/ads/np;Lcom/google/android/gms/internal/ads/ne;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/mo;Ljava/util/concurrent/Executor;)V
    .locals 2

    :try_start_0
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/ne;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/np;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    :goto_1
    invoke-virtual {p2, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/mt;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/nd;

    move-result-object v0

    invoke-static {v0, p3, p4}, Lcom/google/android/gms/internal/ads/mt;->a(Lcom/google/android/gms/internal/ads/ne;Lcom/google/android/gms/internal/ads/mo;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/ne;

    move-result-object v0

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/ads/mt;->a(Lcom/google/android/gms/internal/ads/ne;Lcom/google/android/gms/internal/ads/np;)V

    goto :goto_0

    :catch_1
    move-exception v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    goto :goto_1

    :cond_0
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/np;->a(Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_2
    move-exception v0

    goto :goto_1
.end method
