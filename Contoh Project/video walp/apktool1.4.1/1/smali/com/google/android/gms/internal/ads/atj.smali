.class public final Lcom/google/android/gms/internal/ads/atj;
.super Lcom/google/android/gms/internal/ads/avl;

# interfaces
.implements Lcom/google/android/gms/internal/ads/att;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/cm;
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/ata;

.field private final b:Ljava/lang/String;

.field private final c:Landroid/support/v4/f/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/f/m",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/ate;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Landroid/support/v4/f/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/f/m",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private e:Lcom/google/android/gms/internal/ads/aqg;

.field private f:Landroid/view/View;

.field private final g:Ljava/lang/Object;

.field private h:Lcom/google/android/gms/internal/ads/atq;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/support/v4/f/m;Landroid/support/v4/f/m;Lcom/google/android/gms/internal/ads/ata;Lcom/google/android/gms/internal/ads/aqg;Landroid/view/View;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/support/v4/f/m",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/ate;",
            ">;",
            "Landroid/support/v4/f/m",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/internal/ads/ata;",
            "Lcom/google/android/gms/internal/ads/aqg;",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/avl;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/atj;->g:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/atj;->b:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/atj;->c:Landroid/support/v4/f/m;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/atj;->d:Landroid/support/v4/f/m;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/atj;->a:Lcom/google/android/gms/internal/ads/ata;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/atj;->e:Lcom/google/android/gms/internal/ads/aqg;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/atj;->f:Landroid/view/View;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/atj;)Lcom/google/android/gms/internal/ads/atq;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atj;->h:Lcom/google/android/gms/internal/ads/atq;

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/atj;Lcom/google/android/gms/internal/ads/atq;)Lcom/google/android/gms/internal/ads/atq;
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/atj;->h:Lcom/google/android/gms/internal/ads/atq;

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atj;->d:Landroid/support/v4/f/m;

    invoke-virtual {v0, p1}, Landroid/support/v4/f/m;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final a()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atj;->c:Landroid/support/v4/f/m;

    invoke-virtual {v0}, Landroid/support/v4/f/m;->size()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/atj;->d:Landroid/support/v4/f/m;

    invoke-virtual {v1}, Landroid/support/v4/f/m;->size()I

    move-result v1

    add-int/2addr v0, v1

    new-array v4, v0, [Ljava/lang/String;

    move v1, v2

    move v3, v2

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atj;->c:Landroid/support/v4/f/m;

    invoke-virtual {v0}, Landroid/support/v4/f/m;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atj;->c:Landroid/support/v4/f/m;

    invoke-virtual {v0, v1}, Landroid/support/v4/f/m;->b(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    aput-object v0, v4, v3

    add-int/lit8 v0, v1, 0x1

    add-int/lit8 v1, v3, 0x1

    move v3, v1

    move v1, v0

    goto :goto_0

    :cond_0
    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atj;->d:Landroid/support/v4/f/m;

    invoke-virtual {v0}, Landroid/support/v4/f/m;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atj;->d:Landroid/support/v4/f/m;

    invoke-virtual {v0, v2}, Landroid/support/v4/f/m;->b(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    aput-object v0, v4, v3

    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/google/android/gms/internal/ads/atq;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/atj;->g:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/atj;->h:Lcom/google/android/gms/internal/ads/atq;

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final a(Lcom/google/android/gms/a/a;)Z
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/atj;->h:Lcom/google/android/gms/internal/ads/atq;

    if-nez v1, :cond_1

    const-string v1, "Attempt to call renderVideoInMediaView before ad initialized."

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/mk;->c(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/atj;->f:Landroid/view/View;

    if-eqz v1, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/ads/atk;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/atk;-><init>(Lcom/google/android/gms/internal/ads/atj;)V

    invoke-static {p1}, Lcom/google/android/gms/a/b;->a(Lcom/google/android/gms/a/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/atj;->h:Lcom/google/android/gms/internal/ads/atq;

    invoke-interface {v2, v0, v1}, Lcom/google/android/gms/internal/ads/atq;->a(Landroid/view/View;Lcom/google/android/gms/internal/ads/ato;)V

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final b()Lcom/google/android/gms/a/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atj;->h:Lcom/google/android/gms/internal/ads/atq;

    invoke-static {v0}, Lcom/google/android/gms/a/b;->a(Ljava/lang/Object;)Lcom/google/android/gms/a/a;

    move-result-object v0

    return-object v0
.end method

.method public final b(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/aun;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atj;->c:Landroid/support/v4/f/m;

    invoke-virtual {v0, p1}, Landroid/support/v4/f/m;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/aun;

    return-object v0
.end method

.method public final c()Lcom/google/android/gms/internal/ads/aqg;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atj;->e:Lcom/google/android/gms/internal/ads/aqg;

    return-object v0
.end method

.method public final c(Ljava/lang/String;)V
    .locals 7

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/atj;->g:Ljava/lang/Object;

    monitor-enter v6

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atj;->h:Lcom/google/android/gms/internal/ads/atq;

    if-nez v0, :cond_0

    const-string v0, "#001 Attempt to perform click before app native ad initialized."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/mk;->c(Ljava/lang/String;)V

    monitor-exit v6

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atj;->h:Lcom/google/android/gms/internal/ads/atq;

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/atq;->a(Landroid/view/View;Ljava/lang/String;Landroid/os/Bundle;Ljava/util/Map;Landroid/view/View;)V

    monitor-exit v6

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final d()V
    .locals 4

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/atj;->g:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atj;->h:Lcom/google/android/gms/internal/ads/atq;

    if-nez v0, :cond_0

    const-string v0, "#002 Attempt to record impression before native ad initialized."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/mk;->c(Ljava/lang/String;)V

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atj;->h:Lcom/google/android/gms/internal/ads/atq;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {v0, v2, v3}, Lcom/google/android/gms/internal/ads/atq;->a(Landroid/view/View;Ljava/util/Map;)V

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final e()Lcom/google/android/gms/a/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atj;->h:Lcom/google/android/gms/internal/ads/atq;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/atq;->m()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/a/b;->a(Ljava/lang/Object;)Lcom/google/android/gms/a/a;

    move-result-object v0

    return-object v0
.end method

.method public final f()V
    .locals 3

    const/4 v2, 0x0

    sget-object v0, Lcom/google/android/gms/internal/ads/jn;->a:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/internal/ads/atl;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/atl;-><init>(Lcom/google/android/gms/internal/ads/atj;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/atj;->e:Lcom/google/android/gms/internal/ads/aqg;

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/atj;->f:Landroid/view/View;

    return-void
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    const-string v0, "3"

    return-object v0
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atj;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final m()Lcom/google/android/gms/internal/ads/ata;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atj;->a:Lcom/google/android/gms/internal/ads/ata;

    return-object v0
.end method

.method public final o()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atj;->f:Landroid/view/View;

    return-object v0
.end method
