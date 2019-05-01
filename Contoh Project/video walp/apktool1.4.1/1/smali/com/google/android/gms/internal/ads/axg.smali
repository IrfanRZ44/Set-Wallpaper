.class final Lcom/google/android/gms/internal/ads/axg;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/c$a;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/axe;

.field private final synthetic b:Lcom/google/android/gms/internal/ads/np;

.field private final synthetic c:Lcom/google/android/gms/internal/ads/zzsg;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/axe;Lcom/google/android/gms/internal/ads/np;Lcom/google/android/gms/internal/ads/zzsg;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/axg;->a:Lcom/google/android/gms/internal/ads/axe;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/axg;->b:Lcom/google/android/gms/internal/ads/np;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/axg;->c:Lcom/google/android/gms/internal/ads/zzsg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 0

    return-void
.end method

.method public final a(Landroid/os/Bundle;)V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/axg;->a:Lcom/google/android/gms/internal/ads/axe;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/axe;->b(Lcom/google/android/gms/internal/ads/axe;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/axg;->a:Lcom/google/android/gms/internal/ads/axe;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/axe;->c(Lcom/google/android/gms/internal/ads/axe;)Z

    move-result v0

    if-eqz v0, :cond_0

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/axg;->a:Lcom/google/android/gms/internal/ads/axe;

    const/4 v2, 0x1

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/axe;->a(Lcom/google/android/gms/internal/ads/axe;Z)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/axg;->a:Lcom/google/android/gms/internal/ads/axe;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/axe;->d(Lcom/google/android/gms/internal/ads/axe;)Lcom/google/android/gms/internal/ads/awz;

    move-result-object v0

    if-nez v0, :cond_1

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :try_start_1
    new-instance v2, Lcom/google/android/gms/internal/ads/axh;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/axg;->b:Lcom/google/android/gms/internal/ads/np;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/axg;->c:Lcom/google/android/gms/internal/ads/zzsg;

    invoke-direct {v2, p0, v0, v3, v4}, Lcom/google/android/gms/internal/ads/axh;-><init>(Lcom/google/android/gms/internal/ads/axg;Lcom/google/android/gms/internal/ads/awz;Lcom/google/android/gms/internal/ads/np;Lcom/google/android/gms/internal/ads/zzsg;)V

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/jl;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/internal/ads/ne;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/axg;->b:Lcom/google/android/gms/internal/ads/np;

    new-instance v3, Lcom/google/android/gms/internal/ads/axi;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/axg;->b:Lcom/google/android/gms/internal/ads/np;

    invoke-direct {v3, v4, v0}, Lcom/google/android/gms/internal/ads/axi;-><init>(Lcom/google/android/gms/internal/ads/np;Ljava/util/concurrent/Future;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/nk;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/internal/ads/np;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0
.end method
