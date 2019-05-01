.class public Lcom/a/a/g/e;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field private a:I

.field private b:F

.field private c:Lcom/a/a/c/b/i;

.field private d:Lcom/a/a/g;

.field private e:Landroid/graphics/drawable/Drawable;

.field private f:I

.field private g:Landroid/graphics/drawable/Drawable;

.field private h:I

.field private i:Z

.field private j:I

.field private k:I

.field private l:Lcom/a/a/c/h;

.field private m:Z

.field private n:Z

.field private o:Landroid/graphics/drawable/Drawable;

.field private p:I

.field private q:Lcom/a/a/c/j;

.field private r:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Class",
            "<*>;",
            "Lcom/a/a/c/m",
            "<*>;>;"
        }
    .end annotation
.end field

.field private s:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private t:Z

.field private u:Landroid/content/res/Resources$Theme;

.field private v:Z

.field private w:Z

.field private x:Z

.field private y:Z

.field private z:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v2, -0x1

    const/4 v1, 0x1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f80

    iput v0, p0, Lcom/a/a/g/e;->b:F

    sget-object v0, Lcom/a/a/c/b/i;->e:Lcom/a/a/c/b/i;

    iput-object v0, p0, Lcom/a/a/g/e;->c:Lcom/a/a/c/b/i;

    sget-object v0, Lcom/a/a/g;->c:Lcom/a/a/g;

    iput-object v0, p0, Lcom/a/a/g/e;->d:Lcom/a/a/g;

    iput-boolean v1, p0, Lcom/a/a/g/e;->i:Z

    iput v2, p0, Lcom/a/a/g/e;->j:I

    iput v2, p0, Lcom/a/a/g/e;->k:I

    invoke-static {}, Lcom/a/a/h/a;->a()Lcom/a/a/h/a;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/g/e;->l:Lcom/a/a/c/h;

    iput-boolean v1, p0, Lcom/a/a/g/e;->n:Z

    new-instance v0, Lcom/a/a/c/j;

    invoke-direct {v0}, Lcom/a/a/c/j;-><init>()V

    iput-object v0, p0, Lcom/a/a/g/e;->q:Lcom/a/a/c/j;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/a/a/g/e;->r:Ljava/util/Map;

    const-class v0, Ljava/lang/Object;

    iput-object v0, p0, Lcom/a/a/g/e;->s:Ljava/lang/Class;

    iput-boolean v1, p0, Lcom/a/a/g/e;->y:Z

    return-void
.end method

.method private H()Lcom/a/a/g/e;
    .locals 2

    iget-boolean v0, p0, Lcom/a/a/g/e;->t:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You cannot modify locked RequestOptions, consider clone()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-object p0
.end method

.method public static a(Lcom/a/a/c/b/i;)Lcom/a/a/g/e;
    .locals 1

    new-instance v0, Lcom/a/a/g/e;

    invoke-direct {v0}, Lcom/a/a/g/e;-><init>()V

    invoke-virtual {v0, p0}, Lcom/a/a/g/e;->b(Lcom/a/a/c/b/i;)Lcom/a/a/g/e;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/a/a/c/d/a/j;Lcom/a/a/c/m;Z)Lcom/a/a/g/e;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/a/a/c/d/a/j;",
            "Lcom/a/a/c/m",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;Z)",
            "Lcom/a/a/g/e;"
        }
    .end annotation

    if-eqz p3, :cond_0

    invoke-virtual {p0, p1, p2}, Lcom/a/a/g/e;->b(Lcom/a/a/c/d/a/j;Lcom/a/a/c/m;)Lcom/a/a/g/e;

    move-result-object v0

    :goto_0
    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/a/a/g/e;->y:Z

    return-object v0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/a/a/g/e;->a(Lcom/a/a/c/d/a/j;Lcom/a/a/c/m;)Lcom/a/a/g/e;

    move-result-object v0

    goto :goto_0
.end method

.method public static a(Lcom/a/a/c/h;)Lcom/a/a/g/e;
    .locals 1

    new-instance v0, Lcom/a/a/g/e;

    invoke-direct {v0}, Lcom/a/a/g/e;-><init>()V

    invoke-virtual {v0, p0}, Lcom/a/a/g/e;->b(Lcom/a/a/c/h;)Lcom/a/a/g/e;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/a/a/c/m;Z)Lcom/a/a/g/e;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/a/a/c/m",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;Z)",
            "Lcom/a/a/g/e;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/a/a/g/e;->v:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/a/a/g/e;->a()Lcom/a/a/g/e;

    move-result-object v0

    invoke-direct {v0, p1, p2}, Lcom/a/a/g/e;->a(Lcom/a/a/c/m;Z)Lcom/a/a/g/e;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/a/a/c/d/a/m;

    invoke-direct {v0, p1, p2}, Lcom/a/a/c/d/a/m;-><init>(Lcom/a/a/c/m;Z)V

    const-class v1, Landroid/graphics/Bitmap;

    invoke-direct {p0, v1, p1, p2}, Lcom/a/a/g/e;->a(Ljava/lang/Class;Lcom/a/a/c/m;Z)Lcom/a/a/g/e;

    const-class v1, Landroid/graphics/drawable/Drawable;

    invoke-direct {p0, v1, v0, p2}, Lcom/a/a/g/e;->a(Ljava/lang/Class;Lcom/a/a/c/m;Z)Lcom/a/a/g/e;

    const-class v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Lcom/a/a/c/d/a/m;->a()Lcom/a/a/c/m;

    move-result-object v0

    invoke-direct {p0, v1, v0, p2}, Lcom/a/a/g/e;->a(Ljava/lang/Class;Lcom/a/a/c/m;Z)Lcom/a/a/g/e;

    const-class v0, Lcom/a/a/c/d/e/c;

    new-instance v1, Lcom/a/a/c/d/e/f;

    invoke-direct {v1, p1}, Lcom/a/a/c/d/e/f;-><init>(Lcom/a/a/c/m;)V

    invoke-direct {p0, v0, v1, p2}, Lcom/a/a/g/e;->a(Ljava/lang/Class;Lcom/a/a/c/m;Z)Lcom/a/a/g/e;

    invoke-direct {p0}, Lcom/a/a/g/e;->H()Lcom/a/a/g/e;

    move-result-object v0

    goto :goto_0
