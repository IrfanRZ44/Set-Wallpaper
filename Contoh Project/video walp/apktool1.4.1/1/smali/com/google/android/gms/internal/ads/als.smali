.class public final Lcom/google/android/gms/internal/ads/als;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/ac;


# instance fields
.field private a:I

.field private b:I

.field private final c:I

.field private final d:F


# direct methods
.method public constructor <init>()V
    .locals 3

    const/16 v0, 0x9c4

    const/4 v1, 0x1

    const/high16 v2, 0x3f80

    invoke-direct {p0, v0, v1, v2}, Lcom/google/android/gms/internal/ads/als;-><init>(IIF)V

    return-void
.end method

.method private constructor <init>(IIF)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x9c4

    iput v0, p0, Lcom/google/android/gms/internal/ads/als;->a:I

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/als;->c:I

    const/high16 v0, 0x3f80

    iput v0, p0, Lcom/google/android/gms/internal/ads/als;->d:F

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/als;->a:I

    return v0
.end method

.method public final a(Lcom/google/android/gms/internal/ads/df;)V
    .locals 3

    iget v0, p0, Lcom/google/android/gms/internal/ads/als;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/als;->b:I

    iget v0, p0, Lcom/google/android/gms/internal/ads/als;->a:I

    int-to-float v0, v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/als;->a:I

    int-to-float v1, v1

    iget v2, p0, Lcom/google/android/gms/internal/ads/als;->d:F

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/google/android/gms/internal/ads/als;->a:I

    iget v0, p0, Lcom/google/android/gms/internal/ads/als;->b:I

    iget v1, p0, Lcom/google/android/gms/internal/ads/als;->c:I

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    if-nez v0, :cond_1

    throw p1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/als;->b:I

    return v0
.end method
