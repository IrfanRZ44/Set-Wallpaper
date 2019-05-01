.class public final Lcom/google/android/gms/internal/ads/ajw;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/akf;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/cm;
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/ajj;

.field private final b:Landroid/content/Context;

.field private final c:Lcom/google/android/gms/ads/internal/gmsg/zzab;

.field private d:Lcom/google/android/gms/internal/ads/ban;

.field private e:Z

.field private final f:Lcom/google/android/gms/ads/internal/gmsg/zzv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/ads/internal/gmsg/zzv",
            "<",
            "Lcom/google/android/gms/internal/ads/bax;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Lcom/google/android/gms/ads/internal/gmsg/zzv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/ads/internal/gmsg/zzv",
            "<",
            "Lcom/google/android/gms/internal/ads/bax;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Lcom/google/android/gms/ads/internal/gmsg/zzv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/ads/internal/gmsg/zzv",
            "<",
            "Lcom/google/android/gms/internal/ads/bax;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Lcom/google/android/gms/ads/internal/gmsg/zzv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/ads/internal/gmsg/zzv",
            "<",
            "Lcom/google/android/gms/internal/ads/bax;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/ajj;Lcom/google/android/gms/internal/ads/baa;Landroid/content/Context;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/akb;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/akb;-><init>(Lcom/google/android/gms/internal/ads/ajw;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ajw;->f:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    new-instance v0, Lcom/google/android/gms/internal/ads/akc;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/akc;-><init>(Lcom/google/android/gms/internal/ads/ajw;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ajw;->g:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    new-instance v0, Lcom/google/android/gms/internal/ads/akd;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/akd;-><init>(Lcom/google/android/gms/internal/ads/ajw;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ajw;->h:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    new-instance v0, Lcom/google/android/gms/internal/ads/ake;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/ake;-><init>(Lcom/google/android/gms/internal/ads/ajw;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ajw;->i:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ajw;->a:Lcom/google/android/gms/internal/ads/ajj;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/ajw;->b:Landroid/content/Context;

    new-instance v0, Lcom/google/android/gms/ads/internal/gmsg/zzab;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ajw;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/google/android/gms/ads/internal/gmsg/zzab;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ajw;->c:Lcom/google/android/gms/ads/internal/gmsg/zzab;

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ads/baa;->b(Lcom/google/android/gms/internal/ads/agw;)Lcom/google/android/gms/internal/ads/ban;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ajw;->d:Lcom/google/android/gms/internal/ads/ban;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ajw;->d:Lcom/google/android/gms/internal/ads/ban;

    new-instance v1, Lcom/google/android/gms/internal/ads/ajx;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/ajx;-><init>(Lcom/google/android/gms/internal/ads/ajw;)V

    new-instance v2, Lcom/google/android/gms/internal/ads/ajy;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/ads/ajy;-><init>(Lcom/google/android/gms/internal/ads/ajw;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/nv;->a(Lcom/google/android/gms/internal/ads/nu;Lcom/google/android/gms/internal/ads/ns;)V

    const-string v1, "Core JS tracking ad unit: "

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ajw;->a:Lcom/google/android/gms/internal/ads/ajj;

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

.method static synthetic a(Lcom/google/android/gms/internal/ads/ajw;)Lcom/google/android/gms/internal/ads/ajj;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ajw;->a:Lcom/google/android/gms/internal/ads/ajj;

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/ajw;Z)Z
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/ajw;->e:Z

    return v0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/ads/ajw;)Lcom/google/android/gms/ads/internal/gmsg/zzab;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ajw;->c:Lcom/google/android/gms/ads/internal/gmsg/zzab;

    return-object v0
.end method


# virtual methods
.method final a(Lcom/google/android/gms/internal/ads/bax;)V
    .locals 2

    const-string v0, "/updateActiveView"

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ajw;->f:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/bax;->a(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    const-string v0, "/untrackActiveViewUnit"

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ajw;->g:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/bax;->a(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    const-string v0, "/visibilityChanged"

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ajw;->h:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/bax;->a(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzfh()Lcom/google/android/gms/internal/ads/hz;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ajw;->b:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/hz;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "/logScionEvent"

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ajw;->i:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/bax;->a(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    :cond_0
    return-void
.end method

.method public final a(Lorg/json/JSONObject;Z)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ajw;->d:Lcom/google/android/gms/internal/ads/ban;

    new-instance v1, Lcom/google/android/gms/internal/ads/ajz;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/ajz;-><init>(Lcom/google/android/gms/internal/ads/ajw;Lorg/json/JSONObject;)V

    new-instance v2, Lcom/google/android/gms/internal/ads/nt;

    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/nt;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/nv;->a(Lcom/google/android/gms/internal/ads/nu;Lcom/google/android/gms/internal/ads/ns;)V

    return-void
.end method

.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/ajw;->e:Z

    return v0
.end method

.method public final b()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ajw;->d:Lcom/google/android/gms/internal/ads/ban;

    new-instance v1, Lcom/google/android/gms/internal/ads/aka;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/aka;-><init>(Lcom/google/android/gms/internal/ads/ajw;)V

    new-instance v2, Lcom/google/android/gms/internal/ads/nt;

    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/nt;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/nv;->a(Lcom/google/android/gms/internal/ads/nu;Lcom/google/android/gms/internal/ads/ns;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ajw;->d:Lcom/google/android/gms/internal/ads/ban;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ban;->c()V

    return-void
.end method

.method final b(Lcom/google/android/gms/internal/ads/bax;)V
    .locals 2

    const-string v0, "/visibilityChanged"

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ajw;->h:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/bax;->b(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    const-string v0, "/untrackActiveViewUnit"

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ajw;->g:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/bax;->b(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    const-string v0, "/updateActiveView"

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ajw;->f:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/bax;->b(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzfh()Lcom/google/android/gms/internal/ads/hz;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ajw;->b:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/hz;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "/logScionEvent"

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ajw;->i:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/bax;->b(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    :cond_0
    return-void
.end method