.end method

.method public static a(Ljava/lang/Class;)Lcom/a/a/g/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;)",
            "Lcom/a/a/g/e;"
        }
    .end annotation

    new-instance v0, Lcom/a/a/g/e;

    invoke-direct {v0}, Lcom/a/a/g/e;-><init>()V

    invoke-virtual {v0, p0}, Lcom/a/a/g/e;->b(Ljava/lang/Class;)Lcom/a/a/g/e;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/lang/Class;Lcom/a/a/c/m;Z)Lcom/a/a/g/e;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Lcom/a/a/c/m",
            "<TT;>;Z)",
            "Lcom/a/a/g/e;"
        }
    .end annotation

    const/4 v2, 0x1

    iget-boolean v0, p0, Lcom/a/a/g/e;->v:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/a/a/g/e;->a()Lcom/a/a/g/e;

    move-result-object v0

    invoke-direct {v0, p1, p2, p3}, Lcom/a/a/g/e;->a(Ljava/lang/Class;Lcom/a/a/c/m;Z)Lcom/a/a/g/e;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {p1}, Lcom/a/a/i/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/a/a/i/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/a/a/g/e;->r:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, p0, Lcom/a/a/g/e;->a:I

    or-int/lit16 v0, v0, 0x800

    iput v0, p0, Lcom/a/a/g/e;->a:I

    iput-boolean v2, p0, Lcom/a/a/g/e;->n:Z

    iget v0, p0, Lcom/a/a/g/e;->a:I

    const/high16 v1, 0x1

    or-int/2addr v0, v1

    iput v0, p0, Lcom/a/a/g/e;->a:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/a/a/g/e;->y:Z

    if-eqz p3, :cond_1

    iget v0, p0, Lcom/a/a/g/e;->a:I

    const/high16 v1, 0x2

    or-int/2addr v0, v1

    iput v0, p0, Lcom/a/a/g/e;->a:I

    iput-boolean v2, p0, Lcom/a/a/g/e;->m:Z

    :cond_1
    invoke-direct {p0}, Lcom/a/a/g/e;->H()Lcom/a/a/g/e;

    move-result-object v0

    goto :goto_0
.end method

.method private b(I)Z
    .locals 1

    iget v0, p0, Lcom/a/a/g/e;->a:I

    invoke-static {v0, p1}, Lcom/a/a/g/e;->b(II)Z

    move-result v0

    return v0
.end method

.method private static b(II)Z
    .locals 1

    and-int v0, p0, p1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private c(Lcom/a/a/c/d/a/j;Lcom/a/a/c/m;)Lcom/a/a/g/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/a/a/c/d/a/j;",
            "Lcom/a/a/c/m",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Lcom/a/a/g/e;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/a/a/g/e;->a(Lcom/a/a/c/d/a/j;Lcom/a/a/c/m;Z)Lcom/a/a/g/e;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final A()Z
    .locals 2

    iget v0, p0, Lcom/a/a/g/e;->k:I

    iget v1, p0, Lcom/a/a/g/e;->j:I

    invoke-static {v0, v1}, Lcom/a/a/i/i;->a(II)Z

    move-result v0

    return v0
.end method

.method public final B()I
    .locals 1

    iget v0, p0, Lcom/a/a/g/e;->j:I

    return v0
.end method

.method public final C()F
    .locals 1

    iget v0, p0, Lcom/a/a/g/e;->b:F

    return v0
.end method

.method D()Z
    .locals 1

    iget-boolean v0, p0, Lcom/a/a/g/e;->y:Z

    return v0
.end method

.method public final E()Z
    .locals 1

    iget-boolean v0, p0, Lcom/a/a/g/e;->w:Z

    return v0
.end method

.method public final F()Z
    .locals 1

    iget-boolean v0, p0, Lcom/a/a/g/e;->z:Z

    return v0
.end method

.method public final G()Z
    .locals 1

    iget-boolean v0, p0, Lcom/a/a/g/e;->x:Z

    return v0
.end method

