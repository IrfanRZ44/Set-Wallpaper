.class public Landroid/arch/lifecycle/LifecycleService;
.super Landroid/app/Service;

# interfaces
.implements Landroid/arch/lifecycle/h;


# instance fields
.field private final a:Landroid/arch/lifecycle/r;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    new-instance v0, Landroid/arch/lifecycle/r;

    invoke-direct {v0, p0}, Landroid/arch/lifecycle/r;-><init>(Landroid/arch/lifecycle/h;)V

    iput-object v0, p0, Landroid/arch/lifecycle/LifecycleService;->a:Landroid/arch/lifecycle/r;

    return-void
.end method


# virtual methods
.method public getLifecycle()Landroid/arch/lifecycle/e;
    .locals 1

    iget-object v0, p0, Landroid/arch/lifecycle/LifecycleService;->a:Landroid/arch/lifecycle/r;

    invoke-virtual {v0}, Landroid/arch/lifecycle/r;->e()Landroid/arch/lifecycle/e;

    move-result-object v0

    return-object v0
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Landroid/arch/lifecycle/LifecycleService;->a:Landroid/arch/lifecycle/r;

    invoke-virtual {v0}, Landroid/arch/lifecycle/r;->b()V

    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate()V
    .locals 1

    iget-object v0, p0, Landroid/arch/lifecycle/LifecycleService;->a:Landroid/arch/lifecycle/r;

    invoke-virtual {v0}, Landroid/arch/lifecycle/r;->a()V

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    iget-object v0, p0, Landroid/arch/lifecycle/LifecycleService;->a:Landroid/arch/lifecycle/r;

    invoke-virtual {v0}, Landroid/arch/lifecycle/r;->d()V

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    return-void
.end method

.method public onStart(Landroid/content/Intent;I)V
    .locals 1

    iget-object v0, p0, Landroid/arch/lifecycle/LifecycleService;->a:Landroid/arch/lifecycle/r;

    invoke-virtual {v0}, Landroid/arch/lifecycle/r;->c()V

    invoke-super {p0, p1, p2}, Landroid/app/Service;->onStart(Landroid/content/Intent;I)V

    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 1

    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    move-result v0

    return v0
.end method
