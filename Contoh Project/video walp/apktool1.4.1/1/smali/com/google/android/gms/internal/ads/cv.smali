.class final synthetic Lcom/google/android/gms/internal/ads/cv;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/amk;


# static fields
.field static final a:Lcom/google/android/gms/internal/ads/amk;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/cv;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/cv;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/cv;->a:Lcom/google/android/gms/internal/ads/amk;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/ana;)V
    .locals 2

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/ana;->d:Lcom/google/android/gms/internal/ads/amt;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/amt;->a:Ljava/lang/Integer;

    return-void
.end method