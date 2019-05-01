.class public Lcom/naing/b/f;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/naing/b/f$a;
    }
.end annotation


# instance fields
.field a:Lcom/naing/b/d$c;

.field b:Lcom/naing/b/d$a;

.field private c:Lcom/naing/b/d;

.field private d:Lcom/naing/b/f$a;

.field private e:Z

.field private f:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/naing/b/f;->c:Lcom/naing/b/d;

    iput-object v0, p0, Lcom/naing/b/f;->d:Lcom/naing/b/f$a;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/naing/b/f;->e:Z

    new-instance v0, Lcom/naing/b/f$2;

    invoke-direct {v0, p0}, Lcom/naing/b/f$2;-><init>(Lcom/naing/b/f;)V

    iput-object v0, p0, Lcom/naing/b/f;->a:Lcom/naing/b/d$c;

    new-instance v0, Lcom/naing/b/f$3;

    invoke-direct {v0, p0}, Lcom/naing/b/f$3;-><init>(Lcom/naing/b/f;)V

    iput-object v0, p0, Lcom/naing/b/f;->b:Lcom/naing/b/d$a;

    iput-object p1, p0, Lcom/naing/b/f;->f:Landroid/app/Activity;

    return-void
.end method

.method static synthetic a(Lcom/naing/b/f;)V
    .locals 0

    invoke-direct {p0}, Lcom/naing/b/f;->e()V

    return-void
.end method

.method static synthetic a(Lcom/naing/b/f;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/naing/b/f;->e:Z

    return p1
.end method

.method static synthetic b(Lcom/naing/b/f;)Lcom/naing/b/d;
    .locals 1

    iget-object v0, p0, Lcom/naing/b/f;->c:Lcom/naing/b/d;

    return-object v0
.end method

.method static synthetic c(Lcom/naing/b/f;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/naing/b/f;->e:Z

    return v0
.end method

.method static synthetic d(Lcom/naing/b/f;)Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lcom/naing/b/f;->f:Landroid/app/Activity;

    return-object v0
.end method

.method private e()V
    .locals 1

    iget-boolean v0, p0, Lcom/naing/b/f;->e:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/naing/b/f;->d:Lcom/naing/b/f$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/naing/b/f;->d:Lcom/naing/b/f$a;

    invoke-interface {v0}, Lcom/naing/b/f$a;->b()V

    :cond_0
    iget-boolean v0, p0, Lcom/naing/b/f;->e:Z

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/naing/b/f;->f()V

    :cond_1
    return-void
.end method

.method static synthetic e(Lcom/naing/b/f;)V
    .locals 0

    invoke-direct {p0}, Lcom/naing/b/f;->f()V

    return-void
.end method

.method private f()V
    .locals 1

    iget-object v0, p0, Lcom/naing/b/f;->d:Lcom/naing/b/f$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/naing/b/f;->d:Lcom/naing/b/f$a;

    invoke-interface {v0}, Lcom/naing/b/f$a;->a()V

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Lcom/naing/b/f$a;)V
    .locals 0

    iput-object p1, p0, Lcom/naing/b/f;->d:Lcom/naing/b/f$a;

    return-void
.end method

.method a(Ljava/lang/String;)V
    .locals 3

    new-instance v0, Landroid/support/v7/app/a$a;

    iget-object v1, p0, Lcom/naing/b/f;->f:Landroid/app/Activity;

    invoke-direct {v0, v1}, Landroid/support/v7/app/a$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Landroid/support/v7/app/a$a;->b(Ljava/lang/CharSequence;)Landroid/support/v7/app/a$a;

    move-result-object v0

    const v1, 0x104000a

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/app/a$a;->a(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/a$a;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/app/a$a;->b()Landroid/support/v7/app/a;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/app/a;->show()V

    return-void
.end method

.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lcom/naing/b/f;->e:Z

    return v0
.end method

.method a(Lcom/naing/b/h;)Z
    .locals 2

    invoke-virtual {p1}, Lcom/naing/b/h;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v1, "vwallpaper_premium_upgrade"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public b()V
    .locals 2

    const-string v0, "IabSetup"

    const-string v1, "Destroying helper."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/naing/b/f;->c:Lcom/naing/b/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/naing/b/f;->c:Lcom/naing/b/d;

    invoke-virtual {v0}, Lcom/naing/b/d;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/naing/b/f;->c:Lcom/naing/b/d;

    :cond_0
    return-void
.end method

.method public c()V
    .locals 6

    :try_start_0
    const-string v0, "IabSetup"

    const-string v1, "Upgrade button clicked; launching purchase flow for upgrade."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/naing/b/f;->c:Lcom/naing/b/d;

    iget-object v1, p0, Lcom/naing/b/f;->f:Landroid/app/Activity;

    const-string v2, "premium"

    const/16 v3, 0x2711

    iget-object v4, p0, Lcom/naing/b/f;->b:Lcom/naing/b/d$a;

    const-string v5, "vwallpaper_premium_upgrade"

    invoke-virtual/range {v0 .. v5}, Lcom/naing/b/d;->a(Landroid/app/Activity;Ljava/lang/String;ILcom/naing/b/d$a;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    iget-object v0, p0, Lcom/naing/b/f;->f:Landroid/app/Activity;

    const-string v1, "Error : Unable to launch purchase flow"

    invoke-static {v0, v1}, Lcom/naing/c/b;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public d()V
    .locals 3

    :try_start_0
    invoke-static {}, Lcom/naing/c/b;->a()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/naing/c/b;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/naing/c/b;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/naing/b/d;

    iget-object v2, p0, Lcom/naing/b/f;->f:Landroid/app/Activity;

    invoke-direct {v1, v2, v0}, Lcom/naing/b/d;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/naing/b/f;->c:Lcom/naing/b/d;

    iget-object v0, p0, Lcom/naing/b/f;->c:Lcom/naing/b/d;

    new-instance v1, Lcom/naing/b/f$1;

    invoke-direct {v1, p0}, Lcom/naing/b/f$1;-><init>(Lcom/naing/b/f;)V

    invoke-virtual {v0, v1}, Lcom/naing/b/d;->a(Lcom/naing/b/d$b;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/naing/b/f;->c:Lcom/naing/b/d;

    invoke-direct {p0}, Lcom/naing/b/f;->e()V

    goto :goto_0
.end method
