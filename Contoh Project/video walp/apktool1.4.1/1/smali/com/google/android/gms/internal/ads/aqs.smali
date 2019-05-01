.class public final Lcom/google/android/gms/internal/ads/aqs;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/cm;
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/bcj;

.field private final b:Landroid/content/Context;

.field private final c:Lcom/google/android/gms/internal/ads/aoe;

.field private d:Lcom/google/android/gms/ads/AdListener;

.field private e:Lcom/google/android/gms/internal/ads/anw;

.field private f:Lcom/google/android/gms/internal/ads/apj;

.field private g:Ljava/lang/String;

.field private h:Lcom/google/android/gms/ads/reward/zza;

.field private i:Lcom/google/android/gms/ads/doubleclick/AppEventListener;

.field private j:Lcom/google/android/gms/ads/doubleclick/OnCustomRenderedAdLoadedListener;

.field private k:Lcom/google/android/gms/ads/Correlator;

.field private l:Lcom/google/android/gms/ads/reward/RewardedVideoAdListener;

.field private m:Z

.field private n:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/aoe;->a:Lcom/google/android/gms/internal/ads/aoe;

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/google/android/gms/internal/ads/aqs;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/aoe;Lcom/google/android/gms/ads/doubleclick/PublisherInterstitialAd;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/doubleclick/PublisherInterstitialAd;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/aoe;->a:Lcom/google/android/gms/internal/ads/aoe;

    invoke-direct {p0, p1, v0, p2}, Lcom/google/android/gms/internal/ads/aqs;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/aoe;Lcom/google/android/gms/ads/doubleclick/PublisherInterstitialAd;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/aoe;Lcom/google/android/gms/ads/doubleclick/PublisherInterstitialAd;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/bcj;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/bcj;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/aqs;->a:Lcom/google/android/gms/internal/ads/bcj;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/aqs;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/aqs;->c:Lcom/google/android/gms/internal/ads/aoe;

    return-void
.end method

