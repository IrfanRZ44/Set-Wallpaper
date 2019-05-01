.class Landroid/support/customtabs/b$1;
.super Landroid/support/customtabs/g$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/customtabs/b;->a(Landroid/support/customtabs/a;)Landroid/support/customtabs/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/support/customtabs/a;

.field final synthetic b:Landroid/support/customtabs/b;

.field private c:Landroid/os/Handler;


# direct methods
.method constructor <init>(Landroid/support/customtabs/b;Landroid/support/customtabs/a;)V
    .locals 2

    iput-object p1, p0, Landroid/support/customtabs/b$1;->b:Landroid/support/customtabs/b;

    iput-object p2, p0, Landroid/support/customtabs/b$1;->a:Landroid/support/customtabs/a;

    invoke-direct {p0}, Landroid/support/customtabs/g$a;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Landroid/support/customtabs/b$1;->c:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public a(ILandroid/net/Uri;ZLandroid/os/Bundle;)V
    .locals 7

    iget-object v0, p0, Landroid/support/customtabs/b$1;->a:Landroid/support/customtabs/a;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v6, p0, Landroid/support/customtabs/b$1;->c:Landroid/os/Handler;

    new-instance v0, Landroid/support/customtabs/b$1$5;

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Landroid/support/customtabs/b$1$5;-><init>(Landroid/support/customtabs/b$1;ILandroid/net/Uri;ZLandroid/os/Bundle;)V

    invoke-virtual {v6, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method

.method public a(ILandroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Landroid/support/customtabs/b$1;->a:Landroid/support/customtabs/a;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Landroid/support/customtabs/b$1;->c:Landroid/os/Handler;

    new-instance v1, Landroid/support/customtabs/b$1$1;

    invoke-direct {v1, p0, p1, p2}, Landroid/support/customtabs/b$1$1;-><init>(Landroid/support/customtabs/b$1;ILandroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Landroid/support/customtabs/b$1;->a:Landroid/support/customtabs/a;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Landroid/support/customtabs/b$1;->c:Landroid/os/Handler;

    new-instance v1, Landroid/support/customtabs/b$1$3;

    invoke-direct {v1, p0, p1}, Landroid/support/customtabs/b$1$3;-><init>(Landroid/support/customtabs/b$1;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method

.method public a(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Landroid/support/customtabs/b$1;->a:Landroid/support/customtabs/a;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Landroid/support/customtabs/b$1;->c:Landroid/os/Handler;

    new-instance v1, Landroid/support/customtabs/b$1$2;

    invoke-direct {v1, p0, p1, p2}, Landroid/support/customtabs/b$1$2;-><init>(Landroid/support/customtabs/b$1;Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method

.method public b(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Landroid/support/customtabs/b$1;->a:Landroid/support/customtabs/a;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Landroid/support/customtabs/b$1;->c:Landroid/os/Handler;

    new-instance v1, Landroid/support/customtabs/b$1$4;

    invoke-direct {v1, p0, p1, p2}, Landroid/support/customtabs/b$1$4;-><init>(Landroid/support/customtabs/b$1;Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method
