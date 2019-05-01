.class final Lcom/google/android/gms/internal/ads/baf;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/ads/internal/gmsg/zzv;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/ads/internal/gmsg/zzv",
        "<",
        "Lcom/google/android/gms/internal/ads/bax;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/bar;

.field private final synthetic b:Lcom/google/android/gms/internal/ads/azo;

.field private final synthetic c:Lcom/google/android/gms/internal/ads/baa;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/baa;Lcom/google/android/gms/internal/ads/bar;Lcom/google/android/gms/internal/ads/azo;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/baf;->c:Lcom/google/android/gms/internal/ads/baa;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/baf;->a:Lcom/google/android/gms/internal/ads/bar;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/baf;->b:Lcom/google/android/gms/internal/ads/azo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic zza(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/baf;->c:Lcom/google/android/gms/internal/ads/baa;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/baa;->a(Lcom/google/android/gms/internal/ads/baa;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/baf;->a:Lcom/google/android/gms/internal/ads/bar;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/nv;->b()I

    move-result v0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/baf;->a:Lcom/google/android/gms/internal/ads/bar;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/nv;->b()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    :cond_0
    monitor-exit v1

    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/baf;->c:Lcom/google/android/gms/internal/ads/baa;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/baa;->a(Lcom/google/android/gms/internal/ads/baa;I)I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/baf;->c:Lcom/google/android/gms/internal/ads/baa;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/baa;->c(Lcom/google/android/gms/internal/ads/baa;)Lcom/google/android/gms/internal/ads/ks;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/baf;->b:Lcom/google/android/gms/internal/ads/azo;

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/ads/ks;->a(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/baf;->a:Lcom/google/android/gms/internal/ads/bar;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/baf;->b:Lcom/google/android/gms/internal/ads/azo;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/nv;->a(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/baf;->c:Lcom/google/android/gms/internal/ads/baa;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/baf;->a:Lcom/google/android/gms/internal/ads/bar;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/baa;->a(Lcom/google/android/gms/internal/ads/baa;Lcom/google/android/gms/internal/ads/bar;)Lcom/google/android/gms/internal/ads/bar;

    const-string v0, "Successfully loaded JS Engine."

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
