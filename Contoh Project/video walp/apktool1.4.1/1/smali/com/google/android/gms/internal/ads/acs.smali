.class final Lcom/google/android/gms/internal/ads/acs;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/ade;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/ade",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/acl;

.field private final b:Lcom/google/android/gms/internal/ads/adx;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/adx",
            "<**>;"
        }
    .end annotation
.end field

.field private final c:Z

.field private final d:Lcom/google/android/gms/internal/ads/aat;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/aat",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/adx;Lcom/google/android/gms/internal/ads/aat;Lcom/google/android/gms/internal/ads/acl;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/adx",
            "<**>;",
            "Lcom/google/android/gms/internal/ads/aat",
            "<*>;",
            "Lcom/google/android/gms/internal/ads/acl;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/acs;->b:Lcom/google/android/gms/internal/ads/adx;

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/ads/aat;->a(Lcom/google/android/gms/internal/ads/acl;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/acs;->c:Z

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/acs;->d:Lcom/google/android/gms/internal/ads/aat;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/acs;->a:Lcom/google/android/gms/internal/ads/acl;

    return-void
.end method

.method static a(Lcom/google/android/gms/internal/ads/adx;Lcom/google/android/gms/internal/ads/aat;Lcom/google/android/gms/internal/ads/acl;)Lcom/google/android/gms/internal/ads/acs;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/ads/adx",
            "<**>;",
            "Lcom/google/android/gms/internal/ads/aat",
            "<*>;",
            "Lcom/google/android/gms/internal/ads/acl;",
            ")",
            "Lcom/google/android/gms/internal/ads/acs",
            "<TT;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ads/acs;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/ads/acs;-><init>(Lcom/google/android/gms/internal/ads/adx;Lcom/google/android/gms/internal/ads/aat;Lcom/google/android/gms/internal/ads/acl;)V

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/acs;->b:Lcom/google/android/gms/internal/ads/adx;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/adx;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/acs;->c:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/acs;->d:Lcom/google/android/gms/internal/ads/aat;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/aat;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/aaw;

    move-result-object v1

    mul-int/lit8 v0, v0, 0x35

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaw;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    return v0
.end method

.method public final a()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/acs;->a:Lcom/google/android/gms/internal/ads/acl;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/acl;->o()Lcom/google/android/gms/internal/ads/acm;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/acm;->d()Lcom/google/android/gms/internal/ads/acl;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/add;Lcom/google/android/gms/internal/ads/aar;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/google/android/gms/internal/ads/add;",
            "Lcom/google/android/gms/internal/ads/aar;",
            ")V"
        }
    .end annotation

    const/4 v1, 0x0

    const v10, 0x7fffffff

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/acs;->b:Lcom/google/android/gms/internal/ads/adx;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/acs;->d:Lcom/google/android/gms/internal/ads/aat;

    invoke-virtual {v4, p1}, Lcom/google/android/gms/internal/ads/adx;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, p1}, Lcom/google/android/gms/internal/ads/aat;->b(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/aaw;

    move-result-object v7

    :cond_0
    :try_start_0
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/add;->a()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-ne v0, v10, :cond_1

    invoke-virtual {v4, p1, v6}, Lcom/google/android/gms/internal/ads/adx;->b(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_1
    :try_start_1
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/add;->b()I

    move-result v0

    const/16 v2, 0xb

    if-eq v0, v2, :cond_5

    and-int/lit8 v2, v0, 0x7

    const/4 v3, 0x2

    if-ne v2, v3, :cond_4

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/acs;->a:Lcom/google/android/gms/internal/ads/acl;

    ushr-int/lit8 v0, v0, 0x3

    invoke-virtual {v5, p3, v2, v0}, Lcom/google/android/gms/internal/ads/aat;->a(Lcom/google/android/gms/internal/ads/aar;Lcom/google/android/gms/internal/ads/acl;I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v5, p2, v0, p3, v7}, Lcom/google/android/gms/internal/ads/aat;->a(Lcom/google/android/gms/internal/ads/add;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/aar;Lcom/google/android/gms/internal/ads/aaw;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_2
    :goto_1
    const/4 v0, 0x1

    :goto_2
    if-nez v0, :cond_0

    invoke-virtual {v4, p1, v6}, Lcom/google/android/gms/internal/ads/adx;->b(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    :try_start_2
    invoke-virtual {v4, v6, p2}, Lcom/google/android/gms/internal/ads/adx;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/add;)Z

    move-result v0

    goto :goto_2

    :cond_4
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/add;->c()Z

    move-result v0

    goto :goto_2

    :cond_5
    const/4 v0, 0x0

    move-object v2, v1

    move v3, v0

    move-object v0, v1

    :cond_6
    :goto_3
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/add;->a()I

    move-result v8

    if-eq v8, v10, :cond_a

    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/add;->b()I

    move-result v8

    const/16 v9, 0x10

    if-ne v8, v9, :cond_7

    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/add;->o()I

    move-result v3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/acs;->a:Lcom/google/android/gms/internal/ads/acl;

    invoke-virtual {v5, p3, v0, v3}, Lcom/google/android/gms/internal/ads/aat;->a(Lcom/google/android/gms/internal/ads/aar;Lcom/google/android/gms/internal/ads/acl;I)Ljava/lang/Object;

    move-result-object v0

    goto :goto_3

    :cond_7
    const/16 v9, 0x1a

    if-ne v8, v9, :cond_9

    if-eqz v0, :cond_8

    invoke-virtual {v5, p2, v0, p3, v7}, Lcom/google/android/gms/internal/ads/aat;->a(Lcom/google/android/gms/internal/ads/add;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/aar;Lcom/google/android/gms/internal/ads/aaw;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v0

    invoke-virtual {v4, p1, v6}, Lcom/google/android/gms/internal/ads/adx;->b(Ljava/lang/Object;Ljava/lang/Object;)V

    throw v0

    :cond_8
    :try_start_3
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/add;->n()Lcom/google/android/gms/internal/ads/zw;

    move-result-object v2

    goto :goto_3

    :cond_9
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/add;->c()Z

    move-result v8

    if-nez v8, :cond_6

    :cond_a
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/add;->b()I

    move-result v8

    const/16 v9, 0xc

    if-eq v8, v9, :cond_b

    invoke-static {}, Lcom/google/android/gms/internal/ads/abk;->e()Lcom/google/android/gms/internal/ads/abk;

    move-result-object v0

    throw v0

    :cond_b
    if-eqz v2, :cond_2

    if-eqz v0, :cond_c

    invoke-virtual {v5, v2, v0, p3, v7}, Lcom/google/android/gms/internal/ads/aat;->a(Lcom/google/android/gms/internal/ads/zw;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/aar;Lcom/google/android/gms/internal/ads/aaw;)V

    goto :goto_1

    :cond_c
    invoke-virtual {v4, v6, v3, v2}, Lcom/google/android/gms/internal/ads/adx;->a(Ljava/lang/Object;ILcom/google/android/gms/internal/ads/zw;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1
.end method

.method public final a(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/aer;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/google/android/gms/internal/ads/aer;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/acs;->d:Lcom/google/android/gms/internal/ads/aat;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/aat;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/aaw;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaw;->e()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/aay;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/aay;->c()Lcom/google/android/gms/internal/ads/aeq;

    move-result-object v3

    sget-object v4, Lcom/google/android/gms/internal/ads/aeq;->i:Lcom/google/android/gms/internal/ads/aeq;

    if-ne v3, v4, :cond_0

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/aay;->d()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/aay;->e()Z

    move-result v3

    if-eqz v3, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Found invalid MessageSet item."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    instance-of v3, v0, Lcom/google/android/gms/internal/ads/abp;

    if-eqz v3, :cond_2

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/aay;->a()I

    move-result v1

    check-cast v0, Lcom/google/android/gms/internal/ads/abp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/abp;->a()Lcom/google/android/gms/internal/ads/abn;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/abs;->c()Lcom/google/android/gms/internal/ads/zw;

    move-result-object v0

    invoke-interface {p2, v1, v0}, Lcom/google/android/gms/internal/ads/aer;->a(ILjava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/aay;->a()I

    move-result v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p2, v1, v0}, Lcom/google/android/gms/internal/ads/aer;->a(ILjava/lang/Object;)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/acs;->b:Lcom/google/android/gms/internal/ads/adx;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/adx;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Lcom/google/android/gms/internal/ads/adx;->b(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/aer;)V

    return-void
.end method

.method public final a(Ljava/lang/Object;[BIILcom/google/android/gms/internal/ads/zt;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;[BII",
            "Lcom/google/android/gms/internal/ads/zt;",
            ")V"
        }
    .end annotation

    const/4 v7, 0x2

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/abe;

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/abe;->zzdtt:Lcom/google/android/gms/internal/ads/ady;

    invoke-static {}, Lcom/google/android/gms/internal/ads/ady;->a()Lcom/google/android/gms/internal/ads/ady;

    move-result-object v0

    if-ne v4, v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/ady;->b()Lcom/google/android/gms/internal/ads/ady;

    move-result-object v4

    check-cast p1, Lcom/google/android/gms/internal/ads/abe;

    iput-object v4, p1, Lcom/google/android/gms/internal/ads/abe;->zzdtt:Lcom/google/android/gms/internal/ads/ady;

    :cond_0
    :goto_0
    if-ge p3, p4, :cond_6

    invoke-static {p2, p3, p5}, Lcom/google/android/gms/internal/ads/zs;->a([BILcom/google/android/gms/internal/ads/zt;)I

    move-result v2

    iget v0, p5, Lcom/google/android/gms/internal/ads/zt;->a:I

    const/16 v1, 0xb

    if-eq v0, v1, :cond_2

    and-int/lit8 v1, v0, 0x7

    if-ne v1, v7, :cond_1

    move-object v1, p2

    move v3, p4

    move-object v5, p5

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zs;->a(I[BIILcom/google/android/gms/internal/ads/ady;Lcom/google/android/gms/internal/ads/zt;)I

    move-result p3

    goto :goto_0

    :cond_1
    invoke-static {v0, p2, v2, p4, p5}, Lcom/google/android/gms/internal/ads/zs;->a(I[BIILcom/google/android/gms/internal/ads/zt;)I

    move-result p3

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    const/4 v0, 0x0

    move-object v8, v0

    move v0, v2

    move v2, v1

    move-object v1, v8

    :goto_1
    if-ge v0, p4, :cond_4

    invoke-static {p2, v0, p5}, Lcom/google/android/gms/internal/ads/zs;->a([BILcom/google/android/gms/internal/ads/zt;)I

    move-result v0

    iget v3, p5, Lcom/google/android/gms/internal/ads/zt;->a:I

    ushr-int/lit8 v5, v3, 0x3

    and-int/lit8 v6, v3, 0x7

    packed-switch v5, :pswitch_data_0

    :cond_3
    const/16 v5, 0xc

    if-eq v3, v5, :cond_4

    invoke-static {v3, p2, v0, p4, p5}, Lcom/google/android/gms/internal/ads/zs;->a(I[BIILcom/google/android/gms/internal/ads/zt;)I

    move-result v0

    goto :goto_1

    :pswitch_0
    if-nez v6, :cond_3

    invoke-static {p2, v0, p5}, Lcom/google/android/gms/internal/ads/zs;->a([BILcom/google/android/gms/internal/ads/zt;)I

    move-result v2

    iget v0, p5, Lcom/google/android/gms/internal/ads/zt;->a:I

    move v8, v0

    move v0, v2

    move v2, v8

    goto :goto_1

    :pswitch_1
    if-ne v6, v7, :cond_3

    invoke-static {p2, v0, p5}, Lcom/google/android/gms/internal/ads/zs;->e([BILcom/google/android/gms/internal/ads/zt;)I

    move-result v1

    iget-object v0, p5, Lcom/google/android/gms/internal/ads/zt;->c:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/ads/zw;

    move-object v8, v0

    move v0, v1

    move-object v1, v8

    goto :goto_1

    :cond_4
    if-eqz v1, :cond_5

    shl-int/lit8 v2, v2, 0x3

    or-int/lit8 v2, v2, 0x2

    invoke-virtual {v4, v2, v1}, Lcom/google/android/gms/internal/ads/ady;->a(ILjava/lang/Object;)V

    :cond_5
    move p3, v0

    goto :goto_0

    :cond_6
    if-eq p3, p4, :cond_7

    invoke-static {}, Lcom/google/android/gms/internal/ads/abk;->g()Lcom/google/android/gms/internal/ads/abk;

    move-result-object v0

    throw v0

    :cond_7
    return-void

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final a(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)Z"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/acs;->b:Lcom/google/android/gms/internal/ads/adx;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/adx;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/acs;->b:Lcom/google/android/gms/internal/ads/adx;

    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/ads/adx;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/acs;->c:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/acs;->d:Lcom/google/android/gms/internal/ads/aat;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/aat;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/aaw;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/acs;->d:Lcom/google/android/gms/internal/ads/aat;

    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/ads/aat;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/aaw;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/aaw;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final b(Ljava/lang/Object;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/acs;->b:Lcom/google/android/gms/internal/ads/adx;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/adx;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/adx;->e(Ljava/lang/Object;)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/acs;->c:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/acs;->d:Lcom/google/android/gms/internal/ads/aat;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/aat;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/aaw;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaw;->i()I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    return v0
.end method

.method public final b(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/acs;->b:Lcom/google/android/gms/internal/ads/adx;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/ads/adg;->a(Lcom/google/android/gms/internal/ads/adx;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/acs;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/acs;->d:Lcom/google/android/gms/internal/ads/aat;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/ads/adg;->a(Lcom/google/android/gms/internal/ads/aat;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final c(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/acs;->b:Lcom/google/android/gms/internal/ads/adx;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/adx;->d(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/acs;->d:Lcom/google/android/gms/internal/ads/aat;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/aat;->c(Ljava/lang/Object;)V

    return-void
.end method

.method public final d(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/acs;->d:Lcom/google/android/gms/internal/ads/aat;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/aat;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/aaw;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaw;->g()Z

    move-result v0

    return v0
.end method
