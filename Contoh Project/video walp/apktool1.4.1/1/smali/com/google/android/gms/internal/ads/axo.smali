.class final Lcom/google/android/gms/internal/ads/axo;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/ayl;


# instance fields
.field private final synthetic a:I


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/axm;I)V
    .locals 0

    iput p2, p0, Lcom/google/android/gms/internal/ads/axo;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/aym;)V
    .locals 2

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/aym;->a:Lcom/google/android/gms/internal/ads/aoy;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/aym;->a:Lcom/google/android/gms/internal/ads/aoy;

    iget v1, p0, Lcom/google/android/gms/internal/ads/axo;->a:I

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/aoy;->a(I)V

    :cond_0
    return-void
.end method
