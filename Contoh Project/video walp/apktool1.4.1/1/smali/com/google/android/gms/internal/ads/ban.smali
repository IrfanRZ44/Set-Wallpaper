.class public final Lcom/google/android/gms/internal/ads/ban;
.super Lcom/google/android/gms/internal/ads/nv;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/nv",
        "<",
        "Lcom/google/android/gms/internal/ads/bax;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Lcom/google/android/gms/internal/ads/bar;

.field private c:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/bar;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/nv;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ban;->a:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ban;->b:Lcom/google/android/gms/internal/ads/bar;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/ban;)Lcom/google/android/gms/internal/ads/bar;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ban;->b:Lcom/google/android/gms/internal/ads/bar;

    return-object v0
.end method


# virtual methods
.method public final c()V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ban;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/ban;->c:Z

    if-eqz v0, :cond_0

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/ban;->c:Z

    new-instance v0, Lcom/google/android/gms/internal/ads/bao;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/bao;-><init>(Lcom/google/android/gms/internal/ads/ban;)V

    new-instance v2, Lcom/google/android/gms/internal/ads/nt;

    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/nt;-><init>()V

    invoke-virtual {p0, v0, v2}, Lcom/google/android/gms/internal/ads/nv;->a(Lcom/google/android/gms/internal/ads/nu;Lcom/google/android/gms/internal/ads/ns;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/bap;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/bap;-><init>(Lcom/google/android/gms/internal/ads/ban;)V

    new-instance v2, Lcom/google/android/gms/internal/ads/baq;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/ads/baq;-><init>(Lcom/google/android/gms/internal/ads/ban;)V

    invoke-virtual {p0, v0, v2}, Lcom/google/android/gms/internal/ads/nv;->a(Lcom/google/android/gms/internal/ads/nu;Lcom/google/android/gms/internal/ads/ns;)V

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
