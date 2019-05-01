.class Lcom/a/a/c/c/m$1;
.super Lcom/a/a/i/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/a/a/c/c/m;-><init>(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/a/a/i/e",
        "<",
        "Lcom/a/a/c/c/m$a",
        "<TA;>;TB;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/a/a/c/c/m;


# direct methods
.method constructor <init>(Lcom/a/a/c/c/m;J)V
    .locals 0

    iput-object p1, p0, Lcom/a/a/c/c/m$1;->a:Lcom/a/a/c/c/m;

    invoke-direct {p0, p2, p3}, Lcom/a/a/i/e;-><init>(J)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/a/a/c/c/m$a;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/a/a/c/c/m$a",
            "<TA;>;TB;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/a/a/c/c/m$a;->a()V

    return-void
.end method

.method protected bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/a/a/c/c/m$a;

    invoke-virtual {p0, p1, p2}, Lcom/a/a/c/c/m$1;->a(Lcom/a/a/c/c/m$a;Ljava/lang/Object;)V

    return-void
.end method
