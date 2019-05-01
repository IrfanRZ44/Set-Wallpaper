.class public final Lcom/a/a/c/d/a/p;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/a/a/c/b/q;
.implements Lcom/a/a/c/b/u;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/a/a/c/b/q;",
        "Lcom/a/a/c/b/u",
        "<",
        "Landroid/graphics/drawable/BitmapDrawable;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Landroid/content/res/Resources;

.field private final b:Lcom/a/a/c/b/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/a/a/c/b/u",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Landroid/content/res/Resources;Lcom/a/a/c/b/u;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/res/Resources;",
            "Lcom/a/a/c/b/u",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/a/a/i/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/res/Resources;

    iput-object v0, p0, Lcom/a/a/c/d/a/p;->a:Landroid/content/res/Resources;

    invoke-static {p2}, Lcom/a/a/i/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/a/a/c/b/u;

    iput-object v0, p0, Lcom/a/a/c/d/a/p;->b:Lcom/a/a/c/b/u;

    return-void
.end method

.method public static a(Landroid/content/res/Resources;Lcom/a/a/c/b/u;)Lcom/a/a/c/b/u;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/res/Resources;",
            "Lcom/a/a/c/b/u",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Lcom/a/a/c/b/u",
            "<",
            "Landroid/graphics/drawable/BitmapDrawable;",
            ">;"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/a/a/c/d/a/p;

    invoke-direct {v0, p0, p1}, Lcom/a/a/c/d/a/p;-><init>(Landroid/content/res/Resources;Lcom/a/a/c/b/u;)V

    goto :goto_0
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/a/a/c/d/a/p;->b:Lcom/a/a/c/b/u;

    instance-of v0, v0, Lcom/a/a/c/b/q;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/a/a/c/d/a/p;->b:Lcom/a/a/c/b/u;

    check-cast v0, Lcom/a/a/c/b/q;

    invoke-interface {v0}, Lcom/a/a/c/b/q;->a()V

    :cond_0
    return-void
.end method

.method public b()Landroid/graphics/drawable/BitmapDrawable;
    .locals 3

    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    iget-object v2, p0, Lcom/a/a/c/d/a/p;->a:Landroid/content/res/Resources;

    iget-object v0, p0, Lcom/a/a/c/d/a/p;->b:Lcom/a/a/c/b/u;

    invoke-interface {v0}, Lcom/a/a/c/b/u;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    invoke-direct {v1, v2, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    return-object v1
.end method

.method public c()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class",
            "<",
            "Landroid/graphics/drawable/BitmapDrawable;",
            ">;"
        }
    .end annotation

    const-class v0, Landroid/graphics/drawable/BitmapDrawable;

    return-object v0
.end method

.method public synthetic d()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/a/a/c/d/a/p;->b()Landroid/graphics/drawable/BitmapDrawable;

    move-result-object v0

    return-object v0
.end method

.method public e()I
    .locals 1

    iget-object v0, p0, Lcom/a/a/c/d/a/p;->b:Lcom/a/a/c/b/u;

    invoke-interface {v0}, Lcom/a/a/c/b/u;->e()I

    move-result v0

    return v0
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Lcom/a/a/c/d/a/p;->b:Lcom/a/a/c/b/u;

    invoke-interface {v0}, Lcom/a/a/c/b/u;->f()V

    return-void
.end method
