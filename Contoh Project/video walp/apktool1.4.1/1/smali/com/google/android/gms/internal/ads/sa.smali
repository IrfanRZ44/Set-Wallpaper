.class final Lcom/google/android/gms/internal/ads/sa;
.super Lcom/google/android/gms/internal/ads/sf;

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
.implements Landroid/webkit/DownloadListener;
.implements Lcom/google/android/gms/internal/ads/azi;
.implements Lcom/google/android/gms/internal/ads/qe;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/cm;
.end annotation

.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# instance fields
.field private A:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/view/View$OnClickListener;",
            ">;"
        }
    .end annotation
.end field

.field private B:Lcom/google/android/gms/ads/internal/overlay/zzd;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private C:Lcom/google/android/gms/internal/ads/ly;

.field private D:I

.field private E:I

.field private F:I

.field private G:I

.field private H:F

.field private I:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/pp;",
            ">;"
        }
    .end annotation
.end field

.field private final J:Landroid/view/WindowManager;

.field private final b:Lcom/google/android/gms/internal/ads/agw;

.field private final c:Lcom/google/android/gms/internal/ads/zzang;

.field private final d:Lcom/google/android/gms/ads/internal/zzbo;

.field private final e:Lcom/google/android/gms/ads/internal/zzw;

.field private f:Lcom/google/android/gms/internal/ads/rt;

.field private g:Lcom/google/android/gms/ads/internal/overlay/zzd;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private h:Lcom/google/android/gms/internal/ads/rs;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private i:Ljava/lang/String;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private j:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private k:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private l:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private m:I
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private n:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private o:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private p:Ljava/lang/String;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private q:Lcom/google/android/gms/internal/ads/qu;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private r:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private s:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private t:Lcom/google/android/gms/internal/ads/ato;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private u:I
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private v:I
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private w:Lcom/google/android/gms/internal/ads/asl;

.field private x:Lcom/google/android/gms/internal/ads/asl;

.field private y:Lcom/google/android/gms/internal/ads/asl;

