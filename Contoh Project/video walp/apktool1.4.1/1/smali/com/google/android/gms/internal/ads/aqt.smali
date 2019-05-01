.class public final Lcom/google/android/gms/internal/ads/aqt;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/cm;
.end annotation


# static fields
.field private static a:Lcom/google/android/gms/internal/ads/aqt;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "sLock"
    .end annotation
.end field

.field private static final b:Ljava/lang/Object;


# instance fields
.field private c:Lcom/google/android/gms/internal/ads/aqb;

.field private d:Lcom/google/android/gms/ads/reward/RewardedVideoAd;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/aqt;->b:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/google/android/gms/internal/ads/aqt;
    .locals 2

    sget-object v1, Lcom/google/android/gms/internal/ads/aqt;->b:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/aqt;->a:Lcom/google/android/gms/internal/ads/aqt;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/aqt;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/aqt;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/aqt;->a:Lcom/google/android/gms/internal/ads/aqt;

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/aqt;->a:Lcom/google/android/gms/internal/ads/aqt;

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Lcom/google/android/gms/ads/reward/RewardedVideoAd;
    .locals 4

    sget-object v1, Lcom/google/android/gms/internal/ads/aqt;->b:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqt;->d:Lcom/google/android/gms/ads/reward/RewardedVideoAd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqt;->d:Lcom/google/android/gms/ads/reward/RewardedVideoAd;

    monitor-exit v1

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/bcj;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/bcj;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->b()Lcom/google/android/gms/internal/ads/aoh;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/ads/aop;

    invoke-direct {v3, v2, p1, v0}, Lcom/google/android/gms/internal/ads/aop;-><init>(Lcom/google/android/gms/internal/ads/aoh;Landroid/content/Context;Lcom/google/android/gms/internal/ads/bck;)V

    const/4 v0, 0x0

    invoke-static {p1, v0, v3}, Lcom/google/android/gms/internal/ads/aoh;->a(Landroid/content/Context;ZLcom/google/android/gms/internal/ads/aoh$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/gb;

    new-instance v2, Lcom/google/android/gms/internal/ads/go;

    invoke-direct {v2, p1, v0}, Lcom/google/android/gms/internal/ads/go;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/gb;)V

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/aqt;->d:Lcom/google/android/gms/ads/reward/RewardedVideoAd;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqt;->d:Lcom/google/android/gms/ads/reward/RewardedVideoAd;

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final a(F)V
    .locals 4

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v0, 0x0

    cmpg-float v0, v0, p1

    if-gtz v0, :cond_0

    const/high16 v0, 0x3f80

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "The app volume must be a value between 0 and 1 inclusive."

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/n;->b(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqt;->c:Lcom/google/android/gms/internal/ads/aqb;

    if-eqz v0, :cond_1

    :goto_1
    const-string v0, "MobileAds.initialize() must be called prior to setting the app volume."

    invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/n;->a(ZLjava/lang/Object;)V

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqt;->c:Lcom/google/android/gms/internal/ads/aqb;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/aqb;->setAppVolume(F)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_2
    return-void

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v1, v2

    goto :goto_1

    :catch_0
    move-exception v0

    const-string v1, "Unable to set app volume."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/mk;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2
.end method

.method public final a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqt;->c:Lcom/google/android/gms/internal/ads/aqb;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "MobileAds.initialize() must be called prior to opening debug menu."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/n;->a(ZLjava/lang/Object;)V

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqt;->c:Lcom/google/android/gms/internal/ads/aqb;

    invoke-static {p1}, Lcom/google/android/gms/a/b;->a(Ljava/lang/Object;)Lcom/google/android/gms/a/a;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/internal/ads/aqb;->zzb(Lcom/google/android/gms/a/a;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Unable to open debug menu."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/mk;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public final a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ads/aqv;)V
    .locals 3

    sget-object v1, Lcom/google/android/gms/internal/ads/aqt;->b:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqt;->c:Lcom/google/android/gms/internal/ads/aqb;

    if-eqz v0, :cond_0

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    if-nez p1, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "Context cannot be null."

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :try_start_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->b()Lcom/google/android/gms/internal/ads/aoh;

    move-result-object v0

    new-instance v2, Lcom/google/android/gms/internal/ads/aom;

    invoke-direct {v2, v0, p1}, Lcom/google/android/gms/internal/ads/aom;-><init>(Lcom/google/android/gms/internal/ads/aoh;Landroid/content/Context;)V

    const/4 v0, 0x0

    invoke-static {p1, v0, v2}, Lcom/google/android/gms/internal/ads/aoh;->a(Landroid/content/Context;ZLcom/google/android/gms/internal/ads/aoh$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/aqb;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/aqt;->c:Lcom/google/android/gms/internal/ads/aqb;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqt;->c:Lcom/google/android/gms/internal/ads/aqb;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/aqb;->zza()V

    if-eqz p2, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqt;->c:Lcom/google/android/gms/internal/ads/aqb;

    new-instance v2, Lcom/google/android/gms/internal/ads/aqu;

    invoke-direct {v2, p0, p1}, Lcom/google/android/gms/internal/ads/aqu;-><init>(Lcom/google/android/gms/internal/ads/aqt;Landroid/content/Context;)V

    invoke-static {v2}, Lcom/google/android/gms/a/b;->a(Ljava/lang/Object;)Lcom/google/android/gms/a/a;

    move-result-object v2

    invoke-interface {v0, p2, v2}, Lcom/google/android/gms/internal/ads/aqb;->zza(Ljava/lang/String;Lcom/google/android/gms/a/a;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    :cond_2
    :goto_1
    :try_start_2
    monitor-exit v1

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v2, "MobileAdsSettingManager initialization failed"

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/mk;->c(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1
.end method

.method public final a(Z)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqt;->c:Lcom/google/android/gms/internal/ads/aqb;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "MobileAds.initialize() must be called prior to setting app muted state."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/n;->a(ZLjava/lang/Object;)V

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqt;->c:Lcom/google/android/gms/internal/ads/aqb;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/aqb;->setAppMuted(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Unable to set app mute state."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/mk;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public final b()F
    .locals 3

    const/high16 v0, 0x3f80

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aqt;->c:Lcom/google/android/gms/internal/ads/aqb;

    if-nez v1, :cond_0

    :goto_0
    return v0

    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aqt;->c:Lcom/google/android/gms/internal/ads/aqb;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/aqb;->zzdo()F
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Unable to get app volume."

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/mk;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public final c()Z
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aqt;->c:Lcom/google/android/gms/internal/ads/aqb;

    if-nez v1, :cond_0

    :goto_0
    return v0

    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aqt;->c:Lcom/google/android/gms/internal/ads/aqb;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/aqb;->zzdp()Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Unable to get app mute state."

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/mk;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
