.class public final Lcom/google/android/gms/internal/ads/he;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/cm;
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/bcn;

.field private final b:Lcom/google/android/gms/internal/ads/gx;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/bcn;Lcom/google/android/gms/internal/ads/gw;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/he;->a:Lcom/google/android/gms/internal/ads/bcn;

    new-instance v0, Lcom/google/android/gms/internal/ads/gx;

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/ads/gx;-><init>(Lcom/google/android/gms/internal/ads/gw;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/he;->b:Lcom/google/android/gms/internal/ads/gx;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/bcn;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/he;->a:Lcom/google/android/gms/internal/ads/bcn;

    return-object v0
.end method

.method public final b()Lcom/google/android/gms/internal/ads/gx;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/he;->b:Lcom/google/android/gms/internal/ads/gx;

    return-object v0
.end method
