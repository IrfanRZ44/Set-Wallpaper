.class public final Lcom/google/android/gms/internal/ads/ayz;
.super Lcom/google/android/gms/internal/ads/azm;

# interfaces
.implements Lcom/google/android/gms/internal/ads/azi;
.implements Lcom/google/android/gms/internal/ads/azo;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/cm;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/azm",
        "<",
        "Lcom/google/android/gms/internal/ads/bax;",
        ">;",
        "Lcom/google/android/gms/internal/ads/azi;",
        "Lcom/google/android/gms/internal/ads/azo;"
    }
.end annotation

.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/sf;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzang;)V
    .locals 3

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/azm;-><init>()V

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/ads/sf;

    new-instance v1, Lcom/google/android/gms/internal/ads/rr;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/rr;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/sf;-><init>(Lcom/google/android/gms/internal/ads/rr;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ayz;->a:Lcom/google/android/gms/internal/ads/sf;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ayz;->a:Lcom/google/android/gms/internal/ads/sf;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/sf;->setWillNotDraw(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ayz;->a:Lcom/google/android/gms/internal/ads/sf;

    new-instance v1, Lcom/google/android/gms/internal/ads/aza;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/aza;-><init>(Lcom/google/android/gms/internal/ads/ayz;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/sc;->a(Lcom/google/android/gms/internal/ads/sh;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ayz;->a:Lcom/google/android/gms/internal/ads/sf;

    new-instance v1, Lcom/google/android/gms/internal/ads/azb;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/azb;-><init>(Lcom/google/android/gms/internal/ads/ayz;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/sc;->a(Lcom/google/android/gms/internal/ads/sj;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ayz;->a:Lcom/google/android/gms/internal/ads/sf;

    new-instance v1, Lcom/google/android/gms/internal/ads/azh;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/google/android/gms/internal/ads/azh;-><init>(Lcom/google/android/gms/internal/ads/azl;Lcom/google/android/gms/internal/ads/azg;)V

    const-string v2, "GoogleJsInterface"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/sc;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzek()Lcom/google/android/gms/internal/ads/jn;

    move-result-object v0

    iget-object v1, p2, Lcom/google/android/gms/internal/ads/zzang;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ayz;->a:Lcom/google/android/gms/internal/ads/sf;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sf;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/google/android/gms/internal/ads/jn;->a(Landroid/content/Context;Ljava/lang/String;Landroid/webkit/WebSettings;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/internal/ads/qp;

    const-string v2, "Init failed."

    invoke-direct {v1, v2, v0}, Lcom/google/android/gms/internal/ads/qp;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ayz;->a:Lcom/google/android/gms/internal/ads/sf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sf;->destroy()V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/azp;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ayz;->a:Lcom/google/android/gms/internal/ads/sf;

    new-instance v1, Lcom/google/android/gms/internal/ads/aze;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/aze;-><init>(Lcom/google/android/gms/internal/ads/azp;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/sc;->a(Lcom/google/android/gms/internal/ads/sl;)V

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 3

    const-string v0, "<!DOCTYPE html><html><head><script src=\"%s\"></script></head></html>"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/ayz;->c(Ljava/lang/String;)V

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
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/nk;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/google/android/gms/internal/ads/azf;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/azf;-><init>(Lcom/google/android/gms/internal/ads/ayz;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final b(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ads/azj;->a(Lcom/google/android/gms/internal/ads/azi;Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public final c(Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/nk;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/google/android/gms/internal/ads/azc;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/azc;-><init>(Lcom/google/android/gms/internal/ads/ayz;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final d(Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/nk;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/google/android/gms/internal/ads/azd;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/azd;-><init>(Lcom/google/android/gms/internal/ads/ayz;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method final synthetic e(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ayz;->a:Lcom/google/android/gms/internal/ads/sf;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/sc;->b(Ljava/lang/String;)V

    return-void
.end method

.method final synthetic f(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ayz;->a:Lcom/google/android/gms/internal/ads/sf;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/sc;->loadUrl(Ljava/lang/String;)V

    return-void
.end method

.method final synthetic g(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ayz;->a:Lcom/google/android/gms/internal/ads/sf;

    const-string v1, "text/html"

    const-string v2, "UTF-8"

    invoke-virtual {v0, p1, v1, v2}, Lcom/google/android/gms/internal/ads/sf;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final bridge synthetic o()Ljava/lang/Object;
    .locals 1

    if-nez p0, :cond_0

    const/4 v0, 0x0

    throw v0

    :cond_0
    return-object p0
.end method
