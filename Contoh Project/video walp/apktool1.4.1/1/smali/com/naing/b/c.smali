.class public Lcom/naing/b/c;
.super Ljava/lang/Exception;


# instance fields
.field a:Lcom/naing/b/e;


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/naing/b/e;

    invoke-direct {v0, p1, p2}, Lcom/naing/b/e;-><init>(ILjava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/naing/b/c;-><init>(Lcom/naing/b/e;)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/Exception;)V
    .locals 1

    new-instance v0, Lcom/naing/b/e;

    invoke-direct {v0, p1, p2}, Lcom/naing/b/e;-><init>(ILjava/lang/String;)V

    invoke-direct {p0, v0, p3}, Lcom/naing/b/c;-><init>(Lcom/naing/b/e;Ljava/lang/Exception;)V

    return-void
.end method

.method public constructor <init>(Lcom/naing/b/e;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/naing/b/c;-><init>(Lcom/naing/b/e;Ljava/lang/Exception;)V

    return-void
.end method

.method public constructor <init>(Lcom/naing/b/e;Ljava/lang/Exception;)V
    .locals 1

    invoke-virtual {p1}, Lcom/naing/b/e;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iput-object p1, p0, Lcom/naing/b/c;->a:Lcom/naing/b/e;

    return-void
.end method


# virtual methods
.method public a()Lcom/naing/b/e;
    .locals 1

    iget-object v0, p0, Lcom/naing/b/c;->a:Lcom/naing/b/e;

    return-object v0
.end method
