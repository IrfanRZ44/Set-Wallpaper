.class final Lcom/google/android/gms/internal/ads/aai;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/add;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/aaf;

.field private b:I

.field private c:I

.field private d:I


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/aaf;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/aai;->d:I

    const-string v0, "input"

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/abg;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/aaf;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    iput-object p0, v0, Lcom/google/android/gms/internal/ads/aaf;->c:Lcom/google/android/gms/internal/ads/aai;

    return-void
.end method

.method public static a(Lcom/google/android/gms/internal/ads/aaf;)Lcom/google/android/gms/internal/ads/aai;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aaf;->c:Lcom/google/android/gms/internal/ads/aai;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aaf;->c:Lcom/google/android/gms/internal/ads/aai;

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/aai;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/aai;-><init>(Lcom/google/android/gms/internal/ads/aaf;)V

    goto :goto_0
.end method

.method private final a(Lcom/google/android/gms/internal/ads/ael;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/aar;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/ael;",
            "Ljava/lang/Class",
            "<*>;",
            "Lcom/google/android/gms/internal/ads/aar;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/ads/aaj;->a:[I

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ael;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "unsupported field type."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/aai;->k()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :goto_0
    return-object v0

    :pswitch_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/aai;->n()Lcom/google/android/gms/internal/ads/zw;

    move-result-object v0

    goto :goto_0

    :pswitch_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/aai;->d()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    goto :goto_0

    :pswitch_3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/aai;->p()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :pswitch_4
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/aai;->j()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :pswitch_5
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/aai;->i()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_0

    :pswitch_6
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/aai;->e()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    goto :goto_0

    :pswitch_7
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/aai;->h()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :pswitch_8
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/aai;->g()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_0

    :pswitch_9
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/aai;->a(I)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/acy;->a()Lcom/google/android/gms/internal/ads/acy;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/acy;->a(Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/ade;

    move-result-object v0

    invoke-direct {p0, v0, p3}, Lcom/google/android/gms/internal/ads/aai;->c(Lcom/google/android/gms/internal/ads/ade;Lcom/google/android/gms/internal/ads/aar;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :pswitch_a
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/aai;->q()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :pswitch_b
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/aai;->r()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_0

    :pswitch_c
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/aai;->s()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :pswitch_d
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/aai;->t()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_0

    :pswitch_e
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/aai;->m()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :pswitch_f
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/aai;->o()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto/16 :goto_0

    :pswitch_10
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/aai;->f()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto/16 :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
        :pswitch_10
    .end packed-switch
.end method

.method private final a(I)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, p1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/abk;->f()Lcom/google/android/gms/internal/ads/abl;

    move-result-object v0

    throw v0

    :cond_0
    return-void
.end method

.method private final a(Ljava/util/List;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    iget v0, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    and-int/lit8 v0, v0, 0x7

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/abk;->f()Lcom/google/android/gms/internal/ads/abl;

    move-result-object v0

    throw v0

    :cond_0
    instance-of v0, p1, Lcom/google/android/gms/internal/ads/abu;

    if-eqz v0, :cond_4

    if-nez p2, :cond_4

    check-cast p1, Lcom/google/android/gms/internal/ads/abu;

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/aai;->n()Lcom/google/android/gms/internal/ads/zw;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/abu;->a(Lcom/google/android/gms/internal/ads/zw;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->t()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    :goto_0
    return-void

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->a()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    if-eq v0, v1, :cond_1

    iput v0, p0, Lcom/google/android/gms/internal/ads/aai;->d:I

    goto :goto_0

    :cond_4
    if-eqz p2, :cond_5

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/aai;->m()Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->t()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->a()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    if-eq v0, v1, :cond_4

    iput v0, p0, Lcom/google/android/gms/internal/ads/aai;->d:I

    goto :goto_0

    :cond_5
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/aai;->l()Ljava/lang/String;

    move-result-object v0

    goto :goto_1
.end method

.method private static b(I)V
    .locals 1

    and-int/lit8 v0, p0, 0x7

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/abk;->g()Lcom/google/android/gms/internal/ads/abk;

    move-result-object v0

    throw v0

    :cond_0
    return-void
.end method

.method private final c(Lcom/google/android/gms/internal/ads/ade;Lcom/google/android/gms/internal/ads/aar;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/ads/ade",
            "<TT;>;",
            "Lcom/google/android/gms/internal/ads/aar;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->m()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    iget v1, v1, Lcom/google/android/gms/internal/ads/aaf;->a:I

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    iget v2, v2, Lcom/google/android/gms/internal/ads/aaf;->b:I

    if-lt v1, v2, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/abk;

    const-string v1, "Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit."

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/abk;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/aaf;->c(I)I

    move-result v0

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/ade;->a()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    iget v3, v2, Lcom/google/android/gms/internal/ads/aaf;->a:I

    add-int/lit8 v3, v3, 0x1

    iput v3, v2, Lcom/google/android/gms/internal/ads/aaf;->a:I

    invoke-interface {p1, v1, p0, p2}, Lcom/google/android/gms/internal/ads/ade;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/add;Lcom/google/android/gms/internal/ads/aar;)V

    invoke-interface {p1, v1}, Lcom/google/android/gms/internal/ads/ade;->c(Ljava/lang/Object;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/aaf;->a(I)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    iget v3, v2, Lcom/google/android/gms/internal/ads/aaf;->a:I

    add-int/lit8 v3, v3, -0x1

    iput v3, v2, Lcom/google/android/gms/internal/ads/aaf;->a:I

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/aaf;->d(I)V

    return-object v1
.end method

.method private static c(I)V
    .locals 1

    and-int/lit8 v0, p0, 0x3

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/abk;->g()Lcom/google/android/gms/internal/ads/abk;

    move-result-object v0

    throw v0

    :cond_0
    return-void
.end method

.method private final d(Lcom/google/android/gms/internal/ads/ade;Lcom/google/android/gms/internal/ads/aar;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/ads/ade",
            "<TT;>;",
            "Lcom/google/android/gms/internal/ads/aar;",
            ")TT;"
        }
    .end annotation

    iget v1, p0, Lcom/google/android/gms/internal/ads/aai;->c:I

    iget v0, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    ushr-int/lit8 v0, v0, 0x3

    shl-int/lit8 v0, v0, 0x3

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/google/android/gms/internal/ads/aai;->c:I

    :try_start_0
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/ade;->a()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0, p0, p2}, Lcom/google/android/gms/internal/ads/ade;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/add;Lcom/google/android/gms/internal/ads/aar;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/ade;->c(Ljava/lang/Object;)V

    iget v2, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    iget v3, p0, Lcom/google/android/gms/internal/ads/aai;->c:I

    if-eq v2, v3, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/abk;->g()Lcom/google/android/gms/internal/ads/abk;

    move-result-object v0

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    iput v1, p0, Lcom/google/android/gms/internal/ads/aai;->c:I

    throw v0

    :cond_0
    iput v1, p0, Lcom/google/android/gms/internal/ads/aai;->c:I

    return-object v0
.end method

.method private final d(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v0

    if-eq v0, p1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/abk;->a()Lcom/google/android/gms/internal/ads/abk;

    move-result-object v0

    throw v0

    :cond_0
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/aai;->d:I

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/google/android/gms/internal/ads/aai;->d:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/aai;->d:I

    :goto_0
    iget v0, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    iget v1, p0, Lcom/google/android/gms/internal/ads/aai;->c:I

    if-ne v0, v1, :cond_2

    :cond_0
    const v0, 0x7fffffff

    :goto_1
    return v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->a()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    goto :goto_0

    :cond_2
    iget v0, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    ushr-int/lit8 v0, v0, 0x3

    goto :goto_1
.end method

.method public final a(Lcom/google/android/gms/internal/ads/ade;Lcom/google/android/gms/internal/ads/aar;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/ads/ade",
            "<TT;>;",
            "Lcom/google/android/gms/internal/ads/aar;",
            ")TT;"
        }
    .end annotation

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/aai;->a(I)V

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/aai;->c(Lcom/google/android/gms/internal/ads/ade;Lcom/google/android/gms/internal/ads/aar;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Double;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/aan;

    if-eqz v0, :cond_3

    check-cast p1, Lcom/google/android/gms/internal/ads/aan;

    iget v0, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    and-int/lit8 v0, v0, 0x7

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/abk;->f()Lcom/google/android/gms/internal/ads/abl;

    move-result-object v0

    throw v0

    :pswitch_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->m()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/aai;->b(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->b()D

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Lcom/google/android/gms/internal/ads/aan;->a(D)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    if-lt v1, v0, :cond_0

    :cond_1
    :goto_0
    return-void

    :cond_2
    :pswitch_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->b()D

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/ads/aan;->a(D)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->t()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->a()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    if-eq v0, v1, :cond_2

    iput v0, p0, Lcom/google/android/gms/internal/ads/aai;->d:I

    goto :goto_0

    :cond_3
    iget v0, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    and-int/lit8 v0, v0, 0x7

    packed-switch v0, :pswitch_data_1

    invoke-static {}, Lcom/google/android/gms/internal/ads/abk;->f()Lcom/google/android/gms/internal/ads/abl;

    move-result-object v0

    throw v0

    :pswitch_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->m()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/aai;->b(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->b()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    if-lt v1, v0, :cond_4

    goto :goto_0

    :cond_5
    :pswitch_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->b()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->t()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->a()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    if-eq v0, v1, :cond_5

    iput v0, p0, Lcom/google/android/gms/internal/ads/aai;->d:I

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method public final a(Ljava/util/List;Lcom/google/android/gms/internal/ads/ade;Lcom/google/android/gms/internal/ads/aar;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List",
            "<TT;>;",
            "Lcom/google/android/gms/internal/ads/ade",
            "<TT;>;",
            "Lcom/google/android/gms/internal/ads/aar;",
            ")V"
        }
    .end annotation

    iget v0, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    and-int/lit8 v0, v0, 0x7

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/abk;->f()Lcom/google/android/gms/internal/ads/abl;

    move-result-object v0

    throw v0

    :cond_0
    iget v0, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    :cond_1
    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/ads/aai;->c(Lcom/google/android/gms/internal/ads/ade;Lcom/google/android/gms/internal/ads/aar;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->t()Z

    move-result v1

    if-nez v1, :cond_2

    iget v1, p0, Lcom/google/android/gms/internal/ads/aai;->d:I

    if-eqz v1, :cond_3

    :cond_2
    :goto_0
    return-void

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->a()I

    move-result v1

    if-eq v1, v0, :cond_1

    iput v1, p0, Lcom/google/android/gms/internal/ads/aai;->d:I

    goto :goto_0
.end method

.method public final a(Ljava/util/Map;Lcom/google/android/gms/internal/ads/ace;Lcom/google/android/gms/internal/ads/aar;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Map",
            "<TK;TV;>;",
            "Lcom/google/android/gms/internal/ads/ace",
            "<TK;TV;>;",
            "Lcom/google/android/gms/internal/ads/aar;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/aai;->a(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->m()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/aaf;->c(I)I

    move-result v2

    iget-object v1, p2, Lcom/google/android/gms/internal/ads/ace;->b:Ljava/lang/Object;

    iget-object v0, p2, Lcom/google/android/gms/internal/ads/ace;->d:Ljava/lang/Object;

    :cond_0
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/aai;->a()I

    move-result v3

    const v4, 0x7fffffff

    if-eq v3, v4, :cond_1

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/aaf;->t()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v4

    if-nez v4, :cond_1

    packed-switch v3, :pswitch_data_0

    :try_start_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/aai;->c()Z

    move-result v3

    if-nez v3, :cond_0

    new-instance v3, Lcom/google/android/gms/internal/ads/abk;

    const-string v4, "Unable to parse map entry."

    invoke-direct {v3, v4}, Lcom/google/android/gms/internal/ads/abk;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0
    .catch Lcom/google/android/gms/internal/ads/abl; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception v3

    :try_start_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/aai;->c()Z

    move-result v3

    if-nez v3, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/abk;

    const-string v1, "Unable to parse map entry."

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/abk;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/aaf;->d(I)V

    throw v0

    :pswitch_0
    :try_start_3
    iget-object v3, p2, Lcom/google/android/gms/internal/ads/ace;->a:Lcom/google/android/gms/internal/ads/ael;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct {p0, v3, v4, v5}, Lcom/google/android/gms/internal/ads/aai;->a(Lcom/google/android/gms/internal/ads/ael;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/aar;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    :pswitch_1
    iget-object v3, p2, Lcom/google/android/gms/internal/ads/ace;->c:Lcom/google/android/gms/internal/ads/ael;

    iget-object v4, p2, Lcom/google/android/gms/internal/ads/ace;->d:Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-direct {p0, v3, v4, p3}, Lcom/google/android/gms/internal/ads/aai;->a(Lcom/google/android/gms/internal/ads/ael;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/aar;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0
    .catch Lcom/google/android/gms/internal/ads/abl; {:try_start_3 .. :try_end_3} :catch_0

    move-result-object v0

    goto :goto_0

    :cond_1
    :try_start_4
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/aaf;->d(I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    return v0
.end method

.method public final b(Lcom/google/android/gms/internal/ads/ade;Lcom/google/android/gms/internal/ads/aar;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/ads/ade",
            "<TT;>;",
            "Lcom/google/android/gms/internal/ads/aar;",
            ")TT;"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/aai;->a(I)V

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/aai;->d(Lcom/google/android/gms/internal/ads/ade;Lcom/google/android/gms/internal/ads/aar;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final b(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/abc;

    if-eqz v0, :cond_3

    check-cast p1, Lcom/google/android/gms/internal/ads/abc;

    iget v0, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    and-int/lit8 v0, v0, 0x7

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/abk;->f()Lcom/google/android/gms/internal/ads/abl;

    move-result-object v0

    throw v0

    :pswitch_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->m()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/aai;->c(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->c()F

    move-result v1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/abc;->a(F)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    if-lt v1, v0, :cond_0

    :cond_1
    :goto_0
    return-void

    :cond_2
    :pswitch_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->c()F

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/abc;->a(F)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->t()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->a()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    if-eq v0, v1, :cond_2

    iput v0, p0, Lcom/google/android/gms/internal/ads/aai;->d:I

    goto :goto_0

    :cond_3
    iget v0, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    and-int/lit8 v0, v0, 0x7

    packed-switch v0, :pswitch_data_1

    :pswitch_3
    invoke-static {}, Lcom/google/android/gms/internal/ads/abk;->f()Lcom/google/android/gms/internal/ads/abl;

    move-result-object v0

    throw v0

    :pswitch_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->m()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/aai;->c(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->c()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    if-lt v1, v0, :cond_4

    goto :goto_0

    :cond_5
    :pswitch_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->c()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->t()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->a()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    if-eq v0, v1, :cond_5

    iput v0, p0, Lcom/google/android/gms/internal/ads/aai;->d:I

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x2
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_5
    .end packed-switch
.end method

.method public final b(Ljava/util/List;Lcom/google/android/gms/internal/ads/ade;Lcom/google/android/gms/internal/ads/aar;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List",
            "<TT;>;",
            "Lcom/google/android/gms/internal/ads/ade",
            "<TT;>;",
            "Lcom/google/android/gms/internal/ads/aar;",
            ")V"
        }
    .end annotation

    iget v0, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    and-int/lit8 v0, v0, 0x7

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/abk;->f()Lcom/google/android/gms/internal/ads/abl;

    move-result-object v0

    throw v0

    :cond_0
    iget v0, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    :cond_1
    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/ads/aai;->d(Lcom/google/android/gms/internal/ads/ade;Lcom/google/android/gms/internal/ads/aar;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->t()Z

    move-result v1

    if-nez v1, :cond_2

    iget v1, p0, Lcom/google/android/gms/internal/ads/aai;->d:I

    if-eqz v1, :cond_3

    :cond_2
    :goto_0
    return-void

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->a()I

    move-result v1

    if-eq v1, v0, :cond_1

    iput v1, p0, Lcom/google/android/gms/internal/ads/aai;->d:I

    goto :goto_0
.end method

.method public final c(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/abz;

    if-eqz v0, :cond_3

    check-cast p1, Lcom/google/android/gms/internal/ads/abz;

    iget v0, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    and-int/lit8 v0, v0, 0x7

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/abk;->f()Lcom/google/android/gms/internal/ads/abl;

    move-result-object v0

    throw v0

    :pswitch_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->m()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->d()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Lcom/google/android/gms/internal/ads/abz;->a(J)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    if-lt v1, v0, :cond_0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/aai;->d(I)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    :pswitch_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->d()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/ads/abz;->a(J)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->t()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->a()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    if-eq v0, v1, :cond_2

    iput v0, p0, Lcom/google/android/gms/internal/ads/aai;->d:I

    goto :goto_0

    :cond_3
    iget v0, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    and-int/lit8 v0, v0, 0x7

    packed-switch v0, :pswitch_data_1

    :pswitch_3
    invoke-static {}, Lcom/google/android/gms/internal/ads/abk;->f()Lcom/google/android/gms/internal/ads/abl;

    move-result-object v0

    throw v0

    :pswitch_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->m()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->d()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    if-lt v1, v0, :cond_4

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/aai;->d(I)V

    goto :goto_0

    :cond_5
    :pswitch_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->d()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->t()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->a()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    if-eq v0, v1, :cond_5

    iput v0, p0, Lcom/google/android/gms/internal/ads/aai;->d:I

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_5
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public final c()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->t()Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    iget v1, p0, Lcom/google/android/gms/internal/ads/aai;->c:I

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    iget v1, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/aaf;->b(I)Z

    move-result v0

    goto :goto_0
.end method

.method public final d()D
    .locals 2

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/aai;->a(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->b()D

    move-result-wide v0

    return-wide v0
.end method

.method public final d(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/abz;

    if-eqz v0, :cond_3

    check-cast p1, Lcom/google/android/gms/internal/ads/abz;

    iget v0, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    and-int/lit8 v0, v0, 0x7

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/abk;->f()Lcom/google/android/gms/internal/ads/abl;

    move-result-object v0

    throw v0

    :pswitch_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->m()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->e()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Lcom/google/android/gms/internal/ads/abz;->a(J)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    if-lt v1, v0, :cond_0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/aai;->d(I)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    :pswitch_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->e()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/ads/abz;->a(J)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->t()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->a()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    if-eq v0, v1, :cond_2

    iput v0, p0, Lcom/google/android/gms/internal/ads/aai;->d:I

    goto :goto_0

    :cond_3
    iget v0, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    and-int/lit8 v0, v0, 0x7

    packed-switch v0, :pswitch_data_1

    :pswitch_3
    invoke-static {}, Lcom/google/android/gms/internal/ads/abk;->f()Lcom/google/android/gms/internal/ads/abl;

    move-result-object v0

    throw v0

    :pswitch_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->m()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->e()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    if-lt v1, v0, :cond_4

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/aai;->d(I)V

    goto :goto_0

    :cond_5
    :pswitch_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->e()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->t()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->a()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    if-eq v0, v1, :cond_5

    iput v0, p0, Lcom/google/android/gms/internal/ads/aai;->d:I

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_5
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public final e()F
    .locals 1

    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/aai;->a(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->c()F

    move-result v0

    return v0
.end method

.method public final e(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/abf;

    if-eqz v0, :cond_3

    check-cast p1, Lcom/google/android/gms/internal/ads/abf;

    iget v0, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    and-int/lit8 v0, v0, 0x7

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/abk;->f()Lcom/google/android/gms/internal/ads/abl;

    move-result-object v0

    throw v0

    :pswitch_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->m()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->f()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/abf;->c(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    if-lt v1, v0, :cond_0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/aai;->d(I)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    :pswitch_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->f()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/abf;->c(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->t()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->a()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    if-eq v0, v1, :cond_2

    iput v0, p0, Lcom/google/android/gms/internal/ads/aai;->d:I

    goto :goto_0

    :cond_3
    iget v0, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    and-int/lit8 v0, v0, 0x7

    packed-switch v0, :pswitch_data_1

    :pswitch_3
    invoke-static {}, Lcom/google/android/gms/internal/ads/abk;->f()Lcom/google/android/gms/internal/ads/abl;

    move-result-object v0

    throw v0

    :pswitch_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->m()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->f()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    if-lt v1, v0, :cond_4

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/aai;->d(I)V

    goto :goto_0

    :cond_5
    :pswitch_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->f()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->t()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->a()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    if-eq v0, v1, :cond_5

    iput v0, p0, Lcom/google/android/gms/internal/ads/aai;->d:I

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_5
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public final f()J
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/aai;->a(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->d()J

    move-result-wide v0

    return-wide v0
.end method

.method public final f(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/abz;

    if-eqz v0, :cond_3

    check-cast p1, Lcom/google/android/gms/internal/ads/abz;

    iget v0, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    and-int/lit8 v0, v0, 0x7

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/abk;->f()Lcom/google/android/gms/internal/ads/abl;

    move-result-object v0

    throw v0

    :pswitch_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->m()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/aai;->b(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->g()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Lcom/google/android/gms/internal/ads/abz;->a(J)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    if-lt v1, v0, :cond_0

    :cond_1
    :goto_0
    return-void

    :cond_2
    :pswitch_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->g()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/ads/abz;->a(J)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->t()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->a()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    if-eq v0, v1, :cond_2

    iput v0, p0, Lcom/google/android/gms/internal/ads/aai;->d:I

    goto :goto_0

    :cond_3
    iget v0, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    and-int/lit8 v0, v0, 0x7

    packed-switch v0, :pswitch_data_1

    invoke-static {}, Lcom/google/android/gms/internal/ads/abk;->f()Lcom/google/android/gms/internal/ads/abl;

    move-result-object v0

    throw v0

    :pswitch_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->m()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/aai;->b(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->g()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    if-lt v1, v0, :cond_4

    goto :goto_0

    :cond_5
    :pswitch_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->g()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->t()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->a()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    if-eq v0, v1, :cond_5

    iput v0, p0, Lcom/google/android/gms/internal/ads/aai;->d:I

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method public final g()J
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/aai;->a(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->e()J

    move-result-wide v0

    return-wide v0
.end method

.method public final g(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/abf;

    if-eqz v0, :cond_3

    check-cast p1, Lcom/google/android/gms/internal/ads/abf;

    iget v0, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    and-int/lit8 v0, v0, 0x7

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/abk;->f()Lcom/google/android/gms/internal/ads/abl;

    move-result-object v0

    throw v0

    :pswitch_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->m()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/aai;->c(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->h()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/abf;->c(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    if-lt v1, v0, :cond_0

    :cond_1
    :goto_0
    return-void

    :cond_2
    :pswitch_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->h()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/abf;->c(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->t()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->a()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    if-eq v0, v1, :cond_2

    iput v0, p0, Lcom/google/android/gms/internal/ads/aai;->d:I

    goto :goto_0

    :cond_3
    iget v0, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    and-int/lit8 v0, v0, 0x7

    packed-switch v0, :pswitch_data_1

    :pswitch_3
    invoke-static {}, Lcom/google/android/gms/internal/ads/abk;->f()Lcom/google/android/gms/internal/ads/abl;

    move-result-object v0

    throw v0

    :pswitch_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->m()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/aai;->c(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->h()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    if-lt v1, v0, :cond_4

    goto :goto_0

    :cond_5
    :pswitch_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->h()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->t()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->a()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    if-eq v0, v1, :cond_5

    iput v0, p0, Lcom/google/android/gms/internal/ads/aai;->d:I

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x2
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_5
    .end packed-switch
.end method

.method public final h()I
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/aai;->a(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->f()I

    move-result v0

    return v0
.end method

.method public final h(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zu;

    if-eqz v0, :cond_3

    check-cast p1, Lcom/google/android/gms/internal/ads/zu;

    iget v0, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    and-int/lit8 v0, v0, 0x7

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/abk;->f()Lcom/google/android/gms/internal/ads/abl;

    move-result-object v0

    throw v0

    :pswitch_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->m()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->i()Z

    move-result v1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/zu;->a(Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    if-lt v1, v0, :cond_0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/aai;->d(I)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    :pswitch_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->i()Z

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zu;->a(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->t()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->a()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    if-eq v0, v1, :cond_2

    iput v0, p0, Lcom/google/android/gms/internal/ads/aai;->d:I

    goto :goto_0

    :cond_3
    iget v0, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    and-int/lit8 v0, v0, 0x7

    packed-switch v0, :pswitch_data_1

    :pswitch_3
    invoke-static {}, Lcom/google/android/gms/internal/ads/abk;->f()Lcom/google/android/gms/internal/ads/abl;

    move-result-object v0

    throw v0

    :pswitch_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->m()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->i()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    if-lt v1, v0, :cond_4

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/aai;->d(I)V

    goto :goto_0

    :cond_5
    :pswitch_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->i()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->t()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->a()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    if-eq v0, v1, :cond_5

    iput v0, p0, Lcom/google/android/gms/internal/ads/aai;->d:I

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_5
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public final i()J
    .locals 2

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/aai;->a(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->g()J

    move-result-wide v0

    return-wide v0
.end method

.method public final i(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/aai;->a(Ljava/util/List;Z)V

    return-void
.end method

.method public final j()I
    .locals 1

    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/aai;->a(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->h()I

    move-result v0

    return v0
.end method

.method public final j(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/aai;->a(Ljava/util/List;Z)V

    return-void
.end method

.method public final k(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/ads/zw;",
            ">;)V"
        }
    .end annotation

    iget v0, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    and-int/lit8 v0, v0, 0x7

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/abk;->f()Lcom/google/android/gms/internal/ads/abl;

    move-result-object v0

    throw v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/aai;->n()Lcom/google/android/gms/internal/ads/zw;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->t()Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->a()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    if-eq v0, v1, :cond_0

    iput v0, p0, Lcom/google/android/gms/internal/ads/aai;->d:I

    goto :goto_0
.end method

.method public final k()Z
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/aai;->a(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->i()Z

    move-result v0

    return v0
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/aai;->a(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->j()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final l(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/abf;

    if-eqz v0, :cond_3

    check-cast p1, Lcom/google/android/gms/internal/ads/abf;

    iget v0, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    and-int/lit8 v0, v0, 0x7

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/abk;->f()Lcom/google/android/gms/internal/ads/abl;

    move-result-object v0

    throw v0

    :pswitch_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->m()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->m()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/abf;->c(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    if-lt v1, v0, :cond_0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/aai;->d(I)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    :pswitch_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->m()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/abf;->c(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->t()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->a()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    if-eq v0, v1, :cond_2

    iput v0, p0, Lcom/google/android/gms/internal/ads/aai;->d:I

    goto :goto_0

    :cond_3
    iget v0, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    and-int/lit8 v0, v0, 0x7

    packed-switch v0, :pswitch_data_1

    :pswitch_3
    invoke-static {}, Lcom/google/android/gms/internal/ads/abk;->f()Lcom/google/android/gms/internal/ads/abl;

    move-result-object v0

    throw v0

    :pswitch_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->m()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->m()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    if-lt v1, v0, :cond_4

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/aai;->d(I)V

    goto :goto_0

    :cond_5
    :pswitch_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->m()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->t()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->a()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    if-eq v0, v1, :cond_5

    iput v0, p0, Lcom/google/android/gms/internal/ads/aai;->d:I

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_5
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public final m()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/aai;->a(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->k()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final m(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/abf;

    if-eqz v0, :cond_3

    check-cast p1, Lcom/google/android/gms/internal/ads/abf;

    iget v0, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    and-int/lit8 v0, v0, 0x7

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/abk;->f()Lcom/google/android/gms/internal/ads/abl;

    move-result-object v0

    throw v0

    :pswitch_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->m()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->n()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/abf;->c(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    if-lt v1, v0, :cond_0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/aai;->d(I)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    :pswitch_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->n()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/abf;->c(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->t()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->a()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    if-eq v0, v1, :cond_2

    iput v0, p0, Lcom/google/android/gms/internal/ads/aai;->d:I

    goto :goto_0

    :cond_3
    iget v0, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    and-int/lit8 v0, v0, 0x7

    packed-switch v0, :pswitch_data_1

    :pswitch_3
    invoke-static {}, Lcom/google/android/gms/internal/ads/abk;->f()Lcom/google/android/gms/internal/ads/abl;

    move-result-object v0

    throw v0

    :pswitch_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->m()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->n()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    if-lt v1, v0, :cond_4

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/aai;->d(I)V

    goto :goto_0

    :cond_5
    :pswitch_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->n()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->t()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->a()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    if-eq v0, v1, :cond_5

    iput v0, p0, Lcom/google/android/gms/internal/ads/aai;->d:I

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_5
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public final n()Lcom/google/android/gms/internal/ads/zw;
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/aai;->a(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->l()Lcom/google/android/gms/internal/ads/zw;

    move-result-object v0

    return-object v0
.end method

.method public final n(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/abf;

    if-eqz v0, :cond_3

    check-cast p1, Lcom/google/android/gms/internal/ads/abf;

    iget v0, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    and-int/lit8 v0, v0, 0x7

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/abk;->f()Lcom/google/android/gms/internal/ads/abl;

    move-result-object v0

    throw v0

    :pswitch_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->m()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/aai;->c(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->o()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/abf;->c(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    if-lt v1, v0, :cond_0

    :cond_1
    :goto_0
    return-void

    :cond_2
    :pswitch_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->o()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/abf;->c(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->t()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->a()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    if-eq v0, v1, :cond_2

    iput v0, p0, Lcom/google/android/gms/internal/ads/aai;->d:I

    goto :goto_0

    :cond_3
    iget v0, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    and-int/lit8 v0, v0, 0x7

    packed-switch v0, :pswitch_data_1

    :pswitch_3
    invoke-static {}, Lcom/google/android/gms/internal/ads/abk;->f()Lcom/google/android/gms/internal/ads/abl;

    move-result-object v0

    throw v0

    :pswitch_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->m()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/aai;->c(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->o()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    if-lt v1, v0, :cond_4

    goto :goto_0

    :cond_5
    :pswitch_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->o()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->t()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->a()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    if-eq v0, v1, :cond_5

    iput v0, p0, Lcom/google/android/gms/internal/ads/aai;->d:I

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x2
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_5
    .end packed-switch
.end method

.method public final o()I
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/aai;->a(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->m()I

    move-result v0

    return v0
.end method

.method public final o(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/abz;

    if-eqz v0, :cond_3

    check-cast p1, Lcom/google/android/gms/internal/ads/abz;

    iget v0, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    and-int/lit8 v0, v0, 0x7

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/abk;->f()Lcom/google/android/gms/internal/ads/abl;

    move-result-object v0

    throw v0

    :pswitch_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->m()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/aai;->b(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->p()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Lcom/google/android/gms/internal/ads/abz;->a(J)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    if-lt v1, v0, :cond_0

    :cond_1
    :goto_0
    return-void

    :cond_2
    :pswitch_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->p()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/ads/abz;->a(J)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->t()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->a()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    if-eq v0, v1, :cond_2

    iput v0, p0, Lcom/google/android/gms/internal/ads/aai;->d:I

    goto :goto_0

    :cond_3
    iget v0, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    and-int/lit8 v0, v0, 0x7

    packed-switch v0, :pswitch_data_1

    invoke-static {}, Lcom/google/android/gms/internal/ads/abk;->f()Lcom/google/android/gms/internal/ads/abl;

    move-result-object v0

    throw v0

    :pswitch_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->m()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/aai;->b(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->p()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    if-lt v1, v0, :cond_4

    goto :goto_0

    :cond_5
    :pswitch_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->p()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->t()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->a()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    if-eq v0, v1, :cond_5

    iput v0, p0, Lcom/google/android/gms/internal/ads/aai;->d:I

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method public final p()I
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/aai;->a(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->n()I

    move-result v0

    return v0
.end method

.method public final p(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/abf;

    if-eqz v0, :cond_3

    check-cast p1, Lcom/google/android/gms/internal/ads/abf;

    iget v0, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    and-int/lit8 v0, v0, 0x7

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/abk;->f()Lcom/google/android/gms/internal/ads/abl;

    move-result-object v0

    throw v0

    :pswitch_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->m()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->q()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/abf;->c(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    if-lt v1, v0, :cond_0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/aai;->d(I)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    :pswitch_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->q()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/abf;->c(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->t()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->a()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    if-eq v0, v1, :cond_2

    iput v0, p0, Lcom/google/android/gms/internal/ads/aai;->d:I

    goto :goto_0

    :cond_3
    iget v0, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    and-int/lit8 v0, v0, 0x7

    packed-switch v0, :pswitch_data_1

    :pswitch_3
    invoke-static {}, Lcom/google/android/gms/internal/ads/abk;->f()Lcom/google/android/gms/internal/ads/abl;

    move-result-object v0

    throw v0

    :pswitch_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->m()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->q()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    if-lt v1, v0, :cond_4

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/aai;->d(I)V

    goto :goto_0

    :cond_5
    :pswitch_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->q()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->t()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->a()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    if-eq v0, v1, :cond_5

    iput v0, p0, Lcom/google/android/gms/internal/ads/aai;->d:I

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_5
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public final q()I
    .locals 1

    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/aai;->a(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->o()I

    move-result v0

    return v0
.end method

.method public final q(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/abz;

    if-eqz v0, :cond_3

    check-cast p1, Lcom/google/android/gms/internal/ads/abz;

    iget v0, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    and-int/lit8 v0, v0, 0x7

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/abk;->f()Lcom/google/android/gms/internal/ads/abl;

    move-result-object v0

    throw v0

    :pswitch_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->m()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->r()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Lcom/google/android/gms/internal/ads/abz;->a(J)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    if-lt v1, v0, :cond_0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/aai;->d(I)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    :pswitch_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->r()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/ads/abz;->a(J)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->t()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->a()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    if-eq v0, v1, :cond_2

    iput v0, p0, Lcom/google/android/gms/internal/ads/aai;->d:I

    goto :goto_0

    :cond_3
    iget v0, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    and-int/lit8 v0, v0, 0x7

    packed-switch v0, :pswitch_data_1

    :pswitch_3
    invoke-static {}, Lcom/google/android/gms/internal/ads/abk;->f()Lcom/google/android/gms/internal/ads/abl;

    move-result-object v0

    throw v0

    :pswitch_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->m()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->r()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaf;->u()I

    move-result v1

    if-lt v1, v0, :cond_4

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/aai;->d(I)V

    goto :goto_0

    :cond_5
    :pswitch_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->r()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->t()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->a()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/aai;->b:I

    if-eq v0, v1, :cond_5

    iput v0, p0, Lcom/google/android/gms/internal/ads/aai;->d:I

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_5
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public final r()J
    .locals 2

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/aai;->a(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->p()J

    move-result-wide v0

    return-wide v0
.end method

.method public final s()I
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/aai;->a(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->q()I

    move-result v0

    return v0
.end method

.method public final t()J
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/aai;->a(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aai;->a:Lcom/google/android/gms/internal/ads/aaf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/aaf;->r()J

    move-result-wide v0

    return-wide v0
.end method
