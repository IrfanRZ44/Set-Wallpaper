.class final Lcom/google/android/gms/internal/ads/iq;
.super Lcom/google/android/gms/internal/ads/iz;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/io;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/io;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/iq;->a:Lcom/google/android/gms/internal/ads/io;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/iz;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/asc;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/iq;->a:Lcom/google/android/gms/internal/ads/io;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/io;->a(Lcom/google/android/gms/internal/ads/io;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/iq;->a:Lcom/google/android/gms/internal/ads/io;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/io;->b(Lcom/google/android/gms/internal/ads/io;)Lcom/google/android/gms/internal/ads/zzang;

    move-result-object v2

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzang;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/asc;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/iq;->a:Lcom/google/android/gms/internal/ads/io;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/io;->c(Lcom/google/android/gms/internal/ads/io;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzet()Lcom/google/android/gms/internal/ads/asf;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/iq;->a:Lcom/google/android/gms/internal/ads/io;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/io;->d(Lcom/google/android/gms/internal/ads/io;)Lcom/google/android/gms/internal/ads/asd;

    move-result-object v2

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/asf;->a(Lcom/google/android/gms/internal/ads/asd;Lcom/google/android/gms/internal/ads/asc;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    :try_start_1
    monitor-exit v1

    return-void

    :catch_0
    move-exception v0

    const-string v2, "Cannot config CSI reporter."

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/je;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final b_()V
    .locals 0

    return-void
.end method
