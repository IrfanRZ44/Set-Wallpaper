.class public final Lcom/google/android/gms/internal/ads/ajs;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/akf;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/cm;
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/ajj;

.field private final b:Lcom/google/android/gms/internal/ads/qe;

.field private final c:Lcom/google/android/gms/ads/internal/gmsg/zzv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/ads/internal/gmsg/zzv",
            "<",
            "Lcom/google/android/gms/internal/ads/qe;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/google/android/gms/ads/internal/gmsg/zzv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/ads/internal/gmsg/zzv",
            "<",
            "Lcom/google/android/gms/internal/ads/qe;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lcom/google/android/gms/ads/internal/gmsg/zzv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/ads/internal/gmsg/zzv",
            "<",
            "Lcom/google/android/gms/internal/ads/qe;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/ajj;Lcom/google/android/gms/internal/ads/qe;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/ajt;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/ajt;-><init>(Lcom/google/android/gms/internal/ads/ajs;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ajs;->c:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    new-instance v0, Lcom/google/android/gms/internal/ads/aju;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/aju;-><init>(Lcom/google/android/gms/internal/ads/ajs;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ajs;->d:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    new-instance v0, Lcom/google/android/gms/internal/ads/ajv;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/ajv;-><init>(Lcom/google/android/gms/internal/ads/ajs;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ajs;->e:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ajs;->a:Lcom/google/android/gms/internal/ads/ajj;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/ajs;->b:Lcom/google/android/gms/internal/ads/qe;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ajs;->b:Lcom/google/android/gms/internal/ads/qe;

    const-string v1, "/updateActiveView"

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ajs;->c:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/qe;->a(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    const-string v1, "/untrackActiveViewUnit"

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ajs;->d:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/qe;->a(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    const-string v1, "/visibilityChanged"

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ajs;->e:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/qe;->a(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    const-string v1, "Custom JS tracking ad unit: "

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ajs;->a:Lcom/google/android/gms/internal/ads/ajj;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/ajj;->a:Lcom/google/android/gms/internal/ads/ajh;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ajh;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/je;->b(Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/ajs;)Lcom/google/android/gms/internal/ads/ajj;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ajs;->a:Lcom/google/android/gms/internal/ads/ajj;

    return-object v0
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;Z)V
    .locals 2

    if-nez p2, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ajs;->b:Lcom/google/android/gms/internal/ads/qe;

    const-string v1, "AFMA_updateActiveView"

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/internal/ads/qe;->b(Ljava/lang/String;Lorg/json/JSONObject;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ajs;->a:Lcom/google/android/gms/internal/ads/ajj;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/ajj;->b(Lcom/google/android/gms/internal/ads/akf;)V

    goto :goto_0
.end method

.method public final a()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final b()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ajs;->b:Lcom/google/android/gms/internal/ads/qe;

    const-string v1, "/visibilityChanged"

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ajs;->e:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/qe;->b(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    const-string v1, "/untrackActiveViewUnit"

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ajs;->d:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/qe;->b(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    const-string v1, "/updateActiveView"

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ajs;->c:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/qe;->b(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    return-void
.end method