.method public a()Lcom/a/a/g/e;
    .locals 3

    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/a/a/g/e;

    new-instance v1, Lcom/a/a/c/j;

    invoke-direct {v1}, Lcom/a/a/c/j;-><init>()V

    iput-object v1, v0, Lcom/a/a/g/e;->q:Lcom/a/a/c/j;

    iget-object v1, v0, Lcom/a/a/g/e;->q:Lcom/a/a/c/j;

    iget-object v2, p0, Lcom/a/a/g/e;->q:Lcom/a/a/c/j;

    invoke-virtual {v1, v2}, Lcom/a/a/c/j;->a(Lcom/a/a/c/j;)V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, v0, Lcom/a/a/g/e;->r:Ljava/util/Map;

    iget-object v1, v0, Lcom/a/a/g/e;->r:Ljava/util/Map;

    iget-object v2, p0, Lcom/a/a/g/e;->r:Ljava/util/Map;

    invoke-interface {v1, v2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/a/a/g/e;->t:Z

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/a/a/g/e;->v:Z
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public a(F)Lcom/a/a/g/e;
    .locals 2

    iget-boolean v0, p0, Lcom/a/a/g/e;->v:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/a/a/g/e;->a()Lcom/a/a/g/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/a/a/g/e;->a(F)Lcom/a/a/g/e;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-ltz v0, :cond_1

    const/high16 v0, 0x3f80

    cmpl-float v0, p1, v0

    if-lez v0, :cond_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "sizeMultiplier must be between 0 and 1"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iput p1, p0, Lcom/a/a/g/e;->b:F

    iget v0, p0, Lcom/a/a/g/e;->a:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/a/a/g/e;->a:I

    invoke-direct {p0}, Lcom/a/a/g/e;->H()Lcom/a/a/g/e;

    move-result-object v0

    goto :goto_0
.end method

.method public a(I)Lcom/a/a/g/e;
    .locals 1

    iget-boolean v0, p0, Lcom/a/a/g/e;->v:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/a/a/g/e;->a()Lcom/a/a/g/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/a/a/g/e;->a(I)Lcom/a/a/g/e;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iput p1, p0, Lcom/a/a/g/e;->h:I

    iget v0, p0, Lcom/a/a/g/e;->a:I

    or-int/lit16 v0, v0, 0x80

    iput v0, p0, Lcom/a/a/g/e;->a:I

    invoke-direct {p0}, Lcom/a/a/g/e;->H()Lcom/a/a/g/e;

    move-result-object v0

    goto :goto_0
.end method

.method public a(II)Lcom/a/a/g/e;
    .locals 1

    iget-boolean v0, p0, Lcom/a/a/g/e;->v:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/a/a/g/e;->a()Lcom/a/a/g/e;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/a/a/g/e;->a(II)Lcom/a/a/g/e;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iput p1, p0, Lcom/a/a/g/e;->k:I

    iput p2, p0, Lcom/a/a/g/e;->j:I

    iget v0, p0, Lcom/a/a/g/e;->a:I

    or-int/lit16 v0, v0, 0x200

    iput v0, p0, Lcom/a/a/g/e;->a:I

    invoke-direct {p0}, Lcom/a/a/g/e;->H()Lcom/a/a/g/e;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Lcom/a/a/c/d/a/j;)Lcom/a/a/g/e;
    .locals 2

    sget-object v0, Lcom/a/a/c/d/a/k;->b:Lcom/a/a/c/i;

    invoke-static {p1}, Lcom/a/a/i/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/a/a/g/e;->a(Lcom/a/a/c/i;Ljava/lang/Object;)Lcom/a/a/g/e;

    move-result-object v0

    return-object v0
.end method

