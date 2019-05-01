.class final Lcom/google/android/gms/internal/ads/bcf;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
        "<",
        "Lcom/google/android/gms/internal/ads/bcb;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/bby;

.field private final synthetic b:Lcom/google/android/gms/internal/ads/bce;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/bce;Lcom/google/android/gms/internal/ads/bby;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/bcf;->b:Lcom/google/android/gms/internal/ads/bce;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/bcf;->a:Lcom/google/android/gms/internal/ads/bby;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()Lcom/google/android/gms/internal/ads/bcb;
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bcf;->b:Lcom/google/android/gms/internal/ads/bce;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/bce;->a(Lcom/google/android/gms/internal/ads/bce;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bcf;->b:Lcom/google/android/gms/internal/ads/bce;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/bce;->b(Lcom/google/android/gms/internal/ads/bce;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    monitor-exit v1

    :goto_0
    return-object v0

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bcf;->a:Lcom/google/android/gms/internal/ads/bby;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bcf;->b:Lcom/google/android/gms/internal/ads/bce;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/bce;->c(Lcom/google/android/gms/internal/ads/bce;)J

    move-result-wide v2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bcf;->b:Lcom/google/android/gms/internal/ads/bce;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/bce;->d(Lcom/google/android/gms/internal/ads/bce;)J

    move-result-wide v4

    invoke-virtual {v0, v2, v3, v4, v5}, Lcom/google/android/gms/internal/ads/bby;->a(JJ)Lcom/google/android/gms/internal/ads/bcb;

    move-result-object v0

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/bcf;->a()Lcom/google/android/gms/internal/ads/bcb;

    move-result-object v0

    return-object v0
.end method
