.class public abstract Lcom/google/android/gms/internal/ads/avz;
.super Lcom/google/android/gms/internal/ads/aja;

# interfaces
.implements Lcom/google/android/gms/internal/ads/avy;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/aja;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ads/avy;
    .locals 2

    if-nez p0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/ads/avy;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/google/android/gms/internal/ads/avy;

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/ads/awa;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/awa;-><init>(Landroid/os/IBinder;)V

    goto :goto_0
.end method


# virtual methods
.method protected final dispatchTransaction(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 4

    const/4 v1, 0x1

    if-ne p1, v1, :cond_2

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/avz;->a(Lcom/google/android/gms/internal/ads/avk;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    move v0, v1

    :goto_1
    return v0

    :cond_0
    const-string v0, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd"

    invoke-interface {v2, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v3, v0, Lcom/google/android/gms/internal/ads/avk;

    if-eqz v3, :cond_1

    check-cast v0, Lcom/google/android/gms/internal/ads/avk;

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/ads/avm;

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/avm;-><init>(Landroid/os/IBinder;)V

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method
