.class public Lcom/a/a/d/o;
.super Landroid/support/v4/app/Fragment;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/a/a/d/o$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/a/a/d/a;

.field private final b:Lcom/a/a/d/m;

.field private final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/a/a/d/o;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lcom/a/a/d/o;

.field private e:Lcom/a/a/j;

.field private f:Landroid/support/v4/app/Fragment;


# direct methods
.method public constructor <init>()V
    .locals 1

    new-instance v0, Lcom/a/a/d/a;

    invoke-direct {v0}, Lcom/a/a/d/a;-><init>()V

    invoke-direct {p0, v0}, Lcom/a/a/d/o;-><init>(Lcom/a/a/d/a;)V

    return-void
.end method

.method public constructor <init>(Lcom/a/a/d/a;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ValidFragment"
        }
    .end annotation

    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    new-instance v0, Lcom/a/a/d/o$a;

    invoke-direct {v0, p0}, Lcom/a/a/d/o$a;-><init>(Lcom/a/a/d/o;)V

    iput-object v0, p0, Lcom/a/a/d/o;->b:Lcom/a/a/d/m;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/a/a/d/o;->c:Ljava/util/Set;

    iput-object p1, p0, Lcom/a/a/d/o;->a:Lcom/a/a/d/a;

    return-void
.end method

.method private a(Landroid/support/v4/app/FragmentActivity;)V
    .locals 3

    invoke-direct {p0}, Lcom/a/a/d/o;->e()V

    invoke-static {p1}, Lcom/a/a/c;->a(Landroid/content/Context;)Lcom/a/a/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/a/a/c;->g()Lcom/a/a/d/l;

    move-result-object v0

    invoke-virtual {p1}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/a/a/d/l;->a(Landroid/support/v4/app/FragmentManager;Landroid/support/v4/app/Fragment;)Lcom/a/a/d/o;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/d/o;->d:Lcom/a/a/d/o;

    iget-object v0, p0, Lcom/a/a/d/o;->d:Lcom/a/a/d/o;

    invoke-virtual {p0, v0}, Lcom/a/a/d/o;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/a/a/d/o;->d:Lcom/a/a/d/o;

    invoke-direct {v0, p0}, Lcom/a/a/d/o;->a(Lcom/a/a/d/o;)V

    :cond_0
    return-void
.end method

.method private a(Lcom/a/a/d/o;)V
    .locals 1

    iget-object v0, p0, Lcom/a/a/d/o;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private b(Lcom/a/a/d/o;)V
    .locals 1

    iget-object v0, p0, Lcom/a/a/d/o;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method private d()Landroid/support/v4/app/Fragment;
    .locals 1

    invoke-virtual {p0}, Lcom/a/a/d/o;->getParentFragment()Landroid/support/v4/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/a/a/d/o;->f:Landroid/support/v4/app/Fragment;

    goto :goto_0
.end method

.method private e()V
    .locals 1

    iget-object v0, p0, Lcom/a/a/d/o;->d:Lcom/a/a/d/o;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/a/a/d/o;->d:Lcom/a/a/d/o;

    invoke-direct {v0, p0}, Lcom/a/a/d/o;->b(Lcom/a/a/d/o;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/a/a/d/o;->d:Lcom/a/a/d/o;

    :cond_0
    return-void
.end method


# virtual methods
.method a()Lcom/a/a/d/a;
    .locals 1

    iget-object v0, p0, Lcom/a/a/d/o;->a:Lcom/a/a/d/a;

    return-object v0
.end method

.method a(Landroid/support/v4/app/Fragment;)V
    .locals 1

    iput-object p1, p0, Lcom/a/a/d/o;->f:Landroid/support/v4/app/Fragment;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/a/a/d/o;->a(Landroid/support/v4/app/FragmentActivity;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/a/a/j;)V
    .locals 0

    iput-object p1, p0, Lcom/a/a/d/o;->e:Lcom/a/a/j;

    return-void
.end method

.method public b()Lcom/a/a/j;
    .locals 1

    iget-object v0, p0, Lcom/a/a/d/o;->e:Lcom/a/a/j;

    return-object v0
.end method

.method public c()Lcom/a/a/d/m;
    .locals 1

    iget-object v0, p0, Lcom/a/a/d/o;->b:Lcom/a/a/d/m;

    return-object v0
.end method

.method public onAttach(Landroid/content/Context;)V
    .locals 3

    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/content/Context;)V

    :try_start_0
    invoke-virtual {p0}, Lcom/a/a/d/o;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/a/a/d/o;->a(Landroid/support/v4/app/FragmentActivity;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "SupportRMFragment"

    const/4 v2, 0x5

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "SupportRMFragment"

    const-string v2, "Unable to register fragment with root"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    iget-object v0, p0, Lcom/a/a/d/o;->a:Lcom/a/a/d/a;

    invoke-virtual {v0}, Lcom/a/a/d/a;->c()V

    invoke-direct {p0}, Lcom/a/a/d/o;->e()V

    return-void
.end method

.method public onDetach()V
    .locals 1

    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDetach()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/a/a/d/o;->f:Landroid/support/v4/app/Fragment;

    invoke-direct {p0}, Lcom/a/a/d/o;->e()V

    return-void
.end method

.method public onStart()V
    .locals 1

    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStart()V

    iget-object v0, p0, Lcom/a/a/d/o;->a:Lcom/a/a/d/a;

    invoke-virtual {v0}, Lcom/a/a/d/a;->a()V

    return-void
.end method

.method public onStop()V
    .locals 1

    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStop()V

    iget-object v0, p0, Lcom/a/a/d/o;->a:Lcom/a/a/d/a;

    invoke-virtual {v0}, Lcom/a/a/d/a;->b()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Landroid/support/v4/app/Fragment;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "{parent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-direct {p0}, Lcom/a/a/d/o;->d()Landroid/support/v4/app/Fragment;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
