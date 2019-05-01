.class final Lcom/google/android/gms/internal/ads/aoo;
.super Lcom/google/android/gms/internal/ads/aoh$a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/aoh$a",
        "<",
        "Lcom/google/android/gms/internal/ads/aux;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic a:Landroid/view/View;

.field private final synthetic b:Ljava/util/HashMap;

.field private final synthetic c:Ljava/util/HashMap;

.field private final synthetic d:Lcom/google/android/gms/internal/ads/aoh;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/aoh;Landroid/view/View;Ljava/util/HashMap;Ljava/util/HashMap;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/aoo;->d:Lcom/google/android/gms/internal/ads/aoh;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/aoo;->a:Landroid/view/View;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/aoo;->b:Ljava/util/HashMap;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/aoo;->c:Ljava/util/HashMap;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/aoh$a;-><init>(Lcom/google/android/gms/internal/ads/aoh;)V

    return-void
.end method


# virtual methods
.method public final synthetic a()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aoo;->d:Lcom/google/android/gms/internal/ads/aoh;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/aoh;->f(Lcom/google/android/gms/internal/ads/aoh;)Lcom/google/android/gms/internal/ads/awp;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aoo;->a:Landroid/view/View;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/aoo;->b:Ljava/util/HashMap;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/aoo;->c:Ljava/util/HashMap;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/awp;->a(Landroid/view/View;Ljava/util/HashMap;Ljava/util/HashMap;)Lcom/google/android/gms/internal/ads/aux;

    move-result-object v0

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aoo;->d:Lcom/google/android/gms/internal/ads/aoh;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aoo;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "native_ad_view_holder_delegate"

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/aoh;->a(Lcom/google/android/gms/internal/ads/aoh;Landroid/content/Context;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/arf;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/arf;-><init>()V

    goto :goto_0
.end method

.method public final synthetic a(Lcom/google/android/gms/internal/ads/apv;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aoo;->a:Landroid/view/View;

    invoke-static {v0}, Lcom/google/android/gms/a/b;->a(Ljava/lang/Object;)Lcom/google/android/gms/a/a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aoo;->b:Ljava/util/HashMap;

    invoke-static {v1}, Lcom/google/android/gms/a/b;->a(Ljava/lang/Object;)Lcom/google/android/gms/a/a;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/aoo;->c:Ljava/util/HashMap;

    invoke-static {v2}, Lcom/google/android/gms/a/b;->a(Ljava/lang/Object;)Lcom/google/android/gms/a/a;

    move-result-object v2

    invoke-interface {p1, v0, v1, v2}, Lcom/google/android/gms/internal/ads/apv;->createNativeAdViewHolderDelegate(Lcom/google/android/gms/a/a;Lcom/google/android/gms/a/a;Lcom/google/android/gms/a/a;)Lcom/google/android/gms/internal/ads/aux;

    move-result-object v0

    return-object v0
.end method
