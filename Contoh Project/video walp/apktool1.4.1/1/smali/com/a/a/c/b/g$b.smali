.class final Lcom/a/a/c/b/g$b;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/a/a/c/b/h$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/a/a/c/b/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Z:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/a/a/c/b/h$a",
        "<TZ;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/a/a/c/b/g;

.field private final b:Lcom/a/a/c/a;


# direct methods
.method constructor <init>(Lcom/a/a/c/b/g;Lcom/a/a/c/a;)V
    .locals 0

    iput-object p1, p0, Lcom/a/a/c/b/g$b;->a:Lcom/a/a/c/b/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/a/a/c/b/g$b;->b:Lcom/a/a/c/a;

    return-void
.end method


# virtual methods
.method public a(Lcom/a/a/c/b/u;)Lcom/a/a/c/b/u;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/a/a/c/b/u",
            "<TZ;>;)",
            "Lcom/a/a/c/b/u",
            "<TZ;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/a/a/c/b/g$b;->a:Lcom/a/a/c/b/g;

    iget-object v1, p0, Lcom/a/a/c/b/g$b;->b:Lcom/a/a/c/a;

    invoke-virtual {v0, v1, p1}, Lcom/a/a/c/b/g;->a(Lcom/a/a/c/a;Lcom/a/a/c/b/u;)Lcom/a/a/c/b/u;

    move-result-object v0

    return-object v0
.end method
