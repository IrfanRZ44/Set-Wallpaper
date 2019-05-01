.class public Lcom/a/a/c/c/b;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/a/a/c/c/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/a/a/c/c/b$d;,
        Lcom/a/a/c/c/b$a;,
        Lcom/a/a/c/c/b$c;,
        Lcom/a/a/c/c/b$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Data:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/a/a/c/c/n",
        "<[BTData;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/a/a/c/c/b$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/a/a/c/c/b$b",
            "<TData;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/a/a/c/c/b$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/a/a/c/c/b$b",
            "<TData;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/a/a/c/c/b;->a:Lcom/a/a/c/c/b$b;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;IILcom/a/a/c/j;)Lcom/a/a/c/c/n$a;
    .locals 1

    check-cast p1, [B

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/a/a/c/c/b;->a([BIILcom/a/a/c/j;)Lcom/a/a/c/c/n$a;

    move-result-object v0

    return-object v0
.end method

.method public a([BIILcom/a/a/c/j;)Lcom/a/a/c/c/n$a;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BII",
            "Lcom/a/a/c/j;",
            ")",
            "Lcom/a/a/c/c/n$a",
            "<TData;>;"
        }
    .end annotation

    new-instance v0, Lcom/a/a/c/c/n$a;

    new-instance v1, Lcom/a/a/h/b;

    invoke-direct {v1, p1}, Lcom/a/a/h/b;-><init>(Ljava/lang/Object;)V

    new-instance v2, Lcom/a/a/c/c/b$c;

    iget-object v3, p0, Lcom/a/a/c/c/b;->a:Lcom/a/a/c/c/b$b;

    invoke-direct {v2, p1, v3}, Lcom/a/a/c/c/b$c;-><init>([BLcom/a/a/c/c/b$b;)V

    invoke-direct {v0, v1, v2}, Lcom/a/a/c/c/n$a;-><init>(Lcom/a/a/c/h;Lcom/a/a/c/a/d;)V

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 1

    check-cast p1, [B

    invoke-virtual {p0, p1}, Lcom/a/a/c/c/b;->a([B)Z

    move-result v0

    return v0
.end method

.method public a([B)Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
