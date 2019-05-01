.class public final Lcom/google/android/gms/internal/ads/atp;
.super Lcom/google/android/gms/internal/ads/atv;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/cm;
.end annotation

.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# instance fields
.field private c:Lcom/google/android/gms/internal/ads/bcw;

.field private d:Lcom/google/android/gms/internal/ads/bda;

.field private e:Lcom/google/android/gms/internal/ads/bdd;

.field private final f:Lcom/google/android/gms/internal/ads/ats;

.field private g:Lcom/google/android/gms/internal/ads/atq;

.field private h:Z

.field private i:Ljava/lang/Object;


# direct methods
.method private constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/ats;Lcom/google/android/gms/internal/ads/agw;Lcom/google/android/gms/internal/ads/att;)V
    .locals 9

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, v3

    move-object v6, p4

    move-object v7, v3

    move-object v8, v3

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/ads/atv;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/ats;Lcom/google/android/gms/internal/ads/bq;Lcom/google/android/gms/internal/ads/agw;Lorg/json/JSONObject;Lcom/google/android/gms/internal/ads/att;Lcom/google/android/gms/internal/ads/zzang;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/atp;->h:Z

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->i:Ljava/lang/Object;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/atp;->f:Lcom/google/android/gms/internal/ads/ats;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/ats;Lcom/google/android/gms/internal/ads/agw;Lcom/google/android/gms/internal/ads/bcw;Lcom/google/android/gms/internal/ads/att;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p5}, Lcom/google/android/gms/internal/ads/atp;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/ats;Lcom/google/android/gms/internal/ads/agw;Lcom/google/android/gms/internal/ads/att;)V

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/atp;->c:Lcom/google/android/gms/internal/ads/bcw;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/ats;Lcom/google/android/gms/internal/ads/agw;Lcom/google/android/gms/internal/ads/bda;Lcom/google/android/gms/internal/ads/att;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p5}, Lcom/google/android/gms/internal/ads/atp;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/ats;Lcom/google/android/gms/internal/ads/agw;Lcom/google/android/gms/internal/ads/att;)V

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/atp;->d:Lcom/google/android/gms/internal/ads/bda;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/ats;Lcom/google/android/gms/internal/ads/agw;Lcom/google/android/gms/internal/ads/bdd;Lcom/google/android/gms/internal/ads/att;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p5}, Lcom/google/android/gms/internal/ads/atp;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/ats;Lcom/google/android/gms/internal/ads/agw;Lcom/google/android/gms/internal/ads/att;)V

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/atp;->e:Lcom/google/android/gms/internal/ads/bdd;

    return-void
.end method

.method private static b(Ljava/util/Map;)Ljava/util/HashMap;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/view/View;",
            ">;>;)",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    if-nez p0, :cond_0

    move-object v0, v2

    :goto_0
    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v0, v2

    goto :goto_0
.end method


