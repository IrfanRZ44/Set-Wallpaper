.class final Lcom/google/android/gms/internal/ads/abc;
.super Lcom/google/android/gms/internal/ads/zq;

# interfaces
.implements Lcom/google/android/gms/internal/ads/abj;
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/zq",
        "<",
        "Ljava/lang/Float;",
        ">;",
        "Lcom/google/android/gms/internal/ads/abj",
        "<",
        "Ljava/lang/Float;",
        ">;",
        "Ljava/util/RandomAccess;"
    }
.end annotation


# static fields
.field private static final a:Lcom/google/android/gms/internal/ads/abc;


# instance fields
.field private b:[F

.field private c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/abc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/abc;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/abc;->a:Lcom/google/android/gms/internal/ads/abc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zq;->b()V

    return-void
.end method

.method constructor <init>()V
    .locals 2

    const/16 v0, 0xa

    new-array v0, v0, [F

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/ads/abc;-><init>([FI)V

    return-void
.end method

.method private constructor <init>([FI)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zq;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/abc;->b:[F

    iput p2, p0, Lcom/google/android/gms/internal/ads/abc;->c:I

    return-void
.end method

.method private final a(IF)V
    .locals 4

    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zq;->c()V

    if-ltz p1, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/ads/abc;->c:I

    if-le p1, v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/abc;->c(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget v0, p0, Lcom/google/android/gms/internal/ads/abc;->c:I

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/abc;->b:[F

    array-length v1, v1

    if-ge v0, v1, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/abc;->b:[F

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/abc;->b:[F

    add-int/lit8 v2, p1, 0x1

    iget v3, p0, Lcom/google/android/gms/internal/ads/abc;->c:I

    sub-int/2addr v3, p1

    invoke-static {v0, p1, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/abc;->b:[F

    aput p2, v0, p1

    iget v0, p0, Lcom/google/android/gms/internal/ads/abc;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/abc;->c:I

    iget v0, p0, Lcom/google/android/gms/internal/ads/abc;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/abc;->modCount:I

    return-void

    :cond_2
    iget v0, p0, Lcom/google/android/gms/internal/ads/abc;->c:I

    mul-int/lit8 v0, v0, 0x3

    div-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x1

    new-array v0, v0, [F

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/abc;->b:[F

    invoke-static {v1, v2, v0, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/abc;->b:[F

    add-int/lit8 v2, p1, 0x1

    iget v3, p0, Lcom/google/android/gms/internal/ads/abc;->c:I

    sub-int/2addr v3, p1

    invoke-static {v1, p1, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/abc;->b:[F

    goto :goto_0
.end method

.method private final b(I)V
    .locals 2

    if-ltz p1, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/ads/abc;->c:I

    if-lt p1, v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/abc;->c(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method

.method private final c(I)Ljava/lang/String;
    .locals 3

    iget v0, p0, Lcom/google/android/gms/internal/ads/abc;->c:I

    const/16 v1, 0x23

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Index:"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", Size:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final synthetic a(I)Lcom/google/android/gms/internal/ads/abj;
    .locals 3

    iget v0, p0, Lcom/google/android/gms/internal/ads/abc;->c:I

    if-ge p1, v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/abc;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/abc;->b:[F

    invoke-static {v1, p1}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object v1

    iget v2, p0, Lcom/google/android/gms/internal/ads/abc;->c:I

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/abc;-><init>([FI)V

    return-object v0
.end method

.method public final a(F)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/abc;->c:I

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/internal/ads/abc;->a(IF)V

    return-void
.end method

.method public final synthetic add(ILjava/lang/Object;)V
    .locals 1

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/abc;->a(IF)V

    return-void
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<+",
            "Ljava/lang/Float;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zq;->c()V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/abg;->a(Ljava/lang/Object;)Ljava/lang/Object;

    instance-of v1, p1, Lcom/google/android/gms/internal/ads/abc;

    if-nez v1, :cond_1

    invoke-super {p0, p1}, Lcom/google/android/gms/internal/ads/zq;->addAll(Ljava/util/Collection;)Z

    move-result v0

    :cond_0
    :goto_0
    return v0

    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/ads/abc;

    iget v1, p1, Lcom/google/android/gms/internal/ads/abc;->c:I

    if-eqz v1, :cond_0

    const v1, 0x7fffffff

    iget v2, p0, Lcom/google/android/gms/internal/ads/abc;->c:I

    sub-int/2addr v1, v2

    iget v2, p1, Lcom/google/android/gms/internal/ads/abc;->c:I

    if-ge v1, v2, :cond_2

    new-instance v0, Ljava/lang/OutOfMemoryError;

    invoke-direct {v0}, Ljava/lang/OutOfMemoryError;-><init>()V

    throw v0

    :cond_2
    iget v1, p0, Lcom/google/android/gms/internal/ads/abc;->c:I

    iget v2, p1, Lcom/google/android/gms/internal/ads/abc;->c:I

    add-int/2addr v1, v2

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/abc;->b:[F

    array-length v2, v2

    if-le v1, v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/abc;->b:[F

    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/abc;->b:[F

    :cond_3
    iget-object v2, p1, Lcom/google/android/gms/internal/ads/abc;->b:[F

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/abc;->b:[F

    iget v4, p0, Lcom/google/android/gms/internal/ads/abc;->c:I

    iget v5, p1, Lcom/google/android/gms/internal/ads/abc;->c:I

    invoke-static {v2, v0, v3, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput v1, p0, Lcom/google/android/gms/internal/ads/abc;->c:I

    iget v0, p0, Lcom/google/android/gms/internal/ads/abc;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/abc;->modCount:I

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v2, 0x1

    const/4 v1, 0x0

    if-ne p0, p1, :cond_1

    move v1, v2

    :cond_0
    :goto_0
    return v1

    :cond_1
    instance-of v0, p1, Lcom/google/android/gms/internal/ads/abc;

    if-nez v0, :cond_2

    invoke-super {p0, p1}, Lcom/google/android/gms/internal/ads/zq;->equals(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    :cond_2
    check-cast p1, Lcom/google/android/gms/internal/ads/abc;

    iget v0, p0, Lcom/google/android/gms/internal/ads/abc;->c:I

    iget v3, p1, Lcom/google/android/gms/internal/ads/abc;->c:I

    if-ne v0, v3, :cond_0

    iget-object v3, p1, Lcom/google/android/gms/internal/ads/abc;->b:[F

    move v0, v1

    :goto_1
    iget v4, p0, Lcom/google/android/gms/internal/ads/abc;->c:I

    if-ge v0, v4, :cond_3

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/abc;->b:[F

    aget v4, v4, v0

    aget v5, v3, v0

    cmpl-float v4, v4, v5

    if-nez v4, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    move v1, v2

    goto :goto_0
.end method

.method public final synthetic get(I)Ljava/lang/Object;
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/abc;->b(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/abc;->b:[F

    aget v0, v0, p1

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    const/4 v1, 0x1

    const/4 v0, 0x0

    :goto_0
    iget v2, p0, Lcom/google/android/gms/internal/ads/abc;->c:I

    if-ge v0, v2, :cond_0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/abc;->b:[F

    aget v2, v2, v0

    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v2

    add-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return v1
.end method

.method public final synthetic remove(I)Ljava/lang/Object;
    .locals 5

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zq;->c()V

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/abc;->b(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/abc;->b:[F

    aget v0, v0, p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/abc;->c:I

    add-int/lit8 v1, v1, -0x1

    if-ge p1, v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/abc;->b:[F

    add-int/lit8 v2, p1, 0x1

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/abc;->b:[F

    iget v4, p0, Lcom/google/android/gms/internal/ads/abc;->c:I

    sub-int/2addr v4, p1

    invoke-static {v1, v2, v3, p1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_0
    iget v1, p0, Lcom/google/android/gms/internal/ads/abc;->c:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lcom/google/android/gms/internal/ads/abc;->c:I

    iget v1, p0, Lcom/google/android/gms/internal/ads/abc;->modCount:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/google/android/gms/internal/ads/abc;->modCount:I

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 5

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zq;->c()V

    move v0, v1

    :goto_0
    iget v2, p0, Lcom/google/android/gms/internal/ads/abc;->c:I

    if-ge v0, v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/abc;->b:[F

    aget v2, v2, v0

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/abc;->b:[F

    add-int/lit8 v2, v0, 0x1

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/abc;->b:[F

    iget v4, p0, Lcom/google/android/gms/internal/ads/abc;->c:I

    sub-int/2addr v4, v0

    invoke-static {v1, v2, v3, v0, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v0, p0, Lcom/google/android/gms/internal/ads/abc;->c:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/abc;->c:I

    iget v0, p0, Lcom/google/android/gms/internal/ads/abc;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/abc;->modCount:I

    const/4 v1, 0x1

    :cond_0
    return v1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method protected final removeRange(II)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zq;->c()V

    if-ge p2, p1, :cond_0

    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "toIndex < fromIndex"

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/abc;->b:[F

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/abc;->b:[F

    iget v2, p0, Lcom/google/android/gms/internal/ads/abc;->c:I

    sub-int/2addr v2, p2

    invoke-static {v0, p2, v1, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v0, p0, Lcom/google/android/gms/internal/ads/abc;->c:I

    sub-int v1, p2, p1

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/ads/abc;->c:I

    iget v0, p0, Lcom/google/android/gms/internal/ads/abc;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/abc;->modCount:I

    return-void
.end method

.method public final synthetic set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zq;->c()V

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/abc;->b(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/abc;->b:[F

    aget v1, v1, p1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/abc;->b:[F

    aput v0, v2, p1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/abc;->c:I

    return v0
.end method
