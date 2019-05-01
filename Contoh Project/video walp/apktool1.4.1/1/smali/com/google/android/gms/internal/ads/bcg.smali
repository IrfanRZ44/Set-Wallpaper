.class final Lcom/google/android/gms/internal/ads/bcg;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/ne;

.field private final synthetic b:Lcom/google/android/gms/internal/ads/bce;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/bce;Lcom/google/android/gms/internal/ads/ne;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/bcg;->b:Lcom/google/android/gms/internal/ads/bce;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/bcg;->a:Lcom/google/android/gms/internal/ads/ne;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bcg;->b:Lcom/google/android/gms/internal/ads/bce;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/bce;->e(Lcom/google/android/gms/internal/ads/bce;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/ne;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/bcg;->a:Lcom/google/android/gms/internal/ads/ne;

    if-eq v0, v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/bcg;->b:Lcom/google/android/gms/internal/ads/bce;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/bce;->e(Lcom/google/android/gms/internal/ads/bce;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/bby;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bby;->a()V

    goto :goto_0

    :cond_1
    return-void
.end method
