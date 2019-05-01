.class final Lcom/google/android/gms/internal/ads/adb;
.super Ljava/lang/Object;


# instance fields
.field private A:I

.field private B:I

.field private C:Ljava/lang/reflect/Field;

.field private D:Ljava/lang/Object;

.field private E:Ljava/lang/Object;

.field private F:Ljava/lang/Object;

.field private final a:Lcom/google/android/gms/internal/ads/adc;

.field private final b:[Ljava/lang/Object;

.field private c:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private final d:I

.field private final e:I

.field private final f:I

.field private final g:I

.field private final h:I

.field private final i:I

.field private final j:I

.field private final k:I

.field private final l:I

.field private final m:I

.field private final n:[I

.field private o:I

.field private p:I

.field private q:I

.field private r:I

.field private s:I

.field private t:I

.field private u:I

.field private v:I

.field private w:I

.field private x:I

.field private y:I

.field private z:I


# direct methods
.method constructor <init>(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v2, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v1, 0x7fffffff

    iput v1, p0, Lcom/google/android/gms/internal/ads/adb;->q:I

    const/high16 v1, -0x8000

    iput v1, p0, Lcom/google/android/gms/internal/ads/adb;->r:I

    iput v2, p0, Lcom/google/android/gms/internal/ads/adb;->s:I

    iput v2, p0, Lcom/google/android/gms/internal/ads/adb;->t:I

    iput v2, p0, Lcom/google/android/gms/internal/ads/adb;->u:I

    iput v2, p0, Lcom/google/android/gms/internal/ads/adb;->v:I

    iput v2, p0, Lcom/google/android/gms/internal/ads/adb;->w:I

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/adb;->c:Ljava/lang/Class;

    new-instance v1, Lcom/google/android/gms/internal/ads/adc;

    invoke-direct {v1, p2}, Lcom/google/android/gms/internal/ads/adc;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/adb;->a:Lcom/google/android/gms/internal/ads/adc;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/adb;->b:[Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/adb;->a:Lcom/google/android/gms/internal/ads/adc;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/adc;->b()I

    move-result v1

    iput v1, p0, Lcom/google/android/gms/internal/ads/adb;->d:I

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/adb;->a:Lcom/google/android/gms/internal/ads/adc;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/adc;->b()I

    move-result v1

    iput v1, p0, Lcom/google/android/gms/internal/ads/adb;->e:I

    iget v1, p0, Lcom/google/android/gms/internal/ads/adb;->e:I

    if-nez v1, :cond_0

    iput v2, p0, Lcom/google/android/gms/internal/ads/adb;->f:I

    iput v2, p0, Lcom/google/android/gms/internal/ads/adb;->g:I

    iput v2, p0, Lcom/google/android/gms/internal/ads/adb;->h:I

    iput v2, p0, Lcom/google/android/gms/internal/ads/adb;->i:I

    iput v2, p0, Lcom/google/android/gms/internal/ads/adb;->j:I

    iput v2, p0, Lcom/google/android/gms/internal/ads/adb;->l:I

    iput v2, p0, Lcom/google/android/gms/internal/ads/adb;->k:I

    iput v2, p0, Lcom/google/android/gms/internal/ads/adb;->m:I

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/adb;->n:[I

    :goto_0
    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/adb;->a:Lcom/google/android/gms/internal/ads/adc;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/adc;->b()I

    move-result v1

    iput v1, p0, Lcom/google/android/gms/internal/ads/adb;->f:I

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/adb;->a:Lcom/google/android/gms/internal/ads/adc;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/adc;->b()I

    move-result v1

    iput v1, p0, Lcom/google/android/gms/internal/ads/adb;->g:I

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/adb;->a:Lcom/google/android/gms/internal/ads/adc;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/adc;->b()I

    move-result v1

    iput v1, p0, Lcom/google/android/gms/internal/ads/adb;->h:I

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/adb;->a:Lcom/google/android/gms/internal/ads/adc;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/adc;->b()I

    move-result v1

    iput v1, p0, Lcom/google/android/gms/internal/ads/adb;->i:I

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/adb;->a:Lcom/google/android/gms/internal/ads/adc;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/adc;->b()I

    move-result v1

    iput v1, p0, Lcom/google/android/gms/internal/ads/adb;->l:I

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/adb;->a:Lcom/google/android/gms/internal/ads/adc;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/adc;->b()I

    move-result v1

    iput v1, p0, Lcom/google/android/gms/internal/ads/adb;->k:I

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/adb;->a:Lcom/google/android/gms/internal/ads/adc;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/adc;->b()I

    move-result v1

    iput v1, p0, Lcom/google/android/gms/internal/ads/adb;->j:I

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/adb;->a:Lcom/google/android/gms/internal/ads/adc;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/adc;->b()I

    move-result v1

    iput v1, p0, Lcom/google/android/gms/internal/ads/adb;->m:I

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/adb;->a:Lcom/google/android/gms/internal/ads/adc;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/adc;->b()I

    move-result v1

    if-nez v1, :cond_1

    :goto_1
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/adb;->n:[I

    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->f:I

    shl-int/lit8 v0, v0, 0x1

    iget v1, p0, Lcom/google/android/gms/internal/ads/adb;->g:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/ads/adb;->o:I

    goto :goto_0

    :cond_1
    new-array v0, v1, [I

    goto :goto_1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/adb;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->d:I

    return v0
.end method

.method private static a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/reflect/Field;"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :cond_0
    return-object v0

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v2

    array-length v3, v2

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_1

    aget-object v0, v2, v1

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x28

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Field "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " not found. Known fields are "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/ads/adb;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->h:I

    return v0
.end method

.method static synthetic c(Lcom/google/android/gms/internal/ads/adb;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->i:I

    return v0
.end method

.method static synthetic d(Lcom/google/android/gms/internal/ads/adb;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->e:I

    return v0
.end method

.method static synthetic e(Lcom/google/android/gms/internal/ads/adb;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->j:I

    return v0
.end method

.method static synthetic f(Lcom/google/android/gms/internal/ads/adb;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->m:I

    return v0
.end method

.method static synthetic g(Lcom/google/android/gms/internal/ads/adb;)[I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/adb;->n:[I

    return-object v0
.end method

.method static synthetic h(Lcom/google/android/gms/internal/ads/adb;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->l:I

    return v0
.end method

.method static synthetic i(Lcom/google/android/gms/internal/ads/adb;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->k:I

    return v0
.end method

.method private final p()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/adb;->b:[Ljava/lang/Object;

    iget v1, p0, Lcom/google/android/gms/internal/ads/adb;->o:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/google/android/gms/internal/ads/adb;->o:I

    aget-object v0, v0, v1

    return-object v0
.end method

.method private final q()Z
    .locals 2

    const/4 v0, 0x1

    iget v1, p0, Lcom/google/android/gms/internal/ads/adb;->d:I

    and-int/lit8 v1, v1, 0x1

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method final a()Z
    .locals 6

    const/4 v5, 0x0

    const/4 v2, 0x1

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/adb;->a:Lcom/google/android/gms/internal/ads/adc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/adc;->a()Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/adb;->a:Lcom/google/android/gms/internal/ads/adc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/adc;->b()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ads/adb;->x:I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/adb;->a:Lcom/google/android/gms/internal/ads/adc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/adc;->b()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ads/adb;->y:I

    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->y:I

    and-int/lit16 v0, v0, 0xff

    iput v0, p0, Lcom/google/android/gms/internal/ads/adb;->z:I

    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->x:I

    iget v3, p0, Lcom/google/android/gms/internal/ads/adb;->q:I

    if-ge v0, v3, :cond_1

    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->x:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/adb;->q:I

    :cond_1
    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->x:I

    iget v3, p0, Lcom/google/android/gms/internal/ads/adb;->r:I

    if-le v0, v3, :cond_2

    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->x:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/adb;->r:I

    :cond_2
    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->z:I

    sget-object v3, Lcom/google/android/gms/internal/ads/aaz;->k:Lcom/google/android/gms/internal/ads/aaz;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/aaz;->a()I

    move-result v3

    if-ne v0, v3, :cond_7

    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->s:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/adb;->s:I

    :cond_3
    :goto_1
    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->w:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/adb;->w:I

    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->q:I

    iget v3, p0, Lcom/google/android/gms/internal/ads/adb;->x:I

    iget v4, p0, Lcom/google/android/gms/internal/ads/adb;->w:I

    invoke-static {v0, v3, v4}, Lcom/google/android/gms/internal/ads/adg;->a(III)Z

    move-result v0

    if-eqz v0, :cond_8

    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->x:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/adb;->v:I

    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->v:I

    iget v3, p0, Lcom/google/android/gms/internal/ads/adb;->q:I

    sub-int/2addr v0, v3

    iput v0, p0, Lcom/google/android/gms/internal/ads/adb;->u:I

    :goto_2
    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->y:I

    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_9

    move v0, v2

    :goto_3
    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/adb;->n:[I

    iget v3, p0, Lcom/google/android/gms/internal/ads/adb;->p:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lcom/google/android/gms/internal/ads/adb;->p:I

    iget v4, p0, Lcom/google/android/gms/internal/ads/adb;->x:I

    aput v4, v0, v3

    :cond_4
    iput-object v5, p0, Lcom/google/android/gms/internal/ads/adb;->D:Ljava/lang/Object;

    iput-object v5, p0, Lcom/google/android/gms/internal/ads/adb;->E:Ljava/lang/Object;

    iput-object v5, p0, Lcom/google/android/gms/internal/ads/adb;->F:Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/adb;->d()Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/adb;->a:Lcom/google/android/gms/internal/ads/adc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/adc;->b()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ads/adb;->A:I

    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->z:I

    sget-object v1, Lcom/google/android/gms/internal/ads/aaz;->a:Lcom/google/android/gms/internal/ads/aaz;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaz;->a()I

    move-result v1

    add-int/lit8 v1, v1, 0x33

    if-eq v0, v1, :cond_5

    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->z:I

    sget-object v1, Lcom/google/android/gms/internal/ads/aaz;->c:Lcom/google/android/gms/internal/ads/aaz;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaz;->a()I

    move-result v1

    add-int/lit8 v1, v1, 0x33

    if-ne v0, v1, :cond_a

    :cond_5
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/adb;->p()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/adb;->D:Ljava/lang/Object;

    :cond_6
    :goto_4
    move v0, v2

    goto/16 :goto_0

    :cond_7
    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->z:I

    sget-object v3, Lcom/google/android/gms/internal/ads/aaz;->d:Lcom/google/android/gms/internal/ads/aaz;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/aaz;->a()I

    move-result v3

    if-lt v0, v3, :cond_3

    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->z:I

    sget-object v3, Lcom/google/android/gms/internal/ads/aaz;->j:Lcom/google/android/gms/internal/ads/aaz;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/aaz;->a()I

    move-result v3

    if-gt v0, v3, :cond_3

    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->t:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/adb;->t:I

    goto/16 :goto_1

    :cond_8
    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->u:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/adb;->u:I

    goto :goto_2

    :cond_9
    move v0, v1

    goto :goto_3

    :cond_a
    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->z:I

    sget-object v1, Lcom/google/android/gms/internal/ads/aaz;->b:Lcom/google/android/gms/internal/ads/aaz;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaz;->a()I

    move-result v1

    add-int/lit8 v1, v1, 0x33

    if-ne v0, v1, :cond_6

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/adb;->q()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/adb;->p()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/adb;->E:Ljava/lang/Object;

    goto :goto_4

    :cond_b
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/adb;->c:Ljava/lang/Class;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/adb;->p()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v3, v0}, Lcom/google/android/gms/internal/ads/adb;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/adb;->C:Ljava/lang/reflect/Field;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/adb;->h()Z

    move-result v0

    if-eqz v0, :cond_c

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/adb;->a:Lcom/google/android/gms/internal/ads/adc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/adc;->b()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ads/adb;->B:I

    :cond_c
    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->z:I

    sget-object v3, Lcom/google/android/gms/internal/ads/aaz;->a:Lcom/google/android/gms/internal/ads/aaz;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/aaz;->a()I

    move-result v3

    if-eq v0, v3, :cond_d

    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->z:I

    sget-object v3, Lcom/google/android/gms/internal/ads/aaz;->c:Lcom/google/android/gms/internal/ads/aaz;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/aaz;->a()I

    move-result v3

    if-ne v0, v3, :cond_e

    :cond_d
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/adb;->C:Ljava/lang/reflect/Field;

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/adb;->D:Ljava/lang/Object;

    goto :goto_4

    :cond_e
    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->z:I

    sget-object v3, Lcom/google/android/gms/internal/ads/aaz;->e:Lcom/google/android/gms/internal/ads/aaz;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/aaz;->a()I

    move-result v3

    if-eq v0, v3, :cond_f

    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->z:I

    sget-object v3, Lcom/google/android/gms/internal/ads/aaz;->j:Lcom/google/android/gms/internal/ads/aaz;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/aaz;->a()I

    move-result v3

    if-ne v0, v3, :cond_10

    :cond_f
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/adb;->p()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/adb;->D:Ljava/lang/Object;

    goto/16 :goto_4

    :cond_10
    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->z:I

    sget-object v3, Lcom/google/android/gms/internal/ads/aaz;->b:Lcom/google/android/gms/internal/ads/aaz;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/aaz;->a()I

    move-result v3

    if-eq v0, v3, :cond_11

    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->z:I

    sget-object v3, Lcom/google/android/gms/internal/ads/aaz;->f:Lcom/google/android/gms/internal/ads/aaz;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/aaz;->a()I

    move-result v3

    if-eq v0, v3, :cond_11

    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->z:I

    sget-object v3, Lcom/google/android/gms/internal/ads/aaz;->h:Lcom/google/android/gms/internal/ads/aaz;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/aaz;->a()I

    move-result v3

    if-ne v0, v3, :cond_12

    :cond_11
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/adb;->q()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/adb;->p()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/adb;->E:Ljava/lang/Object;

    goto/16 :goto_4

    :cond_12
    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->z:I

    sget-object v3, Lcom/google/android/gms/internal/ads/aaz;->k:Lcom/google/android/gms/internal/ads/aaz;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/aaz;->a()I

    move-result v3

    if-ne v0, v3, :cond_6

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/adb;->p()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/adb;->F:Ljava/lang/Object;

    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->y:I

    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_13

    move v1, v2

    :cond_13
    if-eqz v1, :cond_6

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/adb;->p()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/adb;->E:Ljava/lang/Object;

    goto/16 :goto_4
.end method

.method final b()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->x:I

    return v0
.end method

.method final c()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->z:I

    return v0
.end method

.method final d()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->z:I

    sget-object v1, Lcom/google/android/gms/internal/ads/aaz;->k:Lcom/google/android/gms/internal/ads/aaz;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaz;->a()I

    move-result v1

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final e()Ljava/lang/reflect/Field;
    .locals 3

    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->A:I

    shl-int/lit8 v1, v0, 0x1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/adb;->b:[Ljava/lang/Object;

    aget-object v0, v0, v1

    instance-of v2, v0, Ljava/lang/reflect/Field;

    if-eqz v2, :cond_0

    check-cast v0, Ljava/lang/reflect/Field;

    :goto_0
    return-object v0

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/adb;->c:Ljava/lang/Class;

    check-cast v0, Ljava/lang/String;

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/adb;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/adb;->b:[Ljava/lang/Object;

    aput-object v0, v2, v1

    goto :goto_0
.end method

.method final f()Ljava/lang/reflect/Field;
    .locals 3

    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->A:I

    shl-int/lit8 v0, v0, 0x1

    add-int/lit8 v1, v0, 0x1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/adb;->b:[Ljava/lang/Object;

    aget-object v0, v0, v1

    instance-of v2, v0, Ljava/lang/reflect/Field;

    if-eqz v2, :cond_0

    check-cast v0, Ljava/lang/reflect/Field;

    :goto_0
    return-object v0

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/adb;->c:Ljava/lang/Class;

    check-cast v0, Ljava/lang/String;

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/adb;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/adb;->b:[Ljava/lang/Object;

    aput-object v0, v2, v1

    goto :goto_0
.end method

.method final g()Ljava/lang/reflect/Field;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/adb;->C:Ljava/lang/reflect/Field;

    return-object v0
.end method

.method final h()Z
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/adb;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->z:I

    sget-object v1, Lcom/google/android/gms/internal/ads/aaz;->c:Lcom/google/android/gms/internal/ads/aaz;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/aaz;->a()I

    move-result v1

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final i()Ljava/lang/reflect/Field;
    .locals 3

    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->f:I

    shl-int/lit8 v0, v0, 0x1

    iget v1, p0, Lcom/google/android/gms/internal/ads/adb;->B:I

    div-int/lit8 v1, v1, 0x20

    add-int/2addr v1, v0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/adb;->b:[Ljava/lang/Object;

    aget-object v0, v0, v1

    instance-of v2, v0, Ljava/lang/reflect/Field;

    if-eqz v2, :cond_0

    check-cast v0, Ljava/lang/reflect/Field;

    :goto_0
    return-object v0

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/adb;->c:Ljava/lang/Class;

    check-cast v0, Ljava/lang/String;

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/adb;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/adb;->b:[Ljava/lang/Object;

    aput-object v0, v2, v1

    goto :goto_0
.end method

.method final j()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->B:I

    rem-int/lit8 v0, v0, 0x20

    return v0
.end method

.method final k()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->y:I

    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final l()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/adb;->y:I

    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final m()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/adb;->D:Ljava/lang/Object;

    return-object v0
.end method

.method final n()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/adb;->E:Ljava/lang/Object;

    return-object v0
.end method

.method final o()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/adb;->F:Ljava/lang/Object;

    return-object v0
.end method
