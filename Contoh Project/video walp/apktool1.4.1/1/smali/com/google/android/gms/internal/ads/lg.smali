.class public final Lcom/google/android/gms/internal/ads/lg;
.super Lcom/google/android/gms/internal/ads/avs;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/avs",
        "<",
        "Lcom/google/android/gms/internal/ads/atr;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/np;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/np",
            "<",
            "Lcom/google/android/gms/internal/ads/atr;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/google/android/gms/internal/ads/md;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/np;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/np",
            "<",
            "Lcom/google/android/gms/internal/ads/atr;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2}, Lcom/google/android/gms/internal/ads/lg;-><init>(Ljava/lang/String;Ljava/util/Map;Lcom/google/android/gms/internal/ads/np;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/util/Map;Lcom/google/android/gms/internal/ads/np;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/internal/ads/np",
            "<",
            "Lcom/google/android/gms/internal/ads/atr;",
            ">;)V"
        }
    .end annotation

    const/4 v2, 0x0

    const/4 v0, 0x0

    new-instance v1, Lcom/google/android/gms/internal/ads/lh;

    invoke-direct {v1, p3}, Lcom/google/android/gms/internal/ads/lh;-><init>(Lcom/google/android/gms/internal/ads/np;)V

    invoke-direct {p0, v0, p1, v1}, Lcom/google/android/gms/internal/ads/avs;-><init>(ILjava/lang/String;Lcom/google/android/gms/internal/ads/bcx;)V

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/lg;->b:Ljava/util/Map;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/lg;->a:Lcom/google/android/gms/internal/ads/np;

    new-instance v0, Lcom/google/android/gms/internal/ads/md;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/md;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/lg;->c:Lcom/google/android/gms/internal/ads/md;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/lg;->c:Lcom/google/android/gms/internal/ads/md;

    const-string v1, "GET"

    invoke-virtual {v0, p1, v1, v2, v2}, Lcom/google/android/gms/internal/ads/md;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;[B)V

    return-void
.end method


# virtual methods
.method protected final a(Lcom/google/android/gms/internal/ads/atr;)Lcom/google/android/gms/internal/ads/bbw;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/atr;",
            ")",
            "Lcom/google/android/gms/internal/ads/bbw",
            "<",
            "Lcom/google/android/gms/internal/ads/atr;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/og;->a(Lcom/google/android/gms/internal/ads/atr;)Lcom/google/android/gms/internal/ads/agn;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/bbw;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/agn;)Lcom/google/android/gms/internal/ads/bbw;

    move-result-object v0

    return-object v0
.end method

.method protected final synthetic a(Ljava/lang/Object;)V
    .locals 3

    check-cast p1, Lcom/google/android/gms/internal/ads/atr;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/lg;->c:Lcom/google/android/gms/internal/ads/md;

    iget-object v1, p1, Lcom/google/android/gms/internal/ads/atr;->c:Ljava/util/Map;

    iget v2, p1, Lcom/google/android/gms/internal/ads/atr;->a:I

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/md;->a(Ljava/util/Map;I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/lg;->c:Lcom/google/android/gms/internal/ads/md;

    iget-object v1, p1, Lcom/google/android/gms/internal/ads/atr;->b:[B

    invoke-static {}, Lcom/google/android/gms/internal/ads/md;->c()Z

    move-result v2

    if-eqz v2, :cond_0

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/md;->a([B)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/lg;->a:Lcom/google/android/gms/internal/ads/np;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/np;->b(Ljava/lang/Object;)V

    return-void
.end method
