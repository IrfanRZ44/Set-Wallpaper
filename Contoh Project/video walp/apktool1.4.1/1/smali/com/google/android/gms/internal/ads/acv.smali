.class final Lcom/google/android/gms/internal/ads/acv;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/acu;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    const/4 v1, 0x0

    check-cast p1, Lcom/google/android/gms/internal/ads/abe;

    sget v0, Lcom/google/android/gms/internal/ads/abe$e;->d:I

    invoke-virtual {p1, v0, v1, v1}, Lcom/google/android/gms/internal/ads/abe;->a(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
