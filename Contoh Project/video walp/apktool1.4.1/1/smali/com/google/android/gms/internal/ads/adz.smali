.class final Lcom/google/android/gms/internal/ads/adz;
.super Lcom/google/android/gms/internal/ads/adx;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/adx",
        "<",
        "Lcom/google/android/gms/internal/ads/ady;",
        "Lcom/google/android/gms/internal/ads/ady;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/adx;-><init>()V

    return-void
.end method

.method private static a(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/ady;)V
    .locals 0

    check-cast p0, Lcom/google/android/gms/internal/ads/abe;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/abe;->zzdtt:Lcom/google/android/gms/internal/ads/ady;

    return-void
.end method


# virtual methods
.method final synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/ady;->b()Lcom/google/android/gms/internal/ads/ady;

    move-result-object v0

    return-object v0
.end method

.method final synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/ads/ady;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ady;->c()V

    return-object p1
.end method

.method final synthetic a(Ljava/lang/Object;II)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/ads/ady;

    shl-int/lit8 v0, p2, 0x3

    or-int/lit8 v0, v0, 0x5

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/ads/ady;->a(ILjava/lang/Object;)V

    return-void
.end method

.method final synthetic a(Ljava/lang/Object;IJ)V
    .locals 3

    check-cast p1, Lcom/google/android/gms/internal/ads/ady;

    shl-int/lit8 v0, p2, 0x3

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/ads/ady;->a(ILjava/lang/Object;)V

    return-void
.end method

.method final synthetic a(Ljava/lang/Object;ILcom/google/android/gms/internal/ads/zw;)V
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/ads/ady;

    shl-int/lit8 v0, p2, 0x3

    or-int/lit8 v0, v0, 0x2

    invoke-virtual {p1, v0, p3}, Lcom/google/android/gms/internal/ads/ady;->a(ILjava/lang/Object;)V

    return-void
.end method

.method final synthetic a(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/ads/ady;

    check-cast p3, Lcom/google/android/gms/internal/ads/ady;

    shl-int/lit8 v0, p2, 0x3

    or-int/lit8 v0, v0, 0x3

    invoke-virtual {p1, v0, p3}, Lcom/google/android/gms/internal/ads/ady;->a(ILjava/lang/Object;)V

    return-void
.end method

.method final synthetic a(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/aer;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/ads/ady;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/ady;->b(Lcom/google/android/gms/internal/ads/aer;)V

    return-void
.end method

.method final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/google/android/gms/internal/ads/ady;

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/adz;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/ady;)V

    return-void
.end method

.method final a(Lcom/google/android/gms/internal/ads/add;)Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method final synthetic b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/ads/abe;

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/abe;->zzdtt:Lcom/google/android/gms/internal/ads/ady;

    return-object v0
.end method

.method final synthetic b(Ljava/lang/Object;IJ)V
    .locals 3

    check-cast p1, Lcom/google/android/gms/internal/ads/ady;

    shl-int/lit8 v0, p2, 0x3

    or-int/lit8 v0, v0, 0x1

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/ads/ady;->a(ILjava/lang/Object;)V

    return-void
.end method

.method final synthetic b(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/aer;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/ads/ady;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/ady;->a(Lcom/google/android/gms/internal/ads/aer;)V

    return-void
.end method

.method final synthetic b(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/google/android/gms/internal/ads/ady;

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/adz;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/ady;)V

    return-void
.end method

.method final synthetic c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/abe;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/abe;->zzdtt:Lcom/google/android/gms/internal/ads/ady;

    invoke-static {}, Lcom/google/android/gms/internal/ads/ady;->a()Lcom/google/android/gms/internal/ads/ady;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/ady;->b()Lcom/google/android/gms/internal/ads/ady;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/adz;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/ady;)V

    :cond_0
    return-object v0
.end method

.method final synthetic c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/ads/ady;

    check-cast p2, Lcom/google/android/gms/internal/ads/ady;

    invoke-static {}, Lcom/google/android/gms/internal/ads/ady;->a()Lcom/google/android/gms/internal/ads/ady;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ads/ady;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-object p1

    :cond_0
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/ady;->a(Lcom/google/android/gms/internal/ads/ady;Lcom/google/android/gms/internal/ads/ady;)Lcom/google/android/gms/internal/ads/ady;

    move-result-object p1

    goto :goto_0
.end method

.method final d(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/ads/abe;

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/abe;->zzdtt:Lcom/google/android/gms/internal/ads/ady;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ady;->c()V

    return-void
.end method

.method final synthetic e(Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/ads/ady;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ady;->d()I

    move-result v0

    return v0
.end method

.method final synthetic f(Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/ads/ady;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ady;->e()I

    move-result v0

    return v0
.end method
