.class public final Lcom/google/android/gms/internal/ads/baa;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/cm;
.end annotation

.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Landroid/content/Context;

.field private final c:Ljava/lang/String;

.field private final d:Lcom/google/android/gms/internal/ads/zzang;

.field private e:Lcom/google/android/gms/internal/ads/ks;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/ks",
            "<",
            "Lcom/google/android/gms/internal/ads/azo;",
            ">;"
        }
    .end annotation
.end field

.field private f:Lcom/google/android/gms/internal/ads/ks;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/ks",
            "<",
            "Lcom/google/android/gms/internal/ads/azo;",
            ">;"
        }
    .end annotation
.end field

.field private g:Lcom/google/android/gms/internal/ads/bar;

.field private h:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzang;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/baa;->a:Ljava/lang/Object;

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/baa;->h:I

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/baa;->c:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/baa;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/baa;->d:Lcom/google/android/gms/internal/ads/zzang;

    new-instance v0, Lcom/google/android/gms/internal/ads/bam;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/bam;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/baa;->e:Lcom/google/android/gms/internal/ads/ks;

    new-instance v0, Lcom/google/android/gms/internal/ads/bam;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/bam;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/baa;->f:Lcom/google/android/gms/internal/ads/ks;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzang;Ljava/lang/String;Lcom/google/android/gms/internal/ads/ks;Lcom/google/android/gms/internal/ads/ks;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/android/gms/internal/ads/zzang;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/ks",
            "<",
            "Lcom/google/android/gms/internal/ads/azo;",
            ">;",
            "Lcom/google/android/gms/internal/ads/ks",
            "<",
            "Lcom/google/android/gms/internal/ads/azo;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/baa;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzang;Ljava/lang/String;)V

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/baa;->e:Lcom/google/android/gms/internal/ads/ks;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/baa;->f:Lcom/google/android/gms/internal/ads/ks;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/baa;I)I
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/baa;->h:I

    return p1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/baa;Lcom/google/android/gms/internal/ads/bar;)Lcom/google/android/gms/internal/ads/bar;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/baa;->g:Lcom/google/android/gms/internal/ads/bar;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/baa;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/baa;->a:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/ads/baa;)Lcom/google/android/gms/internal/ads/bar;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/baa;->g:Lcom/google/android/gms/internal/ads/bar;

    return-object v0
.end method

.method static synthetic c(Lcom/google/android/gms/internal/ads/baa;)Lcom/google/android/gms/internal/ads/ks;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/baa;->e:Lcom/google/android/gms/internal/ads/ks;

    return-object v0
.end method

