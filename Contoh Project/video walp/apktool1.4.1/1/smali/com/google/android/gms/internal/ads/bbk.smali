.class final Lcom/google/android/gms/internal/ads/bbk;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/ks;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/ks",
        "<",
        "Lcom/google/android/gms/internal/ads/azo;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/ads/azo;

    const-string v0, "/log"

    sget-object v1, Lcom/google/android/gms/ads/internal/gmsg/zzf;->zzblu:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/azo;->a(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    const-string v0, "/result"

    sget-object v1, Lcom/google/android/gms/ads/internal/gmsg/zzf;->zzbmc:Lcom/google/android/gms/ads/internal/gmsg/zzaf;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/azo;->a(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    return-void
.end method
