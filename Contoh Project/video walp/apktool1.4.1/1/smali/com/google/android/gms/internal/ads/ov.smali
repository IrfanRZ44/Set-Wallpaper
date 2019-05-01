.class public final Lcom/google/android/gms/internal/ads/ov;
.super Lcom/google/android/gms/internal/ads/oo;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/cm;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/oo;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/pd;IZLcom/google/android/gms/internal/ads/asn;Lcom/google/android/gms/internal/ads/pc;)Lcom/google/android/gms/internal/ads/on;
    .locals 8

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/common/util/k;->b()Z

    move-result v1

    if-eqz v1, :cond_1

    if-eqz v0, :cond_0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    if-nez v0, :cond_2

    const/4 v0, 0x0

    :goto_1
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    new-instance v7, Lcom/google/android/gms/internal/ads/ob;

    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/pd;->r()Lcom/google/android/gms/internal/ads/rs;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rs;->d()Z

    move-result v6

    new-instance v0, Lcom/google/android/gms/internal/ads/pe;

    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/pd;->i()Lcom/google/android/gms/internal/ads/zzang;

    move-result-object v2

    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/pd;->g()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/pd;->c()Lcom/google/android/gms/internal/ads/asl;

    move-result-object v5

    move-object v1, p1

    move-object v4, p5

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/pe;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzang;Ljava/lang/String;Lcom/google/android/gms/internal/ads/asn;Lcom/google/android/gms/internal/ads/asl;)V

    move-object v1, v7

    move-object v2, p1

    move v3, p4

    move v4, v6

    move-object v5, p6

    move-object v6, v0

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/ob;-><init>(Landroid/content/Context;ZZLcom/google/android/gms/internal/ads/pc;Lcom/google/android/gms/internal/ads/pe;)V

    move-object v0, v7

    goto :goto_1
.end method
