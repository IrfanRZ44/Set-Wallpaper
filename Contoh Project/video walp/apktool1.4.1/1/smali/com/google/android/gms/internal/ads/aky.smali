.class public final Lcom/google/android/gms/internal/ads/aky;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/cm;
.end annotation

.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:Lcom/google/android/gms/internal/ads/akz;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mActivityTrackerLock"
    .end annotation
.end field

.field private c:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mActivityTrackerLock"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/aky;->a:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/aky;->b:Lcom/google/android/gms/internal/ads/akz;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/aky;->c:Z

    return-void
.end method


# virtual methods
.method public final a()Landroid/app/Activity;
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aky;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/common/util/k;->b()Z

    move-result v2

    if-nez v2, :cond_0

    monitor-exit v1

    :goto_0
    return-object v0

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/aky;->b:Lcom/google/android/gms/internal/ads/akz;

    if-eqz v2, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aky;->b:Lcom/google/android/gms/internal/ads/akz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/akz;->a()Landroid/app/Activity;

    move-result-object v0

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
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0
.end method

.method public final a(Landroid/content/Context;)V
    .locals 4

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/aky;->a:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/aky;->c:Z

    if-nez v0, :cond_5

    invoke-static {}, Lcom/google/android/gms/common/util/k;->b()Z

    move-result v0

    if-nez v0, :cond_0

    monitor-exit v2

    :goto_0
    return-void

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/asa;->aG:Lcom/google/android/gms/internal/ads/arq;

    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->f()Lcom/google/android/gms/internal/ads/ary;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/ary;->a(Lcom/google/android/gms/internal/ads/arq;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    const/4 v1, 0x0

    :try_start_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_2

    move-object v0, p1

    :cond_2
    instance-of v3, v0, Landroid/app/Application;

    if-eqz v3, :cond_6

    check-cast v0, Landroid/app/Application;

    :goto_1
    if-nez v0, :cond_3

    const-string v0, "Can not cast Context to Application"

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/je;->e(Ljava/lang/String;)V

    monitor-exit v2

    goto :goto_0

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aky;->b:Lcom/google/android/gms/internal/ads/akz;

    if-nez v1, :cond_4

    new-instance v1, Lcom/google/android/gms/internal/ads/akz;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/akz;-><init>()V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/aky;->b:Lcom/google/android/gms/internal/ads/akz;

    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aky;->b:Lcom/google/android/gms/internal/ads/akz;

    invoke-virtual {v1, v0, p1}, Lcom/google/android/gms/internal/ads/akz;->a(Landroid/app/Application;Landroid/content/Context;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/aky;->c:Z

    :cond_5
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :cond_6
    move-object v0, v1

    goto :goto_1
.end method

.method public final a(Lcom/google/android/gms/internal/ads/alb;)V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aky;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/common/util/k;->b()Z

    move-result v0

    if-nez v0, :cond_0

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/asa;->aG:Lcom/google/android/gms/internal/ads/arq;

    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->f()Lcom/google/android/gms/internal/ads/ary;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/ary;->a(Lcom/google/android/gms/internal/ads/arq;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

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
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aky;->b:Lcom/google/android/gms/internal/ads/akz;

    if-nez v0, :cond_2

    new-instance v0, Lcom/google/android/gms/internal/ads/akz;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/akz;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/aky;->b:Lcom/google/android/gms/internal/ads/akz;

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aky;->b:Lcom/google/android/gms/internal/ads/akz;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/akz;->a(Lcom/google/android/gms/internal/ads/alb;)V

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0
.end method

.method public final b()Landroid/content/Context;
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aky;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/common/util/k;->b()Z

    move-result v2

    if-nez v2, :cond_0

    monitor-exit v1

    :goto_0
    return-object v0

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/aky;->b:Lcom/google/android/gms/internal/ads/akz;

    if-eqz v2, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aky;->b:Lcom/google/android/gms/internal/ads/akz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/akz;->b()Landroid/content/Context;

    move-result-object v0

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
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0
.end method
