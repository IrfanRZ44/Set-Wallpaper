.class public Landroid/arch/lifecycle/r;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/arch/lifecycle/r$a;
    }
.end annotation


# instance fields
.field private final a:Landroid/arch/lifecycle/i;

.field private final b:Landroid/os/Handler;

.field private c:Landroid/arch/lifecycle/r$a;


# direct methods
.method public constructor <init>(Landroid/arch/lifecycle/h;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/arch/lifecycle/i;

    invoke-direct {v0, p1}, Landroid/arch/lifecycle/i;-><init>(Landroid/arch/lifecycle/h;)V

    iput-object v0, p0, Landroid/arch/lifecycle/r;->a:Landroid/arch/lifecycle/i;

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Landroid/arch/lifecycle/r;->b:Landroid/os/Handler;

    return-void
.end method

.method private a(Landroid/arch/lifecycle/e$a;)V
    .locals 2

    iget-object v0, p0, Landroid/arch/lifecycle/r;->c:Landroid/arch/lifecycle/r$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/arch/lifecycle/r;->c:Landroid/arch/lifecycle/r$a;

    invoke-virtual {v0}, Landroid/arch/lifecycle/r$a;->run()V

    :cond_0
    new-instance v0, Landroid/arch/lifecycle/r$a;

    iget-object v1, p0, Landroid/arch/lifecycle/r;->a:Landroid/arch/lifecycle/i;

    invoke-direct {v0, v1, p1}, Landroid/arch/lifecycle/r$a;-><init>(Landroid/arch/lifecycle/i;Landroid/arch/lifecycle/e$a;)V

    iput-object v0, p0, Landroid/arch/lifecycle/r;->c:Landroid/arch/lifecycle/r$a;

    iget-object v0, p0, Landroid/arch/lifecycle/r;->b:Landroid/os/Handler;

    iget-object v1, p0, Landroid/arch/lifecycle/r;->c:Landroid/arch/lifecycle/r$a;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    sget-object v0, Landroid/arch/lifecycle/e$a;->ON_CREATE:Landroid/arch/lifecycle/e$a;

    invoke-direct {p0, v0}, Landroid/arch/lifecycle/r;->a(Landroid/arch/lifecycle/e$a;)V

    return-void
.end method

.method public b()V
    .locals 1

    sget-object v0, Landroid/arch/lifecycle/e$a;->ON_START:Landroid/arch/lifecycle/e$a;

    invoke-direct {p0, v0}, Landroid/arch/lifecycle/r;->a(Landroid/arch/lifecycle/e$a;)V

    return-void
.end method

.method public c()V
    .locals 1

    sget-object v0, Landroid/arch/lifecycle/e$a;->ON_START:Landroid/arch/lifecycle/e$a;

    invoke-direct {p0, v0}, Landroid/arch/lifecycle/r;->a(Landroid/arch/lifecycle/e$a;)V

    return-void
.end method

.method public d()V
    .locals 1

    sget-object v0, Landroid/arch/lifecycle/e$a;->ON_STOP:Landroid/arch/lifecycle/e$a;

    invoke-direct {p0, v0}, Landroid/arch/lifecycle/r;->a(Landroid/arch/lifecycle/e$a;)V

    sget-object v0, Landroid/arch/lifecycle/e$a;->ON_DESTROY:Landroid/arch/lifecycle/e$a;

    invoke-direct {p0, v0}, Landroid/arch/lifecycle/r;->a(Landroid/arch/lifecycle/e$a;)V

    return-void
.end method

.method public e()Landroid/arch/lifecycle/e;
    .locals 1

    iget-object v0, p0, Landroid/arch/lifecycle/r;->a:Landroid/arch/lifecycle/i;

    return-object v0
.end method
