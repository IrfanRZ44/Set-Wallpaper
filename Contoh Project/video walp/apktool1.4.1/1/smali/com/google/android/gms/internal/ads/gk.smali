.class public final Lcom/google/android/gms/internal/ads/gk;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/ads/reward/RewardItem;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/cm;
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/fw;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/fw;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/gk;->a:Lcom/google/android/gms/internal/ads/fw;

    return-void
.end method


# virtual methods
.method public final getAmount()I
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/gk;->a:Lcom/google/android/gms/internal/ads/fw;

    if-nez v1, :cond_0

    :goto_0
    return v0

    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/gk;->a:Lcom/google/android/gms/internal/ads/fw;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/fw;->b()I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Could not forward getAmount to RewardItem"

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/mk;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public final getType()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/gk;->a:Lcom/google/android/gms/internal/ads/fw;

    if-nez v1, :cond_0

    :goto_0
    return-object v0

    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/gk;->a:Lcom/google/android/gms/internal/ads/fw;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/fw;->a()Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Could not forward getType to RewardItem"

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/mk;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
