.class public Lcom/a/a/c/d/a/a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/a/a/c/k;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<DataType:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/a/a/c/k",
        "<TDataType;",
        "Landroid/graphics/drawable/BitmapDrawable;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/a/a/c/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/a/a/c/k",
            "<TDataType;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;Lcom/a/a/c/k;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/res/Resources;",
            "Lcom/a/a/c/k",
            "<TDataType;",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/a/a/i/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/res/Resources;

    iput-object v0, p0, Lcom/a/a/c/d/a/a;->b:Landroid/content/res/Resources;

    invoke-static {p2}, Lcom/a/a/i/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/a/a/c/k;

    iput-object v0, p0, Lcom/a/a/c/d/a/a;->a:Lcom/a/a/c/k;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;IILcom/a/a/c/j;)Lcom/a/a/c/b/u;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TDataType;II",
            "Lcom/a/a/c/j;",
            ")",
            "Lcom/a/a/c/b/u",
            "<",
            "Landroid/graphics/drawable/BitmapDrawable;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/a/a/c/d/a/a;->a:Lcom/a/a/c/k;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/a/a/c/k;->a(Ljava/lang/Object;IILcom/a/a/c/j;)Lcom/a/a/c/b/u;

    move-result-object v0

    iget-object v1, p0, Lcom/a/a/c/d/a/a;->b:Landroid/content/res/Resources;

    invoke-static {v1, v0}, Lcom/a/a/c/d/a/p;->a(Landroid/content/res/Resources;Lcom/a/a/c/b/u;)Lcom/a/a/c/b/u;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/Object;Lcom/a/a/c/j;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TDataType;",
            "Lcom/a/a/c/j;",
            ")Z"
        }
    .end annotation

    iget-object v0, p0, Lcom/a/a/c/d/a/a;->a:Lcom/a/a/c/k;

    invoke-interface {v0, p1, p2}, Lcom/a/a/c/k;->a(Ljava/lang/Object;Lcom/a/a/c/j;)Z

    move-result v0

    return v0
.end method
