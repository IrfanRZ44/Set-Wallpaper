.class public final Lcom/google/android/gms/internal/ads/aff;
.super Ljava/lang/Object;


# static fields
.field public static final a:[I

.field public static final b:[J

.field public static final c:[Ljava/lang/String;

.field public static final d:[[B

.field public static final e:[B

.field private static final f:I

.field private static final g:I

.field private static final h:I

.field private static final i:I

.field private static final j:[F

.field private static final k:[D

.field private static final l:[Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v1, 0x0

    const/16 v0, 0xb

    sput v0, Lcom/google/android/gms/internal/ads/aff;->f:I

    const/16 v0, 0xc

    sput v0, Lcom/google/android/gms/internal/ads/aff;->g:I

    const/16 v0, 0x10

    sput v0, Lcom/google/android/gms/internal/ads/aff;->h:I

    const/16 v0, 0x1a

    sput v0, Lcom/google/android/gms/internal/ads/aff;->i:I

    new-array v0, v1, [I

    sput-object v0, Lcom/google/android/gms/internal/ads/aff;->a:[I

    new-array v0, v1, [J

    sput-object v0, Lcom/google/android/gms/internal/ads/aff;->b:[J

    new-array v0, v1, [F

    sput-object v0, Lcom/google/android/gms/internal/ads/aff;->j:[F

    new-array v0, v1, [D

    sput-object v0, Lcom/google/android/gms/internal/ads/aff;->k:[D

    new-array v0, v1, [Z

    sput-object v0, Lcom/google/android/gms/internal/ads/aff;->l:[Z

    new-array v0, v1, [Ljava/lang/String;

    sput-object v0, Lcom/google/android/gms/internal/ads/aff;->c:[Ljava/lang/String;

    new-array v0, v1, [[B

    sput-object v0, Lcom/google/android/gms/internal/ads/aff;->d:[[B

    new-array v0, v1, [B

    sput-object v0, Lcom/google/android/gms/internal/ads/aff;->e:[B

    return-void
.end method

.method public static final a(Lcom/google/android/gms/internal/ads/aes;I)I
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/aes;->j()I

    move-result v1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/aes;->b(I)Z

    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/aes;->a()I

    move-result v2

    if-ne v2, p1, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/aes;->b(I)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v1, p1}, Lcom/google/android/gms/internal/ads/aes;->b(II)V

    return v0
.end method