.field private z:Lcom/google/android/gms/internal/ads/asm;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/rr;Lcom/google/android/gms/internal/ads/rs;Ljava/lang/String;ZZLcom/google/android/gms/internal/ads/agw;Lcom/google/android/gms/internal/ads/zzang;Lcom/google/android/gms/internal/ads/asn;Lcom/google/android/gms/ads/internal/zzbo;Lcom/google/android/gms/ads/internal/zzw;Lcom/google/android/gms/internal/ads/amj;)V
    .locals 5

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/sf;-><init>(Lcom/google/android/gms/internal/ads/rr;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/sa;->n:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/sa;->o:Z

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->p:Ljava/lang/String;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/sa;->D:I

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/sa;->E:I

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/sa;->F:I

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/sa;->G:I

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/sa;->h:Lcom/google/android/gms/internal/ads/rs;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/sa;->i:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/google/android/gms/internal/ads/sa;->k:Z

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/sa;->m:I

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/sa;->b:Lcom/google/android/gms/internal/ads/agw;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/sa;->c:Lcom/google/android/gms/internal/ads/zzang;

    iput-object p9, p0, Lcom/google/android/gms/internal/ads/sa;->d:Lcom/google/android/gms/ads/internal/zzbo;

    iput-object p10, p0, Lcom/google/android/gms/internal/ads/sa;->e:Lcom/google/android/gms/ads/internal/zzw;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/sa;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->J:Landroid/view/WindowManager;

    new-instance v0, Lcom/google/android/gms/internal/ads/ly;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/sc;->I()Lcom/google/android/gms/internal/ads/rr;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/rr;->a()Landroid/app/Activity;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, p0, p0, v2}, Lcom/google/android/gms/internal/ads/ly;-><init>(Landroid/app/Activity;Landroid/view/View;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->C:Lcom/google/android/gms/internal/ads/ly;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzek()Lcom/google/android/gms/internal/ads/jn;

    move-result-object v0

    iget-object v1, p7, Lcom/google/android/gms/internal/ads/zzang;->a:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/sa;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/google/android/gms/internal/ads/jn;->a(Landroid/content/Context;Ljava/lang/String;Landroid/webkit/WebSettings;)V

    invoke-virtual {p0, p0}, Lcom/google/android/gms/internal/ads/sa;->setDownloadListener(Landroid/webkit/DownloadListener;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/sc;->I()Lcom/google/android/gms/internal/ads/rr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rr;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    iput v0, p0, Lcom/google/android/gms/internal/ads/sa;->H:F

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/sa;->M()V

    invoke-static {}, Lcom/google/android/gms/common/util/k;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/qx;->a(Lcom/google/android/gms/internal/ads/qe;)Lcom/google/android/gms/internal/ads/qx;

    move-result-object v0

    const-string v1, "googleAdsJsInterface"

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/ads/sc;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/sa;->Q()V

    new-instance v0, Lcom/google/android/gms/internal/ads/asm;

    new-instance v1, Lcom/google/android/gms/internal/ads/asn;

    const/4 v2, 0x1

    const-string v3, "make_wv"

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/sa;->i:Ljava/lang/String;

    invoke-direct {v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/asn;-><init>(ZLjava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/asm;-><init>(Lcom/google/android/gms/internal/ads/asn;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->z:Lcom/google/android/gms/internal/ads/asm;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->z:Lcom/google/android/gms/internal/ads/asm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/asm;->a()Lcom/google/android/gms/internal/ads/asn;

    move-result-object v0

    invoke-virtual {v0, p8}, Lcom/google/android/gms/internal/ads/asn;->a(Lcom/google/android/gms/internal/ads/asn;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->z:Lcom/google/android/gms/internal/ads/asm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/asm;->a()Lcom/google/android/gms/internal/ads/asn;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/asg;->a(Lcom/google/android/gms/internal/ads/asn;)Lcom/google/android/gms/internal/ads/asl;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->x:Lcom/google/android/gms/internal/ads/asl;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->z:Lcom/google/android/gms/internal/ads/asm;

    const-string v1, "native:view_create"

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/sa;->x:Lcom/google/android/gms/internal/ads/asl;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/asm;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/asl;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->y:Lcom/google/android/gms/internal/ads/asl;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->w:Lcom/google/android/gms/internal/ads/asl;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzem()Lcom/google/android/gms/internal/ads/jt;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/jt;->b(Landroid/content/Context;)V

    return-void
.end method

.method private final K()Z
    .locals 9

    const/4 v6, 0x1

    const/4 v5, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->f:Lcom/google/android/gms/internal/ads/rt;

    check-cast v0, Lcom/google/android/gms/internal/ads/rt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rt;->b()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->f:Lcom/google/android/gms/internal/ads/rt;

    check-cast v0, Lcom/google/android/gms/internal/ads/rt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rt;->c()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return v5

    :cond_1
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzek()Lcom/google/android/gms/internal/ads/jn;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->J:Landroid/view/WindowManager;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/jn;->a(Landroid/view/WindowManager;)Landroid/util/DisplayMetrics;

    move-result-object v8

    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->a()Lcom/google/android/gms/internal/ads/lz;

    iget v0, v8, Landroid/util/DisplayMetrics;->widthPixels:I

    invoke-static {v8, v0}, Lcom/google/android/gms/internal/ads/lz;->b(Landroid/util/DisplayMetrics;I)I

    move-result v1

    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->a()Lcom/google/android/gms/internal/ads/lz;

    iget v0, v8, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v8, v0}, Lcom/google/android/gms/internal/ads/lz;->b(Landroid/util/DisplayMetrics;I)I

    move-result v2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/sc;->I()Lcom/google/android/gms/internal/ads/rr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rr;->a()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v3

    if-nez v3, :cond_5

    :cond_2
    move v4, v2

    move v3, v1

    :goto_1
    iget v0, p0, Lcom/google/android/gms/internal/ads/sa;->E:I

    if-ne v0, v1, :cond_3

    iget v0, p0, Lcom/google/android/gms/internal/ads/sa;->D:I

    if-ne v0, v2, :cond_3

    iget v0, p0, Lcom/google/android/gms/internal/ads/sa;->F:I

    if-ne v0, v3, :cond_3

    iget v0, p0, Lcom/google/android/gms/internal/ads/sa;->G:I

    if-eq v0, v4, :cond_0

    :cond_3
    iget v0, p0, Lcom/google/android/gms/internal/ads/sa;->E:I

    if-ne v0, v1, :cond_4

    iget v0, p0, Lcom/google/android/gms/internal/ads/sa;->D:I

    if-eq v0, v2, :cond_6

    :cond_4
    move v7, v6

    :goto_2
    iput v1, p0, Lcom/google/android/gms/internal/ads/sa;->E:I

    iput v2, p0, Lcom/google/android/gms/internal/ads/sa;->D:I

    iput v3, p0, Lcom/google/android/gms/internal/ads/sa;->F:I

    iput v4, p0, Lcom/google/android/gms/internal/ads/sa;->G:I

    new-instance v0, Lcom/google/android/gms/internal/ads/n;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/n;-><init>(Lcom/google/android/gms/internal/ads/qe;)V

    iget v5, v8, Landroid/util/DisplayMetrics;->density:F

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/sa;->J:Landroid/view/WindowManager;

    invoke-interface {v6}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/Display;->getRotation()I

    move-result v6

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/n;->a(IIIIFI)V

    move v5, v7

    goto :goto_0

    :cond_5
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzek()Lcom/google/android/gms/internal/ads/jn;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/jn;->a(Landroid/app/Activity;)[I

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->a()Lcom/google/android/gms/internal/ads/lz;

    aget v3, v0, v5

    invoke-static {v8, v3}, Lcom/google/android/gms/internal/ads/lz;->b(Landroid/util/DisplayMetrics;I)I

    move-result v3

    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->a()Lcom/google/android/gms/internal/ads/lz;

    aget v0, v0, v6

    invoke-static {v8, v0}, Lcom/google/android/gms/internal/ads/lz;->b(Landroid/util/DisplayMetrics;I)I

    move-result v4

    goto :goto_1

    :cond_6
    move v7, v5

    goto :goto_2
.end method

.method private final L()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->z:Lcom/google/android/gms/internal/ads/asm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/asm;->a()Lcom/google/android/gms/internal/ads/asn;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/sa;->x:Lcom/google/android/gms/internal/ads/asl;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "aeh2"

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/asg;->a(Lcom/google/android/gms/internal/ads/asn;Lcom/google/android/gms/internal/ads/asl;[Ljava/lang/String;)Z

    return-void
.end method

.method private final declared-synchronized M()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/sa;->k:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->h:Lcom/google/android/gms/internal/ads/rs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rs;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const-string v0, "Enabling hardware acceleration on an overlay."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/je;->b(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/sa;->O()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-ge v0, v1, :cond_2

    const-string v0, "Disabling hardware acceleration on an AdView."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/je;->b(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/sa;->N()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_2
    :try_start_2
    const-string v0, "Enabling hardware acceleration on an AdView."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/je;->b(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/sa;->O()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method

.method private final declared-synchronized N()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/sa;->l:Z

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzem()Lcom/google/android/gms/internal/ads/jt;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/jt;->c(Landroid/view/View;)Z

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/sa;->l:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private final declared-synchronized O()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/sa;->l:Z

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzem()Lcom/google/android/gms/internal/ads/jt;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/jt;->b(Landroid/view/View;)Z

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/sa;->l:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private final declared-synchronized P()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->I:Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private final Q()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->z:Lcom/google/android/gms/internal/ads/asm;

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->z:Lcom/google/android/gms/internal/ads/asm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/asm;->a()Lcom/google/android/gms/internal/ads/asn;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzeo()Lcom/google/android/gms/internal/ads/io;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/io;->b()Lcom/google/android/gms/internal/ads/asd;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzeo()Lcom/google/android/gms/internal/ads/io;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/io;->b()Lcom/google/android/gms/internal/ads/asd;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/asd;->a(Lcom/google/android/gms/internal/ads/asn;)Z

    goto :goto_0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/sa;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/sa;->v:I

    return v0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/sa;I)I
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/sa;->v:I

    return p1
.end method

.method static a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/rs;Ljava/lang/String;ZZLcom/google/android/gms/internal/ads/agw;Lcom/google/android/gms/internal/ads/zzang;Lcom/google/android/gms/internal/ads/asn;Lcom/google/android/gms/ads/internal/zzbo;Lcom/google/android/gms/ads/internal/zzw;Lcom/google/android/gms/internal/ads/amj;)Lcom/google/android/gms/internal/ads/sa;
    .locals 12

    new-instance v1, Lcom/google/android/gms/internal/ads/rr;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/rr;-><init>(Landroid/content/Context;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/sa;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v0 .. v11}, Lcom/google/android/gms/internal/ads/sa;-><init>(Lcom/google/android/gms/internal/ads/rr;Lcom/google/android/gms/internal/ads/rs;Ljava/lang/String;ZZLcom/google/android/gms/internal/ads/agw;Lcom/google/android/gms/internal/ads/zzang;Lcom/google/android/gms/internal/ads/asn;Lcom/google/android/gms/ads/internal/zzbo;Lcom/google/android/gms/ads/internal/zzw;Lcom/google/android/gms/internal/ads/amj;)V

    return-object v0
.end method

.method private final g(Z)V
    .locals 3

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v2, "isVisible"

    if-eqz p1, :cond_0

    const-string v0, "1"

    :goto_0
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "onAdVisibilityChanged"

    invoke-static {p0, v0, v1}, Lcom/google/android/gms/internal/ads/azj;->a(Lcom/google/android/gms/internal/ads/azi;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_0
    const-string v0, "0"

    goto :goto_0
.end method


# virtual methods
.method public final declared-synchronized A()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/sa;->n:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized B()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/sa;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized C()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/google/android/gms/internal/ads/sa;->u:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    monitor-exit p0

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final D()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->C:Lcom/google/android/gms/internal/ads/ly;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ly;->a()V

    return-void
.end method

.method public final E()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->y:Lcom/google/android/gms/internal/ads/asl;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->z:Lcom/google/android/gms/internal/ads/asm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/asm;->a()Lcom/google/android/gms/internal/ads/asn;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/asg;->a(Lcom/google/android/gms/internal/ads/asn;)Lcom/google/android/gms/internal/ads/asl;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->y:Lcom/google/android/gms/internal/ads/asl;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->z:Lcom/google/android/gms/internal/ads/asm;

    const-string v1, "native:view_load"

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/sa;->y:Lcom/google/android/gms/internal/ads/asl;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/asm;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/asl;)V

    :cond_0
    return-void
.end method

.method public final declared-synchronized F()Lcom/google/android/gms/internal/ads/ato;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->t:Lcom/google/android/gms/internal/ads/ato;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final G()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/sa;->setBackgroundColor(I)V

    return-void
.end method

.method public final H()V
    .locals 1

    const-string v0, "Cannot add text view to inner AdWebView"

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/je;->a(Ljava/lang/String;)V

    return-void
.end method

.method public final a()Lcom/google/android/gms/internal/ads/ou;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final a(I)V
    .locals 5

    if-nez p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->z:Lcom/google/android/gms/internal/ads/asm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/asm;->a()Lcom/google/android/gms/internal/ads/asn;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/sa;->x:Lcom/google/android/gms/internal/ads/asl;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "aebb2"

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/asg;->a(Lcom/google/android/gms/internal/ads/asn;Lcom/google/android/gms/internal/ads/asl;[Ljava/lang/String;)Z

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/sa;->L()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->z:Lcom/google/android/gms/internal/ads/asm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/asm;->a()Lcom/google/android/gms/internal/ads/asn;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->z:Lcom/google/android/gms/internal/ads/asm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/asm;->a()Lcom/google/android/gms/internal/ads/asn;

    move-result-object v0

    const-string v1, "close_type"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/asn;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    const-string v1, "closetype"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "version"

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/sa;->c:Lcom/google/android/gms/internal/ads/zzang;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzang;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "onhide"

    invoke-static {p0, v1, v0}, Lcom/google/android/gms/internal/ads/azj;->a(Lcom/google/android/gms/internal/ads/azi;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final a(Landroid/content/Context;)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/sc;->I()Lcom/google/android/gms/internal/ads/rr;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/rr;->setBaseContext(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->C:Lcom/google/android/gms/internal/ads/ly;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/sc;->I()Lcom/google/android/gms/internal/ads/rr;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/rr;->a()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/ly;->a(Landroid/app/Activity;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/ads/internal/overlay/zzc;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->f:Lcom/google/android/gms/internal/ads/rt;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/rt;->a(Lcom/google/android/gms/ads/internal/overlay/zzc;)V

    return-void
.end method

.method public final declared-synchronized a(Lcom/google/android/gms/ads/internal/overlay/zzd;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/sa;->g:Lcom/google/android/gms/ads/internal/overlay/zzd;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final a(Lcom/google/android/gms/internal/ads/akj;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p1, Lcom/google/android/gms/internal/ads/akj;->a:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/sa;->r:Z

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-boolean v0, p1, Lcom/google/android/gms/internal/ads/akj;->a:Z

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/sa;->g(Z)V

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized a(Lcom/google/android/gms/internal/ads/ato;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/sa;->t:Lcom/google/android/gms/internal/ads/ato;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized a(Lcom/google/android/gms/internal/ads/qu;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->q:Lcom/google/android/gms/internal/ads/qu;

    if-eqz v0, :cond_0

    const-string v0, "Attempt to create multiple AdWebViewVideoControllers."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/je;->c(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/sa;->q:Lcom/google/android/gms/internal/ads/qu;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized a(Lcom/google/android/gms/internal/ads/rs;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/sa;->h:Lcom/google/android/gms/internal/ads/rs;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/sa;->requestLayout()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final a(Lcom/google/android/gms/internal/ads/rt;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/sa;->f:Lcom/google/android/gms/internal/ads/rt;

    return-void
.end method

.method public final declared-synchronized a(Ljava/lang/String;)V
    .locals 1

    monitor-enter p0

    if-nez p1, :cond_0

    :try_start_0
    const-string p1, ""

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/sa;->p:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final a(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V
    .locals 1
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

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->f:Lcom/google/android/gms/internal/ads/rt;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->f:Lcom/google/android/gms/internal/ads/rt;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/azm;->a(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/String;Lcom/google/android/gms/common/util/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/common/util/l",
            "<",
            "Lcom/google/android/gms/ads/internal/gmsg/zzv",
            "<-",
            "Lcom/google/android/gms/internal/ads/qe;",
            ">;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->f:Lcom/google/android/gms/internal/ads/rt;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->f:Lcom/google/android/gms/internal/ads/rt;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/azm;->a(Ljava/lang/String;Lcom/google/android/gms/common/util/l;)V

    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ads/azj;->a(Lcom/google/android/gms/internal/ads/azi;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final declared-synchronized a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/asa;->aB:Lcom/google/android/gms/internal/ads/arq;

    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->f()Lcom/google/android/gms/internal/ads/ary;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/ary;->a(Lcom/google/android/gms/internal/ads/arq;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {}, Lcom/google/android/gms/internal/ads/rg;->a()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/ads/rg;->a(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :goto_0
    const-string v3, "text/html"

    const-string v4, "UTF-8"

    move-object v0, p0

    move-object v1, p1

    move-object v5, p3

    invoke-super/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/sf;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    move-object v2, p2

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
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

.method public final a(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->f:Lcom/google/android/gms/internal/ads/rt;

    check-cast v0, Lcom/google/android/gms/internal/ads/rt;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/rt;->a(Z)V

    return-void
.end method

.method public final a(ZI)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->f:Lcom/google/android/gms/internal/ads/rt;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/rt;->a(ZI)V

    return-void
.end method

.method public final a(ZILjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->f:Lcom/google/android/gms/internal/ads/rt;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/rt;->a(ZILjava/lang/String;)V

    return-void
.end method

.method public final a(ZILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->f:Lcom/google/android/gms/internal/ads/rt;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/rt;->a(ZILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final declared-synchronized b()Lcom/google/android/gms/internal/ads/qu;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->q:Lcom/google/android/gms/internal/ads/qu;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized b(Lcom/google/android/gms/ads/internal/overlay/zzd;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/sa;->B:Lcom/google/android/gms/ads/internal/overlay/zzd;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized b(Ljava/lang/String;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/sf;->y()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Lcom/google/android/gms/internal/ads/sf;->b(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    const-string v0, "The webview is destroyed. Ignoring action."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/je;->e(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final b(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V
    .locals 1
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

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->f:Lcom/google/android/gms/internal/ads/rt;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->f:Lcom/google/android/gms/internal/ads/rt;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/azm;->b(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ads/azj;->a(Lcom/google/android/gms/internal/ads/azi;Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public final declared-synchronized b(Z)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/sa;->k:Z

    if-eq p1, v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/sa;->k:Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/sa;->M()V

    if-eqz v0, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/ads/n;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/n;-><init>(Lcom/google/android/gms/internal/ads/qe;)V

    if-eqz p1, :cond_2

    const-string v0, "expanded"

    :goto_1
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/n;->c(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    :try_start_1
    const-string v0, "default"
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final c()Lcom/google/android/gms/internal/ads/asl;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->x:Lcom/google/android/gms/internal/ads/asl;

    return-object v0
.end method

.method public final declared-synchronized c(Z)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->g:Lcom/google/android/gms/ads/internal/overlay/zzd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->g:Lcom/google/android/gms/ads/internal/overlay/zzd;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/sa;->f:Lcom/google/android/gms/internal/ads/rt;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/rt;->b()Z

    move-result v1

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/ads/internal/overlay/zzd;->zza(ZZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/sa;->j:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final d()Landroid/app/Activity;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/sc;->I()Lcom/google/android/gms/internal/ads/rr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rr;->a()Landroid/app/Activity;

    move-result-object v0

    return-object v0
.end method

.method public final declared-synchronized d(Z)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/sa;->n:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final e()Lcom/google/android/gms/ads/internal/zzw;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->e:Lcom/google/android/gms/ads/internal/zzw;

    return-object v0
.end method

.method public final declared-synchronized e(Z)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget v1, p0, Lcom/google/android/gms/internal/ads/sa;->u:I

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    :goto_0
    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/ads/sa;->u:I

    iget v0, p0, Lcom/google/android/gms/internal/ads/sa;->u:I

    if-gtz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->g:Lcom/google/android/gms/ads/internal/overlay/zzd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->g:Lcom/google/android/gms/ads/internal/overlay/zzd;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/overlay/zzd;->zznq()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :cond_1
    const/4 v0, -0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final f()V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/sa;->p()Lcom/google/android/gms/ads/internal/overlay/zzd;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/overlay/zzd;->zznp()V

    :cond_0
    return-void
.end method

.method protected final declared-synchronized f(Z)V
    .locals 1

    monitor-enter p0

    if-nez p1, :cond_0

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/sa;->Q()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->C:Lcom/google/android/gms/internal/ads/ly;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ly;->b()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->g:Lcom/google/android/gms/ads/internal/overlay/zzd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->g:Lcom/google/android/gms/ads/internal/overlay/zzd;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/overlay/zzd;->close()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->g:Lcom/google/android/gms/ads/internal/overlay/zzd;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/overlay/zzd;->onDestroy()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->g:Lcom/google/android/gms/ads/internal/overlay/zzd;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->f:Lcom/google/android/gms/internal/ads/rt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/azm;->k()V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzff()Lcom/google/android/gms/internal/ads/po;

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/po;->a(Lcom/google/android/gms/internal/ads/pd;)Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/sa;->P()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized g()Ljava/lang/String;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->p:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final getOnClickListener()Landroid/view/View$OnClickListener;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->A:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View$OnClickListener;

    return-object v0
.end method

.method public final declared-synchronized getRequestedOrientation()I
    .locals 1

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/google/android/gms/internal/ads/sa;->m:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final getView()Landroid/view/View;
    .locals 0

    return-object p0
.end method

.method public final getWebView()Landroid/webkit/WebView;
    .locals 0

    return-object p0
.end method

.method public final h()Lcom/google/android/gms/internal/ads/asm;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->z:Lcom/google/android/gms/internal/ads/asm;

    return-object v0
.end method

.method public final i()Lcom/google/android/gms/internal/ads/zzang;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->c:Lcom/google/android/gms/internal/ads/zzang;

    return-object v0
.end method

.method public final j()I
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/sa;->getMeasuredHeight()I

    move-result v0

    return v0
.end method

.method public final k()I
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/sa;->getMeasuredWidth()I

    move-result v0

    return v0
.end method

.method public final l()V
    .locals 3

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/sa;->L()V

    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    const-string v1, "version"

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/sa;->c:Lcom/google/android/gms/internal/ads/zzang;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzang;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "onhide"

    invoke-static {p0, v1, v0}, Lcom/google/android/gms/internal/ads/azj;->a(Lcom/google/android/gms/internal/ads/azi;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final m()V
    .locals 6

    const/4 v5, 0x1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->w:Lcom/google/android/gms/internal/ads/asl;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->z:Lcom/google/android/gms/internal/ads/asm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/asm;->a()Lcom/google/android/gms/internal/ads/asn;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/sa;->x:Lcom/google/android/gms/internal/ads/asl;

    new-array v2, v5, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "aes2"

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/asg;->a(Lcom/google/android/gms/internal/ads/asn;Lcom/google/android/gms/internal/ads/asl;[Ljava/lang/String;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->z:Lcom/google/android/gms/internal/ads/asm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/asm;->a()Lcom/google/android/gms/internal/ads/asn;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/asg;->a(Lcom/google/android/gms/internal/ads/asn;)Lcom/google/android/gms/internal/ads/asl;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->w:Lcom/google/android/gms/internal/ads/asl;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->z:Lcom/google/android/gms/internal/ads/asm;

    const-string v1, "native:view_show"

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/sa;->w:Lcom/google/android/gms/internal/ads/asl;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/asm;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/asl;)V

    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, v5}, Ljava/util/HashMap;-><init>(I)V

    const-string v1, "version"

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/sa;->c:Lcom/google/android/gms/internal/ads/zzang;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzang;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "onshow"

    invoke-static {p0, v1, v0}, Lcom/google/android/gms/internal/ads/azj;->a(Lcom/google/android/gms/internal/ads/azi;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final n()V
    .locals 3

    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    const-string v1, "app_muted"

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzfj()Lcom/google/android/gms/internal/ads/kf;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/kf;->b()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "app_volume"

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzfj()Lcom/google/android/gms/internal/ads/kf;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/kf;->a()F

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "device_volume"

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/sa;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/kf;->a(Landroid/content/Context;)F

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "volume"

    invoke-static {p0, v1, v0}, Lcom/google/android/gms/internal/ads/azj;->a(Lcom/google/android/gms/internal/ads/azi;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final o()Landroid/content/Context;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/sc;->I()Lcom/google/android/gms/internal/ads/rr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rr;->b()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method protected final declared-synchronized onAttachedToWindow()V
    .locals 4

    const/4 v3, 0x0

    const/4 v1, 0x1

    monitor-enter p0

    :try_start_0
    invoke-super {p0}, Lcom/google/android/gms/internal/ads/sf;->onAttachedToWindow()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/sf;->y()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->C:Lcom/google/android/gms/internal/ads/ly;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ly;->c()V

    :cond_0
    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/sa;->r:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->f:Lcom/google/android/gms/internal/ads/rt;

    check-cast v0, Lcom/google/android/gms/internal/ads/rt;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->f:Lcom/google/android/gms/internal/ads/rt;

    check-cast v0, Lcom/google/android/gms/internal/ads/rt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rt;->c()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/sa;->s:Z

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->f:Lcom/google/android/gms/internal/ads/rt;

    check-cast v0, Lcom/google/android/gms/internal/ads/rt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rt;->d()Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzfg()Lcom/google/android/gms/internal/ads/nx;

    if-nez p0, :cond_1

    throw v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_1
    :try_start_1
    invoke-static {p0, v0}, Lcom/google/android/gms/internal/ads/nx;->a(Landroid/view/View;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->f:Lcom/google/android/gms/internal/ads/rt;

    check-cast v0, Lcom/google/android/gms/internal/ads/rt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rt;->e()Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzfg()Lcom/google/android/gms/internal/ads/nx;

    if-nez p0, :cond_3

    throw v3

    :cond_3
    invoke-static {p0, v0}, Lcom/google/android/gms/internal/ads/nx;->a(Landroid/view/View;Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    :cond_4
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/sa;->s:Z

    :cond_5
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/sa;->K()Z

    move v0, v1

    :goto_0
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/sa;->g(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :cond_6
    move v0, v2

    goto :goto_0
.end method

.method protected final onDetachedFromWindow()V
    .locals 4

    const/4 v3, 0x0

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/sf;->y()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->C:Lcom/google/android/gms/internal/ads/ly;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ly;->d()V

    :cond_0
    invoke-super {p0}, Lcom/google/android/gms/internal/ads/sf;->onDetachedFromWindow()V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/sa;->s:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->f:Lcom/google/android/gms/internal/ads/rt;

    check-cast v0, Lcom/google/android/gms/internal/ads/rt;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->f:Lcom/google/android/gms/internal/ads/rt;

    check-cast v0, Lcom/google/android/gms/internal/ads/rt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rt;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/sa;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/sa;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->f:Lcom/google/android/gms/internal/ads/rt;

    check-cast v0, Lcom/google/android/gms/internal/ads/rt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rt;->d()Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzem()Lcom/google/android/gms/internal/ads/jt;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/sa;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/ads/jt;->a(Landroid/view/ViewTreeObserver;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->f:Lcom/google/android/gms/internal/ads/rt;

    check-cast v0, Lcom/google/android/gms/internal/ads/rt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rt;->e()Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/sa;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/ViewTreeObserver;->removeOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/sa;->s:Z

    :cond_3
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-direct {p0, v3}, Lcom/google/android/gms/internal/ads/sa;->g(Z)V

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final onDownloadStart(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 2

    :try_start_0
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1, p4}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzek()Lcom/google/android/gms/internal/ads/jn;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/sa;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/jn;->a(Landroid/content/Context;Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x33

    invoke-static {p4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "Couldn\'t find an Activity to view url/mimetype: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " / "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/je;->b(Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected final onDraw(Landroid/graphics/Canvas;)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/sa;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/ads/sf;->onDraw(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->f:Lcom/google/android/gms/internal/ads/rt;

    check-cast v0, Lcom/google/android/gms/internal/ads/rt;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->f:Lcom/google/android/gms/internal/ads/rt;

    check-cast v0, Lcom/google/android/gms/internal/ads/rt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rt;->l()Lcom/google/android/gms/internal/ads/rq;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->f:Lcom/google/android/gms/internal/ads/rt;

    check-cast v0, Lcom/google/android/gms/internal/ads/rt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rt;->l()Lcom/google/android/gms/internal/ads/rq;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rq;->a()V

    goto :goto_0
.end method

.method public final onGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 7

    const/4 v6, 0x1

    const/4 v5, -0x1

    const/4 v4, 0x0

    sget-object v0, Lcom/google/android/gms/internal/ads/asa;->ay:Lcom/google/android/gms/internal/ads/arq;

    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->f()Lcom/google/android/gms/internal/ads/ary;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/ary;->a(Lcom/google/android/gms/internal/ads/arq;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    const/16 v0, 0x9

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v0

    const/16 v1, 0xa

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    const/16 v3, 0x8

    if-ne v2, v3, :cond_4

    cmpl-float v2, v0, v4

    if-lez v2, :cond_0

    invoke-virtual {p0, v5}, Lcom/google/android/gms/internal/ads/sa;->canScrollVertically(I)Z

    move-result v2

    if-eqz v2, :cond_3

    :cond_0
    cmpg-float v0, v0, v4

    if-gez v0, :cond_1

    invoke-virtual {p0, v6}, Lcom/google/android/gms/internal/ads/sa;->canScrollVertically(I)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_1
    cmpl-float v0, v1, v4

    if-lez v0, :cond_2

    invoke-virtual {p0, v5}, Lcom/google/android/gms/internal/ads/sa;->canScrollHorizontally(I)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    cmpg-float v0, v1, v4

    if-gez v0, :cond_4

    invoke-virtual {p0, v6}, Lcom/google/android/gms/internal/ads/sa;->canScrollHorizontally(I)Z

    move-result v0

    if-nez v0, :cond_4

    :cond_3
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_4
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/ads/sf;->onGenericMotionEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public final onGlobalLayout()V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/sa;->K()Z

    move-result v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/sa;->p()Lcom/google/android/gms/ads/internal/overlay/zzd;

    move-result-object v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/ads/internal/overlay/zzd;->zznn()V

    :cond_0
    return-void
.end method

.method protected final declared-synchronized onMeasure(II)V
    .locals 10
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DrawAllocation"
        }
    .end annotation

    const/16 v9, 0x8

    const/4 v2, 0x1

    const/high16 v8, -0x8000

    const/4 v1, 0x0

    const/4 v3, 0x0

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/sf;->y()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/ads/sa;->setMeasuredDimension(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/sa;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/sa;->k:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->h:Lcom/google/android/gms/internal/ads/rs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rs;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    invoke-super {p0, p1, p2}, Lcom/google/android/gms/internal/ads/sf;->onMeasure(II)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_2
    :try_start_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->h:Lcom/google/android/gms/internal/ads/rs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rs;->f()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/sa;->b()Lcom/google/android/gms/internal/ads/qu;

    move-result-object v0

    if-eqz v0, :cond_17

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/qu;->e()F

    move-result v0

    move v4, v0

    :goto_1
    cmpl-float v0, v4, v1

    if-nez v0, :cond_3

    invoke-super {p0, p1, p2}, Lcom/google/android/gms/internal/ads/sf;->onMeasure(II)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v3

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v2

    int-to-float v0, v2

    mul-float/2addr v0, v4

    float-to-int v1, v0

    int-to-float v0, v3

    div-float/2addr v0, v4

    float-to-int v0, v0

    if-nez v2, :cond_5

    if-eqz v0, :cond_5

    int-to-float v1, v0

    mul-float/2addr v1, v4

    float-to-int v1, v1

    move v2, v0

    :cond_4
    :goto_2
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/ads/sa;->setMeasuredDimension(II)V

    goto :goto_0

    :cond_5
    if-nez v3, :cond_4

    if-eqz v1, :cond_4

    int-to-float v0, v1

    div-float/2addr v0, v4

    float-to-int v0, v0

    move v3, v1

    goto :goto_2

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->h:Lcom/google/android/gms/internal/ads/rs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rs;->c()Z

    move-result v0

    if-eqz v0, :cond_9

    sget-object v0, Lcom/google/android/gms/internal/ads/asa;->cm:Lcom/google/android/gms/internal/ads/arq;

    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->f()Lcom/google/android/gms/internal/ads/ary;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/ary;->a(Lcom/google/android/gms/internal/ads/arq;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_7

    invoke-static {}, Lcom/google/android/gms/common/util/k;->e()Z

    move-result v0

    if-nez v0, :cond_8

    :cond_7
    invoke-super {p0, p1, p2}, Lcom/google/android/gms/internal/ads/sf;->onMeasure(II)V

    goto/16 :goto_0

    :cond_8
    const-string v0, "/contentHeight"

    new-instance v1, Lcom/google/android/gms/internal/ads/sb;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/sb;-><init>(Lcom/google/android/gms/internal/ads/sa;)V

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/ads/sa;->a(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    const-string v0, "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = \'gmsg://mobileads.google.com/contentHeight?\';  url += \'height=\' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById(\'afma-notify-fluid\');    if (!frame) {      frame = document.createElement(\'IFRAME\');      frame.id = \'afma-notify-fluid\';      frame.style.display = \'none\';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/sc;->b(Ljava/lang/String;)V

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    iget v0, p0, Lcom/google/android/gms/internal/ads/sa;->v:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lcom/google/android/gms/internal/ads/sa;->v:I

    int-to-float v0, v0

    iget v2, p0, Lcom/google/android/gms/internal/ads/sa;->H:F

    mul-float/2addr v0, v2

    float-to-int v0, v0

    :goto_3
    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/ads/sa;->setMeasuredDimension(II)V

    goto/16 :goto_0

    :pswitch_0
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    goto :goto_3

    :cond_9
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->h:Lcom/google/android/gms/internal/ads/rs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rs;->d()Z

    move-result v0

    if-eqz v0, :cond_a

    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/sa;->J:Landroid/view/WindowManager;

    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/ads/sa;->setMeasuredDimension(II)V

    goto/16 :goto_0

    :cond_a
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v7

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v4

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v5

    const v0, 0x7fffffff

    if-eq v1, v8, :cond_b

    const/high16 v6, 0x4000

    if-ne v1, v6, :cond_16

    :cond_b
    move v6, v7

    :goto_4
    const v0, 0x7fffffff

    if-eq v4, v8, :cond_c

    const/high16 v1, 0x4000

    if-ne v4, v1, :cond_15

    :cond_c
    move v4, v5

    :goto_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->h:Lcom/google/android/gms/internal/ads/rs;

    iget v0, v0, Lcom/google/android/gms/internal/ads/rs;->b:I

    if-gt v0, v6, :cond_d

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->h:Lcom/google/android/gms/internal/ads/rs;

    iget v0, v0, Lcom/google/android/gms/internal/ads/rs;->a:I

    if-le v0, v4, :cond_f

    :cond_d
    move v1, v2

    :goto_6
    sget-object v0, Lcom/google/android/gms/internal/ads/asa;->dh:Lcom/google/android/gms/internal/ads/arq;

    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->f()Lcom/google/android/gms/internal/ads/ary;

    move-result-object v8

    invoke-virtual {v8, v0}, Lcom/google/android/gms/internal/ads/ary;->a(Lcom/google/android/gms/internal/ads/arq;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_12

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->h:Lcom/google/android/gms/internal/ads/rs;

    iget v0, v0, Lcom/google/android/gms/internal/ads/rs;->b:I

    int-to-float v0, v0

    iget v8, p0, Lcom/google/android/gms/internal/ads/sa;->H:F

    div-float/2addr v0, v8

    int-to-float v6, v6

    iget v8, p0, Lcom/google/android/gms/internal/ads/sa;->H:F

    div-float/2addr v6, v8

    cmpl-float v0, v0, v6

    if-gtz v0, :cond_10

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->h:Lcom/google/android/gms/internal/ads/rs;

    iget v0, v0, Lcom/google/android/gms/internal/ads/rs;->a:I

    int-to-float v0, v0

    iget v6, p0, Lcom/google/android/gms/internal/ads/sa;->H:F

    div-float/2addr v0, v6

    int-to-float v4, v4

    iget v6, p0, Lcom/google/android/gms/internal/ads/sa;->H:F

    div-float/2addr v4, v6

    cmpl-float v0, v0, v4

    if-gtz v0, :cond_10

    move v0, v2

    :goto_7
    if-eqz v1, :cond_11

    :goto_8
    if-eqz v0, :cond_13

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->h:Lcom/google/android/gms/internal/ads/rs;

    iget v0, v0, Lcom/google/android/gms/internal/ads/rs;->b:I

    int-to-float v0, v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/sa;->H:F

    div-float/2addr v0, v1

    float-to-int v0, v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/sa;->h:Lcom/google/android/gms/internal/ads/rs;

    iget v1, v1, Lcom/google/android/gms/internal/ads/rs;->a:I

    int-to-float v1, v1

    iget v2, p0, Lcom/google/android/gms/internal/ads/sa;->H:F

    div-float/2addr v1, v2

    float-to-int v1, v1

    int-to-float v2, v7

    iget v3, p0, Lcom/google/android/gms/internal/ads/sa;->H:F

    div-float/2addr v2, v3

    float-to-int v2, v2

    int-to-float v3, v5

    iget v4, p0, Lcom/google/android/gms/internal/ads/sa;->H:F

    div-float/2addr v3, v4

    float-to-int v3, v3

    const/16 v4, 0x67

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "Not enough space to show ad. Needs "

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, "x"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " dp, but only has "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " dp."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/je;->e(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/sa;->getVisibility()I

    move-result v0

    if-eq v0, v9, :cond_e

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/sa;->setVisibility(I)V

    :cond_e
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/ads/sa;->setMeasuredDimension(II)V

    goto/16 :goto_0

    :cond_f
    move v1, v3

    goto/16 :goto_6

    :cond_10
    move v0, v3

    goto :goto_7

    :cond_11
    move v0, v1

    goto :goto_8

    :cond_12
    move v0, v1

    goto :goto_8

    :cond_13
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/sa;->getVisibility()I

    move-result v0

    if-eq v0, v9, :cond_14

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/sa;->setVisibility(I)V

    :cond_14
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->h:Lcom/google/android/gms/internal/ads/rs;

    iget v0, v0, Lcom/google/android/gms/internal/ads/rs;->b:I

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/sa;->h:Lcom/google/android/gms/internal/ads/rs;

    iget v1, v1, Lcom/google/android/gms/internal/ads/rs;->a:I

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/ads/sa;->setMeasuredDimension(II)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_0

    :cond_15
    move v4, v0

    goto/16 :goto_5

    :cond_16
    move v6, v0

    goto/16 :goto_4

    :cond_17
    move v4, v1

    goto/16 :goto_1

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final onPause()V
    .locals 2

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/common/util/k;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0}, Lcom/google/android/gms/internal/ads/sf;->onPause()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not pause webview."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/je;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public final onResume()V
    .locals 2

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/common/util/k;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0}, Lcom/google/android/gms/internal/ads/sf;->onResume()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not resume webview."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/je;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->f:Lcom/google/android/gms/internal/ads/rt;

    check-cast v0, Lcom/google/android/gms/internal/ads/rt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rt;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->t:Lcom/google/android/gms/internal/ads/ato;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->t:Lcom/google/android/gms/internal/ads/ato;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/ato;->a(Landroid/view/MotionEvent;)V

    :cond_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    :goto_0
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/ads/sf;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->b:Lcom/google/android/gms/internal/ads/agw;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->b:Lcom/google/android/gms/internal/ads/agw;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/agw;->a(Landroid/view/MotionEvent;)V

    goto :goto_0
.end method

.method public final declared-synchronized p()Lcom/google/android/gms/ads/internal/overlay/zzd;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->g:Lcom/google/android/gms/ads/internal/overlay/zzd;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized q()Lcom/google/android/gms/ads/internal/overlay/zzd;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->B:Lcom/google/android/gms/ads/internal/overlay/zzd;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized r()Lcom/google/android/gms/internal/ads/rs;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->h:Lcom/google/android/gms/internal/ads/rs;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized s()Ljava/lang/String;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->i:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->A:Ljava/lang/ref/WeakReference;

    invoke-super {p0, p1}, Lcom/google/android/gms/internal/ads/sf;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final declared-synchronized setRequestedOrientation(I)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iput p1, p0, Lcom/google/android/gms/internal/ads/sa;->m:I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->g:Lcom/google/android/gms/ads/internal/overlay/zzd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->g:Lcom/google/android/gms/ads/internal/overlay/zzd;

    iget v1, p0, Lcom/google/android/gms/internal/ads/sa;->m:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/overlay/zzd;->setRequestedOrientation(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final stopLoading()V
    .locals 2

    :try_start_0
    invoke-super {p0}, Lcom/google/android/gms/internal/ads/sf;->stopLoading()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not stop loading webview."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/je;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public final synthetic t()Lcom/google/android/gms/internal/ads/rm;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->f:Lcom/google/android/gms/internal/ads/rt;

    return-object v0
.end method

.method public final u()Landroid/webkit/WebViewClient;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sf;->a:Landroid/webkit/WebViewClient;

    return-object v0
.end method

.method public final declared-synchronized v()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/sa;->j:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final w()Lcom/google/android/gms/internal/ads/agw;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->b:Lcom/google/android/gms/internal/ads/agw;

    return-object v0
.end method

.method public final declared-synchronized x()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/sa;->k:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized zzcl()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/sa;->o:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->d:Lcom/google/android/gms/ads/internal/zzbo;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->d:Lcom/google/android/gms/ads/internal/zzbo;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/zzbo;->zzcl()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized zzcm()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/sa;->o:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->d:Lcom/google/android/gms/ads/internal/zzbo;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/sa;->d:Lcom/google/android/gms/ads/internal/zzbo;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/zzbo;->zzcm()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
