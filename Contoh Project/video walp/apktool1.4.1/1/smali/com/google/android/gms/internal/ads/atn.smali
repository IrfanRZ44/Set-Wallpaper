.class final Lcom/google/android/gms/internal/ads/atn;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/atm;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/atm;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/atn;->a:Lcom/google/android/gms/internal/ads/atm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atn;->a:Lcom/google/android/gms/internal/ads/atm;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/atm;->a(Lcom/google/android/gms/internal/ads/atm;)Lcom/google/android/gms/internal/ads/atq;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atn;->a:Lcom/google/android/gms/internal/ads/atm;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/atm;->a(Lcom/google/android/gms/internal/ads/atm;)Lcom/google/android/gms/internal/ads/atq;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/atq;->i()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atn;->a:Lcom/google/android/gms/internal/ads/atm;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/atm;->a(Lcom/google/android/gms/internal/ads/atm;)Lcom/google/android/gms/internal/ads/atq;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/atq;->h()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atn;->a:Lcom/google/android/gms/internal/ads/atm;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/atm;->a(Lcom/google/android/gms/internal/ads/atm;)Lcom/google/android/gms/internal/ads/atq;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/atq;->k()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/atn;->a:Lcom/google/android/gms/internal/ads/atm;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/atm;->a(Lcom/google/android/gms/internal/ads/atm;Lcom/google/android/gms/internal/ads/atq;)Lcom/google/android/gms/internal/ads/atq;

    return-void
.end method
