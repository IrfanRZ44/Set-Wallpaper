.class public Lcom/a/a/c/c/m;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/a/a/c/c/m$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A:",
        "Ljava/lang/Object;",
        "B:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Lcom/a/a/i/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/a/a/i/e",
            "<",
            "Lcom/a/a/c/c/m$a",
            "<TA;>;TB;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    const-wide/16 v0, 0xfa

    invoke-direct {p0, v0, v1}, Lcom/a/a/c/c/m;-><init>(J)V

    return-void
.end method

.method public constructor <init>(J)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/a/a/c/c/m$1;

    invoke-direct {v0, p0, p1, p2}, Lcom/a/a/c/c/m$1;-><init>(Lcom/a/a/c/c/m;J)V

    iput-object v0, p0, Lcom/a/a/c/c/m;->a:Lcom/a/a/i/e;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;II)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TA;II)TB;"
        }
    .end annotation

    invoke-static {p1, p2, p3}, Lcom/a/a/c/c/m$a;->a(Ljava/lang/Object;II)Lcom/a/a/c/c/m$a;

    move-result-object v0

    iget-object v1, p0, Lcom/a/a/c/c/m;->a:Lcom/a/a/i/e;

    invoke-virtual {v1, v0}, Lcom/a/a/i/e;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0}, Lcom/a/a/c/c/m$a;->a()V

    return-object v1
.end method

.method public a(Ljava/lang/Object;IILjava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TA;IITB;)V"
        }
    .end annotation

    invoke-static {p1, p2, p3}, Lcom/a/a/c/c/m$a;->a(Ljava/lang/Object;II)Lcom/a/a/c/c/m$a;

    move-result-object v0

    iget-object v1, p0, Lcom/a/a/c/c/m;->a:Lcom/a/a/i/e;

    invoke-virtual {v1, v0, p4}, Lcom/a/a/i/e;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
