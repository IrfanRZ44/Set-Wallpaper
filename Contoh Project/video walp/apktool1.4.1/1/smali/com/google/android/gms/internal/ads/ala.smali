.class final Lcom/google/android/gms/internal/ads/ala;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/akz;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/akz;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ala;->a:Lcom/google/android/gms/internal/ads/akz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ala;->a:Lcom/google/android/gms/internal/ads/akz;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/akz;->a(Lcom/google/android/gms/internal/ads/akz;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ala;->a:Lcom/google/android/gms/internal/ads/akz;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/akz;->b(Lcom/google/android/gms/internal/ads/akz;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ala;->a:Lcom/google/android/gms/internal/ads/akz;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/akz;->c(Lcom/google/android/gms/internal/ads/akz;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ala;->a:Lcom/google/android/gms/internal/ads/akz;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/akz;->a(Lcom/google/android/gms/internal/ads/akz;Z)Z

    const-string v0, "App went background"

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/je;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ala;->a:Lcom/google/android/gms/internal/ads/akz;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/akz;->d(Lcom/google/android/gms/internal/ads/akz;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/alb;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v3, 0x0

    :try_start_1
    invoke-interface {v0, v3}, Lcom/google/android/gms/internal/ads/alb;->a(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_2
    const-string v3, ""

    invoke-static {v3, v0}, Lcom/google/android/gms/internal/ads/mk;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :cond_0
    :try_start_3
    const-string v0, "App is still foreground"

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/je;->b(Ljava/lang/String;)V

    :cond_1
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    return-void
.end method
