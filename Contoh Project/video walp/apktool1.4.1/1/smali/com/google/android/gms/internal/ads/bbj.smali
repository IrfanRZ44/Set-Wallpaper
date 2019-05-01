.class public final Lcom/google/android/gms/internal/ads/bbj;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/cm;
.end annotation

.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# static fields
.field private static final a:Lcom/google/android/gms/internal/ads/ks;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/ks",
            "<",
            "Lcom/google/android/gms/internal/ads/azo;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Lcom/google/android/gms/internal/ads/ks;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/ks",
            "<",
            "Lcom/google/android/gms/internal/ads/azo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final c:Lcom/google/android/gms/internal/ads/baa;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/bbk;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/bbk;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/bbj;->a:Lcom/google/android/gms/internal/ads/ks;

    new-instance v0, Lcom/google/android/gms/internal/ads/bbl;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/bbl;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/bbj;->b:Lcom/google/android/gms/internal/ads/ks;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzang;Ljava/lang/String;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/baa;

    sget-object v4, Lcom/google/android/gms/internal/ads/bbj;->a:Lcom/google/android/gms/internal/ads/ks;

    sget-object v5, Lcom/google/android/gms/internal/ads/bbj;->b:Lcom/google/android/gms/internal/ads/ks;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/baa;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzang;Ljava/lang/String;Lcom/google/android/gms/internal/ads/ks;Lcom/google/android/gms/internal/ads/ks;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/bbj;->c:Lcom/google/android/gms/internal/ads/baa;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/bbe;Lcom/google/android/gms/internal/ads/bbd;)Lcom/google/android/gms/internal/ads/bbb;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<I:",
            "Ljava/lang/Object;",
            "O:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/bbe",
            "<TI;>;",
            "Lcom/google/android/gms/internal/ads/bbd",
            "<TO;>;)",
            "Lcom/google/android/gms/internal/ads/bbb",
            "<TI;TO;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ads/bbm;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bbj;->c:Lcom/google/android/gms/internal/ads/baa;

    invoke-direct {v0, v1, p1, p2, p3}, Lcom/google/android/gms/internal/ads/bbm;-><init>(Lcom/google/android/gms/internal/ads/baa;Ljava/lang/String;Lcom/google/android/gms/internal/ads/bbe;Lcom/google/android/gms/internal/ads/bbd;)V

    return-object v0
.end method
