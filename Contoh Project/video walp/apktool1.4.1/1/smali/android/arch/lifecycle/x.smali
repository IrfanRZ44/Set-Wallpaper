.class public Landroid/arch/lifecycle/x;
.super Ljava/lang/Object;


# direct methods
.method public static a(Landroid/support/v4/app/Fragment;)Landroid/arch/lifecycle/v;
    .locals 1

    instance-of v0, p0, Landroid/arch/lifecycle/w;

    if-eqz v0, :cond_0

    check-cast p0, Landroid/arch/lifecycle/w;

    invoke-interface {p0}, Landroid/arch/lifecycle/w;->getViewModelStore()Landroid/arch/lifecycle/v;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {p0}, Landroid/arch/lifecycle/d;->a(Landroid/support/v4/app/Fragment;)Landroid/arch/lifecycle/d;

    move-result-object v0

    invoke-virtual {v0}, Landroid/arch/lifecycle/d;->getViewModelStore()Landroid/arch/lifecycle/v;

    move-result-object v0

    goto :goto_0
.end method
