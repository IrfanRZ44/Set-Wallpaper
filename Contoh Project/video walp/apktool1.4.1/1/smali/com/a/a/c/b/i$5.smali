.class Lcom/a/a/c/b/i$5;
.super Lcom/a/a/c/b/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/a/a/c/b/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/a/a/c/b/i;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public a(Lcom/a/a/c/a;)Z
    .locals 1

    sget-object v0, Lcom/a/a/c/a;->b:Lcom/a/a/c/a;

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(ZLcom/a/a/c/a;Lcom/a/a/c/c;)Z
    .locals 1

    if-eqz p1, :cond_0

    sget-object v0, Lcom/a/a/c/a;->c:Lcom/a/a/c/a;

    if-eq p2, v0, :cond_1

    :cond_0
    sget-object v0, Lcom/a/a/c/a;->a:Lcom/a/a/c/a;

    if-ne p2, v0, :cond_2

    :cond_1
    sget-object v0, Lcom/a/a/c/c;->b:Lcom/a/a/c/c;

    if-ne p3, v0, :cond_2

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
