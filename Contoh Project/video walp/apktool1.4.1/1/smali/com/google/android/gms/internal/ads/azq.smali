.class public final Lcom/google/android/gms/internal/ads/azq;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/azi;
.implements Lcom/google/android/gms/internal/ads/azo;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/cm;
.end annotation

.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/qe;

.field private final b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzang;Lcom/google/android/gms/internal/ads/agw;Lcom/google/android/gms/ads/internal/zzw;)V
    .locals 11

    const/4 v3, 0x0

    const/4 v7, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/azq;->b:Landroid/content/Context;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzel()Lcom/google/android/gms/internal/ads/ql;

    invoke-static {}, Lcom/google/android/gms/internal/ads/rs;->a()Lcom/google/android/gms/internal/ads/rs;

    move-result-object v1

    const-string v2, ""

    invoke-static {}, Lcom/google/android/gms/internal/ads/amj;->a()Lcom/google/android/gms/internal/ads/amj;

    move-result-object v10

    move-object v0, p1

    move v4, v3

    move-object v5, p3

    move-object v6, p2

    move-object v8, v7

    move-object v9, v7

    invoke-static/range {v0 .. v10}, Lcom/google/android/gms/internal/ads/ql;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/rs;Ljava/lang/String;ZZLcom/google/android/gms/internal/ads/agw;Lcom/google/android/gms/internal/ads/zzang;Lcom/google/android/gms/internal/ads/asn;Lcom/google/android/gms/ads/internal/zzbo;Lcom/google/android/gms/ads/internal/zzw;Lcom/google/android/gms/internal/ads/amj;)Lcom/google/android/gms/internal/ads/qe;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/azq;->a:Lcom/google/android/gms/internal/ads/qe;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/azq;->a:Lcom/google/android/gms/internal/ads/qe;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/qe;->getView()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setWillNotDraw(Z)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/azq;)Lcom/google/android/gms/internal/ads/qe;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/azq;->a:Lcom/google/android/gms/internal/ads/qe;

    return-object v0
.end method

.method private static a(Ljava/lang/Runnable;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->a()Lcom/google/android/gms/internal/ads/lz;

    invoke-static {}, Lcom/google/android/gms/internal/ads/lz;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    :goto_0
    return-void

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/jn;->a:Landroid/os/Handler;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/azq;->a:Lcom/google/android/gms/internal/ads/qe;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/qe;->destroy()V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/azp;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/azq;->a:Lcom/google/android/gms/internal/ads/qe;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/qe;->t()Lcom/google/android/gms/internal/ads/rm;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/azt;->a(Lcom/google/android/gms/internal/ads/azp;)Lcom/google/android/gms/internal/ads/ro;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/rm;->a(Lcom/google/android/gms/internal/ads/ro;)V

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 3

    const-string v0, "<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/azv;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/ads/azv;-><init>(Lcom/google/android/gms/internal/ads/azq;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/azq;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final a(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/ads/internal/gmsg/zzv",
            "<-",
            "Lcom/google/android/gms/internal/ads/bax;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/azq;->a:Lcom/google/android/gms/internal/ads/qe;

    new-instance v1, Lcom/google/android/gms/internal/ads/azy;

    invoke-direct {v1, p0, p2}, Lcom/google/android/gms/internal/ads/azy;-><init>(Lcom/google/android/gms/internal/ads/azq;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    invoke-interface {v0, p1, v1}, Lcom/google/android/gms/internal/ads/qe;->a(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ads/azj;->a(Lcom/google/android/gms/internal/ads/azi;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/util/Map;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ads/azj;->a(Lcom/google/android/gms/internal/ads/azi;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final a(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ads/azj;->b(Lcom/google/android/gms/internal/ads/azi;Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public final b()Lcom/google/android/gms/internal/ads/bay;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/baz;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/baz;-><init>(Lcom/google/android/gms/internal/ads/bax;)V

    return-object v0
.end method

.method public final b(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/azr;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/azr;-><init>(Lcom/google/android/gms/internal/ads/azq;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/azq;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final b(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/ads/internal/gmsg/zzv",
            "<-",
            "Lcom/google/android/gms/internal/ads/bax;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/azq;->a:Lcom/google/android/gms/internal/ads/qe;

    new-instance v1, Lcom/google/android/gms/internal/ads/azs;

    invoke-direct {v1, p2}, Lcom/google/android/gms/internal/ads/azs;-><init>(Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    invoke-interface {v0, p1, v1}, Lcom/google/android/gms/internal/ads/qe;->a(Ljava/lang/String;Lcom/google/android/gms/common/util/l;)V

    return-void
.end method

.method public final b(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ads/azj;->a(Lcom/google/android/gms/internal/ads/azi;Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public final c(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/azw;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/azw;-><init>(Lcom/google/android/gms/internal/ads/azq;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/azq;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final d(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/azx;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/azx;-><init>(Lcom/google/android/gms/internal/ads/azq;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/azq;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method final synthetic e(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/azq;->a:Lcom/google/android/gms/internal/ads/qe;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/qe;->b(Ljava/lang/String;)V

    return-void
.end method
