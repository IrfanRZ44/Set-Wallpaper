.class final Lcom/google/android/gms/internal/ads/bah;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/bar;

.field private final synthetic b:Lcom/google/android/gms/internal/ads/azo;

.field private final synthetic c:Lcom/google/android/gms/internal/ads/baa;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/baa;Lcom/google/android/gms/internal/ads/bar;Lcom/google/android/gms/internal/ads/azo;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/bah;->c:Lcom/google/android/gms/internal/ads/baa;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/bah;->a:Lcom/google/android/gms/internal/ads/bar;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/bah;->b:Lcom/google/android/gms/internal/ads/azo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bah;->c:Lcom/google/android/gms/internal/ads/baa;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/baa;->a(Lcom/google/android/gms/internal/ads/baa;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bah;->a:Lcom/google/android/gms/internal/ads/bar;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/nv;->b()I

    move-result v0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bah;->a:Lcom/google/android/gms/internal/ads/bar;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/nv;->b()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    :cond_0
    monitor-exit v1

    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bah;->a:Lcom/google/android/gms/internal/ads/bar;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/nv;->a()V

    sget-object v0, Lcom/google/android/gms/internal/ads/nk;->a:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/bah;->b:Lcom/google/android/gms/internal/ads/azo;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/bai;->a(Lcom/google/android/gms/internal/ads/azo;)Ljava/lang/Runnable;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    const-string v0, "Could not receive loaded message in a timely manner. Rejecting."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/je;->a(Ljava/lang/String;)V

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
