.class public final Lcom/google/android/gms/internal/ads/bi;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/cm;
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Landroid/content/Context;

.field private final c:Lcom/google/android/gms/internal/ads/agw;

.field private final d:Lcom/google/android/gms/internal/ads/ik;

.field private final e:Lcom/google/android/gms/internal/ads/asn;

.field private final f:Lcom/google/android/gms/ads/internal/zzbc;

.field private g:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

.field private h:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

.field private final i:Landroid/util/DisplayMetrics;

.field private j:Lcom/google/android/gms/internal/ads/lo;

.field private k:I
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation
.end field

.field private l:I
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/agw;Lcom/google/android/gms/internal/ads/ik;Lcom/google/android/gms/internal/ads/asn;Lcom/google/android/gms/ads/internal/zzbc;)V
    .locals 4

    const/4 v1, -0x1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/bi;->a:Ljava/lang/Object;

    iput v1, p0, Lcom/google/android/gms/internal/ads/bi;->k:I

    iput v1, p0, Lcom/google/android/gms/internal/ads/bi;->l:I

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/bi;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/bi;->c:Lcom/google/android/gms/internal/ads/agw;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/bi;->d:Lcom/google/android/gms/internal/ads/ik;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/bi;->e:Lcom/google/android/gms/internal/ads/asn;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/bi;->f:Lcom/google/android/gms/ads/internal/zzbc;

    new-instance v0, Lcom/google/android/gms/internal/ads/lo;

    const-wide/16 v2, 0xc8

    invoke-direct {v0, v2, v3}, Lcom/google/android/gms/internal/ads/lo;-><init>(J)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/bi;->j:Lcom/google/android/gms/internal/ads/lo;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzek()Lcom/google/android/gms/internal/ads/jn;

    const-string v0, "window"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/jn;->a(Landroid/view/WindowManager;)Landroid/util/DisplayMetrics;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/bi;->i:Landroid/util/DisplayMetrics;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/bi;)Lcom/google/android/gms/ads/internal/zzbc;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bi;->f:Lcom/google/android/gms/ads/internal/zzbc;

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/bi;Ljava/lang/ref/WeakReference;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/bi;->a(Ljava/lang/ref/WeakReference;Z)V

    return-void
.end method

