.class public Lcom/a/a/c/c/d;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/a/a/c/c/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/a/a/c/c/d$a;,
        Lcom/a/a/c/c/d$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/a/a/c/c/n",
        "<",
        "Ljava/io/File;",
        "Ljava/nio/ByteBuffer;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/io/File;IILcom/a/a/c/j;)Lcom/a/a/c/c/n$a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "II",
            "Lcom/a/a/c/j;",
            ")",
            "Lcom/a/a/c/c/n$a",
            "<",
            "Ljava/nio/ByteBuffer;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/a/a/c/c/n$a;

    new-instance v1, Lcom/a/a/h/b;

    invoke-direct {v1, p1}, Lcom/a/a/h/b;-><init>(Ljava/lang/Object;)V

    new-instance v2, Lcom/a/a/c/c/d$a;

    invoke-direct {v2, p1}, Lcom/a/a/c/c/d$a;-><init>(Ljava/io/File;)V

    invoke-direct {v0, v1, v2}, Lcom/a/a/c/c/n$a;-><init>(Lcom/a/a/c/h;Lcom/a/a/c/a/d;)V

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;IILcom/a/a/c/j;)Lcom/a/a/c/c/n$a;
    .locals 1

    check-cast p1, Ljava/io/File;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/a/a/c/c/d;->a(Ljava/io/File;IILcom/a/a/c/j;)Lcom/a/a/c/c/n$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/io/File;)Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 1

    check-cast p1, Ljava/io/File;

    invoke-virtual {p0, p1}, Lcom/a/a/c/c/d;->a(Ljava/io/File;)Z

    move-result v0

    return v0
.end method