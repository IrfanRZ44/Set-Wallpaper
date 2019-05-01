.class public Landroid/arch/lifecycle/d;
.super Landroid/support/v4/app/Fragment;

# interfaces
.implements Landroid/arch/lifecycle/w;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/arch/lifecycle/d$a;
    }
.end annotation


# static fields
.field private static final a:Landroid/arch/lifecycle/d$a;


# instance fields
.field private b:Landroid/arch/lifecycle/v;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/arch/lifecycle/d$a;

    invoke-direct {v0}, Landroid/arch/lifecycle/d$a;-><init>()V

    sput-object v0, Landroid/arch/lifecycle/d;->a:Landroid/arch/lifecycle/d$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    new-instance v0, Landroid/arch/lifecycle/v;

    invoke-direct {v0}, Landroid/arch/lifecycle/v;-><init>()V

    iput-object v0, p0, Landroid/arch/lifecycle/d;->b:Landroid/arch/lifecycle/v;

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/arch/lifecycle/d;->setRetainInstance(Z)V

    return-void
.end method

.method public static a(Landroid/support/v4/app/Fragment;)Landroid/arch/lifecycle/d;
    .locals 1

    sget-object v0, Landroid/arch/lifecycle/d;->a:Landroid/arch/lifecycle/d$a;

    invoke-virtual {v0, p0}, Landroid/arch/lifecycle/d$a;->b(Landroid/support/v4/app/Fragment;)Landroid/arch/lifecycle/d;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public getViewModelStore()Landroid/arch/lifecycle/v;
    .locals 1

    iget-object v0, p0, Landroid/arch/lifecycle/d;->b:Landroid/arch/lifecycle/v;

    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    sget-object v0, Landroid/arch/lifecycle/d;->a:Landroid/arch/lifecycle/d$a;

    invoke-virtual {v0, p0}, Landroid/arch/lifecycle/d$a;->a(Landroid/support/v4/app/Fragment;)V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    iget-object v0, p0, Landroid/arch/lifecycle/d;->b:Landroid/arch/lifecycle/v;

    invoke-virtual {v0}, Landroid/arch/lifecycle/v;->a()V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method
