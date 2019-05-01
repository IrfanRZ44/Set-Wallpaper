.class final synthetic Lcom/google/android/gms/internal/ads/baw;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/bau;

.field private final b:Lcom/google/android/gms/internal/ads/azo;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/bau;Lcom/google/android/gms/internal/ads/azo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/baw;->a:Lcom/google/android/gms/internal/ads/bau;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/baw;->b:Lcom/google/android/gms/internal/ads/azo;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/baw;->a:Lcom/google/android/gms/internal/ads/bau;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/baw;->b:Lcom/google/android/gms/internal/ads/azo;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/bau;->a:Lcom/google/android/gms/internal/ads/bar;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/bar;->a(Lcom/google/android/gms/internal/ads/bar;)Lcom/google/android/gms/internal/ads/ks;

    move-result-object v0

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/ks;->a(Ljava/lang/Object;)V

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/azo;->a()V

    return-void
.end method
