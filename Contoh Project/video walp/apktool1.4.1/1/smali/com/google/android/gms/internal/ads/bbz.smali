.class final Lcom/google/android/gms/internal/ads/bbz;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/bbx;

.field private final synthetic b:Lcom/google/android/gms/internal/ads/bby;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/bby;Lcom/google/android/gms/internal/ads/bbx;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/bbz;->b:Lcom/google/android/gms/internal/ads/bby;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/bbz;->a:Lcom/google/android/gms/internal/ads/bbx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bbz;->b:Lcom/google/android/gms/internal/ads/bby;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/bby;->a(Lcom/google/android/gms/internal/ads/bby;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bbz;->b:Lcom/google/android/gms/internal/ads/bby;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/bby;->b(Lcom/google/android/gms/internal/ads/bby;)I

    move-result v0

    const/4 v2, -0x2

    if-eq v0, v2, :cond_0

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bbz;->b:Lcom/google/android/gms/internal/ads/bby;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/bbz;->b:Lcom/google/android/gms/internal/ads/bby;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/bby;->c(Lcom/google/android/gms/internal/ads/bby;)Lcom/google/android/gms/internal/ads/bcn;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/bby;->a(Lcom/google/android/gms/internal/ads/bby;Lcom/google/android/gms/internal/ads/bcn;)Lcom/google/android/gms/internal/ads/bcn;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bbz;->b:Lcom/google/android/gms/internal/ads/bby;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/bby;->d(Lcom/google/android/gms/internal/ads/bby;)Lcom/google/android/gms/internal/ads/bcn;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bbz;->b:Lcom/google/android/gms/internal/ads/bby;

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/bby;->a(I)V

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
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bbz;->b:Lcom/google/android/gms/internal/ads/bby;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/bby;->e(Lcom/google/android/gms/internal/ads/bby;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bbz;->b:Lcom/google/android/gms/internal/ads/bby;

    const/4 v2, 0x1

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/bby;->a(Lcom/google/android/gms/internal/ads/bby;I)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bbz;->b:Lcom/google/android/gms/internal/ads/bby;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/bby;->f(Lcom/google/android/gms/internal/ads/bby;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x38

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Ignoring adapter "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " as delayed impression is not supported"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/je;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bbz;->b:Lcom/google/android/gms/internal/ads/bby;

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/bby;->a(I)V

    monitor-exit v1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bbz;->a:Lcom/google/android/gms/internal/ads/bbx;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/bbz;->b:Lcom/google/android/gms/internal/ads/bby;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/bbx;->a(Lcom/google/android/gms/internal/ads/bcc;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bbz;->b:Lcom/google/android/gms/internal/ads/bby;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/bbz;->a:Lcom/google/android/gms/internal/ads/bbx;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/bby;->a(Lcom/google/android/gms/internal/ads/bby;Lcom/google/android/gms/internal/ads/bbx;)V

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0
.end method
