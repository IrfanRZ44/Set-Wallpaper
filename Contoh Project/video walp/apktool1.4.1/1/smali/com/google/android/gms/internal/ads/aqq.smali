.class final Lcom/google/android/gms/internal/ads/aqq;
.super Lcom/google/android/gms/internal/ads/aou;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/aqp;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/aqp;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/aqq;->a:Lcom/google/android/gms/internal/ads/aqp;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/aou;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAdFailedToLoad(I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqq;->a:Lcom/google/android/gms/internal/ads/aqp;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/aqp;->a(Lcom/google/android/gms/internal/ads/aqp;)Lcom/google/android/gms/ads/VideoController;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aqq;->a:Lcom/google/android/gms/internal/ads/aqp;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aqp;->n()Lcom/google/android/gms/internal/ads/aqg;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/VideoController;->zza(Lcom/google/android/gms/internal/ads/aqg;)V

    invoke-super {p0, p1}, Lcom/google/android/gms/internal/ads/aou;->onAdFailedToLoad(I)V

    return-void
.end method

.method public final onAdLoaded()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aqq;->a:Lcom/google/android/gms/internal/ads/aqp;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/aqp;->a(Lcom/google/android/gms/internal/ads/aqp;)Lcom/google/android/gms/ads/VideoController;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aqq;->a:Lcom/google/android/gms/internal/ads/aqp;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aqp;->n()Lcom/google/android/gms/internal/ads/aqg;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/VideoController;->zza(Lcom/google/android/gms/internal/ads/aqg;)V

    invoke-super {p0}, Lcom/google/android/gms/internal/ads/aou;->onAdLoaded()V

    return-void
.end method