.method static synthetic d(Lcom/google/android/gms/internal/ads/baa;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/baa;->h:I

    return v0
.end method


# virtual methods
.method protected final a(Lcom/google/android/gms/internal/ads/agw;)Lcom/google/android/gms/internal/ads/bar;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/bar;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/baa;->f:Lcom/google/android/gms/internal/ads/ks;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/bar;-><init>(Lcom/google/android/gms/internal/ads/ks;)V

    sget-object v1, Lcom/google/android/gms/internal/ads/nk;->a:Ljava/util/concurrent/Executor;

    new-instance v2, Lcom/google/android/gms/internal/ads/bab;

    invoke-direct {v2, p0, p1, v0}, Lcom/google/android/gms/internal/ads/bab;-><init>(Lcom/google/android/gms/internal/ads/baa;Lcom/google/android/gms/internal/ads/agw;Lcom/google/android/gms/internal/ads/bar;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    new-instance v1, Lcom/google/android/gms/internal/ads/baj;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/ads/baj;-><init>(Lcom/google/android/gms/internal/ads/baa;Lcom/google/android/gms/internal/ads/bar;)V

    new-instance v2, Lcom/google/android/gms/internal/ads/bak;

    invoke-direct {v2, p0, v0}, Lcom/google/android/gms/internal/ads/bak;-><init>(Lcom/google/android/gms/internal/ads/baa;Lcom/google/android/gms/internal/ads/bar;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/nv;->a(Lcom/google/android/gms/internal/ads/nu;Lcom/google/android/gms/internal/ads/ns;)V

    return-object v0
.end method

.method final synthetic a(Lcom/google/android/gms/internal/ads/agw;Lcom/google/android/gms/internal/ads/bar;)V
    .locals 6

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/baa;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/baa;->d:Lcom/google/android/gms/internal/ads/zzang;

    sget-object v0, Lcom/google/android/gms/internal/ads/asa;->aA:Lcom/google/android/gms/internal/ads/arq;

    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->f()Lcom/google/android/gms/internal/ads/ary;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/ary;->a(Lcom/google/android/gms/internal/ads/arq;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/ayz;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/ayz;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzang;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    new-instance v1, Lcom/google/android/gms/internal/ads/bac;

    invoke-direct {v1, p0, p2, v0}, Lcom/google/android/gms/internal/ads/bac;-><init>(Lcom/google/android/gms/internal/ads/baa;Lcom/google/android/gms/internal/ads/bar;Lcom/google/android/gms/internal/ads/azo;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/azo;->a(Lcom/google/android/gms/internal/ads/azp;)V

    const-string v1, "/jsLoaded"

    new-instance v2, Lcom/google/android/gms/internal/ads/baf;

    invoke-direct {v2, p0, p2, v0}, Lcom/google/android/gms/internal/ads/baf;-><init>(Lcom/google/android/gms/internal/ads/baa;Lcom/google/android/gms/internal/ads/bar;Lcom/google/android/gms/internal/ads/azo;)V

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/azo;->a(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    new-instance v1, Lcom/google/android/gms/internal/ads/lp;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/lp;-><init>()V

    new-instance v2, Lcom/google/android/gms/internal/ads/bag;

    invoke-direct {v2, p0, p1, v0, v1}, Lcom/google/android/gms/internal/ads/bag;-><init>(Lcom/google/android/gms/internal/ads/baa;Lcom/google/android/gms/internal/ads/agw;Lcom/google/android/gms/internal/ads/azo;Lcom/google/android/gms/internal/ads/lp;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/lp;->a(Ljava/lang/Object;)V

    const-string v1, "/requestReload"

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/azo;->a(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/baa;->c:Ljava/lang/String;

    const-string v2, ".js"

    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/baa;->c:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/azo;->a(Ljava/lang/String;)V

    :goto_1
    sget-object v1, Lcom/google/android/gms/internal/ads/jn;->a:Landroid/os/Handler;

    new-instance v2, Lcom/google/android/gms/internal/ads/bah;

    invoke-direct {v2, p0, p2, v0}, Lcom/google/android/gms/internal/ads/bah;-><init>(Lcom/google/android/gms/internal/ads/baa;Lcom/google/android/gms/internal/ads/bar;Lcom/google/android/gms/internal/ads/azo;)V

    sget v0, Lcom/google/android/gms/internal/ads/bal;->a:I

    int-to-long v4, v0

    invoke-virtual {v1, v2, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :goto_2
    return-void

    :cond_0
    :try_start_1
    new-instance v0, Lcom/google/android/gms/internal/ads/azq;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, p1, v3}, Lcom/google/android/gms/internal/ads/azq;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzang;Lcom/google/android/gms/internal/ads/agw;Lcom/google/android/gms/ads/internal/zzw;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Error creating webview."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/je;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzeo()Lcom/google/android/gms/internal/ads/io;

    move-result-object v1

    const-string v2, "SdkJavascriptFactory.loadJavascriptEngine"

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ads/io;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/nv;->a()V

    goto :goto_2

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/baa;->c:Ljava/lang/String;

    const-string v2, "<html>"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/baa;->c:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/azo;->c(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/baa;->c:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/azo;->d(Ljava/lang/String;)V

    goto :goto_1
.end method

.method final synthetic a(Lcom/google/android/gms/internal/ads/bar;Lcom/google/android/gms/internal/ads/azo;)V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/baa;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/nv;->b()I

    move-result v0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/nv;->b()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    :cond_0
    monitor-exit v1

    :goto_0
    return-void

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/nv;->a()V

    sget-object v0, Lcom/google/android/gms/internal/ads/nk;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/bae;->a(Lcom/google/android/gms/internal/ads/azo;)Ljava/lang/Runnable;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    const-string v0, "Could not receive loaded message in a timely manner. Rejecting."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/je;->a(Ljava/lang/String;)V

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final b(Lcom/google/android/gms/internal/ads/agw;)Lcom/google/android/gms/internal/ads/ban;
    .locals 4

    const/4 v3, 0x2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/baa;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/baa;->g:Lcom/google/android/gms/internal/ads/bar;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/baa;->g:Lcom/google/android/gms/internal/ads/bar;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/nv;->b()I

    move-result v0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_1

    :cond_0
    const/4 v0, 0x2

    iput v0, p0, Lcom/google/android/gms/internal/ads/baa;->h:I

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/baa;->a(Lcom/google/android/gms/internal/ads/agw;)Lcom/google/android/gms/internal/ads/bar;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/baa;->g:Lcom/google/android/gms/internal/ads/bar;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/baa;->g:Lcom/google/android/gms/internal/ads/bar;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bar;->c()Lcom/google/android/gms/internal/ads/ban;

    move-result-object v0

    monitor-exit v1

    :goto_0
    return-object v0

    :cond_1
    iget v0, p0, Lcom/google/android/gms/internal/ads/baa;->h:I

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/baa;->g:Lcom/google/android/gms/internal/ads/bar;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bar;->c()Lcom/google/android/gms/internal/ads/ban;

    move-result-object v0

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_2
    :try_start_1
    iget v0, p0, Lcom/google/android/gms/internal/ads/baa;->h:I

    const/4 v2, 0x1

    if-ne v0, v2, :cond_3

    const/4 v0, 0x2

    iput v0, p0, Lcom/google/android/gms/internal/ads/baa;->h:I

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/baa;->a(Lcom/google/android/gms/internal/ads/agw;)Lcom/google/android/gms/internal/ads/bar;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/baa;->g:Lcom/google/android/gms/internal/ads/bar;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bar;->c()Lcom/google/android/gms/internal/ads/ban;

    move-result-object v0

    monitor-exit v1

    goto :goto_0

    :cond_3
    iget v0, p0, Lcom/google/android/gms/internal/ads/baa;->h:I

    if-ne v0, v3, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/baa;->g:Lcom/google/android/gms/internal/ads/bar;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bar;->c()Lcom/google/android/gms/internal/ads/ban;

    move-result-object v0

    monitor-exit v1

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/baa;->g:Lcom/google/android/gms/internal/ads/bar;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bar;->c()Lcom/google/android/gms/internal/ads/ban;

    move-result-object v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0
.end method
