.class public final Lcom/google/android/gms/internal/ads/m;
.super Lcom/google/android/gms/internal/ads/n;

# interfaces
.implements Lcom/google/android/gms/ads/internal/gmsg/zzv;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/cm;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/n;",
        "Lcom/google/android/gms/ads/internal/gmsg/zzv",
        "<",
        "Lcom/google/android/gms/internal/ads/qe;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/qe;

.field private final b:Landroid/content/Context;

.field private final c:Landroid/view/WindowManager;

.field private final d:Lcom/google/android/gms/internal/ads/arl;

.field private e:Landroid/util/DisplayMetrics;

.field private f:F

.field private g:I

.field private h:I

.field private i:I

.field private j:I

.field private k:I

.field private l:I

.field private m:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/qe;Landroid/content/Context;Lcom/google/android/gms/internal/ads/arl;)V
    .locals 1

    const/4 v0, -0x1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/n;-><init>(Lcom/google/android/gms/internal/ads/qe;)V

    iput v0, p0, Lcom/google/android/gms/internal/ads/m;->g:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/m;->h:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/m;->j:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/m;->k:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/m;->l:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/m;->m:I

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/m;->a:Lcom/google/android/gms/internal/ads/qe;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/m;->b:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/m;->d:Lcom/google/android/gms/internal/ads/arl;

    const-string v0, "window"

    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/m;->c:Landroid/view/WindowManager;

    return-void
.end method