.method final a(Lcom/a/a/c/d/a/j;Lcom/a/a/c/m;)Lcom/a/a/g/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/a/a/c/d/a/j;",
            "Lcom/a/a/c/m",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Lcom/a/a/g/e;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/a/a/g/e;->v:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/a/a/g/e;->a()Lcom/a/a/g/e;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/a/a/g/e;->a(Lcom/a/a/c/d/a/j;Lcom/a/a/c/m;)Lcom/a/a/g/e;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/a/a/g/e;->a(Lcom/a/a/c/d/a/j;)Lcom/a/a/g/e;

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Lcom/a/a/g/e;->a(Lcom/a/a/c/m;Z)Lcom/a/a/g/e;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Lcom/a/a/c/i;Ljava/lang/Object;)Lcom/a/a/g/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/a/a/c/i",
            "<TT;>;TT;)",
            "Lcom/a/a/g/e;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/a/a/g/e;->v:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/a/a/g/e;->a()Lcom/a/a/g/e;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/a/a/g/e;->a(Lcom/a/a/c/i;Ljava/lang/Object;)Lcom/a/a/g/e;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {p1}, Lcom/a/a/i/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/a/a/i/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/a/a/g/e;->q:Lcom/a/a/c/j;

    invoke-virtual {v0, p1, p2}, Lcom/a/a/c/j;->a(Lcom/a/a/c/i;Ljava/lang/Object;)Lcom/a/a/c/j;

    invoke-direct {p0}, Lcom/a/a/g/e;->H()Lcom/a/a/g/e;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Lcom/a/a/c/m;)Lcom/a/a/g/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/a/a/c/m",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Lcom/a/a/g/e;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/a/a/g/e;->a(Lcom/a/a/c/m;Z)Lcom/a/a/g/e;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/a/a/g/e;)Lcom/a/a/g/e;
    .locals 2

    iget-boolean v0, p0, Lcom/a/a/g/e;->v:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/a/a/g/e;->a()Lcom/a/a/g/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/a/a/g/e;->a(Lcom/a/a/g/e;)Lcom/a/a/g/e;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget v0, p1, Lcom/a/a/g/e;->a:I

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/a/a/g/e;->b(II)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p1, Lcom/a/a/g/e;->b:F

    iput v0, p0, Lcom/a/a/g/e;->b:F

    :cond_1
    iget v0, p1, Lcom/a/a/g/e;->a:I

    const/high16 v1, 0x4

    invoke-static {v0, v1}, Lcom/a/a/g/e;->b(II)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, p1, Lcom/a/a/g/e;->w:Z

    iput-boolean v0, p0, Lcom/a/a/g/e;->w:Z

    :cond_2
    iget v0, p1, Lcom/a/a/g/e;->a:I

    const/high16 v1, 0x10

    invoke-static {v0, v1}, Lcom/a/a/g/e;->b(II)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-boolean v0, p1, Lcom/a/a/g/e;->z:Z

    iput-boolean v0, p0, Lcom/a/a/g/e;->z:Z

    :cond_3
    iget v0, p1, Lcom/a/a/g/e;->a:I

    const/4 v1, 0x4

    invoke-static {v0, v1}, Lcom/a/a/g/e;->b(II)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p1, Lcom/a/a/g/e;->c:Lcom/a/a/c/b/i;

    iput-object v0, p0, Lcom/a/a/g/e;->c:Lcom/a/a/c/b/i;

    :cond_4
    iget v0, p1, Lcom/a/a/g/e;->a:I

    const/16 v1, 0x8

    invoke-static {v0, v1}, Lcom/a/a/g/e;->b(II)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p1, Lcom/a/a/g/e;->d:Lcom/a/a/g;

    iput-object v0, p0, Lcom/a/a/g/e;->d:Lcom/a/a/g;

    :cond_5
    iget v0, p1, Lcom/a/a/g/e;->a:I

    const/16 v1, 0x10

    invoke-static {v0, v1}, Lcom/a/a/g/e;->b(II)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p1, Lcom/a/a/g/e;->e:Landroid/graphics/drawable/Drawable;

    iput-object v0, p0, Lcom/a/a/g/e;->e:Landroid/graphics/drawable/Drawable;

    :cond_6
    iget v0, p1, Lcom/a/a/g/e;->a:I

    const/16 v1, 0x20

    invoke-static {v0, v1}, Lcom/a/a/g/e;->b(II)Z

    move-result v0

    if-eqz v0, :cond_7

    iget v0, p1, Lcom/a/a/g/e;->f:I

    iput v0, p0, Lcom/a/a/g/e;->f:I

    :cond_7
    iget v0, p1, Lcom/a/a/g/e;->a:I

    const/16 v1, 0x40

    invoke-static {v0, v1}, Lcom/a/a/g/e;->b(II)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p1, Lcom/a/a/g/e;->g:Landroid/graphics/drawable/Drawable;

    iput-object v0, p0, Lcom/a/a/g/e;->g:Landroid/graphics/drawable/Drawable;

    :cond_8
    iget v0, p1, Lcom/a/a/g/e;->a:I

    const/16 v1, 0x80

    invoke-static {v0, v1}, Lcom/a/a/g/e;->b(II)Z

    move-result v0

    if-eqz v0, :cond_9

    iget v0, p1, Lcom/a/a/g/e;->h:I

    iput v0, p0, Lcom/a/a/g/e;->h:I

    :cond_9
    iget v0, p1, Lcom/a/a/g/e;->a:I

    const/16 v1, 0x100

    invoke-static {v0, v1}, Lcom/a/a/g/e;->b(II)Z

    move-result v0

    if-eqz v0, :cond_a

    iget-boolean v0, p1, Lcom/a/a/g/e;->i:Z

    iput-boolean v0, p0, Lcom/a/a/g/e;->i:Z

    :cond_a
    iget v0, p1, Lcom/a/a/g/e;->a:I

    const/16 v1, 0x200

    invoke-static {v0, v1}, Lcom/a/a/g/e;->b(II)Z

    move-result v0

    if-eqz v0, :cond_b

    iget v0, p1, Lcom/a/a/g/e;->k:I

    iput v0, p0, Lcom/a/a/g/e;->k:I

    iget v0, p1, Lcom/a/a/g/e;->j:I

    iput v0, p0, Lcom/a/a/g/e;->j:I

    :cond_b
    iget v0, p1, Lcom/a/a/g/e;->a:I

    const/16 v1, 0x400

    invoke-static {v0, v1}, Lcom/a/a/g/e;->b(II)Z

    move-result v0

    if-eqz v0, :cond_c

    iget-object v0, p1, Lcom/a/a/g/e;->l:Lcom/a/a/c/h;

    iput-object v0, p0, Lcom/a/a/g/e;->l:Lcom/a/a/c/h;

    :cond_c
    iget v0, p1, Lcom/a/a/g/e;->a:I

    const/16 v1, 0x1000

    invoke-static {v0, v1}, Lcom/a/a/g/e;->b(II)Z

    move-result v0

    if-eqz v0, :cond_d

    iget-object v0, p1, Lcom/a/a/g/e;->s:Ljava/lang/Class;

    iput-object v0, p0, Lcom/a/a/g/e;->s:Ljava/lang/Class;

    :cond_d
    iget v0, p1, Lcom/a/a/g/e;->a:I

    const/16 v1, 0x2000

    invoke-static {v0, v1}, Lcom/a/a/g/e;->b(II)Z

    move-result v0

    if-eqz v0, :cond_e

    iget-object v0, p1, Lcom/a/a/g/e;->o:Landroid/graphics/drawable/Drawable;

    iput-object v0, p0, Lcom/a/a/g/e;->o:Landroid/graphics/drawable/Drawable;

    :cond_e
    iget v0, p1, Lcom/a/a/g/e;->a:I

    const/16 v1, 0x4000

    invoke-static {v0, v1}, Lcom/a/a/g/e;->b(II)Z

    move-result v0

    if-eqz v0, :cond_f

    iget v0, p1, Lcom/a/a/g/e;->p:I

    iput v0, p0, Lcom/a/a/g/e;->p:I

    :cond_f
    iget v0, p1, Lcom/a/a/g/e;->a:I

    const v1, 0x8000

    invoke-static {v0, v1}, Lcom/a/a/g/e;->b(II)Z

    move-result v0

    if-eqz v0, :cond_10

    iget-object v0, p1, Lcom/a/a/g/e;->u:Landroid/content/res/Resources$Theme;

    iput-object v0, p0, Lcom/a/a/g/e;->u:Landroid/content/res/Resources$Theme;

    :cond_10
    iget v0, p1, Lcom/a/a/g/e;->a:I

    const/high16 v1, 0x1

    invoke-static {v0, v1}, Lcom/a/a/g/e;->b(II)Z

    move-result v0

    if-eqz v0, :cond_11

    iget-boolean v0, p1, Lcom/a/a/g/e;->n:Z

    iput-boolean v0, p0, Lcom/a/a/g/e;->n:Z

    :cond_11
    iget v0, p1, Lcom/a/a/g/e;->a:I

    const/high16 v1, 0x2

    invoke-static {v0, v1}, Lcom/a/a/g/e;->b(II)Z

    move-result v0

    if-eqz v0, :cond_12

    iget-boolean v0, p1, Lcom/a/a/g/e;->m:Z

    iput-boolean v0, p0, Lcom/a/a/g/e;->m:Z

    :cond_12
    iget v0, p1, Lcom/a/a/g/e;->a:I

    const/16 v1, 0x800

    invoke-static {v0, v1}, Lcom/a/a/g/e;->b(II)Z

    move-result v0

    if-eqz v0, :cond_13

    iget-object v0, p0, Lcom/a/a/g/e;->r:Ljava/util/Map;

    iget-object v1, p1, Lcom/a/a/g/e;->r:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    iget-boolean v0, p1, Lcom/a/a/g/e;->y:Z

    iput-boolean v0, p0, Lcom/a/a/g/e;->y:Z

    :cond_13
    iget v0, p1, Lcom/a/a/g/e;->a:I

    const/high16 v1, 0x8

    invoke-static {v0, v1}, Lcom/a/a/g/e;->b(II)Z

    move-result v0

    if-eqz v0, :cond_14

    iget-boolean v0, p1, Lcom/a/a/g/e;->x:Z

    iput-boolean v0, p0, Lcom/a/a/g/e;->x:Z

    :cond_14
    iget-boolean v0, p0, Lcom/a/a/g/e;->n:Z

    if-nez v0, :cond_15

    iget-object v0, p0, Lcom/a/a/g/e;->r:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget v0, p0, Lcom/a/a/g/e;->a:I

    and-int/lit16 v0, v0, -0x801

    iput v0, p0, Lcom/a/a/g/e;->a:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/a/a/g/e;->m:Z

    iget v0, p0, Lcom/a/a/g/e;->a:I

    const v1, -0x20001

    and-int/2addr v0, v1

    iput v0, p0, Lcom/a/a/g/e;->a:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/a/a/g/e;->y:Z

    :cond_15
    iget v0, p0, Lcom/a/a/g/e;->a:I

    iget v1, p1, Lcom/a/a/g/e;->a:I

    or-int/2addr v0, v1

    iput v0, p0, Lcom/a/a/g/e;->a:I

    iget-object v0, p0, Lcom/a/a/g/e;->q:Lcom/a/a/c/j;

    iget-object v1, p1, Lcom/a/a/g/e;->q:Lcom/a/a/c/j;

    invoke-virtual {v0, v1}, Lcom/a/a/c/j;->a(Lcom/a/a/c/j;)V

    invoke-direct {p0}, Lcom/a/a/g/e;->H()Lcom/a/a/g/e;

    move-result-object v0

    goto/16 :goto_0
