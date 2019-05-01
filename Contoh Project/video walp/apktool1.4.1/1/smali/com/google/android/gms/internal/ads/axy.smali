.class final Lcom/google/android/gms/internal/ads/axy;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/ayl;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/asr;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/axx;Lcom/google/android/gms/internal/ads/asr;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/axy;->a:Lcom/google/android/gms/internal/ads/asr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/aym;)V
    .locals 2

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/aym;->d:Lcom/google/android/gms/internal/ads/asu;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/aym;->d:Lcom/google/android/gms/internal/ads/asu;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/axy;->a:Lcom/google/android/gms/internal/ads/asr;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/asu;->a(Lcom/google/android/gms/internal/ads/asr;)V

    :cond_0
    return-void
.end method
