.class public final Lcom/google/android/gms/internal/ads/bu;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/bq;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/cm;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/bq",
        "<",
        "Lcom/google/android/gms/internal/ads/qe;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/internal/ads/ne;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/ne",
            "<",
            "Lcom/google/android/gms/internal/ads/qe;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/google/android/gms/ads/internal/gmsg/zzab;

.field private final c:Lcom/google/android/gms/internal/ads/atw;

.field private final d:Landroid/content/Context;

.field private final e:Lcom/google/android/gms/internal/ads/zzang;

.field private final f:Lcom/google/android/gms/ads/internal/zzbc;

.field private final g:Lcom/google/android/gms/internal/ads/agw;

.field private h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/zzbc;Ljava/lang/String;Lcom/google/android/gms/internal/ads/agw;Lcom/google/android/gms/internal/ads/zzang;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Webview loading for native ads."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/je;->d(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/bu;->d:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/bu;->f:Lcom/google/android/gms/ads/internal/zzbc;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/bu;->g:Lcom/google/android/gms/internal/ads/agw;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/bu;->e:Lcom/google/android/gms/internal/ads/zzang;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/bu;->h:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzel()Lcom/google/android/gms/internal/ads/ql;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bu;->d:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/bu;->e:Lcom/google/android/gms/internal/ads/zzang;

    sget-object v0, Lcom/google/android/gms/internal/ads/asa;->bX:Lcom/google/android/gms/internal/ads/arq;

    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->f()Lcom/google/android/gms/internal/ads/ary;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/ary;->a(Lcom/google/android/gms/internal/ads/arq;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/bu;->g:Lcom/google/android/gms/internal/ads/agw;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/bu;->f:Lcom/google/android/gms/ads/internal/zzbc;

    invoke-virtual {v4}, Lcom/google/android/gms/ads/internal/zza;->zzbi()Lcom/google/android/gms/ads/internal/zzw;

    move-result-object v4

    invoke-static {v1, v2, v0, v3, v4}, Lcom/google/android/gms/internal/ads/ql;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzang;Ljava/lang/String;Lcom/google/android/gms/internal/ads/agw;Lcom/google/android/gms/ads/internal/zzw;)Lcom/google/android/gms/internal/ads/ne;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/ads/internal/gmsg/zzab;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/bu;->d:Landroid/content/Context;

    invoke-direct {v1, v2}, Lcom/google/android/gms/ads/internal/gmsg/zzab;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/bu;->b:Lcom/google/android/gms/ads/internal/gmsg/zzab;

    new-instance v1, Lcom/google/android/gms/internal/ads/atw;

    invoke-direct {v1, p2, p3}, Lcom/google/android/gms/internal/ads/atw;-><init>(Lcom/google/android/gms/internal/ads/ats;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/bu;->c:Lcom/google/android/gms/internal/ads/atw;

    new-instance v1, Lcom/google/android/gms/internal/ads/bv;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/bv;-><init>(Lcom/google/android/gms/internal/ads/bu;)V

    sget-object v2, Lcom/google/android/gms/internal/ads/nk;->b:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/mt;->a(Lcom/google/android/gms/internal/ads/ne;Lcom/google/android/gms/internal/ads/mo;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/ne;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/bu;->a:Lcom/google/android/gms/internal/ads/ne;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bu;->a:Lcom/google/android/gms/internal/ads/ne;

    const-string v1, "WebViewNativeAdsUtil.constructor"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/mr;->a(Lcom/google/android/gms/internal/ads/ne;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/bu;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bu;->h:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method final synthetic a(Lcom/google/android/gms/internal/ads/qe;)Lcom/google/android/gms/internal/ads/ne;
    .locals 11

    const/4 v7, 0x0

    const-string v0, "Javascript has loaded for native ads."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/je;->d(Ljava/lang/String;)V

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/qe;->t()Lcom/google/android/gms/internal/ads/rm;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bu;->f:Lcom/google/android/gms/ads/internal/zzbc;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/bu;->f:Lcom/google/android/gms/ads/internal/zzbc;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/bu;->f:Lcom/google/android/gms/ads/internal/zzbc;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/bu;->f:Lcom/google/android/gms/ads/internal/zzbc;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/bu;->f:Lcom/google/android/gms/ads/internal/zzbc;

    const/4 v6, 0x0

    new-instance v8, Lcom/google/android/gms/ads/internal/zzx;

    iget-object v9, p0, Lcom/google/android/gms/internal/ads/bu;->d:Landroid/content/Context;

    invoke-direct {v8, v9, v7, v7}, Lcom/google/android/gms/ads/internal/zzx;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/hu;Lcom/google/android/gms/internal/ads/zzael;)V

    move-object v9, v7

    move-object v10, v7

    invoke-interface/range {v0 .. v10}, Lcom/google/android/gms/internal/ads/rm;->a(Lcom/google/android/gms/internal/ads/anw;Lcom/google/android/gms/ads/internal/gmsg/zzb;Lcom/google/android/gms/ads/internal/overlay/zzn;Lcom/google/android/gms/ads/internal/gmsg/zzd;Lcom/google/android/gms/ads/internal/overlay/zzt;ZLcom/google/android/gms/ads/internal/gmsg/zzz;Lcom/google/android/gms/ads/internal/zzx;Lcom/google/android/gms/internal/ads/o;Lcom/google/android/gms/internal/ads/hu;)V

    const-string v0, "/logScionEvent"

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bu;->b:Lcom/google/android/gms/ads/internal/gmsg/zzab;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/qe;->a(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    const-string v0, "/logScionEvent"

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bu;->c:Lcom/google/android/gms/internal/ads/atw;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/qe;->a(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/mt;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/nd;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lorg/json/JSONObject;)Lcom/google/android/gms/internal/ads/ne;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/internal/ads/ne",
            "<",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bu;->a:Lcom/google/android/gms/internal/ads/ne;

    new-instance v1, Lcom/google/android/gms/internal/ads/bw;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/bw;-><init>(Lcom/google/android/gms/internal/ads/bu;Lorg/json/JSONObject;)V

    sget-object v2, Lcom/google/android/gms/internal/ads/nk;->a:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/mt;->a(Lcom/google/android/gms/internal/ads/ne;Lcom/google/android/gms/internal/ads/mo;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/ne;

    move-result-object v0

    return-object v0
.end method

.method final synthetic a(Lorg/json/JSONObject;Lcom/google/android/gms/internal/ads/qe;)Lcom/google/android/gms/internal/ads/ne;
    .locals 2

    const-string v0, "ads_id"

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bu;->h:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "google.afma.nativeAds.handleDownloadedImpressionPing"

    invoke-interface {p2, v0, p1}, Lcom/google/android/gms/internal/ads/qe;->b(Ljava/lang/String;Lorg/json/JSONObject;)V

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/mt;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/nd;

    move-result-object v0

    return-object v0
.end method

.method public final a()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bu;->a:Lcom/google/android/gms/internal/ads/ne;

    new-instance v1, Lcom/google/android/gms/internal/ads/cf;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/cf;-><init>(Lcom/google/android/gms/internal/ads/bu;)V

    sget-object v2, Lcom/google/android/gms/internal/ads/nk;->a:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/mt;->a(Lcom/google/android/gms/internal/ads/ne;Lcom/google/android/gms/internal/ads/mq;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public final a(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/ads/internal/gmsg/zzv",
            "<-",
            "Lcom/google/android/gms/internal/ads/qe;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bu;->a:Lcom/google/android/gms/internal/ads/ne;

    new-instance v1, Lcom/google/android/gms/internal/ads/cb;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/internal/ads/cb;-><init>(Lcom/google/android/gms/internal/ads/bu;Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    sget-object v2, Lcom/google/android/gms/internal/ads/nk;->a:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/mt;->a(Lcom/google/android/gms/internal/ads/ne;Lcom/google/android/gms/internal/ads/mq;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public final a(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bu;->a:Lcom/google/android/gms/internal/ads/ne;

    new-instance v1, Lcom/google/android/gms/internal/ads/cd;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/internal/ads/cd;-><init>(Lcom/google/android/gms/internal/ads/bu;Ljava/lang/String;Lorg/json/JSONObject;)V

    sget-object v2, Lcom/google/android/gms/internal/ads/nk;->a:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/mt;->a(Lcom/google/android/gms/internal/ads/ne;Lcom/google/android/gms/internal/ads/mq;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public final b(Lorg/json/JSONObject;)Lcom/google/android/gms/internal/ads/ne;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/internal/ads/ne",
            "<",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bu;->a:Lcom/google/android/gms/internal/ads/ne;

    new-instance v1, Lcom/google/android/gms/internal/ads/bx;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/bx;-><init>(Lcom/google/android/gms/internal/ads/bu;Lorg/json/JSONObject;)V

    sget-object v2, Lcom/google/android/gms/internal/ads/nk;->a:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/mt;->a(Lcom/google/android/gms/internal/ads/ne;Lcom/google/android/gms/internal/ads/mo;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/ne;

    move-result-object v0

    return-object v0
.end method

.method final synthetic b(Lorg/json/JSONObject;Lcom/google/android/gms/internal/ads/qe;)Lcom/google/android/gms/internal/ads/ne;
    .locals 2

    const-string v0, "ads_id"

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bu;->h:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "google.afma.nativeAds.handleImpressionPing"

    invoke-interface {p2, v0, p1}, Lcom/google/android/gms/internal/ads/qe;->b(Ljava/lang/String;Lorg/json/JSONObject;)V

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/mt;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/nd;

    move-result-object v0

    return-object v0
.end method

.method public final b(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/ads/internal/gmsg/zzv",
            "<-",
            "Lcom/google/android/gms/internal/ads/qe;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bu;->a:Lcom/google/android/gms/internal/ads/ne;

    new-instance v1, Lcom/google/android/gms/internal/ads/cc;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/internal/ads/cc;-><init>(Lcom/google/android/gms/internal/ads/bu;Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    sget-object v2, Lcom/google/android/gms/internal/ads/nk;->a:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/mt;->a(Lcom/google/android/gms/internal/ads/ne;Lcom/google/android/gms/internal/ads/mq;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public final c(Lorg/json/JSONObject;)Lcom/google/android/gms/internal/ads/ne;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/internal/ads/ne",
            "<",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bu;->a:Lcom/google/android/gms/internal/ads/ne;

    new-instance v1, Lcom/google/android/gms/internal/ads/by;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/by;-><init>(Lcom/google/android/gms/internal/ads/bu;Lorg/json/JSONObject;)V

    sget-object v2, Lcom/google/android/gms/internal/ads/nk;->a:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/mt;->a(Lcom/google/android/gms/internal/ads/ne;Lcom/google/android/gms/internal/ads/mo;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/ne;

    move-result-object v0

    return-object v0
.end method

.method final synthetic c(Lorg/json/JSONObject;Lcom/google/android/gms/internal/ads/qe;)Lcom/google/android/gms/internal/ads/ne;
    .locals 2

    const-string v0, "ads_id"

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bu;->h:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "google.afma.nativeAds.handleClickGmsg"

    invoke-interface {p2, v0, p1}, Lcom/google/android/gms/internal/ads/qe;->b(Ljava/lang/String;Lorg/json/JSONObject;)V

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/mt;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/nd;

    move-result-object v0

    return-object v0
.end method

.method public final d(Lorg/json/JSONObject;)Lcom/google/android/gms/internal/ads/ne;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/internal/ads/ne",
            "<",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bu;->a:Lcom/google/android/gms/internal/ads/ne;

    new-instance v1, Lcom/google/android/gms/internal/ads/bz;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/bz;-><init>(Lcom/google/android/gms/internal/ads/bu;Lorg/json/JSONObject;)V

    sget-object v2, Lcom/google/android/gms/internal/ads/nk;->a:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/mt;->a(Lcom/google/android/gms/internal/ads/ne;Lcom/google/android/gms/internal/ads/mo;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/ne;

    move-result-object v0

    return-object v0
.end method

.method final synthetic d(Lorg/json/JSONObject;Lcom/google/android/gms/internal/ads/qe;)Lcom/google/android/gms/internal/ads/ne;
    .locals 3

    const-string v0, "ads_id"

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bu;->h:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance v0, Lcom/google/android/gms/internal/ads/np;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/np;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/ads/ca;

    invoke-direct {v1, p0, p2, v0}, Lcom/google/android/gms/internal/ads/ca;-><init>(Lcom/google/android/gms/internal/ads/bu;Lcom/google/android/gms/internal/ads/qe;Lcom/google/android/gms/internal/ads/np;)V

    const-string v2, "/nativeAdPreProcess"

    invoke-interface {p2, v2, v1}, Lcom/google/android/gms/internal/ads/qe;->a(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    const-string v1, "google.afma.nativeAds.preProcessJsonGmsg"

    invoke-interface {p2, v1, p1}, Lcom/google/android/gms/internal/ads/qe;->b(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-object v0
.end method
