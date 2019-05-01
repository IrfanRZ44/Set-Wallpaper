.class final Lcom/google/android/gms/internal/ads/bag;
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
.field private final synthetic a:Lcom/google/android/gms/internal/ads/agw;

.field private final synthetic b:Lcom/google/android/gms/internal/ads/azo;

.field private final synthetic c:Lcom/google/android/gms/internal/ads/lp;

.field private final synthetic d:Lcom/google/android/gms/internal/ads/baa;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/baa;Lcom/google/android/gms/internal/ads/agw;Lcom/google/android/gms/internal/ads/azo;Lcom/google/android/gms/internal/ads/lp;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/bag;->d:Lcom/google/android/gms/internal/ads/baa;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/bag;->a:Lcom/google/android/gms/internal/ads/agw;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/bag;->b:Lcom/google/android/gms/internal/ads/azo;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/bag;->c:Lcom/google/android/gms/internal/ads/lp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic zza(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bag;->d:Lcom/google/android/gms/internal/ads/baa;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/baa;->a(Lcom/google/android/gms/internal/ads/baa;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    const-string v0, "JS Engine is requesting an update"

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/je;->d(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bag;->d:Lcom/google/android/gms/internal/ads/baa;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/baa;->d(Lcom/google/android/gms/internal/ads/baa;)I

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Starting reload."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/je;->d(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bag;->d:Lcom/google/android/gms/internal/ads/baa;

    const/4 v2, 0x2

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/baa;->a(Lcom/google/android/gms/internal/ads/baa;I)I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bag;->d:Lcom/google/android/gms/internal/ads/baa;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/bag;->a:Lcom/google/android/gms/internal/ads/agw;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/baa;->a(Lcom/google/android/gms/internal/ads/agw;)Lcom/google/android/gms/internal/ads/bar;

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/bag;->b:Lcom/google/android/gms/internal/ads/azo;

    const-string v3, "/requestReload"

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bag;->c:Lcom/google/android/gms/internal/ads/lp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lp;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/ads/internal/gmsg/zzv;

    invoke-interface {v2, v3, v0}, Lcom/google/android/gms/internal/ads/azo;->b(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
