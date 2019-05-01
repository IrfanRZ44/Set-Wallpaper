.class public final Lcom/a/a/c/a/k;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/a/a/c/a/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/a/a/c/a/k$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/a/a/c/a/e",
        "<",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/a/a/c/d/a/q;


# direct methods
.method constructor <init>(Ljava/io/InputStream;Lcom/a/a/c/b/a/b;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/a/a/c/d/a/q;

    invoke-direct {v0, p1, p2}, Lcom/a/a/c/d/a/q;-><init>(Ljava/io/InputStream;Lcom/a/a/c/b/a/b;)V

    iput-object v0, p0, Lcom/a/a/c/a/k;->a:Lcom/a/a/c/d/a/q;

    iget-object v0, p0, Lcom/a/a/c/a/k;->a:Lcom/a/a/c/d/a/q;

    const/high16 v1, 0x50

    invoke-virtual {v0, v1}, Lcom/a/a/c/d/a/q;->mark(I)V

    return-void
.end method


# virtual methods
.method public synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/a/a/c/a/k;->c()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/a/a/c/a/k;->a:Lcom/a/a/c/d/a/q;

    invoke-virtual {v0}, Lcom/a/a/c/d/a/q;->b()V

    return-void
.end method

.method public c()Ljava/io/InputStream;
    .locals 1

    iget-object v0, p0, Lcom/a/a/c/a/k;->a:Lcom/a/a/c/d/a/q;

    invoke-virtual {v0}, Lcom/a/a/c/d/a/q;->reset()V

    iget-object v0, p0, Lcom/a/a/c/a/k;->a:Lcom/a/a/c/d/a/q;

    return-object v0
.end method
