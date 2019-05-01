.class Lcom/naing/b/f$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/naing/b/d$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/naing/b/f;->d()V
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

    iput-object p1, p0, Lcom/naing/b/f$1;->a:Lcom/naing/b/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/naing/b/e;)V
    .locals 2

    invoke-virtual {p1}, Lcom/naing/b/e;->b()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "IabSetup"

    const-string v1, "IabSetup was failed."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/naing/b/f$1;->a:Lcom/naing/b/f;

    invoke-static {v0}, Lcom/naing/b/f;->a(Lcom/naing/b/f;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/naing/b/f$1;->a:Lcom/naing/b/f;

    invoke-static {v0}, Lcom/naing/b/f;->b(Lcom/naing/b/f;)Lcom/naing/b/d;

    move-result-object v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/naing/b/f$1;->a:Lcom/naing/b/f;

    invoke-static {v0}, Lcom/naing/b/f;->b(Lcom/naing/b/f;)Lcom/naing/b/d;

    move-result-object v0

    iget-object v1, p0, Lcom/naing/b/f$1;->a:Lcom/naing/b/f;

    iget-object v1, v1, Lcom/naing/b/f;->a:Lcom/naing/b/d$c;

    invoke-virtual {v0, v1}, Lcom/naing/b/d;->a(Lcom/naing/b/d$c;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method
