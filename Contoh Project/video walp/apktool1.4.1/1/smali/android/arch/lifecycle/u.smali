.class public Landroid/arch/lifecycle/u;
.super Ljava/lang/Object;


# direct methods
.method private static a(Landroid/app/Activity;)Landroid/app/Application;
    .locals 2

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Your activity/fragment is not yet attached to Application. You can\'t request ViewModel before onCreate call."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-object v0
.end method

.method public static a(Landroid/support/v4/app/Fragment;)Landroid/arch/lifecycle/t;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Landroid/arch/lifecycle/u;->a(Landroid/support/v4/app/Fragment;Landroid/arch/lifecycle/t$b;)Landroid/arch/lifecycle/t;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/support/v4/app/Fragment;Landroid/arch/lifecycle/t$b;)Landroid/arch/lifecycle/t;
    .locals 2

    invoke-static {p0}, Landroid/arch/lifecycle/u;->b(Landroid/support/v4/app/Fragment;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Landroid/arch/lifecycle/u;->a(Landroid/app/Activity;)Landroid/app/Application;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-static {v0}, Landroid/arch/lifecycle/t$a;->a(Landroid/app/Application;)Landroid/arch/lifecycle/t$a;

    move-result-object p1

    :cond_0
    new-instance v0, Landroid/arch/lifecycle/t;

    invoke-static {p0}, Landroid/arch/lifecycle/x;->a(Landroid/support/v4/app/Fragment;)Landroid/arch/lifecycle/v;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroid/arch/lifecycle/t;-><init>(Landroid/arch/lifecycle/v;Landroid/arch/lifecycle/t$b;)V

    return-object v0
.end method

.method private static b(Landroid/support/v4/app/Fragment;)Landroid/app/Activity;
    .locals 2

    invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t create ViewModelProvider for detached fragment"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-object v0
.end method
