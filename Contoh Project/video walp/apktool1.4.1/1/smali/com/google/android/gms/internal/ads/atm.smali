.class public final Lcom/google/android/gms/internal/ads/atm;
.super Lcom/google/android/gms/internal/ads/awl;

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

.field private g:D

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Lcom/google/android/gms/internal/ads/ata;

.field private k:Lcom/google/android/gms/internal/ads/aqg;

.field private l:Landroid/view/View;

.field private m:Lcom/google/android/gms/a/a;

.field private n:Ljava/lang/String;

.field private o:Landroid/os/Bundle;

.field private p:Ljava/lang/Object;

.field private q:Lcom/google/android/gms/internal/ads/atq;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/internal/ads/aun;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/ata;Lcom/google/android/gms/internal/ads/aqg;Landroid/view/View;Lcom/google/android/gms/a/a;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 3
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
            "D",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/ata;",
            "Lcom/google/android/gms/internal/ads/aqg;",
            "Landroid/view/View;",
            "Lcom/google/android/gms/a/a;",
            "Ljava/lang/String;",
            "Landroid/os/Bundle;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/awl;-><init>()V

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/atm;->p:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/atm;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/atm;->b:Ljava/util/List;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/atm;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/atm;->d:Lcom/google/android/gms/internal/ads/aun;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/atm;->e:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/atm;->f:Ljava/lang/String;

    iput-wide p7, p0, Lcom/google/android/gms/internal/ads/atm;->g:D

    iput-object p9, p0, Lcom/google/android/gms/internal/ads/atm;->h:Ljava/lang/String;

    iput-object p10, p0, Lcom/google/android/gms/internal/ads/atm;->i:Ljava/lang/String;

    iput-object p11, p0, Lcom/google/android/gms/internal/ads/atm;->j:Lcom/google/android/gms/internal/ads/ata;

    iput-object p12, p0, Lcom/google/android/gms/internal/ads/atm;->k:Lcom/google/android/gms/internal/ads/aqg;

    move-object/from16 v0, p13

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/atm;->l:Landroid/view/View;

    move-object/from16 v0, p14

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/atm;->m:Lcom/google/android/gms/a/a;

    move-object/from16 v0, p15

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/atm;->n:Ljava/lang/String;

    move-object/from16 v0, p16

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/atm;->o:Landroid/os/Bundle;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/atm;)Lcom/google/android/gms/internal/ads/atq;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atm;->q:Lcom/google/android/gms/internal/ads/atq;

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/atm;Lcom/google/android/gms/internal/ads/atq;)Lcom/google/android/gms/internal/ads/atq;
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/atm;->q:Lcom/google/android/gms/internal/ads/atq;

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atm;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final a(Landroid/os/Bundle;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/atm;->p:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atm;->q:Lcom/google/android/gms/internal/ads/atq;

    if-nez v0, :cond_0

    const-string v0, "#001 Attempt to perform click before app native ad initialized."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/je;->c(Ljava/lang/String;)V

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atm;->q:Lcom/google/android/gms/internal/ads/atq;

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

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/atm;->p:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/atm;->q:Lcom/google/android/gms/internal/ads/atq;

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final a(Lcom/google/android/gms/internal/ads/awh;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atm;->q:Lcom/google/android/gms/internal/ads/atq;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/atq;->a(Lcom/google/android/gms/internal/ads/awh;)V

    return-void
.end method

.method public final b()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atm;->b:Ljava/util/List;

    return-object v0
.end method

.method public final b(Landroid/os/Bundle;)Z
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/atm;->p:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atm;->q:Lcom/google/android/gms/internal/ads/atq;

    if-nez v0, :cond_0

    const-string v0, "#002 Attempt to record impression before native ad initialized."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/je;->c(Ljava/lang/String;)V

    const/4 v0, 0x0

    monitor-exit v1

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atm;->q:Lcom/google/android/gms/internal/ads/atq;

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

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atm;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final c(Landroid/os/Bundle;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/atm;->p:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atm;->q:Lcom/google/android/gms/internal/ads/atq;

    if-nez v0, :cond_0

    const-string v0, "#003 Attempt to report touch event before native ad initialized."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/je;->c(Ljava/lang/String;)V

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atm;->q:Lcom/google/android/gms/internal/ads/atq;

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

.method public final d()Lcom/google/android/gms/internal/ads/aun;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atm;->d:Lcom/google/android/gms/internal/ads/aun;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atm;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atm;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final g()D
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/atm;->g:D

    return-wide v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atm;->h:Ljava/lang/String;

    return-object v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atm;->i:Ljava/lang/String;

    return-object v0
.end method

.method public final j()Lcom/google/android/gms/internal/ads/aqg;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atm;->k:Lcom/google/android/gms/internal/ads/aqg;

    return-object v0
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    const-string v0, "6"

    return-object v0
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public final m()Lcom/google/android/gms/internal/ads/ata;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atm;->j:Lcom/google/android/gms/internal/ads/ata;

    return-object v0
.end method

.method public final n()Lcom/google/android/gms/a/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atm;->q:Lcom/google/android/gms/internal/ads/atq;

    invoke-static {v0}, Lcom/google/android/gms/a/b;->a(Ljava/lang/Object;)Lcom/google/android/gms/a/a;

    move-result-object v0

    return-object v0
.end method

.method public final o()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atm;->l:Landroid/view/View;

    return-object v0
.end method

.method public final p()Lcom/google/android/gms/a/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atm;->m:Lcom/google/android/gms/a/a;

    return-object v0
.end method

.method public final q()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atm;->n:Ljava/lang/String;

    return-object v0
.end method

.method public final r()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atm;->o:Landroid/os/Bundle;

    return-object v0
.end method

.method public final s()Lcom/google/android/gms/internal/ads/auj;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atm;->j:Lcom/google/android/gms/internal/ads/ata;

    return-object v0
.end method

.method public final t()V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/jn;->a:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/internal/ads/atn;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/atn;-><init>(Lcom/google/android/gms/internal/ads/atm;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final u()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atm;->q:Lcom/google/android/gms/internal/ads/atq;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/atq;->c()V

    return-void
.end method