.end method

.method public a(Lcom/a/a/g;)Lcom/a/a/g/e;
    .locals 1

    iget-boolean v0, p0, Lcom/a/a/g/e;->v:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/a/a/g/e;->a()Lcom/a/a/g/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/a/a/g/e;->a(Lcom/a/a/g;)Lcom/a/a/g/e;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {p1}, Lcom/a/a/i/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/a/a/g;

    iput-object v0, p0, Lcom/a/a/g/e;->d:Lcom/a/a/g;

    iget v0, p0, Lcom/a/a/g/e;->a:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/a/a/g/e;->a:I

    invoke-direct {p0}, Lcom/a/a/g/e;->H()Lcom/a/a/g/e;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Z)Lcom/a/a/g/e;
    .locals 2

    iget-boolean v0, p0, Lcom/a/a/g/e;->v:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/a/a/g/e;->a()Lcom/a/a/g/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/a/a/g/e;->a(Z)Lcom/a/a/g/e;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iput-boolean p1, p0, Lcom/a/a/g/e;->z:Z

    iget v0, p0, Lcom/a/a/g/e;->a:I

    const/high16 v1, 0x10

    or-int/2addr v0, v1

    iput v0, p0, Lcom/a/a/g/e;->a:I

    invoke-direct {p0}, Lcom/a/a/g/e;->H()Lcom/a/a/g/e;

    move-result-object v0

    goto :goto_0
.end method

.method public b(Lcom/a/a/c/b/i;)Lcom/a/a/g/e;
    .locals 1

    iget-boolean v0, p0, Lcom/a/a/g/e;->v:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/a/a/g/e;->a()Lcom/a/a/g/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/a/a/g/e;->b(Lcom/a/a/c/b/i;)Lcom/a/a/g/e;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {p1}, Lcom/a/a/i/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/a/a/c/b/i;

    iput-object v0, p0, Lcom/a/a/g/e;->c:Lcom/a/a/c/b/i;

    iget v0, p0, Lcom/a/a/g/e;->a:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/a/a/g/e;->a:I

    invoke-direct {p0}, Lcom/a/a/g/e;->H()Lcom/a/a/g/e;

    move-result-object v0

    goto :goto_0
.end method

