.class public final Lcom/google/android/gms/internal/ads/ana;
.super Lcom/google/android/gms/internal/ads/aew;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/aew",
        "<",
        "Lcom/google/android/gms/internal/ads/ana;",
        ">;"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:[J

.field public c:Lcom/google/android/gms/internal/ads/amy;

.field public d:Lcom/google/android/gms/internal/ads/amt;

.field private e:Ljava/lang/Integer;

.field private f:Ljava/lang/Integer;

.field private g:Ljava/lang/Integer;

.field private h:Lcom/google/android/gms/internal/ads/anl;

.field private i:Lcom/google/android/gms/internal/ads/amz;

.field private j:Lcom/google/android/gms/internal/ads/ane;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/aew;-><init>()V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/ana;->e:Ljava/lang/Integer;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/ana;->a:Ljava/lang/String;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/ana;->f:Ljava/lang/Integer;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/ana;->g:Ljava/lang/Integer;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/ana;->h:Lcom/google/android/gms/internal/ads/anl;

    sget-object v0, Lcom/google/android/gms/internal/ads/aff;->b:[J

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ana;->b:[J

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/ana;->c:Lcom/google/android/gms/internal/ads/amy;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/ana;->i:Lcom/google/android/gms/internal/ads/amz;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/ana;->j:Lcom/google/android/gms/internal/ads/ane;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/ana;->d:Lcom/google/android/gms/internal/ads/amt;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/ana;->Y:Lcom/google/android/gms/internal/ads/aey;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/ana;->Z:I

    return-void
.end method

.method private final b(Lcom/google/android/gms/internal/ads/aes;)Lcom/google/android/gms/internal/ads/ana;
    .locals 6

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/aes;->a()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-super {p0, p1, v0}, Lcom/google/android/gms/internal/ads/aew;->a(Lcom/google/android/gms/internal/ads/aes;I)Z

    move-result v0

    if-nez v0, :cond_0

    :sswitch_0
    return-object p0

    :sswitch_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/aes;->g()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ana;->e:Ljava/lang/Integer;

    goto :goto_0

    :sswitch_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/aes;->e()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ana;->a:Ljava/lang/String;

    goto :goto_0

    :sswitch_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/aes;->g()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ana;->f:Ljava/lang/Integer;

    goto :goto_0

    :sswitch_4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/aes;->j()I

    move-result v2

    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/aes;->g()I

    move-result v3

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/ams;->a(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, p0, Lcom/google/android/gms/internal/ads/ana;->g:Ljava/lang/Integer;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/ads/aes;->e(I)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/ads/aew;->a(Lcom/google/android/gms/internal/ads/aes;I)Z

    goto :goto_0

    :sswitch_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ana;->h:Lcom/google/android/gms/internal/ads/anl;

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/ads/anl;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/anl;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ana;->h:Lcom/google/android/gms/internal/ads/anl;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ana;->h:Lcom/google/android/gms/internal/ads/anl;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/aes;->a(Lcom/google/android/gms/internal/ads/afc;)V

    goto :goto_0

    :sswitch_6
    const/16 v0, 0x70

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/aff;->a(Lcom/google/android/gms/internal/ads/aes;I)I

    move-result v2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ana;->b:[J

    if-nez v0, :cond_3

    move v0, v1

    :goto_1
    add-int/2addr v2, v0

    new-array v2, v2, [J

    if-eqz v0, :cond_2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/ana;->b:[J

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_2
    :goto_2
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_4

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/aes;->h()J

    move-result-wide v4

    aput-wide v4, v2, v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/aes;->a()I

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ana;->b:[J

    array-length v0, v0

    goto :goto_1

    :cond_4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/aes;->h()J

    move-result-wide v4

    aput-wide v4, v2, v0

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/ana;->b:[J

    goto/16 :goto_0

    :sswitch_7
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/aes;->g()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/aes;->c(I)I

    move-result v3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/aes;->j()I

    move-result v2

    move v0, v1

    :goto_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/aes;->i()I

    move-result v4

    if-lez v4, :cond_5

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/aes;->h()J

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_5
    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/ads/aes;->e(I)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ana;->b:[J

    if-nez v2, :cond_7

    move v2, v1

    :goto_4
    add-int/2addr v0, v2

    new-array v0, v0, [J

    if-eqz v2, :cond_6

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/ana;->b:[J

    invoke-static {v4, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_6
    :goto_5
    array-length v4, v0

    if-ge v2, v4, :cond_8

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/aes;->h()J

    move-result-wide v4

    aput-wide v4, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_7
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ana;->b:[J

    array-length v2, v2

    goto :goto_4

    :cond_8
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ana;->b:[J

    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/ads/aes;->d(I)V

    goto/16 :goto_0

    :sswitch_8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ana;->c:Lcom/google/android/gms/internal/ads/amy;

    if-nez v0, :cond_9

    new-instance v0, Lcom/google/android/gms/internal/ads/amy;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/amy;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ana;->c:Lcom/google/android/gms/internal/ads/amy;

    :cond_9
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ana;->c:Lcom/google/android/gms/internal/ads/amy;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/aes;->a(Lcom/google/android/gms/internal/ads/afc;)V

    goto/16 :goto_0

    :sswitch_9
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ana;->i:Lcom/google/android/gms/internal/ads/amz;

    if-nez v0, :cond_a

    new-instance v0, Lcom/google/android/gms/internal/ads/amz;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/amz;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ana;->i:Lcom/google/android/gms/internal/ads/amz;

    :cond_a
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ana;->i:Lcom/google/android/gms/internal/ads/amz;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/aes;->a(Lcom/google/android/gms/internal/ads/afc;)V

    goto/16 :goto_0

    :sswitch_a
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ana;->j:Lcom/google/android/gms/internal/ads/ane;

    if-nez v0, :cond_b

    new-instance v0, Lcom/google/android/gms/internal/ads/ane;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/ane;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ana;->j:Lcom/google/android/gms/internal/ads/ane;

    :cond_b
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ana;->j:Lcom/google/android/gms/internal/ads/ane;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/aes;->a(Lcom/google/android/gms/internal/ads/afc;)V

    goto/16 :goto_0

    :sswitch_b
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ana;->d:Lcom/google/android/gms/internal/ads/amt;

    if-nez v0, :cond_c

    new-instance v0, Lcom/google/android/gms/internal/ads/amt;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/amt;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ana;->d:Lcom/google/android/gms/internal/ads/amt;

    :cond_c
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ana;->d:Lcom/google/android/gms/internal/ads/amt;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/aes;->a(Lcom/google/android/gms/internal/ads/afc;)V

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x48 -> :sswitch_1
        0x52 -> :sswitch_2
        0x58 -> :sswitch_3
        0x60 -> :sswitch_4
        0x6a -> :sswitch_5
        0x70 -> :sswitch_6
        0x72 -> :sswitch_7
        0x7a -> :sswitch_8
        0x82 -> :sswitch_9
        0x8a -> :sswitch_a
        0x92 -> :sswitch_b
    .end sparse-switch
.end method


# virtual methods
.method protected final a()I
    .locals 6

    const/4 v1, 0x0

    invoke-super {p0}, Lcom/google/android/gms/internal/ads/aew;->a()I

    move-result v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ana;->e:Ljava/lang/Integer;

    if-eqz v2, :cond_0

    const/16 v2, 0x9

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/ana;->e:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/aeu;->b(II)I

    move-result v2

    add-int/2addr v0, v2

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ana;->a:Ljava/lang/String;

    if-eqz v2, :cond_1

    const/16 v2, 0xa

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/ana;->a:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/aeu;->b(ILjava/lang/String;)I

    move-result v2

    add-int/2addr v0, v2

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ana;->f:Ljava/lang/Integer;

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ana;->f:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0xb

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/aeu;->b(I)I

    move-result v3

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/aeu;->d(I)I

    move-result v2

    add-int/2addr v2, v3

    add-int/2addr v0, v2

    :cond_2
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ana;->g:Ljava/lang/Integer;

    if-eqz v2, :cond_3

    const/16 v2, 0xc

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/ana;->g:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/aeu;->b(II)I

    move-result v2

    add-int/2addr v0, v2

    :cond_3
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ana;->h:Lcom/google/android/gms/internal/ads/anl;

    if-eqz v2, :cond_4

    const/16 v2, 0xd

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/ana;->h:Lcom/google/android/gms/internal/ads/anl;

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/aeu;->b(ILcom/google/android/gms/internal/ads/afc;)I

    move-result v2

    add-int/2addr v0, v2

    :cond_4
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ana;->b:[J

    if-eqz v2, :cond_6

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ana;->b:[J

    array-length v2, v2

    if-lez v2, :cond_6

    move v2, v1

    :goto_0
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/ana;->b:[J

    array-length v3, v3

    if-ge v1, v3, :cond_5

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/ana;->b:[J

    aget-wide v4, v3, v1

    invoke-static {v4, v5}, Lcom/google/android/gms/internal/ads/aeu;->a(J)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_5
    add-int/2addr v0, v2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ana;->b:[J

    array-length v1, v1

    mul-int/lit8 v1, v1, 0x1

    add-int/2addr v0, v1

    :cond_6
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ana;->c:Lcom/google/android/gms/internal/ads/amy;

    if-eqz v1, :cond_7

    const/16 v1, 0xf

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ana;->c:Lcom/google/android/gms/internal/ads/amy;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/aeu;->b(ILcom/google/android/gms/internal/ads/afc;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_7
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ana;->i:Lcom/google/android/gms/internal/ads/amz;

    if-eqz v1, :cond_8

    const/16 v1, 0x10

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ana;->i:Lcom/google/android/gms/internal/ads/amz;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/aeu;->b(ILcom/google/android/gms/internal/ads/afc;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_8
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ana;->j:Lcom/google/android/gms/internal/ads/ane;

    if-eqz v1, :cond_9

    const/16 v1, 0x11

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ana;->j:Lcom/google/android/gms/internal/ads/ane;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/aeu;->b(ILcom/google/android/gms/internal/ads/afc;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_9
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ana;->d:Lcom/google/android/gms/internal/ads/amt;

    if-eqz v1, :cond_a

    const/16 v1, 0x12

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ana;->d:Lcom/google/android/gms/internal/ads/amt;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/aeu;->b(ILcom/google/android/gms/internal/ads/afc;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_a
    return v0
.end method

.method public final synthetic a(Lcom/google/android/gms/internal/ads/aes;)Lcom/google/android/gms/internal/ads/afc;
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/ana;->b(Lcom/google/android/gms/internal/ads/aes;)Lcom/google/android/gms/internal/ads/ana;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/google/android/gms/internal/ads/aeu;)V
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ana;->e:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    const/16 v1, 0x9

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ana;->e:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/internal/ads/aeu;->a(II)V

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ana;->a:Ljava/lang/String;

    if-eqz v1, :cond_1

    const/16 v1, 0xa

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ana;->a:Ljava/lang/String;

    invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/internal/ads/aeu;->a(ILjava/lang/String;)V

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ana;->f:Ljava/lang/Integer;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ana;->f:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0xb

    invoke-virtual {p1, v2, v0}, Lcom/google/android/gms/internal/ads/aeu;->c(II)V

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/aeu;->c(I)V

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ana;->g:Ljava/lang/Integer;

    if-eqz v1, :cond_3

    const/16 v1, 0xc

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ana;->g:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/internal/ads/aeu;->a(II)V

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ana;->h:Lcom/google/android/gms/internal/ads/anl;

    if-eqz v1, :cond_4

    const/16 v1, 0xd

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ana;->h:Lcom/google/android/gms/internal/ads/anl;

    invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/internal/ads/aeu;->a(ILcom/google/android/gms/internal/ads/afc;)V

    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ana;->b:[J

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ana;->b:[J

    array-length v1, v1

    if-lez v1, :cond_5

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ana;->b:[J

    array-length v1, v1

    if-ge v0, v1, :cond_5

    const/16 v1, 0xe

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ana;->b:[J

    aget-wide v2, v2, v0

    invoke-virtual {p1, v1, v2, v3}, Lcom/google/android/gms/internal/ads/aeu;->a(IJ)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ana;->c:Lcom/google/android/gms/internal/ads/amy;

    if-eqz v0, :cond_6

    const/16 v0, 0xf

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ana;->c:Lcom/google/android/gms/internal/ads/amy;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/ads/aeu;->a(ILcom/google/android/gms/internal/ads/afc;)V

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ana;->i:Lcom/google/android/gms/internal/ads/amz;

    if-eqz v0, :cond_7

    const/16 v0, 0x10

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ana;->i:Lcom/google/android/gms/internal/ads/amz;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/ads/aeu;->a(ILcom/google/android/gms/internal/ads/afc;)V

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ana;->j:Lcom/google/android/gms/internal/ads/ane;

    if-eqz v0, :cond_8

    const/16 v0, 0x11

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ana;->j:Lcom/google/android/gms/internal/ads/ane;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/ads/aeu;->a(ILcom/google/android/gms/internal/ads/afc;)V

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ana;->d:Lcom/google/android/gms/internal/ads/amt;

    if-eqz v0, :cond_9

    const/16 v0, 0x12

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ana;->d:Lcom/google/android/gms/internal/ads/amt;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/ads/aeu;->a(ILcom/google/android/gms/internal/ads/afc;)V

    :cond_9
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/ads/aew;->a(Lcom/google/android/gms/internal/ads/aeu;)V

    return-void
.end method
