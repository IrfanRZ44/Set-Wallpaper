.class public final Lcom/google/android/gms/internal/ads/uo;
.super Ljava/lang/Object;


# static fields
.field private static final a:Ljava/util/logging/Logger;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/ads/uo;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/uo;->a:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/google/android/gms/internal/ads/tp;)Lcom/google/android/gms/internal/ads/tn;
    .locals 2

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/ads/tw;->a(Lcom/google/android/gms/internal/ads/tp;Lcom/google/android/gms/internal/ads/to;)Lcom/google/android/gms/internal/ads/tu;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/up;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/up;-><init>(Lcom/google/android/gms/internal/ads/tu;)V

    return-object v1
.end method
