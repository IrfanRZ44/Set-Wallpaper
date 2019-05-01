.class final Lcom/google/android/gms/internal/ads/axr;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/ayl;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/axm;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/aym;)V
    .locals 1

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/aym;->a:Lcom/google/android/gms/internal/ads/aoy;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/aym;->a:Lcom/google/android/gms/internal/ads/aoy;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/aoy;->d()V

    :cond_0
    return-void
.end method
