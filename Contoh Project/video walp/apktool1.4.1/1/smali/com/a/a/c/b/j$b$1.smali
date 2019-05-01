.class Lcom/a/a/c/b/j$b$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/a/a/i/a/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/a/a/c/b/j$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/a/a/i/a/a$a",
        "<",
        "Lcom/a/a/c/b/k",
        "<*>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/a/a/c/b/j$b;


# direct methods
.method constructor <init>(Lcom/a/a/c/b/j$b;)V
    .locals 0

    iput-object p1, p0, Lcom/a/a/c/b/j$b$1;->a:Lcom/a/a/c/b/j$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/a/a/c/b/k;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/a/a/c/b/k",
            "<*>;"
        }
    .end annotation

    new-instance v0, Lcom/a/a/c/b/k;

    iget-object v1, p0, Lcom/a/a/c/b/j$b$1;->a:Lcom/a/a/c/b/j$b;

    iget-object v1, v1, Lcom/a/a/c/b/j$b;->a:Lcom/a/a/c/b/c/a;

    iget-object v2, p0, Lcom/a/a/c/b/j$b$1;->a:Lcom/a/a/c/b/j$b;

    iget-object v2, v2, Lcom/a/a/c/b/j$b;->b:Lcom/a/a/c/b/c/a;

    iget-object v3, p0, Lcom/a/a/c/b/j$b$1;->a:Lcom/a/a/c/b/j$b;

    iget-object v3, v3, Lcom/a/a/c/b/j$b;->c:Lcom/a/a/c/b/c/a;

    iget-object v4, p0, Lcom/a/a/c/b/j$b$1;->a:Lcom/a/a/c/b/j$b;

    iget-object v4, v4, Lcom/a/a/c/b/j$b;->d:Lcom/a/a/c/b/c/a;

    iget-object v5, p0, Lcom/a/a/c/b/j$b$1;->a:Lcom/a/a/c/b/j$b;

    iget-object v5, v5, Lcom/a/a/c/b/j$b;->e:Lcom/a/a/c/b/l;

    iget-object v6, p0, Lcom/a/a/c/b/j$b$1;->a:Lcom/a/a/c/b/j$b;

    iget-object v6, v6, Lcom/a/a/c/b/j$b;->f:Landroid/support/v4/f/k$a;

    invoke-direct/range {v0 .. v6}, Lcom/a/a/c/b/k;-><init>(Lcom/a/a/c/b/c/a;Lcom/a/a/c/b/c/a;Lcom/a/a/c/b/c/a;Lcom/a/a/c/b/c/a;Lcom/a/a/c/b/l;Landroid/support/v4/f/k$a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/a/a/c/b/j$b$1;->a()Lcom/a/a/c/b/k;

    move-result-object v0

    return-object v0
.end method
