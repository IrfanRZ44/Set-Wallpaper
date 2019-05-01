.class public Lcom/a/a/c/d/a/r;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/a/a/c/k;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/a/a/c/k",
        "<",
        "Landroid/net/Uri;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/a/a/c/d/c/d;

.field private final b:Lcom/a/a/c/b/a/e;


# direct methods
.method public constructor <init>(Lcom/a/a/c/d/c/d;Lcom/a/a/c/b/a/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/a/a/c/d/a/r;->a:Lcom/a/a/c/d/c/d;

    iput-object p2, p0, Lcom/a/a/c/d/a/r;->b:Lcom/a/a/c/b/a/e;

    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;IILcom/a/a/c/j;)Lcom/a/a/c/b/u;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "II",
            "Lcom/a/a/c/j;",
            ")",
            "Lcom/a/a/c/b/u",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/a/a/c/d/a/r;->a:Lcom/a/a/c/d/c/d;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/a/a/c/d/c/d;->a(Landroid/net/Uri;IILcom/a/a/c/j;)Lcom/a/a/c/b/u;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-interface {v0}, Lcom/a/a/c/b/u;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lcom/a/a/c/d/a/r;->b:Lcom/a/a/c/b/a/e;

    invoke-static {v1, v0, p2, p3}, Lcom/a/a/c/d/a/l;->a(Lcom/a/a/c/b/a/e;Landroid/graphics/drawable/Drawable;II)Lcom/a/a/c/b/u;

    move-result-object v0

    goto :goto_0
.end method

.method public bridge synthetic a(Ljava/lang/Object;IILcom/a/a/c/j;)Lcom/a/a/c/b/u;
    .locals 1

    check-cast p1, Landroid/net/Uri;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/a/a/c/d/a/r;->a(Landroid/net/Uri;IILcom/a/a/c/j;)Lcom/a/a/c/b/u;

    move-result-object v0

    return-object v0
.end method

.method public a(Landroid/net/Uri;Lcom/a/a/c/j;)Z
    .locals 2

    const-string v0, "android.resource"

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/a/a/c/j;)Z
    .locals 1

    check-cast p1, Landroid/net/Uri;

    invoke-virtual {p0, p1, p2}, Lcom/a/a/c/d/a/r;->a(Landroid/net/Uri;Lcom/a/a/c/j;)Z

    move-result v0

    return v0
.end method