# virtual methods
.method public final a(Landroid/view/View$OnClickListener;Z)Landroid/view/View;
    .locals 4

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/atp;->i:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->g:Lcom/google/android/gms/internal/ads/atq;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->g:Lcom/google/android/gms/internal/ads/atq;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/atq;->a(Landroid/view/View$OnClickListener;Z)Landroid/view/View;

    move-result-object v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    return-object v0

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->e:Lcom/google/android/gms/internal/ads/bdd;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->e:Lcom/google/android/gms/internal/ads/bdd;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/bdd;->l()Lcom/google/android/gms/a/a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    :goto_1
    if-eqz v0, :cond_4

    :try_start_2
    invoke-static {v0}, Lcom/google/android/gms/a/b;->a(Lcom/google/android/gms/a/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :cond_1
    :try_start_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->c:Lcom/google/android/gms/internal/ads/bcw;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->c:Lcom/google/android/gms/internal/ads/bcw;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/bcw;->n()Lcom/google/android/gms/a/a;

    move-result-object v0

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->d:Lcom/google/android/gms/internal/ads/bda;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->d:Lcom/google/android/gms/internal/ads/bda;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/bda;->k()Lcom/google/android/gms/a/a;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0

    move-result-object v0

    goto :goto_1

    :catch_0
    move-exception v0

    :try_start_4
    const-string v3, "Failed to call getAdChoicesContent"

    invoke-static {v3, v0}, Lcom/google/android/gms/internal/ads/je;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    move-object v0, v1

    goto :goto_1

    :cond_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-object v0, v1

    goto :goto_0
.end method

.method public final a(Landroid/view/View;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/atp;->i:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->g:Lcom/google/android/gms/internal/ads/atq;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->g:Lcom/google/android/gms/internal/ads/atq;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/atq;->a(Landroid/view/View;)V

    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final a(Landroid/view/View;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/view/View;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "recordImpression must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->b(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/atp;->i:Ljava/lang/Object;

    monitor-enter v1

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/atv;->a:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->g:Lcom/google/android/gms/internal/ads/atq;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->g:Lcom/google/android/gms/internal/ads/atq;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/atq;->a(Landroid/view/View;Ljava/util/Map;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->f:Lcom/google/android/gms/internal/ads/ats;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ats;->recordImpression()V

    :cond_0
    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->e:Lcom/google/android/gms/internal/ads/bdd;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->e:Lcom/google/android/gms/internal/ads/bdd;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/bdd;->p()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->e:Lcom/google/android/gms/internal/ads/bdd;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/bdd;->r()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->f:Lcom/google/android/gms/internal/ads/ats;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ats;->recordImpression()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_2
    const-string v2, "Failed to call recordImpression"

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/je;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :cond_2
    :try_start_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->c:Lcom/google/android/gms/internal/ads/bcw;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->c:Lcom/google/android/gms/internal/ads/bcw;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/bcw;->j()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->c:Lcom/google/android/gms/internal/ads/bcw;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/bcw;->i()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->f:Lcom/google/android/gms/internal/ads/ats;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ats;->recordImpression()V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->d:Lcom/google/android/gms/internal/ads/bda;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->d:Lcom/google/android/gms/internal/ads/bda;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/bda;->h()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->d:Lcom/google/android/gms/internal/ads/bda;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/bda;->g()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->f:Lcom/google/android/gms/internal/ads/ats;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ats;->recordImpression()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_0
.end method

.method public final a(Landroid/view/View;Ljava/util/Map;Landroid/os/Bundle;Landroid/view/View;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/view/View;",
            ">;>;",
            "Landroid/os/Bundle;",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "performClick must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->b(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/atp;->i:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->g:Lcom/google/android/gms/internal/ads/atq;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->g:Lcom/google/android/gms/internal/ads/atq;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/atq;->a(Landroid/view/View;Ljava/util/Map;Landroid/os/Bundle;Landroid/view/View;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->f:Lcom/google/android/gms/internal/ads/ats;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ats;->onAdClicked()V

    :cond_0
    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->e:Lcom/google/android/gms/internal/ads/bdd;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->e:Lcom/google/android/gms/internal/ads/bdd;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/bdd;->q()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->e:Lcom/google/android/gms/internal/ads/bdd;

    invoke-static {p1}, Lcom/google/android/gms/a/b;->a(Ljava/lang/Object;)Lcom/google/android/gms/a/a;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/ads/bdd;->a(Lcom/google/android/gms/a/a;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->f:Lcom/google/android/gms/internal/ads/ats;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ats;->onAdClicked()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_2
    const-string v2, "Failed to call performClick"

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/je;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :cond_2
    :try_start_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->c:Lcom/google/android/gms/internal/ads/bcw;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->c:Lcom/google/android/gms/internal/ads/bcw;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/bcw;->k()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->c:Lcom/google/android/gms/internal/ads/bcw;

    invoke-static {p1}, Lcom/google/android/gms/a/b;->a(Ljava/lang/Object;)Lcom/google/android/gms/a/a;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/ads/bcw;->a(Lcom/google/android/gms/a/a;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->f:Lcom/google/android/gms/internal/ads/ats;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ats;->onAdClicked()V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->d:Lcom/google/android/gms/internal/ads/bda;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->d:Lcom/google/android/gms/internal/ads/bda;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/bda;->i()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->d:Lcom/google/android/gms/internal/ads/bda;

    invoke-static {p1}, Lcom/google/android/gms/a/b;->a(Ljava/lang/Object;)Lcom/google/android/gms/a/a;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/ads/bda;->a(Lcom/google/android/gms/a/a;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->f:Lcom/google/android/gms/internal/ads/ats;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ats;->onAdClicked()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_0
.end method

.method public final a(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Landroid/view/View$OnTouchListener;Landroid/view/View$OnClickListener;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/view/View;",
            ">;>;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/view/View;",
            ">;>;",
            "Landroid/view/View$OnTouchListener;",
            "Landroid/view/View$OnClickListener;",
            ")V"
        }
    .end annotation

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/atp;->i:Ljava/lang/Object;

    monitor-enter v1

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/atp;->h:Z

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/atp;->b(Ljava/util/Map;)Ljava/util/HashMap;

    move-result-object v0

    invoke-static {p3}, Lcom/google/android/gms/internal/ads/atp;->b(Ljava/util/Map;)Ljava/util/HashMap;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    :try_start_1
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/atp;->e:Lcom/google/android/gms/internal/ads/bdd;

    if-eqz v3, :cond_1

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/atp;->e:Lcom/google/android/gms/internal/ads/bdd;

    invoke-static {p1}, Lcom/google/android/gms/a/b;->a(Ljava/lang/Object;)Lcom/google/android/gms/a/a;

    move-result-object v4

    invoke-static {v0}, Lcom/google/android/gms/a/b;->a(Ljava/lang/Object;)Lcom/google/android/gms/a/a;

    move-result-object v0

    invoke-static {v2}, Lcom/google/android/gms/a/b;->a(Ljava/lang/Object;)Lcom/google/android/gms/a/a;

    move-result-object v2

    invoke-interface {v3, v4, v0, v2}, Lcom/google/android/gms/internal/ads/bdd;->a(Lcom/google/android/gms/a/a;Lcom/google/android/gms/a/a;Lcom/google/android/gms/a/a;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    :cond_0
    :goto_0
    const/4 v0, 0x0

    :try_start_2
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/atp;->h:Z

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-void

    :cond_1
    :try_start_3
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/atp;->c:Lcom/google/android/gms/internal/ads/bcw;

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/atp;->c:Lcom/google/android/gms/internal/ads/bcw;

    invoke-static {p1}, Lcom/google/android/gms/a/b;->a(Ljava/lang/Object;)Lcom/google/android/gms/a/a;

    move-result-object v4

    invoke-static {v0}, Lcom/google/android/gms/a/b;->a(Ljava/lang/Object;)Lcom/google/android/gms/a/a;

    move-result-object v0

    invoke-static {v2}, Lcom/google/android/gms/a/b;->a(Ljava/lang/Object;)Lcom/google/android/gms/a/a;

    move-result-object v2

    invoke-interface {v3, v4, v0, v2}, Lcom/google/android/gms/internal/ads/bcw;->a(Lcom/google/android/gms/a/a;Lcom/google/android/gms/a/a;Lcom/google/android/gms/a/a;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->c:Lcom/google/android/gms/internal/ads/bcw;

    invoke-static {p1}, Lcom/google/android/gms/a/b;->a(Ljava/lang/Object;)Lcom/google/android/gms/a/a;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/ads/bcw;->b(Lcom/google/android/gms/a/a;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_4
    const-string v2, "Failed to call prepareAd"

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/je;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v0

    :cond_2
    :try_start_5
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/atp;->d:Lcom/google/android/gms/internal/ads/bda;

    if-eqz v3, :cond_0

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/atp;->d:Lcom/google/android/gms/internal/ads/bda;

    invoke-static {p1}, Lcom/google/android/gms/a/b;->a(Ljava/lang/Object;)Lcom/google/android/gms/a/a;

    move-result-object v4

    invoke-static {v0}, Lcom/google/android/gms/a/b;->a(Ljava/lang/Object;)Lcom/google/android/gms/a/a;

    move-result-object v0

    invoke-static {v2}, Lcom/google/android/gms/a/b;->a(Ljava/lang/Object;)Lcom/google/android/gms/a/a;

    move-result-object v2

    invoke-interface {v3, v4, v0, v2}, Lcom/google/android/gms/internal/ads/bda;->a(Lcom/google/android/gms/a/a;Lcom/google/android/gms/a/a;Lcom/google/android/gms/a/a;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->d:Lcom/google/android/gms/internal/ads/bda;

    invoke-static {p1}, Lcom/google/android/gms/a/b;->a(Ljava/lang/Object;)Lcom/google/android/gms/a/a;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/ads/bda;->b(Lcom/google/android/gms/a/a;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0
    .catch Landroid/os/RemoteException; {:try_start_5 .. :try_end_5} :catch_0

    goto :goto_0
.end method

.method public final a(Lcom/google/android/gms/internal/ads/atq;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/atp;->i:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/atp;->g:Lcom/google/android/gms/internal/ads/atq;

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
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/atp;->i:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->g:Lcom/google/android/gms/internal/ads/atq;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->g:Lcom/google/android/gms/internal/ads/atq;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/atq;->a(Lcom/google/android/gms/internal/ads/awh;)V

    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final a()Z
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/atp;->i:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->g:Lcom/google/android/gms/internal/ads/atq;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->g:Lcom/google/android/gms/internal/ads/atq;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/atq;->a()Z

    move-result v0

    monitor-exit v1

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->f:Lcom/google/android/gms/internal/ads/ats;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ats;->zzcu()Z

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

.method public final b(Landroid/view/View;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/view/View;",
            ">;>;)V"
        }
    .end annotation

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/atp;->i:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->e:Lcom/google/android/gms/internal/ads/bdd;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->e:Lcom/google/android/gms/internal/ads/bdd;

    invoke-static {p1}, Lcom/google/android/gms/a/b;->a(Ljava/lang/Object;)Lcom/google/android/gms/a/a;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/ads/bdd;->b(Lcom/google/android/gms/a/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    :cond_1
    :try_start_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->c:Lcom/google/android/gms/internal/ads/bcw;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->c:Lcom/google/android/gms/internal/ads/bcw;

    invoke-static {p1}, Lcom/google/android/gms/a/b;->a(Ljava/lang/Object;)Lcom/google/android/gms/a/a;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/ads/bcw;->c(Lcom/google/android/gms/a/a;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_3
    const-string v2, "Failed to call untrackView"

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/je;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    :cond_2
    :try_start_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->d:Lcom/google/android/gms/internal/ads/bda;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->d:Lcom/google/android/gms/internal/ads/bda;

    invoke-static {p1}, Lcom/google/android/gms/a/b;->a(Ljava/lang/Object;)Lcom/google/android/gms/a/a;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/ads/bda;->c(Lcom/google/android/gms/a/a;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_0
.end method

.method public final b()Z
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/atp;->i:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->g:Lcom/google/android/gms/internal/ads/atq;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->g:Lcom/google/android/gms/internal/ads/atq;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/atq;->b()Z

    move-result v0

    monitor-exit v1

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->f:Lcom/google/android/gms/internal/ads/ats;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ats;->zzcv()Z

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

.method public final c()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/atp;->i:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->g:Lcom/google/android/gms/internal/ads/atq;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->g:Lcom/google/android/gms/internal/ads/atq;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/atq;->c()V

    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final d()V
    .locals 2

    const-string v0, "recordDownloadedImpression must be called on main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->b(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/atp;->i:Ljava/lang/Object;

    monitor-enter v1

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/atp;->b:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->g:Lcom/google/android/gms/internal/ads/atq;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->g:Lcom/google/android/gms/internal/ads/atq;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/atq;->d()V

    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final e()Z
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/atp;->i:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/atp;->h:Z

    monitor-exit v1

    return v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final f()Lcom/google/android/gms/internal/ads/atq;
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/atp;->i:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->g:Lcom/google/android/gms/internal/ads/atq;

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final g()Lcom/google/android/gms/internal/ads/qe;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final h()V
    .locals 0

    return-void
.end method

.method public final i()V
    .locals 0

    return-void
.end method

.method public final j()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->g:Lcom/google/android/gms/internal/ads/atq;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->g:Lcom/google/android/gms/internal/ads/atq;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/atq;->j()V

    :cond_0
    return-void
.end method

.method public final k()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->g:Lcom/google/android/gms/internal/ads/atq;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atp;->g:Lcom/google/android/gms/internal/ads/atq;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/atq;->k()V

    :cond_0
    return-void
.end method
