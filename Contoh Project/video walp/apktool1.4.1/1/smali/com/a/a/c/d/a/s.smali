.class public Lcom/a/a/c/d/a/s;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/a/a/c/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/a/a/c/d/a/s$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/a/a/c/k",
        "<",
        "Ljava/io/InputStream;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/a/a/c/d/a/k;

.field private final b:Lcom/a/a/c/b/a/b;


# direct methods
.method public constructor <init>(Lcom/a/a/c/d/a/k;Lcom/a/a/c/b/a/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/a/a/c/d/a/s;->a:Lcom/a/a/c/d/a/k;

    iput-object p2, p0, Lcom/a/a/c/d/a/s;->b:Lcom/a/a/c/b/a/b;

    return-void
.end method


# virtual methods
.method public a(Ljava/io/InputStream;IILcom/a/a/c/j;)Lcom/a/a/c/b/u;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/InputStream;",
            "II",
            "Lcom/a/a/c/j;",
            ")",
            "Lcom/a/a/c/b/u",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    instance-of v0, p1, Lcom/a/a/c/d/a/q;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/a/a/c/d/a/q;

    const/4 v0, 0x0

    move v6, v0

    :goto_0
    invoke-static {p1}, Lcom/a/a/i/c;->a(Ljava/io/InputStream;)Lcom/a/a/i/c;

    move-result-object v7

    new-instance v1, Lcom/a/a/i/f;

    invoke-direct {v1, v7}, Lcom/a/a/i/f;-><init>(Ljava/io/InputStream;)V

    new-instance v5, Lcom/a/a/c/d/a/s$a;

    invoke-direct {v5, p1, v7}, Lcom/a/a/c/d/a/s$a;-><init>(Lcom/a/a/c/d/a/q;Lcom/a/a/i/c;)V

    :try_start_0
    iget-object v0, p0, Lcom/a/a/c/d/a/s;->a:Lcom/a/a/c/d/a/k;

    move v2, p2

    move v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Lcom/a/a/c/d/a/k;->a(Ljava/io/InputStream;IILcom/a/a/c/j;Lcom/a/a/c/d/a/k$a;)Lcom/a/a/c/b/u;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    invoke-virtual {v7}, Lcom/a/a/i/c;->b()V

    if-eqz v6, :cond_0

    invoke-virtual {p1}, Lcom/a/a/c/d/a/q;->b()V

    :cond_0
    return-object v0

    :cond_1
    new-instance v1, Lcom/a/a/c/d/a/q;

    iget-object v0, p0, Lcom/a/a/c/d/a/s;->b:Lcom/a/a/c/b/a/b;

    invoke-direct {v1, p1, v0}, Lcom/a/a/c/d/a/q;-><init>(Ljava/io/InputStream;Lcom/a/a/c/b/a/b;)V

    const/4 v0, 0x1

    move v6, v0

    move-object p1, v1

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {v7}, Lcom/a/a/i/c;->b()V

    if-eqz v6, :cond_2

    invoke-virtual {p1}, Lcom/a/a/c/d/a/q;->b()V

    :cond_2
    throw v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;IILcom/a/a/c/j;)Lcom/a/a/c/b/u;
    .locals 1

    check-cast p1, Ljava/io/InputStream;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/a/a/c/d/a/s;->a(Ljava/io/InputStream;IILcom/a/a/c/j;)Lcom/a/a/c/b/u;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/io/InputStream;Lcom/a/a/c/j;)Z
    .locals 1

    iget-object v0, p0, Lcom/a/a/c/d/a/s;->a:Lcom/a/a/c/d/a/k;

    invoke-virtual {v0, p1}, Lcom/a/a/c/d/a/k;->a(Ljava/io/InputStream;)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/a/a/c/j;)Z
    .locals 1

    check-cast p1, Ljava/io/InputStream;

    invoke-virtual {p0, p1, p2}, Lcom/a/a/c/d/a/s;->a(Ljava/io/InputStream;Lcom/a/a/c/j;)Z

    move-result v0

    return v0
.end method