.method final b(Lcom/a/a/c/d/a/j;Lcom/a/a/c/m;)Lcom/a/a/g/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/a/a/c/d/a/j;",
            "Lcom/a/a/c/m",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Lcom/a/a/g/e;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/a/a/g/e;->v:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/a/a/g/e;->a()Lcom/a/a/g/e;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/a/a/g/e;->b(Lcom/a/a/c/d/a/j;Lcom/a/a/c/m;)Lcom/a/a/g/e;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/a/a/g/e;->a(Lcom/a/a/c/d/a/j;)Lcom/a/a/g/e;

    invoke-virtual {p0, p2}, Lcom/a/a/g/e;->a(Lcom/a/a/c/m;)Lcom/a/a/g/e;

    move-result-object v0

    goto :goto_0
.end method

.method public b(Lcom/a/a/c/h;)Lcom/a/a/g/e;
    .locals 1

    iget-boolean v0, p0, Lcom/a/a/g/e;->v:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/a/a/g/e;->a()Lcom/a/a/g/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/a/a/g/e;->b(Lcom/a/a/c/h;)Lcom/a/a/g/e;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {p1}, Lcom/a/a/i/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/a/a/c/h;

    iput-object v0, p0, Lcom/a/a/g/e;->l:Lcom/a/a/c/h;

    iget v0, p0, Lcom/a/a/g/e;->a:I

    or-int/lit16 v0, v0, 0x400

    iput v0, p0, Lcom/a/a/g/e;->a:I

    invoke-direct {p0}, Lcom/a/a/g/e;->H()Lcom/a/a/g/e;

    move-result-object v0

    goto :goto_0
.end method

.method public b(Ljava/lang/Class;)Lcom/a/a/g/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;)",
            "Lcom/a/a/g/e;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/a/a/g/e;->v:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/a/a/g/e;->a()Lcom/a/a/g/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/a/a/g/e;->b(Ljava/lang/Class;)Lcom/a/a/g/e;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {p1}, Lcom/a/a/i/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    iput-object v0, p0, Lcom/a/a/g/e;->s:Ljava/lang/Class;

    iget v0, p0, Lcom/a/a/g/e;->a:I

    or-int/lit16 v0, v0, 0x1000

    iput v0, p0, Lcom/a/a/g/e;->a:I

    invoke-direct {p0}, Lcom/a/a/g/e;->H()Lcom/a/a/g/e;

    move-result-object v0

    goto :goto_0
.end method

.method public b(Z)Lcom/a/a/g/e;
    .locals 2

    const/4 v0, 0x1

    iget-boolean v1, p0, Lcom/a/a/g/e;->v:Z

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/a/a/g/e;->a()Lcom/a/a/g/e;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/a/a/g/e;->b(Z)Lcom/a/a/g/e;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    if-nez p1, :cond_1

    :goto_1
    iput-boolean v0, p0, Lcom/a/a/g/e;->i:Z

    iget v0, p0, Lcom/a/a/g/e;->a:I

    or-int/lit16 v0, v0, 0x100

    iput v0, p0, Lcom/a/a/g/e;->a:I

    invoke-direct {p0}, Lcom/a/a/g/e;->H()Lcom/a/a/g/e;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lcom/a/a/g/e;->n:Z

    return v0
.end method

.method public final c()Z
    .locals 1

    const/16 v0, 0x800

    invoke-direct {p0, v0}, Lcom/a/a/g/e;->b(I)Z

    move-result v0

    return v0
.end method

.method public synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/a/a/g/e;->a()Lcom/a/a/g/e;

    move-result-object v0

    return-object v0
.end method

.method public d()Lcom/a/a/g/e;
    .locals 2

    sget-object v0, Lcom/a/a/c/d/a/j;->b:Lcom/a/a/c/d/a/j;

    new-instance v1, Lcom/a/a/c/d/a/g;

    invoke-direct {v1}, Lcom/a/a/c/d/a/g;-><init>()V

    invoke-virtual {p0, v0, v1}, Lcom/a/a/g/e;->a(Lcom/a/a/c/d/a/j;Lcom/a/a/c/m;)Lcom/a/a/g/e;

    move-result-object v0

    return-object v0
.end method