# virtual methods
.method public final a(II)V
    .locals 3

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/m;->b:Landroid/content/Context;

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzek()Lcom/google/android/gms/internal/ads/jn;

    move-result-object v2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/m;->b:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/jn;->c(Landroid/app/Activity;)[I

    move-result-object v0

    aget v0, v0, v1

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/m;->a:Lcom/google/android/gms/internal/ads/qe;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/qe;->r()Lcom/google/android/gms/internal/ads/rs;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/m;->a:Lcom/google/android/gms/internal/ads/qe;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/qe;->r()Lcom/google/android/gms/internal/ads/rs;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/rs;->d()Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->a()Lcom/google/android/gms/internal/ads/lz;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/m;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/m;->a:Lcom/google/android/gms/internal/ads/qe;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/qe;->getWidth()I

    move-result v2

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/lz;->b(Landroid/content/Context;I)I

    move-result v1

    iput v1, p0, Lcom/google/android/gms/internal/ads/m;->l:I

    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->a()Lcom/google/android/gms/internal/ads/lz;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/m;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/m;->a:Lcom/google/android/gms/internal/ads/qe;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/qe;->getHeight()I

    move-result v2

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/lz;->b(Landroid/content/Context;I)I

    move-result v1

    iput v1, p0, Lcom/google/android/gms/internal/ads/m;->m:I

    :cond_1
    sub-int v0, p2, v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/m;->l:I

    iget v2, p0, Lcom/google/android/gms/internal/ads/m;->m:I

    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/google/android/gms/internal/ads/n;->b(IIII)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/m;->a:Lcom/google/android/gms/internal/ads/qe;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/qe;->t()Lcom/google/android/gms/internal/ads/rm;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/rm;->a(II)V

    return-void

    :cond_2
    move v0, v1

    goto :goto_0
.end method

.method public final synthetic zza(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 10

    const/4 v9, 0x2

    const/4 v8, 0x1

    const/4 v7, 0x0

    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/m;->e:Landroid/util/DisplayMetrics;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/m;->c:Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/m;->e:Landroid/util/DisplayMetrics;

    invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/m;->e:Landroid/util/DisplayMetrics;

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    iput v1, p0, Lcom/google/android/gms/internal/ads/m;->f:F

    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ads/m;->i:I

    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->a()Lcom/google/android/gms/internal/ads/lz;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/m;->e:Landroid/util/DisplayMetrics;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/m;->e:Landroid/util/DisplayMetrics;

    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/lz;->b(Landroid/util/DisplayMetrics;I)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ads/m;->g:I

    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->a()Lcom/google/android/gms/internal/ads/lz;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/m;->e:Landroid/util/DisplayMetrics;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/m;->e:Landroid/util/DisplayMetrics;

    iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/lz;->b(Landroid/util/DisplayMetrics;I)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ads/m;->h:I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/m;->a:Lcom/google/android/gms/internal/ads/qe;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/qe;->d()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    if-nez v1, :cond_2

    :cond_0
    iget v0, p0, Lcom/google/android/gms/internal/ads/m;->g:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/m;->j:I

    iget v0, p0, Lcom/google/android/gms/internal/ads/m;->h:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/m;->k:I

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/m;->a:Lcom/google/android/gms/internal/ads/qe;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/qe;->r()Lcom/google/android/gms/internal/ads/rs;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rs;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    iget v0, p0, Lcom/google/android/gms/internal/ads/m;->g:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/m;->l:I

    iget v0, p0, Lcom/google/android/gms/internal/ads/m;->h:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/m;->m:I

    :goto_1
    iget v1, p0, Lcom/google/android/gms/internal/ads/m;->g:I

    iget v2, p0, Lcom/google/android/gms/internal/ads/m;->h:I

    iget v3, p0, Lcom/google/android/gms/internal/ads/m;->j:I

    iget v4, p0, Lcom/google/android/gms/internal/ads/m;->k:I

    iget v5, p0, Lcom/google/android/gms/internal/ads/m;->f:F

    iget v6, p0, Lcom/google/android/gms/internal/ads/m;->i:I

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/n;->a(IIIIFI)V

    new-instance v0, Lcom/google/android/gms/internal/ads/l;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/l;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/m;->d:Lcom/google/android/gms/internal/ads/arl;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/arl;->a()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/l;->b(Z)Lcom/google/android/gms/internal/ads/l;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/m;->d:Lcom/google/android/gms/internal/ads/arl;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/arl;->b()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/l;->a(Z)Lcom/google/android/gms/internal/ads/l;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/m;->d:Lcom/google/android/gms/internal/ads/arl;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/arl;->d()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/l;->c(Z)Lcom/google/android/gms/internal/ads/l;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/m;->d:Lcom/google/android/gms/internal/ads/arl;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/arl;->c()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/l;->d(Z)Lcom/google/android/gms/internal/ads/l;

    move-result-object v0

    invoke-virtual {v0, v8}, Lcom/google/android/gms/internal/ads/l;->e(Z)Lcom/google/android/gms/internal/ads/l;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/j;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/internal/ads/j;-><init>(Lcom/google/android/gms/internal/ads/l;Lcom/google/android/gms/internal/ads/k;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/m;->a:Lcom/google/android/gms/internal/ads/qe;

    const-string v2, "onDeviceFeaturesReceived"

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/j;->a()Lorg/json/JSONObject;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Lcom/google/android/gms/internal/ads/qe;->a(Ljava/lang/String;Lorg/json/JSONObject;)V

    new-array v0, v9, [I

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/m;->a:Lcom/google/android/gms/internal/ads/qe;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/qe;->getLocationOnScreen([I)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->a()Lcom/google/android/gms/internal/ads/lz;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/m;->b:Landroid/content/Context;

    aget v2, v0, v7

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/lz;->b(Landroid/content/Context;I)I

    move-result v1

    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->a()Lcom/google/android/gms/internal/ads/lz;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/m;->b:Landroid/content/Context;

    aget v0, v0, v8

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/lz;->b(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/ads/m;->a(II)V

    invoke-static {v9}, Lcom/google/android/gms/internal/ads/je;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "Dispatching Ready Event."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/je;->d(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/m;->a:Lcom/google/android/gms/internal/ads/qe;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/qe;->i()Lcom/google/android/gms/internal/ads/zzang;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzang;->a:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/n;->b(Ljava/lang/String;)V

    return-void

    :cond_2
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzek()Lcom/google/android/gms/internal/ads/jn;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/jn;->a(Landroid/app/Activity;)[I

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->a()Lcom/google/android/gms/internal/ads/lz;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/m;->e:Landroid/util/DisplayMetrics;

    aget v2, v0, v7

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/lz;->b(Landroid/util/DisplayMetrics;I)I

    move-result v1

    iput v1, p0, Lcom/google/android/gms/internal/ads/m;->j:I

    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->a()Lcom/google/android/gms/internal/ads/lz;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/m;->e:Landroid/util/DisplayMetrics;

    aget v0, v0, v8

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/lz;->b(Landroid/util/DisplayMetrics;I)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ads/m;->k:I

    goto/16 :goto_0

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/m;->a:Lcom/google/android/gms/internal/ads/qe;

    invoke-interface {v0, v7, v7}, Lcom/google/android/gms/internal/ads/qe;->measure(II)V

    goto/16 :goto_1
.end method
