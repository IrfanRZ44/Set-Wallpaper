.class final Lcom/google/android/gms/internal/ads/bak;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/ns;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/bar;

.field private final synthetic b:Lcom/google/android/gms/internal/ads/baa;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/baa;Lcom/google/android/gms/internal/ads/bar;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/bak;->b:Lcom/google/android/gms/internal/ads/baa;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/bak;->a:Lcom/google/android/gms/internal/ads/bar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bak;->b:Lcom/google/android/gms/internal/ads/baa;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/baa;->a(Lcom/google/android/gms/internal/ads/baa;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bak;->b:Lcom/google/android/gms/internal/ads/baa;

    const/4 v2, 0x1

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/baa;->a(Lcom/google/android/gms/internal/ads/baa;I)I

    const-string v0, "Failed loading new engine. Marking new engine destroyable."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/je;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bak;->a:Lcom/google/android/gms/internal/ads/bar;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bar;->e()V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
