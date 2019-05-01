.class final Lcom/google/android/gms/internal/ads/azy;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/ads/internal/gmsg/zzv;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/ads/internal/gmsg/zzv",
        "<",
        "Lcom/google/android/gms/internal/ads/qe;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/ads/internal/gmsg/zzv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/ads/internal/gmsg/zzv",
            "<-",
            "Lcom/google/android/gms/internal/ads/bax;",
            ">;"
        }
    .end annotation
.end field

.field private final synthetic b:Lcom/google/android/gms/internal/ads/azq;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/azq;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/ads/internal/gmsg/zzv",
            "<-",
            "Lcom/google/android/gms/internal/ads/bax;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/azy;->b:Lcom/google/android/gms/internal/ads/azq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/azy;->a:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/azy;)Lcom/google/android/gms/ads/internal/gmsg/zzv;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/azy;->a:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    return-object v0
.end method


# virtual methods
.method public final synthetic zza(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/azy;->a:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/azy;->b:Lcom/google/android/gms/internal/ads/azq;

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/ads/internal/gmsg/zzv;->zza(Ljava/lang/Object;Ljava/util/Map;)V

    return-void
.end method
