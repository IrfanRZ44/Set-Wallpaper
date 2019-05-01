.class Lcom/naing/b/f$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/naing/b/d$a;


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

    iput-object p1, p0, Lcom/naing/b/f$3;->a:Lcom/naing/b/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/naing/b/e;Lcom/naing/b/h;)V
    .locals 3

    iget-object v0, p0, Lcom/naing/b/f$3;->a:Lcom/naing/b/f;

    invoke-static {v0}, Lcom/naing/b/f;->b(Lcom/naing/b/f;)Lcom/naing/b/d;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {p1}, Lcom/naing/b/e;->c()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/naing/b/f$3;->a:Lcom/naing/b/f;

    invoke-virtual {v0, p2}, Lcom/naing/b/f;->a(Lcom/naing/b/h;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/naing/b/h;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "premium"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/naing/b/f$3;->a:Lcom/naing/b/f;

    iget-object v1, p0, Lcom/naing/b/f$3;->a:Lcom/naing/b/f;

    invoke-static {v1}, Lcom/naing/b/f;->d(Lcom/naing/b/f;)Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0d0037

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/naing/b/f;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/naing/b/f$3;->a:Lcom/naing/b/f;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/naing/b/f;->a(Lcom/naing/b/f;Z)Z

    iget-object v0, p0, Lcom/naing/b/f$3;->a:Lcom/naing/b/f;

    invoke-static {v0}, Lcom/naing/b/f;->e(Lcom/naing/b/f;)V

    goto :goto_0
.end method
