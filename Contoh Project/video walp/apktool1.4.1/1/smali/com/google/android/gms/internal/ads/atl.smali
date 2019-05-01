.class final Lcom/google/android/gms/internal/ads/atl;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/atj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/atj;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/atl;->a:Lcom/google/android/gms/internal/ads/atj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atl;->a:Lcom/google/android/gms/internal/ads/atj;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/atj;->a(Lcom/google/android/gms/internal/ads/atj;)Lcom/google/android/gms/internal/ads/atq;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atl;->a:Lcom/google/android/gms/internal/ads/atj;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/atj;->a(Lcom/google/android/gms/internal/ads/atj;)Lcom/google/android/gms/internal/ads/atq;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/atq;->i()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atl;->a:Lcom/google/android/gms/internal/ads/atj;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/atj;->a(Lcom/google/android/gms/internal/ads/atj;)Lcom/google/android/gms/internal/ads/atq;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/atq;->h()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atl;->a:Lcom/google/android/gms/internal/ads/atj;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/atj;->a(Lcom/google/android/gms/internal/ads/atj;Lcom/google/android/gms/internal/ads/atq;)Lcom/google/android/gms/internal/ads/atq;

    return-void
.end method
