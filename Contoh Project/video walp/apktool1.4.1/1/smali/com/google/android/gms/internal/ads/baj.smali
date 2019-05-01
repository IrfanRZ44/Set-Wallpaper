.class final Lcom/google/android/gms/internal/ads/baj;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/nu;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/nu",
        "<",
        "Lcom/google/android/gms/internal/ads/azo;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/bar;

.field private final synthetic b:Lcom/google/android/gms/internal/ads/baa;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/baa;Lcom/google/android/gms/internal/ads/bar;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/baj;->b:Lcom/google/android/gms/internal/ads/baa;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/baj;->a:Lcom/google/android/gms/internal/ads/bar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/baj;->b:Lcom/google/android/gms/internal/ads/baa;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/baa;->a(Lcom/google/android/gms/internal/ads/baa;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/baj;->b:Lcom/google/android/gms/internal/ads/baa;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/baa;->a(Lcom/google/android/gms/internal/ads/baa;I)I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/baj;->b:Lcom/google/android/gms/internal/ads/baa;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/baa;->b(Lcom/google/android/gms/internal/ads/baa;)Lcom/google/android/gms/internal/ads/bar;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/baj;->a:Lcom/google/android/gms/internal/ads/bar;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/baj;->b:Lcom/google/android/gms/internal/ads/baa;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/baa;->b(Lcom/google/android/gms/internal/ads/baa;)Lcom/google/android/gms/internal/ads/bar;

    move-result-object v2

    if-eq v0, v2, :cond_0

    const-string v0, "New JS engine is loaded, marking previous one as destroyable."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/je;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/baj;->b:Lcom/google/android/gms/internal/ads/baa;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/baa;->b(Lcom/google/android/gms/internal/ads/baa;)Lcom/google/android/gms/internal/ads/bar;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bar;->e()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/baj;->b:Lcom/google/android/gms/internal/ads/baa;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/baj;->a:Lcom/google/android/gms/internal/ads/bar;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/baa;->a(Lcom/google/android/gms/internal/ads/baa;Lcom/google/android/gms/internal/ads/bar;)Lcom/google/android/gms/internal/ads/bar;

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
