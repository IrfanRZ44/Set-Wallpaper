.class public final Lcom/google/android/gms/internal/ads/aos;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/cm;
.end annotation


# static fields
.field private static final a:Ljava/lang/Object;

.field private static b:Lcom/google/android/gms/internal/ads/aos;


# instance fields
.field private final c:Lcom/google/android/gms/internal/ads/lz;

.field private final d:Lcom/google/android/gms/internal/ads/aoh;

.field private final e:Ljava/lang/String;

.field private final f:Lcom/google/android/gms/internal/ads/arw;

.field private final g:Lcom/google/android/gms/internal/ads/arx;

.field private final h:Lcom/google/android/gms/internal/ads/ary;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/aos;->a:Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/internal/ads/aos;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/aos;-><init>()V

    sget-object v1, Lcom/google/android/gms/internal/ads/aos;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sput-object v0, Lcom/google/android/gms/internal/ads/aos;->b:Lcom/google/android/gms/internal/ads/aos;

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method protected constructor <init>()V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/lz;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/lz;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/aos;->c:Lcom/google/android/gms/internal/ads/lz;

    new-instance v0, Lcom/google/android/gms/internal/ads/aoh;

    new-instance v1, Lcom/google/android/gms/internal/ads/aoa;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/aoa;-><init>()V

    new-instance v2, Lcom/google/android/gms/internal/ads/anz;

    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/anz;-><init>()V

    new-instance v3, Lcom/google/android/gms/internal/ads/aqw;

    invoke-direct {v3}, Lcom/google/android/gms/internal/ads/aqw;-><init>()V

    new-instance v4, Lcom/google/android/gms/internal/ads/awo;

    invoke-direct {v4}, Lcom/google/android/gms/internal/ads/awo;-><init>()V

    new-instance v5, Lcom/google/android/gms/internal/ads/gl;

    invoke-direct {v5}, Lcom/google/android/gms/internal/ads/gl;-><init>()V

    new-instance v6, Lcom/google/android/gms/internal/ads/q;

    invoke-direct {v6}, Lcom/google/android/gms/internal/ads/q;-><init>()V

    new-instance v7, Lcom/google/android/gms/internal/ads/awp;

    invoke-direct {v7}, Lcom/google/android/gms/internal/ads/awp;-><init>()V

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/ads/aoh;-><init>(Lcom/google/android/gms/internal/ads/aoa;Lcom/google/android/gms/internal/ads/anz;Lcom/google/android/gms/internal/ads/aqw;Lcom/google/android/gms/internal/ads/awo;Lcom/google/android/gms/internal/ads/gl;Lcom/google/android/gms/internal/ads/q;Lcom/google/android/gms/internal/ads/awp;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/aos;->d:Lcom/google/android/gms/internal/ads/aoh;

    invoke-static {}, Lcom/google/android/gms/internal/ads/lz;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/aos;->e:Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/internal/ads/arw;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/arw;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/aos;->f:Lcom/google/android/gms/internal/ads/arw;

    new-instance v0, Lcom/google/android/gms/internal/ads/arx;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/arx;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/aos;->g:Lcom/google/android/gms/internal/ads/arx;

    new-instance v0, Lcom/google/android/gms/internal/ads/ary;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/ary;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/aos;->h:Lcom/google/android/gms/internal/ads/ary;

    return-void
.end method

.method public static a()Lcom/google/android/gms/internal/ads/lz;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->g()Lcom/google/android/gms/internal/ads/aos;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/aos;->c:Lcom/google/android/gms/internal/ads/lz;

    return-object v0
.end method

.method public static b()Lcom/google/android/gms/internal/ads/aoh;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->g()Lcom/google/android/gms/internal/ads/aos;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/aos;->d:Lcom/google/android/gms/internal/ads/aoh;

    return-object v0
.end method

.method public static c()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->g()Lcom/google/android/gms/internal/ads/aos;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/aos;->e:Ljava/lang/String;

    return-object v0
.end method

.method public static d()Lcom/google/android/gms/internal/ads/arx;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->g()Lcom/google/android/gms/internal/ads/aos;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/aos;->g:Lcom/google/android/gms/internal/ads/arx;

    return-object v0
.end method

.method public static e()Lcom/google/android/gms/internal/ads/arw;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->g()Lcom/google/android/gms/internal/ads/aos;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/aos;->f:Lcom/google/android/gms/internal/ads/arw;

    return-object v0
.end method

.method public static f()Lcom/google/android/gms/internal/ads/ary;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->g()Lcom/google/android/gms/internal/ads/aos;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/aos;->h:Lcom/google/android/gms/internal/ads/ary;

    return-object v0
.end method

.method private static g()Lcom/google/android/gms/internal/ads/aos;
    .locals 2

    sget-object v1, Lcom/google/android/gms/internal/ads/aos;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/aos;->b:Lcom/google/android/gms/internal/ads/aos;

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
