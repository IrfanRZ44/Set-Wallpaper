.class public final Lcom/a/a/c/d/e/h;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/a/a/c/k;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/a/a/c/k",
        "<",
        "Lcom/a/a/b/a;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/a/a/c/b/a/e;


# direct methods
.method public constructor <init>(Lcom/a/a/c/b/a/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/a/a/c/d/e/h;->a:Lcom/a/a/c/b/a/e;

    return-void
.end method


# virtual methods
.method public a(Lcom/a/a/b/a;IILcom/a/a/c/j;)Lcom/a/a/c/b/u;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/a/a/b/a;",
            "II",
            "Lcom/a/a/c/j;",
            ")",
            "Lcom/a/a/c/b/u",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    invoke-interface {p1}, Lcom/a/a/b/a;->h()Landroid/graphics/Bitmap;

    move-result-object v0

    iget-object v1, p0, Lcom/a/a/c/d/e/h;->a:Lcom/a/a/c/b/a/e;

    invoke-static {v0, v1}, Lcom/a/a/c/d/a/d;->a(Landroid/graphics/Bitmap;Lcom/a/a/c/b/a/e;)Lcom/a/a/c/d/a/d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;IILcom/a/a/c/j;)Lcom/a/a/c/b/u;
    .locals 1

    check-cast p1, Lcom/a/a/b/a;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/a/a/c/d/e/h;->a(Lcom/a/a/b/a;IILcom/a/a/c/j;)Lcom/a/a/c/b/u;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/a/a/b/a;Lcom/a/a/c/j;)Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/a/a/c/j;)Z
    .locals 1

    check-cast p1, Lcom/a/a/b/a;

    invoke-virtual {p0, p1, p2}, Lcom/a/a/c/d/e/h;->a(Lcom/a/a/b/a;Lcom/a/a/c/j;)Z

    move-result v0

    return v0
.end method
