.class public final Lcom/google/android/gms/internal/ads/ath;
.super Lcom/google/android/gms/internal/ads/avh;

# interfaces
.implements Lcom/google/android/gms/internal/ads/atu;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/cm;
.end annotation

.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/ads/ate;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ljava/lang/String;

.field private d:Lcom/google/android/gms/internal/ads/aun;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Lcom/google/android/gms/internal/ads/ata;

.field private h:Landroid/os/Bundle;

.field private i:Lcom/google/android/gms/internal/ads/aqg;

.field private j:Landroid/view/View;

.field private k:Lcom/google/android/gms/a/a;

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/Object;

.field private n:Lcom/google/android/gms/internal/ads/atq;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/internal/ads/aun;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/ata;Landroid/os/Bundle;Lcom/google/android/gms/internal/ads/aqg;Landroid/view/View;Lcom/google/android/gms/a/a;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/ads/ate;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/aun;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/ata;",
            "Landroid/os/Bundle;",
            "Lcom/google/android/gms/internal/ads/aqg;",
            "Landroid/view/View;",
            "Lcom/google/android/gms/a/a;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/avh;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ath;->m:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ath;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/ath;->b:Ljava/util/List;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/ath;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/ath;->d:Lcom/google/android/gms/internal/ads/aun;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/ath;->e:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/ath;->f:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/ath;->g:Lcom/google/android/gms/internal/ads/ata;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/ath;->h:Landroid/os/Bundle;

    iput-object p9, p0, Lcom/google/android/gms/internal/ads/ath;->i:Lcom/google/android/gms/internal/ads/aqg;

    iput-object p10, p0, Lcom/google/android/gms/internal/ads/ath;->j:Landroid/view/View;

    iput-object p11, p0, Lcom/google/android/gms/internal/ads/ath;->k:Lcom/google/android/gms/a/a;

    iput-object p12, p0, Lcom/google/android/gms/internal/ads/ath;->l:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/ath;)Lcom/google/android/gms/internal/ads/atq;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ath;->n:Lcom/google/android/gms/internal/ads/atq;

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/ath;Lcom/google/android/gms/internal/ads/atq;)Lcom/google/android/gms/internal/ads/atq;
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ath;->n:Lcom/google/android/gms/internal/ads/atq;

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ath;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final a(Landroid/os/Bundle;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ath;->m:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ath;->n:Lcom/google/android/gms/internal/ads/atq;

    if-nez v0, :cond_0

    const-string v0, "#001 Attempt to perform click before app native ad initialized."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/je;->c(Ljava/lang/String;)V

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ath;->n:Lcom/google/android/gms/internal/ads/atq;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/atq;->b(Landroid/os/Bundle;)V

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final a(Lcom/google/android/gms/internal/ads/atq;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ath;->m:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ath;->n:Lcom/google/android/gms/internal/ads/atq;

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final b()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ath;->b:Ljava/util/List;

    return-object v0
.end method

.method public final b(Landroid/os/Bundle;)Z
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ath;->m:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ath;->n:Lcom/google/android/gms/internal/ads/atq;

    if-nez v0, :cond_0

    const-string v0, "#002 Attempt to record impression before native ad initialized."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/je;->c(Ljava/lang/String;)V

    const/4 v0, 0x0

    monitor-exit v1

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ath;->n:Lcom/google/android/gms/internal/ads/atq;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/atq;->a(Landroid/os/Bundle;)Z

    move-result v0

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final c()Lcom/google/android/gms/a/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ath;->k:Lcom/google/android/gms/a/a;

    return-object v0
.end method

.method public final c(Landroid/os/Bundle;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ath;->m:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ath;->n:Lcom/google/android/gms/internal/ads/atq;

    if-nez v0, :cond_0

    const-string v0, "#003 Attempt to report touch event before native ad initialized."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/je;->c(Ljava/lang/String;)V

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ath;->n:Lcom/google/android/gms/internal/ads/atq;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/atq;->c(Landroid/os/Bundle;)V

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ath;->l:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ath;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final f()Lcom/google/android/gms/internal/ads/aun;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ath;->d:Lcom/google/android/gms/internal/ads/aun;

    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ath;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ath;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final i()Lcom/google/android/gms/internal/ads/aqg;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ath;->i:Lcom/google/android/gms/internal/ads/aqg;

    return-object v0
.end method

.method public final j()Lcom/google/android/gms/a/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ath;->n:Lcom/google/android/gms/internal/ads/atq;

    invoke-static {v0}, Lcom/google/android/gms/a/b;->a(Ljava/lang/Object;)Lcom/google/android/gms/a/a;

    move-result-object v0

    return-object v0
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    const-string v0, "1"

    return-object v0
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public final m()Lcom/google/android/gms/internal/ads/ata;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ath;->g:Lcom/google/android/gms/internal/ads/ata;

    return-object v0
.end method

.method public final n()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ath;->h:Landroid/os/Bundle;

    return-object v0
.end method

.method public final o()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ath;->j:Landroid/view/View;

    return-object v0
.end method

.method public final p()Lcom/google/android/gms/internal/ads/auj;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ath;->g:Lcom/google/android/gms/internal/ads/ata;

    return-object v0
.end method

.method public final q()V
    .locals 3

    const/4 v2, 0x0

    sget-object v0, Lcom/google/android/gms/internal/ads/jn;->a:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/internal/ads/ati;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/ati;-><init>(Lcom/google/android/gms/internal/ads/ath;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/ath;->a:Ljava/lang/String;

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/ath;->b:Ljava/util/List;

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/ath;->c:Ljava/lang/String;

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/ath;->d:Lcom/google/android/gms/internal/ads/aun;

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/ath;->e:Ljava/lang/String;

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/ath;->f:Ljava/lang/String;

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/ath;->g:Lcom/google/android/gms/internal/ads/ata;

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/ath;->h:Landroid/os/Bundle;

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/ath;->m:Ljava/lang/Object;

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/ath;->i:Lcom/google/android/gms/internal/ads/aqg;

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/ath;->j:Landroid/view/View;

    return-void
.end method