.method private final a(Ljava/lang/ref/WeakReference;Z)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/google/android/gms/internal/ads/qe;",
            ">;Z)V"
        }
    .end annotation

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/qe;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/qe;->getView()Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_0

    if-eqz p2, :cond_2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/bi;->j:Lcom/google/android/gms/internal/ads/lo;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/lo;->a()Z

    move-result v3

    if-eqz v3, :cond_0

    :cond_2
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/qe;->getView()Landroid/view/View;

    move-result-object v3

    const/4 v4, 0x2

    new-array v4, v4, [I

    invoke-virtual {v3, v4}, Landroid/view/View;->getLocationOnScreen([I)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->a()Lcom/google/android/gms/internal/ads/lz;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/bi;->i:Landroid/util/DisplayMetrics;

    aget v5, v4, v2

    invoke-static {v3, v5}, Lcom/google/android/gms/internal/ads/lz;->b(Landroid/util/DisplayMetrics;I)I

    move-result v3

    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->a()Lcom/google/android/gms/internal/ads/lz;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/bi;->i:Landroid/util/DisplayMetrics;

    aget v4, v4, v1

    invoke-static {v5, v4}, Lcom/google/android/gms/internal/ads/lz;->b(Landroid/util/DisplayMetrics;I)I

    move-result v4

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/bi;->a:Ljava/lang/Object;

    monitor-enter v5

    :try_start_0
    iget v6, p0, Lcom/google/android/gms/internal/ads/bi;->k:I

    if-ne v6, v3, :cond_3

    iget v6, p0, Lcom/google/android/gms/internal/ads/bi;->l:I

    if-eq v6, v4, :cond_4

    :cond_3
    iput v3, p0, Lcom/google/android/gms/internal/ads/bi;->k:I

    iput v4, p0, Lcom/google/android/gms/internal/ads/bi;->l:I

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/qe;->t()Lcom/google/android/gms/internal/ads/rm;

    move-result-object v3

    iget v4, p0, Lcom/google/android/gms/internal/ads/bi;->k:I

    iget v6, p0, Lcom/google/android/gms/internal/ads/bi;->l:I

    if-nez p2, :cond_5

    move v0, v1

    :goto_1
    invoke-interface {v3, v4, v6, v0}, Lcom/google/android/gms/internal/ads/rm;->a(IIZ)V

    :cond_4
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_5
    move v0, v2

    goto :goto_1
.end method


# virtual methods
.method final synthetic a(Lcom/google/android/gms/internal/ads/np;Lcom/google/android/gms/internal/ads/qe;Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bi;->f:Lcom/google/android/gms/ads/internal/zzbc;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzbc;->zzdw()V

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/np;->b(Ljava/lang/Object;)V

    return-void
.end method

.method final synthetic a(Lorg/json/JSONObject;Lcom/google/android/gms/internal/ads/np;)V
    .locals 12

    const/4 v11, 0x0

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzel()Lcom/google/android/gms/internal/ads/ql;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bi;->b:Landroid/content/Context;

    invoke-static {}, Lcom/google/android/gms/internal/ads/rs;->a()Lcom/google/android/gms/internal/ads/rs;

    move-result-object v1

    const-string v2, "native-video"

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/bi;->c:Lcom/google/android/gms/internal/ads/agw;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/bi;->d:Lcom/google/android/gms/internal/ads/ik;

    iget-object v6, v6, Lcom/google/android/gms/internal/ads/ik;->a:Lcom/google/android/gms/internal/ads/zzaef;

    iget-object v6, v6, Lcom/google/android/gms/internal/ads/zzaef;->k:Lcom/google/android/gms/internal/ads/zzang;

    iget-object v7, p0, Lcom/google/android/gms/internal/ads/bi;->e:Lcom/google/android/gms/internal/ads/asn;

    const/4 v8, 0x0

    iget-object v9, p0, Lcom/google/android/gms/internal/ads/bi;->f:Lcom/google/android/gms/ads/internal/zzbc;

    invoke-virtual {v9}, Lcom/google/android/gms/ads/internal/zza;->zzbi()Lcom/google/android/gms/ads/internal/zzw;

    move-result-object v9

    iget-object v10, p0, Lcom/google/android/gms/internal/ads/bi;->d:Lcom/google/android/gms/internal/ads/ik;

    iget-object v10, v10, Lcom/google/android/gms/internal/ads/ik;->i:Lcom/google/android/gms/internal/ads/amj;

    invoke-static/range {v0 .. v10}, Lcom/google/android/gms/internal/ads/ql;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/rs;Ljava/lang/String;ZZLcom/google/android/gms/internal/ads/agw;Lcom/google/android/gms/internal/ads/zzang;Lcom/google/android/gms/internal/ads/asn;Lcom/google/android/gms/ads/internal/zzbo;Lcom/google/android/gms/ads/internal/zzw;Lcom/google/android/gms/internal/ads/amj;)Lcom/google/android/gms/internal/ads/qe;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/ads/rs;->b()Lcom/google/android/gms/internal/ads/rs;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/qe;->a(Lcom/google/android/gms/internal/ads/rs;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bi;->f:Lcom/google/android/gms/ads/internal/zzbc;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/zzbc;->zzf(Lcom/google/android/gms/internal/ads/qe;)V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/qe;->t()Lcom/google/android/gms/internal/ads/rm;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/bi;->g:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    if-nez v3, :cond_0

    new-instance v3, Lcom/google/android/gms/internal/ads/bo;

    invoke-direct {v3, p0, v0}, Lcom/google/android/gms/internal/ads/bo;-><init>(Lcom/google/android/gms/internal/ads/bi;Ljava/lang/ref/WeakReference;)V

    iput-object v3, p0, Lcom/google/android/gms/internal/ads/bi;->g:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    :cond_0
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/bi;->g:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/bi;->h:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    if-nez v4, :cond_1

    new-instance v4, Lcom/google/android/gms/internal/ads/bp;

    invoke-direct {v4, p0, v0}, Lcom/google/android/gms/internal/ads/bp;-><init>(Lcom/google/android/gms/internal/ads/bi;Ljava/lang/ref/WeakReference;)V

    iput-object v4, p0, Lcom/google/android/gms/internal/ads/bi;->h:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bi;->h:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    invoke-interface {v2, v3, v0}, Lcom/google/android/gms/internal/ads/rm;->a(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    const-string v0, "/video"

    sget-object v2, Lcom/google/android/gms/ads/internal/gmsg/zzf;->zzblz:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    invoke-interface {v1, v0, v2}, Lcom/google/android/gms/internal/ads/qe;->a(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    const-string v0, "/videoMeta"

    sget-object v2, Lcom/google/android/gms/ads/internal/gmsg/zzf;->zzbma:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    invoke-interface {v1, v0, v2}, Lcom/google/android/gms/internal/ads/qe;->a(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    const-string v0, "/precache"

    new-instance v2, Lcom/google/android/gms/internal/ads/pt;

    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/pt;-><init>()V

    invoke-interface {v1, v0, v2}, Lcom/google/android/gms/internal/ads/qe;->a(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    const-string v0, "/delayPageLoaded"

    sget-object v2, Lcom/google/android/gms/ads/internal/gmsg/zzf;->zzbmd:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    invoke-interface {v1, v0, v2}, Lcom/google/android/gms/internal/ads/qe;->a(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    const-string v0, "/instrument"

    sget-object v2, Lcom/google/android/gms/ads/internal/gmsg/zzf;->zzbmb:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    invoke-interface {v1, v0, v2}, Lcom/google/android/gms/internal/ads/qe;->a(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    const-string v0, "/log"

    sget-object v2, Lcom/google/android/gms/ads/internal/gmsg/zzf;->zzblu:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    invoke-interface {v1, v0, v2}, Lcom/google/android/gms/internal/ads/qe;->a(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    const-string v0, "/videoClicked"

    sget-object v2, Lcom/google/android/gms/ads/internal/gmsg/zzf;->zzblv:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    invoke-interface {v1, v0, v2}, Lcom/google/android/gms/internal/ads/qe;->a(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    const-string v0, "/trackActiveViewUnit"

    new-instance v2, Lcom/google/android/gms/internal/ads/bm;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/ads/bm;-><init>(Lcom/google/android/gms/internal/ads/bi;)V

    invoke-interface {v1, v0, v2}, Lcom/google/android/gms/internal/ads/qe;->a(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    const-string v0, "/untrackActiveViewUnit"

    new-instance v2, Lcom/google/android/gms/internal/ads/bn;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/ads/bn;-><init>(Lcom/google/android/gms/internal/ads/bi;)V

    invoke-interface {v1, v0, v2}, Lcom/google/android/gms/internal/ads/qe;->a(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/qe;->t()Lcom/google/android/gms/internal/ads/rm;

    move-result-object v0

    new-instance v2, Lcom/google/android/gms/internal/ads/bk;

    invoke-direct {v2, v1, p1}, Lcom/google/android/gms/internal/ads/bk;-><init>(Lcom/google/android/gms/internal/ads/qe;Lorg/json/JSONObject;)V

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/ads/rm;->a(Lcom/google/android/gms/internal/ads/ro;)V

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/qe;->t()Lcom/google/android/gms/internal/ads/rm;

    move-result-object v0

    new-instance v2, Lcom/google/android/gms/internal/ads/bl;

    invoke-direct {v2, p0, p2, v1}, Lcom/google/android/gms/internal/ads/bl;-><init>(Lcom/google/android/gms/internal/ads/bi;Lcom/google/android/gms/internal/ads/np;Lcom/google/android/gms/internal/ads/qe;)V

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/ads/rm;->a(Lcom/google/android/gms/internal/ads/rn;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/asa;->bY:Lcom/google/android/gms/internal/ads/arq;

    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->f()Lcom/google/android/gms/internal/ads/ary;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/ary;->a(Lcom/google/android/gms/internal/ads/arq;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/qe;->loadUrl(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Exception occurred while getting video view"

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/je;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p2, v11}, Lcom/google/android/gms/internal/ads/np;->b(Ljava/lang/Object;)V

    goto :goto_0
.end method
