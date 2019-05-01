.class public final Lcom/google/android/gms/internal/ads/arp;
.super Ljava/lang/Thread;


# instance fields
.field private final a:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue",
            "<",
            "Lcom/google/android/gms/internal/ads/avs",
            "<*>;>;"
        }
    .end annotation
.end field

.field private final b:Lcom/google/android/gms/internal/ads/aqr;

.field private final c:Lcom/google/android/gms/internal/ads/zn;

.field private final d:Lcom/google/android/gms/internal/ads/b;

.field private volatile e:Z


# direct methods
.method public constructor <init>(Ljava/util/concurrent/BlockingQueue;Lcom/google/android/gms/internal/ads/aqr;Lcom/google/android/gms/internal/ads/zn;Lcom/google/android/gms/internal/ads/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/BlockingQueue",
            "<",
            "Lcom/google/android/gms/internal/ads/avs",
            "<*>;>;",
            "Lcom/google/android/gms/internal/ads/aqr;",
            "Lcom/google/android/gms/internal/ads/zn;",
            "Lcom/google/android/gms/internal/ads/b;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/arp;->e:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/arp;->a:Ljava/util/concurrent/BlockingQueue;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/arp;->b:Lcom/google/android/gms/internal/ads/aqr;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/arp;->c:Lcom/google/android/gms/internal/ads/zn;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/arp;->d:Lcom/google/android/gms/internal/ads/b;

    return-void
.end method

.method private final b()V
    .locals 8

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/arp;->a:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/avs;

    :try_start_0
    const-string v1, "network-queue-take"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/avs;->b(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/avs;->g()Z

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/avs;->d()I

    move-result v1

    invoke-static {v1}, Landroid/net/TrafficStats;->setThreadStatsTag(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/arp;->b:Lcom/google/android/gms/internal/ads/aqr;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/aqr;->a(Lcom/google/android/gms/internal/ads/avs;)Lcom/google/android/gms/internal/ads/atr;

    move-result-object v1

    const-string v4, "network-http-complete"

    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/avs;->b(Ljava/lang/String;)V

    iget-boolean v4, v1, Lcom/google/android/gms/internal/ads/atr;->e:Z

    if-eqz v4, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/avs;->l()Z

    move-result v4

    if-eqz v4, :cond_0

    const-string v1, "not-modified"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/avs;->c(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/avs;->m()V

    :goto_0
    return-void

    :cond_0
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/avs;->a(Lcom/google/android/gms/internal/ads/atr;)Lcom/google/android/gms/internal/ads/bbw;

    move-result-object v1

    const-string v4, "network-parse-complete"

    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/avs;->b(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/avs;->h()Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, v1, Lcom/google/android/gms/internal/ads/bbw;->b:Lcom/google/android/gms/internal/ads/agn;

    if-eqz v4, :cond_1

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/arp;->c:Lcom/google/android/gms/internal/ads/zn;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/avs;->e()Ljava/lang/String;

    move-result-object v5

    iget-object v6, v1, Lcom/google/android/gms/internal/ads/bbw;->b:Lcom/google/android/gms/internal/ads/agn;

    invoke-interface {v4, v5, v6}, Lcom/google/android/gms/internal/ads/zn;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/agn;)V

    const-string v4, "network-cache-written"

    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/avs;->b(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/avs;->k()V

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/arp;->d:Lcom/google/android/gms/internal/ads/b;

    invoke-interface {v4, v0, v1}, Lcom/google/android/gms/internal/ads/b;->a(Lcom/google/android/gms/internal/ads/avs;Lcom/google/android/gms/internal/ads/bbw;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/avs;->a(Lcom/google/android/gms/internal/ads/bbw;)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/df; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    sub-long v2, v4, v2

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/df;->a(J)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/arp;->d:Lcom/google/android/gms/internal/ads/b;

    invoke-interface {v2, v0, v1}, Lcom/google/android/gms/internal/ads/b;->a(Lcom/google/android/gms/internal/ads/avs;Lcom/google/android/gms/internal/ads/df;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/avs;->m()V

    goto :goto_0

    :catch_1
    move-exception v1

    const-string v4, "Unhandled exception %s"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    invoke-virtual {v1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v5, v6

    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/ads/eb;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v4, Lcom/google/android/gms/internal/ads/df;

    invoke-direct {v4, v1}, Lcom/google/android/gms/internal/ads/df;-><init>(Ljava/lang/Throwable;)V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    sub-long v2, v6, v2

    invoke-virtual {v4, v2, v3}, Lcom/google/android/gms/internal/ads/df;->a(J)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/arp;->d:Lcom/google/android/gms/internal/ads/b;

    invoke-interface {v1, v0, v4}, Lcom/google/android/gms/internal/ads/b;->a(Lcom/google/android/gms/internal/ads/avs;Lcom/google/android/gms/internal/ads/df;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/avs;->m()V

    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/arp;->e:Z

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/arp;->interrupt()V

    return-void
.end method

.method public final run()V
    .locals 1

    const/16 v0, 0xa

    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    :cond_0
    :goto_0
    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/arp;->b()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/arp;->e:Z

    if-eqz v0, :cond_0

    return-void
.end method
