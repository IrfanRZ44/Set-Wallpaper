.class Lcom/naing/b/d$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/naing/b/d;->a(ZLjava/util/List;Lcom/naing/b/d$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Ljava/util/List;

.field final synthetic c:Lcom/naing/b/d$c;

.field final synthetic d:Landroid/os/Handler;

.field final synthetic e:Lcom/naing/b/d;


# direct methods
.method constructor <init>(Lcom/naing/b/d;ZLjava/util/List;Lcom/naing/b/d$c;Landroid/os/Handler;)V
    .locals 0

    iput-object p1, p0, Lcom/naing/b/d$2;->e:Lcom/naing/b/d;

    iput-boolean p2, p0, Lcom/naing/b/d$2;->a:Z

    iput-object p3, p0, Lcom/naing/b/d$2;->b:Ljava/util/List;

    iput-object p4, p0, Lcom/naing/b/d$2;->c:Lcom/naing/b/d$c;

    iput-object p5, p0, Lcom/naing/b/d$2;->d:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    new-instance v1, Lcom/naing/b/e;

    const/4 v0, 0x0

    const-string v2, "Inventory refresh successful."

    invoke-direct {v1, v0, v2}, Lcom/naing/b/e;-><init>(ILjava/lang/String;)V

    const/4 v0, 0x0

    :try_start_0
    iget-object v2, p0, Lcom/naing/b/d$2;->e:Lcom/naing/b/d;

    iget-boolean v3, p0, Lcom/naing/b/d$2;->a:Z

    iget-object v4, p0, Lcom/naing/b/d$2;->b:Ljava/util/List;

    invoke-virtual {v2, v3, v4}, Lcom/naing/b/d;->a(ZLjava/util/List;)Lcom/naing/b/g;
    :try_end_0
    .catch Lcom/naing/b/c; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    :goto_0
    iget-object v2, p0, Lcom/naing/b/d$2;->e:Lcom/naing/b/d;

    invoke-virtual {v2}, Lcom/naing/b/d;->b()V

    iget-object v2, p0, Lcom/naing/b/d$2;->e:Lcom/naing/b/d;

    iget-boolean v2, v2, Lcom/naing/b/d;->d:Z

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/naing/b/d$2;->c:Lcom/naing/b/d$c;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/naing/b/d$2;->d:Landroid/os/Handler;

    new-instance v3, Lcom/naing/b/d$2$1;

    invoke-direct {v3, p0, v1, v0}, Lcom/naing/b/d$2$1;-><init>(Lcom/naing/b/d$2;Lcom/naing/b/e;Lcom/naing/b/g;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Lcom/naing/b/c;->a()Lcom/naing/b/e;

    move-result-object v1

    goto :goto_0

    :catch_1
    move-exception v1

    move-object v2, v1

    new-instance v1, Lcom/naing/b/e;

    const/4 v3, 0x6

    invoke-virtual {v2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v3, v2}, Lcom/naing/b/e;-><init>(ILjava/lang/String;)V

    goto :goto_0
.end method
