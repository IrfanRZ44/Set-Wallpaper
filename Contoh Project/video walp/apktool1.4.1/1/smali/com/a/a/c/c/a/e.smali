.class public Lcom/a/a/c/c/a/e;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/a/a/c/c/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/a/a/c/c/a/e$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/a/a/c/c/n",
        "<",
        "Ljava/net/URL;",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/a/a/c/c/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/a/a/c/c/n",
            "<",
            "Lcom/a/a/c/c/g;",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/a/a/c/c/n;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/a/a/c/c/n",
            "<",
            "Lcom/a/a/c/c/g;",
            "Ljava/io/InputStream;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/a/a/c/c/a/e;->a:Lcom/a/a/c/c/n;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;IILcom/a/a/c/j;)Lcom/a/a/c/c/n$a;
    .locals 1

    check-cast p1, Ljava/net/URL;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/a/a/c/c/a/e;->a(Ljava/net/URL;IILcom/a/a/c/j;)Lcom/a/a/c/c/n$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/net/URL;IILcom/a/a/c/j;)Lcom/a/a/c/c/n$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/URL;",
            "II",
            "Lcom/a/a/c/j;",
            ")",
            "Lcom/a/a/c/c/n$a",
            "<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/a/a/c/c/a/e;->a:Lcom/a/a/c/c/n;

    new-instance v1, Lcom/a/a/c/c/g;

    invoke-direct {v1, p1}, Lcom/a/a/c/c/g;-><init>(Ljava/net/URL;)V

    invoke-interface {v0, v1, p2, p3, p4}, Lcom/a/a/c/c/n;->a(Ljava/lang/Object;IILcom/a/a/c/j;)Lcom/a/a/c/c/n$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 1

    check-cast p1, Ljava/net/URL;

    invoke-virtual {p0, p1}, Lcom/a/a/c/c/a/e;->a(Ljava/net/URL;)Z

    move-result v0

    return v0
.end method

.method public a(Ljava/net/URL;)Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
