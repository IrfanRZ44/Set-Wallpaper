.class public final Lcom/google/android/gms/internal/ads/awr;
.super Lcom/google/android/gms/internal/ads/avt;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/cm;
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/ads/formats/NativeContentAd$OnContentAdLoadedListener;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/formats/NativeContentAd$OnContentAdLoadedListener;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/avt;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/awr;->a:Lcom/google/android/gms/ads/formats/NativeContentAd$OnContentAdLoadedListener;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/avg;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/awr;->a:Lcom/google/android/gms/ads/formats/NativeContentAd$OnContentAdLoadedListener;

    new-instance v1, Lcom/google/android/gms/internal/ads/avj;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/avj;-><init>(Lcom/google/android/gms/internal/ads/avg;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/formats/NativeContentAd$OnContentAdLoadedListener;->onContentAdLoaded(Lcom/google/android/gms/ads/formats/NativeContentAd;)V

    return-void
.end method
