.class public final Lcom/google/android/gms/internal/ads/amr;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/b;


# instance fields
.field private final a:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/ans;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/ans;-><init>(Lcom/google/android/gms/internal/ads/amr;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/amr;->a:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/avs;Lcom/google/android/gms/internal/ads/bbw;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/avs",
            "<*>;",
            "Lcom/google/android/gms/internal/ads/bbw",
            "<*>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/internal/ads/amr;->a(Lcom/google/android/gms/internal/ads/avs;Lcom/google/android/gms/internal/ads/bbw;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/avs;Lcom/google/android/gms/internal/ads/bbw;Ljava/lang/Runnable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/avs",
            "<*>;",
            "Lcom/google/android/gms/internal/ads/bbw",
            "<*>;",
            "Ljava/lang/Runnable;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/avs;->k()V

    const-string v0, "post-response"

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/avs;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/amr;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/google/android/gms/internal/ads/aoq;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/aoq;-><init>(Lcom/google/android/gms/internal/ads/amr;Lcom/google/android/gms/internal/ads/avs;Lcom/google/android/gms/internal/ads/bbw;Ljava/lang/Runnable;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/avs;Lcom/google/android/gms/internal/ads/df;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/avs",
            "<*>;",
            "Lcom/google/android/gms/internal/ads/df;",
            ")V"
        }
    .end annotation

    const-string v0, "post-error"

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/avs;->b(Ljava/lang/String;)V

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/bbw;->a(Lcom/google/android/gms/internal/ads/df;)Lcom/google/android/gms/internal/ads/bbw;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/amr;->a:Ljava/util/concurrent/Executor;

    new-instance v2, Lcom/google/android/gms/internal/ads/aoq;

    const/4 v3, 0x0

    invoke-direct {v2, p0, p1, v0, v3}, Lcom/google/android/gms/internal/ads/aoq;-><init>(Lcom/google/android/gms/internal/ads/amr;Lcom/google/android/gms/internal/ads/avs;Lcom/google/android/gms/internal/ads/bbw;Ljava/lang/Runnable;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
