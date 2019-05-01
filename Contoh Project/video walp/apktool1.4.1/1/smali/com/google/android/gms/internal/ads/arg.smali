.class public final Lcom/google/android/gms/internal/ads/arg;
.super Lcom/google/android/gms/internal/ads/gd;


# instance fields
.field private a:Lcom/google/android/gms/internal/ads/gh;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/gd;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/arg;)Lcom/google/android/gms/internal/ads/gh;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/arg;->a:Lcom/google/android/gms/internal/ads/gh;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 0

    return-void
.end method

.method public final a(Lcom/google/android/gms/a/a;)V
    .locals 0

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/apo;)V
    .locals 0

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/fz;)V
    .locals 0

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/gh;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/arg;->a:Lcom/google/android/gms/internal/ads/gh;

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/zzahk;)V
    .locals 2

    const-string v0, "This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/mk;->c(Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/lz;->a:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/internal/ads/arh;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/arh;-><init>(Lcom/google/android/gms/internal/ads/arg;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final a(Z)V
    .locals 0

    return-void
.end method

.method public final b()Landroid/os/Bundle;
    .locals 1

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    return-object v0
.end method

.method public final b(Lcom/google/android/gms/a/a;)V
    .locals 0

    return-void
.end method

.method public final c(Lcom/google/android/gms/a/a;)V
    .locals 0

    return-void
.end method

.method public final c()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final d()V
    .locals 0

    return-void
.end method

.method public final e()V
    .locals 0

    return-void
.end method

.method public final f()V
    .locals 0

    return-void
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
