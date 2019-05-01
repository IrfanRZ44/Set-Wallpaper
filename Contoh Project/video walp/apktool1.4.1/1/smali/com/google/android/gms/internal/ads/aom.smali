.class final Lcom/google/android/gms/internal/ads/aom;
.super Lcom/google/android/gms/internal/ads/aoh$a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/aoh$a",
        "<",
        "Lcom/google/android/gms/internal/ads/aqb;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic a:Landroid/content/Context;

.field private final synthetic b:Lcom/google/android/gms/internal/ads/aoh;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/aoh;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/aom;->b:Lcom/google/android/gms/internal/ads/aoh;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/aom;->a:Landroid/content/Context;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/aoh$a;-><init>(Lcom/google/android/gms/internal/ads/aoh;)V

    return-void
.end method


# virtual methods
.method public final synthetic a()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aom;->b:Lcom/google/android/gms/internal/ads/aoh;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/aoh;->d(Lcom/google/android/gms/internal/ads/aoh;)Lcom/google/android/gms/internal/ads/aqw;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aom;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/aqw;->b(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/aqb;

    move-result-object v0

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aom;->b:Lcom/google/android/gms/internal/ads/aoh;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aom;->a:Landroid/content/Context;

    const-string v2, "mobile_ads_settings"

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/aoh;->a(Lcom/google/android/gms/internal/ads/aoh;Landroid/content/Context;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/ard;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/ard;-><init>()V

    goto :goto_0
.end method

.method public final synthetic a(Lcom/google/android/gms/internal/ads/apv;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aom;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/a/b;->a(Ljava/lang/Object;)Lcom/google/android/gms/a/a;

    move-result-object v0

    const v1, 0xbdfcb8

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/apv;->getMobileAdsSettingsManagerWithClientJarVersion(Lcom/google/android/gms/a/a;I)Lcom/google/android/gms/internal/ads/aqb;

    move-result-object v0

    return-object v0
.end method
