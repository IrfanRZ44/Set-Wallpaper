.class final Lcom/google/android/gms/internal/ads/axj;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/c$b;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/np;

.field private final synthetic b:Lcom/google/android/gms/internal/ads/axe;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/axe;Lcom/google/android/gms/internal/ads/np;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/axj;->b:Lcom/google/android/gms/internal/ads/axe;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/axj;->a:Lcom/google/android/gms/internal/ads/np;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/axj;->b:Lcom/google/android/gms/internal/ads/axe;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/axe;->b(Lcom/google/android/gms/internal/ads/axe;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/axj;->a:Lcom/google/android/gms/internal/ads/np;

    new-instance v2, Ljava/lang/RuntimeException;

    const-string v3, "Connection failed."

    invoke-direct {v2, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/np;->a(Ljava/lang/Throwable;)V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
