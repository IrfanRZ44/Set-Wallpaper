.class final Lcom/google/android/gms/internal/ads/ama;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/c$b;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/alw;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/alw;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ama;->a:Lcom/google/android/gms/internal/ads/alw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ama;->a:Lcom/google/android/gms/internal/ads/alw;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/alw;->c(Lcom/google/android/gms/internal/ads/alw;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ama;->a:Lcom/google/android/gms/internal/ads/alw;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/alw;->a(Lcom/google/android/gms/internal/ads/alw;Lcom/google/android/gms/internal/ads/amf;)Lcom/google/android/gms/internal/ads/amf;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ama;->a:Lcom/google/android/gms/internal/ads/alw;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/alw;->d(Lcom/google/android/gms/internal/ads/alw;)Lcom/google/android/gms/internal/ads/amc;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ama;->a:Lcom/google/android/gms/internal/ads/alw;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/alw;->a(Lcom/google/android/gms/internal/ads/alw;Lcom/google/android/gms/internal/ads/amc;)Lcom/google/android/gms/internal/ads/amc;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ama;->a:Lcom/google/android/gms/internal/ads/alw;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/alw;->c(Lcom/google/android/gms/internal/ads/alw;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