.method public e()Lcom/a/a/g/e;
    .locals 2

    sget-object v0, Lcom/a/a/c/d/a/j;->b:Lcom/a/a/c/d/a/j;

    new-instance v1, Lcom/a/a/c/d/a/g;

    invoke-direct {v1}, Lcom/a/a/c/d/a/g;-><init>()V

    invoke-virtual {p0, v0, v1}, Lcom/a/a/g/e;->b(Lcom/a/a/c/d/a/j;Lcom/a/a/c/m;)Lcom/a/a/g/e;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    instance-of v1, p1, Lcom/a/a/g/e;

    if-eqz v1, :cond_0

    check-cast p1, Lcom/a/a/g/e;

    iget v1, p1, Lcom/a/a/g/e;->b:F

    iget v2, p0, Lcom/a/a/g/e;->b:F

    invoke-static {v1, v2}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-nez v1, :cond_0

    iget v1, p0, Lcom/a/a/g/e;->f:I

    iget v2, p1, Lcom/a/a/g/e;->f:I

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcom/a/a/g/e;->e:Landroid/graphics/drawable/Drawable;

    iget-object v2, p1, Lcom/a/a/g/e;->e:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v2}, Lcom/a/a/i/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget v1, p0, Lcom/a/a/g/e;->h:I

    iget v2, p1, Lcom/a/a/g/e;->h:I

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcom/a/a/g/e;->g:Landroid/graphics/drawable/Drawable;

    iget-object v2, p1, Lcom/a/a/g/e;->g:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v2}, Lcom/a/a/i/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget v1, p0, Lcom/a/a/g/e;->p:I

    iget v2, p1, Lcom/a/a/g/e;->p:I

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcom/a/a/g/e;->o:Landroid/graphics/drawable/Drawable;

    iget-object v2, p1, Lcom/a/a/g/e;->o:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v2}, Lcom/a/a/i/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lcom/a/a/g/e;->i:Z

    iget-boolean v2, p1, Lcom/a/a/g/e;->i:Z

    if-ne v1, v2, :cond_0

    iget v1, p0, Lcom/a/a/g/e;->j:I

    iget v2, p1, Lcom/a/a/g/e;->j:I

    if-ne v1, v2, :cond_0

    iget v1, p0, Lcom/a/a/g/e;->k:I

    iget v2, p1, Lcom/a/a/g/e;->k:I

    if-ne v1, v2, :cond_0

    iget-boolean v1, p0, Lcom/a/a/g/e;->m:Z

    iget-boolean v2, p1, Lcom/a/a/g/e;->m:Z

    if-ne v1, v2, :cond_0

    iget-boolean v1, p0, Lcom/a/a/g/e;->n:Z

    iget-boolean v2, p1, Lcom/a/a/g/e;->n:Z

    if-ne v1, v2, :cond_0

    iget-boolean v1, p0, Lcom/a/a/g/e;->w:Z

    iget-boolean v2, p1, Lcom/a/a/g/e;->w:Z

    if-ne v1, v2, :cond_0

    iget-boolean v1, p0, Lcom/a/a/g/e;->x:Z

    iget-boolean v2, p1, Lcom/a/a/g/e;->x:Z

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcom/a/a/g/e;->c:Lcom/a/a/c/b/i;

    iget-object v2, p1, Lcom/a/a/g/e;->c:Lcom/a/a/c/b/i;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/a/a/g/e;->d:Lcom/a/a/g;

    iget-object v2, p1, Lcom/a/a/g/e;->d:Lcom/a/a/g;

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcom/a/a/g/e;->q:Lcom/a/a/c/j;

    iget-object v2, p1, Lcom/a/a/g/e;->q:Lcom/a/a/c/j;

    invoke-virtual {v1, v2}, Lcom/a/a/c/j;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/a/a/g/e;->r:Ljava/util/Map;

    iget-object v2, p1, Lcom/a/a/g/e;->r:Ljava/util/Map;

    invoke-interface {v1, v2}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/a/a/g/e;->s:Ljava/lang/Class;

    iget-object v2, p1, Lcom/a/a/g/e;->s:Ljava/lang/Class;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/a/a/g/e;->l:Lcom/a/a/c/h;

    iget-object v2, p1, Lcom/a/a/g/e;->l:Lcom/a/a/c/h;

    invoke-static {v1, v2}, Lcom/a/a/i/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/a/a/g/e;->u:Landroid/content/res/Resources$Theme;

    iget-object v2, p1, Lcom/a/a/g/e;->u:Landroid/content/res/Resources$Theme;

    invoke-static {v1, v2}, Lcom/a/a/i/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public f()Lcom/a/a/g/e;
    .locals 2

    sget-object v0, Lcom/a/a/c/d/a/j;->a:Lcom/a/a/c/d/a/j;

    new-instance v1, Lcom/a/a/c/d/a/n;

    invoke-direct {v1}, Lcom/a/a/c/d/a/n;-><init>()V

    invoke-direct {p0, v0, v1}, Lcom/a/a/g/e;->c(Lcom/a/a/c/d/a/j;Lcom/a/a/c/m;)Lcom/a/a/g/e;

    move-result-object v0

    return-object v0
.end method

.method public g()Lcom/a/a/g/e;
    .locals 2

    sget-object v0, Lcom/a/a/c/d/a/j;->e:Lcom/a/a/c/d/a/j;

    new-instance v1, Lcom/a/a/c/d/a/h;

    invoke-direct {v1}, Lcom/a/a/c/d/a/h;-><init>()V

    invoke-direct {p0, v0, v1}, Lcom/a/a/g/e;->c(Lcom/a/a/c/d/a/j;Lcom/a/a/c/m;)Lcom/a/a/g/e;

    move-result-object v0

    return-object v0
.end method

