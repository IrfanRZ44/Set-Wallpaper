.class public final Lcom/google/android/gms/internal/ads/kx;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/cm;
.end annotation

.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# static fields
.field private static a:Lcom/google/android/gms/internal/ads/azu;

.field private static final b:Ljava/lang/Object;

.field private static final c:Lcom/google/android/gms/internal/ads/ld;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/ld",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/kx;->b:Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/internal/ads/ky;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/ky;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/kx;->c:Lcom/google/android/gms/internal/ads/ld;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    :goto_0
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/kx;->a(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/azu;

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    goto :goto_0
.end method

.method private static a(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/azu;
    .locals 5

    sget-object v1, Lcom/google/android/gms/internal/ads/kx;->b:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/kx;->a:Lcom/google/android/gms/internal/ads/azu;

    if-nez v0, :cond_0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/asa;->a(Landroid/content/Context;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/asa;->cI:Lcom/google/android/gms/internal/ads/arq;

    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->f()Lcom/google/android/gms/internal/ads/ary;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/ary;->a(Lcom/google/android/gms/internal/ads/arq;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/kr;->a(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/azu;

    move-result-object v0

    :goto_0
    sput-object v0, Lcom/google/android/gms/internal/ads/kx;->a:Lcom/google/android/gms/internal/ads/azu;

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/kx;->a:Lcom/google/android/gms/internal/ads/azu;

    monitor-exit v1

    return-object v0

    :cond_1
    new-instance v2, Lcom/google/android/gms/internal/ads/ib;

    new-instance v0, Lcom/google/android/gms/internal/ads/rj;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/rj;-><init>()V

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/ads/ib;-><init>(Lcom/google/android/gms/internal/ads/hc;)V

    new-instance v3, Ljava/io/File;

    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v0

    const-string v4, "volley"

    invoke-direct {v3, v0, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/azu;

    new-instance v4, Lcom/google/android/gms/internal/ads/le;

    invoke-direct {v4, v3}, Lcom/google/android/gms/internal/ads/le;-><init>(Ljava/io/File;)V

    invoke-direct {v0, v4, v2}, Lcom/google/android/gms/internal/ads/azu;-><init>(Lcom/google/android/gms/internal/ads/zn;Lcom/google/android/gms/internal/ads/aqr;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/azu;->a()V

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method


# virtual methods
.method public final a(ILjava/lang/String;Ljava/util/Map;[B)Lcom/google/android/gms/internal/ads/ne;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;[B)",
            "Lcom/google/android/gms/internal/ads/ne",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    new-instance v4, Lcom/google/android/gms/internal/ads/lf;

    invoke-direct {v4, v0}, Lcom/google/android/gms/internal/ads/lf;-><init>(Lcom/google/android/gms/internal/ads/ky;)V

    new-instance v5, Lcom/google/android/gms/internal/ads/lb;

    invoke-direct {v5, p0, p2, v4}, Lcom/google/android/gms/internal/ads/lb;-><init>(Lcom/google/android/gms/internal/ads/kx;Ljava/lang/String;Lcom/google/android/gms/internal/ads/lf;)V

    new-instance v8, Lcom/google/android/gms/internal/ads/md;

    invoke-direct {v8, v0}, Lcom/google/android/gms/internal/ads/md;-><init>(Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/lc;

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move-object v6, p4

    move-object v7, p3

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/ads/lc;-><init>(Lcom/google/android/gms/internal/ads/kx;ILjava/lang/String;Lcom/google/android/gms/internal/ads/bdy;Lcom/google/android/gms/internal/ads/bcx;[BLjava/util/Map;Lcom/google/android/gms/internal/ads/md;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/md;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    :try_start_0
    const-string v1, "GET"

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/avs;->b()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/avs;->a()[B

    move-result-object v3

    invoke-virtual {v8, p2, v1, v2, v3}, Lcom/google/android/gms/internal/ads/md;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;[B)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/a; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    sget-object v1, Lcom/google/android/gms/internal/ads/kx;->a:Lcom/google/android/gms/internal/ads/azu;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/azu;->a(Lcom/google/android/gms/internal/ads/avs;)Lcom/google/android/gms/internal/ads/avs;

    return-object v4

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/je;->e(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/ld;)Lcom/google/android/gms/internal/ads/ne;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/ld",
            "<TT;>;)",
            "Lcom/google/android/gms/internal/ads/ne",
            "<TT;>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ads/np;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/np;-><init>()V

    sget-object v1, Lcom/google/android/gms/internal/ads/kx;->a:Lcom/google/android/gms/internal/ads/azu;

    new-instance v2, Lcom/google/android/gms/internal/ads/lg;

    invoke-direct {v2, p1, v0}, Lcom/google/android/gms/internal/ads/lg;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/np;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/azu;->a(Lcom/google/android/gms/internal/ads/avs;)Lcom/google/android/gms/internal/ads/avs;

    new-instance v1, Lcom/google/android/gms/internal/ads/la;

    invoke-direct {v1, p0, p2}, Lcom/google/android/gms/internal/ads/la;-><init>(Lcom/google/android/gms/internal/ads/kx;Lcom/google/android/gms/internal/ads/ld;)V

    sget-object v2, Lcom/google/android/gms/internal/ads/jl;->a:Lcom/google/android/gms/internal/ads/nj;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/mt;->a(Lcom/google/android/gms/internal/ads/ne;Lcom/google/android/gms/internal/ads/mp;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/ne;

    move-result-object v0

    const-class v1, Ljava/lang/Throwable;

    new-instance v2, Lcom/google/android/gms/internal/ads/kz;

    invoke-direct {v2, p0, p2}, Lcom/google/android/gms/internal/ads/kz;-><init>(Lcom/google/android/gms/internal/ads/kx;Lcom/google/android/gms/internal/ads/ld;)V

    sget-object v3, Lcom/google/android/gms/internal/ads/nk;->b:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/mt;->a(Lcom/google/android/gms/internal/ads/ne;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/mo;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/ne;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/lang/String;Ljava/util/Map;)Lcom/google/android/gms/internal/ads/ne;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/google/android/gms/internal/ads/ne",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/kx;->a(ILjava/lang/String;Ljava/util/Map;[B)Lcom/google/android/gms/internal/ads/ne;

    move-result-object v0

    return-object v0
.end method
