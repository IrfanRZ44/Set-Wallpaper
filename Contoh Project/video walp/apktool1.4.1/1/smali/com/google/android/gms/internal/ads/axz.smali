.class final Lcom/google/android/gms/internal/ads/axz;
.super Lcom/google/android/gms/internal/ads/aow;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/axl;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/axl;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/axz;->a:Lcom/google/android/gms/internal/ads/axl;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/aow;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/axz;->a:Lcom/google/android/gms/internal/ads/axl;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/axl;->a(Lcom/google/android/gms/internal/ads/axl;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/aya;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/aya;-><init>(Lcom/google/android/gms/internal/ads/axz;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method