.method public h()Lcom/a/a/g/e;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/a/a/g/e;->t:Z

    return-object p0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/a/a/g/e;->b:F

    invoke-static {v0}, Lcom/a/a/i/i;->a(F)I

    move-result v0

    iget v1, p0, Lcom/a/a/g/e;->f:I

    invoke-static {v1, v0}, Lcom/a/a/i/i;->b(II)I

    move-result v0

    iget-object v1, p0, Lcom/a/a/g/e;->e:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v0}, Lcom/a/a/i/i;->a(Ljava/lang/Object;I)I

    move-result v0

    iget v1, p0, Lcom/a/a/g/e;->h:I

    invoke-static {v1, v0}, Lcom/a/a/i/i;->b(II)I

    move-result v0

    iget-object v1, p0, Lcom/a/a/g/e;->g:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v0}, Lcom/a/a/i/i;->a(Ljava/lang/Object;I)I

    move-result v0

    iget v1, p0, Lcom/a/a/g/e;->p:I

    invoke-static {v1, v0}, Lcom/a/a/i/i;->b(II)I

    move-result v0

    iget-object v1, p0, Lcom/a/a/g/e;->o:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v0}, Lcom/a/a/i/i;->a(Ljava/lang/Object;I)I

    move-result v0

    iget-boolean v1, p0, Lcom/a/a/g/e;->i:Z

    invoke-static {v1, v0}, Lcom/a/a/i/i;->a(ZI)I

    move-result v0

    iget v1, p0, Lcom/a/a/g/e;->j:I

    invoke-static {v1, v0}, Lcom/a/a/i/i;->b(II)I

    move-result v0

    iget v1, p0, Lcom/a/a/g/e;->k:I

    invoke-static {v1, v0}, Lcom/a/a/i/i;->b(II)I

    move-result v0

    iget-boolean v1, p0, Lcom/a/a/g/e;->m:Z

    invoke-static {v1, v0}, Lcom/a/a/i/i;->a(ZI)I

    move-result v0

    iget-boolean v1, p0, Lcom/a/a/g/e;->n:Z

    invoke-static {v1, v0}, Lcom/a/a/i/i;->a(ZI)I

    move-result v0

    iget-boolean v1, p0, Lcom/a/a/g/e;->w:Z

    invoke-static {v1, v0}, Lcom/a/a/i/i;->a(ZI)I

    move-result v0

    iget-boolean v1, p0, Lcom/a/a/g/e;->x:Z

    invoke-static {v1, v0}, Lcom/a/a/i/i;->a(ZI)I

    move-result v0

    iget-object v1, p0, Lcom/a/a/g/e;->c:Lcom/a/a/c/b/i;

    invoke-static {v1, v0}, Lcom/a/a/i/i;->a(Ljava/lang/Object;I)I

    move-result v0

    iget-object v1, p0, Lcom/a/a/g/e;->d:Lcom/a/a/g;

    invoke-static {v1, v0}, Lcom/a/a/i/i;->a(Ljava/lang/Object;I)I

    move-result v0

    iget-object v1, p0, Lcom/a/a/g/e;->q:Lcom/a/a/c/j;

    invoke-static {v1, v0}, Lcom/a/a/i/i;->a(Ljava/lang/Object;I)I

    move-result v0

    iget-object v1, p0, Lcom/a/a/g/e;->r:Ljava/util/Map;

    invoke-static {v1, v0}, Lcom/a/a/i/i;->a(Ljava/lang/Object;I)I

    move-result v0

    iget-object v1, p0, Lcom/a/a/g/e;->s:Ljava/lang/Class;

    invoke-static {v1, v0}, Lcom/a/a/i/i;->a(Ljava/lang/Object;I)I

    move-result v0

    iget-object v1, p0, Lcom/a/a/g/e;->l:Lcom/a/a/c/h;

    invoke-static {v1, v0}, Lcom/a/a/i/i;->a(Ljava/lang/Object;I)I

    move-result v0

    iget-object v1, p0, Lcom/a/a/g/e;->u:Landroid/content/res/Resources$Theme;

    invoke-static {v1, v0}, Lcom/a/a/i/i;->a(Ljava/lang/Object;I)I

    move-result v0

    return v0
.end method

.method public i()Lcom/a/a/g/e;
    .locals 2

    iget-boolean v0, p0, Lcom/a/a/g/e;->t:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/a/a/g/e;->v:Z

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You cannot auto lock an already locked options object, try clone() first"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/a/a/g/e;->v:Z

    invoke-virtual {p0}, Lcom/a/a/g/e;->h()Lcom/a/a/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final j()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Class",
            "<*>;",
            "Lcom/a/a/c/m",
            "<*>;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/a/a/g/e;->r:Ljava/util/Map;

    return-object v0
.end method

.method public final k()Z
    .locals 1

    iget-boolean v0, p0, Lcom/a/a/g/e;->m:Z

    return v0
.end method

.method public final l()Lcom/a/a/c/j;
    .locals 1

    iget-object v0, p0, Lcom/a/a/g/e;->q:Lcom/a/a/c/j;

    return-object v0
.end method

.method public final m()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/a/a/g/e;->s:Ljava/lang/Class;

    return-object v0
.end method

.method public final n()Lcom/a/a/c/b/i;
    .locals 1

    iget-object v0, p0, Lcom/a/a/g/e;->c:Lcom/a/a/c/b/i;

    return-object v0
.end method

.method public final o()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcom/a/a/g/e;->e:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final p()I
    .locals 1

    iget v0, p0, Lcom/a/a/g/e;->f:I

    return v0
.end method

.method public final q()I
    .locals 1

    iget v0, p0, Lcom/a/a/g/e;->h:I

    return v0
.end method

.method public final r()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcom/a/a/g/e;->g:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final s()I
    .locals 1

    iget v0, p0, Lcom/a/a/g/e;->p:I

    return v0
.end method

.method public final t()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcom/a/a/g/e;->o:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final u()Landroid/content/res/Resources$Theme;
    .locals 1

    iget-object v0, p0, Lcom/a/a/g/e;->u:Landroid/content/res/Resources$Theme;

    return-object v0
.end method

.method public final v()Z
    .locals 1

    iget-boolean v0, p0, Lcom/a/a/g/e;->i:Z

    return v0
.end method

.method public final w()Lcom/a/a/c/h;
    .locals 1

    iget-object v0, p0, Lcom/a/a/g/e;->l:Lcom/a/a/c/h;

    return-object v0
.end method

.method public final x()Z
    .locals 1

    const/16 v0, 0x8

    invoke-direct {p0, v0}, Lcom/a/a/g/e;->b(I)Z

    move-result v0

    return v0
.end method

.method public final y()Lcom/a/a/g;
    .locals 1

    iget-object v0, p0, Lcom/a/a/g/e;->d:Lcom/a/a/g;

    return-object v0
.end method

.method public final z()I
    .locals 1

    iget v0, p0, Lcom/a/a/g/e;->k:I

    return v0
.end method
