.class public abstract Lcom/google/android/gms/internal/ads/aew;
.super Lcom/google/android/gms/internal/ads/afc;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<M:",
        "Lcom/google/android/gms/internal/ads/aew",
        "<TM;>;>",
        "Lcom/google/android/gms/internal/ads/afc;"
    }
.end annotation


# instance fields
.field protected Y:Lcom/google/android/gms/internal/ads/aey;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/afc;-><init>()V

    return-void
.end method


# virtual methods
.method protected a()I
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aew;->Y:Lcom/google/android/gms/internal/ads/aey;

    if-eqz v1, :cond_0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/aew;->Y:Lcom/google/android/gms/internal/ads/aey;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/aey;->a()I

    move-result v2

    if-ge v0, v2, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/aew;->Y:Lcom/google/android/gms/internal/ads/aey;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/aey;->b(I)Lcom/google/android/gms/internal/ads/aez;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/aez;->a()I

    move-result v2

    add-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    move v1, v0

    :cond_1
    return v1
.end method

.method public a(Lcom/google/android/gms/internal/ads/aeu;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aew;->Y:Lcom/google/android/gms/internal/ads/aey;

    if-nez v0, :cond_1

    :cond_0
    return-void

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aew;->Y:Lcom/google/android/gms/internal/ads/aey;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aey;->a()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aew;->Y:Lcom/google/android/gms/internal/ads/aey;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/aey;->b(I)Lcom/google/android/gms/internal/ads/aez;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/aez;->a(Lcom/google/android/gms/internal/ads/aeu;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method protected final a(Lcom/google/android/gms/internal/ads/aes;I)Z
    .locals 4

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/aes;->j()I

    move-result v0

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/aes;->b(I)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    ushr-int/lit8 v1, p2, 0x3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/aes;->j()I

    move-result v2

    sub-int/2addr v2, v0

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/ads/aes;->a(II)[B

    move-result-object v0

    new-instance v2, Lcom/google/android/gms/internal/ads/afe;

    invoke-direct {v2, p2, v0}, Lcom/google/android/gms/internal/ads/afe;-><init>(I[B)V

    const/4 v0, 0x0

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/aew;->Y:Lcom/google/android/gms/internal/ads/aey;

    if-nez v3, :cond_2

    new-instance v3, Lcom/google/android/gms/internal/ads/aey;

    invoke-direct {v3}, Lcom/google/android/gms/internal/ads/aey;-><init>()V

    iput-object v3, p0, Lcom/google/android/gms/internal/ads/aew;->Y:Lcom/google/android/gms/internal/ads/aey;

    :goto_1
    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/ads/aez;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/aez;-><init>()V

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/aew;->Y:Lcom/google/android/gms/internal/ads/aey;

    invoke-virtual {v3, v1, v0}, Lcom/google/android/gms/internal/ads/aey;->a(ILcom/google/android/gms/internal/ads/aez;)V

    :cond_1
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/aez;->a(Lcom/google/android/gms/internal/ads/afe;)V

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aew;->Y:Lcom/google/android/gms/internal/ads/aey;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/aey;->a(I)Lcom/google/android/gms/internal/ads/aez;

    move-result-object v0

    goto :goto_1
.end method

.method public final synthetic c()Lcom/google/android/gms/internal/ads/afc;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/afc;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/aew;

    return-object v0
.end method

.method public synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/internal/ads/afc;->c()Lcom/google/android/gms/internal/ads/afc;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/aew;

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/ads/afa;->a(Lcom/google/android/gms/internal/ads/aew;Lcom/google/android/gms/internal/ads/aew;)V

    return-object v0
.end method