.method private final b(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqs;->f:Lcom/google/android/gms/internal/ads/apj;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x3f

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "The ad unit ID must be set on InterstitialAd before "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is called."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/ads/AdListener;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqs;->d:Lcom/google/android/gms/ads/AdListener;

    return-object v0
.end method

.method public final a(Lcom/google/android/gms/ads/AdListener;)V
    .locals 2

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/aqs;->d:Lcom/google/android/gms/ads/AdListener;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqs;->f:Lcom/google/android/gms/internal/ads/apj;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aqs;->f:Lcom/google/android/gms/internal/ads/apj;

    if-eqz p1, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/ads/any;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/any;-><init>(Lcom/google/android/gms/ads/AdListener;)V

    :goto_0
    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/apj;->zza(Lcom/google/android/gms/internal/ads/aoy;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_1
    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "#008 Must be called on the main UI thread."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/mk;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public final a(Lcom/google/android/gms/ads/Correlator;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/aqs;->k:Lcom/google/android/gms/ads/Correlator;

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqs;->f:Lcom/google/android/gms/internal/ads/apj;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aqs;->f:Lcom/google/android/gms/internal/ads/apj;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqs;->k:Lcom/google/android/gms/ads/Correlator;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/apj;->zza(Lcom/google/android/gms/internal/ads/apy;)V

    :cond_0
    :goto_1
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqs;->k:Lcom/google/android/gms/ads/Correlator;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/Correlator;->zzaz()Lcom/google/android/gms/internal/ads/aot;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "#008 Must be called on the main UI thread."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/mk;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public final a(Lcom/google/android/gms/ads/doubleclick/AppEventListener;)V
    .locals 2

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/aqs;->i:Lcom/google/android/gms/ads/doubleclick/AppEventListener;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqs;->f:Lcom/google/android/gms/internal/ads/apj;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aqs;->f:Lcom/google/android/gms/internal/ads/apj;

    if-eqz p1, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/ads/aog;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/aog;-><init>(Lcom/google/android/gms/ads/doubleclick/AppEventListener;)V

    :goto_0
    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/apj;->zza(Lcom/google/android/gms/internal/ads/aps;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_1
    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "#008 Must be called on the main UI thread."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/mk;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public final a(Lcom/google/android/gms/ads/doubleclick/OnCustomRenderedAdLoadedListener;)V
    .locals 2

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/aqs;->j:Lcom/google/android/gms/ads/doubleclick/OnCustomRenderedAdLoadedListener;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqs;->f:Lcom/google/android/gms/internal/ads/apj;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aqs;->f:Lcom/google/android/gms/internal/ads/apj;

    if-eqz p1, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/ads/asx;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/asx;-><init>(Lcom/google/android/gms/ads/doubleclick/OnCustomRenderedAdLoadedListener;)V

    :goto_0
    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/apj;->zza(Lcom/google/android/gms/internal/ads/asu;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_1
    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "#008 Must be called on the main UI thread."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/mk;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public final a(Lcom/google/android/gms/ads/reward/RewardedVideoAdListener;)V
    .locals 2

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/aqs;->l:Lcom/google/android/gms/ads/reward/RewardedVideoAdListener;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqs;->f:Lcom/google/android/gms/internal/ads/apj;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aqs;->f:Lcom/google/android/gms/internal/ads/apj;

    if-eqz p1, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/ads/gm;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/gm;-><init>(Lcom/google/android/gms/ads/reward/RewardedVideoAdListener;)V

    :goto_0
    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/apj;->zza(Lcom/google/android/gms/internal/ads/gh;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_1
    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "#008 Must be called on the main UI thread."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/mk;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public final a(Lcom/google/android/gms/ads/reward/zza;)V
    .locals 2

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/aqs;->h:Lcom/google/android/gms/ads/reward/zza;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqs;->f:Lcom/google/android/gms/internal/ads/apj;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aqs;->f:Lcom/google/android/gms/internal/ads/apj;

    if-eqz p1, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/ads/aob;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/aob;-><init>(Lcom/google/android/gms/ads/reward/zza;)V

    :goto_0
    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/apj;->zza(Lcom/google/android/gms/internal/ads/apo;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_1
    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "#008 Must be called on the main UI thread."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/mk;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public final a(Lcom/google/android/gms/internal/ads/anw;)V
    .locals 2

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/aqs;->e:Lcom/google/android/gms/internal/ads/anw;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqs;->f:Lcom/google/android/gms/internal/ads/apj;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aqs;->f:Lcom/google/android/gms/internal/ads/apj;

    if-eqz p1, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/ads/anx;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/anx;-><init>(Lcom/google/android/gms/internal/ads/anw;)V

    :goto_0
    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/apj;->zza(Lcom/google/android/gms/internal/ads/aov;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_1
    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "#008 Must be called on the main UI thread."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/mk;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public final a(Lcom/google/android/gms/internal/ads/aqn;)V
    .locals 6

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqs;->f:Lcom/google/android/gms/internal/ads/apj;

    if-nez v0, :cond_8

    const-string v0, "loadAd"

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aqs;->g:Ljava/lang/String;

    if-nez v1, :cond_0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/aqs;->b(Ljava/lang/String;)V

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/aqs;->m:Z

    if-eqz v0, :cond_a

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzjn;->a()Lcom/google/android/gms/internal/ads/zzjn;

    move-result-object v3

    :goto_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->b()Lcom/google/android/gms/internal/ads/aoh;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/aqs;->b:Landroid/content/Context;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/aqs;->g:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/aqs;->a:Lcom/google/android/gms/internal/ads/bcj;

    new-instance v0, Lcom/google/android/gms/internal/ads/aok;

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/aok;-><init>(Lcom/google/android/gms/internal/ads/aoh;Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzjn;Ljava/lang/String;Lcom/google/android/gms/internal/ads/bck;)V

    const/4 v1, 0x0

    invoke-static {v2, v1, v0}, Lcom/google/android/gms/internal/ads/aoh;->a(Landroid/content/Context;ZLcom/google/android/gms/internal/ads/aoh$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/apj;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/aqs;->f:Lcom/google/android/gms/internal/ads/apj;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqs;->d:Lcom/google/android/gms/ads/AdListener;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqs;->f:Lcom/google/android/gms/internal/ads/apj;

    new-instance v1, Lcom/google/android/gms/internal/ads/any;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/aqs;->d:Lcom/google/android/gms/ads/AdListener;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/any;-><init>(Lcom/google/android/gms/ads/AdListener;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/apj;->zza(Lcom/google/android/gms/internal/ads/aoy;)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqs;->e:Lcom/google/android/gms/internal/ads/anw;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqs;->f:Lcom/google/android/gms/internal/ads/apj;

    new-instance v1, Lcom/google/android/gms/internal/ads/anx;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/aqs;->e:Lcom/google/android/gms/internal/ads/anw;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/anx;-><init>(Lcom/google/android/gms/internal/ads/anw;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/apj;->zza(Lcom/google/android/gms/internal/ads/aov;)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqs;->h:Lcom/google/android/gms/ads/reward/zza;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqs;->f:Lcom/google/android/gms/internal/ads/apj;

    new-instance v1, Lcom/google/android/gms/internal/ads/aob;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/aqs;->h:Lcom/google/android/gms/ads/reward/zza;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/aob;-><init>(Lcom/google/android/gms/ads/reward/zza;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/apj;->zza(Lcom/google/android/gms/internal/ads/apo;)V

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqs;->i:Lcom/google/android/gms/ads/doubleclick/AppEventListener;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqs;->f:Lcom/google/android/gms/internal/ads/apj;

    new-instance v1, Lcom/google/android/gms/internal/ads/aog;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/aqs;->i:Lcom/google/android/gms/ads/doubleclick/AppEventListener;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/aog;-><init>(Lcom/google/android/gms/ads/doubleclick/AppEventListener;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/apj;->zza(Lcom/google/android/gms/internal/ads/aps;)V

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqs;->j:Lcom/google/android/gms/ads/doubleclick/OnCustomRenderedAdLoadedListener;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqs;->f:Lcom/google/android/gms/internal/ads/apj;

    new-instance v1, Lcom/google/android/gms/internal/ads/asx;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/aqs;->j:Lcom/google/android/gms/ads/doubleclick/OnCustomRenderedAdLoadedListener;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/asx;-><init>(Lcom/google/android/gms/ads/doubleclick/OnCustomRenderedAdLoadedListener;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/apj;->zza(Lcom/google/android/gms/internal/ads/asu;)V

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqs;->k:Lcom/google/android/gms/ads/Correlator;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqs;->f:Lcom/google/android/gms/internal/ads/apj;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aqs;->k:Lcom/google/android/gms/ads/Correlator;

    invoke-virtual {v1}, Lcom/google/android/gms/ads/Correlator;->zzaz()Lcom/google/android/gms/internal/ads/aot;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/apj;->zza(Lcom/google/android/gms/internal/ads/apy;)V

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqs;->l:Lcom/google/android/gms/ads/reward/RewardedVideoAdListener;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqs;->f:Lcom/google/android/gms/internal/ads/apj;

    new-instance v1, Lcom/google/android/gms/internal/ads/gm;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/aqs;->l:Lcom/google/android/gms/ads/reward/RewardedVideoAdListener;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/gm;-><init>(Lcom/google/android/gms/ads/reward/RewardedVideoAdListener;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/apj;->zza(Lcom/google/android/gms/internal/ads/gh;)V

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqs;->f:Lcom/google/android/gms/internal/ads/apj;

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/aqs;->n:Z

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/apj;->setImmersiveMode(Z)V

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqs;->f:Lcom/google/android/gms/internal/ads/apj;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aqs;->b:Landroid/content/Context;

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/ads/aoe;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/aqn;)Lcom/google/android/gms/internal/ads/zzjj;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/apj;->zzb(Lcom/google/android/gms/internal/ads/zzjj;)Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqs;->a:Lcom/google/android/gms/internal/ads/bcj;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/aqn;->j()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/bcj;->a(Ljava/util/Map;)V

    :cond_9
    :goto_1
    return-void

    :cond_a
    new-instance v3, Lcom/google/android/gms/internal/ads/zzjn;

    invoke-direct {v3}, Lcom/google/android/gms/internal/ads/zzjn;-><init>()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :catch_0
    move-exception v0

    const-string v1, "#008 Must be called on the main UI thread."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/mk;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public final a(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqs;->g:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The ad unit ID can only be set once on InterstitialAd."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/aqs;->g:Ljava/lang/String;

    return-void
.end method

.method public final a(Z)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/aqs;->m:Z

    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqs;->g:Ljava/lang/String;

    return-object v0
.end method

.method public final b(Z)V
    .locals 2

    :try_start_0
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/aqs;->n:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqs;->f:Lcom/google/android/gms/internal/ads/apj;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqs;->f:Lcom/google/android/gms/internal/ads/apj;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/apj;->setImmersiveMode(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "#008 Must be called on the main UI thread."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/mk;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public final c()Lcom/google/android/gms/ads/doubleclick/AppEventListener;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqs;->i:Lcom/google/android/gms/ads/doubleclick/AppEventListener;

    return-object v0
.end method

.method public final d()Lcom/google/android/gms/ads/doubleclick/OnCustomRenderedAdLoadedListener;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqs;->j:Lcom/google/android/gms/ads/doubleclick/OnCustomRenderedAdLoadedListener;

    return-object v0
.end method

.method public final e()Z
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aqs;->f:Lcom/google/android/gms/internal/ads/apj;

    if-nez v1, :cond_0

    :goto_0
    return v0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aqs;->f:Lcom/google/android/gms/internal/ads/apj;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/apj;->isReady()Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "#008 Must be called on the main UI thread."

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/mk;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public final f()Z
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aqs;->f:Lcom/google/android/gms/internal/ads/apj;

    if-nez v1, :cond_0

    :goto_0
    return v0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aqs;->f:Lcom/google/android/gms/internal/ads/apj;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/apj;->isLoading()Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "#008 Must be called on the main UI thread."

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/mk;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public final g()Landroid/os/Bundle;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqs;->f:Lcom/google/android/gms/internal/ads/apj;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqs;->f:Lcom/google/android/gms/internal/ads/apj;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/apj;->zzba()Landroid/os/Bundle;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "#008 Must be called on the main UI thread."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/mk;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    goto :goto_0
.end method

.method public final h()Ljava/lang/String;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqs;->f:Lcom/google/android/gms/internal/ads/apj;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqs;->f:Lcom/google/android/gms/internal/ads/apj;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/apj;->zzck()Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "#008 Must be called on the main UI thread."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/mk;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final i()V
    .locals 2

    :try_start_0
    const-string v0, "show"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/aqs;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqs;->f:Lcom/google/android/gms/internal/ads/apj;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/apj;->showInterstitial()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "#008 Must be called on the main UI thread."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/mk;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
