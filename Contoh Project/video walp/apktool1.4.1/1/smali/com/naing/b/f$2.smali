.class Lcom/naing/b/f$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/naing/b/d$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/naing/b/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/naing/b/f;


# direct methods
.method constructor <init>(Lcom/naing/b/f;)V
    .locals 0

    iput-object p1, p0, Lcom/naing/b/f$2;->a:Lcom/naing/b/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/naing/b/e;Lcom/naing/b/g;)V
    .locals 3

    iget-object v0, p0, Lcom/naing/b/f$2;->a:Lcom/naing/b/f;

    invoke-static {v0}, Lcom/naing/b/f;->b(Lcom/naing/b/f;)Lcom/naing/b/d;

    move-result-object v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/naing/b/e;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "IabSetup"

    const-string v1, "Query inventory was failed."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/naing/b/f$2;->a:Lcom/naing/b/f;

    invoke-static {v0}, Lcom/naing/b/f;->a(Lcom/naing/b/f;)V

    goto :goto_0

    :cond_1
    const-string v0, "IabSetup"

    const-string v1, "Query inventory was successful."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "premium"

    invoke-virtual {p2, v0}, Lcom/naing/b/g;->a(Ljava/lang/String;)Lcom/naing/b/h;

    move-result-object v0

    iget-object v1, p0, Lcom/naing/b/f$2;->a:Lcom/naing/b/f;

    if-eqz v0, :cond_2

    iget-object v2, p0, Lcom/naing/b/f$2;->a:Lcom/naing/b/f;

    invoke-virtual {v2, v0}, Lcom/naing/b/f;->a(Lcom/naing/b/h;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    :goto_1
    invoke-static {v1, v0}, Lcom/naing/b/f;->a(Lcom/naing/b/f;Z)Z

    const-string v1, "IabSetup"

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "User is "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v0, p0, Lcom/naing/b/f$2;->a:Lcom/naing/b/f;

    invoke-static {v0}, Lcom/naing/b/f;->c(Lcom/naing/b/f;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "PREMIUM"

    :goto_2
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/naing/b/f$2;->a:Lcom/naing/b/f;

    invoke-static {v0}, Lcom/naing/b/f;->a(Lcom/naing/b/f;)V

    const-string v0, "IabSetup"

    const-string v1, "Initial inventory query finished; enabling main UI."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_1

    :cond_3
    const-string v0, "NOT PREMIUM"

    goto :goto_2
.end method
