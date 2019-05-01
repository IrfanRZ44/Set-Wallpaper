.class public final Lcom/google/android/gms/internal/ads/ss;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final enum a:I

.field public static final enum b:I

.field public static final enum c:I

.field public static final enum d:I

.field private static final synthetic e:[I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v1, 0x4

    const/4 v0, 0x1

    sput v0, Lcom/google/android/gms/internal/ads/ss;->a:I

    const/4 v0, 0x2

    sput v0, Lcom/google/android/gms/internal/ads/ss;->b:I

    const/4 v0, 0x3

    sput v0, Lcom/google/android/gms/internal/ads/ss;->c:I

    sput v1, Lcom/google/android/gms/internal/ads/ss;->d:I

    new-array v0, v1, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/google/android/gms/internal/ads/ss;->e:[I

    return-void

    :array_0
    .array-data 0x4
        0x1t 0x0t 0x0t 0x0t
        0x2t 0x0t 0x0t 0x0t
        0x3t 0x0t 0x0t 0x0t
        0x4t 0x0t 0x0t 0x0t
    .end array-data
.end method
